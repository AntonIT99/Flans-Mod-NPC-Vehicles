//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelStorageBox extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelStorageBox() {
        this.textureX = 128;
        this.textureY = 128;
        (this.bodyModel = new ModelRendererTurbo[26])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 37, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 62, 68, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 65, 0, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 40, 35, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 13, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 13, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 13, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 13, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 6, 26, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 6, 26, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 6, 26, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 6, 25, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-8.0f, 9.0f, -23.0f, 16, 1, 32, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addBox(-7.5f, -5.0f, -22.5f, 1, 14, 31, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addBox(6.5f, -5.0f, -22.5f, 1, 14, 31, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addBox(-6.5f, -5.0f, -22.5f, 13, 14, 1, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addBox(-6.5f, -5.0f, 7.5f, 13, 14, 1, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addBox(-14.0f, 8.0f, -22.5f, 13, 0, 30, 0.0f);
        this.bodyModel[5].setRotationPoint(7.5f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-7.75f, 8.0f, -22.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 29.25f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-7.75f, -5.0f, -22.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 29.25f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(6.75f, 8.0f, -22.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 29.25f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(6.75f, -5.0f, -22.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 29.25f, 0.0f, 0.0f, 29.25f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-6.5f, 8.0f, 7.75f, 2, 1, 1, 0.0f, 0.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-6.5f, -5.0f, 7.75f, 2, 1, 1, 0.0f, 0.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-6.5f, 8.0f, -22.75f, 2, 1, 1, 0.0f, 0.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-6.5f, -5.0f, -22.75f, 2, 1, 1, 0.0f, 0.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 11.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-7.75f, -4.0f, 7.75f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(6.75f, -4.0f, 7.75f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-7.75f, -4.0f, -22.75f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(6.75f, -4.0f, -22.75f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-0.5f, -4.0f, 7.75f, 1, 2, 1, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, -0.1f, 10.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-0.5f, -4.0f, -22.75f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-7.75f, -4.0f, -7.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-7.75f, -4.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-7.75f, -4.0f, -15.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(6.75f, -4.0f, -7.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(6.75f, -4.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(6.75f, -4.0f, -15.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.bodyDoorOpenModel = new ModelRendererTurbo[16])[0] = new ModelRendererTurbo((ModelBase)this, 0, 83, this.textureX, this.textureY);
        this.bodyDoorOpenModel[1] = new ModelRendererTurbo((ModelBase)this, 6, 17, this.textureX, this.textureY);
        this.bodyDoorOpenModel[2] = new ModelRendererTurbo((ModelBase)this, 6, 17, this.textureX, this.textureY);
        this.bodyDoorOpenModel[3] = new ModelRendererTurbo((ModelBase)this, 6, 17, this.textureX, this.textureY);
        this.bodyDoorOpenModel[4] = new ModelRendererTurbo((ModelBase)this, 6, 17, this.textureX, this.textureY);
        this.bodyDoorOpenModel[5] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[6] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[7] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[8] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[9] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[10] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[11] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[12] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[13] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[14] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[15] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorOpenModel[0].addShapeBox(-15.25f, -4.25f, -22.5f, 15, 4, 31, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[0].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[1].addShapeBox(-14.5f, -4.5f, 6.75f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.5f, -1.0f, -1.0f, 1.5f, -1.0f, -1.0f, 1.5f, 1.0f, 1.0f, 1.5f, 1.0f);
        this.bodyDoorOpenModel[1].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[2].addShapeBox(-2.0f, -4.5f, 6.75f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.5f, -1.0f, 1.0f, 1.5f, -1.0f, 1.0f, 1.5f, 1.0f, -1.0f, 1.5f, 1.0f);
        this.bodyDoorOpenModel[2].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[3].addShapeBox(-14.5f, -4.5f, -21.75f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.5f, 1.0f, -1.0f, 1.5f, 1.0f, -1.0f, 1.5f, -1.0f, 1.0f, 1.5f, -1.0f);
        this.bodyDoorOpenModel[3].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[4].addShapeBox(-2.0f, -4.5f, -21.75f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.5f, 1.0f, 1.0f, 1.5f, 1.0f, 1.0f, 1.5f, -1.0f, -1.0f, 1.5f, -1.0f);
        this.bodyDoorOpenModel[4].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[5].addShapeBox(-2.0f, -4.5f, -21.75f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 26.5f, 0.0f, 0.0f, 26.5f, -0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 26.7275f, -0.2275f, 0.0f, 26.7275f);
        this.bodyDoorOpenModel[5].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorOpenModel[6].addShapeBox(-1.25f, -1.0f, -22.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 28.0f, -0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 28.2275f, -0.2275f, 0.0f, 28.2275f);
        this.bodyDoorOpenModel[6].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorOpenModel[7].addShapeBox(-14.5f, -4.5f, -21.75f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 26.5f, 0.0f, 0.0f, 26.5f, 0.2275f, 0.0f, 0.2275f, -0.2275f, 0.0f, 0.2275f, -0.2275f, 0.0f, 26.7275f, 0.2275f, 0.0f, 26.7275f);
        this.bodyDoorOpenModel[7].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorOpenModel[8].addShapeBox(-15.25f, -1.0f, -22.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 28.0f, 0.2275f, 0.0f, 0.2275f, -0.2275f, 0.0f, 0.2275f, -0.2275f, 0.0f, 28.2275f, 0.2275f, 0.0f, 28.2275f);
        this.bodyDoorOpenModel[8].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorOpenModel[9].addShapeBox(-3.0f, -4.5f, 6.75f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, -0.2275f, 0.2275f, 0.0f, -0.2275f, 0.2275f, 0.0f, 0.2275f, 10.7275f, 0.0f, 0.2275f);
        this.bodyDoorOpenModel[9].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[10].addShapeBox(-2.25f, -1.0f, 6.5f, 1, 1, 1, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.2275f, 0.0f, -0.2275f, 0.2275f, 0.0f, -0.2275f, 0.2275f, 0.0f, 0.2275f, 12.2275f, 0.0f, 0.2275f);
        this.bodyDoorOpenModel[10].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorOpenModel[11].addShapeBox(-3.0f, -4.5f, -21.75f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, -0.2275f, 10.7275f, 0.0f, -0.2275f);
        this.bodyDoorOpenModel[11].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[12].addShapeBox(-2.25f, -1.0f, -23.5f, 1, 1, 1, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, -0.2275f, 12.2275f, 0.0f, -0.2275f);
        this.bodyDoorOpenModel[12].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorOpenModel[13].addShapeBox(-3.0f, -4.5f, -0.5f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 10.7275f, 0.0f, 0.2275f);
        this.bodyDoorOpenModel[13].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[14].addShapeBox(-3.0f, -4.5f, -14.5f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 10.7275f, 0.0f, 0.2275f);
        this.bodyDoorOpenModel[14].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorOpenModel[15].addShapeBox(-3.0f, -4.5f, -7.5f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 10.7275f, 0.0f, 0.2275f);
        this.bodyDoorOpenModel[15].setRotationPoint(7.75f, -5.0f, 0.0f);
        (this.bodyDoorCloseModel = new ModelRendererTurbo[18])[0] = new ModelRendererTurbo((ModelBase)this, 0, 83, this.textureX, this.textureY);
        this.bodyDoorCloseModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[3] = new ModelRendererTurbo((ModelBase)this, 6, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[4] = new ModelRendererTurbo((ModelBase)this, 6, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[5] = new ModelRendererTurbo((ModelBase)this, 6, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[6] = new ModelRendererTurbo((ModelBase)this, 6, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[7] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[8] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[9] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[10] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[11] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[12] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[13] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[14] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[15] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[16] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[17] = new ModelRendererTurbo((ModelBase)this, 20, 26, this.textureX, this.textureY);
        this.bodyDoorCloseModel[0].addShapeBox(-15.25f, -4.25f, -22.5f, 15, 4, 31, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[0].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[0].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[1].addBox(-6.5f, -21.0f, 6.0f, 1, 6, 1, 0.0f);
        this.bodyDoorCloseModel[1].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.bodyDoorCloseModel[2].addBox(-6.5f, -21.0f, -21.0f, 1, 6, 1, 0.0f);
        this.bodyDoorCloseModel[2].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.bodyDoorCloseModel[3].addShapeBox(-14.5f, -4.5f, 6.75f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.5f, -1.0f, -1.0f, 1.5f, -1.0f, -1.0f, 1.5f, 1.0f, 1.0f, 1.5f, 1.0f);
        this.bodyDoorCloseModel[3].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[3].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[4].addShapeBox(-2.0f, -4.5f, 6.75f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.5f, -1.0f, 1.0f, 1.5f, -1.0f, 1.0f, 1.5f, 1.0f, -1.0f, 1.5f, 1.0f);
        this.bodyDoorCloseModel[4].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[4].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[5].addShapeBox(-14.5f, -4.5f, -21.75f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.5f, 1.0f, -1.0f, 1.5f, 1.0f, -1.0f, 1.5f, -1.0f, 1.0f, 1.5f, -1.0f);
        this.bodyDoorCloseModel[5].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[5].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[6].addShapeBox(-2.0f, -4.5f, -21.75f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.5f, 1.0f, 1.0f, 1.5f, 1.0f, 1.0f, 1.5f, -1.0f, -1.0f, 1.5f, -1.0f);
        this.bodyDoorCloseModel[6].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[6].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[7].addShapeBox(-2.0f, -4.5f, -21.75f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 26.5f, 0.0f, 0.0f, 26.5f, -0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 26.7275f, -0.2275f, 0.0f, 26.7275f);
        this.bodyDoorCloseModel[7].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorCloseModel[7].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[8].addShapeBox(-1.25f, -1.0f, -22.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 28.0f, -0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 28.2275f, -0.2275f, 0.0f, 28.2275f);
        this.bodyDoorCloseModel[8].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorCloseModel[8].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[9].addShapeBox(-14.5f, -4.5f, -21.75f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 26.5f, 0.0f, 0.0f, 26.5f, 0.2275f, 0.0f, 0.2275f, -0.2275f, 0.0f, 0.2275f, -0.2275f, 0.0f, 26.7275f, 0.2275f, 0.0f, 26.7275f);
        this.bodyDoorCloseModel[9].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorCloseModel[9].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[10].addShapeBox(-15.25f, -1.0f, -22.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 28.0f, 0.2275f, 0.0f, 0.2275f, -0.2275f, 0.0f, 0.2275f, -0.2275f, 0.0f, 28.2275f, 0.2275f, 0.0f, 28.2275f);
        this.bodyDoorCloseModel[10].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorCloseModel[10].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[11].addShapeBox(-3.0f, -4.5f, 6.75f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, -0.2275f, 0.2275f, 0.0f, -0.2275f, 0.2275f, 0.0f, 0.2275f, 10.7275f, 0.0f, 0.2275f);
        this.bodyDoorCloseModel[11].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[11].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[12].addShapeBox(-2.25f, -1.0f, 6.5f, 1, 1, 1, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.2275f, 0.0f, -0.2275f, 0.2275f, 0.0f, -0.2275f, 0.2275f, 0.0f, 0.2275f, 12.2275f, 0.0f, 0.2275f);
        this.bodyDoorCloseModel[12].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorCloseModel[12].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[13].addShapeBox(-3.0f, -4.5f, -21.75f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, -0.2275f, 10.7275f, 0.0f, -0.2275f);
        this.bodyDoorCloseModel[13].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[13].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[14].addShapeBox(-2.25f, -1.0f, -23.5f, 1, 1, 1, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, -0.2275f, 12.2275f, 0.0f, -0.2275f);
        this.bodyDoorCloseModel[14].setRotationPoint(7.75f, -5.0f, 1.0f);
        this.bodyDoorCloseModel[14].rotateAngleZ = -0.27925268f;
        this.bodyDoorCloseModel[15].addShapeBox(-3.0f, -4.5f, -0.5f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 10.7275f, 0.0f, 0.2275f);
        this.bodyDoorCloseModel[15].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[15].rotateAngleZ = -0.2617994f;
        this.bodyDoorCloseModel[16].addShapeBox(-3.0f, -4.5f, -7.5f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 10.7275f, 0.0f, 0.2275f);
        this.bodyDoorCloseModel[16].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[16].rotateAngleZ = -0.2617994f;
        this.bodyDoorCloseModel[17].addShapeBox(-3.0f, -4.5f, -14.5f, 1, 1, 1, 0.0f, 10.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.5f, 0.0f, 0.0f, 10.7275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 0.2275f, 0.0f, 0.2275f, 10.7275f, 0.0f, 0.2275f);
        this.bodyDoorCloseModel[17].setRotationPoint(7.75f, -5.0f, 0.0f);
        this.bodyDoorCloseModel[17].rotateAngleZ = -0.2617994f;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
