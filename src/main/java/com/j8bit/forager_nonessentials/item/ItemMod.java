package com.j8bit.forager_nonessentials.item;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.entity.EntityMod;
import com.j8bit.forager_nonessentials.font.FontMod;
import com.j8bit.forager_nonessentials.sound.SoundMod;
import net.minecraft.resources.ResourceLocation;
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
           () -> new ItemDonut(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB).food(FoodMod.glazedDonutFood)));
   public static final RegistryObject<Item> VANILLA_FROSTED_DONUT = ITEMS.register("vanilla_frosted_donut",
           () -> new ItemDonut(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB).food(FoodMod.vanillaDonutFood)));
   public static final RegistryObject<Item> CHOCOLATE_FROSTED_DONUT = ITEMS.register("chocolate_frosted_donut",
           () -> new ItemDonut(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB).food(FoodMod.chocolateDonutFood)));
   public static final RegistryObject<Item> SPRINKLE_DONUT = ITEMS.register("sprinkle_donut",
           () -> new ItemDonut(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB).food(FoodMod.sprinkleDonutFood)));

   // combat/tool items

   public static final RegistryObject<Item> ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword",
           () -> new ItemRecoilSword(ToolTierMod.ORICHALCUM, 2, 3.0f, new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));
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

   // music disc

   public static final RegistryObject<Item> DELTARUNE_APRIL_2012_MUSIC_DISC = ITEMS.register("deltarune_april_2012_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_APRIL_2012, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_CHAOS_KING_MUSIC_DISC = ITEMS.register("deltarune_chaos_king_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_CHAOS_KING, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_CHECKER_DANCE_MUSIC_DISC = ITEMS.register("deltarune_checker_dance_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_CHECKER_DANCE, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_FIELD_OF_HOPES_AND_DREAMS_MUSIC_DISC = ITEMS.register("deltarune_field_of_hopes_and_dreams_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_FIELD_OF_HOPES_AND_DREAMS, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_HIP_SHOP_MUSIC_DISC = ITEMS.register("deltarune_hip_shop_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_HIP_SHOP, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_LANCER_MUSIC_DISC = ITEMS.register("deltarune_lancer_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_LANCER, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_LANTERN_MUSIC_DISC = ITEMS.register("deltarune_lantern_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_LANTERN, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_RUDE_BUSTER_MUSIC_DISC = ITEMS.register("deltarune_rude_buster_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_RUDE_BUSTER, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_SCHOOL_MUSIC_DISC = ITEMS.register("deltarune_school_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_SCHOOL, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> DELTARUNE_THE_WORLD_REVOLVING_MUSIC_DISC = ITEMS.register("deltarune_the_world_revolving_music_disc",
           () -> new ItemGameRecord(14, SoundMod.DELTARUNE_THE_WORLD_REVOLVING, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));

   public static final RegistryObject<Item> FNF_BREAKFAST_MUSIC_DISC = ITEMS.register("fnf_breakfast_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_BREAKFAST, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_EGGNOG_MUSIC_DISC = ITEMS.register("fnf_eggnog_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_EGGNOG, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_FRESH_MUSIC_DISC = ITEMS.register("fnf_fresh_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_FRESH, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_GETTIN_FREAKY_MUSIC_DISC = ITEMS.register("fnf_gettin_freaky_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_GETTIN_FREAKY, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_HIGH_MUSIC_DISC = ITEMS.register("fnf_high_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_HIGH, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_MONSTER_MUSIC_DISC = ITEMS.register("fnf_monster_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_MONSTER, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_PICO_MUSIC_DISC = ITEMS.register("fnf_pico_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_PICO, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_ROSES_MUSIC_DISC = ITEMS.register("fnf_roses_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_ROSES, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_SOUTH_MUSIC_DISC = ITEMS.register("fnf_south_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_SOUTH, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> FNF_TUTORIAL_MUSIC_DISC = ITEMS.register("fnf_tutorial_music_disc",
           () -> new ItemGameRecord(14, SoundMod.FNF_TUTORIAL, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));

   public static final RegistryObject<Item> UNDERTALE_AMALGAM_MUSIC_DISC = ITEMS.register("undertale_amalgam_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_AMALGAM, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_ASGORE_MUSIC_DISC = ITEMS.register("undertale_asgore_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_ASGORE, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_BATTLE_AGAINST_A_TRUE_HERO_MUSIC_DISC = ITEMS.register("undertale_battle_against_a_true_hero_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_BATTLE_AGAINST_A_TRUE_HERO, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_BONETROUSLE_MUSIC_DISC = ITEMS.register("undertale_bonetrousle_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_BONETROUSLE, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1), FontMod.PIXEL_PAPYRUS.getResourceLocation()));
   public static final RegistryObject<Item> UNDERTALE_CHILL_MUSIC_DISC= ITEMS.register("undertale_chill_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_CHILL, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_CORE_MUSIC_DISC = ITEMS.register("undertale_core_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_CORE, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_DATING_START_MUSIC_DISC = ITEMS.register("undertale_dating_start_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_DATING_START, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_DEATH_BY_GLAMOUR_MUSIC_DISC = ITEMS.register("undertale_death_by_glamour_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_DEATH_BY_GLAMOUR, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_DUMMY_MUSIC_DISC = ITEMS.register("undertale_dummy_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_DUMMY, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_FINALE_MUSIC_DISC = ITEMS.register("undertale_finale_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_FINALE, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_HEARTACHE_MUSIC_DISC = ITEMS.register("undertale_heartache_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_HEARTACHE, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_HOME_MUSIC_DISC = ITEMS.register("undertale_home_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_HOME, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_HOME_MUSICBOX_MUSIC_DISC = ITEMS.register("undertale_home_musicbox_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_HOME_MUSICBOX, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_HOPES_AND_DREAMS_MUSIC_DISC = ITEMS.register("undertale_hopes_and_dreams_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_HOPES_AND_DREAMS, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_MEGALOVANIA_MUSIC_DISC = ITEMS.register("undertale_megalovania_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_MEGALOVANIA, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1), FontMod.PIXEL_COMIC_SANS.getResourceLocation()));
   public static final RegistryObject<Item> UNDERTALE_MEMORY_MUSIC_DISC = ITEMS.register("undertale_memory_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_MEMORY, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_PREMONITION_MUSIC_DISC = ITEMS.register("undertale_premonition_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_PREMONITION, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_SANS_MUSIC_DISC = ITEMS.register("undertale_sans_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_SANS, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1), FontMod.PIXEL_COMIC_SANS.getResourceLocation()));
   public static final RegistryObject<Item> UNDERTALE_SNOWDIN_TOWN_MUSIC_DISC = ITEMS.register("undertale_snowdin_town_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_SNOWDIN_TOWN, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_SONG_THAT_MIGHT_PLAY_WHEN_YOU_FIGHT_SANS_MUSIC_DISC = ITEMS.register("undertale_song_that_might_play_when_you_fight_sans_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_SONG_THAT_MIGHT_PLAY_WHEN_YOU_FIGHT_SANS, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1), FontMod.PIXEL_COMIC_SANS.getResourceLocation()));
   public static final RegistryObject<Item> UNDERTALE_SPEAR_OF_JUSTICE_MUSIC_DISC = ITEMS.register("undertale_spear_of_justice_music_disc",
           () -> new ItemGameRecord(14, SoundMod.UNDERTALE_SPEAR_OF_JUSTICE, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));
   public static final RegistryObject<Item> UNDERTALE_SPIDER_DANCE_MUSIC_DISC = ITEMS.register("undertale_spider_dance_music_disc",
   () -> new ItemGameRecord(14, SoundMod.UNDERTALE_SPIDER_DANCE, new Item.Properties().tab(CreativeModeTabMod.FORAGER_MUSIC_TAB).stacksTo(1)));

   // other items

   public static final RegistryObject<Item> TOTEM_OF_HONESTY = ITEMS.register("totem_of_honesty",
           () -> new ItemTotem(new Item.Properties().tab(CreativeModeTabMod.FORAGER_TAB)));

   public static void register(IEventBus eventBus){

      ITEMS.register(eventBus);

   }

}
