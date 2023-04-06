//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAllahGuardian extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAllahGuardian() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[3];
		turretModel = new ModelRendererTurbo[62];
		barrelModel = new ModelRendererTurbo[29];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 12

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 23, 24, 0F,-6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[0].setRotationPoint(-12F, -15.8F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[1].setRotationPoint(-6F, -20.8F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 24, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, 5F); // Box 12
		bodyModel[2].setRotationPoint(-12F, 7.2F, -12F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 28
		turretModel[1] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 30
		turretModel[2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 31
		turretModel[3] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 38
		turretModel[4] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 39
		turretModel[5] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 40
		turretModel[6] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 41
		turretModel[7] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 42
		turretModel[8] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 46
		turretModel[9] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 47
		turretModel[10] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 48
		turretModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 52
		turretModel[12] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 58
		turretModel[13] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 59
		turretModel[14] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 60
		turretModel[15] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 61
		turretModel[16] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Turret12
		turretModel[17] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Turret13
		turretModel[18] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Turret14
		turretModel[19] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Turret20
		turretModel[20] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Turret21
		turretModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Turret22
		turretModel[22] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Turret23
		turretModel[23] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Turret24
		turretModel[24] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Turret25
		turretModel[25] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Turret26
		turretModel[26] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Turret29
		turretModel[27] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Turret290
		turretModel[28] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Turret30
		turretModel[29] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Turret31
		turretModel[30] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Turret41
		turretModel[31] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Turret42
		turretModel[32] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Turret43
		turretModel[33] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Turret44
		turretModel[34] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Turret45
		turretModel[35] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Turret46
		turretModel[36] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Turret47
		turretModel[37] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Turret48
		turretModel[38] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Turret49
		turretModel[39] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Turret52
		turretModel[40] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 87
		turretModel[41] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 88
		turretModel[42] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 89
		turretModel[43] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 90
		turretModel[44] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 91
		turretModel[45] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 92
		turretModel[46] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 93
		turretModel[47] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 94
		turretModel[48] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 95
		turretModel[49] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 96
		turretModel[50] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 97
		turretModel[51] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 98
		turretModel[52] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 99
		turretModel[53] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 100
		turretModel[54] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 104
		turretModel[55] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 105
		turretModel[56] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 106
		turretModel[57] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 107
		turretModel[58] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 108
		turretModel[59] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 109
		turretModel[60] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 110
		turretModel[61] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 111

		turretModel[0].addShapeBox(0F, 0F, 0F, 56, 22, 5, 0F,-2F, -6F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[0].setRotationPoint(-94F, -54F, -17F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 156, 18, 7, 0F,0F, 2F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[1].setRotationPoint(-152F, -39F, -19F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 37, 24, 5, 0F,0F, 10F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[2].setRotationPoint(-38F, -54F, -17F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 156, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[3].setRotationPoint(-152F, -27F, -12F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 56, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		turretModel[4].setRotationPoint(-60F, -42F, -12F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 56, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		turretModel[5].setRotationPoint(-54F, -40F, -13F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 56, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 41
		turretModel[6].setRotationPoint(-54F, -34F, -13F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 56, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		turretModel[7].setRotationPoint(-54F, -37F, -13F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,-4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 46
		turretModel[8].setRotationPoint(-28F, -6F, -30F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,-4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, -8F, 2F, 0F, -8F, -2F, 0F, -8F, 2F, 0F, -8F); // Box 47
		turretModel[9].setRotationPoint(-28F, 2F, -30F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,-2F, 0F, -8F, 2F, 0F, -8F, -2F, 0F, -8F, 2F, 0F, -8F, -4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 48
		turretModel[10].setRotationPoint(-28F, -14F, -30F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 4, 21, 5, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 52
		turretModel[11].setRotationPoint(-27.5F, -21F, -20F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 4, 21, 5, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 58
		turretModel[12].setRotationPoint(-144.5F, -21F, -20F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,-1F, 0F, -8F, 1F, 0F, -8F, -1F, 0F, -8F, 1F, 0F, -8F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 59
		turretModel[13].setRotationPoint(-145F, -14F, -30F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 60
		turretModel[14].setRotationPoint(-145F, -6F, -30F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -8F, 1F, 0F, -8F, -1F, 0F, -8F, 1F, 0F, -8F); // Box 61
		turretModel[15].setRotationPoint(-145F, 2F, -30F);

		turretModel[16].addShapeBox(-140F, -64F, 16F, 1, 40, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret12
		turretModel[16].setRotationPoint(0F, 0F, 0F);

		turretModel[17].addShapeBox(-141F, -64F, 16F, 1, 40, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret13
		turretModel[17].setRotationPoint(0F, 0F, 0F);

		turretModel[18].addShapeBox(-139F, -64F, 16F, 1, 40, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret14
		turretModel[18].setRotationPoint(0F, 0F, 0F);

		turretModel[19].addShapeBox(-140.5F, -65F, 15.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret20
		turretModel[19].setRotationPoint(0F, 0F, 0F);

		turretModel[20].addShapeBox(-138.5F, -65F, 15.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret21
		turretModel[20].setRotationPoint(0F, 0F, 0F);

		turretModel[21].addShapeBox(-141.5F, -65F, 15.5F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret22
		turretModel[21].setRotationPoint(0F, 0F, 0F);

		turretModel[22].addShapeBox(-140.5F, -77F, 16F, 2, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret23
		turretModel[22].setRotationPoint(0F, 0F, 0F);

		turretModel[23].addShapeBox(-140.5F, -80F, 16F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret24
		turretModel[23].setRotationPoint(0F, 0F, 0F);

		turretModel[24].addShapeBox(-140.5F, -80F, -2F, 2, 3, 18, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret25
		turretModel[24].setRotationPoint(0F, 0F, 0F);

		turretModel[25].addShapeBox(-140.5F, -86F, -3F, 2, 2, 1, 0F,0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret26
		turretModel[25].setRotationPoint(0F, 0F, 0F);

		turretModel[26].addShapeBox(-140F, -86.5F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret29
		turretModel[26].setRotationPoint(0F, 0F, 0F);

		turretModel[27].addShapeBox(-140F, -76.5F, -3F, 1, 2, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret290
		turretModel[27].setRotationPoint(0F, 0F, 0F);

		turretModel[28].addShapeBox(-140F, -86.5F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Turret30
		turretModel[28].setRotationPoint(0F, 0F, 0F);

		turretModel[29].addShapeBox(-140F, -86.5F, -4F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret31
		turretModel[29].setRotationPoint(0F, 0F, 0F);

		turretModel[30].addShapeBox(-140F, -83.5F, -3F, 1, 14, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret41
		turretModel[30].setRotationPoint(0F, 0F, 0F);

		turretModel[31].addShapeBox(-141F, -67.5F, -5F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret42
		turretModel[31].setRotationPoint(0F, 0F, 0F);

		turretModel[32].addShapeBox(-141F, -64.5F, -8F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret43
		turretModel[32].setRotationPoint(0F, 0F, 0F);

		turretModel[33].addShapeBox(-141F, -64.5F, 2F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret44
		turretModel[33].setRotationPoint(0F, 0F, 0F);

		turretModel[34].addShapeBox(-141F, -57.5F, -5F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret45
		turretModel[34].setRotationPoint(0F, 0F, 0F);

		turretModel[35].addShapeBox(-141F, -67.5F, -8F, 3, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret46
		turretModel[35].setRotationPoint(0F, 0F, 0F);

		turretModel[36].addShapeBox(-140.5F, -69.5F, -3.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret47
		turretModel[36].setRotationPoint(0F, 0F, 0F);

		turretModel[37].addShapeBox(-141F, -57.5F, -8F, 3, 1, 3, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret48
		turretModel[37].setRotationPoint(0F, 0F, 0F);

		turretModel[38].addShapeBox(-141F, -67.5F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Turret49
		turretModel[38].setRotationPoint(0F, 0F, 0F);

		turretModel[39].addShapeBox(-141F, -57.5F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Turret52
		turretModel[39].setRotationPoint(0F, 0F, 0F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 23, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		turretModel[40].setRotationPoint(-132F, -33F, -35F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 50, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		turretModel[41].setRotationPoint(-132F, -34F, -35F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 1, 9, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		turretModel[42].setRotationPoint(-85F, -33F, -35F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		turretModel[43].setRotationPoint(-84F, -27F, -35F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 1, 20, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, -22F, 0F, 0F); // Box 91
		turretModel[44].setRotationPoint(-85F, -24F, -35F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 7, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		turretModel[45].setRotationPoint(-77F, -19F, -35F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		turretModel[46].setRotationPoint(-70F, -12F, -35F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 7, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		turretModel[47].setRotationPoint(-63F, -5F, -35F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 56, 22, 5, 0F,-2F, -6F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		turretModel[48].setRotationPoint(-94F, -54F, 12F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 156, 18, 7, 0F,0F, 2F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		turretModel[49].setRotationPoint(-152F, -39F, 12F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 37, 24, 5, 0F,0F, 10F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		turretModel[50].setRotationPoint(-38F, -54F, 12F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 56, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		turretModel[51].setRotationPoint(-54F, -40F, 4F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 56, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 99
		turretModel[52].setRotationPoint(-54F, -34F, 4F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 56, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		turretModel[53].setRotationPoint(-54F, -37F, 4F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 4, 21, 5, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 104
		turretModel[54].setRotationPoint(-27.5F, -21F, 15F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 4, 21, 5, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 105
		turretModel[55].setRotationPoint(-144.5F, -21F, 15F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,1F, 0F, -8F, -1F, 0F, -8F, 1F, 0F, -8F, -1F, 0F, -8F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 106
		turretModel[56].setRotationPoint(-145F, -14F, 6F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 107
		turretModel[57].setRotationPoint(-145F, -6F, 6F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -8F, -1F, 0F, -8F, 1F, 0F, -8F, -1F, 0F, -8F); // Box 108
		turretModel[58].setRotationPoint(-145F, 2F, 6F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 109
		turretModel[59].setRotationPoint(-28F, -6F, 6F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, -8F, -2F, 0F, -8F, 2F, 0F, -8F, -2F, 0F, -8F); // Box 110
		turretModel[60].setRotationPoint(-28F, 2F, 6F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,2F, 0F, -8F, -2F, 0F, -8F, 2F, 0F, -8F, -2F, 0F, -8F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		turretModel[61].setRotationPoint(-28F, -14F, 6F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		barrelModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		barrelModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		barrelModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
		barrelModel[4] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 6
		barrelModel[5] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 7
		barrelModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		barrelModel[7] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 9
		barrelModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		barrelModel[9] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 14
		barrelModel[10] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 15
		barrelModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 16
		barrelModel[12] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 17
		barrelModel[13] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 18
		barrelModel[14] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 19
		barrelModel[15] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 20
		barrelModel[16] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 21
		barrelModel[17] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 22
		barrelModel[18] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 23
		barrelModel[19] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 24
		barrelModel[20] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 25
		barrelModel[21] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 26
		barrelModel[22] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 27
		barrelModel[23] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 32
		barrelModel[24] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 33
		barrelModel[25] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 34
		barrelModel[26] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 35
		barrelModel[27] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 36
		barrelModel[28] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 37

		barrelModel[0].addShapeBox(85F, -3.4F, -1.5F, 76, 1, 3, 0F,0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F); // Box 1
		barrelModel[0].setRotationPoint(-38F, -62F, 0F);

		barrelModel[1].addShapeBox(85F, 4.60000000000001F, -1.5F, 76, 1, 3, 0F,0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F); // Box 2
		barrelModel[1].setRotationPoint(-38F, -62F, 0F);

		barrelModel[2].addShapeBox(85F, -0.199999999999997F, -4.5F, 76, 3, 1, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F); // Box 4
		barrelModel[2].setRotationPoint(-38F, -62F, 0F);

		barrelModel[3].addShapeBox(85F, -0.199999999999997F, 3.5F, 76, 3, 1, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F); // Box 5
		barrelModel[3].setRotationPoint(-38F, -62F, 0F);

		barrelModel[4].addShapeBox(85F, -3.7F, -4.5F, 76, 3, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 6
		barrelModel[4].setRotationPoint(-38F, -62F, 0F);

		barrelModel[5].addShapeBox(85F, 2.9F, -4.5F, 76, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1.5F, 2F, 0F, -1.5F, 2F); // Box 7
		barrelModel[5].setRotationPoint(-38F, -62F, 0F);

		barrelModel[6].addShapeBox(85F, -3.7F, 3.5F, 76, 3, 1, 0F,0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 8
		barrelModel[6].setRotationPoint(-38F, -62F, 0F);

		barrelModel[7].addShapeBox(85F, 2.9F, 3.5F, 76, 3, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 9
		barrelModel[7].setRotationPoint(-38F, -62F, 0F);

		barrelModel[8].addShapeBox(53F, -5F, -6F, 32, 4, 12, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 13
		barrelModel[8].setRotationPoint(-38F, -62F, 0F);

		barrelModel[9].addShapeBox(53F, -0.999999999999994F, -6F, 32, 4, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 14
		barrelModel[9].setRotationPoint(-38F, -62F, 0F);

		barrelModel[10].addShapeBox(53F, 3.00000000000001F, -6F, 32, 4, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -4F); // Box 15
		barrelModel[10].setRotationPoint(-38F, -62F, 0F);

		barrelModel[11].addShapeBox(38F, -1.49999999999999F, -7.5F, 15, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		barrelModel[11].setRotationPoint(-38F, -62F, 0F);

		barrelModel[12].addShapeBox(38F, -6.5F, -7.5F, 15, 5, 15, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		barrelModel[12].setRotationPoint(-38F, -62F, 0F);

		barrelModel[13].addShapeBox(38F, 3.50000000000001F, -7.5F, 15, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 18
		barrelModel[13].setRotationPoint(-38F, -62F, 0F);

		barrelModel[14].addShapeBox(28F, -1.99999999999999F, -9F, 10, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		barrelModel[14].setRotationPoint(-38F, -62F, 0F);

		barrelModel[15].addShapeBox(28F, -8F, -9F, 10, 6, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		barrelModel[15].setRotationPoint(-38F, -62F, 0F);

		barrelModel[16].addShapeBox(28F, 4.00000000000001F, -9F, 10, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 21
		barrelModel[16].setRotationPoint(-38F, -62F, 0F);

		barrelModel[17].addShapeBox(13F, 4.50000000000001F, -10.5F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 22
		barrelModel[17].setRotationPoint(-38F, -62F, 0F);

		barrelModel[18].addShapeBox(-45F, -11F, -12F, 58, 8, 24, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		barrelModel[18].setRotationPoint(-38F, -62F, 0F);

		barrelModel[19].addShapeBox(13F, -2.49999999999999F, -10.5F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		barrelModel[19].setRotationPoint(-38F, -62F, 0F);

		barrelModel[20].addShapeBox(13F, -9.5F, -10.5F, 15, 7, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		barrelModel[20].setRotationPoint(-38F, -62F, 0F);

		barrelModel[21].addShapeBox(-45F, -2.99999999999999F, -12F, 58, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		barrelModel[21].setRotationPoint(-38F, -62F, 0F);

		barrelModel[22].addShapeBox(-45F, 5.00000000000001F, -12F, 58, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 27
		barrelModel[22].setRotationPoint(-38F, -62F, 0F);

		barrelModel[23].addShapeBox(-55F, -3.49999999999999F, -13.5F, 10, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		barrelModel[23].setRotationPoint(-38F, -62F, 0F);

		barrelModel[24].addShapeBox(-55F, -12.5F, -13.5F, 10, 9, 27, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		barrelModel[24].setRotationPoint(-38F, -62F, 0F);

		barrelModel[25].addShapeBox(-55F, 5.50000000000001F, -13.5F, 10, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 34
		barrelModel[25].setRotationPoint(-38F, -62F, 0F);

		barrelModel[26].addShapeBox(-70F, -1.49999999999999F, -7.5F, 15, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		barrelModel[26].setRotationPoint(-38F, -62F, 0F);

		barrelModel[27].addShapeBox(-70F, -6.5F, -7.5F, 15, 5, 15, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		barrelModel[27].setRotationPoint(-38F, -62F, 0F);

		barrelModel[28].addShapeBox(-70F, 3.50000000000001F, -7.5F, 15, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 37
		barrelModel[28].setRotationPoint(-38F, -62F, 0F);
	}
}