package com.j8bit.forager_nonessentials.entity.client.armor;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.item.custom.ItemCloakArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CloakArmorModel extends AnimatedGeoModel<ItemCloakArmor> {

    @Override
    public ResourceLocation getModelLocation(ItemCloakArmor object) {
        return new ResourceLocation(ForagerNonessentials.MODID, "geo/cloaks/basecloak.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ItemCloakArmor object) {
        return new ResourceLocation(ForagerNonessentials.MODID, "textures/model/armor/cloaks/base_cloak_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ItemCloakArmor animatable) {
        return new ResourceLocation(ForagerNonessentials.MODID, "animations/armor_animation.json");
    }

}
