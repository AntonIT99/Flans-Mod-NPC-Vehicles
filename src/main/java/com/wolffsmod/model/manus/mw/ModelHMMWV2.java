//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.mw;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelHMMWV2 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelHMMWV2() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[40])[0] = new ModelRendererTurbo((ModelBase)this, 84, 166, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 303, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 55, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 303, 0, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 312, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 260, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 206, 153, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 455, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 206, 196, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 455, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 93, 224, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 352, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 206, 109, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 208, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 186, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 407, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 303, 0, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 25, 136, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 25, 154, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 25, 136, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 25, 136, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 25, 136, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 53, 154, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 25, 154, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 53, 154, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 303, 0, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 93, 289, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 93, 289, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 0, 109, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 0, 136, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 3, 13, 38, 0.0f);
        this.bodyModel[0].setRotationPoint(13.0f, -12.0f, -19.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 2, 28, 0.0f);
        this.bodyModel[1].setRotationPoint(-30.0f, 2.0f, -14.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 27, 8, 20, 0.0f);
        this.bodyModel[2].setRotationPoint(-42.0f, -7.0f, -10.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 2, 2, 28, 0.0f);
        this.bodyModel[3].setRotationPoint(25.0f, 2.0f, -14.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 21, 9, 20, 0.0f);
        this.bodyModel[4].setRotationPoint(16.0f, -8.0f, -10.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 2, 2, 38, 0.0f);
        this.bodyModel[5].setRotationPoint(35.0f, -5.0f, -19.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 31, 1, 38, 0.0f);
        this.bodyModel[6].setRotationPoint(-15.0f, 1.0f, -19.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 28, 22, 1, 0.0f);
        this.bodyModel[7].setRotationPoint(-15.0f, -21.0f, -19.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 24, 1, 38, 0.0f);
        this.bodyModel[8].setRotationPoint(-39.0f, -8.0f, -19.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 28, 22, 1, 0.0f);
        this.bodyModel[9].setRotationPoint(-15.0f, -21.0f, 18.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 22, 36, 0.0f);
        this.bodyModel[10].setRotationPoint(-15.0f, -21.0f, -18.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 20, 3, 38, 0.0f);
        this.bodyModel[11].setRotationPoint(16.0f, -8.0f, -19.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 29, 1, 38, 0.0f);
        this.bodyModel[12].setRotationPoint(-15.0f, -22.0f, -19.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 4, 8, 38, 0.0f);
        this.bodyModel[13].setRotationPoint(-43.0f, -8.0f, -19.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 16, 1, 16, 0.0f);
        this.bodyModel[14].setRotationPoint(-8.0f, -22.5f, -8.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 1, 7, 36, 0.0f);
        this.bodyModel[15].setRotationPoint(38.0f, -11.0f, -18.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 4, 2, 10, 0.0f);
        this.bodyModel[16].setRotationPoint(-31.0f, 1.0f, -5.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 12, 2, 12, 0.0f);
        this.bodyModel[17].setRotationPoint(-14.0f, -1.0f, 3.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 1, 11, 12, 0.0f);
        this.bodyModel[18].setRotationPoint(-1.0f, -11.0f, 3.0f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 12, 2, 12, 0.0f);
        this.bodyModel[19].setRotationPoint(0.0f, -1.0f, 3.0f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 12, 2, 12, 0.0f);
        this.bodyModel[20].setRotationPoint(-14.0f, -1.0f, -15.0f);
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 12, 2, 12, 0.0f);
        this.bodyModel[21].setRotationPoint(0.0f, -1.0f, -15.0f);
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 1, 10, 12, 0.0f);
        this.bodyModel[22].setRotationPoint(-14.0f, -11.0f, 3.0f);
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 1, 11, 12, 0.0f);
        this.bodyModel[23].setRotationPoint(-1.0f, -11.0f, -15.0f);
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 1, 10, 12, 0.0f);
        this.bodyModel[24].setRotationPoint(-14.0f, -11.0f, -15.0f);
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 1, 2, 20, 0.0f);
        this.bodyModel[25].setRotationPoint(37.0f, -5.0f, -10.0f);
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 4, 2, 10, 0.0f);
        this.bodyModel[26].setRotationPoint(24.0f, 1.0f, -5.0f);
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 28, 15, 1, 0.0f);
        this.bodyModel[27].setRotationPoint(-43.0f, -23.0f, 18.0f);
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 28, 15, 1, 0.0f);
        this.bodyModel[28].setRotationPoint(-43.0f, -23.0f, -19.0f);
        this.bodyModel[29].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 2.0, 3, 2), new Coord2D(5.0, 9.0, 5, 9), new Coord2D(0.0, 9.0, 0, 9) }), 1.0f, 5, 9, 25, 1, 0, new float[] { 4.0f, 7.0f, 5.0f, 9.0f });
        this.bodyModel[29].setRotationPoint(-15.0f, 2.0f, -18.0f);
        this.bodyModel[30].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 2.0, 3, 2), new Coord2D(5.0, 9.0, 5, 9), new Coord2D(0.0, 9.0, 0, 9) }), 1.0f, 5, 9, 25, 1, 0, new float[] { 4.0f, 7.0f, 5.0f, 9.0f });
        this.bodyModel[30].setRotationPoint(-15.0f, 2.0f, 19.0f);
        this.bodyModel[31].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 7.0, 2, 7), new Coord2D(0.0, 7.0, 0, 7) }), 1.0f, 2, 7, 20, 1, 0, new float[] { 9.0f, 2.0f, 9.0f });
        this.bodyModel[31].rotateAngleY = 3.1415927f;
        this.bodyModel[31].setRotationPoint(16.0f, 2.0f, -19.0f);
        this.bodyModel[32].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 7.0, 2, 7), new Coord2D(0.0, 7.0, 0, 7) }), 1.0f, 2, 7, 20, 1, 0, new float[] { 9.0f, 2.0f, 9.0f });
        this.bodyModel[32].rotateAngleY = 3.1415927f;
        this.bodyModel[32].setRotationPoint(16.0f, 2.0f, 18.0f);
        this.bodyModel[33].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 7.0, 2, 7), new Coord2D(0.0, 7.0, 0, 7) }), 1.0f, 2, 7, 16, 1, 0, new float[] { 7.0f, 2.0f, 7.0f });
        this.bodyModel[33].rotateAngleY = 3.1415927f;
        this.bodyModel[33].setRotationPoint(-39.0f, 0.0f, -19.0f);
        this.bodyModel[34].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 7.0, 2, 7), new Coord2D(0.0, 7.0, 0, 7) }), 1.0f, 2, 7, 16, 1, 0, new float[] { 7.0f, 2.0f, 7.0f });
        this.bodyModel[34].rotateAngleY = 3.1415927f;
        this.bodyModel[34].setRotationPoint(-39.0f, 0.0f, 18.0f);
        this.bodyModel[35].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(20.0, 2.0, 20, 2), new Coord2D(0.0, 4.0, 0, 4) }), 9.0f, 20, 4, 46, 9, 0, new float[] { 20.0f, 2.0f, 20.0f, 4.0f });
        this.bodyModel[35].rotateAngleY = 3.1415927f;
        this.bodyModel[35].setRotationPoint(16.0f, -8.0f, -19.0f);
        this.bodyModel[36].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(20.0, 2.0, 20, 2), new Coord2D(0.0, 4.0, 0, 4) }), 9.0f, 20, 4, 46, 9, 0, new float[] { 20.0f, 2.0f, 20.0f, 4.0f });
        this.bodyModel[36].rotateAngleY = 3.1415927f;
        this.bodyModel[36].setRotationPoint(16.0f, -8.0f, 10.0f);
        this.bodyModel[37].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(21.0, 0.0, 21, 0), new Coord2D(21.0, 3.0, 21, 3), new Coord2D(0.0, 4.0, 0, 4) }), 20.0f, 21, 4, 49, 20, 0, new float[] { 4.0f, 21.0f, 4.0f, 21.0f });
        this.bodyModel[37].rotateAngleY = 3.1415927f;
        this.bodyModel[37].setRotationPoint(16.0f, -8.0f, -10.0f);
        this.bodyModel[38].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(3.0, 0.0, 3, 0), new Coord2D(1.0, 9.0, 1, 9), new Coord2D(0.0, 9.0, 0, 9) }), 38.0f, 3, 9, 22, 38, 0, new float[] { 9.0f, 1.0f, 9.0f, 3.0f });
        this.bodyModel[38].rotateAngleY = 3.1415927f;
        this.bodyModel[38].setRotationPoint(13.0f, -12.0f, -19.0f);
        this.bodyModel[39].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(1.0, 0.0, 1, 0), new Coord2D(1.0, 2.0, 1, 2), new Coord2D(0.0, 2.0, 0, 2) }), 36.0f, 2, 1, 6, 1, 0, new float[] { 1.0f, 2.0f, 1.0f, 2.0f });
        this.bodyModel[39].rotateAngleY = 3.1415927f;
        this.bodyModel[39].setRotationPoint(-43.0f, -8.0f, -18.0f);
        (this.leftFrontWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 45, 493, this.textureX, this.textureY);
        this.leftFrontWheelModel[0].addShape3D(7.0f, -7.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 5.0f, 14, 14, 45, 5, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 4.0f });
        this.leftFrontWheelModel[0].setRotationPoint(26.0f, 3.0f, 17.0f);
        (this.leftBackWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 45, 493, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShape3D(7.0f, -7.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 5.0f, 14, 14, 45, 5, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 4.0f });
        this.leftBackWheelModel[0].setRotationPoint(-29.0f, 3.0f, 17.0f);
        (this.rightFrontWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 45, 493, this.textureX, this.textureY);
        this.rightFrontWheelModel[0].addShape3D(7.0f, -7.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 5.0f, 14, 14, 45, 5, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 4.0f });
        this.rightFrontWheelModel[0].setRotationPoint(26.0f, 3.0f, -16.0f);
        (this.rightBackWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 45, 493, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShape3D(7.0f, -7.0f, -2.0f, new Shape2D(new Coord2D[] { new Coord2D(4.0, 0.0, 4, 0), new Coord2D(10.0, 0.0, 10, 0), new Coord2D(14.0, 4.0, 14, 4), new Coord2D(14.0, 10.0, 14, 10), new Coord2D(10.0, 14.0, 10, 14), new Coord2D(4.0, 14.0, 4, 14), new Coord2D(0.0, 10.0, 0, 10), new Coord2D(0.0, 4.0, 0, 4) }), 5.0f, 14, 14, 45, 5, 0, new float[] { 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 4.0f });
        this.rightBackWheelModel[0].setRotationPoint(-29.0f, 3.0f, -16.0f);
        this.steeringWheelModel = new ModelRendererTurbo[1];
        (this.steeringWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 70, 455, this.textureX, this.textureY)).addBox(0.0f, -4.0f, -4.0f, 1, 8, 8, 0.0f);
        this.steeringWheelModel[0].setRotationPoint(12.5f, -12.0f, 10.0f);
        this.steeringWheelModel[0].rotateAngleZ = -0.1919862f;
        this.translateAll(0, 0, 0);
        this.flipAll();
    }
}
