//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.mw;

import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.wolffsmod.model.ModelFlanAAGun;

import net.minecraft.client.model.ModelBase;

public class ModelSkyshield extends ModelFlanAAGun
{
    int textureX;
    int textureY;
    
    public ModelSkyshield() {
        this.textureX = 512;
        this.textureY = 512;
        (this.baseModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 0, 500, this.textureX, this.textureY);
        this.baseModel[1] = new ModelRendererTurbo((ModelBase)this, 40, 500, this.textureX, this.textureY);
        this.baseModel[2] = new ModelRendererTurbo((ModelBase)this, 80, 500, this.textureX, this.textureY);
        this.baseModel[3] = new ModelRendererTurbo((ModelBase)this, 120, 500, this.textureX, this.textureY);
        this.baseModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 450, this.textureX, this.textureY);
        this.baseModel[5] = new ModelRendererTurbo((ModelBase)this, 160, 450, this.textureX, this.textureY);
        this.baseModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 8, 2, 8, 0.0f, -1.0f, 4);
        this.baseModel[0].setRotationPoint(-23.0f, -2.0f, -22.0f);
        this.baseModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 8, 2, 8, 0.0f, -1.0f, 4);
        this.baseModel[1].setRotationPoint(15.0f, -2.0f, -22.0f);
        this.baseModel[2].addTrapezoid(0.0f, 0.0f, 0.0f, 8, 2, 8, 0.0f, -1.0f, 4);
        this.baseModel[2].setRotationPoint(15.0f, -2.0f, 15.0f);
        this.baseModel[3].addTrapezoid(0.0f, 0.0f, 0.0f, 8, 2, 8, 0.0f, -1.0f, 4);
        this.baseModel[3].setRotationPoint(-23.0f, -2.0f, 15.0f);
        this.baseModel[4].addBox(0.0f, 0.0f, 0.0f, 38, 8, 38, 0.0f);
        this.baseModel[4].setRotationPoint(-19.0f, -10.0f, -19.0f);
        this.baseModel[5].addTrapezoid(0.0f, 0.0f, 0.0f, 38, 2, 38, 0.0f, -5.0f, 4);
        this.baseModel[5].setRotationPoint(-19.0f, -12.0f, -19.0f);
        (this.seatModel = new ModelRendererTurbo[18])[0] = new ModelRendererTurbo((ModelBase)this, 0, 400, this.textureX, this.textureY);
        this.seatModel[1] = new ModelRendererTurbo((ModelBase)this, 120, 400, this.textureX, this.textureY);
        this.seatModel[2] = new ModelRendererTurbo((ModelBase)this, 120, 420, this.textureX, this.textureY);
        this.seatModel[3] = new ModelRendererTurbo((ModelBase)this, 185, 400, this.textureX, this.textureY);
        this.seatModel[4] = new ModelRendererTurbo((ModelBase)this, 170, 420, this.textureX, this.textureY);
        this.seatModel[5] = new ModelRendererTurbo((ModelBase)this, 170, 430, this.textureX, this.textureY);
        this.seatModel[6] = new ModelRendererTurbo((ModelBase)this, 170, 440, this.textureX, this.textureY);
        this.seatModel[7] = new ModelRendererTurbo((ModelBase)this, 200, 415, this.textureX, this.textureY);
        this.seatModel[8] = new ModelRendererTurbo((ModelBase)this, 200, 430, this.textureX, this.textureY);
        this.seatModel[9] = new ModelRendererTurbo((ModelBase)this, 200, 440, this.textureX, this.textureY);
        this.seatModel[10] = new ModelRendererTurbo((ModelBase)this, 230, 400, this.textureX, this.textureY);
        this.seatModel[11] = new ModelRendererTurbo((ModelBase)this, 230, 415, this.textureX, this.textureY);
        this.seatModel[12] = new ModelRendererTurbo((ModelBase)this, 230, 430, this.textureX, this.textureY);
        this.seatModel[13] = new ModelRendererTurbo((ModelBase)this, 260, 400, this.textureX, this.textureY);
        this.seatModel[14] = new ModelRendererTurbo((ModelBase)this, 300, 410, this.textureX, this.textureY);
        this.seatModel[15] = new ModelRendererTurbo((ModelBase)this, 300, 400, this.textureX, this.textureY);
        this.seatModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.seatModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 280, this.textureX, this.textureY);
        this.seatModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 38, 8, 36, 0.0f, -4.0f, 5);
        this.seatModel[0].setRotationPoint(-20.0f, -20.0f, -18.0f);
        this.seatModel[1].addBox(0.0f, 0.0f, 0.0f, 22, 8, 8, 0.0f);
        this.seatModel[1].setRotationPoint(-20.0f, -28.0f, -4.0f);
        this.seatModel[2].addBox(0.0f, 0.0f, 0.0f, 12, 1, 12, 0.0f);
        this.seatModel[2].setRotationPoint(-11.0f, -29.0f, -17.0f);
        this.seatModel[3].addBox(0.0f, 0.0f, 0.0f, 10, 1, 9, 0.0f);
        this.seatModel[3].setRotationPoint(-10.0f, -29.0f, -16.0f);
        this.seatModel[3].rotateAngleZ = 1.884956f;
        this.seatModel[4].addBox(0.0f, 0.0f, 0.0f, 9, 2, 4, 0.0f);
        this.seatModel[4].setRotationPoint(-19.0f, -27.0f, -2.0f);
        this.seatModel[4].rotateAngleZ = 1.902409f;
        this.seatModel[5].addBox(0.0f, 0.0f, 0.0f, 9, 3, 1, 0.0f);
        this.seatModel[5].setRotationPoint(-20.0f, -27.0f, -3.0f);
        this.seatModel[5].rotateAngleZ = 1.902409f;
        this.seatModel[6].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.seatModel[6].setRotationPoint(-20.0f, -30.0f, -4.0f);
        this.seatModel[6].rotateAngleZ = 1.902409f;
        this.seatModel[7].addBox(0.0f, 0.0f, 0.0f, 7, 5, 5, 0.0f);
        this.seatModel[7].setRotationPoint(-20.0f, -28.0f, -9.0f);
        this.seatModel[7].rotateAngleZ = 1.902409f;
        this.seatModel[8].addBox(0.0f, 0.0f, 0.0f, 9, 3, 1, 0.0f);
        this.seatModel[8].setRotationPoint(-20.0f, -27.0f, 2.0f);
        this.seatModel[8].rotateAngleZ = 1.902409f;
        this.seatModel[9].addBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f);
        this.seatModel[9].setRotationPoint(-20.0f, -30.0f, 3.0f);
        this.seatModel[9].rotateAngleZ = 1.902409f;
        this.seatModel[10].addBox(0.0f, 0.0f, 0.0f, 3, 6, 3, 0.0f);
        this.seatModel[10].setRotationPoint(-20.0f, -30.0f, 5.0f);
        this.seatModel[10].rotateAngleZ = 1.902409f;
        this.seatModel[11].addBox(0.0f, 0.0f, 0.0f, 5, 1, 5, 0.0f);
        this.seatModel[11].setRotationPoint(-16.0f, -30.3f, 4.0f);
        this.seatModel[11].rotateAngleZ = 1.902409f;
        this.seatModel[12].addBox(0.0f, 0.0f, 0.0f, 4, 2, 6, 0.0f);
        this.seatModel[12].setRotationPoint(-23.0f, -37.0f, -3.0f);
        this.seatModel[13].addBox(0.0f, 0.0f, 0.0f, 6, 3, 22, 0.0f);
        this.seatModel[13].setRotationPoint(-23.0f, -42.0f, 11.0f);
        this.seatModel[13].rotateAngleY = 3.141593f;
        this.seatModel[13].rotateAngleZ = -1.727876f;
        this.seatModel[14].addBox(0.0f, 0.0f, 0.0f, 6, 3, 22, 0.0f);
        this.seatModel[14].setRotationPoint(-23.0f, -42.0f, -11.0f);
        this.seatModel[14].rotateAngleZ = 1.413717f;
        this.seatModel[15].addBox(0.0f, 0.0f, 0.0f, 2, 4, 2, 0.0f);
        this.seatModel[15].setRotationPoint(-22.0f, -51.0f, -1.0f);
        this.seatModel[16].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(38.0, 0.0, 38, 0), new Coord2D(38.0, 6.0, 38, 6), new Coord2D(36.0, 8.0, 36, 8), new Coord2D(16.0, 8.0, 16, 8) }), 14.0f, 38, 8, 85, 14, 0, new float[] { 18.0f, 20.0f, 3.0f, 6.0f, 38.0f });
        this.seatModel[16].setRotationPoint(18.0f, -20.0f, 18.0f);
        this.seatModel[17].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(38.0, 0.0, 38, 0), new Coord2D(38.0, 6.0, 38, 6), new Coord2D(36.0, 8.0, 36, 8), new Coord2D(16.0, 8.0, 16, 8) }), 14.0f, 38, 8, 85, 14, 0, new float[] { 18.0f, 20.0f, 3.0f, 6.0f, 38.0f });
        this.seatModel[17].setRotationPoint(18.0f, -20.0f, -4.0f);
        (this.gunModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 0, 370, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 320, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 320, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, -4.0f, -4.0f, 20, 8, 8, 0.0f);
        this.gunModel[1].addTrapezoid(20.0f, -4.0f, -4.0f, 27, 8, 8, 0.0f, -2.0f, 2);
        this.gunModel[2].flip = true;
        this.gunModel[2].addTrapezoid(20.0f, -4.0f, -4.0f, 27, 8, 8, 0.0f, -2.0f, 2);
        this.barrelModel = new ModelRendererTurbo[1][2];
        this.barrelModel[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 350, this.textureX, this.textureY);
        this.barrelModel[0][1] = new ModelRendererTurbo((ModelBase)this, 75, 350, this.textureX, this.textureY);
        this.barrelModel[0][0].addBox(20.0f, -1.0f, -1.0f, 32, 2, 2, 0.0f);
        this.barrelModel[0][1].addBox(52.0f, -1.5f, -1.5f, 5, 3, 3, 0.0f);
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.barrelX = 0;
        this.barrelY = 24;
        this.barrelZ = 0;
        this.flipAll();
    }
}
