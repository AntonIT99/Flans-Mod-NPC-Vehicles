//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelTurkRocket extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelTurkRocket() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[36];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 9, 33, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 9, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 9, 33, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 9, 33, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 9, 33, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 7, 7, 21, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[0].setRotationPoint(-3.5f, 3.0f, -10.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 7, 7, 21, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, -7.0f);
        this.bodyModel[1].setRotationPoint(-10.5f, 3.0f, -10.5f);
        this.bodyModel[2].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 35, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, -32.0f, -9.0f);
        this.bodyModel[3].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 35, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, -32.0f, 9.0f);
        this.bodyModel[4].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 35, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(-8.0f, -32.0f, -5.0f);
        this.bodyModel[5].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 35, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-8.0f, -32.0f, 5.0f);
        this.bodyModel[6].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 35, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(8.0f, -32.0f, 5.0f);
        this.bodyModel[7].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 35, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(8.0f, -32.0f, -5.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 7, 20, 21, 0.0f, -3.0f, 0.0f, -10.0f, -3.0f, 0.0f, -10.0f, -3.0f, 0.0f, -10.0f, -3.0f, 0.0f, -10.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[8].setRotationPoint(-3.5f, -52.0f, -10.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 7, 20, 21, 0.0f, 3.0f, 0.0f, -10.0f, -9.9f, 0.0f, -10.0f, -9.9f, 0.0f, -10.0f, 3.0f, 0.0f, -10.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[9].setRotationPoint(3.5f, -52.0f, -10.5f);
        this.bodyModel[10].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 16, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(0.0f, -16.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 3, 3, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 5, 3, 0.0f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[12].setRotationPoint(0.0f, -21.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-0.5f, 0.0f, 12.6f, 1, 14, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, -14.0f, 0.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 7, 20, 21, 0.0f, -9.9f, 0.0f, -10.0f, 3.0f, 0.0f, -10.0f, 3.0f, 0.0f, -10.0f, -9.9f, 0.0f, -10.0f, 1.0f, 0.0f, -7.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, -7.0f);
        this.bodyModel[14].setRotationPoint(-10.5f, -52.0f, -10.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 7, 7, 21, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[15].setRotationPoint(3.5f, 3.0f, -10.5f);
        this.bodyModel[16].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 5, 3, 0.0f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[16].setRotationPoint(0.0f, -21.0f, 0.0f);
        this.bodyModel[16].rotateAngleY = -2.1293018f;
        this.bodyModel[17].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 3, 3, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].rotateAngleY = -2.1293018f;
        this.bodyModel[18].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 16, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(0.0f, -16.0f, 0.0f);
        this.bodyModel[18].rotateAngleY = -2.1293018f;
        this.bodyModel[19].addShapeBox(-0.5f, 0.0f, 12.6f, 1, 14, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(0.0f, -14.0f, 0.0f);
        this.bodyModel[19].rotateAngleY = -2.1293018f;
        this.bodyModel[20].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 5, 3, 0.0f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[20].setRotationPoint(0.0f, -21.0f, 0.0f);
        this.bodyModel[20].rotateAngleY = 2.1293018f;
        this.bodyModel[21].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 3, 3, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].rotateAngleY = 2.1293018f;
        this.bodyModel[22].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 16, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(0.0f, -16.0f, 0.0f);
        this.bodyModel[22].rotateAngleY = 2.1293018f;
        this.bodyModel[23].addShapeBox(-0.5f, 0.0f, 12.6f, 1, 14, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(0.0f, -14.0f, 0.0f);
        this.bodyModel[23].rotateAngleY = 2.1293018f;
        this.bodyModel[24].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 5, 3, 0.0f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[24].setRotationPoint(0.0f, -21.0f, 0.0f);
        this.bodyModel[24].rotateAngleY = 1.012291f;
        this.bodyModel[25].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 3, 3, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].rotateAngleY = 1.012291f;
        this.bodyModel[26].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 16, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(0.0f, -16.0f, 0.0f);
        this.bodyModel[26].rotateAngleY = 1.012291f;
        this.bodyModel[27].addShapeBox(-0.5f, 0.0f, 12.6f, 1, 14, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(0.0f, -14.0f, 0.0f);
        this.bodyModel[27].rotateAngleY = 1.012291f;
        this.bodyModel[28].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 5, 3, 0.0f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[28].setRotationPoint(0.0f, -21.0f, 0.0f);
        this.bodyModel[28].rotateAngleY = -1.012291f;
        this.bodyModel[29].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 3, 3, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].rotateAngleY = -1.012291f;
        this.bodyModel[30].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 16, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(0.0f, -16.0f, 0.0f);
        this.bodyModel[30].rotateAngleY = -1.012291f;
        this.bodyModel[31].addShapeBox(-0.5f, 0.0f, 12.6f, 1, 14, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(0.0f, -14.0f, 0.0f);
        this.bodyModel[31].rotateAngleY = -1.012291f;
        this.bodyModel[32].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 5, 3, 0.0f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, -1.4f, 0.0f, -1.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[32].setRotationPoint(0.0f, -21.0f, 0.0f);
        this.bodyModel[32].rotateAngleY = -3.1415927f;
        this.bodyModel[33].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 3, 3, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].rotateAngleY = -3.1415927f;
        this.bodyModel[34].addShapeBox(-1.5f, 0.0f, 9.6f, 3, 16, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(0.0f, -16.0f, 0.0f);
        this.bodyModel[34].rotateAngleY = -3.1415927f;
        this.bodyModel[35].addShapeBox(-0.5f, 0.0f, 12.6f, 1, 14, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].setRotationPoint(0.0f, -14.0f, 0.0f);
        this.bodyModel[35].rotateAngleY = -3.1415927f;
    }
}
