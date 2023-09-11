//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelP11 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelP11() {
        this.textureX = 1024;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[81];
        this.noseModel = new ModelRendererTurbo[7];
        this.tailModel = new ModelRendererTurbo[4];
        this.leftWingModel = new ModelRendererTurbo[4];
        this.rightWingModel = new ModelRendererTurbo[4];
        this.yawFlapModel = new ModelRendererTurbo[5];
        this.pitchFlapLeftModel = new ModelRendererTurbo[2];
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[1];
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
        this.initPropeller();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 473, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 537, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 577, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 617, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 673, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 729, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 833, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 873, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 617, 17, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 857, 25, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 745, 33, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 977, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 521, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 169, 41, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 345, 41, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 409, 41, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 729, 41, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 793, 41, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 473, 49, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 673, 65, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 873, 57, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 409, 73, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 49, 81, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 121, 81, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 273, 9, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 385, 9, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 977, 9, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 1009, 1, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 1009, 33, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 137, 41, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 169, 41, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 233, 41, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 265, 41, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 281, 41, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 385, 17, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 297, 1, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 473, 1, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase)this, 585, 1, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase)this, 673, 1, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo((ModelBase)this, 737, 1, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo((ModelBase)this, 161, 9, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo((ModelBase)this, 417, 9, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo((ModelBase)this, 569, 33, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo((ModelBase)this, 321, 41, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo((ModelBase)this, 977, 41, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo((ModelBase)this, 137, 49, this.textureX, this.textureY);
        this.bodyModel[69] = new ModelRendererTurbo((ModelBase)this, 361, 1, this.textureX, this.textureY);
        this.bodyModel[70] = new ModelRendererTurbo((ModelBase)this, 233, 9, this.textureX, this.textureY);
        this.bodyModel[71] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[72] = new ModelRendererTurbo((ModelBase)this, 345, 41, this.textureX, this.textureY);
        this.bodyModel[73] = new ModelRendererTurbo((ModelBase)this, 225, 17, this.textureX, this.textureY);
        this.bodyModel[74] = new ModelRendererTurbo((ModelBase)this, 361, 17, this.textureX, this.textureY);
        this.bodyModel[75] = new ModelRendererTurbo((ModelBase)this, 529, 17, this.textureX, this.textureY);
        this.bodyModel[76] = new ModelRendererTurbo((ModelBase)this, 721, 17, this.textureX, this.textureY);
        this.bodyModel[77] = new ModelRendererTurbo((ModelBase)this, 857, 17, this.textureX, this.textureY);
        this.bodyModel[78] = new ModelRendererTurbo((ModelBase)this, 865, 17, this.textureX, this.textureY);
        this.bodyModel[79] = new ModelRendererTurbo((ModelBase)this, 409, 17, this.textureX, this.textureY);
        this.bodyModel[80] = new ModelRendererTurbo((ModelBase)this, 537, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 18, 12, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-44.0f, -31.0f, -10.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 18, 6, 10, 0.0f, 0.0f, 0.5f, 0.0f, 2.0f, 1.5f, -1.0f, 2.0f, 1.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f);
        this.bodyModel[1].setRotationPoint(-44.0f, -37.0f, -5.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 18, 5, 10, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, -1.0f, 5.0f, 0.0f, -1.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[2].setRotationPoint(-44.0f, -19.0f, -5.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 10, 0.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(-51.0f, -19.0f, -5.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 7, 6, 10, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 4.5f);
        this.bodyModel[4].setRotationPoint(-51.0f, -37.0f, -5.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 7, 12, 20, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[5].setRotationPoint(-51.0f, -31.0f, -10.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 24, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(-26.0f, -31.0f, -10.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 24, 5, 10, 0.0f, 0.0f, -1.0f, 5.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, -1.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -2.0f, 0.0f, -1.5f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(-26.0f, -19.0f, -5.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 5, 9, 1, 0.0f, 0.0f, -1.5f, -5.5f, 0.0f, -5.0f, -3.0f, 0.0f, -5.0f, 3.0f, 0.0f, -1.5f, 5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(-15.0f, -40.0f, -9.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.15f);
        this.bodyModel[9].setRotationPoint(-10.0f, -35.0f, -9.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 2.0f, -6.0f, 0.0f, 2.0f, 6.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.3f);
        this.bodyModel[10].setRotationPoint(-6.0f, -35.0f, -9.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 42, 12, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, -4.5f, 0.0f, 1.5f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -4.5f, 0.0f, -5.0f, -4.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(-2.0f, -31.0f, -9.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 24, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(-26.0f, -31.0f, 9.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 5, 9, 1, 0.0f, 0.0f, -1.5f, 5.5f, 0.0f, -5.0f, 3.0f, 0.0f, -5.0f, -3.0f, 0.0f, -1.5f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(-15.0f, -40.0f, 8.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.15f);
        this.bodyModel[14].setRotationPoint(-10.0f, -35.0f, 8.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 3.5f, 0.0f, 2.0f, 6.0f, 0.0f, 2.0f, -6.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.3f);
        this.bodyModel[15].setRotationPoint(-6.0f, -35.0f, 8.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 42, 4, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, -4.5f, 0.0f, 5.0f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -6.0f, 0.0f, -5.0f, -7.5f, 0.0f, -5.0f, -7.5f, 0.0f, -0.5f, -6.0f);
        this.bodyModel[16].setRotationPoint(-2.0f, -19.0f, -9.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 42, 6, 18, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -4.5f, 0.0f, -1.5f, -4.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-2.0f, -37.0f, -9.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 42, 3, 5, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -5.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -1.0f, 0.0f, 4.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-2.0f, -40.0f, -2.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 42, 2, 4, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, -1.0f, 0.0f, 5.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-2.0f, -42.0f, -2.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 21, 6, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.5f, 0.5f, 0.0f, -5.5f, -2.0f, 0.0f, -5.5f, -2.0f, 0.0f, -1.5f, 0.5f);
        this.bodyModel[20].setRotationPoint(40.0f, -37.0f, -4.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, -1.0f, 16, 19, 2, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(45.0f, -56.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, -1.0f, 15, 3, 2, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(52.0f, -59.0f, 0.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, -1.0f, 11, 2, 2, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(54.0f, -61.0f, 0.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, -1.0f, 7, 4, 2, 0.0f, 0.0f, -3.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(40.0f, -40.0f, 0.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 15, 2, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f);
        this.bodyModel[25].setRotationPoint(45.0f, -35.5f, 0.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 15, 2, 32, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(45.0f, -35.5f, -32.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 15, 2, 32, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(45.0f, -35.5f, -32.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 23, 1, 10, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 3.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(-49.0f, -40.0f, -10.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 23, 2, 15, 0.0f, 0.0f, 4.0f, 0.0f, 15.0f, 4.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 15.0f, -2.0f, 0.0f, 2.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(-49.0f, -43.0f, -25.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 36, 4, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(-49.0f, -48.0f, -43.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 23, 1, 10, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 2.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 2.5f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(-49.0f, -40.0f, 0.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 23, 2, 15, 0.0f, 0.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 15.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f, 1.0f, 0.0f, 15.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(-49.0f, -43.0f, 10.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 36, 4, 18, 0.0f, 0.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(-49.0f, -48.0f, 25.0f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(-45.0f, -46.0f, 9.0f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].setRotationPoint(-30.0f, -46.0f, 9.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(-46.0f, -46.0f, -41.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(-31.0f, -46.0f, -41.0f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-50.0f, 2.0f, 24.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(-50.0f, 6.0f, 24.0f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(-50.0f, -2.0f, 24.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 2, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, -1.0f, 15.0f, 0.0f, -1.0f, 15.0f);
        this.bodyModel[41].setRotationPoint(-45.0f, -20.0f, 8.0f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 2, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 15.0f, 0.0f, -16.0f, -14.0f, 0.0f, -16.0f, -14.0f, -1.0f, 15.0f, 15.0f, -1.0f, 15.0f);
        this.bodyModel[42].setRotationPoint(-30.0f, -20.0f, 8.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].setRotationPoint(-50.0f, 2.0f, -26.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.bodyModel[44].setRotationPoint(-50.0f, 6.0f, -26.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[45].setRotationPoint(-50.0f, -2.0f, -26.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 2, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 15.0f, 0.0f, -1.0f, 15.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f);
        this.bodyModel[46].setRotationPoint(-45.0f, -20.0f, -10.0f);
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, 0.0f, 2, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 15.0f, -1.0f, 15.0f, -14.0f, -1.0f, 15.0f, -14.0f, 0.0f, -16.0f, 15.0f, 0.0f, -16.0f);
        this.bodyModel[47].setRotationPoint(-30.0f, -20.0f, -10.0f);
        this.bodyModel[48].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[48].setRotationPoint(-53.0f, -47.0f, 35.0f);
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[49].setRotationPoint(-53.0f, -47.0f, -36.0f);
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[50].setRotationPoint(-16.0f, -43.5f, 3.0f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, -1.0f, 4.0f, 0.0f, -1.0f);
        this.bodyModel[51].setRotationPoint(-20.0f, -43.5f, 2.4f);
        this.bodyModel[52].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[52].setRotationPoint(-20.0f, -43.5f, 1.0f);
        this.bodyModel[53].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[53].setRotationPoint(-16.0f, -43.5f, -4.0f);
        this.bodyModel[54].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 4.0f, 0.0f, -1.0f, -4.0f, 0.0f, -1.0f, -4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 1.0f);
        this.bodyModel[54].setRotationPoint(-20.0f, -43.5f, -3.4f);
        this.bodyModel[55].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[55].setRotationPoint(-20.0f, -43.5f, -2.0f);
        this.bodyModel[56].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[56].setRotationPoint(-16.0f, -43.5f, -2.5f);
        this.bodyModel[57].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[57].setRotationPoint(-20.0f, -43.5f, -1.5f);
        this.bodyModel[58].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[58].setRotationPoint(-31.0f, -42.5f, -0.5f);
        this.bodyModel[59].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[59].setRotationPoint(-46.0f, -42.0f, -0.5f);
        this.bodyModel[60].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f);
        this.bodyModel[60].setRotationPoint(-46.0f, -43.6f, -0.5f);
        this.bodyModel[61].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f);
        this.bodyModel[61].setRotationPoint(-46.0f, -43.1f, 0.05f);
        this.bodyModel[62].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f);
        this.bodyModel[62].setRotationPoint(-46.0f, -42.5f, -0.5f);
        this.bodyModel[63].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f);
        this.bodyModel[63].setRotationPoint(-46.0f, -43.1f, -1.0f);
        this.bodyModel[64].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[64].setRotationPoint(-3.0f, -41.0f, -2.0f);
        this.bodyModel[65].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[65].setRotationPoint(-3.0f, -37.0f, -2.5f);
        this.bodyModel[65].rotateAngleZ = -0.12217305f;
        this.bodyModel[66].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[66].setRotationPoint(-12.0f, -25.0f, -3.0f);
        this.bodyModel[67].addShapeBox(0.0f, 0.0f, 0.0f, 11, 8, 1, 0.0f, -2.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, 1.0f, -2.0f, -0.5f, 3.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[67].setRotationPoint(-26.0f, -39.0f, -5.0f);
        this.bodyModel[68].addShapeBox(0.0f, 0.0f, 0.0f, 11, 8, 1, 0.0f, -2.0f, -0.5f, 3.0f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, -1.0f, -2.0f, -0.5f, -1.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 5.0f);
        this.bodyModel[68].setRotationPoint(-26.0f, -39.0f, 4.0f);
        this.bodyModel[69].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[69].setRotationPoint(-18.0f, -38.0f, -4.5f);
        this.bodyModel[70].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f);
        this.bodyModel[70].setRotationPoint(-18.0f, -38.0f, 1.5f);
        this.bodyModel[71].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[71].setRotationPoint(-18.0f, -36.0f, -1.5f);
        this.bodyModel[72].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[72].setRotationPoint(-25.0f, -37.3f, -1.5f);
        this.bodyModel[73].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[73].setRotationPoint(-17.8f, -36.1f, -1.5f);
        this.bodyModel[74].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[74].setRotationPoint(-17.8f, -36.7f, -4.0f);
        this.bodyModel[75].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[75].setRotationPoint(-17.8f, -34.1f, -6.0f);
        this.bodyModel[76].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[76].setRotationPoint(-17.8f, -34.1f, 3.0f);
        this.bodyModel[77].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[77].setRotationPoint(-17.8f, -36.1f, 1.8f);
        this.bodyModel[78].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[78].setRotationPoint(-17.8f, -36.1f, 3.0f);
        this.bodyModel[79].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f);
        this.bodyModel[79].setRotationPoint(-18.0f, -37.0f, -1.5f);
        this.bodyModel[80].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[80].setRotationPoint(-18.0f, -37.0f, -0.5f);
    }
    
    private void initnoseModel_1() {
        this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.noseModel[3] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.noseModel[4] = new ModelRendererTurbo((ModelBase)this, 281, 1, this.textureX, this.textureY);
        this.noseModel[5] = new ModelRendererTurbo((ModelBase)this, 345, 1, this.textureX, this.textureY);
        this.noseModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.noseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 8, 9, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.noseModel[0].setRotationPoint(-59.0f, -30.5f, -13.0f);
        this.noseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 26, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -0.5f, -8.5f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.noseModel[1].setRotationPoint(-59.0f, -38.5f, -13.0f);
        this.noseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, -8.5f, 0.0f, 0.0f, -8.5f, 0.0f, 0.5f, -8.0f);
        this.noseModel[2].setRotationPoint(-59.0f, -21.5f, -13.0f);
        this.noseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 26, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -8.5f, 0.0f, 0.5f, -8.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, -8.5f);
        this.noseModel[3].setRotationPoint(-64.0f, -21.5f, -13.0f);
        this.noseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 26, 0.0f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.noseModel[4].setRotationPoint(-64.0f, -38.5f, -13.0f);
        this.noseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 5, 9, 26, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.noseModel[5].setRotationPoint(-64.0f, -30.5f, -13.0f);
        this.noseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 10, 10, 10, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f);
        this.noseModel[6].setRotationPoint(-74.0f, -31.0f, -5.0f);
    }
    
    private void inittailModel_1() {
        this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 481, 25, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 945, 25, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 521, 1, this.textureX, this.textureY);
        this.tailModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 21, 8, 9, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 4.5f, -2.5f, 0.0f, 4.5f, -2.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f);
        this.tailModel[0].setRotationPoint(40.0f, -32.0f, -4.5f);
        this.tailModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 21, 4, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -11.0f, -1.5f, -4.0f, -11.0f, -1.5f, -4.0f, 0.0f, 0.0f, -3.0f);
        this.tailModel[1].setRotationPoint(40.0f, -24.0f, -4.5f);
        this.tailModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 13, 13, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -4.5f, -1.5f, 1.0f, -4.5f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.tailModel[2].setRotationPoint(61.0f, -37.0f, -2.0f);
        this.tailModel[3].addShapeBox(0.0f, 0.0f, -1.0f, 7, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f);
        this.tailModel[3].setRotationPoint(50.0f, -23.0f, 0.0f);
    }
    
    private void initleftWingModel_1() {
        this.leftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 545, 49, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 889, 41, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 153, 81, this.textureX, this.textureY);
        this.leftWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 36, 3, 51, 0.0f, -2.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -4.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -4.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f);
        this.leftWingModel[0].setRotationPoint(-49.0f, -49.0f, -94.0f);
        this.leftWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 26, 3, 8, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[1].setRotationPoint(-47.0f, -49.0f, -102.0f);
        this.leftWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 4, 0.0f, -5.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[2].setRotationPoint(-45.0f, -49.0f, -106.0f);
        this.leftWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 40, 1, 40, 0.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, -0.3f, -11.0f, -11.0f, -0.3f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f);
        this.leftWingModel[3].setRotationPoint(-54.0f, -49.0f, -97.0f);
    }
    
    private void initrightWingModel_1() {
        this.rightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 737, 65, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 409, 57, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 257, 17, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 153, 81, this.textureX, this.textureY);
        this.rightWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 36, 3, 51, 0.0f, 0.0f, -1.0f, 0.0f, -4.0f, -1.0f, 0.0f, -8.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -4.0f, 2.0f, 0.0f, -8.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.rightWingModel[0].setRotationPoint(-49.0f, -49.0f, 43.0f);
        this.rightWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 26, 3, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.rightWingModel[1].setRotationPoint(-47.0f, -49.0f, 94.0f);
        this.rightWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.5f);
        this.rightWingModel[2].setRotationPoint(-45.0f, -49.0f, 102.0f);
        this.rightWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 40, 1, 40, 0.0f, -11.0f, -0.3f, -11.0f, -11.0f, -0.3f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f);
        this.rightWingModel[3].setRotationPoint(-54.0f, -48.7f, 36.0f);
    }
    
    private void inityawFlapModel_1() {
        this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 545, 17, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 585, 41, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo((ModelBase)this, 169, 49, this.textureX, this.textureY);
        this.yawFlapModel[3] = new ModelRendererTurbo((ModelBase)this, 913, 57, this.textureX, this.textureY);
        this.yawFlapModel[4] = new ModelRendererTurbo((ModelBase)this, 912, 57, this.textureX, this.textureY);
        this.yawFlapModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 13, 19, 1, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[0].setRotationPoint(61.0f, -56.0f, 0.0f);
        this.yawFlapModel[1].addShapeBox(-4.0f, 0.0f, 3.5f, 8, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[1].setRotationPoint(-19.0f, -23.3f, 0.0f);
        this.yawFlapModel[1].rotateAngleZ = -0.6981317f;
        this.yawFlapModel[2].addShapeBox(-4.0f, 0.0f, -7.5f, 8, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[2].setRotationPoint(-19.0f, -23.3f, 0.0f);
        this.yawFlapModel[2].rotateAngleZ = -0.6981317f;
        this.yawFlapModel[3].addShapeBox(-5.0f, 1.0f, -0.8f, 20, 20, 1, 0.0f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f);
        this.yawFlapModel[3].setRotationPoint(61.0f, -56.0f, 0.0f);
        this.yawFlapModel[4].addShapeBox(-5.0f, 1.0f, -0.2f, 20, 20, 1, 0.0f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f);
        this.yawFlapModel[4].setRotationPoint(61.0f, -56.0f, 0.0f);
    }
    
    private void initpitchFlapLeftModel_1() {
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 513, 41, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo((ModelBase)this, 369, 41, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShapeBox(0.0f, -0.5f, 0.0f, 9, 2, 30, 0.0f, 0.0f, -0.2f, 0.0f, -5.0f, -0.2f, -3.0f, 1.0f, -0.2f, -5.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -5.0f, -0.2f, -3.0f, 1.0f, -0.2f, -5.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapLeftModel[0].setRotationPoint(60.0f, -35.0f, -32.0f);
        this.pitchFlapLeftModel[1].addShapeBox(-0.5f, -12.0f, -0.5f, 1, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftModel[1].setRotationPoint(-13.0f, -22.3f, 0.0f);
    }
    
    private void initpitchFlapRightModel_1() {
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 265, 41, this.textureX, this.textureY)).addShapeBox(0.0f, -0.5f, 0.0f, 9, 2, 30, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, -5.0f, -5.0f, -0.2f, -3.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, -5.0f, -5.0f, -0.2f, -3.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapRightModel[0].setRotationPoint(60.0f, -35.0f, 2.0f);
    }
    
    private void initpitchFlapLeftWingModel_1() {
        (this.pitchFlapLeftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 913, 41, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, 0.0f, 4, 2, 51, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftWingModel[0].setRotationPoint(-21.0f, -47.5f, -94.0f);
        this.pitchFlapLeftWingModel[0].rotateAngleX = -0.0296706f;
        this.pitchFlapLeftWingModel[0].rotateAngleY = -0.07853982f;
    }
    
    private void initpitchFlapRightWingModel_1() {
        (this.pitchFlapRightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 433, 65, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, 0.0f, 4, 2, 51, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapRightWingModel[0].setRotationPoint(-17.0f, -46.0f, 43.0f);
        this.pitchFlapRightWingModel[0].rotateAngleX = 0.0296706f;
        this.pitchFlapRightWingModel[0].rotateAngleY = 0.07853982f;
    }
    
    private void initPropeller() {
        (this.propellerModels = new ModelRendererTurbo[1][2])[0] = this.makeProp1(-68.0f, -26.0f, 0.0f);
    }
    
    private ModelRendererTurbo[] makeProp1(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 2, 97, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 2, 97, this.textureX, this.textureY) };
        prop[0].addBox(-0.5f, -22.0f, -1.5f, 1, 22, 3, 0.0f);
        prop[1].addBox(-0.5f, -22.0f, -1.5f, 1, 22, 3, 0.0f);
        prop[0].setRotationPoint(i, j, k);
        prop[1].setRotationPoint(i, j, k);
        return prop;
    }
}
