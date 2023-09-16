//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelSteamFrigate extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelSteamFrigate() {
        this.textureX = 256;
        this.textureY = 256;
        this.bodyModel = new ModelRendererTurbo[23];
        this.frontWheelModel = new ModelRendererTurbo[2];
        this.initbodyModel_1();
        this.initfrontWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 153, 49, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 137, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 73, 97, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 121, 97, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 201, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 169, 97, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 169, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 249, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 57, 49, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 225, 25, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 129, 147, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 201, 129, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 73, 129, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 225, 25, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 129, 147, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 225, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 129, 147, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 82, 13, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-37.5f, -7.2f, -14.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 11, 13, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(44.5f, -7.2f, -14.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 6, 15, 28, 0.0f, 0.0f, -1.0f, 0.0f, 12.0f, 1.0f, -9.0f, 12.0f, 1.0f, -9.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -11.0f, -0.5f, 0.0f, -11.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(55.5f, -9.2f, -14.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 6, 13, 28, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[3].setRotationPoint(-43.5f, -7.2f, -14.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 10, 13, 24, 0.0f, 0.0f, 1.5f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, -4.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f);
        this.bodyModel[4].setRotationPoint(-53.5f, -7.2f, -12.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 3, 14, 8, 0.0f, 5.0f, 0.5f, -3.5f, 0.0f, 0.5f, 4.0f, 0.0f, 0.5f, 4.0f, 5.0f, 0.5f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f);
        this.bodyModel[5].setRotationPoint(-56.5f, -8.2f, -4.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 8, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, -0.9f, -3.5f, 0.0f, -0.5f, -2.5f, 0.0f, -0.5f, -2.5f, 0.0f, -0.9f, -3.5f);
        this.bodyModel[6].setRotationPoint(-56.5f, 5.8f, -4.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 82, 4, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -10.0f, 0.0f, 0.5f, -10.0f, 0.0f, 0.5f, -10.0f, 0.0f, 0.5f, -10.0f);
        this.bodyModel[7].setRotationPoint(-37.5f, 5.8f, -14.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 6, 4, 28, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -11.0f, 0.0f, 0.5f, -10.0f, 0.0f, 0.5f, -10.0f, 0.0f, 0.0f, -11.0f);
        this.bodyModel[8].setRotationPoint(-43.5f, 5.8f, -14.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 24, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -1.5f, -10.5f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, -1.5f, -10.5f);
        this.bodyModel[9].setRotationPoint(-53.5f, 5.8f, -12.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 19, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-56.5f, 5.3f, -0.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -10.0f, 0.0f, 0.5f, -12.0f, 0.0f, 0.5f, -12.0f, 0.0f, 0.5f, -10.0f);
        this.bodyModel[11].setRotationPoint(44.5f, 5.8f, -14.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 6, 5, 28, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -11.0f, -0.5f, 0.0f, -11.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -12.0f, -3.5f, -2.0f, -13.5f, -3.5f, -2.0f, -13.5f, 0.0f, -0.5f, -12.0f);
        this.bodyModel[12].setRotationPoint(55.5f, 5.8f, -14.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[13].setRotationPoint(-63.0f, -19.2f, -0.5f);
        this.bodyModel[13].rotateAngleZ = 0.2268928f;
        this.bodyModel[14].addShapeBox(0.3f, 0.0f, 0.0f, 20, 12, 1, 0.0f, -13.0f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -13.0f, 0.0f, -0.4f, -13.0f, -8.0f, -0.4f, -0.3f, -8.0f, -0.4f, -0.3f, -8.0f, -0.4f, -13.0f, -8.0f, -0.4f);
        this.bodyModel[14].setRotationPoint(-82.0f, -14.2f, -0.5f);
        this.bodyModel[14].rotateAngleZ = 0.2268928f;
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 2, 71, 2, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, -78.0f, -1.0f);
        this.bodyModel[16].addShapeBox(2.0f, 0.0f, -30.0f, 1, 41, 63, 0.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, -65.0f, 0.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 6, 24, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(19.5f, -30.2f, -3.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 40, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(50.0f, -8.0f, -1.5f);
        this.bodyModel[18].rotateAngleZ = 0.15707964f;
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 2, 71, 2, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(42.0f, -78.0f, -1.0f);
        this.bodyModel[20].addShapeBox(2.0f, 0.0f, -30.0f, 1, 41, 63, 0.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.bodyModel[20].setRotationPoint(42.0f, -65.0f, 0.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 2, 71, 2, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(-35.0f, -78.0f, -1.0f);
        this.bodyModel[22].addShapeBox(2.0f, 0.0f, -30.0f, 1, 41, 63, 0.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, -6.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.bodyModel[22].setRotationPoint(-35.0f, -65.0f, 0.0f);
    }
    
    private void initfrontWheelModel_1() {
        this.frontWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.frontWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.frontWheelModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 5, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.frontWheelModel[0].setRotationPoint(-61.5f, 5.3f, 0.0f);
        this.frontWheelModel[1].addShapeBox(0.0f, 0.0f, -0.5f, 5, 2, 1, 0.0f, -4.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.frontWheelModel[1].setRotationPoint(-61.5f, 3.3f, 0.0f);
    }
}
