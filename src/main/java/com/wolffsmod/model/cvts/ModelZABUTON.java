//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelZABUTON extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelZABUTON() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[1];
        (this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY)).addBox(-6.0f, 0.0f, -6.0f, 12, 3, 12, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, 7.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
