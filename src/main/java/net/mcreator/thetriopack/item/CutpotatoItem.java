
package net.mcreator.thetriopack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CutpotatoItem extends Item {
	public CutpotatoItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("cutpotato");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
