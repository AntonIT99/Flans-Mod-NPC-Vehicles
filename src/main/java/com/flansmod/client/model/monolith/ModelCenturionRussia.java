//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCenturionRussia extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCenturionRussia() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];
		leftArmModel = new ModelRendererTurbo[8];
		rightArmModel = new ModelRendererTurbo[7];
		leftLegModel = new ModelRendererTurbo[14];
		rightLegModel = new ModelRendererTurbo[14];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 1
		bodyModel[40] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 3
		bodyModel[42] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 18
		bodyModel[43] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 19
		bodyModel[44] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 20
		bodyModel[45] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 21
		bodyModel[46] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 22

		bodyModel[0].addShapeBox(-3.5F, 3F, -3F, 7, 1, 1, 0F,0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.5F, 4F, -2.5F, 7, 2, 1, 0F,0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.1F, 0.2F, 0.6F, 0.1F, 0.2F, 0.6F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 1.5F, -3F, 7, 1, 1, 0F,0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 4.5F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, -0.7F, 0.55F, 0.2F, -0.7F, 0.55F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(1F, 4.5F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, -0.7F, 0.55F, 0.2F, -0.7F, 0.55F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 6F, -2.5F, 7, 1, 1, 0F,0.1F, -0.2F, 0.6F, 0.1F, -0.2F, 0.6F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.2F, 0.2F, 0.7F, -0.2F, 0.2F, 0.7F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, 7.5F, -2.5F, 6, 2, 1, 0F,0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.1F, 0.2F, 0.6F, 0.1F, 0.2F, 0.6F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3F, 9.5F, -2.5F, 6, 1, 1, 0F,0.1F, -0.2F, 0.6F, 0.1F, -0.2F, 0.6F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.2F, 0.1F, 0.7F, -0.2F, 0.1F, 0.7F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 7
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.5F, 10.5F, -2.5F, 5, 3, 1, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, -1.5F, 0.2F, 0.6F, -1.5F, 0.2F, 0.6F, -1.5F, 0.2F, -0.8F, -1.5F, 0.2F, -0.8F); // Box 8
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2.5F, 1.3F, -3F, 5, 1, 1, 0F,0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.2F, 1.3F, -3.1F, 2, 1, 1, 0F,-0.1F, -0.3F, 0.12F, -0.1F, -0.3F, 0.12F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 10
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.2F, 1.3F, -3.1F, 2, 1, 1, 0F,-0.1F, -0.3F, 0.12F, -0.1F, -0.3F, 0.12F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 11
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.2F, -0.5F, -3F, 1, 3, 1, 0F,0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.3F, 0F, 0.4F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, -1F, 0.3F, 0F, -1F); // Box 12
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.7F, -0.5F, -2F, 1, 1, 4, 0F,0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, -0.1F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.8F, 0.4F, -0.1F, -0.8F, 0.4F); // Box 13
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.2F, 3.5F, -3F, 1, 5, 1, 0F,0.3F, 1F, 0.4F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, -1F, 0.3F, 1F, -1F, 0F, -0.5F, -2.5F, 0F, -0.5F, -1.5F, 0F, -0.3F, 2F, 0F, -0.3F, 3F); // Box 15
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.2F, -0.800000000000001F, 1.9F, 1, 3, 1, 0F,0.4F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.2F, 1.7F, 1.9F, 2, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 17
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 8F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.35F, 0.2F, 0F, 0.35F, 0.2F, 1F, 0.4F, 0.2F, 1F, 0.4F, 0.2F, 0F, 0.35F, 0.2F, 0F, 0.35F, 0.2F, -0.6F, 0.3F, 0.2F, -0.6F, 0.3F); // Box 18
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3F, 1F, 1.5F, 6, 6, 1, 0F,0F, -0.5F, 0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0.2F, 0.35F, -0.2F, 0.2F, 0.35F); // Box 19
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3.7F, -0.5F, -2F, 1, 1, 4, 0F,0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, -0.3F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.8F, 0.4F, 0.5F, -0.8F, 0.4F); // Box 20
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(3.2F, -0.800000000000001F, 1.9F, 1, 3, 1, 0F,0F, -0.4F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2.2F, 1.7F, 1.9F, 2, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 22
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(3.2F, -0.5F, -3F, 1, 3, 1, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, 0.5F, 0.5F, 0.3F, 0F, 0.4F, 0.3F, 0F, -1F, 0.2F, 0F, -1F); // Box 23
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(3.2F, 3.5F, -3F, 1, 5, 1, 0F,0.2F, 0.5F, 0.5F, 0.3F, 1F, 0.4F, 0.3F, 1F, -1F, 0.2F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -2.5F, 0F, -0.3F, 3F, 0F, -0.3F, 2F); // Box 24
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 9.8F, -2F, 8, 1, 4, 0F,0.5F, -0.1F, 0.7F, 0.5F, -0.1F, 0.7F, 0.5F, -0.1F, 0.7F, 0.5F, -0.1F, 0.7F, 0.5F, -0.1F, 0.7F, 0.5F, -0.1F, 0.7F, 0.5F, -0.1F, 0.7F, 0.5F, -0.1F, 0.7F); // Box 25
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-5F, 8.2F, -2F, 1, 2, 1, 0F,-0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 26
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-5F, 8.2F, 1F, 1, 2, 1, 0F,-0.6F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 27
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-5F, 9.8F, 1F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F); // Box 28
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-5F, 9.8F, -2F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F); // Box 29
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(4F, 9.8F, -2F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F); // Box 30
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(4F, 9.8F, 1F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F); // Box 31
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(4F, 8.2F, 1F, 1, 2, 1, 0F,0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 32
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(4F, 8.2F, -2F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 33
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2.5F, 0F, -3.5F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, -0.4F, 0F, 1F, -0.4F, 0F); // Box 34
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.5F, 0F, -2.5F, 7, 1, 5, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0.2F); // Box 35
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.5F, 0.300000000000001F, 2.5F, 7, 1, 3, 0F,0F, 0.8F, 0F, 0F, 0.8F, 0F, -1F, 1.2F, 0F, -1F, 1.2F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, -1F, -1.4F, -0.5F, -1F, -1.4F, -0.5F); // Box 36
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3F, -2.9F, 4.5F, 6, 2, 1, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.5F, 0.2F, -0.4F, -0.5F, 0.2F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3F, 0.300000000000001F, -3F, 6, 1, 6, 0F,-0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1F, 7.5F, 2.5F, 1, 3, 1, 0F,0F, 0F, 0.2F, -0.6F, 0F, 0.4F, -0.6F, 0F, -1F, 0F, 0F, -1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 0
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0.95F, 9.8F, 2.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F); // Box 1
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-1.95F, 9.8F, 2.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F); // Box 2
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-2F, 7.5F, 2.5F, 1, 3, 1, 0F,-0.6F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 3
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4F, 11.5F, -2F, 8, 1, 2, 0F,1F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 1.5F, -0.6F, 1.5F, 1.5F, -0.6F, 1.5F); // Box 18
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(4.8F, 11.2F, 1F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F); // Box 19
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(4.8F, 10.2F, 1F, 1, 2, 1, 0F,0.5F, -0.1F, -1.1F, -1.1F, 0.1F, -1.15F, -1.1F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 20
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-5.8F, 10.2F, 1F, 1, 2, 1, 0F,-1.1F, 0.1F, -1.15F, 0.5F, -0.1F, -1.1F, 0.5F, -0.2F, 0.5F, -1.1F, 0F, 0.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 21
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-5.8F, 11.2F, 1F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F); // Box 22
		bodyModel[46].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 4
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 5
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 6
		leftArmModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
		leftArmModel[4] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 8
		leftArmModel[5] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 9
		leftArmModel[6] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 10
		leftArmModel[7] = new ModelRendererTurbo(this, 33, 82, textureX, textureY); // Box 51

		leftArmModel[0].addShapeBox(-1F, 5F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 4
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 5
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(0F, 4F, -2.5F, 3, 4, 1, 0F,0.2F, -0.2F, 0.2F, 0.5F, 0.8F, 0.2F, -0.5F, 0.3F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -1.2F, 0.2F, 0.5F, -0.2F, 0.2F, -0.5F, -0.7F, 0.2F, 0.2F, -1.2F, 0.2F); // Box 6
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.3F, 4F, -2.2F, 1, 4, 3, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.8F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.7F, -0.5F, 0.2F, -0.2F, 0.5F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F); // Box 7
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 1F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 8
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.3F, -1F, -2.2F, 1, 4, 3, 0F,0.2F, 0.3F, -0.5F, 0.2F, 0.8F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.7F, -0.5F, 0.2F, -0.7F, 0.5F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F); // Box 9
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(0F, -1F, -2.5F, 3, 4, 1, 0F,0.2F, -0.2F, 0.2F, 0.5F, 0.8F, 0.2F, -0.5F, 0.3F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.3F, 0.2F, 0.5F, -0.7F, 0.2F, -0.5F, -0.7F, 0.2F, 0.2F, 0.3F, 0.2F); // Box 10
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2.05F, -1F, -2.75F, 1, 3, 1, 0F,0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 1F, 0F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 1F, 0F, -0.8F, 0F); // Box 51
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 11
		rightArmModel[1] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 12
		rightArmModel[2] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 13
		rightArmModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 14
		rightArmModel[4] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 15
		rightArmModel[5] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 16
		rightArmModel[6] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 17

		rightArmModel[0].addShapeBox(-3F, -1F, -2.5F, 3, 4, 1, 0F,0.5F, 0.8F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.5F, 0.3F, 0.2F, 0.5F, -0.7F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.5F, -0.7F, 0.2F); // Box 11
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.3F, -1F, -2.2F, 1, 4, 3, 0F,0.2F, 0.8F, 0.5F, 0.2F, 0.3F, -0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.7F, 0.5F, 0.2F, -0.7F, -0.5F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F); // Box 12
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.3F, 4F, -2.2F, 1, 4, 3, 0F,0.2F, 0.8F, 0.5F, 0.2F, 0.3F, -0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.5F, 0.2F, -0.7F, -0.5F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F); // Box 13
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 4F, -2.5F, 3, 4, 1, 0F,0.5F, 0.8F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.5F, 0.3F, 0.2F, 0.5F, -0.2F, 0.2F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F, -0.5F, -0.7F, 0.2F); // Box 14
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 5F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 15
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 1F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 16
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 17
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 37
		leftLegModel[1] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 38
		leftLegModel[2] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 39
		leftLegModel[3] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 40
		leftLegModel[4] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 41
		leftLegModel[5] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 42
		leftLegModel[6] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 43
		leftLegModel[7] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 44
		leftLegModel[8] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 45
		leftLegModel[9] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 46
		leftLegModel[10] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 47
		leftLegModel[11] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 48
		leftLegModel[12] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 49
		leftLegModel[13] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 50

		leftLegModel[0].addShapeBox(2.8F, -0.6F, -1F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F); // Box 37
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(2.8F, 0.4F, -1F, 1, 4, 1, 0F,-0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, 0.2F, 0.3F, -0.1F, -0.8F, 0.3F, -0.1F, -0.8F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F); // Box 38
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(2.8F, 5F, -1F, 1, 2, 1, 0F,0.2F, 0.3F, -0.2F, -0.8F, 0.3F, -0.2F, -0.8F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 39
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(2.8F, 7F, -1F, 1, 3, 1, 0F,0F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.5F, 0.3F, -0.2F, -1.1F, 0.3F, -0.2F, -1.1F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F); // Box 40
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 4.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 41
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 6.8F, -1.5F, 4, 5, 4, 0F,0.7F, -0.2F, 0.3F, 0.6F, -0.2F, 0.3F, 0.5F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.4F, -1F, 0.2F, 0.4F, -1F, 0.2F, 0.4F, -1.7F, 0.1F, 0.4F, -1.7F, 0.1F); // Box 42
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 11F, -2F, 4, 2, 4, 0F,0.5F, 0F, 2.3F, 0.5F, 0F, 2.3F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -1.1F, 2.4F, 0.5F, -1.1F, 2.4F, 0.5F, -1.1F, 0.4F, 0.5F, -1.1F, 0.4F); // Box 43
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, 1.9F, 0.2F, -0.8F, 1.9F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 2.2F, 0.2F, 0F, 2.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 44
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 7.8F, -2F, 4, 5, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F); // Box 45
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-1F, 5F, -2.5F, 3, 4, 1, 0F,0.4F, 0.3F, 0.2F, 0.5F, -0.2F, 0.2F, -0.5F, -0.7F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, -1.2F, 0.2F, 0.5F, -0.5F, 0.2F, -0.5F, -0.7F, 0.2F, 0.4F, -1.2F, 0.2F); // Box 46
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-1F, 1.5F, -2.5F, 3, 4, 1, 0F,0F, -0.2F, 0.4F, 0.7F, 0.8F, 0.4F, -0.5F, 0.3F, 0.2F, 0F, -0.2F, 0.2F, 0.4F, -1.2F, 0.2F, 0.5F, -0.8F, 0.2F, -0.5F, -1.2F, 0.2F, 0.4F, -1.2F, 0.2F); // Box 47
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(1.3F, 1.5F, -2.2F, 1, 4, 3, 0F,0.2F, 0.3F, -0.5F, 0.4F, 0.8F, 0.7F, 0.4F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -1.2F, -0.5F, 0.2F, -0.7F, 0.5F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F); // Box 48
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(1.3F, 5F, -2.2F, 1, 4, 3, 0F,0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 0.5F, 0.2F, 0.3F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.7F, -0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F); // Box 49
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(2.5F, 9.5F, 1.5F, 1, 2, 1, 0F,0.2F, 0.3F, -0.2F, -0.8F, 0.3F, -0.2F, -0.8F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 50
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 23
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 24
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 25
		rightLegModel[3] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 26
		rightLegModel[4] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 27
		rightLegModel[5] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 11
		rightLegModel[6] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 61
		rightLegModel[7] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 30
		rightLegModel[8] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 31
		rightLegModel[9] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 32
		rightLegModel[10] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 33
		rightLegModel[11] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 34
		rightLegModel[12] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 35
		rightLegModel[13] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 36

		rightLegModel[0].addShapeBox(-2F, 1.5F, -2.5F, 3, 4, 1, 0F,0.7F, 0.8F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.2F, -0.5F, 0.3F, 0.2F, 0.5F, -0.8F, 0.2F, 0.4F, -1.2F, 0.2F, 0.4F, -1.2F, 0.2F, -0.5F, -1.2F, 0.2F); // Box 23
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.3F, 1.5F, -2.2F, 1, 4, 3, 0F,0.4F, 0.8F, 0.7F, 0.2F, 0.3F, -0.5F, 0.2F, -0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.2F, -0.7F, 0.5F, 0.2F, -1.2F, -0.5F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F); // Box 24
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 5F, -2.5F, 3, 4, 1, 0F,0.5F, -0.2F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, -0.2F, 0.2F, -0.5F, -0.7F, 0.2F, 0.5F, -0.5F, 0.2F, 0.4F, -1.2F, 0.2F, 0.4F, -1.2F, 0.2F, -0.5F, -0.7F, 0.2F); // Box 25
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.3F, 5F, -2.2F, 1, 4, 3, 0F,0.2F, -0.2F, 0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.5F, 0.5F, 0.2F, -0.7F, -0.5F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F); // Box 26
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 4.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 27
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, 1.9F, 0.2F, -0.8F, 1.9F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 2.2F, 0.2F, 0F, 2.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 7.8F, -2F, 4, 5, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F); // Box 61
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3.8F, -0.6F, -1F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F); // Box 30
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-3.8F, 0.4F, -1F, 1, 4, 1, 0F,-0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.8F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F, -0.8F, 0.3F, -0.1F); // Box 31
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-3.8F, 5F, -1F, 1, 2, 1, 0F,-0.8F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, -0.8F, 0.3F, -0.2F, -0.6F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F); // Box 32
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-3.8F, 7F, -1F, 1, 3, 1, 0F,-0.6F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, -1.1F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, -1.1F, 0.3F, -0.2F); // Box 33
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2F, 6.8F, -1.5F, 4, 5, 4, 0F,0.7F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.4F, -1F, 0.2F, 0.4F, -1F, 0.2F, 0.4F, -1.7F, 0.1F, 0.4F, -1.7F, 0.1F); // Box 34
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-2F, 11F, -2F, 4, 2, 4, 0F,0.5F, 0F, 2.3F, 0.5F, 0F, 2.3F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -1F, 2.4F, 0.5F, -1F, 2.4F, 0.5F, -1F, 0.4F, 0.5F, -1F, 0.4F); // Box 35
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-3.5F, 9.5F, 1.5F, 1, 2, 1, 0F,-0.8F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, -0.8F, 0.3F, -0.2F, -0.6F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F); // Box 36
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);
	}
}