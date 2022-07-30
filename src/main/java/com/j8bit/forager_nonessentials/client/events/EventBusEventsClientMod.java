package com.j8bit.forager_nonessentials.client.events;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.client.render.FNRenderTypes;
import com.j8bit.forager_nonessentials.enchantment.EnchantmentMod;
import com.j8bit.forager_nonessentials.entity.EntityMod;
import com.j8bit.forager_nonessentials.entity.client.AmongusRenderer;
import com.j8bit.forager_nonessentials.particle.ParticleMod;
import com.j8bit.forager_nonessentials.particle.custom.ConfettiParticle;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.client.event.RegisterShadersEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Objects;

@Mod.EventBusSubscriber(modid = ForagerNonessentials.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EventBusEventsClientMod {
    @SubscribeEvent
    public void clientSetup(final FMLClientSetupEvent event)
    {

        EntityRenderers.register(EntityMod.AMONGUS.get(), AmongusRenderer::new);

    }

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event){
        //GeoArmorRenderer.registerArmorRenderer(ItemRalseiArmor.class, new RalseiHatRenderer());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityMod.AMONGUS.get(), AmongusRenderer::new);
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event){
        Minecraft.getInstance().particleEngine.register(ParticleMod.CONFETTI_PARTICLES.get(), ConfettiParticle.Provider::new);
    }

    @SubscribeEvent
    public void onPotionAdded(final PotionEvent.PotionAddedEvent event){

        ForagerNonessentials.LOGGER.info("Added "
                + event.getPotionEffect().getEffect().getRegistryName()
                + " of powwer "
                + event.getPotionEffect().getAmplifier()
                + " to "
                + event.getEntityLiving().getType().getRegistryName()
                + " from "
                + event.getPotionSource().getType().getRegistryName()
                + " for "
                + event.getPotionEffect().getDuration()
                + " ticks!"
        );
    }

}
