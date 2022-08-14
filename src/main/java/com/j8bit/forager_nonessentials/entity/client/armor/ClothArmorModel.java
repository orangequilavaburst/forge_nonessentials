package com.j8bit.forager_nonessentials.entity.client.armor;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.item.ItemClothArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ClothArmorModel extends AnimatedGeoModel<ItemClothArmor> {
    @Override
    public ResourceLocation getModelLocation(ItemClothArmor itemClothArmor) {
        return new ResourceLocation(ForagerNonessentials.MODID, "geo/cloaks/basecloak.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ItemClothArmor itemClothArmor) {
        return new ResourceLocation(ForagerNonessentials.MODID, "textures/model/armor/base_cloak_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ItemClothArmor itemClothArmor) {
        return new ResourceLocation(ForagerNonessentials.MODID, "animations/armor_animation.json");
    }
}
