
package net.mcreator.thetriopack.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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
		},

				3, -2.5f,

				new Item.Properties().tab(TheTrioPackModTabs.TAB_TRIO_TOOLS).fireResistant());

		setRegistryName("redlightsaberworking");
	}

}
