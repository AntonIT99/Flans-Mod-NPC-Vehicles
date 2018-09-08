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
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelPanzerfaust100
extends ModelGun {
    int textureX = 64;
    int textureY = 64;

    public ModelPanzerfaust100() {
        this.gunModel = new ModelRendererTurbo[13];
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(-15.0f, 0.0f, -0.5f, 19, 1, 1, 0.0f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f);
        this.gunModel[0].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[1].addShapeBox(4.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 0.3f, 0.3f);
        this.gunModel[1].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[2].addShapeBox(5.0f, 0.0f, -0.5f, 3, 1, 1, 0.0f, 0.0f, 0.7f, 0.7f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 0.7f, 0.7f);
        this.gunModel[2].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[3].addShapeBox(8.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 1.2f, 1.2f, -0.5f, 1.2f, 1.2f, -0.5f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f, -0.5f, 1.2f, 1.2f, -0.5f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f);
        this.gunModel[3].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[4].addShapeBox(8.5f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f);
        this.gunModel[4].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[5].addShapeBox(9.0f, 0.0f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.9f, 0.9f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.9f, 0.9f);
        this.gunModel[5].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[6].addShapeBox(-4.0f, -1.0f, -0.5f, 4, 1, 1, 0.0f, 0.0f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[7].addShapeBox(-3.0f, -1.0f, -0.5f, 4, 1, 1, 0.0f, 0.0f, -0.7f, -0.25f, -2.5f, -0.3f, -0.25f, -2.5f, -0.3f, -0.25f, 0.0f, -0.7f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.gunModel[7].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[8].addShapeBox(0.1f, -4.0f, -0.5f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, -3.0f, -0.2f, 0.0f, -3.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.75f, 0.0f, 0.0f, -0.75f);
        this.gunModel[8].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[9].addShapeBox(0.1f, -4.0f, -0.5f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, -3.0f, -0.75f, 0.0f, -3.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.75f, 0.0f, -0.5f, -0.75f, 0.0f, -0.5f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.gunModel[9].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[10].addShapeBox(0.0f, -2.0f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.9f, 0.0f, -0.2f, -0.9f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.9f, 0.0f, -0.2f, -0.9f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.gunModel[10].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[11].addShapeBox(0.0f, -4.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.9f, 0.0f, -0.2f, -0.9f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.5f, -0.2f, -0.9f, 0.5f, -0.2f, -0.9f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f);
        this.gunModel[11].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[12].addShapeBox(0.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.gunModel[12].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.END_LOADED;
        this.tiltGunTime = 0.4f;
        this.unloadClipTime = 0.1f;
        this.loadClipTime = 0.1f;
        this.untiltGunTime = 0.4f;
        this.translateAll(0.0f, -1.0f, 0.0f);
        this.thirdPersonOffset = new Vector3f(0.0f, -0.05f, 0.0f);
        this.flipAll();
    }
}

