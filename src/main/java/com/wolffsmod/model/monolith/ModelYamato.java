//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelYamato extends ModelFlanAAGun
{
    int textureX;
    int textureY;
    
    public ModelYamato() {
        this.textureX = 1536;
        this.textureY = 1536;
        this.baseModel = new ModelRendererTurbo[1];
        (this.baseModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 133, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 86, 12, 86, 0.0f);
        this.baseModel[0].setRotationPoint(-43.0f, -12.0f, -43.0f);
        (this.seatModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo((ModelBase)this, 0, 262, this.textureX, this.textureY);
        this.seatModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 375, this.textureX, this.textureY);
        this.seatModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 375, this.textureX, this.textureY);
        this.seatModel[3] = new ModelRendererTurbo((ModelBase)this, 10, 500, this.textureX, this.textureY);
        this.seatModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 620, this.textureX, this.textureY);
        this.seatModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 750, this.textureX, this.textureY);
        this.seatModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 875, this.textureX, this.textureY);
        this.seatModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 1000, this.textureX, this.textureY);
        this.seatModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 1000, this.textureX, this.textureY);
        this.seatModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 1100, this.textureX, this.textureY);
        this.seatModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 1200, this.textureX, this.textureY);
        this.seatModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 1100, this.textureX, this.textureY);
        this.seatModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 1200, this.textureX, this.textureY);
        this.seatModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 1300, this.textureX, this.textureY);
        this.seatModel[0].addBox(20.0f, 2.0f, -34.0f, 10, 40, 68, 0.0f);
        this.seatModel[0].setRotationPoint(0.0f, -29.0f, 0.0f);
        this.seatModel[0].rotateAngleZ = 0.6981317f;
        this.seatModel[1].addBox(-82.0f, 19.0f, -28.0f, 100, 36, 23, 0.0f);
        this.seatModel[1].setRotationPoint(0.0f, -48.0f, 0.0f);
        this.seatModel[1].rotateAngleX = -0.5934119f;
        this.seatModel[1].rotateAngleY = 0.08726646f;
        this.seatModel[1].rotateAngleZ = 0.05235988f;
        this.seatModel[2].addBox(-82.0f, 19.0f, 5.0f, 100, 36, 23, 0.0f);
        this.seatModel[2].setRotationPoint(0.0f, -48.0f, 0.0f);
        this.seatModel[2].rotateAngleX = 0.5934119f;
        this.seatModel[2].rotateAngleY = -0.08726646f;
        this.seatModel[2].rotateAngleZ = 0.05235988f;
        this.seatModel[3].addBox(-80.0f, 0.0f, -38.0f, 31, 14, 76, 0.0f);
        this.seatModel[3].setRotationPoint(0.0f, -49.0f, 0.0f);
        this.seatModel[3].rotateAngleZ = -0.05235988f;
        this.seatModel[4].addBox(-50.0f, 0.0f, -36.0f, 74, 19, 72, 0.0f);
        this.seatModel[4].setRotationPoint(0.0f, -47.0f, 0.0f);
        this.seatModel[4].rotateAngleZ = -0.08726646f;
        this.seatModel[5].addBox(-101.0f, -2.0f, -42.0f, 16, 18, 84, 0.0f);
        this.seatModel[5].setRotationPoint(0.0f, -72.0f, 0.0f);
        this.seatModel[5].rotateAngleZ = 0.5061455f;
        this.seatModel[6].addBox(-87.0f, 0.0f, -42.0f, 16, 29, 84, 0.0f);
        this.seatModel[6].setRotationPoint(0.0f, -17.0f, 0.0f);
        this.seatModel[6].rotateAngleZ = -0.418879f;
        this.seatModel[7].addBox(-60.0f, 0.0f, -70.0f, 20, 14, 40, 0.0f);
        this.seatModel[7].setRotationPoint(0.0f, -48.0f, 0.0f);
        this.seatModel[8].addBox(-60.0f, 0.0f, 30.0f, 20, 14, 40, 0.0f);
        this.seatModel[8].setRotationPoint(0.0f, -48.0f, 0.0f);
        this.seatModel[9].addBox(37.0f, 0.0f, -7.0f, 10, 8, 27, 0.0f);
        this.seatModel[9].setRotationPoint(0.0f, -20.0f, 0.0f);
        this.seatModel[9].rotateAngleY = -1.012291f;
        this.seatModel[10].addBox(32.0f, 0.0f, -7.0f, 14, 18, 18, 0.0f);
        this.seatModel[10].setRotationPoint(0.0f, -9.0f, 0.0f);
        this.seatModel[10].rotateAngleY = -1.012291f;
        this.seatModel[10].rotateAngleZ = 0.6108652f;
        this.seatModel[11].addBox(37.0f, 0.0f, -20.0f, 10, 8, 27, 0.0f);
        this.seatModel[11].setRotationPoint(0.0f, -20.0f, 0.0f);
        this.seatModel[11].rotateAngleY = 1.012291f;
        this.seatModel[12].addBox(32.0f, 0.0f, -12.0f, 14, 18, 18, 0.0f);
        this.seatModel[12].setRotationPoint(0.0f, -9.0f, 0.0f);
        this.seatModel[12].rotateAngleY = 1.012291f;
        this.seatModel[12].rotateAngleZ = 0.6108652f;
        this.seatModel[13].addBox(-80.0f, 0.0f, -41.0f, 74, 2, 82, 0.0f);
        this.seatModel[13].setRotationPoint(0.0f, -12.0f, 0.0f);
        (this.gunModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 0, 240, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 240, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 240, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 1400, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 1400, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 1400, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, -14.0f, 3.0f, 150, 8, 8, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -26.0f, 0.0f);
        this.gunModel[1].addBox(0.0f, -14.0f, 23.0f, 150, 8, 8, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -26.0f, 0.0f);
        this.gunModel[2].addBox(0.0f, -14.0f, -17.0f, 150, 8, 8, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -26.0f, 0.0f);
        this.gunModel[3].addBox(0.0f, -18.0f, 22.0f, 52, 15, 10, 0.0f);
        this.gunModel[3].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.gunModel[4].addBox(0.0f, -18.0f, 2.0f, 52, 15, 10, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.gunModel[5].addBox(0.0f, -18.0f, -18.0f, 52, 15, 10, 0.0f);
        this.gunModel[5].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.barrelModel = new ModelRendererTurbo[0][0];
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.barrelX = 0;
        this.barrelY = 16;
        this.barrelZ = 6;
        this.flipAll();
    }
}
