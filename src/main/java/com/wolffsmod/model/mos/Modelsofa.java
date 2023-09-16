//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.mos;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class Modelsofa extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public Modelsofa() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 5, 170, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 198, 178, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 199, 164, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 133, 171, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 5, 74, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 107, 64, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 16, 8, 16, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, -6.0f, 0.0f, -12.0f, -6.0f, 0.0f, -12.0f, -6.0f, -12.0f, 0.0f, -6.0f, -12.0f);
        this.bodyModel[0].setRotationPoint(5.0f, 8.0f, 16.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 16, 8, 16, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, -6.0f, 0.0f, -12.0f, -6.0f, 0.0f, -12.0f, -6.0f, -12.0f, 0.0f, -6.0f, -12.0f);
        this.bodyModel[1].setRotationPoint(-7.0f, 8.0f, 16.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 16, 8, 16, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, -6.0f, 0.0f, -12.0f, -6.0f, 0.0f, -12.0f, -6.0f, -12.0f, 0.0f, -6.0f, -12.0f);
        this.bodyModel[2].setRotationPoint(-7.0f, 8.0f, -20.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 16, 8, 16, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, -6.0f, 0.0f, -12.0f, -6.0f, 0.0f, -12.0f, -6.0f, -12.0f, 0.0f, -6.0f, -12.0f);
        this.bodyModel[3].setRotationPoint(5.0f, 8.0f, -20.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 17, 4, 42, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(-7.0f, 4.0f, -21.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 17, 7, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-7.0f, -3.0f, -21.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 17, 7, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(-7.0f, -3.0f, 18.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 7, 36, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(-7.0f, -3.0f, -18.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 13, 3, 36, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(-4.0f, 1.0f, -18.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 3, 11, 36, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-5.0f, -9.0f, -18.0f);
        this.bodyModel[9].rotateAngleZ = 0.13962634f;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
