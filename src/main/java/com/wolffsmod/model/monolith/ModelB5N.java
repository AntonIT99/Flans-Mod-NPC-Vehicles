//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelB5N extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelB5N() {
        this.textureX = 512;
        this.textureY = 512;
        this.bodyModel = new ModelRendererTurbo[72];
        this.noseModel = new ModelRendererTurbo[10];
        this.tailModel = new ModelRendererTurbo[9];
        this.leftWingModel = new ModelRendererTurbo[4];
        this.rightWingModel = new ModelRendererTurbo[4];
        this.yawFlapModel = new ModelRendererTurbo[2];
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.leftWingWheelModel = new ModelRendererTurbo[6];
        this.rightWingWheelModel = new ModelRendererTurbo[6];
        this.initbodyModel_1();
        this.initnoseModel_1();
        this.inittailModel_1();
        this.initleftWingModel_1();
        this.initrightWingModel_1();
        this.inityawFlapModel_1();
        this.initpitchFlapLeftModel_1();
        this.initpitchFlapRightModel_1();
        this.initleftWingWheelModel_1();
        this.initrightWingWheelModel_1();
        this.initPropeller();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 417, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 305, 17, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 345, 25, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 161, 25, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 193, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 265, 169, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 201, 65, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 241, 65, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 481, 49, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 401, 73, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 201, 89, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 401, 97, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 113, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 433, 73, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 201, 113, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 401, 121, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 225, 25, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 225, 25, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 233, 25, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 489, 129, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 489, 145, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 489, 121, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 401, 145, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 465, 177, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 129, 49, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 1, 185, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 161, 49, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase)this, 81, 185, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase)this, 129, 49, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo((ModelBase)this, 97, 201, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo((ModelBase)this, 281, 201, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo((ModelBase)this, 201, 201, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo((ModelBase)this, 345, 201, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo((ModelBase)this, 505, 129, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo((ModelBase)this, 361, 1, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo((ModelBase)this, 417, 1, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo((ModelBase)this, 473, 145, this.textureX, this.textureY);
        this.bodyModel[69] = new ModelRendererTurbo((ModelBase)this, 1, 209, this.textureX, this.textureY);
        this.bodyModel[70] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.bodyModel[71] = new ModelRendererTurbo((ModelBase)this, 385, 217, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 9, 11, 9, 0.0f, 0.0f, -4.5f, -2.5f, 0.0f, -3.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-62.0f, -32.5f, -9.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 9, 11, 9, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -2.0f, 0.0f, -4.5f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-62.0f, -32.5f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 9, 11, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -4.0f, -2.0f, 0.0f, -4.5f, -2.5f);
        this.bodyModel[2].setRotationPoint(-62.0f, -21.5f, 0.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 68, 11, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -5.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -4.0f, -2.0f, 0.0f, -5.0f, -3.0f, 0.0f, -3.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(-53.0f, -21.5f, -9.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 59, 11, 9, 0.0f, 0.0f, -3.0f, -6.0f, 0.0f, -3.0f, -5.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -2.0f, 0.0f, 0.0f, -7.0f, 0.0f, 1.0f, -7.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(-44.0f, -32.5f, 0.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 9, 11, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.5f, -2.5f, 0.0f, -4.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-62.0f, -21.5f, -9.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 68, 11, 9, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -5.0f, -3.0f, 0.0f, -4.0f, -2.0f);
        this.bodyModel[6].setRotationPoint(-53.0f, -21.5f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 35, 11, 9, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -7.0f, -5.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(15.0f, -32.5f, -9.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 59, 11, 9, 0.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -5.0f, 0.0f, -3.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, -7.0f, 0.0f, 0.0f, -7.0f);
        this.bodyModel[8].setRotationPoint(-44.0f, -32.5f, -9.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 9, 11, 9, 0.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -2.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-53.0f, -32.5f, -9.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 9, 11, 9, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-53.0f, -32.5f, 0.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 5, 11, 9, 0.0f, 2.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 6.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(10.0f, -32.5f, -9.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 5, 11, 9, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 2.0f, -3.0f, -3.0f, -1.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, -1.0f, 2.0f, 0.0f, -1.0f);
        this.bodyModel[12].setRotationPoint(10.0f, -32.5f, 0.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 35, 11, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -7.0f, -5.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[13].setRotationPoint(15.0f, -32.5f, 0.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 35, 9, 9, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -7.0f, -5.0f, 0.0f, -4.5f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(15.0f, -21.5f, -9.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 35, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -7.0f, -5.0f, 0.0f, -3.0f, -3.0f);
        this.bodyModel[15].setRotationPoint(15.0f, -21.5f, 0.0f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 31, 11, 9, 0.0f, 0.0f, -7.0f, -5.0f, 0.0f, -9.0f, -9.0f, 1.0f, -9.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, -2.0f, -9.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(50.0f, -32.5f, -9.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 30, 11, 9, 0.0f, 0.0f, -4.0f, 0.0f, 1.0f, -9.0f, 0.0f, 0.0f, -9.0f, -9.0f, 0.0f, -7.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -9.0f, 0.0f, 0.0f, -3.5f);
        this.bodyModel[17].setRotationPoint(50.0f, -32.5f, 0.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 31, 9, 9, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 2.0f, -9.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, -5.0f, 0.0f, -11.0f, -9.0f, 0.0f, -11.0f, 0.0f, 0.0f, -4.5f, 0.0f);
        this.bodyModel[18].setRotationPoint(50.0f, -21.5f, -9.0f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 31, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, -9.0f, 0.0f, 0.0f, -3.5f, 0.0f, -4.5f, 0.0f, 0.0f, -11.0f, 0.0f, 0.0f, -11.0f, -9.0f, 0.0f, -7.0f, -5.0f);
        this.bodyModel[19].setRotationPoint(50.0f, -21.5f, 0.0f);
        this.bodyModel[20].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[20].setRotationPoint(-43.0f, -35.5f, 4.0f);
        this.bodyModel[20].rotateAngleX = 0.34906584f;
        this.bodyModel[21].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[21].setRotationPoint(-43.0f, -35.5f, -4.0f);
        this.bodyModel[21].rotateAngleX = -0.34906584f;
        this.bodyModel[22].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[22].setRotationPoint(-43.0f, -37.5f, 0.0f);
        this.bodyModel[22].rotateAngleX = 1.134464f;
        this.bodyModel[23].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[23].setRotationPoint(-43.0f, -37.5f, 0.0f);
        this.bodyModel[23].rotateAngleX = -1.134464f;
        this.bodyModel[24].addBox(-0.5f, -0.5f, -0.5f, 1, 9, 1, 0.0f);
        this.bodyModel[24].setRotationPoint(-43.0f, -35.5f, 4.0f);
        this.bodyModel[24].rotateAngleX = 0.8552113f;
        this.bodyModel[24].rotateAngleY = 1.5707964f;
        this.bodyModel[25].addBox(-0.5f, -0.5f, -0.5f, 1, 9, 1, 0.0f);
        this.bodyModel[25].setRotationPoint(-43.0f, -35.5f, -4.0f);
        this.bodyModel[25].rotateAngleX = 0.8552113f;
        this.bodyModel[25].rotateAngleY = 1.5707964f;
        this.bodyModel[26].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[26].setRotationPoint(-33.0f, -35.3f, 4.0f);
        this.bodyModel[26].rotateAngleX = 0.33161256f;
        this.bodyModel[27].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[27].setRotationPoint(-33.0f, -37.3f, 0.0f);
        this.bodyModel[27].rotateAngleX = 1.134464f;
        this.bodyModel[28].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[28].setRotationPoint(-33.0f, -37.3f, 0.0f);
        this.bodyModel[28].rotateAngleX = -1.134464f;
        this.bodyModel[29].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[29].setRotationPoint(-33.0f, -35.3f, -4.0f);
        this.bodyModel[29].rotateAngleX = -0.33161256f;
        this.bodyModel[30].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[30].setRotationPoint(-24.0f, -35.1f, 4.0f);
        this.bodyModel[30].rotateAngleX = 0.31415927f;
        this.bodyModel[31].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[31].setRotationPoint(-24.0f, -37.1f, 0.0f);
        this.bodyModel[31].rotateAngleX = 1.134464f;
        this.bodyModel[32].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[32].setRotationPoint(-24.0f, -37.1f, 0.0f);
        this.bodyModel[32].rotateAngleX = -1.134464f;
        this.bodyModel[33].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[33].setRotationPoint(-24.0f, -35.1f, -4.0f);
        this.bodyModel[33].rotateAngleX = -0.31415927f;
        this.bodyModel[34].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[34].setRotationPoint(-15.0f, -34.9f, 4.0f);
        this.bodyModel[34].rotateAngleX = 0.29670596f;
        this.bodyModel[35].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[35].setRotationPoint(-15.0f, -36.9f, 0.0f);
        this.bodyModel[35].rotateAngleX = 1.134464f;
        this.bodyModel[36].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[36].setRotationPoint(-15.0f, -36.9f, 0.0f);
        this.bodyModel[36].rotateAngleX = -1.134464f;
        this.bodyModel[37].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[37].setRotationPoint(-15.0f, -34.9f, -4.0f);
        this.bodyModel[37].rotateAngleX = -0.29670596f;
        this.bodyModel[38].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[38].setRotationPoint(-5.0f, -34.7f, 4.0f);
        this.bodyModel[38].rotateAngleX = 0.27925268f;
        this.bodyModel[39].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[39].setRotationPoint(-5.0f, -36.7f, 0.0f);
        this.bodyModel[39].rotateAngleX = 1.134464f;
        this.bodyModel[40].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[40].setRotationPoint(-5.0f, -36.7f, 0.0f);
        this.bodyModel[40].rotateAngleX = -1.134464f;
        this.bodyModel[41].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[41].setRotationPoint(-5.0f, -34.7f, -4.0f);
        this.bodyModel[41].rotateAngleX = -0.27925268f;
        this.bodyModel[42].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[42].setRotationPoint(3.0f, -34.5f, 4.0f);
        this.bodyModel[42].rotateAngleX = 0.2617994f;
        this.bodyModel[43].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[43].setRotationPoint(3.0f, -36.5f, 0.0f);
        this.bodyModel[43].rotateAngleX = 1.134464f;
        this.bodyModel[44].addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f);
        this.bodyModel[44].setRotationPoint(3.0f, -36.5f, 0.0f);
        this.bodyModel[44].rotateAngleX = -1.134464f;
        this.bodyModel[45].addBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f);
        this.bodyModel[45].setRotationPoint(3.0f, -34.5f, -4.0f);
        this.bodyModel[45].rotateAngleX = -0.2617994f;
        this.bodyModel[46].addBox(-0.5f, -0.5f, -0.5f, 1, 47, 1, 0.0f);
        this.bodyModel[46].setRotationPoint(-43.0f, -35.5f, 4.0f);
        this.bodyModel[46].rotateAngleZ = 1.553343f;
        this.bodyModel[47].addBox(-0.5f, -0.5f, -0.5f, 1, 47, 1, 0.0f);
        this.bodyModel[47].setRotationPoint(-43.0f, -35.5f, -4.0f);
        this.bodyModel[47].rotateAngleZ = 1.553343f;
        this.bodyModel[48].addBox(0.0f, 0.0f, 0.0f, 9, 7, 10, 0.0f);
        this.bodyModel[48].setRotationPoint(-53.0f, -30.5f, -5.0f);
        this.bodyModel[49].addBox(0.0f, 0.0f, 0.0f, 3, 3, 2, 0.0f);
        this.bodyModel[49].setRotationPoint(-47.0f, -32.5f, -1.0f);
        this.bodyModel[49].rotateAngleZ = 0.01745329f;
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 6, 7, 16, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 7.0f, 0.0f, -7.0f, 7.0f, 0.0f, -7.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[50].setRotationPoint(-50.0f, -22.5f, -8.0f);
        this.bodyModel[51].addBox(0.0f, 0.0f, 0.0f, 6, 6, 8, 0.0f);
        this.bodyModel[51].setRotationPoint(-38.0f, -21.5f, -4.0f);
        this.bodyModel[52].addBox(0.0f, -1.0f, 0.0f, 2, 13, 8, 0.0f);
        this.bodyModel[52].setRotationPoint(-31.0f, -32.5f, -4.0f);
        this.bodyModel[52].rotateAngleZ = -0.10471976f;
        this.bodyModel[53].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 12, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[53].setRotationPoint(3.0f, -47.5f, 0.0f);
        this.bodyModel[54].addShapeBox(-4.5f, -1.0f, -0.5f, 3, 1, 1, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, 0.3f, 0.0f);
        this.bodyModel[54].setRotationPoint(12.0f, -32.5f, 0.0f);
        this.bodyModel[55].addShapeBox(3.5f, -1.0f, -0.5f, 4, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[55].setRotationPoint(12.0f, -32.5f, 0.0f);
        this.bodyModel[56].addShapeBox(4.5f, -1.2f, -0.5f, 1, 1, 1, 0.0f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f);
        this.bodyModel[56].setRotationPoint(15.0f, -32.5f, 0.0f);
        this.bodyModel[57].addShapeBox(0.2f, -1.9f, -1.5f, 3, 1, 3, 0.0f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f);
        this.bodyModel[57].setRotationPoint(12.0f, -32.5f, 0.0f);
        this.bodyModel[58].addShapeBox(-1.5f, -1.0f, -0.5f, 5, 1, 1, 0.0f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f, 0.1f, -0.3f);
        this.bodyModel[58].setRotationPoint(12.0f, -32.5f, 0.0f);
        this.bodyModel[59].addBox(0.0f, -1.0f, 0.0f, 2, 13, 8, 0.0f);
        this.bodyModel[59].setRotationPoint(-9.0f, -32.5f, -4.0f);
        this.bodyModel[59].rotateAngleZ = 0.10471976f;
        this.bodyModel[60].addBox(0.0f, 0.0f, 0.0f, 6, 6, 8, 0.0f);
        this.bodyModel[60].setRotationPoint(-7.0f, -21.5f, -4.0f);
        this.bodyModel[61].addBox(0.0f, 0.0f, 0.0f, 11, 11, 6, 0.0f);
        this.bodyModel[61].setRotationPoint(-65.0f, -21.5f, -3.0f);
        this.bodyModel[61].rotateAngleZ = 0.12217305f;
        this.bodyModel[62].addShapeBox(0.0f, 0.0f, 0.0f, 23, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[62].setRotationPoint(-42.0f, -10.0f, -4.0f);
        this.bodyModel[63].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 8, 0.0f, 0.0f, -2.0f, -2.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -2.0f, -2.0f);
        this.bodyModel[63].setRotationPoint(-19.0f, -10.0f, -4.0f);
        this.bodyModel[64].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 8, 0.0f, 0.0f, -4.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -4.0f);
        this.bodyModel[64].setRotationPoint(-51.0f, -10.0f, -4.0f);
        this.bodyModel[65].addBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f);
        this.bodyModel[65].setRotationPoint(-50.0f, -12.0f, -0.5f);
        this.bodyModel[65].rotateAngleZ = 0.57595867f;
        this.bodyModel[66].addBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f);
        this.bodyModel[66].setRotationPoint(-41.0f, -12.0f, -0.5f);
        this.bodyModel[67].addBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f);
        this.bodyModel[67].setRotationPoint(-28.0f, -12.0f, -0.5f);
        this.bodyModel[67].rotateAngleZ = -0.17453294f;
        this.bodyModel[68].addShapeBox(0.0f, -6.0f, -0.5f, 5, 12, 1, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyModel[68].setRotationPoint(-26.0f, -6.0f, 0.0f);
        this.bodyModel[68].rotateAngleX = 0.7853982f;
        this.bodyModel[69].addBox(0.0f, -6.0f, -0.5f, 12, 12, 1, 0.0f);
        this.bodyModel[69].setRotationPoint(-21.0f, -6.0f, 0.0f);
        this.bodyModel[69].rotateAngleX = 0.7853982f;
        this.bodyModel[70].addShapeBox(0.0f, -6.0f, -0.5f, 5, 12, 1, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyModel[70].setRotationPoint(-26.0f, -6.0f, 0.0f);
        this.bodyModel[70].rotateAngleX = -0.7853982f;
        this.bodyModel[71].addBox(0.0f, -6.0f, -0.5f, 12, 12, 1, 0.0f);
        this.bodyModel[71].setRotationPoint(-21.0f, -6.0f, 0.0f);
        this.bodyModel[71].rotateAngleX = -0.7853982f;
    }
    
    private void initnoseModel_1() {
        this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.noseModel[3] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.noseModel[4] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.noseModel[5] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.noseModel[6] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.noseModel[7] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.noseModel[8] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.noseModel[9] = new ModelRendererTurbo((ModelBase)this, 345, 1, this.textureX, this.textureY);
        this.noseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 11, 9, 9, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.75f, -2.5f, 0.0f, -3.25f, -3.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -1.0f);
        this.noseModel[0].setRotationPoint(-73.0f, -31.0f, 0.0f);
        this.noseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 11, 9, 9, 0.0f, 0.0f, -3.25f, -3.0f, 0.0f, -2.75f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.noseModel[1].setRotationPoint(-73.0f, -31.0f, -9.0f);
        this.noseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 11, 9, 9, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -3.25f, -3.0f, 0.0f, -2.75f, -2.5f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.noseModel[2].setRotationPoint(-73.0f, -21.0f, -9.0f);
        this.noseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 11, 9, 9, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.75f, -2.5f, 0.0f, -3.25f, -3.0f);
        this.noseModel[3].setRotationPoint(-73.0f, -21.0f, 0.0f);
        this.noseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 9, 9, 0.0f, 0.0f, -5.75f, -5.0f, 0.0f, -3.25f, -3.0f, 0.0f, -1.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.noseModel[4].setRotationPoint(-76.0f, -31.0f, -9.0f);
        this.noseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 3, 9, 9, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -3.25f, -3.0f, 0.0f, -5.75f, -5.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -4.0f);
        this.noseModel[5].setRotationPoint(-76.0f, -31.0f, 0.0f);
        this.noseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 9, 9, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -4.0f, 0.0f, -4.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -3.25f, -3.0f, 0.0f, -5.75f, -5.0f);
        this.noseModel[6].setRotationPoint(-76.0f, -21.0f, 0.0f);
        this.noseModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 9, 9, 0.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -5.75f, -5.0f, 0.0f, -3.25f, -3.0f, 0.0f, -1.0f, 0.0f, 0.0f, -4.0f, 0.0f);
        this.noseModel[7].setRotationPoint(-76.0f, -21.0f, -9.0f);
        this.noseModel[8].addShapeBox(0.0f, -3.5f, -3.5f, 3, 7, 7, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -1.0f, -1.0f);
        this.noseModel[8].setRotationPoint(-79.0f, -21.5f, 0.0f);
        this.noseModel[9].addShapeBox(0.0f, -3.5f, -3.5f, 3, 7, 7, 0.0f, 0.0f, -3.5f, -3.5f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -3.5f, -3.5f, 0.0f, -3.5f, -3.5f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -3.5f, -3.5f);
        this.noseModel[9].setRotationPoint(-82.0f, -21.5f, 0.0f);
    }
    
    private void inittailModel_1() {
        this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 385, 169, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 185, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 281, 193, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 369, 17, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo((ModelBase)this, 385, 17, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo((ModelBase)this, 401, 17, this.textureX, this.textureY);
        this.tailModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 5, 23, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f);
        this.tailModel[0].setRotationPoint(61.0f, -48.0f, 0.0f);
        this.tailModel[1].addShapeBox(0.0f, 0.0f, -0.5f, 16, 1, 40, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -9.0f);
        this.tailModel[1].setRotationPoint(53.0f, -23.0f, 0.0f);
        this.tailModel[2].addShapeBox(0.0f, 0.0f, -0.5f, 16, 1, 40, 0.0f, -8.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[2].setRotationPoint(53.0f, -23.0f, -40.0f);
        this.tailModel[3].addShapeBox(-0.5f, -0.5f, -0.5f, 62, 1, 1, 0.0f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f);
        this.tailModel[3].setRotationPoint(3.5f, -47.6f, 0.0f);
        this.tailModel[3].rotateAngleZ = -0.01745329f;
        this.tailModel[4].addShapeBox(0.0f, 0.0f, -0.5f, 3, 3, 1, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[4].setRotationPoint(71.0f, -22.0f, 0.0f);
        this.tailModel[5].addShapeBox(0.0f, 0.0f, -0.5f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f);
        this.tailModel[5].setRotationPoint(71.0f, -20.0f, 0.7f);
        this.tailModel[5].rotateAngleZ = 0.5235988f;
        this.tailModel[6].addShapeBox(0.0f, 0.0f, -0.5f, 4, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[6].setRotationPoint(72.0f, -18.5f, 0.0f);
        this.tailModel[7].addShapeBox(0.0f, 0.0f, -0.5f, 4, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.tailModel[7].setRotationPoint(72.0f, -15.5f, 0.0f);
        this.tailModel[8].addBox(0.0f, 0.0f, -0.5f, 4, 2, 1, 0.0f);
        this.tailModel[8].setRotationPoint(72.0f, -17.5f, 0.0f);
    }
    
    private void initleftWingModel_1() {
        this.leftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 201, 73, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 145, 169, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 201, 137, this.textureX, this.textureY);
        this.leftWingModel[0].addShapeBox(0.0f, -3.0f, -90.0f, 52, 5, 90, 0.0f, -7.0f, -2.0f, 0.0f, -16.0f, -2.0f, 0.0f, 2.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 4.0f, -2.0f, 0.0f, 0.0f, -0.7f, 0.3f);
        this.leftWingModel[0].setRotationPoint(-47.0f, -13.0f, 0.0f);
        this.leftWingModel[0].rotateAngleX = -0.08726646f;
        this.leftWingModel[1].addShapeBox(0.0f, -3.0f, -107.0f, 52, 5, 17, 0.0f, -9.0f, -3.0f, 0.0f, -20.0f, -3.0f, 0.0f, -16.0f, -2.0f, 0.0f, -7.0f, -2.0f, 0.0f, -8.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f);
        this.leftWingModel[1].setRotationPoint(-47.0f, -13.0f, 0.0f);
        this.leftWingModel[1].rotateAngleX = -0.08726646f;
        this.leftWingModel[2].addShapeBox(0.0f, -3.0f, -114.0f, 52, 5, 7, 0.0f, -15.0f, -3.0f, 0.0f, -34.0f, -3.0f, 0.0f, -20.0f, -3.0f, 0.0f, -9.0f, -3.0f, 0.0f, -13.0f, 0.0f, 0.0f, -32.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f);
        this.leftWingModel[2].setRotationPoint(-47.0f, -13.0f, 0.0f);
        this.leftWingModel[2].rotateAngleX = -0.08726646f;
        this.leftWingModel[3].addShapeBox(0.0f, -3.0f, -3.0f, 32, 5, 5, 0.0f, -8.0f, 2.0f, 16.0f, 9.0f, 0.0f, -2.0f, -16.0f, -2.0f, 0.0f, -7.0f, -2.0f, 0.0f, -9.0f, -3.7f, 15.3f, 8.0f, -5.0f, -2.0f, -15.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f);
        this.leftWingModel[3].setRotationPoint(-5.0f, -15.0f, 0.0f);
        this.leftWingModel[3].rotateAngleX = 0.08726646f;
    }
    
    private void initrightWingModel_1() {
        this.rightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 337, 49, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 137, this.textureX, this.textureY);
        this.rightWingModel[0].addShapeBox(0.0f, -3.0f, 0.0f, 52, 5, 90, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 1.0f, 0.0f, -16.0f, -2.0f, 0.0f, -7.0f, -2.0f, 0.0f, 0.0f, -0.7f, 0.2f, 4.0f, -2.0f, 0.0f, -15.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f);
        this.rightWingModel[0].setRotationPoint(-47.0f, -13.0f, 0.0f);
        this.rightWingModel[0].rotateAngleX = 0.08726646f;
        this.rightWingModel[1].addShapeBox(0.0f, -3.0f, 90.0f, 52, 5, 17, 0.0f, -7.0f, -2.0f, 0.0f, -16.0f, -2.0f, 0.0f, -20.0f, -3.0f, 0.0f, -9.0f, -3.0f, 0.0f, -6.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f);
        this.rightWingModel[1].setRotationPoint(-47.0f, -13.0f, 0.0f);
        this.rightWingModel[1].rotateAngleX = 0.08726646f;
        this.rightWingModel[2].addShapeBox(0.0f, -3.0f, 107.0f, 52, 5, 7, 0.0f, -9.0f, -3.0f, 0.0f, -20.0f, -3.0f, 0.0f, -34.0f, -3.0f, 0.0f, -15.0f, -3.0f, 0.0f, -8.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -32.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f);
        this.rightWingModel[2].setRotationPoint(-47.0f, -13.0f, 0.0f);
        this.rightWingModel[2].rotateAngleX = 0.08726646f;
        this.rightWingModel[3].addShapeBox(0.0f, -3.0f, -2.0f, 32, 5, 5, 0.0f, -7.0f, -2.0f, 0.0f, -16.0f, -2.0f, 0.0f, 9.0f, 0.0f, -2.0f, -8.0f, 2.0f, 16.0f, -6.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 8.0f, -5.0f, -2.0f, -9.0f, -3.7f, 15.3f);
        this.rightWingModel[3].setRotationPoint(-5.0f, -15.0f, 0.0f);
        this.rightWingModel[3].rotateAngleX = -0.08726646f;
    }
    
    private void inityawFlapModel_1() {
        this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 497, 97, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 201, 25, this.textureX, this.textureY);
        this.yawFlapModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 5, 23, 1, 0.0f, 0.0f, -3.0f, 0.0f, 3.0f, -3.0f, 0.0f, 3.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 1.0f, 0.0f, 6.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[0].setRotationPoint(66.0f, -48.0f, 0.0f);
        this.yawFlapModel[1].addShapeBox(0.0f, 0.0f, -0.5f, 5, 9, 1, 0.0f, 0.0f, -3.0f, 0.0f, -1.0f, -4.0f, 0.0f, -1.0f, -4.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[1].setRotationPoint(66.0f, -54.0f, 0.0f);
    }
    
    private void initpitchFlapLeftModel_1() {
        (this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 121, 185, this.textureX, this.textureY)).addShapeBox(0.0f, -0.5f, -0.5f, 16, 1, 40, 0.0f, 0.0f, 0.0f, 0.0f, -11.0f, 0.0f, -5.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -11.0f, 0.0f, -5.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftModel[0].setRotationPoint(69.0f, -22.5f, -40.0f);
    }
    
    private void initpitchFlapRightModel_1() {
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 201, 193, this.textureX, this.textureY)).addShapeBox(0.0f, -0.5f, -0.5f, 16, 1, 40, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -11.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -11.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapRightModel[0].setRotationPoint(69.0f, -22.5f, 0.0f);
    }
    
    private void initleftWingWheelModel_1() {
        this.leftWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 465, 49, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 201, 185, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 233, 65, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 281, 65, this.textureX, this.textureY);
        this.leftWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 353, 17, this.textureX, this.textureY);
        this.leftWingWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 281, 81, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(-35.0f, -2.0f, -37.0f);
        this.leftWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 12, 4, 4, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(-39.0f, 2.0f, -37.0f);
        this.leftWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 4, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(-35.0f, 6.0f, -37.0f);
        this.leftWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 3, 10, 1, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(-34.5f, -3.5f, -33.0f);
        this.leftWingWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 3, 1, 4, 0.0f);
        this.leftWingWheelModel[4].setRotationPoint(-34.5f, -3.5f, -36.5f);
        this.leftWingWheelModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftWingWheelModel[5].setRotationPoint(-33.5f, -14.5f, -35.5f);
    }
    
    private void initrightWingWheelModel_1() {
        this.rightWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 449, 1, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 185, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 153, 25, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 169, 49, this.textureX, this.textureY);
        this.rightWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 337, 1, this.textureX, this.textureY);
        this.rightWingWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 185, 49, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(-35.0f, -2.0f, 33.0f);
        this.rightWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 12, 4, 4, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(-39.0f, 2.0f, 33.0f);
        this.rightWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 4, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(-35.0f, 6.0f, 33.0f);
        this.rightWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 3, 10, 1, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(-34.5f, -3.5f, 32.0f);
        this.rightWingWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 3, 1, 4, 0.0f);
        this.rightWingWheelModel[4].setRotationPoint(-34.5f, -3.5f, 32.5f);
        this.rightWingWheelModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightWingWheelModel[5].setRotationPoint(-33.5f, -14.5f, 34.5f);
    }
    
    private void initPropeller() {
        (this.propellerModels = new ModelRendererTurbo[1][3])[0] = this.makeProp1(-78.0f, -22.0f, 0.0f);
    }
    
    private ModelRendererTurbo[] makeProp1(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 377, 1, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 377, 1, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 377, 1, this.textureX, this.textureY) };
        prop[0].addBox(-0.5f, -22.0f, -1.0f, 1, 22, 2, 0.0f);
        prop[1].addBox(-0.5f, -22.0f, -1.0f, 1, 22, 2, 0.0f);
        prop[2].addBox(-0.5f, -22.0f, -1.0f, 1, 22, 2, 0.0f);
        prop[0].setRotationPoint(i, j, k);
        prop[1].setRotationPoint(i, j, k);
        prop[2].setRotationPoint(i, j, k);
        return prop;
    }
}
