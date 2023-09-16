//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelDelfino extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelDelfino() {
        this.textureX = 512;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[33];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 249, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 297, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 337, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 401, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 481, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 217, 9, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 233, 9, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 465, 9, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 481, 9, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 489, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(2.0f, 2.5f, -1.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(2.0f, 2.5f, -4.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[2].setRotationPoint(2.0f, 2.5f, 1.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[3].setRotationPoint(7.0f, 2.5f, 1.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[4].setRotationPoint(7.0f, 2.5f, -1.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[5].setRotationPoint(7.0f, 2.5f, -4.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f);
        this.bodyModel[6].setRotationPoint(14.0f, 2.5f, 1.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[7].setRotationPoint(14.0f, 2.5f, -1.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[8].setRotationPoint(14.0f, 2.5f, -4.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(21.0f, 5.0f, -1.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[10].setRotationPoint(22.5f, 5.0f, -1.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[11].setRotationPoint(-5.0f, 2.5f, 1.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[12].setRotationPoint(-5.0f, 2.5f, -1.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[13].setRotationPoint(-5.0f, 2.5f, -4.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 4, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f);
        this.bodyModel[14].setRotationPoint(-9.0f, 2.5f, 1.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 4, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[15].setRotationPoint(-9.0f, 2.5f, -1.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 4, 8, 3, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[16].setRotationPoint(-9.0f, 2.5f, -4.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 3, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f);
        this.bodyModel[17].setRotationPoint(-19.0f, 2.5f, 1.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 3, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f);
        this.bodyModel[18].setRotationPoint(-19.0f, 2.5f, -4.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 3, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f);
        this.bodyModel[19].setRotationPoint(-19.0f, 2.5f, -1.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f);
        this.bodyModel[20].setRotationPoint(-20.0f, 5.0f, -1.5f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 3, 0.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f);
        this.bodyModel[21].setRotationPoint(-22.5f, 5.0f, -1.5f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(-1.0f, 0.5f, -1.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f);
        this.bodyModel[23].setRotationPoint(-22.5f, 4.5f, -0.5f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, -1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[24].setRotationPoint(-22.5f, 6.5f, -0.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 1.0f, -0.3f, -0.3f, 1.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[25].setRotationPoint(-24.0f, 4.0f, -0.5f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.bodyModel[26].setRotationPoint(-24.5f, 4.0f, -0.5f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 1.0f, -0.3f, -0.3f, 1.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[27].setRotationPoint(-24.0f, 8.0f, -0.5f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 1.0f, 0.0f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 1.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[28].setRotationPoint(16.5f, 8.5f, -0.5f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.4f);
        this.bodyModel[29].setRotationPoint(-23.0f, 6.0f, -0.5f);
        this.bodyModel[30].addShapeBox(0.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f);
        this.bodyModel[30].setRotationPoint(-23.0f, 6.5f, 0.0f);
        this.bodyModel[31].addShapeBox(0.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f);
        this.bodyModel[31].setRotationPoint(-23.0f, 6.5f, 0.0f);
        this.bodyModel[31].rotateAngleX = 2.3561945f;
        this.bodyModel[32].addShapeBox(0.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f);
        this.bodyModel[32].setRotationPoint(-23.0f, 6.5f, 0.0f);
        this.bodyModel[32].rotateAngleX = -2.3561945f;
    }
}
