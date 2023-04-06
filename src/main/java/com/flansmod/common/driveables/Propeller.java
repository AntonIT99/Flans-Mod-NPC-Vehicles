/*
 * Decompiled with CFR 0_123.
 */
package com.flansmod.common.driveables;

import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.vector.Vector3f;

public class Propeller {
    public PartType itemType;
    public int ID;
    public int x;
    public int y;
    public int z;
    public EnumDriveablePart planePart;

    public Propeller(int i, int x, int y, int z, EnumDriveablePart part, PartType type) {
        this.ID = i;
        this.x = x;
        this.y = y;
        this.z = z;
        this.planePart = part;
        this.itemType = type;
    }

    public Vector3f getPosition() {
        return new Vector3f((float)this.x / 16.0f, (float)this.y / 16.0f, (float)this.z / 16.0f);
    }
}

