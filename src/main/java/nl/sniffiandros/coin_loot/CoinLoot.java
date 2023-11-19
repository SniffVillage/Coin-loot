package nl.sniffiandros.coin_loot;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import nl.sniffiandros.coin_loot.event.OnEntityDeathEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoinLoot implements ModInitializer {
	@Override
	public void onInitialize() {
		ServerLivingEntityEvents.AFTER_DEATH.register(new OnEntityDeathEvent());
	}
}