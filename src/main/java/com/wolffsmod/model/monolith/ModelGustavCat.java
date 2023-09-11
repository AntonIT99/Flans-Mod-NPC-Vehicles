//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGustavCat extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelGustavCat() {
        this.textureX = 690;
        this.textureY = 550;
        this.bodyModel = new ModelRendererTurbo[1];
        this.barrelModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        (this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY)).addObj("/Tyrants and Plebeians/assets/flansmod/models/GustavBodyFix.obj");
        this.bodyModel[0].setRotationPoint(0.0f, -0.5f, 0.0f);
    }
    
    private void initbarrelModel_1() {
        (this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY)).addObj("/Tyrants and Plebeians/assets/flansmod/models/GustavBarrelFix.obj");
        this.barrelModel[0].setRotationPoint(0.0f, 9.0f, 0.0f);
    }
}
