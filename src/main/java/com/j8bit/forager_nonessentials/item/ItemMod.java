package com.j8bit.forager_nonessentials.item;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.entity.EntityMod;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

   // food items

   public static final RegistryObject<Item> GLAZED_DONUT = ITEMS.register("glazed_donut",
           () -> new DonutItem(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB).food(FoodMod.glazedDonutFood)));
   public static final RegistryObject<Item> VANILLA_FROSTED_DONUT = ITEMS.register("vanilla_frosted_donut",
           () -> new DonutItem(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB).food(FoodMod.vanillaDonutFood)));
   public static final RegistryObject<Item> CHOCOLATE_FROSTED_DONUT = ITEMS.register("chocolate_frosted_donut",
           () -> new DonutItem(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB).food(FoodMod.chocolateDonutFood)));
   public static final RegistryObject<Item> SPRINKLE_DONUT = ITEMS.register("sprinkle_donut",
           () -> new DonutItem(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB).food(FoodMod.sprinkleDonutFood)));

   // combat/tool items

   public static final RegistryObject<Item> ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword",
           () -> new OrichalcumSwordItem(ToolTierMod.ORICHALCUM, 2, 3.0f, new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));
   public static final RegistryObject<Item> ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe",
           () -> new PickaxeItem(ToolTierMod.ORICHALCUM, 1, 1.0f, new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));
   public static final RegistryObject<Item> ORICHALCUM_AXE = ITEMS.register("orichalcum_axe",
           () -> new AxeItem(ToolTierMod.ORICHALCUM, 4, 0.0f, new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));
   public static final RegistryObject<Item> ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel",
           () -> new ShovelItem(ToolTierMod.ORICHALCUM, 0, 1.0f, new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));
   public static final RegistryObject<Item> ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe",
           () -> new HoeItem(ToolTierMod.ORICHALCUM, 0, 0.0f, new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));

   // armor items

   // spawn eggs

   public static final RegistryObject<ForgeSpawnEggItem> AMONGUS_SPAWN_EGG = ITEMS.register("amongus_egg",
           () -> new ForgeSpawnEggItem(EntityMod.AMONGUS,0x038fe6, 0x22c2f4,
                   new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));

   // other items



   public static void register(IEventBus eventBus){

      ITEMS.register(eventBus);

   }

}
