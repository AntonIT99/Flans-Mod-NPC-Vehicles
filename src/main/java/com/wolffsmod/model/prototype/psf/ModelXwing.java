//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.prototype.psf;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelXwing extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelXwing() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[43])[0] = new ModelRendererTurbo((ModelBase)this, 0, 105, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 129, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 156, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 186, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 186, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 193, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 193, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 200, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 200, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 210, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 256, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 256, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 269, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 292, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 336, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 380, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 403, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 427, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 449, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 485, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 112, 102, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 76, 129, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 75, 155, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 76, 172, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 57, 185, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 64, 203, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 66, 220, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 64, 250, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 66, 271, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 118, 214, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 91, 292, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 91, 316, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 147, 316, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 20, 68, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 49, 51, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 60, 51, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 186, 47, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 213, 31, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 216, 48, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 190, 74, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 208, 86, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 26, 29, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 35, 1, 18, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -16.0f, -9.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 35, 22, 1, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, -38.0f, -9.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 35, 22, 1, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, -38.0f, 8.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 26, 2, 1, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, -38.0f, 7.9f);
        this.bodyModel[3].rotateAngleZ = 0.418879f;
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 26, 2, 1, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, -38.0f, -8.9f);
        this.bodyModel[4].rotateAngleZ = 0.418879f;
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 13, 2, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(23.7f, -48.5f, -8.9f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 13, 2, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(23.7f, -48.5f, 7.9f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 16, 2, 1, 0.0f);
        this.bodyModel[7].setRotationPoint(36.7f, -48.5f, -8.9f);
        this.bodyModel[7].rotateAngleZ = -0.7853982f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 16, 2, 1, 0.0f);
        this.bodyModel[8].setRotationPoint(36.7f, -48.5f, 7.9f);
        this.bodyModel[8].rotateAngleZ = -0.7853982f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 12, 23, 18, 0.0f);
        this.bodyModel[9].setRotationPoint(-12.0f, -38.0f, -9.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 2, 9, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(23.7f, -46.5f, -8.9f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 2, 9, 1, 0.0f);
        this.bodyModel[11].setRotationPoint(23.7f, -46.5f, 7.9f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 13, 1, 17, 0.0f);
        this.bodyModel[12].setRotationPoint(23.7f, -48.5f, -8.9f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 26, 23, 18, 0.0f);
        this.bodyModel[13].setRotationPoint(35.0f, -38.0f, -9.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 9, 21, 16, 0.0f);
        this.bodyModel[14].setRotationPoint(-8.0f, -35.0f, -8.0f);
        this.bodyModel[14].rotateAngleZ = 0.3490658f;
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 14, 15, 4, 0.0f);
        this.bodyModel[15].setRotationPoint(-1.0f, -35.0f, -8.0f);
        this.bodyModel[15].rotateAngleZ = -0.6108652f;
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 14, 15, 4, 0.0f);
        this.bodyModel[16].setRotationPoint(-1.0f, -35.0f, 4.0f);
        this.bodyModel[16].rotateAngleZ = -0.6108652f;
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 14, 2, 14, 0.0f);
        this.bodyModel[17].setRotationPoint(21.0f, -18.0f, -7.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 5, 18, 14, 0.0f);
        this.bodyModel[18].setRotationPoint(31.0f, -34.0f, -7.0f);
        this.bodyModel[18].rotateAngleZ = -0.06981317f;
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 5, 5, 8, 0.0f);
        this.bodyModel[19].setRotationPoint(30.0f, -38.0f, -4.0f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 111, 7, 18, 0.0f);
        this.bodyModel[20].setRotationPoint(-122.0f, -29.5f, -9.0f);
        this.bodyModel[20].rotateAngleZ = -0.06806784f;
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 109, 7, 16, 0.0f);
        this.bodyModel[21].setRotationPoint(-120.0f, -31.0f, -8.0f);
        this.bodyModel[21].rotateAngleZ = 0.06457718f;
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 80, 12, 1, 0.0f);
        this.bodyModel[22].setRotationPoint(-67.0f, -30.8f, 7.9f);
        this.bodyModel[22].rotateAngleZ = 0.03490658f;
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 109, 7, 1, 0.0f);
        this.bodyModel[23].setRotationPoint(-120.0f, -30.0f, -8.8f);
        this.bodyModel[23].rotateAngleX = 0.01745329f;
        this.bodyModel[23].rotateAngleZ = 0.05235988f;
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 80, 12, 1, 0.0f);
        this.bodyModel[24].setRotationPoint(-67.0f, -30.8f, -8.9f);
        this.bodyModel[24].rotateAngleZ = 0.03490658f;
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 109, 7, 1, 0.0f);
        this.bodyModel[25].setRotationPoint(-120.0f, -30.0f, 7.8f);
        this.bodyModel[25].rotateAngleZ = 0.05235988f;
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 15, 9, 9, 0.0f);
        this.bodyModel[26].setRotationPoint(-125.3f, -31.5f, -9.1f);
        this.bodyModel[26].rotateAngleZ = 0.05235988f;
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 15, 9, 9, 0.0f);
        this.bodyModel[27].setRotationPoint(-125.3f, -31.5f, 0.1f);
        this.bodyModel[27].rotateAngleZ = 0.05235988f;
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 15, 9, 10, 0.0f);
        this.bodyModel[28].setRotationPoint(-125.5f, -31.0f, -5.0f);
        this.bodyModel[28].rotateAngleZ = 0.05235988f;
        this.bodyModel[29].addBox(0.0f, 0.0f, 0.0f, 58, 31, 18, 0.0f);
        this.bodyModel[29].setRotationPoint(61.0f, -38.0f, -9.0f);
        this.bodyModel[30].addBox(0.0f, 0.0f, 0.0f, 19, 4, 16, 0.0f);
        this.bodyModel[30].setRotationPoint(45.8f, -18.9f, -8.0f);
        this.bodyModel[30].rotateAngleZ = -0.4537856f;
        this.bodyModel[31].addBox(0.0f, -4.0f, 0.0f, 19, 8, 8, 0.0f);
        this.bodyModel[31].setRotationPoint(46.5f, -19.0f, -8.9f);
        this.bodyModel[31].rotateAngleZ = -0.4537856f;
        this.bodyModel[32].addBox(0.0f, -4.0f, 0.0f, 19, 8, 8, 0.0f);
        this.bodyModel[32].setRotationPoint(46.5f, -19.0f, 0.9f);
        this.bodyModel[32].rotateAngleZ = -0.4537856f;
        this.bodyModel[33].addBox(0.0f, 0.0f, 0.0f, 2, 2, 18, 0.0f);
        this.bodyModel[33].setRotationPoint(119.0f, -9.0f, -9.0f);
        this.bodyModel[34].addBox(0.0f, 0.0f, 0.0f, 2, 29, 2, 0.0f);
        this.bodyModel[34].setRotationPoint(119.0f, -38.0f, -9.0f);
        this.bodyModel[35].addBox(0.0f, 0.0f, 0.0f, 2, 29, 2, 0.0f);
        this.bodyModel[35].setRotationPoint(119.0f, -38.0f, 7.0f);
        this.bodyModel[36].addBox(0.0f, 0.0f, 0.0f, 1, 12, 12, 0.0f);
        this.bodyModel[36].setRotationPoint(119.0f, -34.0f, -6.0f);
        this.bodyModel[37].addBox(0.0f, 0.0f, 0.0f, 19, 1, 12, 0.0f);
        this.bodyModel[37].setRotationPoint(94.0f, -39.0f, -6.0f);
        this.bodyModel[38].addBox(0.0f, 0.0f, 0.0f, 15, 1, 10, 0.0f);
        this.bodyModel[38].setRotationPoint(73.0f, -39.0f, -5.0f);
        this.bodyModel[39].addBox(0.0f, 0.0f, 0.0f, 52, 2, 2, 0.0f);
        this.bodyModel[39].setRotationPoint(66.0f, -40.0f, -9.0f);
        this.bodyModel[40].addBox(0.0f, 0.0f, 0.0f, 52, 2, 2, 0.0f);
        this.bodyModel[40].setRotationPoint(66.0f, -40.0f, 7.0f);
        this.bodyModel[41].addBox(0.0f, 0.0f, 0.0f, 3, 2, 18, 0.0f);
        this.bodyModel[41].setRotationPoint(64.0f, -38.0f, -9.0f);
        this.bodyModel[41].rotateAngleZ = 0.7679449f;
        this.bodyModel[42].addBox(0.0f, 0.0f, 0.0f, 3, 2, 18, 0.0f);
        this.bodyModel[42].setRotationPoint(118.0f, -40.0f, -9.0f);
        (this.leftWingModel = new ModelRendererTurbo[26])[0] = new ModelRendererTurbo((ModelBase)this, 233, 310, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 118, 264, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 39, 384, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 134, 342, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo((ModelBase)this, 163, 294, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo((ModelBase)this, 206, 466, this.textureX, this.textureY);
        this.leftWingModel[7] = new ModelRendererTurbo((ModelBase)this, 186, 446, this.textureX, this.textureY);
        this.leftWingModel[8] = new ModelRendererTurbo((ModelBase)this, 362, 244, this.textureX, this.textureY);
        this.leftWingModel[9] = new ModelRendererTurbo((ModelBase)this, 271, 215, this.textureX, this.textureY);
        this.leftWingModel[10] = new ModelRendererTurbo((ModelBase)this, 390, 0, this.textureX, this.textureY);
        this.leftWingModel[11] = new ModelRendererTurbo((ModelBase)this, 195, 17, this.textureX, this.textureY);
        this.leftWingModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 40, this.textureX, this.textureY);
        this.leftWingModel[13] = new ModelRendererTurbo((ModelBase)this, 202, 0, this.textureX, this.textureY);
        this.leftWingModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 57, this.textureX, this.textureY);
        this.leftWingModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 33, this.textureX, this.textureY);
        this.leftWingModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 33, this.textureX, this.textureY);
        this.leftWingModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 71, this.textureX, this.textureY);
        this.leftWingModel[18] = new ModelRendererTurbo((ModelBase)this, 390, 0, this.textureX, this.textureY);
        this.leftWingModel[19] = new ModelRendererTurbo((ModelBase)this, 195, 17, this.textureX, this.textureY);
        this.leftWingModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 40, this.textureX, this.textureY);
        this.leftWingModel[21] = new ModelRendererTurbo((ModelBase)this, 202, 0, this.textureX, this.textureY);
        this.leftWingModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 57, this.textureX, this.textureY);
        this.leftWingModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 33, this.textureX, this.textureY);
        this.leftWingModel[24] = new ModelRendererTurbo((ModelBase)this, 0, 33, this.textureX, this.textureY);
        this.leftWingModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 71, this.textureX, this.textureY);
        this.leftWingModel[0].addBox(0.0f, 0.0f, 0.0f, 44, 2, 94, 0.0f);
        this.leftWingModel[0].setRotationPoint(108.0f, -24.0f, -8.0f);
        this.leftWingModel[0].rotateAngleX = -0.296706f;
        this.leftWingModel[0].rotateAngleY = 3.141593f;
        this.leftWingModel[1].addBox(0.0f, 0.0f, 0.0f, 44, 2, 94, 0.0f);
        this.leftWingModel[1].setRotationPoint(108.0f, -29.0f, -8.0f);
        this.leftWingModel[1].rotateAngleX = 0.296706f;
        this.leftWingModel[1].rotateAngleY = 3.141593f;
        this.leftWingModel[2].addBox(0.0f, 2.0f, 5.0f, 35, 4, 23, 0.0f);
        this.leftWingModel[2].setRotationPoint(99.0f, -24.0f, -8.0f);
        this.leftWingModel[2].rotateAngleX = -0.296706f;
        this.leftWingModel[2].rotateAngleY = 3.141593f;
        this.leftWingModel[3].addBox(0.0f, -4.0f, 5.0f, 35, 4, 23, 0.0f);
        this.leftWingModel[3].setRotationPoint(99.0f, -29.0f, -8.0f);
        this.leftWingModel[3].rotateAngleX = 0.296706f;
        this.leftWingModel[3].rotateAngleY = 3.141593f;
        this.leftWingModel[4].addBox(0.0f, 6.0f, 6.0f, 42, 16, 16, 0.0f);
        this.leftWingModel[4].setRotationPoint(99.0f, -24.0f, -8.0f);
        this.leftWingModel[4].rotateAngleX = -0.296706f;
        this.leftWingModel[4].rotateAngleY = 3.141593f;
        this.leftWingModel[5].addBox(0.0f, 13.0f, 8.0f, 31, 9, 9, 0.0f);
        this.leftWingModel[5].setRotationPoint(130.0f, -24.0f, -8.0f);
        this.leftWingModel[5].rotateAngleX = -0.296706f;
        this.leftWingModel[5].rotateAngleY = 3.141593f;
        this.leftWingModel[6].addBox(0.0f, -20.0f, 5.0f, 42, 16, 16, 0.0f);
        this.leftWingModel[6].setRotationPoint(99.0f, -29.0f, -8.0f);
        this.leftWingModel[6].rotateAngleX = 0.296706f;
        this.leftWingModel[6].rotateAngleY = 3.141593f;
        this.leftWingModel[7].addBox(0.0f, -20.0f, 8.5f, 31, 9, 9, 0.0f);
        this.leftWingModel[7].setRotationPoint(130.0f, -29.0f, -8.0f);
        this.leftWingModel[7].rotateAngleX = 0.296706f;
        this.leftWingModel[7].rotateAngleY = 3.141593f;
        this.leftWingModel[8].addBox(0.0f, -4.0f, 5.0f, 35, 4, 25, 0.0f);
        this.leftWingModel[8].setRotationPoint(63.9f, -37.0f, -41.0f);
        this.leftWingModel[9].addBox(0.0f, -4.0f, 5.0f, 35, 4, 24, 0.0f);
        this.leftWingModel[9].setRotationPoint(63.9f, -10.0f, -41.0f);
        this.leftWingModel[10].addBox(0.0f, -8.0f, 86.0f, 44, 8, 8, 0.0f);
        this.leftWingModel[10].setRotationPoint(108.0f, -29.0f, -8.0f);
        this.leftWingModel[10].rotateAngleX = 0.296706f;
        this.leftWingModel[10].rotateAngleY = 3.141593f;
        this.leftWingModel[11].addBox(0.0f, -7.0f, 87.0f, 94, 6, 6, 0.0f);
        this.leftWingModel[11].setRotationPoint(115.0f, -29.0f, -8.0f);
        this.leftWingModel[11].rotateAngleX = 0.296706f;
        this.leftWingModel[11].rotateAngleY = 3.141593f;
        this.leftWingModel[12].addBox(0.0f, -8.0f, 86.0f, 3, 8, 8, 0.0f);
        this.leftWingModel[12].setRotationPoint(118.0f, -29.0f, -8.0f);
        this.leftWingModel[12].rotateAngleX = 0.296706f;
        this.leftWingModel[12].rotateAngleY = 3.141593f;
        this.leftWingModel[13].addBox(0.0f, -6.0f, 88.0f, 36, 4, 4, 0.0f);
        this.leftWingModel[13].setRotationPoint(21.0f, -29.2f, -7.9f);
        this.leftWingModel[13].rotateAngleX = 0.296706f;
        this.leftWingModel[13].rotateAngleY = 3.141593f;
        this.leftWingModel[14].addBox(0.0f, -8.0f, 88.0f, 2, 8, 4, 0.0f);
        this.leftWingModel[14].setRotationPoint(-15.0f, -29.0f, -8.0f);
        this.leftWingModel[14].rotateAngleX = 0.296706f;
        this.leftWingModel[14].rotateAngleY = 3.141593f;
        this.leftWingModel[15].addBox(0.0f, -8.0f, 88.0f, 5, 1, 4, 0.0f);
        this.leftWingModel[15].setRotationPoint(-17.0f, -29.0f, -8.0f);
        this.leftWingModel[15].rotateAngleX = 0.296706f;
        this.leftWingModel[15].rotateAngleY = 3.141593f;
        this.leftWingModel[16].addBox(0.0f, -1.0f, 88.0f, 5, 1, 4, 0.0f);
        this.leftWingModel[16].setRotationPoint(-17.0f, -29.0f, -8.0f);
        this.leftWingModel[16].rotateAngleX = 0.296706f;
        this.leftWingModel[16].rotateAngleY = 3.141593f;
        this.leftWingModel[17].addBox(0.0f, -5.0f, 89.3f, 15, 1, 1, 0.0f);
        this.leftWingModel[17].setRotationPoint(-17.0f, -29.0f, -8.0f);
        this.leftWingModel[17].rotateAngleX = 0.296706f;
        this.leftWingModel[17].rotateAngleY = 3.141593f;
        this.leftWingModel[18].addBox(0.0f, 2.0f, 86.0f, 44, 8, 8, 0.0f);
        this.leftWingModel[18].setRotationPoint(108.0f, -24.0f, -8.0f);
        this.leftWingModel[18].rotateAngleX = -0.296706f;
        this.leftWingModel[18].rotateAngleY = 3.141593f;
        this.leftWingModel[19].addBox(0.0f, 2.0f, 87.0f, 94, 6, 6, 0.0f);
        this.leftWingModel[19].setRotationPoint(115.0f, -24.0f, -8.0f);
        this.leftWingModel[19].rotateAngleX = -0.296706f;
        this.leftWingModel[19].rotateAngleY = 3.141593f;
        this.leftWingModel[20].addBox(0.0f, 1.0f, 86.0f, 3, 8, 8, 0.0f);
        this.leftWingModel[20].setRotationPoint(118.0f, -24.0f, -8.0f);
        this.leftWingModel[20].rotateAngleX = -0.296706f;
        this.leftWingModel[20].rotateAngleY = 3.141593f;
        this.leftWingModel[21].addBox(0.0f, 3.0f, 88.0f, 36, 4, 4, 0.0f);
        this.leftWingModel[21].setRotationPoint(21.0f, -24.0f, -8.0f);
        this.leftWingModel[21].rotateAngleX = -0.296706f;
        this.leftWingModel[21].rotateAngleY = 3.141593f;
        this.leftWingModel[22].addBox(0.0f, 1.0f, 88.0f, 2, 8, 4, 0.0f);
        this.leftWingModel[22].setRotationPoint(-15.0f, -24.0f, -8.0f);
        this.leftWingModel[22].rotateAngleX = -0.296706f;
        this.leftWingModel[22].rotateAngleY = 3.141593f;
        this.leftWingModel[23].addBox(0.0f, 1.0f, 88.0f, 5, 1, 4, 0.0f);
        this.leftWingModel[23].setRotationPoint(-17.0f, -24.0f, -8.0f);
        this.leftWingModel[23].rotateAngleX = -0.296706f;
        this.leftWingModel[23].rotateAngleY = 3.141593f;
        this.leftWingModel[24].addBox(0.0f, 8.0f, 88.0f, 5, 1, 4, 0.0f);
        this.leftWingModel[24].setRotationPoint(-17.0f, -24.0f, -8.0f);
        this.leftWingModel[24].rotateAngleX = -0.296706f;
        this.leftWingModel[24].rotateAngleY = 3.141593f;
        this.leftWingModel[25].addBox(0.0f, 4.5f, 89.3f, 15, 1, 1, 0.0f);
        this.leftWingModel[25].setRotationPoint(-17.0f, -24.0f, -8.0f);
        this.leftWingModel[25].rotateAngleX = -0.296706f;
        this.leftWingModel[25].rotateAngleY = 3.176499f;
        (this.rightWingModel = new ModelRendererTurbo[26])[0] = new ModelRendererTurbo((ModelBase)this, 0, 414, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 234, 407, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 38, 355, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 133, 376, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 204, 410, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo((ModelBase)this, 244, 320, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo((ModelBase)this, 272, 254, this.textureX, this.textureY);
        this.rightWingModel[7] = new ModelRendererTurbo((ModelBase)this, 362, 277, this.textureX, this.textureY);
        this.rightWingModel[8] = new ModelRendererTurbo((ModelBase)this, 391, 214, this.textureX, this.textureY);
        this.rightWingModel[9] = new ModelRendererTurbo((ModelBase)this, 285, 0, this.textureX, this.textureY);
        this.rightWingModel[10] = new ModelRendererTurbo((ModelBase)this, 202, 0, this.textureX, this.textureY);
        this.rightWingModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 40, this.textureX, this.textureY);
        this.rightWingModel[12] = new ModelRendererTurbo((ModelBase)this, 195, 17, this.textureX, this.textureY);
        this.rightWingModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 57, this.textureX, this.textureY);
        this.rightWingModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 33, this.textureX, this.textureY);
        this.rightWingModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 71, this.textureX, this.textureY);
        this.rightWingModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 33, this.textureX, this.textureY);
        this.rightWingModel[17] = new ModelRendererTurbo((ModelBase)this, 285, 0, this.textureX, this.textureY);
        this.rightWingModel[18] = new ModelRendererTurbo((ModelBase)this, 195, 17, this.textureX, this.textureY);
        this.rightWingModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 40, this.textureX, this.textureY);
        this.rightWingModel[20] = new ModelRendererTurbo((ModelBase)this, 202, 0, this.textureX, this.textureY);
        this.rightWingModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 57, this.textureX, this.textureY);
        this.rightWingModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 33, this.textureX, this.textureY);
        this.rightWingModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 33, this.textureX, this.textureY);
        this.rightWingModel[24] = new ModelRendererTurbo((ModelBase)this, 0, 71, this.textureX, this.textureY);
        this.rightWingModel[25] = new ModelRendererTurbo((ModelBase)this, 244, 275, this.textureX, this.textureY);
        this.rightWingModel[0].addBox(0.0f, 0.0f, 0.0f, 44, 2, 94, 0.0f);
        this.rightWingModel[0].setRotationPoint(64.0f, -29.0f, 8.0f);
        this.rightWingModel[0].rotateAngleX = 0.296706f;
        this.rightWingModel[1].addBox(0.0f, 0.0f, 0.0f, 44, 2, 94, 0.0f);
        this.rightWingModel[1].setRotationPoint(64.0f, -24.0f, 8.0f);
        this.rightWingModel[1].rotateAngleX = -0.296706f;
        this.rightWingModel[2].addBox(0.0f, -4.0f, 5.0f, 35, 4, 23, 0.0f);
        this.rightWingModel[2].setRotationPoint(64.0f, -29.0f, 8.0f);
        this.rightWingModel[2].rotateAngleX = 0.296706f;
        this.rightWingModel[3].addBox(0.0f, 2.0f, 5.0f, 35, 4, 23, 0.0f);
        this.rightWingModel[3].setRotationPoint(64.0f, -24.0f, 8.0f);
        this.rightWingModel[3].rotateAngleX = -0.296706f;
        this.rightWingModel[4].addBox(0.0f, -20.0f, 5.0f, 42, 16, 16, 0.0f);
        this.rightWingModel[4].setRotationPoint(57.0f, -29.0f, 8.0f);
        this.rightWingModel[4].rotateAngleX = 0.296706f;
        this.rightWingModel[5].addBox(0.0f, -20.0f, 9.0f, 31, 9, 9, 0.0f);
        this.rightWingModel[5].setRotationPoint(99.0f, -29.0f, 8.0f);
        this.rightWingModel[5].rotateAngleX = 0.296706f;
        this.rightWingModel[6].addBox(0.0f, 13.0f, 9.0f, 31, 9, 9, 0.0f);
        this.rightWingModel[6].setRotationPoint(99.0f, -24.0f, 8.0f);
        this.rightWingModel[6].rotateAngleX = -0.296706f;
        this.rightWingModel[7].addBox(0.0f, -4.0f, 5.0f, 35, 4, 25, 0.0f);
        this.rightWingModel[7].setRotationPoint(63.9f, -37.0f, 7.0f);
        this.rightWingModel[8].addBox(0.0f, -4.0f, 5.0f, 35, 4, 25, 0.0f);
        this.rightWingModel[8].setRotationPoint(63.9f, -10.0f, 7.0f);
        this.rightWingModel[9].addBox(0.0f, -8.0f, 86.0f, 44, 8, 8, 0.0f);
        this.rightWingModel[9].setRotationPoint(64.0f, -29.0f, 8.0f);
        this.rightWingModel[9].rotateAngleX = 0.296706f;
        this.rightWingModel[10].addBox(0.0f, -6.0f, 88.0f, 36, 4, 4, 0.0f);
        this.rightWingModel[10].setRotationPoint(-15.0f, -29.0f, 8.0f);
        this.rightWingModel[10].rotateAngleX = 0.296706f;
        this.rightWingModel[11].addBox(0.0f, -8.0f, 86.0f, 3, 8, 8, 0.0f);
        this.rightWingModel[11].setRotationPoint(115.0f, -29.0f, 8.0f);
        this.rightWingModel[11].rotateAngleX = 0.296706f;
        this.rightWingModel[12].addBox(0.0f, -7.0f, 87.0f, 94, 6, 6, 0.0f);
        this.rightWingModel[12].setRotationPoint(21.0f, -29.0f, 8.0f);
        this.rightWingModel[12].rotateAngleX = 0.296706f;
        this.rightWingModel[13].addBox(0.0f, -8.0f, 88.0f, 2, 8, 4, 0.0f);
        this.rightWingModel[13].setRotationPoint(-17.0f, -29.0f, 8.0f);
        this.rightWingModel[13].rotateAngleX = 0.296706f;
        this.rightWingModel[14].addBox(0.0f, -8.0f, 88.0f, 5, 1, 4, 0.0f);
        this.rightWingModel[14].setRotationPoint(-22.0f, -29.0f, 8.0f);
        this.rightWingModel[14].rotateAngleX = 0.296706f;
        this.rightWingModel[15].addBox(-6.0f, -4.5f, 89.5f, 15, 1, 1, 0.0f);
        this.rightWingModel[15].setRotationPoint(-26.0f, -29.0f, 8.0f);
        this.rightWingModel[15].rotateAngleX = 0.296706f;
        this.rightWingModel[16].addBox(0.0f, -1.0f, 88.0f, 5, 1, 4, 0.0f);
        this.rightWingModel[16].setRotationPoint(-22.0f, -29.0f, 8.0f);
        this.rightWingModel[16].rotateAngleX = 0.296706f;
        this.rightWingModel[17].addBox(0.0f, 2.0f, 86.0f, 44, 8, 8, 0.0f);
        this.rightWingModel[17].setRotationPoint(64.0f, -24.0f, 8.0f);
        this.rightWingModel[17].rotateAngleX = -0.296706f;
        this.rightWingModel[18].addBox(0.0f, 3.0f, 87.0f, 94, 6, 6, 0.0f);
        this.rightWingModel[18].setRotationPoint(21.0f, -25.0f, 8.0f);
        this.rightWingModel[18].rotateAngleX = -0.296706f;
        this.rightWingModel[19].addBox(0.0f, 2.0f, 86.0f, 3, 8, 8, 0.0f);
        this.rightWingModel[19].setRotationPoint(115.0f, -24.0f, 8.0f);
        this.rightWingModel[19].rotateAngleX = -0.296706f;
        this.rightWingModel[20].addBox(0.0f, 4.0f, 88.0f, 36, 4, 4, 0.0f);
        this.rightWingModel[20].setRotationPoint(-15.0f, -25.0f, 8.0f);
        this.rightWingModel[20].rotateAngleX = -0.296706f;
        this.rightWingModel[21].addBox(0.0f, 2.0f, 88.0f, 2, 8, 4, 0.0f);
        this.rightWingModel[21].setRotationPoint(-17.0f, -25.0f, 8.0f);
        this.rightWingModel[21].rotateAngleX = -0.296706f;
        this.rightWingModel[22].addBox(0.0f, 2.0f, 88.0f, 5, 1, 4, 0.0f);
        this.rightWingModel[22].setRotationPoint(-22.0f, -25.0f, 8.0f);
        this.rightWingModel[22].rotateAngleX = -0.296706f;
        this.rightWingModel[23].addBox(0.0f, 9.0f, 88.0f, 5, 1, 4, 0.0f);
        this.rightWingModel[23].setRotationPoint(-22.0f, -25.0f, 8.0f);
        this.rightWingModel[23].rotateAngleX = -0.296706f;
        this.rightWingModel[24].addBox(0.0f, 5.5f, 89.5f, 15, 1, 1, 0.0f);
        this.rightWingModel[24].setRotationPoint(-32.0f, -25.0f, 8.0f);
        this.rightWingModel[24].rotateAngleX = -0.296706f;
        this.rightWingModel[25].addBox(0.0f, 6.0f, 5.0f, 42, 16, 16, 0.0f);
        this.rightWingModel[25].setRotationPoint(57.0f, -24.0f, 8.0f);
        this.rightWingModel[25].rotateAngleX = -0.296706f;
        this.propellerModels = new ModelRendererTurbo[1][1];
        (this.propellerModels[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.propellerModels[0][0].setRotationPoint(65.0f, -23.0f, -1.0f);
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
        return prop;
    }
}
