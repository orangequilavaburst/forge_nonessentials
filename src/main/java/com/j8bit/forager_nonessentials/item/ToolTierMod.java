package com.j8bit.forager_nonessentials.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolTierMod {

    public static final ForgeTier ORICHALCUM = new ForgeTier(2, 500, 1.0f, 1.75f, 15, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ItemMod.ORICHALCUM_INGOT.get()));

}
