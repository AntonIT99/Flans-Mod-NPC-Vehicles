//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelMoskit extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelMoskit() {
        this.textureX = 512;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[50];
        this.turretModel = new ModelRendererTurbo[2];
        this.barrelModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 100, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 281, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 473, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 265, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 305, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 329, 17, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 185, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 345, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 161, 9, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 241, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 265, 9, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 409, 9, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 289, 17, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 305, 17, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 393, 17, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 457, 9, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 417, 17, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 32, 5, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, -0.75f, -0.25f, 0.0f, -0.75f, -0.25f, -1.5f, -0.5f, 0.0f);
        this.bodyModel[0].setRotationPoint(-31.0f, 1.0f, -6.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 13, 4, 13, 0.0f, 0.0f, 0.5f, 0.0f, 3.0f, 2.0f, 0.0f, 3.0f, 2.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.25f, -0.25f, 3.0f, -1.25f, -0.75f, 3.0f, -1.25f, -0.75f, 0.0f, 0.25f, -0.25f);
        this.bodyModel[1].setRotationPoint(1.0f, 1.0f, -6.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.75f, 0.0f, 0.5f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, -0.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.75f, -0.75f);
        this.bodyModel[2].setRotationPoint(17.0f, -1.0f, -6.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 13, 0.0f, 0.0f, 0.5f, -0.75f, 0.0f, 0.75f, -2.0f, 0.0f, 0.75f, -2.0f, 0.0f, 0.5f, -0.75f, 0.0f, 0.0f, -1.75f, 0.0f, -1.0f, -3.75f, 0.0f, -1.0f, -3.75f, 0.0f, 0.0f, -1.75f);
        this.bodyModel[3].setRotationPoint(22.0f, -1.0f, -6.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 13, 0.0f, 0.0f, 0.75f, -2.0f, 0.0f, 0.75f, -4.0f, 0.0f, 0.75f, -4.0f, 0.0f, 0.75f, -2.0f, 0.0f, -1.0f, -3.75f, 0.0f, -1.5f, -5.5f, 0.0f, -1.5f, -5.5f, 0.0f, -1.0f, -3.75f);
        this.bodyModel[4].setRotationPoint(26.0f, -1.0f, -6.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 4, 0.0f, 0.0f, 0.75f, 0.5f, 0.5f, 0.75f, -1.75f, 0.5f, 0.75f, -1.75f, 0.0f, 0.75f, 0.5f, 0.0f, -1.5f, -1.0f, -0.75f, -1.75f, -1.75f, -0.75f, -1.75f, -1.75f, 0.0f, -1.5f, -1.0f);
        this.bodyModel[5].setRotationPoint(29.0f, -1.0f, -2.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 22, 2, 13, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, -0.33f, -0.17f, 0.0f, -0.33f, -0.17f, -1.5f, -0.5f, 0.0f, -16.75f, 0.0f, -4.75f, 0.0f, 0.25f, -3.75f, 0.0f, 0.25f, -3.75f, -16.75f, 0.0f, -4.75f);
        this.bodyModel[6].setRotationPoint(-31.0f, 5.0f, -6.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 12, 2, 13, 0.0f, 0.0f, -0.33f, -0.17f, -2.0f, -0.25f, -0.25f, -2.0f, -0.25f, -0.25f, 0.0f, -0.33f, -0.17f, 0.0f, 0.25f, -3.75f, -1.75f, 0.0f, -3.0f, -1.75f, 0.0f, -3.0f, 0.0f, 0.25f, -3.75f);
        this.bodyModel[7].setRotationPoint(-9.0f, 5.0f, -6.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 16, 2, 13, 0.0f, 0.0f, 0.25f, -0.25f, 0.0f, 1.75f, -0.75f, 0.0f, 1.75f, -0.75f, 0.0f, 0.25f, -0.25f, -0.25f, -0.5f, -3.0f, 0.0f, -0.25f, -3.75f, 0.0f, -0.25f, -3.75f, -0.25f, -0.5f, -3.0f);
        this.bodyModel[8].setRotationPoint(1.0f, 5.5f, -6.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 13, 0.0f, 0.0f, 0.25f, -0.75f, 0.0f, 1.0f, -1.75f, 0.0f, 1.0f, -1.75f, 0.0f, 0.25f, -0.75f, 0.0f, 0.25f, -3.75f, 0.0f, 0.5f, -5.0f, 0.0f, 0.5f, -5.0f, 0.0f, 0.25f, -3.75f);
        this.bodyModel[9].setRotationPoint(17.0f, 4.0f, -6.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 13, 0.0f, 0.0f, -1.0f, -1.75f, 0.0f, 0.0f, -3.75f, 0.0f, 0.0f, -3.75f, 0.0f, -1.0f, -1.75f, 0.0f, 1.5f, -5.0f, 0.0f, 0.0f, -5.75f, 0.0f, 0.0f, -5.75f, 0.0f, 1.5f, -5.0f);
        this.bodyModel[10].setRotationPoint(22.0f, 2.0f, -6.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 13, 0.0f, 0.0f, 0.0f, -3.75f, 0.0f, 0.5f, -5.5f, 0.0f, 0.5f, -5.5f, 0.0f, 0.0f, -3.75f, 0.0f, 1.0f, -5.75f, 0.0f, -2.0f, -6.0f, 0.0f, -2.0f, -6.0f, 0.0f, 1.0f, -5.75f);
        this.bodyModel[11].setRotationPoint(26.0f, 2.0f, -6.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 4, 0.0f, 0.0f, -0.5f, -1.0f, -0.75f, -0.25f, -1.75f, -0.75f, -0.25f, -1.75f, 0.0f, -0.5f, -1.0f, 0.0f, 1.0f, -1.5f, -1.25f, 0.1f, -1.75f, -1.25f, 0.1f, -1.75f, 0.0f, 1.0f, -1.5f);
        this.bodyModel[12].setRotationPoint(29.0f, 1.0f, -2.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 24, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(-22.0f, -3.0f, -2.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(2.0f, -3.0f, -2.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 6, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(5.0f, -3.0f, -3.0f);
        this.bodyModel[16].addShapeBox(0.0f, -1.0f, 0.0f, 4, 7, 8, 0.0f, 1.0f, 0.5f, 0.0f, -4.0f, 0.25f, -2.0f, -4.0f, 0.25f, -4.0f, 1.0f, 0.5f, -2.0f, 0.5f, 0.0f, 0.0f, -3.0f, -2.0f, -2.0f, -3.0f, -2.0f, -4.0f, 0.5f, -2.0f, -2.0f);
        this.bodyModel[16].setRotationPoint(11.0f, -3.0f, -3.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 4, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[17].setRotationPoint(3.0f, -5.5f, -2.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f);
        this.bodyModel[18].setRotationPoint(1.0f, -13.5f, -0.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-8.0f, -3.2f, 2.9f);
        this.bodyModel[19].rotateAngleZ = 0.17453294f;
        this.bodyModel[20].addShapeBox(0.0f, 1.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(-8.0f, -3.2f, 2.9f);
        this.bodyModel[20].rotateAngleZ = 0.17453294f;
        this.bodyModel[21].addShapeBox(0.0f, 2.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[21].setRotationPoint(-8.0f, -3.2f, 2.9f);
        this.bodyModel[21].rotateAngleZ = 0.17453294f;
        this.bodyModel[22].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[22].setRotationPoint(-6.0f, -4.2f, 2.9f);
        this.bodyModel[23].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[23].setRotationPoint(-2.5f, -4.2f, 2.9f);
        this.bodyModel[23].rotateAngleZ = 0.17453294f;
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(-29.0f, -1.0f, -1.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(-29.0f, -2.0f, -1.5f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[26].setRotationPoint(-29.0f, -3.0f, -1.5f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[27].setRotationPoint(-29.0f, -4.0f, -1.5f);
        this.bodyModel[28].addShapeBox(-3.5f, -0.5f, 0.0f, 4, 1, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.bodyModel[28].setRotationPoint(-27.5f, -2.7f, -0.5f);
        this.bodyModel[28].rotateAngleZ = -0.2617994f;
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(13.25f, -2.0f, -1.5f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(13.25f, -1.0f, -1.5f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(-20.5f, -6.0f, -1.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 4, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.bodyModel[32].setRotationPoint(-21.5f, -6.5f, -2.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[33].setRotationPoint(-20.5f, -8.0f, -1.0f);
        this.bodyModel[34].addShapeBox(-1.0f, -2.0f, 0.0f, 3, 2, 3, 0.0f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f);
        this.bodyModel[34].setRotationPoint(-19.5f, -7.5f, -1.5f);
        this.bodyModel[34].rotateAngleZ = 0.7679449f;
        this.bodyModel[35].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[35].setRotationPoint(-21.4f, -3.9f, 2.9f);
        this.bodyModel[35].rotateAngleZ = 0.17453294f;
        this.bodyModel[36].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[36].setRotationPoint(-24.9f, -3.9f, 2.9f);
        this.bodyModel[37].addShapeBox(0.0f, 2.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[37].setRotationPoint(-26.9f, -2.9f, 2.9f);
        this.bodyModel[37].rotateAngleZ = 0.17453294f;
        this.bodyModel[38].addShapeBox(0.0f, 1.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-26.9f, -2.9f, 2.9f);
        this.bodyModel[38].rotateAngleZ = 0.17453294f;
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(-26.9f, -2.9f, 2.9f);
        this.bodyModel[39].rotateAngleZ = 0.17453294f;
        this.bodyModel[40].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[40].setRotationPoint(-21.4f, -3.9f, -5.9f);
        this.bodyModel[40].rotateAngleZ = 0.17453294f;
        this.bodyModel[41].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[41].setRotationPoint(-24.9f, -3.9f, -5.9f);
        this.bodyModel[42].addShapeBox(0.0f, 2.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[42].setRotationPoint(-26.9f, -2.9f, -5.9f);
        this.bodyModel[42].rotateAngleZ = 0.17453294f;
        this.bodyModel[43].addShapeBox(0.0f, 1.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].setRotationPoint(-26.9f, -2.9f, -5.9f);
        this.bodyModel[43].rotateAngleZ = 0.17453294f;
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[44].setRotationPoint(-26.9f, -2.9f, -5.9f);
        this.bodyModel[44].rotateAngleZ = 0.17453294f;
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[45].setRotationPoint(-8.0f, -3.2f, -5.9f);
        this.bodyModel[45].rotateAngleZ = 0.17453294f;
        this.bodyModel[46].addShapeBox(0.0f, 1.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[46].setRotationPoint(-8.0f, -3.2f, -5.9f);
        this.bodyModel[46].rotateAngleZ = 0.17453294f;
        this.bodyModel[47].addShapeBox(0.0f, 2.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[47].setRotationPoint(-8.0f, -3.2f, -5.9f);
        this.bodyModel[47].rotateAngleZ = 0.17453294f;
        this.bodyModel[48].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[48].setRotationPoint(-6.0f, -4.2f, -5.9f);
        this.bodyModel[49].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[49].setRotationPoint(-2.5f, -4.2f, -5.9f);
        this.bodyModel[49].rotateAngleZ = 0.17453294f;
    }
    
    private void initturretModel_1() {
        this.turretModel[0] = new ModelRendererTurbo((ModelBase)this, 345, 9, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 393, 9, this.textureX, this.textureY);
        this.turretModel[0].addShapeBox(-1.5f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.turretModel[0].setRotationPoint(14.75f, -4.0f, -1.5f);
        this.turretModel[1].addShapeBox(-1.5f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.turretModel[1].setRotationPoint(14.75f, -3.0f, -1.5f);
    }
    
    private void initbarrelModel_1() {
        (this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 281, 9, this.textureX, this.textureY)).addShapeBox(0.0f, -0.5f, 0.0f, 4, 1, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.barrelModel[0].setRotationPoint(14.75f, -2.5f, -0.5f);
    }
}
