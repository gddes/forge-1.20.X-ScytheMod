package net.gdDes.ScytheMod.item;

import net.gdDes.ScytheMod.ScytheMod;
import net.gdDes.ScytheMod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
     public static final Tier SCYTHE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 4000, 5f, 5f, 40, Tags.Blocks.NEEDS_NETHERITE_TOOL,
                    () -> Ingredient.of(ModItems.CORRUPT_INGOT.get())),
             new ResourceLocation(ScytheMod.MOD_ID, "scythe"), List.of(Tiers.NETHERITE), List.of());
}
