
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thetriopack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheTrioPackModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("the_trio_pack", "papyrustheme"), new SoundEvent(new ResourceLocation("the_trio_pack", "papyrustheme")));
		REGISTRY.put(new ResourceLocation("the_trio_pack", "deathsoundpapyrus"),
				new SoundEvent(new ResourceLocation("the_trio_pack", "deathsoundpapyrus")));
		REGISTRY.put(new ResourceLocation("the_trio_pack", "papyrushurt"), new SoundEvent(new ResourceLocation("the_trio_pack", "papyrushurt")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
