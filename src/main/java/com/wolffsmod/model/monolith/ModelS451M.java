//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelS451M extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelS451M() {
        this.textureX = 512;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[53];
        this.noseModel = new ModelRendererTurbo[7];
        this.tailModel = new ModelRendererTurbo[12];
        this.leftWingModel = new ModelRendererTurbo[11];
        this.rightWingModel = new ModelRendererTurbo[11];
        this.yawFlapModel = new ModelRendererTurbo[5];
        this.pitchFlapLeftModel = new ModelRendererTurbo[3];
        this.pitchFlapRightModel = new ModelRendererTurbo[2];
        this.tailWheelModel = new ModelRendererTurbo[4];
        this.leftWingWheelModel = new ModelRendererTurbo[8];
        this.rightWingWheelModel = new ModelRendererTurbo[8];
        this.bodyDoorOpenModel = new ModelRendererTurbo[4];
        this.bodyDoorCloseModel = new ModelRendererTurbo[4];
        this.initbodyModel_1();
        this.initnoseModel_1();
        this.inittailModel_1();
        this.initleftWingModel_1();
        this.initrightWingModel_1();
        this.inityawFlapModel_1();
        this.initpitchFlapLeftModel_1();
        this.initpitchFlapRightModel_1();
        this.inittailWheelModel_1();
        this.initleftWingWheelModel_1();
        this.initrightWingWheelModel_1();
        this.initbodyDoorOpenModel_1();
        this.initbodyDoorCloseModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 337, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 145, 17, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 297, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 361, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 449, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 201, 25, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 321, 25, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 393, 25, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 449, 33, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 257, 25, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 449, 25, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 337, 9, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 129, 17, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 393, 9, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 129, 41, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 393, 57, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 289, 33, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 313, 33, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 393, 81, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 465, 89, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 465, 9, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 121, 41, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 249, 17, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 297, 17, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 449, 33, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 313, 41, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 225, 49, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 97, 105, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 8, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 3.0f, 1.0f, 0.0f, 3.0f, 1.0f, 0.0f, 1.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-52.5f, -16.0f, -6.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 8, 4, 12, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.5f, -2.5f, 0.0f, 0.5f, -2.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-52.5f, -20.0f, -6.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 8, 3, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 1.0f, 0.0f, -2.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.8f, -3.5f, 0.0f, 3.0f, -3.0f, 0.0f, 3.0f, -3.0f, 0.0f, 0.8f, -3.5f);
        this.bodyModel[2].setRotationPoint(-52.5f, -11.0f, -6.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 11, 7, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(-44.5f, -16.0f, -7.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[4].setRotationPoint(-44.5f, -9.0f, -7.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.5f, -3.5f, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f, 1.5f, 0.0f, 0.5f, 3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-44.5f, -20.0f, -7.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 7, 2, 1, 0.0f, 0.0f, 0.5f, -1.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.5f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(-40.5f, -18.0f, -7.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 10, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(-33.5f, -16.0f, -7.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.5f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[8].setRotationPoint(-33.5f, -7.0f, -7.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-33.5f, -17.0f, -7.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 20, 10, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-23.5f, -16.0f, -7.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 20, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f);
        this.bodyModel[11].setRotationPoint(-23.5f, -6.0f, -7.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 14, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(-23.5f, -18.0f, -7.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 10, 5, 12, 0.0f, -3.5f, 2.0f, -3.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, -3.5f, 2.0f, -3.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[13].setRotationPoint(-23.5f, -22.5f, -6.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 10, 5, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.5f, -4.9f, -3.2f, 0.5f, -4.9f, -3.2f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, -3.5f, 0.5f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(-13.5f, -22.5f, -4.0f);
        this.bodyModel[15].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(-38.5f, -25.5f, -1.5f);
        this.bodyModel[15].rotateAngleY = 0.2443461f;
        this.bodyModel[15].rotateAngleZ = -0.82030475f;
        this.bodyModel[16].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(-38.5f, -25.5f, 1.5f);
        this.bodyModel[16].rotateAngleY = -0.2443461f;
        this.bodyModel[16].rotateAngleZ = -0.82030475f;
        this.bodyModel[17].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-38.5f, -25.8f, -1.5f);
        this.bodyModel[18].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-35.0f, -27.0f, -1.5f);
        this.bodyModel[19].addShapeBox(-3.5f, -0.5f, -0.5f, 4, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-35.0f, -26.5f, -1.5f);
        this.bodyModel[19].rotateAngleZ = 0.34906584f;
        this.bodyModel[20].addShapeBox(-3.5f, -0.5f, -0.5f, 4, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(-35.0f, -26.5f, 1.5f);
        this.bodyModel[20].rotateAngleZ = 0.34906584f;
        this.bodyModel[21].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(-35.0f, -27.0f, -1.5f);
        this.bodyModel[21].rotateAngleX = -0.41887903f;
        this.bodyModel[21].rotateAngleZ = 0.12217305f;
        this.bodyModel[22].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(-35.0f, -27.0f, 1.5f);
        this.bodyModel[22].rotateAngleX = 0.41887903f;
        this.bodyModel[22].rotateAngleZ = 0.12217305f;
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 19, 8, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(-3.5f, -14.0f, -7.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 19, 4, 14, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -1.5f, -3.5f, 0.0f, -1.5f, -3.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(-3.5f, -18.0f, -7.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 19, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.5f, 0.0f, -0.5f, -4.5f, 0.0f, -0.5f, -4.0f);
        this.bodyModel[25].setRotationPoint(-3.5f, -6.0f, -7.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 19, 8, 12, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, -4.0f, -1.5f, 0.0f, -4.0f, -1.5f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[26].setRotationPoint(15.5f, -14.0f, -6.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 19, 3, 12, 0.0f, 0.0f, -0.5f, -2.5f, 0.0f, -4.5f, -4.0f, 0.0f, -4.5f, -4.0f, 0.0f, -0.5f, -2.5f, 0.0f, 1.0f, 0.5f, 0.0f, 4.0f, -1.5f, 0.0f, 4.0f, -1.5f, 0.0f, 1.0f, 0.5f);
        this.bodyModel[27].setRotationPoint(15.5f, -17.0f, -6.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 14, 2, 2, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 1.5f, 1.5f, 0.0f, 1.5f, 1.5f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 1.5f, 1.5f, 0.0f, 1.5f, 1.5f, 0.0f, 0.4f, 0.4f);
        this.bodyModel[28].setRotationPoint(-47.5f, -6.5f, -1.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 14, 2, 2, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[29].setRotationPoint(-61.5f, -6.5f, -1.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f);
        this.bodyModel[30].setRotationPoint(-64.5f, -6.5f, -1.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 11, 7, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(-44.5f, -16.0f, 6.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.5f, 3.5f, 0.0f, -1.5f, 1.5f, 0.0f, -1.5f, -1.5f, 0.0f, 0.5f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(-44.5f, -20.0f, 6.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 7, 2, 1, 0.0f, 0.0f, 0.5f, 1.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(-40.5f, -18.0f, 6.0f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 10, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(-33.5f, -16.0f, 6.0f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].setRotationPoint(-33.5f, -17.0f, 6.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 19, 3, 9, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.5f, -2.0f);
        this.bodyModel[36].setRotationPoint(15.5f, -6.0f, -4.5f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 30, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 2.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 2.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        this.bodyModel[37].setRotationPoint(-21.5f, -10.0f, -9.0f);
        this.bodyModel[38].addShapeBox(-0.5f, 0.0f, -0.5f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-35.0f, -27.0f, 0.0f);
        this.bodyModel[39].addShapeBox(-0.5f, -0.5f, -0.5f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(-27.0f, -26.5f, 0.0f);
        this.bodyModel[39].rotateAngleZ = -0.34906584f;
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 30, 4, 3, 0.0f, 1.0f, 0.5f, 0.0f, 2.0f, 0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2.0f, 1.0f, 1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(-21.5f, -10.0f, 6.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 18, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.5f, -6.0f, 0.0f, 0.5f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f);
        this.bodyModel[41].setRotationPoint(-45.0f, -20.0f, -9.0f);
        this.bodyModel[41].rotateAngleZ = 0.27925268f;
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.bodyModel[42].setRotationPoint(-41.0f, -20.7f, -1.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].setRotationPoint(-44.5f, -20.5f, -1.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.bodyModel[44].setRotationPoint(-42.0f, -23.55f, -1.0f);
        this.bodyModel[45].addShapeBox(0.0f, 1.0f, 6.0f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[45].setRotationPoint(-45.0f, -20.0f, -9.5f);
        this.bodyModel[45].rotateAngleZ = 0.27925268f;
        this.bodyModel[46].addShapeBox(0.0f, 1.0f, 11.0f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[46].setRotationPoint(-45.0f, -20.0f, -10.5f);
        this.bodyModel[46].rotateAngleZ = 0.27925268f;
        this.bodyModel[47].addShapeBox(0.0f, 4.0f, 11.0f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[47].setRotationPoint(-45.0f, -20.0f, -10.0f);
        this.bodyModel[47].rotateAngleZ = 0.27925268f;
        this.bodyModel[48].addShapeBox(0.0f, 4.0f, 6.0f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[48].setRotationPoint(-45.0f, -20.0f, -10.0f);
        this.bodyModel[48].rotateAngleZ = 0.27925268f;
        this.bodyModel[49].addShapeBox(0.0f, 3.0f, 8.5f, 1, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[49].setRotationPoint(-45.0f, -20.0f, -10.0f);
        this.bodyModel[49].rotateAngleZ = 0.27925268f;
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 2, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[50].setRotationPoint(-25.0f, -24.0f, -1.0f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 3, 12, 4, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f);
        this.bodyModel[51].setRotationPoint(-25.0f, -20.0f, -2.0f);
        this.bodyModel[51].rotateAngleZ = -0.12217305f;
        this.bodyModel[52].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 6, 0.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f);
        this.bodyModel[52].setRotationPoint(-35.0f, -14.0f, -3.0f);
    }
    
    private void initnoseModel_1() {
        this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.noseModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.noseModel[4] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.noseModel[5] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.noseModel[6] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.noseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 9, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.noseModel[0].setRotationPoint(-63.5f, -16.0f, -4.5f);
        this.noseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 9, 0.0f, -2.0f, -1.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, -2.0f, -1.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.noseModel[1].setRotationPoint(-63.5f, -19.0f, -4.5f);
        this.noseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 9, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -3.0f, -2.0f, -0.5f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, -3.0f, -2.0f, -0.5f, -3.0f);
        this.noseModel[2].setRotationPoint(-63.5f, -13.0f, -4.5f);
        this.noseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, -0.5f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, -1.0f);
        this.noseModel[3].setRotationPoint(-64.5f, -16.0f, -1.5f);
        this.noseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 6, 3, 9, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 1.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f);
        this.noseModel[4].setRotationPoint(-58.5f, -19.0f, -4.5f);
        this.noseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 6, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, 1.5f, 0.0f, 2.0f, 1.5f, 0.0f, 0.5f, 0.0f);
        this.noseModel[5].setRotationPoint(-58.5f, -16.0f, -4.5f);
        this.noseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 6, 4, 9, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.0f, 1.5f, 0.0f, -2.0f, 1.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 1.8f, -2.0f, 0.0f, 1.8f, -2.0f, 0.0f, 0.0f, -3.0f);
        this.noseModel[6].setRotationPoint(-58.5f, -13.0f, -4.5f);
    }
    
    private void inittailModel_1() {
        this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 265, 41, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 177, 49, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 329, 17, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 377, 25, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 241, 49, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 305, 49, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo((ModelBase)this, 361, 49, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo((ModelBase)this, 65, 57, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo((ModelBase)this, 489, 25, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo((ModelBase)this, 65, 105, this.textureX, this.textureY);
        this.tailModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 19, 4, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -4.0f, 0.0f, -3.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[0].setRotationPoint(34.5f, -10.0f, -4.5f);
        this.tailModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 19, 2, 9, 0.0f, 0.0f, 0.5f, -2.5f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, 0.5f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, -4.0f, 0.0f, 3.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[1].setRotationPoint(34.5f, -12.0f, -4.5f);
        this.tailModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 19, 2, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -4.0f, 0.0f, -1.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -2.5f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 1.0f, -2.5f);
        this.tailModel[2].setRotationPoint(34.5f, -6.0f, -4.5f);
        this.tailModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -0.3f, 0.0f, 4.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[3].setRotationPoint(53.5f, -8.0f, -0.5f);
        this.tailModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 1, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 4.0f, 0.3f, 0.0f, 4.0f, 0.3f, 0.0f, -0.8f, 0.0f, 0.0f);
        this.tailModel[4].setRotationPoint(53.5f, -11.0f, -0.5f);
        this.tailModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 7, 21, 1, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[5].setRotationPoint(47.5f, -29.0f, -0.5f);
        this.tailModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f);
        this.tailModel[6].setRotationPoint(45.5f, -14.5f, -20.5f);
        this.tailModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 8, 21, 1, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[7].setRotationPoint(39.5f, -29.0f, -0.5f);
        this.tailModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 32, 6, 1, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[8].setRotationPoint(7.5f, -17.0f, -0.5f);
        this.tailModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 1, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[9].setRotationPoint(47.5f, -31.0f, -0.5f);
        this.tailModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 10, 2, 1, 0.0f, 0.0f, 0.5f, 0.0f, -5.0f, -0.2f, 0.0f, -5.0f, -0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[10].setRotationPoint(52.5f, -31.0f, -0.5f);
        this.tailModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 20, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[11].setRotationPoint(45.5f, -14.5f, 0.5f);
    }
    
    private void initleftWingModel_1() {
        this.leftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 153, 57, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 457, 57, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 177, 65, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 217, 73, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo((ModelBase)this, 273, 73, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo((ModelBase)this, 353, 73, this.textureX, this.textureY);
        this.leftWingModel[7] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.leftWingModel[8] = new ModelRendererTurbo((ModelBase)this, 217, 73, this.textureX, this.textureY);
        this.leftWingModel[9] = new ModelRendererTurbo((ModelBase)this, 457, 57, this.textureX, this.textureY);
        this.leftWingModel[10] = new ModelRendererTurbo((ModelBase)this, 353, 73, this.textureX, this.textureY);
        this.leftWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 26, 4, 17, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, 3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[0].setRotationPoint(-21.5f, -10.0f, -26.0f);
        this.leftWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 9, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.leftWingModel[1].setRotationPoint(-27.0f, -10.5f, -30.5f);
        this.leftWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 9, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -1.0f, -3.0f);
        this.leftWingModel[2].setRotationPoint(-27.0f, -7.5f, -30.5f);
        this.leftWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 15, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[3].setRotationPoint(-20.0f, -10.5f, -30.5f);
        this.leftWingModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 15, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f);
        this.leftWingModel[4].setRotationPoint(-20.0f, -7.5f, -30.5f);
        this.leftWingModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[5].setRotationPoint(-5.0f, -10.5f, -29.5f);
        this.leftWingModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.9f, -2.0f, 0.0f, -2.9f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.leftWingModel[6].setRotationPoint(-5.0f, -7.5f, -29.5f);
        this.leftWingModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[7].setRotationPoint(5.5f, -9.5f, -26.5f);
        this.leftWingModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 15, 3, 9, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[8].setRotationPoint(-20.0f, -13.5f, -30.5f);
        this.leftWingModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 9, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.leftWingModel[9].setRotationPoint(-27.0f, -13.5f, -30.5f);
        this.leftWingModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 7, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.9f, -2.0f, 0.0f, -2.9f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[10].setRotationPoint(-5.0f, -13.5f, -29.5f);
    }
    
    private void initrightWingModel_1() {
        this.rightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 169, 89, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 153, 57, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 457, 57, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 177, 65, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 217, 73, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo((ModelBase)this, 273, 73, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo((ModelBase)this, 353, 73, this.textureX, this.textureY);
        this.rightWingModel[7] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.rightWingModel[8] = new ModelRendererTurbo((ModelBase)this, 217, 73, this.textureX, this.textureY);
        this.rightWingModel[9] = new ModelRendererTurbo((ModelBase)this, 457, 57, this.textureX, this.textureY);
        this.rightWingModel[10] = new ModelRendererTurbo((ModelBase)this, 353, 73, this.textureX, this.textureY);
        this.rightWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 26, 4, 17, 0.0f, 0.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f);
        this.rightWingModel[0].setRotationPoint(-21.5f, -10.0f, 9.0f);
        this.rightWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 9, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.rightWingModel[1].setRotationPoint(-27.0f, -10.5f, 21.5f);
        this.rightWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 9, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -1.0f, -3.0f);
        this.rightWingModel[2].setRotationPoint(-27.0f, -7.5f, 21.5f);
        this.rightWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 15, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[3].setRotationPoint(-20.0f, -10.5f, 21.5f);
        this.rightWingModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 15, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f);
        this.rightWingModel[4].setRotationPoint(-20.0f, -7.5f, 21.5f);
        this.rightWingModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[5].setRotationPoint(-5.0f, -10.5f, 22.5f);
        this.rightWingModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.9f, -2.0f, 0.0f, -2.9f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.rightWingModel[6].setRotationPoint(-5.0f, -7.5f, 22.5f);
        this.rightWingModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[7].setRotationPoint(5.5f, -9.5f, 25.5f);
        this.rightWingModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 15, 3, 9, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[8].setRotationPoint(-20.0f, -13.5f, 21.5f);
        this.rightWingModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 9, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.rightWingModel[9].setRotationPoint(-27.0f, -13.5f, 21.5f);
        this.rightWingModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 7, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.9f, -2.0f, 0.0f, -2.9f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[10].setRotationPoint(-5.0f, -13.5f, 22.5f);
    }
    
    private void inityawFlapModel_1() {
        this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 337, 49, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 393, 65, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo((ModelBase)this, 257, 73, this.textureX, this.textureY);
        this.yawFlapModel[3] = new ModelRendererTurbo((ModelBase)this, 449, 9, this.textureX, this.textureY);
        this.yawFlapModel[4] = new ModelRendererTurbo((ModelBase)this, 176, 114, this.textureX, this.textureY);
        this.yawFlapModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 7, 18, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.5f, 0.3f, -0.2f, -0.5f, 0.3f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 4.0f, 3.0f, -0.2f, 4.0f, 3.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.yawFlapModel[0].setRotationPoint(55.5f, -29.0f, 0.0f);
        this.yawFlapModel[0].rotateAngleZ = -0.05235988f;
        this.yawFlapModel[1].addShapeBox(-4.0f, 0.0f, 2.5f, 8, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[1].setRotationPoint(-40.0f, -9.0f, 0.0f);
        this.yawFlapModel[1].rotateAngleZ = -0.43633232f;
        this.yawFlapModel[2].addShapeBox(-4.0f, 0.0f, -5.5f, 8, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[2].setRotationPoint(-40.0f, -9.0f, 0.0f);
        this.yawFlapModel[2].rotateAngleZ = -0.43633232f;
        this.yawFlapModel[3].addShapeBox(-3.0f, -0.95f, -6.5f, 1, 1, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[3].setRotationPoint(-40.0f, -8.8f, 0.0f);
        this.yawFlapModel[3].rotateAngleZ = -0.43633232f;
        this.yawFlapModel[4].addShapeBox(-0.1f, 8.0f, -0.5f, 5, 3, 1, 0.0f, 0.0f, 1.0f, -0.1f, 3.0f, 1.0f, -0.1f, 3.0f, 1.0f, -0.1f, 0.0f, 1.0f, -0.1f, 0.0f, 1.0f, -0.1f, 4.2f, 1.0f, -0.1f, 4.2f, 1.0f, -0.1f, 0.0f, 1.0f, -0.1f);
        this.yawFlapModel[4].setRotationPoint(55.5f, -29.0f, 0.0f);
        this.yawFlapModel[4].rotateAngleZ = -0.05235988f;
    }
    
    private void initpitchFlapLeftModel_1() {
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 361, 49, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.pitchFlapLeftModel[2] = new ModelRendererTurbo((ModelBase)this, 505, 65, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 21, 0.0f, 0.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, 2.0f, -0.1f, 0.5f, 0.0f, -0.1f, 1.0f, 0.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, 2.0f, -0.1f, 0.5f, 0.0f, -0.1f, 1.0f);
        this.pitchFlapLeftModel[0].setRotationPoint(49.5f, -14.5f, -23.5f);
        this.pitchFlapLeftModel[1].addShapeBox(-3.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.3f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 1.0f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 1.0f, -0.1f, 0.0f);
        this.pitchFlapLeftModel[1].setRotationPoint(49.5f, -14.5f, -23.5f);
        this.pitchFlapLeftModel[2].addShapeBox(-0.5f, -16.0f, -0.5f, 1, 15, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftModel[2].setRotationPoint(-36.0f, -5.0f, 0.0f);
    }
    
    private void initpitchFlapRightModel_1() {
        this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 121, 105, this.textureX, this.textureY);
        this.pitchFlapRightModel[1] = new ModelRendererTurbo((ModelBase)this, 201, 25, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 21, 0.0f, 0.0f, -0.1f, 1.0f, 2.0f, -0.1f, 0.5f, -1.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 1.0f, 2.0f, -0.1f, 0.5f, -1.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f);
        this.pitchFlapRightModel[0].setRotationPoint(49.5f, -14.5f, 2.5f);
        this.pitchFlapRightModel[1].addShapeBox(-3.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 1.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f, 1.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f);
        this.pitchFlapRightModel[1].setRotationPoint(49.5f, -14.5f, 20.5f);
    }
    
    private void inittailWheelModel_1() {
        this.tailWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 49, this.textureX, this.textureY);
        this.tailWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 65, this.textureX, this.textureY);
        this.tailWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 305, 65, this.textureX, this.textureY);
        this.tailWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 73, this.textureX, this.textureY);
        this.tailWheelModel[0].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 1, 2, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[0].setRotationPoint(54.0f, -5.0f, -1.0f);
        this.tailWheelModel[0].rotateAngleZ = -0.6981317f;
        this.tailWheelModel[1].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[1].setRotationPoint(55.2f, -2.7f, -0.5f);
        this.tailWheelModel[2].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.tailWheelModel[2].setRotationPoint(55.2f, -0.7f, -0.5f);
        this.tailWheelModel[3].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[3].setRotationPoint(55.2f, -4.7f, -0.5f);
    }
    
    private void initleftWingWheelModel_1() {
        this.leftWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 393, 49, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 137, 57, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 289, 57, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 377, 33, this.textureX, this.textureY);
        this.leftWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 177, 41, this.textureX, this.textureY);
        this.leftWingWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.leftWingWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY);
        this.leftWingWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 153, 17, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(-22.0f, 4.0f, -18.5f);
        this.leftWingWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(-22.0f, 7.0f, -18.5f);
        this.leftWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 3, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(-22.0f, 1.0f, -18.5f);
        this.leftWingWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 10, 3, 1, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(-22.5f, 0.0f, -20.0f);
        this.leftWingWheelModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 10, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.leftWingWheelModel[4].setRotationPoint(-22.5f, 3.0f, -20.0f);
        this.leftWingWheelModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 6, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[5].setRotationPoint(-18.5f, -6.0f, -20.0f);
        this.leftWingWheelModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[6].setRotationPoint(-18.0f, -7.0f, -19.0f);
        this.leftWingWheelModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.leftWingWheelModel[7].setRotationPoint(-18.0f, -7.0f, -13.0f);
        this.leftWingWheelModel[7].rotateAngleX = -0.7853982f;
    }
    
    private void initrightWingWheelModel_1() {
        this.rightWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 153, 89, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 417, 89, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 425, 49, this.textureX, this.textureY);
        this.rightWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 217, 65, this.textureX, this.textureY);
        this.rightWingWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 201, 17, this.textureX, this.textureY);
        this.rightWingWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.rightWingWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 505, 33, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(-22.0f, 4.0f, 15.5f);
        this.rightWingWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(-22.0f, 7.0f, 15.5f);
        this.rightWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 3, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(-22.0f, 1.0f, 15.5f);
        this.rightWingWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 10, 3, 1, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(-22.5f, 0.0f, 19.0f);
        this.rightWingWheelModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 10, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.rightWingWheelModel[4].setRotationPoint(-22.5f, 3.0f, 19.0f);
        this.rightWingWheelModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 6, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[5].setRotationPoint(-18.5f, -6.0f, 19.0f);
        this.rightWingWheelModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[6].setRotationPoint(-18.0f, -7.0f, 18.0f);
        this.rightWingWheelModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.rightWingWheelModel[7].setRotationPoint(-18.0f, -7.0f, 12.5f);
        this.rightWingWheelModel[7].rotateAngleX = 0.7853982f;
    }
    
    private void initbodyDoorOpenModel_1() {
        this.bodyDoorOpenModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.bodyDoorOpenModel[1] = new ModelRendererTurbo((ModelBase)this, 257, 33, this.textureX, this.textureY);
        this.bodyDoorOpenModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.bodyDoorOpenModel[3] = new ModelRendererTurbo((ModelBase)this, 257, 33, this.textureX, this.textureY);
        this.bodyDoorOpenModel[0].addShapeBox(0.0f, -1.0f, -36.0f, 26, 3, 36, 0.0f, -2.0f, 1.5f, 0.0f, -11.0f, 1.5f, 0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.0f, -3.0f, 0.0f, -11.0f, -3.0f, 0.5f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f);
        this.bodyDoorOpenModel[0].setRotationPoint(-21.5f, -13.5f, -28.0f);
        this.bodyDoorOpenModel[0].rotateAngleX = -1.9198622f;
        this.bodyDoorOpenModel[1].addShapeBox(0.0f, -2.5f, -38.0f, 13, 1, 2, 0.0f, -2.0f, 0.2f, 0.0f, -6.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, 0.0f);
        this.bodyDoorOpenModel[1].setRotationPoint(-19.5f, -13.5f, -28.0f);
        this.bodyDoorOpenModel[1].rotateAngleX = -1.9198622f;
        this.bodyDoorOpenModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 26, 3, 36, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -11.0f, 1.5f, 0.5f, -2.0f, 1.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -11.0f, -3.0f, 0.5f, -2.0f, -3.0f, 0.0f);
        this.bodyDoorOpenModel[2].setRotationPoint(-21.5f, -13.5f, 28.0f);
        this.bodyDoorOpenModel[2].rotateAngleX = 1.9198622f;
        this.bodyDoorOpenModel[3].addShapeBox(0.0f, -1.5f, 36.0f, 13, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -6.0f, 0.2f, 0.0f, -2.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.5f, -6.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[3].setRotationPoint(-19.5f, -13.5f, 28.0f);
        this.bodyDoorOpenModel[3].rotateAngleX = 1.9198622f;
    }
    
    private void initbodyDoorCloseModel_1() {
        this.bodyDoorCloseModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.bodyDoorCloseModel[1] = new ModelRendererTurbo((ModelBase)this, 257, 33, this.textureX, this.textureY);
        this.bodyDoorCloseModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.bodyDoorCloseModel[3] = new ModelRendererTurbo((ModelBase)this, 257, 33, this.textureX, this.textureY);
        this.bodyDoorCloseModel[0].addShapeBox(0.0f, 0.0f, -36.0f, 26, 3, 36, 0.0f, -2.0f, 1.5f, 0.0f, -11.0f, 1.5f, 0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.0f, -3.0f, 0.0f, -11.0f, -3.0f, 0.5f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f);
        this.bodyDoorCloseModel[0].setRotationPoint(-21.5f, -10.5f, -26.0f);
        this.bodyDoorCloseModel[1].addShapeBox(0.0f, 0.0f, -38.0f, 13, 1, 2, 0.0f, -2.0f, 0.2f, 0.0f, -6.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, 0.0f);
        this.bodyDoorCloseModel[1].setRotationPoint(-19.5f, -12.0f, -26.0f);
        this.bodyDoorCloseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 26, 3, 36, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -11.0f, 1.5f, 0.5f, -2.0f, 1.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -11.0f, -3.0f, 0.5f, -2.0f, -3.0f, 0.0f);
        this.bodyDoorCloseModel[2].setRotationPoint(-21.5f, -10.5f, 26.0f);
        this.bodyDoorCloseModel[3].addShapeBox(0.0f, 0.0f, 36.0f, 13, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -6.0f, 0.2f, 0.0f, -2.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.5f, -6.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[3].setRotationPoint(-19.5f, -12.0f, 26.0f);
    }
}