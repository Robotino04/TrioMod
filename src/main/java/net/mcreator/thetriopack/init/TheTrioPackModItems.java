
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thetriopack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import net.mcreator.thetriopack.item.TheGoldBiomeItem;
import net.mcreator.thetriopack.item.RedLightsaberItem;
import net.mcreator.thetriopack.item.RedAmethystShardItem;
import net.mcreator.thetriopack.item.MetalstickItem;
import net.mcreator.thetriopack.item.KfcfrieItem;
import net.mcreator.thetriopack.item.KfcbucketItem;
import net.mcreator.thetriopack.item.KfcItem;
import net.mcreator.thetriopack.item.KetchupItem;
import net.mcreator.thetriopack.item.CutpotatoItem;
import net.mcreator.thetriopack.item.BlueLightsaberItem;
import net.mcreator.thetriopack.item.BlueAmethystShardItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheTrioPackModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RED_AMETHYST_SHARD = register(new RedAmethystShardItem());
	public static final Item METALSTICK = register(new MetalstickItem());
	public static final Item BLUE_AMETHYST_SHARD = register(new BlueAmethystShardItem());
	public static final Item KFC = register(new KfcItem());
	public static final Item BLUE_LIGHTSABER = register(new BlueLightsaberItem());
	public static final Item RED_LIGHTSABER = register(new RedLightsaberItem());
	public static final Item KFCBUCKET = register(new KfcbucketItem());
	public static final Item KFCFRIE = register(new KfcfrieItem());
	public static final Item KETCHUP = register(new KetchupItem());
	public static final Item CUTPOTATO = register(new CutpotatoItem());
	public static final Item THE_GOLD_BIOME = register(new TheGoldBiomeItem());
	public static final Item PAPYRUS = register(
			new SpawnEggItem(TheTrioPackModEntities.PAPYRUS, -1, -65536, new Item.Properties().tab(TheTrioPackModTabs.TAB_TRIOMOBS))
					.setRegistryName("papyrus_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
