/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 */
package com.flansmod.client.model.evp2;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelSturmshell
extends ModelBullet {
    public ModelRendererTurbo[] bulletModel = new ModelRendererTurbo[10];
    int textureX = 64;
    int textureY = 64;

    public ModelSturmshell() {
        this.bulletModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bulletModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.bulletModel[2] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.bulletModel[3] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.bulletModel[4] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.bulletModel[5] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.bulletModel[6] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.bulletModel[7] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.bulletModel[8] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.bulletModel[9] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.bulletModel[0].addBox(-6.0f, -1.5f, -2.5f, 7, 3, 5, 0.0f);
        this.bulletModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[1].addShapeBox(-6.0f, -2.5f, -2.5f, 7, 1, 5, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bulletModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[2].addShapeBox(-6.0f, 1.5f, -2.5f, 7, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bulletModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[3].addBox(1.0f, -1.5f, -2.5f, 3, 3, 5, 0.0f);
        this.bulletModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[4].addShapeBox(1.0f, -2.5f, -2.5f, 3, 1, 5, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bulletModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[5].addShapeBox(1.0f, 1.5f, -2.5f, 3, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bulletModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[6].addShapeBox(4.0f, -1.5f, -2.5f, 3, 3, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bulletModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[7].addShapeBox(4.0f, -2.5f, -2.5f, 3, 1, 5, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bulletModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[8].addShapeBox(4.0f, 1.5f, -2.5f, 3, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bulletModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bulletModel[9].addShapeBox(5.5f, -1.0f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bulletModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        for (int i = 0; i < 10; ++i) {
            this.bulletModel[i].rotateAngleZ = 1.5707964f;
        }
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (ModelRendererTurbo mrt : this.bulletModel) {
            mrt.render(f5);
        }
    }
}

