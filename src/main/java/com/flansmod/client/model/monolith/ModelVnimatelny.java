//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelVnimatelny extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelVnimatelny() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];
		turretModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initturretModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1
		bodyModel[45] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 3

		bodyModel[0].addShapeBox(0F, 0F, 0F, 33, 4, 12, 0F,0F, 0F, -0.5F, 0F, 2F, -5.5F, 0F, 2F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(23F, 0F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 43, 4, 12, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bodyModel[1].setRotationPoint(-20F, 0F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 4, 10, 0F,0.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 3
		bodyModel[2].setRotationPoint(-55F, 0F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 43, 1, 12, 0F,0F, 0F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 4
		bodyModel[3].setRotationPoint(-20F, -1F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 36, 1, 12, 0F,-0.8F, -1.4F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, -0.8F, -1.4F, -3.5F, -0.5F, 0.5F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0.5F, -3F); // Box 5
		bodyModel[4].setRotationPoint(-56F, -1F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 33, 2, 12, 0F,0F, 2F, -5.5F, -0.5F, 0.1F, -5.5F, -0.5F, 0.1F, -5.5F, 0F, 2F, -5.5F, 0F, 0F, -0.5F, 0F, -2F, -5.5F, 0F, -2F, -5.5F, 0F, 0F, -0.5F); // Box 6
		bodyModel[5].setRotationPoint(23F, -2F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(22.5F, -5F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(21.5F, -5.5F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 9
		bodyModel[8].setRotationPoint(24.5F, -7.8F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(25.5F, -6.8F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 11
		bodyModel[10].setRotationPoint(27.5F, -7.8F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 12
		bodyModel[11].setRotationPoint(28.5F, -4.5F, 0.3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 13
		bodyModel[12].setRotationPoint(28.5F, -4.5F, -1.3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		bodyModel[13].setRotationPoint(18.5F, -6.8F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(17.5F, -8.8F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(18.5F, -9.8F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(11.5F, -10.5F, -1F);
		bodyModel[16].rotateAngleZ = 0.01745329F;

		bodyModel[17].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 19
		bodyModel[17].setRotationPoint(18.5F, -3.8F, 3F);

		bodyModel[18].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 20
		bodyModel[18].setRotationPoint(18.5F, -4.7F, 3F);
		bodyModel[18].rotateAngleY = 0.76794487F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 21
		bodyModel[19].setRotationPoint(18.5F, -4.7F, 3F);
		bodyModel[19].rotateAngleY = 0.76794487F;

		bodyModel[20].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 22
		bodyModel[20].setRotationPoint(12.5F, -4.7F, 3F);
		bodyModel[20].rotateAngleY = 0.76794487F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 23
		bodyModel[21].setRotationPoint(12.5F, -4.7F, 3F);
		bodyModel[21].rotateAngleY = 0.76794487F;

		bodyModel[22].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 24
		bodyModel[22].setRotationPoint(12.5F, -3.8F, 3F);

		bodyModel[23].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 28
		bodyModel[23].setRotationPoint(-51F, -3.5F, 0F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 29
		bodyModel[24].setRotationPoint(-51F, -3.5F, 0F);
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 30
		bodyModel[25].setRotationPoint(-50.5F, -2.6F, 0F);
		bodyModel[25].rotateAngleY = 1.74532925F;

		bodyModel[26].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 31
		bodyModel[26].setRotationPoint(18.5F, -3.8F, -4F);

		bodyModel[27].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 32
		bodyModel[27].setRotationPoint(18F, -4.7F, -4F);
		bodyModel[27].rotateAngleY = -0.76794487F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 33
		bodyModel[28].setRotationPoint(18F, -4.7F, -4F);
		bodyModel[28].rotateAngleY = -0.76794487F;

		bodyModel[29].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 34
		bodyModel[29].setRotationPoint(12F, -4.7F, -4F);
		bodyModel[29].rotateAngleY = -0.76794487F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 35
		bodyModel[30].setRotationPoint(12F, -4.7F, -4F);
		bodyModel[30].rotateAngleY = -0.76794487F;

		bodyModel[31].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 36
		bodyModel[31].setRotationPoint(12.5F, -3.8F, -4F);

		bodyModel[32].addShapeBox(1F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-10.5F, -3F, -0.5F);

		bodyModel[33].addShapeBox(-5F, -1F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 39
		bodyModel[33].setRotationPoint(-35F, -3F, 0F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[34].setRotationPoint(-36.5F, -2.3F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 32, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 42
		bodyModel[35].setRotationPoint(14.5F, -31.5F, -0.5F);
		bodyModel[35].rotateAngleZ = 0.03490659F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 44
		bodyModel[36].setRotationPoint(15F, -22.5F, -3.5F);
		bodyModel[36].rotateAngleZ = 0.03490659F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 45
		bodyModel[37].setRotationPoint(-47.5F, -3.5F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 46
		bodyModel[38].setRotationPoint(-47.5F, -5.5F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 48
		bodyModel[39].setRotationPoint(-56.5F, -8F, -0.5F);
		bodyModel[39].rotateAngleZ = 0.13962634F;

		bodyModel[40].addShapeBox(-5.8F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 49
		bodyModel[40].setRotationPoint(-56.5F, -8F, -0.5F);
		bodyModel[40].rotateAngleZ = 0.13962634F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 33, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -1.5F); // Box 50
		bodyModel[41].setRotationPoint(23F, 4F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 43, 3, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F); // Box 51
		bodyModel[42].setRotationPoint(-20F, 4F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 35, 3, 10, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, -0.8F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, -0.8F, -4.5F); // Box 52
		bodyModel[43].setRotationPoint(-55F, 4F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[44].setRotationPoint(3.5F, -10.5F, -1F);
		bodyModel[44].rotateAngleZ = 0.01745329F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[45].setRotationPoint(-28.5F, -9.5F, -1F);
		bodyModel[45].rotateAngleZ = 0.01745329F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[46].setRotationPoint(-20.5F, -9.5F, -1F);
		bodyModel[46].rotateAngleZ = 0.01745329F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 38

		turretModel[0].addShapeBox(-4F, -1F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 38
		turretModel[0].setRotationPoint(-8F, -3.7F, 0F);
	}
}