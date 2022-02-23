
package net.mcreator.thetriopack.item;

import net.minecraft.network.chat.Component;

public class TherollingItem extends RecordItem {

	public TherollingItem() {
		super(0, TheTrioPackModSounds.REGISTRY.get(new ResourceLocation("the_trio_pack:theforbiddenrole")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));

		setRegistryName("therolling");
	}

}
