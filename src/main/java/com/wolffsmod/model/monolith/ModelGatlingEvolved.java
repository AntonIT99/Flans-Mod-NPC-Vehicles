//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGatlingEvolved extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelGatlingEvolved() {
        this.textureX = 512;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[15];
        this.turretModel = new ModelRendererTurbo[3];
        this.barrelModel = new ModelRendererTurbo[39];
        this.leftBackWheelModel = new ModelRendererTurbo[19];
        this.rightBackWheelModel = new ModelRendererTurbo[19];
        this.initbodyModel_1();
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.initleftBackWheelModel_1();
        this.initrightBackWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 337, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 401, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 169, 17, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 217, 17, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 137, 17, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-29.0f, 12.0f, -4.0f, 29, 3, 8, 0.0f);
        this.bodyModel[0].setRotationPoint(-8.0f, -17.0f, 0.0f);
        this.bodyModel[0].rotateAngleZ = 0.2617994f;
        this.bodyModel[1].addBox(-29.0f, 12.0f, -4.0f, 29, 1, 8, 0.0f);
        this.bodyModel[1].setRotationPoint(-8.0f, -18.0f, 0.0f);
        this.bodyModel[1].rotateAngleZ = 0.2617994f;
        this.bodyModel[2].addBox(-4.0f, 10.0f, -27.0f, 4, 3, 54, 0.0f);
        this.bodyModel[2].setRotationPoint(-8.0f, -12.0f, 0.0f);
        this.bodyModel[2].rotateAngleZ = 0.2617994f;
        this.bodyModel[3].addBox(-0.25f, 11.5f, -4.0f, 10, 4, 8, 0.0f);
        this.bodyModel[3].setRotationPoint(-5.0f, -18.0f, 0.0f);
        this.bodyModel[4].addBox(-28.25f, 12.0f, -4.0f, 23, 1, 8, 0.0f);
        this.bodyModel[4].setRotationPoint(-8.0f, -14.0f, 0.0f);
        this.bodyModel[4].rotateAngleZ = 0.2617994f;
        this.bodyModel[5].addShapeBox(-49.0f, 12.0f, -4.0f, 20, 1, 8, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-8.0f, -18.0f, 0.0f);
        this.bodyModel[5].rotateAngleZ = 0.2617994f;
        this.bodyModel[6].addShapeBox(-49.0f, 12.0f, -4.0f, 20, 3, 8, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(-8.0f, -17.0f, 0.0f);
        this.bodyModel[6].rotateAngleZ = 0.2617994f;
        this.bodyModel[7].addShapeBox(-47.3f, 12.0f, -4.0f, 20, 1, 8, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(-8.0f, -14.0f, 0.0f);
        this.bodyModel[7].rotateAngleZ = 0.2617994f;
        this.bodyModel[8].addShapeBox(-58.0f, 15.0f, -4.0f, 9, 3, 8, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(-8.0f, -17.0f, 0.0f);
        this.bodyModel[8].rotateAngleZ = 0.2617994f;
        this.bodyModel[9].addShapeBox(-58.0f, 13.0f, -4.0f, 9, 1, 8, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-8.0f, -18.0f, 0.0f);
        this.bodyModel[9].rotateAngleZ = 0.2617994f;
        this.bodyModel[10].addShapeBox(-67.0f, 25.98f, -4.0f, 14, 1, 8, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-8.0f, -21.0f, 0.0f);
        this.bodyModel[10].rotateAngleZ = 0.08726646f;
        this.bodyModel[11].addShapeBox(-67.0f, 27.98f, -4.0f, 14, 3, 8, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(-8.0f, -20.0f, 0.0f);
        this.bodyModel[11].rotateAngleZ = 0.08726646f;
        this.bodyModel[12].addShapeBox(-67.0f, 32.98f, -4.0f, 14, 1, 8, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(-8.0f, -26.0f, 0.0f);
        this.bodyModel[12].rotateAngleZ = 0.08726646f;
        this.bodyModel[13].addShapeBox(-58.0f, 20.0f, -4.0f, 9, 1, 8, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(-8.0f, -23.0f, 0.0f);
        this.bodyModel[13].rotateAngleZ = 0.2617994f;
        this.bodyModel[14].addShapeBox(-68.0f, 27.98f, -4.0f, 1, 3, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(-8.0f, -20.0f, 0.0f);
        this.bodyModel[14].rotateAngleZ = 0.08726646f;
    }
    
    private void initturretModel_1() {
        this.turretModel[0] = new ModelRendererTurbo((ModelBase)this, 297, 17, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 473, 81, this.textureX, this.textureY);
        this.turretModel[0].addShapeBox(-1.0f, -0.5f, -7.5f, 3, 8, 1, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.turretModel[0].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.turretModel[1].addShapeBox(-1.0f, -0.5f, 6.5f, 3, 8, 1, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.turretModel[1].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.turretModel[2].addShapeBox(-1.0f, 8.0f, -7.5f, 3, 2, 15, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, -1.7f, 0.0f, 0.3f, -1.7f, 0.0f, 0.3f, -1.7f, 0.0f, 0.3f, -1.7f);
        this.turretModel[2].setRotationPoint(0.0f, -17.0f, 0.0f);
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 257, 17, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 297, 17, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 345, 17, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 393, 17, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 441, 17, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 497, 9, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase)this, 385, 25, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase)this, 481, 25, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase)this, 497, 25, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo((ModelBase)this, 73, 33, this.textureX, this.textureY);
        this.barrelModel[14] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[15] = new ModelRendererTurbo((ModelBase)this, 145, 33, this.textureX, this.textureY);
        this.barrelModel[16] = new ModelRendererTurbo((ModelBase)this, 137, 41, this.textureX, this.textureY);
        this.barrelModel[17] = new ModelRendererTurbo((ModelBase)this, 417, 57, this.textureX, this.textureY);
        this.barrelModel[18] = new ModelRendererTurbo((ModelBase)this, 177, 65, this.textureX, this.textureY);
        this.barrelModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.barrelModel[20] = new ModelRendererTurbo((ModelBase)this, 17, 81, this.textureX, this.textureY);
        this.barrelModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.barrelModel[22] = new ModelRendererTurbo((ModelBase)this, 137, 97, this.textureX, this.textureY);
        this.barrelModel[23] = new ModelRendererTurbo((ModelBase)this, 273, 97, this.textureX, this.textureY);
        this.barrelModel[24] = new ModelRendererTurbo((ModelBase)this, 433, 65, this.textureX, this.textureY);
        this.barrelModel[25] = new ModelRendererTurbo((ModelBase)this, 497, 81, this.textureX, this.textureY);
        this.barrelModel[26] = new ModelRendererTurbo((ModelBase)this, 457, 89, this.textureX, this.textureY);
        this.barrelModel[27] = new ModelRendererTurbo((ModelBase)this, 129, 17, this.textureX, this.textureY);
        this.barrelModel[28] = new ModelRendererTurbo((ModelBase)this, 425, 33, this.textureX, this.textureY);
        this.barrelModel[29] = new ModelRendererTurbo((ModelBase)this, 209, 17, this.textureX, this.textureY);
        this.barrelModel[30] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[31] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[32] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[33] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[34] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[35] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[36] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[37] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[38] = new ModelRendererTurbo((ModelBase)this, 361, 89, this.textureX, this.textureY);
        this.barrelModel[0].addBox(-28.0f, -5.0f, -1.0f, 16, 10, 2, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[1].addBox(-28.0f, -1.0f, -5.0f, 16, 2, 10, 0.0f);
        this.barrelModel[1].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[2].addShapeBox(-28.0f, -5.0f, 1.0f, 16, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[2].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[3].addShapeBox(-28.0f, -5.0f, -5.0f, 16, 4, 4, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[3].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[4].addShapeBox(-28.0f, 1.0f, 1.0f, 16, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f);
        this.barrelModel[4].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[5].addShapeBox(-28.0f, 1.0f, -5.0f, 16, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[5].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[6].addShapeBox(-30.0f, -6.0f, 1.0f, 2, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[6].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[7].addShapeBox(-30.0f, -6.0f, -1.0f, 2, 12, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[7].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[8].addShapeBox(-30.0f, -6.0f, -6.0f, 2, 5, 5, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[8].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[9].addBox(-30.0f, -1.0f, -6.0f, 2, 2, 12, 0.0f);
        this.barrelModel[9].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[10].addShapeBox(-30.0f, 1.0f, -6.0f, 2, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[10].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[11].addShapeBox(-30.0f, 1.0f, 1.0f, 2, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f);
        this.barrelModel[11].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[12].addShapeBox(-33.0f, -1.0f, -1.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[12].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[13].addShapeBox(-35.0f, -2.0f, -2.0f, 2, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[13].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[14].addShapeBox(-12.0f, 3.5f, -0.5f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[14].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[15].addShapeBox(22.0f, 1.0f, 1.0f, 2, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f);
        this.barrelModel[15].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[16].addBox(22.0f, -5.0f, -1.0f, 2, 10, 2, 0.0f);
        this.barrelModel[16].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[17].addShapeBox(22.0f, 1.0f, -5.0f, 2, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[17].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[18].addBox(22.0f, -1.0f, -5.0f, 2, 2, 10, 0.0f);
        this.barrelModel[18].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[19].addShapeBox(22.0f, -5.0f, -5.0f, 2, 4, 4, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[19].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[20].addShapeBox(22.0f, -5.0f, 1.0f, 2, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[20].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[21].addShapeBox(-29.0f, -0.5f, -6.5f, 65, 2, 1, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.barrelModel[21].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[22].addShapeBox(-29.0f, -0.5f, 5.5f, 65, 2, 1, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.barrelModel[22].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[23].addShapeBox(-12.0f, -0.5f, -0.5f, 50, 1, 1, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f);
        this.barrelModel[23].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[24].addShapeBox(34.0f, 0.0f, -6.5f, 1, 1, 12, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.barrelModel[24].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[25].addBox(-15.0f, -6.0f, -2.0f, 2, 10, 4, 0.0f);
        this.barrelModel[25].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[26].addShapeBox(-15.0f, -30.0f, -2.0f, 2, 24, 4, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f);
        this.barrelModel[26].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[27].addShapeBox(-26.0f, 0.0f, -9.5f, 1, 1, 3, 0.0f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.barrelModel[27].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[28].addShapeBox(-26.0f, 0.0f, -9.5f, 1, 10, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[28].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[29].addShapeBox(-26.0f, 9.0f, -12.5f, 1, 1, 3, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f);
        this.barrelModel[29].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[30].addShapeBox(-12.0f, 1.3f, -4.3f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[30].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[31].addShapeBox(-12.0f, 1.3f, 3.3f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[31].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[32].addShapeBox(-12.0f, 2.8f, 1.8f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[32].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[33].addShapeBox(-12.0f, 2.8f, -2.8f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[33].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[34].addShapeBox(-12.0f, -4.5f, -0.5f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[34].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[35].addShapeBox(-12.0f, -2.3f, -4.3f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[35].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[36].addShapeBox(-12.0f, -3.8f, -2.8f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[36].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[37].addShapeBox(-12.0f, -2.3f, 3.3f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[37].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.barrelModel[38].addShapeBox(-12.0f, -3.8f, 1.8f, 45, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[38].setRotationPoint(0.0f, -17.0f, 0.0f);
    }
    
    private void initleftBackWheelModel_1() {
        this.leftBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 433, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 169, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 193, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 241, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 297, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 345, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[8] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.leftBackWheelModel[9] = new ModelRendererTurbo((ModelBase)this, 401, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[10] = new ModelRendererTurbo((ModelBase)this, 241, 41, this.textureX, this.textureY);
        this.leftBackWheelModel[11] = new ModelRendererTurbo((ModelBase)this, 449, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[12] = new ModelRendererTurbo((ModelBase)this, 289, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.leftBackWheelModel[14] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.leftBackWheelModel[15] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.leftBackWheelModel[16] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.leftBackWheelModel[17] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.leftBackWheelModel[18] = new ModelRendererTurbo((ModelBase)this, 457, 41, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addBox(-1.0f, -9.5f, 29.0f, 2, 42, 2, 0.0f);
        this.leftBackWheelModel[0].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[1].addShapeBox(-21.0f, 11.5f, 29.0f, 22, 2, 2, 0.0f, -7.0f, 16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, 16.0f, 0.0f, -5.0f, -18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -18.0f, 0.0f);
        this.leftBackWheelModel[1].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[2].addShapeBox(-21.0f, -4.5f, 28.0f, 6, 15, 4, 0.0f, -5.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[2].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[3].addShapeBox(-19.0f, -9.5f, 28.0f, 18, 5, 4, 0.0f, -3.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -5.0f, 0.0f, -3.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 2.0f, 0.0f);
        this.leftBackWheelModel[3].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[4].addShapeBox(-7.0f, 26.5f, 29.0f, 22, 2, 2, 0.0f, -7.0f, 16.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -7.0f, 16.0f, 0.0f, -5.0f, -18.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -5.0f, -18.0f, 0.0f);
        this.leftBackWheelModel[4].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[5].addShapeBox(1.0f, 24.5f, 28.0f, 17, 8, 4, 0.0f, 0.0f, -6.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -5.0f, 0.0f, -2.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[5].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[6].addBox(-21.0f, 10.5f, 29.0f, 42, 2, 2, 0.0f);
        this.leftBackWheelModel[6].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[7].addShapeBox(13.0f, 12.5f, 28.0f, 8, 17, 4, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -5.0f, -2.0f, 0.0f, -5.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f);
        this.leftBackWheelModel[7].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[8].addShapeBox(-19.0f, 27.5f, 28.0f, 18, 5, 4, 0.0f, -3.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -5.0f, 0.0f);
        this.leftBackWheelModel[8].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[9].addShapeBox(-21.0f, 12.5f, 28.0f, 5, 18, 4, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -3.0f, 0.0f, 2.0f, -3.0f, 0.0f, 2.0f, -3.0f, 0.0f, -5.0f, -3.0f, 0.0f);
        this.leftBackWheelModel[9].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[10].addShapeBox(1.0f, -9.5f, 28.0f, 18, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -5.0f, 0.0f, -3.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f);
        this.leftBackWheelModel[10].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[11].addShapeBox(16.0f, -4.5f, 28.0f, 5, 15, 4, 0.0f, 2.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[11].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[12].addShapeBox(0.0f, -7.5f, 29.0f, 20, 20, 2, 0.0f, 0.0f, -18.0f, 0.0f, -6.0f, -3.0f, 0.0f, -6.0f, -3.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, -15.0f, 0.0f, -5.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[12].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[13].addShapeBox(-14.0f, 7.5f, 29.0f, 20, 20, 2, 0.0f, 1.0f, -19.0f, 0.0f, -6.0f, -3.0f, 0.0f, -6.0f, -3.0f, 0.0f, 1.0f, -19.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, -15.0f, 0.0f, -5.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[13].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[14].addBox(-21.0f, 10.5f, 28.0f, 2, 2, 4, 0.0f);
        this.leftBackWheelModel[14].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[15].addBox(-1.0f, -9.5f, 28.0f, 2, 2, 4, 0.0f);
        this.leftBackWheelModel[15].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[16].addBox(19.0f, 10.5f, 28.0f, 2, 2, 4, 0.0f);
        this.leftBackWheelModel[16].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[17].addBox(-1.0f, 30.5f, 28.0f, 2, 2, 4, 0.0f);
        this.leftBackWheelModel[17].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.leftBackWheelModel[18].addBox(-1.0f, 10.5f, 19.0f, 2, 2, 12, 0.0f);
        this.leftBackWheelModel[18].setRotationPoint(-8.0f, -11.5f, 0.0f);
    }
    
    private void initrightBackWheelModel_1() {
        this.rightBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 377, 41, this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 193, 49, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 489, 41, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 225, 57, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 449, 57, this.textureX, this.textureY);
        this.rightBackWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 65, this.textureX, this.textureY);
        this.rightBackWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 337, 57, this.textureX, this.textureY);
        this.rightBackWheelModel[8] = new ModelRendererTurbo((ModelBase)this, 193, 65, this.textureX, this.textureY);
        this.rightBackWheelModel[9] = new ModelRendererTurbo((ModelBase)this, 393, 57, this.textureX, this.textureY);
        this.rightBackWheelModel[10] = new ModelRendererTurbo((ModelBase)this, 241, 65, this.textureX, this.textureY);
        this.rightBackWheelModel[11] = new ModelRendererTurbo((ModelBase)this, 49, 73, this.textureX, this.textureY);
        this.rightBackWheelModel[12] = new ModelRendererTurbo((ModelBase)this, 73, 73, this.textureX, this.textureY);
        this.rightBackWheelModel[13] = new ModelRendererTurbo((ModelBase)this, 121, 73, this.textureX, this.textureY);
        this.rightBackWheelModel[14] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[15] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[16] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[17] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[18] = new ModelRendererTurbo((ModelBase)this, 481, 65, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addBox(-1.0f, -9.5f, -31.0f, 2, 42, 2, 0.0f);
        this.rightBackWheelModel[0].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[1].addShapeBox(-21.0f, 11.5f, -31.0f, 22, 2, 2, 0.0f, -7.0f, 16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, 16.0f, 0.0f, -5.0f, -18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -18.0f, 0.0f);
        this.rightBackWheelModel[1].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[2].addShapeBox(-21.0f, -4.5f, -32.0f, 6, 15, 4, 0.0f, -5.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[2].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[3].addShapeBox(-19.0f, -9.5f, -32.0f, 18, 5, 4, 0.0f, -3.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -5.0f, 0.0f, -3.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 2.0f, 0.0f);
        this.rightBackWheelModel[3].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[4].addShapeBox(-7.0f, 26.5f, -31.0f, 22, 2, 2, 0.0f, -7.0f, 16.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -7.0f, 16.0f, 0.0f, -5.0f, -18.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -5.0f, -18.0f, 0.0f);
        this.rightBackWheelModel[4].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[5].addShapeBox(1.0f, 24.5f, -32.0f, 17, 8, 4, 0.0f, 0.0f, -6.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -5.0f, 0.0f, -2.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[5].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[6].addBox(-21.0f, 10.5f, -31.0f, 42, 2, 2, 0.0f);
        this.rightBackWheelModel[6].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[7].addShapeBox(13.0f, 12.5f, -32.0f, 8, 17, 4, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -5.0f, -2.0f, 0.0f, -5.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f);
        this.rightBackWheelModel[7].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[8].addShapeBox(-19.0f, 27.5f, -32.0f, 18, 5, 4, 0.0f, -3.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -5.0f, 0.0f);
        this.rightBackWheelModel[8].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[9].addShapeBox(-21.0f, 12.5f, -32.0f, 5, 18, 4, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -3.0f, 0.0f, 2.0f, -3.0f, 0.0f, 2.0f, -3.0f, 0.0f, -5.0f, -3.0f, 0.0f);
        this.rightBackWheelModel[9].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[10].addShapeBox(1.0f, -9.5f, -32.0f, 18, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -5.0f, 0.0f, -3.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f);
        this.rightBackWheelModel[10].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[11].addShapeBox(16.0f, -4.5f, -32.0f, 5, 15, 4, 0.0f, 2.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[11].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[12].addShapeBox(0.0f, -7.5f, -31.0f, 20, 20, 2, 0.0f, 0.0f, -18.0f, 0.0f, -6.0f, -3.0f, 0.0f, -6.0f, -3.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, -15.0f, 0.0f, -5.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[12].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[13].addShapeBox(-14.0f, 7.5f, -31.0f, 20, 20, 2, 0.0f, 1.0f, -19.0f, 0.0f, -6.0f, -3.0f, 0.0f, -6.0f, -3.0f, 0.0f, 1.0f, -19.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, -15.0f, 0.0f, -5.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[13].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[14].addBox(-21.0f, 10.5f, -32.0f, 2, 2, 4, 0.0f);
        this.rightBackWheelModel[14].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[15].addBox(-1.0f, -9.5f, -32.0f, 2, 2, 4, 0.0f);
        this.rightBackWheelModel[15].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[16].addBox(19.0f, 10.5f, -32.0f, 2, 2, 4, 0.0f);
        this.rightBackWheelModel[16].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[17].addBox(-1.0f, 30.5f, -32.0f, 2, 2, 4, 0.0f);
        this.rightBackWheelModel[17].setRotationPoint(-8.0f, -11.5f, 0.0f);
        this.rightBackWheelModel[18].addBox(-1.0f, 10.5f, -31.0f, 2, 2, 12, 0.0f);
        this.rightBackWheelModel[18].setRotationPoint(-8.0f, -11.5f, 0.0f);
    }
}
