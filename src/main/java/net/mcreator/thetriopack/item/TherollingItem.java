
package net.mcreator.thetriopack.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thetriopack.init.TheTrioPackModSounds;

public class TherollingItem extends RecordItem {
	public TherollingItem() {
		super(0, TheTrioPackModSounds.REGISTRY.get(new ResourceLocation("the_trio_pack:theforbiddenrole")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("therolling");
	}
}
