//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ArabNasal
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArabNasal extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelArabNasal() //Same as Filename
	{
		headModel = new ModelRendererTurbo[46];
		bodyModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		headModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 12
		headModel[2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 7
		headModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box18
		headModel[4] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import Box22
		headModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box19
		headModel[6] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import Box20
		headModel[7] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box21
		headModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		headModel[9] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 1
		headModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 2
		headModel[11] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 3
		headModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		headModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		headModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		headModel[15] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		headModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		headModel[17] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		headModel[18] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 9
		headModel[19] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 10
		headModel[20] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 11
		headModel[21] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 12
		headModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 13
		headModel[23] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 14
		headModel[24] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 15
		headModel[25] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 16
		headModel[26] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 17
		headModel[27] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 18
		headModel[28] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 19
		headModel[29] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 20
		headModel[30] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 21
		headModel[31] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 22
		headModel[32] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 23
		headModel[33] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 24
		headModel[34] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 25
		headModel[35] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 26
		headModel[36] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 27
		headModel[37] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 28
		headModel[38] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 23
		headModel[39] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 86
		headModel[40] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 87
		headModel[41] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 88
		headModel[42] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 0
		headModel[43] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 1
		headModel[44] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 2
		headModel[45] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 3

		headModel[0].addShapeBox(-4F, -1F, -4F, 16, 5, 4, 0F,0.1F, -0.2F, 0.1F, -7.9F, -0.2F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -3.9F, 0.1F, -7.9F, -3.9F, 0.1F, -7.9F, -1.9F, 0.1F, 0.1F, -1.9F, 0.1F); // Box 11
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5F, -3F, 16, 10, 7, 0F,0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -5.7F, 1.1F, -7.9F, -5.7F, 1.1F, -7.9F, -5.9F, 0.1F, 0.1F, -5.9F, 0.1F); // Box 12
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -1F, 0F, 16, 5, 4, 0F,0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -1.9F, 0.1F, -7.9F, -1.9F, 0.1F, -7.9F, -3.9F, 0.1F, 0.1F, -3.9F, 0.1F); // Box 7
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0F, 1.3F, -0.2F, 0F, 1.3F, -0.2F, 0F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0.8F, -0.5F, 0.7F, 0.8F, -0.5F, 0.7F, 0.8F, -0.5F, 1.2F, 0.8F, -0.5F, 1.2F); // Import Box18
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -10.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, -0.3F, -0.8F, -2F, -0.3F, -0.8F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1F, 0.7F, 0F, 1F, 0.7F); // Import Box22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -6F, -4F, 1, 2, 8, 0F,1F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, -0.3F, 1.4F, 1F, -0.3F, 1.4F, 1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1.2F, 1F, 0F, 1.2F); // Import Box19
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(3F, -6F, -4F, 1, 2, 8, 0F,0F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, 1F, -0.3F, 1.4F, 0F, -0.3F, 1.4F, 0F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, 0F, 1.2F, 0F, 0F, 1.2F); // Import Box20
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3F, -6F, -4F, 6, 2, 8, 0F,1F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, 1F, -0.3F, 1.4F, 1F, -0.3F, 1.4F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, 0F, 1.2F, 1F, 0F, 1.2F); // Import Box21
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1.5F, -10.8F, -4F, 3, 1, 8, 0F,-0.3F, 0.3F, -2.4F, -0.3F, 0.3F, -2.4F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 1F, 1F, -0.3F, 1F, 1F); // Box 0
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.5F, -8F, -4F, 3, 3, 8, 0F,-0.3F, 1.3F, 0.1F, -0.3F, 1.3F, 0.1F, -0.3F, 0.8F, 1F, -0.3F, 0.8F, 1F, -0.3F, -1F, 0.8F, -0.3F, -1F, 0.8F, -0.3F, -0.5F, 1.5F, -0.3F, -0.5F, 1.5F); // Box 1
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -10.8F, -0.6F, 8, 1, 3, 0F,-1.8F, 0.15F, 0F, -1.8F, 0.15F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, 0.2F, 0.7F, 0.4F, 0.2F, 0.7F, 0.1F, 0.2F, 0.9F, -0.5F, 0.2F, 0.9F, -0.3F); // Box 2
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -8.2F, -0.9F, 8, 1, 3, 0F,0.2F, 0.9F, 0.1F, 0.2F, 0.9F, -0.1F, 0.2F, 0.7F, -0.2F, 0.2F, 0.7F, 0F, 0.9F, 1.4F, 0.2F, 0.9F, 1.4F, 0.2F, 0.9F, 1.6F, -0.1F, 0.9F, 1.6F, -0.1F); // Box 3
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -6F, -4.5F, 1, 4, 1, 0F,0.4F, 0F, 0.4F, -0.5F, 0F, 0.6F, -0.5F, 0F, -0.7F, 0.4F, 0F, -0.7F, 0.7F, 0.5F, 0.2F, -0.5F, 0.7F, 1F, -0.5F, 0.7F, -1.1F, 0.7F, 0.5F, -1.1F); // Box 14
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(0.3F, -7.5F, -4.7F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 0
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1.3F, -7.5F, -4.7F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(0.3F, -9.5F, -4.4F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 4
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1.3F, -9.5F, -4.4F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 5
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(0.3F, -11.2F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 8
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1.3F, -11.2F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 9
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-1.3F, -9F, 4.3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 10
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(0.3F, -9F, 4.3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 11
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-1.3F, -7F, 4.55F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 12
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(0.3F, -7F, 4.55F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 13
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-1.3F, -10.7F, 3.3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 14
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(0.3F, -10.7F, 3.3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 15
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-1F, -6F, -4.5F, 2, 1, 1, 0F,0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0.4F, 0.6F, 0.3F, 0.4F, 0.6F, 0.3F, 0.4F, -0.9F, 0.3F, 0.4F, -0.9F); // Box 16
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(3.9F, -7.1F, -1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 17
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(3.9F, -6.9F, 1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 18
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(3.4F, -9.1F, -1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 19
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(3.4F, -8.9F, 1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 20
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(2F, -11F, -0.6F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 21
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(2F, -10.9F, 1.2F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 22
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-3F, -11F, -0.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 23
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-3F, -10.9F, 1.2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 24
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-4.4F, -9.1F, -1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 25
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-4.4F, -8.9F, 1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 26
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-4.9F, -7.1F, -1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 27
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-4.9F, -6.9F, 1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 28
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-5F, -5F, -1F, 10, 5, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.7F, 0.4F, 2.7F, -0.7F, 0.4F, 2.7F, -0.7F, 0.8F, -3F, -0.7F, 0.8F, -3F); // Box 23
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-0.5F, -6F, -4.5F, 1, 4, 1, 0F,-0.5F, 0F, 0.6F, 0.4F, 0F, 0.4F, 0.4F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0.7F, 1F, 0.7F, 0.5F, 0.2F, 0.7F, 0.5F, -1.1F, -0.5F, 0.7F, -1.1F); // Box 86
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-1.5F, -11.2F, -0.65F, 3, 1, 3, 0F,-0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 87
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-0.5F, -11.6F, 0.35F, 1, 1, 1, 0F,-0.1F, 0.05F, -0.1F, -0.1F, 0.05F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 88
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-5F, -5F, -4.5F, 4, 1, 9, 0F,0.95F, 0.5F, 1F, 0.95F, 0.5F, 1F, 0.95F, -0.3F, 1.5F, 0.95F, -0.3F, 1.5F, 0.4F, -0.3F, 0.6F, 0.95F, -0.7F, 0.8F, 0.95F, 0F, 0.8F, -0.05F, 1F, 0.3F); // Box 0
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(0.8F, -5F, -4.5F, 4, 1, 9, 0F,0.95F, 0.5F, 1F, 0.95F, 0.5F, 1F, 0.95F, -0.3F, 1.4F, 0.95F, -0.3F, 1.4F, 0.95F, -0.7F, 0.8F, 0.4F, -0.3F, 0.6F, -0.05F, 1F, 0.3F, 0.95F, 0F, 0.8F); // Box 1
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-5F, -6F, -4.5F, 4, 1, 9, 0F,-0.05F, 1F, 0.5F, 0.7F, 0.8F, 0.5F, 1.2F, 0.7F, 1.2F, -0.05F, 0.5F, 1.2F, 0.95F, -0.5F, 0.9F, 2.95F, -0.5F, 0.9F, 2.95F, 0.3F, 1.5F, 0.95F, 0.3F, 1.5F); // Box 2
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(1F, -6F, -4.5F, 4, 1, 9, 0F,0.7F, 0.8F, 0.5F, -0.05F, 1F, 0.5F, -0.05F, 0.5F, 1.2F, 1.2F, 0.7F, 1.2F, 2.95F, -0.5F, 1F, 0.75F, -0.5F, 1F, 0.75F, 0.3F, 1.4F, 2.95F, 0.3F, 1.4F); // Box 3
		headModel[45].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 294
		bodyModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 297

		bodyModel[0].addShapeBox(-0.5F, -0.4F, -2F, 15, 6, 4, 0F,-0.3F, 0F, 0.5F, -9.7F, -0.2F, 0.5F, -9.7F, -0.2F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, -2F, 0.7F, -10.4F, -4F, 0.5F, -10.4F, -4F, 0.5F, -0.4F, -2F, 0.7F); // Box 294
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.8F, -0.4F, -2F, 15, 6, 4, 0F,0F, -0.2F, 0.5F, -10.3F, 0F, 0.5F, -10.3F, 0F, 0.5F, 0F, -0.2F, 0.5F, -0.8F, -4F, 0.5F, -10.3F, -2F, 0.7F, -10.3F, -2F, 0.7F, -0.8F, -4F, 0.5F); // Box 297
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}
}