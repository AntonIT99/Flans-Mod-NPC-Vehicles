//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: nuGothic
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNuGothic extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelNuGothic() //Same as Filename
	{
		headModel = new ModelRendererTurbo[3];
		bodyModel = new ModelRendererTurbo[30];
		leftArmModel = new ModelRendererTurbo[15];
		rightArmModel = new ModelRendererTurbo[15];
		leftLegModel = new ModelRendererTurbo[11];
		rightLegModel = new ModelRendererTurbo[11];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
		headModel[1] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 70
		headModel[2] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 71

		headModel[0].addShapeBox(-4F, -1F, -4F, 8, 1, 8, 0F,0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 67
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -1F, -5F, 4, 1, 2, 0F,0.2F, 0.2F, -0.7F, 0F, 0.2F, 0.1F, 0F, 0.2F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.2F, -0.9F, 0F, 0.5F, -0.2F, 0F, 1.8F, 2.2F, 0.2F, 0.2F, 1.2F); // Box 70
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0F, -1F, -5F, 4, 1, 2, 0F,0F, 0.2F, 0.1F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.5F, -0.2F, 0.2F, 0.2F, -0.9F, 0.2F, 0.2F, 1.2F, 0F, 1.8F, 2.2F); // Box 71
		headModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 59
		bodyModel[1] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 60
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 61
		bodyModel[3] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 62
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 108
		bodyModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 68
		bodyModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 76
		bodyModel[7] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 89
		bodyModel[8] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 90
		bodyModel[9] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 91
		bodyModel[10] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 68
		bodyModel[11] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 69
		bodyModel[12] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 102
		bodyModel[13] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 165
		bodyModel[14] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 166
		bodyModel[15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 167
		bodyModel[16] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 125
		bodyModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 126
		bodyModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 127
		bodyModel[19] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 129
		bodyModel[21] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 130
		bodyModel[22] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 131
		bodyModel[23] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 132
		bodyModel[24] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 133
		bodyModel[25] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 134
		bodyModel[26] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 135
		bodyModel[27] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 151
		bodyModel[28] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 152
		bodyModel[29] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 153

		bodyModel[0].addShapeBox(0F, 1.5F, -2F, 4, 2, 4, 0F,0F, 0.5F, 0.4F, -0.5F, 0.5F, 0.2F, -0.5F, 1F, 0.3F, 0F, 1F, 0.4F, 0F, 0F, 2.2F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0F, 1.2F); // Box 59
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 3.5F, -2F, 4, 2, 4, 0F,0F, 0F, 2.2F, 0F, -0.3F, 0.8F, 0F, -0.3F, 0.8F, 0F, 0F, 1.2F, 0F, 0F, 2.5F, 0.8F, 0.5F, 1F, 0.8F, 0F, 0.9F, 0F, 0F, 1.3F); // Box 60
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(2F, 4.5F, -2F, 2, 2, 4, 0F,-0.5F, -0.5F, 2.1F, 1F, -1.5F, 1.3F, 1.2F, -1F, 0.9F, 2F, -1F, 1.3F, -0.5F, 1F, 1.5F, 0.8F, 1F, 1.2F, 0.9F, 1.5F, 0.6F, 2F, 0.5F, 1.2F); // Box 61
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 6.5F, -2F, 4, 3, 4, 0F,0F, -1.5F, 2.5F, 0.8F, -1.5F, 1.2F, 0.9F, -1.5F, 0.6F, 0F, -0.5F, 1.2F, 0F, 1F, 0.9F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.15F, 0F, 0F, 0.4F); // Box 62
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 10.8F, -2F, 4, 1, 4, 0F,0F, 0.4F, 0.5F, 0.2F, 0.8F, 0.1F, 0.2F, 0.8F, 0.1F, 0F, 0.9F, 0.5F, 0F, 0.5F, 0.8F, 1.2F, 0F, 0.3F, 1.2F, 0F, 0.3F, 0F, 0.5F, 0.8F); // Box 108
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(1.5F, 13.2F, -2F, 4, 1, 4, 0F,1F, 0.4F, 1.3F, 0.1F, 0.5F, 1.1F, 0.1F, 0.5F, 1.1F, 1.5F, 0.4F, 1.3F, 0.5F, -0.6F, 1.7F, 0.5F, -0.1F, 1.5F, 0.5F, -0.1F, 1.5F, 1.5F, -0.6F, 1.7F); // Box 68
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 9.5F, -2F, 4, 1, 4, 0F,0F, -1F, 1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0.5F, 1.2F, 0.5F, -0.5F, 0.15F, 0.5F, -0.5F, 0.15F, 0F, -0.5F, 0.9F); // Box 76
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, 4.5F, -2F, 2, 2, 4, 0F,-0.5F, -1.5F, 2.5F, 1F, -2.5F, 1.5F, 1.1F, -2.5F, 0.2F, 0F, -1.5F, 1F, -0.5F, 1.5F, 1.8F, 0.8F, 1.5F, 1.2F, 0.9F, 1.5F, 0.6F, 0F, 0.5F, 0.2F); // Box 89
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 4.5F, -2F, 2, 2, 3, 0F,0F, 1.5F, 2.8F, 0.5F, -0.5F, 2.1F, 1.2F, -1F, 0.9F, 0F, -1F, 1.3F, 0F, 1F, 2.2F, 0.5F, 1F, 1.5F, 0.9F, 1.5F, 0.6F, 0F, 0.5F, 1.2F); // Box 90
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 4.5F, -2F, 2, 2, 4, 0F,0F, 0F, 3.5F, 0.5F, -1.5F, 2.5F, 1.1F, -2.5F, 0.2F, 0F, -1.5F, 1F, 0F, 1.5F, 2.5F, 0.5F, 1.5F, 1.8F, 0.9F, 1.5F, 0.6F, 0F, 0.5F, 1.2F); // Box 91
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 0F, -2.2F, 4, 2, 5, 0F,0F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -2F, -0.3F, 1F, 0F, 0.2F, 1.5F, 0F, -0.7F, 0.2F, -2F, -1F, 0.1F); // Box 68
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -2.2F, 4, 2, 5, 0F,0F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 1.5F, -2F, -0.3F, 1F, -2F, -1F, 0.1F, 0F, -0.7F, 0.2F); // Box 69
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 11.8F, -2F, 4, 1, 4, 0F,0F, 0.1F, 0.8F, 1F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 0F, 0.1F, 0.8F, 0F, 0F, 1.2F, 1.5F, -0.2F, 0.9F, 1.5F, -0.2F, 0.9F, 0F, 0F, 1.2F); // Box 102
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.5F, 2.5F, -4.1F, 3, 1, 1, 0F,-1F, 0F, -0.6F, -1F, 0F, -0.8F, -1F, 0F, 0.4F, -1F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F); // Box 165
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2.5F, 3.5F, -4.1F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F); // Box 166
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(2.5F, 4.5F, -4.1F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, -1F, 0F, -0.6F, -1F, 0F, -0.8F, -1F, 0F, 0.4F, -1F, 0F, 0.2F); // Box 167
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 6.5F, -2F, 4, 3, 4, 0F,0.8F, -1.5F, 1.2F, 0F, -1.5F, 2.5F, 0F, -0.5F, 1.2F, 0.9F, -1.5F, 0.6F, 0.2F, 0F, 0.3F, 0F, 1F, 0.9F, 0F, 0F, 0.4F, 0.2F, 0F, 0.15F); // Box 125
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 9.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.3F, 0F, -1F, 1F, 0F, 0F, 0.5F, 0.2F, 0F, 0.15F, 0.5F, -0.5F, 0.15F, 0F, 0.5F, 1.2F, 0F, -0.5F, 0.9F, 0.5F, -0.5F, 0.15F); // Box 126
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 10.8F, -2F, 4, 1, 4, 0F,0.2F, 0.8F, 0.1F, 0F, 0.4F, 0.5F, 0F, 0.9F, 0.5F, 0.2F, 0.8F, 0.1F, 1.2F, 0F, 0.3F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 1.2F, 0F, 0.3F); // Box 127
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 11.8F, -2F, 4, 1, 4, 0F,1F, 0.6F, 0.6F, 0F, 0.1F, 0.8F, 0F, 0.1F, 0.8F, 1F, 0.6F, 0.6F, 1.5F, -0.2F, 0.9F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 1.5F, -0.2F, 0.9F); // Box 128
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 3.5F, -2F, 4, 2, 4, 0F,0F, -0.3F, 0.8F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0F, -0.3F, 0.8F, 0.8F, 0.5F, 1F, 0F, 0F, 2.5F, 0F, 0F, 1.3F, 0.8F, 0F, 0.9F); // Box 129
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 1.5F, -2F, 4, 2, 4, 0F,-0.5F, 0.5F, 0.2F, 0F, 0.5F, 0.4F, 0F, 1F, 0.4F, -0.5F, 1F, 0.3F, 0F, 0.3F, 0.8F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0F, 0.3F, 0.8F); // Box 130
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-2F, 4.5F, -2F, 2, 2, 4, 0F,0.5F, -1.5F, 2.5F, 0F, 0F, 3.5F, 0F, -1.5F, 1F, 1.1F, -2.5F, 0.2F, 0.5F, 1.5F, 1.8F, 0F, 1.5F, 2.5F, 0F, 0.5F, 1.2F, 0.9F, 1.5F, 0.6F); // Box 131
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2F, 4.5F, -2F, 2, 2, 3, 0F,0.5F, -0.5F, 2.1F, 0F, 1.5F, 2.8F, 0F, -1F, 1.3F, 1.2F, -1F, 0.9F, 0.5F, 1F, 1.5F, 0F, 1F, 2.2F, 0F, 0.5F, 1.2F, 0.9F, 1.5F, 0.6F); // Box 132
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 4.5F, -2F, 2, 2, 4, 0F,1F, -1.5F, 1.3F, -0.5F, -0.5F, 2.1F, 2F, -1F, 1.3F, 1.2F, -1F, 0.9F, 0.8F, 1F, 1.2F, -0.5F, 1F, 1.5F, 2F, 0.5F, 1.2F, 0.9F, 1.5F, 0.6F); // Box 133
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 4.5F, -2F, 2, 2, 4, 0F,1F, -2.5F, 1.5F, -0.5F, -1.5F, 2.5F, 0F, -1.5F, 1F, 1.1F, -2.5F, 0.2F, 0.8F, 1.5F, 1.2F, -0.5F, 1.5F, 1.8F, 0F, 0.5F, 0.2F, 0.9F, 1.5F, 0.6F); // Box 134
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-5.5F, 13.2F, -2F, 4, 1, 4, 0F,0.1F, 0.5F, 1.1F, 1F, 0.4F, 1.3F, 1.5F, 0.4F, 1.3F, 0.1F, 0.5F, 1.1F, 0.5F, -0.1F, 1.5F, 0.5F, -0.6F, 1.7F, 1.5F, -0.6F, 1.7F, 0.5F, -0.1F, 1.5F); // Box 135
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-5.5F, 2.5F, -4.1F, 3, 1, 1, 0F,-1F, 0F, -0.8F, -1F, 0F, -0.6F, -1F, 0F, 0.2F, -1F, 0F, 0.4F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F); // Box 151
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-5.5F, 4.5F, -4.1F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.6F, -1F, 0F, 0.2F, -1F, 0F, 0.4F); // Box 152
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-5.5F, 3.5F, -4.1F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F); // Box 153
		bodyModel[29].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 57
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 58
		leftArmModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 103
		leftArmModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 104
		leftArmModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 95
		leftArmModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 96
		leftArmModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 97
		leftArmModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 98
		leftArmModel[9] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 99
		leftArmModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 92
		leftArmModel[11] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 93
		leftArmModel[12] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 94
		leftArmModel[13] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 95
		leftArmModel[14] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 96

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(1F, 5F, -2F, 2, 4, 4, 0F,0F, -0.5F, 1F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.5F, -0.5F, 1F, 0F, -0.2F, 0.4F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.4F); // Box 58
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.8F, 1F, -2F, 4, 1, 4, 0F,-0.2F, -0.5F, 1F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, -0.2F, -0.5F, 1F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 103
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.8F, 2F, -2F, 4, 1, 4, 0F,-0.2F, -0.4F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, -0.4F, 0.4F, 0F, 0.5F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.5F, 0.2F); // Box 104
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, 2.3F, 3.3F, 4, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F); // Box 95
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, 3.3F, 2.7F, 4, 2, 1, 0F,0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F); // Box 96
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, 5.3F, 2.7F, 4, 2, 1, 0F,0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, 0F, 0.7F, 0F, 0F); // Box 97
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-1F, 7.3F, 3.3F, 4, 1, 1, 0F,0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 98
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-1F, 4.3F, -2F, 4, 2, 5, 0F,0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F); // Box 99
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-0.8F, -1F, -2F, 4, 2, 4, 0F,1F, -1.5F, 1F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 1F, -1.5F, 1F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0.5F, 0.7F); // Box 92
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-0.8F, -2F, -2F, 4, 2, 4, 0F,1.5F, -1.5F, 1F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 1.5F, -1.5F, 1F, 1F, 0.5F, 0.7F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 1F, 0.5F, 0.7F); // Box 93
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-0.8F, -3.5F, -2F, 4, 2, 4, 0F,1.7F, -1.5F, 1F, -2F, -1F, 0.5F, -2F, -1F, 0.5F, 1.7F, -1.5F, 1F, 1.5F, 1F, 0.7F, 0.3F, -0.6F, 0.4F, 0.3F, -0.6F, 0.4F, 1.5F, 1F, 0.7F); // Box 94
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-0.8F, 3F, -2F, 4, 1, 4, 0F,-0.2F, -0.3F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, -0.3F, 0.4F, 0F, 0.4F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.4F, 0.2F); // Box 95
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(-1F, 5F, -2F, 2, 4, 4, 0F,0.5F, -1.8F, 0.5F, 0F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.5F, -1.8F, 0.5F, 0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.2F, -0.2F, 0.2F); // Box 96
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 137
		rightArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 138
		rightArmModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 139
		rightArmModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 140
		rightArmModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 141
		rightArmModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 142
		rightArmModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 143
		rightArmModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 144
		rightArmModel[9] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 145
		rightArmModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 146
		rightArmModel[11] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 147
		rightArmModel[12] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 148
		rightArmModel[13] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 149
		rightArmModel[14] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 150

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 136
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 137
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 5F, -2F, 2, 4, 4, 0F,0.7F, 0.2F, 0.5F, 0F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.7F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.2F, -0.2F, 0.2F); // Box 138
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.2F, 1F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.6F, -0.2F, -0.5F, 1F, -0.2F, -0.5F, 1F, 0.5F, 0F, 0.6F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 139
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.2F, 2F, -2F, 4, 1, 4, 0F,0.4F, 0F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0.3F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.3F, 0.2F); // Box 140
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 2.3F, 3.3F, 4, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F); // Box 141
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 3.3F, 2.7F, 4, 2, 1, 0F,0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F); // Box 142
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 5.3F, 2.7F, 4, 2, 1, 0F,0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, 0F, 0.7F, 0F, 0F); // Box 143
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 7.3F, 3.3F, 4, 1, 1, 0F,0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 144
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, 4.3F, -2F, 4, 2, 5, 0F,0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F); // Box 145
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3.2F, -1F, -2F, 4, 2, 4, 0F,0.5F, -0.3F, 0.5F, 1F, -1.5F, 1F, 1F, -1.5F, 1F, 0.5F, -0.3F, 0.5F, 0.2F, 0F, 0.4F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, 0.4F); // Box 146
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3.2F, -2F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 1.5F, -1.5F, 1F, 1.5F, -1.5F, 1F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.4F, 1F, 0.5F, 0.7F, 1F, 0.5F, 0.7F, 0.2F, 0F, 0.4F); // Box 147
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3.2F, -3.5F, -2F, 4, 2, 4, 0F,-2F, -1F, 0.5F, 1.7F, -1.5F, 1F, 1.7F, -1.5F, 1F, -2F, -1F, 0.5F, 0.3F, -0.6F, 0.4F, 1.5F, 1F, 0.7F, 1.5F, 1F, 0.7F, 0.3F, -0.6F, 0.4F); // Box 148
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.2F, 3F, -2F, 4, 1, 4, 0F,0.4F, 0F, 0.4F, -0.2F, -0.3F, 0.4F, -0.2F, -0.3F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0.3F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.3F, 0.2F); // Box 149
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-1F, 5F, -2F, 2, 4, 4, 0F,0F, -0.5F, 1F, 0.5F, -1.8F, 0.5F, 0.5F, -1.8F, 0.5F, 0.5F, -0.5F, 1F, 0F, -0.2F, 0.4F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.4F); // Box 150
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 82
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 83
		leftLegModel[2] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 84
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 85
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 86
		leftLegModel[5] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 87
		leftLegModel[6] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 88
		leftLegModel[7] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 89
		leftLegModel[8] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 90
		leftLegModel[9] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 103
		leftLegModel[10] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 104

		leftLegModel[0].addShapeBox(-1.8F, 11.1F, -0.3F, 4, 1, 3, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 82
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.5F, 1.1F, -2F, 4, 4, 4, 0F,0.9F, -1.3F, 0.8F, 1F, 0.3F, 0.8F, 1F, 0.3F, 0.8F, -3F, -0.5F, 1F, 0.7F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 1.5F, 0.2F, -2.5F, 1.5F, 0.2F); // Box 83
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2.1F, 5.1F, -2.8F, 5, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 84
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 6.1F, -2F, 4, 4, 4, 0F,0.7F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.6F, 0.7F, -0.5F, 0.6F, 0.6F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F); // Box 85
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 0.9F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 86
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2.1F, 6.1F, -2.8F, 5, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 87
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(2.5F, 6.1F, -0.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F); // Box 88
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(2.5F, 5.1F, -0.8F, 1, 1, 3, 0F,-1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 89
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1.8F, 11.1F, -2.3F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 90
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-0.3F, 11F, -9.3F, 1, 1, 5, 0F,-0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 103
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-0.3F, 11F, -4.3F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0.6F, 0F, 2F, 0.6F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 2F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 104
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 112
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 113
		rightLegModel[2] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 114
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 115
		rightLegModel[4] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 116
		rightLegModel[5] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 117
		rightLegModel[6] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 120
		rightLegModel[7] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 121
		rightLegModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 122
		rightLegModel[9] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 123
		rightLegModel[10] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 124

		rightLegModel[0].addShapeBox(-2.2F, 11.1F, -0.3F, 4, 1, 3, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 112
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.5F, 1.1F, -2F, 4, 4, 4, 0F,1F, 0.3F, 0.8F, 0.9F, -1.3F, 0.8F, -3F, -0.5F, 1F, 1F, 0.3F, 0.8F, 0.2F, 0.5F, 0.4F, 0.7F, 0.5F, 0.4F, -2.5F, 1.5F, 0.2F, 0.2F, 1.5F, 0.2F); // Box 113
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3.1F, 5.1F, -2.8F, 5, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 114
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, 6.1F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, -0.5F, 0.6F, 0.2F, -0.5F, 0.6F, 0.1F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 115
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 0.9F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 116
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-3.1F, 6.1F, -2.8F, 5, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 117
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.2F, 11.1F, -2.3F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 120
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-0.7F, 11F, -9.3F, 1, 1, 5, 0F,-0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 121
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-0.7F, 11F, -4.3F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0.6F, 0F, 2F, 0.6F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 2F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 122
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-3.5F, 5.1F, -0.8F, 1, 1, 3, 0F,0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 123
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-3.5F, 6.1F, -0.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F); // Box 124
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);
	}
}