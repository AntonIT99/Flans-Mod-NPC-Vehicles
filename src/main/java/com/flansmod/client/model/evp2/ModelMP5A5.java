/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 */
package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMP5A5
extends ModelGun {
    public ModelMP5A5() {
        int textureX = 512;
        int textureY = 512;
        this.gunModel = new ModelRendererTurbo[1];
        this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/MP5A5.obj");
        this.gunModel[0].setRotationPoint(3.5f, 2.0f, 0.0f);
        this.animationType = EnumAnimationType.RIFLE_TOP;
        this.numBulletsInReloadAnimation = 1.0f;
        this.tiltGunTime = 0.279f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.6f;
        this.untiltGunTime = 0.163f;
        this.translateAll(0.0f, 1.0f, 0.0f);
    }
}

