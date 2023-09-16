//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.prototype.psf;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelA144 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelA144() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[22])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 160, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 100, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 150, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 200, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 260, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 290, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 320, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 360, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 415, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 440, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 290, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 470, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 170, 100, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 170, 155, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 170, 180, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 170, 190, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 170, 190, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 170, 290, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 170, 230, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 170, 360, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 170, 360, this.textureX, this.textureY);
        this.bodyModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(60.0, 0.0, 60, 0), new Coord2D(65.0, 10.0, 65, 10), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(5.0, 3.0, 5, 3), new Coord2D(10.0, 2.0, 10, 2), new Coord2D(20.0, 0.0, 20, 0) }), 20.0f, 65, 10, 143, 20, 0, new float[] { 40.0f, 11.0f, 6.0f, 9.0f, 65.0f, 12.0f });
        this.bodyModel[0].rotateAngleX = 3.1415927f;
        this.bodyModel[0].rotateAngleZ = 3.1415927f;
        this.bodyModel[0].setRotationPoint(-50.0f, 0.0f, -10.0f);
        this.bodyModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(70.0, 0.0, 70, 0), new Coord2D(70.0, 2.0, 70, 2), new Coord2D(0.0, 2.0, 0, 2) }), 22.0f, 70, 2, 144, 22, 0, new float[] { 2.0f, 70.0f, 2.0f, 70.0f });
        this.bodyModel[1].rotateAngleX = 3.1415927f;
        this.bodyModel[1].rotateAngleZ = 3.1415927f;
        this.bodyModel[1].setRotationPoint(-50.0f, -10.0f, -11.0f);
        this.bodyModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(65.0, 0.0, 65, 0), new Coord2D(70.0, 13.0, 70, 13), new Coord2D(30.0, 11.0, 30, 11), new Coord2D(20.0, 9.0, 20, 9), new Coord2D(10.0, 7.0, 10, 7), new Coord2D(5.0, 5.0, 5, 5) }), 20.0f, 70, 13, 156, 20, 0, new float[] { 8.0f, 6.0f, 11.0f, 11.0f, 41.0f, 14.0f, 65.0f });
        this.bodyModel[2].rotateAngleX = 3.1415927f;
        this.bodyModel[2].rotateAngleZ = 3.1415927f;
        this.bodyModel[2].setRotationPoint(-50.0f, -12.0f, -10.0f);
        this.bodyModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(10.0, 25.0, 10, 25), new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(40.0, 23.0, 40, 23) }), 20.0f, 40, 25, 121, 20, 0, new float[] { 31.0f, 23.0f, 40.0f, 27.0f });
        this.bodyModel[3].rotateAngleX = 3.1415927f;
        this.bodyModel[3].rotateAngleZ = 3.1415927f;
        this.bodyModel[3].setRotationPoint(10.0f, 0.0f, -10.0f);
        this.bodyModel[4].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 28.0, 0, 28), new Coord2D(0.0, 5.0, 0, 5), new Coord2D(15.0, 5.0, 15, 5), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(30.0, 0.0, 30, 0), new Coord2D(35.0, 5.0, 35, 5), new Coord2D(40.0, 5.0, 40, 5), new Coord2D(40.0, 28.0, 40, 28), new Coord2D(30.0, 33.0, 30, 33), new Coord2D(20.0, 33.0, 20, 33) }), 26.0f, 40, 33, 114, 26, 0, new float[] { 0.0f, 10.0f, 12.0f, 23.0f, 5.0f, 8.0f, 10.0f, 8.0f, 15.0f, 23.0f });
        this.bodyModel[4].rotateAngleX = 3.1415927f;
        this.bodyModel[4].rotateAngleZ = 3.1415927f;
        this.bodyModel[4].setRotationPoint(50.0f, 5.0f, -13.0f);
        this.bodyModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 9.0, 0, 9), new Coord2D(2.0, 4.0, 2, 4), new Coord2D(15.0, 0.0, 15, 0), new Coord2D(50.0, 0.0, 50, 0), new Coord2D(45.0, 4.0, 45, 4), new Coord2D(45.0, 9.0, 45, 9), new Coord2D(0.0, 9.0, 0, 9) }), 20.0f, 50, 9, 112, 20, 0, new float[] { 0.0f, 45.0f, 5.0f, 7.0f, 35.0f, 14.0f, 6.0f });
        this.bodyModel[5].rotateAngleX = 3.1415927f;
        this.bodyModel[5].rotateAngleZ = 3.1415927f;
        this.bodyModel[5].setRotationPoint(20.0f, 0.0f, -30.0f);
        this.bodyModel[6].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 20.0, 0, 20), new Coord2D(15.0, 10.0, 15, 10), new Coord2D(25.0, 0.0, 25, 0), new Coord2D(50.0, 0.0, 50, 0), new Coord2D(50.0, 20.0, 50, 20) }), 5.0f, 50, 20, 129, 5, 0, new float[] { 50.0f, 20.0f, 25.0f, 15.0f, 19.0f });
        this.bodyModel[6].rotateAngleX = 4.712389f;
        this.bodyModel[6].rotateAngleZ = 3.1415927f;
        this.bodyModel[6].setRotationPoint(15.0f, -13.0f, -30.0f);
        this.bodyModel[7].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(45.0, 0.0, 45, 0), new Coord2D(46.0, 1.0, 46, 1), new Coord2D(47.0, 3.0, 47, 3), new Coord2D(49.0, 5.0, 49, 5), new Coord2D(50.0, 10.0, 50, 10), new Coord2D(45.0, 15.0, 45, 15), new Coord2D(20.0, 10.0, 20, 10), new Coord2D(5.0, 5.0, 5, 5) }), 20.0f, 50, 18, 120, 20, 0, new float[] { 8.0f, 16.0f, 27.0f, 10.0f, 6.0f, 3.0f, 3.0f, 2.0f, 45.0f });
        this.bodyModel[7].rotateAngleZ = 3.1415927f;
        this.bodyModel[7].rotateAngleX = 3.1415927f;
        this.bodyModel[7].setRotationPoint(20.0f, -13.0f, -30.0f);
        this.bodyModel[8].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(6.0, 0.0, 6, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(30.0, 6.0, 30, 6), new Coord2D(30.0, 20.0, 30, 20), new Coord2D(20.0, 26.0, 20, 26), new Coord2D(6.0, 26.0, 6, 26), new Coord2D(0.0, 20.0, 0, 20), new Coord2D(0.0, 6.0, 0, 6) }), 25.0f, 30, 26, 98, 25, 0, new float[] { 9.0f, 14.0f, 9.0f, 14.0f, 12.0f, 14.0f, 12.0f, 14.0f });
        this.bodyModel[8].rotateAngleX = 3.1415927f;
        this.bodyModel[8].rotateAngleZ = 3.1415927f;
        this.bodyModel[8].setRotationPoint(70.0f, 0.0f, -34.0f);
        this.bodyModel[9].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(6.0, 0.0, 6, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(20.0, 6.0, 20, 6), new Coord2D(20.0, 14.0, 20, 14), new Coord2D(14.0, 20.0, 14, 20), new Coord2D(6.0, 20.0, 6, 20), new Coord2D(0.0, 14.0, 0, 14), new Coord2D(0.0, 6.0, 0, 6) }), 2.0f, 20, 20, 68, 2, 0, new float[] { 9.0f, 8.0f, 9.0f, 8.0f, 9.0f, 8.0f, 9.0f, 8.0f });
        this.bodyModel[9].rotateAngleX = 3.1415927f;
        this.bodyModel[9].rotateAngleZ = 3.1415927f;
        this.bodyModel[9].setRotationPoint(75.0f, -2.0f, -36.0f);
        this.bodyModel[10].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 9.0, 0, 9), new Coord2D(2.0, 4.0, 2, 4), new Coord2D(15.0, 0.0, 15, 0), new Coord2D(50.0, 0.0, 50, 0), new Coord2D(45.0, 4.0, 45, 4), new Coord2D(45.0, 9.0, 45, 9), new Coord2D(0.0, 9.0, 0, 9) }), 20.0f, 50, 9, 112, 20, 0, new float[] { 0.0f, 45.0f, 5.0f, 7.0f, 35.0f, 14.0f, 6.0f });
        this.bodyModel[10].rotateAngleX = 3.1415927f;
        this.bodyModel[10].rotateAngleZ = 3.1415927f;
        this.bodyModel[10].setRotationPoint(20.0f, 0.0f, 10.0f);
        this.bodyModel[11].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 20.0, 0, 20), new Coord2D(15.0, 10.0, 15, 10), new Coord2D(25.0, 0.0, 25, 0), new Coord2D(50.0, 0.0, 50, 0), new Coord2D(50.0, 20.0, 50, 20) }), 5.0f, 50, 20, 129, 5, 0, new float[] { 50.0f, 20.0f, 25.0f, 15.0f, 19.0f });
        this.bodyModel[11].rotateAngleX = -4.712389f;
        this.bodyModel[11].rotateAngleZ = 3.1415927f;
        this.bodyModel[11].setRotationPoint(15.0f, -8.0f, 30.0f);
        this.bodyModel[12].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(45.0, 0.0, 45, 0), new Coord2D(46.0, 1.0, 46, 1), new Coord2D(47.0, 3.0, 47, 3), new Coord2D(49.0, 5.0, 49, 5), new Coord2D(50.0, 10.0, 50, 10), new Coord2D(45.0, 15.0, 45, 15), new Coord2D(20.0, 10.0, 20, 10), new Coord2D(5.0, 5.0, 5, 5) }), 20.0f, 50, 18, 120, 20, 0, new float[] { 8.0f, 16.0f, 27.0f, 10.0f, 6.0f, 3.0f, 3.0f, 2.0f, 45.0f });
        this.bodyModel[12].rotateAngleZ = 3.1415927f;
        this.bodyModel[12].rotateAngleX = 3.1415927f;
        this.bodyModel[12].setRotationPoint(20.0f, -13.0f, 10.0f);
        this.bodyModel[13].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(6.0, 0.0, 6, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(30.0, 6.0, 30, 6), new Coord2D(30.0, 20.0, 30, 20), new Coord2D(20.0, 26.0, 20, 26), new Coord2D(6.0, 26.0, 6, 26), new Coord2D(0.0, 20.0, 0, 20), new Coord2D(0.0, 6.0, 0, 6) }), 25.0f, 30, 26, 98, 25, 0, new float[] { 9.0f, 14.0f, 9.0f, 14.0f, 12.0f, 14.0f, 12.0f, 14.0f });
        this.bodyModel[13].rotateAngleX = 3.1415927f;
        this.bodyModel[13].rotateAngleZ = 3.1415927f;
        this.bodyModel[13].setRotationPoint(70.0f, 0.0f, 10.0f);
        this.bodyModel[14].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(6.0, 0.0, 6, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(20.0, 6.0, 20, 6), new Coord2D(20.0, 14.0, 20, 14), new Coord2D(14.0, 20.0, 14, 20), new Coord2D(6.0, 20.0, 6, 20), new Coord2D(0.0, 14.0, 0, 14), new Coord2D(0.0, 6.0, 0, 6) }), 2.0f, 20, 20, 68, 2, 0, new float[] { 9.0f, 8.0f, 9.0f, 8.0f, 9.0f, 8.0f, 9.0f, 8.0f });
        this.bodyModel[14].rotateAngleX = 3.1415927f;
        this.bodyModel[14].rotateAngleZ = 3.1415927f;
        this.bodyModel[14].setRotationPoint(75.0f, -2.0f, 35.0f);
        this.bodyModel[15].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(22.0, 0.0, 22, 0), new Coord2D(21.0, 1.0, 21, 1), new Coord2D(1.0, 1.0, 1, 1), new Coord2D(0.0, 0.0, 0, 0) }), 2.0f, 22, 1, 46, 2, 0, new float[] { 0.0f, 2.0f, 20.0f, 2.0f, 22.0f });
        this.bodyModel[15].rotateAngleX = 1.5707963f;
        this.bodyModel[15].rotateAngleY = 4.712389f;
        this.bodyModel[15].setRotationPoint(-50.0f, -12.0f, -11.0f);
        this.bodyModel[16].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(30.0, 32.0, 30, 32), new Coord2D(20.0, 32.0, 20, 32) }), 2.0f, 30, 32, 102, 2, 0, new float[] { 38.0f, 10.0f, 34.0f, 20.0f });
        this.bodyModel[16].rotateAngleZ = 3.1415927f;
        this.bodyModel[16].rotateAngleX = 0.5235988f;
        this.bodyModel[16].setRotationPoint(100.0f, 0.0f, -23.0f);
        this.bodyModel[17].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(30.0, 32.0, 30, 32), new Coord2D(20.0, 32.0, 20, 32) }), 2.0f, 30, 32, 102, 2, 0, new float[] { 38.0f, 10.0f, 34.0f, 20.0f });
        this.bodyModel[17].rotateAngleZ = 3.1415927f;
        this.bodyModel[17].rotateAngleX = -0.5235988f;
        this.bodyModel[17].setRotationPoint(100.0f, -1.0f, 23.0f);
        this.bodyModel[18].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(25.0, 0.0, 25, 0), new Coord2D(35.0, 57.0, 35, 57), new Coord2D(25.0, 55.0, 25, 55) }), 2.0f, 35, 57, 155, 2, 0, new float[] { 61.0f, 11.0f, 58.0f, 25.0f });
        this.bodyModel[18].rotateAngleY = 3.1415927f;
        this.bodyModel[18].setRotationPoint(100.0f, -23.0f, -1.0f);
        this.bodyModel[19].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(6.0, 0.0, 6, 0), new Coord2D(54.0, 0.0, 54, 0), new Coord2D(60.0, 6.0, 60, 6), new Coord2D(60.0, 14.0, 60, 14), new Coord2D(54.0, 23.0, 54, 23), new Coord2D(6.0, 23.0, 6, 23), new Coord2D(0.0, 14.0, 0, 14), new Coord2D(0.0, 6.0, 0, 6) }), 30.0f, 60, 23, 152, 30, 0, new float[] { 9.0f, 8.0f, 11.0f, 48.0f, 11.0f, 8.0f, 9.0f, 48.0f });
        this.bodyModel[19].rotateAngleY = 1.5707963f;
        this.bodyModel[19].setRotationPoint(85.0f, 0.0f, 30.0f);
        this.bodyModel[20].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(6.0, 0.0, 6, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(20.0, 6.0, 20, 6), new Coord2D(20.0, 14.0, 20, 14), new Coord2D(14.0, 20.0, 14, 20), new Coord2D(6.0, 20.0, 6, 20), new Coord2D(0.0, 14.0, 0, 14), new Coord2D(0.0, 6.0, 0, 6) }), 10.0f, 20, 20, 68, 10, 0, new float[] { 9.0f, 8.0f, 9.0f, 8.0f, 9.0f, 8.0f, 9.0f, 8.0f });
        this.bodyModel[20].rotateAngleY = 1.5707963f;
        this.bodyModel[20].setRotationPoint(115.0f, 0.0f, 25.0f);
        this.bodyModel[21].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(6.0, 0.0, 6, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(20.0, 6.0, 20, 6), new Coord2D(20.0, 14.0, 20, 14), new Coord2D(14.0, 20.0, 14, 20), new Coord2D(6.0, 20.0, 6, 20), new Coord2D(0.0, 14.0, 0, 14), new Coord2D(0.0, 6.0, 0, 6) }), 10.0f, 20, 20, 68, 10, 0, new float[] { 9.0f, 8.0f, 9.0f, 8.0f, 9.0f, 8.0f, 9.0f, 8.0f });
        this.bodyModel[21].rotateAngleY = 1.5707963f;
        this.bodyModel[21].setRotationPoint(115.0f, 0.0f, -6.0f);
        this.propellerModels = new ModelRendererTurbo[1][1];
        (this.propellerModels[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.propellerModels[0][0].setRotationPoint(65.0f, -23.0f, -1.0f);
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
        return prop;
    }
}
