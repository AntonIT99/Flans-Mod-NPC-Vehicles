//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelNovember extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelNovember() {
        this.textureX = 512;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[64];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 473, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 169, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 297, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 425, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 465, 25, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 417, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 137, 49, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 209, 49, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 281, 49, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 353, 49, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 401, 49, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 449, 49, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 41, 73, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 81, 73, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 121, 73, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 449, 25, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 161, 73, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 489, 65, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 489, 25, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 161, 25, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 193, 49, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 265, 49, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 337, 49, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 385, 49, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 289, 25, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 417, 1, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 433, 49, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 417, 25, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 137, 17, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 65, 49, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 481, 49, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 289, 33, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 97, 49, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 281, 17, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 289, 25, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo((ModelBase)this, 417, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 57, 4, 12, 0.0f, 0.0f, 0.0f, -3.75f, 0.0f, 0.0f, -3.75f, 0.0f, 0.0f, -3.75f, 0.0f, 0.0f, -3.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-33.0f, -1.0f, -6.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 57, 6, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-33.0f, 3.0f, -6.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 57, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f);
        this.bodyModel[2].setRotationPoint(-33.0f, 9.0f, -6.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, -3.5f, 0.0f, -1.25f, -3.5f, 0.0f, -1.25f, -3.5f, 0.0f, -0.25f, -3.5f);
        this.bodyModel[3].setRotationPoint(74.0f, 9.0f, -6.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 7, 6, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.75f, 0.0f, -0.5f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(74.0f, 3.0f, -6.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 7, 4, 12, 0.0f, 0.0f, -0.5f, -3.75f, 0.0f, -1.5f, -3.75f, 0.0f, -1.5f, -3.75f, 0.0f, -0.5f, -3.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.75f, 0.0f, 0.5f, -0.75f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(74.0f, -1.0f, -6.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 50, 4, 12, 0.0f, 0.0f, 0.0f, -3.75f, 0.0f, -0.5f, -3.75f, 0.0f, -0.5f, -3.75f, 0.0f, 0.0f, -3.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(24.0f, -1.0f, -6.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 50, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, -0.25f, -3.5f, 0.0f, -0.25f, -3.5f, 0.0f, 0.0f, -3.5f);
        this.bodyModel[7].setRotationPoint(24.0f, 9.0f, -6.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 50, 6, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(24.0f, 3.0f, -6.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 12, 0.0f, 0.0f, -1.5f, -3.75f, 0.0f, -2.75f, -4.25f, 0.0f, -2.75f, -4.25f, 0.0f, -1.5f, -3.75f, 0.0f, 0.5f, -0.75f, 0.0f, 1.0f, -1.5f, 0.0f, 1.0f, -1.5f, 0.0f, 0.5f, -0.75f);
        this.bodyModel[9].setRotationPoint(81.0f, -1.0f, -6.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 12, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.25f, -1.5f, 0.0f, 0.25f, -1.5f, 0.0f, 0.0f, -0.5f, 0.0f, -1.25f, -3.5f, 0.0f, -1.75f, -4.0f, 0.0f, -1.75f, -4.0f, 0.0f, -1.25f, -3.5f);
        this.bodyModel[10].setRotationPoint(81.0f, 9.0f, -6.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 4, 6, 12, 0.0f, 0.0f, -0.5f, -0.75f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -0.5f, -0.75f, 0.0f, 0.0f, -0.5f, 0.0f, -0.25f, -1.5f, 0.0f, -0.25f, -1.5f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[11].setRotationPoint(81.0f, 3.0f, -6.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 3, 6, 12, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -2.25f, -3.75f, 0.0f, -2.25f, -3.75f, 0.0f, -1.0f, -1.5f, 0.0f, -0.25f, -1.5f, 0.0f, -1.0f, -3.75f, 0.0f, -1.0f, -3.75f, 0.0f, -0.25f, -1.5f);
        this.bodyModel[12].setRotationPoint(85.0f, 3.0f, -6.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 12, 0.0f, 0.0f, -2.75f, -4.25f, 0.0f, -5.5f, -4.5f, 0.0f, -5.5f, -4.5f, 0.0f, -2.75f, -4.25f, 0.0f, 1.0f, -1.5f, 0.0f, 2.25f, -3.75f, 0.0f, 2.25f, -3.75f, 0.0f, 1.0f, -1.5f);
        this.bodyModel[13].setRotationPoint(85.0f, -1.0f, -6.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 12, 0.0f, 0.0f, 0.25f, -1.5f, 0.0f, 1.0f, -3.75f, 0.0f, 1.0f, -3.75f, 0.0f, 0.25f, -1.5f, 0.0f, -1.75f, -4.0f, 0.0f, -4.25f, -4.75f, 0.0f, -4.25f, -4.75f, 0.0f, -1.75f, -4.0f);
        this.bodyModel[14].setRotationPoint(85.0f, 9.0f, -6.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.5f, 1.5f, 0.0f, -0.75f, 1.5f, 0.0f, -0.75f, 0.0f, 0.0f, 0.5f, 0.0f, 0.25f, -1.0f, 0.0f, 0.25f, -1.25f, 0.0f, 0.25f, -1.25f, 0.0f, 0.25f, -1.0f);
        this.bodyModel[15].setRotationPoint(78.0f, 11.0f, -3.0f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 6, 0.0f, 7.5f, -1.0f, -2.75f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 7.5f, -1.0f, -2.75f, -2.0f, -0.25f, -1.5f, 0.0f, 0.25f, -1.0f, 0.0f, 0.25f, -1.0f, -2.0f, -0.25f, -1.5f);
        this.bodyModel[16].setRotationPoint(74.0f, 11.0f, -3.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 7, 0.0f, 0.0f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.bodyModel[17].setRotationPoint(75.25f, 0.25f, -9.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 7, 0.0f, 0.0f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.bodyModel[18].setRotationPoint(75.25f, 0.25f, 2.0f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 20, 4, 12, 0.0f, 0.0f, -0.25f, -3.75f, 0.0f, 0.0f, -3.75f, 0.0f, 0.0f, -3.75f, 0.0f, -0.25f, -3.75f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[19].setRotationPoint(-53.0f, -1.0f, -6.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 20, 6, 12, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f);
        this.bodyModel[20].setRotationPoint(-53.0f, 3.0f, -6.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 20, 4, 12, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, -0.5f, -3.75f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, -0.5f, -3.75f);
        this.bodyModel[21].setRotationPoint(-53.0f, 9.0f, -6.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 12, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -2.0f, 0.0f, -0.5f, -3.75f, 0.0f, -0.5f, -3.75f, 0.0f, -0.5f, -3.75f, 0.0f, -0.5f, -3.75f);
        this.bodyModel[22].setRotationPoint(-62.0f, 9.0f, -6.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 9, 6, 12, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[23].setRotationPoint(-62.0f, 3.0f, -6.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 12, 0.0f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, -3.75f, 0.0f, -0.25f, -3.75f, 0.0f, -0.25f, -4.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.5f);
        this.bodyModel[24].setRotationPoint(-62.0f, -1.0f, -6.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 10, 0.0f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, -3.0f, 0.0f, -0.25f, -3.0f, 0.0f, -0.25f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[25].setRotationPoint(-71.0f, -1.0f, -5.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 10, 0.0f, 0.0f, 0.0f, -2.25f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.25f, 0.0f, -0.5f, -3.75f, 0.0f, -0.5f, -2.75f, 0.0f, -0.5f, -2.75f, 0.0f, -0.5f, -3.75f);
        this.bodyModel[26].setRotationPoint(-71.0f, 9.0f, -5.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 9, 6, 10, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.25f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.25f);
        this.bodyModel[27].setRotationPoint(-71.0f, 3.0f, -5.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 7, 4, 10, 0.0f, 0.0f, -0.25f, -4.25f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, -4.25f, 0.0f, 0.0f, -3.25f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -3.25f);
        this.bodyModel[28].setRotationPoint(-78.0f, -1.0f, -5.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 7, 6, 4, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.25f, 0.0f, 2.5f, -0.5f, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f, 0.75f, 0.0f, 2.5f, -0.5f);
        this.bodyModel[29].setRotationPoint(-78.0f, 3.0f, -2.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 7, 4, 10, 0.0f, 0.0f, -2.5f, -3.5f, 0.0f, 0.0f, -2.25f, 0.0f, 0.0f, -2.25f, 0.0f, -2.5f, -3.5f, 0.0f, -0.5f, -3.75f, 0.0f, -0.5f, -3.75f, 0.0f, -0.5f, -3.75f, 0.0f, -0.5f, -3.75f);
        this.bodyModel[30].setRotationPoint(-78.0f, 9.0f, -5.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 6, 8, 4, 0.0f, 0.0f, -0.75f, -1.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, -0.75f, -1.25f, 0.0f, 0.75f, -1.25f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.75f, -1.25f);
        this.bodyModel[31].setRotationPoint(-84.0f, 3.0f, -2.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 6, 4, 4, 0.0f, -2.5f, 1.25f, -1.5f, 0.0f, -0.25f, -1.25f, 0.0f, -0.25f, -1.25f, -2.5f, 1.25f, -1.5f, 0.0f, 0.75f, -1.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.75f, -1.25f);
        this.bodyModel[32].setRotationPoint(-84.0f, -1.0f, -2.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 4, 0.0f, 0.0f, 1.25f, -1.5f, 2.5f, 1.25f, -1.5f, 2.5f, 1.25f, -1.5f, 0.0f, 1.25f, -1.5f, 0.0f, 0.75f, -1.5f, 0.0f, 0.75f, -1.25f, 0.0f, 0.75f, -1.25f, 0.0f, 0.75f, -1.5f);
        this.bodyModel[33].setRotationPoint(-89.0f, -1.0f, -2.0f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 2, 0.0f, 0.0f, -0.75f, -0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.75f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, 0.25f, 0.0f, 0.5f, 0.25f, 0.0f, 0.5f, -0.5f);
        this.bodyModel[34].setRotationPoint(-87.0f, 11.0f, -1.0f);
        this.bodyModel[35].addShapeBox(-5.0f, 0.0f, -0.5f, 5, 8, 1, 0.0f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f);
        this.bodyModel[35].setRotationPoint(-84.0f, 3.75f, 0.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 7, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.bodyModel[36].setRotationPoint(-84.25f, 7.25f, 0.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 7, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.bodyModel[37].setRotationPoint(-84.25f, 7.25f, -7.0f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 8, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-78.25f, 7.25f, -10.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 15.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 15.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.bodyModel[39].setRotationPoint(-78.25f, 7.25f, 2.0f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(-80.0f, 7.25f, -5.0f);
        this.bodyModel[41].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[41].setRotationPoint(-80.0f, 7.75f, -4.5f);
        this.bodyModel[42].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[42].setRotationPoint(-80.0f, 7.75f, -4.5f);
        this.bodyModel[42].rotateAngleX = 1.0471976f;
        this.bodyModel[43].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[43].setRotationPoint(-80.0f, 7.75f, -4.5f);
        this.bodyModel[43].rotateAngleX = 2.0943952f;
        this.bodyModel[44].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[44].setRotationPoint(-80.0f, 7.75f, -4.5f);
        this.bodyModel[44].rotateAngleX = 3.1415927f;
        this.bodyModel[45].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[45].setRotationPoint(-80.0f, 7.75f, -4.5f);
        this.bodyModel[45].rotateAngleX = 4.1887903f;
        this.bodyModel[46].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[46].setRotationPoint(-80.0f, 7.75f, -4.5f);
        this.bodyModel[46].rotateAngleX = 5.2359877f;
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, 0.0f, 7, 4, 3, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[47].setRotationPoint(27.0f, -4.5f, -1.5f);
        this.bodyModel[48].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 3, 0.0f, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.25f, 0.0f, 1.5f, 0.25f, 0.0f, 1.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[48].setRotationPoint(34.0f, -4.5f, -1.5f);
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 3, 0.0f, 0.0f, 1.5f, 0.25f, -0.5f, 1.5f, -0.5f, -0.5f, 1.5f, -0.5f, 0.0f, 1.5f, 0.25f, 0.0f, 0.0f, 0.5f, 0.75f, 0.0f, -0.25f, 0.75f, 0.0f, -0.25f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[49].setRotationPoint(39.0f, -4.5f, -1.5f);
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 6, 3, 2, 0.0f, 0.0f, -2.75f, -0.75f, 0.0f, 0.75f, 0.5f, 0.0f, 0.75f, 0.5f, 0.0f, -2.75f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.75f);
        this.bodyModel[50].setRotationPoint(21.0f, -3.5f, -1.0f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 3, 0.0f, 0.0f, -0.75f, -0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.75f, -0.5f, 0.0f, 0.25f, 0.0f, 0.0f, -1.5f, 0.5f, 0.0f, -1.5f, 0.5f, 0.0f, 0.25f, 0.0f);
        this.bodyModel[51].setRotationPoint(27.0f, -5.5f, -1.5f);
        this.bodyModel[52].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 2, 0.0f, -0.75f, -2.5f, -0.75f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, -0.75f, -2.5f, -0.75f, 0.0f, 2.75f, -0.75f, 0.0f, -0.75f, 0.5f, 0.0f, -0.75f, 0.5f, 0.0f, 2.75f, -0.75f);
        this.bodyModel[52].setRotationPoint(21.0f, -4.5f, -1.0f);
        this.bodyModel[53].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 3, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.25f, 0.0f, 1.0f, -0.25f, 0.0f, 1.0f, 0.0f, 0.0f, -1.5f, 0.5f, 0.0f, -1.5f, 0.25f, 0.0f, -1.5f, 0.25f, 0.0f, -1.5f, 0.5f);
        this.bodyModel[53].setRotationPoint(34.0f, -5.5f, -1.5f);
        this.bodyModel[54].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, -0.25f, -0.5f, -0.25f, -1.0f, -0.5f, -0.25f, -1.0f, 0.0f, 0.0f, -0.25f, 0.0f, -0.5f, 0.25f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.0f, -0.5f, 0.25f);
        this.bodyModel[54].setRotationPoint(39.0f, -6.5f, -1.5f);
        this.bodyModel[55].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f, 0.5f, 1.5f, -0.5f, -1.0f, 1.5f, -1.25f, -1.0f, 1.5f, -1.25f, 0.5f, 1.5f, -0.5f, -0.75f, 0.0f, -0.25f, 0.5f, 0.0f, -1.25f, 0.5f, 0.0f, -1.25f, -0.75f, 0.0f, -0.25f);
        this.bodyModel[55].setRotationPoint(41.0f, -4.5f, -1.5f);
        this.bodyModel[56].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, -0.25f, -0.5f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, 0.0f, -0.25f, -0.5f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[56].setRotationPoint(40.5f, -6.5f, -1.0f);
        this.bodyModel[57].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[57].setRotationPoint(-80.0f, 7.25f, 4.0f);
        this.bodyModel[58].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[58].setRotationPoint(-80.0f, 7.75f, 4.5f);
        this.bodyModel[59].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[59].setRotationPoint(-80.0f, 7.75f, 4.5f);
        this.bodyModel[59].rotateAngleX = 1.0471976f;
        this.bodyModel[60].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[60].setRotationPoint(-80.0f, 7.75f, 4.5f);
        this.bodyModel[60].rotateAngleX = 2.0943952f;
        this.bodyModel[61].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[61].setRotationPoint(-80.0f, 7.75f, 4.5f);
        this.bodyModel[61].rotateAngleX = 3.1415927f;
        this.bodyModel[62].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[62].setRotationPoint(-80.0f, 7.75f, 4.5f);
        this.bodyModel[62].rotateAngleX = 4.1887903f;
        this.bodyModel[63].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[63].setRotationPoint(-80.0f, 7.75f, 4.5f);
        this.bodyModel[63].rotateAngleX = 5.2359877f;
    }
}