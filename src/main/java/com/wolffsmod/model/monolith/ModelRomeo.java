//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelRomeo extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelRomeo() {
        this.textureX = 512;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[91];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 345, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 265, 17, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 297, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 449, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 169, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 201, 25, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 449, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 337, 25, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 377, 25, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 481, 17, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 417, 25, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 233, 25, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 489, 1, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 137, 33, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 289, 17, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 329, 17, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 505, 9, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 169, 33, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 177, 33, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 185, 33, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 193, 33, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 257, 9, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 241, 33, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 273, 33, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 305, 33, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 441, 33, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 465, 33, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 449, 9, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 369, 25, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 489, 33, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 121, 41, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase)this, 137, 41, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase)this, 153, 41, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo((ModelBase)this, 185, 41, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo((ModelBase)this, 233, 41, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo((ModelBase)this, 265, 41, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo((ModelBase)this, 313, 41, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo((ModelBase)this, 361, 41, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo((ModelBase)this, 393, 41, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo((ModelBase)this, 449, 41, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[69] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[70] = new ModelRendererTurbo((ModelBase)this, 145, 49, this.textureX, this.textureY);
        this.bodyModel[71] = new ModelRendererTurbo((ModelBase)this, 329, 49, this.textureX, this.textureY);
        this.bodyModel[72] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[73] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.bodyModel[74] = new ModelRendererTurbo((ModelBase)this, 441, 41, this.textureX, this.textureY);
        this.bodyModel[75] = new ModelRendererTurbo((ModelBase)this, 177, 49, this.textureX, this.textureY);
        this.bodyModel[76] = new ModelRendererTurbo((ModelBase)this, 169, 17, this.textureX, this.textureY);
        this.bodyModel[77] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[78] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.bodyModel[79] = new ModelRendererTurbo((ModelBase)this, 497, 41, this.textureX, this.textureY);
        this.bodyModel[80] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.bodyModel[81] = new ModelRendererTurbo((ModelBase)this, 409, 25, this.textureX, this.textureY);
        this.bodyModel[82] = new ModelRendererTurbo((ModelBase)this, 257, 25, this.textureX, this.textureY);
        this.bodyModel[83] = new ModelRendererTurbo((ModelBase)this, 337, 25, this.textureX, this.textureY);
        this.bodyModel[84] = new ModelRendererTurbo((ModelBase)this, 137, 49, this.textureX, this.textureY);
        this.bodyModel[85] = new ModelRendererTurbo((ModelBase)this, 129, 33, this.textureX, this.textureY);
        this.bodyModel[86] = new ModelRendererTurbo((ModelBase)this, 441, 25, this.textureX, this.textureY);
        this.bodyModel[87] = new ModelRendererTurbo((ModelBase)this, 265, 33, this.textureX, this.textureY);
        this.bodyModel[88] = new ModelRendererTurbo((ModelBase)this, 489, 9, this.textureX, this.textureY);
        this.bodyModel[89] = new ModelRendererTurbo((ModelBase)this, 313, 49, this.textureX, this.textureY);
        this.bodyModel[90] = new ModelRendererTurbo((ModelBase)this, 297, 33, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 45, 6, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[0].setRotationPoint(-20.0f, 4.0f, -7.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 45, 4, 4, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f);
        this.bodyModel[1].setRotationPoint(-20.0f, 0.0f, -2.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 22, 6, 11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, -1.0f);
        this.bodyModel[2].setRotationPoint(-42.0f, 4.0f, -5.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 22, 4, 11, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(-42.0f, 0.0f, -5.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 45, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[4].setRotationPoint(-20.0f, 10.0f, -6.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 22, 4, 11, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, -1.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[5].setRotationPoint(-42.0f, 10.0f, -5.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 11, 0.0f, 0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, 0.5f, -0.5f, -1.5f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f, -1.0f, 0.5f, -0.5f, -1.5f);
        this.bodyModel[6].setRotationPoint(-47.0f, 4.0f, -5.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 9, 0.0f, 0.5f, 2.5f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 2.5f, -0.5f, 0.5f, -2.0f, -3.5f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.5f, -2.0f, -3.5f);
        this.bodyModel[7].setRotationPoint(-47.0f, 10.0f, -4.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 1, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(-47.0f, 12.0f, -0.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 8, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f);
        this.bodyModel[9].setRotationPoint(-56.0f, 12.0f, -0.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 8, 4, 11, 0.0f, 0.0f, 1.0f, -3.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.0f, 1.0f, -3.5f, 0.0f, -3.0f, -2.0f, 0.5f, -0.5f, -1.5f, 0.5f, -0.5f, -1.5f, 0.0f, -3.0f, -2.0f);
        this.bodyModel[10].setRotationPoint(-56.0f, 4.0f, -5.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 8, 4, 11, 0.0f, 0.0f, 2.0f, -3.0f, 0.5f, -0.5f, -1.5f, 0.5f, -0.5f, -1.5f, 0.0f, 2.0f, -3.0f, 0.0f, 1.0f, -5.0f, 0.5f, 1.0f, -4.5f, 0.5f, 1.0f, -4.5f, 0.0f, 1.0f, -5.0f);
        this.bodyModel[11].setRotationPoint(-56.0f, 7.0f, -5.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 11, 0.0f, 0.5f, 0.0f, -4.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.5f, 0.0f, -4.0f, 0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f);
        this.bodyModel[12].setRotationPoint(-47.0f, 0.0f, -5.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 8, 4, 11, 0.0f, 0.0f, -0.5f, -4.5f, 0.5f, 0.0f, -4.0f, 0.5f, 0.0f, -4.0f, 0.0f, -0.5f, -4.5f, 0.0f, -1.0f, -3.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.0f, -1.0f, -3.5f);
        this.bodyModel[13].setRotationPoint(-56.0f, 0.0f, -5.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 7, 0.0f, 0.0f, -0.5f, -2.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, -0.5f, -2.5f, 0.0f, -0.2f, -1.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, -1.8f);
        this.bodyModel[14].setRotationPoint(-67.0f, 3.0f, -3.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 5, 0.0f, 0.0f, -1.0f, -2.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -1.0f, -2.0f, 0.0f, -0.5f, -1.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -0.5f, -1.5f);
        this.bodyModel[15].setRotationPoint(-67.0f, 0.0f, -2.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 8, 4, 5, 0.0f, -1.0f, -2.0f, -2.4f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, -2.0f, -1.0f, -2.0f, -2.4f, 0.5f, -0.5f, -2.4f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.5f, -0.5f, -2.4f);
        this.bodyModel[16].setRotationPoint(-75.0f, 0.0f, -2.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 7, 0.0f, 0.0f, 2.2f, -2.5f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.2f, -2.5f, 0.0f, 1.0f, -3.25f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, -3.25f);
        this.bodyModel[17].setRotationPoint(-67.0f, 7.0f, -3.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.3f);
        this.bodyModel[18].setRotationPoint(-67.0f, 12.0f, -0.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 7, 0.0f, 0.0f, -0.2f, 0.0f, 2.0f, -0.2f, 0.0f, -2.5f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 2.0f, -0.2f, 0.0f, -2.5f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[19].setRotationPoint(-64.5f, 7.2f, 0.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 7, 0.0f, 0.0f, -0.2f, 0.0f, -2.5f, -0.2f, 0.0f, 2.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -2.5f, -0.2f, 0.0f, 2.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[20].setRotationPoint(-64.5f, 7.2f, -7.5f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 4, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, 0.3f);
        this.bodyModel[21].setRotationPoint(7.0f, -7.0f, -2.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 4, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f);
        this.bodyModel[22].setRotationPoint(7.0f, -8.0f, -2.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 4, 0.0f, 0.0f, 0.0f, -1.6f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -1.6f, 0.3f, -0.4f, -1.5f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.3f, -0.4f, -1.5f);
        this.bodyModel[23].setRotationPoint(-2.0f, -7.0f, -2.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 4, 0.0f, 0.7f, 0.1f, -1.8f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.7f, 0.1f, -1.8f, 0.0f, 0.0f, -1.6f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -1.6f);
        this.bodyModel[24].setRotationPoint(-2.0f, -8.0f, -2.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, -0.3f, -0.7f, 0.4f, -0.3f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.1f, 0.4f, -0.5f, -0.6f, 0.4f, -0.5f, -0.6f, 0.0f, -0.4f, 0.1f);
        this.bodyModel[25].setRotationPoint(16.0f, -7.0f, -2.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, -0.3f, 0.3f, 0.0f, -1.0f, 0.3f, 0.0f, -1.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.4f, 0.3f, -0.7f, 0.4f, 0.3f, -0.7f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(16.0f, -8.0f, -2.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 4, 0.0f, 0.0f, -0.4f, -1.6f, 0.0f, -0.4f, -1.0f, 0.0f, -0.4f, -1.0f, 0.0f, -0.4f, -1.6f, 0.7f, -0.1f, -1.8f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.7f, -0.1f, -1.8f);
        this.bodyModel[27].setRotationPoint(-2.0f, -9.0f, -2.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 4, 0.0f, 0.0f, -0.4f, -1.0f, 0.0f, -0.4f, -1.2f, 0.0f, -0.4f, -1.2f, 0.0f, -0.4f, -1.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.1f);
        this.bodyModel[28].setRotationPoint(7.0f, -9.0f, -2.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, -0.4f, -1.2f, -0.3f, -0.5f, -1.5f, -0.3f, -0.5f, -1.5f, 0.0f, -0.4f, -1.2f, 0.0f, 0.0f, -0.3f, 0.3f, 0.0f, -1.0f, 0.3f, 0.0f, -1.0f, 0.0f, 0.0f, -0.3f);
        this.bodyModel[29].setRotationPoint(16.0f, -9.0f, -2.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 2, 0.0f, 0.2f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, -0.8f, 0.4f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, -0.8f);
        this.bodyModel[30].setRotationPoint(7.0f, -12.4f, -1.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.8f, -0.6f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.8f, -0.6f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(11.0f, -12.4f, -1.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(9.0f, -12.4f, -1.0f);
        this.bodyModel[33].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 10, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[33].setRotationPoint(4.3f, -18.0f, -0.5f);
        this.bodyModel[34].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 10, 1, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.bodyModel[34].setRotationPoint(6.0f, -18.0f, -0.5f);
        this.bodyModel[35].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.4f, -0.1f, -0.1f, 0.4f, -0.1f, -0.1f, 0.4f, -0.1f, -0.1f, 0.4f, -0.1f);
        this.bodyModel[35].setRotationPoint(6.0f, -19.0f, -0.5f);
        this.bodyModel[36].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 12, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.bodyModel[36].setRotationPoint(8.0f, -24.0f, -0.5f);
        this.bodyModel[37].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 12, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.bodyModel[37].setRotationPoint(10.7f, -24.0f, -0.5f);
        this.bodyModel[38].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 11, 1, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f);
        this.bodyModel[38].setRotationPoint(9.8f, -23.0f, -0.5f);
        this.bodyModel[39].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.15f, -0.2f, -0.25f, 0.15f, -0.2f, -0.25f, 0.15f, -0.2f, -0.25f, 0.15f, -0.2f, -0.25f, 0.15f, -0.2f, -0.25f, 0.15f, -0.2f, -0.25f, 0.15f, -0.2f, -0.25f, 0.15f, -0.2f, -0.25f);
        this.bodyModel[39].setRotationPoint(9.5f, -23.6f, -0.5f);
        this.bodyModel[40].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0.4f, -0.4f, 0.1f, 0.4f);
        this.bodyModel[40].setRotationPoint(4.3f, -19.5f, -0.5f);
        this.bodyModel[41].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.1f, -0.2f, -0.3f, 0.1f, -0.2f, -0.3f, 0.1f, -0.2f, -0.3f, 0.1f, -0.2f, -0.3f, 0.1f, -0.2f, -0.3f, 0.1f, -0.2f, -0.3f, 0.1f, -0.2f, -0.3f, 0.1f, -0.2f);
        this.bodyModel[41].setRotationPoint(4.1f, -19.0f, -0.5f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 4, 0.0f, 0.3f, 0.0f, -1.5f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, -1.5f, 1.0f, -0.8f, -1.4f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 1.0f, -0.8f, -1.4f);
        this.bodyModel[42].setRotationPoint(-2.0f, -3.4f, -2.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 4, 0.0f, 1.0f, -0.8f, -1.4f, 0.0f, -1.3f, 0.8f, 0.0f, -1.3f, 0.8f, 1.0f, -0.8f, -1.4f, 4.3f, 1.5f, -1.0f, 0.0f, 2.0f, 1.8f, 0.0f, 2.0f, 1.8f, 4.3f, 1.5f, -1.0f);
        this.bodyModel[43].setRotationPoint(-2.0f, -2.0f, -2.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 10, 1, 4, 0.0f, 0.0f, -0.3f, 0.8f, 0.5f, -0.3f, 0.8f, 0.5f, -0.3f, 0.8f, 0.0f, -0.3f, 0.8f, 0.0f, 1.0f, 1.8f, 0.5f, 0.7f, 1.5f, 0.5f, 0.7f, 1.5f, 0.0f, 1.0f, 1.8f);
        this.bodyModel[44].setRotationPoint(7.0f, -1.0f, -2.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 4, 0.0f, 0.5f, -0.3f, 0.8f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.5f, -0.3f, 0.8f, 0.5f, 0.7f, 1.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.7f, 1.5f);
        this.bodyModel[45].setRotationPoint(18.0f, -1.0f, -2.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.1f);
        this.bodyModel[46].setRotationPoint(7.0f, -3.4f, -2.0f);
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.4f);
        this.bodyModel[47].setRotationPoint(-5.0f, -9.0f, -1.0f);
        this.bodyModel[48].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[48].setRotationPoint(-1.0f, -9.0f, -1.0f);
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, 0.0f, 8, 2, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -0.5f, 0.0f, 0.0f, -0.7f, -1.0f, -0.25f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.7f, -1.0f, -0.25f);
        this.bodyModel[49].setRotationPoint(-75.0f, 12.0f, -0.5f);
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 8, 2, 7, 0.0f, 0.5f, -0.5f, -3.4f, 0.0f, -0.5f, -2.5f, 0.0f, -0.5f, -2.5f, 0.5f, -0.5f, -3.4f, 0.7f, 0.2f, -3.4f, 0.0f, -0.2f, -1.8f, 0.0f, -0.2f, -1.8f, 0.7f, 0.2f, -3.4f);
        this.bodyModel[50].setRotationPoint(-75.0f, 3.0f, -3.5f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 4, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[51].setRotationPoint(-70.5f, 7.5f, 0.0f);
        this.bodyModel[52].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 4, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[52].setRotationPoint(-70.5f, 7.5f, -4.0f);
        this.bodyModel[53].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 7, 0.0f, 0.0f, 2.0f, -3.25f, 0.0f, 2.2f, -2.5f, 0.0f, 2.2f, -2.5f, 0.0f, 2.0f, -3.25f, 0.0f, 1.0f, -3.25f, 0.0f, 1.0f, -3.25f, 0.0f, 1.0f, -3.25f, 0.0f, 1.0f, -3.25f);
        this.bodyModel[53].setRotationPoint(-71.0f, 7.0f, -3.5f);
        this.bodyModel[54].addShapeBox(-4.0f, 0.0f, 0.0f, 5, 6, 1, 0.0f, 0.0f, 0.2f, -0.45f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, -0.4f, 0.0f, 0.2f, -0.45f, 0.0f, 0.2f, -0.45f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f, -0.4f, 0.0f, 0.2f, -0.45f);
        this.bodyModel[54].setRotationPoint(-72.0f, 5.5f, -0.5f);
        this.bodyModel[55].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[55].setRotationPoint(-66.7f, 7.2f, -4.5f);
        this.bodyModel[56].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -0.7f, 0.0f, 0.5f, -0.7f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[56].setRotationPoint(-66.7f, 6.2f, -4.5f);
        this.bodyModel[57].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -0.7f, 0.0f, 0.5f, -0.7f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[57].setRotationPoint(-66.7f, 8.2f, -4.5f);
        this.bodyModel[58].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[58].setRotationPoint(-66.7f, 7.2f, 1.5f);
        this.bodyModel[59].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -0.7f, 0.0f, 0.5f, -0.7f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[59].setRotationPoint(-66.7f, 6.2f, 1.5f);
        this.bodyModel[60].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -0.7f, 0.0f, 0.5f, -0.7f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[60].setRotationPoint(-66.7f, 8.2f, 1.5f);
        this.bodyModel[61].addShapeBox(0.0f, 0.0f, 0.0f, 16, 6, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[61].setRotationPoint(25.0f, 4.0f, -7.0f);
        this.bodyModel[62].addShapeBox(0.0f, 0.0f, 0.0f, 16, 4, 4, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 5.0f);
        this.bodyModel[62].setRotationPoint(25.0f, 0.0f, -2.0f);
        this.bodyModel[63].addShapeBox(0.0f, 0.0f, 0.0f, 16, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[63].setRotationPoint(25.0f, 10.0f, -6.0f);
        this.bodyModel[64].addShapeBox(0.0f, 0.0f, 0.0f, 16, 1, 4, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[64].setRotationPoint(25.0f, -1.0f, -2.0f);
        this.bodyModel[65].addShapeBox(0.0f, 0.0f, 0.0f, 15, 4, 4, 0.0f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 4.5f);
        this.bodyModel[65].setRotationPoint(41.0f, 0.0f, -2.0f);
        this.bodyModel[66].addShapeBox(0.0f, 0.0f, 0.0f, 15, 4, 12, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[66].setRotationPoint(41.0f, 10.0f, -6.0f);
        this.bodyModel[67].addShapeBox(0.0f, 0.0f, 0.0f, 15, 6, 14, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -1.5f);
        this.bodyModel[67].setRotationPoint(41.0f, 4.0f, -7.0f);
        this.bodyModel[68].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 4, 0.0f, 0.0f, -0.1f, -0.5f, 0.0f, 0.3f, -0.5f, 0.0f, 0.3f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.8f);
        this.bodyModel[68].setRotationPoint(41.0f, -1.0f, -2.0f);
        this.bodyModel[69].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -1.5f, -2.7f, 0.5f, -1.5f, -2.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.5f, 0.2f, -3.5f, 0.5f, 0.2f, -3.5f, 0.0f, 0.0f, -3.0f);
        this.bodyModel[69].setRotationPoint(56.0f, 10.0f, -4.0f);
        this.bodyModel[70].addShapeBox(0.0f, 0.0f, 0.0f, 10, 6, 8, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.8f, -1.8f, 0.5f, 0.8f, -1.8f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 1.5f, -2.7f, 0.5f, 1.5f, -2.7f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[70].setRotationPoint(56.0f, 4.0f, -4.0f);
        this.bodyModel[71].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 2, 0.0f, 0.0f, 0.0f, 1.5f, 0.5f, -1.8f, 0.8f, 0.5f, -1.8f, 0.8f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 3.5f, 0.5f, -0.8f, 1.2f, 0.5f, -0.8f, 1.2f, 0.0f, 0.0f, 3.5f);
        this.bodyModel[71].setRotationPoint(56.0f, 0.0f, -1.0f);
        this.bodyModel[72].addShapeBox(0.0f, 0.0f, 0.0f, 10, 1, 4, 0.0f, 0.0f, 0.3f, -0.5f, 0.5f, 0.5f, -1.2f, 0.5f, 0.5f, -1.2f, 0.0f, 0.3f, -0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 1.8f, -0.2f, 0.5f, 1.8f, -0.2f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[72].setRotationPoint(56.0f, -1.0f, -2.0f);
        this.bodyModel[73].addShapeBox(0.0f, 0.0f, 0.0f, 7, 6, 4, 0.0f, 0.0f, 0.8f, 0.2f, 0.0f, 0.8f, -1.4f, 0.0f, 0.8f, -1.4f, 0.0f, 0.8f, 0.2f, 0.0f, 1.5f, -0.7f, 0.0f, -1.0f, -1.9f, 0.0f, -1.0f, -1.9f, 0.0f, 1.5f, -0.7f);
        this.bodyModel[73].setRotationPoint(66.5f, 4.0f, -2.0f);
        this.bodyModel[74].addShapeBox(0.0f, 0.0f, 0.0f, 7, 2, 2, 0.0f, 0.0f, 0.2f, 0.8f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.8f, 0.0f, -0.8f, 1.2f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, 1.2f);
        this.bodyModel[74].setRotationPoint(66.5f, 2.0f, -1.0f);
        this.bodyModel[75].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 2, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f, 0.8f, -0.2f, 0.0f, 0.8f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 1.8f, 0.8f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.8f);
        this.bodyModel[75].setRotationPoint(66.5f, -1.0f, -1.0f);
        this.bodyModel[76].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[76].setRotationPoint(70.2f, -4.0f, -0.5f);
        this.bodyModel[77].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 1, 0.0f, 0.2f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f);
        this.bodyModel[77].setRotationPoint(68.2f, -4.0f, -0.5f);
        this.bodyModel[78].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, -0.6f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, -0.6f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[78].setRotationPoint(71.2f, -4.0f, -0.5f);
        this.bodyModel[79].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 4, 0.0f, 0.0f, 0.8f, -1.4f, 1.1f, 0.8f, -1.8f, 1.1f, 0.8f, -1.8f, 0.0f, 0.8f, -1.4f, 0.0f, -1.0f, -1.9f, 0.0f, -3.5f, -1.9f, 0.0f, -3.5f, -1.9f, 0.0f, -1.0f, -1.9f);
        this.bodyModel[79].setRotationPoint(73.5f, 4.0f, -2.0f);
        this.bodyModel[80].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.2f, 0.2f, 0.4f, 0.2f, -0.7f, 0.4f, 0.2f, -0.7f, 0.0f, 0.2f, 0.2f, 0.0f, -0.8f, -0.4f, 0.1f, -0.8f, -0.8f, 0.1f, -0.8f, -0.8f, 0.0f, -0.8f, -0.4f);
        this.bodyModel[80].setRotationPoint(73.5f, 2.0f, -1.0f);
        this.bodyModel[81].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.8f, -0.2f, -0.3f, 0.4f, -0.7f, -0.3f, 0.4f, -0.7f, 0.0f, 0.8f, -0.2f, 0.0f, 1.8f, 0.2f, 0.4f, 1.8f, -0.7f, 0.4f, 1.8f, -0.7f, 0.0f, 1.8f, 0.2f);
        this.bodyModel[81].setRotationPoint(73.5f, -1.0f, -1.0f);
        this.bodyModel[82].addShapeBox(9.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 1.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.4f, 0.0f);
        this.bodyModel[82].setRotationPoint(65.0f, 11.0f, -0.5f);
        this.bodyModel[83].addShapeBox(9.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 0.5f, 0.0f, -0.8f, -0.2f, 0.2f, 0.0f, 1.2f, 0.6f, 0.0f, 1.4f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, -0.7f, 0.2f, 0.0f, 0.0f, 0.7f);
        this.bodyModel[83].setRotationPoint(65.0f, 11.0f, 0.5f);
        this.bodyModel[84].addShapeBox(9.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 2.5f, -0.5f, 0.0f, 2.5f, -0.1f, 0.0f, 1.5f, 0.4f, 3.2f, 1.2f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.4f, 0.0f, 0.0f, 0.0f, 0.5f, 4.2f, -0.7f, -0.2f);
        this.bodyModel[84].setRotationPoint(56.0f, 11.0f, 0.5f);
        this.bodyModel[85].addShapeBox(9.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, 2.6f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 1.2f, 0.6f, 0.0f, 1.5f, 0.4f, 0.0f, 1.4f, 0.0f, 0.0f, 1.4f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[85].setRotationPoint(62.0f, 11.0f, 0.5f);
        this.bodyModel[86].addShapeBox(9.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, 0.0f, 1.2f, 0.6f, -0.8f, -0.2f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 0.0f, 0.7f, -0.8f, -0.7f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 1.4f, 0.0f);
        this.bodyModel[86].setRotationPoint(65.0f, 11.0f, -1.5f);
        this.bodyModel[87].addShapeBox(9.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 1.4f, 0.0f, 0.0f, 1.4f, 0.0f, 0.0f, 1.4f, 0.0f, 0.0f, 1.4f, 0.0f);
        this.bodyModel[87].setRotationPoint(62.0f, 11.0f, -0.5f);
        this.bodyModel[88].addShapeBox(9.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[88].setRotationPoint(57.0f, 13.0f, -0.5f);
        this.bodyModel[89].addShapeBox(9.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, 3.2f, 1.2f, 0.0f, 0.0f, 1.5f, 0.4f, 0.0f, 2.5f, -0.1f, 0.0f, 2.5f, -0.5f, 4.2f, -0.7f, -0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 1.4f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.bodyModel[89].setRotationPoint(56.0f, 11.0f, -1.5f);
        this.bodyModel[90].addShapeBox(9.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, 1.5f, 0.4f, 0.0f, 1.2f, 0.6f, 0.0f, 2.2f, 0.0f, 0.0f, 2.6f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.7f, 0.0f, 1.4f, 0.0f, 0.0f, 1.4f, 0.0f);
        this.bodyModel[90].setRotationPoint(62.0f, 11.0f, -1.5f);
    }
}
