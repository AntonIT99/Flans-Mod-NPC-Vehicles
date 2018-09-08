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

public class ModelUKM2013
extends ModelGun {
    public ModelUKM2013() {
        int textureX = 256;
        int textureY = 128;
        this.gunModel = new ModelRendererTurbo[1];
        this.ammoModel = new ModelRendererTurbo[1];
        this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013.obj");
        this.gunModel[0].setRotationPoint(3.5f, 2.0f, 0.0f);
        this.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.ammoModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013_magazine.obj");
        this.ammoModel[0].setRotationPoint(3.5f, 2.0f, 0.0f);
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.numBulletsInReloadAnimation = 1.0f;
        this.tiltGunTime = 0.279f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.6f;
        this.untiltGunTime = 0.163f;
        this.translateAll(-3.5f, -1.8f, 0.0f);
    }
}

