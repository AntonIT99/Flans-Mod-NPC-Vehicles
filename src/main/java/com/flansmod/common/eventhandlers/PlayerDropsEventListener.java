package com.flansmod.common.eventhandlers;

import com.flansmod.common.types.InfoType;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;

public class PlayerDropsEventListener {

    public PlayerDropsEventListener() {
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void playerDrops(PlayerDropsEvent event) {
        for (int i = event.drops.size() - 1; i >= 0; i--) {
            EntityItem ent = event.drops.get(i);
            InfoType type = InfoType.getType(ent.getEntityItem());
            if (type != null && !type.canDrop)
                event.drops.remove(i);
        }
    }


    @SubscribeEvent
    public void playerDrops(ItemTossEvent event) {
        InfoType type = InfoType.getType(event.entityItem.getEntityItem());
        if (type != null && !type.canDrop)
            event.setCanceled(true);
    }
}
