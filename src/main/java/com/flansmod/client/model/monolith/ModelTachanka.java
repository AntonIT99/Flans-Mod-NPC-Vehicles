//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTachanka extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelTachanka() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[56];
		leftBackWheelModel = new ModelRendererTurbo[50];
		rightBackWheelModel = new ModelRendererTurbo[50];
		leftTrackModel = new ModelRendererTurbo[1007];

		initbodyModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();
		initleftTrackModel_1();
		initleftTrackModel_2();
		initleftTrackModel_3();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 164
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 227
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 228
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 229
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 230
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 231
		bodyModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 234
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 235
		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 236
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 237
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 238
		bodyModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 239
		bodyModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 240
		bodyModel[16] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 241
		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 242
		bodyModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 262
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 264
		bodyModel[20] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 287
		bodyModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 288
		bodyModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 289
		bodyModel[23] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 291
		bodyModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 210
		bodyModel[25] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 212
		bodyModel[26] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 364
		bodyModel[27] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 365
		bodyModel[28] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 366
		bodyModel[29] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 367
		bodyModel[30] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 369
		bodyModel[31] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 371
		bodyModel[32] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 372
		bodyModel[33] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 20
		bodyModel[34] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 21
		bodyModel[35] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 22
		bodyModel[36] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 23
		bodyModel[37] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 24
		bodyModel[38] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 25
		bodyModel[39] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		bodyModel[40] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 27
		bodyModel[41] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 28
		bodyModel[42] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 29
		bodyModel[43] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 30
		bodyModel[44] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 31
		bodyModel[45] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 32
		bodyModel[46] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 33
		bodyModel[47] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
		bodyModel[48] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 35
		bodyModel[49] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 36
		bodyModel[50] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 37
		bodyModel[51] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 38
		bodyModel[52] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 39
		bodyModel[53] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 40
		bodyModel[54] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 41
		bodyModel[55] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, -1F, 0F, 1, 3, 1, 0F,14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(-34F, -1F, 6F);

		bodyModel[1].addShapeBox(0F, -1F, 0F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[1].setRotationPoint(-6F, 2F, -14F);

		bodyModel[2].addShapeBox(0F, -1F, 0F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[2].setRotationPoint(-39F, 2F, -14F);

		bodyModel[3].addShapeBox(0F, -1F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[3].setRotationPoint(-6F, 1F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[4].setRotationPoint(-29F, 0F, 11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[5].setRotationPoint(-24F, 0F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[6].setRotationPoint(-20F, -2.5F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[7].setRotationPoint(-16F, -6F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[8].setRotationPoint(-12F, -9F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[9].setRotationPoint(-29F, -1F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.25F, 2F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, 0F, 1.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[10].setRotationPoint(-29F, -4F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,3F, 1.5F, 0F, -3.25F, 2.25F, 0F, -3.25F, 2.25F, 0F, 3F, 1.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 236
		bodyModel[11].setRotationPoint(-30F, -7F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F); // Box 237
		bodyModel[12].setRotationPoint(-37F, -10F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 238
		bodyModel[13].setRotationPoint(-41F, -10F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F); // Box 239
		bodyModel[14].setRotationPoint(-45F, -10F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F); // Box 240
		bodyModel[15].setRotationPoint(-46F, -8F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.75F, 0F); // Box 241
		bodyModel[16].setRotationPoint(-47F, -7F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 2F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, -1F, 2F, 0F, 0.5F, 1F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, 1F, 0F); // Box 242
		bodyModel[17].setRotationPoint(-48F, -4F, 11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 28, 1, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 262
		bodyModel[18].setRotationPoint(-48F, -3F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -1.5F, 10F, 0F, -2.25F, 10F, 0F, 2.25F, 10F, 0F, 2.25F); // Box 264
		bodyModel[19].setRotationPoint(-39F, -2F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.75F, 5.75F, 0F, 1.75F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.75F, 1.5F); // Box 287
		bodyModel[20].setRotationPoint(-23F, -3F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 288
		bodyModel[21].setRotationPoint(-18F, -10F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[22].setRotationPoint(-19F, -19F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[23].setRotationPoint(-18F, -15F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,10F, 1.25F, 0F, 10F, 1.25F, 0F, 10F, 1.25F, 0F, 10F, 1.25F, 0F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 5F, 0F); // Box 210
		bodyModel[24].setRotationPoint(-39F, -10F, 9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 212
		bodyModel[25].setRotationPoint(-49F, -11F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -5.25F, 0F, 3F, 6.25F, 0F, 3F, 6.25F, 0F, 3F, -5.25F, 0F, 3F); // Box 364
		bodyModel[26].setRotationPoint(-11F, -10F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 365
		bodyModel[27].setRotationPoint(1F, -9F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[28].setRotationPoint(-5F, -3F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 8, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 367
		bodyModel[29].setRotationPoint(-47F, -10F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[30].setRotationPoint(-22F, -11F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[31].setRotationPoint(-16F, -11F, 9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, 3F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -5F, 3F, 0F, -5F, 3F, 0F, 0F, 3F); // Box 372
		bodyModel[32].setRotationPoint(-20F, -3F, -6F);

		bodyModel[33].addShapeBox(0F, -1F, 0F, 22, 2, 1, 0F,14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F); // Box 20
		bodyModel[33].setRotationPoint(9F, -1F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 21
		bodyModel[34].setRotationPoint(-43.5F, -12.5F, -2.5F);
		bodyModel[34].rotateAngleZ = 0.2443461F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[35].setRotationPoint(-45F, -15F, 5.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[36].setRotationPoint(-45F, -15F, -7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[37].setRotationPoint(-29F, 0F, -15F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[38].setRotationPoint(-24F, 0F, -15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[39].setRotationPoint(-20F, -2.5F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[40].setRotationPoint(-16F, -6F, -15F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[41].setRotationPoint(-12F, -9F, -15F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[42].setRotationPoint(-29F, -1F, -15F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.25F, 2F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, 0F, 1.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[43].setRotationPoint(-29F, -4F, -15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,3F, 1.5F, 0F, -3.25F, 2.25F, 0F, -3.25F, 2.25F, 0F, 3F, 1.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 31
		bodyModel[44].setRotationPoint(-30F, -7F, -15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F); // Box 32
		bodyModel[45].setRotationPoint(-37F, -10F, -15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[46].setRotationPoint(-41F, -10F, -15F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F); // Box 34
		bodyModel[47].setRotationPoint(-45F, -10F, -15F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F); // Box 35
		bodyModel[48].setRotationPoint(-46F, -8F, -15F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.75F, 0F); // Box 36
		bodyModel[49].setRotationPoint(-47F, -7F, -15F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 2F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, -1F, 2F, 0F, 0.5F, 1F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, 1F, 0F); // Box 37
		bodyModel[50].setRotationPoint(-48F, -4F, -15F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,10F, 1.25F, 0F, 10F, 1.25F, 0F, 10F, 1.25F, 0F, 10F, 1.25F, 0F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 5F, 0F); // Box 38
		bodyModel[51].setRotationPoint(-39F, -10F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[52].setRotationPoint(-22F, -11F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[53].setRotationPoint(-16F, -11F, -10F);

		bodyModel[54].addShapeBox(0F, -1F, 0F, 22, 2, 1, 0F,14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F); // Box 41
		bodyModel[54].setRotationPoint(9F, -1F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(-18F, -15F, -9F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 308
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 309
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 310
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 311
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 312
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 313
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 314
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 315
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 316
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 317
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 318
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 319
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 320
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 321
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 322
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 323
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 324
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 325
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 326
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 327
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 328
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 329
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 330
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 331
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 332
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 333
		leftBackWheelModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 334
		leftBackWheelModel[27] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 335
		leftBackWheelModel[28] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 336
		leftBackWheelModel[29] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 337
		leftBackWheelModel[30] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 338
		leftBackWheelModel[31] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 339
		leftBackWheelModel[32] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 340
		leftBackWheelModel[33] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 341
		leftBackWheelModel[34] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 342
		leftBackWheelModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 343
		leftBackWheelModel[36] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 344
		leftBackWheelModel[37] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 345
		leftBackWheelModel[38] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 346
		leftBackWheelModel[39] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 347
		leftBackWheelModel[40] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 348
		leftBackWheelModel[41] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 349
		leftBackWheelModel[42] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 350
		leftBackWheelModel[43] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 351
		leftBackWheelModel[44] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 352
		leftBackWheelModel[45] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 353
		leftBackWheelModel[46] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 354
		leftBackWheelModel[47] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 355
		leftBackWheelModel[48] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 356
		leftBackWheelModel[49] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 357

		leftBackWheelModel[0].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F); // Box 308
		leftBackWheelModel[0].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[1].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F); // Box 309
		leftBackWheelModel[1].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[2].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F); // Box 310
		leftBackWheelModel[2].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[3].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6.4F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6F, 3.8F, 0F, 6.45F, -3.95F, 0F); // Box 311
		leftBackWheelModel[3].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[4].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F); // Box 312
		leftBackWheelModel[4].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[5].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F); // Box 313
		leftBackWheelModel[5].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[6].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F); // Box 314
		leftBackWheelModel[6].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[7].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.45F, -3.95F, 0F, 6F, 3.8F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.4F, -3.95F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F); // Box 315
		leftBackWheelModel[7].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[8].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 316
		leftBackWheelModel[8].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[9].addShapeBox(6.5F, -3.5F, 0F, 1, 1, 1, 0F,1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F); // Box 317
		leftBackWheelModel[9].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[10].addShapeBox(4.5F, -6.5F, 0F, 1, 1, 1, 0F,-0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F); // Box 318
		leftBackWheelModel[10].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[11].addShapeBox(-5.5F, -6.5F, 0F, 1, 1, 1, 0F,1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F); // Box 319
		leftBackWheelModel[11].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[12].addShapeBox(-7.5F, -3.5F, 0F, 1, 1, 1, 0F,-0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F); // Box 320
		leftBackWheelModel[12].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[13].addShapeBox(-8.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 321
		leftBackWheelModel[13].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[14].addShapeBox(-7.5F, 2.5F, 0F, 1, 1, 1, 0F,1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F); // Box 322
		leftBackWheelModel[14].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[15].addShapeBox(-5.5F, 5.5F, 0F, 1, 1, 1, 0F,0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F); // Box 323
		leftBackWheelModel[15].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[16].addShapeBox(-3.5F, 6.5F, 0F, 1, 1, 1, 0F,0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F); // Box 324
		leftBackWheelModel[16].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[17].addShapeBox(-0.5F, 7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 325
		leftBackWheelModel[17].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[18].addShapeBox(2.5F, 6.5F, 0F, 1, 1, 1, 0F,1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F); // Box 326
		leftBackWheelModel[18].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[19].addShapeBox(4.5F, 5.5F, 0F, 1, 1, 1, 0F,1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F); // Box 327
		leftBackWheelModel[19].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[20].addShapeBox(6.5F, 2.5F, 0F, 1, 1, 1, 0F,-0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F); // Box 328
		leftBackWheelModel[20].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[21].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 329
		leftBackWheelModel[21].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[22].addShapeBox(-3.5F, -7.5F, 0F, 1, 1, 1, 0F,1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F); // Box 330
		leftBackWheelModel[22].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[23].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 331
		leftBackWheelModel[23].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[24].addShapeBox(2.5F, -7.5F, 0F, 1, 1, 1, 0F,0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F); // Box 332
		leftBackWheelModel[24].setRotationPoint(-5.5F, 1.5F, 12F);

		leftBackWheelModel[25].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F); // Box 333
		leftBackWheelModel[25].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[26].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F); // Box 334
		leftBackWheelModel[26].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[27].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F); // Box 335
		leftBackWheelModel[27].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[28].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6.4F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6F, 3.8F, 0F, 6.45F, -3.95F, 0F); // Box 336
		leftBackWheelModel[28].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[29].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F); // Box 337
		leftBackWheelModel[29].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[30].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F); // Box 338
		leftBackWheelModel[30].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[31].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F); // Box 339
		leftBackWheelModel[31].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[32].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.45F, -3.95F, 0F, 6F, 3.8F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.4F, -3.95F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F); // Box 340
		leftBackWheelModel[32].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[33].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 341
		leftBackWheelModel[33].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[34].addShapeBox(6.5F, -3.5F, 0F, 1, 1, 1, 0F,1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F); // Box 342
		leftBackWheelModel[34].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[35].addShapeBox(4.5F, -6.5F, 0F, 1, 1, 1, 0F,-0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F); // Box 343
		leftBackWheelModel[35].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[36].addShapeBox(-5.5F, -6.5F, 0F, 1, 1, 1, 0F,1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F); // Box 344
		leftBackWheelModel[36].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[37].addShapeBox(-7.5F, -3.5F, 0F, 1, 1, 1, 0F,-0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F); // Box 345
		leftBackWheelModel[37].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[38].addShapeBox(-8.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 346
		leftBackWheelModel[38].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[39].addShapeBox(-7.5F, 2.5F, 0F, 1, 1, 1, 0F,1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F); // Box 347
		leftBackWheelModel[39].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[40].addShapeBox(-5.5F, 5.5F, 0F, 1, 1, 1, 0F,0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F); // Box 348
		leftBackWheelModel[40].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[41].addShapeBox(-3.5F, 6.5F, 0F, 1, 1, 1, 0F,0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F); // Box 349
		leftBackWheelModel[41].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[42].addShapeBox(-0.5F, 7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 350
		leftBackWheelModel[42].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[43].addShapeBox(2.5F, 6.5F, 0F, 1, 1, 1, 0F,1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F); // Box 351
		leftBackWheelModel[43].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[44].addShapeBox(4.5F, 5.5F, 0F, 1, 1, 1, 0F,1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F); // Box 352
		leftBackWheelModel[44].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[45].addShapeBox(6.5F, 2.5F, 0F, 1, 1, 1, 0F,-0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F); // Box 353
		leftBackWheelModel[45].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[46].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 354
		leftBackWheelModel[46].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[47].addShapeBox(-3.5F, -7.5F, 0F, 1, 1, 1, 0F,1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F); // Box 355
		leftBackWheelModel[47].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[48].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 356
		leftBackWheelModel[48].setRotationPoint(-38.5F, 1.5F, 12F);

		leftBackWheelModel[49].addShapeBox(2.5F, -7.5F, 0F, 1, 1, 1, 0F,0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F); // Box 357
		leftBackWheelModel[49].setRotationPoint(-38.5F, 1.5F, 12F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 42
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 43
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 44
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 45
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 46
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 47
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 48
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 49
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 50
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 51
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 52
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 53
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 54
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 55
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 56
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 57
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 58
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 59
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 60
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 61
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 62
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 63
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 64
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 65
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 66
		rightBackWheelModel[25] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 67
		rightBackWheelModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 68
		rightBackWheelModel[27] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 69
		rightBackWheelModel[28] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 70
		rightBackWheelModel[29] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 71
		rightBackWheelModel[30] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 72
		rightBackWheelModel[31] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 73
		rightBackWheelModel[32] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 74
		rightBackWheelModel[33] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 75
		rightBackWheelModel[34] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 76
		rightBackWheelModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 77
		rightBackWheelModel[36] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 78
		rightBackWheelModel[37] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 79
		rightBackWheelModel[38] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 80
		rightBackWheelModel[39] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 81
		rightBackWheelModel[40] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 82
		rightBackWheelModel[41] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 83
		rightBackWheelModel[42] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 84
		rightBackWheelModel[43] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 85
		rightBackWheelModel[44] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 86
		rightBackWheelModel[45] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 87
		rightBackWheelModel[46] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 88
		rightBackWheelModel[47] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 89
		rightBackWheelModel[48] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 90
		rightBackWheelModel[49] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 91

		rightBackWheelModel[0].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F); // Box 42
		rightBackWheelModel[0].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[1].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F); // Box 43
		rightBackWheelModel[1].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[2].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F); // Box 44
		rightBackWheelModel[2].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[3].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,5.95F, 3.8F, 0F, 6.4F, -3.95F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6F, 3.8F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F); // Box 45
		rightBackWheelModel[3].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[4].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.4F, 0F, 3.8F, 6F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F); // Box 46
		rightBackWheelModel[4].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[5].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F); // Box 47
		rightBackWheelModel[5].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[6].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.4F, 0F, 3.8F, 6F, 0F); // Box 48
		rightBackWheelModel[6].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[7].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6.4F, -3.95F, 0F, 5.95F, 3.8F, 0F); // Box 49
		rightBackWheelModel[7].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[8].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 50
		rightBackWheelModel[8].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[9].addShapeBox(6.5F, -3.5F, 0F, 1, 1, 1, 0F,1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F); // Box 51
		rightBackWheelModel[9].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[10].addShapeBox(4.5F, -6.5F, 0F, 1, 1, 1, 0F,-0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F); // Box 52
		rightBackWheelModel[10].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[11].addShapeBox(-5.5F, -6.5F, 0F, 1, 1, 1, 0F,1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F); // Box 53
		rightBackWheelModel[11].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[12].addShapeBox(-7.5F, -3.5F, 0F, 1, 1, 1, 0F,-0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F); // Box 54
		rightBackWheelModel[12].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[13].addShapeBox(-8.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 55
		rightBackWheelModel[13].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[14].addShapeBox(-7.5F, 2.5F, 0F, 1, 1, 1, 0F,1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F); // Box 56
		rightBackWheelModel[14].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[15].addShapeBox(-5.5F, 5.5F, 0F, 1, 1, 1, 0F,0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F); // Box 57
		rightBackWheelModel[15].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[16].addShapeBox(-3.5F, 6.5F, 0F, 1, 1, 1, 0F,0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F); // Box 58
		rightBackWheelModel[16].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[17].addShapeBox(-0.5F, 7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 59
		rightBackWheelModel[17].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[18].addShapeBox(2.5F, 6.5F, 0F, 1, 1, 1, 0F,1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F); // Box 60
		rightBackWheelModel[18].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[19].addShapeBox(4.5F, 5.5F, 0F, 1, 1, 1, 0F,1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F); // Box 61
		rightBackWheelModel[19].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[20].addShapeBox(6.5F, 2.5F, 0F, 1, 1, 1, 0F,-0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F); // Box 62
		rightBackWheelModel[20].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[21].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 63
		rightBackWheelModel[21].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[22].addShapeBox(-3.5F, -7.5F, 0F, 1, 1, 1, 0F,1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F); // Box 64
		rightBackWheelModel[22].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[23].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 65
		rightBackWheelModel[23].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[24].addShapeBox(2.5F, -7.5F, 0F, 1, 1, 1, 0F,0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F); // Box 66
		rightBackWheelModel[24].setRotationPoint(-5.5F, 1.5F, -13F);

		rightBackWheelModel[25].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F); // Box 67
		rightBackWheelModel[25].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[26].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F); // Box 68
		rightBackWheelModel[26].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[27].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F); // Box 69
		rightBackWheelModel[27].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[28].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,5.95F, 3.8F, 0F, 6.4F, -3.95F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6F, 3.8F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F); // Box 70
		rightBackWheelModel[28].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[29].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.4F, 0F, 3.8F, 6F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F); // Box 71
		rightBackWheelModel[29].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[30].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F); // Box 72
		rightBackWheelModel[30].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[31].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.4F, 0F, 3.8F, 6F, 0F); // Box 73
		rightBackWheelModel[31].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[32].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6.4F, -3.95F, 0F, 5.95F, 3.8F, 0F); // Box 74
		rightBackWheelModel[32].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[33].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 75
		rightBackWheelModel[33].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[34].addShapeBox(6.5F, -3.5F, 0F, 1, 1, 1, 0F,1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F); // Box 76
		rightBackWheelModel[34].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[35].addShapeBox(4.5F, -6.5F, 0F, 1, 1, 1, 0F,-0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F); // Box 77
		rightBackWheelModel[35].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[36].addShapeBox(-5.5F, -6.5F, 0F, 1, 1, 1, 0F,1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F); // Box 78
		rightBackWheelModel[36].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[37].addShapeBox(-7.5F, -3.5F, 0F, 1, 1, 1, 0F,-0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F); // Box 79
		rightBackWheelModel[37].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[38].addShapeBox(-8.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 80
		rightBackWheelModel[38].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[39].addShapeBox(-7.5F, 2.5F, 0F, 1, 1, 1, 0F,1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F); // Box 81
		rightBackWheelModel[39].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[40].addShapeBox(-5.5F, 5.5F, 0F, 1, 1, 1, 0F,0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F); // Box 82
		rightBackWheelModel[40].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[41].addShapeBox(-3.5F, 6.5F, 0F, 1, 1, 1, 0F,0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F); // Box 83
		rightBackWheelModel[41].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[42].addShapeBox(-0.5F, 7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 84
		rightBackWheelModel[42].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[43].addShapeBox(2.5F, 6.5F, 0F, 1, 1, 1, 0F,1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F); // Box 85
		rightBackWheelModel[43].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[44].addShapeBox(4.5F, 5.5F, 0F, 1, 1, 1, 0F,1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F); // Box 86
		rightBackWheelModel[44].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[45].addShapeBox(6.5F, 2.5F, 0F, 1, 1, 1, 0F,-0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F); // Box 87
		rightBackWheelModel[45].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[46].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 88
		rightBackWheelModel[46].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[47].addShapeBox(-3.5F, -7.5F, 0F, 1, 1, 1, 0F,1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F); // Box 89
		rightBackWheelModel[47].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[48].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 90
		rightBackWheelModel[48].setRotationPoint(-38.5F, 1.5F, -13F);

		rightBackWheelModel[49].addShapeBox(2.5F, -7.5F, 0F, 1, 1, 1, 0F,0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F); // Box 91
		rightBackWheelModel[49].setRotationPoint(-38.5F, 1.5F, -13F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 0
		leftTrackModel[1] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1
		leftTrackModel[2] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 2
		leftTrackModel[3] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 3
		leftTrackModel[4] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 4
		leftTrackModel[5] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 5
		leftTrackModel[6] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 6
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		leftTrackModel[8] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 8
		leftTrackModel[9] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 20
		leftTrackModel[10] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 22
		leftTrackModel[11] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 23
		leftTrackModel[12] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 24
		leftTrackModel[13] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 25
		leftTrackModel[14] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 26
		leftTrackModel[15] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 27
		leftTrackModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 28
		leftTrackModel[17] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 29
		leftTrackModel[18] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 30
		leftTrackModel[19] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 47
		leftTrackModel[20] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 48
		leftTrackModel[21] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 49
		leftTrackModel[22] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 50
		leftTrackModel[23] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 9
		leftTrackModel[24] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 8
		leftTrackModel[25] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 9
		leftTrackModel[26] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 10
		leftTrackModel[27] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 11
		leftTrackModel[28] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 12
		leftTrackModel[29] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 13
		leftTrackModel[30] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 14
		leftTrackModel[31] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 0
		leftTrackModel[32] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 1
		leftTrackModel[33] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 2
		leftTrackModel[34] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 3
		leftTrackModel[35] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 4
		leftTrackModel[36] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 6
		leftTrackModel[37] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 8
		leftTrackModel[38] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 12
		leftTrackModel[39] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 13
		leftTrackModel[40] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 14
		leftTrackModel[41] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 15
		leftTrackModel[42] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 16
		leftTrackModel[43] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 17
		leftTrackModel[44] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 18
		leftTrackModel[45] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 19
		leftTrackModel[46] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 20
		leftTrackModel[47] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 21
		leftTrackModel[48] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 22
		leftTrackModel[49] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 23
		leftTrackModel[50] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 24
		leftTrackModel[51] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 25
		leftTrackModel[52] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 26
		leftTrackModel[53] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 27
		leftTrackModel[54] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 28
		leftTrackModel[55] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 29
		leftTrackModel[56] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 30
		leftTrackModel[57] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 31
		leftTrackModel[58] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 32
		leftTrackModel[59] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 33
		leftTrackModel[60] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 34
		leftTrackModel[61] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 35
		leftTrackModel[62] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 36
		leftTrackModel[63] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 37
		leftTrackModel[64] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 38
		leftTrackModel[65] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 39
		leftTrackModel[66] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 40
		leftTrackModel[67] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 41
		leftTrackModel[68] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 42
		leftTrackModel[69] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 43
		leftTrackModel[70] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 44
		leftTrackModel[71] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 45
		leftTrackModel[72] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 46
		leftTrackModel[73] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 47
		leftTrackModel[74] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 48
		leftTrackModel[75] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
		leftTrackModel[76] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 3
		leftTrackModel[77] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 6
		leftTrackModel[78] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 0
		leftTrackModel[79] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 1
		leftTrackModel[80] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 2
		leftTrackModel[81] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 3
		leftTrackModel[82] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 6
		leftTrackModel[83] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 7
		leftTrackModel[84] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 9
		leftTrackModel[85] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 10
		leftTrackModel[86] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 13
		leftTrackModel[87] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 14
		leftTrackModel[88] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 16
		leftTrackModel[89] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 17
		leftTrackModel[90] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 18
		leftTrackModel[91] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 19
		leftTrackModel[92] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 20
		leftTrackModel[93] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 21
		leftTrackModel[94] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 22
		leftTrackModel[95] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 23
		leftTrackModel[96] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 24
		leftTrackModel[97] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 25
		leftTrackModel[98] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 26
		leftTrackModel[99] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 27
		leftTrackModel[100] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 28
		leftTrackModel[101] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 29
		leftTrackModel[102] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 30
		leftTrackModel[103] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 34
		leftTrackModel[104] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 35
		leftTrackModel[105] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 36
		leftTrackModel[106] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 37
		leftTrackModel[107] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 38
		leftTrackModel[108] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 58
		leftTrackModel[109] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 59
		leftTrackModel[110] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 68
		leftTrackModel[111] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 69
		leftTrackModel[112] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 70
		leftTrackModel[113] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 71
		leftTrackModel[114] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 72
		leftTrackModel[115] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 73
		leftTrackModel[116] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 74
		leftTrackModel[117] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 79
		leftTrackModel[118] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 80
		leftTrackModel[119] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 81
		leftTrackModel[120] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 82
		leftTrackModel[121] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 83
		leftTrackModel[122] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 84
		leftTrackModel[123] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 85
		leftTrackModel[124] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 86
		leftTrackModel[125] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 87
		leftTrackModel[126] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 0
		leftTrackModel[127] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 0
		leftTrackModel[128] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 1
		leftTrackModel[129] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 2
		leftTrackModel[130] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 3
		leftTrackModel[131] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 4
		leftTrackModel[132] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 5
		leftTrackModel[133] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 6
		leftTrackModel[134] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 7
		leftTrackModel[135] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 8
		leftTrackModel[136] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 9
		leftTrackModel[137] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 10
		leftTrackModel[138] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 11
		leftTrackModel[139] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 12
		leftTrackModel[140] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 13
		leftTrackModel[141] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 14
		leftTrackModel[142] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 15
		leftTrackModel[143] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 16
		leftTrackModel[144] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 17
		leftTrackModel[145] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 18
		leftTrackModel[146] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 19
		leftTrackModel[147] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 20
		leftTrackModel[148] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 21
		leftTrackModel[149] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 22
		leftTrackModel[150] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 24
		leftTrackModel[151] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 25
		leftTrackModel[152] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 26
		leftTrackModel[153] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 27
		leftTrackModel[154] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 28
		leftTrackModel[155] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 29
		leftTrackModel[156] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 30
		leftTrackModel[157] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 31
		leftTrackModel[158] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 32
		leftTrackModel[159] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 33
		leftTrackModel[160] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 34
		leftTrackModel[161] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 35
		leftTrackModel[162] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 36
		leftTrackModel[163] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 37
		leftTrackModel[164] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 38
		leftTrackModel[165] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 39
		leftTrackModel[166] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 40
		leftTrackModel[167] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 41
		leftTrackModel[168] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 42
		leftTrackModel[169] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 43
		leftTrackModel[170] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 44
		leftTrackModel[171] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 45
		leftTrackModel[172] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 46
		leftTrackModel[173] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 47
		leftTrackModel[174] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 48
		leftTrackModel[175] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 49
		leftTrackModel[176] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 50
		leftTrackModel[177] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 51
		leftTrackModel[178] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 52
		leftTrackModel[179] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 53
		leftTrackModel[180] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 54
		leftTrackModel[181] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 55
		leftTrackModel[182] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 56
		leftTrackModel[183] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 57
		leftTrackModel[184] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 58
		leftTrackModel[185] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 59
		leftTrackModel[186] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 60
		leftTrackModel[187] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 61
		leftTrackModel[188] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 62
		leftTrackModel[189] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 63
		leftTrackModel[190] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 64
		leftTrackModel[191] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 65
		leftTrackModel[192] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 66
		leftTrackModel[193] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 67
		leftTrackModel[194] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 68
		leftTrackModel[195] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 69
		leftTrackModel[196] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 70
		leftTrackModel[197] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 71
		leftTrackModel[198] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 72
		leftTrackModel[199] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 73
		leftTrackModel[200] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 74
		leftTrackModel[201] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 75
		leftTrackModel[202] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 76
		leftTrackModel[203] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 77
		leftTrackModel[204] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 78
		leftTrackModel[205] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 79
		leftTrackModel[206] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 80
		leftTrackModel[207] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 81
		leftTrackModel[208] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 82
		leftTrackModel[209] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 83
		leftTrackModel[210] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 84
		leftTrackModel[211] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 85
		leftTrackModel[212] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 86
		leftTrackModel[213] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 87
		leftTrackModel[214] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 88
		leftTrackModel[215] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 89
		leftTrackModel[216] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 90
		leftTrackModel[217] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 91
		leftTrackModel[218] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 92
		leftTrackModel[219] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 93
		leftTrackModel[220] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 94
		leftTrackModel[221] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 95
		leftTrackModel[222] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 96
		leftTrackModel[223] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 97
		leftTrackModel[224] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 98
		leftTrackModel[225] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 99
		leftTrackModel[226] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 100
		leftTrackModel[227] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 101
		leftTrackModel[228] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 102
		leftTrackModel[229] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 103
		leftTrackModel[230] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 104
		leftTrackModel[231] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 105
		leftTrackModel[232] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 106
		leftTrackModel[233] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 107
		leftTrackModel[234] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 108
		leftTrackModel[235] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 109
		leftTrackModel[236] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 110
		leftTrackModel[237] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 111
		leftTrackModel[238] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 112
		leftTrackModel[239] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 113
		leftTrackModel[240] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 114
		leftTrackModel[241] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 115
		leftTrackModel[242] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 116
		leftTrackModel[243] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 117
		leftTrackModel[244] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 118
		leftTrackModel[245] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 119
		leftTrackModel[246] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 120
		leftTrackModel[247] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 121
		leftTrackModel[248] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 122
		leftTrackModel[249] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 123
		leftTrackModel[250] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 124
		leftTrackModel[251] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 125
		leftTrackModel[252] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 126
		leftTrackModel[253] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 127
		leftTrackModel[254] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 128
		leftTrackModel[255] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 129
		leftTrackModel[256] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 130
		leftTrackModel[257] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 131
		leftTrackModel[258] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 132
		leftTrackModel[259] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 133
		leftTrackModel[260] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 137
		leftTrackModel[261] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 138
		leftTrackModel[262] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 27
		leftTrackModel[263] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 28
		leftTrackModel[264] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 29
		leftTrackModel[265] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 30
		leftTrackModel[266] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 31
		leftTrackModel[267] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 32
		leftTrackModel[268] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 40
		leftTrackModel[269] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 45
		leftTrackModel[270] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 46
		leftTrackModel[271] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 47
		leftTrackModel[272] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 48
		leftTrackModel[273] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 49
		leftTrackModel[274] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 54
		leftTrackModel[275] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 75
		leftTrackModel[276] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 77
		leftTrackModel[277] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 0
		leftTrackModel[278] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 1
		leftTrackModel[279] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 2
		leftTrackModel[280] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 3
		leftTrackModel[281] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 4
		leftTrackModel[282] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 5
		leftTrackModel[283] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 6
		leftTrackModel[284] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 7
		leftTrackModel[285] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 8
		leftTrackModel[286] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 9
		leftTrackModel[287] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 10
		leftTrackModel[288] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 11
		leftTrackModel[289] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 12
		leftTrackModel[290] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 13
		leftTrackModel[291] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 14
		leftTrackModel[292] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 15
		leftTrackModel[293] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 16
		leftTrackModel[294] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 17
		leftTrackModel[295] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 18
		leftTrackModel[296] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 19
		leftTrackModel[297] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 20
		leftTrackModel[298] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 4
		leftTrackModel[299] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 5
		leftTrackModel[300] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 6
		leftTrackModel[301] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 7
		leftTrackModel[302] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 9
		leftTrackModel[303] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 10
		leftTrackModel[304] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 12
		leftTrackModel[305] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 13
		leftTrackModel[306] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 14
		leftTrackModel[307] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 15
		leftTrackModel[308] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 16
		leftTrackModel[309] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 17
		leftTrackModel[310] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 18
		leftTrackModel[311] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 23
		leftTrackModel[312] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 1
		leftTrackModel[313] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 2
		leftTrackModel[314] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 3
		leftTrackModel[315] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 4
		leftTrackModel[316] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 5
		leftTrackModel[317] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 6
		leftTrackModel[318] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 9
		leftTrackModel[319] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 10
		leftTrackModel[320] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 11
		leftTrackModel[321] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 14
		leftTrackModel[322] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 15
		leftTrackModel[323] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 0
		leftTrackModel[324] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 1
		leftTrackModel[325] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 2
		leftTrackModel[326] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 3
		leftTrackModel[327] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 4
		leftTrackModel[328] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 5
		leftTrackModel[329] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 6
		leftTrackModel[330] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 7
		leftTrackModel[331] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 8
		leftTrackModel[332] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 9
		leftTrackModel[333] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 10
		leftTrackModel[334] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 11
		leftTrackModel[335] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 22
		leftTrackModel[336] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 23
		leftTrackModel[337] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 24
		leftTrackModel[338] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 25
		leftTrackModel[339] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 92
		leftTrackModel[340] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 93
		leftTrackModel[341] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 94
		leftTrackModel[342] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 95
		leftTrackModel[343] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 96
		leftTrackModel[344] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 97
		leftTrackModel[345] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 98
		leftTrackModel[346] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 99
		leftTrackModel[347] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 100
		leftTrackModel[348] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 101
		leftTrackModel[349] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 102
		leftTrackModel[350] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 103
		leftTrackModel[351] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 104
		leftTrackModel[352] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 105
		leftTrackModel[353] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 106
		leftTrackModel[354] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 107
		leftTrackModel[355] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 108
		leftTrackModel[356] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 109
		leftTrackModel[357] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 110
		leftTrackModel[358] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 111
		leftTrackModel[359] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 112
		leftTrackModel[360] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 113
		leftTrackModel[361] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 114
		leftTrackModel[362] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 115
		leftTrackModel[363] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 116
		leftTrackModel[364] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 117
		leftTrackModel[365] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 118
		leftTrackModel[366] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 119
		leftTrackModel[367] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 120
		leftTrackModel[368] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 121
		leftTrackModel[369] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 122
		leftTrackModel[370] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 123
		leftTrackModel[371] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 124
		leftTrackModel[372] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 125
		leftTrackModel[373] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 126
		leftTrackModel[374] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 127
		leftTrackModel[375] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 128
		leftTrackModel[376] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 129
		leftTrackModel[377] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 130
		leftTrackModel[378] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 131
		leftTrackModel[379] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 132
		leftTrackModel[380] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 133
		leftTrackModel[381] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 134
		leftTrackModel[382] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 135
		leftTrackModel[383] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 136
		leftTrackModel[384] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 137
		leftTrackModel[385] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 138
		leftTrackModel[386] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 139
		leftTrackModel[387] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 140
		leftTrackModel[388] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 141
		leftTrackModel[389] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 142
		leftTrackModel[390] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 143
		leftTrackModel[391] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 144
		leftTrackModel[392] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 145
		leftTrackModel[393] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 146
		leftTrackModel[394] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 147
		leftTrackModel[395] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 148
		leftTrackModel[396] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 149
		leftTrackModel[397] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 150
		leftTrackModel[398] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 151
		leftTrackModel[399] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 152
		leftTrackModel[400] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 153
		leftTrackModel[401] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 154
		leftTrackModel[402] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 155
		leftTrackModel[403] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 156
		leftTrackModel[404] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 157
		leftTrackModel[405] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 158
		leftTrackModel[406] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 159
		leftTrackModel[407] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 160
		leftTrackModel[408] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 161
		leftTrackModel[409] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 162
		leftTrackModel[410] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 163
		leftTrackModel[411] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 164
		leftTrackModel[412] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 165
		leftTrackModel[413] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 166
		leftTrackModel[414] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 167
		leftTrackModel[415] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 168
		leftTrackModel[416] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 169
		leftTrackModel[417] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 170
		leftTrackModel[418] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 171
		leftTrackModel[419] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 172
		leftTrackModel[420] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 173
		leftTrackModel[421] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 174
		leftTrackModel[422] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 175
		leftTrackModel[423] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 176
		leftTrackModel[424] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 177
		leftTrackModel[425] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 178
		leftTrackModel[426] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 179
		leftTrackModel[427] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 180
		leftTrackModel[428] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 181
		leftTrackModel[429] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 182
		leftTrackModel[430] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 183
		leftTrackModel[431] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 184
		leftTrackModel[432] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 185
		leftTrackModel[433] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 186
		leftTrackModel[434] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 187
		leftTrackModel[435] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 188
		leftTrackModel[436] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 189
		leftTrackModel[437] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 190
		leftTrackModel[438] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 191
		leftTrackModel[439] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 192
		leftTrackModel[440] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 193
		leftTrackModel[441] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 194
		leftTrackModel[442] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 195
		leftTrackModel[443] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 196
		leftTrackModel[444] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 197
		leftTrackModel[445] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 198
		leftTrackModel[446] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 199
		leftTrackModel[447] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 200
		leftTrackModel[448] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 201
		leftTrackModel[449] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 202
		leftTrackModel[450] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 203
		leftTrackModel[451] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 204
		leftTrackModel[452] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 205
		leftTrackModel[453] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 206
		leftTrackModel[454] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 207
		leftTrackModel[455] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 208
		leftTrackModel[456] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 209
		leftTrackModel[457] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 210
		leftTrackModel[458] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 211
		leftTrackModel[459] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 212
		leftTrackModel[460] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 213
		leftTrackModel[461] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 214
		leftTrackModel[462] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 215
		leftTrackModel[463] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 216
		leftTrackModel[464] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 217
		leftTrackModel[465] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 218
		leftTrackModel[466] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 219
		leftTrackModel[467] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 220
		leftTrackModel[468] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 221
		leftTrackModel[469] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 222
		leftTrackModel[470] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 223
		leftTrackModel[471] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 224
		leftTrackModel[472] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 225
		leftTrackModel[473] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 226
		leftTrackModel[474] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 227
		leftTrackModel[475] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 228
		leftTrackModel[476] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 229
		leftTrackModel[477] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 230
		leftTrackModel[478] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 231
		leftTrackModel[479] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 232
		leftTrackModel[480] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 233
		leftTrackModel[481] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 234
		leftTrackModel[482] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 235
		leftTrackModel[483] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 236
		leftTrackModel[484] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 237
		leftTrackModel[485] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 238
		leftTrackModel[486] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 239
		leftTrackModel[487] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 240
		leftTrackModel[488] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 241
		leftTrackModel[489] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 242
		leftTrackModel[490] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 243
		leftTrackModel[491] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 244
		leftTrackModel[492] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 245
		leftTrackModel[493] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 246
		leftTrackModel[494] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 247
		leftTrackModel[495] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 248
		leftTrackModel[496] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 249
		leftTrackModel[497] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 250
		leftTrackModel[498] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 251
		leftTrackModel[499] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 252

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 0
		leftTrackModel[0].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[1].addShapeBox(4F, -1F, 0F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftTrackModel[1].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[2].addShapeBox(8F, -2F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 2
		leftTrackModel[2].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[3].addShapeBox(10F, 5F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 3
		leftTrackModel[3].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[4].addShapeBox(-10F, 0F, 0F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 4
		leftTrackModel[4].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[5].addShapeBox(-13F, -1F, 0F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 5
		leftTrackModel[5].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[6].addShapeBox(-16F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[6].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[7].addShapeBox(-18F, 5F, 0F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 7
		leftTrackModel[7].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[8].addShapeBox(-6F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 8
		leftTrackModel[8].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[9].addShapeBox(-2F, 3.5F, 1.5F, 3, 4, 1, 0F,.5F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.2F, -.2F, 0F, -.2F); // Box 20
		leftTrackModel[9].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[10].addShapeBox(-2.5F, 7.5F, 1.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 22
		leftTrackModel[10].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[11].addShapeBox(-3F, 9.5F, 1.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F); // Box 23
		leftTrackModel[11].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[12].addShapeBox(-3F, 10.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F, -.2F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 24
		leftTrackModel[12].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[13].addShapeBox(-2.5F, 11.5F, 1.5F, 2, 3, 1, 0F,.3F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 25
		leftTrackModel[13].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[14].addShapeBox(-2.5F, 14.5F, 1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 26
		leftTrackModel[14].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[15].addShapeBox(-2.5F, 16.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftTrackModel[15].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[16].addShapeBox(-1.5F, 18.5F, 1.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 28
		leftTrackModel[16].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[17].addShapeBox(-2.5F, 17.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 29
		leftTrackModel[17].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[18].addShapeBox(-1.5F, 19F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 30
		leftTrackModel[18].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[19].addShapeBox(10F, -4F, 0F, 3, 11, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		leftTrackModel[19].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[20].addShapeBox(13F, -5F, 0F, 3, 9, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		leftTrackModel[20].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[21].addShapeBox(16F, -6F, 0F, 3, 6, 1, 0F,0F, -.5F, 0F, 0F, -.1F, 0F, -.2F, -.15F, 0F, 0F, -.5F, 0F, 0F, 3F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, 3F, 0F); // Box 49
		leftTrackModel[21].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[22].addShapeBox(8F, -3F, 0F, 2, 9, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 50
		leftTrackModel[22].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[23].addShapeBox(-18F, 0F, 0F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 9
		leftTrackModel[23].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[24].addShapeBox(23.7F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.1F, -.7F, 0F, 0F, -.2F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .1F, 0F); // Box 8
		leftTrackModel[24].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[24].rotateAngleZ = -0.64577182F;

		leftTrackModel[25].addShapeBox(22.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F); // Box 9
		leftTrackModel[25].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[25].rotateAngleZ = -0.64577182F;

		leftTrackModel[26].addShapeBox(21.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftTrackModel[26].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[26].rotateAngleZ = -0.64577182F;

		leftTrackModel[27].addShapeBox(19.5F, -18F, 0F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 11
		leftTrackModel[27].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[27].rotateAngleZ = -0.64577182F;

		leftTrackModel[28].addShapeBox(17.5F, -18F, 0F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[28].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[28].rotateAngleZ = -0.64577182F;

		leftTrackModel[29].addShapeBox(15.5F, -19F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[29].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[29].rotateAngleZ = -0.64577182F;

		leftTrackModel[30].addShapeBox(13.5F, -19F, 0F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackModel[30].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[30].rotateAngleZ = -0.64577182F;

		leftTrackModel[31].addShapeBox(19.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 0
		leftTrackModel[31].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[31].rotateAngleZ = -0.64577182F;

		leftTrackModel[32].addShapeBox(21.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.5F, 0F); // Box 1
		leftTrackModel[32].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[32].rotateAngleZ = -0.64577182F;

		leftTrackModel[33].addShapeBox(22.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F); // Box 2
		leftTrackModel[33].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[33].rotateAngleZ = -0.64577182F;

		leftTrackModel[34].addShapeBox(17.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 3
		leftTrackModel[34].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[34].rotateAngleZ = -0.64577182F;

		leftTrackModel[35].addShapeBox(15.5F, -15F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 4
		leftTrackModel[35].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[35].rotateAngleZ = -0.64577182F;

		leftTrackModel[36].addShapeBox(23.7F, -15F, -0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, 0.1F, -.3F, 0F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, .2F, -0.2F, 0F); // Box 6
		leftTrackModel[36].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[36].rotateAngleZ = -0.64577182F;

		leftTrackModel[37].addShapeBox(11.5F, -18F, 0F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftTrackModel[37].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[37].rotateAngleZ = -0.64577182F;

		leftTrackModel[38].addShapeBox(10F, 2F, 1F, 3, 5, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[38].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[39].addShapeBox(13F, 1F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -.5F, 2F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 13
		leftTrackModel[39].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[40].addShapeBox(16F, -3F, 1F, 3, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 3F, 0F, 1F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 2F, 0F); // Box 14
		leftTrackModel[40].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[41].addShapeBox(8F, -3F, 1F, 2, 7, 1, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 2F); // Box 15
		leftTrackModel[41].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[42].addShapeBox(10F, -4F, 1F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2F, 0F, 0F, 2F); // Box 16
		leftTrackModel[42].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[43].addShapeBox(13F, -5F, 1F, 3, 6, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, .5F, 2F); // Box 17
		leftTrackModel[43].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[44].addShapeBox(16F, -6F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, -.2F, -.15F, 0F, -.5F, -.53F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F); // Box 18
		leftTrackModel[44].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[45].addShapeBox(11.5F, -18F, 1F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F); // Box 19
		leftTrackModel[45].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[45].rotateAngleZ = -0.64577182F;

		leftTrackModel[46].addShapeBox(11.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -1.3F, 0F); // Box 20
		leftTrackModel[46].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[46].rotateAngleZ = -0.64577182F;

		leftTrackModel[47].addShapeBox(13.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 1F, 0F, -.8F, 0F); // Box 21
		leftTrackModel[47].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[47].rotateAngleZ = -0.64577182F;

		leftTrackModel[48].addShapeBox(13.5F, -19F, 1F, 2, 4, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F); // Box 22
		leftTrackModel[48].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[48].rotateAngleZ = -0.64577182F;

		leftTrackModel[49].addShapeBox(15.5F, -19F, 1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 23
		leftTrackModel[49].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[49].rotateAngleZ = -0.64577182F;

		leftTrackModel[50].addShapeBox(15.5F, -15F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.7F, 0F, 0F, -.8F, 0F); // Box 24
		leftTrackModel[50].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[50].rotateAngleZ = -0.64577182F;

		leftTrackModel[51].addShapeBox(17.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.7F, 1F); // Box 25
		leftTrackModel[51].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[51].rotateAngleZ = -0.64577182F;

		leftTrackModel[52].addShapeBox(17.5F, -18F, 1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F); // Box 26
		leftTrackModel[52].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[52].rotateAngleZ = -0.64577182F;

		leftTrackModel[53].addShapeBox(19.5F, -18F, 1F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, .5F, 0F, -1.5F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F); // Box 27
		leftTrackModel[53].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[53].rotateAngleZ = -0.64577182F;

		leftTrackModel[54].addShapeBox(19.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.8F, -.5F, 0F, -.5F, 0F); // Box 28
		leftTrackModel[54].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[54].rotateAngleZ = -0.64577182F;

		leftTrackModel[55].addShapeBox(-3F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 29
		leftTrackModel[55].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[56].addShapeBox(-3F, 5F, 2F, 3, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 30
		leftTrackModel[56].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[57].addShapeBox(-6F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 31
		leftTrackModel[57].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[58].addShapeBox(-6F, 5F, 2F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 32
		leftTrackModel[58].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[59].addShapeBox(-13F, -1F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 33
		leftTrackModel[59].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[60].addShapeBox(-10F, 0F, 2F, 4, 5, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 34
		leftTrackModel[60].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[61].addShapeBox(-16F, 0F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		leftTrackModel[61].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[62].addShapeBox(-18F, 0F, 2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -3F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 36
		leftTrackModel[62].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[63].addShapeBox(-18F, 5F, 2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, -1F, -4F, -.7F); // Box 37
		leftTrackModel[63].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[64].addShapeBox(-16F, 5F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -.5F); // Box 38
		leftTrackModel[64].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[65].addShapeBox(-13F, 5F, 2F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -4F, .5F, 0F, -3F, 0F); // Box 39
		leftTrackModel[65].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[66].addShapeBox(-10F, 5F, 2F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -3F, -.5F); // Box 40
		leftTrackModel[66].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[67].addShapeBox(0F, 5F, 2F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F); // Box 41
		leftTrackModel[67].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[68].addShapeBox(4F, 5F, 2F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 1F); // Box 42
		leftTrackModel[68].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[69].addShapeBox(0F, 0F, 2F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 43
		leftTrackModel[69].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[70].addShapeBox(4F, -1F, 2F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 44
		leftTrackModel[70].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[71].addShapeBox(8F, 5F, 2F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, 0F); // Box 45
		leftTrackModel[71].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[72].addShapeBox(10F, 5F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, .5F, -2F, 0F, -.5F, -5F, 0F, 0F, -3.5F, 0F); // Box 46
		leftTrackModel[72].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[73].addShapeBox(10F, -1F, 2F, 2, 6, 2, 0F,0F, 0F, 0F, .5F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 47
		leftTrackModel[73].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[74].addShapeBox(8F, -2F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F); // Box 48
		leftTrackModel[74].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[75].addShapeBox(21.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.8F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftTrackModel[75].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[75].rotateAngleZ = -0.64577182F;

		leftTrackModel[76].addShapeBox(21.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 3
		leftTrackModel[76].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[76].rotateAngleZ = -0.64577182F;

		leftTrackModel[77].addShapeBox(20F, -8F, -1F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 6
		leftTrackModel[77].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[77].rotateAngleX = -0.34906585F;
		leftTrackModel[77].rotateAngleY = 0.03490659F;

		leftTrackModel[78].addShapeBox(22.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.5F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, .3F, 0F, 0F, 0F); // Box 0
		leftTrackModel[78].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[78].rotateAngleZ = -0.64577182F;

		leftTrackModel[79].addShapeBox(22.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.7F, 0F, 0F, -.8F, 0F); // Box 1
		leftTrackModel[79].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[79].rotateAngleZ = -0.64577182F;

		leftTrackModel[80].addShapeBox(23.7F, -15F, 0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, -.35F, -.3F, -.3F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -.5F, -1F, -.5F, .2F, -.7F, 0F); // Box 2
		leftTrackModel[80].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[80].rotateAngleZ = -0.64577182F;

		leftTrackModel[81].addShapeBox(23.7F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.5F, -1F, -.5F, 0F, -.5F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, -.2F, .2F, -.2F, .2F, .1F, .3F); // Box 3
		leftTrackModel[81].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[81].rotateAngleZ = -0.64577182F;

		leftTrackModel[82].addShapeBox(20F, -8F, -2F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[82].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[82].rotateAngleX = -0.34906585F;
		leftTrackModel[82].rotateAngleY = 0.03490659F;

		leftTrackModel[83].addShapeBox(-18F, 0F, -1F, 2, 2, 2, 0F,0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 7
		leftTrackModel[83].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[84].addShapeBox(-14.5F, -13.5F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 9
		leftTrackModel[84].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[84].rotateAngleZ = 0.85521133F;

		leftTrackModel[85].addShapeBox(-13.3F, -18.5F, -2F, 4, 4, 4, 0F,0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F); // Box 10
		leftTrackModel[85].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[85].rotateAngleZ = 1.18682389F;

		leftTrackModel[86].addShapeBox(-13.6F, -20.2F, -2F, 3, 4, 4, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 13
		leftTrackModel[86].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[86].rotateAngleZ = 1.32645023F;

		leftTrackModel[87].addShapeBox(-15.6F, -21.9F, -2F, 5, 4, 4, 0F,0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F); // Box 14
		leftTrackModel[87].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[87].rotateAngleZ = 1.46607657F;

		leftTrackModel[88].addShapeBox(1.5F, -3.5F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		leftTrackModel[88].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[89].addShapeBox(2.5F, -2.5F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 17
		leftTrackModel[89].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[90].addShapeBox(-1.5F, -3.5F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -.5F, 0F, 1F, -.5F, 0F, 1F, 0F, 2F, 0F, 0F); // Box 18
		leftTrackModel[90].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[91].addShapeBox(-3.5F, -3.5F, 0F, 2, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .5F, -1F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, .5F, -1F, 0F); // Box 19
		leftTrackModel[91].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[92].addShapeBox(-4.5F, -2.5F, 0F, 1, 8, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -4F, 0F, 0F, -2F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, .2F, -2F, 0F); // Box 20
		leftTrackModel[92].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[93].addShapeBox(-4.5F, -2.5F, 0F, 1, 5, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 21
		leftTrackModel[93].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[94].addShapeBox(-3.5F, -3.5F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, -.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 22
		leftTrackModel[94].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[95].addShapeBox(-1.5F, -3.5F, 0F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 23
		leftTrackModel[95].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[96].addShapeBox(1.5F, -3.5F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 24
		leftTrackModel[96].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[97].addShapeBox(2.5F, -2.5F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		leftTrackModel[97].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[98].addShapeBox(1.5F, -3.5F, 2F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F); // Box 26
		leftTrackModel[98].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[99].addShapeBox(2.5F, -2.5F, 2F, 1, 9, 1, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -.5F); // Box 27
		leftTrackModel[99].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[100].addShapeBox(-1.5F, -3.5F, 2F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.3F, 0F, 0F, -3.5F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -.5F, 2F, 0F, -.5F); // Box 28
		leftTrackModel[100].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[101].addShapeBox(-3.5F, -3.5F, 2F, 2, 10, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, .5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -.5F, .5F, -1F, -.5F); // Box 29
		leftTrackModel[101].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[102].addShapeBox(-4.5F, -2.5F, 2F, 1, 8, 1, 0F,.5F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, .5F, -4F, -1F, .2F, -2F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, .2F, -2F, -1F); // Box 30
		leftTrackModel[102].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[103].addShapeBox(1.5F, -3.5F, 2F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -2.8F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F); // Box 34
		leftTrackModel[103].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[104].addShapeBox(2.5F, -2.5F, 2F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 1F, -1.8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -.5F); // Box 35
		leftTrackModel[104].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[105].addShapeBox(-3.5F, -3.5F, 2F, 2, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -.5F, 0F, -1F, -.5F); // Box 36
		leftTrackModel[105].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[106].addShapeBox(-4.5F, -2.5F, 2F, 1, 5, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2F, -1F); // Box 37
		leftTrackModel[106].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[107].addShapeBox(-1.5F, -3.5F, 2F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 1F, -.5F); // Box 38
		leftTrackModel[107].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[108].addShapeBox(-1.5F, 18.5F, 0.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		leftTrackModel[108].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[109].addShapeBox(-2.5F, 17.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 59
		leftTrackModel[109].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[110].addShapeBox(-2F, 3.5F, 0.5F, 3, 4, 1, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 68
		leftTrackModel[110].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[111].addShapeBox(-2.5F, 7.5F, 0.5F, 3, 2, 1, 0F,-0.7F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftTrackModel[111].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[112].addShapeBox(-2.5F, 11.5F, 0.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftTrackModel[112].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[113].addShapeBox(-2.5F, 14.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftTrackModel[113].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[114].addShapeBox(-2.5F, 16.5F, 0.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftTrackModel[114].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[115].addShapeBox(-3F, 10.5F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F); // Box 73
		leftTrackModel[115].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[116].addShapeBox(-3F, 9.5F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftTrackModel[116].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[117].addShapeBox(-4.5F, 22F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 79
		leftTrackModel[117].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[118].addShapeBox(-4.5F, 21.5F, 1.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 80
		leftTrackModel[118].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[119].addShapeBox(-5.5F, 20.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 81
		leftTrackModel[119].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[120].addShapeBox(-5.5F, 19.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 82
		leftTrackModel[120].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[121].addShapeBox(-1.5F, 19F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 83
		leftTrackModel[121].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[122].addShapeBox(-5.5F, 14.5F, 1.5F, 2, 5, 1, 0F,.2F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 84
		leftTrackModel[122].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[123].addShapeBox(-5.5F, 11.5F, 1.5F, 3, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -.2F, -.4F, 0F, .2F, .2F, 0F, 0F, -.5F, 0F, 0F, -1.1F, 0F, -.2F, -.3F, 0F, -.2F); // Box 85
		leftTrackModel[123].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[124].addShapeBox(-4.5F, 10.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, -.4F, 0F, -.2F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.2F, 0F, -.2F, .6F, 0F, .2F); // Box 86
		leftTrackModel[124].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[125].addShapeBox(-3.5F, 6.5F, 1.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.3F, 0F, -.2F, .6F, 0F, -.2F); // Box 87
		leftTrackModel[125].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[126].addShapeBox(-27.89F, -15.79F, 0F, 7, 4, 2, 0F,2F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, .5F, -.5F, -.5F, .5F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -.5F, -.5F, -.5F); // Box 0
		leftTrackModel[126].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[126].rotateAngleZ = 1.13446401F;

		leftTrackModel[127].addShapeBox(-4.5F, 22F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		leftTrackModel[127].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[128].addShapeBox(-4.5F, 21.5F, 0.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1
		leftTrackModel[128].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[129].addShapeBox(-5.5F, 20.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 2
		leftTrackModel[129].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[130].addShapeBox(-5.5F, 19.5F, 0.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftTrackModel[130].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[131].addShapeBox(-5.5F, 14.5F, 0.5F, 2, 5, 1, 0F,-0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftTrackModel[131].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[132].addShapeBox(-5.5F, 11.5F, 0.5F, 3, 3, 1, 0F,-0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 5
		leftTrackModel[132].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[133].addShapeBox(-4.5F, 10.5F, 0.5F, 3, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 6
		leftTrackModel[133].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[134].addShapeBox(-3.5F, 6.5F, 0.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 7
		leftTrackModel[134].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[135].addShapeBox(-27.89F, -15.79F, -2F, 7, 4, 2, 0F,0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 2F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 8
		leftTrackModel[135].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[135].rotateAngleZ = 1.13446401F;

		leftTrackModel[136].addShapeBox(-18F, 0F, -2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 9
		leftTrackModel[136].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[137].addShapeBox(-18F, 5F, -2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 10
		leftTrackModel[137].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[138].addShapeBox(-16F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 11
		leftTrackModel[138].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[139].addShapeBox(-13F, -1F, -2F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[139].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[140].addShapeBox(-10F, 0F, -2F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 13
		leftTrackModel[140].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[141].addShapeBox(-6F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackModel[141].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[142].addShapeBox(-3F, 0F, -2F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 15
		leftTrackModel[142].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[143].addShapeBox(0F, 0F, -2F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 16
		leftTrackModel[143].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[144].addShapeBox(4F, -1F, -2F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftTrackModel[144].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[145].addShapeBox(8F, -2F, -2F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 18
		leftTrackModel[145].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[146].addShapeBox(10F, 5F, -2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 19
		leftTrackModel[146].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[147].addShapeBox(10F, -4F, -1F, 3, 11, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 20
		leftTrackModel[147].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[148].addShapeBox(13F, -5F, -1F, 3, 9, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 21
		leftTrackModel[148].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[149].addShapeBox(16F, -6F, -1F, 3, 6, 1, 0F,0F, -0.5F, 0F, -0.2F, -0.15F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 22
		leftTrackModel[149].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[150].addShapeBox(8F, -3F, -1F, 2, 9, 1, 0F,0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 24
		leftTrackModel[150].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[151].addShapeBox(16F, -6F, -2F, 3, 3, 1, 0F,0F, -1.5F, 0F, -0.5F, -0.53F, 0F, -0.2F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 25
		leftTrackModel[151].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[152].addShapeBox(16F, -3F, -2F, 3, 3, 1, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0.5F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 26
		leftTrackModel[152].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[153].addShapeBox(13F, -5F, -2F, 3, 6, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 27
		leftTrackModel[153].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[154].addShapeBox(13F, 1F, -2F, 3, 3, 1, 0F,0F, -0.5F, 2F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 28
		leftTrackModel[154].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[155].addShapeBox(10F, -4F, -2F, 3, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 29
		leftTrackModel[155].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[156].addShapeBox(10F, 2F, -2F, 3, 5, 1, 0F,0F, -1F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		leftTrackModel[156].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[157].addShapeBox(8F, -3F, -2F, 2, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 31
		leftTrackModel[157].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[158].addShapeBox(11.5F, -18F, -1F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		leftTrackModel[158].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[158].rotateAngleZ = -0.64577182F;

		leftTrackModel[159].addShapeBox(13.5F, -19F, -1F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		leftTrackModel[159].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[159].rotateAngleZ = -0.64577182F;

		leftTrackModel[160].addShapeBox(15.5F, -19F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackModel[160].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[160].rotateAngleZ = -0.64577182F;

		leftTrackModel[161].addShapeBox(15.5F, -15F, -1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 35
		leftTrackModel[161].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[161].rotateAngleZ = -0.64577182F;

		leftTrackModel[162].addShapeBox(17.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 36
		leftTrackModel[162].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[162].rotateAngleZ = -0.64577182F;

		leftTrackModel[163].addShapeBox(17.5F, -18F, -1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftTrackModel[163].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[163].rotateAngleZ = -0.64577182F;

		leftTrackModel[164].addShapeBox(19.5F, -18F, -1F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftTrackModel[164].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[164].rotateAngleZ = -0.64577182F;

		leftTrackModel[165].addShapeBox(19.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 39
		leftTrackModel[165].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[165].rotateAngleZ = -0.64577182F;

		leftTrackModel[166].addShapeBox(20F, -8.5F, -0.5F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 40
		leftTrackModel[166].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[166].rotateAngleX = 0.34906585F;
		leftTrackModel[166].rotateAngleY = 0.03490659F;

		leftTrackModel[167].addShapeBox(20F, -8.5F, -1.5F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackModel[167].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[167].rotateAngleX = 0.34906585F;
		leftTrackModel[167].rotateAngleY = 0.03490659F;

		leftTrackModel[168].addShapeBox(11.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F); // Box 42
		leftTrackModel[168].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[168].rotateAngleZ = -0.64577182F;

		leftTrackModel[169].addShapeBox(11.5F, -18F, -2F, 2, 3, 1, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftTrackModel[169].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[169].rotateAngleZ = -0.64577182F;

		leftTrackModel[170].addShapeBox(13.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftTrackModel[170].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[170].rotateAngleZ = -0.64577182F;

		leftTrackModel[171].addShapeBox(13.5F, -19F, -2F, 2, 4, 1, 0F,0F, -1.5F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftTrackModel[171].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[171].rotateAngleZ = -0.64577182F;

		leftTrackModel[172].addShapeBox(15.5F, -19F, -3F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackModel[172].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[172].rotateAngleZ = -0.64577182F;

		leftTrackModel[173].addShapeBox(15.5F, -15F, -3F, 2, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.7F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 47
		leftTrackModel[173].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[173].rotateAngleZ = -0.64577182F;

		leftTrackModel[174].addShapeBox(17.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F); // Box 48
		leftTrackModel[174].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[174].rotateAngleZ = -0.64577182F;

		leftTrackModel[175].addShapeBox(17.5F, -18F, -2F, 2, 3, 1, 0F,0F, -0.5F, 1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftTrackModel[175].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[175].rotateAngleZ = -0.64577182F;

		leftTrackModel[176].addShapeBox(19.5F, -18F, -2F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 50
		leftTrackModel[176].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[176].rotateAngleZ = -0.64577182F;

		leftTrackModel[177].addShapeBox(19.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 51
		leftTrackModel[177].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[177].rotateAngleZ = -0.64577182F;

		leftTrackModel[178].addShapeBox(21.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftTrackModel[178].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[178].rotateAngleZ = -0.64577182F;

		leftTrackModel[179].addShapeBox(21.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F); // Box 53
		leftTrackModel[179].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[179].rotateAngleZ = -0.64577182F;

		leftTrackModel[180].addShapeBox(22.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F); // Box 54
		leftTrackModel[180].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[180].rotateAngleZ = -0.64577182F;

		leftTrackModel[181].addShapeBox(22.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.8F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 55
		leftTrackModel[181].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[181].rotateAngleZ = -0.64577182F;

		leftTrackModel[182].addShapeBox(23.7F, -15F, -1.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, -0.35F, -0.3F, -0.3F, 0.1F, -0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.7F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0.2F, -0.2F, 0F); // Box 56
		leftTrackModel[182].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[182].rotateAngleZ = -0.64577182F;

		leftTrackModel[183].addShapeBox(23.7F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0F, -0.2F, 0F, 0.2F, 0.1F, 0.3F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F); // Box 57
		leftTrackModel[183].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[183].rotateAngleZ = -0.64577182F;

		leftTrackModel[184].addShapeBox(10F, -1F, -4F, 2, 6, 2, 0F,0F, -3F, 0F, -1F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftTrackModel[184].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[185].addShapeBox(8F, -2F, -4F, 2, 7, 2, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftTrackModel[185].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[186].addShapeBox(4F, -1F, -4F, 4, 6, 2, 0F,0F, -2F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftTrackModel[186].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[187].addShapeBox(0F, 0F, -5F, 4, 5, 3, 0F,0F, -2F, 1F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftTrackModel[187].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[188].addShapeBox(-3F, 0F, -6F, 3, 5, 4, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftTrackModel[188].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[189].addShapeBox(-6F, 0F, -6F, 3, 5, 4, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		leftTrackModel[189].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[190].addShapeBox(-10F, 0F, -5F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftTrackModel[190].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[191].addShapeBox(-13F, -1F, -4F, 3, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		leftTrackModel[191].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[192].addShapeBox(-16F, 0F, -4F, 3, 5, 2, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftTrackModel[192].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[193].addShapeBox(-18F, 0F, -4F, 2, 5, 2, 0F,-1F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 67
		leftTrackModel[193].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[194].addShapeBox(10F, 5F, -4F, 2, 7, 2, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 68
		leftTrackModel[194].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[195].addShapeBox(8F, 5F, -4F, 2, 8, 2, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 69
		leftTrackModel[195].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[196].addShapeBox(4F, 5F, -4F, 4, 8, 2, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftTrackModel[196].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[197].addShapeBox(0F, 5F, -5F, 4, 8, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 71
		leftTrackModel[197].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[198].addShapeBox(-3F, 5F, -6F, 3, 7, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F); // Box 72
		leftTrackModel[198].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[199].addShapeBox(-6F, 5F, -6F, 3, 6, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 73
		leftTrackModel[199].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[200].addShapeBox(-10F, 5F, -5F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 74
		leftTrackModel[200].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[201].addShapeBox(-13F, 5F, -4F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 75
		leftTrackModel[201].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[202].addShapeBox(-16F, 5F, -4F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 76
		leftTrackModel[202].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[203].addShapeBox(-18F, 5F, -4F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -4F, -0.7F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 77
		leftTrackModel[203].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[204].addShapeBox(-1.5F, -3.5F, -6F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 1F, -0.5F); // Box 78
		leftTrackModel[204].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[205].addShapeBox(1.5F, -3.5F, -6F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F); // Box 79
		leftTrackModel[205].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[206].addShapeBox(2.5F, -2.5F, -6F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 80
		leftTrackModel[206].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[207].addShapeBox(-3.5F, -3.5F, -6F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -0.5F, 0F, -1F, 0F); // Box 81
		leftTrackModel[207].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[208].addShapeBox(-4.5F, -2.5F, -6F, 1, 5, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 82
		leftTrackModel[208].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[209].addShapeBox(-3.5F, -3.5F, -7F, 2, 7, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 83
		leftTrackModel[209].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[210].addShapeBox(-4.5F, -2.5F, -7F, 1, 5, 1, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 84
		leftTrackModel[210].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[211].addShapeBox(2.5F, -2.5F, -7F, 1, 5, 1, 0F,1F, -1.8F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 85
		leftTrackModel[211].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[212].addShapeBox(1.5F, -3.5F, -7F, 1, 7, 1, 0F,1F, -2.5F, 0F, -1F, -2.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 86
		leftTrackModel[212].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[213].addShapeBox(-1.5F, -3.5F, -7F, 3, 7, 1, 0F,0F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 87
		leftTrackModel[213].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[214].addShapeBox(-1.5F, 19F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 88
		leftTrackModel[214].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[215].addShapeBox(-1.5F, 19F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 89
		leftTrackModel[215].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[216].addShapeBox(-1.5F, 18.5F, -6.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		leftTrackModel[216].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[217].addShapeBox(-1.5F, 18.5F, -5.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 91
		leftTrackModel[217].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[218].addShapeBox(-2.5F, 17.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 92
		leftTrackModel[218].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[219].addShapeBox(-2.5F, 17.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 93
		leftTrackModel[219].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[220].addShapeBox(-2.5F, 16.5F, -6.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftTrackModel[220].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[221].addShapeBox(-2.5F, 16.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftTrackModel[221].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[222].addShapeBox(-2.5F, 14.5F, -5.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 96
		leftTrackModel[222].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[223].addShapeBox(-2.5F, 14.5F, -6.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftTrackModel[223].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[224].addShapeBox(-2.5F, 11.5F, -6.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		leftTrackModel[224].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[225].addShapeBox(-2.5F, 11.5F, -5.5F, 2, 3, 1, 0F,.3F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 99
		leftTrackModel[225].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[226].addShapeBox(-3F, 10.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F, -.2F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 100
		leftTrackModel[226].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[227].addShapeBox(-3F, 10.5F, -6.5F, 3, 1, 1, 0F,-1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F); // Box 101
		leftTrackModel[227].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[228].addShapeBox(-3F, 9.5F, -6.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		leftTrackModel[228].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[229].addShapeBox(-3F, 9.5F, -5.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F); // Box 103
		leftTrackModel[229].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[230].addShapeBox(-2.5F, 7.5F, -6.5F, 3, 2, 1, 0F,-0.7F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftTrackModel[230].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[231].addShapeBox(-2.5F, 7.5F, -5.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 105
		leftTrackModel[231].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[232].addShapeBox(-2F, 3.5F, -5.5F, 3, 4, 1, 0F,.5F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.2F, -.2F, 0F, -.2F); // Box 106
		leftTrackModel[232].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[233].addShapeBox(-2F, 3.5F, -6.5F, 3, 4, 1, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 107
		leftTrackModel[233].setRotationPoint(45F, -10F, 2F);

		leftTrackModel[234].addShapeBox(2.5F, -2.5F, -6F, 1, 9, 2, 0F,0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F); // Box 108
		leftTrackModel[234].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[235].addShapeBox(1.5F, -3.5F, -6F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 109
		leftTrackModel[235].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[236].addShapeBox(-1.5F, -3.5F, -6F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 2F, 0F, -0.5F); // Box 110
		leftTrackModel[236].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[237].addShapeBox(-3.5F, -3.5F, -6F, 2, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0.5F, -1F, -0.5F); // Box 111
		leftTrackModel[237].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[238].addShapeBox(-4.5F, -2.5F, -6F, 1, 8, 2, 0F,0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.2F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F); // Box 112
		leftTrackModel[238].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[239].addShapeBox(2.5F, -2.5F, -7F, 1, 9, 1, 0F,0F, -2.5F, 0F, 0.5F, -3F, -1F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 113
		leftTrackModel[239].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[240].addShapeBox(1.5F, -3.5F, -7F, 1, 11, 1, 0F,0F, -3.3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackModel[240].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[241].addShapeBox(-1.5F, -3.5F, -7F, 3, 10, 1, 0F,0F, -3.5F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 2F, 0F, 0F); // Box 115
		leftTrackModel[241].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[242].addShapeBox(-3.5F, -3.5F, -7F, 2, 10, 1, 0F,0F, -4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, -1F, 0F); // Box 116
		leftTrackModel[242].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[243].addShapeBox(-4.5F, -2.5F, -7F, 1, 8, 1, 0F,0.5F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.2F, -2F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.2F, -2F, 0F); // Box 117
		leftTrackModel[243].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[244].addShapeBox(-3.5F, 6.5F, -6.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 118
		leftTrackModel[244].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[245].addShapeBox(-3.5F, 6.5F, -5.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.3F, 0F, -.2F, .6F, 0F, -.2F); // Box 119
		leftTrackModel[245].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[246].addShapeBox(-4.5F, 10.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, -.4F, 0F, -.2F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.2F, 0F, -.2F, .6F, 0F, .2F); // Box 120
		leftTrackModel[246].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[247].addShapeBox(-4.5F, 10.5F, -6.5F, 3, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 121
		leftTrackModel[247].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[248].addShapeBox(-5.5F, 11.5F, -6.5F, 3, 3, 1, 0F,-0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 122
		leftTrackModel[248].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[249].addShapeBox(-5.5F, 11.5F, -5.5F, 3, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -.2F, -.4F, 0F, .2F, .2F, 0F, 0F, -.5F, 0F, 0F, -1.1F, 0F, -.2F, -.3F, 0F, -.2F); // Box 123
		leftTrackModel[249].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[250].addShapeBox(-5.5F, 14.5F, -5.5F, 2, 5, 1, 0F,.2F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 124
		leftTrackModel[250].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[251].addShapeBox(-5.5F, 14.5F, -6.5F, 2, 5, 1, 0F,-0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftTrackModel[251].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[252].addShapeBox(-5.5F, 19.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftTrackModel[252].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[253].addShapeBox(-5.5F, 19.5F, -6.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackModel[253].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[254].addShapeBox(-5.5F, 20.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 128
		leftTrackModel[254].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[255].addShapeBox(-5.5F, 20.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 129
		leftTrackModel[255].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[256].addShapeBox(-4.5F, 21.5F, -5.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 130
		leftTrackModel[256].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[257].addShapeBox(-4.5F, 21.5F, -6.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		leftTrackModel[257].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[258].addShapeBox(-4.5F, 22F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 132
		leftTrackModel[258].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[259].addShapeBox(-4.5F, 22F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 133
		leftTrackModel[259].setRotationPoint(23F, -13F, 2F);

		leftTrackModel[260].addShapeBox(11F, -24F, 3F, 15, 15, 1, 0F,-6.5F, -6.5F, 0F, -6.5F, -7F, 1F, -6.5F, -7F, -1.97F, -6.5F, -6.5F, -0.95F, -6.5F, -6.5F, 0F, -6.5F, -6F, 1F, -6.5F, -6F, -1.65F, -6.5F, -6.5F, -0.95F); // Box 137
		leftTrackModel[260].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[260].rotateAngleZ = -0.64577182F;

		leftTrackModel[261].addShapeBox(11F, -24F, -4F, 15, 15, 1, 0F,-6.5F, -6.5F, -0.95F, -6.5F, -7F, -1.97F, -6.5F, -7F, 1F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, -0.95F, -6.5F, -6F, -1.65F, -6.5F, -6F, 1F, -6.5F, -6.5F, 0F); // Box 138
		leftTrackModel[261].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[261].rotateAngleZ = -0.64577182F;

		leftTrackModel[262].addShapeBox(21F, -16F, -1.5F, 1, 1, 3, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F); // Box 27
		leftTrackModel[262].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[262].rotateAngleZ = -0.64577182F;

		leftTrackModel[263].addShapeBox(21F, -17F, 0F, 1, 1, 1, 0F,0F, .4F, 0F, 0F, .2F, 0F, 0F, -.4F, .5F, 0F, -.2F, .7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F); // Box 28
		leftTrackModel[263].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[263].rotateAngleZ = -0.64577182F;

		leftTrackModel[264].addShapeBox(21F, -15F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F); // Box 29
		leftTrackModel[264].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[264].rotateAngleZ = -0.64577182F;

		leftTrackModel[265].addShapeBox(21F, -17F, -1F, 1, 1, 1, 0F,0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftTrackModel[265].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[265].rotateAngleZ = -0.64577182F;

		leftTrackModel[266].addShapeBox(21F, -14.3F, -1F, 1, 1, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F); // Box 31
		leftTrackModel[266].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[266].rotateAngleZ = -0.64577182F;

		leftTrackModel[267].addShapeBox(21F, -14.3F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0.7F); // Box 32
		leftTrackModel[267].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[267].rotateAngleZ = -0.64577182F;

		leftTrackModel[268].addShapeBox(19.5F, -15.5F, -2F, 2, 1, 4, 0F,0F, 0F, .3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, .3F, 0F, -.5F, .4F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, .4F); // Box 40
		leftTrackModel[268].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[268].rotateAngleZ = -0.64577182F;

		leftTrackModel[269].addShapeBox(17.5F, -15.5F, -3F, 2, 1, 6, 0F,0F, 0F, .2F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, .2F, 0F, -.5F, .4F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, .4F); // Box 45
		leftTrackModel[269].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[269].rotateAngleZ = -0.64577182F;

		leftTrackModel[270].addShapeBox(15.5F, -15.5F, -3.5F, 2, 1, 7, 0F,0F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F); // Box 46
		leftTrackModel[270].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[270].rotateAngleZ = -0.64577182F;

		leftTrackModel[271].addShapeBox(13.5F, -16F, -3.5F, 2, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F); // Box 47
		leftTrackModel[271].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[271].rotateAngleZ = -0.64577182F;

		leftTrackModel[272].addShapeBox(11.5F, -16F, -2.5F, 2, 1, 5, 0F,.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -.5F, .6F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, .6F, -.5F, -.5F); // Box 48
		leftTrackModel[272].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[272].rotateAngleZ = -0.64577182F;

		leftTrackModel[273].addShapeBox(14.5F, -18F, -3.5F, 1, 2, 7, 0F,-.5F, 0F, -.6F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.6F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.25F); // Box 49
		leftTrackModel[273].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[273].rotateAngleZ = -0.64577182F;

		leftTrackModel[274].addShapeBox(14.5F, -19F, -3F, 1, 1, 6, 0F,-.5F, .1F, -2F, 0F, .1F, -2F, 0F, .1F, -2F, -.5F, .1F, -2F, -.5F, 0F, -.1F, 0F, 0F, .2F, 0F, 0F, .2F, -.5F, 0F, -.1F); // Box 54
		leftTrackModel[274].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[274].rotateAngleZ = -0.64577182F;

		leftTrackModel[275].addShapeBox(25F, 2.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F); // Box 75
		leftTrackModel[275].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[276].addShapeBox(25F, 3.5F, 1.5F, 1, 2, 1, 0F,0F, .5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, .5F, -.2F, 2F, -.5F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 2F, -.5F, 1F); // Box 77
		leftTrackModel[276].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[277].addShapeBox(23F, 5.5F, 2.5F, 1, 3, 1, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 5F, -1F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, 2.5F, 5F, -1F, 2.5F); // Box 0
		leftTrackModel[277].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[278].addShapeBox(13F, 7.5F, 5F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1
		leftTrackModel[278].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[279].addShapeBox(8F, 6.5F, 6.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, .5F, 4F, -1F, .5F, 4F, -1F, -.5F, -5F, 0F, -.5F); // Box 2
		leftTrackModel[279].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[280].addShapeBox(6F, 3.5F, 6.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 3
		leftTrackModel[280].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[281].addShapeBox(6F, -0.5F, 6.5F, 1, 4, 1, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 4
		leftTrackModel[281].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[282].addShapeBox(6F, -3.5F, 6.5F, 1, 3, 1, 0F,0F, -.3F, 2F, 0F, -.3F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftTrackModel[282].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[283].addShapeBox(6F, -5.5F, 4.5F, 1, 2, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[283].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[284].addShapeBox(6F, -5.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftTrackModel[284].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[285].addShapeBox(25F, 1.5F, 1.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftTrackModel[285].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[286].addShapeBox(25F, 0.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 9
		leftTrackModel[286].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[287].addShapeBox(25F, 0.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 10
		leftTrackModel[287].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[288].addShapeBox(25F, 1.5F, -2.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftTrackModel[288].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[289].addShapeBox(25F, 2.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F); // Box 12
		leftTrackModel[289].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[290].addShapeBox(25F, 3.5F, -2.5F, 1, 2, 1, 0F,0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 2F, -0.5F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, -0.5F, -1F); // Box 13
		leftTrackModel[290].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[291].addShapeBox(23F, 5.5F, -3.5F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 5F, -1F, 2.5F, -6F, 0F, 2.5F, -6F, 0F, -2.5F, 5F, -1F, -2.5F); // Box 14
		leftTrackModel[291].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[292].addShapeBox(13F, 7.5F, -6F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 15
		leftTrackModel[292].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[293].addShapeBox(8F, 6.5F, -7.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 4F, -1F, -0.5F, 4F, -1F, 0.5F, -5F, 0F, 0.5F); // Box 16
		leftTrackModel[293].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[294].addShapeBox(6F, 3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 17
		leftTrackModel[294].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[295].addShapeBox(6F, -0.5F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 18
		leftTrackModel[295].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[296].addShapeBox(6F, -3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 19
		leftTrackModel[296].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[297].addShapeBox(6F, -5.5F, -5.5F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 20
		leftTrackModel[297].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[298].addShapeBox(4.5F, -2.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F); // Box 4
		leftTrackModel[298].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[299].addShapeBox(4.5F, 1F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftTrackModel[299].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[299].rotateAngleZ = 0.62831853F;

		leftTrackModel[300].addShapeBox(4.5F, 1F, 2F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 6
		leftTrackModel[300].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[300].rotateAngleZ = 0.62831853F;

		leftTrackModel[301].addShapeBox(4.5F, 4F, 5F, 1, 3, 1, 0F,0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftTrackModel[301].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[301].rotateAngleZ = 0.62831853F;

		leftTrackModel[302].addShapeBox(14.5F, 4F, -1.5F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 9
		leftTrackModel[302].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[302].rotateAngleZ = -0.34906585F;

		leftTrackModel[303].addShapeBox(14.5F, 3F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F); // Box 10
		leftTrackModel[303].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[303].rotateAngleZ = -0.34906585F;

		leftTrackModel[304].addShapeBox(4.5F, 6.5F, 5F, 1, 5, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 12
		leftTrackModel[304].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[304].rotateAngleZ = 0.62831853F;

		leftTrackModel[305].addShapeBox(-3F, 0F, 0F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 13
		leftTrackModel[305].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[306].addShapeBox(4.5F, 11.5F, 5F, 1, 3, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 14
		leftTrackModel[306].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[306].rotateAngleZ = 0.62831853F;

		leftTrackModel[307].addShapeBox(4.5F, 14.5F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 15
		leftTrackModel[307].setRotationPoint(37F, -19F, -2F);
		leftTrackModel[307].rotateAngleZ = 0.62831853F;

		leftTrackModel[308].addShapeBox(0.5F, 10.5F, 5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 16
		leftTrackModel[308].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[309].addShapeBox(0.5F, 3.5F, 5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftTrackModel[309].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[310].addShapeBox(0.5F, 12.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 18
		leftTrackModel[310].setRotationPoint(37F, -19F, -2F);

		leftTrackModel[311].addShapeBox(4.5F, -2.5F, -1F, 1, 1, 2, 0F,0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		leftTrackModel[311].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[312].addShapeBox(14.5F, 3F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 1
		leftTrackModel[312].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[312].rotateAngleZ = -0.34906585F;

		leftTrackModel[313].addShapeBox(14.5F, 5F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F); // Box 2
		leftTrackModel[313].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[313].rotateAngleZ = -0.34906585F;

		leftTrackModel[314].addShapeBox(14.5F, 5F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F); // Box 3
		leftTrackModel[314].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[314].rotateAngleZ = -0.34906585F;

		leftTrackModel[315].addShapeBox(14.5F, 4F, 0.5F, 1, 1, 1, 0F,0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 4
		leftTrackModel[315].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[315].rotateAngleZ = -0.34906585F;

		leftTrackModel[316].addShapeBox(14.5F, 3F, -0.5F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 5
		leftTrackModel[316].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[316].rotateAngleZ = -0.34906585F;

		leftTrackModel[317].addShapeBox(14.5F, 5F, -0.5F, 1, 1, 1, 0F,0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 6
		leftTrackModel[317].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[317].rotateAngleZ = -0.34906585F;

		leftTrackModel[318].addShapeBox(4.5F, 1F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftTrackModel[318].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[318].rotateAngleZ = 0.62831853F;

		leftTrackModel[319].addShapeBox(4.5F, 1F, -5F, 1, 1, 3, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftTrackModel[319].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[319].rotateAngleZ = 0.62831853F;

		leftTrackModel[320].addShapeBox(4.5F, 4F, -6F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftTrackModel[320].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[320].rotateAngleZ = 0.62831853F;

		leftTrackModel[321].addShapeBox(4.5F, 6.5F, -6F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 14
		leftTrackModel[321].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[321].rotateAngleZ = 0.62831853F;

		leftTrackModel[322].addShapeBox(4.5F, 11.5F, -6F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 15
		leftTrackModel[322].setRotationPoint(37F, -19F, 0F);
		leftTrackModel[322].rotateAngleZ = 0.62831853F;

		leftTrackModel[323].addShapeBox(0.5F, 7.5F, 5F, 1, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftTrackModel[323].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[324].addShapeBox(0.5F, 3.5F, -6.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftTrackModel[324].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[325].addShapeBox(0.5F, 7.5F, -6F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftTrackModel[325].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[326].addShapeBox(0.5F, 10.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 3
		leftTrackModel[326].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[327].addShapeBox(-4.5F, 3.5F, -6.5F, 1, 4, 1, 0F,0F, 0F, .05F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftTrackModel[327].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[328].addShapeBox(-4.5F, 7.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftTrackModel[328].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[329].addShapeBox(-4.5F, 9.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 6
		leftTrackModel[329].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[330].addShapeBox(-4.5F, 11.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 7
		leftTrackModel[330].setRotationPoint(37F, -19F, -2F);

		leftTrackModel[331].addShapeBox(-4.5F, 9.5F, 5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 8
		leftTrackModel[331].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[332].addShapeBox(-4.5F, 7.5F, 5F, 1, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftTrackModel[332].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[333].addShapeBox(-4.5F, 3.5F, 5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftTrackModel[333].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[334].addShapeBox(4.5F, 14.5F, 3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftTrackModel[334].setRotationPoint(37F, -19F, -2F);
		leftTrackModel[334].rotateAngleZ = 0.62831853F;

		leftTrackModel[335].addShapeBox(0.5F, 12.5F, 1.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftTrackModel[335].setRotationPoint(37F, -19F, -2F);

		leftTrackModel[336].addShapeBox(-3.5F, 11.5F, 1.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 23
		leftTrackModel[336].setRotationPoint(37F, -19F, -2F);

		leftTrackModel[337].addShapeBox(8.5F, 12.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 24
		leftTrackModel[337].setRotationPoint(37F, -19F, -2F);

		leftTrackModel[338].addShapeBox(11.5F, 10.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 25
		leftTrackModel[338].setRotationPoint(37F, -19F, -2F);

		leftTrackModel[339].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 92
		leftTrackModel[339].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[340].addShapeBox(4F, -1F, 0F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftTrackModel[340].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[341].addShapeBox(8F, -2F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 94
		leftTrackModel[341].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[342].addShapeBox(10F, 5F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 95
		leftTrackModel[342].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[343].addShapeBox(-10F, 0F, 0F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 96
		leftTrackModel[343].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[344].addShapeBox(-13F, -1F, 0F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 97
		leftTrackModel[344].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[345].addShapeBox(-16F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 98
		leftTrackModel[345].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[346].addShapeBox(-18F, 5F, 0F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 99
		leftTrackModel[346].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[347].addShapeBox(-6F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 100
		leftTrackModel[347].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[348].addShapeBox(-2F, 3.5F, 1.5F, 3, 4, 1, 0F,.5F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.2F, -.2F, 0F, -.2F); // Box 101
		leftTrackModel[348].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[349].addShapeBox(-2.5F, 7.5F, 1.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 102
		leftTrackModel[349].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[350].addShapeBox(-3F, 9.5F, 1.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F); // Box 103
		leftTrackModel[350].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[351].addShapeBox(-3F, 10.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F, -.2F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 104
		leftTrackModel[351].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[352].addShapeBox(-2.5F, 11.5F, 1.5F, 2, 3, 1, 0F,.3F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 105
		leftTrackModel[352].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[353].addShapeBox(-2.5F, 14.5F, 1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 106
		leftTrackModel[353].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[354].addShapeBox(-2.5F, 16.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 107
		leftTrackModel[354].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[355].addShapeBox(-1.5F, 18.5F, 1.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 108
		leftTrackModel[355].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[356].addShapeBox(-2.5F, 17.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 109
		leftTrackModel[356].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[357].addShapeBox(-1.5F, 19F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 110
		leftTrackModel[357].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[358].addShapeBox(10F, -4F, 0F, 3, 11, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 111
		leftTrackModel[358].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[359].addShapeBox(13F, -5F, 0F, 3, 9, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 112
		leftTrackModel[359].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[360].addShapeBox(16F, -6F, 0F, 3, 6, 1, 0F,0F, -.5F, 0F, 0F, -.1F, 0F, -.2F, -.15F, 0F, 0F, -.5F, 0F, 0F, 3F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, 3F, 0F); // Box 113
		leftTrackModel[360].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[361].addShapeBox(8F, -3F, 0F, 2, 9, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackModel[361].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[362].addShapeBox(-18F, 0F, 0F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 115
		leftTrackModel[362].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[363].addShapeBox(23.7F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.1F, -.7F, 0F, 0F, -.2F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .1F, 0F); // Box 116
		leftTrackModel[363].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[363].rotateAngleZ = -0.64577182F;

		leftTrackModel[364].addShapeBox(22.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F); // Box 117
		leftTrackModel[364].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[364].rotateAngleZ = -0.64577182F;

		leftTrackModel[365].addShapeBox(21.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftTrackModel[365].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[365].rotateAngleZ = -0.64577182F;

		leftTrackModel[366].addShapeBox(19.5F, -18F, 0F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 119
		leftTrackModel[366].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[366].rotateAngleZ = -0.64577182F;

		leftTrackModel[367].addShapeBox(17.5F, -18F, 0F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftTrackModel[367].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[367].rotateAngleZ = -0.64577182F;

		leftTrackModel[368].addShapeBox(15.5F, -19F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftTrackModel[368].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[368].rotateAngleZ = -0.64577182F;

		leftTrackModel[369].addShapeBox(13.5F, -19F, 0F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftTrackModel[369].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[369].rotateAngleZ = -0.64577182F;

		leftTrackModel[370].addShapeBox(19.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 123
		leftTrackModel[370].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[370].rotateAngleZ = -0.64577182F;

		leftTrackModel[371].addShapeBox(21.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.5F, 0F); // Box 124
		leftTrackModel[371].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[371].rotateAngleZ = -0.64577182F;

		leftTrackModel[372].addShapeBox(22.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F); // Box 125
		leftTrackModel[372].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[372].rotateAngleZ = -0.64577182F;

		leftTrackModel[373].addShapeBox(17.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 126
		leftTrackModel[373].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[373].rotateAngleZ = -0.64577182F;

		leftTrackModel[374].addShapeBox(15.5F, -15F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackModel[374].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[374].rotateAngleZ = -0.64577182F;

		leftTrackModel[375].addShapeBox(23.7F, -15F, -0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, 0.1F, -.3F, 0F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, .2F, -0.2F, 0F); // Box 128
		leftTrackModel[375].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[375].rotateAngleZ = -0.64577182F;

		leftTrackModel[376].addShapeBox(11.5F, -18F, 0F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		leftTrackModel[376].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[376].rotateAngleZ = -0.64577182F;

		leftTrackModel[377].addShapeBox(10F, 2F, 1F, 3, 5, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 130
		leftTrackModel[377].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[378].addShapeBox(13F, 1F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -.5F, 2F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 131
		leftTrackModel[378].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[379].addShapeBox(16F, -3F, 1F, 3, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 3F, 0F, 1F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 2F, 0F); // Box 132
		leftTrackModel[379].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[380].addShapeBox(8F, -3F, 1F, 2, 7, 1, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 2F); // Box 133
		leftTrackModel[380].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[381].addShapeBox(10F, -4F, 1F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2F, 0F, 0F, 2F); // Box 134
		leftTrackModel[381].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[382].addShapeBox(13F, -5F, 1F, 3, 6, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, .5F, 2F); // Box 135
		leftTrackModel[382].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[383].addShapeBox(16F, -6F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, -.2F, -.15F, 0F, -.5F, -.53F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F); // Box 136
		leftTrackModel[383].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[384].addShapeBox(11.5F, -18F, 1F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F); // Box 137
		leftTrackModel[384].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[384].rotateAngleZ = -0.64577182F;

		leftTrackModel[385].addShapeBox(11.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -1.3F, 0F); // Box 138
		leftTrackModel[385].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[385].rotateAngleZ = -0.64577182F;

		leftTrackModel[386].addShapeBox(13.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 1F, 0F, -.8F, 0F); // Box 139
		leftTrackModel[386].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[386].rotateAngleZ = -0.64577182F;

		leftTrackModel[387].addShapeBox(13.5F, -19F, 1F, 2, 4, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F); // Box 140
		leftTrackModel[387].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[387].rotateAngleZ = -0.64577182F;

		leftTrackModel[388].addShapeBox(15.5F, -19F, 1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 141
		leftTrackModel[388].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[388].rotateAngleZ = -0.64577182F;

		leftTrackModel[389].addShapeBox(15.5F, -15F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.7F, 0F, 0F, -.8F, 0F); // Box 142
		leftTrackModel[389].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[389].rotateAngleZ = -0.64577182F;

		leftTrackModel[390].addShapeBox(17.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.7F, 1F); // Box 143
		leftTrackModel[390].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[390].rotateAngleZ = -0.64577182F;

		leftTrackModel[391].addShapeBox(17.5F, -18F, 1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F); // Box 144
		leftTrackModel[391].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[391].rotateAngleZ = -0.64577182F;

		leftTrackModel[392].addShapeBox(19.5F, -18F, 1F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, .5F, 0F, -1.5F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F); // Box 145
		leftTrackModel[392].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[392].rotateAngleZ = -0.64577182F;

		leftTrackModel[393].addShapeBox(19.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.8F, -.5F, 0F, -.5F, 0F); // Box 146
		leftTrackModel[393].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[393].rotateAngleZ = -0.64577182F;

		leftTrackModel[394].addShapeBox(-3F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 147
		leftTrackModel[394].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[395].addShapeBox(-3F, 5F, 2F, 3, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 148
		leftTrackModel[395].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[396].addShapeBox(-6F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 149
		leftTrackModel[396].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[397].addShapeBox(-6F, 5F, 2F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 150
		leftTrackModel[397].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[398].addShapeBox(-13F, -1F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 151
		leftTrackModel[398].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[399].addShapeBox(-10F, 0F, 2F, 4, 5, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 152
		leftTrackModel[399].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[400].addShapeBox(-16F, 0F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftTrackModel[400].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[401].addShapeBox(-18F, 0F, 2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -3F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 154
		leftTrackModel[401].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[402].addShapeBox(-18F, 5F, 2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, -1F, -4F, -.7F); // Box 155
		leftTrackModel[402].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[403].addShapeBox(-16F, 5F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -.5F); // Box 156
		leftTrackModel[403].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[404].addShapeBox(-13F, 5F, 2F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -4F, .5F, 0F, -3F, 0F); // Box 157
		leftTrackModel[404].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[405].addShapeBox(-10F, 5F, 2F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -3F, -.5F); // Box 158
		leftTrackModel[405].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[406].addShapeBox(0F, 5F, 2F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F); // Box 159
		leftTrackModel[406].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[407].addShapeBox(4F, 5F, 2F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 1F); // Box 160
		leftTrackModel[407].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[408].addShapeBox(0F, 0F, 2F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 161
		leftTrackModel[408].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[409].addShapeBox(4F, -1F, 2F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 162
		leftTrackModel[409].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[410].addShapeBox(8F, 5F, 2F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, 0F); // Box 163
		leftTrackModel[410].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[411].addShapeBox(10F, 5F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, .5F, -2F, 0F, -.5F, -5F, 0F, 0F, -3.5F, 0F); // Box 164
		leftTrackModel[411].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[412].addShapeBox(10F, -1F, 2F, 2, 6, 2, 0F,0F, 0F, 0F, .5F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 165
		leftTrackModel[412].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[413].addShapeBox(8F, -2F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F); // Box 166
		leftTrackModel[413].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[414].addShapeBox(21.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.8F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftTrackModel[414].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[414].rotateAngleZ = -0.64577182F;

		leftTrackModel[415].addShapeBox(21.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 168
		leftTrackModel[415].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[415].rotateAngleZ = -0.64577182F;

		leftTrackModel[416].addShapeBox(20F, -8F, -1F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 169
		leftTrackModel[416].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[416].rotateAngleX = -0.34906585F;
		leftTrackModel[416].rotateAngleY = 0.03490659F;

		leftTrackModel[417].addShapeBox(22.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.5F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, .3F, 0F, 0F, 0F); // Box 170
		leftTrackModel[417].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[417].rotateAngleZ = -0.64577182F;

		leftTrackModel[418].addShapeBox(22.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.7F, 0F, 0F, -.8F, 0F); // Box 171
		leftTrackModel[418].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[418].rotateAngleZ = -0.64577182F;

		leftTrackModel[419].addShapeBox(23.7F, -15F, 0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, -.35F, -.3F, -.3F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -.5F, -1F, -.5F, .2F, -.7F, 0F); // Box 172
		leftTrackModel[419].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[419].rotateAngleZ = -0.64577182F;

		leftTrackModel[420].addShapeBox(23.7F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.5F, -1F, -.5F, 0F, -.5F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, -.2F, .2F, -.2F, .2F, .1F, .3F); // Box 173
		leftTrackModel[420].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[420].rotateAngleZ = -0.64577182F;

		leftTrackModel[421].addShapeBox(20F, -8F, -2F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		leftTrackModel[421].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[421].rotateAngleX = -0.34906585F;
		leftTrackModel[421].rotateAngleY = 0.03490659F;

		leftTrackModel[422].addShapeBox(-18F, 0F, -1F, 2, 2, 2, 0F,0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 175
		leftTrackModel[422].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[423].addShapeBox(-14.5F, -13.5F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 176
		leftTrackModel[423].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[423].rotateAngleZ = 0.85521133F;

		leftTrackModel[424].addShapeBox(-13.3F, -18.5F, -2F, 4, 4, 4, 0F,0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F); // Box 177
		leftTrackModel[424].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[424].rotateAngleZ = 1.18682389F;

		leftTrackModel[425].addShapeBox(-13.6F, -20.2F, -2F, 3, 4, 4, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 178
		leftTrackModel[425].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[425].rotateAngleZ = 1.32645023F;

		leftTrackModel[426].addShapeBox(-15.6F, -21.9F, -2F, 5, 4, 4, 0F,0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F); // Box 179
		leftTrackModel[426].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[426].rotateAngleZ = 1.46607657F;

		leftTrackModel[427].addShapeBox(1.5F, -3.5F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 180
		leftTrackModel[427].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[428].addShapeBox(2.5F, -2.5F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 181
		leftTrackModel[428].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[429].addShapeBox(-1.5F, -3.5F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -.5F, 0F, 1F, -.5F, 0F, 1F, 0F, 2F, 0F, 0F); // Box 182
		leftTrackModel[429].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[430].addShapeBox(-3.5F, -3.5F, 0F, 2, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .5F, -1F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, .5F, -1F, 0F); // Box 183
		leftTrackModel[430].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[431].addShapeBox(-4.5F, -2.5F, 0F, 1, 8, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -4F, 0F, 0F, -2F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, .2F, -2F, 0F); // Box 184
		leftTrackModel[431].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[432].addShapeBox(-4.5F, -2.5F, 0F, 1, 5, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 185
		leftTrackModel[432].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[433].addShapeBox(-3.5F, -3.5F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, -.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 186
		leftTrackModel[433].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[434].addShapeBox(-1.5F, -3.5F, 0F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 187
		leftTrackModel[434].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[435].addShapeBox(1.5F, -3.5F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 188
		leftTrackModel[435].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[436].addShapeBox(2.5F, -2.5F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 189
		leftTrackModel[436].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[437].addShapeBox(1.5F, -3.5F, 2F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F); // Box 190
		leftTrackModel[437].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[438].addShapeBox(2.5F, -2.5F, 2F, 1, 9, 1, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -.5F); // Box 191
		leftTrackModel[438].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[439].addShapeBox(-1.5F, -3.5F, 2F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.3F, 0F, 0F, -3.5F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -.5F, 2F, 0F, -.5F); // Box 192
		leftTrackModel[439].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[440].addShapeBox(-3.5F, -3.5F, 2F, 2, 10, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, .5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -.5F, .5F, -1F, -.5F); // Box 193
		leftTrackModel[440].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[441].addShapeBox(-4.5F, -2.5F, 2F, 1, 8, 1, 0F,.5F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, .5F, -4F, -1F, .2F, -2F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, .2F, -2F, -1F); // Box 194
		leftTrackModel[441].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[442].addShapeBox(1.5F, -3.5F, 2F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -2.8F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F); // Box 195
		leftTrackModel[442].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[443].addShapeBox(2.5F, -2.5F, 2F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 1F, -1.8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -.5F); // Box 196
		leftTrackModel[443].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[444].addShapeBox(-3.5F, -3.5F, 2F, 2, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -.5F, 0F, -1F, -.5F); // Box 197
		leftTrackModel[444].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[445].addShapeBox(-4.5F, -2.5F, 2F, 1, 5, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2F, -1F); // Box 198
		leftTrackModel[445].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[446].addShapeBox(-1.5F, -3.5F, 2F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 1F, -.5F); // Box 199
		leftTrackModel[446].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[447].addShapeBox(-1.5F, 18.5F, 0.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 200
		leftTrackModel[447].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[448].addShapeBox(-2.5F, 17.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 201
		leftTrackModel[448].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[449].addShapeBox(-2F, 3.5F, 0.5F, 3, 4, 1, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 202
		leftTrackModel[449].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[450].addShapeBox(-2.5F, 7.5F, 0.5F, 3, 2, 1, 0F,-0.7F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftTrackModel[450].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[451].addShapeBox(-2.5F, 11.5F, 0.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackModel[451].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[452].addShapeBox(-2.5F, 14.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		leftTrackModel[452].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[453].addShapeBox(-2.5F, 16.5F, 0.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftTrackModel[453].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[454].addShapeBox(-3F, 10.5F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F); // Box 207
		leftTrackModel[454].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[455].addShapeBox(-3F, 9.5F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 208
		leftTrackModel[455].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[456].addShapeBox(-4.5F, 22F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 209
		leftTrackModel[456].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[457].addShapeBox(-4.5F, 21.5F, 1.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 210
		leftTrackModel[457].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[458].addShapeBox(-5.5F, 20.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 211
		leftTrackModel[458].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[459].addShapeBox(-5.5F, 19.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 212
		leftTrackModel[459].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[460].addShapeBox(-1.5F, 19F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 213
		leftTrackModel[460].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[461].addShapeBox(-5.5F, 14.5F, 1.5F, 2, 5, 1, 0F,.2F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 214
		leftTrackModel[461].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[462].addShapeBox(-5.5F, 11.5F, 1.5F, 3, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -.2F, -.4F, 0F, .2F, .2F, 0F, 0F, -.5F, 0F, 0F, -1.1F, 0F, -.2F, -.3F, 0F, -.2F); // Box 215
		leftTrackModel[462].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[463].addShapeBox(-4.5F, 10.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, -.4F, 0F, -.2F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.2F, 0F, -.2F, .6F, 0F, .2F); // Box 216
		leftTrackModel[463].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[464].addShapeBox(-3.5F, 6.5F, 1.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.3F, 0F, -.2F, .6F, 0F, -.2F); // Box 217
		leftTrackModel[464].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[465].addShapeBox(-27.89F, -15.79F, 0F, 7, 4, 2, 0F,2F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, .5F, -.5F, -.5F, .5F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -.5F, -.5F, -.5F); // Box 218
		leftTrackModel[465].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[465].rotateAngleZ = 1.13446401F;

		leftTrackModel[466].addShapeBox(-4.5F, 22F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 219
		leftTrackModel[466].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[467].addShapeBox(-4.5F, 21.5F, 0.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 220
		leftTrackModel[467].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[468].addShapeBox(-5.5F, 20.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 221
		leftTrackModel[468].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[469].addShapeBox(-5.5F, 19.5F, 0.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 222
		leftTrackModel[469].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[470].addShapeBox(-5.5F, 14.5F, 0.5F, 2, 5, 1, 0F,-0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		leftTrackModel[470].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[471].addShapeBox(-5.5F, 11.5F, 0.5F, 3, 3, 1, 0F,-0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 224
		leftTrackModel[471].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[472].addShapeBox(-4.5F, 10.5F, 0.5F, 3, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 225
		leftTrackModel[472].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[473].addShapeBox(-3.5F, 6.5F, 0.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 226
		leftTrackModel[473].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[474].addShapeBox(-27.89F, -15.79F, -2F, 7, 4, 2, 0F,0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 2F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 227
		leftTrackModel[474].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[474].rotateAngleZ = 1.13446401F;

		leftTrackModel[475].addShapeBox(-18F, 0F, -2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 228
		leftTrackModel[475].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[476].addShapeBox(-18F, 5F, -2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 229
		leftTrackModel[476].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[477].addShapeBox(-16F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 230
		leftTrackModel[477].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[478].addShapeBox(-13F, -1F, -2F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 231
		leftTrackModel[478].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[479].addShapeBox(-10F, 0F, -2F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 232
		leftTrackModel[479].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[480].addShapeBox(-6F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 233
		leftTrackModel[480].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[481].addShapeBox(-3F, 0F, -2F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 234
		leftTrackModel[481].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[482].addShapeBox(0F, 0F, -2F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 235
		leftTrackModel[482].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[483].addShapeBox(4F, -1F, -2F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftTrackModel[483].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[484].addShapeBox(8F, -2F, -2F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 237
		leftTrackModel[484].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[485].addShapeBox(10F, 5F, -2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 238
		leftTrackModel[485].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[486].addShapeBox(10F, -4F, -1F, 3, 11, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 239
		leftTrackModel[486].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[487].addShapeBox(13F, -5F, -1F, 3, 9, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 240
		leftTrackModel[487].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[488].addShapeBox(16F, -6F, -1F, 3, 6, 1, 0F,0F, -0.5F, 0F, -0.2F, -0.15F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 241
		leftTrackModel[488].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[489].addShapeBox(8F, -3F, -1F, 2, 9, 1, 0F,0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 242
		leftTrackModel[489].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[490].addShapeBox(16F, -6F, -2F, 3, 3, 1, 0F,0F, -1.5F, 0F, -0.5F, -0.53F, 0F, -0.2F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 243
		leftTrackModel[490].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[491].addShapeBox(16F, -3F, -2F, 3, 3, 1, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0.5F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 244
		leftTrackModel[491].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[492].addShapeBox(13F, -5F, -2F, 3, 6, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 245
		leftTrackModel[492].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[493].addShapeBox(13F, 1F, -2F, 3, 3, 1, 0F,0F, -0.5F, 2F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 246
		leftTrackModel[493].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[494].addShapeBox(10F, -4F, -2F, 3, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 247
		leftTrackModel[494].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[495].addShapeBox(10F, 2F, -2F, 3, 5, 1, 0F,0F, -1F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 248
		leftTrackModel[495].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[496].addShapeBox(8F, -3F, -2F, 2, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 249
		leftTrackModel[496].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[497].addShapeBox(11.5F, -18F, -1F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftTrackModel[497].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[497].rotateAngleZ = -0.64577182F;

		leftTrackModel[498].addShapeBox(13.5F, -19F, -1F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftTrackModel[498].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[498].rotateAngleZ = -0.64577182F;

		leftTrackModel[499].addShapeBox(15.5F, -19F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		leftTrackModel[499].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[499].rotateAngleZ = -0.64577182F;
	}

	private void initleftTrackModel_2()
	{
		leftTrackModel[500] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 253
		leftTrackModel[501] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 254
		leftTrackModel[502] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 255
		leftTrackModel[503] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 256
		leftTrackModel[504] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 257
		leftTrackModel[505] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 258
		leftTrackModel[506] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 259
		leftTrackModel[507] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 260
		leftTrackModel[508] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 261
		leftTrackModel[509] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 262
		leftTrackModel[510] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 263
		leftTrackModel[511] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 264
		leftTrackModel[512] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 265
		leftTrackModel[513] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 266
		leftTrackModel[514] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 267
		leftTrackModel[515] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 268
		leftTrackModel[516] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 269
		leftTrackModel[517] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 270
		leftTrackModel[518] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 271
		leftTrackModel[519] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 272
		leftTrackModel[520] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 273
		leftTrackModel[521] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 274
		leftTrackModel[522] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 275
		leftTrackModel[523] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 276
		leftTrackModel[524] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 277
		leftTrackModel[525] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 278
		leftTrackModel[526] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 279
		leftTrackModel[527] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 280
		leftTrackModel[528] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 281
		leftTrackModel[529] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 282
		leftTrackModel[530] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 283
		leftTrackModel[531] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 284
		leftTrackModel[532] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 285
		leftTrackModel[533] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 286
		leftTrackModel[534] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 287
		leftTrackModel[535] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 288
		leftTrackModel[536] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 289
		leftTrackModel[537] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 290
		leftTrackModel[538] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 291
		leftTrackModel[539] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 292
		leftTrackModel[540] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 293
		leftTrackModel[541] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 294
		leftTrackModel[542] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 295
		leftTrackModel[543] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 296
		leftTrackModel[544] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 297
		leftTrackModel[545] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 298
		leftTrackModel[546] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 299
		leftTrackModel[547] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 300
		leftTrackModel[548] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 301
		leftTrackModel[549] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 302
		leftTrackModel[550] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 303
		leftTrackModel[551] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 304
		leftTrackModel[552] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 305
		leftTrackModel[553] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 306
		leftTrackModel[554] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 307
		leftTrackModel[555] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 308
		leftTrackModel[556] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 309
		leftTrackModel[557] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 310
		leftTrackModel[558] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 311
		leftTrackModel[559] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 312
		leftTrackModel[560] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 313
		leftTrackModel[561] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 314
		leftTrackModel[562] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 315
		leftTrackModel[563] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 316
		leftTrackModel[564] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 317
		leftTrackModel[565] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 318
		leftTrackModel[566] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 319
		leftTrackModel[567] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 320
		leftTrackModel[568] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 321
		leftTrackModel[569] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 322
		leftTrackModel[570] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 323
		leftTrackModel[571] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 324
		leftTrackModel[572] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 325
		leftTrackModel[573] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 326
		leftTrackModel[574] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 327
		leftTrackModel[575] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 328
		leftTrackModel[576] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 329
		leftTrackModel[577] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 330
		leftTrackModel[578] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 331
		leftTrackModel[579] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 332
		leftTrackModel[580] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 333
		leftTrackModel[581] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 334
		leftTrackModel[582] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 335
		leftTrackModel[583] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 336
		leftTrackModel[584] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 337
		leftTrackModel[585] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 338
		leftTrackModel[586] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 339
		leftTrackModel[587] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 340
		leftTrackModel[588] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 341
		leftTrackModel[589] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 342
		leftTrackModel[590] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 343
		leftTrackModel[591] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 344
		leftTrackModel[592] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 345
		leftTrackModel[593] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 346
		leftTrackModel[594] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 347
		leftTrackModel[595] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 348
		leftTrackModel[596] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 349
		leftTrackModel[597] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 350
		leftTrackModel[598] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 351
		leftTrackModel[599] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 355
		leftTrackModel[600] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 356
		leftTrackModel[601] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 366
		leftTrackModel[602] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 367
		leftTrackModel[603] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 368
		leftTrackModel[604] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 369
		leftTrackModel[605] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 370
		leftTrackModel[606] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 371
		leftTrackModel[607] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 372
		leftTrackModel[608] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 373
		leftTrackModel[609] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 374
		leftTrackModel[610] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 375
		leftTrackModel[611] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 376
		leftTrackModel[612] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 377
		leftTrackModel[613] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 378
		leftTrackModel[614] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 380
		leftTrackModel[615] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 381
		leftTrackModel[616] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 382
		leftTrackModel[617] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 383
		leftTrackModel[618] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 384
		leftTrackModel[619] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 385
		leftTrackModel[620] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 386
		leftTrackModel[621] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 387
		leftTrackModel[622] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 388
		leftTrackModel[623] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 389
		leftTrackModel[624] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 390
		leftTrackModel[625] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 391
		leftTrackModel[626] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 392
		leftTrackModel[627] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 393
		leftTrackModel[628] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 394
		leftTrackModel[629] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 395
		leftTrackModel[630] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 396
		leftTrackModel[631] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 397
		leftTrackModel[632] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 398
		leftTrackModel[633] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 399
		leftTrackModel[634] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 400
		leftTrackModel[635] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 401
		leftTrackModel[636] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 402
		leftTrackModel[637] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 405
		leftTrackModel[638] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 406
		leftTrackModel[639] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 407
		leftTrackModel[640] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 408
		leftTrackModel[641] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 409
		leftTrackModel[642] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 410
		leftTrackModel[643] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 411
		leftTrackModel[644] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 412
		leftTrackModel[645] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 413
		leftTrackModel[646] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 414
		leftTrackModel[647] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 415
		leftTrackModel[648] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 416
		leftTrackModel[649] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 417
		leftTrackModel[650] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 418
		leftTrackModel[651] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 419
		leftTrackModel[652] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 420
		leftTrackModel[653] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 421
		leftTrackModel[654] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 422
		leftTrackModel[655] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 423
		leftTrackModel[656] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 424
		leftTrackModel[657] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 434
		leftTrackModel[658] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 435
		leftTrackModel[659] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 436
		leftTrackModel[660] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 437
		leftTrackModel[661] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 438
		leftTrackModel[662] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 439
		leftTrackModel[663] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 440
		leftTrackModel[664] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 441
		leftTrackModel[665] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 442
		leftTrackModel[666] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 443
		leftTrackModel[667] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 444
		leftTrackModel[668] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 445
		leftTrackModel[669] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 446
		leftTrackModel[670] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 447
		leftTrackModel[671] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 448
		leftTrackModel[672] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 449
		leftTrackModel[673] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 450
		leftTrackModel[674] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 451
		leftTrackModel[675] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 452
		leftTrackModel[676] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 453
		leftTrackModel[677] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 454
		leftTrackModel[678] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 92
		leftTrackModel[679] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 93
		leftTrackModel[680] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 94
		leftTrackModel[681] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 95
		leftTrackModel[682] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 96
		leftTrackModel[683] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 97
		leftTrackModel[684] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 98
		leftTrackModel[685] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 99
		leftTrackModel[686] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 100
		leftTrackModel[687] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 101
		leftTrackModel[688] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 102
		leftTrackModel[689] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 103
		leftTrackModel[690] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 104
		leftTrackModel[691] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 105
		leftTrackModel[692] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 106
		leftTrackModel[693] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 107
		leftTrackModel[694] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 108
		leftTrackModel[695] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 109
		leftTrackModel[696] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 110
		leftTrackModel[697] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 111
		leftTrackModel[698] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 112
		leftTrackModel[699] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 113
		leftTrackModel[700] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 114
		leftTrackModel[701] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 115
		leftTrackModel[702] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 116
		leftTrackModel[703] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 119
		leftTrackModel[704] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 120
		leftTrackModel[705] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 121
		leftTrackModel[706] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 122
		leftTrackModel[707] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 128
		leftTrackModel[708] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 129
		leftTrackModel[709] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 130
		leftTrackModel[710] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 131
		leftTrackModel[711] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 132
		leftTrackModel[712] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 133
		leftTrackModel[713] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 134
		leftTrackModel[714] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 135
		leftTrackModel[715] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 136
		leftTrackModel[716] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 137
		leftTrackModel[717] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 139
		leftTrackModel[718] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 140
		leftTrackModel[719] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 141
		leftTrackModel[720] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 142
		leftTrackModel[721] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 143
		leftTrackModel[722] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 144
		leftTrackModel[723] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 145
		leftTrackModel[724] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 146
		leftTrackModel[725] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 147
		leftTrackModel[726] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 148
		leftTrackModel[727] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 149
		leftTrackModel[728] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 150
		leftTrackModel[729] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 151
		leftTrackModel[730] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 152
		leftTrackModel[731] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 153
		leftTrackModel[732] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 154
		leftTrackModel[733] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 155
		leftTrackModel[734] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 157
		leftTrackModel[735] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 158
		leftTrackModel[736] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 159
		leftTrackModel[737] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 160
		leftTrackModel[738] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 161
		leftTrackModel[739] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 162
		leftTrackModel[740] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 164
		leftTrackModel[741] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 165
		leftTrackModel[742] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 166
		leftTrackModel[743] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 167
		leftTrackModel[744] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 168
		leftTrackModel[745] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 169
		leftTrackModel[746] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 170
		leftTrackModel[747] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 171
		leftTrackModel[748] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 172
		leftTrackModel[749] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 173
		leftTrackModel[750] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 174
		leftTrackModel[751] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 175
		leftTrackModel[752] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 176
		leftTrackModel[753] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 177
		leftTrackModel[754] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 178
		leftTrackModel[755] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 179
		leftTrackModel[756] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 180
		leftTrackModel[757] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 181
		leftTrackModel[758] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 183
		leftTrackModel[759] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 184
		leftTrackModel[760] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 186
		leftTrackModel[761] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 187
		leftTrackModel[762] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 188
		leftTrackModel[763] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 189
		leftTrackModel[764] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 190
		leftTrackModel[765] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 191
		leftTrackModel[766] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 192
		leftTrackModel[767] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 193
		leftTrackModel[768] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 194
		leftTrackModel[769] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 195
		leftTrackModel[770] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 196
		leftTrackModel[771] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 197
		leftTrackModel[772] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 199
		leftTrackModel[773] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 200
		leftTrackModel[774] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 201
		leftTrackModel[775] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 202
		leftTrackModel[776] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 203
		leftTrackModel[777] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 204
		leftTrackModel[778] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 205
		leftTrackModel[779] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 206
		leftTrackModel[780] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 207
		leftTrackModel[781] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 208
		leftTrackModel[782] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 209
		leftTrackModel[783] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 210
		leftTrackModel[784] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 211
		leftTrackModel[785] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 212
		leftTrackModel[786] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 213
		leftTrackModel[787] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 214
		leftTrackModel[788] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 215
		leftTrackModel[789] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 216
		leftTrackModel[790] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 217
		leftTrackModel[791] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 218
		leftTrackModel[792] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 219
		leftTrackModel[793] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 220
		leftTrackModel[794] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 221
		leftTrackModel[795] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 222
		leftTrackModel[796] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 223
		leftTrackModel[797] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 224
		leftTrackModel[798] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 225
		leftTrackModel[799] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 226
		leftTrackModel[800] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 227
		leftTrackModel[801] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 228
		leftTrackModel[802] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 229
		leftTrackModel[803] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 230
		leftTrackModel[804] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 231
		leftTrackModel[805] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 232
		leftTrackModel[806] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 233
		leftTrackModel[807] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 234
		leftTrackModel[808] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 235
		leftTrackModel[809] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 236
		leftTrackModel[810] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 237
		leftTrackModel[811] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 238
		leftTrackModel[812] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 239
		leftTrackModel[813] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 240
		leftTrackModel[814] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 241
		leftTrackModel[815] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 242
		leftTrackModel[816] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 243
		leftTrackModel[817] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 244
		leftTrackModel[818] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 245
		leftTrackModel[819] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 246
		leftTrackModel[820] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 247
		leftTrackModel[821] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 248
		leftTrackModel[822] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 249
		leftTrackModel[823] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 250
		leftTrackModel[824] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 251
		leftTrackModel[825] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 252
		leftTrackModel[826] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 255
		leftTrackModel[827] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 256
		leftTrackModel[828] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 258
		leftTrackModel[829] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 259
		leftTrackModel[830] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 261
		leftTrackModel[831] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 262
		leftTrackModel[832] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 263
		leftTrackModel[833] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 264
		leftTrackModel[834] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 265
		leftTrackModel[835] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 266
		leftTrackModel[836] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 267
		leftTrackModel[837] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 268
		leftTrackModel[838] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 269
		leftTrackModel[839] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 270
		leftTrackModel[840] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 271
		leftTrackModel[841] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 272
		leftTrackModel[842] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 273
		leftTrackModel[843] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 274
		leftTrackModel[844] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 275
		leftTrackModel[845] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 276
		leftTrackModel[846] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 277
		leftTrackModel[847] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 278
		leftTrackModel[848] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 279
		leftTrackModel[849] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 280
		leftTrackModel[850] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 281
		leftTrackModel[851] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 282
		leftTrackModel[852] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 283
		leftTrackModel[853] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 284
		leftTrackModel[854] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 285
		leftTrackModel[855] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 286
		leftTrackModel[856] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 287
		leftTrackModel[857] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 288
		leftTrackModel[858] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 289
		leftTrackModel[859] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 290
		leftTrackModel[860] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 291
		leftTrackModel[861] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 292
		leftTrackModel[862] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 295
		leftTrackModel[863] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 296
		leftTrackModel[864] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 297
		leftTrackModel[865] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 298
		leftTrackModel[866] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 299
		leftTrackModel[867] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 301
		leftTrackModel[868] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 303
		leftTrackModel[869] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 304
		leftTrackModel[870] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 305
		leftTrackModel[871] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 306
		leftTrackModel[872] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 307
		leftTrackModel[873] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 308
		leftTrackModel[874] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 309
		leftTrackModel[875] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 310
		leftTrackModel[876] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 311
		leftTrackModel[877] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 312
		leftTrackModel[878] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 313
		leftTrackModel[879] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 314
		leftTrackModel[880] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 315
		leftTrackModel[881] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 316
		leftTrackModel[882] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 317
		leftTrackModel[883] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 318
		leftTrackModel[884] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 319
		leftTrackModel[885] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 320
		leftTrackModel[886] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 321
		leftTrackModel[887] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 322
		leftTrackModel[888] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 323
		leftTrackModel[889] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 324
		leftTrackModel[890] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 325
		leftTrackModel[891] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 326
		leftTrackModel[892] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 327
		leftTrackModel[893] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 328
		leftTrackModel[894] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 329
		leftTrackModel[895] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 330
		leftTrackModel[896] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 332
		leftTrackModel[897] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 333
		leftTrackModel[898] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 334
		leftTrackModel[899] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 335
		leftTrackModel[900] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 336
		leftTrackModel[901] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 337
		leftTrackModel[902] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 338
		leftTrackModel[903] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 339
		leftTrackModel[904] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 340
		leftTrackModel[905] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 341
		leftTrackModel[906] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 342
		leftTrackModel[907] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 343
		leftTrackModel[908] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 344
		leftTrackModel[909] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 345
		leftTrackModel[910] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 346
		leftTrackModel[911] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 347
		leftTrackModel[912] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 348
		leftTrackModel[913] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 349
		leftTrackModel[914] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 350
		leftTrackModel[915] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 351
		leftTrackModel[916] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 366
		leftTrackModel[917] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 367
		leftTrackModel[918] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 368
		leftTrackModel[919] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 369
		leftTrackModel[920] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 372
		leftTrackModel[921] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 373
		leftTrackModel[922] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 374
		leftTrackModel[923] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 375
		leftTrackModel[924] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 376
		leftTrackModel[925] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 377
		leftTrackModel[926] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 378
		leftTrackModel[927] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 380
		leftTrackModel[928] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 381
		leftTrackModel[929] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 382
		leftTrackModel[930] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 383
		leftTrackModel[931] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 384
		leftTrackModel[932] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 385
		leftTrackModel[933] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 386
		leftTrackModel[934] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 387
		leftTrackModel[935] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 388
		leftTrackModel[936] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 389
		leftTrackModel[937] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 390
		leftTrackModel[938] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 391
		leftTrackModel[939] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 392
		leftTrackModel[940] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 393
		leftTrackModel[941] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 394
		leftTrackModel[942] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 395
		leftTrackModel[943] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 396
		leftTrackModel[944] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 397
		leftTrackModel[945] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 398
		leftTrackModel[946] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 399
		leftTrackModel[947] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 400
		leftTrackModel[948] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 401
		leftTrackModel[949] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 402
		leftTrackModel[950] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 405
		leftTrackModel[951] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 406
		leftTrackModel[952] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 407
		leftTrackModel[953] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 408
		leftTrackModel[954] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 409
		leftTrackModel[955] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 410
		leftTrackModel[956] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 411
		leftTrackModel[957] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 412
		leftTrackModel[958] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 413
		leftTrackModel[959] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 414
		leftTrackModel[960] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 415
		leftTrackModel[961] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 416
		leftTrackModel[962] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 417
		leftTrackModel[963] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 418
		leftTrackModel[964] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 419
		leftTrackModel[965] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 420
		leftTrackModel[966] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 421
		leftTrackModel[967] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 422
		leftTrackModel[968] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 423
		leftTrackModel[969] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 424
		leftTrackModel[970] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 434
		leftTrackModel[971] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 435
		leftTrackModel[972] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 436
		leftTrackModel[973] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 437
		leftTrackModel[974] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 438
		leftTrackModel[975] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 439
		leftTrackModel[976] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 440
		leftTrackModel[977] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 441
		leftTrackModel[978] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 442
		leftTrackModel[979] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 443
		leftTrackModel[980] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 444
		leftTrackModel[981] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 445
		leftTrackModel[982] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 446
		leftTrackModel[983] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 447
		leftTrackModel[984] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 448
		leftTrackModel[985] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 449
		leftTrackModel[986] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 450
		leftTrackModel[987] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 451
		leftTrackModel[988] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 452
		leftTrackModel[989] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 453
		leftTrackModel[990] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 454
		leftTrackModel[991] = new ModelRendererTurbo(this, 300, 98, textureX, textureY); // Box 334
		leftTrackModel[992] = new ModelRendererTurbo(this, 300, 98, textureX, textureY); // Box 335
		leftTrackModel[993] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 336
		leftTrackModel[994] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 337
		leftTrackModel[995] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 338
		leftTrackModel[996] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 339
		leftTrackModel[997] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 340
		leftTrackModel[998] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 341
		leftTrackModel[999] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 342

		leftTrackModel[500].addShapeBox(15.5F, -15F, -1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 253
		leftTrackModel[500].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[500].rotateAngleZ = -0.64577182F;

		leftTrackModel[501].addShapeBox(17.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 254
		leftTrackModel[501].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[501].rotateAngleZ = -0.64577182F;

		leftTrackModel[502].addShapeBox(17.5F, -18F, -1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		leftTrackModel[502].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[502].rotateAngleZ = -0.64577182F;

		leftTrackModel[503].addShapeBox(19.5F, -18F, -1F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftTrackModel[503].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[503].rotateAngleZ = -0.64577182F;

		leftTrackModel[504].addShapeBox(19.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 257
		leftTrackModel[504].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[504].rotateAngleZ = -0.64577182F;

		leftTrackModel[505].addShapeBox(20F, -8.5F, -0.5F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 258
		leftTrackModel[505].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[505].rotateAngleX = 0.34906585F;
		leftTrackModel[505].rotateAngleY = 0.03490659F;

		leftTrackModel[506].addShapeBox(20F, -8.5F, -1.5F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		leftTrackModel[506].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[506].rotateAngleX = 0.34906585F;
		leftTrackModel[506].rotateAngleY = 0.03490659F;

		leftTrackModel[507].addShapeBox(11.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F); // Box 260
		leftTrackModel[507].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[507].rotateAngleZ = -0.64577182F;

		leftTrackModel[508].addShapeBox(11.5F, -18F, -2F, 2, 3, 1, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftTrackModel[508].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[508].rotateAngleZ = -0.64577182F;

		leftTrackModel[509].addShapeBox(13.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftTrackModel[509].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[509].rotateAngleZ = -0.64577182F;

		leftTrackModel[510].addShapeBox(13.5F, -19F, -2F, 2, 4, 1, 0F,0F, -1.5F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		leftTrackModel[510].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[510].rotateAngleZ = -0.64577182F;

		leftTrackModel[511].addShapeBox(15.5F, -19F, -3F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		leftTrackModel[511].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[511].rotateAngleZ = -0.64577182F;

		leftTrackModel[512].addShapeBox(15.5F, -15F, -3F, 2, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.7F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 265
		leftTrackModel[512].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[512].rotateAngleZ = -0.64577182F;

		leftTrackModel[513].addShapeBox(17.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F); // Box 266
		leftTrackModel[513].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[513].rotateAngleZ = -0.64577182F;

		leftTrackModel[514].addShapeBox(17.5F, -18F, -2F, 2, 3, 1, 0F,0F, -0.5F, 1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		leftTrackModel[514].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[514].rotateAngleZ = -0.64577182F;

		leftTrackModel[515].addShapeBox(19.5F, -18F, -2F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 268
		leftTrackModel[515].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[515].rotateAngleZ = -0.64577182F;

		leftTrackModel[516].addShapeBox(19.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 269
		leftTrackModel[516].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[516].rotateAngleZ = -0.64577182F;

		leftTrackModel[517].addShapeBox(21.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		leftTrackModel[517].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[517].rotateAngleZ = -0.64577182F;

		leftTrackModel[518].addShapeBox(21.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F); // Box 271
		leftTrackModel[518].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[518].rotateAngleZ = -0.64577182F;

		leftTrackModel[519].addShapeBox(22.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F); // Box 272
		leftTrackModel[519].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[519].rotateAngleZ = -0.64577182F;

		leftTrackModel[520].addShapeBox(22.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.8F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 273
		leftTrackModel[520].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[520].rotateAngleZ = -0.64577182F;

		leftTrackModel[521].addShapeBox(23.7F, -15F, -1.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, -0.35F, -0.3F, -0.3F, 0.1F, -0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.7F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0.2F, -0.2F, 0F); // Box 274
		leftTrackModel[521].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[521].rotateAngleZ = -0.64577182F;

		leftTrackModel[522].addShapeBox(23.7F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0F, -0.2F, 0F, 0.2F, 0.1F, 0.3F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F); // Box 275
		leftTrackModel[522].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[522].rotateAngleZ = -0.64577182F;

		leftTrackModel[523].addShapeBox(10F, -1F, -4F, 2, 6, 2, 0F,0F, -3F, 0F, -1F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 276
		leftTrackModel[523].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[524].addShapeBox(8F, -2F, -4F, 2, 7, 2, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		leftTrackModel[524].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[525].addShapeBox(4F, -1F, -4F, 4, 6, 2, 0F,0F, -2F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		leftTrackModel[525].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[526].addShapeBox(0F, 0F, -5F, 4, 5, 3, 0F,0F, -2F, 1F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		leftTrackModel[526].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[527].addShapeBox(-3F, 0F, -6F, 3, 5, 4, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		leftTrackModel[527].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[528].addShapeBox(-6F, 0F, -6F, 3, 5, 4, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		leftTrackModel[528].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[529].addShapeBox(-10F, 0F, -5F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		leftTrackModel[529].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[530].addShapeBox(-13F, -1F, -4F, 3, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		leftTrackModel[530].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[531].addShapeBox(-16F, 0F, -4F, 3, 5, 2, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		leftTrackModel[531].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[532].addShapeBox(-18F, 0F, -4F, 2, 5, 2, 0F,-1F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 285
		leftTrackModel[532].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[533].addShapeBox(10F, 5F, -4F, 2, 7, 2, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 286
		leftTrackModel[533].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[534].addShapeBox(8F, 5F, -4F, 2, 8, 2, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 287
		leftTrackModel[534].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[535].addShapeBox(4F, 5F, -4F, 4, 8, 2, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		leftTrackModel[535].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[536].addShapeBox(0F, 5F, -5F, 4, 8, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 289
		leftTrackModel[536].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[537].addShapeBox(-3F, 5F, -6F, 3, 7, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F); // Box 290
		leftTrackModel[537].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[538].addShapeBox(-6F, 5F, -6F, 3, 6, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 291
		leftTrackModel[538].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[539].addShapeBox(-10F, 5F, -5F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 292
		leftTrackModel[539].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[540].addShapeBox(-13F, 5F, -4F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 293
		leftTrackModel[540].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[541].addShapeBox(-16F, 5F, -4F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 294
		leftTrackModel[541].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[542].addShapeBox(-18F, 5F, -4F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -4F, -0.7F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 295
		leftTrackModel[542].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[543].addShapeBox(-1.5F, -3.5F, -6F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 1F, -0.5F); // Box 296
		leftTrackModel[543].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[544].addShapeBox(1.5F, -3.5F, -6F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F); // Box 297
		leftTrackModel[544].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[545].addShapeBox(2.5F, -2.5F, -6F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 298
		leftTrackModel[545].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[546].addShapeBox(-3.5F, -3.5F, -6F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -0.5F, 0F, -1F, 0F); // Box 299
		leftTrackModel[546].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[547].addShapeBox(-4.5F, -2.5F, -6F, 1, 5, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 300
		leftTrackModel[547].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[548].addShapeBox(-3.5F, -3.5F, -7F, 2, 7, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 301
		leftTrackModel[548].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[549].addShapeBox(-4.5F, -2.5F, -7F, 1, 5, 1, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 302
		leftTrackModel[549].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[550].addShapeBox(2.5F, -2.5F, -7F, 1, 5, 1, 0F,1F, -1.8F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 303
		leftTrackModel[550].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[551].addShapeBox(1.5F, -3.5F, -7F, 1, 7, 1, 0F,1F, -2.5F, 0F, -1F, -2.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 304
		leftTrackModel[551].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[552].addShapeBox(-1.5F, -3.5F, -7F, 3, 7, 1, 0F,0F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 305
		leftTrackModel[552].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[553].addShapeBox(-1.5F, 19F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 306
		leftTrackModel[553].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[554].addShapeBox(-1.5F, 19F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 307
		leftTrackModel[554].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[555].addShapeBox(-1.5F, 18.5F, -6.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 308
		leftTrackModel[555].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[556].addShapeBox(-1.5F, 18.5F, -5.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 309
		leftTrackModel[556].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[557].addShapeBox(-2.5F, 17.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 310
		leftTrackModel[557].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[558].addShapeBox(-2.5F, 17.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 311
		leftTrackModel[558].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[559].addShapeBox(-2.5F, 16.5F, -6.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 312
		leftTrackModel[559].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[560].addShapeBox(-2.5F, 16.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 313
		leftTrackModel[560].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[561].addShapeBox(-2.5F, 14.5F, -5.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 314
		leftTrackModel[561].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[562].addShapeBox(-2.5F, 14.5F, -6.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		leftTrackModel[562].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[563].addShapeBox(-2.5F, 11.5F, -6.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		leftTrackModel[563].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[564].addShapeBox(-2.5F, 11.5F, -5.5F, 2, 3, 1, 0F,.3F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 317
		leftTrackModel[564].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[565].addShapeBox(-3F, 10.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F, -.2F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 318
		leftTrackModel[565].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[566].addShapeBox(-3F, 10.5F, -6.5F, 3, 1, 1, 0F,-1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F); // Box 319
		leftTrackModel[566].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[567].addShapeBox(-3F, 9.5F, -6.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 320
		leftTrackModel[567].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[568].addShapeBox(-3F, 9.5F, -5.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F); // Box 321
		leftTrackModel[568].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[569].addShapeBox(-2.5F, 7.5F, -6.5F, 3, 2, 1, 0F,-0.7F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		leftTrackModel[569].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[570].addShapeBox(-2.5F, 7.5F, -5.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 323
		leftTrackModel[570].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[571].addShapeBox(-2F, 3.5F, -5.5F, 3, 4, 1, 0F,.5F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.2F, -.2F, 0F, -.2F); // Box 324
		leftTrackModel[571].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[572].addShapeBox(-2F, 3.5F, -6.5F, 3, 4, 1, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 325
		leftTrackModel[572].setRotationPoint(45F, -10F, 19F);

		leftTrackModel[573].addShapeBox(2.5F, -2.5F, -6F, 1, 9, 2, 0F,0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F); // Box 326
		leftTrackModel[573].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[574].addShapeBox(1.5F, -3.5F, -6F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 327
		leftTrackModel[574].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[575].addShapeBox(-1.5F, -3.5F, -6F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 2F, 0F, -0.5F); // Box 328
		leftTrackModel[575].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[576].addShapeBox(-3.5F, -3.5F, -6F, 2, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0.5F, -1F, -0.5F); // Box 329
		leftTrackModel[576].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[577].addShapeBox(-4.5F, -2.5F, -6F, 1, 8, 2, 0F,0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.2F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F); // Box 330
		leftTrackModel[577].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[578].addShapeBox(2.5F, -2.5F, -7F, 1, 9, 1, 0F,0F, -2.5F, 0F, 0.5F, -3F, -1F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 331
		leftTrackModel[578].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[579].addShapeBox(1.5F, -3.5F, -7F, 1, 11, 1, 0F,0F, -3.3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 332
		leftTrackModel[579].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[580].addShapeBox(-1.5F, -3.5F, -7F, 3, 10, 1, 0F,0F, -3.5F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 2F, 0F, 0F); // Box 333
		leftTrackModel[580].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[581].addShapeBox(-3.5F, -3.5F, -7F, 2, 10, 1, 0F,0F, -4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, -1F, 0F); // Box 334
		leftTrackModel[581].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[582].addShapeBox(-4.5F, -2.5F, -7F, 1, 8, 1, 0F,0.5F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.2F, -2F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.2F, -2F, 0F); // Box 335
		leftTrackModel[582].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[583].addShapeBox(-3.5F, 6.5F, -6.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 336
		leftTrackModel[583].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[584].addShapeBox(-3.5F, 6.5F, -5.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.3F, 0F, -.2F, .6F, 0F, -.2F); // Box 337
		leftTrackModel[584].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[585].addShapeBox(-4.5F, 10.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, -.4F, 0F, -.2F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.2F, 0F, -.2F, .6F, 0F, .2F); // Box 338
		leftTrackModel[585].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[586].addShapeBox(-4.5F, 10.5F, -6.5F, 3, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 339
		leftTrackModel[586].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[587].addShapeBox(-5.5F, 11.5F, -6.5F, 3, 3, 1, 0F,-0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 340
		leftTrackModel[587].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[588].addShapeBox(-5.5F, 11.5F, -5.5F, 3, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -.2F, -.4F, 0F, .2F, .2F, 0F, 0F, -.5F, 0F, 0F, -1.1F, 0F, -.2F, -.3F, 0F, -.2F); // Box 341
		leftTrackModel[588].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[589].addShapeBox(-5.5F, 14.5F, -5.5F, 2, 5, 1, 0F,.2F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 342
		leftTrackModel[589].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[590].addShapeBox(-5.5F, 14.5F, -6.5F, 2, 5, 1, 0F,-0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftTrackModel[590].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[591].addShapeBox(-5.5F, 19.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftTrackModel[591].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[592].addShapeBox(-5.5F, 19.5F, -6.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftTrackModel[592].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[593].addShapeBox(-5.5F, 20.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 346
		leftTrackModel[593].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[594].addShapeBox(-5.5F, 20.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 347
		leftTrackModel[594].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[595].addShapeBox(-4.5F, 21.5F, -5.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 348
		leftTrackModel[595].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[596].addShapeBox(-4.5F, 21.5F, -6.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 349
		leftTrackModel[596].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[597].addShapeBox(-4.5F, 22F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 350
		leftTrackModel[597].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[598].addShapeBox(-4.5F, 22F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 351
		leftTrackModel[598].setRotationPoint(23F, -13F, 19F);

		leftTrackModel[599].addShapeBox(11F, -24F, 3F, 15, 15, 1, 0F,-6.5F, -6.5F, 0F, -6.5F, -7F, 1F, -6.5F, -7F, -1.97F, -6.5F, -6.5F, -0.95F, -6.5F, -6.5F, 0F, -6.5F, -6F, 1F, -6.5F, -6F, -1.65F, -6.5F, -6.5F, -0.95F); // Box 355
		leftTrackModel[599].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[599].rotateAngleZ = -0.64577182F;

		leftTrackModel[600].addShapeBox(11F, -24F, -4F, 15, 15, 1, 0F,-6.5F, -6.5F, -0.95F, -6.5F, -7F, -1.97F, -6.5F, -7F, 1F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, -0.95F, -6.5F, -6F, -1.65F, -6.5F, -6F, 1F, -6.5F, -6.5F, 0F); // Box 356
		leftTrackModel[600].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[600].rotateAngleZ = -0.64577182F;

		leftTrackModel[601].addShapeBox(21F, -16F, -1.5F, 1, 1, 3, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F); // Box 366
		leftTrackModel[601].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[601].rotateAngleZ = -0.64577182F;

		leftTrackModel[602].addShapeBox(21F, -17F, 0F, 1, 1, 1, 0F,0F, .4F, 0F, 0F, .2F, 0F, 0F, -.4F, .5F, 0F, -.2F, .7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F); // Box 367
		leftTrackModel[602].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[602].rotateAngleZ = -0.64577182F;

		leftTrackModel[603].addShapeBox(21F, -15F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F); // Box 368
		leftTrackModel[603].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[603].rotateAngleZ = -0.64577182F;

		leftTrackModel[604].addShapeBox(21F, -17F, -1F, 1, 1, 1, 0F,0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		leftTrackModel[604].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[604].rotateAngleZ = -0.64577182F;

		leftTrackModel[605].addShapeBox(21F, -14.3F, -1F, 1, 1, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F); // Box 370
		leftTrackModel[605].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[605].rotateAngleZ = -0.64577182F;

		leftTrackModel[606].addShapeBox(21F, -14.3F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0.7F); // Box 371
		leftTrackModel[606].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[606].rotateAngleZ = -0.64577182F;

		leftTrackModel[607].addShapeBox(19.5F, -15.5F, -2F, 2, 1, 4, 0F,0F, 0F, .3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, .3F, 0F, -.5F, .4F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, .4F); // Box 372
		leftTrackModel[607].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[607].rotateAngleZ = -0.64577182F;

		leftTrackModel[608].addShapeBox(17.5F, -15.5F, -3F, 2, 1, 6, 0F,0F, 0F, .2F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, .2F, 0F, -.5F, .4F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, .4F); // Box 373
		leftTrackModel[608].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[608].rotateAngleZ = -0.64577182F;

		leftTrackModel[609].addShapeBox(15.5F, -15.5F, -3.5F, 2, 1, 7, 0F,0F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F); // Box 374
		leftTrackModel[609].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[609].rotateAngleZ = -0.64577182F;

		leftTrackModel[610].addShapeBox(13.5F, -16F, -3.5F, 2, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F); // Box 375
		leftTrackModel[610].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[610].rotateAngleZ = -0.64577182F;

		leftTrackModel[611].addShapeBox(11.5F, -16F, -2.5F, 2, 1, 5, 0F,.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -.5F, .6F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, .6F, -.5F, -.5F); // Box 376
		leftTrackModel[611].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[611].rotateAngleZ = -0.64577182F;

		leftTrackModel[612].addShapeBox(14.5F, -18F, -3.5F, 1, 2, 7, 0F,-.5F, 0F, -.6F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.6F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.25F); // Box 377
		leftTrackModel[612].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[612].rotateAngleZ = -0.64577182F;

		leftTrackModel[613].addShapeBox(14.5F, -19F, -3F, 1, 1, 6, 0F,-.5F, .1F, -2F, 0F, .1F, -2F, 0F, .1F, -2F, -.5F, .1F, -2F, -.5F, 0F, -.1F, 0F, 0F, .2F, 0F, 0F, .2F, -.5F, 0F, -.1F); // Box 378
		leftTrackModel[613].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[613].rotateAngleZ = -0.64577182F;

		leftTrackModel[614].addShapeBox(25F, 2.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F); // Box 380
		leftTrackModel[614].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[615].addShapeBox(25F, 3.5F, 1.5F, 1, 2, 1, 0F,0F, .5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, .5F, -.2F, 2F, -.5F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 2F, -.5F, 1F); // Box 381
		leftTrackModel[615].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[616].addShapeBox(23F, 5.5F, 2.5F, 1, 3, 1, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 5F, -1F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, 2.5F, 5F, -1F, 2.5F); // Box 382
		leftTrackModel[616].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[617].addShapeBox(13F, 7.5F, 5F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 383
		leftTrackModel[617].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[618].addShapeBox(8F, 6.5F, 6.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, .5F, 4F, -1F, .5F, 4F, -1F, -.5F, -5F, 0F, -.5F); // Box 384
		leftTrackModel[618].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[619].addShapeBox(6F, 3.5F, 6.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 385
		leftTrackModel[619].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[620].addShapeBox(6F, -0.5F, 6.5F, 1, 4, 1, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 386
		leftTrackModel[620].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[621].addShapeBox(6F, -3.5F, 6.5F, 1, 3, 1, 0F,0F, -.3F, 2F, 0F, -.3F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftTrackModel[621].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[622].addShapeBox(6F, -5.5F, 4.5F, 1, 2, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		leftTrackModel[622].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[623].addShapeBox(6F, -5.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftTrackModel[623].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[624].addShapeBox(25F, 1.5F, 1.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		leftTrackModel[624].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[625].addShapeBox(25F, 0.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 391
		leftTrackModel[625].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[626].addShapeBox(25F, 0.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 392
		leftTrackModel[626].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[627].addShapeBox(25F, 1.5F, -2.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		leftTrackModel[627].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[628].addShapeBox(25F, 2.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F); // Box 394
		leftTrackModel[628].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[629].addShapeBox(25F, 3.5F, -2.5F, 1, 2, 1, 0F,0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 2F, -0.5F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, -0.5F, -1F); // Box 395
		leftTrackModel[629].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[630].addShapeBox(23F, 5.5F, -3.5F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 5F, -1F, 2.5F, -6F, 0F, 2.5F, -6F, 0F, -2.5F, 5F, -1F, -2.5F); // Box 396
		leftTrackModel[630].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[631].addShapeBox(13F, 7.5F, -6F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 397
		leftTrackModel[631].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[632].addShapeBox(8F, 6.5F, -7.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 4F, -1F, -0.5F, 4F, -1F, 0.5F, -5F, 0F, 0.5F); // Box 398
		leftTrackModel[632].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[633].addShapeBox(6F, 3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 399
		leftTrackModel[633].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[634].addShapeBox(6F, -0.5F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 400
		leftTrackModel[634].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[635].addShapeBox(6F, -3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 401
		leftTrackModel[635].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[636].addShapeBox(6F, -5.5F, -5.5F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 402
		leftTrackModel[636].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[637].addShapeBox(4.5F, -2.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F); // Box 405
		leftTrackModel[637].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[638].addShapeBox(4.5F, 1F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		leftTrackModel[638].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[638].rotateAngleZ = 0.62831853F;

		leftTrackModel[639].addShapeBox(4.5F, 1F, 2F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 407
		leftTrackModel[639].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[639].rotateAngleZ = 0.62831853F;

		leftTrackModel[640].addShapeBox(4.5F, 4F, 5F, 1, 3, 1, 0F,0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		leftTrackModel[640].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[640].rotateAngleZ = 0.62831853F;

		leftTrackModel[641].addShapeBox(14.5F, 4F, -1.5F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 409
		leftTrackModel[641].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[641].rotateAngleZ = -0.34906585F;

		leftTrackModel[642].addShapeBox(14.5F, 3F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F); // Box 410
		leftTrackModel[642].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[642].rotateAngleZ = -0.34906585F;

		leftTrackModel[643].addShapeBox(4.5F, 6.5F, 5F, 1, 5, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 411
		leftTrackModel[643].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[643].rotateAngleZ = 0.62831853F;

		leftTrackModel[644].addShapeBox(-3F, 0F, 0F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 412
		leftTrackModel[644].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[645].addShapeBox(4.5F, 11.5F, 5F, 1, 3, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 413
		leftTrackModel[645].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[645].rotateAngleZ = 0.62831853F;

		leftTrackModel[646].addShapeBox(4.5F, 14.5F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 414
		leftTrackModel[646].setRotationPoint(37F, -19F, 15F);
		leftTrackModel[646].rotateAngleZ = 0.62831853F;

		leftTrackModel[647].addShapeBox(0.5F, 10.5F, 5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 415
		leftTrackModel[647].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[648].addShapeBox(0.5F, 3.5F, 5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		leftTrackModel[648].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[649].addShapeBox(0.5F, 12.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 417
		leftTrackModel[649].setRotationPoint(37F, -19F, 15F);

		leftTrackModel[650].addShapeBox(4.5F, -2.5F, -1F, 1, 1, 2, 0F,0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		leftTrackModel[650].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[651].addShapeBox(14.5F, 3F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 419
		leftTrackModel[651].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[651].rotateAngleZ = -0.34906585F;

		leftTrackModel[652].addShapeBox(14.5F, 5F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F); // Box 420
		leftTrackModel[652].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[652].rotateAngleZ = -0.34906585F;

		leftTrackModel[653].addShapeBox(14.5F, 5F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F); // Box 421
		leftTrackModel[653].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[653].rotateAngleZ = -0.34906585F;

		leftTrackModel[654].addShapeBox(14.5F, 4F, 0.5F, 1, 1, 1, 0F,0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 422
		leftTrackModel[654].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[654].rotateAngleZ = -0.34906585F;

		leftTrackModel[655].addShapeBox(14.5F, 3F, -0.5F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 423
		leftTrackModel[655].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[655].rotateAngleZ = -0.34906585F;

		leftTrackModel[656].addShapeBox(14.5F, 5F, -0.5F, 1, 1, 1, 0F,0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 424
		leftTrackModel[656].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[656].rotateAngleZ = -0.34906585F;

		leftTrackModel[657].addShapeBox(4.5F, 1F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		leftTrackModel[657].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[657].rotateAngleZ = 0.62831853F;

		leftTrackModel[658].addShapeBox(4.5F, 1F, -5F, 1, 1, 3, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		leftTrackModel[658].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[658].rotateAngleZ = 0.62831853F;

		leftTrackModel[659].addShapeBox(4.5F, 4F, -6F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		leftTrackModel[659].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[659].rotateAngleZ = 0.62831853F;

		leftTrackModel[660].addShapeBox(4.5F, 6.5F, -6F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 437
		leftTrackModel[660].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[660].rotateAngleZ = 0.62831853F;

		leftTrackModel[661].addShapeBox(4.5F, 11.5F, -6F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 438
		leftTrackModel[661].setRotationPoint(37F, -19F, 17F);
		leftTrackModel[661].rotateAngleZ = 0.62831853F;

		leftTrackModel[662].addShapeBox(0.5F, 7.5F, 5F, 1, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		leftTrackModel[662].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[663].addShapeBox(0.5F, 3.5F, -6.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		leftTrackModel[663].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[664].addShapeBox(0.5F, 7.5F, -6F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		leftTrackModel[664].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[665].addShapeBox(0.5F, 10.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 442
		leftTrackModel[665].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[666].addShapeBox(-4.5F, 3.5F, -6.5F, 1, 4, 1, 0F,0F, 0F, .05F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		leftTrackModel[666].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[667].addShapeBox(-4.5F, 7.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		leftTrackModel[667].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[668].addShapeBox(-4.5F, 9.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 445
		leftTrackModel[668].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[669].addShapeBox(-4.5F, 11.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 446
		leftTrackModel[669].setRotationPoint(37F, -19F, 15F);

		leftTrackModel[670].addShapeBox(-4.5F, 9.5F, 5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 447
		leftTrackModel[670].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[671].addShapeBox(-4.5F, 7.5F, 5F, 1, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		leftTrackModel[671].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[672].addShapeBox(-4.5F, 3.5F, 5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		leftTrackModel[672].setRotationPoint(37F, -19F, 17F);

		leftTrackModel[673].addShapeBox(4.5F, 14.5F, 3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		leftTrackModel[673].setRotationPoint(37F, -19F, 15F);
		leftTrackModel[673].rotateAngleZ = 0.62831853F;

		leftTrackModel[674].addShapeBox(0.5F, 12.5F, 1.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		leftTrackModel[674].setRotationPoint(37F, -19F, 15F);

		leftTrackModel[675].addShapeBox(-3.5F, 11.5F, 1.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 452
		leftTrackModel[675].setRotationPoint(37F, -19F, 15F);

		leftTrackModel[676].addShapeBox(8.5F, 12.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 453
		leftTrackModel[676].setRotationPoint(37F, -19F, 15F);

		leftTrackModel[677].addShapeBox(11.5F, 10.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 454
		leftTrackModel[677].setRotationPoint(37F, -19F, 15F);

		leftTrackModel[678].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 92
		leftTrackModel[678].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[679].addShapeBox(4F, -1F, 0F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftTrackModel[679].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[680].addShapeBox(8F, -2F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 94
		leftTrackModel[680].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[681].addShapeBox(10F, 5F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 95
		leftTrackModel[681].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[682].addShapeBox(-10F, 0F, 0F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 96
		leftTrackModel[682].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[683].addShapeBox(-13F, -1F, 0F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 97
		leftTrackModel[683].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[684].addShapeBox(-16F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 98
		leftTrackModel[684].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[685].addShapeBox(-18F, 5F, 0F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 99
		leftTrackModel[685].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[686].addShapeBox(-6F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 100
		leftTrackModel[686].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[687].addShapeBox(-2F, 3.5F, 1.5F, 3, 4, 1, 0F,.5F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.2F, -.2F, 0F, -.2F); // Box 101
		leftTrackModel[687].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[688].addShapeBox(-2.5F, 7.5F, 1.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 102
		leftTrackModel[688].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[689].addShapeBox(-3F, 9.5F, 1.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F); // Box 103
		leftTrackModel[689].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[690].addShapeBox(-3F, 10.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F, -.2F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 104
		leftTrackModel[690].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[691].addShapeBox(-2.5F, 11.5F, 1.5F, 2, 3, 1, 0F,.3F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 105
		leftTrackModel[691].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[692].addShapeBox(-2.5F, 14.5F, 1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 106
		leftTrackModel[692].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[693].addShapeBox(-2.5F, 16.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 107
		leftTrackModel[693].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[694].addShapeBox(-1.5F, 18.5F, 1.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 108
		leftTrackModel[694].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[695].addShapeBox(-2.5F, 17.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 109
		leftTrackModel[695].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[696].addShapeBox(-1.5F, 19F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 110
		leftTrackModel[696].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[697].addShapeBox(10F, -4F, 0F, 3, 11, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 111
		leftTrackModel[697].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[698].addShapeBox(13F, -5F, 0F, 3, 9, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 112
		leftTrackModel[698].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[699].addShapeBox(16F, -6F, 0F, 3, 6, 1, 0F,0F, -.5F, 0F, 0F, -.1F, 0F, -.2F, -.15F, 0F, 0F, -.5F, 0F, 0F, 3F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, 3F, 0F); // Box 113
		leftTrackModel[699].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[700].addShapeBox(8F, -3F, 0F, 2, 9, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackModel[700].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[701].addShapeBox(-18F, 0F, 0F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 115
		leftTrackModel[701].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[702].addShapeBox(23.7F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.1F, -.7F, 0F, 0F, -.2F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .1F, 0F); // Box 116
		leftTrackModel[702].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[702].rotateAngleZ = -0.64577182F;

		leftTrackModel[703].addShapeBox(19.5F, -18F, 0F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 119
		leftTrackModel[703].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[703].rotateAngleZ = -0.64577182F;

		leftTrackModel[704].addShapeBox(17.5F, -18F, 0F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftTrackModel[704].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[704].rotateAngleZ = -0.64577182F;

		leftTrackModel[705].addShapeBox(15.5F, -19F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftTrackModel[705].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[705].rotateAngleZ = -0.64577182F;

		leftTrackModel[706].addShapeBox(13.5F, -19F, 0F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftTrackModel[706].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[706].rotateAngleZ = -0.64577182F;

		leftTrackModel[707].addShapeBox(23.7F, -15F, -0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, 0.1F, -.3F, 0F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, .2F, -0.2F, 0F); // Box 128
		leftTrackModel[707].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[707].rotateAngleZ = -0.64577182F;

		leftTrackModel[708].addShapeBox(11.5F, -18F, 0F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		leftTrackModel[708].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[708].rotateAngleZ = -0.64577182F;

		leftTrackModel[709].addShapeBox(10F, 2F, 1F, 3, 5, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 130
		leftTrackModel[709].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[710].addShapeBox(13F, 1F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -.5F, 2F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 131
		leftTrackModel[710].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[711].addShapeBox(16F, -3F, 1F, 3, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 3F, 0F, 1F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 2F, 0F); // Box 132
		leftTrackModel[711].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[712].addShapeBox(8F, -3F, 1F, 2, 7, 1, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 2F); // Box 133
		leftTrackModel[712].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[713].addShapeBox(10F, -4F, 1F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2F, 0F, 0F, 2F); // Box 134
		leftTrackModel[713].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[714].addShapeBox(13F, -5F, 1F, 3, 6, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, .5F, 2F); // Box 135
		leftTrackModel[714].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[715].addShapeBox(16F, -6F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, -.2F, -.15F, 0F, -.5F, -.53F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F); // Box 136
		leftTrackModel[715].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[716].addShapeBox(11.5F, -18F, 1F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F); // Box 137
		leftTrackModel[716].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[716].rotateAngleZ = -0.64577182F;

		leftTrackModel[717].addShapeBox(13.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 1F, 0F, -.8F, 0F); // Box 139
		leftTrackModel[717].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[717].rotateAngleZ = -0.64577182F;

		leftTrackModel[718].addShapeBox(13.5F, -19F, 1F, 2, 4, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F); // Box 140
		leftTrackModel[718].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[718].rotateAngleZ = -0.64577182F;

		leftTrackModel[719].addShapeBox(15.5F, -19F, 1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 141
		leftTrackModel[719].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[719].rotateAngleZ = -0.64577182F;

		leftTrackModel[720].addShapeBox(15.5F, -15F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.7F, 0F, 0F, -.8F, 0F); // Box 142
		leftTrackModel[720].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[720].rotateAngleZ = -0.64577182F;

		leftTrackModel[721].addShapeBox(17.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.7F, 1F); // Box 143
		leftTrackModel[721].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[721].rotateAngleZ = -0.64577182F;

		leftTrackModel[722].addShapeBox(17.5F, -18F, 1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F); // Box 144
		leftTrackModel[722].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[722].rotateAngleZ = -0.64577182F;

		leftTrackModel[723].addShapeBox(19.5F, -18F, 1F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, .5F, 0F, -1.5F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F); // Box 145
		leftTrackModel[723].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[723].rotateAngleZ = -0.64577182F;

		leftTrackModel[724].addShapeBox(19.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.8F, -.5F, 0F, -.5F, 0F); // Box 146
		leftTrackModel[724].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[724].rotateAngleZ = -0.64577182F;

		leftTrackModel[725].addShapeBox(-3F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 147
		leftTrackModel[725].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[726].addShapeBox(-3F, 5F, 2F, 3, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 148
		leftTrackModel[726].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[727].addShapeBox(-6F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 149
		leftTrackModel[727].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[728].addShapeBox(-6F, 5F, 2F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 150
		leftTrackModel[728].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[729].addShapeBox(-13F, -1F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 151
		leftTrackModel[729].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[730].addShapeBox(-10F, 0F, 2F, 4, 5, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 152
		leftTrackModel[730].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[731].addShapeBox(-16F, 0F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftTrackModel[731].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[732].addShapeBox(-18F, 0F, 2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -3F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 154
		leftTrackModel[732].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[733].addShapeBox(-18F, 5F, 2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, -1F, -4F, -.7F); // Box 155
		leftTrackModel[733].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[734].addShapeBox(-13F, 5F, 2F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -4F, .5F, 0F, -3F, 0F); // Box 157
		leftTrackModel[734].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[735].addShapeBox(-10F, 5F, 2F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -3F, -.5F); // Box 158
		leftTrackModel[735].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[736].addShapeBox(0F, 5F, 2F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F); // Box 159
		leftTrackModel[736].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[737].addShapeBox(4F, 5F, 2F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 1F); // Box 160
		leftTrackModel[737].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[738].addShapeBox(0F, 0F, 2F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 161
		leftTrackModel[738].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[739].addShapeBox(4F, -1F, 2F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 162
		leftTrackModel[739].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[740].addShapeBox(10F, 5F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, .5F, -2F, 0F, -.5F, -5F, 0F, 0F, -3.5F, 0F); // Box 164
		leftTrackModel[740].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[741].addShapeBox(10F, -1F, 2F, 2, 6, 2, 0F,0F, 0F, 0F, .5F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 165
		leftTrackModel[741].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[742].addShapeBox(8F, -2F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F); // Box 166
		leftTrackModel[742].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[743].addShapeBox(21.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.8F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftTrackModel[743].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[743].rotateAngleZ = -0.64577182F;

		leftTrackModel[744].addShapeBox(21.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 168
		leftTrackModel[744].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[744].rotateAngleZ = -0.64577182F;

		leftTrackModel[745].addShapeBox(20F, -8F, -1F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 169
		leftTrackModel[745].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[745].rotateAngleX = -0.34906585F;
		leftTrackModel[745].rotateAngleY = 0.03490659F;

		leftTrackModel[746].addShapeBox(22.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.5F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, .3F, 0F, 0F, 0F); // Box 170
		leftTrackModel[746].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[746].rotateAngleZ = -0.64577182F;

		leftTrackModel[747].addShapeBox(22.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.7F, 0F, 0F, -.8F, 0F); // Box 171
		leftTrackModel[747].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[747].rotateAngleZ = -0.64577182F;

		leftTrackModel[748].addShapeBox(23.7F, -15F, 0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, -.35F, -.3F, -.3F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -.5F, -1F, -.5F, .2F, -.7F, 0F); // Box 172
		leftTrackModel[748].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[748].rotateAngleZ = -0.64577182F;

		leftTrackModel[749].addShapeBox(23.7F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.5F, -1F, -.5F, 0F, -.5F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, -.2F, .2F, -.2F, .2F, .1F, .3F); // Box 173
		leftTrackModel[749].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[749].rotateAngleZ = -0.64577182F;

		leftTrackModel[750].addShapeBox(20F, -8F, -2F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		leftTrackModel[750].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[750].rotateAngleX = -0.34906585F;
		leftTrackModel[750].rotateAngleY = 0.03490659F;

		leftTrackModel[751].addShapeBox(-18F, 0F, -1F, 2, 2, 2, 0F,0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 175
		leftTrackModel[751].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[752].addShapeBox(-14.5F, -13.5F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 176
		leftTrackModel[752].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[752].rotateAngleZ = 0.85521133F;

		leftTrackModel[753].addShapeBox(-13.3F, -18.5F, -2F, 4, 4, 4, 0F,0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F); // Box 177
		leftTrackModel[753].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[753].rotateAngleZ = 1.18682389F;

		leftTrackModel[754].addShapeBox(-13.6F, -20.2F, -2F, 3, 4, 4, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 178
		leftTrackModel[754].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[754].rotateAngleZ = 1.32645023F;

		leftTrackModel[755].addShapeBox(-15.6F, -21.9F, -2F, 5, 4, 4, 0F,0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F); // Box 179
		leftTrackModel[755].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[755].rotateAngleZ = 1.46607657F;

		leftTrackModel[756].addShapeBox(1.5F, -3.5F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 180
		leftTrackModel[756].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[757].addShapeBox(2.5F, -2.5F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 181
		leftTrackModel[757].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[758].addShapeBox(-3.5F, -3.5F, 0F, 2, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .5F, -1F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, .5F, -1F, 0F); // Box 183
		leftTrackModel[758].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[759].addShapeBox(-4.5F, -2.5F, 0F, 1, 8, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -4F, 0F, 0F, -2F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, .2F, -2F, 0F); // Box 184
		leftTrackModel[759].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[760].addShapeBox(-3.5F, -3.5F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, -.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 186
		leftTrackModel[760].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[761].addShapeBox(-1.5F, -3.5F, 0F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 187
		leftTrackModel[761].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[762].addShapeBox(1.5F, -3.5F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 188
		leftTrackModel[762].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[763].addShapeBox(2.5F, -2.5F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 189
		leftTrackModel[763].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[764].addShapeBox(1.5F, -3.5F, 2F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F); // Box 190
		leftTrackModel[764].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[765].addShapeBox(2.5F, -2.5F, 2F, 1, 9, 1, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -.5F); // Box 191
		leftTrackModel[765].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[766].addShapeBox(-1.5F, -3.5F, 2F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.3F, 0F, 0F, -3.5F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -.5F, 2F, 0F, -.5F); // Box 192
		leftTrackModel[766].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[767].addShapeBox(-3.5F, -3.5F, 2F, 2, 10, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, .5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -.5F, .5F, -1F, -.5F); // Box 193
		leftTrackModel[767].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[768].addShapeBox(-4.5F, -2.5F, 2F, 1, 8, 1, 0F,.5F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, .5F, -4F, -1F, .2F, -2F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, .2F, -2F, -1F); // Box 194
		leftTrackModel[768].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[769].addShapeBox(1.5F, -3.5F, 2F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -2.8F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F); // Box 195
		leftTrackModel[769].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[770].addShapeBox(2.5F, -2.5F, 2F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 1F, -1.8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -.5F); // Box 196
		leftTrackModel[770].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[771].addShapeBox(-3.5F, -3.5F, 2F, 2, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -.5F, 0F, -1F, -.5F); // Box 197
		leftTrackModel[771].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[772].addShapeBox(-1.5F, -3.5F, 2F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 1F, -.5F); // Box 199
		leftTrackModel[772].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[773].addShapeBox(-1.5F, 18.5F, 0.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 200
		leftTrackModel[773].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[774].addShapeBox(-2.5F, 17.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 201
		leftTrackModel[774].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[775].addShapeBox(-2F, 3.5F, 0.5F, 3, 4, 1, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 202
		leftTrackModel[775].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[776].addShapeBox(-2.5F, 7.5F, 0.5F, 3, 2, 1, 0F,-0.7F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftTrackModel[776].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[777].addShapeBox(-2.5F, 11.5F, 0.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackModel[777].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[778].addShapeBox(-2.5F, 14.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		leftTrackModel[778].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[779].addShapeBox(-2.5F, 16.5F, 0.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftTrackModel[779].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[780].addShapeBox(-3F, 10.5F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F); // Box 207
		leftTrackModel[780].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[781].addShapeBox(-3F, 9.5F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 208
		leftTrackModel[781].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[782].addShapeBox(-4.5F, 22F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 209
		leftTrackModel[782].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[783].addShapeBox(-4.5F, 21.5F, 1.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 210
		leftTrackModel[783].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[784].addShapeBox(-5.5F, 20.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 211
		leftTrackModel[784].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[785].addShapeBox(-5.5F, 19.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 212
		leftTrackModel[785].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[786].addShapeBox(-1.5F, 19F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 213
		leftTrackModel[786].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[787].addShapeBox(-5.5F, 14.5F, 1.5F, 2, 5, 1, 0F,.2F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 214
		leftTrackModel[787].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[788].addShapeBox(-5.5F, 11.5F, 1.5F, 3, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -.2F, -.4F, 0F, .2F, .2F, 0F, 0F, -.5F, 0F, 0F, -1.1F, 0F, -.2F, -.3F, 0F, -.2F); // Box 215
		leftTrackModel[788].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[789].addShapeBox(-4.5F, 10.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, -.4F, 0F, -.2F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.2F, 0F, -.2F, .6F, 0F, .2F); // Box 216
		leftTrackModel[789].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[790].addShapeBox(-3.5F, 6.5F, 1.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.3F, 0F, -.2F, .6F, 0F, -.2F); // Box 217
		leftTrackModel[790].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[791].addShapeBox(-27.89F, -15.79F, 0F, 7, 4, 2, 0F,2F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, .5F, -.5F, -.5F, .5F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -.5F, -.5F, -.5F); // Box 218
		leftTrackModel[791].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[791].rotateAngleZ = 1.13446401F;

		leftTrackModel[792].addShapeBox(-4.5F, 22F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 219
		leftTrackModel[792].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[793].addShapeBox(-4.5F, 21.5F, 0.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 220
		leftTrackModel[793].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[794].addShapeBox(-5.5F, 20.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 221
		leftTrackModel[794].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[795].addShapeBox(-5.5F, 19.5F, 0.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 222
		leftTrackModel[795].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[796].addShapeBox(-5.5F, 14.5F, 0.5F, 2, 5, 1, 0F,-0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		leftTrackModel[796].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[797].addShapeBox(-5.5F, 11.5F, 0.5F, 3, 3, 1, 0F,-0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 224
		leftTrackModel[797].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[798].addShapeBox(-4.5F, 10.5F, 0.5F, 3, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 225
		leftTrackModel[798].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[799].addShapeBox(-3.5F, 6.5F, 0.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 226
		leftTrackModel[799].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[800].addShapeBox(-27.89F, -15.79F, -2F, 7, 4, 2, 0F,0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 2F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 227
		leftTrackModel[800].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[800].rotateAngleZ = 1.13446401F;

		leftTrackModel[801].addShapeBox(-18F, 0F, -2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 228
		leftTrackModel[801].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[802].addShapeBox(-18F, 5F, -2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 229
		leftTrackModel[802].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[803].addShapeBox(-16F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 230
		leftTrackModel[803].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[804].addShapeBox(-13F, -1F, -2F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 231
		leftTrackModel[804].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[805].addShapeBox(-10F, 0F, -2F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 232
		leftTrackModel[805].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[806].addShapeBox(-6F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 233
		leftTrackModel[806].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[807].addShapeBox(-3F, 0F, -2F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 234
		leftTrackModel[807].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[808].addShapeBox(0F, 0F, -2F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 235
		leftTrackModel[808].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[809].addShapeBox(4F, -1F, -2F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftTrackModel[809].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[810].addShapeBox(8F, -2F, -2F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 237
		leftTrackModel[810].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[811].addShapeBox(10F, 5F, -2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 238
		leftTrackModel[811].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[812].addShapeBox(10F, -4F, -1F, 3, 11, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 239
		leftTrackModel[812].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[813].addShapeBox(13F, -5F, -1F, 3, 9, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 240
		leftTrackModel[813].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[814].addShapeBox(16F, -6F, -1F, 3, 6, 1, 0F,0F, -0.5F, 0F, -0.2F, -0.15F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 241
		leftTrackModel[814].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[815].addShapeBox(8F, -3F, -1F, 2, 9, 1, 0F,0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 242
		leftTrackModel[815].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[816].addShapeBox(16F, -6F, -2F, 3, 3, 1, 0F,0F, -1.5F, 0F, -0.5F, -0.53F, 0F, -0.2F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 243
		leftTrackModel[816].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[817].addShapeBox(16F, -3F, -2F, 3, 3, 1, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0.5F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 244
		leftTrackModel[817].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[818].addShapeBox(13F, -5F, -2F, 3, 6, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 245
		leftTrackModel[818].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[819].addShapeBox(13F, 1F, -2F, 3, 3, 1, 0F,0F, -0.5F, 2F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 246
		leftTrackModel[819].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[820].addShapeBox(10F, -4F, -2F, 3, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 247
		leftTrackModel[820].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[821].addShapeBox(10F, 2F, -2F, 3, 5, 1, 0F,0F, -1F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 248
		leftTrackModel[821].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[822].addShapeBox(8F, -3F, -2F, 2, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 249
		leftTrackModel[822].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[823].addShapeBox(11.5F, -18F, -1F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftTrackModel[823].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[823].rotateAngleZ = -0.64577182F;

		leftTrackModel[824].addShapeBox(13.5F, -19F, -1F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftTrackModel[824].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[824].rotateAngleZ = -0.64577182F;

		leftTrackModel[825].addShapeBox(15.5F, -19F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		leftTrackModel[825].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[825].rotateAngleZ = -0.64577182F;

		leftTrackModel[826].addShapeBox(17.5F, -18F, -1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		leftTrackModel[826].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[826].rotateAngleZ = -0.64577182F;

		leftTrackModel[827].addShapeBox(19.5F, -18F, -1F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftTrackModel[827].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[827].rotateAngleZ = -0.64577182F;

		leftTrackModel[828].addShapeBox(20F, -8.5F, -0.5F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 258
		leftTrackModel[828].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[828].rotateAngleX = 0.34906585F;
		leftTrackModel[828].rotateAngleY = 0.03490659F;

		leftTrackModel[829].addShapeBox(20F, -8.5F, -1.5F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		leftTrackModel[829].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[829].rotateAngleX = 0.34906585F;
		leftTrackModel[829].rotateAngleY = 0.03490659F;

		leftTrackModel[830].addShapeBox(11.5F, -18F, -2F, 2, 3, 1, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftTrackModel[830].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[830].rotateAngleZ = -0.64577182F;

		leftTrackModel[831].addShapeBox(13.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftTrackModel[831].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[831].rotateAngleZ = -0.64577182F;

		leftTrackModel[832].addShapeBox(13.5F, -19F, -2F, 2, 4, 1, 0F,0F, -1.5F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		leftTrackModel[832].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[832].rotateAngleZ = -0.64577182F;

		leftTrackModel[833].addShapeBox(15.5F, -19F, -3F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		leftTrackModel[833].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[833].rotateAngleZ = -0.64577182F;

		leftTrackModel[834].addShapeBox(15.5F, -15F, -3F, 2, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.7F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 265
		leftTrackModel[834].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[834].rotateAngleZ = -0.64577182F;

		leftTrackModel[835].addShapeBox(17.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F); // Box 266
		leftTrackModel[835].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[835].rotateAngleZ = -0.64577182F;

		leftTrackModel[836].addShapeBox(17.5F, -18F, -2F, 2, 3, 1, 0F,0F, -0.5F, 1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		leftTrackModel[836].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[836].rotateAngleZ = -0.64577182F;

		leftTrackModel[837].addShapeBox(19.5F, -18F, -2F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 268
		leftTrackModel[837].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[837].rotateAngleZ = -0.64577182F;

		leftTrackModel[838].addShapeBox(19.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 269
		leftTrackModel[838].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[838].rotateAngleZ = -0.64577182F;

		leftTrackModel[839].addShapeBox(21.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		leftTrackModel[839].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[839].rotateAngleZ = -0.64577182F;

		leftTrackModel[840].addShapeBox(21.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F); // Box 271
		leftTrackModel[840].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[840].rotateAngleZ = -0.64577182F;

		leftTrackModel[841].addShapeBox(22.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F); // Box 272
		leftTrackModel[841].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[841].rotateAngleZ = -0.64577182F;

		leftTrackModel[842].addShapeBox(22.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.8F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 273
		leftTrackModel[842].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[842].rotateAngleZ = -0.64577182F;

		leftTrackModel[843].addShapeBox(23.7F, -15F, -1.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, -0.35F, -0.3F, -0.3F, 0.1F, -0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.7F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0.2F, -0.2F, 0F); // Box 274
		leftTrackModel[843].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[843].rotateAngleZ = -0.64577182F;

		leftTrackModel[844].addShapeBox(23.7F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0F, -0.2F, 0F, 0.2F, 0.1F, 0.3F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F); // Box 275
		leftTrackModel[844].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[844].rotateAngleZ = -0.64577182F;

		leftTrackModel[845].addShapeBox(10F, -1F, -4F, 2, 6, 2, 0F,0F, -3F, 0F, -1F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 276
		leftTrackModel[845].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[846].addShapeBox(8F, -2F, -4F, 2, 7, 2, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		leftTrackModel[846].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[847].addShapeBox(4F, -1F, -4F, 4, 6, 2, 0F,0F, -2F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		leftTrackModel[847].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[848].addShapeBox(0F, 0F, -5F, 4, 5, 3, 0F,0F, -2F, 1F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		leftTrackModel[848].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[849].addShapeBox(-3F, 0F, -6F, 3, 5, 4, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		leftTrackModel[849].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[850].addShapeBox(-6F, 0F, -6F, 3, 5, 4, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		leftTrackModel[850].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[851].addShapeBox(-10F, 0F, -5F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		leftTrackModel[851].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[852].addShapeBox(-13F, -1F, -4F, 3, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		leftTrackModel[852].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[853].addShapeBox(-16F, 0F, -4F, 3, 5, 2, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		leftTrackModel[853].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[854].addShapeBox(-18F, 0F, -4F, 2, 5, 2, 0F,-1F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 285
		leftTrackModel[854].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[855].addShapeBox(10F, 5F, -4F, 2, 7, 2, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 286
		leftTrackModel[855].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[856].addShapeBox(8F, 5F, -4F, 2, 8, 2, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 287
		leftTrackModel[856].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[857].addShapeBox(4F, 5F, -4F, 4, 8, 2, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		leftTrackModel[857].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[858].addShapeBox(0F, 5F, -5F, 4, 8, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 289
		leftTrackModel[858].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[859].addShapeBox(-3F, 5F, -6F, 3, 7, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F); // Box 290
		leftTrackModel[859].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[860].addShapeBox(-6F, 5F, -6F, 3, 6, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 291
		leftTrackModel[860].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[861].addShapeBox(-10F, 5F, -5F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 292
		leftTrackModel[861].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[862].addShapeBox(-18F, 5F, -4F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -4F, -0.7F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 295
		leftTrackModel[862].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[863].addShapeBox(-1.5F, -3.5F, -6F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 1F, -0.5F); // Box 296
		leftTrackModel[863].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[864].addShapeBox(1.5F, -3.5F, -6F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F); // Box 297
		leftTrackModel[864].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[865].addShapeBox(2.5F, -2.5F, -6F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 298
		leftTrackModel[865].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[866].addShapeBox(-3.5F, -3.5F, -6F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -0.5F, 0F, -1F, 0F); // Box 299
		leftTrackModel[866].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[867].addShapeBox(-3.5F, -3.5F, -7F, 2, 7, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 301
		leftTrackModel[867].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[868].addShapeBox(2.5F, -2.5F, -7F, 1, 5, 1, 0F,1F, -1.8F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 303
		leftTrackModel[868].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[869].addShapeBox(1.5F, -3.5F, -7F, 1, 7, 1, 0F,1F, -2.5F, 0F, -1F, -2.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 304
		leftTrackModel[869].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[870].addShapeBox(-1.5F, -3.5F, -7F, 3, 7, 1, 0F,0F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 305
		leftTrackModel[870].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[871].addShapeBox(-1.5F, 19F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 306
		leftTrackModel[871].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[872].addShapeBox(-1.5F, 19F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 307
		leftTrackModel[872].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[873].addShapeBox(-1.5F, 18.5F, -6.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 308
		leftTrackModel[873].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[874].addShapeBox(-1.5F, 18.5F, -5.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 309
		leftTrackModel[874].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[875].addShapeBox(-2.5F, 17.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 310
		leftTrackModel[875].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[876].addShapeBox(-2.5F, 17.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 311
		leftTrackModel[876].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[877].addShapeBox(-2.5F, 16.5F, -6.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 312
		leftTrackModel[877].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[878].addShapeBox(-2.5F, 16.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 313
		leftTrackModel[878].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[879].addShapeBox(-2.5F, 14.5F, -5.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 314
		leftTrackModel[879].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[880].addShapeBox(-2.5F, 14.5F, -6.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		leftTrackModel[880].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[881].addShapeBox(-2.5F, 11.5F, -6.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		leftTrackModel[881].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[882].addShapeBox(-2.5F, 11.5F, -5.5F, 2, 3, 1, 0F,.3F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 317
		leftTrackModel[882].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[883].addShapeBox(-3F, 10.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F, -.2F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 318
		leftTrackModel[883].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[884].addShapeBox(-3F, 10.5F, -6.5F, 3, 1, 1, 0F,-1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F); // Box 319
		leftTrackModel[884].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[885].addShapeBox(-3F, 9.5F, -6.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 320
		leftTrackModel[885].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[886].addShapeBox(-3F, 9.5F, -5.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F); // Box 321
		leftTrackModel[886].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[887].addShapeBox(-2.5F, 7.5F, -6.5F, 3, 2, 1, 0F,-0.7F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		leftTrackModel[887].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[888].addShapeBox(-2.5F, 7.5F, -5.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 323
		leftTrackModel[888].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[889].addShapeBox(-2F, 3.5F, -5.5F, 3, 4, 1, 0F,.5F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.2F, -.2F, 0F, -.2F); // Box 324
		leftTrackModel[889].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[890].addShapeBox(-2F, 3.5F, -6.5F, 3, 4, 1, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 325
		leftTrackModel[890].setRotationPoint(45F, -10F, -16F);

		leftTrackModel[891].addShapeBox(2.5F, -2.5F, -6F, 1, 9, 2, 0F,0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F); // Box 326
		leftTrackModel[891].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[892].addShapeBox(1.5F, -3.5F, -6F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 327
		leftTrackModel[892].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[893].addShapeBox(-1.5F, -3.5F, -6F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 2F, 0F, -0.5F); // Box 328
		leftTrackModel[893].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[894].addShapeBox(-3.5F, -3.5F, -6F, 2, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0.5F, -1F, -0.5F); // Box 329
		leftTrackModel[894].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[895].addShapeBox(-4.5F, -2.5F, -6F, 1, 8, 2, 0F,0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.2F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F); // Box 330
		leftTrackModel[895].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[896].addShapeBox(1.5F, -3.5F, -7F, 1, 11, 1, 0F,0F, -3.3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 332
		leftTrackModel[896].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[897].addShapeBox(-1.5F, -3.5F, -7F, 3, 10, 1, 0F,0F, -3.5F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 2F, 0F, 0F); // Box 333
		leftTrackModel[897].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[898].addShapeBox(-3.5F, -3.5F, -7F, 2, 10, 1, 0F,0F, -4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, -1F, 0F); // Box 334
		leftTrackModel[898].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[899].addShapeBox(-4.5F, -2.5F, -7F, 1, 8, 1, 0F,0.5F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.2F, -2F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.2F, -2F, 0F); // Box 335
		leftTrackModel[899].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[900].addShapeBox(-3.5F, 6.5F, -6.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 336
		leftTrackModel[900].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[901].addShapeBox(-3.5F, 6.5F, -5.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.3F, 0F, -.2F, .6F, 0F, -.2F); // Box 337
		leftTrackModel[901].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[902].addShapeBox(-4.5F, 10.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, -.4F, 0F, -.2F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.2F, 0F, -.2F, .6F, 0F, .2F); // Box 338
		leftTrackModel[902].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[903].addShapeBox(-4.5F, 10.5F, -6.5F, 3, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 339
		leftTrackModel[903].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[904].addShapeBox(-5.5F, 11.5F, -6.5F, 3, 3, 1, 0F,-0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 340
		leftTrackModel[904].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[905].addShapeBox(-5.5F, 11.5F, -5.5F, 3, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -.2F, -.4F, 0F, .2F, .2F, 0F, 0F, -.5F, 0F, 0F, -1.1F, 0F, -.2F, -.3F, 0F, -.2F); // Box 341
		leftTrackModel[905].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[906].addShapeBox(-5.5F, 14.5F, -5.5F, 2, 5, 1, 0F,.2F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 342
		leftTrackModel[906].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[907].addShapeBox(-5.5F, 14.5F, -6.5F, 2, 5, 1, 0F,-0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftTrackModel[907].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[908].addShapeBox(-5.5F, 19.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftTrackModel[908].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[909].addShapeBox(-5.5F, 19.5F, -6.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftTrackModel[909].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[910].addShapeBox(-5.5F, 20.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 346
		leftTrackModel[910].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[911].addShapeBox(-5.5F, 20.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 347
		leftTrackModel[911].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[912].addShapeBox(-4.5F, 21.5F, -5.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 348
		leftTrackModel[912].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[913].addShapeBox(-4.5F, 21.5F, -6.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 349
		leftTrackModel[913].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[914].addShapeBox(-4.5F, 22F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 350
		leftTrackModel[914].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[915].addShapeBox(-4.5F, 22F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 351
		leftTrackModel[915].setRotationPoint(23F, -13F, -16F);

		leftTrackModel[916].addShapeBox(21F, -16F, -1.5F, 1, 1, 3, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F); // Box 366
		leftTrackModel[916].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[916].rotateAngleZ = -0.64577182F;

		leftTrackModel[917].addShapeBox(21F, -17F, 0F, 1, 1, 1, 0F,0F, .4F, 0F, 0F, .2F, 0F, 0F, -.4F, .5F, 0F, -.2F, .7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F); // Box 367
		leftTrackModel[917].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[917].rotateAngleZ = -0.64577182F;

		leftTrackModel[918].addShapeBox(21F, -15F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F); // Box 368
		leftTrackModel[918].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[918].rotateAngleZ = -0.64577182F;

		leftTrackModel[919].addShapeBox(21F, -17F, -1F, 1, 1, 1, 0F,0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		leftTrackModel[919].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[919].rotateAngleZ = -0.64577182F;

		leftTrackModel[920].addShapeBox(19.5F, -15.5F, -2F, 2, 1, 4, 0F,0F, 0F, .3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, .3F, 0F, -.5F, .4F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, .4F); // Box 372
		leftTrackModel[920].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[920].rotateAngleZ = -0.64577182F;

		leftTrackModel[921].addShapeBox(17.5F, -15.5F, -3F, 2, 1, 6, 0F,0F, 0F, .2F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, .2F, 0F, -.5F, .4F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, .4F); // Box 373
		leftTrackModel[921].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[921].rotateAngleZ = -0.64577182F;

		leftTrackModel[922].addShapeBox(15.5F, -15.5F, -3.5F, 2, 1, 7, 0F,0F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F); // Box 374
		leftTrackModel[922].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[922].rotateAngleZ = -0.64577182F;

		leftTrackModel[923].addShapeBox(13.5F, -16F, -3.5F, 2, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F); // Box 375
		leftTrackModel[923].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[923].rotateAngleZ = -0.64577182F;

		leftTrackModel[924].addShapeBox(11.5F, -16F, -2.5F, 2, 1, 5, 0F,.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -.5F, .6F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, .6F, -.5F, -.5F); // Box 376
		leftTrackModel[924].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[924].rotateAngleZ = -0.64577182F;

		leftTrackModel[925].addShapeBox(14.5F, -18F, -3.5F, 1, 2, 7, 0F,-.5F, 0F, -.6F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.6F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.25F); // Box 377
		leftTrackModel[925].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[925].rotateAngleZ = -0.64577182F;

		leftTrackModel[926].addShapeBox(14.5F, -19F, -3F, 1, 1, 6, 0F,-.5F, .1F, -2F, 0F, .1F, -2F, 0F, .1F, -2F, -.5F, .1F, -2F, -.5F, 0F, -.1F, 0F, 0F, .2F, 0F, 0F, .2F, -.5F, 0F, -.1F); // Box 378
		leftTrackModel[926].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[926].rotateAngleZ = -0.64577182F;

		leftTrackModel[927].addShapeBox(25F, 2.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F); // Box 380
		leftTrackModel[927].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[928].addShapeBox(25F, 3.5F, 1.5F, 1, 2, 1, 0F,0F, .5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, .5F, -.2F, 2F, -.5F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 2F, -.5F, 1F); // Box 381
		leftTrackModel[928].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[929].addShapeBox(23F, 5.5F, 2.5F, 1, 3, 1, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 5F, -1F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, 2.5F, 5F, -1F, 2.5F); // Box 382
		leftTrackModel[929].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[930].addShapeBox(13F, 7.5F, 5F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 383
		leftTrackModel[930].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[931].addShapeBox(8F, 6.5F, 6.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, .5F, 4F, -1F, .5F, 4F, -1F, -.5F, -5F, 0F, -.5F); // Box 384
		leftTrackModel[931].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[932].addShapeBox(6F, 3.5F, 6.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 385
		leftTrackModel[932].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[933].addShapeBox(6F, -0.5F, 6.5F, 1, 4, 1, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 386
		leftTrackModel[933].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[934].addShapeBox(6F, -3.5F, 6.5F, 1, 3, 1, 0F,0F, -.3F, 2F, 0F, -.3F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftTrackModel[934].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[935].addShapeBox(6F, -5.5F, 4.5F, 1, 2, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		leftTrackModel[935].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[936].addShapeBox(6F, -5.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftTrackModel[936].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[937].addShapeBox(25F, 1.5F, 1.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		leftTrackModel[937].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[938].addShapeBox(25F, 0.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 391
		leftTrackModel[938].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[939].addShapeBox(25F, 0.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 392
		leftTrackModel[939].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[940].addShapeBox(25F, 1.5F, -2.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		leftTrackModel[940].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[941].addShapeBox(25F, 2.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F); // Box 394
		leftTrackModel[941].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[942].addShapeBox(25F, 3.5F, -2.5F, 1, 2, 1, 0F,0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 2F, -0.5F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, -0.5F, -1F); // Box 395
		leftTrackModel[942].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[943].addShapeBox(23F, 5.5F, -3.5F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 5F, -1F, 2.5F, -6F, 0F, 2.5F, -6F, 0F, -2.5F, 5F, -1F, -2.5F); // Box 396
		leftTrackModel[943].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[944].addShapeBox(13F, 7.5F, -6F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 397
		leftTrackModel[944].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[945].addShapeBox(8F, 6.5F, -7.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 4F, -1F, -0.5F, 4F, -1F, 0.5F, -5F, 0F, 0.5F); // Box 398
		leftTrackModel[945].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[946].addShapeBox(6F, 3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 399
		leftTrackModel[946].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[947].addShapeBox(6F, -0.5F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 400
		leftTrackModel[947].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[948].addShapeBox(6F, -3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 401
		leftTrackModel[948].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[949].addShapeBox(6F, -5.5F, -5.5F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 402
		leftTrackModel[949].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[950].addShapeBox(4.5F, -2.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F); // Box 405
		leftTrackModel[950].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[951].addShapeBox(4.5F, 1F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		leftTrackModel[951].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[951].rotateAngleZ = 0.62831853F;

		leftTrackModel[952].addShapeBox(4.5F, 1F, 2F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 407
		leftTrackModel[952].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[952].rotateAngleZ = 0.62831853F;

		leftTrackModel[953].addShapeBox(4.5F, 4F, 5F, 1, 3, 1, 0F,0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		leftTrackModel[953].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[953].rotateAngleZ = 0.62831853F;

		leftTrackModel[954].addShapeBox(14.5F, 4F, -1.5F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 409
		leftTrackModel[954].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[954].rotateAngleZ = -0.34906585F;

		leftTrackModel[955].addShapeBox(14.5F, 3F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F); // Box 410
		leftTrackModel[955].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[955].rotateAngleZ = -0.34906585F;

		leftTrackModel[956].addShapeBox(4.5F, 6.5F, 5F, 1, 5, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 411
		leftTrackModel[956].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[956].rotateAngleZ = 0.62831853F;

		leftTrackModel[957].addShapeBox(-3F, 0F, 0F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 412
		leftTrackModel[957].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[958].addShapeBox(4.5F, 11.5F, 5F, 1, 3, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 413
		leftTrackModel[958].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[958].rotateAngleZ = 0.62831853F;

		leftTrackModel[959].addShapeBox(4.5F, 14.5F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 414
		leftTrackModel[959].setRotationPoint(37F, -19F, -20F);
		leftTrackModel[959].rotateAngleZ = 0.62831853F;

		leftTrackModel[960].addShapeBox(0.5F, 10.5F, 5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 415
		leftTrackModel[960].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[961].addShapeBox(0.5F, 3.5F, 5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		leftTrackModel[961].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[962].addShapeBox(0.5F, 12.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 417
		leftTrackModel[962].setRotationPoint(37F, -19F, -20F);

		leftTrackModel[963].addShapeBox(4.5F, -2.5F, -1F, 1, 1, 2, 0F,0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		leftTrackModel[963].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[964].addShapeBox(14.5F, 3F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 419
		leftTrackModel[964].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[964].rotateAngleZ = -0.34906585F;

		leftTrackModel[965].addShapeBox(14.5F, 5F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F); // Box 420
		leftTrackModel[965].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[965].rotateAngleZ = -0.34906585F;

		leftTrackModel[966].addShapeBox(14.5F, 5F, -1.5F, 1, 1, 3, 0F,0.2F, 0F, -2.5F, 0.2F, 0F, -2.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1F, 0.2F, 0F, -1F); // Box 421
		leftTrackModel[966].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[966].rotateAngleZ = -0.34906585F;

		leftTrackModel[967].addShapeBox(14.5F, 4F, 0.5F, 1, 1, 1, 0F,0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 422
		leftTrackModel[967].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[967].rotateAngleZ = -0.34906585F;

		leftTrackModel[968].addShapeBox(14.5F, 3F, -0.5F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 423
		leftTrackModel[968].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[968].rotateAngleZ = -0.34906585F;

		leftTrackModel[969].addShapeBox(14.5F, 5F, -0.5F, 1, 1, 1, 0F,0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 424
		leftTrackModel[969].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[969].rotateAngleZ = -0.34906585F;

		leftTrackModel[970].addShapeBox(4.5F, 1F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		leftTrackModel[970].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[970].rotateAngleZ = 0.62831853F;

		leftTrackModel[971].addShapeBox(4.5F, 1F, -5F, 1, 1, 3, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		leftTrackModel[971].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[971].rotateAngleZ = 0.62831853F;

		leftTrackModel[972].addShapeBox(4.5F, 4F, -6F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		leftTrackModel[972].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[972].rotateAngleZ = 0.62831853F;

		leftTrackModel[973].addShapeBox(4.5F, 6.5F, -6F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 437
		leftTrackModel[973].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[973].rotateAngleZ = 0.62831853F;

		leftTrackModel[974].addShapeBox(4.5F, 11.5F, -6F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 438
		leftTrackModel[974].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[974].rotateAngleZ = 0.62831853F;

		leftTrackModel[975].addShapeBox(0.5F, 7.5F, 5F, 1, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		leftTrackModel[975].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[976].addShapeBox(0.5F, 3.5F, -6.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		leftTrackModel[976].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[977].addShapeBox(0.5F, 7.5F, -6F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		leftTrackModel[977].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[978].addShapeBox(0.5F, 10.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 442
		leftTrackModel[978].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[979].addShapeBox(-4.5F, 3.5F, -6.5F, 1, 4, 1, 0F,0F, 0F, .05F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		leftTrackModel[979].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[980].addShapeBox(-4.5F, 7.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		leftTrackModel[980].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[981].addShapeBox(-4.5F, 9.5F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 445
		leftTrackModel[981].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[982].addShapeBox(-4.5F, 11.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 446
		leftTrackModel[982].setRotationPoint(37F, -19F, -20F);

		leftTrackModel[983].addShapeBox(-4.5F, 9.5F, 5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 447
		leftTrackModel[983].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[984].addShapeBox(-4.5F, 7.5F, 5F, 1, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		leftTrackModel[984].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[985].addShapeBox(-4.5F, 3.5F, 5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		leftTrackModel[985].setRotationPoint(37F, -19F, -18F);

		leftTrackModel[986].addShapeBox(4.5F, 14.5F, 3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		leftTrackModel[986].setRotationPoint(37F, -19F, -20F);
		leftTrackModel[986].rotateAngleZ = 0.62831853F;

		leftTrackModel[987].addShapeBox(0.5F, 12.5F, 1.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		leftTrackModel[987].setRotationPoint(37F, -19F, -20F);

		leftTrackModel[988].addShapeBox(-3.5F, 11.5F, 1.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 452
		leftTrackModel[988].setRotationPoint(37F, -19F, -20F);

		leftTrackModel[989].addShapeBox(8.5F, 12.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 453
		leftTrackModel[989].setRotationPoint(37F, -19F, -20F);

		leftTrackModel[990].addShapeBox(11.5F, 10.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 454
		leftTrackModel[990].setRotationPoint(37F, -19F, -20F);

		leftTrackModel[991].addShapeBox(6F, 3.5F, 7.5F, 1, 14, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		leftTrackModel[991].setRotationPoint(37F, -19F, 0F);

		leftTrackModel[992].addShapeBox(6F, 3.5F, 7.5F, 1, 14, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		leftTrackModel[992].setRotationPoint(37F, -19F, -17F);

		leftTrackModel[993].addShapeBox(22.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F); // Box 336
		leftTrackModel[993].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[993].rotateAngleZ = -0.64577182F;

		leftTrackModel[994].addShapeBox(21.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		leftTrackModel[994].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[994].rotateAngleZ = -0.64577182F;

		leftTrackModel[995].addShapeBox(19.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 338
		leftTrackModel[995].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[995].rotateAngleZ = -0.64577182F;

		leftTrackModel[996].addShapeBox(15.5F, -15F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 339
		leftTrackModel[996].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[996].rotateAngleZ = -0.64577182F;

		leftTrackModel[997].addShapeBox(15.5F, -15F, -1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 340
		leftTrackModel[997].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[997].rotateAngleZ = -0.64577182F;

		leftTrackModel[998].addShapeBox(17.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 341
		leftTrackModel[998].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[998].rotateAngleZ = -0.64577182F;

		leftTrackModel[999].addShapeBox(17.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 342
		leftTrackModel[999].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[999].rotateAngleZ = -0.64577182F;
	}

	private void initleftTrackModel_3()
	{
		leftTrackModel[1000] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 343
		leftTrackModel[1001] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 344
		leftTrackModel[1002] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 345
		leftTrackModel[1003] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 346
		leftTrackModel[1004] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 347
		leftTrackModel[1005] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 350
		leftTrackModel[1006] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 351

		leftTrackModel[1000].addShapeBox(19.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 343
		leftTrackModel[1000].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[1000].rotateAngleZ = -0.64577182F;

		leftTrackModel[1001].addShapeBox(21F, -14.3F, -1F, 1, 1, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F); // Box 344
		leftTrackModel[1001].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[1001].rotateAngleZ = -0.64577182F;

		leftTrackModel[1002].addShapeBox(21F, -14.3F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0.7F); // Box 345
		leftTrackModel[1002].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[1002].rotateAngleZ = -0.64577182F;

		leftTrackModel[1003].addShapeBox(21.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.5F, 0F); // Box 346
		leftTrackModel[1003].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[1003].rotateAngleZ = -0.64577182F;

		leftTrackModel[1004].addShapeBox(22.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F); // Box 347
		leftTrackModel[1004].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[1004].rotateAngleZ = -0.64577182F;

		leftTrackModel[1005].addShapeBox(11.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F); // Box 350
		leftTrackModel[1005].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[1005].rotateAngleZ = -0.64577182F;

		leftTrackModel[1006].addShapeBox(11.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -1.3F, 0F); // Box 351
		leftTrackModel[1006].setRotationPoint(37F, -19F, -18F);
		leftTrackModel[1006].rotateAngleZ = -0.64577182F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[19];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 0
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 1
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 2
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 3
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 4
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 5
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 6
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 7
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 8
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 9
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 10
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 11
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 12
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 13
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 14
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 15
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 16
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 17
		gun_1_Model[1][18] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 18

		gun_1_Model[1][0].addShapeBox(-6.5F, -2.5F, -1F, 9, 3, 2, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_1_Model[1][1].addShapeBox(2.5F, -2.5F, -1.5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1

		gun_1_Model[1][2].addShapeBox(2.5F, -3.5F, -1.5F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_1_Model[1][3].addShapeBox(2.5F, -1.5F, -1.5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3

		gun_1_Model[1][4].addShapeBox(13.5F, -2F, -0.5F, 1, 1, 1, 0F,0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F); // Box 4

		gun_1_Model[1][5].addShapeBox(12.5F, -4F, -0.5F, 1, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 5

		gun_1_Model[1][6].addShapeBox(-5F, -1.5F, 0.5F, 7, 1, 1, 0F,0F, 0.7F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.57F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.3F, -0.2F); // Box 6

		gun_1_Model[1][7].addShapeBox(-8.5F, -2.8F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_1_Model[1][8].addShapeBox(-8.5F, -2.8F, 1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_1_Model[1][9].addShapeBox(-8.5F, -3.2F, 1F, 3, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, 0.8F, 0F, -0.3F, -1.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.8F, 0F, -0.3F, -1.2F, 0F, -0.3F, -0.2F); // Box 9

		gun_1_Model[1][10].addShapeBox(-8.5F, -0.5F, 1F, 3, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, 0.8F, 0F, -0.3F, -1.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.8F, 0F, -0.3F, -1.2F, 0F, -0.3F, -0.2F); // Box 10

		gun_1_Model[1][11].addShapeBox(-8.5F, -0.5F, -1F, 3, 1, 1, 0F,0F, -0.3F, 0.8F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -1.2F, 0F, -0.3F, 0.8F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -1.2F); // Box 11

		gun_1_Model[1][12].addShapeBox(-8.5F, -3.2F, -1F, 3, 1, 1, 0F,0F, -0.3F, 0.8F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -1.2F, 0F, -0.3F, 0.8F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -1.2F); // Box 12

		gun_1_Model[1][13].addShapeBox(2F, -7.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_1_Model[1][14].addShapeBox(2F, -7.5F, -2.5F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_1_Model[1][15].addShapeBox(2F, -4F, -1F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_1_Model[1][16].addShapeBox(2F, -7.5F, 0.5F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_1_Model[1][17].addShapeBox(2F, -7.5F, 2.5F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 17

		gun_1_Model[1][18].addShapeBox(2F, -5.5F, -4.7F, 1, 7, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(-43F, -15F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}