//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelFlirt extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelFlirt() {
        this.textureX = 512;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[47];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 377, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 425, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 481, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 489, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 409, 9, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 417, 9, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 225, 17, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 137, 25, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 321, 17, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 361, 17, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 393, 25, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 457, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 489, 17, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 425, 25, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 225, 9, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 489, 1, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 393, 17, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 121, 25, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 457, 25, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 353, 25, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 329, 33, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 345, 33, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 473, 9, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 505, 9, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 393, 17, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 121, 25, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 457, 25, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 38, 4, 12, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 2.0f, -5.5f, 0.0f, 2.0f, -5.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(26.0f, 0.0f, -6.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 52, 4, 12, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[1].setRotationPoint(-26.0f, 0.0f, -6.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 26, 4, 10, 0.0f, 0.0f, -0.5f, -1.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.9f, 0.0f, 0.0f, -1.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.9f);
        this.bodyModel[2].setRotationPoint(-52.0f, 0.0f, -5.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 12, 0.0f, 0.0f, 0.5f, -4.0f, -0.5f, 0.1f, -5.5f, -0.5f, 0.1f, -5.5f, 0.0f, 0.5f, -4.0f, 3.0f, -0.8f, -2.5f, 0.0f, -2.0f, -5.5f, 0.0f, -2.0f, -5.5f, 3.0f, -0.8f, -2.5f);
        this.bodyModel[3].setRotationPoint(44.0f, -2.0f, -6.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.bodyModel[4].setRotationPoint(40.5f, -7.5f, -0.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(41.5f, -6.5f, -0.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f);
        this.bodyModel[6].setRotationPoint(42.5f, -7.65f, -0.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[7].setRotationPoint(28.5f, -4.5f, -1.3f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 4, 9, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(7.5f, -8.5f, -1.5f);
        this.bodyModel[8].rotateAngleZ = 0.05235988f;
        this.bodyModel[9].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[9].setRotationPoint(-6.0f, -2.7f, 3.0f);
        this.bodyModel[9].rotateAngleY = 0.7679449f;
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[10].setRotationPoint(-6.0f, -2.7f, 3.0f);
        this.bodyModel[10].rotateAngleY = 0.7679449f;
        this.bodyModel[11].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[11].setRotationPoint(-6.0f, -1.8f, 3.0f);
        this.bodyModel[12].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[12].setRotationPoint(-6.5f, -2.7f, -4.0f);
        this.bodyModel[12].rotateAngleY = -0.7679449f;
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[13].setRotationPoint(-6.5f, -2.7f, -4.0f);
        this.bodyModel[13].rotateAngleY = -0.7679449f;
        this.bodyModel[14].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[14].setRotationPoint(-6.0f, -1.8f, -4.0f);
        this.bodyModel[15].addShapeBox(-5.0f, -1.0f, -1.0f, 12, 2, 2, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -4.0f, -0.3f, -0.3f, -4.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[15].setRotationPoint(-38.0f, -2.0f, 0.0f);
        this.bodyModel[15].rotateAngleY = -3.1415927f;
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(-39.5f, -1.3f, -0.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 20, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[17].setRotationPoint(31.5f, -19.5f, -0.5f);
        this.bodyModel[17].rotateAngleZ = 0.05235988f;
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 7, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[18].setRotationPoint(32.0f, -15.5f, -3.5f);
        this.bodyModel[18].rotateAngleZ = 0.03490659f;
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 1, 9, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[19].setRotationPoint(-63.5f, -8.0f, -0.5f);
        this.bodyModel[19].rotateAngleZ = 0.13962634f;
        this.bodyModel[20].addShapeBox(-10.3f, -3.0f, 0.0f, 15, 11, 1, 0.0f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f);
        this.bodyModel[20].setRotationPoint(-63.5f, -8.0f, -0.5f);
        this.bodyModel[20].rotateAngleZ = 0.13962634f;
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 38, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -3.0f, -0.5f, -5.5f, -3.0f, -0.5f, -5.5f, 0.0f, 0.0f, -1.5f);
        this.bodyModel[21].setRotationPoint(26.0f, 4.0f, -6.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 52, 4, 12, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[22].setRotationPoint(-26.0f, 4.0f, -6.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 36, 3, 10, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -3.5f, -1.8f, -4.5f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, -3.5f, -1.8f, -4.5f);
        this.bodyModel[23].setRotationPoint(-62.0f, 4.0f, -5.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 6, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.15f, 0.0f, -0.5f, 0.15f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[24].setRotationPoint(-62.0f, 0.0f, -3.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(33.0f, -4.0f, -2.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 5, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[26].setRotationPoint(32.9f, -4.7f, -2.5f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 4, 9, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(-9.5f, -8.5f, -1.5f);
        this.bodyModel[27].rotateAngleZ = 0.05235988f;
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 4, 9, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(25.5f, -8.5f, -1.5f);
        this.bodyModel[28].rotateAngleZ = 0.05235988f;
        this.bodyModel[29].addShapeBox(-5.0f, -1.0f, -1.0f, 12, 2, 2, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -4.0f, -0.3f, -0.3f, -4.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[29].setRotationPoint(-22.0f, -2.0f, 0.0f);
        this.bodyModel[29].rotateAngleY = -3.1415927f;
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(-23.5f, -1.3f, -0.5f);
        this.bodyModel[31].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[31].setRotationPoint(-48.0f, -4.0f, 0.5f);
        this.bodyModel[31].rotateAngleY = -3.1415927f;
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[32].setRotationPoint(-48.0f, -4.0f, 0.5f);
        this.bodyModel[32].rotateAngleY = -3.1415927f;
        this.bodyModel[33].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[33].setRotationPoint(-47.0f, -3.1f, -0.5f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 4, 0.0f, 0.0f, 1.0f, -1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, -1.5f, 0.0f, -2.4f, -2.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -2.4f, -2.0f);
        this.bodyModel[34].setRotationPoint(16.5f, -2.5f, 2.0f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -1.0f, -1.0f);
        this.bodyModel[35].setRotationPoint(20.5f, -2.5f, 2.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, -1.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -0.3f, -1.0f);
        this.bodyModel[36].setRotationPoint(25.5f, -2.5f, 2.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(-0.5f, -2.5f, -1.5f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 3, 0.0f, -0.5f, 0.3f, 0.0f, 0.5f, 0.8f, 0.2f, 0.5f, 0.8f, 0.2f, -0.5f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-0.5f, -4.5f, -1.5f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 3, 0.0f, -0.5f, 0.3f, 0.0f, 0.5f, 0.8f, 0.2f, 0.5f, 0.8f, 0.2f, -0.5f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(19.0f, -4.5f, -1.5f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(19.0f, -2.5f, -1.5f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.bodyModel[41].setRotationPoint(-63.0f, 1.0f, -0.5f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.9f, -3.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.9f, -3.0f, 0.0f);
        this.bodyModel[42].setRotationPoint(-63.0f, 4.0f, -0.5f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 1.4f, -0.4f, 0.0f, 1.4f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[43].setRotationPoint(-62.0f, 5.0f, -0.5f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 4, 0.0f, 0.0f, 1.0f, -1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, -1.5f, 0.0f, -2.4f, -2.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -2.4f, -2.0f);
        this.bodyModel[44].setRotationPoint(16.5f, -2.5f, -6.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -1.0f, -1.0f);
        this.bodyModel[45].setRotationPoint(20.5f, -2.5f, -6.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, -1.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -0.3f, -1.0f);
        this.bodyModel[46].setRotationPoint(25.5f, -2.5f, -6.0f);
    }
}
