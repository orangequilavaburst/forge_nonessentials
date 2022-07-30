package com.j8bit.forager_nonessentials.client.render.layer;

import com.google.common.collect.ImmutableList;
import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.client.render.FNRenderTypes;
import com.j8bit.forager_nonessentials.enchantment.EnchantmentMod;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.DefaultAttributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.stream.Collectors;

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

        //boolean isInvisible = false;

        /*for(MobEffectInstance mobeffectinstance : ((LivingEntity) entity).getActiveEffects()) {
            MobEffect effect = mobeffectinstance.getEffect();
            //ForagerNonessentials.LOGGER.info("Entity " + entity.getType().getRegistryName() + " has " + effect.getRegistryName());
            if (effect.equals(MobEffects.INVISIBILITY)){
                isInvisible = true;
                //ForagerNonessentials.LOGGER.info("Entity " + entity.getType().getRegistryName() + " is invisible");
            }
        }*/

        /*if (!((LivingEntity) entity).getActiveEffects().isEmpty()) {
            boolean isInvisible = false;
            for(MobEffectInstance mobeffectinstance : ((LivingEntity) entity).getActiveEffects()) {
                MobEffect effect = mobeffectinstance.getEffect();
                //ForagerNonessentials.LOGGER.info("Entity " + entity.getType().getRegistryName() + " has " + effect.getRegistryName());
                if (effect.equals(MobEffects.INVISIBILITY)){
                    isInvisible = true;
                    //ForagerNonessentials.LOGGER.info("Entity " + entity.getType().getRegistryName() + " is invisible");
                }
            }
            if (!playerHelmet.isEmpty() && isInvisible) {
                //ForagerNonessentials.LOGGER.info("Current player is wearing a helmet");
                if (EnchantmentHelper.getItemEnchantmentLevel(EnchantmentMod.ALTERED_SIGHT.get(), playerHelmet) > 0) {
                    //ForagerNonessentials.LOGGER.info("Helmet has altered sight");
                    //entity.setInvisible(false);
                    VertexConsumer ivertexbuilder = bufferIn.getBuffer(FNRenderTypes.alteredSight(new ResourceLocation(ForagerNonessentials.MODID, "textures/environment/altered_sight.png")));
                    float alpha = 1.0F;
                    matrixStackIn.pushPose();
                    this.getParentModel().renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, LivingEntityRenderer.getOverlayCoords((LivingEntity) entity, 0), 1, 1, 1, alpha);
                    matrixStackIn.popPose();
                    //ForagerNonessentials.LOGGER.info("Attempted to render the altered sight effect to " + entity.getType().getRegistryName());
                }
            }

        }*/

        if (entity.isInvisible()) {
            if (!playerHelmet.isEmpty()) {
                //ForagerNonessentials.LOGGER.info("Current player is wearing a helmet");
                if (EnchantmentHelper.getItemEnchantmentLevel(EnchantmentMod.ALTERED_SIGHT.get(), playerHelmet) > 0) {
                    //ForagerNonessentials.LOGGER.info("Helmet has altered sight");
                    //entity.setInvisible(false);
                    VertexConsumer ivertexbuilder = bufferIn.getBuffer(FNRenderTypes.alteredSight(new ResourceLocation(ForagerNonessentials.MODID, "textures/environment/altered_sight.png")));
                    float alpha = 1.0F;
                    matrixStackIn.pushPose();
                    this.getParentModel().renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, LivingEntityRenderer.getOverlayCoords((LivingEntity) entity, 0), 1, 1, 1, alpha);
                    matrixStackIn.popPose();
                    //ForagerNonessentials.LOGGER.info("Attempted to render the altered sight effect to " + entity.getType().getRegistryName());
                }
            }
        }

    }

}
