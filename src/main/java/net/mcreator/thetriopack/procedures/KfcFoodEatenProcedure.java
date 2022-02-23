package net.mcreator.thetriopack.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class KfcFoodEatenProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 60, 3, (false), (true)));
	}
}
