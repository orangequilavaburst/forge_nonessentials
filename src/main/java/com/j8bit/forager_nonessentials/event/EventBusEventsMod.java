package com.j8bit.forager_nonessentials.event;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.entity.AmongusEntity;
import com.j8bit.forager_nonessentials.entity.EntityMod;
import com.j8bit.forager_nonessentials.particle.ParticleMod;
import com.j8bit.forager_nonessentials.particle.custom.ConfettiParticle;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = ForagerNonessentials.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBusEventsMod {

    /*@SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event){
        GeoArmorRenderer.registerArmorRenderer(ItemRalseiArmor.class, new RalseiHatRenderer());
    }*/

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityMod.AMONGUS.get(), AmongusEntity.setAttributes());
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event){
        Minecraft.getInstance().particleEngine.register(ParticleMod.CONFETTI_PARTICLES.get(), ConfettiParticle.Provider::new);
    }

}
