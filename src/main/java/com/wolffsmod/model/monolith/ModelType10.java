//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelType10 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelType10() {
        this.textureX = 1024;
        this.textureY = 1024;
        (this.bodyModel = new ModelRendererTurbo[33])[0] = new ModelRendererTurbo((ModelBase)this, 550, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 550, 30, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 550, 70, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 550, 100, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 550, 130, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 550, 0, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 550, 30, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 550, 70, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 550, 100, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 550, 130, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 550, 150, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 550, 230, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 650, 230, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 550, 290, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 550, 370, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 550, 430, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 680, 430, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 550, 480, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 550, 480, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 590, 480, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 590, 480, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 650, 480, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 650, 480, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 680, 480, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 550, 520, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 550, 570, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 550, 600, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 550, 570, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 680, 480, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 9, 1, 10, 0.0f);
        this.bodyModel[0].setRotationPoint(44.0f, -11.5f, 16.0f);
        this.bodyModel[0].rotateAngleZ = -0.09075712f;
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 8, 5, 10, 0.0f);
        this.bodyModel[1].setRotationPoint(25.0f, -16.0f, 16.0f);
        this.bodyModel[1].rotateAngleZ = -0.4363323f;
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 15, 3, 10, 0.0f);
        this.bodyModel[2].setRotationPoint(30.0f, -13.5f, 16.0f);
        this.bodyModel[2].rotateAngleZ = -0.1396263f;
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 8, 4, 10, 0.0f);
        this.bodyModel[3].setRotationPoint(53.0f, -10.6f, 16.0f);
        this.bodyModel[3].rotateAngleZ = -0.4363323f;
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 103, 9, 1, 0.0f);
        this.bodyModel[4].setRotationPoint(-50.0f, -11.0f, 26.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 9, 1, 10, 0.0f);
        this.bodyModel[5].setRotationPoint(44.0f, -11.5f, -26.0f);
        this.bodyModel[5].rotateAngleZ = -0.09075712f;
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 8, 5, 10, 0.0f);
        this.bodyModel[6].setRotationPoint(25.0f, -16.0f, -26.0f);
        this.bodyModel[6].rotateAngleZ = -0.4363323f;
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 15, 3, 10, 0.0f);
        this.bodyModel[7].setRotationPoint(30.0f, -13.5f, -26.0f);
        this.bodyModel[7].rotateAngleZ = -0.1396263f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 8, 4, 10, 0.0f);
        this.bodyModel[8].setRotationPoint(53.0f, -10.6f, -26.0f);
        this.bodyModel[8].rotateAngleZ = -0.4363323f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 103, 9, 1, 0.0f);
        this.bodyModel[9].setRotationPoint(-50.0f, -11.0f, -27.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 60, 13, 52, 0.0f);
        this.bodyModel[10].setRotationPoint(-35.0f, -16.0f, -26.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 7, 12, 32, 0.0f);
        this.bodyModel[11].setRotationPoint(53.0f, -10.5f, -16.0f);
        this.bodyModel[11].rotateAngleZ = -0.4363323f;
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 28, 5, 32, 0.0f);
        this.bodyModel[12].setRotationPoint(25.0f, -13.0f, -16.0f);
        this.bodyModel[12].rotateAngleZ = -0.09075712f;
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 25, 11, 52, 0.0f);
        this.bodyModel[13].setRotationPoint(-60.0f, -17.0f, -26.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 90, 12, 32, 0.0f);
        this.bodyModel[14].setRotationPoint(-36.0f, -9.0f, -16.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 26, 10, 32, 0.0f);
        this.bodyModel[15].setRotationPoint(-56.5f, -15.5f, -16.0f);
        this.bodyModel[15].rotateAngleZ = -0.3490658f;
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 4, 8, 30, 0.0f);
        this.bodyModel[16].setRotationPoint(-64.0f, -15.0f, -15.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 1, 6, 10, 0.0f);
        this.bodyModel[17].setRotationPoint(59.3f, -6.8f, 16.0f);
        this.bodyModel[17].rotateAngleZ = 0.4363323f;
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 1, 6, 10, 0.0f);
        this.bodyModel[18].setRotationPoint(59.3f, -6.8f, -26.0f);
        this.bodyModel[18].rotateAngleZ = 0.4363323f;
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 1, 6, 10, 0.0f);
        this.bodyModel[19].setRotationPoint(-57.0f, -6.0f, 16.0f);
        this.bodyModel[19].rotateAngleZ = -0.2094395f;
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 1, 6, 10, 0.0f);
        this.bodyModel[20].setRotationPoint(-57.0f, -6.0f, -26.0f);
        this.bodyModel[20].rotateAngleZ = -0.2094395f;
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 2, 6, 4, 0.0f);
        this.bodyModel[21].setRotationPoint(-62.0f, -14.0f, 17.0f);
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 2, 6, 4, 0.0f);
        this.bodyModel[22].setRotationPoint(-62.0f, -14.0f, -21.0f);
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 1, 2, 5, 0.0f);
        this.bodyModel[23].setRotationPoint(55.0f, -11.0f, 19.0f);
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 28, 1, 28, 0.0f);
        this.bodyModel[24].setRotationPoint(-14.0f, -17.0f, -14.0f);
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 98, 6, 0, 0.0f);
        this.bodyModel[25].setRotationPoint(-48.0f, -2.0f, -26.5f);
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.bodyModel[26].setRotationPoint(51.0f, -5.0f, 18.0f);
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.bodyModel[27].setRotationPoint(-52.0f, -5.0f, 18.0f);
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.bodyModel[28].setRotationPoint(51.0f, -5.0f, -24.0f);
        this.bodyModel[29].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.bodyModel[29].setRotationPoint(-52.0f, -5.0f, -24.0f);
        this.bodyModel[30].addBox(0.0f, 0.0f, 0.0f, 7, 4, 10, 0.0f);
        this.bodyModel[30].setRotationPoint(25.0f, -16.0f, -5.0f);
        this.bodyModel[31].addBox(0.0f, 0.0f, 0.0f, 98, 6, 0, 0.0f);
        this.bodyModel[31].setRotationPoint(-48.0f, -2.0f, 26.5f);
        this.bodyModel[32].addBox(0.0f, 0.0f, 0.0f, 1, 2, 5, 0.0f);
        this.bodyModel[32].setRotationPoint(55.0f, -11.0f, -24.0f);
        (this.turretModel = new ModelRendererTurbo[30])[0] = new ModelRendererTurbo((ModelBase)this, 300, 0, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 300, 50, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 300, 110, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 300, 160, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase)this, 300, 210, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo((ModelBase)this, 300, 260, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo((ModelBase)this, 300, 310, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo((ModelBase)this, 300, 350, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo((ModelBase)this, 300, 380, this.textureX, this.textureY);
        this.turretModel[9] = new ModelRendererTurbo((ModelBase)this, 300, 450, this.textureX, this.textureY);
        this.turretModel[10] = new ModelRendererTurbo((ModelBase)this, 300, 500, this.textureX, this.textureY);
        this.turretModel[11] = new ModelRendererTurbo((ModelBase)this, 300, 500, this.textureX, this.textureY);
        this.turretModel[12] = new ModelRendererTurbo((ModelBase)this, 350, 500, this.textureX, this.textureY);
        this.turretModel[13] = new ModelRendererTurbo((ModelBase)this, 300, 350, this.textureX, this.textureY);
        this.turretModel[14] = new ModelRendererTurbo((ModelBase)this, 300, 310, this.textureX, this.textureY);
        this.turretModel[15] = new ModelRendererTurbo((ModelBase)this, 300, 530, this.textureX, this.textureY);
        this.turretModel[16] = new ModelRendererTurbo((ModelBase)this, 300, 530, this.textureX, this.textureY);
        this.turretModel[17] = new ModelRendererTurbo((ModelBase)this, 300, 550, this.textureX, this.textureY);
        this.turretModel[18] = new ModelRendererTurbo((ModelBase)this, 300, 550, this.textureX, this.textureY);
        this.turretModel[19] = new ModelRendererTurbo((ModelBase)this, 290, 50, this.textureX, this.textureY);
        this.turretModel[20] = new ModelRendererTurbo((ModelBase)this, 290, 50, this.textureX, this.textureY);
        this.turretModel[21] = new ModelRendererTurbo((ModelBase)this, 320, 550, this.textureX, this.textureY);
        this.turretModel[22] = new ModelRendererTurbo((ModelBase)this, 300, 570, this.textureX, this.textureY);
        this.turretModel[23] = new ModelRendererTurbo((ModelBase)this, 380, 570, this.textureX, this.textureY);
        this.turretModel[24] = new ModelRendererTurbo((ModelBase)this, 300, 600, this.textureX, this.textureY);
        this.turretModel[25] = new ModelRendererTurbo((ModelBase)this, 380, 600, this.textureX, this.textureY);
        this.turretModel[26] = new ModelRendererTurbo((ModelBase)this, 300, 630, this.textureX, this.textureY);
        this.turretModel[27] = new ModelRendererTurbo((ModelBase)this, 380, 650, this.textureX, this.textureY);
        this.turretModel[28] = new ModelRendererTurbo((ModelBase)this, 300, 700, this.textureX, this.textureY);
        this.turretModel[29] = new ModelRendererTurbo((ModelBase)this, 300, 700, this.textureX, this.textureY);
        this.turretModel[0].addBox(-27.0f, 0.0f, -15.0f, 50, 10, 30, 0.0f);
        this.turretModel[0].setRotationPoint(0.0f, -27.0f, 0.0f);
        this.turretModel[1].addBox(-38.0f, 0.0f, -20.0f, 30, 8, 40, 0.0f);
        this.turretModel[1].setRotationPoint(0.0f, -27.0f, 0.0f);
        this.turretModel[2].addBox(23.0f, 0.0f, -15.0f, 14, 6, 30, 0.0f);
        this.turretModel[2].setRotationPoint(0.0f, -28.3f, 0.0f);
        this.turretModel[2].rotateAngleZ = -0.05235988f;
        this.turretModel[3].addBox(42.0f, -3.0f, -15.0f, 7, 2, 30, 0.0f);
        this.turretModel[3].setRotationPoint(0.0f, -47.4f, 0.0f);
        this.turretModel[3].rotateAngleZ = -0.5934119f;
        this.turretModel[4].addBox(37.0f, 0.0f, -15.0f, 8, 2, 30, 0.0f);
        this.turretModel[4].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.turretModel[4].rotateAngleZ = 0.418879f;
        this.turretModel[5].addBox(22.2f, 0.0f, -15.0f, 13, 4, 30, 0.0f);
        this.turretModel[5].setRotationPoint(0.0f, -18.8f, 0.0f);
        this.turretModel[5].rotateAngleZ = 0.1047198f;
        this.turretModel[6].addBox(-8.0f, 0.0f, 17.0f, 31, 5, 10, 0.0f);
        this.turretModel[6].setRotationPoint(0.0f, -34.8f, 0.0f);
        this.turretModel[6].rotateAngleX = -0.4886922f;
        this.turretModel[7].addBox(-16.0f, 0.0f, 15.0f, 39, 5, 9, 0.0f);
        this.turretModel[7].setRotationPoint(0.0f, -22.0f, 0.0f);
        this.turretModel[8].addBox(-38.0f, 0.0f, -24.0f, 30, 5, 48, 0.0f);
        this.turretModel[8].setRotationPoint(0.0f, -24.0f, 0.0f);
        this.turretModel[9].addBox(-53.0f, 0.0f, -19.0f, 15, 1, 38, 0.0f);
        this.turretModel[9].setRotationPoint(0.0f, -19.0f, 0.0f);
        this.turretModel[9].rotateAngleZ = -0.05235988f;
        this.turretModel[10].addBox(-53.0f, 0.0f, 18.0f, 15, 6, 1, 0.0f);
        this.turretModel[10].setRotationPoint(0.0f, -24.5f, 0.0f);
        this.turretModel[10].rotateAngleZ = -0.05235988f;
        this.turretModel[11].addBox(-53.0f, 0.0f, -19.0f, 15, 6, 1, 0.0f);
        this.turretModel[11].setRotationPoint(0.0f, -24.3f, 0.0f);
        this.turretModel[11].rotateAngleZ = -0.05235988f;
        this.turretModel[12].addBox(-53.0f, 0.0f, -19.0f, 1, 6, 38, 0.0f);
        this.turretModel[12].setRotationPoint(0.0f, -24.5f, 0.0f);
        this.turretModel[12].rotateAngleZ = -0.05235988f;
        this.turretModel[13].addBox(-16.0f, 0.0f, -24.0f, 39, 5, 9, 0.0f);
        this.turretModel[13].setRotationPoint(0.0f, -22.0f, 0.0f);
        this.turretModel[14].addBox(-8.0f, 0.0f, -27.0f, 31, 5, 10, 0.0f);
        this.turretModel[14].setRotationPoint(0.0f, -34.8f, 0.0f);
        this.turretModel[14].rotateAngleX = 0.4886922f;
        this.turretModel[15].addBox(10.0f, 0.0f, 23.5f, 14, 3, 6, 0.0f);
        this.turretModel[15].setRotationPoint(0.0f, -22.0f, 0.0f);
        this.turretModel[15].rotateAngleY = -0.4886922f;
        this.turretModel[16].addBox(10.0f, 0.0f, -30.0f, 14, 3, 6, 0.0f);
        this.turretModel[16].setRotationPoint(0.0f, -22.0f, 0.0f);
        this.turretModel[16].rotateAngleY = 0.4886922f;
        this.turretModel[17].addBox(46.0f, 7.0f, 21.0f, 2, 6, 2, 0.0f);
        this.turretModel[17].setRotationPoint(0.0f, -57.0f, 0.0f);
        this.turretModel[17].rotateAngleZ = -2.268928f;
        this.turretModel[18].addBox(46.0f, 7.0f, -23.0f, 2, 6, 2, 0.0f);
        this.turretModel[18].setRotationPoint(0.0f, -57.0f, 0.0f);
        this.turretModel[18].rotateAngleZ = -2.268928f;
        this.turretModel[19].addBox(46.5f, 8.0f, 21.5f, 1, 50, 1, 0.0f);
        this.turretModel[19].setRotationPoint(0.0f, -57.0f, 0.0f);
        this.turretModel[19].rotateAngleZ = -2.268928f;
        this.turretModel[20].addBox(46.5f, 8.0f, -22.5f, 1, 50, 1, 0.0f);
        this.turretModel[20].setRotationPoint(0.0f, -57.0f, 0.0f);
        this.turretModel[20].rotateAngleZ = -2.268928f;
        this.turretModel[21].addBox(30.0f, 2.0f, -1.5f, 5, 3, 3, 0.0f);
        this.turretModel[21].setRotationPoint(0.0f, -32.0f, 0.0f);
        this.turretModel[21].rotateAngleZ = -0.03490658f;
        this.turretModel[22].addBox(-21.0f, 0.0f, -14.0f, 12, 7, 7, 0.0f);
        this.turretModel[22].setRotationPoint(0.0f, -33.0f, 0.0f);
        this.turretModel[23].addBox(-16.0f, 0.0f, -13.0f, 6, 5, 5, 0.0f);
        this.turretModel[23].setRotationPoint(0.0f, -38.0f, 0.0f);
        this.turretModel[24].addBox(-5.0f, 0.0f, -12.0f, 12, 3, 12, 0.0f);
        this.turretModel[24].setRotationPoint(0.0f, -30.0f, 0.0f);
        this.turretModel[25].addBox(6.0f, 0.0f, -2.0f, 1, 9, 1, 0.0f);
        this.turretModel[25].setRotationPoint(0.0f, -40.0f, 0.0f);
        this.turretModel[25].rotateAngleZ = -0.3346075f;
        this.turretModel[26].addBox(36.0f, 0.0f, -15.0f, 3, 4, 30, 0.0f);
        this.turretModel[26].setRotationPoint(0.0f, -24.1f, 0.0f);
        this.turretModel[27].addBox(18.0f, 0.0f, 5.0f, 4, 4, 6, 0.0f);
        this.turretModel[27].setRotationPoint(0.0f, -31.0f, 0.0f);
        this.turretModel[28].addBox(-38.0f, -2.0f, 21.0f, 30, 5, 5, 0.0f);
        this.turretModel[28].setRotationPoint(0.0f, -35.0f, 0.0f);
        this.turretModel[28].rotateAngleX = -0.4886922f;
        this.turretModel[29].addBox(-38.0f, -2.0f, -26.0f, 30, 5, 5, 0.0f);
        this.turretModel[29].setRotationPoint(0.0f, -35.0f, 0.0f);
        this.turretModel[29].rotateAngleX = 0.4886922f;
        (this.barrelModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo((ModelBase)this, 300, 800, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 300, 820, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 350, 800, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 300, 850, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 300, 880, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 300, 910, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 300, 940, this.textureX, this.textureY);
        this.barrelModel[0].addBox(-4.0f, -1.0f, -2.0f, 7, 2, 4, 0.0f);
        this.barrelModel[0].setRotationPoint(6.0f, -38.0f, -1.5f);
        this.barrelModel[1].addBox(6.0f, -1.5f, -0.5f, 12, 1, 1, 0.0f);
        this.barrelModel[1].setRotationPoint(6.0f, -38.0f, -1.5f);
        this.barrelModel[2].addBox(-8.0f, -2.0f, -1.5f, 14, 2, 3, 0.0f);
        this.barrelModel[2].setRotationPoint(6.0f, -38.0f, -1.5f);
        this.barrelModel[3].addBox(-11.0f, -3.0f, 0.0f, 16, 6, 6, 0.0f);
        this.barrelModel[3].setRotationPoint(38.0f, -22.5f, -3.0f);
        this.barrelModel[4].addBox(5.0f, -2.5f, 0.5f, 20, 5, 5, 0.0f);
        this.barrelModel[4].setRotationPoint(38.0f, -22.5f, -3.0f);
        this.barrelModel[5].addBox(25.0f, -2.0f, 1.0f, 30, 4, 4, 0.0f);
        this.barrelModel[5].setRotationPoint(38.0f, -22.5f, -3.0f);
        this.barrelModel[6].addBox(55.0f, -1.5f, 1.5f, 4, 3, 3, 0.0f);
        this.barrelModel[6].setRotationPoint(38.0f, -22.5f, -3.0f);
        (this.leftTrackModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.leftTrackModel[1] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.leftTrackModel[2] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.leftTrackModel[3] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.leftTrackModel[4] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.leftTrackModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 100, this.textureX, this.textureY);
        this.leftTrackModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 140, this.textureX, this.textureY);
        this.leftTrackModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 180, this.textureX, this.textureY);
        this.leftTrackModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 230, this.textureX, this.textureY);
        this.leftTrackModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 280, this.textureX, this.textureY);
        this.leftTrackModel[0].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.leftTrackModel[0].setRotationPoint(36.0f, 1.0f, -24.0f);
        this.leftTrackModel[1].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.leftTrackModel[1].setRotationPoint(18.0f, 1.0f, -24.0f);
        this.leftTrackModel[2].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.leftTrackModel[2].setRotationPoint(0.0f, 1.0f, -24.0f);
        this.leftTrackModel[3].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.leftTrackModel[3].setRotationPoint(-18.0f, 1.0f, -24.0f);
        this.leftTrackModel[4].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.leftTrackModel[4].setRotationPoint(-36.0f, 1.0f, -24.0f);
        this.leftTrackModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 10, 8, 0.0f);
        this.leftTrackModel[5].setRotationPoint(59.0f, -6.5f, -25.0f);
        this.leftTrackModel[6].addBox(0.0f, 0.0f, 0.0f, 82, 1, 8, 0.0f);
        this.leftTrackModel[6].setRotationPoint(-36.5f, 9.0f, -25.0f);
        this.leftTrackModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 16, 8, 0.0f);
        this.leftTrackModel[7].setRotationPoint(59.0f, 3.0f, -25.0f);
        this.leftTrackModel[7].rotateAngleZ = -1.169371f;
        this.leftTrackModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 18, 8, 0.0f);
        this.leftTrackModel[8].setRotationPoint(-53.0f, 3.0f, -25.0f);
        this.leftTrackModel[8].rotateAngleZ = 1.186824f;
        this.leftTrackModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 8, 8, 0.0f);
        this.leftTrackModel[9].setRotationPoint(-53.0f, -5.0f, -25.0f);
        (this.rightTrackModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.rightTrackModel[1] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.rightTrackModel[2] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.rightTrackModel[3] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.rightTrackModel[4] = new ModelRendererTurbo((ModelBase)this, 680, 530, this.textureX, this.textureY);
        this.rightTrackModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 100, this.textureX, this.textureY);
        this.rightTrackModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 140, this.textureX, this.textureY);
        this.rightTrackModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 180, this.textureX, this.textureY);
        this.rightTrackModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 230, this.textureX, this.textureY);
        this.rightTrackModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 280, this.textureX, this.textureY);
        this.rightTrackModel[0].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.rightTrackModel[0].setRotationPoint(36.0f, 1.0f, 18.0f);
        this.rightTrackModel[1].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.rightTrackModel[1].setRotationPoint(18.0f, 1.0f, 18.0f);
        this.rightTrackModel[2].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.rightTrackModel[2].setRotationPoint(0.0f, 1.0f, 18.0f);
        this.rightTrackModel[3].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.rightTrackModel[3].setRotationPoint(-18.0f, 1.0f, 18.0f);
        this.rightTrackModel[4].addBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f);
        this.rightTrackModel[4].setRotationPoint(-36.0f, 1.0f, 18.0f);
        this.rightTrackModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 10, 8, 0.0f);
        this.rightTrackModel[5].setRotationPoint(59.0f, -6.5f, 17.0f);
        this.rightTrackModel[6].addBox(0.0f, 0.0f, 0.0f, 82, 1, 8, 0.0f);
        this.rightTrackModel[6].setRotationPoint(-36.5f, 9.0f, 17.0f);
        this.rightTrackModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 16, 8, 0.0f);
        this.rightTrackModel[7].setRotationPoint(59.0f, 3.0f, 17.0f);
        this.rightTrackModel[7].rotateAngleZ = -1.169371f;
        this.rightTrackModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 18, 8, 0.0f);
        this.rightTrackModel[8].setRotationPoint(-53.0f, 3.0f, 17.0f);
        this.rightTrackModel[8].rotateAngleZ = 1.186824f;
        this.rightTrackModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 8, 8, 0.0f);
        this.rightTrackModel[9].setRotationPoint(-53.0f, -5.0f, 17.0f);
        this.translateAll(0, -1, 0);
        this.flipAll();
    }
}
