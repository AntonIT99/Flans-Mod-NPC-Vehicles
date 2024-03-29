package com.wolffsmod.model.official.ww2;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.model.ModelFlanVehicle;

public class ModelKubelLegacy extends ModelFlanVehicle
{
    public ModelKubelLegacy()
    {
        int textureX = 128;
        int textureY = 128;

        bodyModel = new ModelRendererTurbo[11];

        bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 0, 40, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 40, textureX, textureY);
        bodyModel[4] = new ModelRendererTurbo(this, 60, 12, textureX, textureY);
        bodyModel[5] = new ModelRendererTurbo(this, 0, 43, textureX, textureY);
        bodyModel[6] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
        bodyModel[7] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
        bodyModel[8] = new ModelRendererTurbo(this, 32, 49, textureX, textureY);
        bodyModel[9] = new ModelRendererTurbo(this, 90, 12, textureX, textureY);
        bodyModel[10] = new ModelRendererTurbo(this, 66, 49, textureX, textureY);

        bodyModel[0].addBox(8F, -6F , -14F, 16, 12, 28, 0.0F);		//Bonnet
        bodyModel[1].addBox(-24F, 4F, -16F, 32, 2, 32, 0.0F);		//Floor
        bodyModel[2].addBox(8F, 0F, -16F, 16, 1, 2, 0.0F);		//Wheel cover
        bodyModel[3].addBox(8F, 0F, 14F, 16, 1, 2, 0.0F);			//Wheel cover
        bodyModel[4].addBox(-6F, -4F, -14F, 1, 8, 28, 0.0F);		//Mid seat
        bodyModel[5].addBox(-24F, -6F, -14F, 4, 10, 28, 0.0F);		//Back seat
        bodyModel[6].addBox(-24F, -6F, -16F, 32, 10, 2, 0.0F);		//Door
        bodyModel[7].addBox(-24F, -6F, -16F, 32, 10, 2, 0.0F);		//Door
        bodyModel[7].doMirror(false, false, true);
        bodyModel[8].addBox(8F, -14F, -16F, 1, 8, 32, 0.0F);		//Windshield
        bodyModel[9].addBox(12F, -8F, -4F, 8, 2, 8, 0.0F);			//Spare Wheel
        bodyModel[10].addBox(-6F, -18F, -0.5F, 1, 14, 1, 0.0F);		//Gun pole

        leftBackWheelModel = new ModelRendererTurbo[1];
        leftBackWheelModel[0] = new ModelRendererTurbo(this, 90, 22, textureX, textureY);
        leftBackWheelModel[0].addBox(-20F, 6F, 13F, 8, 4, 2, 0.0F);

        rightBackWheelModel = new ModelRendererTurbo[1];
        rightBackWheelModel[0] = new ModelRendererTurbo(this, 90, 22, textureX, textureY);
        rightBackWheelModel[0].addBox(-20F, 6F, -15F, 8, 4, 2, 0.0F);

        leftFrontWheelModel = new ModelRendererTurbo[1];
        leftFrontWheelModel[0] = new ModelRendererTurbo(this, 90, 28, textureX, textureY);
        leftFrontWheelModel[0].addBox(-4F, -4F, -1F, 8, 8, 2, 0.0F);
        leftFrontWheelModel[0].setRotationPoint(16F, 6F, 15F);

        rightFrontWheelModel = new ModelRendererTurbo[1];
        rightFrontWheelModel[0] = new ModelRendererTurbo(this, 90, 28, textureX, textureY);
        rightFrontWheelModel[0].addBox(-4F, -4F, -1F, 8, 8, 2, 0.0F);
        rightFrontWheelModel[0].setRotationPoint(16F, 6F, -15F);

        //Gun model stolen from the MG42
        ModelRendererTurbo[][] mg42Model = new ModelRendererTurbo[3][];

        //No yaw only part
        mg42Model[0] = new ModelRendererTurbo[0];

        //The main gun part
        mg42Model[1] = new ModelRendererTurbo[4];
        mg42Model[1][0] = new ModelRendererTurbo(this, 66, 77, textureX, textureY);
        mg42Model[1][1] = new ModelRendererTurbo(this, 66, 72, textureX, textureY);
        mg42Model[1][2] = new ModelRendererTurbo(this, 74, 75, textureX, textureY);
        mg42Model[1][3] = new ModelRendererTurbo(this, 84, 68, textureX, textureY);

        mg42Model[1][0].addBox(-8F, -1F, -1F, 16, 2, 2);
        mg42Model[1][1].addBox(-4F, 1F, -1F, 2, 3, 2);
        mg42Model[1][2].addBox(8F, -0.5F, -0.5F, 4, 1, 1);
        mg42Model[1][3].addBox(0F, -1F, -6F, 2, 4, 5);

        //Set the origin
        for(ModelRendererTurbo gunPart : mg42Model[1])
            gunPart.setRotationPoint(-6F, -18F, 0F);

        //No recoil part
        mg42Model[2] = new ModelRendererTurbo[0];

        registerGunModel("MG42", mg42Model);

        flipAll(); //For old models
    }
}