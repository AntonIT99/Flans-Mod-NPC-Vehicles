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

public class ModelC96
extends ModelGun {
    public ModelC96() {
        this.gunModel = new ModelRendererTurbo[26];
        this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        this.gunModel[0].addShapeBox(-2.0f, 0.0f, -0.5f, 2, 3, 1, 0.0f, -0.2f, -0.4f, 0.1f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f, -0.2f, -0.4f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.gunModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[0].rotateAngleZ = -0.2094395f;
        this.gunModel[1] = new ModelRendererTurbo(this, 20, 5, 128, 64);
        this.gunModel[1].addBox(0.0f, 0.0f, -0.5f, 3, 2, 1, 0.0f);
        this.gunModel[1].setRotationPoint(-2.0f, -2.0f, 0.0f);
        this.gunModel[2] = new ModelRendererTurbo(this, 15, 0, 128, 64);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -0.5f, 2, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[2].setRotationPoint(1.0f, -2.0f, 0.0f);
        this.gunModel[3] = new ModelRendererTurbo(this, 30, 0, 128, 64);
        this.gunModel[3].addShapeBox(-2.0f, 3.0f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, 0.1f);
        this.gunModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[3].rotateAngleZ = -0.2094395f;
        this.gunModel[4] = new ModelRendererTurbo(this, 45, 0, 128, 64);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -0.5f, 3, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].setRotationPoint(3.0f, -2.0f, 0.0f);
        this.gunModel[5] = new ModelRendererTurbo(this, 60, 0, 128, 64);
        this.gunModel[5].addBox(0.0f, 0.0f, -0.5f, 4, 2, 1, 0.0f);
        this.gunModel[5].setRotationPoint(-1.0f, -3.5f, 0.0f);
        this.gunModel[6] = new ModelRendererTurbo(this, 60, 5, 128, 64);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, -0.8f, 0.0f, -0.7f, -0.8f);
        this.gunModel[6].setRotationPoint(3.0f, -3.3f, 0.4f);
        this.gunModel[7] = new ModelRendererTurbo(this, 60, 5, 128, 64);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, -1.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, -0.8f, 0.0f, -0.7f, -0.8f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f);
        this.gunModel[7].setRotationPoint(3.0f, -3.3f, -0.4f);
        this.gunModel[8] = new ModelRendererTurbo(this, 75, 5, 128, 64);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f);
        this.gunModel[8].setRotationPoint(4.0f, -3.0f, 0.4f);
        this.gunModel[9] = new ModelRendererTurbo(this, 75, 5, 128, 64);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, -1.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.8f, -0.5f, 0.0f, -0.8f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -0.5f, 0.0f, -0.8f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].setRotationPoint(4.0f, -3.0f, -0.4f);
        this.gunModel[10] = new ModelRendererTurbo(this, 80, 0, 128, 64);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f);
        this.gunModel[10].setRotationPoint(5.5f, -3.2f, 0.0f);
        this.gunModel[11] = new ModelRendererTurbo(this, 35, 5, 128, 64);
        this.gunModel[11].addBox(0.0f, 0.0f, -0.5f, 5, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(6.5f, -3.1f, 0.0f);
        this.gunModel[12] = new ModelRendererTurbo(this, 25, 10, 128, 64);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f);
        this.gunModel[12].setRotationPoint(10.0f, -3.4f, 0.0f);
        this.gunModel[13] = new ModelRendererTurbo(this, 35, 10, 128, 64);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.gunModel[13].setRotationPoint(10.0f, -4.4f, 0.0f);
        this.gunModel[14] = new ModelRendererTurbo(this, 90, 0, 128, 64);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f);
        this.gunModel[14].setRotationPoint(1.0f, 0.8f, 0.0f);
        this.gunModel[15] = new ModelRendererTurbo(this, 100, 0, 128, 64);
        this.gunModel[15].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, -0.8f, 0.0f, -0.3f, -0.8f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, -0.8f, 0.0f, -0.3f, -0.8f, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f);
        this.gunModel[15].setRotationPoint(0.8f, 0.0f, 0.0f);
        this.gunModel[16] = new ModelRendererTurbo(this, 90, 5, 128, 64);
        this.gunModel[16].addShapeBox(-1.0f, -1.4f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.gunModel[16].setRotationPoint(-1.5f, -2.0f, 0.0f);
        this.gunModel[16].rotateAngleZ = 1.466077f;
        this.gunModel[17] = new ModelRendererTurbo(this, 0, 12, 128, 64);
        this.gunModel[17].addShapeBox(0.0f, -0.2f, -0.5f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.2f, -0.5f, 0.0f, 0.2f, -0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.6f, 0.2f, -0.5f, -0.6f, 0.2f, -0.5f, -0.6f, 0.2f, 0.0f, -0.6f, 0.2f);
        this.gunModel[17].setRotationPoint(-1.0f, -2.0f, 0.0f);
        this.gunModel[18] = new ModelRendererTurbo(this, 0, 5, 128, 64);
        this.gunModel[18].addShapeBox(0.2f, -0.4f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[18].setRotationPoint(-1.0f, -3.5f, 0.0f);
        this.gunModel[18].rotateAngleZ = 0.1745329f;
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 5, 128, 64);
        this.gunModel[19].addShapeBox(0.2f, -0.6f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.1f, -0.8f, 0.0f, -0.1f, -0.8f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.8f, 0.0f, -0.8f, -0.8f, 0.0f, -0.8f, -0.8f, -0.5f, 0.0f, -0.8f, -0.5f);
        this.gunModel[19].setRotationPoint(-1.0f, -3.5f, 0.0f);
        this.gunModel[19].rotateAngleZ = 0.1745329f;
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 5, 128, 64);
        this.gunModel[20].addShapeBox(0.2f, -0.6f, -1.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.5f, -0.8f, 0.0f, -0.5f, -0.8f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, -0.8f, -0.5f, -0.8f, -0.8f, -0.5f, -0.8f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.gunModel[20].setRotationPoint(-1.0f, -3.5f, 0.0f);
        this.gunModel[20].rotateAngleZ = 0.1745329f;
        this.gunModel[21] = new ModelRendererTurbo(this, 5, 5, 128, 64);
        this.gunModel[21].addShapeBox(0.0f, -0.2f, -0.5f, 3, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.gunModel[21].setRotationPoint(-0.5f, -3.5f, 0.0f);
        this.gunModel[22] = new ModelRendererTurbo(this, 15, 5, 128, 64);
        this.gunModel[22].addShapeBox(0.0f, -0.3f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, -0.5f, -0.7f, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f);
        this.gunModel[22].setRotationPoint(2.5f, -3.5f, 0.0f);
        this.gunModel[23] = new ModelRendererTurbo(this, 8, 0, 128, 64);
        this.gunModel[23].addShapeBox(0.3f, -0.3f, -0.5f, 1, 1, 1, 0.0f, -0.1f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, -0.7f, 0.1f, 0.0f, -0.7f, 0.1f, 0.0f, -0.7f, 0.1f, -0.1f, -0.7f, 0.1f);
        this.gunModel[23].setRotationPoint(-1.0f, -3.5f, 0.0f);
        this.gunModel[24] = new ModelRendererTurbo(this, 23, 0, 128, 64);
        this.gunModel[24].addShapeBox(-0.5f, -0.5f, -0.2f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, -0.8f, 0.0f, -0.5f, -0.8f);
        this.gunModel[24].setRotationPoint(2.5f, -3.5f, 0.5f);
        this.gunModel[25] = new ModelRendererTurbo(this, 23, 0, 128, 64);
        this.gunModel[25].addShapeBox(-0.5f, -0.5f, -0.8f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.8f, -0.5f, 0.0f, -0.8f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.8f, -0.5f, -0.5f, -0.8f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[25].setRotationPoint(2.5f, -3.5f, -0.5f);
        this.slideModel = new ModelRendererTurbo[2];
        this.slideModel[0] = new ModelRendererTurbo(this, 0, 8, 128, 64);
        this.slideModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 7, 1, 1, 0.0f, 0.0f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f);
        this.slideModel[0].setRotationPoint(-1.0f, -3.1f, 0.0f);
        this.slideModel[1] = new ModelRendererTurbo(this, 0, 16, 128, 64);
        this.slideModel[1].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.slideModel[1].setRotationPoint(-1.5f, -3.1f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[2];
        this.ammoModel[0] = new ModelRendererTurbo(this, 6, 16, 128, 64);
        this.ammoModel[0].addShapeBox(0.0f, 4.0f, -0.5f, 1, 4, 1, 0.0f, -0.1f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.5f, -0.2f, -0.1f, -0.5f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f);
        this.ammoModel[0].setRotationPoint(3.0f, -7.0f, 0.0f);
        this.ammoModel[1] = new ModelRendererTurbo(this, 15, 16, 128, 64);
        this.ammoModel[1].addShapeBox(0.0f, 4.0f, -0.5f, 2, 4, 1, 0.0f, 0.0f, -0.2f, -0.3f, -0.1f, -0.2f, -0.3f, -0.1f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.1f, -0.2f, -0.3f, -0.1f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f);
        this.ammoModel[1].setRotationPoint(3.5f, -7.0f, 0.0f);
        this.animationType = EnumAnimationType.RIFLE_TOP;
        this.numBulletsInReloadAnimation = 1.0f;
        this.tiltGunTime = 0.279f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.6f;
        this.untiltGunTime = 0.163f;
        this.translateAll(0.0f, -2.2f, 0.0f);
        this.flipAll();
    }
}

