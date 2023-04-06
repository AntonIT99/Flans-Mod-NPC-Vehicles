//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: scr584
// Model Creator: 
// Created on: 22.07.2019 - 14:33:18
// Last changed on: 22.07.2019 - 14:33:18

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelscr584 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modelscr584() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[74];
		leftFrontWheelModel = new ModelRendererTurbo[3];
		rightFrontWheelModel = new ModelRendererTurbo[3];
		leftBackWheelModel = new ModelRendererTurbo[6];
		rightBackWheelModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import 
		bodyModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import 
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import 
		bodyModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import 
		bodyModel[8] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import 
		bodyModel[9] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import 
		bodyModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import 
		bodyModel[18] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Import 
		bodyModel[22] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Import 
		bodyModel[24] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import 
		bodyModel[26] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import 
		bodyModel[27] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import 
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import 
		bodyModel[29] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import 
		bodyModel[30] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Import 
		bodyModel[31] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Import 
		bodyModel[32] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import 
		bodyModel[33] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import 
		bodyModel[34] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Import 
		bodyModel[35] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Import 
		bodyModel[36] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import 
		bodyModel[37] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import 
		bodyModel[38] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import 
		bodyModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import 
		bodyModel[40] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import 
		bodyModel[41] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import 
		bodyModel[42] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Import 
		bodyModel[43] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import 
		bodyModel[44] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import 
		bodyModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 
		bodyModel[46] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import 
		bodyModel[47] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import 
		bodyModel[48] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import 
		bodyModel[49] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import 
		bodyModel[50] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import 
		bodyModel[51] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Import 
		bodyModel[52] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import 
		bodyModel[53] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import 
		bodyModel[54] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import 
		bodyModel[55] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import 
		bodyModel[56] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import 
		bodyModel[57] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Import 
		bodyModel[58] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import 
		bodyModel[59] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import 
		bodyModel[60] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import 
		bodyModel[61] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import 
		bodyModel[62] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import 
		bodyModel[63] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import 
		bodyModel[64] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 1
		bodyModel[66] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 3
		bodyModel[68] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 4
		bodyModel[69] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 5
		bodyModel[70] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 6
		bodyModel[71] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 7
		bodyModel[72] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 8
		bodyModel[73] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 9

		bodyModel[0].addBox(0F, 0F, 0F, 3, 3, 32, 0F); // Import 
		bodyModel[0].setRotationPoint(29F, 0F, -16F);

		bodyModel[1].addBox(0F, 0F, 0F, 22, 16, 20, 0F); // Import 
		bodyModel[1].setRotationPoint(9F, -13F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 22, 1, 18, 0F); // Import 
		bodyModel[2].setRotationPoint(9F, -14F, -9F);

		bodyModel[3].addBox(0F, 0F, 0F, 19, 1, 32, 0F); // Import 
		bodyModel[3].setRotationPoint(9F, -5F, -16F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Import 
		bodyModel[4].setRotationPoint(24F, -8F, -14F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Import 
		bodyModel[5].setRotationPoint(24F, -8F, 11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 11, 32, 0F); // Import 
		bodyModel[6].setRotationPoint(8F, -14F, -16F);

		bodyModel[7].addBox(0F, 0F, 0F, 16, 6, 32, 0F); // Import 
		bodyModel[7].setRotationPoint(-7F, -3F, -16F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 25, 32, 0F); // Import 
		bodyModel[8].setRotationPoint(-8F, -22F, -16F);

		bodyModel[9].addBox(0F, 0F, 0F, 17, 1, 32, 0F); // Import 
		bodyModel[9].setRotationPoint(-8F, -23F, -16F);

		bodyModel[10].addBox(0F, 0F, 0F, 16, 16, 1, 0F); // Import 
		bodyModel[10].setRotationPoint(-8F, -14F, -17F);

		bodyModel[11].addBox(0F, 0F, 0F, 16, 16, 1, 0F); // Import 
		bodyModel[11].setRotationPoint(-8F, -14F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Import 
		bodyModel[12].setRotationPoint(-47F, 3F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Import 
		bodyModel[13].setRotationPoint(18F, 3F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Import 
		bodyModel[14].setRotationPoint(-34F, 3F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 12, 4, 0F); // Import 
		bodyModel[15].setRotationPoint(8F, -14F, 5F);
		bodyModel[15].rotateAngleZ = -0.1745329F;

		bodyModel[16].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Import 
		bodyModel[16].setRotationPoint(7F, -15F, -16F);
		bodyModel[16].rotateAngleZ = -0.1396263F;

		bodyModel[17].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Import 
		bodyModel[17].setRotationPoint(7F, -20F, 16F);
		bodyModel[17].rotateAngleZ = 0.1396263F;

		bodyModel[18].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Import 
		bodyModel[18].setRotationPoint(-6F, -5F, 1F);

		bodyModel[19].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Import 
		bodyModel[19].setRotationPoint(-6F, -4F, 1F);
		bodyModel[19].rotateAngleZ = 1.675516F;

		bodyModel[20].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Import 
		bodyModel[20].setRotationPoint(-6F, -5F, -13F);

		bodyModel[21].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Import 
		bodyModel[21].setRotationPoint(-6F, -4F, -13F);
		bodyModel[21].rotateAngleZ = 1.675516F;

		bodyModel[22].addBox(0F, 0F, 0F, 1, 9, 32, 0F); // Import 
		bodyModel[22].setRotationPoint(6F, -22F, -16F);
		bodyModel[22].rotateAngleZ = 0.2094395F;

		bodyModel[23].addBox(0F, 0F, 0F, 50, 7, 20, 0F); // Import 
		bodyModel[23].setRotationPoint(-58F, -4F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 10, 7, 7, 0F); // Import 
		bodyModel[24].setRotationPoint(-21F, -2F, -17F);

		bodyModel[25].addBox(0F, 0F, 0F, 10, 7, 7, 0F); // Import 
		bodyModel[25].setRotationPoint(-21F, -2F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 3, 32, 0F); // Import 
		bodyModel[26].setRotationPoint(-59F, 0F, -16F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Import 
		bodyModel[27].setRotationPoint(-59F, -2F, 11F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Import 
		bodyModel[28].setRotationPoint(-59F, -2F, -15F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 27, 35, 0F); // Import 
		bodyModel[29].setRotationPoint(-10F, -32F, -17.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 55, 1, 36, 0F); // Import 
		bodyModel[30].setRotationPoint(-64F, -5F, -18F);

		bodyModel[31].addBox(0F, 0F, 0F, 55, 27, 1, 0F); // Import 
		bodyModel[31].setRotationPoint(-64F, -32F, -18.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 55, 27, 1, 0F); // Import 
		bodyModel[32].setRotationPoint(-64F, -32F, 17.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 27, 36, 0F); // Import 
		bodyModel[33].setRotationPoint(-65F, -32F, -18F);

		bodyModel[34].addBox(0F, 0F, 0F, 52, 1, 9, 0F); // Import 
		bodyModel[34].setRotationPoint(-63F, -8F, 8F);

		bodyModel[35].addBox(0F, 0F, 0F, 52, 1, 9, 0F); // Import 
		bodyModel[35].setRotationPoint(-63F, -8F, -17F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Import 
		bodyModel[36].setRotationPoint(-47F, -32F, 16.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Import 
		bodyModel[37].setRotationPoint(-64F, -32F, 16.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Import 
		bodyModel[38].setRotationPoint(-11F, -32F, 16.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Import 
		bodyModel[39].setRotationPoint(-28F, -32F, 16.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Import 
		bodyModel[40].setRotationPoint(-11F, -32F, -17.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Import 
		bodyModel[41].setRotationPoint(-28F, -32F, -17.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Import 
		bodyModel[42].setRotationPoint(-47F, -32F, -17.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Import 
		bodyModel[43].setRotationPoint(-64F, -32F, -17.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import 
		bodyModel[44].setRotationPoint(-11F, -32F, 6.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import 
		bodyModel[45].setRotationPoint(-64F, -32F, 6.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import 
		bodyModel[46].setRotationPoint(-47F, -32F, 6.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import 
		bodyModel[47].setRotationPoint(-28F, -32F, 6.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Import 
		bodyModel[48].setRotationPoint(-11F, -33F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Import 
		bodyModel[49].setRotationPoint(-28F, -33F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Import 
		bodyModel[50].setRotationPoint(-64F, -33F, -7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Import 
		bodyModel[51].setRotationPoint(-47F, -33F, -7F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import 
		bodyModel[52].setRotationPoint(-11F, -32F, -16.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import 
		bodyModel[53].setRotationPoint(-64F, -32F, -16.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import 
		bodyModel[54].setRotationPoint(-47F, -32F, -16.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import 
		bodyModel[55].setRotationPoint(-28F, -32F, -16.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 55, 1, 10, 0F); // Import 
		bodyModel[56].setRotationPoint(-64.5F, -32.5F, 7F);

		bodyModel[57].addBox(0F, 0F, 0F, 55, 1, 15, 0F); // Import 
		bodyModel[57].setRotationPoint(-64.5F, -33.5F, -7.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 55, 1, 10, 0F); // Import 
		bodyModel[58].setRotationPoint(-64.5F, -32.5F, -17F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Import 
		bodyModel[59].setRotationPoint(-64.5F, -31.5F, 15F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Import 
		bodyModel[60].setRotationPoint(-64.5F, -31.5F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Import 
		bodyModel[61].setRotationPoint(-64.5F, -32.5F, -7F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Import 
		bodyModel[62].setRotationPoint(-64.5F, -31.5F, -15F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Import 
		bodyModel[63].setRotationPoint(-64.5F, -31.5F, -17F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 10, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-41.5F, -43F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[65].setRotationPoint(-40.5F, -50F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[66].setRotationPoint(-42.5F, -49F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[67].setRotationPoint(-42.5F, -49F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,1F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F); // Box 4
		bodyModel[68].setRotationPoint(-47.5F, -49F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[69].setRotationPoint(-34.5F, -49.5F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 7, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 6
		bodyModel[70].setRotationPoint(-31.5F, -51.5F, -10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 7, 21, 0F,-2.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -2.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 7
		bodyModel[71].setRotationPoint(-31.5F, -58.5F, -10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 7, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -2.5F, 0F, -7F); // Box 8
		bodyModel[72].setRotationPoint(-31.5F, -44.5F, -10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[73].setRotationPoint(-28.5F, -48.5F, -0.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 13
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 14
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 15

		leftFrontWheelModel[0].addShapeBox(-6F, -6F, -2F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftFrontWheelModel[0].setRotationPoint(19.1F, 4.1F, 13F);

		leftFrontWheelModel[1].addShapeBox(-6F, -2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftFrontWheelModel[1].setRotationPoint(19.1F, 4.1F, 13F);

		leftFrontWheelModel[2].addShapeBox(-6F, 2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 15
		leftFrontWheelModel[2].setRotationPoint(19.1F, 4.1F, 13F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 10
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 11
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 12

		rightFrontWheelModel[0].addShapeBox(-6F, -2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		rightFrontWheelModel[0].setRotationPoint(19.1F, 4.1F, -13F);

		rightFrontWheelModel[1].addShapeBox(-6F, 2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 11
		rightFrontWheelModel[1].setRotationPoint(19.1F, 4.1F, -13F);

		rightFrontWheelModel[2].addShapeBox(-6F, -6F, -2F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightFrontWheelModel[2].setRotationPoint(19.1F, 4.1F, -13F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 22
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 23
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 24
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 25
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 26
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 27

		leftBackWheelModel[0].addShapeBox(-6F, 2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 22
		leftBackWheelModel[0].setRotationPoint(-45.9F, 4.1F, 13F);

		leftBackWheelModel[1].addShapeBox(-6F, -6F, -2F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		leftBackWheelModel[1].setRotationPoint(-45.9F, 4.1F, 13F);

		leftBackWheelModel[2].addShapeBox(-6F, -2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftBackWheelModel[2].setRotationPoint(-45.9F, 4.1F, 13F);

		leftBackWheelModel[3].addShapeBox(-6F, 2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 25
		leftBackWheelModel[3].setRotationPoint(-32.9F, 4.1F, 13F);

		leftBackWheelModel[4].addShapeBox(-6F, -2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		leftBackWheelModel[4].setRotationPoint(-32.9F, 4.1F, 13F);

		leftBackWheelModel[5].addShapeBox(-6F, -6F, -2F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[5].setRotationPoint(-32.9F, 4.1F, 13F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 16
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 17
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 18
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 19
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 20
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 21

		rightBackWheelModel[0].addShapeBox(-6F, 2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 16
		rightBackWheelModel[0].setRotationPoint(-32.9F, 4.1F, -13F);

		rightBackWheelModel[1].addShapeBox(-6F, -6F, -2F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightBackWheelModel[1].setRotationPoint(-32.9F, 4.1F, -13F);

		rightBackWheelModel[2].addShapeBox(-6F, -2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightBackWheelModel[2].setRotationPoint(-32.9F, 4.1F, -13F);

		rightBackWheelModel[3].addShapeBox(-6F, 2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 19
		rightBackWheelModel[3].setRotationPoint(-45.9F, 4.1F, -13F);

		rightBackWheelModel[4].addShapeBox(-6F, -6F, -2F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightBackWheelModel[4].setRotationPoint(-45.9F, 4.1F, -13F);

		rightBackWheelModel[5].addShapeBox(-6F, -2F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		rightBackWheelModel[5].setRotationPoint(-45.9F, 4.1F, -13F);
	}
}