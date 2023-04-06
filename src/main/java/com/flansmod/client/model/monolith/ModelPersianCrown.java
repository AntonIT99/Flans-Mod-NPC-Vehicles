//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPersianCrown extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelPersianCrown() //Same as Filename
	{
		headModel = new ModelRendererTurbo[40];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		headModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
		headModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		headModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 16
		headModel[6] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 17
		headModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 19
		headModel[9] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 20
		headModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 21
		headModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 22
		headModel[12] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 23
		headModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		headModel[14] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 25
		headModel[15] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 26
		headModel[16] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 27
		headModel[17] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 28
		headModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 29
		headModel[19] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 19
		headModel[20] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		headModel[21] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 4
		headModel[22] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		headModel[23] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 6
		headModel[24] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 7
		headModel[25] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		headModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		headModel[27] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 10
		headModel[28] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 11
		headModel[29] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 12
		headModel[30] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 13
		headModel[31] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 14
		headModel[32] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 15
		headModel[33] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 16
		headModel[34] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 17
		headModel[35] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 18
		headModel[36] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 19
		headModel[37] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 20
		headModel[38] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 21
		headModel[39] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 22

		headModel[0].addShapeBox(-3.5F, -10.3F, -3.5F, 7, 1, 7, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F); // Box 136
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-3.5F, -11.1F, -3.5F, 7, 1, 7, 0F,1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F); // Box 11
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.5F, -11.9F, -3.5F, 7, 1, 7, 0F,1.3F, 0.3F, 1.3F, 1.3F, 0.3F, 1.3F, 1.3F, 0.3F, 1.3F, 1.3F, 0.3F, 1.3F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 13
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3.5F, -13.2F, -3.5F, 7, 1, 7, 0F,1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.3F, 0F, 1.3F, 1.3F, 0F, 1.3F, 1.3F, 0F, 1.3F, 1.3F, 0F, 1.3F); // Box 14
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3.5F, -15.2F, -3.5F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 15
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.5F, -16.5F, -3.5F, 7, 1, 7, 0F,-1.6F, -0.3F, -1.6F, -1.6F, -0.3F, -1.6F, -1.6F, -0.3F, -1.6F, -1.6F, -0.3F, -1.6F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 16
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-3.5F, -14.2F, -3.5F, 7, 1, 7, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F); // Box 17
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3F, -5F, -4F, 2, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0.2F, -0.2F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F); // Box 18
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1F, -5F, -4F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F); // Box 19
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -1F, -4F, 8, 1, 5, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 20
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-2F, -2.5F, -4F, 2, 1, 1, 0F,0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F); // Box 21
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -2.5F, -4F, 2, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F); // Box 22
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -4.7F, 0F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 1.2F, 1.8F, 0.5F, 1.2F); // Box 23
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -0.7F, 0F, 8, 1, 4, 0F,1.8F, 0F, 0.2F, 1.8F, 0F, 0.2F, 1.8F, 0F, 1.2F, 1.8F, 0F, 1.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 24
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -3.2F, 0F, 8, 2, 4, 0F,1.8F, 0F, 0.2F, 1.8F, 0F, 0.2F, 1.8F, 0F, 1.2F, 1.8F, 0F, 1.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 1.2F, 1.8F, 0.5F, 1.2F); // Box 25
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -3.2F, -1.2F, 8, 2, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F); // Box 26
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -4.7F, -1.2F, 8, 1, 1, 0F,-1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F); // Box 27
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -0.2F, -1.2F, 8, 1, 1, 0F,0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 28
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, 0F, -4F, 8, 1, 5, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0F, 0.2F, -2.8F, 0F, 0.2F, -2.8F, 0F, 0.2F, -2.8F, 0F, 0.2F); // Box 29
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -7F, -4F, 9, 2, 8, 0F,0.9F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 19
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-2.5F, -8.5F, -4.9F, 5, 2, 1, 0F,0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 3
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-1.5F, -9.5F, -4.9F, 3, 2, 1, 0F,0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 4
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.5F, -10.5F, -4.9F, 1, 2, 1, 0F,0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 5
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-2.5F, -8.5F, 3.9F, 5, 2, 1, 0F,0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 6
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-1.5F, -9.5F, 3.9F, 3, 2, 1, 0F,0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 7
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-0.5F, -10.5F, 3.9F, 1, 2, 1, 0F,0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 8
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(3.9F, -10.5F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 9
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(3.9F, -9.5F, -1.5F, 1, 2, 3, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 10
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(3.9F, -8.5F, -2.5F, 1, 2, 5, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 11
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-4.9F, -10.5F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 12
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-4.9F, -9.5F, -1.5F, 1, 2, 3, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 13
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-4.9F, -8.5F, -2.5F, 1, 2, 5, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 14
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-3.5F, -9.9F, -3.5F, 7, 1, 7, 0F,0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 15
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-3.5F, -8.9F, -3.5F, 7, 1, 7, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.6F, -0.3F, 0.6F, 0.6F, -0.3F, 0.6F, 0.6F, -0.3F, 0.6F, 0.6F, -0.3F, 0.6F); // Box 16
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-3.5F, -8.2F, -3.5F, 7, 2, 7, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, -0.3F, 0.6F, 0.6F, -0.3F, 0.6F, 0.6F, -0.3F, 0.6F, 0.6F, -0.3F, 0.6F); // Box 17
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-0.5F, -5F, 5F, 1, 1, 9, 0F,-0.3F, 0F, 0.9F, -0.3F, 0F, 0.9F, 5.7F, -12F, 0.9F, -6.3F, -12F, 0.9F, -0.3F, 0F, 0.9F, -0.3F, 0F, 0.9F, 5.7F, 12F, 0.9F, -6.3F, 12F, 0.9F); // Box 18
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-0.5F, -5F, 5F, 1, 1, 9, 0F,-0.3F, 0F, 0.9F, -0.3F, 0F, 0.9F, -6.3F, -12F, 0.9F, 5.7F, -12F, 0.9F, -0.3F, 0F, 0.9F, -0.3F, 0F, 0.9F, -6.3F, 12F, 0.9F, 5.7F, 12F, 0.9F); // Box 19
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-0.7F, -5.5F, 5F, 1, 1, 5, 0F,-0.3F, 0F, 0.9F, -0.3F, 0F, 0.9F, 3.7F, -4F, 0.9F, -4.3F, -4F, 0.9F, -0.3F, 0F, 0.9F, -0.3F, 0F, 0.9F, 3.7F, 4F, 0.9F, -4.3F, 4F, 0.9F); // Box 20
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-0.3F, -5.5F, 5F, 1, 1, 5, 0F,-0.3F, 0F, 0.9F, -0.3F, 0F, 0.9F, -4.3F, -4F, 0.9F, 3.7F, -4F, 0.9F, -0.3F, 0F, 0.9F, -0.3F, 0F, 0.9F, -4.3F, 4F, 0.9F, 3.7F, 4F, 0.9F); // Box 21
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 22
		headModel[39].setRotationPoint(0F, 0F, 0F);
	}
}