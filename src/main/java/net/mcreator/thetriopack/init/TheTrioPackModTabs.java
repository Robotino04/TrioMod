
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thetriopack.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheTrioPackModTabs {
	public static CreativeModeTab TAB_TRIO_TOOLS;
	public static CreativeModeTab TAB_TRIO_ITEMS;
	public static CreativeModeTab TAB_TRIOMOBS;

	public static void load() {
		TAB_TRIO_TOOLS = new CreativeModeTab("tabtrio_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.DIAMOND_PICKAXE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TRIO_ITEMS = new CreativeModeTab("tabtrio_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TheTrioPackModItems.RED_AMETHYST_SHARD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TRIOMOBS = new CreativeModeTab("tabtriomobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.CREEPER_SPAWN_EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
