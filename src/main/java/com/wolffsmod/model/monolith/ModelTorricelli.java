//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelTorricelli extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelTorricelli() {
        this.textureX = 512;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[61];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 377, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 441, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 289, 17, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 337, 17, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 441, 17, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 73, 33, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 129, 33, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 233, 33, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 297, 33, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 369, 33, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 65, 49, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 465, 33, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 473, 41, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 129, 49, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 185, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 153, 49, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 169, 49, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 505, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 505, 9, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 217, 49, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 233, 49, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 289, 49, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 489, 41, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 505, 17, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 313, 49, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 321, 49, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 377, 49, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 433, 49, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 129, 57, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 65, 65, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 225, 65, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 329, 65, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 393, 65, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 129, 73, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 65, 81, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 281, 17, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 329, 17, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 433, 17, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 281, 49, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 121, 33, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 369, 49, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase)this, 465, 49, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase)this, 465, 65, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 84, 5, 8, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[0].setRotationPoint(-48.0f, -1.5f, -4.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 82, 5, 8, 0.0f, 2.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 2.0f, 0.0f, -0.2f, -7.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -7.0f, 0.0f, -2.0f);
        this.bodyModel[1].setRotationPoint(-46.0f, 9.5f, -4.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 21, 5, 8, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -3.5f, 0.5f, 0.0f, -3.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.5f, 0.0f, -3.2f);
        this.bodyModel[2].setRotationPoint(-69.0f, -1.5f, -4.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 21, 4, 8, 0.0f, 0.5f, 0.0f, -3.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.5f, 0.0f, -3.2f, -1.0f, -1.0f, -3.2f, 0.0f, 2.0f, -0.2f, 0.0f, 2.0f, -0.2f, -1.0f, -1.0f, -3.2f);
        this.bodyModel[3].setRotationPoint(-69.0f, 3.5f, -4.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 14, 5, 8, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f, -1.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[4].setRotationPoint(36.0f, -1.5f, -4.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 14, 5, 8, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.0f, 0.0f, -2.5f, -2.5f, 0.0f, -2.5f, -2.5f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[5].setRotationPoint(36.0f, 9.5f, -4.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 84, 6, 8, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[6].setRotationPoint(-48.0f, 3.5f, -4.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 14, 6, 8, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[7].setRotationPoint(36.0f, 3.5f, -4.0f);
        this.bodyModel[8].addShapeBox(0.0f, -1.0f, 0.0f, 42, 6, 6, 0.0f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[8].setRotationPoint(-21.0f, 3.5f, -9.0f);
        this.bodyModel[9].addShapeBox(0.0f, -1.0f, 0.0f, 25, 6, 6, 0.0f, -16.0f, -1.0f, -1.5f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.7f, -16.0f, -1.0f, -1.5f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, -3.0f, 0.0f, -0.7f);
        this.bodyModel[9].setRotationPoint(-46.0f, 3.5f, -9.0f);
        this.bodyModel[10].addShapeBox(0.0f, -1.0f, 0.0f, 26, 6, 6, 0.0f, 0.0f, -1.0f, -0.2f, -16.0f, -1.0f, -1.5f, 1.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, -16.0f, -1.0f, -1.5f, -5.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[10].setRotationPoint(21.0f, 3.5f, -9.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 17, 6, 8, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -3.5f, 0.5f, 0.0f, -3.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, -10.0f, 0.0f, -3.0f, -10.0f, 0.0f, -3.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[11].setRotationPoint(50.0f, 3.5f, -4.0f);
        this.bodyModel[12].addShapeBox(0.0f, -1.0f, 0.0f, 42, 3, 6, 0.0f, 0.0f, -1.0f, -2.2f, 0.0f, -1.0f, -2.2f, 0.0f, 0.8f, -0.2f, 0.0f, 0.8f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[12].setRotationPoint(-21.0f, 0.5f, -9.0f);
        this.bodyModel[13].addShapeBox(0.0f, -1.0f, 0.0f, 25, 3, 6, 0.0f, -18.0f, -1.0f, -2.7f, 0.0f, -1.0f, -2.2f, 0.0f, 0.8f, -0.2f, -7.0f, -1.0f, -0.7f, -16.0f, 1.0f, -1.5f, 0.0f, 1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.7f);
        this.bodyModel[13].setRotationPoint(-46.0f, 0.5f, -9.0f);
        this.bodyModel[14].addShapeBox(0.0f, -1.0f, 0.0f, 26, 3, 6, 0.0f, 0.0f, -1.0f, -2.2f, -20.0f, -1.0f, -2.7f, -9.0f, -1.5f, -0.7f, 0.0f, 0.8f, -0.2f, 0.0f, 1.0f, -0.2f, -16.0f, 1.0f, -1.5f, 1.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[14].setRotationPoint(21.0f, 0.5f, -9.0f);
        this.bodyModel[15].addShapeBox(0.0f, -1.0f, 0.0f, 42, 4, 6, 0.0f, 0.0f, 1.0f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -2.2f, 0.0f, -1.0f, -2.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[15].setRotationPoint(-21.0f, 9.5f, -9.0f);
        this.bodyModel[16].addShapeBox(0.0f, -1.0f, 0.0f, 25, 4, 6, 0.0f, -16.0f, 1.0f, -1.5f, 0.0f, 1.0f, -0.2f, 0.0f, 0.0f, -0.2f, -3.0f, 0.0f, -0.7f, -18.0f, -1.0f, -2.7f, 0.0f, -1.0f, -2.2f, 0.0f, 0.0f, 0.5f, -9.0f, -1.0f, 0.5f);
        this.bodyModel[16].setRotationPoint(-46.0f, 9.5f, -9.0f);
        this.bodyModel[17].addShapeBox(0.0f, -1.0f, 0.0f, 26, 4, 6, 0.0f, 0.0f, 1.0f, -0.2f, -16.0f, 1.0f, -1.5f, -5.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -2.2f, -18.0f, -1.5f, -2.7f, -11.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[17].setRotationPoint(21.0f, 9.5f, -9.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 22, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-52.0f, 10.5f, -4.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 9, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-64.0f, 9.0f, -0.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f, -2.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -2.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(-64.0f, 8.0f, -0.5f);
        this.bodyModel[21].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(-52.0f, 11.0f, -4.0f);
        this.bodyModel[22].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(-52.0f, 11.0f, -4.0f);
        this.bodyModel[22].rotateAngleX = 2.0943952f;
        this.bodyModel[23].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(-52.0f, 11.0f, -4.0f);
        this.bodyModel[23].rotateAngleX = 4.1887903f;
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(-58.0f, 10.5f, -5.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 1.8f, 0.0f, -0.2f, -2.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 1.8f, 0.0f, -0.2f, -2.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[25].setRotationPoint(-56.0f, 10.5f, -6.5f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, 1.8f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 1.5f, 0.0f, -0.2f, -2.2f, 0.0f, -0.2f, 1.8f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 1.5f, 0.0f, -0.2f, -2.2f);
        this.bodyModel[26].setRotationPoint(-51.0f, 10.5f, -6.5f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 22, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(-52.0f, 10.5f, 3.5f);
        this.bodyModel[28].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(-52.0f, 11.0f, 4.0f);
        this.bodyModel[29].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(-52.0f, 11.0f, 4.0f);
        this.bodyModel[29].rotateAngleX = 2.0943952f;
        this.bodyModel[30].addShapeBox(0.0f, -0.5f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(-52.0f, 11.0f, 4.0f);
        this.bodyModel[30].rotateAngleX = 4.1887903f;
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(-58.0f, 10.5f, 2.5f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -2.2f, 0.0f, -0.2f, 1.8f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -2.2f, 0.0f, -0.2f, 1.8f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[32].setRotationPoint(-56.0f, 10.5f, 5.5f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -2.2f, 0.0f, -0.2f, 1.5f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 1.8f, 0.0f, -0.2f, -2.2f, 0.0f, -0.2f, 1.5f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 1.8f);
        this.bodyModel[33].setRotationPoint(-51.0f, 10.5f, 5.5f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 18, 8, 7, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[34].setRotationPoint(-17.0f, -9.0f, -3.5f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 7, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.5f, 3.5f, 0.0f, -2.2f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 3.5f, 0.0f, -2.2f);
        this.bodyModel[35].setRotationPoint(-18.0f, -9.0f, -3.5f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 3, 8, 8, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, -0.5f, -2.5f, 0.0f, -0.5f, -2.5f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.5f, 0.0f, -2.2f, 0.5f, 0.0f, -2.2f, 0.0f, 0.0f, -0.7f);
        this.bodyModel[36].setRotationPoint(1.0f, -9.0f, -4.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[37].setRotationPoint(-3.5f, -21.0f, -0.5f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[38].setRotationPoint(-1.5f, -21.0f, -0.5f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 17, 5, 8, 0.0f, 0.0f, 0.0f, -0.9f, 2.5f, 0.0f, -3.5f, 2.5f, 0.0f, -3.5f, 0.0f, 0.0f, -0.9f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -3.5f, 0.5f, 0.0f, -3.5f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[39].setRotationPoint(50.0f, -1.5f, -4.0f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 17, 1, 8, 0.0f, 0.0f, 0.5f, -1.0f, -1.0f, 0.8f, -3.8f, -1.0f, 0.8f, -3.8f, 0.0f, 0.5f, -1.0f, 0.0f, 0.0f, -0.9f, 2.5f, 0.0f, -3.5f, 2.5f, 0.0f, -3.5f, 0.0f, 0.0f, -0.9f);
        this.bodyModel[40].setRotationPoint(50.0f, -2.5f, -4.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 7, 2, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -1.5f, -2.0f, -1.0f, -1.8f, -2.0f, -1.0f, -1.8f, 0.0f, 0.5f, -1.5f);
        this.bodyModel[41].setRotationPoint(50.0f, 9.5f, -3.0f);
        this.bodyModel[42].addShapeBox(0.0f, -1.0f, 0.0f, 42, 6, 6, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f, -0.2f);
        this.bodyModel[42].setRotationPoint(-21.0f, 3.5f, 3.0f);
        this.bodyModel[43].addShapeBox(0.0f, -1.0f, 0.0f, 25, 6, 6, 0.0f, 1.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, -16.0f, -1.0f, -1.5f, -3.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, -16.0f, -1.0f, -1.5f);
        this.bodyModel[43].setRotationPoint(-46.0f, 3.5f, 3.0f);
        this.bodyModel[44].addShapeBox(0.0f, -1.0f, 0.0f, 26, 6, 6, 0.0f, 0.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, -16.0f, -1.0f, -1.5f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, -5.0f, 0.0f, -0.2f, -16.0f, -1.0f, -1.5f, 0.0f, -1.0f, -0.2f);
        this.bodyModel[44].setRotationPoint(21.0f, 3.5f, 3.0f);
        this.bodyModel[45].addShapeBox(0.0f, -1.0f, 0.0f, 42, 3, 6, 0.0f, 0.0f, 0.8f, -0.2f, 0.0f, 0.8f, -0.2f, 0.0f, -1.0f, -2.2f, 0.0f, -1.0f, -2.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 1.0f, -0.2f);
        this.bodyModel[45].setRotationPoint(-21.0f, 0.5f, 3.0f);
        this.bodyModel[46].addShapeBox(0.0f, -1.0f, 0.0f, 25, 3, 6, 0.0f, -7.0f, -1.0f, -0.7f, 0.0f, 0.8f, -0.2f, 0.0f, -1.0f, -2.2f, -18.0f, -1.0f, -2.7f, 1.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, -16.0f, 1.0f, -1.5f);
        this.bodyModel[46].setRotationPoint(-46.0f, 0.5f, 3.0f);
        this.bodyModel[47].addShapeBox(0.0f, -1.0f, 0.0f, 26, 3, 6, 0.0f, 0.0f, 0.8f, -0.2f, -9.0f, -1.5f, -0.7f, -20.0f, -1.0f, -2.7f, 0.0f, -1.0f, -2.2f, 0.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, -16.0f, 1.0f, -1.5f, 0.0f, 1.0f, -0.2f);
        this.bodyModel[47].setRotationPoint(21.0f, 0.5f, 3.0f);
        this.bodyModel[48].addShapeBox(0.0f, -1.0f, 0.0f, 42, 4, 6, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -1.0f, -2.2f, 0.0f, -1.0f, -2.2f);
        this.bodyModel[48].setRotationPoint(-21.0f, 9.5f, 3.0f);
        this.bodyModel[49].addShapeBox(0.0f, -1.0f, 0.0f, 25, 4, 6, 0.0f, -3.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, -16.0f, 1.0f, -1.5f, -9.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -1.0f, -2.2f, -18.0f, -1.0f, -2.7f);
        this.bodyModel[49].setRotationPoint(-46.0f, 9.5f, 3.0f);
        this.bodyModel[50].addShapeBox(0.0f, -1.0f, 0.0f, 26, 4, 6, 0.0f, 0.0f, 0.0f, -0.2f, -5.0f, 0.0f, -0.2f, -16.0f, 1.0f, -1.5f, 0.0f, 1.0f, -0.2f, 0.0f, 0.0f, 0.5f, -11.0f, -1.0f, 0.5f, -18.0f, -1.5f, -2.7f, 0.0f, -1.0f, -2.2f);
        this.bodyModel[50].setRotationPoint(21.0f, 9.5f, 3.0f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[51].setRotationPoint(-16.0f, -10.5f, -0.5f);
        this.bodyModel[51].rotateAngleZ = -0.08726646f;
        this.bodyModel[52].addShapeBox(-5.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f);
        this.bodyModel[52].setRotationPoint(-16.0f, -10.5f, -0.5f);
        this.bodyModel[52].rotateAngleZ = -0.08726646f;
        this.bodyModel[53].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[53].setRotationPoint(-7.5f, -12.0f, -3.0f);
        this.bodyModel[53].rotateAngleZ = -0.36651915f;
        this.bodyModel[54].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[54].setRotationPoint(-7.5f, -12.0f, 2.0f);
        this.bodyModel[54].rotateAngleZ = -0.36651915f;
        this.bodyModel[55].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[55].setRotationPoint(45.0f, -1.5f, -6.0f);
        this.bodyModel[56].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[56].setRotationPoint(47.0f, -1.5f, -7.0f);
        this.bodyModel[57].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[57].setRotationPoint(45.0f, -1.5f, 3.0f);
        this.bodyModel[58].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[58].setRotationPoint(47.0f, -1.5f, 3.0f);
        this.bodyModel[59].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[59].setRotationPoint(-69.0f, -9.0f, -0.5f);
        this.bodyModel[59].rotateAngleZ = 0.08726646f;
        this.bodyModel[60].addShapeBox(-10.0f, -3.0f, 0.0f, 15, 11, 1, 0.0f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f, -4.5f, -3.5f, -0.4f);
        this.bodyModel[60].setRotationPoint(-69.0f, -9.0f, -0.5f);
        this.bodyModel[60].rotateAngleZ = 0.08726646f;
    }
}
