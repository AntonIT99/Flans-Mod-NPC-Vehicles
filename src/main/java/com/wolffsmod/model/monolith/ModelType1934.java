//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelType1934 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelType1934() {
        this.textureX = 2048;
        this.textureY = 2048;
        final ModelRendererTurbo[][] gun_1_Model = { new ModelRendererTurbo[1], null, null };
        (gun_1_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 945, 1, this.textureX, this.textureY)).addBox(-10.0f, -7.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart : gun_1_Model[0]) {
            gunPart.setRotationPoint(475.0f, -45.0f, 0.0f);
        }
        gun_1_Model[1] = new ModelRendererTurbo[1];
        (gun_1_Model[1][0] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY)).addBox(-2.0f, -1.0f, -1.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart : gun_1_Model[1]) {
            gunPart.setRotationPoint(475.0f, -45.0f, 0.0f);
        }
        gun_1_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun1", gun_1_Model);
        final ModelRendererTurbo[][] gun_2_Model = { new ModelRendererTurbo[1], null, null };
        (gun_2_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 945, 1, this.textureX, this.textureY)).addBox(-10.0f, -7.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart2 : gun_2_Model[0]) {
            gunPart2.setRotationPoint(-398.0f, -37.0f, 0.0f);
        }
        gun_2_Model[1] = new ModelRendererTurbo[1];
        (gun_2_Model[1][0] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY)).addBox(-2.0f, -1.0f, -1.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart2 : gun_2_Model[1]) {
            gunPart2.setRotationPoint(-398.0f, -37.0f, 0.0f);
        }
        gun_2_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun2", gun_2_Model);
        final ModelRendererTurbo[][] gun_3_Model = { new ModelRendererTurbo[1], null, null };
        (gun_3_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 945, 1, this.textureX, this.textureY)).addBox(-10.0f, -7.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart3 : gun_3_Model[0]) {
            gunPart3.setRotationPoint(-528.0f, -37.0f, 0.0f);
        }
        gun_3_Model[1] = new ModelRendererTurbo[1];
        (gun_3_Model[1][0] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY)).addBox(-2.0f, -1.0f, -1.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart3 : gun_3_Model[1]) {
            gunPart3.setRotationPoint(-528.0f, -37.0f, 0.0f);
        }
        gun_3_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun3", gun_3_Model);
        final ModelRendererTurbo[][] gun_4_Model = { new ModelRendererTurbo[1], null, null };
        (gun_4_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 945, 1, this.textureX, this.textureY)).addBox(-10.0f, -7.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart4 : gun_4_Model[0]) {
            gunPart4.setRotationPoint(-630.0f, -14.0f, 0.0f);
        }
        gun_4_Model[1] = new ModelRendererTurbo[1];
        (gun_4_Model[1][0] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY)).addBox(-2.0f, -1.0f, -1.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart4 : gun_4_Model[1]) {
            gunPart4.setRotationPoint(-630.0f, -14.0f, 0.0f);
        }
        gun_4_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun4", gun_4_Model);
        final ModelRendererTurbo[][] gun_5_Model = { new ModelRendererTurbo[1], null, null };
        (gun_5_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 945, 1, this.textureX, this.textureY)).addBox(-10.0f, -7.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart5 : gun_5_Model[0]) {
            gunPart5.setRotationPoint(405.0f, -58.0f, 0.0f);
        }
        gun_5_Model[1] = new ModelRendererTurbo[1];
        (gun_5_Model[1][0] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY)).addBox(-2.0f, -1.0f, -1.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart5 : gun_5_Model[1]) {
            gunPart5.setRotationPoint(405.0f, -58.0f, 0.0f);
        }
        gun_5_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun5", gun_5_Model);
        this.bodyModel = new ModelRendererTurbo[44];
        this.bodyDoorOpenModel = new ModelRendererTurbo[1];
        this.bodyDoorCloseModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initbodyDoorOpenModel_1();
        this.initbodyDoorCloseModel_1();
        this.initGuns();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 313, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 729, 313, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1281, 313, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 617, 489, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1865, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1841, 417, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 577, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1009, 513, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1425, 513, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 569, 313, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1705, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 1745, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1785, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 561, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 209, 561, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 993, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 1129, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1273, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1393, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 1665, 569, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 1129, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 1161, 649, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 457, 633, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 705, 657, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1497, 649, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 1649, 705, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 1, 665, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 673, 785, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 153, 737, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 937, 793, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 1305, 793, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 1, 865, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 369, 865, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 1585, 833, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 625, 865, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 833, 921, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 985, 921, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 1161, 313, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 1161, 649, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-801.0f, -1.0f, -20.0f, 160, 52, 40, 0.0f, 2.0f, 0.0f, 34.0f, 0.0f, 0.0f, 60.0f, 0.0f, 0.0f, 60.0f, 2.0f, 0.0f, 34.0f, -20.0f, 0.0f, 2.0f, 0.0f, 0.0f, 52.0f, 0.0f, 0.0f, 52.0f, -20.0f, 0.0f, 2.0f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-642.0f, -1.0f, -80.0f, 770, 52, 160, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(137.0f, -31.0f, -80.0f, 200, 82, 160, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 40.0f, 0.0f, -8.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addBox(172.0f, -75.0f, -62.0f, 150, 50, 124, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(337.0f, -31.0f, -58.0f, 161, 82, 116, 0.0f, 0.0f, 0.0f, 22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 22.0f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 14.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(177.0f, -123.0f, -54.0f, 87, 58, 108, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addBox(209.0f, -366.0f, -4.0f, 8, 400, 8, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].rotateAngleZ = 0.06981317f;
        this.bodyModel[7].addBox(206.5f, -377.0f, -6.0f, 12, 18, 12, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 9.0f, 0.0f);
        this.bodyModel[7].rotateAngleZ = 0.06981317f;
        this.bodyModel[8].addBox(201.0f, -300.0f, -35.0f, 10, 6, 70, 0.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].rotateAngleZ = 0.05235988f;
        this.bodyModel[9].addShapeBox(98.0f, -152.0f, -16.0f, 58, 160, 32, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].rotateAngleZ = 0.06981317f;
        this.bodyModel[10].addShapeBox(-44.0f, -40.0f, -20.0f, 140, 41, 40, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 0.0f, 6.0f, 12.0f, 0.0f, 6.0f, 0.0f, 0.0f, 10.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addBox(-163.0f, -51.0f, -42.5f, 120, 50, 85, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addBox(-298.0f, -51.0f, -42.5f, 75, 50, 85, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addBox(-223.0f, -50.0f, -30.0f, 60, 50, 60, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addBox(-344.0f, -193.0f, -4.0f, 8, 159, 8, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].rotateAngleZ = 0.05235988f;
        this.bodyModel[15].addBox(149.0f, -260.0f, 37.0f, 8, 218, 8, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].rotateAngleX = 0.15707964f;
        this.bodyModel[15].rotateAngleZ = -0.15707964f;
        this.bodyModel[16].addBox(148.0f, -260.0f, -48.0f, 8, 219, 8, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].rotateAngleX = -0.15707964f;
        this.bodyModel[16].rotateAngleZ = -0.15707964f;
        this.bodyModel[17].addShapeBox(498.0f, -31.0f, -10.0f, 142, 82, 20, 0.0f, 0.0f, 0.0f, 48.0f, 8.0f, 14.0f, 0.0f, 8.0f, 14.0f, 0.0f, 0.0f, 0.0f, 48.0f, 0.0f, 0.0f, 40.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 40.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(322.0f, -75.0f, -62.0f, 50, 50, 124, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(177.0f, -168.0f, -30.0f, 34, 8, 60, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(182.0f, -242.0f, -22.0f, 25, 8, 44, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-230.0f, -48.0f, -25.0f, 34, 8, 50, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-351.0f, -100.0f, -18.0f, 26, 8, 36, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -14.0f, 2.0f, 0.0f, -14.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -14.0f, 3.0f, 0.0f, -14.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-339.0f, -51.0f, -42.5f, 41, 50, 85, 0.0f, 0.0f, -25.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(641.0f, -80.0f, -1.5f, 3, 44, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-262.0f, -80.0f, -1.5f, 3, 37, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addBox(171.0f, -92.0f, -58.0f, 50, 22, 116, 0.0f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(264.0f, -141.0f, -54.0f, 15, 71, 108, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(177.0f, -141.0f, -54.0f, 87, 18, 108, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(265.0f, -143.0f, -57.0f, 16, 8, 114, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(194.0f, -143.0f, -57.0f, 71, 8, 114, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(-90.0f, -140.0f, -16.0f, 44, 157, 30, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].rotateAngleZ = 0.06981317f;
        this.bodyModel[32].addShapeBox(-170.0f, -57.0f, -15.0f, 140, 41, 31, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 0.0f, 6.0f, 12.0f, 0.0f, 6.0f, 0.0f, 0.0f, 10.0f);
        this.bodyModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(-378.0f, -40.0f, -42.5f, 40, 39, 85, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -25.0f, -10.0f, 0.0f, -25.0f, -10.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(-475.0f, -40.0f, -42.5f, 97, 39, 85, 0.0f, 0.0f, -16.0f, -10.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(-584.0f, -40.0f, -42.5f, 109, 39, 85, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, -10.0f, 0.0f, -16.0f, -10.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(172.0f, -116.0f, -20.0f, 125, 25, 40, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 0.0f, 6.0f, 12.0f, 0.0f, 6.0f, 0.0f, 0.0f, 10.0f);
        this.bodyModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(168.0f, -91.0f, -20.0f, 140, 22, 40, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(368.0f, -46.0f, -52.0f, 68, 15, 109, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(318.0f, -46.0f, -52.0f, 50, 15, 109, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f);
        this.bodyModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(178.0f, -143.0f, -57.0f, 16, 8, 114, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addShapeBox(-240.0f, -71.0f, -15.0f, 152, 20, 31, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 0.0f, 6.0f, 12.0f, 0.0f, 6.0f, 0.0f, 0.0f, 10.0f);
        this.bodyModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[42].addShapeBox(-502.0f, -54.0f, -15.0f, 72, 32, 32, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 0.0f, 6.0f, 12.0f, 0.0f, 6.0f, 0.0f, 0.0f, 10.0f);
        this.bodyModel[42].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[43].addBox(-181.0f, -54.0f, -58.0f, 50, 8, 116, 0.0f);
        this.bodyModel[43].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyDoorOpenModel_1() {
        (this.bodyDoorOpenModel[0] = new ModelRendererTurbo((ModelBase)this, 1098, 974, this.textureX, this.textureY)).addShapeBox(82.0f, -338.0f, -1.5f, 128, 68, 3, 0.0f, -64.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -64.0f, 0.0f, 0.0f, -64.0f, -34.0f, 0.0f, 0.0f, -34.0f, 0.0f, 0.0f, -34.0f, 0.0f, -64.0f, -34.0f, 0.0f);
        this.bodyDoorOpenModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[0].rotateAngleZ = 0.06981317f;
    }
    
    private void initbodyDoorCloseModel_1() {
        (this.bodyDoorCloseModel[0] = new ModelRendererTurbo((ModelBase)this, 1009, 649, this.textureX, this.textureY)).addShapeBox(82.0f, -338.0f, -1.5f, 128, 68, 3, 0.0f, -63.8f, 0.3f, 0.4f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.4f, -63.8f, 0.3f, 0.4f, -63.8f, -34.0f, 0.4f, 0.0f, -34.0f, 0.4f, 0.0f, -34.0f, 0.4f, -63.8f, -34.0f, 0.4f);
        this.bodyDoorCloseModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[0].rotateAngleZ = 0.06981317f;
    }
    
    private void initGuns() {
    }
}
