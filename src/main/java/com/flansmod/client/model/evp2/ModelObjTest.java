/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 */
package com.flansmod.client.model.evp2;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelObjTest
extends ModelPlane {
    public ModelObjTest() {
        int textureX = 256;
        int textureY = 128;
        this.bodyModel = new ModelRendererTurbo[1];
        this.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.bodyModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013.obj");
        this.bodyModel[0].setRotationPoint(3.5f, 2.0f, 0.0f);
        this.translateAll(-3.5f, -1.8f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (ModelRendererTurbo mrt : this.bodyModel) {
            mrt.render(1.0f);
        }
    }
}

