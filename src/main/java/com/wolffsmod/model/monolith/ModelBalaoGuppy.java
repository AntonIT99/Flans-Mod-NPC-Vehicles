//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelBalaoGuppy extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelBalaoGuppy() {
        this.textureX = 512;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[36];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 409, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 153, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 281, 25, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 321, 25, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 353, 25, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 401, 33, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 161, 41, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 481, 33, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 209, 41, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 297, 49, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 401, 49, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 89, 57, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 153, 65, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 233, 65, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 281, 73, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 473, 65, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 57, 73, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 297, 41, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 153, 49, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 481, 49, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 13, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.5f, -6.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 7.5f, -6.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 20, 4, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 3.5f, -6.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 35, 3, 13, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, -1.0f, -4.0f, 0.0f, -1.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(20.0f, 0.5f, -6.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 35, 3, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[4].setRotationPoint(20.0f, 7.5f, -6.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 35, 4, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(20.0f, 3.5f, -6.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 13, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.75f, -4.5f, 0.0f, 0.75f, -4.5f, 0.0f, 0.0f, -1.75f, 0.0f, -0.5f, -4.0f, 0.0f, -1.75f, -5.25f, 0.0f, -1.75f, -5.25f, 0.0f, -0.5f, -4.0f);
        this.bodyModel[6].setRotationPoint(55.0f, 7.5f, -6.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 13, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.25f, -4.5f, 0.0f, 0.25f, -4.5f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, -0.75f, -4.5f, 0.0f, -0.75f, -4.5f, 0.0f, 0.0f, -1.75f);
        this.bodyModel[7].setRotationPoint(55.0f, 3.5f, -6.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 13, 0.0f, 0.0f, -1.0f, -4.0f, 0.0f, -1.5f, -5.0f, 0.0f, -1.5f, -5.0f, 0.0f, -1.0f, -4.0f, 0.0f, 0.0f, -1.75f, 0.0f, -0.25f, -4.5f, 0.0f, -0.25f, -4.5f, 0.0f, 0.0f, -1.75f);
        this.bodyModel[8].setRotationPoint(55.0f, 0.5f, -6.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 55, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(0.0f, -1.5f, -3.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 11, 8, 6, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, -1.0f, 0.0f, 0.25f, -1.0f, 0.0f, 0.25f, 0.0f);
        this.bodyModel[10].setRotationPoint(55.0f, -1.5f, -3.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -2.25f, 0.0f, 0.5f, -2.25f, 0.0f, 0.5f, -1.0f, 0.0f, 0.25f, -1.0f, -0.75f, -1.25f, -2.25f, -0.75f, -1.25f, -2.25f, 0.0f, 0.25f, -1.0f);
        this.bodyModel[11].setRotationPoint(66.0f, -1.5f, -3.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 8, 3, 13, 0.0f, 0.0f, 0.75f, -4.5f, -0.75f, 2.25f, -5.75f, -0.75f, 2.25f, -5.75f, 0.0f, 0.75f, -4.5f, 0.0f, -1.75f, -5.25f, -4.25f, -2.5f, -6.25f, -4.25f, -2.5f, -6.25f, 0.0f, -1.75f, -5.25f);
        this.bodyModel[12].setRotationPoint(66.0f, 7.5f, -6.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 6, 0.0f, 0.0f, 0.5f, -2.25f, 0.5f, -0.75f, -2.75f, 0.5f, -0.75f, -2.75f, 0.0f, 0.5f, -2.25f, 0.33f, 0.0f, -2.25f, 0.5f, 0.0f, -2.75f, 0.5f, 0.0f, -2.75f, 0.33f, 0.0f, -2.25f);
        this.bodyModel[13].setRotationPoint(74.0f, -1.5f, -3.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 32, 5, 6, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[14].setRotationPoint(-32.0f, -1.5f, -3.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 21, 5, 6, 0.0f, 0.0f, -0.25f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.25f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[15].setRotationPoint(-53.0f, -1.5f, -3.0f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 9, 5, 6, 0.0f, 0.0f, -0.5f, -2.0f, 0.0f, -0.25f, -1.0f, 0.0f, -0.25f, -1.0f, 0.0f, -0.5f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[16].setRotationPoint(-62.0f, -1.5f, -3.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 6, 0.0f, -0.5f, -1.0f, -2.75f, 0.0f, -0.5f, -2.0f, 0.0f, -0.5f, -2.0f, -0.5f, -1.0f, -2.75f, 1.5f, 0.0f, -2.75f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 1.5f, 0.0f, -2.75f);
        this.bodyModel[17].setRotationPoint(-65.0f, -1.5f, -3.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 37, 3, 13, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.75f);
        this.bodyModel[18].setRotationPoint(-37.0f, 0.5f, -6.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 37, 4, 13, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.75f);
        this.bodyModel[19].setRotationPoint(-37.0f, 3.5f, -6.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 37, 3, 13, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.75f, 0.0f, -0.5f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, -0.5f, -4.0f);
        this.bodyModel[20].setRotationPoint(-37.0f, 7.5f, -6.5f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 24, 3, 13, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -5.0f, 0.0f, -1.0f, -3.5f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, -1.0f, -3.5f);
        this.bodyModel[21].setRotationPoint(-61.0f, 0.5f, -6.5f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 24, 4, 13, 0.0f, 0.0f, 1.0f, -3.5f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 1.0f, -3.5f, 0.0f, -2.75f, -3.5f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, -2.75f, -3.5f);
        this.bodyModel[22].setRotationPoint(-61.0f, 3.5f, -6.5f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 24, 3, 13, 0.0f, 0.0f, 2.75f, -3.5f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 2.75f, -3.5f, 0.0f, -3.75f, -5.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, -3.75f, -5.0f);
        this.bodyModel[23].setRotationPoint(-61.0f, 7.5f, -6.5f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 14, 3, 13, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -6.0f, 1.25f, -1.25f, -5.5f, 0.0f, -1.0f, -3.5f, 0.0f, -1.0f, -3.5f, 1.25f, -1.25f, -5.5f);
        this.bodyModel[24].setRotationPoint(-75.0f, 0.5f, -6.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 14, 3, 13, 0.0f, 1.25f, -0.75f, -5.5f, 0.0f, -1.0f, -3.5f, 0.0f, -1.0f, -3.5f, 1.25f, -0.75f, -5.5f, 1.5f, -0.75f, -5.75f, 0.0f, 0.25f, -3.5f, 0.0f, 0.25f, -3.5f, 1.5f, -0.75f, -5.75f);
        this.bodyModel[25].setRotationPoint(-75.0f, 1.5f, -6.5f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 14, 3, 13, 0.0f, 1.5f, 0.75f, -5.75f, 0.0f, -0.25f, -3.5f, 0.0f, -0.25f, -3.5f, 1.5f, 0.75f, -5.75f, -5.5f, -1.75f, -5.25f, 0.0f, -0.75f, -4.75f, 0.0f, -0.75f, -4.75f, -5.5f, -1.75f, -5.25f);
        this.bodyModel[26].setRotationPoint(-75.0f, 4.5f, -6.5f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 12, 13, 4, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 1.5f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(12.0f, -14.5f, -2.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 1, 13, 4, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.25f, -1.25f, 0.0f, -0.25f, -1.25f, 0.0f, 0.0f, -0.5f, -0.25f, 0.0f, 0.0f, 1.5f, 0.0f, -1.25f, 1.5f, 0.0f, -1.25f, -0.25f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(24.0f, -14.5f, -2.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 3, 12, 4, 0.0f, 0.0f, 0.0f, -1.25f, -0.1f, 0.0f, -0.45f, -0.1f, 0.0f, -0.45f, 0.0f, 0.0f, -1.25f, 3.25f, 0.0f, -1.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 3.25f, 0.0f, -1.0f);
        this.bodyModel[29].setRotationPoint(9.0f, -13.5f, -2.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 6, 5, 1, 0.0f, 0.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.bodyModel[30].setRotationPoint(-76.0f, 5.5f, -0.5f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 21, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[31].setRotationPoint(-66.0f, 7.25f, -1.75f);
        this.bodyModel[31].rotateAngleZ = 0.03490659f;
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 21, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[32].setRotationPoint(-66.0f, 7.25f, 0.75f);
        this.bodyModel[32].rotateAngleZ = 0.03490659f;
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 6, 0.0f, 0.33f, 0.0f, -2.25f, 0.5f, 0.0f, -2.75f, 0.5f, 0.0f, -2.75f, 0.33f, 0.0f, -2.25f, 0.75f, 0.75f, -2.25f, -1.0f, -0.75f, -2.75f, -1.0f, -0.75f, -2.75f, 0.75f, 0.75f, -2.25f);
        this.bodyModel[33].setRotationPoint(74.0f, 1.5f, -3.0f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 1, 13, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[34].setRotationPoint(17.5f, -22.5f, -0.5f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 1, 13, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[35].setRotationPoint(19.2f, -22.5f, -0.5f);
    }
}
