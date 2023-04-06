//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShapurRobe extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelShapurRobe() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 289
		bodyModel[4] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 290
		bodyModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 291
		bodyModel[6] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 292
		bodyModel[7] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 52
		bodyModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 52
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 52
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
		bodyModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 52
		bodyModel[13] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 7
		bodyModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 8
		bodyModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 9
		bodyModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 10
		bodyModel[17] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 11
		bodyModel[18] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 12
		bodyModel[19] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 13
		bodyModel[20] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
		bodyModel[21] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 17

		bodyModel[0].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 11.3F, -2F, 8, 5, 4, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2F, 0F, -2.2F, 2, 1, 4, 0F,0.1F, 0.2F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.2F, 0.4F, -1.9F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, -1.9F, 0.2F, 0.4F); // Box 27
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -2.2F, 2, 1, 4, 0F,0.1F, 0.4F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.2F, 0.4F, -1.9F, 0.2F, 0.4F, -1.9F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F); // Box 289
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 290
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 9F, -2F, 8, 1, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 291
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 10.3F, -2F, 8, 1, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F); // Box 292
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-5F, -1F, 2F, 10, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F); // Box 52
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-7F, 0F, 3F, 14, 10, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 52
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 1F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2.5F, 1F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4.5F, -1.7F, -3F, 1, 3, 1, 0F,0F, -1F, 0F, 0.5F, -1F, 0F, 1.5F, -0.7F, 3F, 0.5F, -0.8F, 3F, -1F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 5F, -1F, 0F, 5F); // Box 52
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(3.5F, -1.7F, -3F, 1, 3, 1, 0F,0.5F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.8F, 3F, 1.5F, -0.7F, 3F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 1F, 0.5F, 5F); // Box 52
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.5F, 9.5F, -2.5F, 3, 1, 1, 0F,0.2F, 0F, 0.3F, 0.4F, -3F, 0.3F, 0.4F, -3F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.2F, 3F, 0.3F, -0.2F, 3F, 0.3F, 0.2F, 0F, 0.3F); // Box 7
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2.5F, 9.5F, -2.5F, 3, 1, 1, 0F,0.4F, -3F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.4F, -3F, 0.3F, -0.2F, 3F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.2F, 3F, 0.3F); // Box 8
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-0.5F, 9.5F, -2.5F, 1, 1, 1, 0F,0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 9
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 1F, -2.5F, 1, 1, 1, 0F,0.4F, -2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.4F, -2F, 0.3F, -0.2F, 2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.2F, 2F, 0.3F); // Box 10
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2F, 1F, -2.5F, 1, 1, 1, 0F,0.4F, -2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.4F, -2F, 0.3F, -0.2F, 2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.2F, 2F, 0.3F); // Box 11
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3F, 1F, -2.5F, 1, 1, 1, 0F,0.2F, 0F, 0.3F, 0.4F, -2F, 0.3F, 0.4F, -2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.2F, 2F, 0.3F, -0.2F, 2F, 0.3F, 0.2F, 0F, 0.3F); // Box 12
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3F, 1F, -2.5F, 1, 1, 1, 0F,0.2F, 0F, 0.3F, 0.4F, -2F, 0.3F, 0.4F, -2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.2F, 2F, 0.3F, -0.2F, 2F, 0.3F, 0.2F, 0F, 0.3F); // Box 13
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 9F, -2F, 8, 1, 4, 0F,0.5F, -0.9F, 0.5F, 0.5F, -3.5F, 0.5F, 0.5F, -3.5F, 0.5F, 0.5F, -0.9F, 0.5F, 0.5F, 1.1F, 0.5F, 0.5F, 3.5F, 0.5F, 0.5F, 3.5F, 0.5F, 0.5F, 1.1F, 0.5F); // Box 16
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(4.5F, 10.5F, 0F, 1, 12, 1, 0F,0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 17
		bodyModel[21].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 21

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 23
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 18

		leftLegModel[0].addShapeBox(-2F, 10.1F, -2.3F, 4, 2, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 3F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 23
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 18
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 19
		rightLegModel[2] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 20

		rightLegModel[0].addShapeBox(-2F, 10.1F, -2.3F, 4, 2, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 3F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 19
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 20
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 52

		skirtRearModel[0].addShapeBox(-7F, -1.5F, 3F, 14, 10, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 52
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}