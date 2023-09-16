//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelTribal extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelTribal() {
        this.textureX = 2048;
        this.textureY = 2048;
        final ModelRendererTurbo[][] gun_1_Model = { new ModelRendererTurbo[1], null, null };
        (gun_1_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 913, 1, this.textureX, this.textureY)).addBox(-10.0f, -9.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart : gun_1_Model[0]) {
            gunPart.setRotationPoint(547.0f, -42.0f, 0.0f);
        }
        (gun_1_Model[1] = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 985, 1, this.textureX, this.textureY);
        gun_1_Model[1][1] = new ModelRendererTurbo((ModelBase)this, 1865, 1, this.textureX, this.textureY);
        gun_1_Model[1][0].addBox(-1.0f, -2.0f, -6.5f, 50, 3, 3, 0.0f);
        gun_1_Model[1][1].addBox(-1.0f, -2.0f, 3.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart : gun_1_Model[1]) {
            gunPart.setRotationPoint(547.0f, -42.0f, 0.0f);
        }
        gun_1_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun1", gun_1_Model);
        final ModelRendererTurbo[][] gun_2_Model = { new ModelRendererTurbo[1], null, null };
        (gun_2_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 913, 1, this.textureX, this.textureY)).addBox(-10.0f, -9.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart2 : gun_2_Model[0]) {
            gunPart2.setRotationPoint(-575.0f, -49.0f, 0.0f);
        }
        (gun_2_Model[1] = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 985, 1, this.textureX, this.textureY);
        gun_2_Model[1][1] = new ModelRendererTurbo((ModelBase)this, 1865, 1, this.textureX, this.textureY);
        gun_2_Model[1][0].addBox(-1.0f, -2.0f, -6.5f, 50, 3, 3, 0.0f);
        gun_2_Model[1][1].addBox(-1.0f, -2.0f, 3.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart2 : gun_2_Model[1]) {
            gunPart2.setRotationPoint(-575.0f, -49.0f, 0.0f);
        }
        gun_2_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun2", gun_2_Model);
        final ModelRendererTurbo[][] gun_3_Model = { new ModelRendererTurbo[1], null, null };
        (gun_3_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 913, 1, this.textureX, this.textureY)).addBox(-10.0f, -9.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart3 : gun_3_Model[0]) {
            gunPart3.setRotationPoint(-790.0f, -14.0f, 0.0f);
        }
        (gun_3_Model[1] = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 985, 1, this.textureX, this.textureY);
        gun_3_Model[1][1] = new ModelRendererTurbo((ModelBase)this, 1865, 1, this.textureX, this.textureY);
        gun_3_Model[1][0].addBox(-1.0f, -2.0f, -6.5f, 50, 3, 3, 0.0f);
        gun_3_Model[1][1].addBox(-1.0f, -2.0f, 3.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart3 : gun_3_Model[1]) {
            gunPart3.setRotationPoint(-790.0f, -14.0f, 0.0f);
        }
        gun_3_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun3", gun_3_Model);
        final ModelRendererTurbo[][] gun_4_Model = { new ModelRendererTurbo[1], null, null };
        (gun_4_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 913, 1, this.textureX, this.textureY)).addBox(-10.0f, -9.0f, -15.0f, 20, 20, 30, 0.0f);
        for (final ModelRendererTurbo gunPart4 : gun_4_Model[0]) {
            gunPart4.setRotationPoint(393.0f, -75.0f, 0.0f);
        }
        (gun_4_Model[1] = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 985, 1, this.textureX, this.textureY);
        gun_4_Model[1][1] = new ModelRendererTurbo((ModelBase)this, 1865, 1, this.textureX, this.textureY);
        gun_4_Model[1][0].addBox(-1.0f, -2.0f, -6.5f, 50, 3, 3, 0.0f);
        gun_4_Model[1][1].addBox(-1.0f, -2.0f, 3.5f, 50, 3, 3, 0.0f);
        for (final ModelRendererTurbo gunPart4 : gun_4_Model[1]) {
            gunPart4.setRotationPoint(393.0f, -75.0f, 0.0f);
        }
        gun_4_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun4", gun_4_Model);
        this.bodyModel = new ModelRendererTurbo[42];
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
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, -119, 809, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1091, 1123, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 977, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 857, 177, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1601, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1977, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 817, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 817, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1417, 177, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 137, 249, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1537, 265, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 553, 249, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1873, 169, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 1913, 169, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 801, 249, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 841, 377, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 425, 361, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 329, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 1537, 9, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 225, 97, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 929, 57, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 1473, 65, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 1249, 377, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 873, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 1633, 1, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 1385, 401, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 1801, 385, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 401, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 161, 457, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 689, 481, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 857, 481, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 297, 537, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 1, 545, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 1321, 561, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 817, 81, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 1601, 561, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 537, 609, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 865, 657, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 1793, 641, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 1281, 697, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-917.0f, -1.0f, -20.0f, 160, 52, 40, 0.0f, 2.0f, 0.0f, 16.0f, 0.0f, 0.0f, 60.0f, 0.0f, 0.0f, 60.0f, 2.0f, 0.0f, 16.0f, 0.0f, 0.0f, 11.0f, 0.0f, 0.0f, 52.0f, 0.0f, 0.0f, 52.0f, 0.0f, 0.0f, 11.0f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-757.0f, -1.0f, -80.0f, 885, 52, 160, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(137.0f, -31.0f, -80.0f, 200, 82, 160, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 40.0f, 0.0f, -8.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(139.0f, -75.0f, -62.0f, 184, 50, 124, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -11.0f, 0.0f, 0.0f, -11.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(337.0f, -31.0f, -58.0f, 220, 82, 116, 0.0f, 0.0f, 0.0f, 22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 22.0f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 14.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(188.0f, -123.0f, -54.0f, 76, 58, 108, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addBox(140.0f, -366.0f, -4.0f, 8, 400, 8, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].rotateAngleZ = 0.06981317f;
        this.bodyModel[7].addBox(137.5f, -368.0f, -6.0f, 12, 18, 12, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].rotateAngleZ = 0.06981317f;
        this.bodyModel[8].addBox(118.0f, -255.0f, -35.0f, 10, 6, 70, 0.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].rotateAngleZ = 0.05235988f;
        this.bodyModel[9].addShapeBox(0.0f, -128.0f, -22.0f, 64, 160, 44, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].rotateAngleZ = 0.06981317f;
        this.bodyModel[10].addShapeBox(-44.0f, -40.0f, -20.0f, 185, 41, 40, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 0.0f, 6.0f, 12.0f, 0.0f, 6.0f, 0.0f, 0.0f, 10.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addBox(-163.0f, -51.0f, -42.5f, 120, 50, 85, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addBox(-299.0f, -51.0f, -42.5f, 76, 50, 85, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addBox(-223.0f, -50.0f, -30.0f, 60, 50, 60, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addBox(116.0f, -298.0f, -4.0f, 8, 291, 8, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].rotateAngleZ = 0.05235988f;
        this.bodyModel[15].addBox(64.0f, -205.0f, 40.0f, 8, 207, 8, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].rotateAngleX = 0.15707964f;
        this.bodyModel[15].rotateAngleZ = -0.15707964f;
        this.bodyModel[16].addBox(64.0f, -205.0f, -48.0f, 8, 207, 8, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].rotateAngleX = -0.15707964f;
        this.bodyModel[16].rotateAngleZ = -0.15707964f;
        this.bodyModel[17].addShapeBox(557.0f, -31.0f, -10.0f, 180, 82, 20, 0.0f, 0.0f, 0.0f, 48.0f, 8.0f, 14.0f, 0.0f, 8.0f, 14.0f, 0.0f, 0.0f, 0.0f, 48.0f, 0.0f, 0.0f, 40.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 40.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(428.0f, -64.0f, -62.0f, 63, 47, 124, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(111.0f, -102.0f, -30.0f, 34, 8, 60, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(107.0f, -245.0f, -22.0f, 25, 8, 44, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(94.0f, -213.0f, -19.0f, 45, 10, 40, 0.0f, -4.0f, 0.0f, 0.0f, 2.0f, 0.0f, -12.0f, 2.0f, 0.0f, -12.0f, -4.0f, 0.0f, 0.0f, -1.0f, 6.0f, 1.0f, 3.0f, 0.0f, -12.0f, 3.0f, 0.0f, -12.0f, -1.0f, 6.0f, 1.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-230.0f, -48.0f, -25.0f, 34, 8, 50, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(86.0f, -111.0f, -18.0f, 26, 8, 36, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -14.0f, 2.0f, 0.0f, -14.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -14.0f, 3.0f, 0.0f, -14.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(-339.0f, -51.0f, -42.5f, 40, 50, 85, 0.0f, 0.0f, -25.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(737.0f, -80.0f, -1.5f, 3, 44, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-414.0f, -80.0f, -1.5f, 3, 37, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addBox(138.0f, -103.0f, -58.0f, 88, 37, 116, 0.0f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(264.0f, -141.0f, -54.0f, 15, 77, 108, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(236.0f, -141.0f, -54.0f, 28, 18, 108, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(265.0f, -143.0f, -57.0f, 16, 8, 114, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(236.0f, -143.0f, -57.0f, 29, 8, 114, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(323.0f, -64.0f, -62.0f, 105, 47, 124, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(216.0f, -113.0f, -66.0f, 32, 13, 130, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(-171.0f, -148.0f, -18.0f, 52, 163, 35, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].rotateAngleZ = 0.06981317f;
        this.bodyModel[35].addShapeBox(242.0f, -125.0f, -37.0f, 63, 61, 74, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, -23.0f, 0.0f, -10.0f, -23.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -23.0f, 0.0f, 0.0f, -23.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addBox(118.0f, -278.0f, -28.0f, 10, 6, 55, 0.0f);
        this.bodyModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].rotateAngleZ = 0.05235988f;
        this.bodyModel[37].addShapeBox(-379.0f, -51.0f, -42.5f, 40, 50, 85, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, -10.0f, 0.0f, -25.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addBox(-455.0f, -51.0f, -42.5f, 76, 50, 85, 0.0f);
        this.bodyModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addBox(-638.0f, -30.0f, -30.0f, 187, 50, 60, 0.0f);
        this.bodyModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(-699.0f, -30.0f, -30.0f, 61, 50, 60, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f);
        this.bodyModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addBox(-657.0f, -36.0f, -43.5f, 202, 6, 84, 0.0f);
        this.bodyModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyDoorOpenModel_1() {
        (this.bodyDoorOpenModel[0] = new ModelRendererTurbo((ModelBase)this, 197, 732, this.textureX, this.textureY)).addShapeBox(17.0f, -339.0f, -1.5f, 128, 68, 3, 0.0f, -64.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -64.0f, 0.0f, 0.0f, -64.0f, -34.0f, 0.0f, 0.0f, -34.0f, 0.0f, 0.0f, -34.0f, 0.0f, -64.0f, -34.0f, 0.0f);
        this.bodyDoorOpenModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[0].rotateAngleZ = 0.06981317f;
    }
    
    private void initbodyDoorCloseModel_1() {
        (this.bodyDoorCloseModel[0] = new ModelRendererTurbo((ModelBase)this, 193, 385, this.textureX, this.textureY)).addShapeBox(17.0f, -338.0f, -1.5f, 128, 68, 3, 0.0f, -64.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, -64.0f, 0.0f, 0.2f, -64.0f, -34.0f, 0.2f, 0.0f, -34.0f, 0.2f, 0.0f, -34.0f, 0.2f, -64.0f, -34.0f, 0.2f);
        this.bodyDoorCloseModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[0].rotateAngleZ = 0.06981317f;
    }
    
    private void initGuns() {
    }
}
