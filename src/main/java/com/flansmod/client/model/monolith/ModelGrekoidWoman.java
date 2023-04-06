//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGrekoidWoman extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelGrekoidWoman() //Same as Filename
	{
		headModel = new ModelRendererTurbo[27];
		bodyModel = new ModelRendererTurbo[51];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 6
		headModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 57
		headModel[2] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 59
		headModel[3] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 61
		headModel[4] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 63
		headModel[5] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 65
		headModel[6] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 66
		headModel[7] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 67
		headModel[8] = new ModelRendererTurbo(this, 41, 95, textureX, textureY); // Box 68
		headModel[9] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 72
		headModel[10] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 75
		headModel[11] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 76
		headModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 77
		headModel[13] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 78
		headModel[14] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 79
		headModel[15] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 85
		headModel[16] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 86
		headModel[17] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 87
		headModel[18] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 88
		headModel[19] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 91
		headModel[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 92
		headModel[21] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 93
		headModel[22] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 94
		headModel[23] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 95
		headModel[24] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 96
		headModel[25] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 97
		headModel[26] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 102

		headModel[0].addShapeBox(-4F, -8.1F, -4F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2.5F, -8.5F, -4.5F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -3.5F, 3.5F, 8, 2, 1, 0F,0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 59
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3.5F, -8.5F, -4.5F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 61
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -7.7F, -5F, 10, 2, 9, 0F,-0.3F, -0.9F, -0.4F, -0.3F, -0.9F, -0.4F, -0.3F, -3.4F, -0.4F, -0.3F, -3.4F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 2.8F, -0.4F, -0.3F, 2.8F, -0.4F); // Box 63
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.5F, -5F, 3.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-3.5F, -8F, 3.5F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3.5F, -9F, 3.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 67
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3.5F, -9F, -0.5F, 7, 1, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -4.7F, 4F, 10, 2, 1, 0F,-0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -1F, -0.6F, -0.4F, -1F, -0.6F, -0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 72
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.5F, -9F, 1.5F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -9F, 2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.5F, -9F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 77
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.5F, -8F, 3.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 78
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4.5F, -5F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Box 79
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.5F, -5.5F, -4.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.5F, -8.5F, -4.5F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.5F, -8.5F, -1.5F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(3.5F, -8.5F, -1.5F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(3.5F, -5.5F, -4.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 91
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3.5F, -8.5F, -4.5F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(3.5F, -8F, 3.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 93
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(3.5F, -9F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 94
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(3.5F, -9F, 2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(3.5F, -9F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(2.5F, -8.5F, -4.5F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 97
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(3.5F, -5F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F); // Box 102
		headModel[26].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 90
		bodyModel[20] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 91
		bodyModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 92
		bodyModel[22] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 93
		bodyModel[23] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 94
		bodyModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 95
		bodyModel[25] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 96
		bodyModel[26] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 97
		bodyModel[27] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 96
		bodyModel[29] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 97
		bodyModel[30] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 99
		bodyModel[31] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 101
		bodyModel[32] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 102
		bodyModel[33] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 79
		bodyModel[34] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 81
		bodyModel[35] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 89
		bodyModel[36] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 90
		bodyModel[37] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 91
		bodyModel[38] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 93
		bodyModel[39] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 94
		bodyModel[40] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 97
		bodyModel[41] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 123
		bodyModel[42] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 125
		bodyModel[43] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 55

		bodyModel[0].addShapeBox(-4F, 2F, -2F, 8, 3, 4, 0F,-0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0.5F, -1.5F, -1F, 0.5F, -1.5F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2F, 8, 2, 4, 0F,-1.2F, 0F, 0.7F, -1.2F, 0F, 0.7F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 5F, -3F, 7, 4, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 11F, -2F, 6, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -2.5F, -0.5F, -1F, -2.5F, -0.5F, -1F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2F, 8, 3, 4, 0F,-1F, 0F, -1.5F, -1F, 0F, -1.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.5F, -0.8F, 0.2F, -0.5F, -0.8F, 0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 10.8F, -2F, 4, 3, 4, 0F,0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, 0F, 0F, 1F, 0.5F, 0.3F, 1F, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 8.8F, -2F, 4, 2, 4, 0F,-1F, 2F, -1F, -1F, 0F, 0F, -0.3F, 0F, -0.5F, -0.8F, 1F, -0.8F, 0.5F, 0.3F, 0.4F, -0.5F, 0.3F, 0F, 0F, 0F, 1F, 0.5F, -0.3F, 1F); // Box 7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 8.8F, -2F, 4, 2, 4, 0F,-1F, 0F, 0F, -1F, 2F, -1F, -0.8F, 1F, -0.8F, -0.3F, 0F, -0.5F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0.4F, 0.5F, -0.3F, 1F, 0F, 0F, 1F); // Box 12
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 10.8F, -2F, 4, 3, 4, 0F,-0.5F, -0.3F, 0F, 0.5F, -0.3F, 0.4F, 0.5F, 0.3F, 1F, 0F, 0F, 1F, -0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 2.2F, -2.21F, 4, 2, 2, 0F,-0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, -2F, 0.2F, 0F, -1.9F, 0.2F, -0.5F, -1.2F, -2F, -0.7F, -1.2F, -2F); // Box 18
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 0.2F, -2.19F, 4, 2, 2, 0F,-0.2F, -0.7F, -0.9F, -0.3F, -1.5F, -0.3F, -1.5F, -0.5F, -0.8F, 0.5F, 0F, -0.5F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 19
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, 2.5F, -3.4F, 3, 1, 1, 0F,-0.3F, 0.2F, -0.5F, 0.45F, 0F, -0.5F, 0.5F, 0.2F, 0F, -0.2F, 0.3F, 0F, -0.1F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F); // Box 20
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.3F, 2.4F, -3.89F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.5F, 0F, -0.3F, -0.5F, 0.25F, -0.1F, 0F, -0.1F, 0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0.3F, -0.3F, 0F, 0.1F, -0.3F, 0F); // Box 21
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.3F, 4.09F, -3.9F, 3, 1, 1, 0F,0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0.3F, 1F, 0F, 0.1F, 1F, 0F, -0.2F, -0.2F, -0.2F, -0.1F, -0.3F, -0.2F, 0.2F, -0.3F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 3.29F, -3.4F, 3, 2, 1, 0F,-0.1F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.5F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, -0.2F, -0.5F, 0.4F, -0.5F, -0.5F, 0.5F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F); // Box 23
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.3F, 1.7F, -4.4F, 3, 1, 1, 0F,-1.3F, -1.6F, 0F, -1.4F, -1.6F, 0F, 0F, -1F, 0F, -0.2F, -0.8F, 0F, -1.2F, 0.9F, 0F, -1.3F, 0.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 24
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.3F, 5.09F, -4.4F, 3, 1, 1, 0F,-1.2F, 1.5F, 0F, -1.3F, 1.5F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, -1.3F, -2.2F, 0F, -1.5F, -2.2F, 0F, -0.1F, -1.3F, -0.3F, -0.2F, -1.2F, -0.3F); // Box 25
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 3.29F, -2F, 3, 2, 1, 0F,-0.2F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.3F, 1F, 0.5F, 0F, 1F, 0.5F, -0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, -0.1F, -1.6F, 0F, -0.2F, -1.6F, 0F); // Box 26
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.01F, 0.21F, -2.21F, 4, 2, 2, 0F,-0.3F, -1.5F, -0.3F, -0.2F, -0.7F, -0.9F, 0.5F, 0F, -0.5F, -1.5F, -0.5F, -0.8F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 2.2F, -2.21F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0.2F, -0.7F, -2F, 0.2F, -0.7F, -1.2F, -2F, -0.5F, -1.2F, -2F); // Box 90
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 2.5F, -3.4F, 3, 1, 1, 0F,0.45F, 0F, -0.5F, -0.3F, 0.2F, -0.5F, -0.2F, 0.3F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.2F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F); // Box 91
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.3F, 2.4F, -3.89F, 3, 1, 1, 0F,0F, -0.3F, -0.5F, -0.2F, -0.1F, -0.5F, -0.1F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0.1F, -0.3F, 0F, 0.3F, -0.3F, 0F); // Box 92
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.3F, 1.7F, -4.4F, 3, 1, 1, 0F,-1.4F, -1.6F, 0F, -1.3F, -1.6F, 0F, -0.2F, -0.8F, 0F, 0F, -1F, 0F, -1.3F, 0.9F, 0F, -1.2F, 0.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 93
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.5F, 3.29F, -2F, 3, 2, 1, 0F,0.5F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, 0F, 1F, 0.5F, 0.3F, 1F, 0.5F, 0.5F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -1.6F, 0F, -0.1F, -1.6F, 0F); // Box 94
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.5F, 3.29F, -3.4F, 3, 2, 1, 0F,0.4F, 0.2F, -0.5F, -0.1F, 0.2F, -0.5F, -0.2F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.4F, -0.5F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F); // Box 95
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.3F, 4.09F, -3.9F, 3, 1, 1, 0F,0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0.1F, 1F, 0F, 0.3F, 1F, 0F, -0.1F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 0.2F, -0.3F, 0F); // Box 96
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.3F, 5.09F, -4.4F, 3, 1, 1, 0F,-1.3F, 1.5F, 0F, -1.2F, 1.5F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, -1.5F, -2.2F, 0F, -1.3F, -2.2F, 0F, -0.2F, -1.2F, -0.3F, -0.1F, -1.3F, -0.3F); // Box 97
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-3F, 8F, -3F, 3, 3, 5, 0F,0.8F, -1F, -0.5F, -2.6F, -1F, 0F, 0.05F, 0F, -0.5F, 0.4F, 0F, 0F, 1.8F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 1.3F, 1.9F, 0F, 1.4F); // Box 1
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 7.99F, -2.9F, 3, 3, 5, 0F,-2.6F, -1F, 0F, 0.8F, -1F, -0.5F, 0.4F, 0F, 0F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 1.8F, 0F, -0.5F, 1.9F, 0F, 1.4F, 0.05F, 0F, 1.3F); // Box 96
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.5F, 9F, -3.5F, 5, 2, 1, 0F,0.11F, 0F, -0.5F, 0.11F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.49F, 0F, -1F, -2.49F, 0F, -1F, -2.49F, 0.1F, 1F, -2.49F, 0.1F, 1F); // Box 97
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-2.5F, 6F, -3.5F, 5, 3, 5, 0F,0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0.1F, -0.5F, 0.6F, 0.1F, -0.5F, 0.11F, 0F, -0.5F, 0.11F, 0F, -0.5F, 1F, -0.7F, 0.5F, 1F, -0.7F, 0.5F); // Box 99
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3.8F, 6F, -3F, 1, 3, 5, 0F,-0.7F, 0F, 0F, -0.29F, 0F, 0F, -0.3F, 0.1F, -1F, -0.69F, 0.1F, -1F, 0F, 0F, -0.5F, 0.21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(2.8F, 6F, -3F, 1, 3, 5, 0F,-0.29F, 0F, 0F, -0.7F, 0F, 0F, -0.69F, 0.1F, -1F, -0.3F, 0.1F, -1F, 0.21F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2F, 3F, -4F, 4, 5, 1, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1F, 0.5F, -0.1F, -1F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 79
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3F, 3F, -4F, 1, 6, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0.5F, -0.2F, 0F, -0.2F, 0F, -0.1F, 1F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0.8F, 0F, 0F); // Box 81
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3F, 3F, -3F, 1, 6, 4, 0F,0.5F, -0.2F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 1.3F, 0.7F, 0.5F, 1.3F, 0.8F, 0F, 0F, 0F, -1F, 0F, 0F, 0.9F, 2.5F, 1.4F, 0.9F, 2F); // Box 89
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2F, 3F, 0F, 4, 6, 1, 0F,0F, 0.15F, 0F, 0F, 0.15F, -1F, 0F, 0.5F, 1.3F, 0F, 0.5F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 2.5F, 0F, 0.9F, 2.5F); // Box 90
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2F, 2F, -4F, 4, 2, 1, 0F,-1F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1F, -0.3F, -0.5F, -1F, -0.3F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 91
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3F, 2F, -4F, 1, 2, 1, 0F,0.1F, -0.6F, -0.4F, 1F, -0.5F, -0.1F, 1F, -0.3F, -0.5F, 0.3F, 0F, -0.1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0.5F, -0.8F, 0F); // Box 93
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-3F, 2F, -3F, 2, 2, 2, 0F,0.3F, -0.1F, 0.1F, 2F, -0.5F, 0.8F, -1F, 2.4F, 0.5F, 1.3F, 2.2F, 0.5F, 0.5F, -0.8F, 0F, 1F, -0.5F, 1F, 0F, -0.5F, 1F, 0.55F, -1.1F, 0.5F); // Box 94
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3.5F, 0F, 0F, 7, 2, 1, 0F,0.8F, 0.2F, 0.5F, 0.8F, 0.2F, 0.5F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0.2F, 0.85F, 0.5F, 0.2F, 0.85F, 0.5F, 0.2F, 0.5F, 1.3F, 0.2F, 0.5F, 1.3F); // Box 97
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(1.3F, 3.1F, -5.25F, 1, 1, 1, 0F,-0.25F, -0.15F, -0.65F, -0.25F, -0.15F, -0.7F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.4F, -0.25F, -0.7F, -0.4F); // Box 123
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(1.3F, 3.1F, -5.25F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 125
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(1.3F, 3.1F, -5.25F, 1, 1, 1, 0F,-0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F); // Box 48
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(1F, 2F, -3F, 2, 2, 2, 0F,2F, -0.5F, 0.8F, 0.3F, -0.1F, 0.1F, 1.3F, 2.2F, 0.5F, -1F, 2.4F, 0.5F, 1F, -0.5F, 1F, 0.5F, -0.8F, 0F, 0.55F, -1.1F, 0.5F, 0F, -0.5F, 1F); // Box 49
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(2F, 2F, -4F, 1, 2, 1, 0F,1F, -0.5F, -0.1F, 0.1F, -0.6F, -0.4F, 0.3F, 0F, -0.1F, 1F, -0.3F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0.5F, -0.8F, 0F, 0F, -0.5F, -1F); // Box 50
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(2F, 3F, -4F, 1, 6, 1, 0F,0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0.5F, -0.2F, 0F, 0F, -0.5F, -1F, 1F, -0.5F, -0.1F, -0.2F, 0F, -0.1F, 0.8F, 0F, 0F, 0F, -0.5F, 0F); // Box 51
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2F, 3F, -3F, 1, 6, 4, 0F,0F, -0.5F, -1F, 0.5F, -0.2F, 0F, 0.7F, 0.5F, 1.3F, 0F, 0.5F, 1.3F, 0F, -1F, 0F, 0.8F, 0F, 0F, 1.4F, 0.9F, 2F, 0F, 0.9F, 2.5F); // Box 52
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2.3F, 3.1F, -5.25F, 1, 1, 1, 0F,-0.25F, -0.15F, -0.65F, -0.25F, -0.15F, -0.7F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.4F, -0.25F, -0.7F, -0.4F); // Box 53
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2.3F, 3.1F, -5.25F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 54
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2.3F, 3.1F, -5.25F, 1, 1, 1, 0F,-0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F); // Box 55
		bodyModel[50].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 100
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 101

		leftArmModel[0].addShapeBox(-1F, -1.9F, -1F, 3, 7, 3, 0F,0.8F, 0F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 100
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 4.8F, -0.7F, 3, 6, 3, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, 0F, -1.8F, -0.6F, 0F, -1.8F); // Box 101
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11

		rightArmModel[0].addShapeBox(-2F, -1.9F, -1F, 3, 7, 3, 0F,-1F, -0.2F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1F, -0.2F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 10
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2F, 4.8F, -0.7F, 3, 6, 3, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.5F, 0.8F, -0.6F, -0.5F, 0.8F, -0.6F, 0F, -1.8F, 0F, 0F, -1.8F); // Box 11
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 14
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 15
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 2
		leftLegModel[3] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 100

		leftLegModel[0].addShapeBox(-2F, 1.8F, -2F, 4, 3, 4, 0F,-0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4.8F, -2F, 4, 7, 4, 0F,-0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-3F, -1F, -2F, 6, 8, 4, 0F,-0.4F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.2F, 0F, 1.5F, 0F, 0F, 1.5F, -0.4F, -0.5F, 0.2F, -0.6F, -0.5F, 0.2F, -0.6F, -0.5F, 1F, -0.4F, -0.5F, 1F); // Box 2
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-3F, 6.5F, -2F, 6, 5, 4, 0F,-0.4F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 1F, -0.4F, 0F, 1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F); // Box 100
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 8
		rightLegModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 9
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 80
		rightLegModel[3] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 81

		rightLegModel[0].addShapeBox(-2F, 1.8F, -2F, 4, 3, 4, 0F,0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 8
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 4.8F, -2F, 4, 7, 4, 0F,-0.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 9
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3F, -1F, -2F, 6, 8, 4, 0F,-0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.6F, -0.5F, 0.2F, -0.4F, -0.5F, 0.2F, -0.4F, -0.5F, 1F, -0.6F, -0.5F, 1F); // Box 80
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3F, 6.5F, -2F, 6, 5, 4, 0F,-0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.4F, 0F, 1F, -0.6F, 0F, 1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F); // Box 81
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}