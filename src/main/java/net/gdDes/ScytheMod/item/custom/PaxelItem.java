package net.gdDes.ScytheMod.item.custom;

import net.gdDes.ScytheMod.util.ModTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class PaxelItem extends DiggerItem implements Vanishable {
    public PaxelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.NEEDS_SCYTHE, pProperties);
    }

    @Override
    public void onCraftedBy(ItemStack pStack, Level pLevel, Player pPlayer) {
        super.onCraftedBy(pStack, pLevel, pPlayer);
        pStack.enchant(Enchantments.BLOCK_EFFICIENCY, 5);
        pStack.enchant(Enchantments.SHARPNESS, 5);
        pStack.enchant(Enchantments.SMITE, 5);
        pStack.enchant(Enchantments.UNBREAKING, 3);
        pStack.enchant(Enchantments.MOB_LOOTING, 3);
        pStack.enchant(Enchantments.SILK_TOUCH, 1);
        pStack.enchant(Enchantments.MENDING, 1);
    }
}
