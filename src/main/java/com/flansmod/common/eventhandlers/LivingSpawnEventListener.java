package com.flansmod.common.eventhandlers;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.Team;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;

public class LivingSpawnEventListener {

    @SubscribeEvent
    public void onLivingSpecialSpawn(LivingSpawnEvent.CheckSpawn event) {
        // Check if the entity being spawned is a Zombie or Skeleton
        if (!(event.entityLiving instanceof EntityZombie) && !(event.entityLiving instanceof EntitySkeleton)) {
            return;
        }
        // Check if the spawn chance is met
        if (event.world.rand.nextInt(101) >= FlansMod.armourSpawnRate) {
            return;
        }
        // 50% chance to give a completely random piece of armor
        if (event.world.rand.nextBoolean() && !ArmourType.armours.isEmpty()) {
            ArmourType armor = ArmourType.armours.get(event.world.rand.nextInt(ArmourType.armours.size()));
            if (armor != null && armor.type != 2) {
                event.entityLiving.setCurrentItemOrArmor(armor.type + 1, new ItemStack(armor.item));
            }
        } else if (!Team.teams.isEmpty()) {
            // Give a random set of armor
            Team team = Team.teams.get(event.world.rand.nextInt(Team.teams.size()));
            if (team.hat != null) {
                event.entityLiving.setCurrentItemOrArmor(1, team.hat.copy());
            }
            if (team.chest != null) {
                event.entityLiving.setCurrentItemOrArmor(2, team.chest.copy());
            }
            if (team.shoes != null) {
                event.entityLiving.setCurrentItemOrArmor(4, team.shoes.copy());
            }
        }
    }
}
