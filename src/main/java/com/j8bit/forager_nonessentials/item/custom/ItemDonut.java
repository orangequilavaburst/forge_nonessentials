package com.j8bit.forager_nonessentials.item.custom;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemDonut extends Item {

    public ItemDonut(Properties properties){
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {

        String tipItemName = stack.getItem().toString();
        tipItemName = "tooltip." + ForagerNonessentials.MODID + "." + tipItemName + "_tooltip";
        ForagerNonessentials.LOGGER.info(tipItemName);
        toolTip.add(new TranslatableComponent(tipItemName));

        super.appendHoverText(stack, worldIn, toolTip, flagIn);
    }

}
