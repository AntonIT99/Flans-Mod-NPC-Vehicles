//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WW2_Vehicle_JagdpanzerIV_1
// Model Creator: 
// Created on: 05.01.2016 - 09:51:32
// Last changed on: 05.01.2016 - 09:51:32

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelJagdpanzerIV extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	//ModelRendererTurbo[][] mg42Model;

	public ModelJagdpanzerIV() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[123];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang11L
		bodyModel[1] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang12LTrap
		bodyModel[2] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang13LTrap
		bodyModel[3] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang14LTrap
		bodyModel[4] = new ModelRendererTurbo(this, 30, 440, textureX, textureY); // Import Aufhang15LTrap
		bodyModel[5] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang21L
		bodyModel[6] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang22LTrap
		bodyModel[7] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang23LTrap
		bodyModel[8] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang24LTrap
		bodyModel[9] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang31L
		bodyModel[10] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang32LTrap
		bodyModel[11] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang33LTrap
		bodyModel[12] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang34LTrap
		bodyModel[13] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang41L
		bodyModel[14] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang42LTrap
		bodyModel[15] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang43LTrap
		bodyModel[16] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang44LTrap
		bodyModel[17] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang11R
		bodyModel[18] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang12RTrap
		bodyModel[19] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang13RTrap
		bodyModel[20] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang14RTrap
		bodyModel[21] = new ModelRendererTurbo(this, 30, 440, textureX, textureY); // Import Aufhang15RTrap
		bodyModel[22] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang21R
		bodyModel[23] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang22RTrap
		bodyModel[24] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang23RTrap
		bodyModel[25] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang24RTrap
		bodyModel[26] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang31R
		bodyModel[27] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang32RTrap
		bodyModel[28] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang33RTrap
		bodyModel[29] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang34RTrap
		bodyModel[30] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang41R
		bodyModel[31] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang42RTrap
		bodyModel[32] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang43RTrap
		bodyModel[33] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang44RTrap
		bodyModel[34] = new ModelRendererTurbo(this, 181, 451, textureX, textureY); // Import AchseV
		bodyModel[35] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse1L
		bodyModel[36] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse2L
		bodyModel[37] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse3L
		bodyModel[38] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse4L
		bodyModel[39] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse5L
		bodyModel[40] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse6L
		bodyModel[41] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse7L
		bodyModel[42] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse8L
		bodyModel[43] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse9L
		bodyModel[44] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse10L
		bodyModel[45] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse11L
		bodyModel[46] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse12L
		bodyModel[47] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse13L
		bodyModel[48] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse1R
		bodyModel[49] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse2R
		bodyModel[50] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse3R
		bodyModel[51] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse4R
		bodyModel[52] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse5R
		bodyModel[53] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse6R
		bodyModel[54] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse7R
		bodyModel[55] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse8R
		bodyModel[56] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse9R
		bodyModel[57] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse10R
		bodyModel[58] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse11R
		bodyModel[59] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse12R
		bodyModel[60] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse13R
		bodyModel[61] = new ModelRendererTurbo(this, 246, 498, textureX, textureY); // Import BlechL
		bodyModel[62] = new ModelRendererTurbo(this, 246, 485, textureX, textureY); // Import BlechR
		bodyModel[63] = new ModelRendererTurbo(this, 160, 460, textureX, textureY); // Import Axt1
		bodyModel[64] = new ModelRendererTurbo(this, 184, 460, textureX, textureY); // Import Axt2
		bodyModel[65] = new ModelRendererTurbo(this, 198, 460, textureX, textureY); // Import Axt3
		bodyModel[66] = new ModelRendererTurbo(this, 206, 460, textureX, textureY); // Import Axt4
		bodyModel[67] = new ModelRendererTurbo(this, 320, 425, textureX, textureY); // Import Tank1Shape
		bodyModel[68] = new ModelRendererTurbo(this, 247, 450, textureX, textureY); // Import Tank2
		bodyModel[69] = new ModelRendererTurbo(this, 290, 435, textureX, textureY); // Import Tank3
		bodyModel[70] = new ModelRendererTurbo(this, 290, 445, textureX, textureY); // Import Tank4
		bodyModel[71] = new ModelRendererTurbo(this, 217, 500, textureX, textureY); // Import RadlagerL
		bodyModel[72] = new ModelRendererTurbo(this, 217, 487, textureX, textureY); // Import RadlagerR
		bodyModel[73] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Body1
		bodyModel[74] = new ModelRendererTurbo(this, 250, 80, textureX, textureY); // Import Body2
		bodyModel[75] = new ModelRendererTurbo(this, 0, 372, textureX, textureY); // Import Aufbau1
		bodyModel[76] = new ModelRendererTurbo(this, 22, 372, textureX, textureY); // Import Aufbau2
		bodyModel[77] = new ModelRendererTurbo(this, 25, 347, textureX, textureY); // Import Lampe1
		bodyModel[78] = new ModelRendererTurbo(this, 25, 355, textureX, textureY); // Import Lampe2
		bodyModel[79] = new ModelRendererTurbo(this, 117, 342, textureX, textureY); // Import Motor1
		bodyModel[80] = new ModelRendererTurbo(this, 117, 355, textureX, textureY); // Import Motor2
		bodyModel[81] = new ModelRendererTurbo(this, 117, 367, textureX, textureY); // Import Schlepp1
		bodyModel[82] = new ModelRendererTurbo(this, 137, 367, textureX, textureY); // Import Schlepp2
		bodyModel[83] = new ModelRendererTurbo(this, 145, 367, textureX, textureY); // Import Schlepp3
		bodyModel[84] = new ModelRendererTurbo(this, 117, 372, textureX, textureY); // Import Schlepp4
		bodyModel[85] = new ModelRendererTurbo(this, 137, 372, textureX, textureY); // Import Schlepp5
		bodyModel[86] = new ModelRendererTurbo(this, 145, 372, textureX, textureY); // Import Schlepp6
		bodyModel[87] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import 
		bodyModel[88] = new ModelRendererTurbo(this, 245, 240, textureX, textureY); // Import 
		bodyModel[89] = new ModelRendererTurbo(this, 245, 250, textureX, textureY); // Import 
		bodyModel[90] = new ModelRendererTurbo(this, 260, 292, textureX, textureY); // Import 
		bodyModel[91] = new ModelRendererTurbo(this, 363, 261, textureX, textureY); // Import 
		bodyModel[92] = new ModelRendererTurbo(this, 382, 261, textureX, textureY); // Import 
		bodyModel[93] = new ModelRendererTurbo(this, 382, 280, textureX, textureY); // Import 
		bodyModel[94] = new ModelRendererTurbo(this, 401, 261, textureX, textureY); // Import 
		bodyModel[95] = new ModelRendererTurbo(this, 401, 280, textureX, textureY); // Import 
		bodyModel[96] = new ModelRendererTurbo(this, 414, 261, textureX, textureY); // Import 
		bodyModel[97] = new ModelRendererTurbo(this, 414, 280, textureX, textureY); // Import 
		bodyModel[98] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Luke1
		bodyModel[99] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Luke2
		bodyModel[100] = new ModelRendererTurbo(this, 185, 120, textureX, textureY); // Import Sicht
		bodyModel[101] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Import MG1
		bodyModel[102] = new ModelRendererTurbo(this, 7, 260, textureX, textureY); // Import MG2
		bodyModel[103] = new ModelRendererTurbo(this, 506, 0, textureX, textureY); // Import Barrel1
		bodyModel[104] = new ModelRendererTurbo(this, 501, 0, textureX, textureY); // Import Barrel2
		bodyModel[105] = new ModelRendererTurbo(this, 476, 0, textureX, textureY); // Import Barrel3
		bodyModel[106] = new ModelRendererTurbo(this, 476, 3, textureX, textureY); // Import Barrel4
		bodyModel[107] = new ModelRendererTurbo(this, 481, 3, textureX, textureY); // Import Barrel5
		bodyModel[108] = new ModelRendererTurbo(this, 445, 0, textureX, textureY); // Import Barrel6
		bodyModel[109] = new ModelRendererTurbo(this, 445, 3, textureX, textureY); // Import Barrel7
		bodyModel[110] = new ModelRendererTurbo(this, 476, 6, textureX, textureY); // Import Body1
		bodyModel[111] = new ModelRendererTurbo(this, 476, 9, textureX, textureY); // Import Body2
		bodyModel[112] = new ModelRendererTurbo(this, 500, 16, textureX, textureY); // Import Body3
		bodyModel[113] = new ModelRendererTurbo(this, 488, 3, textureX, textureY); // Import Griff1
		bodyModel[114] = new ModelRendererTurbo(this, 488, 3, textureX, textureY); // Import Griff2
		bodyModel[115] = new ModelRendererTurbo(this, 495, 3, textureX, textureY); // Import Griff3
		bodyModel[116] = new ModelRendererTurbo(this, 500, 3, textureX, textureY); // Import Schulter1
		bodyModel[117] = new ModelRendererTurbo(this, 500, 6, textureX, textureY); // Import Schulter2
		bodyModel[118] = new ModelRendererTurbo(this, 500, 9, textureX, textureY); // Import Schulter3
		bodyModel[119] = new ModelRendererTurbo(this, 476, 12, textureX, textureY); // Import Ammo1
		bodyModel[120] = new ModelRendererTurbo(this, 489, 12, textureX, textureY); // Import Ammo2
		bodyModel[121] = new ModelRendererTurbo(this, 500, 12, textureX, textureY); // Import Mun1
		bodyModel[122] = new ModelRendererTurbo(this, 505, 12, textureX, textureY); // Import Mun2

		bodyModel[0].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang11L
		bodyModel[0].setRotationPoint(-35F, 4F, -23.5F);

		bodyModel[1].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang12LTrap
		bodyModel[1].setRotationPoint(-35F, 1F, -23.5F);

		bodyModel[2].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, -0.7F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang13LTrap
		bodyModel[2].setRotationPoint(-31F, -3F, -22.5F);

		bodyModel[3].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang14LTrap
		bodyModel[3].setRotationPoint(-23F, -3F, -22.5F);

		bodyModel[4].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang15LTrap
		bodyModel[4].setRotationPoint(-33F, -3F, -22.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang21L
		bodyModel[5].setRotationPoint(-13F, 4F, -23.5F);

		bodyModel[6].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang22LTrap
		bodyModel[6].setRotationPoint(-13F, 1F, -23.5F);

		bodyModel[7].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, -0.7F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang23LTrap
		bodyModel[7].setRotationPoint(-9F, -3F, -22.5F);

		bodyModel[8].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang24LTrap
		bodyModel[8].setRotationPoint(-1F, -3F, -22.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang31L
		bodyModel[9].setRotationPoint(9F, 4F, -23.5F);

		bodyModel[10].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang32LTrap
		bodyModel[10].setRotationPoint(9F, 1F, -23.5F);

		bodyModel[11].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, -0.7F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang33LTrap
		bodyModel[11].setRotationPoint(13F, -3F, -22.5F);

		bodyModel[12].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang34LTrap
		bodyModel[12].setRotationPoint(21F, -3F, -22.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang41L
		bodyModel[13].setRotationPoint(31F, 4F, -23.5F);

		bodyModel[14].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang42LTrap
		bodyModel[14].setRotationPoint(31F, 1F, -23.5F);

		bodyModel[15].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, -0.7F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang43LTrap
		bodyModel[15].setRotationPoint(35F, -3F, -22.5F);

		bodyModel[16].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang44LTrap
		bodyModel[16].setRotationPoint(43F, -3F, -22.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang11R
		bodyModel[17].setRotationPoint(-35F, 4F, 20.5F);

		bodyModel[18].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang12RTrap
		bodyModel[18].setRotationPoint(-35F, 1F, 20.5F);

		bodyModel[19].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, 0F, -0.7F, ModelRendererTurbo.MR_TOP); // Import Aufhang13RTrap
		bodyModel[19].setRotationPoint(-31F, -3F, 20.5F);

		bodyModel[20].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang14RTrap
		bodyModel[20].setRotationPoint(-23F, -3F, 20.5F);

		bodyModel[21].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang15RTrap
		bodyModel[21].setRotationPoint(-33F, -3F, 20.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang21R
		bodyModel[22].setRotationPoint(-13F, 4F, 20.5F);

		bodyModel[23].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang22RTrap
		bodyModel[23].setRotationPoint(-13F, 1F, 20.5F);

		bodyModel[24].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, 0F, -0.7F, ModelRendererTurbo.MR_TOP); // Import Aufhang23RTrap
		bodyModel[24].setRotationPoint(-9F, -3F, 20.5F);

		bodyModel[25].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang24RTrap
		bodyModel[25].setRotationPoint(-1F, -3F, 20.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang31R
		bodyModel[26].setRotationPoint(9F, 4F, 20.5F);

		bodyModel[27].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang32RTrap
		bodyModel[27].setRotationPoint(9F, 1F, 20.5F);

		bodyModel[28].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, 0F, -0.7F, ModelRendererTurbo.MR_TOP); // Import Aufhang33RTrap
		bodyModel[28].setRotationPoint(13F, -3F, 20.5F);

		bodyModel[29].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang34RTrap
		bodyModel[29].setRotationPoint(21F, -3F, 20.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang41R
		bodyModel[30].setRotationPoint(31F, 4F, 20.5F);

		bodyModel[31].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang42RTrap
		bodyModel[31].setRotationPoint(31F, 1F, 20.5F);

		bodyModel[32].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, 0F, -0.7F, ModelRendererTurbo.MR_TOP); // Import Aufhang43RTrap
		bodyModel[32].setRotationPoint(35F, -3F, 20.5F);

		bodyModel[33].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang44RTrap
		bodyModel[33].setRotationPoint(43F, -3F, 20.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 2, 59, 0F); // Import AchseV
		bodyModel[34].setRotationPoint(53.5F, -4.5F, -29.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Import Achse1L
		bodyModel[35].setRotationPoint(-48.5F, -1.5F, -29.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse2L
		bodyModel[36].setRotationPoint(-34F, 3F, -28.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse3L
		bodyModel[37].setRotationPoint(-23F, 3F, -28.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse4L
		bodyModel[38].setRotationPoint(-12F, 3F, -28.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse5L
		bodyModel[39].setRotationPoint(-1F, 3F, -28.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse6L
		bodyModel[40].setRotationPoint(10F, 3F, -28.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse7L
		bodyModel[41].setRotationPoint(21F, 3F, -28.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse8L
		bodyModel[42].setRotationPoint(32F, 3F, -28.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse9L
		bodyModel[43].setRotationPoint(43F, 3F, -28.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse10L
		bodyModel[44].setRotationPoint(32F, -10F, -24F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse11L
		bodyModel[45].setRotationPoint(14F, -10F, -24F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse12L
		bodyModel[46].setRotationPoint(-8F, -10F, -24F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse13L
		bodyModel[47].setRotationPoint(-30F, -10F, -24F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Import Achse1R
		bodyModel[48].setRotationPoint(-48.5F, -1.5F, 12.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse2R
		bodyModel[49].setRotationPoint(-34F, 3F, 22.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse3R
		bodyModel[50].setRotationPoint(-23F, 3F, 22.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse4R
		bodyModel[51].setRotationPoint(-12F, 3F, 22.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse5R
		bodyModel[52].setRotationPoint(-1F, 3F, 22.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse6R
		bodyModel[53].setRotationPoint(10F, 3F, 22.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse7R
		bodyModel[54].setRotationPoint(21F, 3F, 22.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse8R
		bodyModel[55].setRotationPoint(32F, 3F, 22.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse9R
		bodyModel[56].setRotationPoint(43F, 3F, 22.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse10R
		bodyModel[57].setRotationPoint(32F, -10F, 20F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse11R
		bodyModel[58].setRotationPoint(14F, -10F, 20F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse12R
		bodyModel[59].setRotationPoint(-8F, -10F, 20F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse13R
		bodyModel[60].setRotationPoint(-30F, -10F, 20F);

		bodyModel[61].addBox(0F, 0F, 0F, 110, 1, 10, 0F); // Import BlechL
		bodyModel[61].setRotationPoint(-50F, -15F, -31F);

		bodyModel[62].addBox(0F, 0F, 0F, 110, 1, 10, 0F); // Import BlechR
		bodyModel[62].setRotationPoint(-50F, -15F, 21F);

		bodyModel[63].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import Axt1
		bodyModel[63].setRotationPoint(45F, -15.5F, -25F);

		bodyModel[64].addBox(10F, -0.1F, -0.5F, 2, 1, 4, 0F); // Import Axt2
		bodyModel[64].setRotationPoint(45F, -15.5F, -25F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Axt3
		bodyModel[65].setRotationPoint(46F, -16F, -25.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Axt4
		bodyModel[66].setRotationPoint(53F, -16F, -25.5F);

		bodyModel[67].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 25, 6, 6, 20, 25, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Tank1Shape
		bodyModel[67].setRotationPoint(-46F, -8F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Import Tank2
		bodyModel[68].setRotationPoint(-53F, -15F, -2F);
		bodyModel[68].rotateAngleX = -0.3665192F;
		bodyModel[68].rotateAngleZ = 0.4712389F;

		bodyModel[69].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Import Tank3
		bodyModel[69].setRotationPoint(-45.5F, -7.5F, 5F);

		bodyModel[70].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Import Tank4
		bodyModel[70].setRotationPoint(-45.5F, -7.5F, -14F);

		bodyModel[71].addBox(0F, 0F, 0F, 5, 4, 6, 0F); // Import RadlagerL
		bodyModel[71].setRotationPoint(-49.5F, -2.2F, -20F);
		bodyModel[71].rotateAngleZ = 0.1396263F;

		bodyModel[72].addBox(0F, 0F, 0F, 5, 4, 6, 0F); // Import RadlagerR
		bodyModel[72].setRotationPoint(-49.5F, -2.2F, 14F);
		bodyModel[72].rotateAngleZ = 0.1396263F;

		bodyModel[73].addFlexBox(0F, 0F, 0F, 60, 14, 62, 0F, 0F, -16F, -7F, -7F, ModelRendererTurbo.MR_TOP); // Import Body1
		bodyModel[73].setRotationPoint(-20F, -29F, -31F);

		bodyModel[74].addFlexBox(0F, 0F, 0F, 28, 14, 62, 0F, -4F, 0F, -7F, -7F, ModelRendererTurbo.MR_TOP); // Import Body2
		bodyModel[74].setRotationPoint(-48F, -29F, -31F);

		bodyModel[75].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Aufbau1
		bodyModel[75].setRotationPoint(41.5F, -17F, 23F);

		bodyModel[76].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Import Aufbau2
		bodyModel[76].setRotationPoint(43F, -16F, 27F);

		bodyModel[77].addTrapezoid(0F, 0F, 0F, 3, 3, 3, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT); // Import Lampe1
		bodyModel[77].setRotationPoint(51F, -20F, 25F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Lampe2
		bodyModel[78].setRotationPoint(51.5F, -18F, 26F);

		bodyModel[79].addBox(0F, 0F, 0F, 15, 1, 9, 0F); // Import Motor1
		bodyModel[79].setRotationPoint(-35F, -29.8F, -18F);

		bodyModel[80].addBox(0F, 0F, 0F, 18, 1, 9, 0F); // Import Motor2
		bodyModel[80].setRotationPoint(-41F, -29.8F, 5F);

		bodyModel[81].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Schlepp1
		bodyModel[81].setRotationPoint(56.5F, -7F, -18F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Schlepp2
		bodyModel[82].setRotationPoint(63F, -6.5F, -17F);

		bodyModel[83].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Schlepp3
		bodyModel[83].setRotationPoint(56.5F, -7F, -15F);

		bodyModel[84].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Schlepp4
		bodyModel[84].setRotationPoint(56.5F, -7F, 14F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Schlepp5
		bodyModel[85].setRotationPoint(63F, -6.5F, 15F);

		bodyModel[86].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Schlepp6
		bodyModel[86].setRotationPoint(56.5F, -7F, 17F);

		bodyModel[87].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 13, 0, 13), new Coord2D(2, 4, 2, 4), new Coord2D(8, 0, 8, 0), new Coord2D(99, 0, 99, 0), new Coord2D(107, 1, 107, 1), new Coord2D(110, 13, 110, 13) }), 42, 110, 13, 241, 42, ModelRendererTurbo.MR_FRONT, new float[] {110 ,13 ,9 ,91 ,8 ,10}); // Import 
		bodyModel[87].setRotationPoint(63F, 3F, 21F);

		bodyModel[88].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(127, 0, 127, 0), new Coord2D(117, 7, 117, 7), new Coord2D(7, 7, 7, 7), new Coord2D(4, 6, 4, 6) }), 1, 127, 7, 262, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,4 ,110 ,13 ,127}); // Import 
		bodyModel[88].setRotationPoint(67F, -8F, 21F);

		bodyModel[89].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(127, 0, 127, 0), new Coord2D(117, 7, 117, 7), new Coord2D(7, 7, 7, 7), new Coord2D(4, 6, 4, 6) }), 1, 127, 7, 262, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,4 ,110 ,13 ,127}); // Import 
		bodyModel[89].setRotationPoint(67F, -8F, -20F);

		bodyModel[90].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(23, 0, 23, 0), new Coord2D(23, 5, 23, 5) }), 40, 23, 5, 52, 40, ModelRendererTurbo.MR_FRONT, new float[] {24 ,5 ,23}); // Import 
		bodyModel[90].setRotationPoint(63F, -10F, 20F);

		bodyModel[91].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 5, 2, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 0, 0, 0) }), 40, 2, 5, 14, 40, ModelRendererTurbo.MR_FRONT, new float[] {1 ,6 ,1 ,6}); // Import 
		bodyModel[91].setRotationPoint(-46F, -10F, 20F);

		bodyModel[92].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(4, 5, 4, 5), new Coord2D(4, 6, 4, 6) }), 10, 4, 6, 16, 10, ModelRendererTurbo.MR_FRONT, new float[] {8 ,1 ,6 ,1}); // Import 
		bodyModel[92].setRotationPoint(67F, -8F, 31F);

		bodyModel[93].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(4, 5, 4, 5), new Coord2D(4, 6, 4, 6) }), 10, 4, 6, 16, 10, ModelRendererTurbo.MR_FRONT, new float[] {8 ,1 ,6 ,1}); // Import 
		bodyModel[93].setRotationPoint(67F, -8F, -21F);

		bodyModel[94].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 1, 0, 1), new Coord2D(0, 0, 0, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2) }), 10, 3, 2, 10, 10, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,4 ,1}); // Import 
		bodyModel[94].setRotationPoint(63F, -13F, 31F);

		bodyModel[95].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 1, 0, 1), new Coord2D(0, 0, 0, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2) }), 10, 3, 2, 10, 10, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,4 ,1}); // Import 
		bodyModel[95].setRotationPoint(63F, -13F, -21F);

		bodyModel[96].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(10, 0, 10, 0), new Coord2D(0, 7, 0, 7), new Coord2D(0, 6, 0, 6) }), 10, 10, 7, 26, 10, ModelRendererTurbo.MR_FRONT, new float[] {11 ,1 ,13 ,1}); // Import 
		bodyModel[96].setRotationPoint(-50F, -8F, 31F);

		bodyModel[97].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(10, 0, 10, 0), new Coord2D(0, 7, 0, 7), new Coord2D(0, 6, 0, 6) }), 10, 10, 7, 26, 10, ModelRendererTurbo.MR_FRONT, new float[] {11 ,1 ,13 ,1}); // Import 
		bodyModel[97].setRotationPoint(-50F, -8F, -21F);

		bodyModel[98].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Import Luke1
		bodyModel[98].setRotationPoint(-14F, -30F, 3F);

		bodyModel[99].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Luke2
		bodyModel[99].setRotationPoint(1F, -30F, -7F);
		bodyModel[99].rotateAngleX = 1.57079633F;

		bodyModel[100].addBox(0F, 0F, 0F, 5, 4, 10, 0F); // Import Sicht
		bodyModel[100].setRotationPoint(29F, -23F, 10F);

		bodyModel[101].addTrapezoid(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, ModelRendererTurbo.MR_TOP); // Import MG1
		bodyModel[101].setRotationPoint(5F, -34F, 8.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import MG2
		bodyModel[102].setRotationPoint(6F, -31F, 8.5F);
		bodyModel[102].rotateAngleZ = -2.827433F;

		bodyModel[103].addShapeBox(11F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Import Barrel1
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(10F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F); // Import Barrel2
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Barrel3
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(8F, -1.92F, -0.5F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Import Barrel4
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(0F, -2F, -0.5F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Barrel5
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Import Barrel6
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Import Barrel7
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addBox(-9F, -1F, -0.5F, 8, 1, 1, 0F); // Import Body1
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-9F, -2F, -0.5F, 8, 1, 1, 0F, -5F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body2
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0F, 0.5F, -0.5F, -0.25F, -2F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, -0.25F); // Import Body3
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Griff1
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Griff2
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-5.5F, 0F, -0.5F, 1, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, -0.8F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 1F, -0.8F, -0.2F); // Import Griff3
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(-12F, -2F, -0.5F, 2, 1, 1, 0F, 0.5F, -0.5F, -0.25F, -2F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, -0.25F); // Import Schulter1
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-12F, -1F, -0.5F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Import Schulter2
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-12F, 0F, -0.5F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, 0F, 0F, -0.25F); // Import Schulter3
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addBox(-3.4F, -0.2F, 0F, 2, 3, 4, 0F); // Import Ammo1
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addBox(-2.9F, -0.8F, 0F, 1, 0, 3, 0F); // Import Ammo2
		bodyModel[120].setRotationPoint(0F, 0F, 0F);
		bodyModel[120].rotateAngleX = -0.2094395F;

		bodyModel[121].addShapeBox(-4.2F, -1F, -1.2F, 1, 1, 1, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Mun1
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-4F, -1.5F, -1.3F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Mun2
		bodyModel[122].setRotationPoint(0F, 0F, 0F);


		turretModel = new ModelRendererTurbo[22];
		
		
		turretModel[0] = new ModelRendererTurbo(this, 506, 0, this.textureX, this.textureY);
		turretModel[1] = new ModelRendererTurbo(this, 501, 0, this.textureX, this.textureY);
		turretModel[2] = new ModelRendererTurbo(this, 476, 0, this.textureX, this.textureY);
		turretModel[3] = new ModelRendererTurbo(this, 476, 3, this.textureX, this.textureY);
		turretModel[4] = new ModelRendererTurbo(this, 481, 3, this.textureX, this.textureY);
		turretModel[5] = new ModelRendererTurbo(this, 445, 0, this.textureX, this.textureY);
		turretModel[6] = new ModelRendererTurbo(this, 445, 3, this.textureX, this.textureY);
		turretModel[7] = new ModelRendererTurbo(this, 476, 6, this.textureX, this.textureY);
		turretModel[8] = new ModelRendererTurbo(this, 476, 9, this.textureX, this.textureY);
		turretModel[9] = new ModelRendererTurbo(this, 500, 16, this.textureX, this.textureY);
		turretModel[10] = new ModelRendererTurbo(this, 488, 3, this.textureX, this.textureY);
		turretModel[11] = new ModelRendererTurbo(this, 488, 3, this.textureX, this.textureY);
		turretModel[12] = new ModelRendererTurbo(this, 495, 3, this.textureX, this.textureY);
		turretModel[13] = new ModelRendererTurbo(this, 500, 3, this.textureX, this.textureY);
		turretModel[14] = new ModelRendererTurbo(this, 500, 6, this.textureX, this.textureY);
		turretModel[15] = new ModelRendererTurbo(this, 500, 9, this.textureX, this.textureY);
		turretModel[16] = new ModelRendererTurbo(this, 476, 12, this.textureX, this.textureY);
		turretModel[17] = new ModelRendererTurbo(this, 489, 12, this.textureX, this.textureY);
		turretModel[18] = new ModelRendererTurbo(this, 500, 12, this.textureX, this.textureY);
		turretModel[19] = new ModelRendererTurbo(this, 505, 12, this.textureX, this.textureY);
		
		turretModel[20] = new ModelRendererTurbo(this, 185, 80, textureX, textureY); // Import Turret1
		turretModel[21] = new ModelRendererTurbo(this, 230, 100, textureX, textureY); // Import Turret2

		turretModel[20].addBox(24F, -29F, -15F, 8, 14, 24, 0F); // Import Turret1
		turretModel[20].setRotationPoint(0F, 0F, 0F);

		turretModel[21].addFlexBox(32F, -29F, -15F, 9, 14, 24, 0F, -3.0F, -1.5F, -5F, -5F, ModelRendererTurbo.MR_LEFT); // Import Turret2
		turretModel[21].setRotationPoint(0F, 0F, 0F);
		
	   
	    
	    turretModel[0].addShapeBox(11.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F);
	    
	    turretModel[1].addShapeBox(10.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.05F, -0.05F);
	    
	    turretModel[2].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
	    
	    turretModel[3].addShapeBox(8.0F, -1.92F, -0.5F, 1, 1, 1, 0.0F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F);
	    
	    turretModel[4].addShapeBox(0.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, -0.2F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    turretModel[5].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F);
	    
	    (turretModel[6]).flip = true;
	    
	    turretModel[6].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F);
	    
	    turretModel[7].addBox(-9.0F, -1.0F, -0.5F, 8, 1, 1, 0.0F);
	    
	    turretModel[8].addShapeBox(-9.0F, -2.0F, -0.5F, 8, 1, 1, 0.0F, -5.0F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -5.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
	    
	    turretModel[9].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.25F);
	    
	    turretModel[10].addShapeBox(-5.5F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    (turretModel[11]).flip = true;
	    turretModel[11].addShapeBox(-5.5F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    turretModel[12].addShapeBox(-5.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 1.0F, -0.8F, -0.2F, -1.0F, -0.5F, -0.2F, -1.0F, -0.5F, -0.2F, 1.0F, -0.8F, -0.2F);
	    
	    turretModel[13].addShapeBox(-12.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.25F);
	    
	    turretModel[14].addShapeBox(-12.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F);
	    
	    turretModel[15].addShapeBox(-12.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.3F, -0.9F, 0.0F, -0.3F, -0.9F, 0.0F, 0.0F, 0.0F, -0.25F);
	    
	    turretModel[16].addBox(-3.4F, -0.2F, 0.0F, 2, 3, 4, 0.0F);
	    
	    turretModel[17].addBox(-2.9F, -0.8F, 0.0F, 1, 0, 3, 0.0F);
	    (turretModel[17]).rotateAngleX = -0.2094395F;
	    
	    turretModel[18].addShapeBox(-4.2F, -1.0F, -1.2F, 1, 1, 1, 0.0F, -0.4F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
	    
	    turretModel[19].addShapeBox(-4.0F, -1.5F, -1.3F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);

	    
	    for (int i = 0; i<20; i++)
	    {
	    	turretModel[i].setRotationPoint(5.5F, -34.0F, 9.0F);
	    }


		barrelModel = new ModelRendererTurbo[3];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import Barrel1
		barrelModel[1] = new ModelRendererTurbo(this, 370, 80, textureX, textureY); // Import Barrel2
		barrelModel[2] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Barrel3

		barrelModel[0].addFlexBox(5F, -3F, -4.5F, 6, 6, 9, 0F, -0.7F, -0.7F, -2.2F, -2.2F, ModelRendererTurbo.MR_LEFT); // Import Barrel1
		barrelModel[0].setRotationPoint(40F, -20F, -3F);

		barrelModel[1].addFlexBox(-1F, -8F, -9F, 6, 13, 18, 0F, -5F, -2F, -4.5F, -4.5F, ModelRendererTurbo.MR_LEFT); // Import Barrel2
		barrelModel[1].setRotationPoint(40F, -20F, -3F);

		barrelModel[2].addTrapezoid(-19F, -2F, -2F, 102, 4, 4, 0F, -1F, ModelRendererTurbo.MR_LEFT); // Import Barrel3
		barrelModel[2].setRotationPoint(40F, -20F, -3F);


		leftTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Rad11L
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Rad12L
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad21L
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad22L
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad31L
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad32L
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad41L
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad42L
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad51L
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad52L
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad61L
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad62L
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad71L
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad72L
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad81L
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad82L
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad91L
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad92L
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Import Rad101L
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Import Rad102L
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad111L
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad121L
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad131L
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad141L

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad11L
		leftTrackWheelModels[0].setRotationPoint(-47.5F, -0.5F, -28.5F);

		leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad12L
		leftTrackWheelModels[1].setRotationPoint(-47.5F, -0.5F, -23.5F);

		leftTrackWheelModels[2].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad21L
		leftTrackWheelModels[2].setRotationPoint(-33F, 4F, -27F);

		leftTrackWheelModels[3].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad22L
		leftTrackWheelModels[3].setRotationPoint(-33F, 4F, -24.5F);

		leftTrackWheelModels[4].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad31L
		leftTrackWheelModels[4].setRotationPoint(-22F, 4F, -27F);

		leftTrackWheelModels[5].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad32L
		leftTrackWheelModels[5].setRotationPoint(-22F, 4F, -24.5F);

		leftTrackWheelModels[6].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad41L
		leftTrackWheelModels[6].setRotationPoint(-11F, 4F, -27F);

		leftTrackWheelModels[7].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad42L
		leftTrackWheelModels[7].setRotationPoint(-11F, 4F, -24.5F);

		leftTrackWheelModels[8].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad51L
		leftTrackWheelModels[8].setRotationPoint(0F, 4F, -27F);

		leftTrackWheelModels[9].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad52L
		leftTrackWheelModels[9].setRotationPoint(0F, 4F, -24.5F);

		leftTrackWheelModels[10].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad61L
		leftTrackWheelModels[10].setRotationPoint(11F, 4F, -27F);

		leftTrackWheelModels[11].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad62L
		leftTrackWheelModels[11].setRotationPoint(11F, 4F, -24.5F);

		leftTrackWheelModels[12].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad71L
		leftTrackWheelModels[12].setRotationPoint(22F, 4F, -27F);

		leftTrackWheelModels[13].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad72L
		leftTrackWheelModels[13].setRotationPoint(22F, 4F, -24.5F);

		leftTrackWheelModels[14].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad81L
		leftTrackWheelModels[14].setRotationPoint(33F, 4F, -27F);

		leftTrackWheelModels[15].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad82L
		leftTrackWheelModels[15].setRotationPoint(33F, 4F, -24.5F);

		leftTrackWheelModels[16].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad91L
		leftTrackWheelModels[16].setRotationPoint(44F, 4F, -27F);

		leftTrackWheelModels[17].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad92L
		leftTrackWheelModels[17].setRotationPoint(44F, 4F, -24.5F);

		leftTrackWheelModels[18].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 1, 15, 15, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Rad101L
		leftTrackWheelModels[18].setRotationPoint(54.5F, -3.5F, -28.5F);

		leftTrackWheelModels[19].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 1, 15, 15, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Rad102L
		leftTrackWheelModels[19].setRotationPoint(54.5F, -3.5F, -23.5F);

		leftTrackWheelModels[20].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad111L
		leftTrackWheelModels[20].setRotationPoint(33F, -9F, -26F);
		leftTrackWheelModels[20].rotateAngleY = -3.14159265F;

		leftTrackWheelModels[21].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad121L
		leftTrackWheelModels[21].setRotationPoint(15F, -9F, -26F);
		leftTrackWheelModels[21].rotateAngleY = -3.14159265F;

		leftTrackWheelModels[22].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad131L
		leftTrackWheelModels[22].setRotationPoint(-7F, -9F, -26F);
		leftTrackWheelModels[22].rotateAngleY = -3.14159265F;

		leftTrackWheelModels[23].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad141L
		leftTrackWheelModels[23].setRotationPoint(-29F, -9F, -26F);
		leftTrackWheelModels[23].rotateAngleY = -3.14159265F;


		rightTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Rad11R
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Rad12R
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad21R
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad22R
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad31R
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad32R
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad41R
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad42R
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad51R
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad52R
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad61R
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad62R
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad71R
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad72R
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad81R
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad82R
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad91R
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad92R
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Import Rad101R
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Import Rad102R
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad111R
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad121R
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad131R
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad141R

		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad11R
		rightTrackWheelModels[0].setRotationPoint(-47.5F, -0.5F, 28.5F);

		rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad12R
		rightTrackWheelModels[1].setRotationPoint(-47.5F, -0.5F, 23.5F);

		rightTrackWheelModels[2].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad21R
		rightTrackWheelModels[2].setRotationPoint(-33F, 4F, 27F);

		rightTrackWheelModels[3].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad22R
		rightTrackWheelModels[3].setRotationPoint(-33F, 4F, 24.5F);

		rightTrackWheelModels[4].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad31R
		rightTrackWheelModels[4].setRotationPoint(-22F, 4F, 27F);

		rightTrackWheelModels[5].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad32R
		rightTrackWheelModels[5].setRotationPoint(-22F, 4F, 24.5F);

		rightTrackWheelModels[6].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad41R
		rightTrackWheelModels[6].setRotationPoint(-11F, 4F, 27F);

		rightTrackWheelModels[7].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad42R
		rightTrackWheelModels[7].setRotationPoint(-11F, 4F, 24.5F);

		rightTrackWheelModels[8].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad51R
		rightTrackWheelModels[8].setRotationPoint(0F, 4F, 27F);

		rightTrackWheelModels[9].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad52R
		rightTrackWheelModels[9].setRotationPoint(0F, 4F, 24.5F);

		rightTrackWheelModels[10].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad61R
		rightTrackWheelModels[10].setRotationPoint(11F, 4F, 27F);

		rightTrackWheelModels[11].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad62R
		rightTrackWheelModels[11].setRotationPoint(11F, 4F, 24.5F);

		rightTrackWheelModels[12].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad71R
		rightTrackWheelModels[12].setRotationPoint(22F, 4F, 27F);

		rightTrackWheelModels[13].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad72R
		rightTrackWheelModels[13].setRotationPoint(22F, 4F, 24.5F);

		rightTrackWheelModels[14].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad81R
		rightTrackWheelModels[14].setRotationPoint(33F, 4F, 27F);

		rightTrackWheelModels[15].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad82R
		rightTrackWheelModels[15].setRotationPoint(33F, 4F, 24.5F);

		rightTrackWheelModels[16].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad91R
		rightTrackWheelModels[16].setRotationPoint(44F, 4F, 27F);

		rightTrackWheelModels[17].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad92R
		rightTrackWheelModels[17].setRotationPoint(44F, 4F, 24.5F);

		rightTrackWheelModels[18].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 1, 15, 15, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Rad101R
		rightTrackWheelModels[18].setRotationPoint(54.5F, -3.5F, 28.5F);

		rightTrackWheelModels[19].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 1, 15, 15, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Rad102R
		rightTrackWheelModels[19].setRotationPoint(54.5F, -3.5F, 23.5F);

		rightTrackWheelModels[20].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad111R
		rightTrackWheelModels[20].setRotationPoint(33F, -9F, 26F);
		rightTrackWheelModels[20].rotateAngleY = -3.14159265F;

		rightTrackWheelModels[21].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad121R
		rightTrackWheelModels[21].setRotationPoint(15F, -9F, 26F);
		rightTrackWheelModels[21].rotateAngleY = -3.14159265F;

		rightTrackWheelModels[22].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad131R
		rightTrackWheelModels[22].setRotationPoint(-7F, -9F, 26F);
		rightTrackWheelModels[22].rotateAngleY = -3.14159265F;

		rightTrackWheelModels[23].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad141R
		rightTrackWheelModels[23].setRotationPoint(-29F, -9F, 26F);
		rightTrackWheelModels[23].rotateAngleY = -3.14159265F;


		leftTrackModel = new ModelRendererTurbo[16];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Import Kette1L
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Kette2L
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Kette3L
		leftTrackModel[3] = new ModelRendererTurbo(this, 36, 490, textureX, textureY); // Import Kette4L
		leftTrackModel[4] = new ModelRendererTurbo(this, 61, 486, textureX, textureY); // Import Kette5L
		leftTrackModel[5] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Import Kette6L
		leftTrackModel[6] = new ModelRendererTurbo(this, 20, 480, textureX, textureY); // Import Kette7L
		leftTrackModel[7] = new ModelRendererTurbo(this, 0, 467, textureX, textureY); // Import Kette8L
		leftTrackModel[8] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Kette9L
		leftTrackModel[9] = new ModelRendererTurbo(this, 120, 492, textureX, textureY); // Import Kette10L
		leftTrackModel[10] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Import Kette11L
		leftTrackModel[11] = new ModelRendererTurbo(this, 140, 480, textureX, textureY); // Import Kette12L
		leftTrackModel[12] = new ModelRendererTurbo(this, 160, 488, textureX, textureY); // Import Kette13L
		leftTrackModel[13] = new ModelRendererTurbo(this, 172, 478, textureX, textureY); // Import Kette14L
		leftTrackModel[14] = new ModelRendererTurbo(this, 174, 501, textureX, textureY); // Import Kette15L
		leftTrackModel[15] = new ModelRendererTurbo(this, 192, 474, textureX, textureY); // Import Kette16L

		leftTrackModel[0].addBox(0F, 0F, 0F, 81, 1, 8, 0F); // Import Kette1L
		leftTrackModel[0].setRotationPoint(-35F, 9F, -30F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Import Kette2L
		leftTrackModel[1].setRotationPoint(58F, 5F, -30F);
		leftTrackModel[1].rotateAngleZ = -2.75762F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Import Kette3L
		leftTrackModel[2].setRotationPoint(58F, 5F, -30F);
		leftTrackModel[2].rotateAngleZ = 2.356194F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Kette4L
		leftTrackModel[3].setRotationPoint(63F, 0F, -30F);
		leftTrackModel[3].rotateAngleZ = -2.356194F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import Kette5L
		leftTrackModel[4].setRotationPoint(62F, -7F, -30F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Import Kette6L
		leftTrackModel[5].setRotationPoint(63F, -7F, -30F);
		leftTrackModel[5].rotateAngleZ = -2.356194F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Kette7L
		leftTrackModel[6].setRotationPoint(58F, -12F, -30F);
		leftTrackModel[6].rotateAngleZ = -0.78539816F;

		leftTrackModel[7].addBox(0F, 0F, 0F, 88, 1, 8, 0F); // Import Kette8L
		leftTrackModel[7].setRotationPoint(-30F, -12F, -30F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 12, 8, 0F); // Import Kette9L
		leftTrackModel[8].setRotationPoint(-30F, -12F, -30F);
		leftTrackModel[8].rotateAngleZ = -1.38257482F;

		leftTrackModel[9].addBox(0F, 0F, 0F, 10, 1, 8, 0F); // Import Kette10L
		leftTrackModel[9].setRotationPoint(-51F, -8F, -30F);
		leftTrackModel[9].rotateAngleZ = 0.1882215F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Kette11L
		leftTrackModel[10].setRotationPoint(-51F, -8F, -30F);
		leftTrackModel[10].rotateAngleZ = -0.78539816F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Import Kette12L
		leftTrackModel[11].setRotationPoint(-55F, -4F, -30F);
		leftTrackModel[11].rotateAngleZ = 0.78539816F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import Kette13L
		leftTrackModel[12].setRotationPoint(-55F, -4F, -30F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Kette14L
		leftTrackModel[13].setRotationPoint(-55F, 3F, -30F);
		leftTrackModel[13].rotateAngleZ = 0.78539816F;

		leftTrackModel[14].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Import Kette15L
		leftTrackModel[14].setRotationPoint(-51F, 7F, -30F);
		leftTrackModel[14].rotateAngleZ = 2.356194F;

		leftTrackModel[15].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Import Kette16L
		leftTrackModel[15].setRotationPoint(-51F, 7F, -30F);
		leftTrackModel[15].rotateAngleZ = 1.38544838F;


		rightTrackModel = new ModelRendererTurbo[16];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Import Kette1R
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Kette2R
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Kette3R
		rightTrackModel[3] = new ModelRendererTurbo(this, 36, 490, textureX, textureY); // Import Kette4R
		rightTrackModel[4] = new ModelRendererTurbo(this, 61, 486, textureX, textureY); // Import Kette5R
		rightTrackModel[5] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Import Kette6R
		rightTrackModel[6] = new ModelRendererTurbo(this, 20, 480, textureX, textureY); // Import Kette7R
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 467, textureX, textureY); // Import Kette8R
		rightTrackModel[8] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Kette9R
		rightTrackModel[9] = new ModelRendererTurbo(this, 120, 492, textureX, textureY); // Import Kette10R
		rightTrackModel[10] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Import Kette11R
		rightTrackModel[11] = new ModelRendererTurbo(this, 140, 480, textureX, textureY); // Import Kette12R
		rightTrackModel[12] = new ModelRendererTurbo(this, 160, 488, textureX, textureY); // Import Kette13R
		rightTrackModel[13] = new ModelRendererTurbo(this, 172, 478, textureX, textureY); // Import Kette14R
		rightTrackModel[14] = new ModelRendererTurbo(this, 174, 501, textureX, textureY); // Import Kette15R
		rightTrackModel[15] = new ModelRendererTurbo(this, 192, 474, textureX, textureY); // Import Kette16R

		rightTrackModel[0].addBox(0F, 0F, 0F, 81, 1, 8, 0F); // Import Kette1R
		rightTrackModel[0].setRotationPoint(-35F, 9F, 22F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Import Kette2R
		rightTrackModel[1].setRotationPoint(58F, 5F, 22F);
		rightTrackModel[1].rotateAngleZ = -2.75762F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Import Kette3R
		rightTrackModel[2].setRotationPoint(58F, 5F, 22F);
		rightTrackModel[2].rotateAngleZ = 2.356194F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Kette4R
		rightTrackModel[3].setRotationPoint(63F, 0F, 22F);
		rightTrackModel[3].rotateAngleZ = -2.356194F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import Kette5R
		rightTrackModel[4].setRotationPoint(62F, -7F, 22F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Import Kette6R
		rightTrackModel[5].setRotationPoint(63F, -7F, 22F);
		rightTrackModel[5].rotateAngleZ = -2.356194F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Kette7R
		rightTrackModel[6].setRotationPoint(58F, -12F, 22F);
		rightTrackModel[6].rotateAngleZ = -0.78539816F;

		rightTrackModel[7].addBox(0F, 0F, 0F, 88, 1, 8, 0F); // Import Kette8R
		rightTrackModel[7].setRotationPoint(-30F, -12F, 22F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 1, 12, 8, 0F); // Import Kette9R
		rightTrackModel[8].setRotationPoint(-30F, -12F, 22F);
		rightTrackModel[8].rotateAngleZ = -1.38257482F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 10, 1, 8, 0F); // Import Kette10R
		rightTrackModel[9].setRotationPoint(-51F, -8F, 22F);
		rightTrackModel[9].rotateAngleZ = 0.1882215F;

		rightTrackModel[10].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Kette11R
		rightTrackModel[10].setRotationPoint(-51F, -8F, 22F);
		rightTrackModel[10].rotateAngleZ = -0.78539816F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Import Kette12R
		rightTrackModel[11].setRotationPoint(-55F, -4F, 22F);
		rightTrackModel[11].rotateAngleZ = 0.78539816F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import Kette13R
		rightTrackModel[12].setRotationPoint(-55F, -4F, 22F);

		rightTrackModel[13].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Kette14R
		rightTrackModel[13].setRotationPoint(-55F, 3F, 22F);
		rightTrackModel[13].rotateAngleZ = 0.78539816F;

		rightTrackModel[14].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Import Kette15R
		rightTrackModel[14].setRotationPoint(-51F, 7F, 22F);
		rightTrackModel[14].rotateAngleZ = 2.356194F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Import Kette16R
		rightTrackModel[15].setRotationPoint(-51F, 7F, 22F);
		rightTrackModel[15].rotateAngleZ = 1.38544838F;

		/*mg42Model = new ModelRendererTurbo[3][];

	    
	    mg42Model[0] = new ModelRendererTurbo[0];

	    
	    mg42Model[1] = new ModelRendererTurbo[20];
	    mg42Model[1][0] = new ModelRendererTurbo(this, 506, 0, this.textureX, this.textureY);
	    mg42Model[1][1] = new ModelRendererTurbo(this, 501, 0, this.textureX, this.textureY);
	    mg42Model[1][2] = new ModelRendererTurbo(this, 476, 0, this.textureX, this.textureY);
	    mg42Model[1][3] = new ModelRendererTurbo(this, 476, 3, this.textureX, this.textureY);
	    mg42Model[1][4] = new ModelRendererTurbo(this, 481, 3, this.textureX, this.textureY);
	    mg42Model[1][5] = new ModelRendererTurbo(this, 445, 0, this.textureX, this.textureY);
	    mg42Model[1][6] = new ModelRendererTurbo(this, 445, 3, this.textureX, this.textureY);
	    mg42Model[1][7] = new ModelRendererTurbo(this, 476, 6, this.textureX, this.textureY);
	    mg42Model[1][8] = new ModelRendererTurbo(this, 476, 9, this.textureX, this.textureY);
	    mg42Model[1][9] = new ModelRendererTurbo(this, 500, 16, this.textureX, this.textureY);
	    mg42Model[1][10] = new ModelRendererTurbo(this, 488, 3, this.textureX, this.textureY);
	    mg42Model[1][11] = new ModelRendererTurbo(this, 488, 3, this.textureX, this.textureY);
	    mg42Model[1][12] = new ModelRendererTurbo(this, 495, 3, this.textureX, this.textureY);
	    mg42Model[1][13] = new ModelRendererTurbo(this, 500, 3, this.textureX, this.textureY);
	    mg42Model[1][14] = new ModelRendererTurbo(this, 500, 6, this.textureX, this.textureY);
	    mg42Model[1][15] = new ModelRendererTurbo(this, 500, 9, this.textureX, this.textureY);
	    mg42Model[1][16] = new ModelRendererTurbo(this, 476, 12, this.textureX, this.textureY);
	    mg42Model[1][17] = new ModelRendererTurbo(this, 489, 12, this.textureX, this.textureY);
	    mg42Model[1][18] = new ModelRendererTurbo(this, 500, 12, this.textureX, this.textureY);
	    mg42Model[1][19] = new ModelRendererTurbo(this, 505, 12, this.textureX, this.textureY);
	    
	    mg42Model[1][0].addShapeBox(11.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F);
	    
	    mg42Model[1][1].addShapeBox(10.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.05F, -0.05F);
	    
	    mg42Model[1][2].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
	    
	    mg42Model[1][3].addShapeBox(8.0F, -1.92F, -0.5F, 1, 1, 1, 0.0F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F);
	    
	    mg42Model[1][4].addShapeBox(0.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, -0.2F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    mg42Model[1][5].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F);
	    
	    (mg42Model[1][6]).flip = true;
	    
	    mg42Model[1][6].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F);
	    
	    mg42Model[1][7].addBox(-9.0F, -1.0F, -0.5F, 8, 1, 1, 0.0F);
	    
	    mg42Model[1][8].addShapeBox(-9.0F, -2.0F, -0.5F, 8, 1, 1, 0.0F, -5.0F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -5.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
	    
	    mg42Model[1][9].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.25F);
	    
	    mg42Model[1][10].addShapeBox(-5.5F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    (mg42Model[1][11]).flip = true;
	    mg42Model[1][11].addShapeBox(-5.5F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    mg42Model[1][12].addShapeBox(-5.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 1.0F, -0.8F, -0.2F, -1.0F, -0.5F, -0.2F, -1.0F, -0.5F, -0.2F, 1.0F, -0.8F, -0.2F);
	    
	    mg42Model[1][13].addShapeBox(-12.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.25F);
	    
	    mg42Model[1][14].addShapeBox(-12.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F);
	    
	    mg42Model[1][15].addShapeBox(-12.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.3F, -0.9F, 0.0F, -0.3F, -0.9F, 0.0F, 0.0F, 0.0F, -0.25F);
	    
	    mg42Model[1][16].addBox(-3.4F, -0.2F, 0.0F, 2, 3, 4, 0.0F);
	    
	    mg42Model[1][17].addBox(-2.9F, -0.8F, 0.0F, 1, 0, 3, 0.0F);
	    (mg42Model[1][17]).rotateAngleX = -0.2094395F;
	    
	    mg42Model[1][18].addShapeBox(-4.2F, -1.0F, -1.2F, 1, 1, 1, 0.0F, -0.4F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
	    
	    mg42Model[1][19].addShapeBox(-4.0F, -1.5F, -1.3F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);

	    
	    for (ModelRendererTurbo gunPart : mg42Model[1])
	    {
	      gunPart.setRotationPoint(5.5F, -34.0F, 9.0F);
	    }

	    
	    mg42Model[2] = new ModelRendererTurbo[0];*/

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < bodyModel.length; i++)
		{
			bodyModel[i].render(f5);
		}
		for(int i = 0; i < turretModel.length; i++)
		{
			turretModel[i].render(f5);
		}
		for(int i = 0; i < barrelModel.length; i++)
		{
			barrelModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackModel.length; i++)
		{
			leftTrackModel[i].render(f5);
		}
		for(int i = 0; i < rightTrackModel.length; i++)
		{
			rightTrackModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackWheelModels.length; i++)
		{
			leftTrackWheelModels[i].render(f5);
		}
		for(int i = 0; i < rightTrackWheelModels.length; i++)
		{
			rightTrackWheelModels[i].render(f5);
		}
		/*for(int i = 0; i < mg42Model.length; i++)
		{
			for(int j = 0; j < mg42Model[0].length; j++)
			{
				mg42Model[i][j].render(f5);
			}
		}*/
	}
}