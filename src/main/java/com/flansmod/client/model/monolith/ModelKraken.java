//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKraken extends ModelMecha //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelKraken() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];
		hipsModel = new ModelRendererTurbo[1];
		leftArmModel = new ModelRendererTurbo[143];
		rightArmModel = new ModelRendererTurbo[111];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1556, 127, textureX, textureY); // Box 21
		bodyModel[1] = new ModelRendererTurbo(this, 1556, 81, textureX, textureY); // Box 22
		bodyModel[2] = new ModelRendererTurbo(this, 1556, 40, textureX, textureY); // Box 23
		bodyModel[3] = new ModelRendererTurbo(this, 1380, 40, textureX, textureY); // Box 24
		bodyModel[4] = new ModelRendererTurbo(this, 1380, 81, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 1380, 127, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 1556, 180, textureX, textureY); // Box 46
		bodyModel[7] = new ModelRendererTurbo(this, 1556, 224, textureX, textureY); // Box 47
		bodyModel[8] = new ModelRendererTurbo(this, 1380, 180, textureX, textureY); // Box 48
		bodyModel[9] = new ModelRendererTurbo(this, 1380, 224, textureX, textureY); // Box 49
		bodyModel[10] = new ModelRendererTurbo(this, 1231, 40, textureX, textureY); // Box 52
		bodyModel[11] = new ModelRendererTurbo(this, 1231, 81, textureX, textureY); // Box 53
		bodyModel[12] = new ModelRendererTurbo(this, 1231, 127, textureX, textureY); // Box 54
		bodyModel[13] = new ModelRendererTurbo(this, 1231, 180, textureX, textureY); // Box 55
		bodyModel[14] = new ModelRendererTurbo(this, 1231, 224, textureX, textureY); // Box 56
		bodyModel[15] = new ModelRendererTurbo(this, 1116, 224, textureX, textureY); // Box 57
		bodyModel[16] = new ModelRendererTurbo(this, 1116, 180, textureX, textureY); // Box 58
		bodyModel[17] = new ModelRendererTurbo(this, 1116, 127, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 1116, 81, textureX, textureY); // Box 60
		bodyModel[19] = new ModelRendererTurbo(this, 1116, 40, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 1116, 180, textureX, textureY); // Box 5
		bodyModel[21] = new ModelRendererTurbo(this, 1116, 127, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 1116, 81, textureX, textureY); // Box 7
		bodyModel[23] = new ModelRendererTurbo(this, 1116, 40, textureX, textureY); // Box 8
		bodyModel[24] = new ModelRendererTurbo(this, 1116, 224, textureX, textureY); // Box 9
		bodyModel[25] = new ModelRendererTurbo(this, 1231, 224, textureX, textureY); // Box 10
		bodyModel[26] = new ModelRendererTurbo(this, 1231, 180, textureX, textureY); // Box 11
		bodyModel[27] = new ModelRendererTurbo(this, 1231, 81, textureX, textureY); // Box 12
		bodyModel[28] = new ModelRendererTurbo(this, 1231, 40, textureX, textureY); // Box 13
		bodyModel[29] = new ModelRendererTurbo(this, 1380, 224, textureX, textureY); // Box 14
		bodyModel[30] = new ModelRendererTurbo(this, 1380, 180, textureX, textureY); // Box 15
		bodyModel[31] = new ModelRendererTurbo(this, 1231, 127, textureX, textureY); // Box 16
		bodyModel[32] = new ModelRendererTurbo(this, 1380, 127, textureX, textureY); // Box 17
		bodyModel[33] = new ModelRendererTurbo(this, 1380, 81, textureX, textureY); // Box 18
		bodyModel[34] = new ModelRendererTurbo(this, 1380, 40, textureX, textureY); // Box 19
		bodyModel[35] = new ModelRendererTurbo(this, 1556, 224, textureX, textureY); // Box 20
		bodyModel[36] = new ModelRendererTurbo(this, 1556, 180, textureX, textureY); // Box 21
		bodyModel[37] = new ModelRendererTurbo(this, 1556, 127, textureX, textureY); // Box 22
		bodyModel[38] = new ModelRendererTurbo(this, 1556, 40, textureX, textureY); // Box 23
		bodyModel[39] = new ModelRendererTurbo(this, 1556, 81, textureX, textureY); // Box 24

		bodyModel[0].addShapeBox(-22F, -7F, 67F, 44, 14, 14, 0F,7F, 4F, 0F, 7F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 4F, 0F, 7F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-22F, -17F, 67F, 44, 10, 14, 0F,0F, 6F, 0F, 0F, 6F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 7F, -4F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-17F, -23F, 67F, 34, 6, 14, 0F,-7F, 10F, 0F, -7F, 10F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-22F, -33F, 45F, 44, 10, 22, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-29F, -23F, 45F, 58, 12, 22, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-29F, -11F, 45F, 58, 22, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-22F, 7F, 67F, 44, 10, 14, 0F,7F, -4F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 46
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-17F, 17F, 67F, 34, 6, 14, 0F,5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 10F, 0F, -7F, 10F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 47
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-29F, 11F, 45F, 58, 12, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 48
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-22F, 23F, 45F, 44, 10, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 49
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-17F, -23F, 18F, 34, 6, 27, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -7F, 10F, 0F, -7F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F); // Box 52
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-22F, -17F, 18F, 44, 10, 27, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, -4F, 0F); // Box 53
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-22F, -7F, 18F, 44, 14, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 4F, 0F, 7F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 4F, 0F, 7F, 4F, 0F); // Box 54
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-22F, 7F, 18F, 44, 10, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 55
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-17F, 17F, 18F, 34, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -7F, 10F, 0F, -7F, 10F, 0F); // Box 56
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-17F, 17F, 10F, 34, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 57
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-22F, 7F, 10F, 44, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 58
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-22F, -7F, 10F, 44, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-22F, -17F, 10F, 44, 10, 8, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-17F, -23F, 10F, 34, 6, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-22F, 7F, -17F, 44, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 5
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-22F, -7F, -17F, 44, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-22F, -17F, -17F, 44, 10, 8, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-17F, -23F, -17F, 34, 6, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-17F, 17F, -17F, 34, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 9
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-17F, 17F, -44F, 34, 6, 27, 0F,5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 10F, 0F, -7F, 10F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 10
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-22F, 7F, -44F, 44, 10, 27, 0F,7F, -4F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 11
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-22F, -17F, -44F, 44, 10, 27, 0F,0F, 6F, 0F, 0F, 6F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 7F, -4F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-17F, -23F, -44F, 34, 6, 27, 0F,-7F, 10F, 0F, -7F, 10F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-22F, 23F, -66F, 44, 10, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 14
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-29F, 11F, -66F, 58, 12, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 15
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-22F, -7F, -44F, 44, 14, 27, 0F,7F, 4F, 0F, 7F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 4F, 0F, 7F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-29F, -11F, -66F, 58, 22, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-29F, -23F, -66F, 58, 12, 22, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-22F, -33F, -66F, 44, 10, 22, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-17F, 17F, -80F, 34, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -7F, 10F, 0F, -7F, 10F, 0F); // Box 20
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-22F, 7F, -80F, 44, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 21
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-22F, -7F, -80F, 44, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 4F, 0F, 7F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 4F, 0F, 7F, 4F, 0F); // Box 22
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-17F, -23F, -80F, 34, 6, 14, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -7F, 10F, 0F, -7F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F); // Box 23
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-22F, -17F, -80F, 44, 10, 14, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, -4F, 0F); // Box 24
		bodyModel[39].setRotationPoint(0F, 0F, 0F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 5, 147, textureX, textureY); // Box 99

		hipsModel[0].addBox(-2F, 0F, -4F, 4, 1, 8, 0F); // Box 99
		hipsModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 225, 56, textureX, textureY); // Box 14
		leftArmModel[1] = new ModelRendererTurbo(this, 225, 39, textureX, textureY); // Box 15
		leftArmModel[2] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 16
		leftArmModel[3] = new ModelRendererTurbo(this, 225, 76, textureX, textureY); // Box 50
		leftArmModel[4] = new ModelRendererTurbo(this, 225, 96, textureX, textureY); // Box 51
		leftArmModel[5] = new ModelRendererTurbo(this, 961, 39, textureX, textureY); // Box 62
		leftArmModel[6] = new ModelRendererTurbo(this, 961, 126, textureX, textureY); // Box 65
		leftArmModel[7] = new ModelRendererTurbo(this, 961, 80, textureX, textureY); // Box 66
		leftArmModel[8] = new ModelRendererTurbo(this, 961, 223, textureX, textureY); // Box 67
		leftArmModel[9] = new ModelRendererTurbo(this, 961, 179, textureX, textureY); // Box 68
		leftArmModel[10] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 70
		leftArmModel[11] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 71
		leftArmModel[12] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 72
		leftArmModel[13] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 0
		leftArmModel[14] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 1
		leftArmModel[15] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 2
		leftArmModel[16] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 7
		leftArmModel[17] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 8
		leftArmModel[18] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 10
		leftArmModel[19] = new ModelRendererTurbo(this, 8, 745, textureX, textureY); // Box 11
		leftArmModel[20] = new ModelRendererTurbo(this, 8, 813, textureX, textureY); // Box 12
		leftArmModel[21] = new ModelRendererTurbo(this, 8, 614, textureX, textureY); // Box 13
		leftArmModel[22] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 17
		leftArmModel[23] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 18
		leftArmModel[24] = new ModelRendererTurbo(this, 8, 546, textureX, textureY); // Box 19
		leftArmModel[25] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 20
		leftArmModel[26] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 21
		leftArmModel[27] = new ModelRendererTurbo(this, 8, 475, textureX, textureY); // Box 22
		leftArmModel[28] = new ModelRendererTurbo(this, 721, 455, textureX, textureY); // Box 0
		leftArmModel[29] = new ModelRendererTurbo(this, 8, 878, textureX, textureY); // Box 1
		leftArmModel[30] = new ModelRendererTurbo(this, 701, 339, textureX, textureY); // Box 4
		leftArmModel[31] = new ModelRendererTurbo(this, 701, 216, textureX, textureY); // Box 5
		leftArmModel[32] = new ModelRendererTurbo(this, 823, 109, textureX, textureY); // Box 7
		leftArmModel[33] = new ModelRendererTurbo(this, 835, 339, textureX, textureY); // Box 8
		leftArmModel[34] = new ModelRendererTurbo(this, 693, 129, textureX, textureY); // Box 9
		leftArmModel[35] = new ModelRendererTurbo(this, 701, 339, textureX, textureY); // Box 10
		leftArmModel[36] = new ModelRendererTurbo(this, 835, 339, textureX, textureY); // Box 11
		leftArmModel[37] = new ModelRendererTurbo(this, 835, 395, textureX, textureY); // Box 12
		leftArmModel[38] = new ModelRendererTurbo(this, 701, 395, textureX, textureY); // Box 13
		leftArmModel[39] = new ModelRendererTurbo(this, 698, 175, textureX, textureY); // Box 14
		leftArmModel[40] = new ModelRendererTurbo(this, 821, 138, textureX, textureY); // Box 16
		leftArmModel[41] = new ModelRendererTurbo(this, 699, 111, textureX, textureY); // Box 17
		leftArmModel[42] = new ModelRendererTurbo(this, 825, 178, textureX, textureY); // Box 18
		leftArmModel[43] = new ModelRendererTurbo(this, 751, 312, textureX, textureY); // Box 0
		leftArmModel[44] = new ModelRendererTurbo(this, 690, 312, textureX, textureY); // Box 1
		leftArmModel[45] = new ModelRendererTurbo(this, 502, 319, textureX, textureY); // Box 2
		leftArmModel[46] = new ModelRendererTurbo(this, 502, 319, textureX, textureY); // Box 3
		leftArmModel[47] = new ModelRendererTurbo(this, 499, 666, textureX, textureY); // Box 4
		leftArmModel[48] = new ModelRendererTurbo(this, 499, 666, textureX, textureY); // Box 5
		leftArmModel[49] = new ModelRendererTurbo(this, 494, 537, textureX, textureY); // Box 8
		leftArmModel[50] = new ModelRendererTurbo(this, 491, 418, textureX, textureY); // Box 9
		leftArmModel[51] = new ModelRendererTurbo(this, 488, 767, textureX, textureY); // Box 10
		leftArmModel[52] = new ModelRendererTurbo(this, 316, 6, textureX, textureY); // Box 11
		leftArmModel[53] = new ModelRendererTurbo(this, 491, 418, textureX, textureY); // Box 12
		leftArmModel[54] = new ModelRendererTurbo(this, 615, 900, textureX, textureY); // Box 13
		leftArmModel[55] = new ModelRendererTurbo(this, 488, 767, textureX, textureY); // Box 14
		leftArmModel[56] = new ModelRendererTurbo(this, 615, 900, textureX, textureY); // Box 15
		leftArmModel[57] = new ModelRendererTurbo(this, 473, 931, textureX, textureY); // Box 16
		leftArmModel[58] = new ModelRendererTurbo(this, 691, 14, textureX, textureY); // Box 17
		leftArmModel[59] = new ModelRendererTurbo(this, 977, 275, textureX, textureY); // Box 20
		leftArmModel[60] = new ModelRendererTurbo(this, 977, 394, textureX, textureY); // Box 24
		leftArmModel[61] = new ModelRendererTurbo(this, 977, 513, textureX, textureY); // Box 25
		leftArmModel[62] = new ModelRendererTurbo(this, 977, 632, textureX, textureY); // Box 26
		leftArmModel[63] = new ModelRendererTurbo(this, 977, 751, textureX, textureY); // Box 27
		leftArmModel[64] = new ModelRendererTurbo(this, 977, 873, textureX, textureY); // Box 28
		leftArmModel[65] = new ModelRendererTurbo(this, 977, 1004, textureX, textureY); // Box 29
		leftArmModel[66] = new ModelRendererTurbo(this, 1162, 275, textureX, textureY); // Box 30
		leftArmModel[67] = new ModelRendererTurbo(this, 1162, 394, textureX, textureY); // Box 31
		leftArmModel[68] = new ModelRendererTurbo(this, 1162, 513, textureX, textureY); // Box 32
		leftArmModel[69] = new ModelRendererTurbo(this, 1162, 632, textureX, textureY); // Box 33
		leftArmModel[70] = new ModelRendererTurbo(this, 1162, 751, textureX, textureY); // Box 34
		leftArmModel[71] = new ModelRendererTurbo(this, 1162, 873, textureX, textureY); // Box 35
		leftArmModel[72] = new ModelRendererTurbo(this, 1162, 1004, textureX, textureY); // Box 36
		leftArmModel[73] = new ModelRendererTurbo(this, 1343, 277, textureX, textureY); // Box 37
		leftArmModel[74] = new ModelRendererTurbo(this, 1343, 396, textureX, textureY); // Box 38
		leftArmModel[75] = new ModelRendererTurbo(this, 1343, 515, textureX, textureY); // Box 39
		leftArmModel[76] = new ModelRendererTurbo(this, 1343, 1006, textureX, textureY); // Box 40
		leftArmModel[77] = new ModelRendererTurbo(this, 1343, 875, textureX, textureY); // Box 41
		leftArmModel[78] = new ModelRendererTurbo(this, 1343, 753, textureX, textureY); // Box 42
		leftArmModel[79] = new ModelRendererTurbo(this, 1343, 634, textureX, textureY); // Box 43
		leftArmModel[80] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 44
		leftArmModel[81] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 45
		leftArmModel[82] = new ModelRendererTurbo(this, 1343, 277, textureX, textureY); // Box 46
		leftArmModel[83] = new ModelRendererTurbo(this, 1343, 396, textureX, textureY); // Box 47
		leftArmModel[84] = new ModelRendererTurbo(this, 1343, 515, textureX, textureY); // Box 48
		leftArmModel[85] = new ModelRendererTurbo(this, 1343, 634, textureX, textureY); // Box 49
		leftArmModel[86] = new ModelRendererTurbo(this, 1343, 753, textureX, textureY); // Box 50
		leftArmModel[87] = new ModelRendererTurbo(this, 1343, 875, textureX, textureY); // Box 51
		leftArmModel[88] = new ModelRendererTurbo(this, 1343, 1006, textureX, textureY); // Box 52
		leftArmModel[89] = new ModelRendererTurbo(this, 477, 11, textureX, textureY); // Box 57
		leftArmModel[90] = new ModelRendererTurbo(this, 578, 10, textureX, textureY); // Box 58
		leftArmModel[91] = new ModelRendererTurbo(this, 477, 60, textureX, textureY); // Box 59
		leftArmModel[92] = new ModelRendererTurbo(this, 578, 59, textureX, textureY); // Box 60
		leftArmModel[93] = new ModelRendererTurbo(this, 8, 425, textureX, textureY); // Box 61
		leftArmModel[94] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 62
		leftArmModel[95] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 63
		leftArmModel[96] = new ModelRendererTurbo(this, 8, 363, textureX, textureY); // Box 64
		leftArmModel[97] = new ModelRendererTurbo(this, 8, 315, textureX, textureY); // Box 65
		leftArmModel[98] = new ModelRendererTurbo(this, 223, 873, textureX, textureY); // Box 69
		leftArmModel[99] = new ModelRendererTurbo(this, 395, 214, textureX, textureY); // Box 70
		leftArmModel[100] = new ModelRendererTurbo(this, 216, 979, textureX, textureY); // Box 71
		leftArmModel[101] = new ModelRendererTurbo(this, 355, 188, textureX, textureY); // Box 72
		leftArmModel[102] = new ModelRendererTurbo(this, 204, 920, textureX, textureY); // Box 73
		leftArmModel[103] = new ModelRendererTurbo(this, 368, 175, textureX, textureY); // Box 74
		leftArmModel[104] = new ModelRendererTurbo(this, 365, 165, textureX, textureY); // Box 75
		leftArmModel[105] = new ModelRendererTurbo(this, 336, 172, textureX, textureY); // Box 76
		leftArmModel[106] = new ModelRendererTurbo(this, 348, 190, textureX, textureY); // Box 77
		leftArmModel[107] = new ModelRendererTurbo(this, 344, 179, textureX, textureY); // Box 78
		leftArmModel[108] = new ModelRendererTurbo(this, 404, 160, textureX, textureY); // Box 79
		leftArmModel[109] = new ModelRendererTurbo(this, 238, 316, textureX, textureY); // Box 80
		leftArmModel[110] = new ModelRendererTurbo(this, 359, 198, textureX, textureY); // Box 81
		leftArmModel[111] = new ModelRendererTurbo(this, 347, 200, textureX, textureY); // Box 82
		leftArmModel[112] = new ModelRendererTurbo(this, 339, 166, textureX, textureY); // Box 83
		leftArmModel[113] = new ModelRendererTurbo(this, 348, 199, textureX, textureY); // Box 84
		leftArmModel[114] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 85
		leftArmModel[115] = new ModelRendererTurbo(this, 358, 176, textureX, textureY); // Box 86
		leftArmModel[116] = new ModelRendererTurbo(this, 239, 365, textureX, textureY); // Box 87
		leftArmModel[117] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 88
		leftArmModel[118] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 89
		leftArmModel[119] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 90
		leftArmModel[120] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 91
		leftArmModel[121] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 92
		leftArmModel[122] = new ModelRendererTurbo(this, 239, 426, textureX, textureY); // Box 93
		leftArmModel[123] = new ModelRendererTurbo(this, 239, 798, textureX, textureY); // Box 94
		leftArmModel[124] = new ModelRendererTurbo(this, 239, 733, textureX, textureY); // Box 95
		leftArmModel[125] = new ModelRendererTurbo(this, 239, 602, textureX, textureY); // Box 96
		leftArmModel[126] = new ModelRendererTurbo(this, 239, 540, textureX, textureY); // Box 97
		leftArmModel[127] = new ModelRendererTurbo(this, 239, 475, textureX, textureY); // Box 98
		leftArmModel[128] = new ModelRendererTurbo(this, 8, 878, textureX, textureY); // Box 0
		leftArmModel[129] = new ModelRendererTurbo(this, 842, 636, textureX, textureY); // Box 0
		leftArmModel[130] = new ModelRendererTurbo(this, 768, 770, textureX, textureY); // Box 1
		leftArmModel[131] = new ModelRendererTurbo(this, 838, 596, textureX, textureY); // Box 2
		leftArmModel[132] = new ModelRendererTurbo(this, 716, 569, textureX, textureY); // Box 3
		leftArmModel[133] = new ModelRendererTurbo(this, 718, 853, textureX, textureY); // Box 4
		leftArmModel[134] = new ModelRendererTurbo(this, 715, 633, textureX, textureY); // Box 5
		leftArmModel[135] = new ModelRendererTurbo(this, 718, 797, textureX, textureY); // Box 6
		leftArmModel[136] = new ModelRendererTurbo(this, 710, 587, textureX, textureY); // Box 7
		leftArmModel[137] = new ModelRendererTurbo(this, 852, 853, textureX, textureY); // Box 8
		leftArmModel[138] = new ModelRendererTurbo(this, 852, 797, textureX, textureY); // Box 9
		leftArmModel[139] = new ModelRendererTurbo(this, 718, 797, textureX, textureY); // Box 10
		leftArmModel[140] = new ModelRendererTurbo(this, 840, 567, textureX, textureY); // Box 11
		leftArmModel[141] = new ModelRendererTurbo(this, 852, 797, textureX, textureY); // Box 12
		leftArmModel[142] = new ModelRendererTurbo(this, 718, 674, textureX, textureY); // Box 13

		leftArmModel[0].addShapeBox(-18F, -5F, 81F, 36, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 14
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-18F, -13F, 81F, 36, 8, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -8F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 15
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-13F, -18F, 81F, 26, 5, 3, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F); // Box 16
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-18F, 5F, 81F, 36, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, -3F, 0F, -8F, -3F, 0F); // Box 50
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-13F, 13F, 81F, 26, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 51
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-34F, -25F, 0F, 53, 7, 10, 0F,-10F, 3F, 0F, -10F, 3F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F); // Box 62
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-39F, -8F, 0F, 63, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 65
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-39F, -18F, 0F, 63, 10, 10, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F); // Box 66
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-34F, 18F, 0F, 53, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -10F, 3F, 0F, -10F, 3F, 0F, -10F, -2F, 0F, -10F, -2F, 0F); // Box 67
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-39F, 8F, 0F, 63, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -7F, -1F, 0F, -7F, -1F, 0F); // Box 68
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-94F, -63F, 0F, 105, 40, 18, 0F,0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-94F, -103F, 0F, 116, 40, 18, 0F,0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-94F, -210F, 0F, 124, 107, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-94F, -63F, 18F, 105, 40, 32, 0F,0F, 0F, 0F, 11F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(-94F, -103F, 18F, 116, 40, 32, 0F,0F, 0F, 0F, 8F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-94F, -210F, 18F, 124, 107, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(-94F, -103F, 50F, 96, 40, 17, 0F,0F, 0F, 0F, 8F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(-94F, -210F, 50F, 104, 107, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(-94F, -63F, 50F, 85, 40, 17, 0F,0F, 0F, 0F, 11F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(-94F, -103F, 67F, 75, 40, 17, 0F,0F, 0F, 0F, 8F, 0F, 0F, -22F, 0F, 8F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 14F); // Box 11
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(-94F, -63F, 67F, 64, 40, 17, 0F,0F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -17F, 0F, 0F, 0F); // Box 12
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(-94F, -210F, 67F, 83, 107, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 8F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 8F, 0F, 0F, 20F); // Box 13
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(-94F, -250F, 18F, 116, 40, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(-94F, -250F, 50F, 96, 40, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(-94F, -250F, 67F, 75, 40, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 8F, 0F, 0F, -22F, 0F, 8F, 0F, 0F, 20F); // Box 19
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(-94F, -290F, 18F, 105, 40, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(-94F, -290F, 50F, 85, 40, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(-94F, -290F, 67F, 64, 40, 17, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 14F); // Box 22
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(-94F, -23F, 18F, 72, 23, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(-94F, -23F, 50F, 72, 23, 17, 0F,0F, 0F, 0F, 0F, 0F, -7F, -20F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(-56F, 0F, 50F, 34, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 3F, 0F, 0F, 3F); // Box 4
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(-114F, 0F, 18F, 92, 53, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -20F, -8F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(-94F, 0F, 67F, 52, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, -11F, 3F, -15F, -11F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, -15F, 0F, 3F, -15F, 0F, 3F); // Box 7
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);

		leftArmModel[33].addShapeBox(-114F, 0F, 50F, 34, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -20F, 0F, 3F); // Box 8
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);

		leftArmModel[34].addShapeBox(-94F, 11F, 70F, 52, 27, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -15F, 0F, 7F, -15F, 0F, 7F); // Box 9
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);

		leftArmModel[35].addShapeBox(-56F, 11F, 50F, 34, 27, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 7F, 0F, 0F, 7F); // Box 10
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);

		leftArmModel[36].addShapeBox(-114F, 11F, 50F, 34, 27, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -20F, 0F, 7F); // Box 11
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);

		leftArmModel[37].addShapeBox(-114F, 38F, 50F, 34, 15, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Box 12
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);

		leftArmModel[38].addShapeBox(-56F, 38F, 50F, 34, 15, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);

		leftArmModel[39].addShapeBox(-94F, 38F, 77F, 52, 15, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Box 14
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);

		leftArmModel[40].addShapeBox(-56F, 53F, 50F, 34, 6, 27, 0F,-10F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);

		leftArmModel[41].addShapeBox(-94F, 53F, 77F, 52, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Box 17
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);

		leftArmModel[42].addShapeBox(-114F, 53F, 50F, 34, 6, 27, 0F,0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Box 18
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);

		leftArmModel[43].addShapeBox(-114F, 53F, 38F, 92, 6, 12, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);

		leftArmModel[44].addShapeBox(-90F, 53F, 50F, 15, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 1
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);

		leftArmModel[45].addShapeBox(10F, 16F, 0F, 50, 65, 25, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);

		leftArmModel[46].addShapeBox(-90F, 16F, 0F, 50, 65, 25, 0F,-50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);

		leftArmModel[47].addShapeBox(10F, 81F, 0F, 70, 70, 25, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F); // Box 4
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);

		leftArmModel[48].addShapeBox(-110F, 81F, 0F, 70, 70, 25, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);

		leftArmModel[49].addShapeBox(-40F, 16F, 25F, 50, 65, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 8
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);

		leftArmModel[50].addShapeBox(10F, 16F, 25F, 50, 65, 42, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 16F); // Box 9
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);

		leftArmModel[51].addShapeBox(10F, 81F, 25F, 70, 70, 42, 0F,0F, 0F, 0F, -20F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftArmModel[51].setRotationPoint(0F, 0F, 0F);

		leftArmModel[52].addShapeBox(-40F, 81F, 0F, 50, 13, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftArmModel[52].setRotationPoint(0F, 0F, 0F);

		leftArmModel[53].addShapeBox(-90F, 16F, 25F, 50, 65, 42, 0F,-50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, -50F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -20F, 0F, 0F); // Box 12
		leftArmModel[53].setRotationPoint(0F, 0F, 0F);

		leftArmModel[54].addShapeBox(10F, 81F, 67F, 40, 70, 16, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 16F); // Box 13
		leftArmModel[54].setRotationPoint(0F, 0F, 0F);

		leftArmModel[55].addShapeBox(-110F, 81F, 25F, 70, 70, 42, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F); // Box 14
		leftArmModel[55].setRotationPoint(0F, 0F, 0F);

		leftArmModel[56].addShapeBox(-80F, 81F, 67F, 40, 70, 16, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, -16F); // Box 15
		leftArmModel[56].setRotationPoint(0F, 0F, 0F);

		leftArmModel[57].addShapeBox(-40F, 81F, 67F, 50, 70, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F); // Box 16
		leftArmModel[57].setRotationPoint(0F, 0F, 0F);

		leftArmModel[58].addShapeBox(-115F, 22F, 0F, 93, 55, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 22F, 5F); // Box 17
		leftArmModel[58].setRotationPoint(0F, 0F, 0F);

		leftArmModel[59].addShapeBox(40F, 151F, 25F, 40, 70, 40, 0F,-10F, 0F, 18F, 0F, 0F, 0F, -29F, 0F, 0F, 29F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F); // Box 20
		leftArmModel[59].setRotationPoint(0F, 0F, 0F);

		leftArmModel[60].addShapeBox(56F, 221F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, -40F, 0F, 0F); // Box 24
		leftArmModel[60].setRotationPoint(0F, 0F, 0F);

		leftArmModel[61].addShapeBox(96F, 291F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, -70F, 0F, 0F); // Box 25
		leftArmModel[61].setRotationPoint(0F, 0F, 0F);

		leftArmModel[62].addShapeBox(166F, 361F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F); // Box 26
		leftArmModel[62].setRotationPoint(0F, 0F, 0F);

		leftArmModel[63].addShapeBox(186F, 431F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftArmModel[63].setRotationPoint(0F, 0F, 0F);

		leftArmModel[64].addShapeBox(186F, 501F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F); // Box 28
		leftArmModel[64].setRotationPoint(0F, 0F, 0F);

		leftArmModel[65].addShapeBox(166F, 571F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 25F, 0F, 0F); // Box 29
		leftArmModel[65].setRotationPoint(0F, 0F, 0F);

		leftArmModel[66].addShapeBox(-110F, 151F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, -10F, 0F, 18F, 29F, 0F, 0F, -29F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F); // Box 30
		leftArmModel[66].setRotationPoint(0F, 0F, 0F);

		leftArmModel[67].addShapeBox(-126F, 221F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 40F, 0F, 0F); // Box 31
		leftArmModel[67].setRotationPoint(0F, 0F, 0F);

		leftArmModel[68].addShapeBox(-166F, 291F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 70F, 0F, 0F, -70F, 0F, 0F, -70F, 0F, 0F, 70F, 0F, 0F); // Box 32
		leftArmModel[68].setRotationPoint(0F, 0F, 0F);

		leftArmModel[69].addShapeBox(-236F, 361F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F); // Box 33
		leftArmModel[69].setRotationPoint(0F, 0F, 0F);

		leftArmModel[70].addShapeBox(-256F, 431F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftArmModel[70].setRotationPoint(0F, 0F, 0F);

		leftArmModel[71].addShapeBox(-256F, 501F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F); // Box 35
		leftArmModel[71].setRotationPoint(0F, 0F, 0F);

		leftArmModel[72].addShapeBox(-236F, 571F, 25F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, -60F, 0F, 0F); // Box 36
		leftArmModel[72].setRotationPoint(0F, 0F, 0F);

		leftArmModel[73].addShapeBox(-65F, 151F, 59F, 40, 70, 40, 0F,0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F, 16F); // Box 37
		leftArmModel[73].setRotationPoint(0F, 0F, 0F);

		leftArmModel[74].addShapeBox(-65F, 221F, 75F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, -40F, -20F, 0F, -40F, -20F, 0F, 40F, 20F, 0F, 40F); // Box 38
		leftArmModel[74].setRotationPoint(0F, 0F, 0F);

		leftArmModel[75].addShapeBox(-85F, 291F, 115F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, -70F, -40F, 0F, -70F, -40F, 0F, 70F, 40F, 0F, 70F); // Box 39
		leftArmModel[75].setRotationPoint(0F, 0F, 0F);

		leftArmModel[76].addShapeBox(-125F, 571F, 185F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 25F, 40F, 0F, 25F, 40F, 0F, -60F, -40F, 0F, -60F); // Box 40
		leftArmModel[76].setRotationPoint(0F, 0F, 0F);

		leftArmModel[77].addShapeBox(-145F, 501F, 205F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 20F, 20F, 0F, 20F, 20F, 0F, -20F, -20F, 0F, -20F); // Box 41
		leftArmModel[77].setRotationPoint(0F, 0F, 0F);

		leftArmModel[78].addShapeBox(-145F, 431F, 205F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftArmModel[78].setRotationPoint(0F, 0F, 0F);

		leftArmModel[79].addShapeBox(-125F, 361F, 185F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, -20F, -20F, 0F, -20F, -20F, 0F, 20F, 20F, 0F, 20F); // Box 43
		leftArmModel[79].setRotationPoint(0F, 0F, 0F);

		leftArmModel[80].addShapeBox(-94F, -250F, 0F, 116, 40, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftArmModel[80].setRotationPoint(0F, 0F, 0F);

		leftArmModel[81].addShapeBox(-94F, -290F, 0F, 105, 40, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftArmModel[81].setRotationPoint(0F, 0F, 0F);

		leftArmModel[82].addShapeBox(-5F, 151F, 59F, 40, 70, 40, 0F,10F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F, 16F); // Box 46
		leftArmModel[82].setRotationPoint(0F, 0F, 0F);

		leftArmModel[83].addShapeBox(-5F, 221F, 75F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, -40F, 20F, 0F, -40F, 20F, 0F, 40F, -20F, 0F, 40F); // Box 47
		leftArmModel[83].setRotationPoint(0F, 0F, 0F);

		leftArmModel[84].addShapeBox(15F, 291F, 115F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, -70F, 40F, 0F, -70F, 40F, 0F, 70F, -40F, 0F, 70F); // Box 48
		leftArmModel[84].setRotationPoint(0F, 0F, 0F);

		leftArmModel[85].addShapeBox(55F, 361F, 185F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, -20F, 20F, 0F, -20F, 20F, 0F, 20F, -20F, 0F, 20F); // Box 49
		leftArmModel[85].setRotationPoint(0F, 0F, 0F);

		leftArmModel[86].addShapeBox(75F, 431F, 205F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftArmModel[86].setRotationPoint(0F, 0F, 0F);

		leftArmModel[87].addShapeBox(75F, 501F, 205F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 20F, -20F, 0F, 20F, -20F, 0F, -20F, 20F, 0F, -20F); // Box 51
		leftArmModel[87].setRotationPoint(0F, 0F, 0F);

		leftArmModel[88].addShapeBox(55F, 571F, 185F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 25F, -40F, 0F, 25F, -40F, 0F, -60F, 40F, 0F, -60F); // Box 52
		leftArmModel[88].setRotationPoint(0F, 0F, 0F);

		leftArmModel[89].addShapeBox(-8F, 94F, 0F, 18, 19, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 3F, 0F, -4F); // Box 57
		leftArmModel[89].setRotationPoint(0F, 0F, 0F);

		leftArmModel[90].addShapeBox(-40F, 94F, 0F, 18, 19, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -6F, 0F, 0F, -8F); // Box 58
		leftArmModel[90].setRotationPoint(0F, 0F, 0F);

		leftArmModel[91].addShapeBox(-8F, 113F, 0F, 18, 19, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 0F, 6F, 8F, 0F, -5F, 0F, 0F, -7F, 0F, -12F, 3F, 0F, -10F); // Box 59
		leftArmModel[91].setRotationPoint(0F, 0F, 0F);

		leftArmModel[92].addShapeBox(-40F, 113F, 0F, 18, 16, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 0F, 0F, -4F, -5F, 0F, 0F, 6F, 7F, 0F, 3F, 0F, -10F, -7F, 0F, -12F); // Box 60
		leftArmModel[92].setRotationPoint(0F, 0F, 0F);

		leftArmModel[93].addShapeBox(-94F, -313F, 50F, 72, 23, 17, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 17F); // Box 61
		leftArmModel[93].setRotationPoint(0F, 0F, 0F);

		leftArmModel[94].addShapeBox(-94F, -313F, 18F, 85, 23, 32, 0F,0F, 0F, 0F, -9F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftArmModel[94].setRotationPoint(0F, 0F, 0F);

		leftArmModel[95].addShapeBox(-94F, -313F, 0F, 85, 23, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F); // Box 63
		leftArmModel[95].setRotationPoint(0F, 0F, 0F);

		leftArmModel[96].addShapeBox(-94F, -336F, 18F, 76, 23, 32, 0F,0F, 10F, 0F, -30F, 0F, 0F, -30F, 0F, -32F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 17F); // Box 64
		leftArmModel[96].setRotationPoint(0F, 0F, 0F);

		leftArmModel[97].addShapeBox(-94F, -336F, 0F, 85, 23, 18, 0F,0F, 15F, 0F, -33F, 0F, 0F, -39F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 65
		leftArmModel[97].setRotationPoint(0F, 0F, 0F);

		leftArmModel[98].addShapeBox(-181F, -23F, 50F, 87, 23, 17, 0F,13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, -17F); // Box 69
		leftArmModel[98].setRotationPoint(0F, 0F, 0F);

		leftArmModel[99].addShapeBox(-194F, -23F, 18F, 100, 23, 32, 0F,20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F); // Box 70
		leftArmModel[99].setRotationPoint(0F, 0F, 0F);

		leftArmModel[100].addShapeBox(-194F, 0F, 0F, 100, 23, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -33F, 0F, 0F, 0F, 15F, 0F, 0F, 10F, 0F, -39F, 0F, 0F); // Box 71
		leftArmModel[100].setRotationPoint(0F, 0F, 0F);

		leftArmModel[101].addShapeBox(-194F, -23F, 0F, 100, 23, 18, 0F,20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 72
		leftArmModel[101].setRotationPoint(0F, 0F, 0F);

		leftArmModel[102].addShapeBox(-186F, 0F, 18F, 91, 23, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, -24F, 0F, 0F, -30F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, -12F, -30F, 0F, -32F); // Box 73
		leftArmModel[102].setRotationPoint(0F, 0F, 0F);

		leftArmModel[103].addShapeBox(-214F, -63F, 0F, 120, 40, 18, 0F,11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftArmModel[103].setRotationPoint(0F, 0F, 0F);

		leftArmModel[104].addShapeBox(-225F, -103F, 0F, 131, 40, 18, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		leftArmModel[104].setRotationPoint(0F, 0F, 0F);

		leftArmModel[105].addShapeBox(-233F, -210F, 0F, 139, 107, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		leftArmModel[105].setRotationPoint(0F, 0F, 0F);

		leftArmModel[106].addShapeBox(-225F, -250F, 0F, 131, 40, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 77
		leftArmModel[106].setRotationPoint(0F, 0F, 0F);

		leftArmModel[107].addShapeBox(-214F, -290F, 0F, 120, 40, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 78
		leftArmModel[107].setRotationPoint(0F, 0F, 0F);

		leftArmModel[108].addShapeBox(-194F, -313F, 0F, 100, 23, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F); // Box 79
		leftArmModel[108].setRotationPoint(0F, 0F, 0F);

		leftArmModel[109].addShapeBox(-194F, -336F, 0F, 100, 23, 18, 0F,-33F, 0F, 0F, 0F, 15F, 0F, 0F, 10F, 0F, -39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 80
		leftArmModel[109].setRotationPoint(0F, 0F, 0F);

		leftArmModel[110].addShapeBox(-214F, -63F, 18F, 120, 40, 32, 0F,11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Box 81
		leftArmModel[110].setRotationPoint(0F, 0F, 0F);

		leftArmModel[111].addShapeBox(-225F, -103F, 18F, 131, 40, 32, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Box 82
		leftArmModel[111].setRotationPoint(0F, 0F, 0F);

		leftArmModel[112].addShapeBox(-233F, -210F, 18F, 139, 107, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Box 83
		leftArmModel[112].setRotationPoint(0F, 0F, 0F);

		leftArmModel[113].addShapeBox(-225F, -250F, 18F, 131, 40, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 84
		leftArmModel[113].setRotationPoint(0F, 0F, 0F);

		leftArmModel[114].addShapeBox(-214F, -290F, 18F, 120, 40, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 85
		leftArmModel[114].setRotationPoint(0F, 0F, 0F);

		leftArmModel[115].addShapeBox(-194F, -313F, 18F, 100, 23, 32, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		leftArmModel[115].setRotationPoint(0F, 0F, 0F);

		leftArmModel[116].addShapeBox(-185F, -336F, 18F, 91, 23, 32, 0F,-30F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, -12F, -30F, 0F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, -24F, 0F, 0F); // Box 87
		leftArmModel[116].setRotationPoint(0F, 0F, 0F);

		leftArmModel[117].addShapeBox(-194F, -290F, 50F, 100, 40, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 88
		leftArmModel[117].setRotationPoint(0F, 0F, 0F);

		leftArmModel[118].addShapeBox(-205F, -250F, 50F, 111, 40, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F); // Box 89
		leftArmModel[118].setRotationPoint(0F, 0F, 0F);

		leftArmModel[119].addShapeBox(-213F, -210F, 50F, 119, 107, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F); // Box 90
		leftArmModel[119].setRotationPoint(0F, 0F, 0F);

		leftArmModel[120].addShapeBox(-205F, -103F, 50F, 111, 40, 17, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F); // Box 91
		leftArmModel[120].setRotationPoint(0F, 0F, 0F);

		leftArmModel[121].addShapeBox(-194F, -63F, 50F, 100, 40, 17, 0F,11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F); // Box 92
		leftArmModel[121].setRotationPoint(0F, 0F, 0F);

		leftArmModel[122].addShapeBox(-181F, -313F, 50F, 87, 23, 17, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, -17F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, -20F, 0F, 0F); // Box 93
		leftArmModel[122].setRotationPoint(0F, 0F, 0F);

		leftArmModel[123].addShapeBox(-173F, -63F, 67F, 79, 40, 17, 0F,11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, -11F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -17F); // Box 94
		leftArmModel[123].setRotationPoint(0F, 0F, 0F);

		leftArmModel[124].addShapeBox(-184F, -103F, 67F, 90, 40, 17, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -22F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, -22F, 0F, 0F); // Box 95
		leftArmModel[124].setRotationPoint(0F, 0F, 0F);

		leftArmModel[125].addShapeBox(-192F, -210F, 67F, 98, 107, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -30F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -30F, 0F, 8F); // Box 96
		leftArmModel[125].setRotationPoint(0F, 0F, 0F);

		leftArmModel[126].addShapeBox(-184F, -250F, 67F, 90, 40, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, -22F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -22F, 0F, 8F); // Box 97
		leftArmModel[126].setRotationPoint(0F, 0F, 0F);

		leftArmModel[127].addShapeBox(-173F, -290F, 67F, 79, 40, 17, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -17F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, -11F, 0F, 0F); // Box 98
		leftArmModel[127].setRotationPoint(0F, 0F, 0F);

		leftArmModel[128].addShapeBox(-94F, -23F, -67F, 72, 23, 17, 0F,0F, 0F, 17F, -20F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[128].setRotationPoint(0F, 0F, 0F);

		leftArmModel[129].addShapeBox(-114F, 53F, -70F, 34, 6, 27, 0F,-20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[129].setRotationPoint(0F, 0F, -6F);

		leftArmModel[130].addShapeBox(-114F, 53F, -49F, 92, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 1
		leftArmModel[130].setRotationPoint(0F, 0F, 0F);

		leftArmModel[131].addShapeBox(-56F, 53F, -70F, 34, 6, 27, 0F,0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 2
		leftArmModel[131].setRotationPoint(0F, 0F, -6F);

		leftArmModel[132].addShapeBox(-94F, 53F, -77F, 52, 6, 7, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftArmModel[132].setRotationPoint(0F, 0F, -6F);

		leftArmModel[133].addShapeBox(-56F, 38F, -70F, 34, 15, 27, 0F,0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 4
		leftArmModel[133].setRotationPoint(0F, 0F, -6F);

		leftArmModel[134].addShapeBox(-94F, 38F, -77F, 52, 15, 7, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftArmModel[134].setRotationPoint(0F, 0F, -6F);

		leftArmModel[135].addShapeBox(-56F, 11F, -63F, 34, 27, 20, 0F,0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -20F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftArmModel[135].setRotationPoint(0F, 0F, -6F);

		leftArmModel[136].addShapeBox(-94F, 11F, -70F, 52, 27, 7, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 7F, -15F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 7
		leftArmModel[136].setRotationPoint(0F, 0F, -6F);

		leftArmModel[137].addShapeBox(-114F, 38F, -70F, 34, 15, 27, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftArmModel[137].setRotationPoint(0F, 0F, -6F);

		leftArmModel[138].addShapeBox(-114F, 11F, -63F, 34, 27, 20, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftArmModel[138].setRotationPoint(0F, 0F, -6F);

		leftArmModel[139].addShapeBox(-56F, 0F, -60F, 34, 11, 17, 0F,0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -20F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftArmModel[139].setRotationPoint(0F, 0F, -6F);

		leftArmModel[140].addShapeBox(-94F, 0F, -73F, 52, 11, 7, 0F,-15F, -11F, 3F, -15F, -11F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 3F, -15F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 11
		leftArmModel[140].setRotationPoint(0F, 0F, 0F);

		leftArmModel[141].addShapeBox(-114F, 0F, -60F, 34, 11, 17, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftArmModel[141].setRotationPoint(0F, 0F, -6F);

		leftArmModel[142].addShapeBox(-114F, 0F, -49F, 92, 53, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -20F, -8F, 0F, -20F); // Box 13
		leftArmModel[142].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 961, 39, textureX, textureY); // Box 0
		rightArmModel[1] = new ModelRendererTurbo(this, 961, 80, textureX, textureY); // Box 1
		rightArmModel[2] = new ModelRendererTurbo(this, 961, 126, textureX, textureY); // Box 2
		rightArmModel[3] = new ModelRendererTurbo(this, 961, 223, textureX, textureY); // Box 3
		rightArmModel[4] = new ModelRendererTurbo(this, 961, 179, textureX, textureY); // Box 4
		rightArmModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 30
		rightArmModel[6] = new ModelRendererTurbo(this, 225, 39, textureX, textureY); // Box 31
		rightArmModel[7] = new ModelRendererTurbo(this, 225, 56, textureX, textureY); // Box 32
		rightArmModel[8] = new ModelRendererTurbo(this, 225, 76, textureX, textureY); // Box 33
		rightArmModel[9] = new ModelRendererTurbo(this, 225, 96, textureX, textureY); // Box 34
		rightArmModel[10] = new ModelRendererTurbo(this, 502, 319, textureX, textureY); // Box 35
		rightArmModel[11] = new ModelRendererTurbo(this, 502, 319, textureX, textureY); // Box 37
		rightArmModel[12] = new ModelRendererTurbo(this, 491, 418, textureX, textureY); // Box 38
		rightArmModel[13] = new ModelRendererTurbo(this, 494, 537, textureX, textureY); // Box 39
		rightArmModel[14] = new ModelRendererTurbo(this, 491, 418, textureX, textureY); // Box 40
		rightArmModel[15] = new ModelRendererTurbo(this, 499, 666, textureX, textureY); // Box 41
		rightArmModel[16] = new ModelRendererTurbo(this, 499, 666, textureX, textureY); // Box 42
		rightArmModel[17] = new ModelRendererTurbo(this, 488, 767, textureX, textureY); // Box 43
		rightArmModel[18] = new ModelRendererTurbo(this, 615, 900, textureX, textureY); // Box 44
		rightArmModel[19] = new ModelRendererTurbo(this, 473, 931, textureX, textureY); // Box 45
		rightArmModel[20] = new ModelRendererTurbo(this, 488, 767, textureX, textureY); // Box 46
		rightArmModel[21] = new ModelRendererTurbo(this, 615, 900, textureX, textureY); // Box 47
		rightArmModel[22] = new ModelRendererTurbo(this, 977, 275, textureX, textureY); // Box 48
		rightArmModel[23] = new ModelRendererTurbo(this, 1162, 275, textureX, textureY); // Box 49
		rightArmModel[24] = new ModelRendererTurbo(this, 1527, 277, textureX, textureY); // Box 50
		rightArmModel[25] = new ModelRendererTurbo(this, 1527, 277, textureX, textureY); // Box 51
		rightArmModel[26] = new ModelRendererTurbo(this, 977, 394, textureX, textureY); // Box 52
		rightArmModel[27] = new ModelRendererTurbo(this, 1162, 394, textureX, textureY); // Box 53
		rightArmModel[28] = new ModelRendererTurbo(this, 1162, 513, textureX, textureY); // Box 54
		rightArmModel[29] = new ModelRendererTurbo(this, 977, 513, textureX, textureY); // Box 55
		rightArmModel[30] = new ModelRendererTurbo(this, 977, 632, textureX, textureY); // Box 56
		rightArmModel[31] = new ModelRendererTurbo(this, 1162, 632, textureX, textureY); // Box 57
		rightArmModel[32] = new ModelRendererTurbo(this, 1162, 751, textureX, textureY); // Box 58
		rightArmModel[33] = new ModelRendererTurbo(this, 977, 751, textureX, textureY); // Box 59
		rightArmModel[34] = new ModelRendererTurbo(this, 977, 873, textureX, textureY); // Box 60
		rightArmModel[35] = new ModelRendererTurbo(this, 1162, 873, textureX, textureY); // Box 61
		rightArmModel[36] = new ModelRendererTurbo(this, 1162, 1004, textureX, textureY); // Box 62
		rightArmModel[37] = new ModelRendererTurbo(this, 977, 1004, textureX, textureY); // Box 63
		rightArmModel[38] = new ModelRendererTurbo(this, 1527, 396, textureX, textureY); // Box 64
		rightArmModel[39] = new ModelRendererTurbo(this, 1527, 396, textureX, textureY); // Box 65
		rightArmModel[40] = new ModelRendererTurbo(this, 1527, 515, textureX, textureY); // Box 66
		rightArmModel[41] = new ModelRendererTurbo(this, 1527, 515, textureX, textureY); // Box 67
		rightArmModel[42] = new ModelRendererTurbo(this, 1527, 634, textureX, textureY); // Box 68
		rightArmModel[43] = new ModelRendererTurbo(this, 1527, 634, textureX, textureY); // Box 69
		rightArmModel[44] = new ModelRendererTurbo(this, 1527, 753, textureX, textureY); // Box 70
		rightArmModel[45] = new ModelRendererTurbo(this, 1527, 753, textureX, textureY); // Box 71
		rightArmModel[46] = new ModelRendererTurbo(this, 1527, 875, textureX, textureY); // Box 72
		rightArmModel[47] = new ModelRendererTurbo(this, 1527, 875, textureX, textureY); // Box 73
		rightArmModel[48] = new ModelRendererTurbo(this, 1527, 1006, textureX, textureY); // Box 74
		rightArmModel[49] = new ModelRendererTurbo(this, 1527, 1006, textureX, textureY); // Box 75
		rightArmModel[50] = new ModelRendererTurbo(this, 316, 6, textureX, textureY); // Box 0
		rightArmModel[51] = new ModelRendererTurbo(this, 477, 60, textureX, textureY); // Box 1
		rightArmModel[52] = new ModelRendererTurbo(this, 477, 11, textureX, textureY); // Box 2
		rightArmModel[53] = new ModelRendererTurbo(this, 578, 10, textureX, textureY); // Box 3
		rightArmModel[54] = new ModelRendererTurbo(this, 578, 59, textureX, textureY); // Box 4
		rightArmModel[55] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 5
		rightArmModel[56] = new ModelRendererTurbo(this, 368, 175, textureX, textureY); // Box 6
		rightArmModel[57] = new ModelRendererTurbo(this, 365, 165, textureX, textureY); // Box 7
		rightArmModel[58] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 8
		rightArmModel[59] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 9
		rightArmModel[60] = new ModelRendererTurbo(this, 336, 172, textureX, textureY); // Box 10
		rightArmModel[61] = new ModelRendererTurbo(this, 348, 190, textureX, textureY); // Box 11
		rightArmModel[62] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 12
		rightArmModel[63] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 13
		rightArmModel[64] = new ModelRendererTurbo(this, 344, 179, textureX, textureY); // Box 14
		rightArmModel[65] = new ModelRendererTurbo(this, 404, 160, textureX, textureY); // Box 15
		rightArmModel[66] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 16
		rightArmModel[67] = new ModelRendererTurbo(this, 8, 315, textureX, textureY); // Box 17
		rightArmModel[68] = new ModelRendererTurbo(this, 238, 316, textureX, textureY); // Box 18
		rightArmModel[69] = new ModelRendererTurbo(this, 355, 188, textureX, textureY); // Box 19
		rightArmModel[70] = new ModelRendererTurbo(this, 216, 979, textureX, textureY); // Box 20
		rightArmModel[71] = new ModelRendererTurbo(this, 691, 14, textureX, textureY); // Box 21
		rightArmModel[72] = new ModelRendererTurbo(this, 204, 920, textureX, textureY); // Box 22
		rightArmModel[73] = new ModelRendererTurbo(this, 395, 214, textureX, textureY); // Box 23
		rightArmModel[74] = new ModelRendererTurbo(this, 359, 198, textureX, textureY); // Box 24
		rightArmModel[75] = new ModelRendererTurbo(this, 347, 200, textureX, textureY); // Box 25
		rightArmModel[76] = new ModelRendererTurbo(this, 339, 166, textureX, textureY); // Box 26
		rightArmModel[77] = new ModelRendererTurbo(this, 348, 199, textureX, textureY); // Box 27
		rightArmModel[78] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 28
		rightArmModel[79] = new ModelRendererTurbo(this, 358, 176, textureX, textureY); // Box 29
		rightArmModel[80] = new ModelRendererTurbo(this, 239, 365, textureX, textureY); // Box 30
		rightArmModel[81] = new ModelRendererTurbo(this, 8, 363, textureX, textureY); // Box 31
		rightArmModel[82] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 32
		rightArmModel[83] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 33
		rightArmModel[84] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 34
		rightArmModel[85] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 35
		rightArmModel[86] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 36
		rightArmModel[87] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 37
		rightArmModel[88] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 53
		rightArmModel[89] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 54
		rightArmModel[90] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 55
		rightArmModel[91] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 56
		rightArmModel[92] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 57
		rightArmModel[93] = new ModelRendererTurbo(this, 8, 425, textureX, textureY); // Box 58
		rightArmModel[94] = new ModelRendererTurbo(this, 239, 426, textureX, textureY); // Box 59
		rightArmModel[95] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 60
		rightArmModel[96] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 61
		rightArmModel[97] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 62
		rightArmModel[98] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 63
		rightArmModel[99] = new ModelRendererTurbo(this, 338, 163, textureX, textureY); // Box 64
		rightArmModel[100] = new ModelRendererTurbo(this, 223, 873, textureX, textureY); // Box 65
		rightArmModel[101] = new ModelRendererTurbo(this, 8, 475, textureX, textureY); // Box 66
		rightArmModel[102] = new ModelRendererTurbo(this, 239, 475, textureX, textureY); // Box 67
		rightArmModel[103] = new ModelRendererTurbo(this, 239, 540, textureX, textureY); // Box 68
		rightArmModel[104] = new ModelRendererTurbo(this, 8, 546, textureX, textureY); // Box 69
		rightArmModel[105] = new ModelRendererTurbo(this, 8, 614, textureX, textureY); // Box 70
		rightArmModel[106] = new ModelRendererTurbo(this, 239, 602, textureX, textureY); // Box 71
		rightArmModel[107] = new ModelRendererTurbo(this, 239, 733, textureX, textureY); // Box 72
		rightArmModel[108] = new ModelRendererTurbo(this, 8, 745, textureX, textureY); // Box 73
		rightArmModel[109] = new ModelRendererTurbo(this, 8, 813, textureX, textureY); // Box 74
		rightArmModel[110] = new ModelRendererTurbo(this, 239, 798, textureX, textureY); // Box 75

		rightArmModel[0].addShapeBox(-34F, -25F, -10F, 53, 7, 10, 0F,-10F, -2F, 0F, -10F, -2F, 0F, -10F, 3F, 0F, -10F, 3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-39F, -18F, -10F, 63, 10, 10, 0F,-7F, -1F, 0F, -7F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-39F, -8F, -10F, 63, 16, 10, 0F,-2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-34F, 18F, -10F, 53, 7, 10, 0F,-2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, -10F, 3F, 0F, -10F, 3F, 0F); // Box 3
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-39F, 8F, -10F, 63, 10, 10, 0F,-2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 4
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-13F, -18F, -83F, 26, 5, 3, 0F,-8F, -4F, 0F, -8F, -4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-18F, -13F, -83F, 36, 8, 3, 0F,-8F, -3F, 0F, -8F, -3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-18F, -5F, -83F, 36, 10, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-18F, 5F, -83F, 36, 8, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, -8F, -3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 33
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-13F, 13F, -83F, 26, 5, 3, 0F,-3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 34
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(10F, 16F, -25F, 50, 65, 25, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-90F, 16F, -25F, 50, 65, 25, 0F,-50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(10F, 16F, -67F, 50, 65, 42, 0F,0F, 0F, -30F, -50F, 0F, -30F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-40F, 16F, -75F, 50, 65, 50, 0F,0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-90F, 16F, -67F, 50, 65, 42, 0F,-50F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, -50F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(10F, 81F, -25F, 70, 70, 25, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F); // Box 41
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-110F, 81F, -25F, 70, 70, 25, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F); // Box 42
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-110F, 81F, -67F, 70, 70, 42, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F); // Box 43
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-80F, 81F, -83F, 40, 70, 16, 0F,-10F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-40F, 81F, -83F, 50, 70, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(10F, 81F, -67F, 70, 70, 42, 0F,0F, 0F, 0F, -40F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F); // Box 46
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(10F, 81F, -83F, 40, 70, 16, 0F,0F, 0F, 0F, -10F, 0F, -16F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(40F, 151F, -67F, 40, 70, 40, 0F,29F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 18F, -16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F); // Box 48
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-110F, 151F, -67F, 40, 70, 40, 0F,-29F, 0F, 0F, 29F, 0F, 0F, -10F, 0F, 18F, 0F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F); // Box 49
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(-5F, 151F, -99F, 40, 70, 40, 0F,10F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, -16F); // Box 50
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(-65F, 151F, -99F, 40, 70, 40, 0F,-25F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, -16F); // Box 51
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(56F, 221F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, -40F, 0F, 0F); // Box 52
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);

		rightArmModel[27].addShapeBox(-126F, 221F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 40F, 0F, 0F); // Box 53
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(-166F, 291F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 70F, 0F, 0F, -70F, 0F, 0F, -70F, 0F, 0F, 70F, 0F, 0F); // Box 54
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(96F, 291F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, -70F, 0F, 0F); // Box 55
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);

		rightArmModel[30].addShapeBox(166F, 361F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F); // Box 56
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);

		rightArmModel[31].addShapeBox(-236F, 361F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F); // Box 57
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);

		rightArmModel[32].addShapeBox(-256F, 431F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);

		rightArmModel[33].addShapeBox(186F, 431F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);

		rightArmModel[34].addShapeBox(186F, 501F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F); // Box 60
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);

		rightArmModel[35].addShapeBox(-256F, 501F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F); // Box 61
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);

		rightArmModel[36].addShapeBox(-236F, 571F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, -60F, 0F, 0F); // Box 62
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);

		rightArmModel[37].addShapeBox(166F, 571F, -67F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 25F, 0F, 0F); // Box 63
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);

		rightArmModel[38].addShapeBox(-5F, 221F, -115F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 40F, 20F, 0F, 40F, 20F, 0F, -40F, -20F, 0F, -40F); // Box 64
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);

		rightArmModel[39].addShapeBox(-65F, 221F, -115F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 40F, -20F, 0F, 40F, -20F, 0F, -40F, 20F, 0F, -40F); // Box 65
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);

		rightArmModel[40].addShapeBox(-85F, 291F, -155F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 70F, -40F, 0F, 70F, -40F, 0F, -70F, 40F, 0F, -70F); // Box 66
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);

		rightArmModel[41].addShapeBox(15F, 291F, -155F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 70F, 40F, 0F, 70F, 40F, 0F, -70F, -40F, 0F, -70F); // Box 67
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);

		rightArmModel[42].addShapeBox(55F, 361F, -225F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 20F, 20F, 0F, 20F, 20F, 0F, -20F, -20F, 0F, -20F); // Box 68
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);

		rightArmModel[43].addShapeBox(-125F, 361F, -225F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 20F, -20F, 0F, 20F, -20F, 0F, -20F, 20F, 0F, -20F); // Box 69
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);

		rightArmModel[44].addShapeBox(-145F, 431F, -245F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);

		rightArmModel[45].addShapeBox(75F, 431F, -245F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);

		rightArmModel[46].addShapeBox(75F, 501F, -245F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, -20F, -20F, 0F, -20F, -20F, 0F, 20F, 20F, 0F, 20F); // Box 72
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);

		rightArmModel[47].addShapeBox(-145F, 501F, -245F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, -20F, 20F, 0F, -20F, 20F, 0F, 20F, -20F, 0F, 20F); // Box 73
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);

		rightArmModel[48].addShapeBox(-125F, 571F, -225F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, -60F, 40F, 0F, -60F, 40F, 0F, 25F, -40F, 0F, 25F); // Box 74
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);

		rightArmModel[49].addShapeBox(55F, 571F, -225F, 40, 70, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, -60F, -40F, 0F, -60F, -40F, 0F, 25F, 40F, 0F, 25F); // Box 75
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);

		rightArmModel[50].addShapeBox(-40F, 81F, -25F, 50, 13, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightArmModel[50].setRotationPoint(0F, 0F, 0F);

		rightArmModel[51].addShapeBox(-8F, 113F, -21F, 18, 19, 21, 0F,3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -10F, -7F, 0F, -12F, -5F, 0F, 0F, 6F, 8F, 0F); // Box 1
		rightArmModel[51].setRotationPoint(0F, 0F, 0F);

		rightArmModel[52].addShapeBox(-8F, 94F, -25F, 18, 19, 25, 0F,7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightArmModel[52].setRotationPoint(0F, 0F, 0F);

		rightArmModel[53].addShapeBox(-40F, 94F, -25F, 18, 19, 25, 0F,0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		rightArmModel[53].setRotationPoint(0F, 0F, 0F);

		rightArmModel[54].addShapeBox(-40F, 113F, -21F, 18, 16, 21, 0F,0F, 0F, -4F, 3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -12F, 3F, 0F, -10F, 6F, 7F, 0F, -5F, 0F, 0F); // Box 4
		rightArmModel[54].setRotationPoint(0F, 0F, 0F);

		rightArmModel[55].addShapeBox(-94F, -63F, -18F, 105, 40, 18, 0F,0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		rightArmModel[55].setRotationPoint(0F, 0F, 0F);

		rightArmModel[56].addShapeBox(-214F, -63F, -18F, 120, 40, 18, 0F,11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightArmModel[56].setRotationPoint(0F, 0F, 0F);

		rightArmModel[57].addShapeBox(-225F, -103F, -18F, 131, 40, 18, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		rightArmModel[57].setRotationPoint(0F, 0F, 0F);

		rightArmModel[58].addShapeBox(-94F, -103F, -18F, 116, 40, 18, 0F,0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightArmModel[58].setRotationPoint(0F, 0F, 0F);

		rightArmModel[59].addShapeBox(-94F, -210F, -18F, 124, 107, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		rightArmModel[59].setRotationPoint(0F, 0F, 0F);

		rightArmModel[60].addShapeBox(-233F, -210F, -18F, 139, 107, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		rightArmModel[60].setRotationPoint(0F, 0F, 0F);

		rightArmModel[61].addShapeBox(-225F, -250F, -18F, 131, 40, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 11
		rightArmModel[61].setRotationPoint(0F, 0F, 0F);

		rightArmModel[62].addShapeBox(-94F, -250F, -18F, 116, 40, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightArmModel[62].setRotationPoint(0F, 0F, 0F);

		rightArmModel[63].addShapeBox(-94F, -290F, -18F, 105, 40, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightArmModel[63].setRotationPoint(0F, 0F, 0F);

		rightArmModel[64].addShapeBox(-214F, -290F, -18F, 120, 40, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 14
		rightArmModel[64].setRotationPoint(0F, 0F, 0F);

		rightArmModel[65].addShapeBox(-194F, -313F, -18F, 100, 23, 18, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F); // Box 15
		rightArmModel[65].setRotationPoint(0F, 0F, 0F);

		rightArmModel[66].addShapeBox(-94F, -313F, -18F, 85, 23, 18, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightArmModel[66].setRotationPoint(0F, 0F, 0F);

		rightArmModel[67].addShapeBox(-94F, -336F, -18F, 85, 23, 18, 0F,0F, 10F, 0F, -39F, 0F, 0F, -33F, 0F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightArmModel[67].setRotationPoint(0F, 0F, 0F);

		rightArmModel[68].addShapeBox(-194F, -336F, -18F, 100, 23, 18, 0F,-39F, 0F, 0F, 0F, 10F, 0F, 0F, 15F, 0F, -33F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightArmModel[68].setRotationPoint(0F, 0F, 0F);

		rightArmModel[69].addShapeBox(-194F, -23F, -18F, 100, 23, 18, 0F,20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightArmModel[69].setRotationPoint(0F, 0F, 0F);

		rightArmModel[70].addShapeBox(-194F, 0F, -18F, 100, 23, 18, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, 0F, 10F, 0F, 0F, 15F, 0F, -33F, 0F, 0F); // Box 20
		rightArmModel[70].setRotationPoint(0F, 0F, 0F);

		rightArmModel[71].addShapeBox(-115F, 22F, -32F, 93, 55, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 22F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 22F, 0F); // Box 21
		rightArmModel[71].setRotationPoint(0F, 0F, 0F);

		rightArmModel[72].addShapeBox(-186F, 0F, -50F, 91, 23, 32, 0F,-24F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, -32F, 0F, 0F, -12F, 0F, 10F, 0F, -30F, 0F, 0F); // Box 22
		rightArmModel[72].setRotationPoint(0F, 0F, 0F);

		rightArmModel[73].addShapeBox(-194F, -23F, -50F, 100, 23, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 23
		rightArmModel[73].setRotationPoint(0F, 0F, 0F);

		rightArmModel[74].addShapeBox(-214F, -63F, -50F, 120, 40, 32, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightArmModel[74].setRotationPoint(0F, 0F, 0F);

		rightArmModel[75].addShapeBox(-225F, -103F, -50F, 131, 40, 32, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightArmModel[75].setRotationPoint(0F, 0F, 0F);

		rightArmModel[76].addShapeBox(-233F, -210F, -50F, 139, 107, 32, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		rightArmModel[76].setRotationPoint(0F, 0F, 0F);

		rightArmModel[77].addShapeBox(-225F, -250F, -50F, 131, 40, 32, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 27
		rightArmModel[77].setRotationPoint(0F, 0F, 0F);

		rightArmModel[78].addShapeBox(-214F, -290F, -50F, 120, 40, 32, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 28
		rightArmModel[78].setRotationPoint(0F, 0F, 0F);

		rightArmModel[79].addShapeBox(-194F, -313F, -50F, 100, 23, 32, 0F,-33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F); // Box 29
		rightArmModel[79].setRotationPoint(0F, 0F, 0F);

		rightArmModel[80].addShapeBox(-185F, -336F, -50F, 91, 23, 32, 0F,-30F, 0F, -32F, 0F, 0F, -12F, 0F, 10F, 0F, -30F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		rightArmModel[80].setRotationPoint(0F, 0F, 0F);

		rightArmModel[81].addShapeBox(-94F, -336F, -50F, 76, 23, 32, 0F,0F, 0F, -12F, -30F, 0F, -32F, -30F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 17F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightArmModel[81].setRotationPoint(0F, 0F, 0F);

		rightArmModel[82].addShapeBox(-94F, -313F, -50F, 85, 23, 32, 0F,0F, 0F, 0F, -33F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightArmModel[82].setRotationPoint(0F, 0F, 0F);

		rightArmModel[83].addShapeBox(-94F, -290F, -50F, 105, 40, 32, 0F,0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightArmModel[83].setRotationPoint(0F, 0F, 0F);

		rightArmModel[84].addShapeBox(-94F, -250F, -50F, 116, 40, 32, 0F,0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightArmModel[84].setRotationPoint(0F, 0F, 0F);

		rightArmModel[85].addShapeBox(-94F, -210F, -50F, 124, 107, 32, 0F,0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightArmModel[85].setRotationPoint(0F, 0F, 0F);

		rightArmModel[86].addShapeBox(-94F, -103F, -50F, 116, 40, 32, 0F,0F, 0F, 0F, -12F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		rightArmModel[86].setRotationPoint(0F, 0F, 0F);

		rightArmModel[87].addShapeBox(-94F, -63F, -50F, 105, 40, 32, 0F,0F, 0F, 0F, -9F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightArmModel[87].setRotationPoint(0F, 0F, 0F);

		rightArmModel[88].addShapeBox(-94F, -63F, -67F, 85, 40, 17, 0F,0F, 0F, 0F, -10F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightArmModel[88].setRotationPoint(0F, 0F, 0F);

		rightArmModel[89].addShapeBox(-94F, -103F, -67F, 96, 40, 17, 0F,0F, 0F, 0F, -13F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightArmModel[89].setRotationPoint(0F, 0F, 0F);

		rightArmModel[90].addShapeBox(-94F, -210F, -67F, 104, 107, 17, 0F,0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightArmModel[90].setRotationPoint(0F, 0F, 0F);

		rightArmModel[91].addShapeBox(-94F, -250F, -67F, 96, 40, 17, 0F,0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightArmModel[91].setRotationPoint(0F, 0F, 0F);

		rightArmModel[92].addShapeBox(-94F, -290F, -67F, 85, 40, 17, 0F,0F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 57
		rightArmModel[92].setRotationPoint(0F, 0F, 0F);

		rightArmModel[93].addShapeBox(-94F, -313F, -67F, 72, 23, 17, 0F,0F, 0F, 0F, -20F, 0F, -17F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, -20F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightArmModel[93].setRotationPoint(0F, 0F, 0F);

		rightArmModel[94].addShapeBox(-181F, -313F, -67F, 87, 23, 17, 0F,-20F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 13F, 0F, 0F); // Box 59
		rightArmModel[94].setRotationPoint(0F, 0F, 0F);

		rightArmModel[95].addShapeBox(-194F, -290F, -67F, 100, 40, 17, 0F,-33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 60
		rightArmModel[95].setRotationPoint(0F, 0F, 0F);

		rightArmModel[96].addShapeBox(-205F, -250F, -67F, 111, 40, 17, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 61
		rightArmModel[96].setRotationPoint(0F, 0F, 0F);

		rightArmModel[97].addShapeBox(-213F, -210F, -67F, 119, 107, 17, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightArmModel[97].setRotationPoint(0F, 0F, 0F);

		rightArmModel[98].addShapeBox(-205F, -103F, -67F, 111, 40, 17, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightArmModel[98].setRotationPoint(0F, 0F, 0F);

		rightArmModel[99].addShapeBox(-194F, -63F, -67F, 100, 40, 17, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		rightArmModel[99].setRotationPoint(0F, 0F, 0F);

		rightArmModel[100].addShapeBox(-181F, -23F, -67F, 87, 23, 17, 0F,-20F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 13F, 0F, 0F, -20F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Box 65
		rightArmModel[100].setRotationPoint(0F, 0F, 0F);

		rightArmModel[101].addShapeBox(-94F, -290F, -84F, 64, 40, 17, 0F,0F, 0F, 0F, -12F, 0F, -17F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, -11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightArmModel[101].setRotationPoint(0F, 0F, 0F);

		rightArmModel[102].addShapeBox(-173F, -290F, -84F, 79, 40, 17, 0F,-12F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 67
		rightArmModel[102].setRotationPoint(0F, 0F, 0F);

		rightArmModel[103].addShapeBox(-184F, -250F, -84F, 90, 40, 17, 0F,-22F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 8F, 0F, 0F, 20F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 68
		rightArmModel[103].setRotationPoint(0F, 0F, 0F);

		rightArmModel[104].addShapeBox(-94F, -250F, -84F, 75, 40, 17, 0F,0F, 0F, 14F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -22F, 0F, 8F, 8F, 0F, 0F, 0F, 0F, 0F); // Box 69
		rightArmModel[104].setRotationPoint(0F, 0F, 0F);

		rightArmModel[105].addShapeBox(-94F, -210F, -84F, 83, 107, 17, 0F,0F, 0F, 20F, -30F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -30F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightArmModel[105].setRotationPoint(0F, 0F, 0F);

		rightArmModel[106].addShapeBox(-192F, -210F, -84F, 98, 107, 17, 0F,-30F, 0F, 8F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 8F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightArmModel[106].setRotationPoint(0F, 0F, 0F);

		rightArmModel[107].addShapeBox(-184F, -103F, -84F, 90, 40, 17, 0F,-22F, 0F, 8F, 0F, 0F, 20F, 0F, 0F, 0F, 8F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightArmModel[107].setRotationPoint(0F, 0F, 0F);

		rightArmModel[108].addShapeBox(-94F, -103F, -84F, 75, 40, 17, 0F,0F, 0F, 20F, -22F, 0F, 8F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightArmModel[108].setRotationPoint(0F, 0F, 0F);

		rightArmModel[109].addShapeBox(-94F, -63F, -84F, 64, 40, 17, 0F,0F, 0F, 14F, -11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -17F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightArmModel[109].setRotationPoint(0F, 0F, 0F);

		rightArmModel[110].addShapeBox(-173F, -63F, -84F, 79, 40, 17, 0F,-11F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 11F, 0F, 0F, -12F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 75
		rightArmModel[110].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 5, 147, textureX, textureY); // Box 100

		leftLegModel[0].addBox(-2F, 0F, 0F, 4, 6, 1, 0F); // Box 100
		leftLegModel[0].setRotationPoint(0F, 0F, 3F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 5, 147, textureX, textureY); // Box 101

		rightLegModel[0].addBox(-2F, 0F, -1F, 4, 6, 1, 0F); // Box 101
		rightLegModel[0].setRotationPoint(0F, 0F, -3F);
	}
}