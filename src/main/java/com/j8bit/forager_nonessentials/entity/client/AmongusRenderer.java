package com.j8bit.forager_nonessentials.entity.client;

import com.google.common.collect.Maps;
import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.entity.AmongusEntity;
import com.j8bit.forager_nonessentials.entity.client.variant.AmongusVariant;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class AmongusRenderer extends GeoEntityRenderer<AmongusEntity> {

    public static final Map<AmongusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(AmongusVariant.class), (p_114874_) -> {
                p_114874_.put(AmongusVariant.RED,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_red.png"));
                p_114874_.put(AmongusVariant.BLUE,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_blue.png"));
                p_114874_.put(AmongusVariant.GREEN,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_green.png"));
                p_114874_.put(AmongusVariant.PINK,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_pink.png"));
                p_114874_.put(AmongusVariant.ORANGE,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_orange.png"));
                p_114874_.put(AmongusVariant.YELLOW,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_yellow.png"));
                p_114874_.put(AmongusVariant.BLACK,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_black.png"));
                p_114874_.put(AmongusVariant.WHITE,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_white.png"));
                p_114874_.put(AmongusVariant.PURPLE,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_purple.png"));
                p_114874_.put(AmongusVariant.BROWN,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_brown.png"));
                p_114874_.put(AmongusVariant.CYAN,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_cyan.png"));
                p_114874_.put(AmongusVariant.LIME,
                        new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus_lime.png"));

            });

    public AmongusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AmongusModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(AmongusEntity instance) {
        //return new ResourceLocation(ForagerNonessentials.MODID, "textures/entity/amongus/amongus.png");
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(AmongusEntity animatable, float partialTicks, PoseStack stack, @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        stack.scale(1.0f, 1.0f, 1.0f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
