//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelChair1 extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelChair1() {
        this.textureX = 64;
        this.textureY = 64;
        (this.bodyModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 24, 16, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 24, 16, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 24, 16, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 24, 16, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 29, 16, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 29, 16, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 40, 6, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-6.0f, 0.0f, -6.0f, 12, 2, 12, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -2.0f, 0.0f);
        this.bodyModel[1].addBox(5.0f, 0.0f, 5.0f, 1, 10, 1, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addBox(-6.0f, 0.0f, 5.0f, 1, 10, 1, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addBox(-6.0f, 0.0f, -6.0f, 1, 10, 1, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addBox(5.0f, 0.0f, -6.0f, 1, 10, 1, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(-6.0f, -14.0f, 5.0f);
        this.bodyModel[6].addBox(-6.0f, -14.0f, -6.0f, 1, 12, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addBox(-6.0f, -14.0f, -5.0f, 1, 6, 10, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
