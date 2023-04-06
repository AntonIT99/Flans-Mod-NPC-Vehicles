//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DzungarHelm
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDzungarHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelDzungarHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[51];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 136
		headModel[1] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 256
		headModel[2] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 29
		headModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box43
		headModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box44
		headModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box47
		headModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box48
		headModel[7] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box34
		headModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box35
		headModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box45
		headModel[10] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box51
		headModel[11] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box57
		headModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box68
		headModel[13] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box69
		headModel[14] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box72
		headModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box73
		headModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box74
		headModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box75
		headModel[18] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box76
		headModel[19] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box77
		headModel[20] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box78
		headModel[21] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box79
		headModel[22] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box80
		headModel[23] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box81
		headModel[24] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box82
		headModel[25] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box83
		headModel[26] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box84
		headModel[27] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box85
		headModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box97
		headModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 84
		headModel[30] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 38
		headModel[31] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 39
		headModel[32] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 91
		headModel[33] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box64
		headModel[34] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box65
		headModel[35] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box66
		headModel[36] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import Box67
		headModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		headModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		headModel[39] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 53
		headModel[40] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 54
		headModel[41] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 55
		headModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box18
		headModel[43] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box22
		headModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box49
		headModel[45] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box50
		headModel[46] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box28
		headModel[47] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box62
		headModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 51
		headModel[49] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		headModel[50] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 53

		headModel[0].addShapeBox(-4F, -6F, -4F, 8, 2, 1, 0F,0.7F, -0.5F, 0.9F, 0.7F, -0.5F, 0.9F, 0.7F, -0.5F, 0.9F, 0.7F, -0.5F, 0.9F, 0.7F, -1F, 0.9F, 0.7F, -1F, 0.9F, 0.7F, -0.8F, -0.1F, 0.7F, -0.8F, -0.1F); // Box 136
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -6.5F, -6.8F, 4, 2, 2, 0F,-1.5F, -0.4F, -1.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 256
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0F, -6.5F, -6.8F, 4, 2, 2, 0F,0F, -0.4F, -0.5F, -1F, -0.4F, -1.2F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -6F, 4.7F, 8, 4, 1, 0F,0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F); // Import Box43
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-6F, -2.4F, 5F, 12, 3, 1, 0F,-0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -0.6F, -0.7F, -0.2F, -0.6F, 0.5F, 0.5F, -0.9F, 0.5F, 0.5F, -0.9F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F); // Import Box44
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5.5F, -6F, 1F, 1, 4, 4, 0F,-0.5F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box47
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-6.1F, -2.4F, 2F, 1, 3, 3, 0F,-0.6F, -0.2F, 1.6F, 0F, -0.2F, 1.6F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.5F, -1F, 1.1F, -1.1F, -1F, 1.1F, -1.4F, 0.5F, 1F, 0.8F, 0.5F, 1F); // Import Box48
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5.7F, -4.5F, 3.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box34
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-6.7F, -1F, 4.2F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box35
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3.5F, -4.5F, 4.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box45
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -1F, 5.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box51
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5.5F, -6F, -5F, 1, 4, 4, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 2F, -0.6F, -0.2F, 2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0.5F, -0.6F, -0.5F, 0.5F); // Import Box57
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(5.1F, -2.4F, 2F, 1, 3, 3, 0F,0F, -0.2F, 1.6F, -0.6F, -0.2F, 1.6F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -1.1F, -1F, 1.1F, 0.5F, -1F, 1.1F, 0.8F, 0.5F, 1F, -1.4F, 0.5F, 1F); // Import Box68
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4.5F, -6F, 1F, 1, 4, 4, 0F,0F, -0.2F, 1F, -0.5F, -0.2F, 1F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Import Box69
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5.7F, -4.5F, 1F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box72
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-6.4F, -2F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box73
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(5.4F, -2F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box74
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(5.7F, -1F, 4.2F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box75
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4.7F, -4.5F, 1F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box76
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4.7F, -4.5F, 3.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box77
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(1.5F, -4.5F, 4.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box78
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(1.7F, -1F, 5.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box79
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.5F, -4.5F, 4.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box80
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-0.5F, -1F, 5.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box81
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-2.5F, -4.5F, 4.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box82
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4.5F, -4.5F, 4.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box83
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-2.7F, -1F, 5.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box84
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5F, -1F, 5.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Import Box85
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-5.5F, -4.3F, -3.1F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import Box97
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-5.4F, -1.6F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 84
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-0.5F, 0F, -3.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0.5F, -1.2F, 0.5F, 0.5F, -1.2F, 0.5F, 0F, 0.8F, 0F, 0F); // Box 38
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-0.5F, 0F, -3.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0.5F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0F, -1.2F, 0.5F, 0F); // Box 39
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-4F, -5F, -3.4F, 8, 5, 1, 0F,0.2F, 0.3F, -4.2F, 0.2F, 0.3F, -4.2F, 0.2F, 0.3F, 3.8F, 0.2F, 0.3F, 3.8F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F); // Box 91
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(1.8F, -2F, -5.3F, 3, 2, 1, 0F,-2.2F, 0.6F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -2.2F, -0.4F, -0.3F, -1.6F, 1F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -1.6F, 1F, -0.3F); // Import Box64
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(1.8F, -5F, -5.3F, 3, 3, 1, 0F,-2F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -2F, 0.5F, -0.3F, -2.2F, -0.6F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -2.2F, 0.4F, -0.3F); // Import Box65
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(4.5F, -6F, -5F, 1, 4, 4, 0F,0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 1F, 0F, -0.2F, 1F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F); // Import Box66
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(4.5F, -2F, -5F, 1, 1, 4, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, 1.2F, 2F, -0.2F, -1.8F, 2F, -0.2F, -0.8F, 1F, -0.5F, 0.2F, 1F, -0.5F); // Import Box67
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(4.2F, -1.6F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 51
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(4.5F, -4.3F, -3.1F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 52
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-4.8F, -2F, -5.3F, 3, 2, 1, 0F,0.3F, 0F, -0.3F, -2.2F, 0.6F, -0.3F, -2.2F, -0.4F, -0.3F, 0.3F, 0F, -0.3F, -0.5F, -0.2F, -0.3F, -1.6F, 1F, -0.3F, -1.6F, 1F, -0.3F, -0.5F, -0.2F, -0.3F); // Box 53
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-5.5F, -2F, -5F, 1, 1, 4, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -1.8F, 2F, -0.2F, 1.2F, 2F, -0.2F, 0.2F, 1F, -0.5F, -0.8F, 1F, -0.5F); // Box 54
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-4.8F, -5F, -5.3F, 3, 3, 1, 0F,0F, 0.5F, -0.3F, -2F, 0.5F, -0.3F, -2F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0.3F, 0F, -0.3F, -2.2F, -0.6F, -0.3F, -2.2F, 0.4F, -0.3F, 0.3F, 0F, -0.3F); // Box 55
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-4F, -7.5F, -4F, 8, 2, 8, 0F,1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Import Box18
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-4F, -11.2F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box22
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-0.5F, -12.2F, -0.5F, 1, 1, 1, 0F,0.5F, 0.3F, 0.5F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.5F, 0.3F, 0.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F); // Import Box49
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-0.5F, -26.7F, -0.5F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Import Box50
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-0.5F, -18.7F, 1.5F, 1, 1, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, -5F, 0F, 0.8F, -5F, 0F, 0.2F, -0.3F, 1F, 0.2F, -0.3F, 1F, 0.8F, 4.8F, -2F, 0.8F, 4.8F, -2F); // Import Box28
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-0.5F, -27.9F, -0.5F, 1, 2, 1, 0F,0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box62
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-4F, -10.5F, -4F, 8, 2, 8, 0F,0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 1.2F, 0.5F, 1.2F, 1.2F, 0.5F, 1.2F, 1.2F, 0.5F, 1.2F, 1.2F, 0.5F, 1.2F); // Box 51
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-4F, -8F, -4F, 8, 1, 8, 0F,1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.1F, 0F, 1.1F, 1.1F, 0F, 1.1F, 1.1F, 0F, 1.1F, 1.1F, 0F, 1.1F); // Box 52
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-0.5F, -18.9F, -0.5F, 1, 6, 1, 0F,0.8F, 0F, 0.8F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.8F, 0F, 0.8F, 0.5F, 0.4F, 0.5F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.5F, 0.4F, 0.5F); // Box 53
		headModel[50].setRotationPoint(0F, 0F, 0F);
	}
}