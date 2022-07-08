package com.j8bit.forager_nonessentials.sound;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundMod {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ForagerNonessentials.MODID);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(ForagerNonessentials.MODID, name)));
    }

    public static final RegistryObject<SoundEvent> HONESTY_USE = registerSoundEvent("honesty_use");

    public static final RegistryObject<SoundEvent> AMONGUS_AMBIENT = registerSoundEvent("amongus_ambient");
    public static final RegistryObject<SoundEvent> AMONGUS_HURT = registerSoundEvent("amongus_hurt");
    public static final RegistryObject<SoundEvent> AMONGUS_DEATH = registerSoundEvent("amongus_death");

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }

}
