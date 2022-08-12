package com.j8bit.forager_nonessentials.client.render.layer;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.client.render.FNRenderTypes;
import com.j8bit.forager_nonessentials.enchantment.EnchantmentMod;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

@SuppressWarnings("rawtypes")
public class AlteredSightGeoLayer extends GeoLayerRenderer {

    private IGeoRenderer<?> parent;


    @SuppressWarnings("unchecked")
    public AlteredSightGeoLayer(IGeoRenderer<?> parent) {
        super(parent);
        this.parent = parent;
    }


    @SuppressWarnings("unchecked")
    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {

        LocalPlayer player = Minecraft.getInstance().player;
        ItemStack playerHelmet = player.getItemBySlot(EquipmentSlot.HEAD);

        if (entity.isInvisible()) {
            if (!playerHelmet.isEmpty()) {
                //ForagerNonessentials.LOGGER.info("Current player is wearing a helmet");
                if (EnchantmentHelper.getItemEnchantmentLevel(EnchantmentMod.ALTERED_SIGHT.get(), playerHelmet) > 0) {
                    RenderType cameo =  FNRenderTypes.alteredSight(new ResourceLocation(ForagerNonessentials.MODID, "textures/environment/altered_sight.png"));
                    //ForagerNonessentials.LOGGER.info("Helmet has altered sight");
                    //entity.setInvisible(false);
                    VertexConsumer ivertexbuilder = bufferIn.getBuffer(cameo);
                    float alpha = 1.0F;
                    matrixStackIn.pushPose();
                    //this.getEntityModel().renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, LivingEntityRenderer.getOverlayCoords((LivingEntity) entity, 0), 1, 1, 1, alpha);
                    this.getRenderer().render(this.getEntityModel().getModel(this.getEntityModel().getModelLocation(entity)), entity, partialTicks, cameo, matrixStackIn, bufferIn,
                            bufferIn.getBuffer(cameo), packedLightIn, GeoEntityRenderer.getPackedOverlay((LivingEntity) entity, 0), 1f, 1f, 1f, alpha);
                    matrixStackIn.popPose();
                    //ForagerNonessentials.LOGGER.info("Attempted to render the altered sight effect to " + entity.getType().getRegistryName());
                }
            }
        }

    }
}
