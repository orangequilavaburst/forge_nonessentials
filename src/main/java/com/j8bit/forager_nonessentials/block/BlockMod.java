package com.j8bit.forager_nonessentials.block;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.item.CreativeModeTabMod;
import com.j8bit.forager_nonessentials.item.ItemMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockMod {

    public static DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ForagerNonessentials.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(1.0f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f, 6.0f).requiresCorrectToolForDrops()), CreativeModeTabMod.FORAGER_TAB);

    public static final RegistryObject<Block> ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 3.0f).requiresCorrectToolForDrops()), CreativeModeTabMod.FORAGER_TAB);

    public static final RegistryObject<Block> DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f, 3.0f).requiresCorrectToolForDrops()), CreativeModeTabMod.FORAGER_TAB);

    public static final RegistryObject<Block> RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 3.0f).requiresCorrectToolForDrops()), CreativeModeTabMod.FORAGER_TAB);

    public static final RegistryObject<Block> BUBBLEGUM_BLOCK = registerBlock("bubblegum_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CAKE).strength(1.0f, 1.0f)), CreativeModeTabMod.FORAGER_TAB);
    public static final RegistryObject<Block> BUBBLEGUM_SLAB = registerBlock("bubblegum_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(1.0f, 1.0f)), CreativeModeTabMod.FORAGER_TAB);
    public static final RegistryObject<Block> BUBBLEGUM_STAIRS = registerBlock("bubblegum_stairs",
            ()-> new StairBlock(() -> BlockMod.BUBBLEGUM_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CAKE).strength(1.0f, 1.0f)), CreativeModeTabMod.FORAGER_TAB);
    public static final RegistryObject<Block> BUBBLEGUM_WALL = registerBlock("bubblegum_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(1.0f, 1.0f)), CreativeModeTabMod.FORAGER_TAB);

    public static final RegistryObject<Block> WHITE_STARRY_WOOL= registerBlock("white_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> ORANGE_STARRY_WOOL= registerBlock("orange_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> MAGENTA_STARRY_WOOL= registerBlock("magenta_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> LIGHT_BLUE_STARRY_WOOL= registerBlock("light_blue_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> YELLOW_STARRY_WOOL= registerBlock("yellow_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> LIME_STARRY_WOOL= registerBlock("lime_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> PINK_STARRY_WOOL= registerBlock("pink_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> GRAY_STARRY_WOOL= registerBlock("gray_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> LIGHT_GRAY_STARRY_WOOL= registerBlock("light_gray_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> CYAN_STARRY_WOOL= registerBlock("cyan_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> PURPLE_STARRY_WOOL= registerBlock("purple_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> BLUE_STARRY_WOOL= registerBlock("blue_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> BROWN_STARRY_WOOL= registerBlock("brown_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> GREEN_STARRY_WOOL= registerBlock("green_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> RED_STARRY_WOOL= registerBlock("red_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);
    static final RegistryObject<Block> BLACK_STARRY_WOOL= registerBlock("black_starry_wool",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f, 10.0f)), CreativeModeTabMod.FORAGER_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;

    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ItemMod.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));

    }

    public static void register(IEventBus eventBus){

        BLOCKS.register(eventBus);

    }

}
