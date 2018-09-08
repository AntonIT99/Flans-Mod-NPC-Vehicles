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

public class ModelPL14
extends ModelGun {
    public ModelPL14() {
        int textureX = 1024;
        int textureY = 1024;
        this.gunModel = new ModelRendererTurbo[1];
        this.ammoModel = new ModelRendererTurbo[1];
        this.slideModel = new ModelRendererTurbo[1];
        this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_body.obj");
        this.gunModel[0].setRotationPoint(3.5f, 2.0f, 0.0f);
        this.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.ammoModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_magazine.obj");
        this.ammoModel[0].setRotationPoint(3.5f, 2.0f, 0.0f);
        this.slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.slideModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_slide.obj");
        this.slideModel[0].setRotationPoint(3.5f, 2.0f, 0.0f);
        this.animationType = EnumAnimationType.PISTOL_CLIP;
        this.gunSlideDistance = 0.2f;
        this.numBulletsInReloadAnimation = 1.0f;
        this.tiltGunTime = 0.1f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.625f;
        this.untiltGunTime = 0.275f;
        this.translateAll(-3.5f, -1.8f, 0.0f);
    }
}

