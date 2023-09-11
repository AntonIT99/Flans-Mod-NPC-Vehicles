//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelEmeraude extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelEmeraude() {
        this.textureX = 256;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[32];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 49, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 81, 65, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 81, 73, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 49, 81, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 89, 81, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 57, 89, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 121, 41, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 89, 89, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 113, 65, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 139, 0, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 139, 0, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-11.0f, 8.0f, -4.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 35, 4, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-11.0f, 10.0f, -4.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[2].setRotationPoint(-11.0f, 14.0f, -4.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 19, 3, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(24.0f, 8.0f, -4.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -7.0f, -0.5f, -3.0f, -7.0f, -0.5f, -3.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[4].setRotationPoint(24.0f, 14.0f, -4.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 8, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, -2.0f, 8.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(24.0f, 10.0f, -4.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 32, 3, 8, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -3.5f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -2.0f);
        this.bodyModel[6].setRotationPoint(-43.0f, 8.0f, -4.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 24, 4, 8, 0.0f, 8.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, -2.0f, -6.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -2.0f);
        this.bodyModel[7].setRotationPoint(-35.0f, 10.0f, -4.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 18, 2, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -7.0f, -0.5f, -3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -7.0f, -0.5f, -3.0f);
        this.bodyModel[8].setRotationPoint(-29.0f, 14.0f, -4.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-7.0f, 4.0f, -1.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-7.0f, 6.0f, -1.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[11].setRotationPoint(-10.0f, 4.0f, -1.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 3, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f);
        this.bodyModel[12].setRotationPoint(-8.0f, 3.2f, -1.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 3, 0.0f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, -0.4f);
        this.bodyModel[13].setRotationPoint(-15.0f, 3.2f, -1.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, 0.2f);
        this.bodyModel[14].setRotationPoint(5.0f, 3.2f, -1.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(-40.0f, 12.0f, -0.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[16].setRotationPoint(-34.8f, 11.2f, -0.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 16, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f);
        this.bodyModel[17].setRotationPoint(-34.8f, 15.0f, -0.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[18].setRotationPoint(-42.0f, 13.0f, -1.7f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[19].setRotationPoint(-42.0f, 13.0f, 0.7f);
        this.bodyModel[20].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[20].setRotationPoint(-42.0f, 13.5f, -1.2f);
        this.bodyModel[21].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[21].setRotationPoint(-42.0f, 13.5f, -1.2f);
        this.bodyModel[21].rotateAngleX = 2.0943952f;
        this.bodyModel[22].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[22].setRotationPoint(-42.0f, 13.5f, -1.2f);
        this.bodyModel[22].rotateAngleX = 4.1887903f;
        this.bodyModel[23].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[23].setRotationPoint(-42.0f, 13.5f, 1.2f);
        this.bodyModel[23].rotateAngleX = 4.1887903f;
        this.bodyModel[24].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[24].setRotationPoint(-42.0f, 13.5f, 1.2f);
        this.bodyModel[24].rotateAngleX = 2.0943952f;
        this.bodyModel[25].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[25].setRotationPoint(-42.0f, 13.5f, 1.2f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.bodyModel[26].setRotationPoint(8.0f, 3.2f, 0.3f);
        this.bodyModel[26].rotateAngleZ = -0.36651915f;
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.bodyModel[27].setRotationPoint(-13.5f, 3.2f, 0.3f);
        this.bodyModel[27].rotateAngleZ = -1.5707964f;
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.bodyModel[28].setRotationPoint(-13.5f, 3.2f, -1.3f);
        this.bodyModel[28].rotateAngleZ = -1.5707964f;
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.bodyModel[29].setRotationPoint(8.0f, 3.2f, -1.3f);
        this.bodyModel[29].rotateAngleZ = -0.36651915f;
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, -1.0f, 54, 90, 1, 0.0f, 0.0f, 0.0f, 0.0f, -51.0f, 0.0f, 0.0f, -51.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -85.0f, 0.0f, -51.0f, -85.0f, 0.0f, -51.0f, -85.0f, 0.0f, 0.0f, -85.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(-5.0f, 7.2f, 1.55f);
        this.bodyModel[30].rotateAngleZ = 1.5707964f;
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, -1.0f, 54, 90, 1, 0.0f, 0.0f, 0.0f, 0.0f, -51.0f, 0.0f, 0.0f, -51.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -85.0f, 0.0f, -51.0f, -85.0f, 0.0f, -51.0f, -85.0f, 0.0f, 0.0f, -85.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(0.0f, 7.2f, -1.55f);
        this.bodyModel[31].rotateAngleY = -3.1415927f;
        this.bodyModel[31].rotateAngleZ = 1.5707964f;
    }
}
