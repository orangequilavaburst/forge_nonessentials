package com.j8bit.forager_nonessentials.client.render;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import com.j8bit.forager_nonessentials.client.events.EventBusEventsClientMod;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.client.renderer.blockentity.TheEndPortalRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.Nullable;

public class FNRenderTypes extends RenderType {

    protected static final RenderStateShard.ShaderStateShard RENDERTYPE_ALTERED_SIGHT = new RenderStateShard.ShaderStateShard(EventBusEventsClientMod::getRenderTypeAlteredSight);
    private static final RenderType ALTERED_SIGHT = /*create("altered_sight",
            DefaultVertexFormat.POSITION_TEX,
            VertexFormat.Mode.QUADS, 256, true, true,
            RenderType.CompositeState.builder()
                    .setShaderState(RenderStateShard.RENDERTYPE_END_GATEWAY_SHADER) //RENDERTYPE_ENTITY_GLINT_SHADER
                    .setTextureState(new RenderStateShard.TextureStateShard(new ResourceLocation(ForagerNonessentials.MODID, "textures/environment/altered_sight.png"), true, false))
                    .setWriteMaskState(COLOR_DEPTH_WRITE) //COLOR_DEPTH_WRITE
                    .setCullState(NO_CULL).setDepthTestState(EQUAL_DEPTH_TEST)
                    .setTransparencyState(NO_TRANSPARENCY)
                    .setTexturingState(DEFAULT_TEXTURING)
                    .setOverlayState(OVERLAY).createCompositeState(true));*/
            create("altered_sight",
                    DefaultVertexFormat.POSITION,
                    VertexFormat.Mode.QUADS, 256, true, true,
                    RenderType.CompositeState.builder()
                            .setShaderState(RENDERTYPE_ALTERED_SIGHT)
                            .setTextureState(
                                    RenderStateShard.MultiTextureStateShard.builder()
                                            .add(new ResourceLocation(ForagerNonessentials.MODID, "textures/environment/altered_sight.png"), false, false)
                                            //.add(new ResourceLocation(ForagerNonessentials.MODID, "textures/environment/altered_sight.png"), false, false)
                                            .build())
                            .createCompositeState(false));

    public FNRenderTypes(String pName, VertexFormat pFormat, VertexFormat.Mode pMode, int pBufferSize, boolean pAffectsCrumbling, boolean pSortOnUpload, Runnable pSetupState, Runnable pClearState) {
        super(pName, pFormat, pMode, pBufferSize, pAffectsCrumbling, pSortOnUpload, pSetupState, pClearState);
    }

    public static RenderType alteredSight() {
        return ALTERED_SIGHT;
    }

}
