package com.j8bit.forager_nonessentials.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;

public class ItemRecoilSword extends SwordItem {
    public ItemRecoilSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {

        if (pAttacker.isAlive()){

            pAttacker.hurtMarked = true;

            float recoilSpeed = -0.5f;
            Vec3 recoilAngle = pAttacker.getLookAngle();
            recoilAngle.normalize();

            pAttacker.setDeltaMovement(recoilAngle.scale(recoilSpeed));
            pAttacker.fallDistance /= 2.0f;

        }

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }


}
