//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WW2_Vehicle_Jagdpanther_1
// Model Creator: 
// Created on: 05.01.2016 - 09:50:38
// Last changed on: 05.01.2016 - 09:50:38

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelJagdpanther extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	ModelRendererTurbo[][] mg42Model;

	public ModelJagdpanther() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[158];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import AchseV
		bodyModel[1] = new ModelRendererTurbo(this, 70, 385, textureX, textureY); // Import AchseH
		bodyModel[2] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Import Rad23L
		bodyModel[3] = new ModelRendererTurbo(this, 23, 428, textureX, textureY); // Import Rad33L
		bodyModel[4] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Import Rad43L
		bodyModel[5] = new ModelRendererTurbo(this, 23, 428, textureX, textureY); // Import Rad53L
		bodyModel[6] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Import Rad63L
		bodyModel[7] = new ModelRendererTurbo(this, 23, 428, textureX, textureY); // Import Rad73L
		bodyModel[8] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Import Rad83L
		bodyModel[9] = new ModelRendererTurbo(this, 23, 428, textureX, textureY); // Import Rad93L
		bodyModel[10] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Import Rad23R
		bodyModel[11] = new ModelRendererTurbo(this, 23, 428, textureX, textureY); // Import Rad33R
		bodyModel[12] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Import Rad43R
		bodyModel[13] = new ModelRendererTurbo(this, 23, 428, textureX, textureY); // Import Rad53R
		bodyModel[14] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Import Rad63R
		bodyModel[15] = new ModelRendererTurbo(this, 23, 428, textureX, textureY); // Import Rad73R
		bodyModel[16] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Import Rad83R
		bodyModel[17] = new ModelRendererTurbo(this, 23, 428, textureX, textureY); // Import Rad93R
		bodyModel[18] = new ModelRendererTurbo(this, 135, 396, textureX, textureY); // Import Body1
		bodyModel[19] = new ModelRendererTurbo(this, 0, 338, textureX, textureY); // Import Body2
		bodyModel[20] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import Body3
		bodyModel[21] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import MG1
		bodyModel[22] = new ModelRendererTurbo(this, 31, 385, textureX, textureY); // Import MG2
		bodyModel[23] = new ModelRendererTurbo(this, 31, 392, textureX, textureY); // Import MG3
		bodyModel[24] = new ModelRendererTurbo(this, 0, 405, textureX, textureY); // Import Sicht
		bodyModel[25] = new ModelRendererTurbo(this, 0, 422, textureX, textureY); // Import Lampe1
		bodyModel[26] = new ModelRendererTurbo(this, 10, 422, textureX, textureY); // Import Lampe2
		bodyModel[27] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import SchleppV1
		bodyModel[28] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import Schleppv2
		bodyModel[29] = new ModelRendererTurbo(this, 300, 495, textureX, textureY); // Import Motor1
		bodyModel[30] = new ModelRendererTurbo(this, 300, 474, textureX, textureY); // Import Motor2
		bodyModel[31] = new ModelRendererTurbo(this, 300, 456, textureX, textureY); // Import Motor3
		bodyModel[32] = new ModelRendererTurbo(this, 300, 445, textureX, textureY); // Import Motor4
		bodyModel[33] = new ModelRendererTurbo(this, 335, 445, textureX, textureY); // Import Motor5
		bodyModel[34] = new ModelRendererTurbo(this, 355, 445, textureX, textureY); // Import Motor6
		bodyModel[35] = new ModelRendererTurbo(this, 373, 445, textureX, textureY); // Import Motor7
		bodyModel[36] = new ModelRendererTurbo(this, 396, 445, textureX, textureY); // Import Motor8
		bodyModel[37] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Import BlechL
		bodyModel[38] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // Import BlechR
		bodyModel[39] = new ModelRendererTurbo(this, 290, 265, textureX, textureY); // Import Heck1
		bodyModel[40] = new ModelRendererTurbo(this, 290, 295, textureX, textureY); // Import Heck2
		bodyModel[41] = new ModelRendererTurbo(this, 320, 265, textureX, textureY); // Import Heck3
		bodyModel[42] = new ModelRendererTurbo(this, 320, 295, textureX, textureY); // Import Heck4
		bodyModel[43] = new ModelRendererTurbo(this, 290, 265, textureX, textureY); // Import Heck5
		bodyModel[44] = new ModelRendererTurbo(this, 290, 295, textureX, textureY); // Import Heck6
		bodyModel[45] = new ModelRendererTurbo(this, 340, 280, textureX, textureY); // Import Heck7
		bodyModel[46] = new ModelRendererTurbo(this, 340, 310, textureX, textureY); // Import Heck8
		bodyModel[47] = new ModelRendererTurbo(this, 290, 248, textureX, textureY); // Import Heck9
		bodyModel[48] = new ModelRendererTurbo(this, 350, 265, textureX, textureY); // Import Seite1L
		bodyModel[49] = new ModelRendererTurbo(this, 358, 265, textureX, textureY); // Import Seite2L
		bodyModel[50] = new ModelRendererTurbo(this, 358, 269, textureX, textureY); // Import Seite3L
		bodyModel[51] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Import Seite4L
		bodyModel[52] = new ModelRendererTurbo(this, 405, 265, textureX, textureY); // Import Seite5L
		bodyModel[53] = new ModelRendererTurbo(this, 413, 265, textureX, textureY); // Import Seite6L
		bodyModel[54] = new ModelRendererTurbo(this, 420, 265, textureX, textureY); // Import Seite7L
		bodyModel[55] = new ModelRendererTurbo(this, 350, 275, textureX, textureY); // Import Seite8L
		bodyModel[56] = new ModelRendererTurbo(this, 358, 275, textureX, textureY); // Import Seite9L
		bodyModel[57] = new ModelRendererTurbo(this, 366, 275, textureX, textureY); // Import Seite10L
		bodyModel[58] = new ModelRendererTurbo(this, 374, 275, textureX, textureY); // Import Seite11L
		bodyModel[59] = new ModelRendererTurbo(this, 382, 275, textureX, textureY); // Import Seite12L
		bodyModel[60] = new ModelRendererTurbo(this, 390, 275, textureX, textureY); // Import Seite13L
		bodyModel[61] = new ModelRendererTurbo(this, 350, 285, textureX, textureY); // Import Seite1R
		bodyModel[62] = new ModelRendererTurbo(this, 358, 285, textureX, textureY); // Import Seite2R
		bodyModel[63] = new ModelRendererTurbo(this, 358, 289, textureX, textureY); // Import Seite3R
		bodyModel[64] = new ModelRendererTurbo(this, 393, 285, textureX, textureY); // Import Seite4R
		bodyModel[65] = new ModelRendererTurbo(this, 405, 285, textureX, textureY); // Import Seite5R
		bodyModel[66] = new ModelRendererTurbo(this, 413, 285, textureX, textureY); // Import Seite6R
		bodyModel[67] = new ModelRendererTurbo(this, 420, 285, textureX, textureY); // Import Seite7R
		bodyModel[68] = new ModelRendererTurbo(this, 428, 285, textureX, textureY); // Import Seite8R
		bodyModel[69] = new ModelRendererTurbo(this, 350, 295, textureX, textureY); // Import Seite9R
		bodyModel[70] = new ModelRendererTurbo(this, 362, 295, textureX, textureY); // Import Seite10R
		bodyModel[71] = new ModelRendererTurbo(this, 375, 295, textureX, textureY); // Import Seite11R
		bodyModel[72] = new ModelRendererTurbo(this, 375, 299, textureX, textureY); // Import Seite12R
		bodyModel[73] = new ModelRendererTurbo(this, 383, 299, textureX, textureY); // Import Seite13R
		bodyModel[74] = new ModelRendererTurbo(this, 391, 299, textureX, textureY); // Import Seite14R
		bodyModel[75] = new ModelRendererTurbo(this, 399, 299, textureX, textureY); // Import Seite15R
		bodyModel[76] = new ModelRendererTurbo(this, 407, 299, textureX, textureY); // Import Seite16R
		bodyModel[77] = new ModelRendererTurbo(this, 415, 299, textureX, textureY); // Import Seite17R
		bodyModel[78] = new ModelRendererTurbo(this, 425, 299, textureX, textureY); // Import SchleppH1
		bodyModel[79] = new ModelRendererTurbo(this, 435, 299, textureX, textureY); // Import SchleppH2
		bodyModel[80] = new ModelRendererTurbo(this, 350, 305, textureX, textureY); // Import Halt1L
		bodyModel[81] = new ModelRendererTurbo(this, 350, 305, textureX, textureY); // Import Halt2L
		bodyModel[82] = new ModelRendererTurbo(this, 350, 305, textureX, textureY); // Import Halt3L
		bodyModel[83] = new ModelRendererTurbo(this, 350, 305, textureX, textureY); // Import Halt4L
		bodyModel[84] = new ModelRendererTurbo(this, 350, 305, textureX, textureY); // Import Halt5L
		bodyModel[85] = new ModelRendererTurbo(this, 350, 305, textureX, textureY); // Import Halt6L
		bodyModel[86] = new ModelRendererTurbo(this, 390, 305, textureX, textureY); // Import Halt1R
		bodyModel[87] = new ModelRendererTurbo(this, 390, 305, textureX, textureY); // Import Halt2R
		bodyModel[88] = new ModelRendererTurbo(this, 390, 305, textureX, textureY); // Import Halt3R
		bodyModel[89] = new ModelRendererTurbo(this, 390, 305, textureX, textureY); // Import Halt4R
		bodyModel[90] = new ModelRendererTurbo(this, 390, 305, textureX, textureY); // Import Halt5R
		bodyModel[91] = new ModelRendererTurbo(this, 390, 305, textureX, textureY); // Import Halt6R
		bodyModel[92] = new ModelRendererTurbo(this, 0, 75, textureX, textureY); // Import 
		bodyModel[93] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Import 
		bodyModel[94] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Import 
		bodyModel[95] = new ModelRendererTurbo(this, 0, 33, textureX, textureY); // Import 
		bodyModel[96] = new ModelRendererTurbo(this, 130, 90, textureX, textureY); // Import 
		bodyModel[97] = new ModelRendererTurbo(this, 150, 90, textureX, textureY); // Import 
		bodyModel[98] = new ModelRendererTurbo(this, 275, 30, textureX, textureY); // Import 
		bodyModel[99] = new ModelRendererTurbo(this, 275, 55, textureX, textureY); // Import 
		bodyModel[100] = new ModelRendererTurbo(this, 277, 146, textureX, textureY); // Import SPL
		bodyModel[101] = new ModelRendererTurbo(this, 277, 134, textureX, textureY); // Import SPL
		bodyModel[102] = new ModelRendererTurbo(this, 310, 160, textureX, textureY); // Import Turm1
		bodyModel[103] = new ModelRendererTurbo(this, 310, 200, textureX, textureY); // Import Turm2
		bodyModel[104] = new ModelRendererTurbo(this, 285, 338, textureX, textureY); // Import Turm3
		bodyModel[105] = new ModelRendererTurbo(this, 0, 175, textureX, textureY); // Import Sicht
		bodyModel[106] = new ModelRendererTurbo(this, 10, 175, textureX, textureY); // Import Rahmen1
		bodyModel[107] = new ModelRendererTurbo(this, 37, 173, textureX, textureY); // Import Rahmen2
		bodyModel[108] = new ModelRendererTurbo(this, 57, 175, textureX, textureY); // Import Rahmen3
		bodyModel[109] = new ModelRendererTurbo(this, 87, 175, textureX, textureY); // Import Rahmen4
		bodyModel[110] = new ModelRendererTurbo(this, 88, 183, textureX, textureY); // Import Rahmen5
		bodyModel[111] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import KS1
		bodyModel[112] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import KS2
		bodyModel[113] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import KS3
		bodyModel[114] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import KS4
		bodyModel[115] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import Luke1
		bodyModel[116] = new ModelRendererTurbo(this, 60, 200, textureX, textureY); // Import Luke2
		bodyModel[117] = new ModelRendererTurbo(this, 470, 0, textureX, textureY); // Import Mount
		bodyModel[118] = new ModelRendererTurbo(this, 506, 0, textureX, textureY); // Import Barrel1
		bodyModel[119] = new ModelRendererTurbo(this, 501, 0, textureX, textureY); // Import Barrel2
		bodyModel[120] = new ModelRendererTurbo(this, 476, 0, textureX, textureY); // Import Barrel3
		bodyModel[121] = new ModelRendererTurbo(this, 476, 3, textureX, textureY); // Import Barrel4
		bodyModel[122] = new ModelRendererTurbo(this, 481, 3, textureX, textureY); // Import Barrel5
		bodyModel[123] = new ModelRendererTurbo(this, 445, 0, textureX, textureY); // Import Barrel6
		bodyModel[124] = new ModelRendererTurbo(this, 445, 3, textureX, textureY); // Import Barrel7
		bodyModel[125] = new ModelRendererTurbo(this, 476, 6, textureX, textureY); // Import Body1
		bodyModel[126] = new ModelRendererTurbo(this, 476, 9, textureX, textureY); // Import Body2
		bodyModel[127] = new ModelRendererTurbo(this, 500, 16, textureX, textureY); // Import Body3
		bodyModel[128] = new ModelRendererTurbo(this, 488, 3, textureX, textureY); // Import Griff1
		bodyModel[129] = new ModelRendererTurbo(this, 488, 3, textureX, textureY); // Import Griff2
		bodyModel[130] = new ModelRendererTurbo(this, 495, 3, textureX, textureY); // Import Griff3
		bodyModel[131] = new ModelRendererTurbo(this, 500, 3, textureX, textureY); // Import Schulter1
		bodyModel[132] = new ModelRendererTurbo(this, 500, 6, textureX, textureY); // Import Schulter2
		bodyModel[133] = new ModelRendererTurbo(this, 500, 9, textureX, textureY); // Import Schulter3
		bodyModel[134] = new ModelRendererTurbo(this, 476, 12, textureX, textureY); // Import Ammo1
		bodyModel[135] = new ModelRendererTurbo(this, 489, 12, textureX, textureY); // Import Ammo2
		bodyModel[136] = new ModelRendererTurbo(this, 500, 12, textureX, textureY); // Import Mun1
		bodyModel[137] = new ModelRendererTurbo(this, 505, 12, textureX, textureY); // Import Mun2
		
	    bodyModel[140] = new ModelRendererTurbo(this, 506, 0, this.textureX, this.textureY);
	    bodyModel[141] = new ModelRendererTurbo(this, 501, 0, this.textureX, this.textureY);
	    bodyModel[142] = new ModelRendererTurbo(this, 476, 0, this.textureX, this.textureY);
	    bodyModel[143] = new ModelRendererTurbo(this, 476, 3, this.textureX, this.textureY);
	    bodyModel[144] = new ModelRendererTurbo(this, 481, 3, this.textureX, this.textureY);
	    bodyModel[145] = new ModelRendererTurbo(this, 445, 0, this.textureX, this.textureY);
	    bodyModel[146] = new ModelRendererTurbo(this, 445, 3, this.textureX, this.textureY);
	    bodyModel[147] = new ModelRendererTurbo(this, 476, 6, this.textureX, this.textureY);
	    bodyModel[148] = new ModelRendererTurbo(this, 476, 9, this.textureX, this.textureY);
	    bodyModel[149] = new ModelRendererTurbo(this, 500, 16, this.textureX, this.textureY);
	    bodyModel[138] = new ModelRendererTurbo(this, 488, 3, this.textureX, this.textureY);
	    bodyModel[139] = new ModelRendererTurbo(this, 488, 3, this.textureX, this.textureY);
	    bodyModel[150] = new ModelRendererTurbo(this, 495, 3, this.textureX, this.textureY);
	    bodyModel[151] = new ModelRendererTurbo(this, 500, 3, this.textureX, this.textureY);
	    bodyModel[152] = new ModelRendererTurbo(this, 500, 6, this.textureX, this.textureY);
	    bodyModel[153] = new ModelRendererTurbo(this, 500, 9, this.textureX, this.textureY);
	    bodyModel[154] = new ModelRendererTurbo(this, 476, 12, this.textureX, this.textureY);
	    bodyModel[155] = new ModelRendererTurbo(this, 489, 12, this.textureX, this.textureY);
	    bodyModel[156] = new ModelRendererTurbo(this, 500, 12, this.textureX, this.textureY);
	    bodyModel[157] = new ModelRendererTurbo(this, 505, 12, this.textureX, this.textureY);
	    
	    bodyModel[140].addShapeBox(11.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F);
	    
	    bodyModel[141].addShapeBox(10.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.05F, -0.05F);
	    
	    bodyModel[142].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
	    
	    bodyModel[143].addShapeBox(8.0F, -1.92F, -0.5F, 1, 1, 1, 0.0F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F);
	    
	    bodyModel[144].addShapeBox(0.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, -0.2F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    bodyModel[145].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F);
	    
	    (bodyModel[146]).flip = true;
	    bodyModel[146].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F);
	    
	    bodyModel[147].addBox(-9.0F, -1.0F, -0.5F, 8, 1, 1, 0.0F);
	    
	    bodyModel[148].addShapeBox(-9.0F, -2.0F, -0.5F, 8, 1, 1, 0.0F, -5.0F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -5.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
	    
	    bodyModel[149].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.25F);
	    
	    bodyModel[138].addShapeBox(-5.5F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    (bodyModel[139]).flip = true;
	    bodyModel[139].addShapeBox(-5.5F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
	    
	    bodyModel[150].addShapeBox(-5.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 1.0F, -0.8F, -0.2F, -1.0F, -0.5F, -0.2F, -1.0F, -0.5F, -0.2F, 1.0F, -0.8F, -0.2F);
	    
	    bodyModel[151].addShapeBox(-12.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.25F);
	    
	    bodyModel[152].addShapeBox(-12.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F);
	    
	    bodyModel[153].addShapeBox(-12.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.3F, -0.9F, 0.0F, -0.3F, -0.9F, 0.0F, 0.0F, 0.0F, -0.25F);
	    
	    bodyModel[154].addBox(-3.4F, -0.2F, 0.0F, 2, 3, 4, 0.0F);
	    
	    bodyModel[155].addBox(-2.9F, -0.8F, 0.0F, 1, 0, 3, 0.0F);
	    (bodyModel[155]).rotateAngleX = -0.2094395F;
	    
	    bodyModel[156].addShapeBox(-4.2F, -1.0F, -1.2F, 1, 1, 1, 0.0F, -0.4F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
	    
	    bodyModel[157].addShapeBox(-4.0F, -1.5F, -1.3F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);

	    
	    for (int i = 140; i<158; i++)
	    {
	    	bodyModel[i].setRotationPoint(13.5F, -49.0F, -6.0F);
	    }

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 64, 0F); // Import AchseV
		bodyModel[0].setRotationPoint(60.5F, -5.5F, -32F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 58, 0F); // Import AchseH
		bodyModel[1].setRotationPoint(-45F, -5F, -29F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Rad23L
		bodyModel[2].setRotationPoint(-32F, 0F, -32F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Import Rad33L
		bodyModel[3].setRotationPoint(-21F, 0F, -29F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Rad43L
		bodyModel[4].setRotationPoint(-10F, 0F, -32F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Import Rad53L
		bodyModel[5].setRotationPoint(1F, 0F, -29F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Rad63L
		bodyModel[6].setRotationPoint(12F, 0F, -32F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Import Rad73L
		bodyModel[7].setRotationPoint(23F, 0F, -29F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Rad83L
		bodyModel[8].setRotationPoint(34F, 0F, -32F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Import Rad93L
		bodyModel[9].setRotationPoint(45F, 0F, -29F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Rad23R
		bodyModel[10].setRotationPoint(-32F, 0F, 16F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Import Rad33R
		bodyModel[11].setRotationPoint(-21F, 0F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Rad43R
		bodyModel[12].setRotationPoint(-10F, 0F, 16F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Import Rad53R
		bodyModel[13].setRotationPoint(1F, 0F, 16F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Rad63R
		bodyModel[14].setRotationPoint(12F, 0F, 16F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Import Rad73R
		bodyModel[15].setRotationPoint(23F, 0F, 16F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Rad83R
		bodyModel[16].setRotationPoint(34F, 0F, 16F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Import Rad93R
		bodyModel[17].setRotationPoint(45F, 0F, 16F);

		bodyModel[18].addFlexBox(0F, 0F, 0F, 123, 10, 34, 0F, -5F, -14F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Import Body1
		bodyModel[18].setRotationPoint(-52F, -9F, -17F);

		bodyModel[19].addFlexBox(0F, 0F, 0F, 123, 10, 34, 0F, 4F, -14F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Import Body2
		bodyModel[19].setRotationPoint(-52F, -19F, -17F);

		bodyModel[20].addFlexBox(0F, 0F, 0F, 113, 11, 60, 0F, 5F, -13F, -5F, -5F, ModelRendererTurbo.MR_TOP); // Import Body3
		bodyModel[20].setRotationPoint(-56F, -30F, -30F);

		bodyModel[21].addFlexBox(0F, 0F, 0F, 9, 7, 11, 0F, -2.5F, 0F, -2.5F, -2.5F, ModelRendererTurbo.MR_LEFT); // Import MG1
		bodyModel[21].setRotationPoint(46F, -28F, -18F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import MG2
		bodyModel[22].setRotationPoint(53.2F, -25F, -14.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import MG3
		bodyModel[23].setRotationPoint(53.2F, -24.5F, -14F);

		bodyModel[24].addFlexBox(0F, 0F, 0F, 7, 7, 8, 0F, 0F, -4F, -1F, -1F, ModelRendererTurbo.MR_TOP); // Import Sicht
		bodyModel[24].setRotationPoint(47F, -27F, 6F);

		bodyModel[25].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.2F, ModelRendererTurbo.MR_RIGHT); // Import Lampe1
		bodyModel[25].setRotationPoint(59F, -22F, 24F);

		bodyModel[26].addTrapezoid(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, ModelRendererTurbo.MR_TOP); // Import Lampe2
		bodyModel[26].setRotationPoint(58F, -21F, 24.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import SchleppV1
		bodyModel[27].setRotationPoint(71.5F, -8F, -18.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import Schleppv2
		bodyModel[28].setRotationPoint(71.5F, -8F, 16.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 37, 1, 15, 0F); // Import Motor1
		bodyModel[29].setRotationPoint(-60F, -30.2F, 9.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 31, 1, 18, 0F); // Import Motor2
		bodyModel[30].setRotationPoint(-60F, -30.2F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 37, 1, 15, 0F); // Import Motor3
		bodyModel[31].setRotationPoint(-60F, -30.2F, -24.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Import Motor4
		bodyModel[32].setRotationPoint(-49F, -33F, 6F);

		bodyModel[33].addTrapezoid(0F, 0F, 0F, 4, 2, 4, 0F, -0.5F, ModelRendererTurbo.MR_TOP); // Import Motor5
		bodyModel[33].setRotationPoint(-41F, -32F, 1F);

		bodyModel[34].addTrapezoid(0F, 0F, 0F, 4, 2, 4, 0F, -0.5F, ModelRendererTurbo.MR_TOP); // Import Motor6
		bodyModel[34].setRotationPoint(-41F, -32F, -5F);

		bodyModel[35].addTrapezoid(0F, 0F, 0F, 5, 3, 5, 0F, -1F, ModelRendererTurbo.MR_TOP); // Import Motor7
		bodyModel[35].setRotationPoint(-56F, -31.5F, 3F);

		bodyModel[36].addTrapezoid(0F, 0F, 0F, 5, 3, 5, 0F, -1F, ModelRendererTurbo.MR_TOP); // Import Motor8
		bodyModel[36].setRotationPoint(-56F, -31.5F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 123, 1, 16, 0F); // Import BlechL
		bodyModel[37].setRotationPoint(-56F, -19F, -34F);

		bodyModel[38].addBox(0F, 0F, 0F, 123, 1, 16, 0F); // Import BlechR
		bodyModel[38].setRotationPoint(-56F, -19F, 18F);

		bodyModel[39].addFlexBox(0F, 0F, 0F, 4, 11, 16, 0F, 0F, 0F, 0F, -5F, ModelRendererTurbo.MR_TOP); // Import Heck1
		bodyModel[39].setRotationPoint(-63F, -27F, 13F);
		bodyModel[39].rotateAngleZ = 0.4276057F;

		bodyModel[40].addFlexBox(0F, 0F, 0F, 4, 11, 16, 0F, 0F, 0F, -5F, 0F, ModelRendererTurbo.MR_TOP); // Import Heck2
		bodyModel[40].setRotationPoint(-63F, -27F, -29F);
		bodyModel[40].rotateAngleZ = 0.4276057F;

		bodyModel[41].addFlexBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, -1.5F, -1.5F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck3
		bodyModel[41].setRotationPoint(-60F, -22F, 4F);
		bodyModel[41].rotateAngleZ = 0.4276057F;

		bodyModel[42].addFlexBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, -1.5F, -1.5F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck4
		bodyModel[42].setRotationPoint(-60F, -22F, -11F);
		bodyModel[42].rotateAngleZ = 0.4276057F;

		bodyModel[43].addBox(1F, -9F, 0F, 2, 10, 2, 0F); // Import Heck5
		bodyModel[43].setRotationPoint(-60F, -22F, 6.5F);
		bodyModel[43].rotateAngleZ = 0.4276057F;

		bodyModel[44].addBox(1F, -9F, 0F, 2, 10, 2, 0F); // Import Heck6
		bodyModel[44].setRotationPoint(-60F, -22F, -8.5F);
		bodyModel[44].rotateAngleZ = 0.4276057F;

		bodyModel[45].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Import Heck7
		bodyModel[45].setRotationPoint(-61F, -31.4F, 6.5F);
		bodyModel[45].rotateAngleZ = -1.989675F;

		bodyModel[46].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Import Heck8
		bodyModel[46].setRotationPoint(-61F, -31.4F, -8.5F);
		bodyModel[46].rotateAngleZ = -1.989675F;

		bodyModel[47].addTrapezoid(0F, 0F, 0F, 2, 8, 8, 0F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Heck9
		bodyModel[47].setRotationPoint(-56F, -16F, -4F);
		bodyModel[47].rotateAngleZ = 0.4276057F;

		bodyModel[48].addBox(13F, -0.5F, -0.5F, 1, 5, 2, 0F); // Import Seite1L
		bodyModel[48].setRotationPoint(28.46667F, -26F, -27.5F);
		bodyModel[48].rotateAngleX = -0.4363323F;

		bodyModel[49].addBox(6F, 0F, 0F, 10, 1, 1, 0F); // Import Seite2L
		bodyModel[49].setRotationPoint(28F, -26F, -27.5F);
		bodyModel[49].rotateAngleX = -0.4363323F;

		bodyModel[50].addBox(1F, 3F, 0F, 15, 1, 1, 0F); // Import Seite3L
		bodyModel[50].setRotationPoint(28F, -26F, -27.5F);
		bodyModel[50].rotateAngleX = -0.4363323F;

		bodyModel[51].addBox(2F, -1F, -0.1F, 4, 3, 1, 0F); // Import Seite4L
		bodyModel[51].setRotationPoint(28.46667F, -26F, -27.5F);
		bodyModel[51].rotateAngleX = -0.4363323F;

		bodyModel[52].addBox(2F, -1.5F, -0.5F, 1, 6, 2, 0F); // Import Seite5L
		bodyModel[52].setRotationPoint(28.46667F, -26F, -27.5F);
		bodyModel[52].rotateAngleX = -0.4363323F;

		bodyModel[53].addBox(0F, 1F, 0F, 1, 5, 1, 0F); // Import Seite6L
		bodyModel[53].setRotationPoint(28F, -26F, -27.5F);
		bodyModel[53].rotateAngleX = -0.4363323F;

		bodyModel[54].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Import Seite7L
		bodyModel[54].setRotationPoint(-58F, -29F, -26F);
		bodyModel[54].rotateAngleX = -0.4363323F;

		bodyModel[55].addBox(34F, 0F, -1.5F, 1, 2, 2, 0F); // Import Seite8L
		bodyModel[55].setRotationPoint(-58F, -29F, -26F);
		bodyModel[55].rotateAngleX = -0.4363323F;

		bodyModel[56].addBox(27F, 0F, -1.5F, 1, 2, 2, 0F); // Import Seite9L
		bodyModel[56].setRotationPoint(-58F, -29F, -26F);
		bodyModel[56].rotateAngleX = -0.4363323F;

		bodyModel[57].addBox(20F, 0F, -1.5F, 1, 2, 2, 0F); // Import Seite10L
		bodyModel[57].setRotationPoint(-58F, -29F, -26F);
		bodyModel[57].rotateAngleX = -0.4363323F;

		bodyModel[58].addBox(14F, 0F, -1.5F, 1, 2, 2, 0F); // Import Seite11L
		bodyModel[58].setRotationPoint(-58F, -29F, -26F);
		bodyModel[58].rotateAngleX = -0.4363323F;

		bodyModel[59].addBox(7F, 0F, -1.5F, 1, 2, 2, 0F); // Import Seite12L
		bodyModel[59].setRotationPoint(-58F, -29F, -26F);
		bodyModel[59].rotateAngleX = -0.4363323F;

		bodyModel[60].addBox(0F, 0F, -1.5F, 1, 2, 2, 0F); // Import Seite13L
		bodyModel[60].setRotationPoint(-58F, -29F, -26F);
		bodyModel[60].rotateAngleX = -0.4363323F;

		bodyModel[61].addBox(13F, -0.5F, -1.5F, 1, 5, 2, 0F); // Import Seite1R
		bodyModel[61].setRotationPoint(28.46667F, -26F, 27.5F);
		bodyModel[61].rotateAngleX = 0.4363323F;

		bodyModel[62].addBox(6F, 0F, -1F, 10, 1, 1, 0F); // Import Seite2R
		bodyModel[62].setRotationPoint(28F, -26F, 27.5F);
		bodyModel[62].rotateAngleX = 0.4363323F;

		bodyModel[63].addBox(1F, 3F, -1F, 15, 1, 1, 0F); // Import Seite3R
		bodyModel[63].setRotationPoint(28F, -26F, 27.5F);
		bodyModel[63].rotateAngleX = 0.4363323F;

		bodyModel[64].addBox(2F, -1F, -0.9F, 4, 3, 1, 0F); // Import Seite4R
		bodyModel[64].setRotationPoint(28.46667F, -26F, 27.5F);
		bodyModel[64].rotateAngleX = 0.4363323F;

		bodyModel[65].addBox(2F, -1.5F, -1.5F, 1, 6, 2, 0F); // Import Seite5R
		bodyModel[65].setRotationPoint(28.46667F, -26F, 27.5F);
		bodyModel[65].rotateAngleX = 0.4363323F;

		bodyModel[66].addBox(0F, 1F, -1F, 1, 5, 1, 0F); // Import Seite6R
		bodyModel[66].setRotationPoint(28F, -26F, 27.5F);
		bodyModel[66].rotateAngleX = 0.4363323F;

		bodyModel[67].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Import Seite7R
		bodyModel[67].setRotationPoint(22F, -28F, 27F);

		bodyModel[68].addBox(0F, 0F, -1F, 38, 3, 3, 0F); // Import Seite8R
		bodyModel[68].setRotationPoint(-15F, -29F, 26F);

		bodyModel[69].addBox(0F, 0F, -1F, 1, 4, 4, 0F); // Import Seite9R
		bodyModel[69].setRotationPoint(15F, -29.5F, 25.5F);

		bodyModel[70].addBox(0F, 0F, -1F, 1, 4, 4, 0F); // Import Seite10R
		bodyModel[70].setRotationPoint(-8F, -29.5F, 25.5F);

		bodyModel[71].addBox(0F, 0F, -1F, 35, 2, 1, 0F); // Import Seite11R
		bodyModel[71].setRotationPoint(-58F, -29F, 26F);
		bodyModel[71].rotateAngleX = 0.4363323F;

		bodyModel[72].addBox(34F, 0F, -0.5F, 1, 2, 2, 0F); // Import Seite12R
		bodyModel[72].setRotationPoint(-58F, -29F, 26F);
		bodyModel[72].rotateAngleX = 0.4363323F;

		bodyModel[73].addBox(27F, 0F, -0.5F, 1, 2, 2, 0F); // Import Seite13R
		bodyModel[73].setRotationPoint(-58F, -29F, 26F);
		bodyModel[73].rotateAngleX = 0.4363323F;

		bodyModel[74].addBox(20F, 0F, -0.5F, 1, 2, 2, 0F); // Import Seite14R
		bodyModel[74].setRotationPoint(-58F, -29F, 26F);
		bodyModel[74].rotateAngleX = 0.4363323F;

		bodyModel[75].addBox(14F, 0F, -0.5F, 1, 2, 2, 0F); // Import Seite15R
		bodyModel[75].setRotationPoint(-58F, -29F, 26F);
		bodyModel[75].rotateAngleX = 0.4363323F;

		bodyModel[76].addBox(7F, 0F, -0.5F, 1, 2, 2, 0F); // Import Seite16R
		bodyModel[76].setRotationPoint(-58F, -29F, 26F);
		bodyModel[76].rotateAngleX = 0.4363323F;

		bodyModel[77].addBox(0F, 0F, -0.5F, 1, 2, 2, 0F); // Import Seite17R
		bodyModel[77].setRotationPoint(-58F, -29F, 26F);
		bodyModel[77].rotateAngleX = 0.4363323F;

		bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import SchleppH1
		bodyModel[78].setRotationPoint(-53.5F, -8F, 16.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import SchleppH2
		bodyModel[79].setRotationPoint(-53.5F, -8F, -18.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt1L
		bodyModel[80].setRotationPoint(53F, -18.5F, -34.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt2L
		bodyModel[81].setRotationPoint(41F, -18.5F, -34.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt3L
		bodyModel[82].setRotationPoint(18F, -18.5F, -34.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt4L
		bodyModel[83].setRotationPoint(-6F, -18.5F, -34.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt5L
		bodyModel[84].setRotationPoint(-30F, -18.5F, -34.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt6L
		bodyModel[85].setRotationPoint(-43F, -18.5F, -34.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt1R
		bodyModel[86].setRotationPoint(53F, -18.5F, 17.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt2R
		bodyModel[87].setRotationPoint(41F, -18.5F, 17.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt3R
		bodyModel[88].setRotationPoint(18F, -18.5F, 17.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt4R
		bodyModel[89].setRotationPoint(-6F, -18.5F, 17.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt5R
		bodyModel[90].setRotationPoint(-30F, -18.5F, 17.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Import Halt6R
		bodyModel[91].setRotationPoint(-43F, -18.5F, 17.5F);

		bodyModel[92].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(0, 8, 0, 8), new Coord2D(16, 0, 16, 0), new Coord2D(122, 0, 122, 0), new Coord2D(127, 10, 127, 10) }), 1, 127, 10, 265, 1, ModelRendererTurbo.MR_FRONT, new float[] {127 ,12 ,106 ,18 ,2}); // Import 
		bodyModel[92].setRotationPoint(73F, 1F, 18F);

		bodyModel[93].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(127, 0, 127, 0), new Coord2D(129, 10, 129, 10), new Coord2D(12, 10, 12, 10), new Coord2D(0, 1, 0, 1) }), 1, 129, 10, 271, 1, ModelRendererTurbo.MR_FRONT, new float[] {1 ,15 ,117 ,11 ,127}); // Import 
		bodyModel[93].setRotationPoint(73F, -9F, 18F);

		bodyModel[94].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 10, 0, 10), new Coord2D(0, 8, 0, 8), new Coord2D(16, 0, 16, 0), new Coord2D(122, 0, 122, 0), new Coord2D(127, 10, 127, 10) }), 1, 127, 10, 265, 1, ModelRendererTurbo.MR_FRONT, new float[] {127 ,12 ,106 ,18 ,2}); // Import 
		bodyModel[94].setRotationPoint(73F, 1F, -17F);

		bodyModel[95].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(127, 0, 127, 0), new Coord2D(129, 10, 129, 10), new Coord2D(12, 10, 12, 10), new Coord2D(0, 1, 0, 1) }), 1, 129, 10, 271, 1, ModelRendererTurbo.MR_FRONT, new float[] {1 ,15 ,117 ,11 ,127}); // Import 
		bodyModel[95].setRotationPoint(73F, -9F, -17F);

		bodyModel[96].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(6, 5, 6, 5), new Coord2D(6, 6, 6, 6) }), 16, 6, 6, 19, 16, ModelRendererTurbo.MR_FRONT, new float[] {9 ,1 ,8 ,1}); // Import 
		bodyModel[96].setRotationPoint(73F, -13F, 34F);

		bodyModel[97].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(6, 5, 6, 5), new Coord2D(6, 6, 6, 6) }), 16, 6, 6, 19, 16, ModelRendererTurbo.MR_FRONT, new float[] {9 ,1 ,8 ,1}); // Import 
		bodyModel[97].setRotationPoint(73F, -13F, -18F);

		bodyModel[98].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(111, 0, 111, 0), new Coord2D(113, 5, 113, 5) }), 16, 113, 5, 231, 16, ModelRendererTurbo.MR_FRONT, new float[] {113 ,6 ,112}); // Import 
		bodyModel[98].setRotationPoint(57F, -13F, -18F);

		bodyModel[99].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(111, 0, 111, 0), new Coord2D(113, 5, 113, 5) }), 16, 113, 5, 231, 16, ModelRendererTurbo.MR_FRONT, new float[] {113 ,6 ,112}); // Import 
		bodyModel[99].setRotationPoint(57F, -13F, 34F);

		bodyModel[100].addBox(0F, 0F, 0F, 116, 10, 1, 0F); // Import SPL
		bodyModel[100].setRotationPoint(-56F, -18F, 34F);

		bodyModel[101].addBox(0F, 0F, 0F, 116, 10, 1, 0F); // Import SPL
		bodyModel[101].setRotationPoint(-56F, -18F, -35F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 76, 17, 17, 0F, -11F, 0F, -10F, -20F, -4F, -7F, -20F, -4F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Turm1
		bodyModel[102].setRotationPoint(-32F, -47F, -25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 76, 17, 17, 0F, -11F, 0F, 0F, -20F, -4F, 0F, -20F, -4F, -7F, -11F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Turm2
		bodyModel[103].setRotationPoint(-32F, -47F, 8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 56, 17, 16, 0F, -11F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Turm3
		bodyModel[104].setRotationPoint(-32F, -47F, -8F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Import Sicht
		bodyModel[105].setRotationPoint(18.5F, -45F, -16.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 3, 19, 0F); // Import Rahmen1
		bodyModel[106].setRotationPoint(21.5F, -44F, -9.5F);

		bodyModel[107].addBox(0F, 0F, 2F, 2, 3, 15, 0F); // Import Rahmen2
		bodyModel[107].setRotationPoint(24.5F, -44F, -9.5F);
		bodyModel[107].rotateAngleZ = -0.5794493F;

		bodyModel[108].addBox(25F, 0F, 0F, 4, 3, 19, 0F); // Import Rahmen3
		bodyModel[108].setRotationPoint(24.5F, -44F, -9.5F);
		bodyModel[108].rotateAngleZ = -0.5794493F;

		bodyModel[109].addBox(0F, 0F, 0F, 25, 3, 2, 0F); // Import Rahmen4
		bodyModel[109].setRotationPoint(24.5F, -44F, -9.5F);
		bodyModel[109].rotateAngleZ = -0.5794493F;

		bodyModel[110].addBox(0F, 0F, 17F, 25, 3, 2, 0F); // Import Rahmen5
		bodyModel[110].setRotationPoint(24.5F, -44F, -9.5F);
		bodyModel[110].rotateAngleZ = -0.5794493F;

		bodyModel[111].addBox(0.5F, 0.5F, -0.5F, 14, 10, 1, 0F); // Import KS1
		bodyModel[111].setRotationPoint(-58F, -29F, 26F);
		bodyModel[111].rotateAngleX = 0.4363323F;

		bodyModel[112].addBox(20.5F, 0.5F, -0.5F, 14, 10, 1, 0F); // Import KS2
		bodyModel[112].setRotationPoint(-58F, -29F, 26F);
		bodyModel[112].rotateAngleX = 0.4363323F;

		bodyModel[113].addBox(20.5F, 0.5F, -0.5F, 14, 10, 1, 0F); // Import KS3
		bodyModel[113].setRotationPoint(-58F, -29F, -26F);
		bodyModel[113].rotateAngleX = -0.4363323F;

		bodyModel[114].addBox(0.5F, 0.5F, -0.5F, 14, 10, 1, 0F); // Import KS4
		bodyModel[114].setRotationPoint(-58F, -29F, -26F);
		bodyModel[114].rotateAngleX = -0.4363323F;

		bodyModel[115].addBox(3F, -0.5F, 19F, 12, 2, 12, 0F); // Import Luke1
		bodyModel[115].setRotationPoint(-23F, -47F, -16F);
		bodyModel[115].rotateAngleZ = -0.08552113F;

		bodyModel[116].addBox(20F, -0.5F, 4F, 12, 2, 12, 0F); // Import Luke2
		bodyModel[116].setRotationPoint(-23F, -47F, -16F);
		bodyModel[116].rotateAngleZ = -0.08552113F;

		bodyModel[117].addTrapezoid(0F, 0F, 0F, 1, 10, 1, 0F, -0.25F, ModelRendererTurbo.MR_TOP); // Import Mount
		bodyModel[117].setRotationPoint(13F, -49F, -6.5F);

		bodyModel[118].addShapeBox(11F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Import Barrel1
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(10F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F); // Import Barrel2
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Barrel3
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(8F, -1.92F, -0.5F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Import Barrel4
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(0F, -2F, -0.5F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Barrel5
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Import Barrel6
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Import Barrel7
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addBox(-9F, -1F, -0.5F, 8, 1, 1, 0F); // Import Body1
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-9F, -2F, -0.5F, 8, 1, 1, 0F, -5F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body2
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0F, 0.5F, -0.5F, -0.25F, -2F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, -0.25F); // Import Body3
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Griff1
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Griff2
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-5.5F, 0F, -0.5F, 1, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, -0.8F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 1F, -0.8F, -0.2F); // Import Griff3
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(-12F, -2F, -0.5F, 2, 1, 1, 0F, 0.5F, -0.5F, -0.25F, -2F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, -0.25F); // Import Schulter1
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-12F, -1F, -0.5F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Import Schulter2
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(-12F, 0F, -0.5F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, 0F, 0F, -0.25F); // Import Schulter3
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addBox(-3.4F, -0.2F, 0F, 2, 3, 4, 0F); // Import Ammo1
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addBox(-2.9F, -0.8F, 0F, 1, 0, 3, 0F); // Import Ammo2
		bodyModel[135].setRotationPoint(0F, 0F, 0F);
		bodyModel[135].rotateAngleX = -0.2094395F;

		bodyModel[136].addShapeBox(-4.2F, -1F, -1.2F, 1, 1, 1, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Mun1
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-4F, -1.5F, -1.3F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Mun2
		bodyModel[137].setRotationPoint(0F, 0F, 0F);


		turretModel = new ModelRendererTurbo[1];
		turretModel[0] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import Turm

		turretModel[0].addBox(10F, 0F, -4F, 10, 8, 8, 0F); // Import Turm
		turretModel[0].setRotationPoint(0F, -38F, 0F);


		barrelModel = new ModelRendererTurbo[15];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 130, textureX, textureY); // Import Rohr1
		barrelModel[1] = new ModelRendererTurbo(this, 93, 130, textureX, textureY); // Import Rohr2
		barrelModel[2] = new ModelRendererTurbo(this, 135, 130, textureX, textureY); // Import Rohr3
		barrelModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import Rohr4
		barrelModel[4] = new ModelRendererTurbo(this, 135, 150, textureX, textureY); // Import Rohr5
		barrelModel[5] = new ModelRendererTurbo(this, 13, 140, textureX, textureY); // Import Rohr6
		barrelModel[6] = new ModelRendererTurbo(this, 24, 140, textureX, textureY); // Import Rohr7
		barrelModel[7] = new ModelRendererTurbo(this, 38, 140, textureX, textureY); // Import Rohr8
		barrelModel[8] = new ModelRendererTurbo(this, 54, 140, textureX, textureY); // Import Rohr9
		barrelModel[9] = new ModelRendererTurbo(this, 68, 140, textureX, textureY); // Import Rohr10
		barrelModel[10] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Rohr11
		barrelModel[11] = new ModelRendererTurbo(this, 38, 140, textureX, textureY); // Import Rohr8
		barrelModel[12] = new ModelRendererTurbo(this, 54, 140, textureX, textureY); // Import Rohr9
		barrelModel[13] = new ModelRendererTurbo(this, 68, 140, textureX, textureY); // Import Rohr10
		barrelModel[14] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Rohr11

		barrelModel[0].addBox(-14F, -2F, -2F, 48, 4, 4, 0F); // Import Rohr1
		barrelModel[0].setRotationPoint(25F, -34F, 0F);

		barrelModel[1].addFlexBox(3F, -8F, -7.5F, 5, 12, 15, 0F, -4F, -0F, -2F, -2F, ModelRendererTurbo.MR_LEFT); // Import Rohr2
		barrelModel[1].setRotationPoint(25F, -34F, 0F);

		barrelModel[2].addFlexBox(8F, -4F, -5.5F, 10, 8, 11, 0F, -1.8F, -1.8F, -3.3F, -3.3F, ModelRendererTurbo.MR_LEFT); // Import Rohr3
		barrelModel[2].setRotationPoint(25F, -34F, 0F);

		barrelModel[3].addTrapezoid(34F, -2F, -2F, 1, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr4
		barrelModel[3].setRotationPoint(25F, -34F, 0F);

		barrelModel[4].addTrapezoid(35F, -1.5F, -1.5F, 53, 3, 3, 0F, -0.2F, ModelRendererTurbo.MR_LEFT); // Import Rohr5
		barrelModel[4].setRotationPoint(25F, -34F, 0F);

		barrelModel[5].addTrapezoid(88F, -1.5F, -1.5F, 1, 3, 3, 0F, -0.2F, ModelRendererTurbo.MR_RIGHT); // Import Rohr6
		barrelModel[5].setRotationPoint(25F, -34F, 0F);

		barrelModel[6].addBox(89F, -1.5F, -1.5F, 3, 3, 3, 0F); // Import Rohr7
		barrelModel[6].setRotationPoint(25F, -34F, 0F);

		barrelModel[7].addTrapezoid(92F, -2.5F, -2.5F, 2, 5, 5, 0F, -1F, ModelRendererTurbo.MR_RIGHT); // Import Rohr8
		barrelModel[7].setRotationPoint(25F, -34F, 0F);

		barrelModel[8].addTrapezoid(94F, -2.5F, -2.5F, 1, 5, 5, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr9
		barrelModel[8].setRotationPoint(25F, -34F, 0F);

		barrelModel[9].addBox(95F, -2F, -2F, 4, 4, 4, 0F); // Import Rohr10
		barrelModel[9].setRotationPoint(25F, -34F, 0F);

		barrelModel[10].addTrapezoid(99F, -2F, -2F, 1, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr11
		barrelModel[10].setRotationPoint(25F, -34F, 0F);

		barrelModel[11].addTrapezoid(92F, -2.5F, -2.5F, 2, 5, 5, 0F, -1F, ModelRendererTurbo.MR_RIGHT); // Import Rohr8
		barrelModel[11].setRotationPoint(25F, -34F, 0F);

		barrelModel[12].addTrapezoid(94F, -2.5F, -2.5F, 1, 5, 5, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr9
		barrelModel[12].setRotationPoint(25F, -34F, 0F);

		barrelModel[13].addBox(95F, -2F, -2F, 4, 4, 4, 0F); // Import Rohr10
		barrelModel[13].setRotationPoint(25F, -34F, 0F);

		barrelModel[14].addTrapezoid(99F, -2F, -2F, 1, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr11
		barrelModel[14].setRotationPoint(25F, -34F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[20];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import Rad11L
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import Rad12L
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad21L
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad22L
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad31L
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad32L
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad41L
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad42L
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad51L
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad52L
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad61L
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad62L
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad71L
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad72L
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad81L
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad82L
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad91L
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad92L
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 110, 10, textureX, textureY); // Import Rad101L
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 110, 10, textureX, textureY); // Import Rad102L

		leftTrackWheelModels[0].addShape3D(6F, -6F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Rad11L
		leftTrackWheelModels[0].setRotationPoint(-44F, -4F, -27F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Rad12L
		leftTrackWheelModels[1].setRotationPoint(-44F, -4F, -24F);

		leftTrackWheelModels[2].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad21L
		leftTrackWheelModels[2].setRotationPoint(-31F, 1F, -30F);

		leftTrackWheelModels[3].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad22L
		leftTrackWheelModels[3].setRotationPoint(-31F, 1F, -21F);

		leftTrackWheelModels[4].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad31L
		leftTrackWheelModels[4].setRotationPoint(-20F, 1F, -27F);

		leftTrackWheelModels[5].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad32L
		leftTrackWheelModels[5].setRotationPoint(-20F, 1F, -24F);

		leftTrackWheelModels[6].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad41L
		leftTrackWheelModels[6].setRotationPoint(-9F, 1F, -30F);

		leftTrackWheelModels[7].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad42L
		leftTrackWheelModels[7].setRotationPoint(-9F, 1F, -21F);

		leftTrackWheelModels[8].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad51L
		leftTrackWheelModels[8].setRotationPoint(2F, 1F, -27F);

		leftTrackWheelModels[9].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad52L
		leftTrackWheelModels[9].setRotationPoint(2F, 1F, -24F);

		leftTrackWheelModels[10].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad61L
		leftTrackWheelModels[10].setRotationPoint(13F, 1F, -30F);

		leftTrackWheelModels[11].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad62L
		leftTrackWheelModels[11].setRotationPoint(13F, 1F, -21F);

		leftTrackWheelModels[12].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad71L
		leftTrackWheelModels[12].setRotationPoint(24F, 1F, -27F);

		leftTrackWheelModels[13].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad72L
		leftTrackWheelModels[13].setRotationPoint(24F, 1F, -24F);

		leftTrackWheelModels[14].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad81L
		leftTrackWheelModels[14].setRotationPoint(35F, 1F, -30F);

		leftTrackWheelModels[15].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad82L
		leftTrackWheelModels[15].setRotationPoint(35F, 1F, -21F);

		leftTrackWheelModels[16].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad91L
		leftTrackWheelModels[16].setRotationPoint(46F, 1F, -27F);

		leftTrackWheelModels[17].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad92L
		leftTrackWheelModels[17].setRotationPoint(46F, 1F, -24F);

		leftTrackWheelModels[18].addShape3D(8.5F, -8.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad101L
		leftTrackWheelModels[18].setRotationPoint(61.5F, -4.5F, -30F);

		leftTrackWheelModels[19].addShape3D(8.5F, -8.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad102L
		leftTrackWheelModels[19].setRotationPoint(61.5F, -4.5F, -21F);


		rightTrackWheelModels = new ModelRendererTurbo[20];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import Rad11R
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import Rad12R
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad21R
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad22R
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad31R
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad32R
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad41R
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad42R
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad51R
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad52R
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad61R
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad62R
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad71R
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad72R
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad81R
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad82R
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad91R
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Import Rad92R
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 110, 10, textureX, textureY); // Import Rad101R
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 110, 10, textureX, textureY); // Import Rad102R

		rightTrackWheelModels[0].addShape3D(6F, -6F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Rad11R
		rightTrackWheelModels[0].setRotationPoint(-44F, -4F, 27F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Rad12R
		rightTrackWheelModels[1].setRotationPoint(-44F, -4F, 24F);

		rightTrackWheelModels[2].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad21R
		rightTrackWheelModels[2].setRotationPoint(-31F, 1F, 30F);

		rightTrackWheelModels[3].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad22R
		rightTrackWheelModels[3].setRotationPoint(-31F, 1F, 21F);

		rightTrackWheelModels[4].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad31R
		rightTrackWheelModels[4].setRotationPoint(-20F, 1F, 27F);

		rightTrackWheelModels[5].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad32R
		rightTrackWheelModels[5].setRotationPoint(-20F, 1F, 24F);

		rightTrackWheelModels[6].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad41R
		rightTrackWheelModels[6].setRotationPoint(-9F, 1F, 30F);

		rightTrackWheelModels[7].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad42R
		rightTrackWheelModels[7].setRotationPoint(-9F, 1F, 21F);

		rightTrackWheelModels[8].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad51R
		rightTrackWheelModels[8].setRotationPoint(2F, 1F, 27F);

		rightTrackWheelModels[9].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad52R
		rightTrackWheelModels[9].setRotationPoint(2F, 1F, 24F);

		rightTrackWheelModels[10].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad61R
		rightTrackWheelModels[10].setRotationPoint(13F, 1F, 30F);

		rightTrackWheelModels[11].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad62R
		rightTrackWheelModels[11].setRotationPoint(13F, 1F, 21F);

		rightTrackWheelModels[12].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad71R
		rightTrackWheelModels[12].setRotationPoint(24F, 1F, 27F);

		rightTrackWheelModels[13].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad72R
		rightTrackWheelModels[13].setRotationPoint(24F, 1F, 24F);

		rightTrackWheelModels[14].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad81R
		rightTrackWheelModels[14].setRotationPoint(35F, 1F, 30F);

		rightTrackWheelModels[15].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad82R
		rightTrackWheelModels[15].setRotationPoint(35F, 1F, 21F);

		rightTrackWheelModels[16].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad91R
		rightTrackWheelModels[16].setRotationPoint(46F, 1F, 27F);

		rightTrackWheelModels[17].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(11, 0, 11, 0), new Coord2D(16, 5, 16, 5), new Coord2D(16, 11, 16, 11), new Coord2D(11, 16, 11, 16), new Coord2D(5, 16, 5, 16), new Coord2D(0, 11, 0, 11), new Coord2D(0, 5, 0, 5) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,6 ,8 ,6 ,8 ,6 ,8 ,6}); // Import Rad92R
		rightTrackWheelModels[17].setRotationPoint(46F, 1F, 24F);

		rightTrackWheelModels[18].addShape3D(8.5F, -8.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad101R
		rightTrackWheelModels[18].setRotationPoint(61.5F, -4.5F, 30F);

		rightTrackWheelModels[19].addShape3D(8.5F, -8.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(12, 0, 12, 0), new Coord2D(17, 5, 17, 5), new Coord2D(17, 12, 17, 12), new Coord2D(12, 17, 12, 17), new Coord2D(5, 17, 5, 17), new Coord2D(0, 12, 0, 12), new Coord2D(0, 5, 0, 5) }), 2, 17, 17, 60, 2, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,7 ,8 ,7 ,8 ,7}); // Import Rad102R
		rightTrackWheelModels[19].setRotationPoint(61.5F, -4.5F, 21F);


		leftTrackModel = new ModelRendererTurbo[20];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 497, textureX, textureY); // Import Kette1L
		leftTrackModel[1] = new ModelRendererTurbo(this, 188, 495, textureX, textureY); // Import Kette2L
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 475, textureX, textureY); // Import Kette3L
		leftTrackModel[3] = new ModelRendererTurbo(this, 19, 472, textureX, textureY); // Import Kette4L
		leftTrackModel[4] = new ModelRendererTurbo(this, 45, 475, textureX, textureY); // Import Kette5L
		leftTrackModel[5] = new ModelRendererTurbo(this, 63, 470, textureX, textureY); // Import Kette6L
		leftTrackModel[6] = new ModelRendererTurbo(this, 81, 481, textureX, textureY); // Import Kette7L
		leftTrackModel[7] = new ModelRendererTurbo(this, 107, 478, textureX, textureY); // Import Kette8L
		leftTrackModel[8] = new ModelRendererTurbo(this, 235, 472, textureX, textureY); // Import Kette9L
		leftTrackModel[9] = new ModelRendererTurbo(this, 267, 468, textureX, textureY); // Import Kette10L
		leftTrackModel[10] = new ModelRendererTurbo(this, 137, 475, textureX, textureY); // Import Kette11L
		leftTrackModel[11] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Kette12L
		leftTrackModel[12] = new ModelRendererTurbo(this, 40, 453, textureX, textureY); // Import Kette13L
		leftTrackModel[13] = new ModelRendererTurbo(this, 81, 455, textureX, textureY); // Import Kette14L
		leftTrackModel[14] = new ModelRendererTurbo(this, 109, 458, textureX, textureY); // Import Kette15L
		leftTrackModel[15] = new ModelRendererTurbo(this, 127, 455, textureX, textureY); // Import Kette16L
		leftTrackModel[16] = new ModelRendererTurbo(this, 149, 447, textureX, textureY); // Import Kette17L
		leftTrackModel[17] = new ModelRendererTurbo(this, 167, 455, textureX, textureY); // Import Kette18L
		leftTrackModel[18] = new ModelRendererTurbo(this, 185, 451, textureX, textureY); // Import Kette19L
		leftTrackModel[19] = new ModelRendererTurbo(this, 208, 454, textureX, textureY); // Import Kette20L

		leftTrackModel[0].addBox(0F, 0F, 0F, 86, 1, 14, 0F); // Import Kette1L
		leftTrackModel[0].setRotationPoint(-35F, 9F, -33F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 15, 1, 14, 0F); // Import Kette2L
		leftTrackModel[1].setRotationPoint(65F, 5F, -33F);
		leftTrackModel[1].rotateAngleZ = -2.80998F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Import Kette3L
		leftTrackModel[2].setRotationPoint(65F, 5F, -33F);
		leftTrackModel[2].rotateAngleZ = 2.356194F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Import Kette4L
		leftTrackModel[3].setRotationPoint(71F, -1F, -33F);
		leftTrackModel[3].rotateAngleZ = -2.356194F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 7, 14, 0F); // Import Kette5L
		leftTrackModel[4].setRotationPoint(70F, -8F, -33F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Import Kette6L
		leftTrackModel[5].setRotationPoint(71F, -8F, -33F);
		leftTrackModel[5].rotateAngleZ = -2.356194F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Import Kette7L
		leftTrackModel[6].setRotationPoint(65F, -14F, -33F);
		leftTrackModel[6].rotateAngleZ = -0.78539816F;

		leftTrackModel[7].addBox(0F, 0F, 0F, 7, 1, 14, 0F); // Import Kette8L
		leftTrackModel[7].setRotationPoint(58F, -14F, -33F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 21, 14, 0F); // Import Kette9L
		leftTrackModel[8].setRotationPoint(58F, -14F, -33F);
		leftTrackModel[8].rotateAngleZ = -1.448623F;

		leftTrackModel[9].addBox(0F, 0F, 0F, 1, 30, 14, 0F); // Import Kette10L
		leftTrackModel[9].setRotationPoint(8F, -8F, -33F);
		leftTrackModel[9].rotateAngleZ = 1.658063F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 26, 1, 14, 0F); // Import Kette11L
		leftTrackModel[10].setRotationPoint(-18F, -9F, -33F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Import Kette12L
		leftTrackModel[11].setRotationPoint(-18F, -8F, -33F);
		leftTrackModel[11].rotateAngleZ = 3.10145008F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Import Kette13L
		leftTrackModel[12].setRotationPoint(-41F, -11F, -33F);
		leftTrackModel[12].rotateAngleZ = -0.1186824F;

		leftTrackModel[13].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Import Kette14L
		leftTrackModel[13].setRotationPoint(-47F, -11F, -33F);

		leftTrackModel[14].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Import Kette15L
		leftTrackModel[14].setRotationPoint(-47F, -11F, -33F);
		leftTrackModel[14].rotateAngleZ = -0.78539816F;

		leftTrackModel[15].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Import Kette16L
		leftTrackModel[15].setRotationPoint(-51F, -7F, -33F);
		leftTrackModel[15].rotateAngleZ = 0.78539816F;

		leftTrackModel[16].addBox(0F, 0F, 0F, 1, 6, 14, 0F); // Import Kette17L
		leftTrackModel[16].setRotationPoint(-51F, -7F, -33F);

		leftTrackModel[17].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Import Kette18L
		leftTrackModel[17].setRotationPoint(-51F, -1F, -33F);
		leftTrackModel[17].rotateAngleZ = 0.78539816F;

		leftTrackModel[18].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Import Kette19L
		leftTrackModel[18].setRotationPoint(-47F, 3F, -33F);
		leftTrackModel[18].rotateAngleZ = 2.356194F;

		leftTrackModel[19].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Import Kette20L
		leftTrackModel[19].setRotationPoint(-47F, 3F, -33F);
		leftTrackModel[19].rotateAngleZ = 1.0506882F;


		rightTrackModel = new ModelRendererTurbo[20];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 497, textureX, textureY); // Import Kette1R
		rightTrackModel[1] = new ModelRendererTurbo(this, 188, 495, textureX, textureY); // Import Kette2R
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 475, textureX, textureY); // Import Kette3R
		rightTrackModel[3] = new ModelRendererTurbo(this, 19, 472, textureX, textureY); // Import Kette4R
		rightTrackModel[4] = new ModelRendererTurbo(this, 45, 475, textureX, textureY); // Import Kette5R
		rightTrackModel[5] = new ModelRendererTurbo(this, 63, 470, textureX, textureY); // Import Kette6R
		rightTrackModel[6] = new ModelRendererTurbo(this, 81, 481, textureX, textureY); // Import Kette7R
		rightTrackModel[7] = new ModelRendererTurbo(this, 107, 478, textureX, textureY); // Import Kette8R
		rightTrackModel[8] = new ModelRendererTurbo(this, 235, 472, textureX, textureY); // Import Kette9R
		rightTrackModel[9] = new ModelRendererTurbo(this, 267, 468, textureX, textureY); // Import Kette10R
		rightTrackModel[10] = new ModelRendererTurbo(this, 137, 475, textureX, textureY); // Import Kette11R
		rightTrackModel[11] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Kette12R
		rightTrackModel[12] = new ModelRendererTurbo(this, 40, 453, textureX, textureY); // Import Kette13R
		rightTrackModel[13] = new ModelRendererTurbo(this, 81, 455, textureX, textureY); // Import Kette14R
		rightTrackModel[14] = new ModelRendererTurbo(this, 109, 458, textureX, textureY); // Import Kette15R
		rightTrackModel[15] = new ModelRendererTurbo(this, 127, 455, textureX, textureY); // Import Kette16R
		rightTrackModel[16] = new ModelRendererTurbo(this, 149, 447, textureX, textureY); // Import Kette17R
		rightTrackModel[17] = new ModelRendererTurbo(this, 167, 455, textureX, textureY); // Import Kette18R
		rightTrackModel[18] = new ModelRendererTurbo(this, 185, 451, textureX, textureY); // Import Kette19R
		rightTrackModel[19] = new ModelRendererTurbo(this, 208, 454, textureX, textureY); // Import Kette20R

		rightTrackModel[0].addBox(0F, 0F, 0F, 86, 1, 14, 0F); // Import Kette1R
		rightTrackModel[0].setRotationPoint(-35F, 9F, 19F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 15, 1, 14, 0F); // Import Kette2R
		rightTrackModel[1].setRotationPoint(65F, 5F, 19F);
		rightTrackModel[1].rotateAngleZ = -2.80998F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Import Kette3R
		rightTrackModel[2].setRotationPoint(65F, 5F, 19F);
		rightTrackModel[2].rotateAngleZ = 2.356194F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Import Kette4R
		rightTrackModel[3].setRotationPoint(71F, -1F, 19F);
		rightTrackModel[3].rotateAngleZ = -2.356194F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 7, 14, 0F); // Import Kette5R
		rightTrackModel[4].setRotationPoint(70F, -8F, 19F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Import Kette6R
		rightTrackModel[5].setRotationPoint(71F, -8F, 19F);
		rightTrackModel[5].rotateAngleZ = -2.356194F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Import Kette7R
		rightTrackModel[6].setRotationPoint(65F, -14F, 19F);
		rightTrackModel[6].rotateAngleZ = -0.78539816F;

		rightTrackModel[7].addBox(0F, 0F, 0F, 7, 1, 14, 0F); // Import Kette8R
		rightTrackModel[7].setRotationPoint(58F, -14F, 19F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 1, 21, 14, 0F); // Import Kette9R
		rightTrackModel[8].setRotationPoint(58F, -14F, 19F);
		rightTrackModel[8].rotateAngleZ = -1.448623F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 30, 14, 0F); // Import Kette10R
		rightTrackModel[9].setRotationPoint(8F, -8F, 19F);
		rightTrackModel[9].rotateAngleZ = 1.658063F;

		rightTrackModel[10].addBox(0F, 0F, 0F, 26, 1, 14, 0F); // Import Kette11R
		rightTrackModel[10].setRotationPoint(-18F, -9F, 19F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Import Kette12R
		rightTrackModel[11].setRotationPoint(-18F, -8F, 19F);
		rightTrackModel[11].rotateAngleZ = 3.10145008F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Import Kette13R
		rightTrackModel[12].setRotationPoint(-41F, -11F, 19F);
		rightTrackModel[12].rotateAngleZ = -0.1186824F;

		rightTrackModel[13].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Import Kette14R
		rightTrackModel[13].setRotationPoint(-47F, -11F, 19F);

		rightTrackModel[14].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Import Kette15R
		rightTrackModel[14].setRotationPoint(-47F, -11F, 19F);
		rightTrackModel[14].rotateAngleZ = -0.78539816F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Import Kette16R
		rightTrackModel[15].setRotationPoint(-51F, -7F, 19F);
		rightTrackModel[15].rotateAngleZ = 0.78539816F;

		rightTrackModel[16].addBox(0F, 0F, 0F, 1, 6, 14, 0F); // Import Kette17R
		rightTrackModel[16].setRotationPoint(-51F, -7F, 19F);

		rightTrackModel[17].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Import Kette18R
		rightTrackModel[17].setRotationPoint(-51F, -1F, 19F);
		rightTrackModel[17].rotateAngleZ = 0.78539816F;

		rightTrackModel[18].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Import Kette19R
		rightTrackModel[18].setRotationPoint(-47F, 3F, 19F);
		rightTrackModel[18].rotateAngleZ = 2.356194F;

		rightTrackModel[19].addBox(0F, 0F, 0F, 1, 16, 14, 0F); // Import Kette20R
		rightTrackModel[19].setRotationPoint(-47F, 3F, 19F);
		rightTrackModel[19].rotateAngleZ = 1.0506882F;
		
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
	      gunPart.setRotationPoint(13.5F, -49.0F, -6.0F);
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