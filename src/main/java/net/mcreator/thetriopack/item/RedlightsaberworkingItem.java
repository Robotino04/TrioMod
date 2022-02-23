
package net.mcreator.thetriopack.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thetriopack.init.TheTrioPackModTabs;
import net.mcreator.thetriopack.init.TheTrioPackModItems;

public class RedlightsaberworkingItem extends SwordItem {
	public RedlightsaberworkingItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheTrioPackModItems.RED_AMETHYST_SHARD));
			}
		}, 3, -2.5f, new Item.Properties().tab(TheTrioPackModTabs.TAB_TRIO_TOOLS).fireResistant());
		setRegistryName("redlightsaberworking");
	}
}
