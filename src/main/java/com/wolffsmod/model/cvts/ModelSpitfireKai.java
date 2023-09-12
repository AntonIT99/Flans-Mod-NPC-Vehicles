//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelSpitfireKai extends ModelFlanPlane
{
    public ModelSpitfireKai() {
        final int textureX = 256;
        final int textureY = 128;
        (this.bodyModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 0, 104, textureX, textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 60, 76, textureX, textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 60, 76, textureX, textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 76, textureX, textureY);
        this.bodyModel[0].addBox(-3.0f, 0.0f, -31.0f, 20, 2, 20);
        this.bodyModel[0].setPosition(0.0f, 5.0f, 21.0f);
        this.bodyModel[1].addBox(-3.0f, -16.0f, -10.0f, 20, 16, 2);
        this.bodyModel[1].setPosition(0.0f, 5.0f, 0.0f);
        this.bodyModel[2].addBox(-17.0f, -16.0f, -10.0f, 20, 16, 2);
        this.bodyModel[2].rotateAngleY = 3.1415927f;
        this.bodyModel[2].setPosition(0.0f, 5.0f, 0.0f);
        this.bodyModel[3].addTrapezoid(-3.0f, -19.0f, -10.0f, 20, 8, 20, 0.0f, -3.0f, 4);
        (this.bodyWheelModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 116, 48, textureX, textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 116, 48, textureX, textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 200, 12, textureX, textureY);
        this.bodyWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 200, 12, textureX, textureY);
        this.bodyWheelModel[0].addBox(-6.0f, 14.0f, 4.0f, 6, 6, 4, 0.0f);
        this.bodyWheelModel[1].addBox(-6.0f, 14.0f, -8.0f, 6, 6, 4, 0.0f);
        this.bodyWheelModel[2].addBox(-4.0f, 6.0f, 5.0f, 2, 8, 2, 0.0f);
        this.bodyWheelModel[3].addBox(-4.0f, 6.0f, -7.0f, 2, 8, 2, 0.0f);
        this.noseModel = new ModelRendererTurbo[2];
        (this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 38, textureX, textureY)).addTrapezoid(-51.0f, -16.0f, -10.0f, 48, 18, 20, 0.0f, -3.0f, 3);
        this.noseModel[0].setPosition(0.0f, 5.0f, 0.0f);
        (this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 172, 12, textureX, textureY)).addBox(0.0f, -2.0f, 0.0f, 4, 4, 4, 0.0f);
        this.noseModel[1].setPosition(-55.0f, 0.0f, -2.0f);
        this.tailModel = new ModelRendererTurbo[1];
        (this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY)).addTrapezoid(17.0f, -16.0f, -10.0f, 76, 18, 20, 0.0f, -3.0f, 2);
        this.tailModel[0].setPosition(0.0f, 5.0f, 0.0f);
        (this.tailWheelModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 116, 48, textureX, textureY);
        this.tailWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 200, 12, textureX, textureY);
        this.tailWheelModel[0].addBox(79.0f, 6.0f, -2.0f, 6, 6, 4, 0.0f);
        this.tailWheelModel[1].addBox(81.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        (this.rightWingModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 58, 48, textureX, textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 172, 0, textureX, textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 192, 25, textureX, textureY);
        this.rightWingModel[0].addBox(-25.0f, -2.0f, 0.0f, 32, 2, 78, 0.0f);
        this.rightWingModel[0].setPosition(0.0f, 5.0f, 0.0f);
        this.rightWingModel[1].addTrapezoid(-25.0f, 3.0f, 78.0f, 32, 2, 10, 0.0f, -1.0f, 1);
        this.rightWingModel[2].addBox(-37.0f, 3.0f, 43.0f, 12, 2, 2, 0.0f);
        (this.leftWingModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 58, 48, textureX, textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 172, 0, textureX, textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 192, 25, textureX, textureY);
        this.leftWingModel[0].addBox(-32.0f, -2.0f, -78.0f, 32, 2, 78);
        this.leftWingModel[0].rotateAngleY = 3.1415927f;
        this.leftWingModel[0].setPosition(-25.0f, 5.0f, -78.0f);
        this.leftWingModel[1].addTrapezoid(-32.0f, 3.0f, -88.0f, 32, 2, 10, 0.0f, -1.0f, 1);
        this.leftWingModel[1].rotateAngleY = 3.1415927f;
        this.leftWingModel[1].setPosition(-25.0f, 0.0f, -166.0f);
        this.leftWingModel[2].addBox(-37.0f, 3.0f, -45.0f, 12, 2, 2, 0.0f);
        this.propellerModels = new ModelRendererTurbo[1][3];
        this.propellerModels[0][0] = new ModelRendererTurbo((ModelBase)this, 192, 12, textureX, textureY);
        this.propellerModels[0][1] = new ModelRendererTurbo((ModelBase)this, 192, 12, textureX, textureY);
        this.propellerModels[0][2] = new ModelRendererTurbo((ModelBase)this, 192, 12, textureX, textureY);
        this.propellerModels[0][0].addBox(-0.0f, -12.0f, -1.0f, 2, 11, 2, 0.0f);
        this.propellerModels[0][1].addBox(-0.0f, -12.0f, -1.0f, 2, 11, 2, 0.0f);
        this.propellerModels[0][2].addBox(-0.0f, -12.0f, -1.0f, 2, 11, 2, 0.0f);
        this.propellerModels[0][0].setRotationPoint(-54.0f, 0.0f, 0.0f);
        this.propellerModels[0][1].setRotationPoint(-54.0f, 0.0f, 0.0f);
        this.propellerModels[0][2].setRotationPoint(-54.0f, 0.0f, 0.0f);
        this.yawFlapModel = new ModelRendererTurbo[1];
        (this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 220, 12, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 16, 20, 2, 0.0f);
        this.yawFlapModel[0].setPosition(76.0f, -22.0f, -1.0f);
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        (this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 220, 12, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 16, 22, 2, 0.0f);
        this.pitchFlapLeftModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapLeftModel[0].setPosition(76.0f, 1.0f, -22.0f);
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 220, 12, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 16, 22, 2, 0.0f);
        this.pitchFlapRightModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapRightModel[0].setPosition(76.0f, 1.0f, 0.0f);
        this.translateAll(0, 16, 0);
        this.flipAll();
    }
}
