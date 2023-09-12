//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelBrowningM1919A4 extends ModelFlanAAGun
{
    public ModelBrowningM1919A4() {
        final int textureX = 512;
        final int textureY = 512;
        (this.baseModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 0, 50, 512, 512);
        this.baseModel[1] = new ModelRendererTurbo((ModelBase)this, 20, 50, 512, 512);
        this.baseModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 50, 512, 512);
        this.baseModel[3] = new ModelRendererTurbo((ModelBase)this, 50, 50, 512, 512);
        this.baseModel[4] = new ModelRendererTurbo((ModelBase)this, 60, 50, 512, 512);
        this.baseModel[0].addBox(-0.5f, 0.0f, -0.5f, 1, 7, 1, 0.0f);
        this.baseModel[0].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.baseModel[1].addBox(-1.0f, 4.0f, -1.0f, 2, 3, 2, 0.0f);
        this.baseModel[1].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.baseModel[2].addBox(-0.5f, 0.0f, -0.5f, 1, 16, 1, 0.0f);
        this.baseModel[2].setRotationPoint(1.0f, -15.0f, 0.0f);
        this.baseModel[2].rotateAngleZ = 0.3490658f;
        this.baseModel[3].addBox(0.0f, 0.0f, -0.5f, 1, 16, 1, 0.0f);
        this.baseModel[3].setRotationPoint(-0.5f, -15.0f, 1.0f);
        this.baseModel[3].rotateAngleY = -1.047198f;
        this.baseModel[3].rotateAngleZ = -0.3490658f;
        this.baseModel[4].addBox(0.0f, 0.0f, -0.5f, 1, 16, 1, 0.0f);
        this.baseModel[4].setRotationPoint(-0.5f, -15.0f, -1.0f);
        this.baseModel[4].rotateAngleY = 1.047198f;
        this.baseModel[4].rotateAngleZ = -0.3490658f;
        (this.gunModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 80, 50, 512, 512);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 120, 50, 512, 512);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 135, 50, 512, 512);
        this.gunModel[3] = new ModelRendererTurbo((ModelBase)this, 200, 50, 512, 512);
        this.gunModel[4] = new ModelRendererTurbo((ModelBase)this, 220, 50, 512, 512);
        this.gunModel[5] = new ModelRendererTurbo((ModelBase)this, 240, 50, 512, 512);
        this.gunModel[6] = new ModelRendererTurbo((ModelBase)this, 260, 50, 512, 512);
        this.gunModel[7] = new ModelRendererTurbo((ModelBase)this, 280, 50, 512, 512);
        this.gunModel[8] = new ModelRendererTurbo((ModelBase)this, 300, 50, 512, 512);
        this.gunModel[9] = new ModelRendererTurbo((ModelBase)this, 320, 50, 512, 512);
        this.gunModel[0].addBox(-6.5f, -3.0f, -1.5f, 8, 3, 3, 0.0f);
        this.gunModel[1].addBox(-8.6f, -2.0f, -0.5f, 3, 1, 1, 0.0f);
        this.gunModel[2].addBox(-8.5f, -1.0f, -0.5f, 1, 2, 1, 0.0f);
        this.gunModel[3].addBox(-2.5f, -2.5f, -1.6f, 3, 2, 1, 0.0f);
        this.gunModel[4].addBox(-2.5f, -2.5f, 0.6f, 3, 2, 1, 0.0f);
        this.gunModel[5].addBox(-4.0f, -2.5f, -3.5f, 1, 1, 3, 0.0f);
        this.gunModel[6].addBox(0.3f, -3.5f, -0.5f, 1, 1, 1, 0.0f);
        this.gunModel[7].addBox(-6.1f, -3.5f, -0.5f, 1, 1, 1, 0.0f);
        this.gunModel[8].addBox(-5.5f, -3.5f, -0.5f, 1, 1, 1, 0.0f);
        this.gunModel[9].addBox(-1.5f, -3.5f, 1.6f, 2, 3, 5, 0.0f);
        this.barrelModel = new ModelRendererTurbo[1][1];
        (this.barrelModel[0][0] = new ModelRendererTurbo((ModelBase)this, 140, 50, 512, 512)).addBox(1.5f, -2.0f, -0.5f, 12, 1, 1, 0.0f);
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.barrelX = 0;
        this.barrelY = 20;
        this.barrelZ = 0;
        this.flipAll();
    }
}
