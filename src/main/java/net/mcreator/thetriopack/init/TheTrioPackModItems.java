
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thetriopack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.thetriopack.item.TherollingItem;
import net.mcreator.thetriopack.item.RedlightsaberworkingItem;
import net.mcreator.thetriopack.item.RedlightsaberItem;
import net.mcreator.thetriopack.item.RedAmethystShardItem;
import net.mcreator.thetriopack.item.MetalstickItem;
import net.mcreator.thetriopack.item.KfcItem;
import net.mcreator.thetriopack.item.BlueLightsaberItem;
import net.mcreator.thetriopack.item.BlueAmethystShardItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheTrioPackModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RED_AMETHYST_SHARD = register(new RedAmethystShardItem());
	public static final Item REDLIGHTSABER = register(new RedlightsaberItem());
	public static final Item METALSTICK = register(new MetalstickItem());
	public static final Item BLUE_AMETHYST_SHARD = register(new BlueAmethystShardItem());
	public static final Item BLUE_LIGHTSABER = register(new BlueLightsaberItem());
	public static final Item REDLIGHTSABERWORKING = register(new RedlightsaberworkingItem());
	public static final Item THEROLLING = register(new TherollingItem());
	public static final Item KFC = register(new KfcItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
