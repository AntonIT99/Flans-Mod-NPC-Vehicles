package com.flansmod.common.eventhandlers;

import com.flansmod.common.teams.ItemTeamArmour;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.AnvilUpdateEvent;

import static com.flansmod.common.FlansMod.armourEnchantability;

public class AnvilUpdateEventListener {

    @SubscribeEvent
    public void onAnvilUsedEvent(AnvilUpdateEvent event) {
        if (event.left != null && event.left.getItem() instanceof ItemTeamArmour && armourEnchantability == 0 && event.right != null) {
            event.setCanceled(true);
        }
    }
}
