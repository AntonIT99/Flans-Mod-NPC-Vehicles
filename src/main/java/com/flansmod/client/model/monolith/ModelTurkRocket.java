//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTurkRocket extends ModelPlane //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelTurkRocket() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[36];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 39
		bodyModel[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 40
		bodyModel[16] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 41
		bodyModel[17] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 42
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 43
		bodyModel[19] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 44
		bodyModel[20] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 45
		bodyModel[21] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 46
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[23] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 48
		bodyModel[24] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 49
		bodyModel[25] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 51
		bodyModel[27] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 52
		bodyModel[28] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 53
		bodyModel[29] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 54
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[31] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 56
		bodyModel[32] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 57
		bodyModel[33] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 58
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 60

		bodyModel[0].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[0].setRotationPoint(-3.5F, 3F, -10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -7F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -7F); // Box 1
		bodyModel[1].setRotationPoint(-10.5F, 3F, -10.5F);

		bodyModel[2].addShapeBox(-0.5F, 0F, -0.5F, 1, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(0F, -32F, -9F);

		bodyModel[3].addShapeBox(-0.5F, 0F, -0.5F, 1, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(0F, -32F, 9F);

		bodyModel[4].addShapeBox(-0.5F, 0F, -0.5F, 1, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-8F, -32F, -5F);

		bodyModel[5].addShapeBox(-0.5F, 0F, -0.5F, 1, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-8F, -32F, 5F);

		bodyModel[6].addShapeBox(-0.5F, 0F, -0.5F, 1, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(8F, -32F, 5F);

		bodyModel[7].addShapeBox(-0.5F, 0F, -0.5F, 1, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(8F, -32F, -5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 20, 21, 0F,-3F, 0F, -10F, -3F, 0F, -10F, -3F, 0F, -10F, -3F, 0F, -10F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 12
		bodyModel[8].setRotationPoint(-3.5F, -52F, -10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 20, 21, 0F,3F, 0F, -10F, -9.9F, 0F, -10F, -9.9F, 0F, -10F, 3F, 0F, -10F, 0F, 0F, 1F, 1F, 0F, -7F, 1F, 0F, -7F, 0F, 0F, 1F); // Box 13
		bodyModel[9].setRotationPoint(3.5F, -52F, -10.5F);

		bodyModel[10].addShapeBox(-1.5F, 0F, 9.6F, 3, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[10].setRotationPoint(0F, -16F, 0F);

		bodyModel[11].addShapeBox(-1.5F, 0F, 9.6F, 3, 3, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 16
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1.5F, 0F, 9.6F, 3, 5, 3, 0F,-1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 17
		bodyModel[12].setRotationPoint(0F, -21F, 0F);

		bodyModel[13].addShapeBox(-0.5F, 0F, 12.6F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(0F, -14F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 20, 21, 0F,-9.9F, 0F, -10F, 3F, 0F, -10F, 3F, 0F, -10F, -9.9F, 0F, -10F, 1F, 0F, -7F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -7F); // Box 39
		bodyModel[14].setRotationPoint(-10.5F, -52F, -10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -7F, 1F, 0F, -7F, 0F, 0F, 1F); // Box 40
		bodyModel[15].setRotationPoint(3.5F, 3F, -10.5F);

		bodyModel[16].addShapeBox(-1.5F, 0F, 9.6F, 3, 5, 3, 0F,-1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 41
		bodyModel[16].setRotationPoint(0F, -21F, 0F);
		bodyModel[16].rotateAngleY = -2.12930169F;

		bodyModel[17].addShapeBox(-1.5F, 0F, 9.6F, 3, 3, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 42
		bodyModel[17].setRotationPoint(0F, 0F, 0F);
		bodyModel[17].rotateAngleY = -2.12930169F;

		bodyModel[18].addShapeBox(-1.5F, 0F, 9.6F, 3, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[18].setRotationPoint(0F, -16F, 0F);
		bodyModel[18].rotateAngleY = -2.12930169F;

		bodyModel[19].addShapeBox(-0.5F, 0F, 12.6F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[19].setRotationPoint(0F, -14F, 0F);
		bodyModel[19].rotateAngleY = -2.12930169F;

		bodyModel[20].addShapeBox(-1.5F, 0F, 9.6F, 3, 5, 3, 0F,-1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 45
		bodyModel[20].setRotationPoint(0F, -21F, 0F);
		bodyModel[20].rotateAngleY = 2.12930169F;

		bodyModel[21].addShapeBox(-1.5F, 0F, 9.6F, 3, 3, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 46
		bodyModel[21].setRotationPoint(0F, 0F, 0F);
		bodyModel[21].rotateAngleY = 2.12930169F;

		bodyModel[22].addShapeBox(-1.5F, 0F, 9.6F, 3, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[22].setRotationPoint(0F, -16F, 0F);
		bodyModel[22].rotateAngleY = 2.12930169F;

		bodyModel[23].addShapeBox(-0.5F, 0F, 12.6F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[23].setRotationPoint(0F, -14F, 0F);
		bodyModel[23].rotateAngleY = 2.12930169F;

		bodyModel[24].addShapeBox(-1.5F, 0F, 9.6F, 3, 5, 3, 0F,-1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 49
		bodyModel[24].setRotationPoint(0F, -21F, 0F);
		bodyModel[24].rotateAngleY = 1.01229097F;

		bodyModel[25].addShapeBox(-1.5F, 0F, 9.6F, 3, 3, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 50
		bodyModel[25].setRotationPoint(0F, 0F, 0F);
		bodyModel[25].rotateAngleY = 1.01229097F;

		bodyModel[26].addShapeBox(-1.5F, 0F, 9.6F, 3, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[26].setRotationPoint(0F, -16F, 0F);
		bodyModel[26].rotateAngleY = 1.01229097F;

		bodyModel[27].addShapeBox(-0.5F, 0F, 12.6F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[27].setRotationPoint(0F, -14F, 0F);
		bodyModel[27].rotateAngleY = 1.01229097F;

		bodyModel[28].addShapeBox(-1.5F, 0F, 9.6F, 3, 5, 3, 0F,-1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 53
		bodyModel[28].setRotationPoint(0F, -21F, 0F);
		bodyModel[28].rotateAngleY = -1.01229097F;

		bodyModel[29].addShapeBox(-1.5F, 0F, 9.6F, 3, 3, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 54
		bodyModel[29].setRotationPoint(0F, 0F, 0F);
		bodyModel[29].rotateAngleY = -1.01229097F;

		bodyModel[30].addShapeBox(-1.5F, 0F, 9.6F, 3, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[30].setRotationPoint(0F, -16F, 0F);
		bodyModel[30].rotateAngleY = -1.01229097F;

		bodyModel[31].addShapeBox(-0.5F, 0F, 12.6F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[31].setRotationPoint(0F, -14F, 0F);
		bodyModel[31].rotateAngleY = -1.01229097F;

		bodyModel[32].addShapeBox(-1.5F, 0F, 9.6F, 3, 5, 3, 0F,-1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, -1.4F, 0F, -1.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 57
		bodyModel[32].setRotationPoint(0F, -21F, 0F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addShapeBox(-1.5F, 0F, 9.6F, 3, 3, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 58
		bodyModel[33].setRotationPoint(0F, 0F, 0F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addShapeBox(-1.5F, 0F, 9.6F, 3, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[34].setRotationPoint(0F, -16F, 0F);
		bodyModel[34].rotateAngleY = -3.14159265F;

		bodyModel[35].addShapeBox(-0.5F, 0F, 12.6F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[35].setRotationPoint(0F, -14F, 0F);
		bodyModel[35].rotateAngleY = -3.14159265F;
	}
}