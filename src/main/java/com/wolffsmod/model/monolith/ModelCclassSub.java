//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelCclassSub extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelCclassSub() {
        this.textureX = 512;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[40];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 337, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 417, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 441, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 489, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 337, 9, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 353, 9, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 145, 17, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 153, 17, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 161, 17, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 249, 17, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 265, 17, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 281, 17, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 297, 17, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 321, 17, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 337, 17, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 353, 17, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 361, 17, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 385, 17, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 401, 17, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 425, 17, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 385, 17, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 433, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(4.0f, -0.5f, -1.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(4.0f, -0.5f, -4.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[2].setRotationPoint(4.0f, -0.5f, 1.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[3].setRotationPoint(13.0f, -0.5f, 1.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[4].setRotationPoint(13.0f, -0.5f, -1.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 9, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[5].setRotationPoint(13.0f, -0.5f, -4.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 18, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f);
        this.bodyModel[6].setRotationPoint(22.0f, -0.5f, 1.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 18, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[7].setRotationPoint(22.0f, -0.5f, -1.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 18, 8, 3, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[8].setRotationPoint(22.0f, -0.5f, -4.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(40.0f, 2.0f, -1.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[10].setRotationPoint(41.5f, 2.0f, -1.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[11].setRotationPoint(-3.0f, -0.5f, 1.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[12].setRotationPoint(-3.0f, -0.5f, -1.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[13].setRotationPoint(-3.0f, -0.5f, -4.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f);
        this.bodyModel[14].setRotationPoint(-11.0f, -0.5f, 1.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[15].setRotationPoint(-11.0f, -0.5f, -1.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 3, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[16].setRotationPoint(-11.0f, -0.5f, -4.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 16, 8, 3, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f);
        this.bodyModel[17].setRotationPoint(-27.0f, -0.5f, 1.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 16, 8, 3, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f);
        this.bodyModel[18].setRotationPoint(-27.0f, -0.5f, -4.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 16, 8, 3, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f);
        this.bodyModel[19].setRotationPoint(-27.0f, -0.5f, -1.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 3, 0.0f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f);
        this.bodyModel[20].setRotationPoint(-29.0f, 2.0f, -1.5f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 3, 0.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f);
        this.bodyModel[21].setRotationPoint(-36.5f, 2.0f, -1.5f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 6, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(-37.5f, 1.0f, -0.5f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 2, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(-39.5f, 1.0f, -0.5f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[24].setRotationPoint(-40.5f, 1.0f, -0.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 41, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(-7.0f, -1.2f, -1.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, -0.8f, 0.3f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, -0.8f, 0.3f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(34.0f, -1.2f, -1.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 3, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[27].setRotationPoint(34.5f, 0.0f, 0.5f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 3, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[28].setRotationPoint(34.5f, 0.0f, -3.5f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 6, 4, 2, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(-13.0f, -1.2f, -1.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 2, 0.0f, -0.5f, -0.7f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.7f, -0.7f, -0.5f, 0.0f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.7f);
        this.bodyModel[30].setRotationPoint(-16.0f, -0.7f, -1.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 6, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(0.0f, -4.2f, -0.5f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.4f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.0f, -0.5f, 0.4f);
        this.bodyModel[32].setRotationPoint(5.0f, -4.8f, -0.5f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 10, 3, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[33].setRotationPoint(-6.0f, -2.2f, -0.5f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(-39.5f, 3.0f, -2.5f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[35].setRotationPoint(-40.5f, 3.0f, -2.5f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(-37.5f, 3.0f, -2.5f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[37].setRotationPoint(4.0f, -8.2f, -0.5f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.bodyModel[38].setRotationPoint(4.0f, -10.7f, -0.5f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 15.0f, -0.4f, -0.4f, 15.0f, -0.4f, -0.4f, 15.0f, -0.4f, -0.4f, 15.0f, -0.4f);
        this.bodyModel[39].setRotationPoint(-1.5f, -18.7f, -0.5f);
    }
}
