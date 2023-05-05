//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class Model12cm extends ModelFlanAAGun
{
    int textureX;
    int textureY;
    
    public Model12cm() {
        this.textureX = 512;
        this.textureY = 512;
        this.baseModel = new ModelRendererTurbo[1];
        (this.baseModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 210, this.textureX, this.textureY)).addBox(-8.0f, 0.0f, -8.0f, 16, 8, 16, 0.0f);
        this.baseModel[0].setRotationPoint(0.0f, -8.0f, 0.0f);
        (this.seatModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo((ModelBase)this, 0, 380, this.textureX, this.textureY);
        this.seatModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 380, this.textureX, this.textureY);
        this.seatModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 270, this.textureX, this.textureY);
        this.seatModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.seatModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 170, this.textureX, this.textureY);
        this.seatModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 345, this.textureX, this.textureY);
        this.seatModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 345, this.textureX, this.textureY);
        this.seatModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 310, this.textureX, this.textureY);
        this.seatModel[0].addBox(-14.0f, 0.0f, -13.0f, 24, 28, 1, 0.0f);
        this.seatModel[0].setRotationPoint(0.0f, -36.0f, 0.0f);
        this.seatModel[1].addBox(-14.0f, 0.0f, 12.0f, 24, 28, 1, 0.0f);
        this.seatModel[1].setRotationPoint(0.0f, -36.0f, 0.0f);
        this.seatModel[2].addBox(10.0f, 0.0f, -12.0f, 1, 10, 24, 0.0f);
        this.seatModel[2].setRotationPoint(0.0f, -18.0f, 0.0f);
        this.seatModel[3].addBox(-2.0f, 0.0f, -2.0f, 12, 4, 4, 0.0f);
        this.seatModel[3].setRotationPoint(0.0f, -20.0f, 0.0f);
        this.seatModel[4].addBox(-10.0f, 0.0f, -12.0f, 20, 1, 24, 0.0f);
        this.seatModel[4].setRotationPoint(0.0f, -9.0f, 0.0f);
        this.seatModel[5].addBox(10.0f, 0.0f, 3.0f, 1, 14, 9, 0.0f);
        this.seatModel[5].setRotationPoint(0.0f, -32.0f, 0.0f);
        this.seatModel[6].addBox(10.0f, 0.0f, -12.0f, 1, 14, 9, 0.0f);
        this.seatModel[6].setRotationPoint(0.0f, -32.0f, 0.0f);
        this.seatModel[7].addBox(10.0f, 0.0f, -12.0f, 1, 4, 24, 0.0f);
        this.seatModel[7].setRotationPoint(0.0f, -36.0f, 0.0f);
        (this.gunModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 0, 450, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 420, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 420, this.textureX, this.textureY);
        this.gunModel[0].addBox(-30.0f, -2.5f, -2.5f, 100, 5, 5, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -220.0f, 0.0f);
        this.gunModel[1].addBox(-24.0f, -7.0f, -5.0f, 26, 4, 4, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -22.0f, 0.0f);
        this.gunModel[2].addBox(-24.0f, -7.0f, 1.0f, 26, 4, 4, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -22.0f, 0.0f);
        this.barrelModel = new ModelRendererTurbo[0][0];
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.barrelX = 0;
        this.barrelY = 0;
        this.barrelZ = 0;
        this.flipAll();
    }
}
