//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ZertsaloKrug
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZertsaloKrug extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelZertsaloKrug() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];
		skirtFrontModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 48
		bodyModel[1] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 61
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 42
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 43
		bodyModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 45
		bodyModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 46
		bodyModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 47
		bodyModel[7] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 48
		bodyModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 49
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 50
		bodyModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 51
		bodyModel[11] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 52
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 64
		bodyModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 66
		bodyModel[15] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 70
		bodyModel[16] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 71
		bodyModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 84
		bodyModel[18] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 85
		bodyModel[19] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 86
		bodyModel[20] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 87
		bodyModel[21] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 88
		bodyModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 89
		bodyModel[23] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 90
		bodyModel[24] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 86
		bodyModel[25] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 87
		bodyModel[26] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 88

		bodyModel[0].addShapeBox(-4.5F, 4.8F, -2.5F, 9, 6, 5, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 1F, 0.15F, 0F, 1F, 0.15F, 0F, 1F, 0.15F, 0F, 1F, 0.15F); // Box 48
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10.55F, -2F, 4, 1, 4, 0F,0.6F, -0.2F, 0.8F, 4.6F, -0.2F, 0.8F, 4.6F, -0.2F, 0.8F, 0.6F, -0.2F, 0.8F, 0.6F, -0.2F, 0.8F, 4.6F, -0.2F, 0.8F, 4.6F, -0.2F, 0.8F, 0.6F, -0.2F, 0.8F); // Box 61
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 5, 5, 0F,0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 42
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 6F, -3.7F, 9, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 43
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 2.5F, -3.7F, 9, 2, 1, 0F,-3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F); // Box 45
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 4F, -3.7F, 9, 2, 1, 0F,-1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 46
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.5F, 8F, -3.7F, 9, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F); // Box 47
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.5F, 9.5F, -3.7F, 9, 2, 1, 0F,-1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F); // Box 48
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.5F, 6.5F, -3.9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 5.5F, -3.9F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1.5F, 7.5F, -3.9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 51
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1.5F, 0.2F, -3.5F, 3, 3, 1, 0F,0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.5F, -0.8F, -3.5F, 5, 4, 7, 0F,1F, -0.1F, -0.7F, -3.2F, 0.4F, -0.7F, -3.2F, 0.4F, -0.7F, 1F, -0.1F, -0.7F, -1F, 1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 1.5F, 0F); // Box 53
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.5F, 9.5F, 2.7F, 9, 2, 1, 0F,-1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F); // Box 64
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.5F, 7.5F, 2.9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1.5F, -0.8F, 2.5F, 3, 4, 1, 0F,1.2F, 0.4F, 1F, 1.2F, 0.4F, 1F, 1.2F, 0.4F, -0.7F, 1.2F, 0.4F, -0.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.5F, -1.2F, -1.5F, 5, 1, 3, 0F,0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0.3F, -0.2F, 1.2F, 0.3F, -0.2F, 1.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 71
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4.5F, 8F, 2.7F, 9, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F); // Box 84
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.5F, 6F, 2.7F, 9, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 85
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4.5F, 4F, 2.7F, 9, 2, 1, 0F,-1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 86
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4.5F, 2.5F, 2.7F, 9, 2, 1, 0F,-3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F); // Box 87
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1.5F, 6.5F, 2.9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1.5F, 5.5F, 2.9F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-0.5F, -0.8F, -3.5F, 5, 4, 7, 0F,-3.2F, 0.4F, -0.7F, 1F, -0.1F, -0.7F, 1F, -0.1F, -0.7F, -3.2F, 0.4F, -0.7F, -1.5F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, -1.5F, 0F, 0F); // Box 90
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-5.5F, 5.2F, -3F, 15, 10, 6, 0F,0.2F, 0F, 0.4F, -3.8F, 0F, 0.4F, -3.8F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.7F, -5F, 0.3F, -4.7F, -5F, 0.3F, -4.7F, -5F, 0.3F, -0.7F, -5F, 0.3F); // Box 86
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-5F, 2.2F, -3F, 14, 3, 6, 0F,-0.7F, 0F, 0F, -4.7F, 0F, 0F, -4.7F, 0F, 0F, -0.7F, 0F, 0F, 0.4F, 0F, 0.3F, -3.6F, 0F, 0.3F, -3.6F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Box 87
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-5F, 10.2F, -3F, 14, 2, 6, 0F,-0.4F, 0F, 0F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, -0.4F, 0F, 0F, 0.3F, 0F, 0.4F, -3.7F, 0F, 0.4F, -3.7F, 0F, 0.4F, 0.3F, 0F, 0.4F); // Box 88
		bodyModel[26].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 89
		leftArmModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 90
		leftArmModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 91
		leftArmModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 92

		leftArmModel[0].addShapeBox(-5F, 4.5F, -2F, 8, 4, 8, 0F,-3.4F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, -3.4F, -3.4F, 0F, -3.4F, -3.7F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, -3.8F, -3.7F, 0.5F, -3.7F); // Box 89
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.3F, 0.6F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.6F, 0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 90
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(3F, 4F, -2F, 1, 5, 4, 0F,-0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 91
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(3F, 0.6F, -2F, 1, 3, 4, 0F,-1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 92
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 56
		rightArmModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 62
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 63
		rightArmModel[3] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 40

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.6F, 0.3F, 0.3F, 0.6F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 56
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4F, 4F, -2F, 1, 5, 4, 0F,0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F); // Box 62
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4F, 0.6F, -2F, 1, 3, 4, 0F,0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 63
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 4.5F, -2F, 8, 4, 8, 0F,0.6F, 0F, 0.6F, -3.4F, 0F, 0.6F, -3.4F, 0F, -3.4F, 0.6F, 0F, -3.4F, 0.3F, 0.5F, 0.3F, -3.7F, 0.5F, 0.3F, -3.7F, 0.5F, -3.7F, 0.3F, 0.5F, -3.8F); // Box 40
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 93

		leftLegModel[0].addShapeBox(-2F, 4.8F, -2F, 8, 5, 8, 0F,0.7F, 0.2F, 0.7F, -3.3F, 0.2F, 0.7F, -3.3F, 0.2F, -3.3F, 0.7F, 0.2F, -3.3F, 0.4F, 1F, 0.4F, -3.6F, 1F, 0.4F, -3.6F, 1F, -3.6F, 0.4F, 1F, -3.6F); // Box 93
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 55

		rightLegModel[0].addShapeBox(-2F, 4.8F, -2F, 8, 5, 8, 0F,0.7F, 0.2F, 0.7F, -3.3F, 0.2F, 0.7F, -3.3F, 0.2F, -3.3F, 0.7F, 0.2F, -3.3F, 0.4F, 1F, 0.4F, -3.6F, 1F, 0.4F, -3.6F, 1F, -3.6F, 0.4F, 1F, -3.6F); // Box 55
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44

		skirtFrontModel[0].addShapeBox(-4F, -1.5F, -2F, 8, 12, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 2F, -6F, 1.8F, 2F, -6F, 1.8F, 2F, -5.9F, 1.8F, 2F, -5.9F, 1.8F); // Box 44
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}
}