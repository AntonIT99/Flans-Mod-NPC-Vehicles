//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelUji extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelUji() {
        this.textureX = 2048;
        this.textureY = 2048;
        (this.bodyModel = new ModelRendererTurbo[56])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 249, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 217, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 569, 217, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1121, 217, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1537, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1697, 145, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1801, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1953, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1537, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1681, 305, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 129, 97, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1025, 217, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1993, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 1993, 361, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 729, 369, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 929, 425, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1345, 425, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 1673, 441, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1945, 417, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 625, 449, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 849, 449, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 889, 449, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 1537, 49, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 1801, 81, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 257, 97, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 1801, 89, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 473, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 409, 473, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 1569, 553, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 1257, 425, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 505, 561, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 73, 97, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 145, 161, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 569, 217, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 1121, 217, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 1585, 441, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 929, 561, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 553, 473, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 1065, 561, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 1593, 1, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 1857, 81, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 1193, 561, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 1681, 257, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 1281, 561, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 1937, 1, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 1937, 1, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 100, 1800, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 1777, 553, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 201, 97, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 329, 97, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 1777, 553, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 201, 97, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 329, 97, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 160, 52, 40, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, 0.0f, 0.0f, 60.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 52.0f, 0.0f, 0.0f, 52.0f, 0.0f, 0.0f, -12.0f);
        this.bodyModel[0].setRotationPoint(-583.0f, -1.0f, -20.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 560, 52, 160, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f);
        this.bodyModel[1].setRotationPoint(-423.0f, -1.0f, -80.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 200, 90, 160, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 40.0f, 0.0f, -8.0f);
        this.bodyModel[2].setRotationPoint(137.0f, -39.0f, -80.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 175, 45, 100, 0.0f);
        this.bodyModel[3].setRotationPoint(147.0f, -84.0f, -50.0f);
        this.bodyModel[4].addShapeBox(-220.0f, 0.0f, -130.0f, 220, 90, 116, 0.0f, 0.0f, 0.0f, 22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 22.0f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 14.0f);
        this.bodyModel[4].setRotationPoint(557.0f, -39.0f, 72.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 70, 22, 120, 0.0f);
        this.bodyModel[5].setRotationPoint(137.0f, -106.0f, -60.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 76, 58, 50, 0.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 24.0f);
        this.bodyModel[6].setRotationPoint(203.0f, -123.0f, -25.0f);
        this.bodyModel[7].addBox(0.0f, -8.0f, 0.0f, 34, 46, 32, 0.0f);
        this.bodyModel[7].setRotationPoint(172.0f, -142.0f, -16.0f);
        this.bodyModel[7].rotateAngleZ = -0.37178612f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 8, 400, 8, 0.0f);
        this.bodyModel[8].setRotationPoint(127.0f, -481.0f, -4.0f);
        this.bodyModel[8].rotateAngleZ = 0.05235988f;
        this.bodyModel[9].addBox(-2.5f, -2.0f, -6.0f, 12, 30, 12, 0.0f);
        this.bodyModel[9].setRotationPoint(127.0f, -481.0f, 0.0f);
        this.bodyModel[9].rotateAngleZ = 0.05235988f;
        this.bodyModel[10].addBox(0.0f, 50.0f, 0.0f, 10, 10, 120, 0.0f);
        this.bodyModel[10].setRotationPoint(140.0f, -381.0f, -60.0f);
        this.bodyModel[10].rotateAngleZ = 0.05235988f;
        this.bodyModel[11].addBox(-2.0f, 0.0f, 0.0f, 10, 8, 50, 0.0f);
        this.bodyModel[11].setRotationPoint(137.0f, -356.0f, 0.0f);
        this.bodyModel[11].rotateAngleX = 0.13962634f;
        this.bodyModel[11].rotateAngleY = 0.34906584f;
        this.bodyModel[11].rotateAngleZ = -0.34906584f;
        this.bodyModel[12].addBox(-2.0f, 0.0f, -50.0f, 10, 8, 50, 0.0f);
        this.bodyModel[12].setRotationPoint(137.0f, -356.0f, 0.0f);
        this.bodyModel[12].rotateAngleX = -0.13962634f;
        this.bodyModel[12].rotateAngleY = -0.34906584f;
        this.bodyModel[12].rotateAngleZ = -0.34906584f;
        this.bodyModel[13].addBox(0.0f, 66.0f, 0.0f, 10, 6, 70, 0.0f);
        this.bodyModel[13].setRotationPoint(134.0f, -481.0f, -35.0f);
        this.bodyModel[13].rotateAngleZ = 0.05235988f;
        this.bodyModel[14].addBox(-4.0f, 0.0f, -4.0f, 8, 350, 8, 0.0f);
        this.bodyModel[14].setRotationPoint(137.0f, -331.0f, 0.0f);
        this.bodyModel[14].rotateAngleX = -0.15707964f;
        this.bodyModel[14].rotateAngleZ = -0.15707964f;
        this.bodyModel[15].addBox(-4.0f, 0.0f, -4.0f, 8, 350, 8, 0.0f);
        this.bodyModel[15].setRotationPoint(137.0f, -331.0f, 0.0f);
        this.bodyModel[15].rotateAngleX = 0.15707964f;
        this.bodyModel[15].rotateAngleZ = -0.15707964f;
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 38, 160, 30, 0.0f);
        this.bodyModel[16].setRotationPoint(8.0f, -151.0f, -15.0f);
        this.bodyModel[16].rotateAngleZ = 0.06981317f;
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 100, 36, 40, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 0.0f, 10.0f, 8.0f, 0.0f, 6.0f, 8.0f, 0.0f, 6.0f, 0.0f, 0.0f, 10.0f);
        this.bodyModel[17].setRotationPoint(-43.0f, -35.0f, -20.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 120, 50, 85, 0.0f);
        this.bodyModel[18].setRotationPoint(-163.0f, -51.0f, -42.5f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 75, 50, 85, 0.0f);
        this.bodyModel[19].setRotationPoint(-298.0f, -51.0f, -42.5f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 60, 50, 60, 0.0f);
        this.bodyModel[20].setRotationPoint(-223.0f, -51.0f, -30.0f);
        this.bodyModel[21].addBox(-350.0f, 0.0f, 0.0f, 8, 330, 8, 0.0f);
        this.bodyModel[21].setRotationPoint(127.0f, -391.0f, -4.0f);
        this.bodyModel[21].rotateAngleZ = 0.05235988f;
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 10, 10, 100, 0.0f);
        this.bodyModel[22].setRotationPoint(-223.0f, -326.0f, -50.0f);
        this.bodyModel[22].rotateAngleZ = 0.05235988f;
        this.bodyModel[23].addBox(0.0f, -280.0f, 40.0f, 8, 207, 8, 0.0f);
        this.bodyModel[23].setRotationPoint(-261.0f, 30.0f, 0.0f);
        this.bodyModel[23].rotateAngleX = 0.15707964f;
        this.bodyModel[23].rotateAngleZ = -0.15707964f;
        this.bodyModel[24].addBox(0.0f, -280.0f, -48.0f, 8, 207, 8, 0.0f);
        this.bodyModel[24].setRotationPoint(-261.0f, 30.0f, 0.0f);
        this.bodyModel[24].rotateAngleX = -0.15707964f;
        this.bodyModel[24].rotateAngleZ = -0.15707964f;
        this.bodyModel[25].addBox(-10.0f, 0.0f, -15.0f, 20, 20, 30, 0.0f);
        this.bodyModel[25].setRotationPoint(328.0f, -104.0f, 0.0f);
        this.bodyModel[26].addBox(-12.0f, -1.0f, -1.0f, 40, 2, 2, 0.0f);
        this.bodyModel[26].setRotationPoint(328.0f, -94.0f, 0.0f);
        this.bodyModel[27].addBox(-10.0f, 0.0f, -15.0f, 20, 20, 30, 0.0f);
        this.bodyModel[27].setRotationPoint(-273.0f, -71.0f, 0.0f);
        this.bodyModel[28].addBox(-12.0f, -1.0f, -1.0f, 40, 2, 2, 0.0f);
        this.bodyModel[28].setRotationPoint(-273.0f, -61.0f, 0.0f);
        this.bodyModel[29].addShapeBox(-180.0f, 0.0f, -10.0f, 180, 90, 20, 0.0f, 0.0f, 0.0f, 48.0f, 8.0f, 6.0f, 0.0f, 8.0f, 6.0f, 0.0f, 0.0f, 0.0f, 48.0f, 0.0f, 0.0f, 40.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 40.0f);
        this.bodyModel[29].setRotationPoint(737.0f, -39.0f, 0.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 21, 58, 50, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(182.0f, -123.0f, -25.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 50, 45, 100, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, -30.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(322.0f, -84.0f, -50.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 23, 18, 54, 0.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 24.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(180.0f, -141.0f, -27.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 78, 18, 54, 0.0f, 0.0f, 0.0f, 2.0f, -50.0f, 0.0f, -4.0f, -50.0f, 0.0f, -4.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 25.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 25.0f);
        this.bodyModel[33].setRotationPoint(203.0f, -141.0f, -27.0f);
        this.bodyModel[34].addShapeBox(-21.0f, 0.0f, -21.0f, 21, 20, 21, 0.0f, -6.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(197.0f, -161.0f, 0.0f);
        this.bodyModel[35].addShapeBox(-21.0f, 0.0f, 21.0f, 21, 20, 21, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -6.0f);
        this.bodyModel[35].setRotationPoint(197.0f, -161.0f, -21.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 21.0f, 21, 20, 21, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(197.0f, -161.0f, -21.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, -21.0f, 21, 20, 21, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(197.0f, -161.0f, 0.0f);
        this.bodyModel[38].addShapeBox(0.0f, -24.0f, 0.0f, 38, 24, 30, 0.0f, 4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f);
        this.bodyModel[38].setRotationPoint(8.0f, -151.0f, -15.0f);
        this.bodyModel[38].rotateAngleZ = 0.06981317f;
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 34, 8, 60, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[39].setRotationPoint(111.0f, -151.0f, -30.0f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 25, 8, 44, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[40].setRotationPoint(117.0f, -215.0f, -22.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 45, 8, 40, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, -5.0f, -12.0f, 2.0f, -5.0f, -12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 5.0f, -12.0f, 3.0f, 5.0f, -12.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[41].setRotationPoint(119.0f, -231.0f, -20.0f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 12, 20, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[42].setRotationPoint(180.0f, -172.0f, -6.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 30, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].setRotationPoint(185.0f, -170.0f, -15.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 34, 8, 50, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -22.0f, 2.0f, 0.0f, -22.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -22.0f, 3.0f, 0.0f, -22.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[44].setRotationPoint(-238.0f, -93.0f, -25.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 26, 8, 36, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -14.0f, 2.0f, 0.0f, -14.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 3.0f, 0.0f, -14.0f, 3.0f, 0.0f, -14.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[45].setRotationPoint(-232.0f, -145.0f, -18.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 25, 50, 85, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[46].setRotationPoint(-323.0f, -51.0f, -42.5f);
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, -1.5f, 3, 37, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[47].setRotationPoint(737.0f, -80.0f, 0.0f);
        this.bodyModel[48].addShapeBox(0.0f, 0.0f, -1.5f, 3, 37, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f, 0.0f, 45.0f, 0.0f);
        this.bodyModel[48].setRotationPoint(-580.0f, -80.0f, 0.0f);
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, -1.5f, 128, 68, 3, 0.0f, -64.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -64.0f, 0.0f, 0.0f, -64.0f, -34.0f, 0.0f, 0.0f, -34.0f, 0.0f, 0.0f, -34.0f, 0.0f, -64.0f, -34.0f, 0.0f);
        this.bodyModel[49].setRotationPoint(-708.0f, -80.0f, 0.0f);
        this.bodyModel[50].addShapeBox(-17.0f, -22.0f, -20.0f, 34, 40, 40, 0.0f, 6.0f, 4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[50].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[51].addShapeBox(15.0f, -1.0f, -8.0f, 34, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[51].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[52].addShapeBox(15.0f, -1.0f, 4.0f, 34, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[52].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[53].addShapeBox(-17.0f, -22.0f, -20.0f, 34, 40, 40, 0.0f, 6.0f, 4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[53].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[54].addShapeBox(15.0f, -1.0f, -8.0f, 34, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[54].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[55].addShapeBox(15.0f, -1.0f, 4.0f, 34, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[55].setRotationPoint(0.0f, 0.0f, 0.0f);
        final ModelRendererTurbo[][] gun_1_Model = { new ModelRendererTurbo[1], null, null };
        (gun_1_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 1777, 553, this.textureX, this.textureY)).addShapeBox(-17.0f, -22.0f, -20.0f, 34, 40, 40, 0.0f, 6.0f, 4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        for (final ModelRendererTurbo gunPart : gun_1_Model[0]) {
            gunPart.setRotationPoint(528.0f, -58.0f, 0.0f);
        }
        (gun_1_Model[1] = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 201, 97, this.textureX, this.textureY);
        gun_1_Model[1][1] = new ModelRendererTurbo((ModelBase)this, 329, 97, this.textureX, this.textureY);
        gun_1_Model[1][0].addShapeBox(15.0f, -1.0f, -8.0f, 34, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        gun_1_Model[1][1].addShapeBox(15.0f, -1.0f, 4.0f, 34, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        for (final ModelRendererTurbo gunPart : gun_1_Model[1]) {
            gunPart.setRotationPoint(528.0f, -58.0f, 0.0f);
        }
        gun_1_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun1", gun_1_Model);
        final ModelRendererTurbo[][] gun_2_Model = { new ModelRendererTurbo[1], null, null };
        (gun_2_Model[0][0] = new ModelRendererTurbo((ModelBase)this, 1777, 553, this.textureX, this.textureY)).addShapeBox(-17.0f, -22.0f, -20.0f, 34, 40, 40, 0.0f, 6.0f, 4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        for (final ModelRendererTurbo gunPart2 : gun_2_Model[0]) {
            gunPart2.setRotationPoint(-423.0f, -18.0f, 0.0f);
        }
        (gun_2_Model[1] = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 201, 97, this.textureX, this.textureY);
        gun_2_Model[1][1] = new ModelRendererTurbo((ModelBase)this, 329, 97, this.textureX, this.textureY);
        gun_2_Model[1][0].addShapeBox(15.0f, -1.0f, -8.0f, 34, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        gun_2_Model[1][1].addShapeBox(15.0f, -1.0f, 4.0f, 34, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        for (final ModelRendererTurbo gunPart2 : gun_2_Model[1]) {
            gunPart2.setRotationPoint(-423.0f, -18.0f, 0.0f);
        }
        gun_2_Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("PassengerGun2", gun_2_Model);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
