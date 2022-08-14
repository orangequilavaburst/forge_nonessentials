package com.j8bit.forager_nonessentials.item.custom;

import com.j8bit.forager_nonessentials.item.ItemMod;
import com.j8bit.forager_nonessentials.particle.ParticleMod;
import com.j8bit.forager_nonessentials.sound.SoundMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class ItemTotem extends Item {

    private boolean consumeItem = false;

    public ItemTotem(Properties properties) {
        super(properties);
    }

    public ItemTotem(Properties properties, boolean canConsume) {
        super(properties);

        consumeItem = canConsume;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        //ItemStack itemStack = new ItemStack(player.getItemInHand(hand).getItem());
        ItemStack itemStack = player.getItemInHand(hand);
        ItemStack fakeItemStack = player.getItemInHand(hand).copy();
        Random random = new Random();

        if (level.isClientSide()) {
            Minecraft.getInstance().gameRenderer.displayItemActivation(fakeItemStack);
            level.playLocalSound(player.getX(), player.getY(), player.getZ(), SoundEvents.TOTEM_USE, player.getSoundSource(), 0.1f, 1.0f, false);
        }

        if (fakeItemStack.getItem().asItem().equals(ItemMod.TOTEM_OF_HONESTY.get().asItem())){
            int count = 48;

            if (!level.isClientSide) {
                for (int i = 0; i < count; ++i) {
                    double d0 = (double) (random.nextFloat() * 2.0F - 1.0F) / 2.0f;
                    double d1 = (double) (random.nextFloat() * 2.0F - 1.0F) / 2.0f;
                    double d2 = (double) (random.nextFloat() * 2.0F - 1.0F) / 2.0f;
                    if (!(d0 * d0 + d1 * d1 + d2 * d2 > 1.0D)) {
                        double d3 = player.getX(d0 / 4.0D);
                        double d4 = player.getY(0.5D + d1 / 4.0D);
                        double d5 = player.getZ(d2 / 4.0D);
                        level.addParticle(ParticleMod.CONFETTI_PARTICLES.get(), false, d3, d4, d5, d0, d1 + 0.2D, d2);
                    }
                }

                Minecraft.getInstance().particleEngine.createTrackingEmitter(player, ParticleTypes.TOTEM_OF_UNDYING, 30);

                level.playLocalSound(player.getX(), player.getY(), player.getZ(), SoundMod.HONESTY_USE.get(), player.getSoundSource(), 1.0f, 1.0f, false);

                //player.getLevel().playSound(player, player.blockPosition(), ModSounds.HONESTY_USE, SoundSource.MASTER, 1.0f, 1.0f);

            }
            //BaseMod.LOGGER.info("Playing sound " + ModSounds.HONESTY_USE.getRegistryName() + " at " + ModSounds.HONESTY_USE.getLocation().toString());
            //BaseMod.LOGGER.info("Playing sound " + SoundEvents.TOTEM_USE.getRegistryName() + " at " + SoundEvents.TOTEM_USE.getLocation().toString());
        }
        else{
            int count = 20;
            double particleSpeed = 1.0f;
            for (int i = 0; i < count; i++) {
                level.addParticle(ParticleTypes.TOTEM_OF_UNDYING, player.getX(), player.getY() + player.getBbHeight()/2.0, player.getZ(),
                        Math.cos(360/(double)count*(double)i)*particleSpeed, 0.0f, -Math.sin(360/(double)count*(double)i)*particleSpeed);
            }

            level.playLocalSound(player.getX(), player.getY(), player.getZ(), SoundEvents.TOTEM_USE, player.getSoundSource(), 1.0f, 1.0f, false);
        }

        if (player == null || (this.consumeItem && !player.getAbilities().instabuild)){
            itemStack.shrink(1);
        }
        return InteractionResultHolder.success(itemStack);

    }
}
