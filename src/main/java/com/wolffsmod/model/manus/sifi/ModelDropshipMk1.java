//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.sifi;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelDropshipMk1 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelDropshipMk1() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[43])[0] = new ModelRendererTurbo((ModelBase)this, 0, 457, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 457, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 100, 470, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 100, 457, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 98, 494, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 190, 170, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 190, 190, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 366, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 429, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 84, 429, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 174, 429, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 216, 429, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 324, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 130, 370, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 73, 370, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 73, 400, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 130, 400, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 238, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 440, 0, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 380, 15, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 484, 0, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 484, 15, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 350, 0, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 335, 20, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 400, 0, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 400, 0, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 290, 0, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 440, 0, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 440, 0, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 380, 50, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 290, 0, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 440, 0, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 440, 0, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 380, 50, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 255, 0, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 255, 0, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 255, 0, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 255, 0, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 440, 50, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 0, 110, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 70, 110, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 0, 110, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 70, 110, this.textureX, this.textureY);
        this.bodyModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 14, 11, 34, 0.0f, -3.0f, 3);
        this.bodyModel[1].setRotationPoint(-60.0f, -12.0f, -17.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 30, 10, 1, 0.0f);
        this.bodyModel[2].setRotationPoint(-46.0f, -12.0f, -17.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 30, 10, 1, 0.0f);
        this.bodyModel[3].setRotationPoint(-46.0f, -12.0f, 16.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 30, 6, 12, 0.0f);
        this.bodyModel[4].setRotationPoint(-46.0f, -2.0f, -6.0f);
        this.bodyModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(30.0, 5.0, 30, 5), new Coord2D(30.0, 6.0, 30, 6), new Coord2D(0.0, 6.0, 0, 6) }), 11.0f, 30, 6, 67, 11, 0, new float[] { 30.0f, 1.0f, 30.0f, 6.0f });
        this.bodyModel[5].setRotationPoint(-16.0f, 4.0f, -6.0f);
        this.bodyModel[6].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(30.0, 5.0, 30, 5), new Coord2D(30.0, 6.0, 30, 6), new Coord2D(0.0, 6.0, 0, 6) }), 11.0f, 30, 6, 67, 11, 0, new float[] { 30.0f, 1.0f, 30.0f, 6.0f });
        this.bodyModel[6].setRotationPoint(-16.0f, 4.0f, 17.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 25, 34, 0.0f);
        this.bodyModel[7].setRotationPoint(-16.0f, -25.0f, -17.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 17, 1, 24, 0.0f);
        this.bodyModel[8].setRotationPoint(-47.0f, -12.0f, -12.0f);
        this.bodyModel[8].rotateAngleZ = 0.7853982f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 20, 1, 24, 0.0f);
        this.bodyModel[9].setRotationPoint(-35.0f, -24.0f, -12.0f);
        this.bodyModel[9].rotateAngleZ = 0.1047198f;
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 19, 13, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(-35.0f, -24.0f, -12.0f);
        this.bodyModel[10].rotateAngleX = -0.3839724f;
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 19, 1, 13, 0.0f);
        this.bodyModel[11].setRotationPoint(-35.0f, -24.0f, 12.0f);
        this.bodyModel[11].rotateAngleX = -1.186824f;
        this.bodyModel[12].addTrapezoid(0.0f, 0.0f, 0.0f, 80, 4, 36, 0.0f, -4.0f, 4);
        this.bodyModel[12].setRotationPoint(-16.0f, -29.0f, -18.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 32, 25, 1, 0.0f);
        this.bodyModel[13].setRotationPoint(32.0f, -25.0f, 17.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 26, 25, 1, 0.0f);
        this.bodyModel[14].setRotationPoint(-16.0f, -25.0f, 17.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 26, 25, 1, 0.0f);
        this.bodyModel[15].setRotationPoint(-16.0f, -25.0f, -18.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 32, 25, 1, 0.0f);
        this.bodyModel[16].setRotationPoint(32.0f, -25.0f, -18.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 80, 4, 36, 0.0f);
        this.bodyModel[17].setRotationPoint(-16.0f, 0.0f, -18.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 3, 10, 32, 0.0f);
        this.bodyModel[18].setRotationPoint(-46.0f, -12.0f, -16.0f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 10, 1, 32, 0.0f);
        this.bodyModel[19].setRotationPoint(-43.0f, -12.0f, -16.0f);
        this.bodyModel[19].rotateAngleZ = -1.396263f;
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 7, 4, 6, 0.0f);
        this.bodyModel[20].setRotationPoint(-43.0f, -6.0f, -3.0f);
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f);
        this.bodyModel[21].setRotationPoint(-37.0f, -6.0f, -0.5f);
        this.bodyModel[21].rotateAngleX = 3.1415927f;
        this.bodyModel[21].rotateAngleZ = 1.5707964f;
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 14, 2, 14, 0.0f);
        this.bodyModel[22].setRotationPoint(-39.0f, -4.0f, -7.0f);
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 20, 2, 14, 0.0f);
        this.bodyModel[23].setRotationPoint(-27.0f, -3.0f, -7.0f);
        this.bodyModel[23].rotateAngleZ = 1.308997f;
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 12, 2, 1, 0.0f);
        this.bodyModel[24].setRotationPoint(-36.0f, -10.0f, 6.5f);
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 12, 2, 1, 0.0f);
        this.bodyModel[25].setRotationPoint(-36.0f, -10.0f, -7.5f);
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 23, 1, 10, 0.0f);
        this.bodyModel[26].setRotationPoint(-15.0f, -3.0f, 7.0f);
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 1, 6, 11, 0.0f);
        this.bodyModel[27].setRotationPoint(8.0f, -6.0f, 6.0f);
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 1, 6, 11, 0.0f);
        this.bodyModel[28].setRotationPoint(33.0f, -6.0f, 6.0f);
        this.bodyModel[29].addBox(0.0f, 0.0f, 0.0f, 22, 1, 10, 0.0f);
        this.bodyModel[29].setRotationPoint(34.0f, -3.0f, 7.0f);
        this.bodyModel[30].addBox(0.0f, 0.0f, 0.0f, 23, 1, 10, 0.0f);
        this.bodyModel[30].setRotationPoint(-15.0f, -3.0f, -17.0f);
        this.bodyModel[31].addBox(0.0f, 0.0f, 0.0f, 1, 6, 11, 0.0f);
        this.bodyModel[31].setRotationPoint(8.0f, -6.0f, -17.0f);
        this.bodyModel[32].addBox(0.0f, 0.0f, 0.0f, 1, 6, 11, 0.0f);
        this.bodyModel[32].setRotationPoint(33.0f, -6.0f, -17.0f);
        this.bodyModel[33].addBox(0.0f, 0.0f, 0.0f, 22, 1, 10, 0.0f);
        this.bodyModel[33].setRotationPoint(34.0f, -3.0f, -17.0f);
        this.bodyModel[34].addBox(0.0f, 0.0f, 0.0f, 1, 25, 1, 0.0f);
        this.bodyModel[34].setRotationPoint(8.5f, -25.0f, 5.5f);
        this.bodyModel[35].addBox(0.0f, 0.0f, 0.0f, 1, 25, 1, 0.0f);
        this.bodyModel[35].setRotationPoint(8.5f, -25.0f, -6.5f);
        this.bodyModel[36].addBox(0.0f, 0.0f, 0.0f, 1, 25, 1, 0.0f);
        this.bodyModel[36].setRotationPoint(32.5f, -25.0f, 5.5f);
        this.bodyModel[37].addBox(0.0f, 0.0f, 0.0f, 1, 25, 1, 0.0f);
        this.bodyModel[37].setRotationPoint(32.5f, -25.0f, -6.5f);
        this.bodyModel[38].addBox(0.0f, 0.0f, 0.0f, 1, 25, 34, 0.0f);
        this.bodyModel[38].setRotationPoint(56.0f, -25.0f, -17.0f);
        this.bodyModel[39].addTrapezoid(0.0f, 0.0f, 0.0f, 16, 3, 18, 0.0f, -3.0f, 5);
        this.bodyModel[39].setRotationPoint(13.0f, 2.0f, -34.0f);
        this.bodyModel[40].addBox(0.0f, 0.0f, 0.0f, 16, 1, 18, 0.0f);
        this.bodyModel[40].setRotationPoint(13.0f, 1.0f, -34.0f);
        this.bodyModel[41].addTrapezoid(0.0f, 0.0f, 0.0f, 16, 3, 18, 0.0f, -3.0f, 5);
        this.bodyModel[41].setRotationPoint(13.0f, 2.0f, 16.0f);
        this.bodyModel[42].addBox(0.0f, 0.0f, 0.0f, 16, 1, 18, 0.0f);
        this.bodyModel[42].setRotationPoint(13.0f, 1.0f, 16.0f);
        (this.tailModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 281, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 221, 496, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 200, 496, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 111, 145, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 145, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 165, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 178, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 178, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo((ModelBase)this, 412, 229, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo((ModelBase)this, 412, 229, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo((ModelBase)this, 320, 262, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo((ModelBase)this, 320, 229, this.textureX, this.textureY);
        this.tailModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(32.0, 16.0, 32, 16), new Coord2D(32.0, 29.0, 32, 29), new Coord2D(0.0, 29.0, 0, 29) }), 36.0f, 32, 29, 110, 36, 0, new float[] { 36.0f, 13.0f, 32.0f, 29.0f });
        this.tailModel[0].rotateAngleX = 3.1415927f;
        this.tailModel[0].rotateAngleZ = 3.1415927f;
        this.tailModel[0].setRotationPoint(64.0f, 4.0f, -18.0f);
        this.tailModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 44, 4, 36, 0.0f, -4.0f, 4);
        this.tailModel[1].setRotationPoint(52.0f, -29.0f, -18.0f);
        this.tailModel[2].addBox(0.0f, 0.0f, 0.0f, 5, 12, 4, 0.0f);
        this.tailModel[2].setRotationPoint(41.0f, -25.0f, 18.0f);
        this.tailModel[3].addBox(0.0f, 0.0f, 0.0f, 5, 12, 4, 0.0f);
        this.tailModel[3].setRotationPoint(41.0f, -25.0f, -22.0f);
        this.tailModel[4].addBox(0.0f, 0.0f, 0.0f, 50, 4, 12, 0.0f);
        this.tailModel[4].setRotationPoint(46.0f, -25.0f, 22.0f);
        this.tailModel[4].rotateAngleX = -1.5707964f;
        this.tailModel[4].rotateAngleY = -0.08203048f;
        this.tailModel[5].addBox(0.0f, 0.0f, 0.0f, 50, 12, 4, 0.0f);
        this.tailModel[5].setRotationPoint(46.0f, -25.0f, -22.0f);
        this.tailModel[5].rotateAngleY = 0.08028515f;
        this.tailModel[6].addBox(0.0f, 0.0f, 0.0f, 3, 6, 4, 0.0f);
        this.tailModel[6].setRotationPoint(94.0f, -22.0f, -2.0f);
        this.tailModel[7].addBox(0.0f, 0.0f, 0.0f, 3, 10, 10, 0.0f);
        this.tailModel[7].setRotationPoint(95.0f, -24.0f, -14.0f);
        this.tailModel[8].addBox(0.0f, 0.0f, 0.0f, 3, 10, 10, 0.0f);
        this.tailModel[8].setRotationPoint(95.0f, -24.0f, 4.0f);
        this.tailModel[9].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(22.0, 26.0, 22, 26), new Coord2D(7.0, 26.0, 7, 26) }), 1.0f, 22, 26, 88, 1, 0, new float[] { 20.0f, 26.0f, 15.0f, 27.0f });
        this.tailModel[9].setRotationPoint(74.0f, -25.0f, -14.0f);
        this.tailModel[9].rotateAngleX = -0.1919862f;
        this.tailModel[9].rotateAngleY = 3.1415927f;
        this.tailModel[10].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(22.0, 26.0, 22, 26), new Coord2D(7.0, 26.0, 7, 26) }), 1.0f, 22, 26, 88, 1, 0, new float[] { 20.0f, 26.0f, 15.0f, 27.0f });
        this.tailModel[10].setRotationPoint(74.0f, -25.0f, 13.0f);
        this.tailModel[10].rotateAngleX = 0.1919862f;
        this.tailModel[10].rotateAngleY = 3.1415927f;
        this.tailModel[11].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(22.0, 26.0, 22, 26), new Coord2D(7.0, 26.0, 7, 26) }), 1.0f, 22, 26, 88, 1, 0, new float[] { 20.0f, 26.0f, 15.0f, 27.0f });
        this.tailModel[11].setRotationPoint(78.0f, -24.0f, -17.0f);
        this.tailModel[11].rotateAngleX = 4.520403f;
        this.tailModel[11].rotateAngleY = 3.1415927f;
        this.tailModel[12].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(22.0, 26.0, 22, 26), new Coord2D(7.0, 26.0, 7, 26) }), 1.0f, 22, 26, 88, 1, 0, new float[] { 20.0f, 26.0f, 15.0f, 27.0f });
        this.tailModel[12].setRotationPoint(78.0f, -25.0f, 17.0f);
        this.tailModel[12].rotateAngleX = 1.7627826f;
        this.tailModel[12].rotateAngleY = 3.1415927f;
        (this.rightWingModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo((ModelBase)this, 321, 423, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 320, 329, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 245, 473, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 245, 467, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 245, 492, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo((ModelBase)this, 245, 483, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo((ModelBase)this, 102, 200, this.textureX, this.textureY);
        this.rightWingModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(48.0, 0.0, 48, 0), new Coord2D(38.0, 27.0, 38, 27), new Coord2D(44.0, 56.0, 44, 56), new Coord2D(18.0, 56.0, 18, 56) }), 1.0f, 48, 56, 191, 1, 0, new float[] { 48.0f, 29.0f, 30.0f, 26.0f, 59.0f });
        this.rightWingModel[0].setRotationPoint(77.0f, -28.0f, -14.0f);
        this.rightWingModel[0].rotateAngleX = 1.7819808f;
        this.rightWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(26.0, 0.0, 26, 0), new Coord2D(43.0, 27.0, 43, 27), new Coord2D(22.0, 27.0, 22, 27) }), 1.0f, 43, 27, 114, 1, 0, new float[] { 26.0f, 32.0f, 21.0f, 35.0f });
        this.rightWingModel[1].setRotationPoint(59.0f, -16.5f, -68.8f);
        this.rightWingModel[1].rotateAngleX = 2.0594888f;
        this.rightWingModel[2].addBox(0.0f, 0.0f, 0.0f, 30, 4, 4, 0.0f);
        this.rightWingModel[2].setRotationPoint(6.0f, -5.0f, -94.0f);
        this.rightWingModel[3].addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.rightWingModel[3].setRotationPoint(-3.0f, -4.0f, -93.0f);
        this.rightWingModel[4].addBox(0.0f, 0.0f, 0.0f, 28, 10, 10, 0.0f);
        this.rightWingModel[4].setRotationPoint(34.0f, -14.0f, -65.0f);
        this.rightWingModel[5].addBox(0.0f, 0.0f, 0.0f, 21, 4, 2, 0.0f);
        this.rightWingModel[5].setRotationPoint(39.0f, -17.5f, -61.0f);
        this.rightWingModel[6].addBox(0.0f, 0.0f, 0.0f, 20, 5, 20, 0.0f);
        this.rightWingModel[6].setRotationPoint(42.0f, -23.0f, -46.0f);
        this.rightWingModel[6].rotateAngleX = 0.20943952f;
        (this.leftWingModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo((ModelBase)this, 321, 363, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 320, 295, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 245, 473, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 245, 467, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 245, 492, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo((ModelBase)this, 245, 483, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo((ModelBase)this, 102, 200, this.textureX, this.textureY);
        this.leftWingModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(48.0, 0.0, 48, 0), new Coord2D(38.0, 27.0, 38, 27), new Coord2D(44.0, 56.0, 44, 56), new Coord2D(18.0, 56.0, 18, 56) }), 1.0f, 48, 56, 191, 1, 0, new float[] { 48.0f, 29.0f, 30.0f, 26.0f, 59.0f });
        this.leftWingModel[0].setRotationPoint(77.0f, -27.0f, 14.0f);
        this.leftWingModel[0].rotateAngleX = 4.5012045f;
        this.leftWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(26.0, 0.0, 26, 0), new Coord2D(43.0, 27.0, 43, 27), new Coord2D(22.0, 27.0, 22, 27) }), 1.0f, 43, 27, 114, 1, 0, new float[] { 26.0f, 32.0f, 21.0f, 35.0f });
        this.leftWingModel[1].setRotationPoint(59.0f, -15.5f, 68.5f);
        this.leftWingModel[1].rotateAngleX = 4.2236967f;
        this.leftWingModel[2].addBox(0.0f, 0.0f, 0.0f, 30, 4, 4, 0.0f);
        this.leftWingModel[2].setRotationPoint(6.0f, -5.0f, 90.0f);
        this.leftWingModel[3].addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.leftWingModel[3].setRotationPoint(-3.0f, -4.0f, 91.0f);
        this.leftWingModel[4].addBox(0.0f, 0.0f, 0.0f, 28, 10, 10, 0.0f);
        this.leftWingModel[4].setRotationPoint(34.0f, -14.0f, 55.0f);
        this.leftWingModel[5].addBox(0.0f, 0.0f, 0.0f, 21, 4, 2, 0.0f);
        this.leftWingModel[5].setRotationPoint(39.0f, -17.5f, 59.0f);
        this.leftWingModel[6].addBox(0.0f, 0.0f, 0.0f, 20, 5, 20, 0.0f);
        this.leftWingModel[6].setRotationPoint(62.0f, -23.0f, 46.0f);
        this.leftWingModel[6].rotateAngleX = 0.20943952f;
        this.leftWingModel[6].rotateAngleY = 3.1415927f;
        (this.bodyWheelModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 102, this.textureX, this.textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 20, 102, this.textureX, this.textureY);
        this.bodyWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 40, 102, this.textureX, this.textureY);
        this.bodyWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 125, 102, this.textureX, this.textureY);
        this.bodyWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 65, 102, this.textureX, this.textureY);
        this.bodyWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 140, 102, this.textureX, this.textureY);
        this.bodyWheelModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyWheelModel[9] = new ModelRendererTurbo((ModelBase)this, 125, 102, this.textureX, this.textureY);
        this.bodyWheelModel[10] = new ModelRendererTurbo((ModelBase)this, 65, 102, this.textureX, this.textureY);
        this.bodyWheelModel[11] = new ModelRendererTurbo((ModelBase)this, 140, 102, this.textureX, this.textureY);
        this.bodyWheelModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(16.0, 2.0, 16, 2), new Coord2D(0.0, 2.0, 0, 2) }), 6.0f, 16, 2, 35, 6, 0, new float[] { 2.0f, 16.0f, 3.0f, 14.0f });
        this.bodyWheelModel[0].setRotationPoint(0.0f, 10.0f, 3.0f);
        this.bodyWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f);
        this.bodyWheelModel[1].setRotationPoint(-10.0f, 5.0f, -1.0f);
        this.bodyWheelModel[1].rotateAngleZ = -0.5759587f;
        this.bodyWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 6, 2, 2, 0.0f);
        this.bodyWheelModel[2].setRotationPoint(-10.0f, 5.0f, -1.0f);
        this.bodyWheelModel[2].rotateAngleZ = 0.7330383f;
        this.bodyWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.bodyWheelModel[3].setRotationPoint(-7.0f, 8.0f, -0.5f);
        this.bodyWheelModel[3].rotateAngleZ = 1.064651f;
        this.bodyWheelModel[4].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(18.0, 0.0, 18, 0), new Coord2D(20.0, 3.0, 20, 3), new Coord2D(0.0, 3.0, 0, 3) }), 6.0f, 20, 3, 45, 6, 0, new float[] { 3.0f, 20.0f, 4.0f, 18.0f });
        this.bodyWheelModel[4].setRotationPoint(64.0f, 10.0f, 28.0f);
        this.bodyWheelModel[5].addBox(0.0f, 0.0f, 0.0f, 3, 8, 2, 0.0f);
        this.bodyWheelModel[5].setRotationPoint(57.0f, 1.0f, 23.0f);
        this.bodyWheelModel[5].rotateAngleX = -0.4014257f;
        this.bodyWheelModel[5].rotateAngleY = 3.1415927f;
        this.bodyWheelModel[6].addBox(0.0f, 0.0f, 0.0f, 3, 2, 6, 0.0f);
        this.bodyWheelModel[6].setRotationPoint(57.0f, 1.0f, 23.0f);
        this.bodyWheelModel[6].rotateAngleX = 0.3490658f;
        this.bodyWheelModel[6].rotateAngleY = 3.1415927f;
        this.bodyWheelModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 10, 1, 0.0f);
        this.bodyWheelModel[7].setRotationPoint(56.0f, 1.0f, 16.0f);
        this.bodyWheelModel[7].rotateAngleX = -1.029744f;
        this.bodyWheelModel[7].rotateAngleY = 3.1415927f;
        this.bodyWheelModel[8].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(18.0, 0.0, 18, 0), new Coord2D(20.0, 3.0, 20, 3), new Coord2D(0.0, 3.0, 0, 3) }), 6.0f, 20, 3, 45, 6, 0, new float[] { 3.0f, 20.0f, 4.0f, 18.0f });
        this.bodyWheelModel[8].setRotationPoint(64.0f, 10.0f, -22.0f);
        this.bodyWheelModel[9].addBox(0.0f, 0.0f, 0.0f, 3, 8, 2, 0.0f);
        this.bodyWheelModel[9].setRotationPoint(54.0f, 1.0f, -23.0f);
        this.bodyWheelModel[9].rotateAngleX = -0.4014257f;
        this.bodyWheelModel[10].addBox(0.0f, 0.0f, 0.0f, 3, 2, 6, 0.0f);
        this.bodyWheelModel[10].setRotationPoint(54.0f, 1.0f, -23.0f);
        this.bodyWheelModel[10].rotateAngleX = 0.3490658f;
        this.bodyWheelModel[11].addBox(0.0f, 0.0f, 0.0f, 1, 10, 1, 0.0f);
        this.bodyWheelModel[11].setRotationPoint(55.0f, 1.0f, -16.0f);
        this.bodyWheelModel[11].rotateAngleX = -1.029744f;
        this.translateAll(0, -2, 0);
        this.flipAll();
    }
}
