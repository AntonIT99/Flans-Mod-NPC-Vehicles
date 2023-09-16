//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelBrowningM1919A4Kai extends ModelFlanVehicle
{
    public ModelBrowningM1919A4Kai() {
        final int textureX = 512;
        final int textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 0, 50, 512, 512);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 20, 50, 512, 512);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 50, 512, 512);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 50, 50, 512, 512);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 60, 50, 512, 512);
        this.bodyModel[0].addBox(-0.5f, 0.0f, -0.5f, 1, 7, 1, 0.0f);
        this.bodyModel[0].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.bodyModel[1].addBox(-1.0f, 4.0f, -1.0f, 2, 3, 2, 0.0f);
        this.bodyModel[1].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.bodyModel[2].addBox(-0.5f, 0.0f, -0.5f, 1, 16, 1, 0.0f);
        this.bodyModel[2].setRotationPoint(1.0f, -15.0f, 0.0f);
        this.bodyModel[2].rotateAngleZ = 0.3490658f;
        this.bodyModel[3].addBox(0.0f, 0.0f, -0.5f, 1, 16, 1, 0.0f);
        this.bodyModel[3].setRotationPoint(-0.5f, -15.0f, 1.0f);
        this.bodyModel[3].rotateAngleY = -1.047198f;
        this.bodyModel[3].rotateAngleZ = -0.3490658f;
        this.bodyModel[4].addBox(0.0f, 0.0f, -0.5f, 1, 16, 1, 0.0f);
        this.bodyModel[4].setRotationPoint(-0.5f, -15.0f, -1.0f);
        this.bodyModel[4].rotateAngleY = 1.047198f;
        this.bodyModel[4].rotateAngleZ = -0.3490658f;
        (this.barrelModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo((ModelBase)this, 80, 50, 512, 512);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 120, 50, 512, 512);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 135, 50, 512, 512);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 200, 50, 512, 512);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 220, 50, 512, 512);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 240, 50, 512, 512);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 260, 50, 512, 512);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase)this, 280, 50, 512, 512);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase)this, 300, 50, 512, 512);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase)this, 320, 50, 512, 512);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase)this, 140, 50, 512, 512);
        this.barrelModel[0].addBox(-6.5f, -3.0f, -1.5f, 8, 3, 3, 0.0f);
        this.barrelModel[0].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[1].addBox(-8.6f, -2.0f, -0.5f, 3, 1, 1, 0.0f);
        this.barrelModel[1].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[2].addBox(-8.5f, -1.0f, -0.5f, 1, 2, 1, 0.0f);
        this.barrelModel[2].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[3].addBox(-2.5f, -2.5f, -1.6f, 3, 2, 1, 0.0f);
        this.barrelModel[3].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[4].addBox(-2.5f, -2.5f, 0.6f, 3, 2, 1, 0.0f);
        this.barrelModel[4].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[5].addBox(-4.0f, -2.5f, -3.5f, 1, 1, 3, 0.0f);
        this.barrelModel[5].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[6].addBox(0.3f, -3.5f, -0.5f, 1, 1, 1, 0.0f);
        this.barrelModel[6].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[7].addBox(-6.1f, -3.5f, -0.5f, 1, 1, 1, 0.0f);
        this.barrelModel[7].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[8].addBox(-5.5f, -3.5f, -0.5f, 1, 1, 1, 0.0f);
        this.barrelModel[8].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[9].addBox(-1.5f, -3.5f, 1.6f, 2, 3, 5, 0.0f);
        this.barrelModel[9].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.barrelModel[10].addBox(1.5f, -2.0f, -0.5f, 12, 1, 1, 0.0f);
        this.barrelModel[10].setRotationPoint(0.5f, -20.0f, 0.0f);
        this.translateAll(0.0f, 10.0f, 0.0f);
        this.flipAll();
    }
}
