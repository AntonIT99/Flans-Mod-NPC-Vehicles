package com.wolffsmod.customnpc;

import com.wolffsmod.config.RangeConfig;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.EntityEvent;
import noppes.npcs.entity.EntityNPCInterface;

/**
 * Allows a loaded CustomNPC to keep ticking at the edge of the server's loaded
 * chunk area. Vanilla 1.7.10 otherwise requires a 32-block loaded-chunk margin
 * around an entity before invoking its update method.
 *
 * This does not load or retain chunks. It only answers Forge's CanUpdate event
 * for an NPC that is already loaded and within the configured tracking distance
 * of a player.
 */
public final class CustomNpcTickActivation
{
    @SubscribeEvent
    public void onCanUpdate(EntityEvent.CanUpdate event)
    {
        if (!(event.entity instanceof EntityNPCInterface)
                || event.entity.worldObj == null
                || event.entity.worldObj.isRemote)
            return;

        int range = RangeConfig.getNPCViewDistance();
        if (range > 0 && event.entity.worldObj.getClosestPlayerToEntity(event.entity, range) != null)
            event.canUpdate = true;
    }
}
