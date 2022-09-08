package com.j8bit.forager_nonessentials.client.events;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.client.render.FNRenderTypes;
import com.j8bit.forager_nonessentials.entity.EntityMod;
import com.j8bit.forager_nonessentials.entity.client.AmongusRenderer;
import com.j8bit.forager_nonessentials.entity.client.armor.CloakArmorRenderer;
import com.j8bit.forager_nonessentials.item.custom.ItemCloakArmor;
import com.j8bit.forager_nonessentials.particle.ParticleMod;
import com.j8bit.forager_nonessentials.particle.custom.ConfettiParticle;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.*;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = ForagerNonessentials.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EventBusEventsClientMod {

    public static ArrayList<Block> alteredSightBlocks = new ArrayList<Block>();

    @SubscribeEvent
    public void clientSetup(final FMLClientSetupEvent event)
    {

        EntityRenderers.register(EntityMod.AMONGUS.get(), AmongusRenderer::new);

        alteredSightBlocks.add(Blocks.INFESTED_COBBLESTONE);
        alteredSightBlocks.add(Blocks.INFESTED_DEEPSLATE);
        alteredSightBlocks.add(Blocks.INFESTED_STONE);
        alteredSightBlocks.add(Blocks.INFESTED_CHISELED_STONE_BRICKS);
        alteredSightBlocks.add(Blocks.INFESTED_MOSSY_STONE_BRICKS);
        alteredSightBlocks.add(Blocks.INFESTED_CRACKED_STONE_BRICKS);
        alteredSightBlocks.add(Blocks.INFESTED_STONE_BRICKS);

    }

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event){
        //GeoArmorRenderer.registerArmorRenderer(ItemRalseiArmor.class, new RalseiHatRenderer());
        GeoArmorRenderer.registerArmorRenderer(ItemCloakArmor.class, new CloakArmorRenderer());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityMod.AMONGUS.get(), AmongusRenderer::new);
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event){
        Minecraft.getInstance().particleEngine.register(ParticleMod.CONFETTI_PARTICLES.get(), ConfettiParticle.Provider::new);
    }

}
