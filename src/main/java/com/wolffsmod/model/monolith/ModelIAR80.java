//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelIAR80 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelIAR80() {
        this.textureX = 1024;
        this.textureY = 256;
        this.bodyModel = new ModelRendererTurbo[48];
        this.noseModel = new ModelRendererTurbo[13];
        this.tailModel = new ModelRendererTurbo[3];
        this.leftWingModel = new ModelRendererTurbo[4];
        this.rightWingModel = new ModelRendererTurbo[4];
        this.yawFlapModel = new ModelRendererTurbo[4];
        this.pitchFlapLeftModel = new ModelRendererTurbo[2];
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[1];
        this.leftWingWheelModel = new ModelRendererTurbo[4];
        this.rightWingWheelModel = new ModelRendererTurbo[4];
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
        this.initleftWingWheelModel_1();
        this.initrightWingWheelModel_1();
        this.initPropeller();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 561, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 657, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 729, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 769, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 825, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 881, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 793, 17, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 561, 25, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 777, 33, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 881, 33, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 153, 41, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 985, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 985, 9, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 185, 41, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 289, 41, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 649, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 977, 33, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 257, 41, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 393, 9, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 561, 1, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 745, 1, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 825, 1, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 889, 1, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 401, 1, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 169, 17, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 257, 9, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 473, 1, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 1017, 9, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 657, 1, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 137, 9, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 473, 9, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 37, 10, 22, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 2.0f);
        this.bodyModel[0].setRotationPoint(-63.0f, -31.0f, -11.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 37, 6, 10, 0.0f, 0.0f, 2.5f, 1.0f, 2.0f, 3.0f, -1.0f, 2.0f, 3.0f, -1.0f, 0.0f, 2.5f, 1.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 8.0f);
        this.bodyModel[1].setRotationPoint(-63.0f, -37.0f, -5.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 37, 7, 10, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, -2.0f, 6.0f, 0.0f, -2.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[2].setRotationPoint(-63.0f, -21.0f, -5.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 7, 12, 0.0f, 0.0f, 0.0f, 6.5f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 6.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[3].setRotationPoint(-67.0f, -21.0f, -6.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 8, 12, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 6.5f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 7.0f, 0.0f, 0.0f, 6.5f);
        this.bodyModel[4].setRotationPoint(-67.0f, -39.0f, -6.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 10, 26, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[5].setRotationPoint(-67.0f, -31.0f, -13.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 24, 13, 1, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(-26.0f, -31.0f, -10.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 24, 5, 10, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -2.0f, 0.0f, -1.5f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(-26.0f, -19.0f, -5.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 8, 9, 1, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, -5.0f, -3.0f, 0.0f, -5.0f, 3.0f, 0.0f, 0.0f, 5.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(-21.0f, -40.0f, -9.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 1, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.15f);
        this.bodyModel[9].setRotationPoint(-13.0f, -35.0f, -9.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 2.0f, -6.0f, 0.0f, 2.0f, 6.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.3f);
        this.bodyModel[10].setRotationPoint(-3.0f, -35.0f, -9.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 42, 12, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, -4.5f, 0.0f, 1.5f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -4.5f, 0.0f, -4.0f, -4.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(-2.0f, -31.0f, -9.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 24, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 1.0f);
        this.bodyModel[12].setRotationPoint(-26.0f, -31.0f, 9.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 8, 9, 1, 0.0f, 0.0f, 0.0f, 5.5f, 0.0f, -5.0f, 3.0f, 0.0f, -5.0f, -3.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[13].setRotationPoint(-21.0f, -40.0f, 8.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 1, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.4f);
        this.bodyModel[14].setRotationPoint(-13.0f, -35.0f, 8.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 3.5f, 0.0f, 2.0f, 6.0f, 0.0f, 2.0f, -6.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.4f);
        this.bodyModel[15].setRotationPoint(-3.0f, -35.0f, 8.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 42, 4, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -4.5f, 0.0f, 4.0f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -6.0f, 0.0f, -4.0f, -7.5f, 0.0f, -4.0f, -7.5f, 0.0f, -0.5f, -6.0f);
        this.bodyModel[16].setRotationPoint(-2.0f, -19.0f, -9.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 42, 6, 18, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -4.5f, 0.0f, -1.5f, -4.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-2.0f, -37.0f, -9.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 42, 3, 5, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -5.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -1.0f, 0.0f, 4.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-2.0f, -40.0f, -2.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 42, 2, 4, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, -1.0f, 0.0f, 5.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-2.0f, -42.0f, -2.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 21, 6, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.5f, 0.5f, 0.0f, -5.5f, -2.0f, 0.0f, -5.5f, -2.0f, 0.0f, -1.5f, 0.5f);
        this.bodyModel[20].setRotationPoint(40.0f, -37.0f, -4.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, -1.0f, 16, 19, 2, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(45.0f, -56.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, -1.0f, 15, 3, 2, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(52.0f, -59.0f, 0.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, -1.0f, 11, 2, 2, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(54.0f, -61.0f, 0.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 16, 2, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f);
        this.bodyModel[24].setRotationPoint(41.0f, -35.5f, 0.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 16, 2, 32, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(41.0f, -35.5f, -32.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(-17.5f, -44.5f, 3.0f);
        this.bodyModel[26].rotateAngleX = 0.2443461f;
        this.bodyModel[26].rotateAngleZ = 0.36651915f;
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(-17.5f, -44.5f, -4.0f);
        this.bodyModel[27].rotateAngleX = -0.2443461f;
        this.bodyModel[27].rotateAngleZ = 0.36651915f;
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 4.0f, 0.0f, -1.0f, -4.0f, 0.0f, -1.0f, -4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 1.0f);
        this.bodyModel[28].setRotationPoint(-17.5f, -44.5f, -4.7f);
        this.bodyModel[28].rotateAngleZ = -0.10471976f;
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(-17.5f, -44.5f, -2.5f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(-3.0f, -42.0f, -2.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(-3.0f, -38.0f, -3.0f);
        this.bodyModel[31].rotateAngleZ = -0.12217305f;
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 8, 10, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(-12.0f, -28.0f, -3.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 5, 9, 1, 0.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f, 3.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 5.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[33].setRotationPoint(-26.0f, -40.0f, -5.0f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 5, 9, 1, 0.0f, -2.0f, 0.0f, 3.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, 5.5f, 0.0f, 0.0f, 6.0f);
        this.bodyModel[34].setRotationPoint(-26.0f, -40.0f, 4.0f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[35].setRotationPoint(-18.5f, -38.8f, -4.5f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f);
        this.bodyModel[36].setRotationPoint(-18.5f, -38.8f, 1.5f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(-18.0f, -36.8f, -1.5f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 7, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-25.5f, -38.5f, -1.5f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f, 0.0f, -0.5f, -0.1f, 0.0f, -0.5f, -0.1f, 0.0f, -0.5f, -0.1f, 0.0f, -0.5f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f);
        this.bodyModel[39].setRotationPoint(-18.5f, -37.5f, -1.5f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(-18.3f, -37.5f, -4.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[41].setRotationPoint(-18.3f, -34.9f, -6.0f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[42].setRotationPoint(-18.3f, -34.9f, 3.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[43].setRotationPoint(-18.3f, -36.9f, 1.8f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[44].setRotationPoint(-18.3f, -36.9f, 3.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f);
        this.bodyModel[45].setRotationPoint(-18.5f, -37.8f, -1.5f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[46].setRotationPoint(-18.5f, -37.8f, -0.5f);
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, -1.0f, 4.0f, 0.0f, -1.0f);
        this.bodyModel[47].setRotationPoint(-17.5f, -44.5f, 3.7f);
        this.bodyModel[47].rotateAngleZ = -0.10471976f;
    }
    
    private void initnoseModel_1() {
        this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.noseModel[3] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.noseModel[4] = new ModelRendererTurbo((ModelBase)this, 313, 1, this.textureX, this.textureY);
        this.noseModel[5] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.noseModel[6] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.noseModel[7] = new ModelRendererTurbo((ModelBase)this, 377, 41, this.textureX, this.textureY);
        this.noseModel[8] = new ModelRendererTurbo((ModelBase)this, 713, 41, this.textureX, this.textureY);
        this.noseModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.noseModel[10] = new ModelRendererTurbo((ModelBase)this, 545, 49, this.textureX, this.textureY);
        this.noseModel[11] = new ModelRendererTurbo((ModelBase)this, 41, 57, this.textureX, this.textureY);
        this.noseModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.noseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 10, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.noseModel[0].setRotationPoint(-83.0f, -31.5f, -13.0f);
        this.noseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 12, 8, 26, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -0.5f, -8.5f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.noseModel[1].setRotationPoint(-83.0f, -39.5f, -13.0f);
        this.noseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 8, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, -8.5f, 0.0f, 0.0f, -8.5f, 0.0f, 0.5f, -8.0f);
        this.noseModel[2].setRotationPoint(-83.0f, -21.5f, -13.0f);
        this.noseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -2.0f, -8.5f, 0.0f, 0.5f, -8.0f, 0.0f, 0.5f, -8.0f, 0.0f, -2.0f, -8.5f);
        this.noseModel[3].setRotationPoint(-90.0f, -21.5f, -13.0f);
        this.noseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 26, 0.0f, 0.0f, -2.5f, -9.5f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, -2.5f, -9.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.noseModel[4].setRotationPoint(-90.0f, -39.5f, -13.0f);
        this.noseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 7, 10, 26, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.noseModel[5].setRotationPoint(-90.0f, -31.5f, -13.0f);
        this.noseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 5, 10, 10, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -3.0f, -3.0f);
        this.noseModel[6].setRotationPoint(-101.0f, -31.5f, -5.0f);
        this.noseModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 6, 10, 10, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.2f, -0.2f);
        this.noseModel[7].setRotationPoint(-96.0f, -31.5f, -5.0f);
        this.noseModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 26, 0.0f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.noseModel[8].setRotationPoint(-71.5f, -39.5f, -13.0f);
        this.noseModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 26, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -8.5f, 0.0f, 0.5f, -8.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, -8.5f);
        this.noseModel[9].setRotationPoint(-71.5f, -21.5f, -13.0f);
        this.noseModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 5, 10, 26, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.noseModel[10].setRotationPoint(-71.5f, -31.5f, -13.0f);
        this.noseModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 12, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.noseModel[11].setRotationPoint(-83.0f, -13.5f, -3.0f);
        this.noseModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 6, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.noseModel[12].setRotationPoint(-71.0f, -13.5f, -3.0f);
    }
    
    private void inittailModel_1() {
        this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 665, 25, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 769, 17, this.textureX, this.textureY);
        this.tailModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 21, 9, 9, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 4.5f, -2.5f, 0.0f, 4.5f, -2.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f);
        this.tailModel[0].setRotationPoint(40.0f, -32.0f, -4.5f);
        this.tailModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 21, 4, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -11.0f, -1.5f, -4.0f, -11.0f, -1.5f, -4.0f, 0.0f, 0.0f, -3.0f);
        this.tailModel[1].setRotationPoint(40.0f, -23.0f, -4.5f);
        this.tailModel[2].addShapeBox(0.0f, 0.0f, -1.0f, 7, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f);
        this.tailModel[2].setRotationPoint(50.0f, -22.0f, 0.0f);
    }
    
    private void initleftWingModel_1() {
        this.leftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 145, 57, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 177, 17, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 257, 17, this.textureX, this.textureY);
        this.leftWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 21, 4, 84, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, -3.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 8.0f, 2.0f, 4.0f, 0.0f, 2.0f, 4.0f);
        this.leftWingModel[0].setRotationPoint(-64.0f, -24.0f, -94.5f);
        this.leftWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 23, 3, 10, 0.0f, -4.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -0.3f, 0.5f, -8.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[1].setRotationPoint(-61.0f, -24.0f, -104.5f);
        this.leftWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[2].setRotationPoint(-66.0f, -22.0f, -39.5f);
        this.leftWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.leftWingModel[3].setRotationPoint(-65.0f, -22.0f, -42.5f);
    }
    
    private void initrightWingModel_1() {
        this.rightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 529, 49, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 913, 49, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 217, 9, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 241, 9, this.textureX, this.textureY);
        this.rightWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 21, 4, 84, 0.0f, 0.0f, 0.0f, 4.0f, 8.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 2.0f, 4.0f, 8.0f, 2.0f, 4.0f, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f);
        this.rightWingModel[0].setRotationPoint(-64.0f, -24.0f, 10.5f);
        this.rightWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 23, 3, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -0.3f, 0.0f, -4.0f, -0.3f, 0.5f);
        this.rightWingModel[1].setRotationPoint(-61.0f, -24.0f, 94.5f);
        this.rightWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[2].setRotationPoint(-66.0f, -22.0f, 38.5f);
        this.rightWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.rightWingModel[3].setRotationPoint(-65.0f, -22.0f, 41.5f);
    }
    
    private void inityawFlapModel_1() {
        this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 361, 1, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo((ModelBase)this, 281, 41, this.textureX, this.textureY);
        this.yawFlapModel[3] = new ModelRendererTurbo((ModelBase)this, 361, 41, this.textureX, this.textureY);
        this.yawFlapModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 13, 14, 1, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, -1.5f, -3.5f, 0.0f, -1.5f, -3.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.yawFlapModel[0].setRotationPoint(61.0f, -37.0f, 0.0f);
        this.yawFlapModel[1].addShapeBox(0.0f, 0.0f, -0.5f, 13, 19, 1, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[1].setRotationPoint(61.0f, -56.0f, 0.0f);
        this.yawFlapModel[2].addShapeBox(-4.0f, 0.0f, 3.5f, 8, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[2].setRotationPoint(-19.0f, -23.3f, 0.0f);
        this.yawFlapModel[2].rotateAngleZ = -0.6981317f;
        this.yawFlapModel[3].addShapeBox(-4.0f, 0.0f, -7.5f, 8, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[3].setRotationPoint(-19.0f, -23.3f, 0.0f);
        this.yawFlapModel[3].rotateAngleZ = -0.6981317f;
    }
    
    private void initpitchFlapLeftModel_1() {
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 481, 41, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo((ModelBase)this, 993, 33, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShapeBox(0.0f, -0.5f, 0.0f, 11, 2, 30, 0.0f, 0.0f, -0.2f, 0.0f, -5.0f, -0.2f, -3.0f, 1.0f, -0.2f, -5.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -5.0f, -0.2f, -3.0f, 1.0f, -0.2f, -5.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapLeftModel[0].setRotationPoint(57.0f, -35.0f, -32.0f);
        this.pitchFlapLeftModel[1].addShapeBox(-0.5f, -12.0f, -0.5f, 1, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftModel[1].setRotationPoint(-13.0f, -24.3f, 0.0f);
    }
    
    private void initpitchFlapRightModel_1() {
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 393, 41, this.textureX, this.textureY)).addShapeBox(0.0f, -0.5f, 0.0f, 11, 2, 30, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, -5.0f, -5.0f, -0.2f, -3.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, -5.0f, -5.0f, -0.2f, -3.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapRightModel[0].setRotationPoint(57.0f, -35.0f, 2.0f);
    }
    
    private void initpitchFlapLeftWingModel_1() {
        (this.pitchFlapLeftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 697, 65, this.textureX, this.textureY)).addShapeBox(0.0f, -1.5f, -42.0f, 5, 3, 84, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.5f, -0.5f, 2.0f, 1.0f, 0.0f, 0.0f, 2.0f, 0.0f);
        this.pitchFlapLeftWingModel[0].setRotationPoint(-39.0f, -22.0f, -52.5f);
        this.pitchFlapLeftWingModel[0].rotateAngleY = -0.09599311f;
    }
    
    private void initpitchFlapRightWingModel_1() {
        (this.pitchFlapRightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 817, 49, this.textureX, this.textureY)).addShapeBox(0.0f, -1.5f, -42.0f, 5, 3, 84, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 1.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.0f, 0.0f);
        this.pitchFlapRightWingModel[0].setRotationPoint(-39.0f, -22.0f, 52.5f);
        this.pitchFlapRightWingModel[0].rotateAngleY = 0.09599311f;
    }
    
    private void initleftWingWheelModel_1() {
        this.leftWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 753, 41, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 289, 49, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 537, 41, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(-64.0f, 2.0f, -36.0f);
        this.leftWingWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(-64.0f, 6.0f, -36.0f);
        this.leftWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(-64.0f, -2.0f, -36.0f);
        this.leftWingWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 5, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(-57.0f, -20.0f, -37.5f);
        this.leftWingWheelModel[3].rotateAngleZ = -0.17453294f;
    }
    
    private void initrightWingWheelModel_1() {
        this.rightWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 289, 17, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 849, 17, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 849, 25, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 1009, 17, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(-64.0f, 2.0f, 33.0f);
        this.rightWingWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(-64.0f, 6.0f, 33.0f);
        this.rightWingWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 3, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(-64.0f, -2.0f, 33.0f);
        this.rightWingWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 5, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(-57.0f, -20.0f, 35.5f);
        this.rightWingWheelModel[3].rotateAngleZ = -0.17453294f;
    }
    
    private void initPropeller() {
        (this.propellerModels = new ModelRendererTurbo[1][3])[0] = this.makeProp1(-94.0f, -26.5f, 0.0f);
    }
    
    private ModelRendererTurbo[] makeProp1(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 523, 49, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 523, 49, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 523, 49, this.textureX, this.textureY) };
        prop[0].addBox(-1.0f, -24.0f, -1.5f, 2, 24, 3, 0.0f);
        prop[1].addBox(-1.0f, -24.0f, -1.5f, 2, 24, 3, 0.0f);
        prop[2].addBox(-1.0f, -24.0f, -1.5f, 2, 24, 3, 0.0f);
        prop[0].setRotationPoint(i, j, k);
        prop[1].setRotationPoint(i, j, k);
        prop[2].setRotationPoint(i, j, k);
        return prop;
    }
}
