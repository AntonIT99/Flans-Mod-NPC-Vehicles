//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FullKrug
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFullKrug extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelFullKrug() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];
		leftArmModel = new ModelRendererTurbo[7];
		rightArmModel = new ModelRendererTurbo[7];
		leftLegModel = new ModelRendererTurbo[13];
		rightLegModel = new ModelRendererTurbo[13];
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
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 48
		bodyModel[1] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 61
		bodyModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 42
		bodyModel[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 43
		bodyModel[4] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 45
		bodyModel[5] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 46
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 47
		bodyModel[7] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 48
		bodyModel[8] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 49
		bodyModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 50
		bodyModel[10] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 51
		bodyModel[11] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 52
		bodyModel[12] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 53
		bodyModel[13] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 54
		bodyModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 55
		bodyModel[15] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 56
		bodyModel[16] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 64
		bodyModel[17] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 66
		bodyModel[18] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 69
		bodyModel[20] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 70
		bodyModel[21] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 71
		bodyModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 84
		bodyModel[23] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 85
		bodyModel[24] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 86
		bodyModel[25] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 87
		bodyModel[26] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 88
		bodyModel[27] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 89
		bodyModel[28] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 90
		bodyModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 107
		bodyModel[30] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 108
		bodyModel[31] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 109
		bodyModel[32] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 110
		bodyModel[33] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 111
		bodyModel[34] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 112
		bodyModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 113
		bodyModel[36] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 114
		bodyModel[37] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 115
		bodyModel[38] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 116
		bodyModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 117

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

		bodyModel[11].addShapeBox(-1.5F, 0.2F, -3.5F, 3, 2, 1, 0F,0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.5F, -0.8F, -3.5F, 3, 3, 7, 0F,1F, -0.1F, -0.7F, -1.2F, 0.4F, -0.7F, -1.2F, 0.4F, -0.7F, 1F, -0.1F, -0.7F, -1F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 1.5F, 0F); // Box 53
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-5.5F, 5.8F, -3F, 1, 2, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 54
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-5.5F, 4.8F, -3F, 1, 1, 3, 0F,-0.6F, 0.3F, -0.2F, 0.5F, 0.5F, 0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-5.5F, 8F, -3F, 1, 1, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.3F, -0.2F, 0.5F, 0.5F, 0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 56
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.5F, 9.5F, 2.7F, 9, 2, 1, 0F,-1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F); // Box 64
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.5F, 7.5F, 2.9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-5.5F, 5F, -2F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F); // Box 68
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-5.5F, 8F, -2F, 1, 1, 4, 0F,0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 69
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1.5F, -0.8F, 2.5F, 3, 3, 1, 0F,1.2F, 0.4F, 1F, 1.2F, 0.4F, 1F, 1.2F, 0.4F, -0.7F, 1.2F, 0.4F, -0.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2.5F, -1.2F, -1.5F, 5, 1, 3, 0F,0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0.3F, -0.2F, 1.2F, 0.3F, -0.2F, 1.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 71
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4.5F, 8F, 2.7F, 9, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F); // Box 84
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4.5F, 6F, 2.7F, 9, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 85
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.5F, 4F, 2.7F, 9, 2, 1, 0F,-1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 86
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4.5F, 2.5F, 2.7F, 9, 2, 1, 0F,-3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.3F, 0F); // Box 87
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1.5F, 6.5F, 2.9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1.5F, 5.5F, 2.9F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1.5F, -0.8F, -3.5F, 3, 3, 7, 0F,-1.2F, 0.4F, -0.7F, 1F, -0.1F, -0.7F, 1F, -0.1F, -0.7F, -1.2F, 0.4F, -0.7F, 0.5F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0.5F, 0F, 0F); // Box 90
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(4.5F, 4.8F, -3F, 1, 1, 3, 0F,0.5F, 0.5F, 0.3F, -0.6F, 0.3F, -0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(4.5F, 5.8F, -3F, 1, 2, 3, 0F,-0.2F, 0F, 0.3F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 108
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(4.5F, 8F, -3F, 1, 1, 3, 0F,-0.2F, 0F, 0.3F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.3F, -0.6F, 0.3F, -0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(4.5F, 5F, -2F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 110
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(4.5F, 8F, -2F, 1, 1, 4, 0F,-0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 111
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-5.5F, 5.8F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, -0.2F); // Box 112
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-5.5F, 4.8F, 0F, 1, 1, 3, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.3F, -0.6F, 0.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.2F); // Box 113
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-5.5F, 8F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.3F, -0.6F, 0.3F, -0.2F); // Box 114
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(4.5F, 8F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0.3F, -0.2F, 0.5F, 0.5F, 0.3F); // Box 115
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(4.5F, 5.8F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.3F); // Box 116
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(4.5F, 4.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0.3F, -0.2F, 0.5F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F); // Box 117
		bodyModel[39].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 91
		leftArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 92
		leftArmModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 93
		leftArmModel[3] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 94
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 95
		leftArmModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 96
		leftArmModel[6] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 97

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 7, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 91
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 5F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 92
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 8F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 93
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 94
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(3F, 4F, -2F, 1, 5, 4, 0F,-0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 95
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(3F, 0.6F, -2F, 1, 3, 4, 0F,-1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 96
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(1F, -2F, -2F, 2, 2, 4, 0F,0F, 0.6F, 0.4F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0F, 0.6F, 0.4F, -0.7F, -0.9F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, -0.7F, -0.9F, 0.5F); // Box 97
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 56
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 61
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 62
		rightArmModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 63
		rightArmModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 64
		rightArmModel[5] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 72
		rightArmModel[6] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 79

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 7, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 56
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 61
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4F, 4F, -2F, 1, 5, 4, 0F,0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F); // Box 62
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-4F, 0.6F, -2F, 1, 3, 4, 0F,0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 63
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 8F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 64
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 72
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, -2F, -2F, 2, 2, 4, 0F,0.3F, 0.4F, 0.3F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0.3F, 0.4F, 0.3F, 0.8F, 0F, 0.5F, -0.7F, -0.9F, 0.5F, -0.7F, -0.9F, 0.5F, 0.8F, 0F, 0.5F); // Box 79
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 98
		leftLegModel[1] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 99
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 100
		leftLegModel[3] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 101
		leftLegModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 102
		leftLegModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 103
		leftLegModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 104
		leftLegModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 105
		leftLegModel[8] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 106
		leftLegModel[9] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 118
		leftLegModel[10] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 120
		leftLegModel[11] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 122
		leftLegModel[12] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 124

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 12, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 98
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F); // Box 99
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 1, 4, 0F,0.2F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F); // Box 100
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 4.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 101
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, 5F, -2.55F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 6F, -2.55F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.5F, 7F, -2.55F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 104
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(1.7F, 5.1F, -2F, 1, 3, 4, 0F,-1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 105
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(1.7F, 8.5F, -2F, 1, 3, 4, 0F,-0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 106
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2F, 3.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 118
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-2F, 2.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 120
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-2F, 1.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 122
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(-2F, 0.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 124
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 37
		rightLegModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 38
		rightLegModel[2] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 39
		rightLegModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 40
		rightLegModel[4] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 73
		rightLegModel[5] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 80
		rightLegModel[6] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 81
		rightLegModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 82
		rightLegModel[8] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 83
		rightLegModel[9] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 119
		rightLegModel[10] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 121
		rightLegModel[11] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 123
		rightLegModel[12] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 125

		rightLegModel[0].addShapeBox(-1.5F, 6F, -2.55F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-1.5F, 5F, -2.55F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-1.5F, 7F, -2.55F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 39
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F); // Box 40
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 0F, -2F, 4, 12, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 73
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 4.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 80
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.7F, 8.5F, -2F, 1, 3, 4, 0F,0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F); // Box 81
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.7F, 5.1F, -2F, 1, 3, 4, 0F,0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 82
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 10F, -2F, 4, 1, 4, 0F,0.5F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F); // Box 83
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, 3.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 119
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2F, 2.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 121
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2F, 1.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 123
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-2F, 0.5F, -2F, 4, 1, 3, 0F,0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.35F, -0.1F, 0.35F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 125
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44

		skirtFrontModel[0].addShapeBox(-4F, -1.5F, -2F, 8, 4, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 1.2F, 0F, 1F, 1.2F, 0F, 1F, 1.3F, 0.1F, 1F, 1.3F, 0.1F, 1F); // Box 44
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 45

		skirtRearModel[0].addShapeBox(-4F, -1.5F, 0F, 8, 4, 2, 0F,0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 1.2F, 0F, 1F, 1.2F, 0F, 1F, 1.2F, 0F, 1F, 1.2F, 0F, 0.8F); // Box 45
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}