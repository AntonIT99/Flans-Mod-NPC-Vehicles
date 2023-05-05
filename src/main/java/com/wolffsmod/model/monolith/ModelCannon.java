//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelCannon extends ModelFlanAAGun
{
    int textureX;
    int textureY;
    
    public ModelCannon() {
        this.textureX = 512;
        this.textureY = 512;
        (this.baseModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 0, 220, this.textureX, this.textureY);
        this.baseModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 220, this.textureX, this.textureY);
        this.baseModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.baseModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 300, this.textureX, this.textureY);
        this.baseModel[0].addBox(0.0f, 0.0f, 0.0f, 20, 20, 2, 0.0f);
        this.baseModel[0].setRotationPoint(-10.0f, -20.0f, 15.0f);
        this.baseModel[1].addBox(0.0f, 0.0f, 0.0f, 20, 20, 2, 0.0f);
        this.baseModel[1].setRotationPoint(-10.0f, -20.0f, -17.0f);
        this.baseModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 2, 30, 0.0f);
        this.baseModel[2].setRotationPoint(-1.0f, -11.0f, -15.0f);
        this.baseModel[3].addBox(0.0f, 0.0f, 0.0f, 2, 13, 2, 0.0f);
        this.baseModel[3].setRotationPoint(-1.0f, -24.0f, -1.0f);
        (this.seatModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 0, 325, this.textureX, this.textureY);
        this.seatModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.seatModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 350, this.textureX, this.textureY);
        this.seatModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 370, this.textureX, this.textureY);
        this.seatModel[0].addBox(-1.0f, 0.0f, -3.0f, 32, 1, 6, 0.0f);
        this.seatModel[0].setRotationPoint(0.0f, -25.0f, 0.0f);
        this.seatModel[1].addBox(-13.0f, 0.0f, -1.0f, 12, 2, 2, 0.0f);
        this.seatModel[1].setRotationPoint(0.0f, -15.0f, 0.0f);
        this.seatModel[2].addBox(-15.0f, -7.0f, -1.0f, 2, 9, 2, 0.0f);
        this.seatModel[2].setRotationPoint(0.0f, -15.0f, 0.0f);
        this.seatModel[3].addBox(-18.0f, 0.0f, -4.0f, 8, 1, 8, 0.0f);
        this.seatModel[3].setRotationPoint(0.0f, -23.0f, 0.0f);
        this.gunModel = new ModelRendererTurbo[1];
        (this.gunModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 400, this.textureX, this.textureY)).addBox(-5.0f, -33.0f, -4.0f, 30, 8, 8, 0.0f);
        this.barrelModel = new ModelRendererTurbo[0][0];
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.barrelX = 0;
        this.barrelY = 0;
        this.barrelZ = 0;
        this.flipAll();
    }
}
