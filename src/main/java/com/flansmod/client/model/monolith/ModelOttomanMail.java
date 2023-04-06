//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MamlukMail
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOttomanMail extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelOttomanMail() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[18];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 46
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 47
		bodyModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 48
		bodyModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 49
		bodyModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 51
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 52
		bodyModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 57
		bodyModel[7] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 58
		bodyModel[8] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 59
		bodyModel[9] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 60
		bodyModel[10] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 65
		bodyModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 66
		bodyModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 67
		bodyModel[13] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 68
		bodyModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 69
		bodyModel[15] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 70
		bodyModel[16] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 71
		bodyModel[17] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 72

		bodyModel[0].addShapeBox(-4F, 8.8F, -2F, 8, 2, 4, 0F,0.75F, 0F, 1F, 1.2F, 1F, 1F, 1.2F, 1F, 1F, 0.75F, 0F, 1F, 1F, 0.5F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 1F, 0.5F, 1F); // Box 46
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8.5F, -2F, 8, 2, 4, 0F,1.2F, 0.5F, 1.2F, 0.8F, 0F, 1.2F, 0.8F, 0F, 1.2F, 1.2F, 0.5F, 1.2F, 1F, 0F, 1.2F, 1.2F, 0.5F, 1.2F, 1.2F, 0.5F, 1.2F, 1F, 0F, 1.2F); // Box 47
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 10, 5, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 48
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1.5F, 1.8F, -3.1F, 3, 7, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.55F, 3.8F, -3.1F, 3, 5, 1, 0F,0F, 0.5F, 0.2F, -0.1F, 0.5F, 0.2F, -0.1F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.55F, 1.8F, -3.1F, 3, 2, 1, 0F,-1.2F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0.2F, 0F, -1.2F, 0.2F, 0F, 0F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5.2F, 3.8F, -2.5F, 1, 5, 5, 0F,0.2F, 0.5F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, 0F, 0.2F, 0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 57
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(1F, 10.5F, 2.2F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, 0F, -1.1F, 0.2F, 0F, -1.1F, 0.2F, 0F, 0.9F, -0.4F, 0F, 0.9F); // Box 58
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(1F, 10.5F, -3.2F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.2F, 0F, 0.9F, -0.4F, 0F, 0.9F, -0.4F, 0F, -1.1F, 0.2F, 0F, -1.1F); // Box 59
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(1.3F, 10F, -3.2F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.4F, 0F, 0.9F, 1.2F, 0F, 0.9F, 1.2F, 0F, -1.1F, -1.4F, 0F, -1.1F); // Box 60
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(1.55F, 3.8F, -3.1F, 3, 5, 1, 0F,-0.1F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.7F, 0F, -0.1F, 0.7F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.55F, 1.8F, -3.1F, 3, 2, 1, 0F,-0.1F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.55F, 3.8F, 2.1F, 3, 5, 1, 0F,0F, 0.7F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 67
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.55F, 1.8F, 2.1F, 3, 2, 1, 0F,-1.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0F, 0.2F, -1.2F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 68
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.5F, 1.8F, 2.1F, 3, 7, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 69
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.55F, 1.8F, 2.1F, 3, 2, 1, 0F,-0.1F, 0.2F, 0F, -1.2F, 0.2F, 0F, -1.2F, 0F, 0.2F, -0.1F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F); // Box 70
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.55F, 3.8F, 2.1F, 3, 5, 1, 0F,-0.1F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.5F, 0.2F, -0.1F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 71
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(4.2F, 3.8F, -2.5F, 1, 5, 5, 0F,0F, 0.7F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[17].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 73
		leftArmModel[1] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 74
		leftArmModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 76
		leftArmModel[3] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 77
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 78

		leftArmModel[0].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 73
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 74
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(3F, 4F, -2F, 1, 5, 4, 0F,-0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 76
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(3F, 0.6F, -2F, 1, 3, 4, 0F,-1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 77
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, -2F, -2F, 4, 7, 4, 0F,0.3F, 0.35F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.35F, 0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 78
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 61
		rightArmModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 62
		rightArmModel[3] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 63
		rightArmModel[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 64

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 7, 4, 0F,0.3F, 0.25F, 0.3F, 0.3F, 0.35F, 0.3F, 0.3F, 0.35F, 0.3F, 0.3F, 0.25F, 0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 56
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 61
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4F, 4F, -2F, 1, 5, 4, 0F,0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F); // Box 62
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-4F, 0.6F, -2F, 1, 3, 4, 0F,0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 63
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 64
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 75

		leftLegModel[0].addShapeBox(-2F, 5.8F, -2F, 4, 5, 4, 0F,0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 75
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 55

		rightLegModel[0].addShapeBox(-2F, 5.8F, -2F, 4, 5, 4, 0F,0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 55
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44

		skirtFrontModel[0].addShapeBox(-4F, -1.5F, -2F, 8, 6, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 1.6F, 0F, 1.1F, 1.7F, 0F, 1.1F, 2F, 0.1F, 0.8F, 1.9F, 0.1F, 0.7F); // Box 44
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 45

		skirtRearModel[0].addShapeBox(-4F, -1.5F, 0F, 8, 6, 2, 0F,0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 1.7F, 0F, 0.8F, 1.6F, 0F, 0.7F, 1.6F, 0F, 1.1F, 1.7F, 0F, 1.1F); // Box 45
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}