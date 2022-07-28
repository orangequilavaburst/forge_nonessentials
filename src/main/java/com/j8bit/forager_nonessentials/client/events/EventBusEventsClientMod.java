package com.j8bit.forager_nonessentials.client.events;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.entity.EntityMod;
import com.j8bit.forager_nonessentials.entity.client.AmongusRenderer;
import com.j8bit.forager_nonessentials.particle.ParticleMod;
import com.j8bit.forager_nonessentials.particle.custom.ConfettiParticle;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.client.event.RegisterShadersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Objects;

@Mod.EventBusSubscriber(modid = ForagerNonessentials.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EventBusEventsClientMod {

    @Nullable
    private static ShaderInstance renderTypeAlteredSight;
    @SubscribeEvent
    public void clientSetup(final FMLClientSetupEvent event)
    {

        EntityRenderers.register(EntityMod.AMONGUS.get(), AmongusRenderer::new);

    }

    public static ShaderInstance getRenderTypeAlteredSight(){
        return Objects.requireNonNull(renderTypeAlteredSight, "Attempted to call getRenderTypeAlteredSight before shaders have finished loading.");
    }

    public void registerShaders(RegisterShadersEvent event) throws IOException {

        event.registerShader(new ShaderInstance(event.getResourceManager(), new ResourceLocation("forager_nonessentials","rendertype_altered_sight"), DefaultVertexFormat.POSITION), (p_172645_) -> {
            renderTypeAlteredSight = p_172645_;
        });

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

}
