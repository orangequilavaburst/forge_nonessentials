package com.j8bit.forager_nonessentials.item.custom;

import com.google.common.collect.Maps;
import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ItemGameRecord extends RecordItem {

    private ResourceLocation fontLocation;

    public ItemGameRecord(int comparatorValue, Supplier<SoundEvent> soundSupplier, Properties builder) {
        super(comparatorValue, soundSupplier, builder);
        fontLocation = new ResourceLocation(Minecraft.DEFAULT_FONT.getPath());
        ForagerNonessentials.LOGGER.info("Font location of game record: " + fontLocation.toString());
    }

    public ItemGameRecord(int comparatorValue, Supplier<SoundEvent> soundSupplier, Properties builder, ResourceLocation pFontLocation) {
        super(comparatorValue, soundSupplier, builder);
        fontLocation = pFontLocation;
        ForagerNonessentials.LOGGER.info("Font location of game record: " + fontLocation.toString());
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(this.getDisplayName().withStyle(style -> style.withColor(0xAAAAAA).withFont(this.fontLocation)));

        String tipItemName = this.getDescriptionId() + ".source";
        ForagerNonessentials.LOGGER.info(tipItemName);
        pTooltip.add(new TranslatableComponent(tipItemName).withStyle(style -> style.withColor(0x777777).withFont(this.fontLocation)));
    }

    @Override
    public Component getName(ItemStack pStack) {
        return new TranslatableComponent(this.getDescriptionId(pStack)).withStyle(style -> style.withFont(this.fontLocation));
    }
}
