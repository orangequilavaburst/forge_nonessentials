package com.j8bit.forager_nonessentials.enchantment;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentMod {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ForagerNonessentials.MODID);

    public static RegistryObject<Enchantment> ENERGY_DRAIN = ENCHANTMENTS.register("energy_drain",
            () -> new EnchantmentLifesteal(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus){
        ENCHANTMENTS.register(eventBus);
    }

}
