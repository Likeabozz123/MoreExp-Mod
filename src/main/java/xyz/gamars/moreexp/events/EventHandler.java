package xyz.gamars.moreexp.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerXpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.system.CallbackI;
import xyz.gamars.moreexp.config.MoreExpConfig;

public class EventHandler {

    @SubscribeEvent
    public static void gainExperience(PlayerXpEvent.XpChange event) {
        int modifier = MoreExpConfig.exp_multiplier.get();
        event.setAmount(event.getAmount() * modifier);
    }

}
