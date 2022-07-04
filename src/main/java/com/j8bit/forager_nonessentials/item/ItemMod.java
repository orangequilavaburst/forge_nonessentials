package com.j8bit.forager_nonessentials.item;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemMod {

   public static DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, ForagerNonessentials.MODID);

   // basic items

   public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
           () -> new Item(new Item.Properties()));

   public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
           () -> new Item(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));

   public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
           () -> new Item(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));

   // block items

   // food items

   // combat/tool items

   // armor items

   public static void register(IEventBus eventBus){

      ITEMS.register(eventBus);

   }

}
