package com.j8bit.forager_nonessentials.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;

public class OrichalcumSwordItem extends SwordItem {
    public OrichalcumSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {

        if (pAttacker.isAlive()){

            pAttacker.hurtMarked = true;

            float recoilSpeed = 0.75f;
            float recoilJump = 1.0f;
            Vec3 recoilAngle = pAttacker.getLookAngle();
            recoilAngle.normalize();
            recoilAngle.multiply(recoilSpeed, recoilSpeed, recoilSpeed);
            recoilAngle.multiply(0.0f, 0.0f, 1.0f);
            recoilAngle.add(0.0f, recoilJump, Math.PI/90.0f);

            pAttacker.setDeltaMovement(recoilAngle);
            pAttacker.fallDistance = 0.0f;

        }

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }


}
