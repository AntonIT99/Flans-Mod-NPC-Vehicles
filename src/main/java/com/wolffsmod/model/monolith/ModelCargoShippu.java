//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelCargoShippu extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelCargoShippu() {
        this.textureX = 512;
        this.textureY = 512;
        this.bodyModel = new ModelRendererTurbo[47];
        this.leftFrontWheelModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftFrontWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 417, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 113, 49, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 209, 49, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 305, 49, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 177, 89, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 105, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 385, 65, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 329, 105, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 481, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 313, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 161, 129, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 401, 129, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 393, 105, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 177, 49, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 145, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 425, 1, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 481, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 409, 41, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 441, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 313, 9, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 121, 49, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 73, 145, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 265, 137, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 273, 49, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 329, 145, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 385, 161, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 465, 49, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 465, 73, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 153, 97, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 465, 105, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 41, 145, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 457, 161, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 153, 169, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 120, 10, 30, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[0].setRotationPoint(-60.0f, 0.0f, -15.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 22, 10, 30, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -9.0f);
        this.bodyModel[1].setRotationPoint(-82.0f, 0.0f, -15.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 15, 10, 30, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -6.0f, 0.0f, -1.0f, -13.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, -1.0f, -13.0f);
        this.bodyModel[2].setRotationPoint(-97.0f, 0.0f, -15.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 10, 9, 18, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -1.0f, -5.0f, -8.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, -1.0f, -5.0f, -8.0f);
        this.bodyModel[3].setRotationPoint(-107.0f, 0.0f, -9.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 22, 10, 30, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[4].setRotationPoint(60.0f, 0.0f, -15.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 15, 10, 30, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -7.0f);
        this.bodyModel[5].setRotationPoint(82.0f, 0.0f, -15.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 10, 10, 18, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -6.0f, -2.0f, 0.0f, -8.0f, -2.0f, 0.0f, -8.0f, 0.0f, 0.0f, -6.0f);
        this.bodyModel[6].setRotationPoint(97.0f, 0.0f, -9.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 18, 0.0f, 0.0f, 0.0f, -6.0f, -2.0f, 0.0f, -8.0f, -2.0f, 0.0f, -8.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -8.0f, -5.0f, 0.0f, -9.0f, -5.0f, 0.0f, -9.0f, 0.0f, 0.0f, -8.0f);
        this.bodyModel[7].setRotationPoint(97.0f, 10.0f, -9.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 15, 8, 30, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -12.0f);
        this.bodyModel[8].setRotationPoint(82.0f, 10.0f, -15.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 22, 8, 30, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[9].setRotationPoint(60.0f, 10.0f, -15.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 60, 8, 30, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -8.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 10.0f, -15.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 60, 8, 30, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[11].setRotationPoint(-60.0f, 10.0f, -15.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 22, 8, 30, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -13.0f);
        this.bodyModel[12].setRotationPoint(-82.0f, 10.0f, -15.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 15, 8, 30, 0.0f, 0.0f, 1.0f, -13.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 1.0f, -13.0f, -2.5f, 0.0f, -14.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, -2.5f, 0.0f, -14.0f);
        this.bodyModel[13].setRotationPoint(-97.0f, 10.0f, -15.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 9, 2, 2, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[14].setRotationPoint(-103.0f, 16.0f, -1.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[15].setRotationPoint(-102.5f, 5.0f, -0.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(-101.0f, 11.0f, -0.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-100.0f, 11.5f, 0.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-100.0f, 11.5f, 0.0f);
        this.bodyModel[18].rotateAngleX = 4.1887903f;
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-100.0f, 11.5f, 0.0f);
        this.bodyModel[19].rotateAngleX = 2.0943952f;
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 38, 10, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(-26.0f, -6.0f, -13.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 32, 10, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(-23.0f, -9.0f, -10.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 23, 10, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(-13.9f, -13.0f, -6.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 8, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f);
        this.bodyModel[23].setRotationPoint(1.0f, -16.0f, -4.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(6.0f, -16.0f, -14.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 4, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(6.0f, -12.0f, -14.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 4, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(6.0f, -12.0f, 13.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 5, 10, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(-29.0f, -6.0f, -5.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 4, 13, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(-3.7f, -25.0f, -2.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 1, 17, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[29].setRotationPoint(3.3f, -32.0f, -0.5f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.bodyModel[30].setRotationPoint(3.3f, -37.0f, -0.5f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 10, 0.0f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f);
        this.bodyModel[31].setRotationPoint(3.3f, -30.3f, -5.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 4, 0.0f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f);
        this.bodyModel[32].setRotationPoint(1.8f, -30.7f, -2.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 8, 3, 1, 0.0f, 0.0f, -2.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, 0.0f, -2.0f, -0.45f, -0.4f, 1.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 1.0f, -0.45f);
        this.bodyModel[33].setRotationPoint(-3.9f, -36.5f, -0.5f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 22, 3, 30, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(60.0f, -3.0f, -15.0f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 15, 5, 30, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[35].setRotationPoint(82.0f, -5.0f, -15.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 10, 5, 18, 0.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, -8.0f, 1.0f, 0.0f, -8.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -3.0f);
        this.bodyModel[36].setRotationPoint(97.0f, -5.0f, -9.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 16, 2, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(-76.0f, -1.0f, -8.0f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 16, 2, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-50.0f, -1.0f, -8.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(26.0f, -8.0f, -6.0f);
        this.bodyModel[39].rotateAngleY = -0.5235988f;
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(18.0f, -8.0f, -7.0f);
        this.bodyModel[40].rotateAngleY = 0.20943952f;
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[41].setRotationPoint(40.0f, -8.0f, -1.0f);
        this.bodyModel[41].rotateAngleY = 1.3264502f;
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[42].setRotationPoint(48.0f, -8.0f, -1.0f);
        this.bodyModel[42].rotateAngleY = 0.7853982f;
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].setRotationPoint(39.0f, -8.0f, -10.0f);
        this.bodyModel[43].rotateAngleY = 0.08726646f;
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[44].setRotationPoint(22.0f, -8.0f, 5.0f);
        this.bodyModel[44].rotateAngleY = -0.43633232f;
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 50, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[45].setRotationPoint(10.0f, -3.0f, 14.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 50, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[46].setRotationPoint(10.0f, -3.0f, -15.0f);
    }
    
    private void initleftFrontWheelModel_1() {
        (this.leftFrontWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY)).addShapeBox(-4.0f, -3.0f, -0.5f, 4, 9, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.leftFrontWheelModel[0].setRotationPoint(-102.0f, 10.0f, 0.0f);
    }
}
