package com.j8bit.forager_nonessentials.client.events;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.entity.EntityMod;
import com.j8bit.forager_nonessentials.entity.client.AmongusRenderer;
import com.j8bit.forager_nonessentials.entity.client.armor.CloakArmorRenderer;
import com.j8bit.forager_nonessentials.item.custom.ItemCloakArmor;
import com.j8bit.forager_nonessentials.particle.ParticleMod;
import com.j8bit.forager_nonessentials.particle.custom.ConfettiParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

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

    @SubscribeEvent
    public void onPotionAdded(final PotionEvent.PotionAddedEvent event){

        ForagerNonessentials.LOGGER.info("Added "
                + event.getPotionEffect().getEffect().getRegistryName()
                + " of power "
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
