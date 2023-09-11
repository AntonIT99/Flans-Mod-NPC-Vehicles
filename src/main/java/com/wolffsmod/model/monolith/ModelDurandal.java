//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelDurandal extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelDurandal() {
        this.textureX = 512;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[50];
        this.turretModel = new ModelRendererTurbo[1];
        this.barrelModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 409, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 201, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 297, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 297, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 329, 17, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 449, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 481, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 281, 17, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 81, 9, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 289, 17, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 305, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 409, 9, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 297, 17, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 321, 17, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 345, 17, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 361, 17, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 377, 17, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 393, 17, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 409, 17, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 497, 17, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 137, 25, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 161, 25, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 177, 25, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 345, 25, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 353, 25, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 393, 25, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 185, 33, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 33, 4, 12, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 2.0f, -5.5f, 0.0f, 2.0f, -5.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(23.0f, 0.0f, -6.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 43, 4, 12, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[1].setRotationPoint(-20.0f, 0.0f, -6.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 35, 4, 10, 0.0f, 0.5f, -0.5f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.5f, -2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f);
        this.bodyModel[2].setRotationPoint(-55.0f, 0.0f, -5.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 43, 1, 12, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[3].setRotationPoint(-20.0f, -1.0f, -6.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 36, 1, 12, 0.0f, -0.8f, -1.4f, -3.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, -0.8f, -1.4f, -3.5f, -0.5f, 0.5f, -3.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -0.5f, 0.5f, -3.0f);
        this.bodyModel[4].setRotationPoint(-56.0f, -1.0f, -6.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 33, 2, 12, 0.0f, 0.0f, 2.0f, -5.5f, -0.5f, 0.1f, -5.5f, -0.5f, 0.1f, -5.5f, 0.0f, 2.0f, -5.5f, 0.0f, 0.0f, -0.5f, 0.0f, -2.0f, -5.5f, 0.0f, -2.0f, -5.5f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[5].setRotationPoint(23.0f, -2.0f, -6.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(22.5f, -5.0f, -5.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(21.5f, -5.5f, -3.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.bodyModel[8].setRotationPoint(24.5f, -7.8f, -0.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(25.5f, -6.8f, -0.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f);
        this.bodyModel[10].setRotationPoint(27.5f, -7.8f, -0.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[11].setRotationPoint(28.5f, -4.5f, 0.3f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[12].setRotationPoint(28.5f, -4.5f, -1.3f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[13].setRotationPoint(18.5f, -6.8f, -0.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(17.5f, -8.8f, -1.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(18.5f, -9.8f, -0.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 3, 9, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(10.5f, -9.5f, -1.5f);
        this.bodyModel[16].rotateAngleZ = 0.05235988f;
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 3, 9, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-19.5f, -9.5f, -1.5f);
        this.bodyModel[17].rotateAngleZ = 0.05235988f;
        this.bodyModel[18].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[18].setRotationPoint(18.5f, -3.8f, 3.0f);
        this.bodyModel[19].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[19].setRotationPoint(18.5f, -4.7f, 3.0f);
        this.bodyModel[19].rotateAngleY = 0.7679449f;
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[20].setRotationPoint(18.5f, -4.7f, 3.0f);
        this.bodyModel[20].rotateAngleY = 0.7679449f;
        this.bodyModel[21].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[21].setRotationPoint(12.5f, -4.7f, 3.0f);
        this.bodyModel[21].rotateAngleY = 0.7679449f;
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[22].setRotationPoint(12.5f, -4.7f, 3.0f);
        this.bodyModel[22].rotateAngleY = 0.7679449f;
        this.bodyModel[23].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[23].setRotationPoint(12.5f, -3.8f, 3.0f);
        this.bodyModel[24].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[24].setRotationPoint(-24.5f, -4.7f, 3.0f);
        this.bodyModel[24].rotateAngleY = 2.5132742f;
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[25].setRotationPoint(-24.5f, -4.7f, 3.0f);
        this.bodyModel[25].rotateAngleY = 2.5132742f;
        this.bodyModel[26].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[26].setRotationPoint(-24.5f, -3.8f, 3.0f);
        this.bodyModel[26].rotateAngleY = 1.7453293f;
        this.bodyModel[27].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[27].setRotationPoint(-25.0f, -4.7f, -2.0f);
        this.bodyModel[27].rotateAngleY = 3.9618974f;
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[28].setRotationPoint(-25.0f, -4.7f, -2.0f);
        this.bodyModel[28].rotateAngleY = 3.9618974f;
        this.bodyModel[29].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[29].setRotationPoint(-24.5f, -3.8f, -2.0f);
        this.bodyModel[29].rotateAngleY = 1.7453293f;
        this.bodyModel[30].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[30].setRotationPoint(18.5f, -3.8f, -4.0f);
        this.bodyModel[31].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[31].setRotationPoint(18.0f, -4.7f, -4.0f);
        this.bodyModel[31].rotateAngleY = -0.7679449f;
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[32].setRotationPoint(18.0f, -4.7f, -4.0f);
        this.bodyModel[32].rotateAngleY = -0.7679449f;
        this.bodyModel[33].addShapeBox(-2.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f);
        this.bodyModel[33].setRotationPoint(12.0f, -4.7f, -4.0f);
        this.bodyModel[33].rotateAngleY = -0.7679449f;
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[34].setRotationPoint(12.0f, -4.7f, -4.0f);
        this.bodyModel[34].rotateAngleY = -0.7679449f;
        this.bodyModel[35].addShapeBox(-0.8f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[35].setRotationPoint(12.5f, -3.8f, -4.0f);
        this.bodyModel[36].addShapeBox(1.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(-2.5f, -3.0f, -0.5f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(-47.5f, -1.3f, -0.5f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-17.5f, -4.5f, -2.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 1, 32, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[39].setRotationPoint(14.5f, -31.5f, -0.5f);
        this.bodyModel[39].rotateAngleZ = 0.03490659f;
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 1, 32, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[40].setRotationPoint(-29.5f, -31.5f, -0.5f);
        this.bodyModel[40].rotateAngleZ = 0.05235988f;
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 7, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[41].setRotationPoint(15.0f, -22.5f, -3.5f);
        this.bodyModel[41].rotateAngleZ = 0.03490659f;
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.bodyModel[42].setRotationPoint(-36.5f, -4.5f, -2.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f);
        this.bodyModel[43].setRotationPoint(-36.5f, -6.5f, -2.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 7, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[44].setRotationPoint(-29.0f, -22.5f, -3.5f);
        this.bodyModel[44].rotateAngleZ = 0.03490659f;
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 1, 9, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[45].setRotationPoint(-56.5f, -8.0f, -0.5f);
        this.bodyModel[45].rotateAngleZ = 0.13962634f;
        this.bodyModel[46].addShapeBox(-11.2f, -3.0f, 0.0f, 16, 12, 1, 0.0f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f);
        this.bodyModel[46].setRotationPoint(-56.5f, -8.0f, -0.5f);
        this.bodyModel[46].rotateAngleZ = 0.13962634f;
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, 0.0f, 33, 3, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -3.0f, -0.5f, -5.5f, -3.0f, -0.5f, -5.5f, 0.0f, 0.0f, -1.5f);
        this.bodyModel[47].setRotationPoint(23.0f, 4.0f, -6.0f);
        this.bodyModel[48].addShapeBox(0.0f, 0.0f, 0.0f, 43, 3, 12, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[48].setRotationPoint(-20.0f, 4.0f, -6.0f);
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, 0.0f, 35, 3, 10, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -1.5f, -0.8f, -4.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -1.5f, -0.8f, -4.5f);
        this.bodyModel[49].setRotationPoint(-55.0f, 4.0f, -5.0f);
    }
    
    private void initturretModel_1() {
        (this.turretModel[0] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY)).addShapeBox(-5.0f, -1.0f, -1.0f, 12, 2, 2, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -4.0f, -0.3f, -0.3f, -4.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.turretModel[0].setRotationPoint(-46.0f, -2.0f, 0.0f);
        this.turretModel[0].rotateAngleY = -3.1415927f;
    }
    
    private void initbarrelModel_1() {
        (this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 9, 25, this.textureX, this.textureY)).addShapeBox(-4.0f, -1.0f, -1.0f, 12, 2, 2, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -4.0f, -0.3f, -0.3f, -4.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[0].setRotationPoint(0.0f, -3.7f, 0.0f);
    }
}
