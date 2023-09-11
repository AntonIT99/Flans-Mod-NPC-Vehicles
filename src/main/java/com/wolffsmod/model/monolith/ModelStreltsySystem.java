//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelStreltsySystem extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelStreltsySystem() {
        this.textureX = 64;
        this.textureY = 64;
        this.turretModel = new ModelRendererTurbo[9];
        this.barrelModel = new ModelRendererTurbo[27];
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initturretModel_1() {
        this.turretModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.turretModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 26, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[0].setRotationPoint(-0.5f, -17.0f, -0.5f);
        this.turretModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.turretModel[1].setRotationPoint(-0.5f, -17.0f, -0.5f);
        this.turretModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f, 0.3f, -0.3f, 4.0f, -0.1f, -0.3f, 4.0f, -0.1f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f, 0.3f, -0.3f, 1.8f, -0.1f, -0.3f, 1.8f, -0.1f);
        this.turretModel[2].setRotationPoint(-0.5f, -17.0f, 0.7f);
        this.turretModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f, -0.3f, 0.4f, 0.1f, -0.3f, 0.4f, 0.1f, -0.4f, 0.4f, 0.3f, -0.4f, 0.4f, 0.3f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f);
        this.turretModel[3].setRotationPoint(-0.5f, -16.5f, 1.7f);
        this.turretModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.3f, 1.0f, 1.1f, -0.3f, 1.0f, 1.1f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f);
        this.turretModel[4].setRotationPoint(-0.5f, -10.5f, 1.7f);
        this.turretModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.turretModel[5].setRotationPoint(-0.5f, 9.0f, -0.5f);
        this.turretModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.4f, -2.0f, -0.1f, -0.4f, -2.0f, -0.1f, -0.3f, 0.4f, 0.1f, -0.3f, 0.4f, 0.1f, -0.4f, 0.4f, 0.3f, -0.4f, 0.4f, 0.3f);
        this.turretModel[6].setRotationPoint(-0.5f, -23.3f, 1.7f);
        this.turretModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 1.8f, 1.0f, -0.4f, 1.8f, 1.0f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.4f, -0.5f, 0.8f, -0.4f, -0.5f, 0.8f, -0.3f, 1.5f, 0.1f, -0.3f, 1.5f, 0.1f);
        this.turretModel[7].setRotationPoint(-0.5f, -23.3f, 0.7f);
        this.turretModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.turretModel[8].setRotationPoint(-0.5f, -22.3f, 0.7f);
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 17, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 9, 25, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase)this, 9, 41, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.barrelModel[14] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.barrelModel[15] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.barrelModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.barrelModel[17] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.barrelModel[18] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.barrelModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.barrelModel[20] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.barrelModel[21] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.barrelModel[22] = new ModelRendererTurbo((ModelBase)this, 57, 49, this.textureX, this.textureY);
        this.barrelModel[23] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.barrelModel[24] = new ModelRendererTurbo((ModelBase)this, 17, 57, this.textureX, this.textureY);
        this.barrelModel[25] = new ModelRendererTurbo((ModelBase)this, 25, 57, this.textureX, this.textureY);
        this.barrelModel[26] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.barrelModel[0].addShapeBox(-1.0f, -2.0f, -1.0f, 17, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[1].addShapeBox(-17.5f, -1.5f, -1.0f, 5, 2, 2, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, 1.5f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, 0.2f);
        this.barrelModel[1].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[2].addShapeBox(-8.0f, -0.5f, -1.0f, 7, 1, 2, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[2].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[3].addShapeBox(-4.0f, -2.4f, -0.5f, 26, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.barrelModel[3].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[4].addShapeBox(22.0f, -2.4f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[4].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[5].addShapeBox(-10.0f, -1.5f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[5].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[6].addShapeBox(16.0f, -2.0f, -1.0f, 5, 2, 2, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f, -0.8f, -0.3f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -0.8f, -0.3f);
        this.barrelModel[6].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[7].addShapeBox(16.0f, -1.3f, -0.5f, 8, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[7].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[8].addShapeBox(-9.0f, -1.0f, -1.2f, 7, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[8].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[9].addShapeBox(-5.8f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.barrelModel[9].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[10].addShapeBox(-6.0f, -3.4f, -0.5f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.barrelModel[10].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[10].rotateAngleZ = 0.7853982f;
        this.barrelModel[11].addShapeBox(-3.0f, -1.8f, -1.9f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.barrelModel[11].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[12].addShapeBox(-2.5f, -3.1f, -1.9f, 1, 1, 1, 0.0f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f);
        this.barrelModel[12].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[13].addShapeBox(-2.8f, -2.2f, -1.9f, 1, 1, 1, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.barrelModel[13].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[14].addShapeBox(-3.0f, -3.9f, -1.9f, 1, 1, 1, 0.0f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f);
        this.barrelModel[14].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[15].addShapeBox(-3.3f, -3.9f, -1.4f, 1, 1, 1, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f);
        this.barrelModel[15].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[16].addShapeBox(-8.0f, -2.4f, -0.5f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f);
        this.barrelModel[16].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[17].addShapeBox(-7.5f, -3.1f, -1.4f, 1, 1, 1, 0.0f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f);
        this.barrelModel[17].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[18].addShapeBox(-3.3f, -3.7f, -1.2f, 2, 1, 1, 0.0f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f);
        this.barrelModel[18].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[19].addShapeBox(-3.5f, -2.0f, -2.2f, 2, 1, 1, 0.0f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f);
        this.barrelModel[19].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[19].rotateAngleY = -0.54105204f;
        this.barrelModel[19].rotateAngleZ = -0.7679449f;
        this.barrelModel[20].addShapeBox(-1.0f, -2.5f, -1.7f, 1, 5, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.barrelModel[20].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[20].rotateAngleY = -0.27925268f;
        this.barrelModel[21].addShapeBox(-11.0f, -1.5f, -1.0f, 1, 2, 2, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[21].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[22].addShapeBox(-12.0f, -1.5f, -1.0f, 1, 2, 2, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f);
        this.barrelModel[22].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[23].addShapeBox(-19.5f, -1.5f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.3f, 0.0f, -0.5f, 2.5f, 0.0f, 0.0f, 1.5f, 0.2f, 0.0f, 1.5f, 0.2f, -0.5f, 2.5f, 0.0f);
        this.barrelModel[23].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[24].addShapeBox(-4.5f, 5.7f, -0.5f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.barrelModel[24].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[24].rotateAngleZ = -0.7853982f;
        this.barrelModel[25].addShapeBox(-7.5f, 0.5f, -0.5f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.barrelModel[25].setRotationPoint(0.0f, -17.0f, -0.5f);
        this.barrelModel[25].rotateAngleZ = -0.5235988f;
        this.barrelModel[26].addShapeBox(-7.3f, 0.5f, -0.5f, 4, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.barrelModel[26].setRotationPoint(-4.0f, -17.0f, -0.5f);
        this.barrelModel[26].rotateAngleZ = 0.17453294f;
    }
}
