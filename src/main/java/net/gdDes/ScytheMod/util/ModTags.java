package net.gdDes.ScytheMod.util;

import net.gdDes.ScytheMod.ScytheMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static net.minecraft.tags.TagEntry.tag;


public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_SCYTHE = tag("mineable/paxel");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ScytheMod.MOD_ID, name));
        }
    }
}
