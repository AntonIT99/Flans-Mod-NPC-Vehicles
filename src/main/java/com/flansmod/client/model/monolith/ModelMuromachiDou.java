//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MuromachiDou
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMuromachiDou extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMuromachiDou() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[51];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[6];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[6];
		skirtFrontModel = new ModelRendererTurbo[3];
		skirtRearModel = new ModelRendererTurbo[3];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 47
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 40
		bodyModel[3] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 42
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 43
		bodyModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 45
		bodyModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 46
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		bodyModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 51
		bodyModel[9] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 53
		bodyModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 54
		bodyModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 55
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 56
		bodyModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 61
		bodyModel[14] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 62
		bodyModel[15] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 64
		bodyModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 66
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 75
		bodyModel[18] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 86
		bodyModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 87
		bodyModel[20] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 54
		bodyModel[21] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 55
		bodyModel[22] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 72
		bodyModel[26] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 73
		bodyModel[27] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 74
		bodyModel[28] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 75
		bodyModel[29] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 76
		bodyModel[30] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 77
		bodyModel[31] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 91
		bodyModel[32] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 92
		bodyModel[33] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 93
		bodyModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 94
		bodyModel[35] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 95
		bodyModel[36] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 96
		bodyModel[37] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 97
		bodyModel[38] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 98
		bodyModel[39] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 103
		bodyModel[43] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 105
		bodyModel[44] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 106
		bodyModel[45] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 107
		bodyModel[46] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 108
		bodyModel[47] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 109
		bodyModel[48] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 110
		bodyModel[49] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 111
		bodyModel[50] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 112

		bodyModel[0].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F); // Box 44
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.5F, 0.5F, -2.5F, 2, 1, 5, 0F,0.8F, 0.2F, 0F, -2.2F, 0.2F, 0F, -2.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, -0.5F, 0.5F, 0.2F, -1F, 0.5F, 0.2F, -1F, 0.7F, 0.2F, -0.5F, 0.7F, 0.2F); // Box 47
		bodyModel[1].setRotationPoint(0F, -1F, 0F);

		bodyModel[2].addShapeBox(-4F, 2.5F, -2.8F, 8, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 40
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 2.5F, -3F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 42
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 3.75F, -2.8F, 8, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 43
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 5F, -3F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 45
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.5F, 5F, -2.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 46
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.5F, 6.25F, -2.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 49
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4.5F, 7.5F, -2.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 51
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.5F, 8.75F, -2.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 53
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 1.7F, -3.1F, 8, 1, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 54
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 1.4F, -3F, 8, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 55
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 0.4F, -3F, 2, 1, 1, 0F,-0.4F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 56
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(3.8F, 5F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 61
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3.8F, 6.25F, -3F, 1, 1, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 62
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(3.8F, 7.5F, -3F, 1, 1, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 64
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(3.8F, 8.75F, -3F, 1, 1, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 66
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-0.5F, 10F, -2.9F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.5F, 0.5F, -2.5F, 2, 1, 5, 0F,-2.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, -2.2F, 0.2F, 0F, -1F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.7F, 0.2F, -1F, 0.7F, 0.2F); // Box 86
		bodyModel[18].setRotationPoint(0F, -1F, 0F);

		bodyModel[19].addShapeBox(2F, 0.4F, -3F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4.8F, 5F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 54
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4.8F, 6.25F, -3F, 1, 1, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 55
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4.8F, 7.5F, -3F, 1, 1, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 56
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4.8F, 8.75F, -3F, 1, 1, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 57
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-5F, 5F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 58
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-5F, 6.25F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 72
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.5F, 6.25F, -3F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 73
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-5F, 7.5F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 74
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4.5F, 7.5F, -3F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 75
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-5F, 8.75F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 76
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4.5F, 8.75F, -3F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 77
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4F, 2.5F, 1.8F, 8, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 91
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4.5F, 8.75F, 1.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 92
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-4.5F, 7.5F, 1.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 93
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4.5F, 6.25F, 1.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 94
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.5F, 5F, 1.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 95
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4F, 3.75F, 1.8F, 8, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 96
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4.5F, 8.75F, 2F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 97
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4.5F, 7.5F, 2F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 98
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4.5F, 6.25F, 2F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 99
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.5F, 5F, 2F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 100
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4F, 3.75F, 2F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 101
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4F, 1.25F, 1.8F, 8, 1, 1, 0F,-0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 103
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4F, 2.5F, 2F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 105
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4F, 1.25F, 2F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 106
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4F, 3.75F, -3F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 107
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4F, 0.4F, 1.9F, 8, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 108
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(4F, 8.75F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 109
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(4F, 5F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 110
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(4F, 6.25F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 111
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(4F, 7.5F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 112
		bodyModel[50].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 88
		leftArmModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 89
		leftArmModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 90
		leftArmModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 91
		leftArmModel[4] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 92
		leftArmModel[5] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 93

		leftArmModel[0].addShapeBox(-1F, -3.5F, -2.5F, 1, 1, 5, 0F,-0.4F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F); // Box 88
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(0F, -3F, -2.5F, 1, 1, 5, 0F,0.25F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F); // Box 89
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(0F, -3.2F, -2.5F, 1, 1, 5, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 90
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(1.2F, -3.2F, -2.5F, 1, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 91
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1.5F, -3F, -2.5F, 1, 1, 5, 0F,0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F); // Box 92
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.5F, -3F, -2.5F, 1, 1, 5, 0F,0F, -0.1F, 0F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0.25F, 0.2F, 0.1F, 0.25F, 0.2F, 0.1F, 0F, -0.2F, 0F); // Box 93
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 68
		rightArmModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 69
		rightArmModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 70
		rightArmModel[3] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 71
		rightArmModel[4] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 73
		rightArmModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 74

		rightArmModel[0].addShapeBox(-1F, -3F, -2.5F, 1, 1, 5, 0F,0.25F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F); // Box 68
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1F, -3.2F, -2.5F, 1, 1, 5, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 69
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.25F, -3.2F, -2.5F, 1, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 70
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-2.25F, -3F, -2.5F, 1, 1, 5, 0F,0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F); // Box 71
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.5F, -3F, -2.5F, 1, 1, 5, 0F,0.25F, -0.5F, 0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.25F, -0.5F, 0.1F, 0.25F, 0.2F, 0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, 0.2F, 0.1F); // Box 73
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(0F, -3.5F, -2.5F, 1, 1, 5, 0F,0F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F); // Box 74
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 79
		leftLegModel[1] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 80
		leftLegModel[2] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 81
		leftLegModel[3] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 82
		leftLegModel[4] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 85
		leftLegModel[5] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 87

		leftLegModel[0].addShapeBox(-2.3F, 0.449999999999999F, -3.9F, 7, 1, 1, 0F,-1.8F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F); // Box 79
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2.3F, -0.800000000000001F, -3.3F, 7, 1, 1, 0F,-2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 80
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1F, -1.5F, -2.6F, 4, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, -0.2F, 1.2F, 0F, -0.4F, 1.2F, 0F, -0.4F, -1.1F, -0.2F, -0.2F, -1.1F); // Box 81
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1F, -1.5F, 1.6F, 4, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, -0.2F, -1.1F, 0F, -0.4F, -1.1F, 0F, -0.4F, 1.2F, -0.2F, -0.2F, 1.2F); // Box 82
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2.3F, 0.449999999999999F, 2.9F, 7, 1, 1, 0F,-1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F); // Box 85
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2.3F, -0.800000000000001F, 2.3F, 7, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F); // Box 87
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 78
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 79
		rightLegModel[2] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 80
		rightLegModel[3] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 83
		rightLegModel[4] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 84
		rightLegModel[5] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 86

		rightLegModel[0].addShapeBox(-3F, -1.5F, -2.6F, 4, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, -1.1F, 0F, -0.4F, -1.1F); // Box 78
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-4.7F, -0.800000000000001F, -3.3F, 7, 1, 1, 0F,-2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-4.7F, 0.449999999999999F, -3.9F, 7, 1, 1, 0F,-1.8F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F); // Box 80
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3F, -1.5F, 1.6F, 4, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, -1.1F, -0.2F, -0.2F, -1.1F, -0.2F, -0.2F, 1.2F, 0F, -0.4F, 1.2F); // Box 83
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-4.7F, 0.449999999999999F, 2.9F, 7, 1, 1, 0F,-1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F); // Box 84
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-4.7F, -0.800000000000001F, 2.3F, 7, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F); // Box 86
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 50
		skirtFrontModel[1] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 76
		skirtFrontModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 77

		skirtFrontModel[0].addShapeBox(-2F, -1.3F, -2.8F, 4, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 1.7F, -0.2F, 0F, 1.7F, -0.2F, 0F, -1.6F, -0.2F, 0F, -1.6F); // Box 50
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-3.5F, -0.6F, -3.7F, 7, 1, 1, 0F,-2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 76
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-3.5F, 0.65F, -4.3F, 7, 1, 1, 0F,-1.8F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F); // Box 77
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 88
		skirtRearModel[1] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 89
		skirtRearModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 90

		skirtRearModel[0].addShapeBox(-2F, -1.3F, 1.8F, 4, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, -1.6F, -0.2F, 0F, -1.6F, -0.2F, 0F, 1.7F, -0.2F, 0F, 1.7F); // Box 88
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-3.5F, -0.6F, 2.7F, 7, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F); // Box 89
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(-3.5F, 0.65F, 3.3F, 7, 1, 1, 0F,-1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F); // Box 90
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);
	}
}