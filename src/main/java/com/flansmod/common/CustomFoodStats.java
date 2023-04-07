package com.flansmod.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.FoodStats;

public class CustomFoodStats extends FoodStats {
    private int regenTimer;
    @Override
    public void onUpdate(EntityPlayer player) {
        super.onUpdate(player);

        if (regenTimer >= FlansMod.bonusRegenTickDelay) {
            if (player.getFoodStats().getFoodLevel() >= FlansMod.bonusRegenFoodLimit) {
                player.heal(FlansMod.bonusRegenAmount);
            }
            regenTimer = 0;
        }

        regenTimer++;
    }
}


