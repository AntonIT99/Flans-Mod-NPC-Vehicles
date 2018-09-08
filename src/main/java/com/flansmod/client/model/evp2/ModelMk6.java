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

public class ModelMk6
extends ModelGun {
    public ModelMk6() {
        this.gunModel = new ModelRendererTurbo[12];
        this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 2, 1, 1, 0.0f, -1.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.gunModel[0].setRotationPoint(-3.0f, 0.0f, 0.0f);
        this.gunModel[1] = new ModelRendererTurbo(this, 20, 5, 128, 64);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -0.5f, 2, 2, 1, 0.0f, -0.5f, 0.0f, 0.2f, 0.3f, 0.0f, 0.2f, 0.3f, 0.0f, 0.2f, -0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.gunModel[1].setRotationPoint(-4.0f, 2.0f, 0.0f);
        this.gunModel[2] = new ModelRendererTurbo(this, 6, 7, 128, 64);
        this.gunModel[2].addBox(0.0f, 0.0f, -0.5f, 5, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(-2.0f, 0.0f, 0.0f);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 0, 128, 64);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.5f, 2, 2, 1, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f);
        this.gunModel[3].setRotationPoint(-2.0f, -2.3f, 0.0f);
        this.gunModel[4] = new ModelRendererTurbo(this, 33, 0, 128, 64);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, -0.7f, 0.0f, 0.2f, -0.7f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f);
        this.gunModel[4].setRotationPoint(-3.0f, 1.0f, 0.0f);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 4, 128, 64);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, -0.8f, 0.0f, -0.3f, -0.8f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.5f, -0.3f, -0.8f, 0.5f, -0.3f, -0.8f, 0.5f, -0.3f, 0.0f, 0.5f, -0.3f);
        this.gunModel[5].setRotationPoint(1.5f, 1.0f, 0.0f);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 7, 128, 64);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, -0.8f, 0.0f, -0.3f, -0.8f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.5f, -0.3f, -0.8f, 0.5f, -0.3f, -0.8f, 0.5f, -0.3f, 0.0f, 0.5f, -0.3f);
        this.gunModel[6].setRotationPoint(-0.5f, 1.0f, 0.0f);
        this.gunModel[7] = new ModelRendererTurbo(this, 8, 4, 128, 64);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.2f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f, -0.2f, -0.8f, -0.3f);
        this.gunModel[7].setRotationPoint(-0.5f, 2.5f, 0.0f);
        this.gunModel[8] = new ModelRendererTurbo(this, 8, 0, 128, 64);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, -0.5f, 1, 2, 1, 0.0f, 0.0f, -0.2f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.2f, -0.3f, -0.7f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f);
        this.gunModel[8].setRotationPoint(-2.0f, -2.0f, 0.0f);
        this.gunModel[9] = new ModelRendererTurbo(this, 40, 12, 128, 64);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.7f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, -0.7f, 0.0f, 0.1f, -0.7f, -0.7f, 0.1f, 0.0f, -0.7f, 0.1f, 0.0f, -0.7f, 0.1f, -0.7f, -0.7f, 0.1f);
        this.gunModel[9].setRotationPoint(-1.3f, -2.4f, 0.0f);
        this.gunModel[10] = new ModelRendererTurbo(this, 46, 12, 128, 64);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.7f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.4f, -0.7f, 0.0f, -0.4f, -0.7f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -0.4f, -0.7f, -0.8f, -0.4f);
        this.gunModel[10].setRotationPoint(-1.3f, -2.6f, 0.0f);
        this.gunModel[11] = new ModelRendererTurbo(this, 46, 12, 128, 64);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, -1.0f, 1, 1, 1, 0.0f, -0.7f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.1f, -0.7f, 0.0f, -0.1f, -0.7f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, 0.0f, -0.7f, -0.8f, 0.0f);
        this.gunModel[11].setRotationPoint(-1.3f, -2.6f, 0.0f);
        this.breakActionModel = new ModelRendererTurbo[23];
        this.breakActionModel[0] = new ModelRendererTurbo(this, 16, 0, 128, 64);
        this.breakActionModel[0].addShapeBox(2.0f, -1.6f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f);
        this.breakActionModel[1] = new ModelRendererTurbo(this, 0, 10, 128, 64);
        this.breakActionModel[1].addShapeBox(0.0f, -2.3f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f);
        this.breakActionModel[2] = new ModelRendererTurbo(this, 10, 10, 128, 64);
        this.breakActionModel[2].addShapeBox(2.0f, -1.9f, -0.5f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f);
        this.breakActionModel[3] = new ModelRendererTurbo(this, 0, 13, 128, 64);
        this.breakActionModel[3].addShapeBox(2.0f, -1.5f, -0.5f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f);
        this.breakActionModel[4] = new ModelRendererTurbo(this, 0, 16, 128, 64);
        this.breakActionModel[4].addShapeBox(3.0f, -2.2f, -0.5f, 6, 1, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f);
        this.breakActionModel[5] = new ModelRendererTurbo(this, 28, 4, 128, 64);
        this.breakActionModel[5].addShapeBox(2.0f, -2.3f, -0.5f, 1, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, -0.5f, 0.0f, 0.0f, -0.5f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, -0.5f, -0.6f, 0.0f);
        this.breakActionModel[6] = new ModelRendererTurbo(this, 41, 0, 128, 64);
        this.breakActionModel[6].addShapeBox(0.0f, -2.0f, -1.0f, 2, 2, 2, 0.0f, -0.1f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f);
        this.breakActionModel[7] = new ModelRendererTurbo(this, 30, 8, 128, 64);
        this.breakActionModel[7].addShapeBox(3.0f, -1.6f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.1f, 0.5f, 0.0f, -0.1f, 0.5f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, 0.0f, -0.1f);
        this.breakActionModel[8] = new ModelRendererTurbo(this, 30, 12, 128, 64);
        this.breakActionModel[8].addShapeBox(2.0f, -1.1f, -1.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -0.6f, 0.0f, -0.8f, -0.6f, 0.0f, -0.8f, 0.0f);
        this.breakActionModel[9] = new ModelRendererTurbo(this, 50, 0, 128, 64);
        this.breakActionModel[9].addShapeBox(0.0f, -2.0f, 0.7f, 2, 2, 1, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, -0.7f, -0.1f, -0.3f, -0.7f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, -0.7f, -0.1f, -0.3f, -0.7f);
        this.breakActionModel[10] = new ModelRendererTurbo(this, 50, 5, 128, 64);
        this.breakActionModel[10].addShapeBox(0.0f, -2.0f, -1.7f, 2, 2, 1, 0.0f, -0.1f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        this.breakActionModel[11] = new ModelRendererTurbo(this, 35, 5, 128, 64);
        this.breakActionModel[11].addShapeBox(0.0f, -1.2f, -0.5f, 3, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f);
        this.breakActionModel[12] = new ModelRendererTurbo(this, 28, 4, 128, 64);
        this.breakActionModel[12].addShapeBox(2.0f, -2.3f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.5f, -0.6f, 0.0f, -0.5f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f);
        this.breakActionModel[13] = new ModelRendererTurbo(this, 40, 8, 128, 64);
        this.breakActionModel[13].addShapeBox(7.0f, -2.5f, -0.5f, 2, 1, 1, 0.0f, -0.3f, 0.0f, -0.4f, -0.5f, 0.0f, -0.4f, -0.5f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, 0.0f, -0.7f, -0.4f, 0.0f, -0.7f, -0.4f, 0.0f, -0.7f, -0.4f, 0.0f, -0.7f, -0.4f);
        this.breakActionModel[14] = new ModelRendererTurbo(this, 48, 9, 128, 64);
        this.breakActionModel[14].addShapeBox(7.0f, -2.8f, -0.5f, 2, 1, 1, 0.0f, -0.3f, 0.0f, -0.45f, -0.8f, 0.0f, -0.45f, -0.8f, 0.0f, -0.45f, -0.3f, 0.0f, -0.45f, -0.3f, -0.7f, -0.45f, -0.5f, -0.7f, -0.45f, -0.5f, -0.7f, -0.45f, -0.3f, -0.7f, -0.45f);
        this.breakActionModel[15] = new ModelRendererTurbo(this, 20, 13, 128, 64);
        this.breakActionModel[15].addShapeBox(-1.0f, -2.3f, -0.5f, 1, 1, 1, 0.0f, -0.7f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f, -0.7f, -0.7f, -0.3f);
        this.breakActionModel[16] = new ModelRendererTurbo(this, 0, 19, 128, 64);
        this.breakActionModel[16].addShapeBox(0.0f, -2.3f, -0.5f, 2, 1, 1, 0.0f, -0.09f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, -0.09f, -0.5f, -0.25f, -0.09f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, -0.09f, 0.0f, -0.25f);
        this.breakActionModel[17] = new ModelRendererTurbo(this, 0, 19, 128, 64);
        this.breakActionModel[17].addShapeBox(0.0f, -0.7f, -0.5f, 2, 1, 1, 0.0f, -0.09f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, -0.09f, 0.0f, -0.25f, -0.09f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, -0.09f, -0.5f, -0.25f);
        this.breakActionModel[18] = new ModelRendererTurbo(this, 0, 19, 128, 64);
        this.breakActionModel[18].addShapeBox(0.0f, -1.8f, -1.35f, 2, 1, 1, 0.0f, -0.09f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, -0.09f, -0.5f, -0.25f, -0.09f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, -0.09f, 0.0f, -0.25f);
        this.breakActionModel[18].rotateAngleX = -1.047198f;
        this.breakActionModel[19] = new ModelRendererTurbo(this, 0, 19, 128, 64);
        this.breakActionModel[19].addShapeBox(0.0f, -1.8f, 0.35f, 2, 1, 1, 0.0f, -0.09f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, -0.09f, -0.5f, -0.25f, -0.09f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, -0.09f, 0.0f, -0.25f);
        this.breakActionModel[19].rotateAngleX = 1.047198f;
        this.breakActionModel[20] = new ModelRendererTurbo(this, 0, 19, 128, 64);
        this.breakActionModel[20].addShapeBox(0.0f, -0.8f, -1.35f, 2, 1, 1, 0.0f, -0.09f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, -0.09f, -0.5f, -0.25f, -0.09f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, -0.09f, 0.0f, -0.25f);
        this.breakActionModel[20].rotateAngleX = -2.094395f;
        this.breakActionModel[21] = new ModelRendererTurbo(this, 0, 19, 128, 64);
        this.breakActionModel[21].addShapeBox(0.0f, -0.8f, 0.35f, 2, 1, 1, 0.0f, -0.09f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, -0.09f, -0.5f, -0.25f, -0.09f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, -0.09f, 0.0f, -0.25f);
        this.breakActionModel[21].rotateAngleX = 2.094395f;
        this.breakActionModel[22] = new ModelRendererTurbo(this, 7, 19, 128, 64);
        this.breakActionModel[22].addShapeBox(8.0f, -1.9f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, 0.01f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, 0.01f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f);
        this.ammoModel = new ModelRendererTurbo[6];
        this.ammoModel[0] = new ModelRendererTurbo(this, 20, 16, 128, 64);
        this.ammoModel[0].addShapeBox(0.0f, -2.3f, -0.5f, 2, 1, 1, 0.0f, 0.0f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.ammoModel[1] = new ModelRendererTurbo(this, 20, 16, 128, 64);
        this.ammoModel[1].addShapeBox(0.0f, -0.7f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f);
        this.ammoModel[2] = new ModelRendererTurbo(this, 20, 16, 128, 64);
        this.ammoModel[2].addShapeBox(0.0f, -1.8f, -1.35f, 2, 1, 1, 0.0f, 0.0f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.ammoModel[2].rotateAngleX = -1.047198f;
        this.ammoModel[3] = new ModelRendererTurbo(this, 20, 16, 128, 64);
        this.ammoModel[3].addShapeBox(0.0f, -1.8f, 0.35f, 2, 1, 1, 0.0f, 0.0f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.ammoModel[3].rotateAngleX = 1.047198f;
        this.ammoModel[4] = new ModelRendererTurbo(this, 20, 16, 128, 64);
        this.ammoModel[4].addShapeBox(0.0f, -0.8f, -1.35f, 2, 1, 1, 0.0f, 0.0f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.ammoModel[4].rotateAngleX = -2.094395f;
        this.ammoModel[5] = new ModelRendererTurbo(this, 20, 16, 128, 64);
        this.ammoModel[5].addShapeBox(0.0f, -0.8f, 0.35f, 2, 1, 1, 0.0f, 0.0f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, -0.3f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.ammoModel[5].rotateAngleX = 2.094395f;
        this.barrelAttachPoint = new Vector3f(0.1875f, 0.0625f, 0.0f);
        this.barrelBreakPoint = new Vector3f(0.125f, 0.09375f, 0.0f);
        this.gunSlideDistance = 0.45f;
        this.animationType = EnumAnimationType.BREAK_ACTION;
        this.translateAll(0.0f, -4.0f, 0.0f);
        this.flipAll();
    }
}

