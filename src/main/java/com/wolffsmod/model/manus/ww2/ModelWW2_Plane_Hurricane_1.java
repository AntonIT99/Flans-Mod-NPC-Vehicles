//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.ww2;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelWW2_Plane_Hurricane_1 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelWW2_Plane_Hurricane_1() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[25])[0] = new ModelRendererTurbo((ModelBase)this, 55, 470, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 90, 470, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 160, 470, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 200, 470, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 250, 470, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 420, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 50, 420, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 50, 440, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 75, 440, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 75, 455, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 120, 420, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 123, 433, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 140, 435, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 190, 420, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 140, 450, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 220, 420, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 220, 440, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 240, 420, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 240, 445, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 280, 445, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 180, 340, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 180, 375, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 180, 397, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 10, 500, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 40, 500, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 4, 12, 12, 0.0f, -1.0f, 3);
        this.bodyModel[0].setRotationPoint(-38.0f, -27.0f, -6.0f);
        this.bodyModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 16, 21, 16, 0.0f, -1.0f, 3);
        this.bodyModel[1].setRotationPoint(-18.0f, -30.0f, -8.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 21, 16, 0.0f);
        this.bodyModel[2].setRotationPoint(-2.0f, -30.0f, -8.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 21, 19, 2, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, -28.0f, 6.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 21, 19, 2, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, -28.0f, -8.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 8, 27, 16, 0.0f);
        this.bodyModel[5].setRotationPoint(21.0f, -36.0f, -8.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 21, 1, 14, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, -10.0f, -7.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 8, 10, 0.0f);
        this.bodyModel[7].setRotationPoint(2.0f, -36.0f, -5.0f);
        this.bodyModel[7].rotateAngleZ = -0.6981317f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 19, 1, 10, 0.0f);
        this.bodyModel[8].setRotationPoint(2.0f, -36.0f, -5.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 19, 1, 9, 0.0f);
        this.bodyModel[9].setRotationPoint(2.0f, -36.0f, 5.0f);
        this.bodyModel[9].rotateAngleX = -1.308997f;
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 19, 9, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(2.0f, -36.0f, -5.0f);
        this.bodyModel[10].rotateAngleX = -0.2617994f;
        this.bodyModel[11].addTrapezoid(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, -0.5f, 2);
        this.bodyModel[11].setRotationPoint(3.0f, -36.0f, -0.5f);
        this.bodyModel[11].rotateAngleZ = 1.186824f;
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 12, 3, 10, 0.0f);
        this.bodyModel[12].setRotationPoint(3.0f, -13.0f, -5.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 2, 27, 10, 0.0f);
        this.bodyModel[13].setRotationPoint(19.0f, -34.0f, -5.0f);
        this.bodyModel[13].rotateAngleZ = -0.1919862f;
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 5, 9, 4, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, -19.0f, -2.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 5, 2, 6, 0.0f);
        this.bodyModel[15].setRotationPoint(-16.0f, -9.0f, -3.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 4, 1, 6, 0.0f);
        this.bodyModel[16].setRotationPoint(-14.0f, -10.0f, -3.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 12, 5, 14, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, -9.0f, -7.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 5, 7, 14, 0.0f);
        this.bodyModel[18].setRotationPoint(12.0f, -4.0f, -7.0f);
        this.bodyModel[18].rotateAngleZ = 1.884956f;
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 5, 3, 14, 0.0f);
        this.bodyModel[19].setRotationPoint(14.0f, -9.0f, -7.0f);
        this.bodyModel[20].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(10.0, 1.0, 10, 1), new Coord2D(16.0, 5.0, 16, 5), new Coord2D(16.0, 17.0, 16, 17), new Coord2D(10.0, 18.0, 10, 18), new Coord2D(0.0, 19.0, 0, 19) }), 12.0f, 16, 19, 68, 12, 0, new float[] { 19.0f, 11.0f, 7.0f, 12.0f, 8.0f, 11.0f });
        this.bodyModel[20].setRotationPoint(-18.0f, -10.0f, 6.0f);
        this.bodyModel[21].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(10.0, 1.0, 10, 1), new Coord2D(16.0, 5.0, 16, 5), new Coord2D(16.0, 17.0, 16, 17), new Coord2D(10.0, 18.0, 10, 18), new Coord2D(0.0, 19.0, 0, 19) }), 1.0f, 16, 19, 68, 1, 0, new float[] { 19.0f, 11.0f, 7.0f, 12.0f, 8.0f, 11.0f });
        this.bodyModel[21].setRotationPoint(-18.0f, -10.0f, 7.0f);
        this.bodyModel[21].rotateAngleY = 0.06253515f;
        this.bodyModel[22].addShape3D(0.0f, 0.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(10.0, 1.0, 10, 1), new Coord2D(16.0, 5.0, 16, 5), new Coord2D(16.0, 17.0, 16, 17), new Coord2D(10.0, 18.0, 10, 18), new Coord2D(0.0, 19.0, 0, 19) }), 1.0f, 16, 19, 68, 1, 0, new float[] { 19.0f, 11.0f, 7.0f, 12.0f, 8.0f, 11.0f });
        this.bodyModel[22].setRotationPoint(-18.0f, -10.0f, -8.0f);
        this.bodyModel[22].rotateAngleY = -0.06253515f;
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 12, 2, 1, 0.0f);
        this.bodyModel[23].setRotationPoint(-32.0f, -23.0f, 6.0f);
        this.bodyModel[23].rotateAngleY = 0.06253515f;
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 12, 2, 1, 0.0f);
        this.bodyModel[24].setRotationPoint(-32.0f, -23.0f, -7.0f);
        this.bodyModel[24].rotateAngleY = -0.06253515f;
        this.noseModel = new ModelRendererTurbo[1];
        (this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 10, 470, this.textureX, this.textureY)).addTrapezoid(0.0f, 0.0f, 0.0f, 10, 10, 10, 0.0f, -3.5f, 3);
        this.noseModel[0].setRotationPoint(-48.0f, -26.0f, -5.0f);
        (this.leftWingModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 130, 320, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 130, 300, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 210, 130, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 210, 220, this.textureX, this.textureY);
        this.leftWingModel[0].addShape3D(0.0f, 0.0f, -4.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(57.0, 0.0, 57, 0), new Coord2D(47.0, 5.0, 47, 5), new Coord2D(3.0, 5.0, 3, 5) }), 4.0f, 57, 5, 119, 4, 0, new float[] { 6.0f, 44.0f, 12.0f, 57.0f });
        this.leftWingModel[0].rotateAngleX = 1.5707964f;
        this.leftWingModel[0].rotateAngleY = 3.1415927f;
        this.leftWingModel[0].setRotationPoint(-16.0f, -10.0f, 6.0f);
        this.leftWingModel[1].addShape3D(0.0f, 0.0f, -4.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(44.0, 0.0, 44, 0), new Coord2D(40.0, 9.0, 40, 9), new Coord2D(0.0, 9.0, 0, 9) }), 4.0f, 44, 9, 103, 4, 0, new float[] { 9.0f, 40.0f, 10.0f, 44.0f });
        this.leftWingModel[1].rotateAngleX = 1.5707964f;
        this.leftWingModel[1].rotateAngleY = 3.1415927f;
        this.leftWingModel[1].setRotationPoint(-13.0f, -10.0f, 11.0f);
        this.leftWingModel[2].addShape3D(0.0f, 0.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(30.0, 58.0, 30, 58), new Coord2D(27.0, 67.0, 27, 67), new Coord2D(23.0, 72.0, 23, 72), new Coord2D(18.0, 75.0, 18, 75), new Coord2D(14.0, 75.0, 14, 75), new Coord2D(9.0, 73.0, 9, 73), new Coord2D(7.0, 68.0, 7, 68) }), 2.0f, 40, 75, 207, 2, 0, new float[] { 69.0f, 6.0f, 6.0f, 4.0f, 6.0f, 7.0f, 10.0f, 59.0f, 40.0f });
        this.leftWingModel[2].rotateAngleX = 1.553343f;
        this.leftWingModel[2].rotateAngleY = 3.1415927f;
        this.leftWingModel[2].setRotationPoint(-13.0f, -12.0f, 20.0f);
        this.leftWingModel[3].addShape3D(0.0f, 0.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(30.0, 58.0, 30, 58), new Coord2D(27.0, 67.0, 27, 67), new Coord2D(23.0, 72.0, 23, 72), new Coord2D(18.0, 75.0, 18, 75), new Coord2D(14.0, 75.0, 14, 75), new Coord2D(9.0, 73.0, 9, 73), new Coord2D(7.0, 68.0, 7, 68) }), 2.0f, 40, 75, 207, 2, 0, new float[] { 69.0f, 6.0f, 6.0f, 4.0f, 6.0f, 7.0f, 10.0f, 59.0f, 40.0f });
        this.leftWingModel[3].rotateAngleX = 1.5271631f;
        this.leftWingModel[3].rotateAngleY = 3.1415927f;
        this.leftWingModel[3].setRotationPoint(-13.0f, -10.0f, 20.0f);
        (this.rightWingModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 0, 320, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 300, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 130, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 220, this.textureX, this.textureY);
        this.rightWingModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(57.0, 0.0, 57, 0), new Coord2D(47.0, 5.0, 47, 5), new Coord2D(3.0, 5.0, 3, 5) }), 4.0f, 57, 5, 119, 4, 0, new float[] { 6.0f, 44.0f, 12.0f, 57.0f });
        this.rightWingModel[0].rotateAngleX = 4.712389f;
        this.rightWingModel[0].rotateAngleY = 3.1415927f;
        this.rightWingModel[0].setRotationPoint(-16.0f, -10.0f, -6.0f);
        this.rightWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(44.0, 0.0, 44, 0), new Coord2D(40.0, 9.0, 40, 9), new Coord2D(0.0, 9.0, 0, 9) }), 4.0f, 44, 9, 103, 4, 0, new float[] { 9.0f, 40.0f, 10.0f, 44.0f });
        this.rightWingModel[1].rotateAngleX = 4.712389f;
        this.rightWingModel[1].rotateAngleY = 3.1415927f;
        this.rightWingModel[1].setRotationPoint(-13.0f, -10.0f, -11.0f);
        this.rightWingModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(30.0, 58.0, 30, 58), new Coord2D(27.0, 67.0, 27, 67), new Coord2D(23.0, 72.0, 23, 72), new Coord2D(18.0, 75.0, 18, 75), new Coord2D(14.0, 75.0, 14, 75), new Coord2D(9.0, 73.0, 9, 73), new Coord2D(7.0, 68.0, 7, 68) }), 2.0f, 40, 75, 207, 2, 0, new float[] { 69.0f, 6.0f, 6.0f, 4.0f, 6.0f, 7.0f, 10.0f, 59.0f, 40.0f });
        this.rightWingModel[2].rotateAngleX = 4.729842f;
        this.rightWingModel[2].rotateAngleY = 3.1415927f;
        this.rightWingModel[2].setRotationPoint(-13.0f, -12.0f, -20.0f);
        this.rightWingModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(30.0, 58.0, 30, 58), new Coord2D(27.0, 67.0, 27, 67), new Coord2D(23.0, 72.0, 23, 72), new Coord2D(18.0, 75.0, 18, 75), new Coord2D(14.0, 75.0, 14, 75), new Coord2D(9.0, 73.0, 9, 73), new Coord2D(7.0, 68.0, 7, 68) }), 2.0f, 40, 75, 207, 2, 0, new float[] { 69.0f, 6.0f, 6.0f, 4.0f, 6.0f, 7.0f, 10.0f, 59.0f, 40.0f });
        this.rightWingModel[3].rotateAngleX = 4.756022f;
        this.rightWingModel[3].rotateAngleY = 3.1415927f;
        this.rightWingModel[3].setRotationPoint(-13.0f, -10.0f, -20.0f);
        (this.tailModel = new ModelRendererTurbo[15])[0] = new ModelRendererTurbo((ModelBase)this, 220, 450, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 230, 450, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo((ModelBase)this, 250, 340, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo((ModelBase)this, 420, 220, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo((ModelBase)this, 420, 250, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo((ModelBase)this, 320, 300, this.textureX, this.textureY);
        this.tailModel[14] = new ModelRendererTurbo((ModelBase)this, 320, 320, this.textureX, this.textureY);
        this.tailModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 8, 2, 0.0f);
        this.tailModel[0].setRotationPoint(76.0f, -15.0f, -1.0f);
        this.tailModel[0].rotateAngleZ = 0.3490658f;
        this.tailModel[1].addBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f);
        this.tailModel[1].setRotationPoint(77.0f, -10.0f, -0.5f);
        this.tailModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(42.0, 2.0, 42, 2), new Coord2D(65.0, 6.0, 65, 6), new Coord2D(65.0, 15.0, 65, 15), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 65, 27, 170, 2, 0, new float[] { 27.0f, 67.0f, 9.0f, 24.0f, 43.0f });
        this.tailModel[2].setRotationPoint(29.0f, -9.0f, -8.0f);
        this.tailModel[2].rotateAngleY = 3.2494888f;
        this.tailModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(42.0, 2.0, 42, 2), new Coord2D(65.0, 6.0, 65, 6), new Coord2D(65.0, 15.0, 65, 15), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 65, 27, 170, 2, 0, new float[] { 27.0f, 67.0f, 9.0f, 24.0f, 43.0f });
        this.tailModel[3].setRotationPoint(29.0f, -9.0f, -6.0f);
        this.tailModel[3].rotateAngleY = 3.2185967f;
        this.tailModel[4].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(42.0, 2.0, 42, 2), new Coord2D(65.0, 6.0, 65, 6), new Coord2D(65.0, 15.0, 65, 15), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 65, 27, 170, 2, 0, new float[] { 27.0f, 67.0f, 9.0f, 24.0f, 43.0f });
        this.tailModel[4].setRotationPoint(29.0f, -9.0f, -4.0f);
        this.tailModel[4].rotateAngleY = 3.1877565f;
        this.tailModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(42.0, 2.0, 42, 2), new Coord2D(65.0, 6.0, 65, 6), new Coord2D(65.0, 15.0, 65, 15), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 65, 27, 170, 2, 0, new float[] { 27.0f, 67.0f, 9.0f, 24.0f, 43.0f });
        this.tailModel[5].setRotationPoint(29.0f, -9.0f, -2.0f);
        this.tailModel[5].rotateAngleY = 3.1569865f;
        this.tailModel[6].addShape3D(0.0f, 0.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(42.0, 2.0, 42, 2), new Coord2D(65.0, 6.0, 65, 6), new Coord2D(65.0, 15.0, 65, 15), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 65, 27, 170, 2, 0, new float[] { 27.0f, 67.0f, 9.0f, 24.0f, 43.0f });
        this.tailModel[6].setRotationPoint(29.0f, -9.0f, 8.0f);
        this.tailModel[6].rotateAngleY = 3.0336964f;
        this.tailModel[7].addShape3D(0.0f, 0.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(42.0, 2.0, 42, 2), new Coord2D(65.0, 6.0, 65, 6), new Coord2D(65.0, 15.0, 65, 15), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 65, 27, 170, 2, 0, new float[] { 27.0f, 67.0f, 9.0f, 24.0f, 43.0f });
        this.tailModel[7].setRotationPoint(29.0f, -9.0f, 6.0f);
        this.tailModel[7].rotateAngleY = 3.0645888f;
        this.tailModel[8].addShape3D(0.0f, 0.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(42.0, 2.0, 42, 2), new Coord2D(65.0, 6.0, 65, 6), new Coord2D(65.0, 15.0, 65, 15), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 65, 27, 170, 2, 0, new float[] { 27.0f, 67.0f, 9.0f, 24.0f, 43.0f });
        this.tailModel[8].setRotationPoint(29.0f, -9.0f, 4.0f);
        this.tailModel[8].rotateAngleY = 3.0954287f;
        this.tailModel[9].addShape3D(0.0f, 0.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(42.0, 2.0, 42, 2), new Coord2D(65.0, 6.0, 65, 6), new Coord2D(65.0, 15.0, 65, 15), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 65, 27, 170, 2, 0, new float[] { 27.0f, 67.0f, 9.0f, 24.0f, 43.0f });
        this.tailModel[9].setRotationPoint(29.0f, -9.0f, 2.0f);
        this.tailModel[9].rotateAngleY = 3.1261988f;
        this.tailModel[10].addShape3D(0.0f, 0.0f, -1.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(17.0, 0.0, 17, 0), new Coord2D(28.0, 2.0, 28, 2), new Coord2D(28.0, 33.0, 28, 33), new Coord2D(24.0, 34.0, 24, 34), new Coord2D(15.0, 27.0, 15, 27) }), 2.0f, 28, 34, 108, 2, 0, new float[] { 31.0f, 12.0f, 5.0f, 31.0f, 12.0f, 17.0f });
        this.tailModel[10].setRotationPoint(66.0f, -11.0f, 0.0f);
        this.tailModel[10].rotateAngleY = 3.1415927f;
        this.tailModel[11].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(13.0, 0.0, 13, 0), new Coord2D(13.0, 21.0, 13, 21), new Coord2D(4.0, 21.0, 4, 21) }), 1.0f, 13, 21, 65, 1, 0, new float[] { 22.0f, 9.0f, 21.0f, 13.0f });
        this.tailModel[11].rotateAngleX = 4.712389f;
        this.tailModel[11].rotateAngleY = 3.1415927f;
        this.tailModel[11].setRotationPoint(78.0f, -26.0f, -1.0f);
        this.tailModel[12].addShape3D(0.0f, 0.0f, -1.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(13.0, 0.0, 13, 0), new Coord2D(13.0, 21.0, 13, 21), new Coord2D(4.0, 21.0, 4, 21) }), 1.0f, 13, 21, 65, 1, 0, new float[] { 22.0f, 9.0f, 21.0f, 13.0f });
        this.tailModel[12].rotateAngleX = 1.5707964f;
        this.tailModel[12].rotateAngleY = 3.1415927f;
        this.tailModel[12].setRotationPoint(78.0f, -26.0f, 1.0f);
        this.tailModel[13].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(6.0, 0.0, 6, 0), new Coord2D(6.0, 5.0, 6, 5), new Coord2D(3.0, 4.0, 3, 4) }), 1.0f, 6, 5, 20, 1, 0, new float[] { 5.0f, 4.0f, 5.0f, 6.0f });
        this.tailModel[13].rotateAngleX = 4.712389f;
        this.tailModel[13].rotateAngleY = 3.1415927f;
        this.tailModel[13].setRotationPoint(82.0f, -26.0f, -22.0f);
        this.tailModel[14].addShape3D(0.0f, 0.0f, -1.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(6.0, 0.0, 6, 0), new Coord2D(6.0, 5.0, 6, 5), new Coord2D(3.0, 4.0, 3, 4) }), 1.0f, 6, 5, 20, 1, 0, new float[] { 5.0f, 4.0f, 5.0f, 6.0f });
        this.tailModel[14].rotateAngleX = 1.5707964f;
        this.tailModel[14].rotateAngleY = 3.1415927f;
        this.tailModel[14].setRotationPoint(82.0f, -26.0f, 22.0f);
        (this.propellerModels = new ModelRendererTurbo[1][3])[0] = this.makeProp1(-38, -21, 0);
        (this.yawFlapModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 160, 460, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 320, 220, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo((ModelBase)this, 320, 260, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0f, 0.0f, 0.0f, 5, 2, 1, 0.0f);
        this.yawFlapModel[0].setRotationPoint(4.0f, -19.0f, 0.5f);
        this.yawFlapModel[0].rotateAngleX = -3.1415927f;
        this.yawFlapModel[0].rotateAngleZ = 1.5707964f;
        this.yawFlapModel[1].addShape3D(11.0f, 0.0f, -1.0f, new Shape2D(new Coord2D[] { new Coord2D(11.0, 34.0, 11, 34), new Coord2D(7.0, 34.0, 7, 34), new Coord2D(4.0, 31.0, 4, 31), new Coord2D(2.0, 26.0, 2, 26), new Coord2D(0.0, 18.0, 0, 18), new Coord2D(0.0, 5.0, 0, 5), new Coord2D(2.0, 2.0, 2, 2), new Coord2D(11.0, 0.0, 11, 0) }), 2.0f, 11, 34, 85, 2, 0, new float[] { 34.0f, 10.0f, 4.0f, 13.0f, 9.0f, 6.0f, 5.0f, 4.0f });
        this.yawFlapModel[1].setRotationPoint(94.0f, -13.0f, 0.0f);
        this.yawFlapModel[1].rotateAngleY = 3.1415927f;
        this.yawFlapModel[2].addShape3D(0.0f, 31.0f, -1.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 3.0, 0, 3), new Coord2D(0.0, 0.0, 0, 0), new Coord2D(4.0, 1.0, 4, 1) }), 2.0f, 4, 3, 13, 2, 0, new float[] { 5.0f, 5.0f, 3.0f });
        this.yawFlapModel[2].setRotationPoint(94.0f, -13.0f, 0.0f);
        this.yawFlapModel[2].rotateAngleY = 3.1415927f;
        (this.pitchFlapLeftModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 420, 280, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo((ModelBase)this, 320, 340, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShape3D(0.0f, 0.0f, -0.5f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(8.0, 4.0, 8, 4), new Coord2D(6.0, 19.0, 6, 19), new Coord2D(3.0, 25.0, 3, 25), new Coord2D(0.0, 26.0, 0, 26) }), 1.0f, 8, 26, 62, 1, 0, new float[] { 26.0f, 4.0f, 7.0f, 16.0f, 9.0f });
        this.pitchFlapLeftModel[0].setRotationPoint(91.0f, -26.5f, 1.0f);
        this.pitchFlapLeftModel[0].rotateAngleX = 1.5707964f;
        this.pitchFlapLeftModel[0].rotateAngleZ = 3.1415927f;
        this.pitchFlapLeftModel[0].rotateAngleY = 3.1415927f;
        this.pitchFlapLeftModel[1].addShape3D(3.0f, 21.0f, -0.5f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 0.0, 3, 0), new Coord2D(3.0, 5.0, 3, 5), new Coord2D(0.0, 5.0, 0, 5) }), 1.0f, 3, 5, 16, 1, 0, new float[] { 5.0f, 3.0f, 5.0f, 3.0f });
        this.pitchFlapLeftModel[1].setRotationPoint(91.0f, -26.5f, 1.0f);
        this.pitchFlapLeftModel[1].rotateAngleX = 1.5707964f;
        this.pitchFlapLeftModel[1].rotateAngleZ = 3.1415927f;
        this.pitchFlapLeftModel[1].rotateAngleY = 3.1415927f;
        (this.pitchFlapRightModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 420, 310, this.textureX, this.textureY);
        this.pitchFlapRightModel[1] = new ModelRendererTurbo((ModelBase)this, 320, 330, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShape3D(0.0f, 0.0f, -0.5f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(8.0, 4.0, 8, 4), new Coord2D(6.0, 19.0, 6, 19), new Coord2D(3.0, 25.0, 3, 25), new Coord2D(0.0, 26.0, 0, 26) }), 1.0f, 8, 26, 62, 1, 0, new float[] { 26.0f, 4.0f, 7.0f, 16.0f, 9.0f });
        this.pitchFlapRightModel[0].setRotationPoint(91.0f, -26.5f, -1.0f);
        this.pitchFlapRightModel[0].rotateAngleX = 4.712389f;
        this.pitchFlapRightModel[0].rotateAngleZ = 3.1415927f;
        this.pitchFlapRightModel[0].rotateAngleY = 3.1415927f;
        this.pitchFlapRightModel[1].addShape3D(3.0f, 21.0f, -0.5f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 0.0, 3, 0), new Coord2D(3.0, 5.0, 3, 5), new Coord2D(0.0, 5.0, 0, 5) }), 1.0f, 3, 5, 16, 1, 0, new float[] { 5.0f, 3.0f, 5.0f, 3.0f });
        this.pitchFlapRightModel[1].setRotationPoint(91.0f, -26.5f, -1.0f);
        this.pitchFlapRightModel[1].rotateAngleX = 4.712389f;
        this.pitchFlapRightModel[1].rotateAngleZ = 3.1415927f;
        this.pitchFlapRightModel[1].rotateAngleY = 3.1415927f;
        (this.leftWingWheelModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 0, 380, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 30, 380, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 380, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 50, 380, this.textureX, this.textureY);
        this.leftWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 80, 380, this.textureX, this.textureY);
        this.leftWingWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 100, 380, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 10, 10, 3, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(-16.0f, 0.0f, 16.0f);
        this.leftWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 17, 1, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(-9.0f, -11.0f, 19.0f);
        this.leftWingWheelModel[1].rotateAngleZ = -0.296706f;
        this.leftWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 11, 1, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(0.0f, -11.0f, 19.0f);
        this.leftWingWheelModel[2].rotateAngleZ = -1.099557f;
        this.leftWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 12, 7, 1, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(-18.0f, 0.0f, 20.0f);
        this.leftWingWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 6, 12, 1, 0.0f);
        this.leftWingWheelModel[4].setRotationPoint(-12.0f, -11.0f, 20.0f);
        this.leftWingWheelModel[4].rotateAngleZ = -0.296706f;
        this.leftWingWheelModel[5].addBox(0.0f, 0.0f, 0.0f, 4, 9, 1, 0.0f);
        this.leftWingWheelModel[5].setRotationPoint(-12.0f, -9.0f, 20.0f);
        (this.rightWingWheelModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 0, 400, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 30, 400, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 400, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 50, 400, this.textureX, this.textureY);
        this.rightWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 80, 400, this.textureX, this.textureY);
        this.rightWingWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 100, 400, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 10, 10, 3, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(-16.0f, 0.0f, -19.0f);
        this.rightWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 17, 1, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(-9.0f, -11.0f, -20.0f);
        this.rightWingWheelModel[1].rotateAngleZ = -0.296706f;
        this.rightWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 11, 1, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(0.0f, -11.0f, -20.0f);
        this.rightWingWheelModel[2].rotateAngleZ = -1.099557f;
        this.rightWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 12, 7, 1, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(-18.0f, 0.0f, -21.0f);
        this.rightWingWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 6, 12, 1, 0.0f);
        this.rightWingWheelModel[4].setRotationPoint(-12.0f, -11.0f, -21.0f);
        this.rightWingWheelModel[4].rotateAngleZ = -0.296706f;
        this.rightWingWheelModel[5].addBox(0.0f, 0.0f, 0.0f, 4, 9, 1, 0.0f);
        this.rightWingWheelModel[5].setRotationPoint(-12.0f, -9.0f, -21.0f);
        this.translateAll(0, 0, 0);
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp1(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 0, 470, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 470, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 470, this.textureX, this.textureY) };
        prop[0].addBox(-1.0f, -27.0f, -2.0f, 1, 27, 3, 0.0f);
        prop[1].addBox(-1.0f, -27.0f, -2.0f, 1, 27, 3, 0.0f);
        prop[2].addBox(-1.0f, -27.0f, -2.0f, 1, 27, 3, 0.0f);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}
