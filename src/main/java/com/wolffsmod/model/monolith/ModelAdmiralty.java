//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelAdmiralty extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelAdmiralty() {
        this.textureX = 512;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[69];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 401, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 265, 17, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 273, 17, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 449, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 401, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 281, 17, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 337, 17, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 449, 17, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 145, 25, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 177, 25, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 217, 25, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 153, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 257, 9, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 369, 9, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 401, 9, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 449, 9, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 281, 17, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 497, 17, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 393, 25, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 321, 17, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 201, 25, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 321, 25, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 337, 17, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 489, 17, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 177, 25, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 409, 25, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 417, 25, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 417, 33, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 145, 41, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 273, 41, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 297, 41, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 321, 41, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 345, 41, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 161, 17, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 177, 9, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 273, 9, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase)this, 505, 9, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase)this, 377, 17, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo((ModelBase)this, 457, 17, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo((ModelBase)this, 137, 25, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo((ModelBase)this, 257, 25, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo((ModelBase)this, 281, 25, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo((ModelBase)this, 329, 17, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo((ModelBase)this, 449, 25, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo((ModelBase)this, 369, 41, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo((ModelBase)this, 289, 25, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 14, 0.0f, 35.0f, 0.2f, 0.0f, 35.0f, 0.0f, 0.0f, 35.0f, 0.0f, 0.0f, 35.0f, 0.2f, 0.0f, 35.0f, 0.0f, 0.0f, 35.0f, 0.0f, 0.0f, 35.0f, 0.0f, 0.0f, 35.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-8.0f, -1.0f, -7.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 43, 5, 14, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, 0.5f, -4.5f, 0.0f, 0.5f, -4.5f, -0.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -4.5f, 0.0f, -1.0f, -4.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(36.0f, -6.0f, -7.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 33, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -3.5f, 0.0f, 1.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(36.0f, -1.0f, -7.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 42, 1, 14, 0.0f, -0.5f, 0.0f, -0.5f, -22.0f, 0.5f, -1.5f, -22.0f, 0.5f, -1.5f, -0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, -1.5f, -4.5f, 0.0f, -1.5f, -4.5f, 0.5f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(37.0f, -6.0f, -7.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 13, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(25.0f, -13.5f, -2.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 15, 4, 12, 0.0f, -1.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -4.0f, 0.0f, 0.0f, -5.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[5].setRotationPoint(-78.0f, 0.0f, -6.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 12, 0.0f, 0.5f, 0.5f, -4.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.5f, 0.5f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[6].setRotationPoint(-77.0f, -1.0f, -6.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 33, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[7].setRotationPoint(34.0f, -35.0f, -0.5f);
        this.bodyModel[7].rotateAngleZ = 0.08726646f;
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 17, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[8].setRotationPoint(-46.0f, -17.0f, -0.5f);
        this.bodyModel[8].rotateAngleZ = 0.12217305f;
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 6, 0.0f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f);
        this.bodyModel[9].setRotationPoint(-46.0f, -16.0f, -3.0f);
        this.bodyModel[10].addShapeBox(4.5f, -0.7f, -1.5f, 3, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[10].setRotationPoint(-17.0f, -4.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-5.5f, -0.7f, -1.5f, 10, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[11].setRotationPoint(-17.0f, -4.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(-19.5f, -2.5f, -1.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(-59.5f, -4.0f, -0.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f);
        this.bodyModel[14].setRotationPoint(-60.5f, -4.0f, -0.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[15].setRotationPoint(-65.0f, -4.0f, -0.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.bodyModel[16].setRotationPoint(40.5f, -7.9f, -5.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(39.5f, -7.5f, -5.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f);
        this.bodyModel[18].setRotationPoint(38.5f, -7.5f, -5.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 11, 5, 14, 0.0f, 4.5f, 0.0f, -1.0f, 4.5f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 4.5f, 0.0f, -1.0f, 4.5f, -1.5f, -3.0f, -0.5f, 0.5f, -2.0f, -0.5f, 0.5f, -2.0f, 4.5f, -1.5f, -3.0f);
        this.bodyModel[19].setRotationPoint(-58.5f, 3.0f, -7.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 12, 5, 12, 0.0f, 2.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, -1.0f, -5.0f, -4.0f, -2.8f, -4.0f, 0.0f, -1.5f, -2.0f, 0.0f, -1.5f, -2.0f, -4.0f, -2.8f, -4.0f);
        this.bodyModel[20].setRotationPoint(-75.0f, 3.0f, -6.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 33, 5, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[21].setRotationPoint(36.0f, 3.0f, -7.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 9, 5, 14, 0.0f, 35.0f, 0.0f, 0.0f, 35.0f, 0.0f, 0.0f, 35.0f, 0.0f, 0.0f, 35.0f, 0.0f, 0.0f, 40.0f, 0.5f, -2.0f, 35.0f, 0.0f, -2.0f, 35.0f, 0.0f, -2.0f, 40.0f, 0.5f, -2.0f);
        this.bodyModel[22].setRotationPoint(-8.0f, 3.0f, -7.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 10, 6, 12, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -3.0f, 0.0f, -1.0f, -3.5f, -2.0f, -2.5f, -5.5f, -2.0f, -2.5f, -5.5f, 0.0f, -1.0f, -3.5f);
        this.bodyModel[23].setRotationPoint(69.0f, 3.0f, -6.0f);
        this.bodyModel[24].addShapeBox(-10.5f, -3.5f, 0.0f, 14, 13, 1, 0.0f, -3.35f, -4.0f, -0.45f, -3.35f, -4.0f, -0.45f, -3.35f, -4.0f, -0.45f, -3.35f, -4.0f, -0.45f, -3.35f, -4.0f, -0.45f, -3.35f, -4.0f, -0.45f, -3.35f, -4.0f, -0.45f, -3.35f, -4.0f, -0.45f);
        this.bodyModel[24].setRotationPoint(-78.8f, -10.0f, -0.5f);
        this.bodyModel[24].rotateAngleZ = 0.17453294f;
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 14, 0.0f, 8.0f, 0.4f, -1.0f, 8.0f, 0.2f, 0.0f, 8.0f, 0.2f, 0.0f, 8.0f, 0.4f, -1.0f, 8.0f, 0.0f, -1.0f, 8.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f, 8.0f, 0.0f, -1.0f);
        this.bodyModel[25].setRotationPoint(-55.0f, -1.0f, -7.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 10, 5, 12, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -3.0f);
        this.bodyModel[26].setRotationPoint(69.0f, -2.0f, -6.0f);
        this.bodyModel[27].addShapeBox(-5.5f, -0.7f, 0.5f, 10, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[27].setRotationPoint(-17.0f, -4.0f, 0.0f);
        this.bodyModel[28].addShapeBox(4.5f, -0.7f, 0.5f, 3, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[28].setRotationPoint(-17.0f, -4.0f, 0.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(-18.5f, -3.5f, -0.5f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.bodyModel[30].setRotationPoint(40.5f, -7.9f, 4.5f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(39.5f, -7.5f, 4.5f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f);
        this.bodyModel[32].setRotationPoint(38.5f, -7.5f, 4.5f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f);
        this.bodyModel[33].setRotationPoint(50.5f, -8.5f, -0.5f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(51.5f, -8.5f, -0.5f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[35].setRotationPoint(53.0f, -8.5f, -0.5f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 3, 13, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(14.0f, -13.5f, -2.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 3, 13, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(-1.0f, -13.5f, -2.0f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f);
        this.bodyModel[38].setRotationPoint(7.5f, -4.5f, -0.5f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[39].setRotationPoint(10.0f, -4.5f, -0.5f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(8.5f, -4.5f, -0.5f);
        this.bodyModel[41].addShapeBox(-5.5f, -0.7f, -1.5f, 10, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[41].setRotationPoint(-35.0f, -4.0f, 0.0f);
        this.bodyModel[42].addShapeBox(-5.5f, -0.7f, 0.5f, 10, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[42].setRotationPoint(-35.0f, -4.0f, 0.0f);
        this.bodyModel[43].addShapeBox(4.5f, -0.7f, 0.5f, 3, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[43].setRotationPoint(-35.0f, -4.0f, 0.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[44].setRotationPoint(-36.5f, -3.5f, -0.5f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[45].setRotationPoint(-37.5f, -2.5f, -1.5f);
        this.bodyModel[46].addShapeBox(4.5f, -0.7f, -1.5f, 3, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[46].setRotationPoint(-35.0f, -4.0f, 0.0f);
        this.bodyModel[47].addShapeBox(-0.5f, -3.5f, 0.0f, 1, 19, 1, 0.0f, -0.4f, -4.0f, -0.4f, -0.4f, -4.0f, -0.4f, -0.4f, -4.0f, -0.4f, -0.4f, -4.0f, -0.4f, -0.4f, -4.0f, -0.4f, -0.4f, -4.0f, -0.4f, -0.4f, -4.0f, -0.4f, -0.4f, -4.0f, -0.4f);
        this.bodyModel[47].setRotationPoint(-78.8f, -10.0f, -0.5f);
        this.bodyModel[47].rotateAngleZ = 0.20943952f;
        this.bodyModel[48].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[48].setRotationPoint(4.5f, -2.0f, -1.5f);
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 3, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[49].setRotationPoint(4.5f, -2.0f, -4.5f);
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.bodyModel[50].setRotationPoint(4.5f, -2.0f, 1.5f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[51].setRotationPoint(38.5f, -10.0f, -1.5f);
        this.bodyModel[52].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[52].setRotationPoint(38.0f, -11.0f, -2.5f);
        this.bodyModel[53].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[53].setRotationPoint(42.0f, -13.0f, -2.5f);
        this.bodyModel[54].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 5, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.35f, -1.5f, 0.0f, -0.35f, -1.5f, 0.0f, -0.35f, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.35f, -1.5f, 0.0f, -0.35f, -1.5f, 0.0f, -0.35f, 0.0f);
        this.bodyModel[54].setRotationPoint(42.0f, -14.0f, -2.5f);
        this.bodyModel[55].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[55].setRotationPoint(41.0f, -12.0f, -2.5f);
        this.bodyModel[56].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f);
        this.bodyModel[56].setRotationPoint(38.7f, -16.0f, -0.5f);
        this.bodyModel[57].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.1f, -0.3f, -0.3f, 0.1f, -0.3f, -0.3f, 0.1f, -0.3f, -0.3f, 0.1f, -0.3f, -0.3f, 0.1f, -0.3f, -0.3f, 0.1f, -0.3f, -0.3f, 0.1f, -0.3f, -0.3f, 0.1f, -0.3f);
        this.bodyModel[57].setRotationPoint(38.7f, -15.0f, -0.5f);
        this.bodyModel[58].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.25f, 0.1f, -0.25f, -0.25f, 0.1f, -0.25f, -0.25f, 0.1f, -0.25f, -0.25f, 0.1f, -0.25f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f);
        this.bodyModel[58].setRotationPoint(38.7f, -14.0f, -0.5f);
        this.bodyModel[59].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[59].setRotationPoint(41.75f, -13.5f, -2.5f);
        this.bodyModel[60].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[60].setRotationPoint(41.75f, -13.5f, 1.5f);
        this.bodyModel[61].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[61].setRotationPoint(45.25f, -13.5f, 0.0f);
        this.bodyModel[62].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[62].setRotationPoint(45.25f, -13.5f, -1.0f);
        this.bodyModel[63].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[63].setRotationPoint(43.5f, -13.5f, -1.8f);
        this.bodyModel[64].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[64].setRotationPoint(43.5f, -13.5f, 0.8f);
        this.bodyModel[65].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[65].setRotationPoint(43.5f, -10.0f, -1.5f);
        this.bodyModel[66].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 1, 0.0f, 0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f);
        this.bodyModel[66].setRotationPoint(-76.0f, 4.0f, -0.5f);
        this.bodyModel[67].addShapeBox(0.0f, 0.0f, 0.0f, 2, 7, 2, 0.0f, -0.8f, 0.0f, -0.8f, -0.8f, 0.0f, -0.8f, -0.8f, 0.0f, -0.8f, -0.8f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[67].setRotationPoint(-26.5f, -7.5f, -1.0f);
        this.bodyModel[68].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[68].setRotationPoint(-26.0f, -8.0f, -0.5f);
    }
}