package com.j8bit.forager_nonessentials.particle.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ConfettiParticle extends TextureSheetParticle {

    int[] colorCombos = {
            0xfb689c,
            0xf69781,
            0xf6cb56,
            0xfde306,
            0xc7e267,
            0x50d2db,
            0x00a8da,
            0x6450a4
    };

    //float xRV = 0.0f;

    protected ConfettiParticle(ClientLevel level, double xCoord, double yCoord, double zCoord,
                               SpriteSet spriteSet, double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.xd = xd;
        this.yd = yd;
        this.zd = zd;

        this.friction = 0.8f;
        this.lifetime = 300;
        this.gravity = 0.1f;
        this.hasPhysics = true;
        this.quadSize *= 0.2f;
        this.setSpriteFromAge(spriteSet);



        //this.roll = (random.nextFloat() - 0.5f)*180f*((float)Math.PI/180f);

        int colNum = random.nextInt(this.colorCombos.length);

        this.rCol = getRedFromHex(this.colorCombos[colNum]);
        this.gCol = getGreenFromHex(this.colorCombos[colNum]);
        this.bCol = getBlueFromHex(this.colorCombos[colNum]);

    }

    @Override
    public void tick() {
        super.tick();

        if (!this.onGround){
            //this.roll += xRV;

            if (this.yd < -1.0f){
                this.yd = -1.0f;
            }

        }
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    private static int getRedFromHex(int hex){
        return (hex & 0xFF0000) >> 16;
    }

    private static int getGreenFromHex(int hex){
        return (hex & 0xFF00) >> 8;
    }

    private static int getBlueFromHex(int hex){
        return (hex & 0xFF);
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(SimpleParticleType particleType, ClientLevel level,
                                       double x, double y, double z,
                                       double dx, double dy, double dz) {
            return new ConfettiParticle(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }

}
