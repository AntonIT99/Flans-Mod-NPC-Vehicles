//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelS49 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelS49() {
        this.textureX = 512;
        this.textureY = 256;
        this.bodyModel = new ModelRendererTurbo[52];
        this.noseModel = new ModelRendererTurbo[29];
        this.tailModel = new ModelRendererTurbo[14];
        this.leftWingModel = new ModelRendererTurbo[6];
        this.rightWingModel = new ModelRendererTurbo[6];
        this.yawFlapModel = new ModelRendererTurbo[4];
        this.pitchFlapLeftModel = new ModelRendererTurbo[2];
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[1];
        this.tailWheelModel = new ModelRendererTurbo[4];
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
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 209, 25, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 265, 25, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 329, 25, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 161, 33, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 449, 33, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 217, 49, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 377, 41, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 313, 57, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 105, 73, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 305, 49, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 433, 57, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 209, 73, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 345, 1, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 385, 97, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 385, 105, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 1, 105, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 121, 113, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 49, 145, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 145, 145, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 129, 9, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 185, 97, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 489, 97, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 153, 153, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 305, 57, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 249, 25, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 273, 25, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 313, 25, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 337, 25, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 457, 25, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 169, 41, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 17, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-40.0f, -31.0f, -7.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 15, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-40.0f, -35.0f, -7.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 2, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.5f, -4.0f);
        this.bodyModel[2].setRotationPoint(-40.0f, -14.0f, -7.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 14, 2, 15, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, -4.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.5f, -4.0f, 0.0f, -0.5f, -4.0f);
        this.bodyModel[3].setRotationPoint(-54.0f, -14.0f, -7.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 10, 2, 15, 0.0f, 0.0f, 2.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, -0.5f, 0.0f, -2.0f, -4.5f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, -2.0f, -4.5f);
        this.bodyModel[4].setRotationPoint(-64.0f, -14.5f, -7.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 15, 0.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-28.0f, -35.0f, -7.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 11, 17, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(-28.0f, -31.0f, -7.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.5f, -4.0f);
        this.bodyModel[7].setRotationPoint(-28.0f, -14.0f, -7.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 36, 17, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(-17.0f, -31.0f, -7.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 36, 2, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, -1.5f, -4.5f, 0.0f, -1.5f, -4.5f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[9].setRotationPoint(-17.0f, -14.0f, -7.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 8, 5, 7, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f);
        this.bodyModel[10].setRotationPoint(-17.0f, -36.0f, -7.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 28, 5, 7, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -6.0f);
        this.bodyModel[11].setRotationPoint(-9.0f, -36.0f, -7.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 42, 17, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.5f, -3.5f, 0.0f, -5.5f, -3.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(19.0f, -31.0f, -7.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 42, 1, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.5f, -3.5f, 0.0f, 5.5f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -4.0f, -15.0f, -3.8f, -4.0f, -15.0f, -3.8f, -4.0f, 0.0f, -0.5f, -4.0f);
        this.bodyModel[13].setRotationPoint(19.0f, -14.0f, -7.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 42, 5, 14, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -6.5f, 0.0f, 0.0f, -6.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(19.0f, -36.0f, -7.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 12, 2, 4, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f, 2.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 2.0f, 0.0f, 0.5f);
        this.bodyModel[15].setRotationPoint(21.0f, -38.0f, -2.0f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 26, 2, 4, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 3.0f, -1.5f, 0.0f, 3.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[16].setRotationPoint(33.0f, -38.0f, -2.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[17].setRotationPoint(21.5f, -49.0f, -0.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 36, 17, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-17.0f, -31.0f, 6.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 8, 5, 7, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-17.0f, -36.0f, 0.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 28, 5, 7, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.15f);
        this.bodyModel[20].setRotationPoint(-9.0f, -36.0f, 0.5f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(-12.0f, -41.0f, -2.5f);
        this.bodyModel[21].rotateAngleZ = -0.7853982f;
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(-12.0f, -41.0f, 1.5f);
        this.bodyModel[22].rotateAngleZ = -0.7853982f;
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(-12.0f, -41.0f, -2.5f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, -0.5f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(-9.0f, -40.0f, -3.0f);
        this.bodyModel[24].rotateAngleX = -0.2443461f;
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, -0.5f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(-9.0f, -40.0f, 3.0f);
        this.bodyModel[25].rotateAngleX = 0.2443461f;
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(-12.0f, -41.0f, -2.5f);
        this.bodyModel[26].rotateAngleY = -0.27925268f;
        this.bodyModel[26].rotateAngleZ = -0.20943952f;
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, -1.0f, 4, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(-12.0f, -41.0f, 2.5f);
        this.bodyModel[27].rotateAngleY = 0.27925268f;
        this.bodyModel[27].rotateAngleZ = -0.20943952f;
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(-9.0f, -42.0f, 0.0f);
        this.bodyModel[28].rotateAngleX = -0.41887903f;
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, -4.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(-9.0f, -42.0f, 0.0f);
        this.bodyModel[29].rotateAngleX = 0.41887903f;
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, -4.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(3.0f, -42.0f, 0.0f);
        this.bodyModel[30].rotateAngleX = 0.41887903f;
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(3.0f, -42.0f, 0.0f);
        this.bodyModel[31].rotateAngleX = -0.41887903f;
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, -0.5f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(3.0f, -40.5f, -3.0f);
        this.bodyModel[32].rotateAngleX = -0.13962634f;
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, -0.5f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(3.0f, -40.5f, 3.0f);
        this.bodyModel[33].rotateAngleX = 0.13962634f;
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 40, 2, 4, 0.0f, -7.0f, 0.0f, 0.0f, 1.0f, -1.0f, 6.0f, 16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 6.0f, 16.0f, 0.0f, 0.0f, 4.0f, 1.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(-33.0f, -17.0f, -7.0f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 40, 1, 4, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 6.0f, 16.0f, 2.0f, 0.0f, 4.0f, 1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -1.0f, 6.0f, 16.0f, -1.5f, 0.0f, 0.0f, 0.4f, -0.5f);
        this.bodyModel[35].setRotationPoint(-33.0f, -13.0f, -7.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 23, 4, 10, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f);
        this.bodyModel[36].setRotationPoint(5.0f, -14.0f, -5.0f);
        this.bodyModel[36].rotateAngleZ = 0.08726646f;
        this.bodyModel[37].addShapeBox(0.0f, 4.0f, 0.0f, 23, 3, 8, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, -0.5f, 0.0f, -2.0f, -0.5f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.bodyModel[37].setRotationPoint(5.0f, -14.0f, -4.0f);
        this.bodyModel[37].rotateAngleZ = 0.08726646f;
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 40, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 1.0f, -1.0f, 6.0f, -7.0f, 0.0f, 0.0f, 4.0f, 1.0f, 0.0f, 16.0f, 0.0f, 0.0f, 1.0f, 1.0f, 6.0f, 1.0f, 1.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-33.0f, -17.0f, 3.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 40, 1, 4, 0.0f, 4.0f, 1.0f, 0.0f, 16.0f, 2.0f, 0.0f, 1.0f, 1.0f, 6.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.4f, -0.5f, 16.0f, -1.5f, 0.0f, 1.0f, -1.0f, 6.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(-33.0f, -13.0f, 3.0f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[40].setRotationPoint(2.0f, -40.0f, -1.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 3, 18, 2, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f);
        this.bodyModel[41].setRotationPoint(2.0f, -36.0f, -1.0f);
        this.bodyModel[41].rotateAngleZ = -0.12217305f;
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 6, 9, 2, 0.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f);
        this.bodyModel[42].setRotationPoint(-5.0f, -24.0f, -1.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 18, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.5f, -7.0f, 0.0f, 0.5f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.8f, -2.0f, 0.0f, 0.8f, -2.0f, 0.0f, 0.8f, -2.0f, 0.0f, 0.8f, -2.0f);
        this.bodyModel[43].setRotationPoint(-17.0f, -35.7f, -9.0f);
        this.bodyModel[43].rotateAngleZ = 0.27925268f;
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.bodyModel[44].setRotationPoint(-13.0f, -36.4f, -1.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[45].setRotationPoint(-16.5f, -36.2f, -1.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.bodyModel[46].setRotationPoint(-14.0f, -39.25f, -1.0f);
        this.bodyModel[47].addShapeBox(0.0f, 1.0f, 6.0f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[47].setRotationPoint(-17.0f, -35.7f, -9.5f);
        this.bodyModel[47].rotateAngleZ = 0.27925268f;
        this.bodyModel[48].addShapeBox(0.0f, 1.0f, 11.0f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[48].setRotationPoint(-17.0f, -35.7f, -10.5f);
        this.bodyModel[48].rotateAngleZ = 0.27925268f;
        this.bodyModel[49].addShapeBox(0.0f, 4.0f, 11.0f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[49].setRotationPoint(-17.0f, -35.7f, -10.0f);
        this.bodyModel[49].rotateAngleZ = 0.27925268f;
        this.bodyModel[50].addShapeBox(0.0f, 4.0f, 6.0f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[50].setRotationPoint(-17.0f, -35.7f, -10.0f);
        this.bodyModel[50].rotateAngleZ = 0.27925268f;
        this.bodyModel[51].addShapeBox(0.0f, 3.0f, 8.5f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[51].setRotationPoint(-17.0f, -35.7f, -10.0f);
        this.bodyModel[51].rotateAngleZ = 0.27925268f;
    }
    
    private void initnoseModel_1() {
        this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.noseModel[3] = new ModelRendererTurbo((ModelBase)this, 281, 1, this.textureX, this.textureY);
        this.noseModel[4] = new ModelRendererTurbo((ModelBase)this, 345, 1, this.textureX, this.textureY);
        this.noseModel[5] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.noseModel[6] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.noseModel[7] = new ModelRendererTurbo((ModelBase)this, 465, 9, this.textureX, this.textureY);
        this.noseModel[8] = new ModelRendererTurbo((ModelBase)this, 385, 17, this.textureX, this.textureY);
        this.noseModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.noseModel[10] = new ModelRendererTurbo((ModelBase)this, 417, 25, this.textureX, this.textureY);
        this.noseModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 121, this.textureX, this.textureY);
        this.noseModel[12] = new ModelRendererTurbo((ModelBase)this, 145, 33, this.textureX, this.textureY);
        this.noseModel[13] = new ModelRendererTurbo((ModelBase)this, 241, 145, this.textureX, this.textureY);
        this.noseModel[14] = new ModelRendererTurbo((ModelBase)this, 489, 33, this.textureX, this.textureY);
        this.noseModel[15] = new ModelRendererTurbo((ModelBase)this, 417, 17, this.textureX, this.textureY);
        this.noseModel[16] = new ModelRendererTurbo((ModelBase)this, 201, 33, this.textureX, this.textureY);
        this.noseModel[17] = new ModelRendererTurbo((ModelBase)this, 369, 33, this.textureX, this.textureY);
        this.noseModel[18] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.noseModel[19] = new ModelRendererTurbo((ModelBase)this, 441, 41, this.textureX, this.textureY);
        this.noseModel[20] = new ModelRendererTurbo((ModelBase)this, 97, 57, this.textureX, this.textureY);
        this.noseModel[21] = new ModelRendererTurbo((ModelBase)this, 225, 89, this.textureX, this.textureY);
        this.noseModel[22] = new ModelRendererTurbo((ModelBase)this, 385, 89, this.textureX, this.textureY);
        this.noseModel[23] = new ModelRendererTurbo((ModelBase)this, 417, 17, this.textureX, this.textureY);
        this.noseModel[24] = new ModelRendererTurbo((ModelBase)this, 201, 33, this.textureX, this.textureY);
        this.noseModel[25] = new ModelRendererTurbo((ModelBase)this, 369, 33, this.textureX, this.textureY);
        this.noseModel[26] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.noseModel[27] = new ModelRendererTurbo((ModelBase)this, 441, 41, this.textureX, this.textureY);
        this.noseModel[28] = new ModelRendererTurbo((ModelBase)this, 97, 57, this.textureX, this.textureY);
        this.noseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 14, 17, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.noseModel[0].setRotationPoint(-54.0f, -31.0f, -7.5f);
        this.noseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 10, 14, 15, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 2.5f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 0.5f, -0.5f);
        this.noseModel[1].setRotationPoint(-64.0f, -31.0f, -7.5f);
        this.noseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 14, 11, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, -0.5f, 0.0f, -0.5f, -0.5f, -4.5f, -0.5f, 0.0f, 0.5f, 1.5f, 0.0f, 0.5f, 1.5f, -0.5f, -4.5f, -0.5f);
        this.noseModel[2].setRotationPoint(-76.0f, -31.0f, -5.5f);
        this.noseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 14, 3, 15, 0.0f, 0.0f, 0.2f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 0.2f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.noseModel[3].setRotationPoint(-54.0f, -34.0f, -7.5f);
        this.noseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 10, 3, 15, 0.0f, 0.0f, -0.5f, -4.5f, 0.0f, 0.2f, -4.0f, 0.0f, 0.2f, -4.0f, 0.0f, -0.5f, -4.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.noseModel[4].setRotationPoint(-64.0f, -34.0f, -7.5f);
        this.noseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 12, 3, 11, 0.0f, -0.5f, -1.5f, -3.5f, 0.0f, -0.5f, -2.5f, 0.0f, -0.5f, -2.5f, -0.5f, -1.5f, -3.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, -0.5f, 0.0f, -0.5f);
        this.noseModel[5].setRotationPoint(-76.0f, -34.0f, -5.5f);
        this.noseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f);
        this.noseModel[6].setRotationPoint(-84.5f, -28.0f, -6.0f);
        this.noseModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 12, 0.0f, -4.5f, -1.0f, -4.0f, 0.0f, 0.2f, -4.0f, 0.0f, 0.2f, -4.0f, -4.5f, -1.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f);
        this.noseModel[7].setRotationPoint(-84.5f, -32.0f, -6.0f);
        this.noseModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -4.5f, -1.0f, -4.0f, 0.0f, 0.2f, -4.0f, 0.0f, 0.2f, -4.0f, -4.5f, -1.0f, -4.0f);
        this.noseModel[8].setRotationPoint(-84.5f, -24.0f, -6.0f);
        this.noseModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 4, 0.0f, 0.0f, -1.7f, -1.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.7f, -1.7f, 0.0f, -1.7f, -1.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.7f, -1.7f);
        this.noseModel[9].setRotationPoint(-86.5f, -28.0f, -2.0f);
        this.noseModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 12, 2, 11, 0.0f, -0.5f, 2.5f, -0.5f, 0.0f, -2.5f, 1.5f, 0.0f, -2.5f, 1.5f, -0.5f, 2.5f, -0.5f, -0.5f, -2.2f, -3.5f, 0.0f, 2.5f, -2.5f, 0.0f, 2.5f, -2.5f, -0.5f, -2.2f, -3.5f);
        this.noseModel[10].setRotationPoint(-76.0f, -19.0f, -5.5f);
        this.noseModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 25, 7, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 3.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 3.0f, 0.0f, 1.0f);
        this.noseModel[11].setRotationPoint(-64.0f, -24.0f, -10.5f);
        this.noseModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 5, 5, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.5f, -1.5f, 4.0f, -2.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -1.5f, 4.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.noseModel[12].setRotationPoint(-39.0f, -23.0f, -10.5f);
        this.noseModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 25, 7, 4, 0.0f, 3.0f, 0.0f, 1.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.noseModel[13].setRotationPoint(-64.0f, -24.0f, 6.5f);
        this.noseModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 5, 5, 4, 0.0f, 0.0f, 0.5f, 0.0f, 4.0f, -2.0f, 0.0f, 0.0f, -1.5f, -1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -2.5f, 0.0f, 0.0f, -2.0f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.noseModel[14].setRotationPoint(-39.0f, -23.0f, 6.5f);
        this.noseModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.noseModel[15].setRotationPoint(-64.0f, -29.0f, -9.0f);
        this.noseModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.noseModel[16].setRotationPoint(-61.0f, -29.0f, -9.0f);
        this.noseModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.noseModel[17].setRotationPoint(-58.0f, -29.0f, -9.0f);
        this.noseModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.noseModel[18].setRotationPoint(-55.0f, -29.0f, -9.0f);
        this.noseModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.noseModel[19].setRotationPoint(-52.0f, -29.0f, -9.0f);
        this.noseModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.noseModel[20].setRotationPoint(-49.0f, -29.0f, -9.0f);
        this.noseModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.noseModel[21].setRotationPoint(-55.0f, -35.0f, -4.0f);
        this.noseModel[21].rotateAngleZ = -0.03490659f;
        this.noseModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.noseModel[22].setRotationPoint(-55.0f, -35.0f, 3.0f);
        this.noseModel[22].rotateAngleZ = -0.03490659f;
        this.noseModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f);
        this.noseModel[23].setRotationPoint(-64.0f, -29.0f, 5.0f);
        this.noseModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f);
        this.noseModel[24].setRotationPoint(-61.0f, -29.0f, 5.0f);
        this.noseModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f);
        this.noseModel[25].setRotationPoint(-58.0f, -29.0f, 5.0f);
        this.noseModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f);
        this.noseModel[26].setRotationPoint(-55.0f, -29.0f, 5.0f);
        this.noseModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f);
        this.noseModel[27].setRotationPoint(-52.0f, -29.0f, 5.0f);
        this.noseModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -2.0f);
        this.noseModel[28].setRotationPoint(-49.0f, -29.0f, 5.0f);
    }
    
    private void inittailModel_1() {
        this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 433, 81, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 329, 9, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 281, 73, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 425, 1, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 161, 9, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 145, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo((ModelBase)this, 249, 25, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo((ModelBase)this, 313, 25, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo((ModelBase)this, 57, 201, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo((ModelBase)this, 73, 81, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo((ModelBase)this, 273, 97, this.textureX, this.textureY);
        this.tailModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 26, 11, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -3.0f, -3.0f, 0.5f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, -9.0f, -2.5f, -3.0f, -9.0f, -2.5f, -3.0f, 0.0f, 0.5f, 0.0f);
        this.tailModel[0].setRotationPoint(61.0f, -31.0f, -3.5f);
        this.tailModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 26, 5, 7, 0.0f, 0.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.5f, 3.0f, -3.0f, 0.5f, 3.0f, -3.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[1].setRotationPoint(61.0f, -36.0f, -3.5f);
        this.tailModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 14, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[2].setRotationPoint(59.0f, -41.0f, -0.5f);
        this.tailModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 14, 15, 1, 0.0f, -6.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[3].setRotationPoint(59.0f, -56.0f, -0.5f);
        this.tailModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, -1.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[4].setRotationPoint(65.5f, -60.0f, -0.5f);
        this.tailModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.2f, 0.0f, -1.2f, -1.2f, 0.0f, -1.2f, -1.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[5].setRotationPoint(74.5f, -60.0f, -0.5f);
        this.tailModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[6].setRotationPoint(69.5f, -60.0f, -0.5f);
        this.tailModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 1, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[7].setRotationPoint(72.5f, -60.0f, -0.5f);
        this.tailModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 10, 2, 27, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f);
        this.tailModel[8].setRotationPoint(64.0f, -36.0f, -27.0f);
        this.tailModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 7, 2, 7, 0.0f, -2.5f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[9].setRotationPoint(67.0f, -36.0f, -34.0f);
        this.tailModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 7, 0.0f, 0.0f, 0.0f, -0.5f, -2.5f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -2.5f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[10].setRotationPoint(74.0f, -36.0f, -34.0f);
        this.tailModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 10, 2, 27, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.tailModel[11].setRotationPoint(64.0f, -36.0f, 0.0f);
        this.tailModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 7, 2, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -2.5f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -2.5f, 0.0f, -2.0f);
        this.tailModel[12].setRotationPoint(67.0f, -36.0f, 27.0f);
        this.tailModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5f);
        this.tailModel[13].setRotationPoint(74.0f, -36.0f, 27.0f);
    }
    
    private void initleftWingModel_1() {
        this.leftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 273, 89, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 97, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 161, 97, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 281, 137, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 105, 57, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo((ModelBase)this, 121, 97, this.textureX, this.textureY);
        this.leftWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 41, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 6.0f, -1.0f, -6.0f, -7.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 1.0f, -6.0f, 1.0f, 1.0f, 0.0f);
        this.leftWingModel[0].setRotationPoint(-33.0f, -17.0f, -48.0f);
        this.leftWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 40, 0.0f, -5.0f, 1.0f, 0.0f, 0.0f, 0.2f, 0.0f, 6.0f, -0.7f, 0.0f, -5.0f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[1].setRotationPoint(-30.0f, -17.0f, -88.0f);
        this.leftWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 41, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, -1.0f, -6.0f, 1.0f, -1.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 6.0f, 0.0f, -6.0f, -2.0f, 1.0f, 0.0f);
        this.leftWingModel[2].setRotationPoint(-33.0f, -15.0f, -48.0f);
        this.leftWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 40, 0.0f, -3.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 6.0f, -0.7f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.leftWingModel[3].setRotationPoint(-30.0f, -15.0f, -88.0f);
        this.leftWingModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 20, 1, 11, 0.0f, -9.0f, 0.0f, -2.0f, -3.0f, -0.3f, -2.0f, 2.5f, -0.7f, 0.0f, -5.0f, 0.0f, 0.0f, -6.5f, 1.0f, 0.5f, -1.0f, 1.0f, 0.5f, 4.5f, 1.2f, 0.0f, -3.0f, 1.0f, 0.0f);
        this.leftWingModel[4].setRotationPoint(-30.0f, -18.0f, -99.0f);
        this.leftWingModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 20, 1, 11, 0.0f, -6.5f, 1.0f, 0.5f, -1.0f, 1.0f, 0.5f, 4.5f, 0.8f, 0.0f, -3.0f, 1.0f, 0.0f, -7.5f, -1.5f, -0.4f, -3.0f, -1.2f, -0.8f, 2.5f, -0.9f, 0.0f, -5.0f, -1.0f, 0.0f);
        this.leftWingModel[5].setRotationPoint(-30.0f, -15.0f, -99.0f);
    }
    
    private void initrightWingModel_1() {
        this.rightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 41, 153, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 161, 161, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 241, 185, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 369, 161, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 449, 129, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo((ModelBase)this, 369, 137, this.textureX, this.textureY);
        this.rightWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 41, 0.0f, -7.0f, 0.0f, 0.0f, 6.0f, -1.0f, -6.0f, 0.0f, -1.0f, 0.0f, -8.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 6.0f, 1.0f, -6.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightWingModel[0].setRotationPoint(-33.0f, -17.0f, 7.0f);
        this.rightWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 40, 0.0f, -5.0f, 0.0f, 0.0f, 6.0f, -0.7f, 0.0f, 0.0f, 0.2f, 0.0f, -5.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f);
        this.rightWingModel[1].setRotationPoint(-30.0f, -17.0f, 48.0f);
        this.rightWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 41, 0.0f, 1.0f, -1.0f, 0.0f, 6.0f, -1.0f, -6.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -2.0f, 1.0f, 0.0f, 6.0f, 0.0f, -6.0f, 0.0f, -1.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.rightWingModel[2].setRotationPoint(-33.0f, -15.0f, 7.0f);
        this.rightWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 40, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 6.0f, -0.7f, 0.0f, 0.0f, -2.0f, 0.0f, -5.0f, -2.0f, 0.0f);
        this.rightWingModel[3].setRotationPoint(-30.0f, -15.0f, 48.0f);
        this.rightWingModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 20, 1, 11, 0.0f, -5.0f, 0.0f, 0.0f, 2.5f, -0.7f, 0.0f, -3.0f, -0.3f, -2.0f, -9.0f, 0.0f, -2.0f, -3.0f, 1.0f, 0.0f, 4.5f, 1.2f, 0.0f, -1.0f, 1.0f, 0.5f, -6.5f, 1.0f, 0.5f);
        this.rightWingModel[4].setRotationPoint(-30.0f, -18.0f, 88.0f);
        this.rightWingModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 20, 1, 11, 0.0f, -3.0f, 1.0f, 0.0f, 4.5f, 0.8f, 0.0f, -1.0f, 1.0f, 0.5f, -6.5f, 1.0f, 0.5f, -5.0f, -1.0f, 0.0f, 2.5f, -0.9f, 0.0f, -3.0f, -1.2f, -0.8f, -7.5f, -1.5f, -0.4f);
        this.rightWingModel[5].setRotationPoint(-30.0f, -15.0f, 88.0f);
    }
    
    private void inityawFlapModel_1() {
        this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 257, 89, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo((ModelBase)this, 449, 113, this.textureX, this.textureY);
        this.yawFlapModel[3] = new ModelRendererTurbo((ModelBase)this, 289, 145, this.textureX, this.textureY);
        this.yawFlapModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 6, 20, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[0].setRotationPoint(73.0f, -56.0f, 0.0f);
        this.yawFlapModel[1].addShapeBox(-4.0f, 0.0f, 2.5f, 8, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[1].setRotationPoint(-11.0f, -20.3f, 0.0f);
        this.yawFlapModel[1].rotateAngleZ = -0.43633232f;
        this.yawFlapModel[2].addShapeBox(-4.0f, 0.0f, -5.5f, 8, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[2].setRotationPoint(-11.0f, -20.3f, 0.0f);
        this.yawFlapModel[2].rotateAngleZ = -0.43633232f;
        this.yawFlapModel[3].addShapeBox(-3.0f, -0.95f, -7.0f, 1, 1, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[3].setRotationPoint(-11.0f, -20.3f, 0.0f);
        this.yawFlapModel[3].rotateAngleZ = -0.43633232f;
    }
    
    private void initpitchFlapLeftModel_1() {
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 449, 97, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo((ModelBase)this, 305, 97, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 25, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.5f, 0.0f, 2.0f, -0.5f, -1.0f, 0.0f, -0.2f, 1.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.5f, 0.0f, 2.0f, -0.5f, -1.0f, 0.0f, -0.2f, 1.5f);
        this.pitchFlapLeftModel[0].setRotationPoint(74.0f, -36.0f, -27.0f);
        this.pitchFlapLeftModel[1].addShapeBox(-0.5f, -16.0f, -0.5f, 1, 19, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftModel[1].setRotationPoint(-7.0f, -16.5f, 0.0f);
    }
    
    private void initpitchFlapRightModel_1() {
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 113, 209, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 25, 0.0f, 0.0f, -0.2f, 1.5f, 2.0f, -0.5f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 1.5f, 2.0f, -0.5f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapRightModel[0].setRotationPoint(74.0f, -36.0f, 2.0f);
    }
    
    private void initpitchFlapLeftWingModel_1() {
        (this.pitchFlapLeftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 393, 113, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, -20.0f, 6, 2, 40, 0.0f, 0.0f, 0.2f, 0.0f, -1.5f, -0.2f, -0.7f, -0.3f, -1.0f, 1.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, -1.5f, -1.2f, -0.7f, -0.3f, -0.3f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftWingModel[0].setRotationPoint(-6.9f, -15.5f, -68.0f);
        this.pitchFlapLeftWingModel[0].rotateAngleY = -0.148353f;
    }
    
    private void initpitchFlapRightWingModel_1() {
        (this.pitchFlapRightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 201, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, -20.0f, 6, 2, 40, 0.0f, 0.0f, -0.5f, 0.0f, -0.3f, -1.0f, 1.0f, -1.5f, -0.2f, -0.7f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, -0.3f, 1.0f, -1.5f, -1.2f, -0.7f, 0.0f, -1.0f, 0.0f);
        this.pitchFlapRightWingModel[0].setRotationPoint(-6.9f, -15.5f, 68.0f);
        this.pitchFlapRightWingModel[0].rotateAngleY = 0.148353f;
    }
    
    private void inittailWheelModel_1() {
        this.tailWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 369, 25, this.textureX, this.textureY);
        this.tailWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.tailWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 225, 9, this.textureX, this.textureY);
        this.tailWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 161, 33, this.textureX, this.textureY);
        this.tailWheelModel[0].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 1, 2, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[0].setRotationPoint(63.0f, -20.0f, -1.0f);
        this.tailWheelModel[0].rotateAngleZ = -0.6981317f;
        this.tailWheelModel[1].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[1].setRotationPoint(64.2f, -17.7f, -0.5f);
        this.tailWheelModel[2].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.tailWheelModel[2].setRotationPoint(64.2f, -15.7f, -0.5f);
        this.tailWheelModel[3].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[3].setRotationPoint(64.2f, -19.7f, -0.5f);
    }
    
    private void initleftWingWheelModel_1() {
        this.leftWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 273, 113, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 385, 113, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 273, 121, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 385, 121, this.textureX, this.textureY);
        this.leftWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 121, 129, this.textureX, this.textureY);
        this.leftWingWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 497, 9, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(-28.0f, 2.5f, -35.0f);
        this.leftWingWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(-28.0f, -1.5f, -35.0f);
        this.leftWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(-28.0f, 6.5f, -35.0f);
        this.leftWingWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 13, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(-28.0f, 1.5f, -36.0f);
        this.leftWingWheelModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 13, 6, 1, 0.0f, -10.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[4].setRotationPoint(-28.0f, -4.5f, -36.0f);
        this.leftWingWheelModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 6, 9, 1, 0.0f, -2.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[5].setRotationPoint(-18.0f, -13.5f, -36.0f);
    }
    
    private void initrightWingWheelModel_1() {
        this.rightWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 153, 129, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 137, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 449, 145, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 481, 145, this.textureX, this.textureY);
        this.rightWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 153, this.textureX, this.textureY);
        this.rightWingWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 217, 49, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(-28.0f, 2.5f, 32.0f);
        this.rightWingWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(-28.0f, -1.5f, 32.0f);
        this.rightWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(-28.0f, 6.5f, 32.0f);
        this.rightWingWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 13, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(-28.0f, 1.5f, 35.0f);
        this.rightWingWheelModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 13, 6, 1, 0.0f, -10.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[4].setRotationPoint(-28.0f, -4.5f, 35.0f);
        this.rightWingWheelModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 6, 9, 1, 0.0f, -2.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[5].setRotationPoint(-18.0f, -13.5f, 35.0f);
    }
    
    private void initPropeller() {
        (this.propellerModels = new ModelRendererTurbo[1][3])[0] = this.makeProp1(-78.0f, -26.0f, 0.0f);
    }
    
    private ModelRendererTurbo[] makeProp1(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 186, 208, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 186, 208, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 186, 208, this.textureX, this.textureY) };
        prop[0].addBox(-1.0f, -32.0f, -1.5f, 2, 32, 3, 0.0f);
        prop[1].addBox(-1.0f, -32.0f, -1.5f, 2, 32, 3, 0.0f);
        prop[2].addBox(-1.0f, -32.0f, -1.5f, 2, 32, 3, 0.0f);
        prop[0].setRotationPoint(i, j, k);
        prop[1].setRotationPoint(i, j, k);
        prop[2].setRotationPoint(i, j, k);
        return prop;
    }
}
