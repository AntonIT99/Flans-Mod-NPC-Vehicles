//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.moneybuster;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelMortaio35 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelMortaio35() {
        this.textureX = 512;
        this.textureY = 512;
        (this.turretModel = new ModelRendererTurbo[20])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.turretModel[9] = new ModelRendererTurbo((ModelBase)this, 281, 1, this.textureX, this.textureY);
        this.turretModel[10] = new ModelRendererTurbo((ModelBase)this, 337, 1, this.textureX, this.textureY);
        this.turretModel[11] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.turretModel[12] = new ModelRendererTurbo((ModelBase)this, 449, 1, this.textureX, this.textureY);
        this.turretModel[13] = new ModelRendererTurbo((ModelBase)this, 121, 9, this.textureX, this.textureY);
        this.turretModel[14] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.turretModel[15] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.turretModel[16] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY);
        this.turretModel[17] = new ModelRendererTurbo((ModelBase)this, 81, 9, this.textureX, this.textureY);
        this.turretModel[18] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.turretModel[19] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.turretModel[0].addBox(0.0f, 0.0f, -3.0f, 9, 1, 9, 0.0f);
        this.turretModel[0].setRotationPoint(-1.0f, 9.0f, 0.0f);
        this.turretModel[1].addShapeBox(0.0f, 0.0f, -3.0f, 1, 1, 9, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.turretModel[1].setRotationPoint(-2.0f, 9.0f, 0.0f);
        this.turretModel[2].addShapeBox(0.0f, 0.0f, -3.0f, 9, 1, 1, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[2].setRotationPoint(-1.0f, 9.0f, -1.0f);
        this.turretModel[3].addShapeBox(0.0f, 0.0f, -3.0f, 9, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.turretModel[3].setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.turretModel[4].addShapeBox(0.0f, 0.0f, -3.0f, 1, 1, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[4].setRotationPoint(8.0f, 9.0f, 0.0f);
        this.turretModel[5].addBox(0.0f, 0.0f, -3.0f, 2, 1, 1, 0.0f);
        this.turretModel[5].setRotationPoint(3.25f, 9.0f, 4.0f);
        this.turretModel[5].rotateAngleZ = 1.2042772f;
        this.turretModel[6].addShapeBox(0.0f, 0.0f, -3.0f, 24, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f);
        this.turretModel[6].setRotationPoint(3.0f, 7.0f, 4.0f);
        this.turretModel[6].rotateAngleZ = 1.2042772f;
        this.turretModel[7].addShapeBox(0.0f, 0.0f, -2.0f, 24, 1, 1, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[7].setRotationPoint(3.0f, 7.0f, 4.0f);
        this.turretModel[7].rotateAngleZ = 1.2042772f;
        this.turretModel[8].addShapeBox(0.0f, 1.0f, -2.0f, 24, 1, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[8].setRotationPoint(3.0f, 7.0f, 4.0f);
        this.turretModel[8].rotateAngleZ = 1.2042772f;
        this.turretModel[9].addShapeBox(0.0f, 2.0f, -2.0f, 24, 1, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.turretModel[9].setRotationPoint(3.0f, 7.0f, 4.0f);
        this.turretModel[9].rotateAngleZ = 1.2042772f;
        this.turretModel[10].addShapeBox(0.0f, 2.0f, -3.0f, 24, 1, 1, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[10].setRotationPoint(3.0f, 7.0f, 4.0f);
        this.turretModel[10].rotateAngleZ = 1.2042772f;
        this.turretModel[11].addShapeBox(0.0f, 2.0f, -4.0f, 24, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f);
        this.turretModel[11].setRotationPoint(3.0f, 7.0f, 4.0f);
        this.turretModel[11].rotateAngleZ = 1.2042772f;
        this.turretModel[12].addShapeBox(0.0f, 1.0f, -4.0f, 24, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f);
        this.turretModel[12].setRotationPoint(3.0f, 7.0f, 4.0f);
        this.turretModel[12].rotateAngleZ = 1.2042772f;
        this.turretModel[13].addShapeBox(0.0f, 0.0f, -4.0f, 24, 1, 1, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f);
        this.turretModel[13].setRotationPoint(3.0f, 7.0f, 4.0f);
        this.turretModel[13].rotateAngleZ = 1.2042772f;
        this.turretModel[14].addBox(0.0f, 0.0f, -3.0f, 2, 1, 2, 0.0f);
        this.turretModel[14].setRotationPoint(12.0f, 9.0f, 1.5f);
        this.turretModel[15].addBox(0.0f, 0.0f, -3.0f, 2, 1, 2, 0.0f);
        this.turretModel[15].setRotationPoint(12.0f, 9.0f, 5.5f);
        this.turretModel[16].addShapeBox(0.0f, 0.0f, -3.0f, 2, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.turretModel[16].setRotationPoint(11.0f, -8.0f, 4.0f);
        this.turretModel[17].addShapeBox(0.5f, 6.0f, -2.0f, 2, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f);
        this.turretModel[17].setRotationPoint(11.0f, -8.0f, 4.0f);
        this.turretModel[18].addShapeBox(0.5f, 6.0f, -5.0f, 2, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f);
        this.turretModel[18].setRotationPoint(11.0f, -8.0f, 5.0f);
        this.turretModel[19].addBox(0.0f, 0.0f, -3.0f, 1, 0, 3, 0.0f);
        this.turretModel[19].setRotationPoint(12.25f, 6.0f, 3.0f);
        this.translateAll(6.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
