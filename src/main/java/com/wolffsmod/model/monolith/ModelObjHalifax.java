//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelObjHalifax extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelObjHalifax() {
        this.textureX = 84;
        this.textureY = 101;
        this.bodyModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        (this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 444, 174, this.textureX, this.textureY)).addObj("/Tyrants and Plebeians/assets/flansmod/models/Halifax3.obj");
        this.bodyModel[0].setRotationPoint(0.0f, -0.3f, 0.0f);
    }
}
