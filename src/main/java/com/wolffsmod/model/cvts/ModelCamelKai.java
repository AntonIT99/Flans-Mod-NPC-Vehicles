//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelCamelKai extends ModelPlane
{
    public ModelCamelKai() {
        final int textureX = 128;
        final int textureY = 128;
        this.propellerModels = new ModelRendererTurbo[1][3];
        this.propellerModels[0][0] = new ModelRendererTurbo((ModelBase)this, 56, 8, textureX, textureY);
        this.propellerModels[0][1] = new ModelRendererTurbo((ModelBase)this, 56, 8, textureX, textureY);
        this.propellerModels[0][2] = new ModelRendererTurbo((ModelBase)this, 56, 8, textureX, textureY);
        this.propellerModels[0][0].addBox(0.0f, -7.0f, -1.0f, 2, 5, 2, 0.0f);
        this.propellerModels[0][1].addBox(0.0f, -7.0f, -1.0f, 2, 5, 2, 0.0f);
        this.propellerModels[0][2].addBox(0.0f, -7.0f, -1.0f, 2, 5, 2, 0.0f);
        this.propellerModels[0][0].setRotationPoint(-27.0f, 0.0f, 0.0f);
        this.propellerModels[0][1].setRotationPoint(-27.0f, 0.0f, 0.0f);
        this.propellerModels[0][2].setRotationPoint(-27.0f, 0.0f, 0.0f);
        this.yawFlapModel = new ModelRendererTurbo[1];
        (this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 104, 0, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 2, 0.0f);
        this.yawFlapModel[0].setPosition(40.0f, -12.0f, -1.0f);
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        (this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 104, 0, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 10, 15, 2, 0.0f);
        this.pitchFlapLeftModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapLeftModel[0].setPosition(40.0f, 3.0f, -15.0f);
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 104, 0, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 10, 15, 2, 0.0f);
        this.pitchFlapRightModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapRightModel[0].setPosition(40.0f, 3.0f, 0.0f);
        (this.bodyModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 0, 8, textureX, textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY);
        final byte length = 24;
        final byte sidePieceHeight = 6;
        final byte width = 20;
        final byte boatDepth = 4;
        this.bodyModel[0].addBox((float)(-length / 2), (float)(-width / 2 + 2), -3.0f, (int)length, width - 4, 4, 0.0f);
        this.bodyModel[0].setPosition(0.0f, (float)(0 + boatDepth), 0.0f);
        this.bodyModel[1].addBox((float)(-length / 2 + 2), (float)(-sidePieceHeight - 1), -1.0f, length - 4, (int)sidePieceHeight, 2, 0.0f);
        this.bodyModel[1].setPosition((float)(-length / 2 + 1), (float)(0 + boatDepth), 0.0f);
        this.bodyModel[2].addBox((float)(-length / 2 + 2), (float)(-sidePieceHeight - 1), -1.0f, length - 4, (int)sidePieceHeight, 2, 0.0f);
        this.bodyModel[2].setPosition((float)(length / 2 - 1), (float)(0 + boatDepth), 0.0f);
        this.bodyModel[3].addBox((float)(-length / 2 + 2), (float)(-sidePieceHeight - 1), -1.0f, length - 4, (int)sidePieceHeight, 2, 0.0f);
        this.bodyModel[3].setPosition(0.0f, (float)(0 + boatDepth), (float)(-width / 2 + 1));
        this.bodyModel[4].addBox((float)(-length / 2 + 2), (float)(-sidePieceHeight - 1), -1.0f, length - 4, (int)sidePieceHeight, 2, 0.0f);
        this.bodyModel[4].setPosition(0.0f, (float)(0 + boatDepth), (float)(width / 2 - 1));
        this.bodyModel[0].rotateAngleX = 1.570796f;
        this.bodyModel[1].rotateAngleY = 4.712389f;
        this.bodyModel[2].rotateAngleY = 1.570796f;
        this.bodyModel[3].rotateAngleY = 3.141593f;
        (this.noseModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 44, 0, textureX, textureY);
        this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 64, textureX, textureY);
        this.noseModel[2] = new ModelRendererTurbo((ModelBase)this, 12, 32, textureX, textureY);
        this.noseModel[3] = new ModelRendererTurbo((ModelBase)this, 12, 32, textureX, textureY);
        this.noseModel[0].addBox(0.0f, 0.0f, 0.0f, 4, 4, 4, 0.0f);
        this.noseModel[0].setPosition(-28.0f, -2.0f, -2.0f);
        this.noseModel[1].addBox(0.0f, 0.0f, 0.0f, 12, 10, 18, 0.0f);
        this.noseModel[1].setPosition(-24.0f, -3.0f, -9.0f);
        this.noseModel[2].addBox(-24.0f, -5.0f, 2.0f, 14, 2, 2, 0.0f);
        this.noseModel[3].addBox(-24.0f, -5.0f, -4.0f, 14, 2, 2, 0.0f);
        (this.bodyWheelModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 0, 32, textureX, textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 32, textureX, textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 56, 15, textureX, textureY);
        this.bodyWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 56, 15, textureX, textureY);
        this.bodyWheelModel[0].addBox(-4.0f, 11.0f, 5.0f, 4, 4, 2, 0.0f);
        this.bodyWheelModel[1].addBox(-4.0f, 11.0f, -7.0f, 4, 4, 2, 0.0f);
        this.bodyWheelModel[2].addBox(-3.0f, 6.0f, 5.0f, 2, 5, 2, 0.0f);
        this.bodyWheelModel[3].addBox(-3.0f, 6.0f, -7.0f, 2, 5, 2, 0.0f);
        (this.rightWingModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 64, 0, textureX, textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 56, 15, textureX, textureY);
        this.rightWingModel[0].addBox(0.0f, 0.0f, 0.0f, 18, 41, 2, 0.0f);
        this.rightWingModel[0].rotateAngleX = -1.570796f;
        this.rightWingModel[0].setPosition(-9.0f, 0.0f, -9.0f);
        this.rightWingModel[1].addBox(-1.0f, -18.0f, -40.0f, 2, 18, 2, 0.0f);
        (this.leftWingModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 64, 0, textureX, textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 56, 15, textureX, textureY);
        this.leftWingModel[0].addBox(0.0f, 0.0f, 0.0f, 18, 41, 2, 0.0f);
        this.leftWingModel[0].rotateAngleX = -1.570796f;
        this.leftWingModel[0].setPosition(-9.0f, 0.0f, 50.0f);
        this.leftWingModel[1].addBox(-1.0f, -18.0f, 38.0f, 2, 18, 2, 0.0f);
        (this.topWingModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 64, 0, textureX, textureY);
        this.topWingModel[1] = new ModelRendererTurbo((ModelBase)this, 64, 0, textureX, textureY);
        this.topWingModel[2] = new ModelRendererTurbo((ModelBase)this, 64, 0, textureX, textureY);
        this.topWingModel[0].addBox(0.0f, 0.0f, 0.0f, 18, 18, 2, 0.0f);
        this.topWingModel[0].rotateAngleX = -1.570796f;
        this.topWingModel[0].setPosition(-9.0f, -20.0f, 9.0f);
        this.topWingModel[1].addBox(0.0f, 0.0f, 0.0f, 18, 41, 2, 0.0f);
        this.topWingModel[1].rotateAngleX = -1.570796f;
        this.topWingModel[1].setPosition(-9.0f, -20.0f, 50.0f);
        this.topWingModel[2].addBox(0.0f, 0.0f, 0.0f, 18, 41, 2, 0.0f);
        this.topWingModel[2].rotateAngleX = -1.570796f;
        this.topWingModel[2].setPosition(-9.0f, -20.0f, -9.0f);
        this.tailModel = new ModelRendererTurbo[1];
        (this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 43, textureX, textureY)).addBox(11.0f, -2.0f, -5.0f, 40, 8, 10, 0.0f);
        this.tailWheelModel = new ModelRendererTurbo[1];
        (this.tailWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 32, textureX, textureY)).addBox(44.0f, 6.0f, -1.0f, 4, 4, 2, 0.0f);
        this.translateAll(0, 16, 0);
        this.flipAll();
    }
}
