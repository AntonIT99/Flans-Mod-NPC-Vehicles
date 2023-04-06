//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelParthiaKKK extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelParthiaKKK() //Same as Filename
	{
		headModel = new ModelRendererTurbo[49];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		headModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		headModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
		headModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 28
		headModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 29
		headModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 30
		headModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 31
		headModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 32
		headModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 33
		headModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 34
		headModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 35
		headModel[11] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 36
		headModel[12] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 37
		headModel[13] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 39
		headModel[14] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 40
		headModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41
		headModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 42
		headModel[17] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 43
		headModel[18] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 44
		headModel[19] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 45
		headModel[20] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 46
		headModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 47
		headModel[22] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 48
		headModel[23] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 50
		headModel[24] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 51
		headModel[25] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 52
		headModel[26] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 53
		headModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 54
		headModel[28] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 55
		headModel[29] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import Box18
		headModel[30] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import Box18
		headModel[31] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box18
		headModel[32] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box18
		headModel[33] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import Box18
		headModel[34] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box18
		headModel[35] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box18
		headModel[36] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box18
		headModel[37] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box18
		headModel[38] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box18
		headModel[39] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box18
		headModel[40] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box18
		headModel[41] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Import Box18
		headModel[42] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box18
		headModel[43] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import Box18
		headModel[44] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import Box18
		headModel[45] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box18
		headModel[46] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 0
		headModel[47] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 1
		headModel[48] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 2

		headModel[0].addShapeBox(-5.35F, -4F, -5F, 1, 3, 10, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 24
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-1F, -3.7F, -5.5F, 2, 1, 1, 0F,0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 26
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -4F, -5.5F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, -0.4F, 0.2F, 0.3F, -0.4F, 0.2F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 27
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3F, -4F, -5.5F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0.2F, 0.3F, -0.4F); // Box 28
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -2.7F, -5.5F, 10, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 29
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, 1.3F, -5.5F, 10, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 30
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5.4F, -1F, -2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 31
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5.4F, -1F, -5F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 32
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5.4F, -1F, 2F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 33
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -4F, 4.5F, 10, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 34
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, 1.3F, 4.5F, 10, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 35
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5.4F, 0F, -5F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 36
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5.4F, 1.3F, -5F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F); // Box 37
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4.35F, -4F, -5F, 1, 3, 10, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 39
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4.4F, -1F, 2F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 40
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4.4F, -1F, -2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 41
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(4.4F, -1F, -5F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(4.4F, 0F, -5F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 43
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4.4F, 1.3F, -5F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F); // Box 44
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-5.4F, 0F, 1.9F, 1, 1, 3, 0F,1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 45
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-5.4F, 1.3F, 1.9F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F); // Box 46
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(4.4F, 0F, 1.9F, 1, 1, 3, 0F,-0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 47
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(4.4F, 1.3F, 1.9F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 48
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-0.5F, -16.8F, 0.2F, 1, 1, 1, 0F,0.3F, 0.5F, -0.7F, 0.3F, 0.5F, -0.7F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-0.5F, -17.5F, 1.2F, 1, 1, 2, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 51
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-0.5F, -16.8F, 3.2F, 1, 1, 1, 0F,0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0.3F, 0.8F, -1F, 0.3F, 0.8F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 52
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-0.5F, -16.8F, 3.2F, 1, 3, 1, 0F,0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 2.5F, 0.8F, 0F, 2.5F); // Box 53
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-0.5F, -13.8F, 5.2F, 1, 4, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.9F, 0.3F, -1F, 0.9F, 0.3F, -1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 54
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-0.5F, -9.8F, 6.2F, 1, 4, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 1.3F, 0F, 0.2F, 1.3F, 0F, 0.2F, 1F, 0.5F, 0.2F, 1F, 0.5F); // Box 55
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-4F, -8F, -4.1F, 8, 3, 8, 0F,0F, 1.3F, -0.2F, 0F, 1.3F, -0.2F, 0F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0.9F, 0F, 0.7F, 0.9F, 0F, 0.7F, 0.9F, 0.5F, 1.2F, 0.9F, 0.5F, 1.2F); // Import Box18
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-4F, -12.8F, -4.1F, 8, 3, 8, 0F,-1.1F, -0.5F, -1.7F, -1.1F, -0.5F, -1.7F, -1.1F, -0.8F, -0.5F, -1.1F, -0.8F, -0.5F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 1F, 0.6F, -0.1F, 1F, 0.6F); // Import Box18
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-4F, -5.5F, -4F, 1, 2, 8, 0F,1F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, -0.3F, 1.4F, 1F, -0.3F, 1.4F, 1F, -0.5F, 1.2F, 0F, -0.5F, 1.2F, 0F, 0F, 1.2F, 1F, 0F, 1.2F); // Import Box18
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(3F, -5.5F, -4F, 1, 2, 8, 0F,0F, 0.2F, 1F, 1F, 0.2F, 1F, 1F, -0.3F, 1.4F, 0F, -0.3F, 1.4F, 0F, -0.5F, 1.2F, 1F, -0.5F, 1.2F, 1F, 0F, 1.2F, 0F, 0F, 1.2F); // Import Box18
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-3F, -5.5F, -4F, 6, 2, 8, 0F,1F, 0.2F, 1F, 1F, 0.2F, 1F, 1F, -0.3F, 1.4F, 1F, -0.3F, 1.4F, 1F, -0.5F, 1.2F, 1F, -0.5F, 1.2F, 1F, 0F, 1.2F, 1F, 0F, 1.2F); // Import Box18
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-4.5F, -5.4F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box18
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(3.5F, -5.4F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box18
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-4.5F, -4.8F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box18
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-2F, -4.8F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box18
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(1F, -4.8F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box18
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(3.5F, -4.8F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box18
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(4.3F, -5.2F, -2.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box18
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(4.3F, -5F, 1.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box18
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-5.3F, -5.2F, -2.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box18
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-5.3F, -5F, 1.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box18
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-2F, -5.4F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box18
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(1F, -5.4F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box18
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-4F, -15F, -2.9F, 8, 3, 8, 0F,-3.5F, 0.3F, -3.1F, -3.5F, 0.3F, -3.1F, -3.5F, 0.2F, -4F, -3.5F, 0.2F, -4F, -1.1F, -0.3F, -0.5F, -1.1F, -0.3F, -0.5F, -1.1F, 0F, -1.7F, -1.1F, 0F, -1.7F); // Box 0
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-0.5F, -16F, 0.1F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 1
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-0.5F, -4.8F, 6.2F, 1, 4, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, -0.7F, -1.5F, 0F, -0.7F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 2
		headModel[48].setRotationPoint(0F, 0F, 0F);
	}
}