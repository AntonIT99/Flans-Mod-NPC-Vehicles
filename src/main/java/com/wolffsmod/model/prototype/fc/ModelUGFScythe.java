//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.prototype.fc;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelUGFScythe extends ModelFlanPlane
{
    int textureX;
    int textureY;
    boolean VarGear;
    boolean VarDoor;
    boolean VarWing;
    
    public ModelUGFScythe() {
        this.textureX = 512;
        this.textureY = 512;
        this.VarGear = true;
        this.VarDoor = true;
        this.VarWing = true;
        (this.bodyModel = new ModelRendererTurbo[50])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 53, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 78, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 105, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 141, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 157, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 165, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 176, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 201, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 213, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 225, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 230, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 225, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 230, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 18, 216, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 216, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 235, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 261, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 110, 0, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 115, 50, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 285, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 310, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 310, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 325, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 0, 325, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 365, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 0, 400, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 0, 425, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 0, 445, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 0, 460, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 30, 461, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 70, 120, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 165, 120, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 165, 120, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 222, 120, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 222, 175, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 57, 254, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 90, 300, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 222, 220, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 222, 220, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 222, 120, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 222, 175, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 57, 254, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 90, 300, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 222, 220, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 222, 220, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 210, 300, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 40, 375, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 40, 375, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 244, 397, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 16, 32, 16, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -29.0f, -8.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 40, 4, 16, 0.0f);
        this.bodyModel[1].setRotationPoint(-40.0f, -1.0f, -8.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 11, 4, 10, 0.0f);
        this.bodyModel[2].setRotationPoint(-11.0f, -5.0f, -5.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 4, 16, 10, 0.0f);
        this.bodyModel[3].setRotationPoint(-2.0f, -20.0f, -5.0f);
        this.bodyModel[3].rotateAngleZ = -0.1396263f;
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 4, 5, 6, 0.0f);
        this.bodyModel[4].setRotationPoint(-2.0f, -24.0f, -3.0f);
        this.bodyModel[4].rotateAngleZ = -0.1396263f;
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 14, 2, 2, 0.0f);
        this.bodyModel[5].setRotationPoint(-13.0f, -12.0f, 5.0f);
        this.bodyModel[5].rotateAngleZ = 0.1745329f;
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 14, 2, 2, 0.0f);
        this.bodyModel[6].setRotationPoint(-13.0f, -12.0f, -7.0f);
        this.bodyModel[6].rotateAngleZ = 0.1745329f;
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 6, 11, 10, 0.0f);
        this.bodyModel[7].setRotationPoint(-28.0f, -9.0f, -5.0f);
        this.bodyModel[7].rotateAngleZ = 0.3490658f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 2, 7, 4, 0.0f);
        this.bodyModel[8].setRotationPoint(-16.0f, -7.0f, -2.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f);
        this.bodyModel[9].setRotationPoint(-16.0f, -8.0f, -1.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 38, 1, 0, 0.0f);
        this.bodyModel[10].setRotationPoint(-34.8f, -15.0f, -7.9f);
        this.bodyModel[10].rotateAngleZ = 0.3839724f;
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 15, 1, 0, 0.0f);
        this.bodyModel[11].setRotationPoint(-40.0f, -1.0f, -7.9f);
        this.bodyModel[11].rotateAngleZ = 1.22173f;
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 38, 1, 0, 0.0f);
        this.bodyModel[12].setRotationPoint(-34.8f, -15.0f, 7.9f);
        this.bodyModel[12].rotateAngleZ = 0.3839724f;
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 15, 1, 0, 0.0f);
        this.bodyModel[13].setRotationPoint(-40.0f, -1.0f, 7.9f);
        this.bodyModel[13].rotateAngleZ = 1.22173f;
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f);
        this.bodyModel[14].setRotationPoint(-24.0f, -12.0f, -0.5f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 1, 4, 4, 0.0f);
        this.bodyModel[15].setRotationPoint(-24.0f, -16.0f, -2.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 7, 12, 8, 0.0f);
        this.bodyModel[16].setRotationPoint(-33.0f, -9.0f, -4.0f);
        this.bodyModel[16].rotateAngleZ = 0.1919862f;
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 4, 12, 6, 0.0f);
        this.bodyModel[17].setRotationPoint(-25.8f, -13.0f, -3.0f);
        this.bodyModel[17].rotateAngleZ = -0.4886922f;
        this.bodyModel[18].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 28.0, 0, 28), new Coord2D(0.0, 0.0, 0, 0), new Coord2D(46.0, 0.0, 46, 0), new Coord2D(35.0, 14.0, 35, 14) }), 16.0f, 46, 28, 130, 16, 0, new float[] { 38.0f, 18.0f, 46.0f, 28.0f });
        this.bodyModel[18].setRotationPoint(0.0f, -1.0f, 8.0f);
        this.bodyModel[19].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(35.0, 14.0, 35, 14), new Coord2D(46.0, 0.0, 46, 0), new Coord2D(0.0, 0.0, 0, 0), new Coord2D(0.0, 28.0, 0, 28) }), 16.0f, 46, 28, 130, 16, 0, new float[] { 38.0f, 28.0f, 46.0f, 18.0f });
        this.bodyModel[19].setRotationPoint(0.0f, -1.0f, 8.0f);
        this.bodyModel[20].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(6.0, 4.0, 6, 4), new Coord2D(0.0, 4.0, 0, 4) }), 16.0f, 6, 4, 18, 16, 0, new float[] { 4.0f, 6.0f, 8.0f });
        this.bodyModel[20].setRotationPoint(-40.0f, 3.0f, 8.0f);
        this.bodyModel[21].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 4.0, 40, 4), new Coord2D(0.0, 4.0, 0, 4) }), 4.0f, 40, 4, 85, 4, 0, new float[] { 4.0f, 40.0f, 41.0f });
        this.bodyModel[21].rotateAngleX = 1.5707963f;
        this.bodyModel[21].setRotationPoint(0.0f, -1.0f, 12.0f);
        this.bodyModel[22].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 4.0, 40, 4), new Coord2D(0.0, 4.0, 0, 4) }), 4.0f, 40, 4, 85, 4, 0, new float[] { 4.0f, 40.0f, 41.0f });
        this.bodyModel[22].rotateAngleX = 4.712389f;
        this.bodyModel[22].setRotationPoint(0.0f, 3.0f, -12.0f);
        this.bodyModel[23].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(18.0, 0.0, 18, 0), new Coord2D(18.0, 4.0, 18, 4), new Coord2D(2.0, 32.0, 2, 32), new Coord2D(0.0, 32.0, 0, 32) }), 4.0f, 18, 32, 89, 4, 0, new float[] { 32.0f, 2.0f, 33.0f, 4.0f, 18.0f });
        this.bodyModel[23].setRotationPoint(18.0f, 3.0f, -8.0f);
        this.bodyModel[24].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(18.0, 0.0, 18, 0), new Coord2D(18.0, 4.0, 18, 4), new Coord2D(2.0, 32.0, 2, 32), new Coord2D(0.0, 32.0, 0, 32) }), 4.0f, 18, 32, 89, 4, 0, new float[] { 32.0f, 2.0f, 33.0f, 4.0f, 18.0f });
        this.bodyModel[24].setRotationPoint(18.0f, 3.0f, 12.0f);
        this.bodyModel[25].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 0.0, 2, 0), new Coord2D(0.0, 4.0, 0, 4), new Coord2D(0.0, 4.0, 0, 4) }), 24.0f, 2, 4, 11, 24, 0, new float[] { 4.0f, 0.0f, 5.0f, 2.0f });
        this.bodyModel[25].setRotationPoint(18.0f, -29.0f, 12.0f);
        this.bodyModel[26].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(6.0, 0.0, 6, 0), new Coord2D(0.0, 4.0, 0, 4), new Coord2D(0.0, 4.0, 0, 4) }), 16.0f, 2, 4, 11, 16, 0, new float[] { 4.0f, 0.0f, 5.0f, 2.0f });
        this.bodyModel[26].setRotationPoint(18.0f, -29.0f, 8.0f);
        this.bodyModel[27].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(8.0, 0.0, 8, 0), new Coord2D(0.0, 4.0, 0, 4), new Coord2D(0.0, 4.0, 0, 4) }), 12.0f, 2, 4, 11, 12, 0, new float[] { 4.0f, 0.0f, 5.0f, 2.0f });
        this.bodyModel[27].setRotationPoint(18.0f, -29.0f, 6.0f);
        this.bodyModel[28].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(0.0, 4.0, 0, 4), new Coord2D(0.0, 4.0, 0, 4) }), 8.0f, 2, 4, 11, 8, 0, new float[] { 4.0f, 0.0f, 5.0f, 2.0f });
        this.bodyModel[28].setRotationPoint(18.0f, -29.0f, 4.0f);
        this.bodyModel[29].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(12.0, 0.0, 12, 0), new Coord2D(0.0, 4.0, 0, 4), new Coord2D(0.0, 4.0, 0, 4) }), 4.0f, 2, 4, 11, 4, 0, new float[] { 4.0f, 0.0f, 5.0f, 2.0f });
        this.bodyModel[29].setRotationPoint(18.0f, -29.0f, 2.0f);
        this.bodyModel[30].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(100.0, 0.0, 100, 0), new Coord2D(100.0, 26.0, 100, 26), new Coord2D(70.0, 26.0, 70, 26), new Coord2D(0.0, 26.0, 0, 26) }), 24.0f, 100, 26, 252, 24, 0, new float[] { 26.0f, 70.0f, 30.0f, 26.0f, 100.0f });
        this.bodyModel[30].setRotationPoint(116.0f, 3.0f, 12.0f);
        this.bodyModel[31].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(40.0, 10.0, 40, 10), new Coord2D(30.0, 10.0, 30, 10) }), 24.0f, 40, 10, 92, 24, 0, new float[] { 32.0f, 10.0f, 10.0f, 40.0f });
        this.bodyModel[31].setRotationPoint(58.0f, -23.0f, 12.0f);
        this.bodyModel[32].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 6.0, 2, 6), new Coord2D(2.0, 20.0, 2, 20), new Coord2D(0.0, 26.0, 0, 26) }), 100.0f, 2, 26, 54, 100, 0, new float[] { 26.0f, 7.0f, 14.0f, 7.0f });
        this.bodyModel[32].rotateAngleY = 1.5707963f;
        this.bodyModel[32].setRotationPoint(18.0f, 3.0f, -12.0f);
        this.bodyModel[33].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 6.0, 2, 6), new Coord2D(2.0, 20.0, 2, 20), new Coord2D(0.0, 26.0, 0, 26) }), 100.0f, 2, 26, 54, 100, 0, new float[] { 26.0f, 7.0f, 14.0f, 7.0f });
        this.bodyModel[33].rotateAngleY = 4.712389f;
        this.bodyModel[33].setRotationPoint(118.0f, 3.0f, 12.0f);
        this.bodyModel[34].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(60.0, 5.0, 60, 5), new Coord2D(60.0, 10.0, 60, 10), new Coord2D(0.0, 20.0, 0, 20) }), 32.0f, 60, 20, 151, 32, 3, new float[] { 20.0f, 61.0f, 10.0f, 60.0f });
        this.bodyModel[34].rotateAngleX = 0.2617994f;
        this.bodyModel[34].setRotationPoint(60.0f, -1.0f, -7.0f);
        this.bodyModel[35].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 30.0, 0, 30), new Coord2D(30.0, 0.0, 30, 0), new Coord2D(30.0, 10.0, 30, 10), new Coord2D(10.0, 30.0, 10, 30) }), 10.0f, 30, 30, 92, 10, 5, new float[] { 10.0f, 29.0f, 10.0f, 43.0f });
        this.bodyModel[35].rotateAngleX = 0.2617994f;
        this.bodyModel[35].setRotationPoint(30.0f, -5.0f, -42.0f);
        this.bodyModel[36].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(100.0, 0.0, 100, 0), new Coord2D(200.0, 5.0, 200, 5), new Coord2D(200.0, 20.0, 200, 20), new Coord2D(100.0, 35.0, 100, 35), new Coord2D(10.0, 35.0, 10, 35) }), 5.0f, 200, 35, 445, 5, 0, new float[] { 37.0f, 90.0f, 102.0f, 15.0f, 101.0f, 100.0f });
        this.bodyModel[36].rotateAngleX = 1.5707963f;
        this.bodyModel[36].setRotationPoint(126.0f, 5.0f, -63.0f);
        this.bodyModel[37].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 20.0, 0, 20), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(0.0, 35.0, 0, 35) }), 5.0f, 40, 35, 114, 5, 0, new float[] { 15.0f, 54.0f, 45.0f });
        this.bodyModel[37].rotateAngleX = 1.5707963f;
        this.bodyModel[37].setRotationPoint(-74.0f, 5.0f, -48.0f);
        this.bodyModel[38].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(20.0, 2.0, 20, 2), new Coord2D(5.0, 2.0, 5, 2) }), 4.0f, 40, 2, 82, 4, 0, new float[] { 6.0f, 15.0f, 21.0f, 40.0f });
        this.bodyModel[38].setRotationPoint(100.0f, 5.0f, -74.0f);
        this.bodyModel[39].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(20.0, 2.0, 20, 2), new Coord2D(5.0, 2.0, 5, 2) }), 4.0f, 40, 2, 82, 4, 0, new float[] { 6.0f, 15.0f, 21.0f, 40.0f });
        this.bodyModel[39].setRotationPoint(100.0f, 5.0f, -86.0f);
        this.bodyModel[40].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(60.0, 5.0, 60, 5), new Coord2D(60.0, 10.0, 60, 10), new Coord2D(0.0, 20.0, 0, 20) }), 32.0f, 60, 20, 151, 32, 2, new float[] { 20.0f, 61.0f, 10.0f, 60.0f });
        this.bodyModel[40].rotateAngleX = -0.2617994f;
        this.bodyModel[40].setRotationPoint(92.0f, -1.0f, 7.0f);
        this.bodyModel[41].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 30.0, 0, 30), new Coord2D(30.0, 0.0, 30, 0), new Coord2D(30.0, 10.0, 30, 10), new Coord2D(10.0, 30.0, 10, 30) }), 10.0f, 30, 30, 92, 10, 4, new float[] { 10.0f, 29.0f, 10.0f, 43.0f });
        this.bodyModel[41].rotateAngleX = -0.2617994f;
        this.bodyModel[41].setRotationPoint(30.0f, 4.5f, 39.0f);
        this.bodyModel[42].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(100.0, 0.0, 100, 0), new Coord2D(200.0, 5.0, 200, 5), new Coord2D(200.0, 20.0, 200, 20), new Coord2D(100.0, 35.0, 100, 35), new Coord2D(10.0, 35.0, 10, 35) }), 5.0f, 200, 35, 445, 5, 0, new float[] { 37.0f, 90.0f, 102.0f, 15.0f, 101.0f, 100.0f });
        this.bodyModel[42].rotateAngleX = -1.5707963f;
        this.bodyModel[42].setRotationPoint(126.0f, 10.0f, 63.0f);
        this.bodyModel[43].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 20.0, 0, 20), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(0.0, 35.0, 0, 35) }), 5.0f, 40, 35, 114, 5, 0, new float[] { 15.0f, 54.0f, 45.0f });
        this.bodyModel[43].rotateAngleX = -1.5707963f;
        this.bodyModel[43].setRotationPoint(-74.0f, 10.0f, 48.0f);
        this.bodyModel[44].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(20.0, 2.0, 20, 2), new Coord2D(5.0, 2.0, 5, 2) }), 4.0f, 40, 2, 82, 4, 0, new float[] { 6.0f, 15.0f, 21.0f, 40.0f });
        this.bodyModel[44].setRotationPoint(100.0f, 5.0f, 76.0f);
        this.bodyModel[45].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(20.0, 2.0, 20, 2), new Coord2D(5.0, 2.0, 5, 2) }), 4.0f, 40, 2, 82, 4, 0, new float[] { 6.0f, 15.0f, 21.0f, 40.0f });
        this.bodyModel[45].setRotationPoint(100.0f, 5.0f, 88.0f);
        this.bodyModel[46].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(60.0, 8.0, 60, 8), new Coord2D(60.0, 32.0, 60, 32), new Coord2D(0.0, 40.0, 0, 40) }), 26.0f, 40, 48, 156, 26, 0, new float[] { 48.0f, 42.0f, 24.0f, 42.0f });
        this.bodyModel[46].rotateAngleX = 1.5707963f;
        this.bodyModel[46].setRotationPoint(163.0f, -23.1f, 20.0f);
        this.bodyModel[47].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 3.0, 0, 3), new Coord2D(3.0, 0.0, 3, 0), new Coord2D(35.0, 0.0, 35, 0), new Coord2D(38.0, 3.0, 38, 3), new Coord2D(38.0, 8.0, 38, 8), new Coord2D(35.0, 11.0, 35, 11), new Coord2D(3.0, 11.0, 3, 11), new Coord2D(0.0, 8.0, 0, 8) }), 10.0f, 38, 11, 94, 10, 3, new float[] { 5.0f, 5.0f, 32.0f, 5.0f, 5.0f, 5.0f, 32.0f, 5.0f });
        this.bodyModel[47].setRotationPoint(163.0f, -11.0f, 19.0f);
        this.bodyModel[48].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 3.0, 0, 3), new Coord2D(3.0, 0.0, 3, 0), new Coord2D(35.0, 0.0, 35, 0), new Coord2D(38.0, 3.0, 38, 3), new Coord2D(38.0, 8.0, 38, 8), new Coord2D(35.0, 11.0, 35, 11), new Coord2D(3.0, 11.0, 3, 11), new Coord2D(0.0, 8.0, 0, 8) }), 10.0f, 38, 11, 94, 10, 3, new float[] { 5.0f, 5.0f, 32.0f, 5.0f, 5.0f, 5.0f, 32.0f, 5.0f });
        this.bodyModel[48].setRotationPoint(163.0f, 1.0f, 19.0f);
        this.bodyModel[49].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(15.0, 2.0, 15, 2), new Coord2D(5.0, 2.0, 5, 2) }), 22.0f, 20, 2, 42, 22, 0, new float[] { 6.0f, 10.0f, 6.0f, 20.0f });
        this.bodyModel[49].setRotationPoint(153.0f, -23.0f, 11.0f);
        if (this.VarGear) {}
        if (this.VarDoor) {}
        if (this.VarWing) {}
        this.tailModel = new ModelRendererTurbo[0];
        if (this.VarGear) {}
        if (this.VarDoor) {}
        if (this.VarWing) {}
        this.leftWingModel = new ModelRendererTurbo[0];
        if (this.VarGear) {}
        if (this.VarDoor) {}
        if (this.VarWing) {}
        this.rightWingModel = new ModelRendererTurbo[0];
        if (this.VarGear) {}
        if (this.VarDoor) {}
        if (this.VarWing) {}
        this.propellerModels = new ModelRendererTurbo[1][1];
        (this.propellerModels[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.propellerModels[0][0].setRotationPoint(65.0f, -23.0f, -1.0f);
        this.yawFlapModel = new ModelRendererTurbo[1];
        (this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 217, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -0.5f, 4, 1, 1, 0.0f);
        this.yawFlapModel[0].setRotationPoint(-15.5f, -7.0f, 0.0f);
        this.yawFlapModel[0].rotateAngleZ = 1.570796f;
        this.pitchFlapLeftModel = new ModelRendererTurbo[0];
        this.pitchFlapRightModel = new ModelRendererTurbo[0];
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
        return prop;
    }
}
