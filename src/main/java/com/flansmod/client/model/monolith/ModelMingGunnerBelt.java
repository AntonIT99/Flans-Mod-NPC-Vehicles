//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MingGunnerBelt
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingGunnerBelt extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelMingGunnerBelt() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];
		rightArmModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initrightArmModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 73
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 74
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 75
		bodyModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 76
		bodyModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 77
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 78
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 80
		bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 81
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 83
		bodyModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 84
		bodyModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 85
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		bodyModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 87
		bodyModel[17] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 88
		bodyModel[18] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 89
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		bodyModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 91
		bodyModel[21] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 92
		bodyModel[22] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 93
		bodyModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 94
		bodyModel[24] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 95
		bodyModel[25] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 96
		bodyModel[26] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 97

		bodyModel[0].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.55F, -0.1F, 0.25F, 0.55F, -0.1F, 0.25F, 0.55F, -0.1F, 0.25F, 0.55F, -0.1F, 0.25F, 0.55F, -0.3F, 0.25F, 0.55F, -0.3F, 0.25F, 0.55F, -0.3F, 0.25F, 0.55F, -0.3F, 0.25F); // Box 44
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9.5F, -4F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 72
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.6F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F); // Box 73
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.4F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F); // Box 74
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 9F, -4F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 75
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-5.5F, 10F, -3.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, 0F, -0.3F, 0.5F, 0F, 0.3F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 1.2F, 0F, -0.3F); // Box 76
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5.5F, 10F, -3.5F, 1, 3, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.4F, 0F, -1F, 0.7F, 0F, -1.3F, 0.5F, -2F, 0.3F, 0F, -1.6F, 0F, 0F, -1.7F, -1F, 1.2F, -2F, -1.3F); // Box 77
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2.6F, 9.5F, -4F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 78
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.2F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F); // Box 79
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F); // Box 80
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.6F, 9F, -4F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 81
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1.2F, 9.5F, -4F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 82
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1.8F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F); // Box 83
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.6F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F); // Box 84
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.2F, 9F, -4F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 85
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0.2F, 9.5F, -4F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 86
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-0.399999999999999F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F); // Box 87
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.8F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F); // Box 88
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.2F, 9F, -4F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 89
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1.6F, 9.5F, -4F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 90
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(1F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F); // Box 91
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2.2F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F); // Box 92
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1.6F, 9F, -4F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 93
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(3F, 9.5F, -4F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 94
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(2.4F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F); // Box 95
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(3.6F, 9.5F, -4F, 1, 2, 1, 0F,-0.4F, 0F, 0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, 0.2F); // Box 96
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(3F, 9F, -4F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 97
		bodyModel[26].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 67
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 68
		rightArmModel[2] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 69
		rightArmModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
		rightArmModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 71

		rightArmModel[0].addShapeBox(-3F, 2F, -2F, 4, 1, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -1.2F, 0.5F); // Box 67
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 3F, -2F, 4, 1, 4, 0F,0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -1.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, 0.8F, 0.5F); // Box 68
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 4.5F, -2F, 4, 1, 4, 0F,0.5F, -0.2F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.4F, 0.5F); // Box 69
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 5.5F, -2F, 4, 1, 4, 0F,0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F); // Box 70
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.7F, 1.2F, -1.5F, 1, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}
}