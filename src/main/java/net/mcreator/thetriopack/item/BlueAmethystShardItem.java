
package net.mcreator.thetriopack.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BlueAmethystShardItem extends Item {

	public BlueAmethystShardItem() {
		super(new Item.Properties().tab(TheTrioPackModTabs.TAB_TRIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("blue_amethyst_shard");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		AmethystShardRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}

}
