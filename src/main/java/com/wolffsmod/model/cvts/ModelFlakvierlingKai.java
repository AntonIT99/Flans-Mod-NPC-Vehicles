//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelFlakvierlingKai extends ModelVehicle
{
    public ModelFlakvierlingKai() {
        (this.bodyModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, 128, 64);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 18, 128, 64);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 18, 128, 64);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 18, 128, 64);
        this.bodyModel[0].addBox(-4.0f, 8.0f, -4.0f, 8, 2, 8, 0.0f);
        this.bodyModel[1].addBox(-20.0f, -4.0f, -4.0f, 8, 4, 8, 0.0f);
        this.bodyModel[2].addBox(4.0f, -4.0f, 8.0f, 8, 4, 8, 0.0f);
        this.bodyModel[3].addBox(4.0f, -4.0f, -16.0f, 8, 4, 8, 0.0f);
        (this.turretModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 0, 30, 128, 64);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 96, 0, 128, 64);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 96, 0, 128, 64);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 48, 128, 64);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 48, 128, 64);
        this.turretModel[0].addBox(-8.0f, -6.0f, -8.0f, 16, 2, 16, 0.0f);
        this.turretModel[1].addBox(6.0f, -26.0f, -20.0f, 2, 20, 14, 0.0f);
        this.turretModel[2].addBox(6.0f, -26.0f, 6.0f, 2, 20, 14, 0.0f);
        this.turretModel[3].addBox(-12.0f, -10.0f, 4.0f, 12, 1, 12, 0.0f);
        this.turretModel[4].addBox(-8.0f, -9.0f, 5.0f, 2, 3, 2, 0.0f);
        (this.barrelModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 48, 18, 128, 64);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 64, 0, 128, 64);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 64, 0, 128, 64);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 64, 0, 128, 64);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 64, 0, 128, 64);
        this.barrelModel[0].addBox(0.0f, 0.0f, 0.0f, 12, 12, 12, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -16.0f, -6.0f);
        this.barrelModel[1].addBox(12.0f, 1.0f, 1.0f, 20, 2, 2, 0.0f);
        this.barrelModel[1].setRotationPoint(0.0f, -16.0f, -6.0f);
        this.barrelModel[2].addBox(12.0f, 9.0f, 1.0f, 20, 2, 2, 0.0f);
        this.barrelModel[2].setRotationPoint(0.0f, -16.0f, -6.0f);
        this.barrelModel[3].addBox(12.0f, 1.0f, 9.0f, 20, 2, 2, 0.0f);
        this.barrelModel[3].setRotationPoint(0.0f, -16.0f, -6.0f);
        this.barrelModel[4].addBox(12.0f, 9.0f, 9.0f, 20, 2, 2, 0.0f);
        this.barrelModel[4].setRotationPoint(0.0f, -16.0f, -6.0f);
        this.translateAll(0.0f, 10.0f, 0.0f);
        this.flipAll();
    }
}
