//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.ww2;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelWW2_Vehicle_WillyJeep_1 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelWW2_Vehicle_WillyJeep_1() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[75])[0] = new ModelRendererTurbo((ModelBase)this, 40, 480, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 480, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 485, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 75, 470, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 150, 488, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 210, 460, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 470, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 35, 470, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 15, 480, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 40, 480, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 40, 490, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 250, 475, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 140, 470, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 190, 470, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 140, 470, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 190, 470, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 75, 470, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 440, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 50, 435, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 90, 440, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 130, 440, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 180, 440, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 90, 450, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 130, 450, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 180, 450, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 250, 440, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 225, 440, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 245, 440, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 300, 430, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 350, 480, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 350, 480, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 410, 480, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 410, 480, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 0, 400, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 0, 410, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 0, 420, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 0, 425, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 0, 430, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 0, 440, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 10, 400, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 10, 410, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 10, 420, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 10, 430, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 340, 415, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 20, 400, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 20, 410, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 20, 420, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 20, 430, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 20, 410, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 50, 400, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 50, 410, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 75, 400, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 75, 415, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 90, 415, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 90, 425, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 105, 415, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 0, 360, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 95, 360, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 190, 360, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase)this, 245, 360, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo((ModelBase)this, 20, 340, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo((ModelBase)this, 40, 340, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo((ModelBase)this, 60, 340, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo((ModelBase)this, 80, 340, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo((ModelBase)this, 100, 340, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo((ModelBase)this, 120, 340, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo((ModelBase)this, 140, 340, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo((ModelBase)this, 160, 340, this.textureX, this.textureY);
        this.bodyModel[69] = new ModelRendererTurbo((ModelBase)this, 170, 340, this.textureX, this.textureY);
        this.bodyModel[70] = new ModelRendererTurbo((ModelBase)this, 180, 340, this.textureX, this.textureY);
        this.bodyModel[71] = new ModelRendererTurbo((ModelBase)this, 205, 340, this.textureX, this.textureY);
        this.bodyModel[72] = new ModelRendererTurbo((ModelBase)this, 0, 315, this.textureX, this.textureY);
        this.bodyModel[73] = new ModelRendererTurbo((ModelBase)this, 8, 315, this.textureX, this.textureY);
        this.bodyModel[74] = new ModelRendererTurbo((ModelBase)this, 16, 315, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 2, 28, 0.0f);
        this.bodyModel[0].setRotationPoint(16.0f, 0.0f, -14.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f);
        this.bodyModel[1].setRotationPoint(12.0f, 0.5f, -9.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f);
        this.bodyModel[2].setRotationPoint(12.0f, 0.5f, 7.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 13, 1, 32, 0.0f);
        this.bodyModel[3].setRotationPoint(-1.0f, -7.0f, -16.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 19, 6, 18, 0.0f);
        this.bodyModel[4].setRotationPoint(-7.0f, -4.0f, -9.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 12, 32, 0.0f);
        this.bodyModel[5].setRotationPoint(-8.0f, -11.0f, -16.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 15, 6, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(-23.0f, -5.0f, -16.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 15, 6, 1, 0.0f);
        this.bodyModel[7].setRotationPoint(-23.0f, -5.0f, 15.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 8, 2, 4, 0.0f);
        this.bodyModel[8].setRotationPoint(-22.0f, -1.0f, -2.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 6, 3, 4, 0.0f);
        this.bodyModel[9].setRotationPoint(-14.0f, -2.0f, -2.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(-10.0f, -1.0f, -0.5f);
        this.bodyModel[10].rotateAngleZ = -2.9147f;
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 17, 1, 32, 0.0f);
        this.bodyModel[11].setRotationPoint(-23.0f, 1.0f, -16.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 12, 2, 10, 0.0f);
        this.bodyModel[12].setRotationPoint(-22.0f, -1.0f, 4.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 14, 1, 10, 0.0f);
        this.bodyModel[13].setRotationPoint(-22.0f, 0.0f, 4.0f);
        this.bodyModel[13].rotateAngleZ = 1.832596f;
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 12, 2, 10, 0.0f);
        this.bodyModel[14].setRotationPoint(-22.0f, -1.0f, -14.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 14, 1, 10, 0.0f);
        this.bodyModel[15].setRotationPoint(-22.0f, 0.0f, -14.0f);
        this.bodyModel[15].rotateAngleZ = 1.832596f;
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 9, 1, 0.0f);
        this.bodyModel[16].setRotationPoint(-11.0f, -10.0f, 9.5f);
        this.bodyModel[16].rotateAngleY = 3.1415927f;
        this.bodyModel[16].rotateAngleZ = -0.9599311f;
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 18, 1, 22, 0.0f);
        this.bodyModel[17].setRotationPoint(-41.0f, 1.0f, -11.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 2, 1, 32, 0.0f);
        this.bodyModel[18].setRotationPoint(-43.0f, 1.0f, -16.0f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 18, 6, 1, 0.0f);
        this.bodyModel[19].setRotationPoint(-41.0f, -5.0f, -11.0f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 18, 1, 6, 0.0f);
        this.bodyModel[20].setRotationPoint(-41.0f, -6.0f, -16.0f);
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 19, 5, 1, 0.0f);
        this.bodyModel[21].setRotationPoint(-42.0f, -11.0f, -16.0f);
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 18, 6, 1, 0.0f);
        this.bodyModel[22].setRotationPoint(-41.0f, -5.0f, 10.0f);
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 18, 1, 6, 0.0f);
        this.bodyModel[23].setRotationPoint(-41.0f, -6.0f, 10.0f);
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 19, 5, 1, 0.0f);
        this.bodyModel[24].setRotationPoint(-42.0f, -11.0f, 15.0f);
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 1, 7, 20, 0.0f);
        this.bodyModel[25].setRotationPoint(-43.0f, -6.0f, -10.0f);
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 2, 7, 6, 0.0f);
        this.bodyModel[26].setRotationPoint(-43.0f, -6.0f, 10.0f);
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 2, 7, 6, 0.0f);
        this.bodyModel[27].setRotationPoint(-43.0f, -6.0f, -16.0f);
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 1, 5, 32, 0.0f);
        this.bodyModel[28].setRotationPoint(-43.0f, -11.0f, -16.0f);
        this.bodyModel[29].addBox(0.0f, 0.0f, 0.0f, 2, 2, 24, 0.0f);
        this.bodyModel[29].setRotationPoint(6.0f, 2.0f, -12.0f);
        this.bodyModel[30].addBox(0.0f, 0.0f, 0.0f, 3, 3, 6, 0.0f);
        this.bodyModel[30].setRotationPoint(5.5f, 1.5f, -7.0f);
        this.bodyModel[31].addBox(0.0f, 0.0f, 0.0f, 2, 2, 24, 0.0f);
        this.bodyModel[31].setRotationPoint(-33.0f, 2.0f, -12.0f);
        this.bodyModel[32].addBox(0.0f, 0.0f, 0.0f, 3, 3, 6, 0.0f);
        this.bodyModel[32].setRotationPoint(-33.5f, 1.5f, -7.0f);
        this.bodyModel[33].addBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
        this.bodyModel[33].setRotationPoint(8.0f, -9.0f, -15.0f);
        this.bodyModel[34].addBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f);
        this.bodyModel[34].setRotationPoint(11.5f, -9.0f, -9.0f);
        this.bodyModel[35].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.bodyModel[35].setRotationPoint(11.5f, -5.0f, -8.0f);
        this.bodyModel[36].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.bodyModel[36].setRotationPoint(11.5f, -5.0f, 7.0f);
        this.bodyModel[37].addBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f);
        this.bodyModel[37].setRotationPoint(11.5f, -9.0f, 6.0f);
        this.bodyModel[38].addBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
        this.bodyModel[38].setRotationPoint(8.0f, -9.0f, 13.0f);
        this.bodyModel[39].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.bodyModel[39].setRotationPoint(-43.5f, -1.0f, 13.0f);
        this.bodyModel[40].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.bodyModel[40].setRotationPoint(-43.5f, -1.5f, 10.0f);
        this.bodyModel[41].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.bodyModel[41].setRotationPoint(-43.5f, -1.5f, -12.0f);
        this.bodyModel[42].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.bodyModel[42].setRotationPoint(-43.5f, -1.0f, -15.0f);
        this.bodyModel[43].addBox(0.0f, 0.0f, 0.0f, 1, 11, 28, 0.0f);
        this.bodyModel[43].setRotationPoint(-6.0f, -11.0f, -14.0f);
        this.bodyModel[43].rotateAngleZ = -2.879793f;
        this.bodyModel[44].addBox(0.0f, 0.0f, 0.0f, 12, 3, 2, 0.0f);
        this.bodyModel[44].setRotationPoint(-21.0f, 0.0f, -17.0f);
        this.bodyModel[45].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.bodyModel[45].setRotationPoint(-22.0f, 1.0f, -17.5f);
        this.bodyModel[45].rotateAngleY = 0.6457718f;
        this.bodyModel[46].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.bodyModel[46].setRotationPoint(-9.0f, 1.5f, -16.5f);
        this.bodyModel[47].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.bodyModel[47].setRotationPoint(-5.0f, 1.5f, -16.5f);
        this.bodyModel[47].rotateAngleY = 1.22173f;
        this.bodyModel[48].addBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f);
        this.bodyModel[48].setRotationPoint(-5.0f, 1.5f, -9.0f);
        this.bodyModel[48].rotateAngleX = 0.06981317f;
        this.bodyModel[49].addBox(0.0f, 0.0f, 0.0f, 3, 2, 6, 0.0f);
        this.bodyModel[49].setRotationPoint(-46.0f, -13.0f, 4.0f);
        this.bodyModel[50].addBox(0.0f, 0.0f, 0.0f, 3, 8, 8, 0.0f);
        this.bodyModel[50].setRotationPoint(-46.0f, -11.0f, 4.0f);
        this.bodyModel[51].addBox(0.0f, 0.0f, 0.0f, 4, 2, 9, 0.0f);
        this.bodyModel[51].setRotationPoint(-46.5f, -4.0f, 3.5f);
        this.bodyModel[52].addBox(0.0f, 0.0f, 0.0f, 2, 3, 2, 0.0f);
        this.bodyModel[52].setRotationPoint(-45.5f, -13.0f, 10.0f);
        this.bodyModel[52].rotateAngleX = -0.5759587f;
        this.bodyModel[53].addBox(0.0f, 0.0f, 0.0f, 0, 1, 3, 0.0f);
        this.bodyModel[53].setRotationPoint(-46.0f, -13.0f, 10.0f);
        this.bodyModel[53].rotateAngleX = -0.7853982f;
        this.bodyModel[54].addBox(0.0f, 0.0f, 0.0f, 0, 1, 3, 0.0f);
        this.bodyModel[54].setRotationPoint(-43.0f, -13.0f, 10.0f);
        this.bodyModel[54].rotateAngleX = -0.7853982f;
        this.bodyModel[55].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 4.0f, 14, 14, 48, 4, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f });
        this.bodyModel[55].rotateAngleY = 1.5707964f;
        this.bodyModel[55].setRotationPoint(-47.0f, -2.0f, 1.0f);
        this.bodyModel[56].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(19.0, 2.0, 19, 2), new Coord2D(19.0, 24.0, 19, 24), new Coord2D(0.0, 26.0, 0, 26) }), 4.0f, 19, 26, 88, 4, 0, new float[] { 26.0f, 20.0f, 22.0f, 20.0f });
        this.bodyModel[56].rotateAngleX = 1.5707964f;
        this.bodyModel[56].rotateAngleY = 3.1415927f;
        this.bodyModel[56].setRotationPoint(-7.0f, -10.0f, -13.0f);
        this.bodyModel[57].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(19.0, 2.0, 19, 2), new Coord2D(19.0, 24.0, 19, 24), new Coord2D(0.0, 26.0, 0, 26) }), 1.0f, 19, 26, 88, 1, 0, new float[] { 26.0f, 20.0f, 22.0f, 20.0f });
        this.bodyModel[57].rotateAngleX = 1.5707964f;
        this.bodyModel[57].rotateAngleY = 3.1415927f;
        this.bodyModel[57].rotateAngleZ = 0.05265658f;
        this.bodyModel[57].setRotationPoint(-7.0f, -11.0f, -13.0f);
        this.bodyModel[58].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 2.0, 3, 2), new Coord2D(3.0, 20.0, 3, 20), new Coord2D(0.0, 22.0, 0, 22) }), 19.0f, 3, 22, 48, 19, 0, new float[] { 22.0f, 4.0f, 18.0f, 4.0f });
        this.bodyModel[58].rotateAngleX = 1.5707964f;
        this.bodyModel[58].rotateAngleZ = 1.5707964f;
        this.bodyModel[58].setRotationPoint(-7.0f, -6.0f, 11.0f);
        this.bodyModel[59].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(5.0, 8.0, 5, 8), new Coord2D(5.0, 9.0, 5, 9), new Coord2D(0.0, 1.0, 0, 1) }), 32.0f, 5, 9, 22, 32, 0, new float[] { 1.0f, 10.0f, 1.0f, 10.0f });
        this.bodyModel[59].rotateAngleY = 3.1415927f;
        this.bodyModel[59].setRotationPoint(-6.0f, 2.0f, -16.0f);
        this.bodyModel[60].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 7.0, 3, 7), new Coord2D(0.0, 7.0, 0, 7) }), 5.0f, 3, 7, 18, 5, 0, new float[] { 7.0f, 3.0f, 8.0f });
        this.bodyModel[60].setRotationPoint(-23.0f, 2.0f, 16.0f);
        this.bodyModel[61].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 7.0, 3, 7), new Coord2D(0.0, 7.0, 0, 7) }), 5.0f, 3, 7, 18, 5, 0, new float[] { 7.0f, 3.0f, 8.0f });
        this.bodyModel[61].setRotationPoint(-23.0f, 2.0f, -11.0f);
        this.bodyModel[62].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 7.0, 3, 7), new Coord2D(0.0, 7.0, 0, 7) }), 5.0f, 3, 7, 18, 5, 0, new float[] { 7.0f, 3.0f, 8.0f });
        this.bodyModel[62].rotateAngleY = 3.1415927f;
        this.bodyModel[62].setRotationPoint(-41.0f, 2.0f, 11.0f);
        this.bodyModel[63].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 7.0, 3, 7), new Coord2D(0.0, 7.0, 0, 7) }), 5.0f, 3, 7, 18, 5, 0, new float[] { 7.0f, 3.0f, 8.0f });
        this.bodyModel[63].rotateAngleY = 3.1415927f;
        this.bodyModel[63].setRotationPoint(-41.0f, 2.0f, -16.0f);
        this.bodyModel[64].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 3.0, 7, 3), new Coord2D(0.0, 3.0, 0, 3) }), 5.0f, 7, 3, 18, 5, 0, new float[] { 3.0f, 7.0f, 8.0f });
        this.bodyModel[64].setRotationPoint(-23.0f, -2.0f, 16.0f);
        this.bodyModel[65].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 3.0, 7, 3), new Coord2D(0.0, 3.0, 0, 3) }), 5.0f, 7, 3, 18, 5, 0, new float[] { 3.0f, 7.0f, 8.0f });
        this.bodyModel[65].setRotationPoint(-23.0f, -2.0f, -11.0f);
        this.bodyModel[66].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 3.0, 7, 3), new Coord2D(0.0, 3.0, 0, 3) }), 5.0f, 7, 3, 18, 5, 0, new float[] { 3.0f, 7.0f, 8.0f });
        this.bodyModel[66].rotateAngleY = 3.1415927f;
        this.bodyModel[66].setRotationPoint(-41.0f, -2.0f, 11.0f);
        this.bodyModel[67].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 3.0, 7, 3), new Coord2D(0.0, 3.0, 0, 3) }), 5.0f, 7, 3, 18, 5, 0, new float[] { 3.0f, 7.0f, 8.0f });
        this.bodyModel[67].rotateAngleY = 3.1415927f;
        this.bodyModel[67].setRotationPoint(-41.0f, -2.0f, -16.0f);
        this.bodyModel[68].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 0.0, 2, 0), new Coord2D(2.0, 2.0, 2, 2) }), 1.0f, 2, 2, 7, 1, 0, new float[] { 3.0f, 2.0f, 2.0f });
        this.bodyModel[68].rotateAngleY = 3.1415927f;
        this.bodyModel[68].setRotationPoint(-10.0f, -5.0f, 15.0f);
        this.bodyModel[69].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 0.0, 2, 0), new Coord2D(2.0, 2.0, 2, 2) }), 1.0f, 2, 2, 7, 1, 0, new float[] { 3.0f, 2.0f, 2.0f });
        this.bodyModel[69].rotateAngleY = 3.1415927f;
        this.bodyModel[69].setRotationPoint(-10.0f, -5.0f, -16.0f);
        this.bodyModel[70].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(6.0, 0.0, 6, 0), new Coord2D(6.0, 6.0, 6, 6) }), 1.0f, 6, 6, 21, 1, 0, new float[] { 9.0f, 6.0f, 6.0f });
        this.bodyModel[70].setRotationPoint(-17.0f, -5.0f, 16.0f);
        this.bodyModel[71].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(6.0, 0.0, 6, 0), new Coord2D(6.0, 6.0, 6, 6) }), 1.0f, 6, 6, 21, 1, 0, new float[] { 9.0f, 6.0f, 6.0f });
        this.bodyModel[71].setRotationPoint(-17.0f, -5.0f, -15.0f);
        this.bodyModel[72].addTrapezoid(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 4);
        this.bodyModel[72].setRotationPoint(-25.5f, -22.0f, -0.5f);
        this.bodyModel[73].addBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f);
        this.bodyModel[73].setRotationPoint(-25.5f, -19.0f, -0.5f);
        this.bodyModel[74].addTrapezoid(0.0f, 0.0f, 0.0f, 2, 10, 2, 0.0f, -0.15f, 4);
        this.bodyModel[74].setRotationPoint(-26.0f, -9.0f, -1.0f);
        (this.leftFrontWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 105, 415, this.textureX, this.textureY);
        this.leftFrontWheelModel[0].addShape3D(7.0f, -7.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 4.0f, 14, 14, 48, 4, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f });
        this.leftFrontWheelModel[0].setRotationPoint(7.0f, 3.0f, -14.0f);
        (this.rightFrontWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 105, 415, this.textureX, this.textureY);
        this.rightFrontWheelModel[0].addShape3D(7.0f, -7.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 4.0f, 14, 14, 48, 4, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f });
        this.rightFrontWheelModel[0].setRotationPoint(7.0f, 3.0f, 14.0f);
        (this.leftBackWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 105, 415, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShape3D(7.0f, -7.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 4.0f, 14, 14, 48, 4, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f });
        this.leftBackWheelModel[0].setRotationPoint(-32.0f, 3.0f, -14.0f);
        (this.rightBackWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 105, 415, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShape3D(7.0f, -7.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 4.0f, 14, 14, 48, 4, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f });
        this.rightBackWheelModel[0].setRotationPoint(-32.0f, 3.0f, 14.0f);
        this.steeringWheelModel = new ModelRendererTurbo[1];
        (this.steeringWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 105, 395, this.textureX, this.textureY)).addBox(0.0f, -4.0f, -4.0f, 1, 8, 8, 0.0f);
        this.steeringWheelModel[0].setRotationPoint(-12.0f, -10.0f, 9.0f);
        this.steeringWheelModel[0].rotateAngleZ = -0.1919862f;
        final ModelRendererTurbo[][] m2Model = { new ModelRendererTurbo[0], new ModelRendererTurbo[25], null };
        m2Model[1][0] = new ModelRendererTurbo((ModelBase)this, 485, 0, this.textureX, this.textureY);
        m2Model[1][1] = new ModelRendererTurbo((ModelBase)this, 479, 18, this.textureX, this.textureY);
        m2Model[1][2] = new ModelRendererTurbo((ModelBase)this, 486, 3, this.textureX, this.textureY);
        m2Model[1][3] = new ModelRendererTurbo((ModelBase)this, 476, 0, this.textureX, this.textureY);
        m2Model[1][4] = new ModelRendererTurbo((ModelBase)this, 471, 9, this.textureX, this.textureY);
        m2Model[1][5] = new ModelRendererTurbo((ModelBase)this, 475, 12, this.textureX, this.textureY);
        m2Model[1][6] = new ModelRendererTurbo((ModelBase)this, 471, 0, this.textureX, this.textureY);
        m2Model[1][7] = new ModelRendererTurbo((ModelBase)this, 473, 4, this.textureX, this.textureY);
        m2Model[1][8] = new ModelRendererTurbo((ModelBase)this, 466, 0, this.textureX, this.textureY);
        m2Model[1][9] = new ModelRendererTurbo((ModelBase)this, 459, 0, this.textureX, this.textureY);
        m2Model[1][10] = new ModelRendererTurbo((ModelBase)this, 461, 16, this.textureX, this.textureY);
        m2Model[1][11] = new ModelRendererTurbo((ModelBase)this, 463, 4, this.textureX, this.textureY);
        m2Model[1][12] = new ModelRendererTurbo((ModelBase)this, 466, 9, this.textureX, this.textureY);
        m2Model[1][13] = new ModelRendererTurbo((ModelBase)this, 457, 9, this.textureX, this.textureY);
        m2Model[1][14] = new ModelRendererTurbo((ModelBase)this, 461, 12, this.textureX, this.textureY);
        m2Model[1][15] = new ModelRendererTurbo((ModelBase)this, 468, 12, this.textureX, this.textureY);
        m2Model[1][16] = new ModelRendererTurbo((ModelBase)this, 461, 12, this.textureX, this.textureY);
        m2Model[1][17] = new ModelRendererTurbo((ModelBase)this, 461, 12, this.textureX, this.textureY);
        m2Model[1][18] = new ModelRendererTurbo((ModelBase)this, 468, 12, this.textureX, this.textureY);
        m2Model[1][19] = new ModelRendererTurbo((ModelBase)this, 461, 12, this.textureX, this.textureY);
        m2Model[1][20] = new ModelRendererTurbo((ModelBase)this, 498, 9, this.textureX, this.textureY);
        m2Model[1][21] = new ModelRendererTurbo((ModelBase)this, 487, 9, this.textureX, this.textureY);
        m2Model[1][22] = new ModelRendererTurbo((ModelBase)this, 466, 9, this.textureX, this.textureY);
        m2Model[1][23] = new ModelRendererTurbo((ModelBase)this, 457, 9, this.textureX, this.textureY);
        m2Model[1][24] = new ModelRendererTurbo((ModelBase)this, 479, 18, this.textureX, this.textureY);
        m2Model[1][0].addShapeBox(7.5f, -1.5f, -0.5f, 11, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        m2Model[1][1].addShapeBox(-5.5f, -2.5f, -1.5f, 13, 3, 3, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.85f, -0.85f, 0.0f, -0.85f, -0.85f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.85f, -0.85f, 0.0f, -0.85f, -0.85f, 0.0f, -0.5f, -0.5f);
        m2Model[1][2].addBox(-8.5f, -2.5f, -1.0f, 10, 3, 2, 0.0f);
        m2Model[1][3].addBox(-3.0f, -2.0f, 0.2f, 3, 2, 1, 0.0f);
        m2Model[1][4].addBox(-7.5f, -1.5f, -1.1f, 6, 1, 1, 0.0f);
        m2Model[1][5].addTrapezoid(-9.2f, -1.5f, -0.5f, 4, 1, 1, 0.0f, -0.2f, 3);
        m2Model[1][6].addShapeBox(-2.5f, -2.5f, -1.3f, 1, 2, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9f, -0.5f, 0.0f, -0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f);
        m2Model[1][7].addShapeBox(-2.5f, -2.5f, -3.3f, 1, 1, 2, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f);
        m2Model[1][8].addShapeBox(0.4f, -3.5f, -0.5f, 1, 2, 1, 0.0f, -0.4f, -0.4f, -0.3f, -0.2f, -0.4f, -0.3f, -0.2f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        m2Model[1][9].addShapeBox(-7.6f, -3.5f, -0.5f, 2, 2, 1, 0.0f, -0.6f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        m2Model[1][10].addBox(1.5f, -1.5f, -0.5f, 7, 1, 1, 0.0f);
        m2Model[1][11].addBox(18.5f, -1.5f, -0.5f, 1, 1, 1, 0.0f);
        m2Model[1][12].addShapeBox(7.5f, -0.8f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        m2Model[1][13].addShapeBox(6.5f, 0.2f, -0.5f, 3, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        m2Model[1][14].addShapeBox(-10.0f, -3.0f, 0.5f, 2, 1, 1, 0.0f, 0.0f, -0.6f, -0.4f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, -0.4999f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4999f, 0.0f, 0.0f, 0.0f);
        m2Model[1][15].addShapeBox(-10.0f, -2.0f, 0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        m2Model[1][16].addShapeBox(-10.0f, 0.0f, 0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4999f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, -0.4f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, -0.4999f, 0.0f, -0.6f, 0.0f);
        m2Model[1][17].addShapeBox(-10.0f, -3.0f, -1.5f, 2, 1, 1, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, -0.4999f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4999f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f);
        m2Model[1][18].addShapeBox(-10.0f, -2.0f, -1.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f);
        m2Model[1][19].addShapeBox(-10.0f, 0.0f, -1.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4999f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, -0.4999f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, -0.4f);
        m2Model[1][20].addBox(-2.5f, -0.5f, 1.0f, 2, 4, 4, 0.0f);
        m2Model[1][21].addShapeBox(-2.5f, -2.0f, 0.55f, 2, 1, 3, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.8f, 0.0f, -0.2f, -0.8f, 0.0f, -0.2f, -0.8f, 0.0f, -0.2f, -0.8f, 0.0f);
        m2Model[1][21].rotateAngleX = -0.3665192f;
        m2Model[1][22].flip = true;
        m2Model[1][22].addShapeBox(7.5f, -0.8f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        m2Model[1][23].flip = true;
        m2Model[1][23].addShapeBox(6.5f, 0.2f, -0.5f, 3, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        m2Model[1][24].flip = true;
        m2Model[1][24].addShapeBox(-5.5f, -2.5f, -1.5f, 13, 3, 3, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.85f, -0.85f, 0.0f, -0.85f, -0.85f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.85f, -0.85f, 0.0f, -0.85f, -0.85f, 0.0f, -0.5f, -0.5f);
        for (final ModelRendererTurbo gunPart : m2Model[1]) {
            gunPart.setRotationPoint(-25.0f, -22.0f, 0.0f);
        }
        m2Model[2] = new ModelRendererTurbo[0];
        this.registerGunModel("M2", m2Model);
        this.translateAll(13, 0, 0);
        this.flipAll();
    }
}
