//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelKV2 extends ModelFlanVehicle
{
    public ModelKV2() {
        final int textureX = 1024;
        final int textureY = 1024;
        (this.bodyModel = new ModelRendererTurbo[26])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 100, textureX, textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 150, textureX, textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 200, textureX, textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 250, textureX, textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 300, textureX, textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 360, textureX, textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 360, textureX, textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 350, 0, textureX, textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 350, 50, textureX, textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 350, 150, textureX, textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 350, 150, textureX, textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 350, 150, textureX, textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 350, 0, textureX, textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 350, 50, textureX, textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 350, 150, textureX, textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 350, 150, textureX, textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 350, 150, textureX, textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 350, 600, textureX, textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 350, 600, textureX, textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 350, 650, textureX, textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 350, 600, textureX, textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 350, 700, textureX, textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 350, 700, textureX, textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 350, 750, textureX, textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 350, 700, textureX, textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 79, 18, 32, 0.0f);
        this.bodyModel[0].setRotationPoint(-54.0f, -14.0f, -16.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 16, 8, 32, 0.0f);
        this.bodyModel[1].setRotationPoint(25.0f, -9.0f, -16.0f);
        this.bodyModel[1].rotateAngleZ = 6.0f;
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 14, 6, 32, 0.0f);
        this.bodyModel[2].setRotationPoint(24.0f, -2.0f, -16.0f);
        this.bodyModel[2].rotateAngleZ = 0.0f;
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 2, 6, 32, 0.0f);
        this.bodyModel[3].setRotationPoint(23.2f, -13.0f, -16.0f);
        this.bodyModel[3].rotateAngleZ = 13.0f;
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 6, 6, 31, 0.0f);
        this.bodyModel[4].setRotationPoint(-59.8f, -12.8f, -15.5f);
        this.bodyModel[4].rotateAngleZ = 19.0f;
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 10, 12, 32, 0.0f);
        this.bodyModel[5].setRotationPoint(-57.0f, -8.0f, -16.0f);
        this.bodyModel[5].rotateAngleZ = 0.0f;
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 100, 2, 12, 0.0f);
        this.bodyModel[6].setRotationPoint(-59.0f, -9.5f, -28.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 100, 2, 12, 0.0f);
        this.bodyModel[7].setRotationPoint(-59.0f, -9.5f, 16.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 8, 8, 11, 0.0f);
        this.bodyModel[8].setRotationPoint(32.0f, -5.5f, 16.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 9, 9, 11, 0.0f);
        this.bodyModel[9].setRotationPoint(-56.0f, -5.5f, 16.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 4, 4, 9, 0.0f);
        this.bodyModel[10].setRotationPoint(14.0f, -5.5f, 16.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 4, 4, 9, 0.0f);
        this.bodyModel[11].setRotationPoint(-12.0f, -5.5f, 16.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 4, 4, 9, 0.0f);
        this.bodyModel[12].setRotationPoint(-38.0f, -5.5f, 16.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 8, 8, 11, 0.0f);
        this.bodyModel[13].setRotationPoint(32.0f, -5.5f, -27.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 9, 9, 11, 0.0f);
        this.bodyModel[14].setRotationPoint(-56.0f, -5.5f, -27.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 4, 4, 9, 0.0f);
        this.bodyModel[15].setRotationPoint(14.0f, -5.5f, -25.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 4, 4, 9, 0.0f);
        this.bodyModel[16].setRotationPoint(-12.0f, -5.5f, -25.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 4, 4, 9, 0.0f);
        this.bodyModel[17].setRotationPoint(-38.0f, -5.5f, -25.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 0, 4, 12, 0.0f);
        this.bodyModel[18].setRotationPoint(22.0f, -13.0f, 16.0f);
        this.bodyModel[18].rotateAngleX = 6.0f;
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 0, 4, 12, 0.0f);
        this.bodyModel[19].setRotationPoint(4.0f, -13.0f, 16.0f);
        this.bodyModel[19].rotateAngleX = 6.0f;
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 25, 4, 12, 0.0f);
        this.bodyModel[20].setRotationPoint(-36.0f, -13.5f, 16.0f);
        this.bodyModel[20].rotateAngleX = 0.0f;
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 0, 4, 12, 0.0f);
        this.bodyModel[21].setRotationPoint(-50.0f, -13.0f, 16.0f);
        this.bodyModel[21].rotateAngleX = 6.0f;
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 0, 4, 12, 0.0f);
        this.bodyModel[22].setRotationPoint(21.0f, -9.5f, -27.0f);
        this.bodyModel[22].rotateAngleX = -6.0f;
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 0, 4, 12, 0.0f);
        this.bodyModel[23].setRotationPoint(4.0f, -9.5f, -27.0f);
        this.bodyModel[23].rotateAngleX = -6.0f;
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 25, 4, 12, 0.0f);
        this.bodyModel[24].setRotationPoint(-36.0f, -12.5f, -27.0f);
        this.bodyModel[24].rotateAngleX = 0.0f;
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 0, 4, 12, 0.0f);
        this.bodyModel[25].setRotationPoint(-50.0f, -9.5f, -27.0f);
        this.bodyModel[25].rotateAngleX = -6.0f;
        (this.turretModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 0, 500, textureX, textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 550, textureX, textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 625, textureX, textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 675, textureX, textureY);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 720, textureX, textureY);
        this.turretModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 720, textureX, textureY);
        this.turretModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 775, textureX, textureY);
        this.turretModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 775, textureX, textureY);
        this.turretModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 825, textureX, textureY);
        this.turretModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 870, textureX, textureY);
        this.turretModel[0].addBox(0.0f, 0.0f, 0.0f, 30, 4, 30, 0.0f);
        this.turretModel[0].setRotationPoint(-15.0f, -18.0f, -15.0f);
        this.turretModel[1].addBox(-30.0f, 0.0f, -15.0f, 30, 18, 30, 0.0f);
        this.turretModel[1].setRotationPoint(0.0f, -36.0f, 0.0f);
        this.turretModel[2].addBox(-3.5f, 0.0f, -7.0f, 14, 18, 14, 0.0f);
        this.turretModel[2].setRotationPoint(0.0f, -32.0f, 0.0f);
        this.turretModel[2].rotateAngleZ = 19.0f;
        this.turretModel[3].addBox(0.0f, 0.0f, 0.0f, 9, 18, 14, 0.0f);
        this.turretModel[3].setRotationPoint(0.0f, -36.0f, -7.0f);
        this.turretModel[4].addBox(5.0f, 0.0f, -4.0f, 7, 18, 13, 0.0f);
        this.turretModel[4].setRotationPoint(0.0f, -36.0f, 0.0f);
        this.turretModel[4].rotateAngleY = 1.0f;
        this.turretModel[5].addBox(5.0f, 0.0f, -8.8f, 7, 18, 13, 0.0f);
        this.turretModel[5].setRotationPoint(0.0f, -36.0f, 0.0f);
        this.turretModel[5].rotateAngleY = -1.0f;
        this.turretModel[6].addBox(-33.5f, 0.0f, -12.0f, 8, 18, 16, 0.0f);
        this.turretModel[6].setRotationPoint(0.0f, -36.0f, 0.0f);
        this.turretModel[6].rotateAngleY = -38.0f;
        this.turretModel[7].addBox(-33.5f, 0.0f, -4.0f, 8, 18, 16, 0.0f);
        this.turretModel[7].setRotationPoint(0.0f, -36.0f, 0.0f);
        this.turretModel[7].rotateAngleY = 38.0f;
        this.turretModel[8].addBox(6.0f, 2.0f, -5.0f, 10, 14, 10, 0.0f);
        this.turretModel[8].setRotationPoint(2.0f, -37.5f, 0.0f);
        this.turretModel[9].addBox(-18.0f, 0.0f, 4.0f, 10, 2, 10, 0.0f);
        this.turretModel[9].setRotationPoint(0.0f, -37.5f, 0.0f);
        (this.barrelModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 0, 900, textureX, textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 950, textureX, textureY);
        this.barrelModel[0].addBox(12.0f, -4.0f, -3.5f, 14, 9, 7, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.barrelModel[1].addBox(26.0f, -3.0f, -2.0f, 18, 4, 4, 0.0f);
        this.barrelModel[1].setRotationPoint(0.0f, -28.0f, 0.0f);
        (this.leftTrackModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.leftTrackModel[1] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.leftTrackModel[2] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.leftTrackModel[3] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.leftTrackModel[4] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.leftTrackModel[5] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.leftTrackModel[6] = new ModelRendererTurbo((ModelBase)this, 350, 275, textureX, textureY);
        this.leftTrackModel[7] = new ModelRendererTurbo((ModelBase)this, 350, 300, textureX, textureY);
        this.leftTrackModel[8] = new ModelRendererTurbo((ModelBase)this, 350, 320, textureX, textureY);
        this.leftTrackModel[9] = new ModelRendererTurbo((ModelBase)this, 350, 350, textureX, textureY);
        this.leftTrackModel[10] = new ModelRendererTurbo((ModelBase)this, 350, 370, textureX, textureY);
        this.leftTrackModel[11] = new ModelRendererTurbo((ModelBase)this, 350, 400, textureX, textureY);
        this.leftTrackModel[0].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.leftTrackModel[0].setRotationPoint(20.0f, 2.0f, -26.0f);
        this.leftTrackModel[1].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.leftTrackModel[1].setRotationPoint(7.5f, 2.0f, -26.0f);
        this.leftTrackModel[2].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.leftTrackModel[2].setRotationPoint(-5.0f, 2.0f, -26.0f);
        this.leftTrackModel[3].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.leftTrackModel[3].setRotationPoint(-17.5f, 2.0f, -26.0f);
        this.leftTrackModel[4].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.leftTrackModel[4].setRotationPoint(-30.0f, 2.0f, -26.0f);
        this.leftTrackModel[5].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.leftTrackModel[5].setRotationPoint(-42.5f, 2.0f, -26.0f);
        this.leftTrackModel[6].addBox(0.0f, 0.0f, 0.0f, 71, 1, 12, 0.0f);
        this.leftTrackModel[6].setRotationPoint(-43.0f, 9.0f, -28.0f);
        this.leftTrackModel[7].addBox(0.0f, 0.0f, 0.0f, 15, 1, 12, 0.0f);
        this.leftTrackModel[7].setRotationPoint(27.5f, 9.0f, -28.0f);
        this.leftTrackModel[7].rotateAngleZ = -12.0f;
        this.leftTrackModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 8, 12, 0.0f);
        this.leftTrackModel[8].setRotationPoint(40.0f, -6.0f, -28.0f);
        this.leftTrackModel[9].addBox(0.0f, 0.0f, 0.0f, 97, 1, 12, 0.0f);
        this.leftTrackModel[9].setRotationPoint(-56.5f, -6.6f, -28.0f);
        this.leftTrackModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 9, 12, 0.0f);
        this.leftTrackModel[10].setRotationPoint(-57.0f, -6.0f, -28.0f);
        this.leftTrackModel[11].addBox(0.0f, 0.0f, 0.0f, 1, 16, 12, 0.0f);
        this.leftTrackModel[11].setRotationPoint(-57.0f, 3.0f, -28.0f);
        this.leftTrackModel[11].rotateAngleZ = 20.0f;
        (this.rightTrackModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.rightTrackModel[1] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.rightTrackModel[2] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.rightTrackModel[3] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.rightTrackModel[4] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.rightTrackModel[5] = new ModelRendererTurbo((ModelBase)this, 350, 200, textureX, textureY);
        this.rightTrackModel[6] = new ModelRendererTurbo((ModelBase)this, 350, 275, textureX, textureY);
        this.rightTrackModel[7] = new ModelRendererTurbo((ModelBase)this, 350, 300, textureX, textureY);
        this.rightTrackModel[8] = new ModelRendererTurbo((ModelBase)this, 350, 320, textureX, textureY);
        this.rightTrackModel[9] = new ModelRendererTurbo((ModelBase)this, 350, 350, textureX, textureY);
        this.rightTrackModel[10] = new ModelRendererTurbo((ModelBase)this, 350, 370, textureX, textureY);
        this.rightTrackModel[11] = new ModelRendererTurbo((ModelBase)this, 350, 400, textureX, textureY);
        this.rightTrackModel[0].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.rightTrackModel[0].setRotationPoint(20.0f, 2.0f, 16.0f);
        this.rightTrackModel[1].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.rightTrackModel[1].setRotationPoint(7.5f, 2.0f, 16.0f);
        this.rightTrackModel[2].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.rightTrackModel[2].setRotationPoint(-5.0f, 2.0f, 16.0f);
        this.rightTrackModel[3].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.rightTrackModel[3].setRotationPoint(-17.5f, 2.0f, 16.0f);
        this.rightTrackModel[4].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.rightTrackModel[4].setRotationPoint(-30.0f, 2.0f, 16.0f);
        this.rightTrackModel[5].addBox(0.0f, 0.0f, 0.0f, 7, 7, 10, 0.0f);
        this.rightTrackModel[5].setRotationPoint(-42.5f, 2.0f, 16.0f);
        this.rightTrackModel[6].addBox(0.0f, 0.0f, 0.0f, 71, 1, 12, 0.0f);
        this.rightTrackModel[6].setRotationPoint(-43.0f, 9.0f, 16.0f);
        this.rightTrackModel[7].addBox(0.0f, 0.0f, 0.0f, 15, 1, 12, 0.0f);
        this.rightTrackModel[7].setRotationPoint(27.5f, 9.0f, 16.0f);
        this.rightTrackModel[7].rotateAngleZ = -12.0f;
        this.rightTrackModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 8, 12, 0.0f);
        this.rightTrackModel[8].setRotationPoint(40.0f, -6.0f, 16.0f);
        this.rightTrackModel[9].addBox(0.0f, 0.0f, 0.0f, 97, 1, 12, 0.0f);
        this.rightTrackModel[9].setRotationPoint(-56.5f, -6.6f, 16.0f);
        this.rightTrackModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 9, 12, 0.0f);
        this.rightTrackModel[10].setRotationPoint(-57.0f, -6.0f, 16.0f);
        this.rightTrackModel[11].addBox(0.0f, 0.0f, 0.0f, 1, 16, 12, 0.0f);
        this.rightTrackModel[11].setRotationPoint(-57.0f, 3.0f, 16.0f);
        this.rightTrackModel[11].rotateAngleZ = 20.0f;
        this.flipAll();
        this.translateAll(0, 2, 0);
    }
}
