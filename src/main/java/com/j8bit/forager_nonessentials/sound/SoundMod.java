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

    // ITEMS
    public static final RegistryObject<SoundEvent> HONESTY_USE = registerSoundEvent("honesty_use");

    // ENTITIES
    public static final RegistryObject<SoundEvent> AMONGUS_AMBIENT = registerSoundEvent("amongus_ambient");
    public static final RegistryObject<SoundEvent> AMONGUS_HURT = registerSoundEvent("amongus_hurt");
    public static final RegistryObject<SoundEvent> AMONGUS_DEATH = registerSoundEvent("amongus_death");

    // MUSIC

    public static final RegistryObject<SoundEvent> DELTARUNE_APRIL_2012 = registerSoundEvent("deltarune_april_2012");
    public static final RegistryObject<SoundEvent> DELTARUNE_CHAOS_KING = registerSoundEvent("deltarune_chaos_king");
    public static final RegistryObject<SoundEvent> DELTARUNE_CHECKER_DANCE = registerSoundEvent("deltarune_checker_dance");
    public static final RegistryObject<SoundEvent> DELTARUNE_FIELD_OF_HOPES_AND_DREAMS = registerSoundEvent("deltarune_field_of_hopes_and_dreams");
    public static final RegistryObject<SoundEvent> DELTARUNE_HIP_SHOP = registerSoundEvent("deltarune_hip_shop");
    public static final RegistryObject<SoundEvent> DELTARUNE_LANCER = registerSoundEvent("deltarune_lancer");
    public static final RegistryObject<SoundEvent> DELTARUNE_LANTERN = registerSoundEvent("deltarune_lantern");
    public static final RegistryObject<SoundEvent> DELTARUNE_RUDE_BUSTER = registerSoundEvent("deltarune_rude_buster");
    public static final RegistryObject<SoundEvent> DELTARUNE_SCHOOL = registerSoundEvent("deltarune_school");
    public static final RegistryObject<SoundEvent> DELTARUNE_THE_WORLD_REVOLVING = registerSoundEvent("deltarune_the_world_revolving");

    public static final RegistryObject<SoundEvent> FNF_BREAKFAST = registerSoundEvent("fnf_breakfast");
    public static final RegistryObject<SoundEvent> FNF_EGGNOG = registerSoundEvent("fnf_eggnog");
    public static final RegistryObject<SoundEvent> FNF_FRESH = registerSoundEvent("fnf_fresh");
    public static final RegistryObject<SoundEvent> FNF_GETTIN_FREAKY = registerSoundEvent("fnf_gettin_freaky");
    public static final RegistryObject<SoundEvent> FNF_HIGH = registerSoundEvent("fnf_high");
    public static final RegistryObject<SoundEvent> FNF_MONSTER = registerSoundEvent("fnf_monster");
    public static final RegistryObject<SoundEvent> FNF_PICO = registerSoundEvent("fnf_pico");
    public static final RegistryObject<SoundEvent> FNF_ROSES = registerSoundEvent("fnf_roses");
    public static final RegistryObject<SoundEvent> FNF_SOUTH = registerSoundEvent("fnf_south");
    public static final RegistryObject<SoundEvent> FNF_TUTORIAL = registerSoundEvent("fnf_tutorial");

    public static final RegistryObject<SoundEvent> UNDERTALE_AMALGAM = registerSoundEvent("undertale_amalgam");
    public static final RegistryObject<SoundEvent> UNDERTALE_ASGORE = registerSoundEvent("undertale_asgore");
    public static final RegistryObject<SoundEvent> UNDERTALE_BATTLE_AGAINST_A_TRUE_HERO = registerSoundEvent("undertale_battle_against_a_true_hero");
    public static final RegistryObject<SoundEvent> UNDERTALE_BONETROUSLE = registerSoundEvent("undertale_bonetrousle");
    public static final RegistryObject<SoundEvent> UNDERTALE_CHILL= registerSoundEvent("undertale_chill");
    public static final RegistryObject<SoundEvent> UNDERTALE_CORE = registerSoundEvent("undertale_core");
    public static final RegistryObject<SoundEvent> UNDERTALE_DATING_START = registerSoundEvent("undertale_dating_start");
    public static final RegistryObject<SoundEvent> UNDERTALE_DEATH_BY_GLAMOUR = registerSoundEvent("undertale_death_by_glamour");
    public static final RegistryObject<SoundEvent> UNDERTALE_DUMMY = registerSoundEvent("undertale_dummy");
    public static final RegistryObject<SoundEvent> UNDERTALE_FINALE = registerSoundEvent("undertale_finale");
    public static final RegistryObject<SoundEvent> UNDERTALE_HEARTACHE = registerSoundEvent("undertale_heartache");
    public static final RegistryObject<SoundEvent> UNDERTALE_HOME = registerSoundEvent("undertale_home");
    public static final RegistryObject<SoundEvent> UNDERTALE_HOME_MUSICBOX = registerSoundEvent("undertale_home_musicbox");
    public static final RegistryObject<SoundEvent> UNDERTALE_HOPES_AND_DREAMS = registerSoundEvent("undertale_hopes_and_dreams");
    public static final RegistryObject<SoundEvent> UNDERTALE_MEGALOVANIA = registerSoundEvent("undertale_megalovania");
    public static final RegistryObject<SoundEvent> UNDERTALE_MEMORY = registerSoundEvent("undertale_memory");
    public static final RegistryObject<SoundEvent> UNDERTALE_PREMONITION = registerSoundEvent("undertale_premonition");
    public static final RegistryObject<SoundEvent> UNDERTALE_SANS = registerSoundEvent("undertale_sans");
    public static final RegistryObject<SoundEvent> UNDERTALE_SNOWDIN_TOWN = registerSoundEvent("undertale_snowdin_town");
    public static final RegistryObject<SoundEvent> UNDERTALE_SONG_THAT_MIGHT_PLAY_WHEN_YOU_FIGHT_SANS = registerSoundEvent("undertale_song_that_might_play_when_you_fight_sans");
    public static final RegistryObject<SoundEvent> UNDERTALE_SPEAR_OF_JUSTICE = registerSoundEvent("undertale_spear_of_justice");
    public static final RegistryObject<SoundEvent> UNDERTALE_SPIDER_DANCE = registerSoundEvent("undertale_spider_dance");





    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }

}
