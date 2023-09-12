//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.mos;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class Modelradio extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public Modelradio() {
        this.textureX = 128;
        this.textureY = 32;
        (this.bodyModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 9, 4, 3, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.6f, -0.75f, 0.0f, -0.6f, -0.75f);
        this.bodyModel[1].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 3.0f, 0.0f, 9, 1, 1, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.6f, -0.75f, 0.0f, -0.6f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f);
        this.bodyModel[2].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.6f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.6f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f);
        this.bodyModel[3].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[4].addShapeBox(8.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, -0.6f, 0.0f, -0.75f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, -0.6f, 0.0f, -0.75f);
        this.bodyModel[4].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[5].addShapeBox(6.0f, 0.6f, 0.0f, 2, 2, 1, 0.0f, -0.05f, -0.05f, -0.05f, -0.05f, -0.05f, -0.05f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, -0.05f, -0.05f, -0.05f, -0.05f, -0.05f, -0.05f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f);
        this.bodyModel[5].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[6].addShapeBox(6.5f, 2.6f, -0.15f, 1, 1, 1, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.1f, -0.1f, -0.6f, -0.1f, -0.1f, -0.6f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.1f, -0.1f, -0.6f, -0.1f, -0.1f, -0.6f);
        this.bodyModel[6].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[7].addShapeBox(1.6f, 1.5f, -0.15f, 1, 1, 1, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.1f, -0.1f, -0.6f, -0.1f, -0.1f, -0.6f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.1f, -0.1f, -0.6f, -0.1f, -0.1f, -0.6f);
        this.bodyModel[7].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.6f, 1.5f, 0.1f, 3, 1, 1, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f);
        this.bodyModel[8].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.6f, 0.7f, 0.1f, 3, 1, 1, 0.0f, -1.1f, -0.1f, 0.0f, -1.1f, -0.1f, 0.0f, -1.1f, -0.1f, 0.0f, -1.1f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f);
        this.bodyModel[9].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.6f, 2.3f, 0.1f, 3, 1, 1, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -1.1f, -0.1f, 0.0f, -1.1f, -0.1f, 0.0f, -1.1f, -0.1f, 0.0f, -1.1f, -0.1f, 0.0f);
        this.bodyModel[10].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[11].addShapeBox(7.25f, -1.0f, 0.25f, 1, 1, 1, 0.0f, -0.5f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.bodyModel[11].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[12].addShapeBox(6.7f, -1.0f, 0.25f, 1, 1, 1, 0.0f, -0.5f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.bodyModel[12].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[13].addShapeBox(6.15f, -1.0f, 0.25f, 1, 1, 1, 0.0f, -0.5f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.bodyModel[13].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[14].addShapeBox(5.6f, -1.0f, 0.25f, 1, 1, 1, 0.0f, -0.5f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.bodyModel[14].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[15].addShapeBox(0.0f, -1.5f, 1.5f, 9, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, -0.7f, 0.0f, -0.7f, -0.7f);
        this.bodyModel[15].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-0.3f, -1.5f, 1.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, -0.7f, -0.7f, 0.0f, -0.7f, -0.7f, -0.7f, 0.0f, -0.7f, -0.7f);
        this.bodyModel[16].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[17].addShapeBox(9.0f, -1.5f, 1.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, -0.7f, -0.7f, 0.0f, -0.7f, -0.7f, -0.7f, 0.0f, -0.7f, -0.7f);
        this.bodyModel[17].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.bodyModel[18].addShapeBox(0.5f, -0.25f, 2.25f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, -2.2f, -0.7f, 0.0f, -0.7f, -0.7f);
        this.bodyModel[18].setRotationPoint(-3.5f, 6.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
