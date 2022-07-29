package com.j8bit.forager_nonessentials.client.render.layer;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.client.render.FNRenderTypes;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AlteredSightLayer extends RenderLayer {

    private RenderLayerParent parent;

    public AlteredSightLayer(RenderLayerParent parent) {
        super(parent);
        this.parent = parent;
    }

    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        LocalPlayer player = Minecraft.getInstance().player;
        ItemStack playerHelmet = player.getItemBySlot(EquipmentSlot.HEAD);
        if (entity instanceof LivingEntity) {
            if (((LivingEntity) entity).getEffect(MobEffects.INVISIBILITY) != null) {
                if (!playerHelmet.isEmpty()) {
                    //entity.setInvisible(false);
                    VertexConsumer ivertexbuilder = bufferIn.getBuffer(FNRenderTypes.alteredSight(new ResourceLocation(ForagerNonessentials.MODID, "textures/environment/altered_sight.png")));
                    float alpha = 1.0F;
                    matrixStackIn.pushPose();
                    this.getParentModel().renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, LivingEntityRenderer.getOverlayCoords((LivingEntity) entity, 0), 1, 1, 1, alpha);
                    matrixStackIn.popPose();
                }

            }
        }
    }

}
