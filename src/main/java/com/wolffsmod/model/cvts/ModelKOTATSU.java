//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelKOTATSU extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelKOTATSU() {
        this.textureX = 128;
        this.textureY = 128;
        (this.bodyModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 0, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 0, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 73, 0, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 26, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 26, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 26, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 26, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 26, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 26, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 25, 26, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 26, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 45, 41, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-12.0f, 0.0f, -12.0f, 24, 1, 24, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -2.0f, 0.0f);
        this.bodyModel[1].addBox(-1.0f, 0.0f, -1.0f, 2, 11, 2, 0.0f);
        this.bodyModel[1].setRotationPoint(-11.0f, -1.0f, -11.0f);
        this.bodyModel[2].addBox(-1.0f, 0.0f, -1.0f, 2, 11, 2, 0.0f);
        this.bodyModel[2].setRotationPoint(11.0f, -1.0f, -11.0f);
        this.bodyModel[3].addBox(-1.0f, 0.0f, -1.0f, 2, 11, 2, 0.0f);
        this.bodyModel[3].setRotationPoint(11.0f, -1.0f, 11.0f);
        this.bodyModel[4].addBox(-1.0f, 0.0f, -1.0f, 2, 11, 2, 0.0f);
        this.bodyModel[4].setRotationPoint(-11.0f, -1.0f, 11.0f);
        this.bodyModel[5].addBox(-1.0f, -0.5f, -10.0f, 2, 1, 20, 0.0f);
        this.bodyModel[5].setRotationPoint(-11.0f, -0.5f, 0.0f);
        this.bodyModel[6].addBox(-1.0f, -0.5f, -10.0f, 2, 1, 20, 0.0f);
        this.bodyModel[6].setRotationPoint(11.0f, -0.5f, 0.0f);
        this.bodyModel[7].addBox(-10.0f, -0.5f, -1.0f, 20, 1, 2, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, -0.5f, -11.0f);
        this.bodyModel[8].addBox(-10.0f, -0.5f, -1.0f, 20, 1, 2, 0.0f);
        this.bodyModel[8].setRotationPoint(0.0f, -0.5f, 11.0f);
        this.bodyModel[9].addBox(-1.0f, -0.5f, -10.0f, 2, 1, 20, 0.0f);
        this.bodyModel[9].setRotationPoint(-4.0f, -0.5f, 0.0f);
        this.bodyModel[10].addBox(-1.0f, -0.5f, -10.0f, 2, 1, 20, 0.0f);
        this.bodyModel[10].setRotationPoint(4.0f, -0.5f, 0.0f);
        this.bodyModel[11].addBox(-10.0f, -0.5f, -1.0f, 20, 1, 2, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, -0.5f, -4.0f);
        this.bodyModel[12].addBox(-10.0f, -0.5f, -1.0f, 20, 1, 2, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, -0.5f, 4.0f);
        this.bodyModel[13].addBox(-3.0f, 0.0f, -3.0f, 6, 0, 6, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.bodyDoorCloseModel = new ModelRendererTurbo[16])[0] = new ModelRendererTurbo((ModelBase)this, 70, 25, this.textureX, this.textureY);
        this.bodyDoorCloseModel[1] = new ModelRendererTurbo((ModelBase)this, 70, 25, this.textureX, this.textureY);
        this.bodyDoorCloseModel[2] = new ModelRendererTurbo((ModelBase)this, 95, 37, this.textureX, this.textureY);
        this.bodyDoorCloseModel[3] = new ModelRendererTurbo((ModelBase)this, 95, 37, this.textureX, this.textureY);
        this.bodyDoorCloseModel[4] = new ModelRendererTurbo((ModelBase)this, 95, 37, this.textureX, this.textureY);
        this.bodyDoorCloseModel[5] = new ModelRendererTurbo((ModelBase)this, 95, 37, this.textureX, this.textureY);
        this.bodyDoorCloseModel[6] = new ModelRendererTurbo((ModelBase)this, 70, 25, this.textureX, this.textureY);
        this.bodyDoorCloseModel[7] = new ModelRendererTurbo((ModelBase)this, 70, 25, this.textureX, this.textureY);
        this.bodyDoorCloseModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 49, this.textureX, this.textureY);
        this.bodyDoorCloseModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 49, this.textureX, this.textureY);
        this.bodyDoorCloseModel[10] = new ModelRendererTurbo((ModelBase)this, 27, 62, this.textureX, this.textureY);
        this.bodyDoorCloseModel[11] = new ModelRendererTurbo((ModelBase)this, 27, 62, this.textureX, this.textureY);
        this.bodyDoorCloseModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 49, this.textureX, this.textureY);
        this.bodyDoorCloseModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 49, this.textureX, this.textureY);
        this.bodyDoorCloseModel[14] = new ModelRendererTurbo((ModelBase)this, 27, 62, this.textureX, this.textureY);
        this.bodyDoorCloseModel[15] = new ModelRendererTurbo((ModelBase)this, 27, 62, this.textureX, this.textureY);
        this.bodyDoorCloseModel[0].addShapeBox(0.0f, 0.0f, -12.0f, 0, 10, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[0].setRotationPoint(12.0f, -1.0f, 0.0f);
        this.bodyDoorCloseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 0, 10, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 4.0f, -4.0f, 0.0f, 4.0f);
        this.bodyDoorCloseModel[1].setRotationPoint(12.0f, -1.0f, 0.0f);
        this.bodyDoorCloseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 12, 10, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, 4.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyDoorCloseModel[2].setRotationPoint(0.0f, -1.0f, -12.0f);
        this.bodyDoorCloseModel[3].addShapeBox(-12.0f, 0.0f, 0.0f, 12, 10, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -4.0f, 4.0f, 0.0f, -4.0f);
        this.bodyDoorCloseModel[3].setRotationPoint(0.0f, -1.0f, -12.0f);
        this.bodyDoorCloseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 12, 10, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 4.0f, 0.0f, -4.0f, 4.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f);
        this.bodyDoorCloseModel[4].setRotationPoint(0.0f, -1.0f, 12.0f);
        this.bodyDoorCloseModel[5].addShapeBox(-12.0f, 0.0f, 0.0f, 12, 10, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f);
        this.bodyDoorCloseModel[5].setRotationPoint(0.0f, -1.0f, 12.0f);
        this.bodyDoorCloseModel[6].addShapeBox(0.0f, 0.0f, -12.0f, 0, 10, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 4.0f, -4.0f, 0.0f, 4.0f, -4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[6].setRotationPoint(-12.0f, -1.0f, 0.0f);
        this.bodyDoorCloseModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 0, 10, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f);
        this.bodyDoorCloseModel[7].setRotationPoint(-12.0f, -1.0f, 0.0f);
        this.bodyDoorCloseModel[8].addShapeBox(0.0f, 0.0f, -13.0f, 0, 1, 13, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 9.0f, -6.0f, 0.0f, 9.0f, -6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[8].setRotationPoint(-16.0f, 9.0f, 0.0f);
        this.bodyDoorCloseModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 0, 1, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 9.0f, 6.0f, 0.0f, 9.0f);
        this.bodyDoorCloseModel[9].setRotationPoint(-16.0f, 9.0f, 0.0f);
        this.bodyDoorCloseModel[10].addShapeBox(-13.0f, 0.0f, 0.0f, 13, 1, 0, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, -6.0f, 9.0f, 0.0f, -6.0f);
        this.bodyDoorCloseModel[10].setRotationPoint(0.0f, 9.0f, -16.0f);
        this.bodyDoorCloseModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 0, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 9.0f, 0.0f, 6.0f, 9.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f);
        this.bodyDoorCloseModel[11].setRotationPoint(0.0f, 9.0f, -16.0f);
        this.bodyDoorCloseModel[12].addShapeBox(0.0f, 0.0f, -13.0f, 0, 1, 13, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 9.0f, 6.0f, 0.0f, 9.0f, 6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[12].setRotationPoint(16.0f, 9.0f, 0.0f);
        this.bodyDoorCloseModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 0, 1, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, -6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 9.0f, -6.0f, 0.0f, 9.0f);
        this.bodyDoorCloseModel[13].setRotationPoint(16.0f, 9.0f, 0.0f);
        this.bodyDoorCloseModel[14].addShapeBox(-13.0f, 0.0f, 0.0f, 13, 1, 0, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 9.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 6.0f, 9.0f, 0.0f, 6.0f);
        this.bodyDoorCloseModel[14].setRotationPoint(0.0f, 9.0f, 16.0f);
        this.bodyDoorCloseModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 0, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 9.0f, 0.0f, -6.0f, 9.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f);
        this.bodyDoorCloseModel[15].setRotationPoint(0.0f, 9.0f, 16.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
