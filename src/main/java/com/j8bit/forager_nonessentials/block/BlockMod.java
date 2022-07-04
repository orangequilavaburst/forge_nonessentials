package com.j8bit.forager_nonessentials.block;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.item.CreativeModeTabMod;
import com.j8bit.forager_nonessentials.item.ItemMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
            ()-> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(1.0f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);

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
