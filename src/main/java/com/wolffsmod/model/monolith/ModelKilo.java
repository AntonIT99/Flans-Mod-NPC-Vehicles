//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelKilo extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelKilo() {
        this.textureX = 512;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[44];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 441, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 169, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 225, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 337, 25, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 401, 25, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 441, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 433, 33, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 465, 33, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 137, 41, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 193, 41, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 233, 41, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 121, 41, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 257, 41, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 297, 41, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 337, 41, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 377, 41, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 1, 48, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 481, 33, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 401, 48, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 433, 49, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 177, 41, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 281, 41, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 321, 41, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 46, 5, 14, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[0].setRotationPoint(-9.0f, -1.0f, -7.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 46, 4, 14, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-9.0f, 4.0f, -7.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 46, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[2].setRotationPoint(-9.0f, 8.0f, -7.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 20, 4, 14, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, -5.5f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, -2.0f, -5.5f);
        this.bodyModel[3].setRotationPoint(-29.0f, 8.0f, -7.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 20, 4, 14, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[4].setRotationPoint(-29.0f, 4.0f, -7.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 20, 5, 14, 0.0f, 0.0f, -1.0f, -3.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.0f, -3.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.5f);
        this.bodyModel[5].setRotationPoint(-29.0f, -1.0f, -7.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 6, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[6].setRotationPoint(-49.0f, 4.0f, -3.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 6, 0.0f, 0.0f, -0.5f, -2.0f, 0.0f, 2.0f, 0.5f, 0.0f, 2.0f, 0.5f, 0.0f, -0.5f, -2.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[7].setRotationPoint(-49.0f, 2.0f, -3.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 6, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, -1.0f, 0.0f, -2.5f, -2.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, -2.5f, -2.0f);
        this.bodyModel[8].setRotationPoint(-49.0f, 8.0f, -3.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 46, 2, 8, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-9.0f, -3.0f, -4.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 20, 2, 8, 0.0f, 0.0f, -0.5f, -2.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, -0.5f, -2.5f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f);
        this.bodyModel[10].setRotationPoint(-29.0f, -3.0f, -4.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 13, 2, 6, 0.0f, 0.0f, -2.5f, -2.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, -2.5f, -2.0f, 0.0f, 2.5f, -1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.5f, -1.5f);
        this.bodyModel[11].setRotationPoint(-42.0f, -2.5f, -3.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 6, 0.0f, 0.0f, -5.0f, -2.5f, 0.0f, -2.5f, -2.0f, 0.0f, -2.5f, -2.0f, 0.0f, -5.0f, -2.5f, 0.0f, 3.5f, -2.5f, 0.0f, 2.5f, -1.5f, 0.0f, 2.5f, -1.5f, 0.0f, 3.5f, -2.5f);
        this.bodyModel[12].setRotationPoint(-48.0f, -2.5f, -3.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 5, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[13].setRotationPoint(-58.0f, 5.0f, -2.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 5, 0.0f, -0.5f, -2.75f, -2.25f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, -0.5f, -2.75f, -2.25f, 0.0f, 2.0f, -2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 2.0f, -2.0f);
        this.bodyModel[14].setRotationPoint(-58.0f, 2.0f, -2.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 5, 0.0f, 0.0f, 2.0f, -2.0f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 2.0f, -2.0f, -0.5f, -2.75f, -2.25f, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f, -1.5f, -0.5f, -2.75f, -2.25f);
        this.bodyModel[15].setRotationPoint(-58.0f, 8.0f, -2.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f);
        this.bodyModel[16].setRotationPoint(-54.0f, 5.0f, -10.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, 2.0f, 0.0f, 2.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-54.0f, 5.0f, 2.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 8, 7, 1, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-56.0f, 6.0f, -0.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-60.0f, 5.0f, -0.5f);
        this.bodyModel[20].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[20].setRotationPoint(-59.0f, 5.5f, 0.0f);
        this.bodyModel[21].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[21].setRotationPoint(-59.0f, 5.5f, 0.0f);
        this.bodyModel[21].rotateAngleX = 1.0471976f;
        this.bodyModel[22].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[22].setRotationPoint(-59.0f, 5.5f, 0.0f);
        this.bodyModel[22].rotateAngleX = 2.0943952f;
        this.bodyModel[23].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[23].setRotationPoint(-59.0f, 5.5f, 0.0f);
        this.bodyModel[23].rotateAngleX = 3.1415927f;
        this.bodyModel[24].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[24].setRotationPoint(-59.0f, 5.5f, 0.0f);
        this.bodyModel[24].rotateAngleX = 4.1887903f;
        this.bodyModel[25].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.4f, -0.2f, 0.2f);
        this.bodyModel[25].setRotationPoint(-59.0f, 5.5f, 0.0f);
        this.bodyModel[25].rotateAngleX = 5.2359877f;
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 11, 5, 14, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -3.5f, 0.0f, 0.5f, -3.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[26].setRotationPoint(37.0f, -1.0f, -7.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 14, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[27].setRotationPoint(37.0f, 4.0f, -7.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 14, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -3.5f);
        this.bodyModel[28].setRotationPoint(37.0f, 8.0f, -7.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 8, 2, 8, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.25f, -2.5f, 0.0f, -0.25f, -2.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[29].setRotationPoint(37.0f, -3.0f, -4.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 8, 0.0f, 0.0f, -0.25f, -2.5f, 0.0f, -1.5f, -3.5f, 0.0f, -1.5f, -3.5f, 0.0f, -0.25f, -2.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -1.5f);
        this.bodyModel[30].setRotationPoint(45.0f, -3.0f, -4.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 14, 0.0f, 0.0f, 0.5f, -3.5f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, 0.5f, -3.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[31].setRotationPoint(48.0f, -1.0f, -7.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 14, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(48.0f, 4.0f, -7.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, -1.0f, -5.0f, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[33].setRotationPoint(48.0f, 8.0f, -7.0f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -2.5f, 0.0f, -0.5f, -2.5f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[34].setRotationPoint(52.0f, 4.0f, -6.0f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 12, 0.0f, 0.0f, 0.5f, -3.0f, 0.0f, -1.0f, -4.5f, 0.0f, -1.0f, -4.5f, 0.0f, 0.5f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].setRotationPoint(52.0f, 0.0f, -6.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 12, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.5f, -2.5f, 0.0f, 0.5f, -2.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -4.0f, 0.0f, -2.0f, -4.5f, 0.0f, -2.0f, -4.5f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[36].setRotationPoint(52.0f, 8.0f, -6.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 12, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, -0.5f, -2.5f, 0.0f, -1.5f, -4.5f, 0.0f, -1.5f, -4.5f, 0.0f, -0.5f, -2.5f);
        this.bodyModel[37].setRotationPoint(56.0f, 4.0f, -6.0f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 12, 0.0f, 0.0f, -1.0f, -4.5f, 0.0f, -3.0f, -5.5f, 0.0f, -3.0f, -5.5f, 0.0f, -1.0f, -4.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[38].setRotationPoint(56.0f, 0.0f, -6.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 12, 0.0f, 0.0f, 0.5f, -2.5f, 0.0f, 1.5f, -4.5f, 0.0f, 1.5f, -4.5f, 0.0f, 0.5f, -2.5f, 0.0f, -2.0f, -4.5f, -0.5f, -3.5f, -5.0f, -0.5f, -3.5f, -5.0f, 0.0f, -2.0f, -4.5f);
        this.bodyModel[39].setRotationPoint(56.0f, 8.0f, -6.0f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(8.0f, -11.0f, -2.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 4, 8, 4, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[41].setRotationPoint(4.0f, -11.0f, -2.0f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[42].setRotationPoint(18.0f, -11.0f, -2.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 3, 8, 2, 0.0f, 0.0f, 0.0f, -0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9f, 0.0f, 0.0f, -0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9f);
        this.bodyModel[43].setRotationPoint(1.0f, -11.0f, -1.0f);
    }
}
