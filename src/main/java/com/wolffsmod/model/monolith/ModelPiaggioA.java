//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelPiaggioA extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelPiaggioA() {
        this.textureX = 1024;
        this.textureY = 512;
        this.bodyModel = new ModelRendererTurbo[59];
        this.noseModel = new ModelRendererTurbo[8];
        this.tailModel = new ModelRendererTurbo[2];
        this.leftWingModel = new ModelRendererTurbo[30];
        this.rightWingModel = new ModelRendererTurbo[30];
        this.yawFlapModel = new ModelRendererTurbo[5];
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[1];
        this.tailWheelModel = new ModelRendererTurbo[5];
        this.leftWingWheelModel = new ModelRendererTurbo[5];
        this.rightWingWheelModel = new ModelRendererTurbo[5];
        this.initbodyModel_1();
        this.initnoseModel_1();
        this.inittailModel_1();
        this.initleftWingModel_1();
        this.initrightWingModel_1();
        this.inityawFlapModel_1();
        this.initpitchFlapLeftModel_1();
        this.initpitchFlapRightModel_1();
        this.initpitchFlapLeftWingModel_1();
        this.initpitchFlapRightWingModel_1();
        this.inittailWheelModel_1();
        this.initleftWingWheelModel_1();
        this.initrightWingWheelModel_1();
        this.initPropeller();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 513, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 817, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 401, 73, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 105, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 369, 57, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 817, 57, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 785, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 313, 105, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 625, 105, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 769, 153, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 913, 57, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 969, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 465, 193, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 281, 105, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 833, 25, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 993, 41, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 353, 57, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 529, 25, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 1001, 25, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 537, 25, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 841, 25, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 849, 25, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 441, 57, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 1001, 25, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 1009, 41, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 889, 57, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 1017, 41, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 1017, 25, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 609, 289, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 953, 105, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 73, 273, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 465, 65, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 353, 225, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 489, 65, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 985, 65, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 625, 225, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 1, 121, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 897, 105, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 113, 161, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 1001, 121, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 465, 193, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 281, 105, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 609, 289, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 953, 105, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 98, 30, 34, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 8.0f, 0.0f, -2.0f, 8.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-175.0f, -43.0f, -17.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 18, 10, 24, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 3.0f, 0.0f, 2.0f, 3.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 2.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 3.0f, 0.0f, -4.0f, 2.0f);
        this.bodyModel[1].setRotationPoint(-183.0f, -48.0f, -12.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 10, 6, 16, 0.0f, 1.0f, -6.0f, 2.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 1.0f, -6.0f, 2.0f, 4.0f, 4.0f, 3.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 7.0f, 4.0f, 4.0f, 3.0f);
        this.bodyModel[2].setRotationPoint(-193.0f, -46.0f, -8.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 117, 30, 34, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, 12.0f, 3.0f, 0.0f, 12.0f, 3.0f, 0.0f, 0.0f, 8.0f, 0.0f, -2.0f, 8.0f, 0.0f, -11.0f, 3.0f, 0.0f, -11.0f, 3.0f, 0.0f, -2.0f, 8.0f);
        this.bodyModel[3].setRotationPoint(-77.0f, -43.0f, -17.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 53, 12, 38, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(-130.0f, -55.0f, -19.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 170, 4, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-130.0f, -59.0f, -13.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 170, 5, 26, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(-130.0f, -64.0f, -13.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 117, 12, 38, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.15f, 1.0f, 0.0f, 0.15f, 1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 6.0f, 0.0f, -12.1f, 1.0f, 0.0f, -12.1f, 1.0f, 0.0f, 0.0f, 6.0f);
        this.bodyModel[7].setRotationPoint(-77.0f, -55.0f, -19.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 36, 7, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(-165.0f, -50.0f, -15.0f);
        this.bodyModel[8].rotateAngleY = -0.10471976f;
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, -1.0f, 36, 7, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-165.0f, -50.0f, 15.0f);
        this.bodyModel[9].rotateAngleY = 0.10471976f;
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 25, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-155.0f, -59.0f, -10.0f);
        this.bodyModel[10].rotateAngleY = -0.10471976f;
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 25, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(-155.0f, -59.0f, 9.0f);
        this.bodyModel[11].rotateAngleY = 0.10471976f;
        this.bodyModel[12].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(-154.5f, -58.5f, -9.5f);
        this.bodyModel[12].rotateAngleX = -0.31415927f;
        this.bodyModel[12].rotateAngleZ = -0.7679449f;
        this.bodyModel[13].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(-153.0f, -58.5f, -9.5f);
        this.bodyModel[13].rotateAngleX = -0.5934119f;
        this.bodyModel[14].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(-145.5f, -58.5f, -10.5f);
        this.bodyModel[14].rotateAngleX = -0.5934119f;
        this.bodyModel[15].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(-137.5f, -58.5f, -11.5f);
        this.bodyModel[15].rotateAngleX = -0.5934119f;
        this.bodyModel[16].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(-137.5f, -58.5f, 11.5f);
        this.bodyModel[16].rotateAngleX = 0.5934119f;
        this.bodyModel[17].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-145.5f, -58.5f, 10.5f);
        this.bodyModel[17].rotateAngleX = 0.5934119f;
        this.bodyModel[18].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-153.0f, -58.5f, 9.5f);
        this.bodyModel[18].rotateAngleX = 0.5934119f;
        this.bodyModel[19].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-154.5f, -58.5f, 9.5f);
        this.bodyModel[19].rotateAngleX = 0.31415927f;
        this.bodyModel[19].rotateAngleZ = -0.7679449f;
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 113, 35, 40, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -18.0f, -10.0f, 0.0f, -18.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(40.0f, -59.0f, -20.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 113, 5, 40, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(40.0f, -64.0f, -20.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 73, 8, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(137.0f, -72.0f, -1.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 33, 20, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(149.0f, -92.0f, -1.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 11, 34, 2, 0.0f, -4.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 5.0f, 0.0f, 22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 22.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(171.0f, -126.0f, -1.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 82, 19, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(-107.0f, -41.0f, -29.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 26, 19, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 16.0f, -3.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 16.0f, -4.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(-25.0f, -41.0f, -29.0f);
        this.bodyModel[27].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(-159.5f, -60.5f, 0.0f);
        this.bodyModel[27].rotateAngleZ = -0.62831855f;
        this.bodyModel[28].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(-159.5f, -60.5f, 0.0f);
        this.bodyModel[28].rotateAngleX = -0.17453294f;
        this.bodyModel[28].rotateAngleY = -0.4886922f;
        this.bodyModel[29].addShapeBox(-0.5f, -0.5f, -11.5f, 1, 1, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(-159.5f, -60.5f, 0.0f);
        this.bodyModel[29].rotateAngleX = 0.17453294f;
        this.bodyModel[29].rotateAngleY = 0.4886922f;
        this.bodyModel[30].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(-155.5f, -63.5f, 0.0f);
        this.bodyModel[30].rotateAngleZ = -0.9599311f;
        this.bodyModel[31].addShapeBox(-0.5f, -0.5f, -0.5f, 26, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(-155.5f, -63.5f, 0.0f);
        this.bodyModel[32].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(-153.0f, -63.5f, -5.0f);
        this.bodyModel[33].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(-153.0f, -63.5f, -5.0f);
        this.bodyModel[33].rotateAngleX = -0.7679449f;
        this.bodyModel[34].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(-153.0f, -63.5f, 5.0f);
        this.bodyModel[34].rotateAngleX = 0.7679449f;
        this.bodyModel[35].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].setRotationPoint(-145.5f, -63.5f, 5.0f);
        this.bodyModel[35].rotateAngleX = 0.8552113f;
        this.bodyModel[36].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(-145.5f, -63.5f, -5.0f);
        this.bodyModel[37].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(-145.5f, -63.5f, -5.0f);
        this.bodyModel[37].rotateAngleX = -0.8552113f;
        this.bodyModel[38].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-137.5f, -63.5f, 5.0f);
        this.bodyModel[38].rotateAngleX = 0.9075712f;
        this.bodyModel[39].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(-137.5f, -63.5f, -5.0f);
        this.bodyModel[40].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(-137.5f, -63.5f, -5.0f);
        this.bodyModel[40].rotateAngleX = -0.9075712f;
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 20.0f, 0.5f, 0.5f, 20.0f, 0.5f, 0.5f, 20.0f, 0.5f, 0.5f, 20.0f, 0.5f);
        this.bodyModel[41].setRotationPoint(-128.0f, -89.0f, -0.5f);
        this.bodyModel[42].addShapeBox(155.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 155.0f, -0.2f, -0.2f, 155.0f, -0.2f, -0.2f, 155.0f, -0.2f, -0.2f, 155.0f, -0.2f, -0.2f, 155.0f, -0.2f, -0.2f, 155.0f, -0.2f, -0.2f, 155.0f, -0.2f, -0.2f, 155.0f, -0.2f, -0.2f);
        this.bodyModel[42].setRotationPoint(-128.0f, -89.0f, -0.5f);
        this.bodyModel[42].rotateAngleZ = 0.12217305f;
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 76, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].setRotationPoint(147.0f, -63.5f, -79.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 25, 2, 10, 0.0f, -8.0f, 0.0f, -1.0f, -5.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -1.0f, -5.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[44].setRotationPoint(169.0f, -63.5f, -89.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 22, 9, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[45].setRotationPoint(40.0f, -29.0f, -6.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[46].setRotationPoint(-1.0f, -69.0f, 3.5f);
        this.bodyModel[46].rotateAngleZ = 0.5061455f;
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, 0.0f, 10, 7, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[47].setRotationPoint(-25.0f, -70.0f, -9.0f);
        this.bodyModel[48].addShapeBox(-11.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[48].setRotationPoint(-20.0f, -69.0f, -4.5f);
        this.bodyModel[48].rotateAngleZ = -0.5061455f;
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[49].setRotationPoint(60.0f, -29.0f, -0.5f);
        this.bodyModel[49].rotateAngleZ = -0.4537856f;
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 10, 7, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[50].setRotationPoint(-6.0f, -70.0f, -1.0f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 8, 4, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[51].setRotationPoint(-156.0f, -47.0f, 1.0f);
        this.bodyModel[52].addShapeBox(0.0f, 0.0f, 0.0f, 2, 16, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[52].setRotationPoint(-148.0f, -59.0f, 1.0f);
        this.bodyModel[53].addShapeBox(0.0f, 0.0f, 0.0f, 8, 4, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[53].setRotationPoint(-156.0f, -47.0f, -10.0f);
        this.bodyModel[54].addShapeBox(0.0f, 0.0f, 0.0f, 2, 16, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[54].setRotationPoint(-148.0f, -59.0f, -10.0f);
        this.bodyModel[55].addShapeBox(0.0f, 0.0f, 0.0f, 82, 19, 7, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[55].setRotationPoint(-107.0f, -41.0f, 22.0f);
        this.bodyModel[56].addShapeBox(0.0f, 0.0f, 0.0f, 26, 19, 7, 0.0f, 0.0f, 0.0f, 0.0f, 16.0f, -3.0f, 1.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16.0f, -4.0f, 1.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[56].setRotationPoint(-25.0f, -41.0f, 22.0f);
        this.bodyModel[57].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 76, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -22.0f, 0.0f, 0.0f);
        this.bodyModel[57].setRotationPoint(147.0f, -63.5f, 3.0f);
        this.bodyModel[58].addShapeBox(0.0f, 0.0f, 0.0f, 25, 2, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, -2.0f, -8.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, -2.0f, -8.0f, 0.0f, -1.0f);
        this.bodyModel[58].setRotationPoint(169.0f, -63.5f, 79.0f);
    }
    
    private void initnoseModel_1() {
        this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 897, 105, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo((ModelBase)this, 945, 177, this.textureX, this.textureY);
        this.noseModel[3] = new ModelRendererTurbo((ModelBase)this, 985, 177, this.textureX, this.textureY);
        this.noseModel[4] = new ModelRendererTurbo((ModelBase)this, 897, 105, this.textureX, this.textureY);
        this.noseModel[5] = new ModelRendererTurbo((ModelBase)this, 897, 105, this.textureX, this.textureY);
        this.noseModel[6] = new ModelRendererTurbo((ModelBase)this, 329, 9, this.textureX, this.textureY);
        this.noseModel[7] = new ModelRendererTurbo((ModelBase)this, 329, 9, this.textureX, this.textureY);
        this.noseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 18, 28, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 3.0f, 0.0f, 2.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, -2.0f, 0.0f);
        this.noseModel[0].setRotationPoint(-193.0f, -41.0f, -14.0f);
        this.noseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 13, 11, 28, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f);
        this.noseModel[1].setRotationPoint(-206.0f, -41.0f, -14.0f);
        this.noseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 7, 7, 12, 0.0f, -1.0f, -4.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -4.0f, -5.5f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -5.5f);
        this.noseModel[2].setRotationPoint(-213.0f, -37.0f, -6.0f);
        this.noseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 7, 12, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -5.5f, -1.0f, -4.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -4.0f, -5.5f);
        this.noseModel[3].setRotationPoint(-213.0f, -25.0f, -6.0f);
        this.noseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 13, 10, 28, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -3.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -8.0f);
        this.noseModel[4].setRotationPoint(-206.0f, -25.0f, -14.0f);
        this.noseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 13, 5, 28, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f);
        this.noseModel[5].setRotationPoint(-206.0f, -30.0f, -14.0f);
        this.noseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 12, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -5.5f);
        this.noseModel[6].setRotationPoint(-213.0f, -30.0f, -6.0f);
        this.noseModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 14, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.noseModel[7].setRotationPoint(-211.0f, -18.5f, -1.0f);
    }
    
    private void inittailModel_1() {
        this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 769, 73, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 625, 153, this.textureX, this.textureY);
        this.tailModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 61, 5, 20, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -9.0f, 0.0f, -4.0f, -9.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[0].setRotationPoint(153.0f, -64.0f, -10.0f);
        this.tailModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 61, 17, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -9.0f, 0.0f, 4.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -31.0f, -7.0f, -6.0f, -31.0f, -7.0f, -6.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[1].setRotationPoint(153.0f, -59.0f, -10.0f);
    }
    
    private void initleftWingModel_1() {
        this.leftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 681, 169, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 905, 153, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 465, 225, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo((ModelBase)this, 257, 161, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo((ModelBase)this, 873, 177, this.textureX, this.textureY);
        this.leftWingModel[7] = new ModelRendererTurbo((ModelBase)this, 297, 193, this.textureX, this.textureY);
        this.leftWingModel[8] = new ModelRendererTurbo((ModelBase)this, 649, 193, this.textureX, this.textureY);
        this.leftWingModel[9] = new ModelRendererTurbo((ModelBase)this, 721, 201, this.textureX, this.textureY);
        this.leftWingModel[10] = new ModelRendererTurbo((ModelBase)this, 585, 105, this.textureX, this.textureY);
        this.leftWingModel[11] = new ModelRendererTurbo((ModelBase)this, 961, 121, this.textureX, this.textureY);
        this.leftWingModel[12] = new ModelRendererTurbo((ModelBase)this, 377, 17, this.textureX, this.textureY);
        this.leftWingModel[13] = new ModelRendererTurbo((ModelBase)this, 841, 17, this.textureX, this.textureY);
        this.leftWingModel[14] = new ModelRendererTurbo((ModelBase)this, 1009, 17, this.textureX, this.textureY);
        this.leftWingModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 217, this.textureX, this.textureY);
        this.leftWingModel[16] = new ModelRendererTurbo((ModelBase)this, 257, 225, this.textureX, this.textureY);
        this.leftWingModel[17] = new ModelRendererTurbo((ModelBase)this, 945, 201, this.textureX, this.textureY);
        this.leftWingModel[18] = new ModelRendererTurbo((ModelBase)this, 649, 225, this.textureX, this.textureY);
        this.leftWingModel[19] = new ModelRendererTurbo((ModelBase)this, 873, 233, this.textureX, this.textureY);
        this.leftWingModel[20] = new ModelRendererTurbo((ModelBase)this, 953, 265, this.textureX, this.textureY);
        this.leftWingModel[21] = new ModelRendererTurbo((ModelBase)this, 625, 273, this.textureX, this.textureY);
        this.leftWingModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 273, this.textureX, this.textureY);
        this.leftWingModel[23] = new ModelRendererTurbo((ModelBase)this, 465, 281, this.textureX, this.textureY);
        this.leftWingModel[24] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.leftWingModel[25] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.leftWingModel[26] = new ModelRendererTurbo((ModelBase)this, 513, 25, this.textureX, this.textureY);
        this.leftWingModel[27] = new ModelRendererTurbo((ModelBase)this, 369, 73, this.textureX, this.textureY);
        this.leftWingModel[28] = new ModelRendererTurbo((ModelBase)this, 985, 57, this.textureX, this.textureY);
        this.leftWingModel[29] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.leftWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 53, 10, 148, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 18.0f, -8.0f, 0.0f, 11.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 18.0f, 17.0f, 0.0f, 11.0f, 17.0f, 0.0f);
        this.leftWingModel[0].setRotationPoint(-96.0f, -49.0f, -177.0f);
        this.leftWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 39, 5, 109, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 21.0f, -8.0f, 0.0f, 10.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 21.0f, 13.0f, 0.0f, 10.0f, 13.0f, 0.0f);
        this.leftWingModel[1].setRotationPoint(-86.0f, -57.0f, -286.0f);
        this.leftWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 39, 5, 15, 0.0f, -7.0f, 1.0f, 0.0f, -10.0f, 1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, -2.0f, 0.0f, -10.0f, -2.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[2].setRotationPoint(-86.0f, -57.0f, -301.0f);
        this.leftWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 65, 26, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[3].setRotationPoint(-137.0f, -42.5f, -75.0f);
        this.leftWingModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 40, 25, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[4].setRotationPoint(-71.0f, -42.5f, -75.0f);
        this.leftWingModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 26, 26, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f);
        this.leftWingModel[5].setRotationPoint(-141.0f, -42.5f, -75.0f);
        this.leftWingModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 20, 20, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[6].setRotationPoint(-161.0f, -39.5f, -75.0f);
        this.leftWingModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[7].setRotationPoint(-161.0f, -42.5f, -75.0f);
        this.leftWingModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f);
        this.leftWingModel[8].setRotationPoint(-161.0f, -19.5f, -75.0f);
        this.leftWingModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 3, 20, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.leftWingModel[9].setRotationPoint(-164.0f, -39.5f, -75.0f);
        this.leftWingModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 26, 0.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.leftWingModel[10].setRotationPoint(-164.0f, -42.5f, -75.0f);
        this.leftWingModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f);
        this.leftWingModel[11].setRotationPoint(-164.0f, -19.5f, -75.0f);
        this.leftWingModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[12].setRotationPoint(-168.0f, -30.5f, -63.5f);
        this.leftWingModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f);
        this.leftWingModel[13].setRotationPoint(-171.0f, -30.5f, -63.5f);
        this.leftWingModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f);
        this.leftWingModel[14].setRotationPoint(-169.0f, -30.5f, -63.5f);
        this.leftWingModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 42, 26, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[15].setRotationPoint(-114.0f, -46.5f, -143.0f);
        this.leftWingModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 32, 25, 26, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[16].setRotationPoint(-72.0f, -46.5f, -143.0f);
        this.leftWingModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 4, 26, 26, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f);
        this.leftWingModel[17].setRotationPoint(-118.0f, -46.5f, -143.0f);
        this.leftWingModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 20, 20, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[18].setRotationPoint(-138.0f, -43.5f, -143.0f);
        this.leftWingModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f);
        this.leftWingModel[19].setRotationPoint(-138.0f, -23.5f, -143.0f);
        this.leftWingModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f);
        this.leftWingModel[20].setRotationPoint(-141.0f, -23.5f, -143.0f);
        this.leftWingModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 3, 20, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.leftWingModel[21].setRotationPoint(-141.0f, -43.5f, -143.0f);
        this.leftWingModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[22].setRotationPoint(-138.0f, -46.5f, -143.0f);
        this.leftWingModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 26, 0.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.leftWingModel[23].setRotationPoint(-141.0f, -46.5f, -143.0f);
        this.leftWingModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[24].setRotationPoint(-145.0f, -34.5f, -131.5f);
        this.leftWingModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f);
        this.leftWingModel[25].setRotationPoint(-146.0f, -34.5f, -131.5f);
        this.leftWingModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f);
        this.leftWingModel[26].setRotationPoint(-148.0f, -34.5f, -131.5f);
        this.leftWingModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 14, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[27].setRotationPoint(-105.0f, -49.5f, -137.0f);
        this.leftWingModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[28].setRotationPoint(-96.0f, -49.5f, -134.0f);
        this.leftWingModel[28].rotateAngleZ = 0.40142572f;
        this.leftWingModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[29].setRotationPoint(-96.0f, -49.5f, -127.0f);
        this.leftWingModel[29].rotateAngleZ = 0.40142572f;
    }
    
    private void initrightWingModel_1() {
        this.rightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 681, 169, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 905, 153, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 465, 225, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo((ModelBase)this, 257, 161, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo((ModelBase)this, 873, 177, this.textureX, this.textureY);
        this.rightWingModel[7] = new ModelRendererTurbo((ModelBase)this, 297, 193, this.textureX, this.textureY);
        this.rightWingModel[8] = new ModelRendererTurbo((ModelBase)this, 649, 193, this.textureX, this.textureY);
        this.rightWingModel[9] = new ModelRendererTurbo((ModelBase)this, 721, 201, this.textureX, this.textureY);
        this.rightWingModel[10] = new ModelRendererTurbo((ModelBase)this, 585, 105, this.textureX, this.textureY);
        this.rightWingModel[11] = new ModelRendererTurbo((ModelBase)this, 961, 121, this.textureX, this.textureY);
        this.rightWingModel[12] = new ModelRendererTurbo((ModelBase)this, 377, 17, this.textureX, this.textureY);
        this.rightWingModel[13] = new ModelRendererTurbo((ModelBase)this, 841, 17, this.textureX, this.textureY);
        this.rightWingModel[14] = new ModelRendererTurbo((ModelBase)this, 1009, 17, this.textureX, this.textureY);
        this.rightWingModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 217, this.textureX, this.textureY);
        this.rightWingModel[16] = new ModelRendererTurbo((ModelBase)this, 257, 225, this.textureX, this.textureY);
        this.rightWingModel[17] = new ModelRendererTurbo((ModelBase)this, 945, 201, this.textureX, this.textureY);
        this.rightWingModel[18] = new ModelRendererTurbo((ModelBase)this, 649, 225, this.textureX, this.textureY);
        this.rightWingModel[19] = new ModelRendererTurbo((ModelBase)this, 873, 233, this.textureX, this.textureY);
        this.rightWingModel[20] = new ModelRendererTurbo((ModelBase)this, 953, 265, this.textureX, this.textureY);
        this.rightWingModel[21] = new ModelRendererTurbo((ModelBase)this, 625, 273, this.textureX, this.textureY);
        this.rightWingModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 273, this.textureX, this.textureY);
        this.rightWingModel[23] = new ModelRendererTurbo((ModelBase)this, 465, 281, this.textureX, this.textureY);
        this.rightWingModel[24] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.rightWingModel[25] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.rightWingModel[26] = new ModelRendererTurbo((ModelBase)this, 513, 25, this.textureX, this.textureY);
        this.rightWingModel[27] = new ModelRendererTurbo((ModelBase)this, 369, 73, this.textureX, this.textureY);
        this.rightWingModel[28] = new ModelRendererTurbo((ModelBase)this, 985, 57, this.textureX, this.textureY);
        this.rightWingModel[29] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.rightWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 53, 10, 148, 0.0f, 11.0f, -8.0f, 0.0f, 18.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 11.0f, 17.0f, 0.0f, 18.0f, 17.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[0].setRotationPoint(-96.0f, -49.0f, 29.0f);
        this.rightWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 39, 5, 109, 0.0f, 10.0f, -8.0f, 0.0f, 21.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 13.0f, 0.0f, 21.0f, 13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[1].setRotationPoint(-86.0f, -57.0f, 177.0f);
        this.rightWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 39, 5, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 1.0f, -2.0f, -7.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, -2.0f, -2.0f, -7.0f, -2.0f, 0.0f);
        this.rightWingModel[2].setRotationPoint(-86.0f, -57.0f, 286.0f);
        this.rightWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 65, 26, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[3].setRotationPoint(-137.0f, -42.5f, 49.0f);
        this.rightWingModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 40, 25, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[4].setRotationPoint(-71.0f, -42.5f, 49.0f);
        this.rightWingModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 26, 26, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f);
        this.rightWingModel[5].setRotationPoint(-141.0f, -42.5f, 49.0f);
        this.rightWingModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 20, 20, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[6].setRotationPoint(-161.0f, -39.5f, 49.0f);
        this.rightWingModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[7].setRotationPoint(-161.0f, -42.5f, 49.0f);
        this.rightWingModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f);
        this.rightWingModel[8].setRotationPoint(-161.0f, -19.5f, 49.0f);
        this.rightWingModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 3, 20, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.rightWingModel[9].setRotationPoint(-164.0f, -39.5f, 49.0f);
        this.rightWingModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 26, 0.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.rightWingModel[10].setRotationPoint(-164.0f, -42.5f, 49.0f);
        this.rightWingModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f);
        this.rightWingModel[11].setRotationPoint(-164.0f, -19.5f, 49.0f);
        this.rightWingModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[12].setRotationPoint(-168.0f, -30.5f, 60.5f);
        this.rightWingModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f);
        this.rightWingModel[13].setRotationPoint(-171.0f, -30.5f, 60.5f);
        this.rightWingModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f);
        this.rightWingModel[14].setRotationPoint(-169.0f, -30.5f, 60.5f);
        this.rightWingModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 42, 26, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[15].setRotationPoint(-114.0f, -46.5f, 117.0f);
        this.rightWingModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 32, 25, 26, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[16].setRotationPoint(-72.0f, -46.5f, 117.0f);
        this.rightWingModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 4, 26, 26, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f);
        this.rightWingModel[17].setRotationPoint(-118.0f, -46.5f, 117.0f);
        this.rightWingModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 20, 20, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[18].setRotationPoint(-138.0f, -43.5f, 117.0f);
        this.rightWingModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f);
        this.rightWingModel[19].setRotationPoint(-138.0f, -23.5f, 117.0f);
        this.rightWingModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f);
        this.rightWingModel[20].setRotationPoint(-141.0f, -23.5f, 117.0f);
        this.rightWingModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 3, 20, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.rightWingModel[21].setRotationPoint(-141.0f, -43.5f, 117.0f);
        this.rightWingModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[22].setRotationPoint(-138.0f, -46.5f, 117.0f);
        this.rightWingModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 26, 0.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.9f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.rightWingModel[23].setRotationPoint(-141.0f, -46.5f, 117.0f);
        this.rightWingModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[24].setRotationPoint(-145.0f, -34.5f, 128.5f);
        this.rightWingModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f);
        this.rightWingModel[25].setRotationPoint(-146.0f, -34.5f, 128.5f);
        this.rightWingModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f, 0.0f, -0.6f, -0.6f);
        this.rightWingModel[26].setRotationPoint(-148.0f, -34.5f, 128.5f);
        this.rightWingModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 14, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[27].setRotationPoint(-105.0f, -49.5f, 123.0f);
        this.rightWingModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[28].setRotationPoint(-96.0f, -49.5f, 133.0f);
        this.rightWingModel[28].rotateAngleZ = 0.40142572f;
        this.rightWingModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[29].setRotationPoint(-96.0f, -49.5f, 126.0f);
        this.rightWingModel[29].rotateAngleZ = 0.40142572f;
    }
    
    private void inityawFlapModel_1() {
        this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 785, 9, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 457, 41, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo((ModelBase)this, 937, 81, this.textureX, this.textureY);
        this.yawFlapModel[3] = new ModelRendererTurbo((ModelBase)this, 441, 1, this.textureX, this.textureY);
        this.yawFlapModel[4] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.yawFlapModel[0].addShapeBox(0.0f, 0.0f, -1.0f, 18, 18, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.5f, 0.0f, 0.0f, 6.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[0].setRotationPoint(182.0f, -126.0f, 0.0f);
        this.yawFlapModel[1].addShapeBox(0.0f, 0.0f, -1.0f, 24, 16, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[1].setRotationPoint(182.0f, -108.0f, 0.0f);
        this.yawFlapModel[2].addShapeBox(0.0f, 0.0f, -1.0f, 27, 20, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[2].setRotationPoint(182.0f, -92.0f, 0.0f);
        this.yawFlapModel[3].addShapeBox(0.0f, 0.0f, -1.0f, 11, 10, 2, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[3].setRotationPoint(182.0f, -136.0f, 0.0f);
        this.yawFlapModel[4].addShapeBox(-7.0f, 0.0f, -1.0f, 7, 10, 2, 0.0f, -3.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -2.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f);
        this.yawFlapModel[4].setRotationPoint(182.0f, -136.0f, 0.0f);
    }
    
    private void initpitchFlapLeftModel_1() {
        (this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 761, 297, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, 0.0f, 27, 2, 76, 0.0f, 0.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftModel[0].setRotationPoint(182.0f, -62.5f, -79.0f);
    }
    
    private void initpitchFlapRightModel_1() {
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 761, 297, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, 0.0f, 27, 2, 76, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapRightModel[0].setRotationPoint(182.0f, -62.5f, 3.0f);
    }
    
    private void initpitchFlapLeftWingModel_1() {
        (this.pitchFlapLeftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 257, 185, this.textureX, this.textureY)).addShapeBox(0.0f, -4.0f, -74.0f, 26, 8, 148, 0.0f, 0.0f, 0.0f, 0.5f, -9.0f, -2.0f, -1.5f, 0.0f, -11.0f, 4.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.5f, -9.0f, -2.0f, -1.5f, 0.0f, 13.0f, 4.0f, 0.0f, 17.0f, 0.0f);
        this.pitchFlapLeftWingModel[0].setRotationPoint(-34.0f, -44.0f, -103.0f);
        this.pitchFlapLeftWingModel[0].rotateAngleY = -0.12217305f;
    }
    
    private void initpitchFlapRightWingModel_1() {
        (this.pitchFlapRightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 257, 185, this.textureX, this.textureY)).addShapeBox(0.0f, -4.0f, -74.0f, 26, 8, 148, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -11.0f, 4.0f, -9.0f, -2.0f, -1.5f, 0.0f, 0.0f, 0.5f, 0.0f, 17.0f, 0.0f, 0.0f, 13.0f, 4.0f, -9.0f, -2.0f, -1.5f, 0.0f, 0.0f, 0.5f);
        this.pitchFlapRightWingModel[0].setRotationPoint(-34.0f, -44.0f, 103.0f);
        this.pitchFlapRightWingModel[0].rotateAngleY = 0.12217305f;
    }
    
    private void inittailWheelModel_1() {
        this.tailWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 105, this.textureX, this.textureY);
        this.tailWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 625, 105, this.textureX, this.textureY);
        this.tailWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 625, 113, this.textureX, this.textureY);
        this.tailWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 769, 73, this.textureX, this.textureY);
        this.tailWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 585, 105, this.textureX, this.textureY);
        this.tailWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[0].setRotationPoint(175.0f, -41.5f, -2.0f);
        this.tailWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 10, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[1].setRotationPoint(175.0f, -44.5f, -2.0f);
        this.tailWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 10, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.tailWheelModel[2].setRotationPoint(175.0f, -37.5f, -2.0f);
        this.tailWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[3].setRotationPoint(172.0f, -48.5f, -3.0f);
        this.tailWheelModel[3].rotateAngleZ = 0.57595867f;
        this.tailWheelModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[4].setRotationPoint(172.0f, -48.5f, 2.0f);
        this.tailWheelModel[4].rotateAngleZ = 0.57595867f;
    }
    
    private void initleftWingWheelModel_1() {
        this.leftWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 257, 281, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 329, 281, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 505, 281, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.leftWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 1001, 73, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 24, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(-102.0f, -5.0f, -66.0f);
        this.leftWingWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 24, 8, 8, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(-102.0f, -13.0f, -66.0f);
        this.leftWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 24, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(-102.0f, 3.0f, -66.0f);
        this.leftWingWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 6, 19, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(-93.0f, -18.0f, -68.0f);
        this.leftWingWheelModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 6, 19, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[4].setRotationPoint(-93.0f, -18.0f, -58.0f);
    }
    
    private void initrightWingWheelModel_1() {
        this.rightWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 257, 281, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 329, 281, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 505, 281, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.rightWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 1001, 73, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 24, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(-102.0f, -5.0f, 58.0f);
        this.rightWingWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 24, 8, 8, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(-102.0f, -13.0f, 58.0f);
        this.rightWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 24, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(-102.0f, 3.0f, 58.0f);
        this.rightWingWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 6, 19, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(-93.0f, -18.0f, 66.0f);
        this.rightWingWheelModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 6, 19, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[4].setRotationPoint(-93.0f, -18.0f, 56.0f);
    }
    
    private void initPropeller() {
        (this.propellerModels = new ModelRendererTurbo[4][3])[0] = this.makeProp1(-167.5f, -29.0f, -62.0f);
        this.propellerModels[1] = this.makeProp2(-144.5f, -33.0f, -130.0f);
        this.propellerModels[2] = this.makeProp3(-167.5f, -29.0f, 62.0f);
        this.propellerModels[3] = this.makeProp4(-144.5f, -33.0f, 130.0f);
    }
    
    private ModelRendererTurbo[] makeProp1(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY) };
        prop[0].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[1].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[2].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[0].setRotationPoint(i, j, k);
        prop[1].setRotationPoint(i, j, k);
        prop[2].setRotationPoint(i, j, k);
        return prop;
    }
    
    private ModelRendererTurbo[] makeProp2(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY) };
        prop[0].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[1].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[2].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[0].setRotationPoint(i, j, k);
        prop[1].setRotationPoint(i, j, k);
        prop[2].setRotationPoint(i, j, k);
        return prop;
    }
    
    private ModelRendererTurbo[] makeProp3(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY) };
        prop[0].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[1].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[2].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[0].setRotationPoint(i, j, k);
        prop[1].setRotationPoint(i, j, k);
        prop[2].setRotationPoint(i, j, k);
        return prop;
    }
    
    private ModelRendererTurbo[] makeProp4(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY) };
        prop[0].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[1].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[2].addBox(-1.0f, -28.0f, -1.5f, 2, 28, 3, 0.0f);
        prop[0].setRotationPoint(i, j, k);
        prop[1].setRotationPoint(i, j, k);
        prop[2].setRotationPoint(i, j, k);
        return prop;
    }
}
