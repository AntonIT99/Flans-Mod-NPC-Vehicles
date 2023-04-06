//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDerzki extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelDerzki() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[80];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 39
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 40
		bodyModel[13] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 41
		bodyModel[14] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 48
		bodyModel[15] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 49
		bodyModel[16] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 50
		bodyModel[17] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 51
		bodyModel[18] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 52
		bodyModel[19] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 55
		bodyModel[20] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 56
		bodyModel[21] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 57
		bodyModel[22] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 58
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 59
		bodyModel[24] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 64
		bodyModel[26] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 65
		bodyModel[27] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 66
		bodyModel[28] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 67
		bodyModel[29] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 71
		bodyModel[30] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 72
		bodyModel[31] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 73
		bodyModel[32] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 74
		bodyModel[33] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 75
		bodyModel[34] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 76
		bodyModel[35] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 77
		bodyModel[36] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 81
		bodyModel[37] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 82
		bodyModel[38] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 83
		bodyModel[39] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 84
		bodyModel[40] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 85
		bodyModel[41] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 89
		bodyModel[42] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 90
		bodyModel[43] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 91
		bodyModel[44] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 92
		bodyModel[45] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 93
		bodyModel[46] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 94
		bodyModel[47] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 95
		bodyModel[48] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 96
		bodyModel[49] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 1
		bodyModel[50] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 3
		bodyModel[52] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 4
		bodyModel[53] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 5
		bodyModel[54] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 6
		bodyModel[55] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 7
		bodyModel[56] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 8
		bodyModel[57] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 9
		bodyModel[58] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 10
		bodyModel[59] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 11
		bodyModel[60] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 12
		bodyModel[61] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		bodyModel[62] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 14
		bodyModel[63] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 15
		bodyModel[64] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 16
		bodyModel[65] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 17
		bodyModel[66] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 18
		bodyModel[67] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 19
		bodyModel[68] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 20
		bodyModel[69] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 21
		bodyModel[70] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 22
		bodyModel[71] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 23
		bodyModel[72] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 24
		bodyModel[73] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 25
		bodyModel[74] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 26
		bodyModel[75] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 27
		bodyModel[76] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 28
		bodyModel[77] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 29
		bodyModel[78] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 30
		bodyModel[79] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 31

		bodyModel[0].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F,35F, 0.2F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0.2F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-12F, -1F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 57, 5, 14, 0F,-0.5F, -1F, 0F, 0F, 0.5F, -5.5F, 0F, 0.5F, -5.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -5.5F, 0F, -1F, -5.5F, 0F, 0F, 0F); // Box 4
		bodyModel[1].setRotationPoint(36F, -6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 47, 4, 14, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(36F, -1F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 56, 1, 14, 0F,-0.5F, 0F, -0.5F, -22F, 0.5F, -1.5F, -22F, 0.5F, -1.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -1.5F, -5.5F, 0F, -1.5F, -5.5F, 0.5F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(37F, -6F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 8
		bodyModel[4].setRotationPoint(16F, -11.5F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 21, 4, 12, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F); // Box 10
		bodyModel[5].setRotationPoint(-94F, 0F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 20, 1, 12, 0F,0.5F, 0.5F, -4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 11
		bodyModel[6].setRotationPoint(-93F, -1F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 43, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		bodyModel[7].setRotationPoint(34F, -45F, -0.5F);
		bodyModel[7].rotateAngleZ = 0.08726646F;

		bodyModel[8].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 22
		bodyModel[8].setRotationPoint(27F, -4F, 0F);

		bodyModel[9].addShapeBox(-5.5F, -0.7F, -1.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[9].setRotationPoint(29F, -4F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[10].setRotationPoint(25.5F, -2.5F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[11].setRotationPoint(-75.5F, -4F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 40
		bodyModel[12].setRotationPoint(-76.5F, -4F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 41
		bodyModel[13].setRotationPoint(-82F, -4F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 17, 5, 14, 0F,4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, -1.5F, -3F, -0.5F, 0.5F, -2F, -0.5F, 0.5F, -2F, 4.5F, -1.5F, -3F); // Box 48
		bodyModel[14].setRotationPoint(-68.5F, 3F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 5, 12, 0F,2F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, -5F, -4F, -2.8F, -4F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -4F, -2.8F, -4F); // Box 49
		bodyModel[15].setRotationPoint(-91F, 3F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 47, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -2F); // Box 50
		bodyModel[16].setRotationPoint(36F, 3F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 5, 14, 0F,35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 40F, 0.5F, -2F, 35F, 0F, -2F, 35F, 0F, -2F, 40F, 0.5F, -2F); // Box 51
		bodyModel[17].setRotationPoint(-12F, 3F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 6, 12, 0F,0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, -1F, -3.5F, -2F, -2.5F, -5.5F, -2F, -2.5F, -5.5F, 0F, -1F, -3.5F); // Box 52
		bodyModel[18].setRotationPoint(83F, 3F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 4, 14, 0F,8F, 0.4F, -1F, 8F, 0.2F, 0F, 8F, 0.2F, 0F, 8F, 0.4F, -1F, 8F, 0F, -1F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -1F); // Box 55
		bodyModel[19].setRotationPoint(-65F, -1F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, 0F, -3F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 56
		bodyModel[20].setRotationPoint(83F, -2F, -6F);

		bodyModel[21].addShapeBox(-5.5F, -0.7F, 0.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 57
		bodyModel[21].setRotationPoint(29F, -4F, 0F);

		bodyModel[22].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 58
		bodyModel[22].setRotationPoint(27F, -4F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[23].setRotationPoint(26.5F, -3.5F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 63
		bodyModel[24].setRotationPoint(50.5F, -8.5F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[25].setRotationPoint(51.5F, -8.5F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 65
		bodyModel[26].setRotationPoint(53F, -8.5F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 66
		bodyModel[27].setRotationPoint(-3F, -11.5F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 67
		bodyModel[28].setRotationPoint(-17F, -11.5F, -1.5F);

		bodyModel[29].addShapeBox(-5.5F, -0.7F, -1.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 71
		bodyModel[29].setRotationPoint(10F, -4F, 0F);

		bodyModel[30].addShapeBox(-5.5F, -0.7F, 0.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 72
		bodyModel[30].setRotationPoint(10F, -4F, 0F);

		bodyModel[31].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 73
		bodyModel[31].setRotationPoint(8F, -4F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[32].setRotationPoint(7.5F, -3.5F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[33].setRotationPoint(6.5F, -2.5F, -1.5F);

		bodyModel[34].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 76
		bodyModel[34].setRotationPoint(8F, -4F, 0F);

		bodyModel[35].addShapeBox(-0.5F, -3.5F, 0F, 1, 17, 1, 0F,-0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F); // Box 77
		bodyModel[35].setRotationPoint(-94F, -10F, -0.5F);
		bodyModel[35].rotateAngleZ = 0.13962634F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[36].setRotationPoint(37.5F, -12F, -1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[37].setRotationPoint(37F, -13F, -2.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 83
		bodyModel[38].setRotationPoint(42F, -15F, -2.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F); // Box 84
		bodyModel[39].setRotationPoint(42F, -16F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[40].setRotationPoint(41F, -14F, -2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 89
		bodyModel[41].setRotationPoint(41.75F, -15.5F, -2.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 90
		bodyModel[42].setRotationPoint(41.75F, -15.5F, 1.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 91
		bodyModel[43].setRotationPoint(45.25F, -15.5F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 92
		bodyModel[44].setRotationPoint(45.25F, -15.5F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 93
		bodyModel[45].setRotationPoint(43.5F, -15.5F, -1.8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 94
		bodyModel[46].setRotationPoint(43.5F, -15.5F, 0.8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 95
		bodyModel[47].setRotationPoint(43.5F, -12F, -1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0.5F, 0F); // Box 96
		bodyModel[48].setRotationPoint(-78F, 5F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[49].setRotationPoint(-12F, -4.5F, -3.5F);

		bodyModel[50].addShapeBox(-5.5F, -0.7F, -1.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 2
		bodyModel[50].setRotationPoint(-24F, -4F, 0F);

		bodyModel[51].addShapeBox(-5.5F, -0.7F, 0.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 3
		bodyModel[51].setRotationPoint(-24F, -4F, 0F);

		bodyModel[52].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 4
		bodyModel[52].setRotationPoint(-26F, -4F, 0F);

		bodyModel[53].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 5
		bodyModel[53].setRotationPoint(-26F, -4F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[54].setRotationPoint(-27.5F, -2.5F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[55].setRotationPoint(-26.5F, -3.5F, -0.5F);

		bodyModel[56].addShapeBox(-5.5F, -0.7F, -1.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 8
		bodyModel[56].setRotationPoint(-38F, -4F, 0F);

		bodyModel[57].addShapeBox(-5.5F, -0.7F, 0.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 9
		bodyModel[57].setRotationPoint(-38F, -4F, 0F);

		bodyModel[58].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 10
		bodyModel[58].setRotationPoint(-40F, -4F, 0F);

		bodyModel[59].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 11
		bodyModel[59].setRotationPoint(-40F, -4F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[60].setRotationPoint(-41.5F, -2.5F, -1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[61].setRotationPoint(-40.5F, -3.5F, -0.5F);

		bodyModel[62].addShapeBox(-5.5F, -0.7F, -1.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 14
		bodyModel[62].setRotationPoint(-65F, -4F, 0F);

		bodyModel[63].addShapeBox(-5.5F, -0.7F, 0.5F, 8, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 15
		bodyModel[63].setRotationPoint(-65F, -4F, 0F);

		bodyModel[64].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 16
		bodyModel[64].setRotationPoint(-67F, -4F, 0F);

		bodyModel[65].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 17
		bodyModel[65].setRotationPoint(-67F, -4F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[66].setRotationPoint(-68.5F, -2.5F, -1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[67].setRotationPoint(-67.5F, -3.5F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 45, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 20
		bodyModel[68].setRotationPoint(-49F, -45F, -0.5F);
		bodyModel[68].rotateAngleZ = 0.08726646F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[69].setRotationPoint(-58F, -5.5F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 15, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[70].setRotationPoint(-59F, -7.5F, -3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[71].setRotationPoint(-53.5F, -10F, -0.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 24
		bodyModel[72].setRotationPoint(-54.5F, -10F, -0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 25
		bodyModel[73].setRotationPoint(-60F, -10F, -0.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 26
		bodyModel[74].setRotationPoint(-65F, -32F, -0.5F);
		bodyModel[74].rotateAngleZ = 1.30899694F;

		bodyModel[75].addShapeBox(-7.5F, 0F, 0F, 9, 5, 1, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 27
		bodyModel[75].setRotationPoint(-65F, -32F, -0.5F);
		bodyModel[75].rotateAngleZ = 0.36651914F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,40F, -0.35F, -0.35F, 40F, -0.35F, -0.35F, 40F, -0.35F, -0.35F, 40F, -0.35F, -0.35F, 40F, -0.35F, -0.35F, 40F, -0.35F, -0.35F, 40F, -0.35F, -0.35F, 40F, -0.35F, -0.35F); // Box 28
		bodyModel[76].setRotationPoint(-8.5F, -44F, -0.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,8F, -0.35F, -0.35F, 8F, -0.35F, -0.35F, 8F, -0.35F, -0.35F, 8F, -0.35F, -0.35F, 8F, -0.35F, -0.35F, 8F, -0.35F, -0.35F, 8F, -0.35F, -0.35F, 8F, -0.35F, -0.35F); // Box 29
		bodyModel[77].setRotationPoint(-57.5F, -37F, -0.5F);
		bodyModel[77].rotateAngleZ = 0.59341195F;

		bodyModel[78].addShapeBox(-0.5F, -3.5F, 0F, 1, 17, 1, 0F,-0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F); // Box 30
		bodyModel[78].setRotationPoint(92.5F, -12F, -0.5F);

		bodyModel[79].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F); // Box 31
		bodyModel[79].setRotationPoint(92.5F, -9F, -0.5F);
		bodyModel[79].rotateAngleZ = -0.52359878F;
	}
}