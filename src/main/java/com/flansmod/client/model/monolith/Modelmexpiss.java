//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.12.2019 - 19:00:02
// Last changed on: 08.12.2019 - 19:00:02

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelmexpiss extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelmexpiss() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		headModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 26
		headModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 87
		headModel[3] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 88
		headModel[4] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 89
		headModel[5] = new ModelRendererTurbo(this, 18, 10, textureX, textureY); // Box 49
		headModel[6] = new ModelRendererTurbo(this, 18, 6, textureX, textureY); // Box 50

		headModel[0].addShapeBox(-4F, -10F, -4F, 8, 5, 8, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 5
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -8F, -5F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0F, -5.5F, -6F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 87
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5.5F, -6F, 4, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -12F, -5F, 1, 3, 1, 0F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -8F, -5F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 49
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -8F, -4.98F, 1, 1, 1, 0F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 50
		headModel[6].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[30];
		bodyModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 30
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 57
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 59
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 60
		bodyModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 61
		bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 62
		bodyModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 64
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 65
		bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 68
		bodyModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 74
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 75
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 76
		bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 77
		bodyModel[14] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 78
		bodyModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 79
		bodyModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 80
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 68
		bodyModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 69
		bodyModel[19] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 70
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 71
		bodyModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 72
		bodyModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 73
		bodyModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 76
		bodyModel[24] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 78
		bodyModel[25] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 83
		bodyModel[26] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 84
		bodyModel[27] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 85
		bodyModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 86
		bodyModel[29] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 47

		bodyModel[0].addShapeBox(0F, 0F, -3F, 4, 12, 1, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2.5F, 0F, -3.25F, 1, 10, 1, 0F, 7.75F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, 0F, 7.75F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 57
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 0F, -3.25F, 1, 10, 1, 0F, -7.5F, 0F, -0.5F, 7.75F, 0F, -0.5F, 7.75F, 0F, 0F, -7.5F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 59
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, 0F, 1.75F, 1, 10, 1, 0F, -7.5F, 0F, -0.5F, 7.75F, 0F, -0.5F, 7.75F, 0F, 0F, -7.5F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 60
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2.5F, 0F, 1.75F, 1, 10, 1, 0F, 7.75F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, 0F, 7.75F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 61
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(4.5F, -0.25F, -2.25F, 1, 1, 4, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 1F, 0.5F, -0.75F, 1F); // Box 62
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.75F, -0.25F, -2.25F, 1, 1, 4, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 1F, 0.5F, -0.75F, 1F); // Box 63
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.7F, 10F, 1.75F, 5, 3, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 64
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4.7F, 10.1F, 2.55F, 5, 2, 1, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-5F, 9.5F, -3.25F, 1, 1, 6, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 68
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-5F, 9.35F, -3.25F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 1.75F, 0F, -0.5F, 1.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.5F, 1.75F, -0.5F, -0.5F, 1.75F, -0.5F, 0F, -0.75F, 0.25F, 0F); // Box 74
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(4F, 9.35F, -3.25F, 1, 1, 1, 0F, 1.75F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 1.75F, 0F, 0F, 1.75F, -0.5F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, 1.75F, -0.5F, 0F); // Box 75
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(4F, 9.35F, 1.75F, 1, 1, 1, 0F, 1.75F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 1.75F, 0F, 0F, 1.75F, -0.5F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, 1.75F, -0.5F, 0F); // Box 76
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-5F, 9.35F, 1.75F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 1.75F, 0F, -0.5F, 1.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.5F, 1.75F, -0.5F, -0.5F, 1.75F, -0.5F, 0F, -0.75F, 0.25F, 0F); // Box 77
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3.25F, 9.5F, -3.25F, 1, 1, 6, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 78
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(2.3F, 9F, -3.7F, 3, 3, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 79
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.8F, 8.25F, -3.7F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 80
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.5F, 7F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.5F, 6F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0.5F, 5F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 4F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 71
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.5F, 3F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.5F, 2F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 73
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.5F, 9F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F, 0.175F, 0F, 0.375F, 0.175F, 0F, 0.375F, 0.175F, 0F, 0.375F, 0.175F, 0F, 0.375F, 0.175F, 0F, 0.375F, 0.175F, 0F, 0.375F, 0.175F, 0F, 0.375F, 0.175F, 0F, 0.375F); // Box 78
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 0F, -2F, 4, 12, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, -2F, 4, 12, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4F, -0.3F, -2F, 4, 1, 1, 0F, 0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 1F, 0.1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, -0.3F, -2F, 4, 1, 1, 0F, 0F, -1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 86
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0.5F, 8F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[29].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[3];
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 80
		leftArmModel[2] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 82

		leftArmModel[0].addBox(-1F, -2F, -2F, 4, 10, 4, 0F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1.5F, -2.25F, -1.25F, 3, 1, 2, 0F, 0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.75F, -0.25F, 1F, -0.75F, -0.25F, 1F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F); // Box 80
		leftArmModel[1].setRotationPoint(1F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 82
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		rightArmModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 79
		rightArmModel[2] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 81

		rightArmModel[0].addBox(-3F, -2F, -2F, 4, 10, 4, 0F); // Box 4
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2.75F, -2.25F, -1.25F, 3, 1, 2, 0F, 0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.75F, -0.25F, 1F, -0.75F, -0.25F, 1F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F); // Box 79
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 81
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[3];
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 54
		leftLegModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 67

		leftLegModel[0].addBox(-2F, 0F, -2F, 4, 8, 4, 0F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addBox(-2F, 10F, -3F, 4, 2, 5, 0F); // Box 54
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 2, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[3];
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		rightLegModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 53
		rightLegModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 66

		rightLegModel[0].addBox(-2F, 0F, -2F, 4, 8, 4, 0F); // Box 1
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addBox(-2F, 10F, -3F, 4, 2, 5, 0F); // Box 53
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 2, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 66
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);


	}
}