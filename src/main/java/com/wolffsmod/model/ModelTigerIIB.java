//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WW2_Vehicle_TigerII_1
// Model Creator: 
// Created on: 05.01.2016 - 10:15:28
// Last changed on: 05.01.2016 - 10:15:28

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelTigerIIB extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	//ModelRendererTurbo[][] MGFrontModel;

	public ModelTigerIIB() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[176];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Import Achse1
		bodyModel[1] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse2
		bodyModel[2] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse3
		bodyModel[3] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse4
		bodyModel[4] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse5
		bodyModel[5] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse6
		bodyModel[6] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse7
		bodyModel[7] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse8
		bodyModel[8] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse9
		bodyModel[9] = new ModelRendererTurbo(this, 85, 460, textureX, textureY); // Import Achse10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Import Achse11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder1L
		bodyModel[12] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder2L
		bodyModel[13] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder3L
		bodyModel[14] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder4L
		bodyModel[15] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder5L
		bodyModel[16] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder6L
		bodyModel[17] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder7L
		bodyModel[18] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder8L
		bodyModel[19] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Feder9L
		bodyModel[20] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder1R
		bodyModel[21] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder2R
		bodyModel[22] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder3R
		bodyModel[23] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder4R
		bodyModel[24] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder5R
		bodyModel[25] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder6R
		bodyModel[26] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder7R
		bodyModel[27] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder8R
		bodyModel[28] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Feder9R
		bodyModel[29] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad13L
		bodyModel[30] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad23L
		bodyModel[31] = new ModelRendererTurbo(this, 0, 483, textureX, textureY); // Import Rad24L
		bodyModel[32] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad33L
		bodyModel[33] = new ModelRendererTurbo(this, 0, 483, textureX, textureY); // Import Rad34L
		bodyModel[34] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad43L
		bodyModel[35] = new ModelRendererTurbo(this, 0, 483, textureX, textureY); // Import Rad44L
		bodyModel[36] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad53L
		bodyModel[37] = new ModelRendererTurbo(this, 0, 483, textureX, textureY); // Import Rad54L
		bodyModel[38] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad63L
		bodyModel[39] = new ModelRendererTurbo(this, 0, 483, textureX, textureY); // Import Rad64L
		bodyModel[40] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad73L
		bodyModel[41] = new ModelRendererTurbo(this, 0, 783, textureX, textureY); // Import Rad74L
		bodyModel[42] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad83L
		bodyModel[43] = new ModelRendererTurbo(this, 0, 483, textureX, textureY); // Import Rad84L
		bodyModel[44] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad93L
		bodyModel[45] = new ModelRendererTurbo(this, 0, 483, textureX, textureY); // Import Rad94L
		bodyModel[46] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad103L
		bodyModel[47] = new ModelRendererTurbo(this, 0, 483, textureX, textureY); // Import Rad104L
		bodyModel[48] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Rad113L
		bodyModel[49] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad13R
		bodyModel[50] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad23R
		bodyModel[51] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad24R
		bodyModel[52] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad33R
		bodyModel[53] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad34R
		bodyModel[54] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad43R
		bodyModel[55] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad44R
		bodyModel[56] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad53R
		bodyModel[57] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad54R
		bodyModel[58] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad63R
		bodyModel[59] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad64R
		bodyModel[60] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad73R
		bodyModel[61] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad74R
		bodyModel[62] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad83R
		bodyModel[63] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad84R
		bodyModel[64] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad93R
		bodyModel[65] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad94R
		bodyModel[66] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad103R
		bodyModel[67] = new ModelRendererTurbo(this, 25, 490, textureX, textureY); // Import Rad104R
		bodyModel[68] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Rad113R
		bodyModel[69] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Import Body1Tarp
		bodyModel[70] = new ModelRendererTurbo(this, 0, 315, textureX, textureY); // Import Body2Tarp
		bodyModel[71] = new ModelRendererTurbo(this, 0, 238, textureX, textureY); // Import Body3Tarp
		bodyModel[72] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import Kranz
		bodyModel[73] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Blech1L
		bodyModel[74] = new ModelRendererTurbo(this, 180, 80, textureX, textureY); // Import Blech2LTarp
		bodyModel[75] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Blech3L
		bodyModel[76] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // Import Blech1R
		bodyModel[77] = new ModelRendererTurbo(this, 180, 104, textureX, textureY); // Import Blech2RTarp
		bodyModel[78] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Import Blech3R
		bodyModel[79] = new ModelRendererTurbo(this, 0, 465, textureX, textureY); // Import RingV1
		bodyModel[80] = new ModelRendererTurbo(this, 0, 465, textureX, textureY); // Import RingV2
		bodyModel[81] = new ModelRendererTurbo(this, 85, 430, textureX, textureY); // Import MG1Trap
		bodyModel[82] = new ModelRendererTurbo(this, 85, 453, textureX, textureY); // Import MG2
		bodyModel[83] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Import Lampe1
		bodyModel[84] = new ModelRendererTurbo(this, 0, 444, textureX, textureY); // Import Lampe2
		bodyModel[85] = new ModelRendererTurbo(this, 82, 463, textureX, textureY); // Import Luke1
		bodyModel[86] = new ModelRendererTurbo(this, 82, 481, textureX, textureY); // Import Luke2
		bodyModel[87] = new ModelRendererTurbo(this, 44, 455, textureX, textureY); // Import Sicht1
		bodyModel[88] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Axt1
		bodyModel[89] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Axt2
		bodyModel[90] = new ModelRendererTurbo(this, 10, 425, textureX, textureY); // Import Axt3
		bodyModel[91] = new ModelRendererTurbo(this, 20, 425, textureX, textureY); // Import Axt4
		bodyModel[92] = new ModelRendererTurbo(this, 30, 420, textureX, textureY); // Import Schaufel1
		bodyModel[93] = new ModelRendererTurbo(this, 30, 425, textureX, textureY); // Import Schaufel2
		bodyModel[94] = new ModelRendererTurbo(this, 43, 425, textureX, textureY); // Import Schaufel3
		bodyModel[95] = new ModelRendererTurbo(this, 50, 425, textureX, textureY); // Import Schaufel4
		bodyModel[96] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Kabel1a
		bodyModel[97] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import Kabel1b
		bodyModel[98] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import Kabel1c
		bodyModel[99] = new ModelRendererTurbo(this, 5, 180, textureX, textureY); // Import Kabel1d
		bodyModel[100] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Import Kabel1e
		bodyModel[101] = new ModelRendererTurbo(this, 12, 175, textureX, textureY); // Import Kabel1f
		bodyModel[102] = new ModelRendererTurbo(this, 20, 175, textureX, textureY); // Import Kabel1g
		bodyModel[103] = new ModelRendererTurbo(this, 28, 175, textureX, textureY); // Import Kabel1h
		bodyModel[104] = new ModelRendererTurbo(this, 36, 175, textureX, textureY); // Import Kabel1i
		bodyModel[105] = new ModelRendererTurbo(this, 44, 175, textureX, textureY); // Import Kabel1j
		bodyModel[106] = new ModelRendererTurbo(this, 57, 180, textureX, textureY); // Import Kabel1k
		bodyModel[107] = new ModelRendererTurbo(this, 66, 180, textureX, textureY); // Import Kabel1l
		bodyModel[108] = new ModelRendererTurbo(this, 74, 180, textureX, textureY); // Import Kabel1m
		bodyModel[109] = new ModelRendererTurbo(this, 82, 180, textureX, textureY); // Import Kabel1n
		bodyModel[110] = new ModelRendererTurbo(this, 90, 180, textureX, textureY); // Import Kabel1o
		bodyModel[111] = new ModelRendererTurbo(this, 98, 180, textureX, textureY); // Import Kabel1q
		bodyModel[112] = new ModelRendererTurbo(this, 106, 180, textureX, textureY); // Import Kabel1p
		bodyModel[113] = new ModelRendererTurbo(this, 114, 180, textureX, textureY); // Import Kabel1r
		bodyModel[114] = new ModelRendererTurbo(this, 122, 180, textureX, textureY); // Import Kabel1s
		bodyModel[115] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Kabel2a
		bodyModel[116] = new ModelRendererTurbo(this, 10, 150, textureX, textureY); // Import Kabel2b
		bodyModel[117] = new ModelRendererTurbo(this, 0, 155, textureX, textureY); // Import Kabel2c
		bodyModel[118] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Import Kabel2d
		bodyModel[119] = new ModelRendererTurbo(this, 58, 155, textureX, textureY); // Import Kabel2e
		bodyModel[120] = new ModelRendererTurbo(this, 66, 155, textureX, textureY); // Import Kabel2f
		bodyModel[121] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Import Kabel2g
		bodyModel[122] = new ModelRendererTurbo(this, 82, 155, textureX, textureY); // Import Kabel2h
		bodyModel[123] = new ModelRendererTurbo(this, 90, 155, textureX, textureY); // Import Kabel2i
		bodyModel[124] = new ModelRendererTurbo(this, 5, 160, textureX, textureY); // Import Kabel2j
		bodyModel[125] = new ModelRendererTurbo(this, 60, 160, textureX, textureY); // Import Kabel2k
		bodyModel[126] = new ModelRendererTurbo(this, 70, 160, textureX, textureY); // Import Kabel2l
		bodyModel[127] = new ModelRendererTurbo(this, 78, 160, textureX, textureY); // Import Kabel2m
		bodyModel[128] = new ModelRendererTurbo(this, 86, 160, textureX, textureY); // Import Kabel2n
		bodyModel[129] = new ModelRendererTurbo(this, 94, 160, textureX, textureY); // Import Kabel2o
		bodyModel[130] = new ModelRendererTurbo(this, 102, 160, textureX, textureY); // Import Kabel2p
		bodyModel[131] = new ModelRendererTurbo(this, 110, 160, textureX, textureY); // Import Kabel2q
		bodyModel[132] = new ModelRendererTurbo(this, 118, 160, textureX, textureY); // Import Kabel2r
		bodyModel[133] = new ModelRendererTurbo(this, 126, 160, textureX, textureY); // Import Kabel2s
		bodyModel[134] = new ModelRendererTurbo(this, 0, 130, textureX, textureY); // Import Heck1
		bodyModel[135] = new ModelRendererTurbo(this, 22, 130, textureX, textureY); // Import Heck2
		bodyModel[136] = new ModelRendererTurbo(this, 44, 130, textureX, textureY); // Import Heck3
		bodyModel[137] = new ModelRendererTurbo(this, 66, 130, textureX, textureY); // Import Heck4
		bodyModel[138] = new ModelRendererTurbo(this, 90, 130, textureX, textureY); // Import Heck5
		bodyModel[139] = new ModelRendererTurbo(this, 110, 130, textureX, textureY); // Import Heck6Trap
		bodyModel[140] = new ModelRendererTurbo(this, 134, 130, textureX, textureY); // Import Heck7Tarp
		bodyModel[141] = new ModelRendererTurbo(this, 148, 130, textureX, textureY); // Import Heck8
		bodyModel[142] = new ModelRendererTurbo(this, 168, 130, textureX, textureY); // Import Heck9
		bodyModel[143] = new ModelRendererTurbo(this, 168, 135, textureX, textureY); // Import Heck10
		bodyModel[144] = new ModelRendererTurbo(this, 0, 142, textureX, textureY); // Import Heck11
		bodyModel[145] = new ModelRendererTurbo(this, 8, 142, textureX, textureY); // Import Heck12
		bodyModel[146] = new ModelRendererTurbo(this, 185, 130, textureX, textureY); // Import Heck13Trap
		bodyModel[147] = new ModelRendererTurbo(this, 185, 150, textureX, textureY); // Import Heck14Trap
		bodyModel[148] = new ModelRendererTurbo(this, 215, 130, textureX, textureY); // Import Heck15
		bodyModel[149] = new ModelRendererTurbo(this, 215, 150, textureX, textureY); // Import Heck16Trap
		bodyModel[150] = new ModelRendererTurbo(this, 230, 130, textureX, textureY); // Import Heck17
		bodyModel[151] = new ModelRendererTurbo(this, 230, 150, textureX, textureY); // Import Heck18
		bodyModel[152] = new ModelRendererTurbo(this, 215, 138, textureX, textureY); // Import Heck19
		bodyModel[153] = new ModelRendererTurbo(this, 215, 159, textureX, textureY); // Import Heck20
		bodyModel[154] = new ModelRendererTurbo(this, 240, 130, textureX, textureY); // Import Motor1
		bodyModel[155] = new ModelRendererTurbo(this, 220, 150, textureX, textureY); // Import Motor2
		bodyModel[156] = new ModelRendererTurbo(this, 328, 127, textureX, textureY); // Import Motor3
		bodyModel[157] = new ModelRendererTurbo(this, 325, 150, textureX, textureY); // Import Motor4
		bodyModel[158] = new ModelRendererTurbo(this, 26, 239, textureX, textureY); // Import Antenne1
		bodyModel[159] = new ModelRendererTurbo(this, 41, 240, textureX, textureY); // Import Antenne2Trap
		bodyModel[160] = new ModelRendererTurbo(this, 180, 48, textureX, textureY); // Import Blech4L
		bodyModel[161] = new ModelRendererTurbo(this, 180, 53, textureX, textureY); // Import Blech4R
		bodyModel[162] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Import 
		bodyModel[163] = new ModelRendererTurbo(this, 125, 200, textureX, textureY); // Import 
		bodyModel[164] = new ModelRendererTurbo(this, 155, 205, textureX, textureY); // Import 
		bodyModel[165] = new ModelRendererTurbo(this, 155, 215, textureX, textureY); // Import 
		bodyModel[166] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import 
		bodyModel[167] = new ModelRendererTurbo(this, 50, 25, textureX, textureY); // Import 
		bodyModel[168] = new ModelRendererTurbo(this, 85, 25, textureX, textureY); // Import 
		bodyModel[169] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import 
		bodyModel[170] = new ModelRendererTurbo(this, 50, 35, textureX, textureY); // Import 
		bodyModel[171] = new ModelRendererTurbo(this, 85, 35, textureX, textureY); // Import 
		bodyModel[172] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Import MG1
		bodyModel[173] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Import MG2
		bodyModel[174] = new ModelRendererTurbo(this, 425, 0, textureX, textureY); // Import Barrel
		
		bodyModel[175] = new ModelRendererTurbo(this, 425, 0, this.textureX, this.textureY);
	    
		bodyModel[175].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
		bodyModel[175].setRotationPoint(59.0F, -20.5F, -14.5F);


		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 76, 0F); // Import Achse1
		bodyModel[0].setRotationPoint(-58.5F, -4.5F, -38F);

		bodyModel[1].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse2
		bodyModel[1].setRotationPoint(-41.5F, -0.5F, -22F);
		bodyModel[1].rotateAngleZ = 0.4363323F;

		bodyModel[2].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse3
		bodyModel[2].setRotationPoint(-30.5F, -0.5F, -22F);
		bodyModel[2].rotateAngleZ = 0.4363323F;

		bodyModel[3].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse4
		bodyModel[3].setRotationPoint(-19.5F, -0.5F, -22F);
		bodyModel[3].rotateAngleZ = 0.4363323F;

		bodyModel[4].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse5
		bodyModel[4].setRotationPoint(-8.5F, -0.5F, -22F);
		bodyModel[4].rotateAngleZ = 0.4363323F;

		bodyModel[5].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse6
		bodyModel[5].setRotationPoint(2.5F, -0.5F, -22F);
		bodyModel[5].rotateAngleZ = 0.4363323F;

		bodyModel[6].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse7
		bodyModel[6].setRotationPoint(13.5F, -0.5F, -22F);
		bodyModel[6].rotateAngleZ = 0.4363323F;

		bodyModel[7].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse8
		bodyModel[7].setRotationPoint(24.5F, -0.5F, -22F);
		bodyModel[7].rotateAngleZ = 0.4363323F;

		bodyModel[8].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse9
		bodyModel[8].setRotationPoint(35.5F, -0.5F, -22F);
		bodyModel[8].rotateAngleZ = 0.4363323F;

		bodyModel[9].addBox(6F, 0F, 0F, 2, 2, 44, 0F); // Import Achse10
		bodyModel[9].setRotationPoint(46.5F, -0.5F, -22F);
		bodyModel[9].rotateAngleZ = 0.4363323F;

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 76, 0F); // Import Achse11
		bodyModel[10].setRotationPoint(59.5F, -7.5F, -38F);

		bodyModel[11].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder1L
		bodyModel[11].setRotationPoint(-41.5F, -0.5F, -24F);
		bodyModel[11].rotateAngleZ = 0.4363323F;

		bodyModel[12].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder2L
		bodyModel[12].setRotationPoint(-30.5F, -0.5F, -24F);
		bodyModel[12].rotateAngleZ = 0.4363323F;

		bodyModel[13].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder3L
		bodyModel[13].setRotationPoint(-19.5F, -0.5F, -24F);
		bodyModel[13].rotateAngleZ = 0.4363323F;

		bodyModel[14].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder4L
		bodyModel[14].setRotationPoint(-8.5F, -0.5F, -24F);
		bodyModel[14].rotateAngleZ = 0.4363323F;

		bodyModel[15].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder5L
		bodyModel[15].setRotationPoint(2.5F, -0.5F, -24F);
		bodyModel[15].rotateAngleZ = 0.4363323F;

		bodyModel[16].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder6L
		bodyModel[16].setRotationPoint(13.5F, -0.5F, -24F);
		bodyModel[16].rotateAngleZ = 0.4363323F;

		bodyModel[17].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder7L
		bodyModel[17].setRotationPoint(24.5F, -0.5F, -24F);
		bodyModel[17].rotateAngleZ = 0.4363323F;

		bodyModel[18].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder8L
		bodyModel[18].setRotationPoint(35.5F, -0.5F, -24F);
		bodyModel[18].rotateAngleZ = 0.4363323F;

		bodyModel[19].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder9L
		bodyModel[19].setRotationPoint(46.5F, -0.5F, -24F);
		bodyModel[19].rotateAngleZ = 0.4363323F;

		bodyModel[20].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder1R
		bodyModel[20].setRotationPoint(-41.5F, -0.5F, 22F);
		bodyModel[20].rotateAngleZ = 0.4363323F;

		bodyModel[21].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder2R
		bodyModel[21].setRotationPoint(-30.5F, -0.5F, 22F);
		bodyModel[21].rotateAngleZ = 0.4363323F;

		bodyModel[22].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder3R
		bodyModel[22].setRotationPoint(-19.5F, -0.5F, 22F);
		bodyModel[22].rotateAngleZ = 0.4363323F;

		bodyModel[23].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder4R
		bodyModel[23].setRotationPoint(-8.5F, -0.5F, 22F);
		bodyModel[23].rotateAngleZ = 0.4363323F;

		bodyModel[24].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder5R
		bodyModel[24].setRotationPoint(2.5F, -0.5F, 22F);
		bodyModel[24].rotateAngleZ = 0.4363323F;

		bodyModel[25].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder6R
		bodyModel[25].setRotationPoint(13.5F, -0.5F, 22F);
		bodyModel[25].rotateAngleZ = 0.4363323F;

		bodyModel[26].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder7R
		bodyModel[26].setRotationPoint(24.5F, -0.5F, 22F);
		bodyModel[26].rotateAngleZ = 0.4363323F;

		bodyModel[27].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder8R
		bodyModel[27].setRotationPoint(35.5F, -0.5F, 22F);
		bodyModel[27].rotateAngleZ = 0.4363323F;

		bodyModel[28].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Feder9R
		bodyModel[28].setRotationPoint(46.5F, -0.5F, 22F);
		bodyModel[28].rotateAngleZ = 0.4363323F;

		bodyModel[29].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad13L
		bodyModel[29].setRotationPoint(-59F, -5F, -38.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad23L
		bodyModel[30].setRotationPoint(-42F, -1F, -36.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad24L
		bodyModel[31].setRotationPoint(-41.5F, -0.5F, -36F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad33L
		bodyModel[32].setRotationPoint(-31F, -1F, -36.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad34L
		bodyModel[33].setRotationPoint(-30.5F, -0.5F, -36F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad43L
		bodyModel[34].setRotationPoint(-20F, -1F, -36.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad44L
		bodyModel[35].setRotationPoint(-19.5F, -0.5F, -36F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad53L
		bodyModel[36].setRotationPoint(-9F, -1F, -36.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad54L
		bodyModel[37].setRotationPoint(-8.5F, -0.5F, -36F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad63L
		bodyModel[38].setRotationPoint(2F, -1F, -36.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad64L
		bodyModel[39].setRotationPoint(2.5F, -0.5F, -36F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad73L
		bodyModel[40].setRotationPoint(13F, -1F, -36.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad74L
		bodyModel[41].setRotationPoint(13.5F, -0.5F, -36F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad83L
		bodyModel[42].setRotationPoint(24F, -1F, -36.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad84L
		bodyModel[43].setRotationPoint(24.5F, -0.5F, -36F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad93L
		bodyModel[44].setRotationPoint(35F, -1F, -36.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad94L
		bodyModel[45].setRotationPoint(35.5F, -0.5F, -36F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad103L
		bodyModel[46].setRotationPoint(46F, -1F, -36.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad104L
		bodyModel[47].setRotationPoint(46.5F, -0.5F, -36F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad113L
		bodyModel[48].setRotationPoint(59F, -8F, -38.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad13R
		bodyModel[49].setRotationPoint(-59F, -5F, 37.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad23R
		bodyModel[50].setRotationPoint(-42F, -1F, 35.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad24R
		bodyModel[51].setRotationPoint(-41.5F, -0.5F, 22F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad33R
		bodyModel[52].setRotationPoint(-31F, -1F, 35.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad34R
		bodyModel[53].setRotationPoint(-30.5F, -0.5F, 22F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad43R
		bodyModel[54].setRotationPoint(-20F, -1F, 35.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad44R
		bodyModel[55].setRotationPoint(-19.5F, -0.5F, 22F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad53R
		bodyModel[56].setRotationPoint(-9F, -1F, 35.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad54R
		bodyModel[57].setRotationPoint(-8.5F, -0.5F, 22F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad63R
		bodyModel[58].setRotationPoint(2F, -1F, 35.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad64R
		bodyModel[59].setRotationPoint(2.5F, -0.5F, 22F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad73R
		bodyModel[60].setRotationPoint(13F, -1F, 35.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad74R
		bodyModel[61].setRotationPoint(13.5F, -0.5F, 22F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad83R
		bodyModel[62].setRotationPoint(24F, -1F, 35.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad84R
		bodyModel[63].setRotationPoint(24.5F, -0.5F, 22F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad93R
		bodyModel[64].setRotationPoint(35F, -1F, 35.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad94R
		bodyModel[65].setRotationPoint(35.5F, -0.5F, 22F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad103R
		bodyModel[66].setRotationPoint(46F, -1F, 35.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Import Rad104R
		bodyModel[67].setRotationPoint(46.5F, -0.5F, 22F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Rad113R
		bodyModel[68].setRotationPoint(59F, -8F, 37.5F);

		bodyModel[69].addFlexBox(0F, 0F, 0F, 136, 10, 42, 0F, -4F, -10F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Import Body1Tarp
		bodyModel[69].setRotationPoint(-66F, -11F, -21F);

		bodyModel[70].addFlexBox(0F, 0F, 0F, 136, 7, 40, 0F, 4F, -11F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Import Body2Tarp
		bodyModel[70].setRotationPoint(-66F, -18F, -20F);

		bodyModel[71].addFlexBox(0F, 0F, 0F, 129, 10, 64, 0F, 6F, -13F, -6F, -6F, ModelRendererTurbo.MR_TOP); // Import Body3Tarp
		bodyModel[71].setRotationPoint(-70F, -28F, -32F);

		bodyModel[72].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(12, 0, 12, 0), new Coord2D(32, 0, 32, 0), new Coord2D(44, 12, 44, 12), new Coord2D(44, 32, 44, 32), new Coord2D(32, 44, 32, 44), new Coord2D(12, 44, 12, 44), new Coord2D(0, 32, 0, 32), new Coord2D(0, 12, 0, 12) }), 2, 44, 44, 148, 2, ModelRendererTurbo.MR_FRONT, new float[] {17 ,20 ,17 ,20 ,17 ,20 ,17 ,20}); // Import Kranz
		bodyModel[72].setRotationPoint(20F, -29F, 24F);
		bodyModel[72].rotateAngleX = 1.57079633F;

		bodyModel[73].addBox(0F, 0F, 0F, 10, 1, 19, 0F); // Import Blech1L
		bodyModel[73].setRotationPoint(57F, -18F, -40F);

		bodyModel[74].addFlexBox(0F, 0F, 0F, 129, 2, 20, 0F, 0F, -2.5F, -10F, 0F, ModelRendererTurbo.MR_TOP); // Import Blech2LTarp
		bodyModel[74].setRotationPoint(-70F, -18F, -41F);
		bodyModel[74].rotateAngleZ = 0.01658063F;

		bodyModel[75].addBox(0F, 0F, 0F, 1, 7, 18, 0F); // Import Blech3L
		bodyModel[75].setRotationPoint(-70F, -16F, -41F);
		bodyModel[75].rotateAngleZ = -0.6108652F;

		bodyModel[76].addBox(0F, 0F, 0F, 10, 1, 19, 0F); // Import Blech1R
		bodyModel[76].setRotationPoint(57F, -18F, 21F);

		bodyModel[77].addFlexBox(0F, 0F, 0F, 129, 2, 20, 0F, 0F, -2.5F, 0F, -10F, ModelRendererTurbo.MR_TOP); // Import Blech2RTarp
		bodyModel[77].setRotationPoint(-70F, -18F, 21F);
		bodyModel[77].rotateAngleZ = 0.01658063F;

		bodyModel[78].addBox(0F, 0F, 0F, 1, 7, 18, 0F); // Import Blech3R
		bodyModel[78].setRotationPoint(-70F, -16F, 23F);
		bodyModel[78].rotateAngleZ = -0.6108652F;

		bodyModel[79].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import RingV1
		bodyModel[79].setRotationPoint(70.5F, -12F, -21.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import RingV2
		bodyModel[80].setRotationPoint(70.5F, -12F, 19.5F);

		bodyModel[81].addFlexBox(0F, 0F, 0F, 11, 8, 12, 0F, -2.5F, 0F, -2.5F, -2.5F, ModelRendererTurbo.MR_LEFT); // Import MG1Trap
		bodyModel[81].setRotationPoint(48F, -25F, -19F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Import MG2
		bodyModel[82].setRotationPoint(55.5F, -21.5F, -15.5F);

		bodyModel[83].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT); // Import Lampe1
		bodyModel[83].setRotationPoint(51.5F, -27.5F, -1.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Import Lampe2
		bodyModel[84].setRotationPoint(48.5F, -25.5F, -0.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Import Luke1
		bodyModel[85].setRotationPoint(32F, -28.3F, -19F);

		bodyModel[86].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Import Luke2
		bodyModel[86].setRotationPoint(32F, -28.3F, 5F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Import Sicht1
		bodyModel[87].setRotationPoint(44F, -28.5F, 7F);

		bodyModel[88].addBox(-13F, 0F, -0.8F, 13, 1, 1, 0F); // Import Axt1
		bodyModel[88].setRotationPoint(41F, -24F, -28F);
		bodyModel[88].rotateAngleX = -0.541052F;

		bodyModel[89].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Axt2
		bodyModel[89].setRotationPoint(41F, -24F, -28F);
		bodyModel[89].rotateAngleX = -0.541052F;

		bodyModel[90].addBox(3.5F, -0.5F, -1.8F, 1, 4, 2, 0F); // Import Axt3
		bodyModel[90].setRotationPoint(40F, -24F, -28F);
		bodyModel[90].rotateAngleX = -0.541052F;

		bodyModel[91].addBox(-11F, -0.5F, -1.8F, 1, 2, 2, 0F); // Import Axt4
		bodyModel[91].setRotationPoint(40F, -24F, -28F);
		bodyModel[91].rotateAngleX = -0.541052F;

		bodyModel[92].addBox(-13F, 1F, -0.3F, 13, 1, 1, 0F); // Import Schaufel1
		bodyModel[92].setRotationPoint(40F, -24F, 28F);
		bodyModel[92].rotateAngleX = 0.541052F;

		bodyModel[93].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Import Schaufel2
		bodyModel[93].setRotationPoint(40F, -24F, 28F);
		bodyModel[93].rotateAngleX = 0.541052F;

		bodyModel[94].addBox(3.5F, -0.5F, -0.8F, 1, 4, 2, 0F); // Import Schaufel3
		bodyModel[94].setRotationPoint(40F, -24F, 28F);
		bodyModel[94].rotateAngleX = 0.541052F;

		bodyModel[95].addBox(-11F, 0.5F, -0.8F, 1, 2, 2, 0F); // Import Schaufel4
		bodyModel[95].setRotationPoint(40F, -24F, 28F);
		bodyModel[95].rotateAngleX = 0.541052F;

		bodyModel[96].addBox(80F, -0.5F, -1F, 3, 2, 1, 0F); // Import Kabel1a
		bodyModel[96].setRotationPoint(-63F, -20F, 31F);
		bodyModel[96].rotateAngleX = 0.541052F;
		bodyModel[96].rotateAngleZ = 0.01745329F;

		bodyModel[97].addBox(0F, 0F, -1F, 80, 1, 1, 0F); // Import Kabel1b
		bodyModel[97].setRotationPoint(-63F, -20F, 31F);
		bodyModel[97].rotateAngleX = 0.541052F;
		bodyModel[97].rotateAngleZ = 0.01745329F;

		bodyModel[98].addBox(-1F, -5.5F, -1F, 1, 6, 1, 0F); // Import Kabel1c
		bodyModel[98].setRotationPoint(-63F, -20F, 31F);
		bodyModel[98].rotateAngleX = 0.541052F;
		bodyModel[98].rotateAngleZ = 0.01745329F;

		bodyModel[99].addBox(0F, -6F, -1F, 24, 1, 1, 0F); // Import Kabel1d
		bodyModel[99].setRotationPoint(-63F, -20F, 31F);
		bodyModel[99].rotateAngleX = 0.541052F;
		bodyModel[99].rotateAngleZ = 0.01745329F;

		bodyModel[100].addBox(23.5F, -5.5F, -1F, 2, 1, 1, 0F); // Import Kabel1e
		bodyModel[100].setRotationPoint(-63F, -20F, 31F);
		bodyModel[100].rotateAngleX = 0.541052F;
		bodyModel[100].rotateAngleZ = 0.01745329F;

		bodyModel[101].addBox(25F, -5F, -1F, 2, 1, 1, 0F); // Import Kabel1f
		bodyModel[101].setRotationPoint(-63F, -20F, 31F);
		bodyModel[101].rotateAngleX = 0.541052F;
		bodyModel[101].rotateAngleZ = 0.01745329F;

		bodyModel[102].addBox(26.5F, -4.5F, -1F, 2, 1, 1, 0F); // Import Kabel1g
		bodyModel[102].setRotationPoint(-63F, -20F, 31F);
		bodyModel[102].rotateAngleX = 0.541052F;
		bodyModel[102].rotateAngleZ = 0.01745329F;

		bodyModel[103].addBox(28F, -4F, -1F, 2, 1, 1, 0F); // Import Kabel1h
		bodyModel[103].setRotationPoint(-63F, -20F, 31F);
		bodyModel[103].rotateAngleX = 0.541052F;
		bodyModel[103].rotateAngleZ = 0.01745329F;

		bodyModel[104].addBox(29.5F, -3.5F, -1F, 2, 1, 1, 0F); // Import Kabel1i
		bodyModel[104].setRotationPoint(-63F, -20F, 31F);
		bodyModel[104].rotateAngleX = 0.541052F;
		bodyModel[104].rotateAngleZ = 0.01745329F;

		bodyModel[105].addBox(31F, -3F, -1F, 25, 1, 1, 0F); // Import Kabel1j
		bodyModel[105].setRotationPoint(-63F, -20F, 31F);
		bodyModel[105].rotateAngleX = 0.541052F;
		bodyModel[105].rotateAngleZ = 0.01745329F;

		bodyModel[106].addBox(56F, -3.5F, -1F, 3, 2, 1, 0F); // Import Kabel1k
		bodyModel[106].setRotationPoint(-63F, -20F, 31F);
		bodyModel[106].rotateAngleX = 0.541052F;
		bodyModel[106].rotateAngleZ = 0.01745329F;

		bodyModel[107].addBox(80F, -0.5F, -1.7F, 1, 2, 2, 0F); // Import Kabel1l
		bodyModel[107].setRotationPoint(-66F, -20F, 31F);
		bodyModel[107].rotateAngleX = 0.541052F;
		bodyModel[107].rotateAngleZ = 0.01745329F;

		bodyModel[108].addBox(56F, -0.5F, -1.7F, 1, 2, 2, 0F); // Import Kabel1m
		bodyModel[108].setRotationPoint(-66F, -20F, 31F);
		bodyModel[108].rotateAngleX = 0.541052F;
		bodyModel[108].rotateAngleZ = 0.01745329F;

		bodyModel[109].addBox(35F, -0.5F, -1.7F, 1, 2, 2, 0F); // Import Kabel1n
		bodyModel[109].setRotationPoint(-66F, -20F, 31F);
		bodyModel[109].rotateAngleX = 0.541052F;
		bodyModel[109].rotateAngleZ = 0.01745329F;

		bodyModel[110].addBox(5F, -0.5F, -1.7F, 1, 2, 2, 0F); // Import Kabel1o
		bodyModel[110].setRotationPoint(-66F, -20F, 31F);
		bodyModel[110].rotateAngleX = 0.541052F;
		bodyModel[110].rotateAngleZ = 0.01745329F;

		bodyModel[111].addBox(25F, -6.5F, -1.7F, 1, 2, 2, 0F); // Import Kabel1q
		bodyModel[111].setRotationPoint(-66F, -20F, 31F);
		bodyModel[111].rotateAngleX = 0.541052F;
		bodyModel[111].rotateAngleZ = 0.01745329F;

		bodyModel[112].addBox(5F, -6.5F, -1.7F, 1, 2, 2, 0F); // Import Kabel1p
		bodyModel[112].setRotationPoint(-66F, -20F, 31F);
		bodyModel[112].rotateAngleX = 0.541052F;
		bodyModel[112].rotateAngleZ = 0.01745329F;

		bodyModel[113].addBox(35F, -3.5F, -1.7F, 1, 2, 2, 0F); // Import Kabel1r
		bodyModel[113].setRotationPoint(-66F, -20F, 31F);
		bodyModel[113].rotateAngleX = 0.541052F;
		bodyModel[113].rotateAngleZ = 0.01745329F;

		bodyModel[114].addBox(56F, -3.5F, -1.7F, 1, 2, 2, 0F); // Import Kabel1s
		bodyModel[114].setRotationPoint(-66F, -20F, 31F);
		bodyModel[114].rotateAngleX = 0.541052F;
		bodyModel[114].rotateAngleZ = 0.01745329F;

		bodyModel[115].addBox(80F, -0.5F, 0F, 3, 2, 1, 0F); // Import Kabel2a
		bodyModel[115].setRotationPoint(-63F, -20F, -31F);
		bodyModel[115].rotateAngleX = -0.541052F;
		bodyModel[115].rotateAngleZ = 0.01745329F;

		bodyModel[116].addBox(0F, 0F, 0F, 80, 1, 1, 0F); // Import Kabel2b
		bodyModel[116].setRotationPoint(-63F, -20F, -31F);
		bodyModel[116].rotateAngleX = -0.541052F;
		bodyModel[116].rotateAngleZ = 0.01745329F;

		bodyModel[117].addBox(-1F, -5.5F, 0F, 1, 6, 1, 0F); // Import Kabel2c
		bodyModel[117].setRotationPoint(-63F, -20F, -31F);
		bodyModel[117].rotateAngleX = -0.541052F;
		bodyModel[117].rotateAngleZ = 0.01745329F;

		bodyModel[118].addBox(0F, -6F, 0F, 24, 1, 1, 0F); // Import Kabel2d
		bodyModel[118].setRotationPoint(-63F, -20F, -31F);
		bodyModel[118].rotateAngleX = -0.541052F;
		bodyModel[118].rotateAngleZ = 0.01745329F;

		bodyModel[119].addBox(23.5F, -5.5F, 0F, 2, 1, 1, 0F); // Import Kabel2e
		bodyModel[119].setRotationPoint(-63F, -20F, -31F);
		bodyModel[119].rotateAngleX = -0.541052F;
		bodyModel[119].rotateAngleZ = 0.01745329F;

		bodyModel[120].addBox(25F, -5F, 0F, 2, 1, 1, 0F); // Import Kabel2f
		bodyModel[120].setRotationPoint(-63F, -20F, -31F);
		bodyModel[120].rotateAngleX = -0.541052F;
		bodyModel[120].rotateAngleZ = 0.01745329F;

		bodyModel[121].addBox(26.5F, -4.5F, 0F, 2, 1, 1, 0F); // Import Kabel2g
		bodyModel[121].setRotationPoint(-63F, -20F, -31F);
		bodyModel[121].rotateAngleX = -0.541052F;
		bodyModel[121].rotateAngleZ = 0.01745329F;

		bodyModel[122].addBox(28F, -4F, 0F, 2, 1, 1, 0F); // Import Kabel2h
		bodyModel[122].setRotationPoint(-63F, -20F, -31F);
		bodyModel[122].rotateAngleX = -0.541052F;
		bodyModel[122].rotateAngleZ = 0.01745329F;

		bodyModel[123].addBox(29.5F, -3.5F, 0F, 2, 1, 1, 0F); // Import Kabel2i
		bodyModel[123].setRotationPoint(-63F, -20F, -31F);
		bodyModel[123].rotateAngleX = -0.541052F;
		bodyModel[123].rotateAngleZ = 0.01745329F;

		bodyModel[124].addBox(31F, -3F, 0F, 25, 1, 1, 0F); // Import Kabel2j
		bodyModel[124].setRotationPoint(-63F, -20F, -31F);
		bodyModel[124].rotateAngleX = -0.541052F;
		bodyModel[124].rotateAngleZ = 0.01745329F;

		bodyModel[125].addBox(56F, -3.5F, 0F, 3, 2, 1, 0F); // Import Kabel2k
		bodyModel[125].setRotationPoint(-63F, -20F, -31F);
		bodyModel[125].rotateAngleX = -0.541052F;
		bodyModel[125].rotateAngleZ = 0.01745329F;

		bodyModel[126].addBox(80F, -0.5F, -0.7F, 1, 2, 2, 0F); // Import Kabel2l
		bodyModel[126].setRotationPoint(-66F, -20F, -31F);
		bodyModel[126].rotateAngleX = -0.541052F;
		bodyModel[126].rotateAngleZ = 0.01745329F;

		bodyModel[127].addBox(56F, -0.5F, -0.7F, 1, 2, 2, 0F); // Import Kabel2m
		bodyModel[127].setRotationPoint(-66F, -20F, -31F);
		bodyModel[127].rotateAngleX = -0.541052F;
		bodyModel[127].rotateAngleZ = 0.01745329F;

		bodyModel[128].addBox(35F, -0.5F, -0.7F, 1, 2, 2, 0F); // Import Kabel2n
		bodyModel[128].setRotationPoint(-66F, -20F, -31F);
		bodyModel[128].rotateAngleX = -0.541052F;
		bodyModel[128].rotateAngleZ = 0.01745329F;

		bodyModel[129].addBox(5F, -0.5F, -0.7F, 1, 2, 2, 0F); // Import Kabel2o
		bodyModel[129].setRotationPoint(-66F, -20F, -31F);
		bodyModel[129].rotateAngleX = -0.541052F;
		bodyModel[129].rotateAngleZ = 0.01745329F;

		bodyModel[130].addBox(5F, -6.5F, -0.7F, 1, 2, 2, 0F); // Import Kabel2p
		bodyModel[130].setRotationPoint(-66F, -20F, -31F);
		bodyModel[130].rotateAngleX = -0.541052F;
		bodyModel[130].rotateAngleZ = 0.01745329F;

		bodyModel[131].addBox(25F, -6.5F, -0.7F, 1, 2, 2, 0F); // Import Kabel2q
		bodyModel[131].setRotationPoint(-66F, -20F, -31F);
		bodyModel[131].rotateAngleX = -0.541052F;
		bodyModel[131].rotateAngleZ = 0.01745329F;

		bodyModel[132].addBox(35F, -3.5F, -0.7F, 1, 2, 2, 0F); // Import Kabel2r
		bodyModel[132].setRotationPoint(-66F, -20F, -31F);
		bodyModel[132].rotateAngleX = -0.541052F;
		bodyModel[132].rotateAngleZ = 0.01745329F;

		bodyModel[133].addBox(56F, -3.5F, -0.7F, 1, 2, 2, 0F); // Import Kabel2s
		bodyModel[133].setRotationPoint(-66F, -20F, -31F);
		bodyModel[133].rotateAngleX = -0.541052F;
		bodyModel[133].rotateAngleZ = 0.01745329F;

		bodyModel[134].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Import Heck1
		bodyModel[134].setRotationPoint(-75F, -24F, 18F);
		bodyModel[134].rotateAngleZ = 0.5235988F;

		bodyModel[135].addBox(0F, 3.5F, 0F, 3, 3, 7, 0F); // Import Heck2
		bodyModel[135].setRotationPoint(-75F, -24F, 18F);
		bodyModel[135].rotateAngleZ = 0.5235988F;

		bodyModel[136].addBox(0F, 0F, 0F, 4, 7, 6, 0F); // Import Heck3
		bodyModel[136].setRotationPoint(-76F, -24F, -23F);
		bodyModel[136].rotateAngleZ = 0.5235988F;

		bodyModel[137].addBox(-0.5F, 2F, -0.5F, 4, 1, 7, 0F); // Import Heck4
		bodyModel[137].setRotationPoint(-76F, -24F, -23F);
		bodyModel[137].rotateAngleZ = 0.5235988F;

		bodyModel[138].addTrapezoid(0F, -5F, 0F, 3, 6, 6, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck5
		bodyModel[138].setRotationPoint(-63F, -2F, 12F);
		bodyModel[138].rotateAngleZ = 0.5235988F;

		bodyModel[139].addTrapezoid(0F, -5F, 0F, 1, 8, 10, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck6Trap
		bodyModel[139].setRotationPoint(-63F, -4F, -5F);
		bodyModel[139].rotateAngleZ = 0.5235988F;

		bodyModel[140].addTrapezoid(0F, -5F, 0F, 2, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck7Tarp
		bodyModel[140].setRotationPoint(-63F, -2F, -2F);
		bodyModel[140].rotateAngleZ = 0.5235988F;

		bodyModel[141].addTrapezoid(0F, -5F, 0F, 3, 6, 6, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck8
		bodyModel[141].setRotationPoint(-63F, -2F, -18F);
		bodyModel[141].rotateAngleZ = 0.5235988F;

		bodyModel[142].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Import Heck9
		bodyModel[142].setRotationPoint(-65F, -5F, 19F);

		bodyModel[143].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Import Heck10
		bodyModel[143].setRotationPoint(-65F, -5F, -20F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import Heck11
		bodyModel[144].setRotationPoint(-64.5F, -4F, 18.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import Heck12
		bodyModel[145].setRotationPoint(-64.5F, -4F, -20.5F);

		bodyModel[146].addFlexBox(0F, 0F, 0F, 4, 9, 9, 0F, 0F, -1.5F, -1.5F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck13Trap
		bodyModel[146].setRotationPoint(-69F, -10F, 3F);
		bodyModel[146].rotateAngleZ = 0.5235988F;

		bodyModel[147].addFlexBox(0F, 0F, 0F, 4, 9, 9, 0F, 0F, -1.5F, -1.5F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck14Trap
		bodyModel[147].setRotationPoint(-69F, -10F, -12F);
		bodyModel[147].rotateAngleZ = 0.5235988F;

		bodyModel[148].addTrapezoid(0F, 0F, 0F, 3, 4, 3, 0F, -0.5F, ModelRendererTurbo.MR_TOP); // Import Heck15
		bodyModel[148].setRotationPoint(-70F, -13F, 6F);
		bodyModel[148].rotateAngleZ = 0.5235988F;

		bodyModel[149].addTrapezoid(0F, 0F, 0F, 3, 4, 3, 0F, -0.5F, ModelRendererTurbo.MR_TOP); // Import Heck16Trap
		bodyModel[149].setRotationPoint(-70F, -13F, -9F);
		bodyModel[149].rotateAngleZ = 0.5235988F;

		bodyModel[150].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Import Heck17
		bodyModel[150].setRotationPoint(-76.5F, -26F, 6.5F);
		bodyModel[150].rotateAngleZ = 0.5235988F;

		bodyModel[151].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Import Heck18
		bodyModel[151].setRotationPoint(-76.5F, -26F, -8.5F);
		bodyModel[151].rotateAngleZ = 0.5235988F;

		bodyModel[152].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Import Heck19
		bodyModel[152].setRotationPoint(-74.5F, -27F, 6.5F);
		bodyModel[152].rotateAngleZ = -1.832596F;

		bodyModel[153].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Import Heck20
		bodyModel[153].setRotationPoint(-74.5F, -27F, -8.5F);
		bodyModel[153].rotateAngleZ = -1.832596F;

		bodyModel[154].addBox(0F, 0F, 0F, 37, 1, 12, 0F); // Import Motor1
		bodyModel[154].setRotationPoint(-73F, -28.3F, 11.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 40, 1, 22, 0F); // Import Motor2
		bodyModel[155].setRotationPoint(-75F, -28.3F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 37, 1, 12, 0F); // Import Motor3
		bodyModel[156].setRotationPoint(-73F, -28.3F, -23.5F);

		bodyModel[157].addTrapezoid(0F, 0F, 0F, 2, 2, 6, 0F, -0.2F, ModelRendererTurbo.MR_TOP); // Import Motor4
		bodyModel[157].setRotationPoint(-65F, -30F, -18.5F);

		bodyModel[158].addTrapezoid(0F, 0F, 0F, 3, 4, 3, 0F, -0.5F, ModelRendererTurbo.MR_TOP); // Import Antenne1
		bodyModel[158].setRotationPoint(-65.5F, -31F, -22.5F);

		bodyModel[159].addTrapezoid(0F, 0F, 0F, 1, 48, 1, 0F, -0.4F, ModelRendererTurbo.MR_TOP); // Import Antenne2Trap
		bodyModel[159].setRotationPoint(-64.5F, -79F, -21.5F);

		bodyModel[160].addBox(0F, 2F, 0F, 129, 1, 1, 0F); // Import Blech4L
		bodyModel[160].setRotationPoint(-70F, -18F, -41F);
		bodyModel[160].rotateAngleZ = 0.01658063F;

		bodyModel[161].addBox(0F, 2F, 19F, 129, 1, 1, 0F); // Import Blech4R
		bodyModel[161].setRotationPoint(-70F, -18F, 21F);
		bodyModel[161].rotateAngleZ = 0.01658063F;

		bodyModel[162].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(7, 6, 7, 6), new Coord2D(7, 7, 7, 7) }), 19, 7, 7, 21, 19, ModelRendererTurbo.MR_FRONT, new float[] {10 ,1 ,9 ,1}); // Import 
		bodyModel[162].setRotationPoint(74F, -11F, 40F);

		bodyModel[163].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(7, 6, 7, 6), new Coord2D(7, 7, 7, 7) }), 19, 7, 7, 21, 19, ModelRendererTurbo.MR_FRONT, new float[] {10 ,1 ,9 ,1}); // Import 
		bodyModel[163].setRotationPoint(74F, -11F, -21F);

		bodyModel[164].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(140, 0, 140, 0), new Coord2D(144, 7, 144, 7), new Coord2D(7, 7, 7, 7) }), 1, 144, 7, 296, 1, ModelRendererTurbo.MR_FRONT, new float[] {10 ,137 ,9 ,140}); // Import 
		bodyModel[164].setRotationPoint(74F, -11F, -20F);

		bodyModel[165].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(140, 0, 140, 0), new Coord2D(144, 7, 144, 7), new Coord2D(7, 7, 7, 7) }), 1, 144, 7, 296, 1, ModelRendererTurbo.MR_FRONT, new float[] {10 ,137 ,9 ,140}); // Import 
		bodyModel[165].setRotationPoint(74F, -11F, 21F);

		bodyModel[166].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(20, 0, 20, 0), new Coord2D(20, 4, 20, 4), new Coord2D(4, 4, 4, 4), new Coord2D(0, 0, 0, 0) }), 1, 20, 4, 46, 1, ModelRendererTurbo.MR_FRONT, new float[] {20 ,6 ,16 ,4}); // Import 
		bodyModel[166].setRotationPoint(71F, -14F, 41F);

		bodyModel[167].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(10, 0, 10, 0), new Coord2D(10, 7, 10, 7), new Coord2D(0, 8, 0, 8) }), 1, 10, 8, 33, 1, ModelRendererTurbo.MR_FRONT, new float[] {4 ,11 ,7 ,11}); // Import 
		bodyModel[167].setRotationPoint(51F, -10F, 41F);

		bodyModel[168].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(111, 0, 111, 0), new Coord2D(111, 6, 111, 6), new Coord2D(0, 7, 0, 7) }), 1, 111, 7, 236, 1, ModelRendererTurbo.MR_FRONT, new float[] {7 ,112 ,6 ,111}); // Import 
		bodyModel[168].setRotationPoint(41F, -10F, 41F);

		bodyModel[169].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(20, 0, 20, 0), new Coord2D(20, 4, 20, 4), new Coord2D(4, 4, 4, 4), new Coord2D(0, 0, 0, 0) }), 1, 20, 4, 46, 1, ModelRendererTurbo.MR_FRONT, new float[] {20 ,6 ,16 ,4}); // Import 
		bodyModel[169].setRotationPoint(71F, -14F, -40F);

		bodyModel[170].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(10, 0, 10, 0), new Coord2D(10, 7, 10, 7), new Coord2D(0, 8, 0, 8) }), 1, 10, 8, 33, 1, ModelRendererTurbo.MR_FRONT, new float[] {4 ,11 ,7 ,11}); // Import 
		bodyModel[170].setRotationPoint(51F, -10F, -40F);

		bodyModel[171].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(111, 0, 111, 0), new Coord2D(111, 6, 111, 6), new Coord2D(0, 7, 0, 7) }), 1, 111, 7, 236, 1, ModelRendererTurbo.MR_FRONT, new float[] {7 ,112 ,6 ,111}); // Import 
		bodyModel[171].setRotationPoint(41F, -10F, -40F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import MG1
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import MG2
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addBox(-2F, -0.5F, -0.5F, 7, 1, 1, 0F); // Import Barrel
		bodyModel[174].setRotationPoint(0F, 0F, 0F);


		turretModel = new ModelRendererTurbo[7];
		turretModel[0] = new ModelRendererTurbo(this, 349, 233, textureX, textureY); // Import Turm1Trap
		turretModel[1] = new ModelRendererTurbo(this, 326, 335, textureX, textureY); // Import Turm2Tarp
		turretModel[2] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Import Turm3
		turretModel[3] = new ModelRendererTurbo(this, 60, 90, textureX, textureY); // Import Turm4
		turretModel[4] = new ModelRendererTurbo(this, 85, 90, textureX, textureY); // Import Turm5
		turretModel[5] = new ModelRendererTurbo(this, 125, 90, textureX, textureY); // Import Turm6
		turretModel[6] = new ModelRendererTurbo(this, 340, 180, textureX, textureY); // Import Turm7

		turretModel[0].addFlexTrapezoid(0F, -45F, -25F, 31, 16, 50, 0F, 0F, -6F, -9F, -9F, -9F, -9F, ModelRendererTurbo.MR_TOP); // Import Turm1Trap
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addFlexTrapezoid(0F, -45F, -25F, 42, 16, 50, 0F, 0F, -10F, -9F, -9F, -9F, -9F, ModelRendererTurbo.MR_TOP); // Import Turm2Tarp
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleY = 3.14159265F;

		turretModel[2].addShape3D(18F, -18F, 0F, new Shape2D(new Coord2D[] { new Coord2D(7, 0, 7, 0), new Coord2D(11, 0, 11, 0), new Coord2D(14, 1, 14, 1), new Coord2D(17, 4, 17, 4), new Coord2D(18, 7, 18, 7), new Coord2D(18, 11, 18, 11), new Coord2D(17, 14, 17, 14), new Coord2D(14, 17, 14, 17), new Coord2D(11, 18, 11, 18), new Coord2D(7, 18, 7, 18), new Coord2D(4, 17, 4, 17), new Coord2D(1, 14, 1, 14), new Coord2D(0, 11, 0, 11), new Coord2D(0, 7, 0, 7), new Coord2D(1, 4, 1, 4), new Coord2D(4, 1, 4, 1) }), 17, 18, 18, 68, 17, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,4 ,4 ,4 ,5 ,4 ,4 ,4 ,5 ,4 ,4 ,4 ,5 ,4 ,4}); // Import Turm3
		turretModel[2].setRotationPoint(-9F, -45.5F, -2F);
		turretModel[2].rotateAngleX = 1.57079633F;

		turretModel[3].addBox(12F, -46.5F, -11F, 4, 7, 7, 0F); // Import Turm4
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addBox(-1F, -45.5F, -14F, 8, 10, 11, 0F); // Import Turm5
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addBox(0F, 0F, 0F, 14, 2, 11, 0F); // Import Turm6
		turretModel[5].setRotationPoint(-41.5F, -30F, -5.5F);
		turretModel[5].rotateAngleZ = 1.029744F;

		turretModel[6].addShape3D(17F, -17F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Turm7
		turretModel[6].setRotationPoint(-9F, -45.5F, -2F);
		turretModel[6].rotateAngleX = 1.57079633F;


		barrelModel = new ModelRendererTurbo[16];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Import Rohr1
		barrelModel[1] = new ModelRendererTurbo(this, 63, 60, textureX, textureY); // Import Rohr2Trap
		barrelModel[2] = new ModelRendererTurbo(this, 115, 60, textureX, textureY); // Import Rohr3Trap
		barrelModel[3] = new ModelRendererTurbo(this, 135, 60, textureX, textureY); // Import Rohr4
		barrelModel[4] = new ModelRendererTurbo(this, 180, 60, textureX, textureY); // Import Rohr5Trap
		barrelModel[5] = new ModelRendererTurbo(this, 195, 60, textureX, textureY); // Import Rohr6Trap
		barrelModel[6] = new ModelRendererTurbo(this, 305, 60, textureX, textureY); // Import Rohr7Trap
		barrelModel[7] = new ModelRendererTurbo(this, 320, 60, textureX, textureY); // Import Rohr8Trap
		barrelModel[8] = new ModelRendererTurbo(this, 345, 60, textureX, textureY); // Import Rohr9Tarp
		barrelModel[9] = new ModelRendererTurbo(this, 365, 60, textureX, textureY); // Import Rohr10
		barrelModel[10] = new ModelRendererTurbo(this, 385, 60, textureX, textureY); // Import Rohr11
		barrelModel[11] = new ModelRendererTurbo(this, 305, 60, textureX, textureY); // Import Rohr7Trap
		barrelModel[12] = new ModelRendererTurbo(this, 320, 60, textureX, textureY); // Import Rohr8Trap
		barrelModel[13] = new ModelRendererTurbo(this, 345, 60, textureX, textureY); // Import Rohr9Tarp
		barrelModel[14] = new ModelRendererTurbo(this, 365, 60, textureX, textureY); // Import Rohr10
		barrelModel[15] = new ModelRendererTurbo(this, 385, 60, textureX, textureY); // Import Rohr11

		barrelModel[0].addBox(-15F, -5.5F, -7.5F, 15, 11, 15, 0F); // Import Rohr1
		barrelModel[0].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[1].addFlexBox(0F, -5.5F, -7.5F, 10, 11, 15, 0F, -2F, -2F, -4F, -4F, ModelRendererTurbo.MR_LEFT); // Import Rohr2Trap
		barrelModel[1].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[2].addTrapezoid(10F, -3.5F, -3.5F, 2, 7, 7, 0F, -1F, ModelRendererTurbo.MR_LEFT); // Import Rohr3Trap
		barrelModel[2].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[3].addBox(12F, -2.5F, -2.5F, 17, 5, 5, 0F); // Import Rohr4
		barrelModel[3].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[4].addTrapezoid(29F, -2.5F, -2.5F, 1, 5, 5, 0F, -1F, ModelRendererTurbo.MR_LEFT); // Import Rohr5Trap
		barrelModel[4].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[5].addTrapezoid(30F, -1.5F, -1.5F, 51, 3, 3, 0F, -0.2F, ModelRendererTurbo.MR_LEFT); // Import Rohr6Trap
		barrelModel[5].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[6].addTrapezoid(81F, -2F, -2F, 3, 4, 4, 0F, -0.7F, ModelRendererTurbo.MR_RIGHT); // Import Rohr7Trap
		barrelModel[6].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[7].addTrapezoid(84F, -3.5F, -3.5F, 4, 7, 7, 0F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Rohr8Trap
		barrelModel[7].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[8].addTrapezoid(88F, -3.5F, -3.5F, 1, 7, 7, 0F, -1F, ModelRendererTurbo.MR_LEFT); // Import Rohr9Tarp
		barrelModel[8].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[9].addBox(89F, -2F, -2F, 4, 4, 4, 0F); // Import Rohr10
		barrelModel[9].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[10].addTrapezoid(93F, -2F, -2F, 1, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr11
		barrelModel[10].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[11].addTrapezoid(81F, -2F, -2F, 3, 4, 4, 0F, -0.7F, ModelRendererTurbo.MR_RIGHT); // Import Rohr7Trap
		barrelModel[11].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[12].addTrapezoid(84F, -3.5F, -3.5F, 4, 7, 7, 0F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Rohr8Trap
		barrelModel[12].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[13].addTrapezoid(88F, -3.5F, -3.5F, 1, 7, 7, 0F, -1F, ModelRendererTurbo.MR_LEFT); // Import Rohr9Tarp
		barrelModel[13].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[14].addBox(89F, -2F, -2F, 4, 4, 4, 0F); // Import Rohr10
		barrelModel[14].setRotationPoint(31F, -35.5F, 0F);

		barrelModel[15].addTrapezoid(93F, -2F, -2F, 1, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr11
		barrelModel[15].setRotationPoint(31F, -35.5F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[22];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Import Rad11L
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Import Rad12L
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad21L
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad22L
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad31L
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad32L
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad41L
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad42L
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad51L
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad52L
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad61L
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad62L
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad71L
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad72L
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad81L
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad82L
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad91L
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad92L
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad101L
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad102L
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 200, 180, textureX, textureY); // Import Rad111L
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 200, 180, textureX, textureY); // Import Rad112L

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad11L
		leftTrackWheelModels[0].setRotationPoint(-57.5F, -3.5F, -36F);

		leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad12L
		leftTrackWheelModels[1].setRotationPoint(-57.5F, -3.5F, -24F);

		leftTrackWheelModels[2].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad21L
		leftTrackWheelModels[2].setRotationPoint(-40.5F, 0.5F, -34F);

		leftTrackWheelModels[3].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad22L
		leftTrackWheelModels[3].setRotationPoint(-40.5F, 0.5F, -31F);

		leftTrackWheelModels[4].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad31L
		leftTrackWheelModels[4].setRotationPoint(-29.5F, 0.5F, -28F);

		leftTrackWheelModels[5].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad32L
		leftTrackWheelModels[5].setRotationPoint(-29.5F, 0.5F, -25F);

		leftTrackWheelModels[6].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad41L
		leftTrackWheelModels[6].setRotationPoint(-18.5F, 0.5F, -34F);

		leftTrackWheelModels[7].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad42L
		leftTrackWheelModels[7].setRotationPoint(-18.5F, 0.5F, -31F);

		leftTrackWheelModels[8].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad51L
		leftTrackWheelModels[8].setRotationPoint(-7.5F, 0.5F, -28F);

		leftTrackWheelModels[9].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad52L
		leftTrackWheelModels[9].setRotationPoint(-7.5F, 0.5F, -25F);

		leftTrackWheelModels[10].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad61L
		leftTrackWheelModels[10].setRotationPoint(3.5F, 0.5F, -34F);

		leftTrackWheelModels[11].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad62L
		leftTrackWheelModels[11].setRotationPoint(3.5F, 0.5F, -31F);

		leftTrackWheelModels[12].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad71L
		leftTrackWheelModels[12].setRotationPoint(14.5F, 0.5F, -28F);

		leftTrackWheelModels[13].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad72L
		leftTrackWheelModels[13].setRotationPoint(14.5F, 0.5F, -25F);

		leftTrackWheelModels[14].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad81L
		leftTrackWheelModels[14].setRotationPoint(25.5F, 0.5F, -34F);

		leftTrackWheelModels[15].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad82L
		leftTrackWheelModels[15].setRotationPoint(25.5F, 0.5F, -31F);

		leftTrackWheelModels[16].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad91L
		leftTrackWheelModels[16].setRotationPoint(36.5F, 0.5F, -28F);

		leftTrackWheelModels[17].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad92L
		leftTrackWheelModels[17].setRotationPoint(36.5F, 0.5F, -25F);

		leftTrackWheelModels[18].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad101L
		leftTrackWheelModels[18].setRotationPoint(47.5F, 0.5F, -34F);

		leftTrackWheelModels[19].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad102L
		leftTrackWheelModels[19].setRotationPoint(47.5F, 0.5F, -31F);

		leftTrackWheelModels[20].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad111L
		leftTrackWheelModels[20].setRotationPoint(60.5F, -6.5F, -36F);

		leftTrackWheelModels[21].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad112L
		leftTrackWheelModels[21].setRotationPoint(60.5F, -6.5F, -24F);


		rightTrackWheelModels = new ModelRendererTurbo[22];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Import Rad11R
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Import Rad12R
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad21R
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad22R
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad31R
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad32R
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad41R
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad42R
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad51R
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad52R
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad61R
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad62R
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad71R
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad72R
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad81R
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad82R
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad91R
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad92R
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad101R
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 270, 180, textureX, textureY); // Import Rad102R
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 200, 180, textureX, textureY); // Import Rad111R
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 200, 180, textureX, textureY); // Import Rad112R

		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad11R
		rightTrackWheelModels[0].setRotationPoint(-57.5F, -3.5F, 38F);

		rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad12R
		rightTrackWheelModels[1].setRotationPoint(-57.5F, -3.5F, 26F);

		rightTrackWheelModels[2].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad21R
		rightTrackWheelModels[2].setRotationPoint(-40.5F, 0.5F, 36F);

		rightTrackWheelModels[3].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad22R
		rightTrackWheelModels[3].setRotationPoint(-40.5F, 0.5F, 33F);

		rightTrackWheelModels[4].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad31R
		rightTrackWheelModels[4].setRotationPoint(-29.5F, 0.5F, 30F);

		rightTrackWheelModels[5].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad32R
		rightTrackWheelModels[5].setRotationPoint(-29.5F, 0.5F, 27F);

		rightTrackWheelModels[6].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad41R
		rightTrackWheelModels[6].setRotationPoint(-18.5F, 0.5F, 36F);

		rightTrackWheelModels[7].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad42R
		rightTrackWheelModels[7].setRotationPoint(-18.5F, 0.5F, 33F);

		rightTrackWheelModels[8].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad51R
		rightTrackWheelModels[8].setRotationPoint(-7.5F, 0.5F, 30F);

		rightTrackWheelModels[9].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad52R
		rightTrackWheelModels[9].setRotationPoint(-7.5F, 0.5F, 27F);

		rightTrackWheelModels[10].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad61R
		rightTrackWheelModels[10].setRotationPoint(3.5F, 0.5F, 36F);

		rightTrackWheelModels[11].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad62R
		rightTrackWheelModels[11].setRotationPoint(3.5F, 0.5F, 33F);

		rightTrackWheelModels[12].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad71R
		rightTrackWheelModels[12].setRotationPoint(14.5F, 0.5F, 30F);

		rightTrackWheelModels[13].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad72R
		rightTrackWheelModels[13].setRotationPoint(14.5F, 0.5F, 27F);

		rightTrackWheelModels[14].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad81R
		rightTrackWheelModels[14].setRotationPoint(25.5F, 0.5F, 36F);

		rightTrackWheelModels[15].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad82R
		rightTrackWheelModels[15].setRotationPoint(25.5F, 0.5F, 33F);

		rightTrackWheelModels[16].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad91R
		rightTrackWheelModels[16].setRotationPoint(36.5F, 0.5F, 30F);

		rightTrackWheelModels[17].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad92R
		rightTrackWheelModels[17].setRotationPoint(36.5F, 0.5F, 27F);

		rightTrackWheelModels[18].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad101R
		rightTrackWheelModels[18].setRotationPoint(47.5F, 0.5F, 36F);

		rightTrackWheelModels[19].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad102R
		rightTrackWheelModels[19].setRotationPoint(47.5F, 0.5F, 33F);

		rightTrackWheelModels[20].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad111R
		rightTrackWheelModels[20].setRotationPoint(60.5F, -6.5F, 38F);

		rightTrackWheelModels[21].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad112R
		rightTrackWheelModels[21].setRotationPoint(60.5F, -6.5F, 26F);


		leftTrackModel = new ModelRendererTurbo[21];
		leftTrackModel[0] = new ModelRendererTurbo(this, 165, 494, textureX, textureY); // Import Kette1L
		leftTrackModel[1] = new ModelRendererTurbo(this, 165, 465, textureX, textureY); // Import Kette2L
		leftTrackModel[2] = new ModelRendererTurbo(this, 207, 473, textureX, textureY); // Import Kette3L
		leftTrackModel[3] = new ModelRendererTurbo(this, 257, 469, textureX, textureY); // Import Kette4L
		leftTrackModel[4] = new ModelRendererTurbo(this, 305, 473, textureX, textureY); // Import Kette5L
		leftTrackModel[5] = new ModelRendererTurbo(this, 353, 467, textureX, textureY); // Import Kette6L
		leftTrackModel[6] = new ModelRendererTurbo(this, 237, 462, textureX, textureY); // Import Kette7L
		leftTrackModel[7] = new ModelRendererTurbo(this, 278, 465, textureX, textureY); // Import Kette8L
		leftTrackModel[8] = new ModelRendererTurbo(this, 187, 453, textureX, textureY); // Import Kette9L
		leftTrackModel[9] = new ModelRendererTurbo(this, 221, 439, textureX, textureY); // Import Kette10L
		leftTrackModel[10] = new ModelRendererTurbo(this, 264, 438, textureX, textureY); // Import Kette11L
		leftTrackModel[11] = new ModelRendererTurbo(this, 306, 446, textureX, textureY); // Import Kette12L
		leftTrackModel[12] = new ModelRendererTurbo(this, 160, 418, textureX, textureY); // Import Kette13L
		leftTrackModel[13] = new ModelRendererTurbo(this, 375, 490, textureX, textureY); // Import Kette14L
		leftTrackModel[14] = new ModelRendererTurbo(this, 417, 493, textureX, textureY); // Import Kette15L
		leftTrackModel[15] = new ModelRendererTurbo(this, 450, 485, textureX, textureY); // Import Kette16L
		leftTrackModel[16] = new ModelRendererTurbo(this, 470, 490, textureX, textureY); // Import Kette17L
		leftTrackModel[17] = new ModelRendererTurbo(this, 375, 456, textureX, textureY); // Import Kette18L
		leftTrackModel[18] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Kette19L
		leftTrackModel[19] = new ModelRendererTurbo(this, 424, 457, textureX, textureY); // Import Kette20L
		leftTrackModel[20] = new ModelRendererTurbo(this, 468, 450, textureX, textureY); // Import Kette21L

		leftTrackModel[0].addBox(0F, 0F, 0F, 95, 1, 17, 0F); // Import Kette1L
		leftTrackModel[0].setRotationPoint(-44F, 9F, -39F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 1, 9, 17, 0F); // Import Kette2L
		leftTrackModel[1].setRotationPoint(51F, 10F, -39F);
		leftTrackModel[1].rotateAngleZ = 2.076942F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 6, 1, 17, 0F); // Import Kette3L
		leftTrackModel[2].setRotationPoint(64F, 3F, -39F);
		leftTrackModel[2].rotateAngleZ = -2.661627F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Import Kette4L
		leftTrackModel[3].setRotationPoint(64F, 3F, -39F);
		leftTrackModel[3].rotateAngleZ = 2.356194F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Import Kette5L
		leftTrackModel[4].setRotationPoint(70F, -3F, -39F);
		leftTrackModel[4].rotateAngleZ = -2.356194F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 7, 17, 0F); // Import Kette6L
		leftTrackModel[5].setRotationPoint(69F, -10F, -39F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Import Kette7L
		leftTrackModel[6].setRotationPoint(70F, -10F, -39F);
		leftTrackModel[6].rotateAngleZ = -2.356194F;

		leftTrackModel[7].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Import Kette8L
		leftTrackModel[7].setRotationPoint(64F, -16F, -39F);
		leftTrackModel[7].rotateAngleZ = -0.78539816F;

		leftTrackModel[8].addBox(0F, 0F, 0F, 7, 1, 17, 0F); // Import Kette9L
		leftTrackModel[8].setRotationPoint(57F, -16F, -39F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 1, 4, 17, 0F); // Import Kette10L
		leftTrackModel[9].setRotationPoint(57F, -16F, -39F);
		leftTrackModel[9].rotateAngleZ = -0.9948377F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 1, 8, 17, 0F); // Import Kette11L
		leftTrackModel[10].setRotationPoint(54F, -14F, -39F);
		leftTrackModel[10].rotateAngleZ = -1.239184F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 1, 8, 17, 0F); // Import Kette12L
		leftTrackModel[11].setRotationPoint(40F, -8F, -39F);
		leftTrackModel[11].rotateAngleZ = 1.919862F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 84, 1, 17, 0F); // Import Kette13L
		leftTrackModel[12].setRotationPoint(-44F, -9F, -39F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 11, 1, 17, 0F); // Import Kette14L
		leftTrackModel[13].setRotationPoint(-54F, -11F, -39F);
		leftTrackModel[13].rotateAngleZ = -0.1919862F;

		leftTrackModel[14].addBox(0F, 0F, 0F, 7, 1, 17, 0F); // Import Kette15L
		leftTrackModel[14].setRotationPoint(-61F, -11F, -39F);

		leftTrackModel[15].addBox(0F, 0F, 0F, 1, 3, 17, 0F); // Import Kette16L
		leftTrackModel[15].setRotationPoint(-61F, -11F, -39F);
		leftTrackModel[15].rotateAngleZ = -0.78539816F;

		leftTrackModel[16].addBox(0F, 0F, 0F, 3, 1, 17, 0F); // Import Kette17L
		leftTrackModel[16].setRotationPoint(-65F, -7F, -39F);
		leftTrackModel[16].rotateAngleZ = 0.78539816F;

		leftTrackModel[17].addBox(0F, 0F, 0F, 1, 7, 17, 0F); // Import Kette18L
		leftTrackModel[17].setRotationPoint(-65F, -7F, -39F);

		leftTrackModel[18].addBox(0F, 0F, 0F, 1, 3, 17, 0F); // Import Kette19L
		leftTrackModel[18].setRotationPoint(-65F, 0F, -39F);
		leftTrackModel[18].rotateAngleZ = 0.78539816F;

		leftTrackModel[19].addBox(0F, 0F, 0F, 3, 1, 17, 0F); // Import Kette20L
		leftTrackModel[19].setRotationPoint(-61F, 4F, -39F);
		leftTrackModel[19].rotateAngleZ = 2.356194F;

		leftTrackModel[20].addBox(0F, 0F, 0F, 1, 18, 17, 0F); // Import Kette21L
		leftTrackModel[20].setRotationPoint(-61F, 4F, -39F);
		leftTrackModel[20].rotateAngleZ = 1.239184F;


		rightTrackModel = new ModelRendererTurbo[21];
		rightTrackModel[0] = new ModelRendererTurbo(this, 165, 494, textureX, textureY); // Import Kette1R
		rightTrackModel[1] = new ModelRendererTurbo(this, 165, 465, textureX, textureY); // Import Kette2R
		rightTrackModel[2] = new ModelRendererTurbo(this, 207, 473, textureX, textureY); // Import Kette3R
		rightTrackModel[3] = new ModelRendererTurbo(this, 257, 469, textureX, textureY); // Import Kette4R
		rightTrackModel[4] = new ModelRendererTurbo(this, 305, 473, textureX, textureY); // Import Kette5R
		rightTrackModel[5] = new ModelRendererTurbo(this, 353, 467, textureX, textureY); // Import Kette6R
		rightTrackModel[6] = new ModelRendererTurbo(this, 237, 462, textureX, textureY); // Import Kette7R
		rightTrackModel[7] = new ModelRendererTurbo(this, 278, 465, textureX, textureY); // Import Kette8R
		rightTrackModel[8] = new ModelRendererTurbo(this, 187, 453, textureX, textureY); // Import Kette9R
		rightTrackModel[9] = new ModelRendererTurbo(this, 221, 439, textureX, textureY); // Import Kette10R
		rightTrackModel[10] = new ModelRendererTurbo(this, 264, 438, textureX, textureY); // Import Kette11R
		rightTrackModel[11] = new ModelRendererTurbo(this, 306, 446, textureX, textureY); // Import Kette12R
		rightTrackModel[12] = new ModelRendererTurbo(this, 160, 418, textureX, textureY); // Import Kette13R
		rightTrackModel[13] = new ModelRendererTurbo(this, 375, 490, textureX, textureY); // Import Kette14R
		rightTrackModel[14] = new ModelRendererTurbo(this, 417, 493, textureX, textureY); // Import Kette15R
		rightTrackModel[15] = new ModelRendererTurbo(this, 450, 485, textureX, textureY); // Import Kette16R
		rightTrackModel[16] = new ModelRendererTurbo(this, 470, 490, textureX, textureY); // Import Kette17R
		rightTrackModel[17] = new ModelRendererTurbo(this, 375, 456, textureX, textureY); // Import Kette18R
		rightTrackModel[18] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Kette19R
		rightTrackModel[19] = new ModelRendererTurbo(this, 424, 457, textureX, textureY); // Import Kette20R
		rightTrackModel[20] = new ModelRendererTurbo(this, 468, 450, textureX, textureY); // Import Kette21R

		rightTrackModel[0].addBox(0F, 0F, 0F, 95, 1, 17, 0F); // Import Kette1R
		rightTrackModel[0].setRotationPoint(-44F, 9F, 22F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 1, 9, 17, 0F); // Import Kette2R
		rightTrackModel[1].setRotationPoint(51F, 10F, 22F);
		rightTrackModel[1].rotateAngleZ = 2.076942F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 6, 1, 17, 0F); // Import Kette3R
		rightTrackModel[2].setRotationPoint(64F, 3F, 22F);
		rightTrackModel[2].rotateAngleZ = -2.661627F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Import Kette4R
		rightTrackModel[3].setRotationPoint(64F, 3F, 22F);
		rightTrackModel[3].rotateAngleZ = 2.356194F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Import Kette5R
		rightTrackModel[4].setRotationPoint(70F, -3F, 22F);
		rightTrackModel[4].rotateAngleZ = -2.356194F;

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 7, 17, 0F); // Import Kette6R
		rightTrackModel[5].setRotationPoint(69F, -10F, 22F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Import Kette7R
		rightTrackModel[6].setRotationPoint(70F, -10F, 22F);
		rightTrackModel[6].rotateAngleZ = -2.356194F;

		rightTrackModel[7].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Import Kette8R
		rightTrackModel[7].setRotationPoint(64F, -16F, 22F);
		rightTrackModel[7].rotateAngleZ = -0.78539816F;

		rightTrackModel[8].addBox(0F, 0F, 0F, 7, 1, 17, 0F); // Import Kette9R
		rightTrackModel[8].setRotationPoint(57F, -16F, 22F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 4, 17, 0F); // Import Kette10R
		rightTrackModel[9].setRotationPoint(57F, -16F, 22F);
		rightTrackModel[9].rotateAngleZ = -0.9948377F;

		rightTrackModel[10].addBox(0F, 0F, 0F, 1, 8, 17, 0F); // Import Kette11R
		rightTrackModel[10].setRotationPoint(54F, -14F, 22F);
		rightTrackModel[10].rotateAngleZ = -1.239184F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 1, 8, 17, 0F); // Import Kette12R
		rightTrackModel[11].setRotationPoint(40F, -8F, 22F);
		rightTrackModel[11].rotateAngleZ = 1.919862F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 84, 1, 17, 0F); // Import Kette13R
		rightTrackModel[12].setRotationPoint(-44F, -9F, 22F);

		rightTrackModel[13].addBox(0F, 0F, 0F, 11, 1, 17, 0F); // Import Kette14R
		rightTrackModel[13].setRotationPoint(-54F, -11F, 22F);
		rightTrackModel[13].rotateAngleZ = -0.1919862F;

		rightTrackModel[14].addBox(0F, 0F, 0F, 7, 1, 17, 0F); // Import Kette15R
		rightTrackModel[14].setRotationPoint(-61F, -11F, 22F);

		rightTrackModel[15].addBox(0F, 0F, 0F, 1, 3, 17, 0F); // Import Kette16R
		rightTrackModel[15].setRotationPoint(-61F, -11F, 22F);
		rightTrackModel[15].rotateAngleZ = -0.78539816F;

		rightTrackModel[16].addBox(0F, 0F, 0F, 3, 1, 17, 0F); // Import Kette17R
		rightTrackModel[16].setRotationPoint(-65F, -7F, 22F);
		rightTrackModel[16].rotateAngleZ = 0.78539816F;

		rightTrackModel[17].addBox(0F, 0F, 0F, 1, 7, 17, 0F); // Import Kette18R
		rightTrackModel[17].setRotationPoint(-65F, -7F, 22F);

		rightTrackModel[18].addBox(0F, 0F, 0F, 1, 3, 17, 0F); // Import Kette19R
		rightTrackModel[18].setRotationPoint(-65F, 0F, 22F);
		rightTrackModel[18].rotateAngleZ = 0.78539816F;

		rightTrackModel[19].addBox(0F, 0F, 0F, 3, 1, 17, 0F); // Import Kette20R
		rightTrackModel[19].setRotationPoint(-61F, 4F, 22F);
		rightTrackModel[19].rotateAngleZ = 2.356194F;

		rightTrackModel[20].addBox(0F, 0F, 0F, 1, 18, 17, 0F); // Import Kette21R
		rightTrackModel[20].setRotationPoint(-61F, 4F, 22F);
		rightTrackModel[20].rotateAngleZ = 1.239184F;
		

	    /*MGFrontModel = new ModelRendererTurbo[3][];

	    
	    MGFrontModel[0] = new ModelRendererTurbo[0];

	    
	    MGFrontModel[1] = new ModelRendererTurbo[1];
	    MGFrontModel[1][0] = new ModelRendererTurbo(this, 425, 0, this.textureX, this.textureY);
	    
	    MGFrontModel[1][0].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);

	    
	    for (ModelRendererTurbo gunPart : MGFrontModel[1])
	    {
	      gunPart.setRotationPoint(59.0F, -20.5F, -14.5F);
	    }

	    
	    MGFrontModel[2] = new ModelRendererTurbo[0];*/



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
		/*for(int i = 0; i < MGFrontModel.length; i++)
		{
			for(int j = 0; j < MGFrontModel[0].length; j++)
			{
				MGFrontModel[i][j].render(f5);
			}
		}*/
	}
}