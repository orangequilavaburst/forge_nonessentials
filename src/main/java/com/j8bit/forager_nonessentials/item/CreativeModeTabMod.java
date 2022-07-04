package com.j8bit.forager_nonessentials.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeModeTabMod {

    public static CreativeModeTab FORAGER_TAB = new CreativeModeTab("forager_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemMod.TEST_ITEM.get());
        }
    };

}
