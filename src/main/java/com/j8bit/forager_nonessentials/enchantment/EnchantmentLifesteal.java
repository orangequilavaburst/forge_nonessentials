package com.j8bit.forager_nonessentials.enchantment;

import com.google.common.collect.Multimap;
import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.Map;
import java.util.UUID;

public class EnchantmentLifesteal extends Enchantment{

    protected EnchantmentLifesteal(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    public int getMinCost(int pEnchantmentLevel) {
        return pEnchantmentLevel * 10;
    }

    public int getMaxCost(int pEnchantmentLevel) {
        return this.getMinCost(pEnchantmentLevel) + 15;
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (pTarget instanceof LivingEntity) {
            LivingEntity target = (LivingEntity) pTarget;

            float healAmount = 1.0f;

            ItemStack attackItem = pAttacker.getMainHandItem();
            Multimap<Attribute, AttributeModifier> multimap = attackItem.getAttributeModifiers(EquipmentSlot.MAINHAND);

            //ForagerNonessentials.LOGGER.info("Attribute list size of " + attackItem.getDisplayName().getString() + ": " + multimap.size());

            if (!multimap.isEmpty()) {

                for(Map.Entry<Attribute, AttributeModifier> entry : multimap.entries()) {

                    AttributeModifier attributemodifier = entry.getValue();

                    //ForagerNonessentials.LOGGER.info(attributemodifier.getName() + " " + attributemodifier.getAmount());

                    if (attributemodifier.getId().compareTo(UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF")) == 0) {

                        double d0 = attributemodifier.getAmount();

                        //ForagerNonessentials.LOGGER.info("Base attack amount: " + attributemodifier.getAmount());
                        //ForagerNonessentials.LOGGER.info("Attack damage amount: " + pAttacker.getAttributeBaseValue(Attributes.ATTACK_DAMAGE));
                        //ForagerNonessentials.LOGGER.info("Multiplier: " + (1.0f + (float) pLevel / (float) this.getMaxLevel()));

                        d0 += pAttacker.getAttributeBaseValue(Attributes.ATTACK_DAMAGE);
                        d0 *= ((float) pLevel / (float) this.getMaxLevel()) * 0.5f;

                        //ForagerNonessentials.LOGGER.info("Intended heal amount: " + d0);

                        healAmount += d0;

                    }
                }

            }

            healAmount = (float)((int)healAmount);
            /*if (!pAttacker.level.isClientSide()){
                if (pAttacker instanceof Player){
                    ServerPlayer p = (ServerPlayer)pAttacker;
                    String s = "Lifesteal healed " + Float.toString(healAmount) + " health!";
                    p.displayClientMessage( new TextComponent(s), true);
                }
            }*/
            pAttacker.heal(healAmount);

        }

        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
