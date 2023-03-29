package com.flansmod.api;

import net.minecraft.entity.Entity;

public interface IEntityBullet {
    // The entity (Usually player but sometimes driveable) that fired the shot
    Entity owner = null;
    // The type of this bullet
    IInfoType type = null;
    // The type that fired this, could be a gun or possibly a driveable?
    IInfoType firedFrom = null;
}
