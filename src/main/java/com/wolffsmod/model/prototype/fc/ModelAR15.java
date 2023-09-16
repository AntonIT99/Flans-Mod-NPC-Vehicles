//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.prototype.fc;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelAR15 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    boolean VarGear;
    boolean VarDoor;
    boolean VarWing;
    
    public ModelAR15() {
        this.textureX = 512;
        this.textureY = 512;
        this.VarGear = true;
        this.VarDoor = true;
        this.VarWing = true;
        (this.bodyModel = new ModelRendererTurbo[40])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 53, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 78, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 105, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 141, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 157, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 165, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 175, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 200, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 212, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 225, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 230, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 225, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 230, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 18, 216, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 216, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 95, 0, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 95, 50, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 95, 75, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 95, 95, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 95, 115, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 95, 75, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 95, 140, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 95, 75, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 95, 95, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 95, 165, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 95, 75, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 95, 190, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 95, 230, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 95, 270, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 95, 320, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 95, 360, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 95, 405, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 95, 445, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 95, 445, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 170, 445, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 170, 370, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 200, 270, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 200, 270, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 270, 270, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 16, 32, 16, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -20.0f, -8.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 20, 4, 16, 0.0f);
        this.bodyModel[1].setRotationPoint(-20.0f, 8.0f, -8.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 11, 4, 10, 0.0f);
        this.bodyModel[2].setRotationPoint(-11.0f, 4.0f, -5.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 4, 16, 10, 0.0f);
        this.bodyModel[3].setRotationPoint(-2.0f, -11.0f, -5.0f);
        this.bodyModel[3].rotateAngleZ = -0.1396263f;
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 4, 5, 6, 0.0f);
        this.bodyModel[4].setRotationPoint(-2.0f, -15.0f, -3.0f);
        this.bodyModel[4].rotateAngleZ = -0.1396263f;
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 14, 2, 2, 0.0f);
        this.bodyModel[5].setRotationPoint(-13.0f, -3.0f, 5.0f);
        this.bodyModel[5].rotateAngleZ = 0.1745329f;
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 14, 2, 2, 0.0f);
        this.bodyModel[6].setRotationPoint(-13.0f, -3.0f, -7.0f);
        this.bodyModel[6].rotateAngleZ = 0.1745329f;
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 3, 10, 10, 0.0f);
        this.bodyModel[7].setRotationPoint(-20.0f, 0.0f, -5.0f);
        this.bodyModel[7].rotateAngleZ = 0.3490658f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 2, 7, 4, 0.0f);
        this.bodyModel[8].setRotationPoint(-16.0f, 2.0f, -2.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f);
        this.bodyModel[9].setRotationPoint(-16.0f, 1.0f, -1.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 22, 1, 0, 0.0f);
        this.bodyModel[10].setRotationPoint(-19.0f, -7.0f, -7.0f);
        this.bodyModel[10].rotateAngleZ = 0.5061455f;
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 15, 1, 0, 0.0f);
        this.bodyModel[11].setRotationPoint(-20.0f, 8.0f, -7.0f);
        this.bodyModel[11].rotateAngleZ = 1.518436f;
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 22, 1, 0, 0.0f);
        this.bodyModel[12].setRotationPoint(-19.0f, -7.0f, 7.0f);
        this.bodyModel[12].rotateAngleZ = 0.5061455f;
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 15, 1, 0, 0.0f);
        this.bodyModel[13].setRotationPoint(-20.0f, 8.0f, 7.0f);
        this.bodyModel[13].rotateAngleZ = 1.518436f;
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.bodyModel[14].setRotationPoint(-19.0f, -2.0f, -0.5f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 1, 3, 4, 0.0f);
        this.bodyModel[15].setRotationPoint(-19.0f, -4.0f, -2.0f);
        this.bodyModel[16].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(26.0, 5.0, 26, 5), new Coord2D(28.0, 10.0, 28, 10), new Coord2D(29.0, 15.0, 29, 15), new Coord2D(27.0, 20.0, 27, 20), new Coord2D(22.0, 25.0, 22, 25), new Coord2D(17.0, 29.0, 17, 29), new Coord2D(0.0, 32.0, 0, 32) }), 16.0f, 29, 32, 111, 16, 0, new float[] { 32.0f, 18.0f, 7.0f, 8.0f, 6.0f, 6.0f, 6.0f, 8.0f, 20.0f });
        this.bodyModel[16].setRotationPoint(0.0f, 12.0f, 8.0f);
        this.bodyModel[17].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(35.0, 2.0, 35, 2), new Coord2D(40.0, 5.0, 40, 5), new Coord2D(85.0, 5.0, 85, 5), new Coord2D(85.0, 6.0, 85, 6), new Coord2D(0.0, 6.0, 0, 6) }), 16.0f, 85, 6, 179, 16, 0, new float[] { 6.0f, 85.0f, 1.0f, 45.0f, 6.0f, 36.0f });
        this.bodyModel[17].setRotationPoint(0.0f, 8.0f, -8.0f);
        this.bodyModel[18].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(16.0, 0.0, 16, 0), new Coord2D(16.0, 16.0, 16, 16) }), 1.0f, 16, 16, 55, 1, 0, new float[] { 23.0f, 16.0f, 16.0f });
        this.bodyModel[18].rotateAngleX = -1.5707963f;
        this.bodyModel[18].rotateAngleY = 3.1415927f;
        this.bodyModel[18].setRotationPoint(-101.0f, 3.0f, -8.0f);
        this.bodyModel[19].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(50.0, 0.0, 50, 0), new Coord2D(50.0, 2.0, 50, 2), new Coord2D(0.0, 2.0, 0, 2) }), 14.0f, 50, 2, 104, 14, 0, new float[] { 2.0f, 50.0f, 2.0f, 50.0f });
        this.bodyModel[19].setRotationPoint(0.0f, 2.0f, -8.0f);
        this.bodyModel[20].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(85.0, 0.0, 85, 0), new Coord2D(85.0, 2.0, 85, 2), new Coord2D(80.0, 2.0, 80, 2), new Coord2D(75.0, 3.0, 75, 3), new Coord2D(70.0, 3.0, 70, 3), new Coord2D(65.0, 4.0, 65, 4), new Coord2D(60.0, 4.0, 60, 4), new Coord2D(50.0, 5.0, 50, 5), new Coord2D(0.0, 5.0, 0, 5) }), 16.0f, 85, 5, 175, 16, 0, new float[] { 0.0f, 50.0f, 11.0f, 5.0f, 6.0f, 5.0f, 6.0f, 5.0f, 2.0f, 85.0f });
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, -8.0f);
        this.bodyModel[21].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(16.0, 0.0, 16, 0), new Coord2D(16.0, 16.0, 16, 16) }), 2.0f, 16, 16, 55, 2, 0, new float[] { 23.0f, 16.0f, 16.0f });
        this.bodyModel[21].rotateAngleX = -1.5707963f;
        this.bodyModel[21].rotateAngleY = 3.1415927f;
        this.bodyModel[21].setRotationPoint(-101.0f, 0.0f, -8.0f);
        this.bodyModel[22].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(35.0, 2.0, 35, 2), new Coord2D(40.0, 5.0, 40, 5), new Coord2D(85.0, 5.0, 85, 5), new Coord2D(85.0, 6.0, 85, 6), new Coord2D(0.0, 6.0, 0, 6) }), 16.0f, 85, 6, 179, 16, 0, new float[] { 6.0f, 85.0f, 1.0f, 45.0f, 6.0f, 36.0f });
        this.bodyModel[22].setRotationPoint(0.0f, 8.0f, 24.0f);
        this.bodyModel[23].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(16.0, 0.0, 16, 0), new Coord2D(16.0, 16.0, 16, 16) }), 1.0f, 16, 16, 55, 1, 0, new float[] { 23.0f, 16.0f, 16.0f });
        this.bodyModel[23].rotateAngleX = 1.5707963f;
        this.bodyModel[23].rotateAngleY = 3.1415927f;
        this.bodyModel[23].setRotationPoint(-101.0f, 2.0f, 8.0f);
        this.bodyModel[24].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(50.0, 0.0, 50, 0), new Coord2D(50.0, 2.0, 50, 2), new Coord2D(0.0, 2.0, 0, 2) }), 14.0f, 50, 2, 104, 14, 0, new float[] { 2.0f, 50.0f, 2.0f, 50.0f });
        this.bodyModel[24].setRotationPoint(0.0f, 2.0f, 22.0f);
        this.bodyModel[25].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(85.0, 0.0, 85, 0), new Coord2D(85.0, 2.0, 85, 2), new Coord2D(80.0, 2.0, 80, 2), new Coord2D(75.0, 3.0, 75, 3), new Coord2D(70.0, 3.0, 70, 3), new Coord2D(65.0, 4.0, 65, 4), new Coord2D(60.0, 4.0, 60, 4), new Coord2D(50.0, 5.0, 50, 5), new Coord2D(0.0, 5.0, 0, 5) }), 16.0f, 85, 5, 175, 16, 0, new float[] { 0.0f, 50.0f, 11.0f, 5.0f, 6.0f, 5.0f, 6.0f, 5.0f, 2.0f, 85.0f });
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 24.0f);
        this.bodyModel[26].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(16.0, 0.0, 16, 0), new Coord2D(16.0, 16.0, 16, 16) }), 2.0f, 16, 16, 55, 2, 0, new float[] { 23.0f, 16.0f, 16.0f });
        this.bodyModel[26].rotateAngleX = 1.5707963f;
        this.bodyModel[26].rotateAngleY = 3.1415927f;
        this.bodyModel[26].setRotationPoint(-101.0f, -2.0f, 8.0f);
        this.bodyModel[27].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(20.0, 13.0, 20, 13), new Coord2D(15.0, 19.0, 15, 19), new Coord2D(0.0, 24.0, 0, 24) }), 16.0f, 20, 24, 81, 16, 0, new float[] { 24.0f, 16.0f, 8.0f, 13.0f, 20.0f });
        this.bodyModel[27].setRotationPoint(20.0f, 8.0f, -8.0f);
        this.bodyModel[28].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(20.0, 13.0, 20, 13), new Coord2D(15.0, 19.0, 15, 19), new Coord2D(0.0, 24.0, 0, 24) }), 16.0f, 20, 24, 81, 16, 0, new float[] { 24.0f, 16.0f, 8.0f, 13.0f, 20.0f });
        this.bodyModel[28].setRotationPoint(20.0f, 8.0f, 24.0f);
        this.bodyModel[29].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 30.0, 4, 30), new Coord2D(0.0, 26.0, 0, 26), new Coord2D(0.0, 2.0, 0, 2), new Coord2D(4.0, 0.0, 4, 0) }), 16.0f, 4, 30, 66, 16, 0, new float[] { 30.0f, 5.0f, 26.0f, 5.0f });
        this.bodyModel[29].setRotationPoint(20.0f, 10.0f, 8.0f);
        this.bodyModel[30].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(48.0, 0.0, 48, 0), new Coord2D(40.0, 16.0, 40, 16), new Coord2D(8.0, 16.0, 8, 16) }), 24.0f, 48, 16, 116, 24, 0, new float[] { 18.0f, 32.0f, 18.0f, 48.0f });
        this.bodyModel[30].rotateAngleX = -1.5707963f;
        this.bodyModel[30].rotateAngleY = 4.712389f;
        this.bodyModel[30].setRotationPoint(20.0f, 8.0f, -24.0f);
        this.bodyModel[31].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 1.0, 1, 0), new Coord2D(16.0, 1.0, 16, 1), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(2.0, 4.0, 2, 4) }), 40.0f, 16, 4, 38, 40, 0, new float[] { 5.0f, 12.0f, 5.0f, 16.0f });
        this.bodyModel[31].rotateAngleY = -1.5707963f;
        this.bodyModel[31].setRotationPoint(76.0f, -12.0f, -8.0f);
        this.bodyModel[32].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(4.0, 0.0, 4, 0), new Coord2D(4.0, 4.0, 4, 4) }), 32.0f, 4, 4, 14, 32, 0, new float[] { 6.0f, 4.0f, 4.0f });
        this.bodyModel[32].setRotationPoint(40.0f, -6.6f, 16.0f);
        this.bodyModel[33].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(15.0, 4.0, 15, 4), new Coord2D(15.0, 11.0, 15, 11), new Coord2D(11.0, 15.0, 11, 15), new Coord2D(4.0, 15.0, 4, 15), new Coord2D(0.0, 11.0, 0, 11), new Coord2D(0.0, 4.0, 0, 4) }), 30.0f, 15, 15, 52, 30, 0, new float[] { 6.0f, 7.0f, 6.0f, 7.0f, 6.0f, 7.0f, 6.0f, 7.0f });
        this.bodyModel[33].rotateAngleY = -1.5707963f;
        this.bodyModel[33].rotateAngleZ = -0.2617994f;
        this.bodyModel[33].setRotationPoint(60.0f, 10.0f, -16.0f);
        this.bodyModel[34].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(15.0, 4.0, 15, 4), new Coord2D(15.0, 11.0, 15, 11), new Coord2D(11.0, 15.0, 11, 15), new Coord2D(4.0, 15.0, 4, 15), new Coord2D(0.0, 11.0, 0, 11), new Coord2D(0.0, 4.0, 0, 4) }), 30.0f, 15, 15, 52, 30, 0, new float[] { 6.0f, 7.0f, 6.0f, 7.0f, 6.0f, 7.0f, 6.0f, 7.0f });
        this.bodyModel[34].rotateAngleY = -1.5707963f;
        this.bodyModel[34].rotateAngleZ = -0.2617994f;
        this.bodyModel[34].setRotationPoint(60.0f, 10.0f, 1.0f);
        this.bodyModel[35].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(6.0, 8.0, 6, 8), new Coord2D(6.0, 10.0, 6, 10), new Coord2D(0.0, 10.0, 0, 10) }), 32.0f, 6, 10, 28, 32, 0, new float[] { 10.0f, 6.0f, 2.0f, 10.0f });
        this.bodyModel[35].rotateAngleY = 3.1415927f;
        this.bodyModel[35].setRotationPoint(36.0f, 8.0f, -16.0f);
        this.bodyModel[36].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(30.0, 16.0, 30, 16), new Coord2D(0.0, 32.0, 0, 32) }), 4.0f, 30, 32, 100, 4, 0, new float[] { 32.0f, 34.0f, 34.0f });
        this.bodyModel[36].rotateAngleX = 1.5707963f;
        this.bodyModel[36].rotateAngleY = 3.1415927f;
        this.bodyModel[36].setRotationPoint(36.0f, -16.0f, -16.0f);
        this.bodyModel[37].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(10.0, 20.0, 10, 20), new Coord2D(2.0, 10.0, 2, 10) }), 1.0f, 20, 20, 67, 1, 0, new float[] { 11.0f, 13.0f, 23.0f, 20.0f });
        this.bodyModel[37].rotateAngleX = 2.5481806f;
        this.bodyModel[37].setRotationPoint(76.0f, -14.0f, -7.3f);
        this.bodyModel[38].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(10.0, 20.0, 10, 20), new Coord2D(2.0, 10.0, 2, 10) }), 1.0f, 20, 20, 67, 1, 0, new float[] { 11.0f, 13.0f, 23.0f, 20.0f });
        this.bodyModel[38].rotateAngleX = -2.5481806f;
        this.bodyModel[38].setRotationPoint(76.0f, -14.0f, 6.1f);
        this.bodyModel[39].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(30.0, 0.0, 30, 0), new Coord2D(20.0, 10.0, 20, 10), new Coord2D(5.0, 20.0, 5, 20), new Coord2D(2.0, 15.0, 2, 15) }), 1.0f, 30, 20, 86, 1, 0, new float[] { 16.0f, 6.0f, 19.0f, 15.0f, 30.0f });
        this.bodyModel[39].setRotationPoint(76.0f, -16.0f, 0.5f);
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
        (this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 216, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f);
        this.yawFlapModel[0].setRotationPoint(-15.5f, -2.0f, -0.5f);
        this.pitchFlapLeftModel = new ModelRendererTurbo[0];
        this.pitchFlapRightModel = new ModelRendererTurbo[0];
        (this.pitchFlapLeftWingModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 200, 190, this.textureX, this.textureY);
        this.pitchFlapLeftWingModel[0].addShape3D(40.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(20.0, 0.0, 20, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(20.0, 35.0, 20, 35), new Coord2D(0.0, 45.0, 0, 45) }), 1.0f, 40, 45, 134, 1, 0, new float[] { 50.0f, 23.0f, 41.0f, 20.0f });
        this.pitchFlapLeftWingModel[0].rotateAngleX = 1.5707963f;
        this.pitchFlapLeftWingModel[0].setRotationPoint(0.0f, -4.0f, -24.0f);
        (this.pitchFlapRightWingModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 200, 190, this.textureX, this.textureY);
        this.pitchFlapRightWingModel[0].addShape3D(40.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(20.0, 0.0, 20, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(20.0, 35.0, 20, 35), new Coord2D(0.0, 45.0, 0, 45) }), 1.0f, 40, 45, 134, 1, 0, new float[] { 50.0f, 23.0f, 41.0f, 20.0f });
        this.pitchFlapRightWingModel[0].rotateAngleX = 4.712389f;
        this.pitchFlapRightWingModel[0].setRotationPoint(0.0f, -4.0f, 24.0f);
        this.topWingModel = new ModelRendererTurbo[0];
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
        return prop;
    }
}
