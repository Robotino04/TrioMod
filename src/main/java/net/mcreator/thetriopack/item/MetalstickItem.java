
package net.mcreator.thetriopack.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.thetriopack.init.TheTrioPackModTabs;

import java.util.List;

public class MetalstickItem extends Item {
	public MetalstickItem() {
		super(new Item.Properties().tab(TheTrioPackModTabs.TAB_TRIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("metalstick");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Its an metal Stick"));
	}
}
