//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelCrappyBikeFix extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelCrappyBikeFix() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[18])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 249, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 361, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[0].setRotationPoint(-12.0f, 3.0f, -1.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-3.0f, -3.0f, -0.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, -1.0f, 0.0f, 6.0f, 1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, -1.0f, 0.0f, -6.0f, 1.0f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[2].setRotationPoint(-12.0f, 3.0f, -1.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 3.0f, -0.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(-3.0f, -2.5f, -0.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-12.0f, 3.0f, 0.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 6.0f, 1.0f, 0.0f, 6.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -6.0f, 1.0f, 0.0f, -6.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(-12.0f, 3.0f, 0.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[7].setRotationPoint(-14.0f, -3.0f, -0.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[8].setRotationPoint(-14.0f, 9.0f, -0.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[9].setRotationPoint(-18.0f, 1.0f, -0.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f);
        this.bodyModel[10].setRotationPoint(-14.0f, -3.0f, -0.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[11].setRotationPoint(-6.0f, 1.0f, -0.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f);
        this.bodyModel[12].setRotationPoint(-10.0f, -3.0f, -0.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[13].setRotationPoint(-14.0f, 6.0f, -0.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[14].setRotationPoint(-10.0f, 6.0f, -0.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(-12.0f, 3.0f, -1.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(-3.0f, -4.5f, -0.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-5.0f, -6.0f, -2.0f);
        (this.leftFrontWheelModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 281, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 297, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[8] = new ModelRendererTurbo((ModelBase)this, 337, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[10] = new ModelRendererTurbo((ModelBase)this, 353, 1, this.textureX, this.textureY);
        this.leftFrontWheelModel[0].addShapeBox(0.0f, -5.0f, -0.5f, 1, 6, 1, 0.0f, 2.1f, 0.0f, 0.1f, -1.9f, 0.0f, 0.1f, -1.9f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, -1.9f, 8.0f, 0.1f, 2.1f, 8.0f, 0.1f, 2.1f, 8.0f, 0.1f, -1.9f, 8.0f, 0.1f);
        this.leftFrontWheelModel[0].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[1].addShapeBox(0.0f, 2.0f, -0.5f, 5, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.leftFrontWheelModel[1].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[2].addShapeBox(4.0f, 2.0f, -0.5f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f);
        this.leftFrontWheelModel[2].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[3].addShapeBox(8.0f, 6.0f, -0.5f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.leftFrontWheelModel[3].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[4].addShapeBox(4.0f, 11.0f, -0.5f, 1, 4, 1, 0.0f, -4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.leftFrontWheelModel[4].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[5].addShapeBox(0.0f, 14.0f, -0.5f, 5, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.leftFrontWheelModel[5].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[6].addShapeBox(0.0f, 11.0f, -0.5f, 1, 4, 1, 0.0f, 4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.leftFrontWheelModel[6].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[7].addShapeBox(-4.0f, 6.0f, -0.5f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.leftFrontWheelModel[7].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[8].addShapeBox(0.0f, 2.0f, -0.5f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 4.0f, 0.0f, -0.2f);
        this.leftFrontWheelModel[8].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[9].addShapeBox(-2.0f, -5.0f, -5.5f, 1, 1, 11, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftFrontWheelModel[9].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.leftFrontWheelModel[10].addShapeBox(-0.8f, -4.0f, -0.5f, 1, 2, 1, 0.0f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f);
        this.leftFrontWheelModel[10].setRotationPoint(9.0f, -5.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
