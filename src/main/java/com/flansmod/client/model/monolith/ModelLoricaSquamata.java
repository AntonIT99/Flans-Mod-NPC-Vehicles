//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLoricaSquamata extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelLoricaSquamata() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 24
		bodyModel[3] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 29
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 25
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 26
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 27
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		bodyModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 29
		bodyModel[11] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 31
		bodyModel[13] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 38
		bodyModel[19] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 39
		bodyModel[20] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 40

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F); // Box 18
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9.8F, -2F, 8, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 2F, -2F, 8, 6, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 24
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 10F, -2F, 8, 3, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F); // Box 27
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 8.3F, -2F, 8, 1, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F); // Box 29
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 8.5F, -2.3F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F); // Box 25
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 9.5F, -2.3F, 1, 5, 1, 0F,-0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0.6F, -0.15F, 0F, 0.6F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F); // Box 26
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(1F, 8.5F, -2.3F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F); // Box 27
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(1F, 9.5F, -2.3F, 1, 5, 1, 0F,-0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0.6F, -0.15F, 0F, 0.6F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F); // Box 28
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 8.5F, -2.3F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F); // Box 29
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 9.5F, -2.3F, 1, 5, 1, 0F,-0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0.6F, -0.15F, 0F, 0.6F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F); // Box 30
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, 8.5F, -2.3F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F); // Box 31
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2F, 9.5F, -2.3F, 1, 5, 1, 0F,-0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0.6F, -0.15F, 0F, 0.6F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F); // Box 32
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 0F, -2.2F, 2, 2, 4, 0F,0.55F, 0.3F, 0.55F, 0.55F, 0.5F, 0.55F, 0.55F, 0.5F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F); // Box 33
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 0F, 1F, 8, 4, 1, 0F,0.55F, 0.3F, -1F, 0.55F, 0.5F, -1F, 0.55F, 0.5F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, -1F, 0.55F, 0.3F, -1F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F); // Box 35
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.65F, 2F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F); // Box 36
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.65F, 2F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F); // Box 37
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2F, 0F, -2.2F, 2, 2, 4, 0F,0.55F, 0.3F, 0.55F, 0.55F, 0.5F, 0.55F, 0.55F, 0.5F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F); // Box 38
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 1F, -2F, 8, 6, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F); // Box 39
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 2.2F, -4.6F, 8, 1, 4, 0F,-1.7F, -0.3F, -1.6F, -1.7F, -0.3F, -1.6F, -1.7F, -0.3F, -1.6F, -1.7F, -0.3F, -1.6F, -1.7F, -0.3F, -1.6F, -1.7F, -0.3F, -1.6F, -1.7F, -0.3F, -1.6F, -1.7F, -0.3F, -1.6F); // Box 40
		bodyModel[20].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 31

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 4, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 31
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 30

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 4, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 30
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}