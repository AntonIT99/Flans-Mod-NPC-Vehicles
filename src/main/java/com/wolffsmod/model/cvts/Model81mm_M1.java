//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class Model81mm_M1 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public Model81mm_M1() {
        this.textureX = 128;
        this.textureY = 128;
        (this.turretModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 30, 0, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 0, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 50, 0, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase)this, 60, 0, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo((ModelBase)this, 60, 0, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo((ModelBase)this, 70, 0, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo((ModelBase)this, 70, 0, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo((ModelBase)this, 80, 0, this.textureX, this.textureY);
        this.turretModel[9] = new ModelRendererTurbo((ModelBase)this, 80, 0, this.textureX, this.textureY);
        this.turretModel[0].addBox(-3.5f, 1.0f, -4.0f, 5, 1, 8, 0.0f);
        this.turretModel[0].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[1].addBox(-0.5f, 0.0f, -0.5f, 1, 1, 1, 0.0f);
        this.turretModel[1].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[2].addShapeBox(12.7f, -3.3f, -1.5f, 1, 2, 3, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.turretModel[2].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[2].rotateAngleZ = 0.27925268f;
        this.turretModel[3].addShapeBox(12.6f, -1.8f, -0.5f, 1, 7, 1, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.turretModel[3].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[3].rotateAngleZ = 0.2617994f;
        this.turretModel[4].addShapeBox(12.6f, -1.8f, -2.9f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.turretModel[4].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[4].rotateAngleX = -0.61086524f;
        this.turretModel[4].rotateAngleZ = 0.2617994f;
        this.turretModel[5].addShapeBox(12.6f, -1.8f, 1.9f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.turretModel[5].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[5].rotateAngleX = 0.61086524f;
        this.turretModel[5].rotateAngleZ = 0.2617994f;
        this.turretModel[6].addShapeBox(12.8f, 1.9f, 5.0f, 2, 0, 2, 0.0f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f);
        this.turretModel[6].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[7].addShapeBox(12.8f, 1.9f, -7.0f, 2, 0, 2, 0.0f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f, -0.1f, 0.1f, -0.1f);
        this.turretModel[7].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[8].addShapeBox(13.3f, 0.9f, 5.5f, 1, 1, 1, 0.0f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[8].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.turretModel[9].addShapeBox(13.3f, 0.9f, -6.5f, 1, 1, 1, 0.0f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[9].setRotationPoint(1.0f, 8.0f, 0.0f);
        (this.barrelModel = new ModelRendererTurbo[21])[0] = new ModelRendererTurbo((ModelBase)this, 0, 50, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 50, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 50, 50, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 60, 50, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 80, 50, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase)this, 100, 50, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase)this, 100, 50, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 50, this.textureX, this.textureY);
        this.barrelModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 50, this.textureX, this.textureY);
        this.barrelModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 60, this.textureX, this.textureY);
        this.barrelModel[0].addShapeBox(0.0f, -1.0f, 0.0f, 19, 2, 1, 0.0f, 0.0f, -0.585f, -0.75f, 0.0f, -0.585f, -0.75f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, -0.75f, 0.0f, -0.585f, -0.75f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f);
        this.barrelModel[0].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[1].addShapeBox(0.0f, -1.0f, -1.0f, 19, 2, 1, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, -0.75f, 0.0f, -0.585f, -0.75f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, -0.75f, 0.0f, -0.585f, -0.75f);
        this.barrelModel[1].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[2].addShapeBox(0.0f, -1.0f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f);
        this.barrelModel[2].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[3].addShapeBox(0.0f, 0.0f, -1.0f, 19, 1, 2, 0.0f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f);
        this.barrelModel[3].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[4].addShapeBox(12.5f, 0.9f, -1.5f, 1, 1, 3, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[4].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[5].addShapeBox(12.5f, 1.8f, -2.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[5].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[6].addShapeBox(12.5f, 2.8f, -3.0f, 1, 1, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[6].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[7].addShapeBox(12.0f, 2.3f, -4.0f, 2, 2, 1, 0.0f, 0.0f, 0.0f, -0.375f, 0.0f, 0.0f, -0.375f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.375f, 0.0f, 0.0f, -0.375f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[7].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[8].addShapeBox(12.0f, 2.3f, 3.0f, 2, 2, 1, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f);
        this.barrelModel[8].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[9].addShapeBox(0.0f, -1.0f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f);
        this.barrelModel[9].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[9].rotateAngleX = -0.7853982f;
        this.barrelModel[10].addShapeBox(0.0f, -1.0f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f);
        this.barrelModel[10].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[10].rotateAngleX = 0.7853982f;
        this.barrelModel[11].addShapeBox(0.0f, -1.0f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f);
        this.barrelModel[11].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[11].rotateAngleX = -2.3561945f;
        this.barrelModel[12].addShapeBox(0.0f, -1.0f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, 0.0f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f, 0.0f, -0.75f, -0.585f);
        this.barrelModel[12].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[12].rotateAngleX = -3.9269907f;
        this.barrelModel[13].addShapeBox(0.0f, -1.25f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, 0.0f, 0.0f, -0.48f, 0.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, 0.0f, 0.25f, -0.585f);
        this.barrelModel[13].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[14].addShapeBox(0.0f, -1.25f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, 0.0f, 0.0f, -0.48f, 0.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, 0.0f, 0.25f, -0.585f);
        this.barrelModel[14].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[14].rotateAngleX = -0.7853982f;
        this.barrelModel[15].addShapeBox(0.0f, -1.0f, 0.25f, 19, 2, 1, 0.0f, 0.0f, -0.585f, 0.25f, -17.0f, -0.585f, 0.25f, -17.0f, -0.48f, 0.0f, 0.0f, -0.48f, 0.0f, 0.0f, -0.585f, 0.25f, -17.0f, -0.585f, 0.25f, -17.0f, -0.48f, 0.0f, 0.0f, -0.48f, 0.0f);
        this.barrelModel[15].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[16].addShapeBox(0.0f, -1.25f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, 0.0f, 0.0f, -0.48f, 0.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, 0.0f, 0.25f, -0.585f);
        this.barrelModel[16].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[16].rotateAngleX = -2.3561945f;
        this.barrelModel[17].addShapeBox(0.0f, 0.25f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, 0.0f, 0.25f, -0.585f, 0.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, 0.0f, 0.0f, -0.48f);
        this.barrelModel[17].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[18].addShapeBox(0.0f, -1.25f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, 0.0f, 0.0f, -0.48f, 0.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, 0.0f, 0.25f, -0.585f);
        this.barrelModel[18].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[18].rotateAngleX = -3.9269907f;
        this.barrelModel[19].addShapeBox(0.0f, -1.0f, -1.25f, 19, 2, 1, 0.0f, 0.0f, -0.48f, 0.0f, -17.0f, -0.48f, 0.0f, -17.0f, -0.585f, 0.25f, 0.0f, -0.585f, 0.25f, 0.0f, -0.48f, 0.0f, -17.0f, -0.48f, 0.0f, -17.0f, -0.585f, 0.25f, 0.0f, -0.585f, 0.25f);
        this.barrelModel[19].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[20].addShapeBox(0.0f, -1.25f, -1.0f, 19, 1, 2, 0.0f, 0.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, -17.0f, 0.0f, -0.48f, 0.0f, 0.0f, -0.48f, 0.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, -17.0f, 0.25f, -0.585f, 0.0f, 0.25f, -0.585f);
        this.barrelModel[20].setRotationPoint(1.0f, 8.0f, 0.0f);
        this.barrelModel[20].rotateAngleX = 0.7853982f;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
