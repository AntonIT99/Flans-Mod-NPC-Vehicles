package com.wolffsmod.network;

import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.config.RangeConfig;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayerMP;

public class RangeConfigSyncHandler {
    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.player instanceof EntityPlayerMP) {
            WolffNPCMod.network.sendTo(new RangeConfigPacket(
                    RangeConfig.getMaximumNPCCombatRange(),
                    RangeConfig.getNPCViewDistance(),
                    RangeConfig.getNPCNavigationRange()), (EntityPlayerMP)event.player);
        }
    }
}
