//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelObjType5 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelObjType5() {
        this.textureX = 84;
        this.textureY = 101;
        this.bodyModel = new ModelRendererTurbo[1];
        this.turretModel = new ModelRendererTurbo[1];
        this.barrelModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        (this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 444, 174, this.textureX, this.textureY)).addObj("/Tyrants and Plebeians/assets/flansmod/models/T5Hull.obj");
        this.bodyModel[0].setRotationPoint(0.4f, 4.3f, -0.2f);
    }
    
    private void initturretModel_1() {
        (this.turretModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY)).addObj("/Tyrants and Plebeians/assets/flansmod/models/T5TurretFix.obj");
        this.turretModel[0].setRotationPoint(0.0f, 5.15f, 0.0f);
    }
    
    private void initbarrelModel_1() {
        (this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 444, 174, this.textureX, this.textureY)).addObj("/Tyrants and Plebeians/assets/flansmod/models/T5Barrelfix.obj");
        this.barrelModel[0].setRotationPoint(0.5f, 1.7f, 0.0f);
    }
}
