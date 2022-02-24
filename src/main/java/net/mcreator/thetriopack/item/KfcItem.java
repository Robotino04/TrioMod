
package net.mcreator.thetriopack.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.thetriopack.procedures.KfcFoodEatenProcedure;
import net.mcreator.thetriopack.init.TheTrioPackModTabs;

import java.util.List;

public class KfcItem extends Item {
	public KfcItem() {
		super(new Item.Properties().tab(TheTrioPackModTabs.TAB_TRIO_ITEMS).stacksTo(64).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(2f).alwaysEat().meat().build()));
		setRegistryName("kfc");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 50;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Its a delicious treat"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		KfcFoodEatenProcedure.execute(entity);
		return retval;
	}
}
