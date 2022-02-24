
package net.mcreator.thetriopack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thetriopack.init.TheTrioPackModTabs;

public class KfcbucketItem extends Item {
	public KfcbucketItem() {
		super(new Item.Properties().tab(TheTrioPackModTabs.TAB_TRIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("kfcbucket");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
