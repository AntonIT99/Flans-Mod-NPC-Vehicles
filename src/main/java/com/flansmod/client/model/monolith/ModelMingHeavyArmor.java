//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingHeavyArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMingHeavyArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[30];
		leftArmModel = new ModelRendererTurbo[16];
		rightArmModel = new ModelRendererTurbo[16];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 531
		bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 532
		bodyModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 542
		bodyModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 815, 450, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 815, 450, textureX, textureY); // Box 290
		bodyModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 73
		bodyModel[23] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 11
		bodyModel[25] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 12
		bodyModel[26] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 123
		bodyModel[27] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 95
		bodyModel[28] = new ModelRendererTurbo(this, 527, 478, textureX, textureY); // Box 101
		bodyModel[29] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 102

		bodyModel[0].addShapeBox(-4F, 6F, -2F, 2, 5, 4, 0F,0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2F, 6F, -2F, 2, 5, 4, 0F,0F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-47.9F, -46F, -2F, 100, 100, 4, 0F,-48F, -48.2F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.7F, -48F, -48.2F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.7F); // Box 4
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.4F, 2F, -2F, 1, 3, 4, 0F,0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, -0.2F, 1F, 0.5F, -0.2F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 5
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2F, 0F, -2.2F, 2, 4, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.2F, 0.1F, -1.9F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, -1.9F, 0.2F, 0.1F); // Box 27
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, -2.2F, 2, 4, 4, 0F,0.1F, 0.4F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.2F, 0.1F, -1.9F, 0.2F, 0.1F, -1.9F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Box 28
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 0.8F, -2.5F, 7, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1.2F, 0F, -0.1F, 1.2F, 0F, -0.1F, 1.2F, 0F, -0.1F, 1.2F, 0F); // Box 531
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, -1F, -2.6F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 532
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.5F, -1F, -2.6F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(3.4F, 2F, -2F, 1, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.4F, 2F, -2F, 1, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 13
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4.4F, -0.2F, -2.5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 14
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(3.4F, -0.2F, -2.5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 15
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(3.1F, 7F, -2F, 1, 3, 4, 0F,0F, 0F, 0.7F, 0.4F, 0F, 0.7F, 0.4F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.8F); // Box 19
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 9F, -2.5F, 4, 2, 5, 0F,0.2F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.3F); // Box 15
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 9F, -2.5F, 4, 2, 5, 0F,0F, 0F, 0.7F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0F, 0.7F); // Box 290
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3F, 7F, -1F, 6, 3, 4, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F); // Box 22
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4.1F, 7F, -2F, 1, 3, 4, 0F,0.4F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 1F, 0.4F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.8F, 0F, 0F, 0.7F); // Box 23
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3F, 10F, -1F, 6, 3, 4, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 24
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3.1F, 10F, -2F, 1, 3, 4, 0F,0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.8F, 0F, 0F, 0.7F, 0.4F, 0F, 0.7F, 0.4F, 0F, 0.7F, 0F, 0F, 1F); // Box 25
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4.1F, 10F, -2F, 1, 3, 4, 0F,0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.8F, 0F, 0F, 0.7F, 0.4F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 1F, 0.4F, 0F, 0.7F); // Box 26
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.5F, 5F, -2.5F, 7, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 36
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3.5F, -0.2F, -2.5F, 7, 1, 5, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(2F, 11F, -3F, 2, 6, 6, 0F,0F, 0F, -0.15F, 0.1F, 0F, -0.55F, 0.1F, 0F, -0.75F, 0F, 0F, -0.55F, 0F, -0.2F, -0.15F, 1.1F, -0.2F, -0.55F, 1.1F, -0.2F, -0.75F, 0F, -0.2F, -0.55F); // Box 1
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 11F, -3F, 2, 6, 6, 0F,0.1F, 0F, -0.55F, 0F, 0F, -0.15F, 0F, 0F, -0.55F, 0.1F, 0F, -0.75F, 1.1F, -0.2F, -0.55F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.55F, 1.1F, -0.2F, -0.75F); // Box 11
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-2F, 11F, -3F, 4, 5, 5, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F); // Box 12
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2F, 11F, -2F, 4, 5, 5, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F); // Box 123
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-50F, -42F, -2F, 100, 100, 4, 0F,-48F, -48F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.4F, -48F, -48F, 0.4F, -48F, -48F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.4F, -48F, -48F, 0.4F); // Box 95
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-50F, -40F, -2.32F, 100, 100, 4, 0F,-48F, -48F, 0.9F, -48F, -48F, 0.9F, -48F, -48F, 0.4F, -48F, -48F, 0.4F, -48F, -48F, 0.9F, -48F, -48F, 0.9F, -48F, -48F, 0.4F, -48F, -48F, 0.4F); // Box 101
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-52F, -46F, -2F, 100, 100, 4, 0F,-48F, -48F, 0.7F, -48F, -48.2F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.7F, -48F, -48.2F, 0.7F, -48F, -48F, 0.7F, -48F, -48F, 0.7F); // Box 102
		bodyModel[29].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 68
		leftArmModel[2] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 69
		leftArmModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 70
		leftArmModel[4] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 52
		leftArmModel[5] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 53
		leftArmModel[6] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 54
		leftArmModel[7] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 57
		leftArmModel[8] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 58
		leftArmModel[9] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 59
		leftArmModel[10] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 64
		leftArmModel[11] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 65
		leftArmModel[12] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 66
		leftArmModel[13] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 67
		leftArmModel[14] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Box 99
		leftArmModel[15] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 100

		leftArmModel[0].addShapeBox(-1F, 7F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.67F, 0F, -3.9F, 4, 2, 1, 0F,0.25F, 0F, -0.95F, -0.25F, 0F, -0.95F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.25F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F); // Box 68
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(4.23F, 0F, -2F, 1, 2, 4, 0F,0.45F, 0F, 0.45F, -1.05F, 0F, -0.35F, -1.05F, 0F, -0.35F, 0.45F, 0F, 0.45F, 0.45F, -0.5F, 0.45F, -1.05F, -0.5F, -0.35F, -1.05F, -0.5F, -0.35F, 0.45F, -0.5F, 0.45F); // Box 69
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.67F, 0F, 2.9F, 4, 2, 1, 0F,0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, -0.25F, 0F, -0.95F, 0.25F, 0F, -0.95F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, -0.25F, -0.5F, -0.95F, 0.25F, -0.5F, -0.95F); // Box 70
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.82F, -3.01F, -3.1F, 4, 1, 1, 0F,0.3F, -0.5F, -1.1F, -0.85F, -0.5F, -1.1F, -0.35F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 52
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-0.82F, -2.01F, -3.1F, 4, 1, 1, 0F,0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 53
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-0.82F, -1.01F, -3.1F, 4, 1, 1, 0F,0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.55F, 0.2F, 0F, -0.55F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 54
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-0.82F, -3.01F, -1.5F, 4, 1, 3, 0F,0.3F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 57
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-0.82F, -2.01F, -1.5F, 4, 1, 3, 0F,0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 58
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-0.82F, -1.01F, -1.5F, 4, 1, 3, 0F,0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 59
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-0.82F, -1.01F, 2.1F, 4, 1, 1, 0F,0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0F, 0F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.2F, 0F, -0.55F, 0.3F, 0F, -0.55F); // Box 64
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-0.82F, -2.01F, 2.1F, 4, 1, 1, 0F,0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0F, 0F, -0.7F, 0.3F, 0F, -0.7F); // Box 65
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-0.82F, -3.01F, 2.1F, 4, 1, 1, 0F,0.3F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, -0.85F, -0.5F, -1.1F, 0.3F, -0.5F, -1.1F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F); // Box 66
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-0.67F, 0F, -2F, 4, 2, 4, 0F,0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F); // Box 67
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(-48.7F, -48F, -50F, 100, 100, 100, 0F,-48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F); // Box 99
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-48.7F, -44F, -50F, 100, 99, 100, 0F,-47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F); // Box 100
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 20
		rightArmModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 21
		rightArmModel[3] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 23
		rightArmModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 24
		rightArmModel[5] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 151
		rightArmModel[6] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 5
		rightArmModel[7] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 8
		rightArmModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 9
		rightArmModel[9] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 10
		rightArmModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 11
		rightArmModel[11] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 16
		rightArmModel[12] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 17
		rightArmModel[13] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 18
		rightArmModel[14] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 153
		rightArmModel[15] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 98

		rightArmModel[0].addShapeBox(-3F, 7F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-51.3F, -48F, -50F, 100, 100, 100, 0F,-48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F); // Box 20
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.33F, 0F, -3.9F, 4, 2, 1, 0F,-0.25F, 0F, -0.95F, 0.25F, 0F, -0.95F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, -0.25F, -0.5F, -0.95F, 0.25F, -0.5F, -0.95F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F); // Box 21
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-5.23F, 0F, -2F, 1, 2, 4, 0F,-1.05F, 0F, -0.35F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, -1.05F, 0F, -0.35F, -1.05F, -0.5F, -0.35F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, -1.05F, -0.5F, -0.35F); // Box 23
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.33F, 0F, 2.9F, 4, 2, 1, 0F,0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.25F, 0F, -0.95F, -0.25F, 0F, -0.95F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.25F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F); // Box 24
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.18F, -2.01F, -1.5F, 4, 1, 3, 0F,0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Box 151
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.18F, -1.01F, -1.5F, 4, 1, 3, 0F,0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F); // Box 5
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.18F, -3.01F, -1.5F, 4, 1, 3, 0F,-0.35F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Box 8
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3.18F, -3.01F, -3.1F, 4, 1, 1, 0F,-0.85F, -0.5F, -1.1F, 0.3F, -0.5F, -1.1F, 0.3F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, -0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Box 9
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3.18F, -2.01F, -3.1F, 4, 1, 1, 0F,-0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0F, 0F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Box 10
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3.18F, -1.01F, -3.1F, 4, 1, 1, 0F,0F, 0F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.2F, 0F, -0.55F, 0.3F, 0F, -0.55F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F); // Box 11
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3.18F, -1.01F, 2.1F, 4, 1, 1, 0F,0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.55F, 0.2F, 0F, -0.55F); // Box 16
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3.18F, -2.01F, 2.1F, 4, 1, 1, 0F,0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 17
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.18F, -3.01F, 2.1F, 4, 1, 1, 0F,-0.35F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, -1.1F, -0.85F, -0.5F, -1.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F); // Box 18
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.33F, 0F, -2F, 4, 2, 4, 0F,0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F); // Box 153
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-51.3F, -44F, -50F, 100, 99, 100, 0F,-47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -47.7F, -48F, -47.8F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F, -48F); // Box 98
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 23
		leftLegModel[1] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 26
		leftLegModel[2] = new ModelRendererTurbo(this, 817, 464, textureX, textureY); // Box 95
		leftLegModel[3] = new ModelRendererTurbo(this, 817, 464, textureX, textureY); // Box 97
		leftLegModel[4] = new ModelRendererTurbo(this, 817, 464, textureX, textureY); // Box 93

		leftLegModel[0].addShapeBox(-2F, 3F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 23
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 26
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 9F, -3.82F, 4, 3, 2, 0F,-0.275F, -0.8F, -0.75F, -0.275F, -0.8F, -0.75F, 0.125F, -0.8F, -0.475F, 0.125F, -0.8F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 95
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7.8F, -3.82F, 4, 2, 2, 0F,-0.775F, -1.6F, -1.15F, -0.775F, -1.6F, -1.15F, -0.175F, -1.6F, -0.225F, -0.175F, -1.6F, -0.225F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 97
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 7F, -2.3F, 4, 5, 5, 0F,0.125F, -0.55F, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, -0.475F, 0.125F, -0.55F, -0.475F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 93
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 22
		rightLegModel[1] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 817, 464, textureX, textureY); // Box 94
		rightLegModel[3] = new ModelRendererTurbo(this, 817, 464, textureX, textureY); // Box 96
		rightLegModel[4] = new ModelRendererTurbo(this, 817, 464, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, 3F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 9F, -3.82F, 4, 3, 2, 0F,-0.275F, -0.8F, -0.75F, -0.275F, -0.8F, -0.75F, 0.125F, -0.8F, -0.475F, 0.125F, -0.8F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 94
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 7.8F, -3.82F, 4, 2, 2, 0F,-0.775F, -1.6F, -1.15F, -0.775F, -1.6F, -1.15F, -0.175F, -1.6F, -0.225F, -0.175F, -1.6F, -0.225F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 96
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 7F, -2.3F, 4, 5, 5, 0F,0.125F, -0.55F, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, -0.475F, 0.125F, -0.55F, -0.475F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 25
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}