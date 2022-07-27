package com.j8bit.forager_nonessentials;

import com.j8bit.forager_nonessentials.block.BlockMod;
import com.j8bit.forager_nonessentials.enchantment.EnchantmentMod;
import com.j8bit.forager_nonessentials.entity.EntityMod;
import com.j8bit.forager_nonessentials.entity.client.AmongusRenderer;
import com.j8bit.forager_nonessentials.item.ItemMod;
import com.j8bit.forager_nonessentials.particle.ParticleMod;
import com.j8bit.forager_nonessentials.sound.SoundMod;
import com.j8bit.forager_nonessentials.util.ItemPropertiesMod;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ForagerNonessentials.MODID)
public class ForagerNonessentials
{

    public static final String MODID = "forager_nonessentials";

    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public ForagerNonessentials()
    {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

        ItemMod.register(modEventBus);
        BlockMod.register(modEventBus);
        SoundMod.register(modEventBus);
        EntityMod.register(modEventBus);
        ParticleMod.register(modEventBus);
        EnchantmentMod.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        ItemPropertiesMod.addCustomItemProperties();

    }

    private void clientSetup(final FMLClientSetupEvent event)
    {

        EntityRenderers.register(EntityMod.AMONGUS.get(), AmongusRenderer::new);

    }

}
