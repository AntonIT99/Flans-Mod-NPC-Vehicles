package com.flansmod.common.eventhandlers;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;

public class PlayerSpawnEventListener extends Event {

    public PlayerSpawnEventListener() {
        FMLCommonHandler.instance().bus().register(this);
    }

    @Mod.EventHandler
    @SubscribeEvent
    public void OnPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        IAttributeInstance attribute = event.player.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.maxHealth);
        attribute.setBaseValue(FlansMod.maxHealth);
        event.player.setHealth(event.player.getMaxHealth());
    }
}