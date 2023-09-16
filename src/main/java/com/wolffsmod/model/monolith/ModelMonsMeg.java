//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelMonsMeg extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelMonsMeg() {
        this.textureX = 256;
        this.textureY = 256;
        this.bodyModel = new ModelRendererTurbo[15];
        this.leftBackWheelModel = new ModelRendererTurbo[6];
        this.rightBackWheelModel = new ModelRendererTurbo[6];
        this.initbodyModel_1();
        this.initleftBackWheelModel_1();
        this.initrightBackWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 161, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 161, 49, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 121, 73, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 153, 97, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 121, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 169, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 97, 169, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 217, 81, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 217, 161, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 60, 5, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[0].setRotationPoint(-22.0f, -11.0f, -8.0f);
        this.bodyModel[1].addShapeBox(0.0f, -5.0f, 0.0f, 60, 6, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-22.0f, -12.0f, -8.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 60, 5, 16, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(-22.0f, -22.0f, -8.0f);
        this.bodyModel[3].addShapeBox(0.0f, -5.0f, 0.0f, 46, 16, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(-24.0f, -4.0f, -13.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 6, 5, 16, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[4].setRotationPoint(38.0f, -22.5f, -8.0f);
        this.bodyModel[5].addShapeBox(0.0f, -5.0f, 0.0f, 6, 7, 17, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(38.0f, -12.5f, -8.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 6, 5, 16, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f);
        this.bodyModel[6].setRotationPoint(38.0f, -10.5f, -8.0f);
        this.bodyModel[7].addShapeBox(0.0f, -5.0f, 0.0f, 24, 5, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(-46.0f, -11.5f, -7.0f);
        this.bodyModel[8].addShapeBox(0.0f, -10.0f, 0.0f, 24, 5, 14, 0.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(-46.0f, -11.5f, -7.0f);
        this.bodyModel[9].addShapeBox(0.0f, -10.0f, 0.0f, 24, 5, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f);
        this.bodyModel[9].setRotationPoint(-46.0f, -1.5f, -7.0f);
        this.bodyModel[10].addShapeBox(0.0f, -5.0f, 0.0f, 14, 14, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-38.0f, -2.0f, -13.0f);
        this.bodyModel[11].addShapeBox(-1.5f, -1.5f, 0.0f, 3, 3, 42, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(16.0f, 3.0f, -21.0f);
        this.bodyModel[12].addShapeBox(-1.5f, -1.5f, 0.0f, 3, 3, 42, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(-27.0f, 3.0f, -21.0f);
        this.bodyModel[13].addShapeBox(0.0f, -5.0f, 0.0f, 4, 16, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(22.0f, -4.0f, -13.0f);
        this.bodyModel[14].addShapeBox(0.0f, -5.0f, 0.0f, 4, 16, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(22.0f, -4.0f, 4.0f);
    }
    
    private void initleftBackWheelModel_1() {
        this.leftBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 209, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 185, 73, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 121, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 121, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 153, 121, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 201, 121, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShapeBox(-7.5f, -2.5f, 0.0f, 15, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[0].setRotationPoint(16.0f, 3.0f, 13.0f);
        this.leftBackWheelModel[1].addShapeBox(-7.5f, 2.5f, 0.0f, 15, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[1].setRotationPoint(16.0f, 3.0f, 13.0f);
        this.leftBackWheelModel[2].addShapeBox(-7.5f, -7.5f, 0.0f, 15, 5, 5, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[2].setRotationPoint(16.0f, 3.0f, 13.0f);
        this.leftBackWheelModel[3].addShapeBox(-7.5f, 2.5f, 0.0f, 15, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[3].setRotationPoint(-27.0f, 3.0f, 13.0f);
        this.leftBackWheelModel[4].addShapeBox(-7.5f, -2.5f, 0.0f, 15, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[4].setRotationPoint(-27.0f, 3.0f, 13.0f);
        this.leftBackWheelModel[5].addShapeBox(-7.5f, -7.5f, 0.0f, 15, 5, 5, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[5].setRotationPoint(-27.0f, 3.0f, 13.0f);
    }
    
    private void initrightBackWheelModel_1() {
        this.rightBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 89, 137, this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 137, 137, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 185, 137, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 153, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 137, 153, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 185, 153, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShapeBox(-7.5f, -7.5f, 0.0f, 15, 5, 5, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[0].setRotationPoint(-27.0f, 3.0f, -18.0f);
        this.rightBackWheelModel[1].addShapeBox(-7.5f, 2.5f, 0.0f, 15, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[1].setRotationPoint(-27.0f, 3.0f, -18.0f);
        this.rightBackWheelModel[2].addShapeBox(-7.5f, -2.5f, 0.0f, 15, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[2].setRotationPoint(-27.0f, 3.0f, -18.0f);
        this.rightBackWheelModel[3].addShapeBox(-7.5f, 2.5f, 0.0f, 15, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[3].setRotationPoint(16.0f, 3.0f, -18.0f);
        this.rightBackWheelModel[4].addShapeBox(-7.5f, -2.5f, 0.0f, 15, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[4].setRotationPoint(16.0f, 3.0f, -18.0f);
        this.rightBackWheelModel[5].addShapeBox(-7.5f, -7.5f, 0.0f, 15, 5, 5, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[5].setRotationPoint(16.0f, 3.0f, -18.0f);
    }
}
