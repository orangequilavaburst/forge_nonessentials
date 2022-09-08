package com.j8bit.forager_nonessentials.util;

import com.j8bit.forager_nonessentials.ForagerNonessentials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class TagsMod {

    public static class Blocks{

        public static final TagKey<Block> ALTERED_SIGHT_VISIBLE = tag("altered_sight_visible");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(ForagerNonessentials.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }

    public static class Items{



    }

}
