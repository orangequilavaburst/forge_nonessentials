package com.j8bit.forager_nonessentials.font;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

public enum FontMod {
    PIXEL_COMIC_SANS("pixel_comic_sans"),
    PIXEL_PAPYRUS("pixel_papyrus");

    private final String name;

    private FontMod(String pName) {
        this.name = pName;
    }

    public String getName(){
        return this.name;
    }

    public ResourceLocation getResourceLocation(){
        return new ResourceLocation(ForagerNonessentials.MODID, this.name);
    }

    public String getPath(){
        return ForagerNonessentials.MODID + "/font/" + this.name + ".json";
    }

}
