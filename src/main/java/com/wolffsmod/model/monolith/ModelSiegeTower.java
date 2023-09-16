//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelSiegeTower extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelSiegeTower() {
        this.textureX = 1024;
        this.textureY = 512;
        this.bodyModel = new ModelRendererTurbo[27];
        this.leftBackWheelModel = new ModelRendererTurbo[9];
        this.rightBackWheelModel = new ModelRendererTurbo[9];
        this.initbodyModel_1();
        this.initleftBackWheelModel_1();
        this.initrightBackWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 345, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 121, 73, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 801, 49, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 961, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 881, 57, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 921, 57, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 497, 73, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 553, 73, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 625, 73, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 569, 153, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 233, 161, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 593, 73, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 665, 73, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 721, 73, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 385, 177, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 185, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 249, 185, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 905, 185, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 737, 225, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 313, 233, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 385, 257, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 505, 257, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 48, 100, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-8.0f, -104.0f, -35.0f);
        this.bodyModel[0].rotateAngleX = -0.06981317f;
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, -0.5f, 48, 100, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-8.0f, -104.0f, 35.0f);
        this.bodyModel[1].rotateAngleX = 0.06981317f;
        this.bodyModel[2].addShapeBox(0.0f, 51.0f, -0.5f, 64, 50, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(-72.01f, -105.0f, 35.0f);
        this.bodyModel[2].rotateAngleX = 0.06981317f;
        this.bodyModel[3].addShapeBox(0.0f, 51.0f, -0.5f, 64, 50, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(-72.01f, -105.0f, -35.0f);
        this.bodyModel[3].rotateAngleX = -0.06981317f;
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 142, 3, 84, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(-72.01f, -5.0f, -42.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 100, 70, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f);
        this.bodyModel[5].setRotationPoint(39.0f, -104.0f, -35.0f);
        this.bodyModel[5].rotateAngleZ = 0.05235988f;
        this.bodyModel[6].addShapeBox(0.0f, 61.0f, -0.5f, 24, 40, 1, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(41.99f, -105.0f, -35.0f);
        this.bodyModel[6].rotateAngleX = -0.06981317f;
        this.bodyModel[7].addShapeBox(0.0f, 41.0f, -0.5f, 18, 20, 1, 0.0f, 2.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(41.99f, -105.0f, -35.0f);
        this.bodyModel[7].rotateAngleX = -0.06981317f;
        this.bodyModel[8].addShapeBox(0.0f, 41.0f, -0.5f, 18, 20, 1, 0.0f, 2.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(41.99f, -105.0f, 35.0f);
        this.bodyModel[8].rotateAngleX = 0.06981317f;
        this.bodyModel[9].addShapeBox(0.0f, 61.0f, -0.5f, 24, 40, 1, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(41.99f, -105.0f, 35.0f);
        this.bodyModel[9].rotateAngleX = 0.06981317f;
        this.bodyModel[10].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 27, 76, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[10].setRotationPoint(42.5f, -64.0f, -38.0f);
        this.bodyModel[10].rotateAngleZ = 0.715585f;
        this.bodyModel[11].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 40, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(60.0f, -44.0f, -39.0f);
        this.bodyModel[11].rotateAngleZ = 0.19198622f;
        this.bodyModel[12].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 40, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f);
        this.bodyModel[12].setRotationPoint(60.0f, -44.0f, 7.0f);
        this.bodyModel[12].rotateAngleZ = 0.19198622f;
        this.bodyModel[13].addShapeBox(-35.0f, -2.0f, 0.0f, 100, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(45.0f, -27.0f, -6.0f);
        this.bodyModel[14].addShapeBox(-35.0f, -6.0f, 0.0f, 100, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(45.0f, -27.0f, -6.0f);
        this.bodyModel[15].addShapeBox(-35.0f, 2.0f, 0.0f, 100, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[15].setRotationPoint(45.0f, -27.0f, -6.0f);
        this.bodyModel[16].addShapeBox(65.0f, -6.0f, 0.0f, 15, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(45.0f, -27.0f, -6.0f);
        this.bodyModel[17].addShapeBox(65.0f, -2.0f, 0.0f, 15, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(45.0f, -27.0f, -6.0f);
        this.bodyModel[18].addShapeBox(65.0f, 2.0f, 0.0f, 15, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[18].setRotationPoint(45.0f, -27.0f, -6.0f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 115, 1, 78, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-72.01f, -36.0f, -39.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 49, 1, 74, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(-8.01f, -79.0f, -37.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 13, 50, 39, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(10.0f, -130.0f, -19.5f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 13, 50, 39, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(23.0f, -130.0f, -19.5f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 13, 50, 39, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f);
        this.bodyModel[23].setRotationPoint(-3.0f, -130.0f, -19.5f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 14, 15, 43, 0.0f, -4.0f, -4.0f, -16.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, -4.0f, -4.0f, -16.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f);
        this.bodyModel[24].setRotationPoint(-5.0f, -145.0f, -21.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 15, 15, 43, 0.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(9.0f, -145.0f, -21.5f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 14, 15, 43, 0.0f, 0.0f, 0.0f, -14.0f, -4.0f, -4.0f, -16.0f, -4.0f, -4.0f, -16.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(24.0f, -145.0f, -21.5f);
    }
    
    private void initleftBackWheelModel_1() {
        this.leftBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 641, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 721, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 801, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 881, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 473, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 553, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 633, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 713, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[8] = new ModelRendererTurbo((ModelBase)this, 793, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[0].setRotationPoint(-4.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[1].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[1].setRotationPoint(-4.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[2].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[2].setRotationPoint(-4.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[3].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[3].setRotationPoint(-55.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[4].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[4].setRotationPoint(-55.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[5].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[5].setRotationPoint(-55.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[6].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[6].setRotationPoint(45.99f, -4.0f, 30.0f);
        this.leftBackWheelModel[7].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[7].setRotationPoint(45.99f, -4.0f, 30.0f);
        this.leftBackWheelModel[8].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[8].setRotationPoint(45.99f, -4.0f, 30.0f);
    }
    
    private void initrightBackWheelModel_1() {
        this.rightBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 481, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 561, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 641, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 721, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 801, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 881, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 945, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 481, 25, this.textureX, this.textureY);
        this.rightBackWheelModel[8] = new ModelRendererTurbo((ModelBase)this, 561, 25, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[0].setRotationPoint(-55.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[1].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[1].setRotationPoint(-55.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[2].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[2].setRotationPoint(-55.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[3].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[3].setRotationPoint(-4.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[4].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[4].setRotationPoint(-4.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[5].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[5].setRotationPoint(-4.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[6].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[6].setRotationPoint(45.99f, -4.0f, -39.0f);
        this.rightBackWheelModel[7].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[7].setRotationPoint(45.99f, -4.0f, -39.0f);
        this.rightBackWheelModel[8].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[8].setRotationPoint(45.99f, -4.0f, -39.0f);
    }
}
