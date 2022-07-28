package com.j8bit.forager_nonessentials.enchantment;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;

public class EnchantmentModProtection extends Enchantment {

    public final EnchantmentModProtection.Type type;

    public static enum Type{
        MAGIC(5, 15),
        ANNOYING(7, 17);

        private final int minCost;
        private final int levelCost;

        private Type(int pMinCost, int pLevelCost) {
            this.minCost = pMinCost;
            this.levelCost = pLevelCost;
        }

        public int getMinCost() {
            return this.minCost;
        }

        public int getLevelCost() {
            return this.levelCost;
        }
    }

    public EnchantmentModProtection(Enchantment.Rarity pRarity, EnchantmentModProtection.Type pType, EquipmentSlot... pApplicableSlots) {
        //super(pRarity, pType == ProtectionEnchantment.Type.FALL ? EnchantmentCategory.ARMOR_FEET : EnchantmentCategory.ARMOR, pApplicableSlots);
        super(pRarity, EnchantmentCategory.ARMOR, pApplicableSlots);
        this.type = pType;
    }

    public int getMinCost(int pEnchantmentLevel) {
        return this.type.getMinCost() + (pEnchantmentLevel - 1) * this.type.getLevelCost();
    }

    public int getMaxCost(int pEnchantmentLevel) {
        return this.getMinCost(pEnchantmentLevel) + this.type.getLevelCost();
    }

    public int getMaxLevel() {
        return this.type == Type.ANNOYING ? 2 : 4;
    }

    public int getDamageProtection(int pLevel, DamageSource pSource) {
        if (pSource.isBypassInvul()) {
            return 0;
        } else if (this.type == EnchantmentModProtection.Type.MAGIC
                && (pSource.isMagic()
                || pSource.isBypassMagic()
                || pSource == DamageSource.WITHER
                || pSource == DamageSource.DRAGON_BREATH) ) {
            return pLevel * 2;
        }
        else if (this.type == EnchantmentModProtection.Type.ANNOYING
                && (pSource == DamageSource.CACTUS
                || pSource == DamageSource.FALLING_BLOCK
                || pSource == DamageSource.FALLING_STALACTITE
                || pSource == DamageSource.HOT_FLOOR
                || pSource == DamageSource.IN_WALL
                || pSource == DamageSource.STALAGMITE
                || pSource == DamageSource.SWEET_BERRY_BUSH)){
            return pLevel * 4;
        }
        else{
            return 0;
        }
    }

    public boolean checkCompatibility(Enchantment pEnch) {
        if (pEnch instanceof ProtectionEnchantment) {
            ProtectionEnchantment protectionenchantment = (ProtectionEnchantment)pEnch;
            return false;
            //do this later
        } else {
            return super.checkCompatibility(pEnch);
        }
    }

}
