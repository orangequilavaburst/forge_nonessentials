package com.j8bit.forager_nonessentials.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodMod {

    // put all food properties here :3

    public static FoodProperties glazedDonutFood = (new FoodProperties.Builder().nutrition(4).saturationMod(0.8f)).build();
    public static FoodProperties vanillaDonutFood = (new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1.0f).alwaysEat().build());
    public static FoodProperties chocolateDonutFood = (new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 1.0f).alwaysEat().build());
    public static FoodProperties sprinkleDonutFood = (new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0f).alwaysEat().build());

}
