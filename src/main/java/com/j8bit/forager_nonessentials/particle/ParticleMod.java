package com.j8bit.forager_nonessentials.particle;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ParticleMod {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ForagerNonessentials.MODID);

    public static final RegistryObject<SimpleParticleType> CONFETTI_PARTICLES =
            PARTICLE_TYPES.register("confetti", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }

}
