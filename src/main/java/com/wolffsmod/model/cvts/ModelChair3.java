//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelChair3 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelChair3() {
        this.textureX = 64;
        this.textureY = 64;
        (this.bodyModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 53, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 58, 0, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 58, 0, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 53, 0, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 53, 0, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 53, 0, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 53, 0, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-6.0f, 0.0f, -7.0f, 12, 2, 14, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -2.0f, 0.0f);
        this.bodyModel[1].addBox(-0.5f, 0.0f, -0.5f, 1, 10, 1, 0.0f);
        this.bodyModel[1].setRotationPoint(-6.5f, 0.0f, -7.0f);
        this.bodyModel[1].rotateAngleZ = -0.15707964f;
        this.bodyModel[2].addShapeBox(-0.5f, -14.0f, -0.5f, 1, 14, 1, 0.0f, 0.0f, 0.07f, 0.0f, 0.0f, 0.07f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(-6.5f, 0.0f, 6.45f);
        this.bodyModel[2].rotateAngleX = 0.06981317f;
        this.bodyModel[2].rotateAngleZ = 0.08726646f;
        this.bodyModel[3].addShapeBox(-0.5f, -14.0f, -5.5f, 1, 8, 11, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(-6.5f, 0.0f, 0.0f);
        this.bodyModel[3].rotateAngleZ = 0.08726646f;
        this.bodyModel[4].addShapeBox(-0.5f, -14.0f, -0.5f, 1, 14, 1, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.07f, 0.0f, 0.0f, 0.07f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(-6.5f, 0.0f, -6.45f);
        this.bodyModel[4].rotateAngleX = -0.06981317f;
        this.bodyModel[4].rotateAngleZ = 0.08726646f;
        this.bodyModel[5].addBox(-0.5f, 0.0f, -0.5f, 1, 10, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(-6.5f, 0.0f, -7.0f);
        this.bodyModel[5].rotateAngleZ = -0.15707964f;
        this.bodyModel[6].addBox(-0.5f, 0.0f, -0.5f, 1, 10, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(6.5f, 0.0f, -7.0f);
        this.bodyModel[6].rotateAngleZ = 0.15707964f;
        this.bodyModel[7].addBox(-0.5f, 0.0f, -0.5f, 1, 10, 1, 0.0f);
        this.bodyModel[7].setRotationPoint(-6.5f, 0.0f, 7.0f);
        this.bodyModel[7].rotateAngleZ = -0.15707964f;
        this.bodyModel[8].addBox(-0.5f, 0.0f, -0.5f, 1, 10, 1, 0.0f);
        this.bodyModel[8].setRotationPoint(6.5f, 0.0f, 7.0f);
        this.bodyModel[8].rotateAngleZ = 0.15707964f;
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[9].setRotationPoint(-7.0f, -0.1f, -7.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-7.0f, -0.1f, 6.5f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
