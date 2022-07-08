package com.j8bit.forager_nonessentials.entity.client;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.entity.AmongusEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AmongusModel extends AnimatedGeoModel<AmongusEntity> {

    @Override
    public ResourceLocation getModelLocation(AmongusEntity object) {
        return new ResourceLocation(ForagerNonessentials.MODID, "geo/amongus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AmongusEntity object) {
        //return new ResourceLocation(BaseMod.MODID, "textures/entity/amongus/amongus.png");
        return AmongusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AmongusEntity animatable) {
        return new ResourceLocation(ForagerNonessentials.MODID, "animations/amongus.animation.json");
    }
}
