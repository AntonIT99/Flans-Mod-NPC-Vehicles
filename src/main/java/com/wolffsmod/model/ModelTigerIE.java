//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WW2_Vehicle_TigerI_1
// Model Creator: 
// Created on: 05.01.2016 - 10:13:55
// Last changed on: 05.01.2016 - 10:13:55

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelTigerIE extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	//ModelRendererTurbo[][] MGFrontModel;

	public ModelTigerIE() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[115];
		bodyModel[0] = new ModelRendererTurbo(this, 260, 200, textureX, textureY); // Import Achse1
		bodyModel[1] = new ModelRendererTurbo(this, 65, 430, textureX, textureY); // Import Achse2
		bodyModel[2] = new ModelRendererTurbo(this, 140, 435, textureX, textureY); // Import Achse3
		bodyModel[3] = new ModelRendererTurbo(this, 65, 430, textureX, textureY); // Import Achse4
		bodyModel[4] = new ModelRendererTurbo(this, 140, 435, textureX, textureY); // Import Achse5
		bodyModel[5] = new ModelRendererTurbo(this, 65, 430, textureX, textureY); // Import Achse6
		bodyModel[6] = new ModelRendererTurbo(this, 140, 435, textureX, textureY); // Import Achse7
		bodyModel[7] = new ModelRendererTurbo(this, 65, 430, textureX, textureY); // Import Achse8
		bodyModel[8] = new ModelRendererTurbo(this, 140, 435, textureX, textureY); // Import Achse9
		bodyModel[9] = new ModelRendererTurbo(this, 65, 430, textureX, textureY); // Import Achse10
		bodyModel[10] = new ModelRendererTurbo(this, 65, 450, textureX, textureY); // Import KetteRes1
		bodyModel[11] = new ModelRendererTurbo(this, 220, 467, textureX, textureY); // Import KetteRes2
		bodyModel[12] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Import SchlepV1
		bodyModel[13] = new ModelRendererTurbo(this, 10, 495, textureX, textureY); // Import SchlepV2
		bodyModel[14] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Schaufel1
		bodyModel[15] = new ModelRendererTurbo(this, 20, 485, textureX, textureY); // Import Schaufel2
		bodyModel[16] = new ModelRendererTurbo(this, 20, 485, textureX, textureY); // Import Schaufel3
		bodyModel[17] = new ModelRendererTurbo(this, 20, 490, textureX, textureY); // Import Schaufel4
		bodyModel[18] = new ModelRendererTurbo(this, 0, 465, textureX, textureY); // Import MG1Trap
		bodyModel[19] = new ModelRendererTurbo(this, 23, 465, textureX, textureY); // Import MG2
		bodyModel[20] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Sicht1Trap
		bodyModel[21] = new ModelRendererTurbo(this, 16, 428, textureX, textureY); // Import Sicht2
		bodyModel[22] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import LampeR1Trap
		bodyModel[23] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import LampeR2
		bodyModel[24] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import LampeL1Trap
		bodyModel[25] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import LampeL2
		bodyModel[26] = new ModelRendererTurbo(this, 50, 430, textureX, textureY); // Import Kiste
		bodyModel[27] = new ModelRendererTurbo(this, 345, 370, textureX, textureY); // Import Luke1Shape
		bodyModel[28] = new ModelRendererTurbo(this, 6, 430, textureX, textureY); // Import Luke1Trap
		bodyModel[29] = new ModelRendererTurbo(this, 390, 370, textureX, textureY); // Import Luke2Shape
		bodyModel[30] = new ModelRendererTurbo(this, 35, 430, textureX, textureY); // Import Luke2Trap
		bodyModel[31] = new ModelRendererTurbo(this, 65, 465, textureX, textureY); // Import Axt1
		bodyModel[32] = new ModelRendererTurbo(this, 65, 465, textureX, textureY); // Import Axt2
		bodyModel[33] = new ModelRendererTurbo(this, 80, 465, textureX, textureY); // Import Axt3
		bodyModel[34] = new ModelRendererTurbo(this, 80, 470, textureX, textureY); // Import Axt4
		bodyModel[35] = new ModelRendererTurbo(this, 65, 450, textureX, textureY); // Import Hammer1
		bodyModel[36] = new ModelRendererTurbo(this, 65, 450, textureX, textureY); // Import Hammer2
		bodyModel[37] = new ModelRendererTurbo(this, 80, 450, textureX, textureY); // Import Hammer3
		bodyModel[38] = new ModelRendererTurbo(this, 80, 455, textureX, textureY); // Import Hammer4
		bodyModel[39] = new ModelRendererTurbo(this, 80, 430, textureX, textureY); // Import Schauf21
		bodyModel[40] = new ModelRendererTurbo(this, 90, 430, textureX, textureY); // Import Schauf22
		bodyModel[41] = new ModelRendererTurbo(this, 90, 438, textureX, textureY); // Import Schauf23
		bodyModel[42] = new ModelRendererTurbo(this, 97, 430, textureX, textureY); // Import Schauf24
		bodyModel[43] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import H1
		bodyModel[44] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import H2
		bodyModel[45] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import H3
		bodyModel[46] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import H4
		bodyModel[47] = new ModelRendererTurbo(this, 100, 450, textureX, textureY); // Import LuftK1
		bodyModel[48] = new ModelRendererTurbo(this, 100, 463, textureX, textureY); // Import LuftK2
		bodyModel[49] = new ModelRendererTurbo(this, 435, 370, textureX, textureY); // Import LuftShape
		bodyModel[50] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Import Luft1
		bodyModel[51] = new ModelRendererTurbo(this, 140, 440, textureX, textureY); // Import Luft2
		bodyModel[52] = new ModelRendererTurbo(this, 140, 450, textureX, textureY); // Import Luft3
		bodyModel[53] = new ModelRendererTurbo(this, 140, 455, textureX, textureY); // Import Luft4
		bodyModel[54] = new ModelRendererTurbo(this, 140, 460, textureX, textureY); // Import Luft5
		bodyModel[55] = new ModelRendererTurbo(this, 140, 465, textureX, textureY); // Import Luft6
		bodyModel[56] = new ModelRendererTurbo(this, 140, 470, textureX, textureY); // Import Luft7
		bodyModel[57] = new ModelRendererTurbo(this, 140, 470, textureX, textureY); // Import Luft8
		bodyModel[58] = new ModelRendererTurbo(this, 157, 470, textureX, textureY); // Import Luft9
		bodyModel[59] = new ModelRendererTurbo(this, 140, 485, textureX, textureY); // Import Luft10
		bodyModel[60] = new ModelRendererTurbo(this, 170, 470, textureX, textureY); // Import Luft11
		bodyModel[61] = new ModelRendererTurbo(this, 185, 470, textureX, textureY); // Import Luft12
		bodyModel[62] = new ModelRendererTurbo(this, 170, 485, textureX, textureY); // Import Luft13
		bodyModel[63] = new ModelRendererTurbo(this, 170, 470, textureX, textureY); // Import Luft14
		bodyModel[64] = new ModelRendererTurbo(this, 220, 430, textureX, textureY); // Import Aufp1
		bodyModel[65] = new ModelRendererTurbo(this, 245, 430, textureX, textureY); // Import Aufp2
		bodyModel[66] = new ModelRendererTurbo(this, 270, 430, textureX, textureY); // Import Ausp3
		bodyModel[67] = new ModelRendererTurbo(this, 290, 430, textureX, textureY); // Import Ausp4
		bodyModel[68] = new ModelRendererTurbo(this, 310, 430, textureX, textureY); // Import Ausp5
		bodyModel[69] = new ModelRendererTurbo(this, 330, 430, textureX, textureY); // Import Ausp6
		bodyModel[70] = new ModelRendererTurbo(this, 350, 430, textureX, textureY); // Import Ausp7
		bodyModel[71] = new ModelRendererTurbo(this, 370, 430, textureX, textureY); // Import Ausp8
		bodyModel[72] = new ModelRendererTurbo(this, 280, 460, textureX, textureY); // Import F1
		bodyModel[73] = new ModelRendererTurbo(this, 280, 480, textureX, textureY); // Import F2
		bodyModel[74] = new ModelRendererTurbo(this, 305, 480, textureX, textureY); // Import F3
		bodyModel[75] = new ModelRendererTurbo(this, 290, 500, textureX, textureY); // Import F4Trap
		bodyModel[76] = new ModelRendererTurbo(this, 315, 500, textureX, textureY); // Import F5Trap
		bodyModel[77] = new ModelRendererTurbo(this, 325, 460, textureX, textureY); // Import F6
		bodyModel[78] = new ModelRendererTurbo(this, 330, 480, textureX, textureY); // Import F7
		bodyModel[79] = new ModelRendererTurbo(this, 355, 480, textureX, textureY); // Import F8
		bodyModel[80] = new ModelRendererTurbo(this, 340, 500, textureX, textureY); // Import F9Trap
		bodyModel[81] = new ModelRendererTurbo(this, 365, 500, textureX, textureY); // Import F10Trap
		bodyModel[82] = new ModelRendererTurbo(this, 390, 415, textureX, textureY); // Import SB1
		bodyModel[83] = new ModelRendererTurbo(this, 390, 415, textureX, textureY); // Import SB2
		bodyModel[84] = new ModelRendererTurbo(this, 420, 415, textureX, textureY); // Import SB3
		bodyModel[85] = new ModelRendererTurbo(this, 420, 415, textureX, textureY); // Import SB4
		bodyModel[86] = new ModelRendererTurbo(this, 305, 415, textureX, textureY); // Import SchlepH1
		bodyModel[87] = new ModelRendererTurbo(this, 320, 415, textureX, textureY); // Import SchlepH2
		bodyModel[88] = new ModelRendererTurbo(this, 320, 415, textureX, textureY); // Import SchlepH3
		bodyModel[89] = new ModelRendererTurbo(this, 305, 415, textureX, textureY); // Import SchlepH4
		bodyModel[90] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import Motor1
		bodyModel[91] = new ModelRendererTurbo(this, 55, 350, textureX, textureY); // Import Motor2
		bodyModel[92] = new ModelRendererTurbo(this, 94, 355, textureX, textureY); // Import Motor3
		bodyModel[93] = new ModelRendererTurbo(this, 135, 345, textureX, textureY); // Import Motor4
		bodyModel[94] = new ModelRendererTurbo(this, 330, 415, textureX, textureY); // Import Heck1
		bodyModel[95] = new ModelRendererTurbo(this, 350, 415, textureX, textureY); // Import Heck2
		bodyModel[96] = new ModelRendererTurbo(this, 370, 415, textureX, textureY); // Import Heck3
		bodyModel[97] = new ModelRendererTurbo(this, 305, 422, textureX, textureY); // Import Heck4
		bodyModel[98] = new ModelRendererTurbo(this, 220, 460, textureX, textureY); // Import Heck5
		bodyModel[99] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Import 
		bodyModel[100] = new ModelRendererTurbo(this, 257, 275, textureX, textureY); // Import 
		bodyModel[101] = new ModelRendererTurbo(this, 0, 210, textureX, textureY); // Import 
		bodyModel[102] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import 
		bodyModel[103] = new ModelRendererTurbo(this, 205, 300, textureX, textureY); // Import 
		bodyModel[104] = new ModelRendererTurbo(this, 205, 325, textureX, textureY); // Import 
		bodyModel[105] = new ModelRendererTurbo(this, 215, 300, textureX, textureY); // Import 
		bodyModel[106] = new ModelRendererTurbo(this, 215, 325, textureX, textureY); // Import 
		bodyModel[107] = new ModelRendererTurbo(this, 235, 125, textureX, textureY); // Import 
		bodyModel[108] = new ModelRendererTurbo(this, 260, 125, textureX, textureY); // Import 
		bodyModel[109] = new ModelRendererTurbo(this, 290, 125, textureX, textureY); // Import 
		bodyModel[110] = new ModelRendererTurbo(this, 260, 300, textureX, textureY); // Import KetteRes1H
		bodyModel[111] = new ModelRendererTurbo(this, 335, 300, textureX, textureY); // Import KetteRes2H
		bodyModel[112] = new ModelRendererTurbo(this, 115, 299, textureX, textureY); // Import TurmLuke2
		bodyModel[113] = new ModelRendererTurbo(this, 425, 0, textureX, textureY); // Import Barrel
		
		bodyModel[114] = new ModelRendererTurbo(this, 425, 0, this.textureX, this.textureY);
	    
		bodyModel[114].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
	    bodyModel[114].setRotationPoint(47.0F, -18.5F, -11.5F);

		bodyModel[0].addBox(0F, 0F, 0F, 3, 3, 59, 0F); // Import Achse1
		bodyModel[0].setRotationPoint(-47F, -2F, -29.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 3, 65, 0F); // Import Achse2
		bodyModel[1].setRotationPoint(-33.5F, -0.5F, -32.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 3, 69, 0F); // Import Achse3
		bodyModel[2].setRotationPoint(-23.5F, -0.5F, -34.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 3, 65, 0F); // Import Achse4
		bodyModel[3].setRotationPoint(-13.5F, -0.5F, -32.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 3, 69, 0F); // Import Achse5
		bodyModel[4].setRotationPoint(-3.5F, -0.5F, -34.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 3, 65, 0F); // Import Achse6
		bodyModel[5].setRotationPoint(6.5F, -0.5F, -32.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 3, 69, 0F); // Import Achse7
		bodyModel[6].setRotationPoint(16.5F, -0.5F, -34.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 3, 65, 0F); // Import Achse8
		bodyModel[7].setRotationPoint(26.5F, -0.5F, -32.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 3, 69, 0F); // Import Achse9
		bodyModel[8].setRotationPoint(36.5F, -0.5F, -34.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 3, 65, 0F); // Import Achse10
		bodyModel[9].setRotationPoint(50F, -5F, -32.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 10, 30, 0F); // Import KetteRes1
		bodyModel[10].setRotationPoint(59.3F, -11F, -15F);
		bodyModel[10].rotateAngleZ = -0.31415927F;

		bodyModel[11].addBox(0F, 0F, 0F, 10, 1, 30, 0F); // Import KetteRes2
		bodyModel[11].setRotationPoint(46F, 2.4F, -15F);
		bodyModel[11].rotateAngleZ = 0.38397243F;

		bodyModel[12].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import SchlepV1
		bodyModel[12].setRotationPoint(60.5F, -4.5F, -20.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import SchlepV2
		bodyModel[13].setRotationPoint(60.5F, -4.5F, 18.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Import Schaufel1
		bodyModel[14].setRotationPoint(55F, -14.5F, -12F);
		bodyModel[14].rotateAngleZ = -0.1919862F;

		bodyModel[15].addBox(1F, 0.2F, 5F, 1, 1, 15, 0F); // Import Schaufel2
		bodyModel[15].setRotationPoint(55F, -14.5F, -12F);
		bodyModel[15].rotateAngleZ = -0.1919862F;

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Import Schaufel3
		bodyModel[16].setRotationPoint(54.5F, -14.7F, -12.5F);
		bodyModel[16].rotateAngleZ = -0.1919862F;

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Import Schaufel4
		bodyModel[17].setRotationPoint(55.5F, -14.4F, 5.5F);
		bodyModel[17].rotateAngleZ = -0.1919862F;

		bodyModel[18].addTrapezoid(0F, 0F, 0F, 3, 7, 7, 0F, -1.0F, ModelRendererTurbo.MR_LEFT); // Import MG1Trap
		bodyModel[18].setRotationPoint(44F, -22F, -15F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Import MG2
		bodyModel[19].setRotationPoint(46.5F, -19.5F, -13F);

		bodyModel[20].addTrapezoid(0F, 0F, 0F, 1, 6, 11, 0F, -0.2F, ModelRendererTurbo.MR_TOP); // Import Sicht1Trap
		bodyModel[20].setRotationPoint(47F, -17F, 5F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 6, 13, 0F); // Import Sicht2
		bodyModel[21].setRotationPoint(44F, -21F, 4F);

		bodyModel[22].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.3F, ModelRendererTurbo.MR_RIGHT); // Import LampeR1Trap
		bodyModel[22].setRotationPoint(41F, -27.5F, 29.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import LampeR2
		bodyModel[23].setRotationPoint(41.5F, -26.5F, 30F);

		bodyModel[24].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.3F, ModelRendererTurbo.MR_RIGHT); // Import LampeL1Trap
		bodyModel[24].setRotationPoint(41F, -27.5F, -31.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import LampeL2
		bodyModel[25].setRotationPoint(41.5F, -26.5F, -31F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 2, 13, 0F); // Import Kiste
		bodyModel[26].setRotationPoint(34F, -27F, -10F);

		bodyModel[27].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Luke1Shape
		bodyModel[27].setRotationPoint(39F, -25.5F, -11F);
		bodyModel[27].rotateAngleX = 1.57079633F;

		bodyModel[28].addTrapezoid(0F, 0F, 0F, 2, 2, 4, 0F, -0.2F, ModelRendererTurbo.MR_TOP); // Import Luke1Trap
		bodyModel[28].setRotationPoint(33F, -27F, -19F);
		bodyModel[28].rotateAngleY = 0.3490658F;

		bodyModel[29].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Import Luke2Shape
		bodyModel[29].setRotationPoint(39F, -25.5F, 23F);
		bodyModel[29].rotateAngleX = 1.57079633F;

		bodyModel[30].addTrapezoid(0F, 0F, -4F, 2, 2, 4, 0F, -0.2F, ModelRendererTurbo.MR_TOP); // Import Luke2Trap
		bodyModel[30].setRotationPoint(33F, -27F, 19F);
		bodyModel[30].rotateAngleY = -0.3490658F;

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Import Axt1
		bodyModel[31].setRotationPoint(39F, -25.5F, -28F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import Axt2
		bodyModel[32].setRotationPoint(41F, -25.4F, -26F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Axt3
		bodyModel[33].setRotationPoint(40.5F, -26F, -25F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Axt4
		bodyModel[34].setRotationPoint(40.5F, -26F, -18F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Import Hammer1
		bodyModel[35].setRotationPoint(40F, -25.5F, 26F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Import Hammer2
		bodyModel[36].setRotationPoint(41F, -25.4F, 16F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Hammer3
		bodyModel[37].setRotationPoint(40.5F, -26F, 24F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Hammer4
		bodyModel[38].setRotationPoint(40.5F, -26F, 17F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Import Schauf21
		bodyModel[39].setRotationPoint(29F, -25.5F, 5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Import Schauf22
		bodyModel[40].setRotationPoint(30F, -25.4F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Import Schauf23
		bodyModel[41].setRotationPoint(28.5F, -26F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Schauf24
		bodyModel[42].setRotationPoint(29.5F, -26F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import H1
		bodyModel[43].setRotationPoint(10F, -25.5F, -31.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import H2
		bodyModel[44].setRotationPoint(-11F, -25.5F, -31.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import H3
		bodyModel[45].setRotationPoint(10F, -25.5F, 26.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import H4
		bodyModel[46].setRotationPoint(-11F, -25.5F, 26.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Import LuftK1
		bodyModel[47].setRotationPoint(-41F, -26.5F, -21F);
		bodyModel[47].rotateAngleY = -0.5235988F;

		bodyModel[48].addBox(1F, 1F, 3F, 1, 1, 7, 0F); // Import LuftK2
		bodyModel[48].setRotationPoint(-41F, -26.5F, -21F);
		bodyModel[48].rotateAngleY = -0.5235988F;

		bodyModel[49].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import LuftShape
		bodyModel[49].setRotationPoint(-32F, -27F, 5F);
		bodyModel[49].rotateAngleX = 1.57079633F;

		bodyModel[50].addBox(0F, 0F, 0F, 11, 2, 3, 0F); // Import Luft1
		bodyModel[50].setRotationPoint(-36F, -26.5F, 6F);
		bodyModel[50].rotateAngleY = -0.1396263F;

		bodyModel[51].addBox(0F, 0F, -3F, 11, 2, 3, 0F); // Import Luft2
		bodyModel[51].setRotationPoint(-36F, -26.5F, -6F);
		bodyModel[51].rotateAngleY = 0.1396263F;

		bodyModel[52].addBox(0F, 0F, 0F, 25, 2, 2, 0F); // Import Luft3
		bodyModel[52].setRotationPoint(-58F, -26.5F, 18F);
		bodyModel[52].rotateAngleY = -0.4886922F;

		bodyModel[53].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Import Luft4
		bodyModel[53].setRotationPoint(-58F, -26.5F, 15F);
		bodyModel[53].rotateAngleY = -0.5061455F;

		bodyModel[54].addBox(0F, 0F, -2F, 26, 2, 2, 0F); // Import Luft5
		bodyModel[54].setRotationPoint(-58F, -26.5F, -15F);
		bodyModel[54].rotateAngleY = 0.5061455F;

		bodyModel[55].addBox(0F, 0F, -2F, 25, 2, 2, 0F); // Import Luft6
		bodyModel[55].setRotationPoint(-58F, -26.5F, -18F);
		bodyModel[55].rotateAngleY = 0.4886922F;

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Import Luft7
		bodyModel[56].setRotationPoint(-58F, -26.5F, 18F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Luft8
		bodyModel[57].setRotationPoint(-58F, -26.5F, 15F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import Luft9
		bodyModel[58].setRotationPoint(-58F, -24.5F, 15F);
		bodyModel[58].rotateAngleZ = 0.1047198F;

		bodyModel[59].addBox(0F, 4F, 0F, 2, 2, 7, 0F); // Import Luft10
		bodyModel[59].setRotationPoint(-58F, -24.5F, 15F);
		bodyModel[59].rotateAngleZ = 0.1047198F;

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Luft11
		bodyModel[60].setRotationPoint(-58F, -26.5F, -17F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import Luft12
		bodyModel[61].setRotationPoint(-58F, -24.5F, -17F);
		bodyModel[61].rotateAngleZ = 0.1047198F;

		bodyModel[62].addBox(0F, 4F, -7F, 2, 2, 7, 0F); // Import Luft13
		bodyModel[62].setRotationPoint(-58F, -24.5F, -15F);
		bodyModel[62].rotateAngleZ = 0.1047198F;

		bodyModel[63].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Import Luft14
		bodyModel[63].setRotationPoint(-58F, -26.5F, -28F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 21, 5, 0F); // Import Aufp1
		bodyModel[64].setRotationPoint(-60F, -28F, 5F);
		bodyModel[64].rotateAngleZ = 0.1047198F;

		bodyModel[65].addBox(0F, 0F, 0F, 5, 21, 5, 0F); // Import Aufp2
		bodyModel[65].setRotationPoint(-60F, -28F, -10F);
		bodyModel[65].rotateAngleZ = 0.1047198F;

		bodyModel[66].addBox(0F, 0F, 0F, 1, 21, 7, 0F); // Import Ausp3
		bodyModel[66].setRotationPoint(-61F, -26F, 11F);
		bodyModel[66].rotateAngleX = 0.1047198F;
		bodyModel[66].rotateAngleY = -1.37881F;
		bodyModel[66].rotateAngleZ = -0.01745329F;

		bodyModel[67].addBox(0F, 0F, 0F, 1, 21, 7, 0F); // Import Ausp4
		bodyModel[67].setRotationPoint(-61F, -26F, 4F);
		bodyModel[67].rotateAngleZ = 0.1047198F;

		bodyModel[68].addBox(-1F, 0F, 0F, 1, 21, 7, 0F); // Import Ausp5
		bodyModel[68].setRotationPoint(-61F, -26F, 4F);
		bodyModel[68].rotateAngleX = 0.1047198F;
		bodyModel[68].rotateAngleY = -1.762783F;
		bodyModel[68].rotateAngleZ = 0.01745329F;

		bodyModel[69].addBox(0F, 0F, 0F, 1, 21, 7, 0F); // Import Ausp6
		bodyModel[69].setRotationPoint(-61F, -26F, -4F);
		bodyModel[69].rotateAngleX = 0.1047198F;
		bodyModel[69].rotateAngleY = -1.37881F;
		bodyModel[69].rotateAngleZ = -0.01745329F;

		bodyModel[70].addBox(0F, 0F, 0F, 1, 21, 7, 0F); // Import Ausp7
		bodyModel[70].setRotationPoint(-61F, -26F, -11F);
		bodyModel[70].rotateAngleZ = 0.1047198F;

		bodyModel[71].addBox(-1F, 0F, 0F, 1, 21, 7, 0F); // Import Ausp8
		bodyModel[71].setRotationPoint(-61F, -26F, -11F);
		bodyModel[71].rotateAngleX = 0.1047198F;
		bodyModel[71].rotateAngleY = -1.762783F;
		bodyModel[71].rotateAngleZ = 0.01745329F;

		bodyModel[72].addBox(0F, 0F, 0F, 7, 3, 13, 0F); // Import F1
		bodyModel[72].setRotationPoint(-61F, -22F, 19F);
		bodyModel[72].rotateAngleZ = 0.1047198F;

		bodyModel[73].addBox(1F, -5F, 1F, 5, 9, 5, 0F); // Import F2
		bodyModel[73].setRotationPoint(-61F, -22F, 19F);
		bodyModel[73].rotateAngleZ = 0.1047198F;

		bodyModel[74].addBox(1F, -5F, 7F, 5, 9, 5, 0F); // Import F3
		bodyModel[74].setRotationPoint(-61F, -22F, 19F);
		bodyModel[74].rotateAngleZ = 0.1047198F;

		bodyModel[75].addTrapezoid(1F, 4F, 1F, 5, 1, 5, 0F, -1.0F, ModelRendererTurbo.MR_BOTTOM); // Import F4Trap
		bodyModel[75].setRotationPoint(-61F, -22F, 19F);
		bodyModel[75].rotateAngleZ = 0.1047198F;

		bodyModel[76].addTrapezoid(1F, 4F, 7F, 5, 1, 5, 0F, -1.0F, ModelRendererTurbo.MR_BOTTOM); // Import F5Trap
		bodyModel[76].setRotationPoint(-61F, -22F, 19F);
		bodyModel[76].rotateAngleZ = 0.1047198F;

		bodyModel[77].addBox(0F, 0F, 0F, 7, 3, 13, 0F); // Import F6
		bodyModel[77].setRotationPoint(-61F, -22F, -32F);
		bodyModel[77].rotateAngleZ = 0.1047198F;

		bodyModel[78].addBox(1F, -5F, 7F, 5, 9, 5, 0F); // Import F7
		bodyModel[78].setRotationPoint(-61F, -22F, -32F);
		bodyModel[78].rotateAngleZ = 0.1047198F;

		bodyModel[79].addBox(1F, -5F, 1F, 5, 9, 5, 0F); // Import F8
		bodyModel[79].setRotationPoint(-61F, -22F, -32F);
		bodyModel[79].rotateAngleZ = 0.1047198F;

		bodyModel[80].addTrapezoid(1F, 4F, 7F, 5, 1, 5, 0F, -1.0F, ModelRendererTurbo.MR_BOTTOM); // Import F9Trap
		bodyModel[80].setRotationPoint(-61F, -22F, -32F);
		bodyModel[80].rotateAngleZ = 0.1047198F;

		bodyModel[81].addTrapezoid(1F, 4F, 1F, 5, 1, 5, 0F, -1.0F, ModelRendererTurbo.MR_BOTTOM); // Import F10Trap
		bodyModel[81].setRotationPoint(-61F, -22F, -32F);
		bodyModel[81].rotateAngleZ = 0.1047198F;

		bodyModel[82].addBox(0F, 1F, 13F, 1, 5, 4, 0F); // Import SB1
		bodyModel[82].setRotationPoint(-53F, -11F, 19F);
		bodyModel[82].rotateAngleZ = -0.78539816F;

		bodyModel[83].addBox(0F, 0F, 0F, 1, 6, 13, 0F); // Import SB2
		bodyModel[83].setRotationPoint(-53F, -11F, 19F);
		bodyModel[83].rotateAngleZ = -0.78539816F;

		bodyModel[84].addBox(0F, 0F, 0F, 1, 6, 13, 0F); // Import SB3
		bodyModel[84].setRotationPoint(-53F, -11F, -32F);
		bodyModel[84].rotateAngleZ = -0.78539816F;

		bodyModel[85].addBox(0F, 1F, -4F, 1, 5, 4, 0F); // Import SB4
		bodyModel[85].setRotationPoint(-53F, -11F, -32F);
		bodyModel[85].rotateAngleZ = -0.78539816F;

		bodyModel[86].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Import SchlepH1
		bodyModel[86].setRotationPoint(-56F, -9F, 16F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import SchlepH2
		bodyModel[87].setRotationPoint(-55F, -8F, 15.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import SchlepH3
		bodyModel[88].setRotationPoint(-55F, -8F, -17.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Import SchlepH4
		bodyModel[89].setRotationPoint(-56F, -9F, -17F);

		bodyModel[90].addBox(0F, 0F, 0F, 15, 1, 19, 0F); // Import Motor1
		bodyModel[90].setRotationPoint(-36F, -25.2F, 12F);

		bodyModel[91].addBox(0F, 0F, 0F, 9, 1, 19, 0F); // Import Motor2
		bodyModel[91].setRotationPoint(-54F, -25.2F, 12F);

		bodyModel[92].addBox(0F, 0F, 0F, 9, 1, 19, 0F); // Import Motor3
		bodyModel[92].setRotationPoint(-54F, -25.2F, -31F);

		bodyModel[93].addBox(0F, 0F, 0F, 15, 1, 19, 0F); // Import Motor4
		bodyModel[93].setRotationPoint(-36F, -25.2F, -31F);

		bodyModel[94].addTrapezoid(0F, 0F, 0F, 4, 3, 3, 0F, -0.3F, ModelRendererTurbo.MR_RIGHT); // Import Heck1
		bodyModel[94].setRotationPoint(-54.5F, -2F, 12F);
		bodyModel[94].rotateAngleZ = 0.1047198F;

		bodyModel[95].addTrapezoid(0F, 0F, 0F, 4, 3, 3, 0F, -0.3F, ModelRendererTurbo.MR_RIGHT); // Import Heck2
		bodyModel[95].setRotationPoint(-54.5F, -2F, -15F);
		bodyModel[95].rotateAngleZ = 0.1047198F;

		bodyModel[96].addTrapezoid(0F, 0F, 0F, 4, 4, 4, 0F, -0.3F, ModelRendererTurbo.MR_RIGHT); // Import Heck3
		bodyModel[96].setRotationPoint(-55F, -6F, -2F);
		bodyModel[96].rotateAngleZ = 0.1047198F;

		bodyModel[97].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Import Heck4
		bodyModel[97].setRotationPoint(-54F, -4F, -1F);
		bodyModel[97].rotateAngleZ = 0.1047198F;

		bodyModel[98].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Heck5
		bodyModel[98].setRotationPoint(-55.5F, -23F, -2F);
		bodyModel[98].rotateAngleZ = 0.1047198F;

		bodyModel[99].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(16, 0, 16, 0), new Coord2D(113, 0, 113, 0), new Coord2D(115, 13, 115, 13), new Coord2D(17, 19, 17, 19), new Coord2D(2, 16, 2, 16), new Coord2D(0, 15, 0, 15), new Coord2D(0, 7, 0, 7) }), 1, 115, 19, 255, 1, ModelRendererTurbo.MR_FRONT, new float[] {18 ,8 ,3 ,16 ,99 ,14 ,97}); // Import 
		bodyModel[99].setRotationPoint(62F, 3F, -19F);

		bodyModel[100].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(16, 0, 16, 0), new Coord2D(113, 0, 113, 0), new Coord2D(115, 13, 115, 13), new Coord2D(17, 19, 17, 19), new Coord2D(2, 16, 2, 16), new Coord2D(0, 15, 0, 15), new Coord2D(0, 7, 0, 7) }), 1, 115, 19, 255, 1, ModelRendererTurbo.MR_FRONT, new float[] {18 ,8 ,3 ,16 ,99 ,14 ,97}); // Import 
		bodyModel[100].setRotationPoint(62F, 3F, 20F);

		bodyModel[101].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(14, 0, 14, 0), new Coord2D(111, 0, 111, 0), new Coord2D(113, 13, 113, 13), new Coord2D(15, 19, 15, 19), new Coord2D(0, 16, 0, 16), new Coord2D(5, 4, 5, 4) }), 38, 113, 19, 249, 38, ModelRendererTurbo.MR_FRONT, new float[] {10 ,13 ,16 ,99 ,14 ,97}); // Import 
		bodyModel[101].setRotationPoint(60F, 3F, 19F);

		bodyModel[102].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(15, 4, 15, 4), new Coord2D(55, 1, 55, 1), new Coord2D(99, 0, 99, 0), new Coord2D(101, 15, 101, 15), new Coord2D(2, 15, 2, 15) }), 64, 101, 15, 228, 64, ModelRendererTurbo.MR_FRONT, new float[] {12 ,99 ,16 ,45 ,41 ,15}); // Import 
		bodyModel[102].setRotationPoint(46F, -10F, 32F);

		bodyModel[103].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 2, 2, 2), new Coord2D(0, 1, 0, 1), new Coord2D(0, 0, 0, 0), new Coord2D(2, 1, 2, 1) }), 16, 2, 2, 8, 16, ModelRendererTurbo.MR_FRONT, new float[] {1 ,3 ,1 ,3}); // Import 
		bodyModel[103].setRotationPoint(62F, -11F, 36F);

		bodyModel[104].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 2, 2, 2), new Coord2D(0, 1, 0, 1), new Coord2D(0, 0, 0, 0), new Coord2D(2, 1, 2, 1) }), 16, 2, 2, 8, 16, ModelRendererTurbo.MR_FRONT, new float[] {1 ,3 ,1 ,3}); // Import 
		bodyModel[104].setRotationPoint(62F, -11F, -20F);

		bodyModel[105].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(15, 4, 15, 4), new Coord2D(0, 1, 0, 1), new Coord2D(0, 0, 0, 0), new Coord2D(15, 3, 15, 3) }), 16, 15, 4, 34, 16, ModelRendererTurbo.MR_FRONT, new float[] {1 ,16 ,1 ,16}); // Import 
		bodyModel[105].setRotationPoint(60F, -12F, 36F);

		bodyModel[106].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(15, 4, 15, 4), new Coord2D(0, 1, 0, 1), new Coord2D(0, 0, 0, 0), new Coord2D(15, 3, 15, 3) }), 16, 15, 4, 34, 16, ModelRendererTurbo.MR_FRONT, new float[] {1 ,16 ,1 ,16}); // Import 
		bodyModel[106].setRotationPoint(60F, -12F, -20F);

		bodyModel[107].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(0, 4, 0, 4) }), 98, 6, 4, 18, 98, ModelRendererTurbo.MR_FRONT, new float[] {4 ,8 ,6}); // Import 
		bodyModel[107].setRotationPoint(45.2F, -15F, 32F);
		bodyModel[107].rotateAngleX = 0.05061455F;
		bodyModel[107].rotateAngleY = -1.57079633F;

		bodyModel[108].addShape3D(0F, 0F, -98F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(0, 4, 0, 4) }), 98, 6, 4, 18, 98, ModelRendererTurbo.MR_FRONT, new float[] {4 ,8 ,6}); // Import 
		bodyModel[108].setRotationPoint(45.2F, -15F, -32F);
		bodyModel[108].rotateAngleX = -0.05061455F;
		bodyModel[108].rotateAngleY = 1.57079633F;

		bodyModel[109].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(23, 0, 23, 0), new Coord2D(39, 7, 39, 7), new Coord2D(46, 23, 46, 23), new Coord2D(39, 39, 39, 39), new Coord2D(23, 46, 23, 46), new Coord2D(7, 39, 7, 39), new Coord2D(0, 23, 0, 23), new Coord2D(7, 7, 7, 7) }), 2, 46, 46, 144, 2, ModelRendererTurbo.MR_FRONT, new float[] {18 ,18 ,18 ,18 ,18 ,18 ,18 ,18}); // Import 
		bodyModel[109].setRotationPoint(23F, -26F, 23F);
		bodyModel[109].rotateAngleX = 1.57079633F;

		bodyModel[110].addBox(-1F, 4F, 0F, 3, 2, 32, 0F); // Import KetteRes1H
		bodyModel[110].setRotationPoint(59.3F, -11F, -16F);
		bodyModel[110].rotateAngleZ = -0.31415927F;

		bodyModel[111].addBox(4F, -1F, 0F, 2, 3, 32, 0F); // Import KetteRes2H
		bodyModel[111].setRotationPoint(46F, 2.4F, -16F);
		bodyModel[111].rotateAngleZ = 0.3839724F;

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import TurmLuke2
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addBox(-2F, -0.5F, -0.5F, 7, 1, 1, 0F); // Import Barrel
		bodyModel[113].setRotationPoint(0F, 0F, 0F);


		turretModel = new ModelRendererTurbo[10];
		turretModel[0] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import TurmF
		turretModel[1] = new ModelRendererTurbo(this, 40, 300, textureX, textureY); // Import TurmLuke1
		turretModel[2] = new ModelRendererTurbo(this, 70, 325, textureX, textureY); // Import TurmLuke2
		turretModel[3] = new ModelRendererTurbo(this, 115, 300, textureX, textureY); // Import TurmLuke3
		turretModel[4] = new ModelRendererTurbo(this, 190, 325, textureX, textureY); // Import Antenne
		turretModel[5] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Import 
		turretModel[6] = new ModelRendererTurbo(this, 130, 50, textureX, textureY); // Import 
		turretModel[7] = new ModelRendererTurbo(this, 210, 50, textureX, textureY); // Import 
		turretModel[8] = new ModelRendererTurbo(this, 345, 50, textureX, textureY); // Import 
		turretModel[9] = new ModelRendererTurbo(this, 70, 325, textureX, textureY); // Import TurmLuke2

		turretModel[0].addTrapezoid(23F, 3F, -16F, 1, 11, 32, 0F, -0.4F, ModelRendererTurbo.MR_LEFT); // Import TurmF
		turretModel[0].setRotationPoint(0F, -41F, 0F);

		turretModel[1].addTrapezoid(-17F, -44F, 0F, 18, 4, 18, 0F, -0.4F, ModelRendererTurbo.MR_TOP); // Import TurmLuke1
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addTrapezoid(-16F, -46F, 1F, 16, 2, 16, 0F, -2F, ModelRendererTurbo.MR_TOP); // Import TurmLuke2
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addBox(-9F, -42F, -19F, 10, 3, 13, 0F); // Import TurmLuke3
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addTrapezoid(-29F, -22F, -13F, 1, 32, 1, 0F, -0.3F, ModelRendererTurbo.MR_TOP); // Import Antenne
		turretModel[4].setRotationPoint(0F, -41F, 0F);

		turretModel[5].addShape3D(0F, -23F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(8, 0, 8, 0), new Coord2D(17, 4, 17, 4), new Coord2D(23, 12, 23, 12), new Coord2D(25, 23, 25, 23), new Coord2D(23, 34, 23, 34), new Coord2D(17, 42, 17, 42), new Coord2D(8, 46, 8, 46), new Coord2D(0, 46, 0, 46) }), 15, 25, 46, 126, 15, ModelRendererTurbo.MR_FRONT, new float[] {46 ,8 ,10 ,10 ,12 ,12 ,10 ,10 ,8}); // Import 
		turretModel[5].setRotationPoint(0F, -41F, 0F);
		turretModel[5].rotateAngleX = 1.57079633F;

		turretModel[6].addShape3D(-20F, -13F, 0.1F, new Shape2D(new Coord2D[] { new Coord2D(0, 3, 0, 3), new Coord2D(11, 0, 11, 0), new Coord2D(13, 9, 13, 9), new Coord2D(13, 17, 13, 17), new Coord2D(11, 26, 11, 26), new Coord2D(0, 23, 0, 23) }), 13, 13, 26, 72, 13, ModelRendererTurbo.MR_FRONT, new float[] {20 ,12 ,10 ,8 ,10 ,12}); // Import 
		turretModel[6].setRotationPoint(0F, -41F, 0F);
		turretModel[6].rotateAngleX = 1.57079633F;

		turretModel[7].addShape3D(23F, -23F, 2F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(21, 0, 21, 0), new Coord2D(23, 0, 23, 0), new Coord2D(23, 46, 23, 46), new Coord2D(21, 46, 21, 46), new Coord2D(0, 39, 0, 39) }), 13, 23, 46, 128, 13, ModelRendererTurbo.MR_FRONT, new float[] {32 ,23 ,2 ,46 ,2 ,23}); // Import 
		turretModel[7].setRotationPoint(0F, -41F, 0F);
		turretModel[7].rotateAngleX = 1.57079633F;

		turretModel[8].addShape3D(23F, -23F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(21, 0, 21, 0), new Coord2D(23, 0, 23, 0), new Coord2D(23, 46, 23, 46), new Coord2D(21, 46, 21, 46), new Coord2D(0, 39, 0, 39) }), 2, 23, 46, 128, 2, ModelRendererTurbo.MR_FRONT, new float[] {32 ,23 ,2 ,46 ,2 ,23}); // Import 
		turretModel[8].setRotationPoint(0F, -41F, 0F);
		turretModel[8].rotateAngleX = 1.57079633F;
		turretModel[8].rotateAngleZ = -0.08707448F;

		turretModel[9].addTrapezoid(-16F, -46F, 1F, 16, 2, 16, 0F, -2F, ModelRendererTurbo.MR_TOP); // Import TurmLuke2
		turretModel[9].setRotationPoint(0F, 0F, 0F);


		barrelModel = new ModelRendererTurbo[12];
		barrelModel[0] = new ModelRendererTurbo(this, 390, 480, textureX, textureY); // Import Rohr1
		barrelModel[1] = new ModelRendererTurbo(this, 390, 445, textureX, textureY); // Import Rohr2Trap
		barrelModel[2] = new ModelRendererTurbo(this, 420, 445, textureX, textureY); // Import Rohr3Trap
		barrelModel[3] = new ModelRendererTurbo(this, 445, 445, textureX, textureY); // Import Rohr4
		barrelModel[4] = new ModelRendererTurbo(this, 490, 445, textureX, textureY); // Import Rohr5Trap
		barrelModel[5] = new ModelRendererTurbo(this, 435, 465, textureX, textureY); // Import Rohr6
		barrelModel[6] = new ModelRendererTurbo(this, 480, 465, textureX, textureY); // Import Rohr7Trap
		barrelModel[7] = new ModelRendererTurbo(this, 425, 480, textureX, textureY); // Import Rohr8Trap
		barrelModel[8] = new ModelRendererTurbo(this, 445, 490, textureX, textureY); // Import Rohr9Trap
		barrelModel[9] = new ModelRendererTurbo(this, 475, 498, textureX, textureY); // Import Rohr10
		barrelModel[10] = new ModelRendererTurbo(this, 475, 490, textureX, textureY); // Import Rohr10
		barrelModel[11] = new ModelRendererTurbo(this, 445, 490, textureX, textureY); // Import Rohr9Trap

		barrelModel[0].addBox(-5F, -5.5F, -10F, 5, 11, 20, 0F); // Import Rohr1
		barrelModel[0].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[1].addTrapezoid(0F, -5.5F, -10F, 2, 11, 20, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr2Trap
		barrelModel[1].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[2].addTrapezoid(2F, -4F, -4F, 4, 8, 8, 0F, -1F, ModelRendererTurbo.MR_LEFT); // Import Rohr3Trap
		barrelModel[2].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[3].addBox(6F, -3F, -3F, 14, 6, 6, 0F); // Import Rohr4
		barrelModel[3].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[4].addTrapezoid(20F, -3F, -3F, 1, 6, 6, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr5Trap
		barrelModel[4].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[5].addBox(21F, -2.5F, -2.5F, 15, 5, 5, 0F); // Import Rohr6
		barrelModel[5].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[6].addTrapezoid(36F, -2.5F, -2.5F, 1, 5, 5, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr7Trap
		barrelModel[6].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[7].addTrapezoid(37F, -2F, -2F, 33, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr8Trap
		barrelModel[7].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[8].addTrapezoid(70F, -3F, -3F, 8, 6, 6, 0F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Rohr9Trap
		barrelModel[8].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[9].addTrapezoid(78F, -3F, -3F, 1, 6, 6, 0F, -0.2F, ModelRendererTurbo.MR_LEFT); // Import Rohr10
		barrelModel[9].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[10].addShapeBox(79F, -1.5F, -1.5F, 5, 3, 3, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Rohr10
		barrelModel[10].setRotationPoint(25F, -32.5F, -1F);

		barrelModel[11].addTrapezoid(70F, -3F, -3F, 8, 6, 6, 0F, -1.5F, ModelRendererTurbo.MR_RIGHT); // Import Rohr9Trap
		barrelModel[11].setRotationPoint(25F, -32.5F, -1F);


		leftTrackWheelModels = new ModelRendererTurbo[19];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 205, 350, textureX, textureY); // Import RadR11
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR21
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR22
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR31
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR32
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR41
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR42
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR51
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR52
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR61
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR62
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR71
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR72
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR81
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR82
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR91
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadR92
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 315, 350, textureX, textureY); // Import RadR101
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 315, 350, textureX, textureY); // Import RadR102

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 4, 13, 13, 48, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import RadR11
		leftTrackWheelModels[0].setRotationPoint(-45.5F, -0.5F, -26F);

		leftTrackWheelModels[1].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR21
		leftTrackWheelModels[1].setRotationPoint(-32F, 1F, -23F);

		leftTrackWheelModels[2].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR22
		leftTrackWheelModels[2].setRotationPoint(-32F, 1F, -29F);

		leftTrackWheelModels[3].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR31
		leftTrackWheelModels[3].setRotationPoint(-22F, 1F, -26F);

		leftTrackWheelModels[4].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR32
		leftTrackWheelModels[4].setRotationPoint(-22F, 1F, -33F);

		leftTrackWheelModels[5].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR41
		leftTrackWheelModels[5].setRotationPoint(-12F, 1F, -23F);

		leftTrackWheelModels[6].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR42
		leftTrackWheelModels[6].setRotationPoint(-12F, 1F, -30F);

		leftTrackWheelModels[7].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR51
		leftTrackWheelModels[7].setRotationPoint(-2F, 1F, -26F);

		leftTrackWheelModels[8].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR52
		leftTrackWheelModels[8].setRotationPoint(-2F, 1F, -33F);

		leftTrackWheelModels[9].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR61
		leftTrackWheelModels[9].setRotationPoint(8F, 1F, -23F);

		leftTrackWheelModels[10].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR62
		leftTrackWheelModels[10].setRotationPoint(8F, 1F, -30F);

		leftTrackWheelModels[11].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR71
		leftTrackWheelModels[11].setRotationPoint(18F, 1F, -26F);

		leftTrackWheelModels[12].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR72
		leftTrackWheelModels[12].setRotationPoint(18F, 1F, -33F);

		leftTrackWheelModels[13].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR81
		leftTrackWheelModels[13].setRotationPoint(28F, 1F, -23F);

		leftTrackWheelModels[14].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR82
		leftTrackWheelModels[14].setRotationPoint(28F, 1F, -30F);

		leftTrackWheelModels[15].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR91
		leftTrackWheelModels[15].setRotationPoint(38F, 1F, -23F);

		leftTrackWheelModels[16].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadR92
		leftTrackWheelModels[16].setRotationPoint(38F, 1F, -33F);

		leftTrackWheelModels[17].addShape3D(7.5F, -7.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 12, 15, 12), new Coord2D(12, 15, 12, 15), new Coord2D(3, 15, 3, 15), new Coord2D(0, 12, 0, 12), new Coord2D(0, 3, 0, 3) }), 2, 15, 15, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,9 ,5 ,9 ,5 ,9 ,5 ,9}); // Import RadR101
		leftTrackWheelModels[17].setRotationPoint(51.5F, -3.5F, -23F);

		leftTrackWheelModels[18].addShape3D(7.5F, -7.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 12, 15, 12), new Coord2D(12, 15, 12, 15), new Coord2D(3, 15, 3, 15), new Coord2D(0, 12, 0, 12), new Coord2D(0, 3, 0, 3) }), 2, 15, 15, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,9 ,5 ,9 ,5 ,9 ,5 ,9}); // Import RadR102
		leftTrackWheelModels[18].setRotationPoint(51.5F, -3.5F, -31F);


		rightTrackWheelModels = new ModelRendererTurbo[19];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 205, 350, textureX, textureY); // Import RadL12
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL21
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL22
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL31
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL32
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL41
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL42
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL51
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL52
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL61
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL62
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL71
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL72
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL81
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL82
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL91
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Import RadL92
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 315, 350, textureX, textureY); // Import RadL101
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 315, 350, textureX, textureY); // Import RadL102

		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 4, 13, 13, 48, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import RadL12
		rightTrackWheelModels[0].setRotationPoint(-45.5F, -0.5F, 26F);

		rightTrackWheelModels[1].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL21
		rightTrackWheelModels[1].setRotationPoint(-32F, 1F, 30F);

		rightTrackWheelModels[2].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL22
		rightTrackWheelModels[2].setRotationPoint(-32F, 1F, 23F);

		rightTrackWheelModels[3].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL31
		rightTrackWheelModels[3].setRotationPoint(-22F, 1F, 33F);

		rightTrackWheelModels[4].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL32
		rightTrackWheelModels[4].setRotationPoint(-22F, 1F, 26F);

		rightTrackWheelModels[5].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL41
		rightTrackWheelModels[5].setRotationPoint(-12F, 1F, 30F);

		rightTrackWheelModels[6].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL42
		rightTrackWheelModels[6].setRotationPoint(-12F, 1F, 23F);

		rightTrackWheelModels[7].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL51
		rightTrackWheelModels[7].setRotationPoint(-2F, 1F, 33F);

		rightTrackWheelModels[8].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL52
		rightTrackWheelModels[8].setRotationPoint(-2F, 1F, 26F);

		rightTrackWheelModels[9].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL61
		rightTrackWheelModels[9].setRotationPoint(8F, 1F, 30F);

		rightTrackWheelModels[10].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL62
		rightTrackWheelModels[10].setRotationPoint(8F, 1F, 23F);

		rightTrackWheelModels[11].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL71
		rightTrackWheelModels[11].setRotationPoint(18F, 1F, 33F);

		rightTrackWheelModels[12].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL72
		rightTrackWheelModels[12].setRotationPoint(18F, 1F, 26F);

		rightTrackWheelModels[13].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL81
		rightTrackWheelModels[13].setRotationPoint(28F, 1F, 30F);

		rightTrackWheelModels[14].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL82
		rightTrackWheelModels[14].setRotationPoint(28F, 1F, 23F);

		rightTrackWheelModels[15].addShape3D(8F, -8F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 2, 16, 16, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL91
		rightTrackWheelModels[15].setRotationPoint(38F, 1F, 33F);

		rightTrackWheelModels[16].addShape3D(8F, -8F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 4, 16, 16, 56, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import RadL92
		rightTrackWheelModels[16].setRotationPoint(38F, 1F, 26F);

		rightTrackWheelModels[17].addShape3D(7.5F, -7.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 12, 15, 12), new Coord2D(12, 15, 12, 15), new Coord2D(3, 15, 3, 15), new Coord2D(0, 12, 0, 12), new Coord2D(0, 3, 0, 3) }), 2, 15, 15, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,9 ,5 ,9 ,5 ,9 ,5 ,9}); // Import RadL101
		rightTrackWheelModels[17].setRotationPoint(51.5F, -3.5F, 31F);

		rightTrackWheelModels[18].addShape3D(7.5F, -7.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 12, 15, 12), new Coord2D(12, 15, 12, 15), new Coord2D(3, 15, 3, 15), new Coord2D(0, 12, 0, 12), new Coord2D(0, 3, 0, 3) }), 2, 15, 15, 56, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,9 ,5 ,9 ,5 ,9 ,5 ,9}); // Import RadL102
		rightTrackWheelModels[18].setRotationPoint(51.5F, -3.5F, 23F);


		leftTrackModel = new ModelRendererTurbo[16];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Kette1L
		leftTrackModel[1] = new ModelRendererTurbo(this, 20, 395, textureX, textureY); // Import Kette2L
		leftTrackModel[2] = new ModelRendererTurbo(this, 40, 405, textureX, textureY); // Import Kette3L
		leftTrackModel[3] = new ModelRendererTurbo(this, 62, 385, textureX, textureY); // Import Kette4L
		leftTrackModel[4] = new ModelRendererTurbo(this, 82, 405, textureX, textureY); // Import Kette5L
		leftTrackModel[5] = new ModelRendererTurbo(this, 85, 380, textureX, textureY); // Import Kette6L
		leftTrackModel[6] = new ModelRendererTurbo(this, 135, 385, textureX, textureY); // Import Kette7L
		leftTrackModel[7] = new ModelRendererTurbo(this, 155, 380, textureX, textureY); // Import Kette8L
		leftTrackModel[8] = new ModelRendererTurbo(this, 180, 367, textureX, textureY); // Import Kette9L
		leftTrackModel[9] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Kette10L
		leftTrackModel[10] = new ModelRendererTurbo(this, 220, 375, textureX, textureY); // Import Kette11L
		leftTrackModel[11] = new ModelRendererTurbo(this, 245, 380, textureX, textureY); // Import Kette12L
		leftTrackModel[12] = new ModelRendererTurbo(this, 270, 400, textureX, textureY); // Import Kette13L
		leftTrackModel[13] = new ModelRendererTurbo(this, 290, 395, textureX, textureY); // Import Kette14L
		leftTrackModel[14] = new ModelRendererTurbo(this, 285, 375, textureX, textureY); // Import Kette15L
		leftTrackModel[15] = new ModelRendererTurbo(this, 305, 370, textureX, textureY); // Import Kette16L

		leftTrackModel[0].addBox(0F, 0F, 0F, 1, 7, 15, 0F); // Import Kette1L
		leftTrackModel[0].setRotationPoint(-53F, -4F, -36F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 1, 3, 15, 0F); // Import Kette2L
		leftTrackModel[1].setRotationPoint(-53F, 3F, -36F);
		leftTrackModel[1].rotateAngleZ = 0.78539816F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Import Kette3L
		leftTrackModel[2].setRotationPoint(-49F, 7F, -36F);
		leftTrackModel[2].rotateAngleZ = 2.356194F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Import Kette4L
		leftTrackModel[3].setRotationPoint(-49F, 7F, -36F);
		leftTrackModel[3].rotateAngleZ = 1.350885F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 78, 1, 15, 0F); // Import Kette5L
		leftTrackModel[4].setRotationPoint(-36F, 9F, -36F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Kette6L
		leftTrackModel[5].setRotationPoint(56F, 5F, -36F);
		leftTrackModel[5].rotateAngleZ = -2.80998F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 1, 3, 15, 0F); // Import Kette7L
		leftTrackModel[6].setRotationPoint(56F, 5F, -36F);
		leftTrackModel[6].rotateAngleZ = 2.356194F;

		leftTrackModel[7].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Import Kette8L
		leftTrackModel[7].setRotationPoint(60F, 1F, -36F);
		leftTrackModel[7].rotateAngleZ = -2.356194F;

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 9, 15, 0F); // Import Kette9L
		leftTrackModel[8].setRotationPoint(59F, -8F, -36F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 1, 3, 15, 0F); // Import Kette10L
		leftTrackModel[9].setRotationPoint(60F, -8F, -36F);
		leftTrackModel[9].rotateAngleZ = -2.356194F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Import Kette11L
		leftTrackModel[10].setRotationPoint(56F, -12F, -36F);
		leftTrackModel[10].rotateAngleZ = -0.78539816F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 9, 1, 15, 0F); // Import Kette12L
		leftTrackModel[11].setRotationPoint(47F, -12F, -36F);

		leftTrackModel[12].addBox(0F, 0F, 0F, 1, 12, 15, 0F); // Import Kette13L
		leftTrackModel[12].setRotationPoint(47F, -12F, -36F);
		leftTrackModel[12].rotateAngleZ = -1.230457F;

		leftTrackModel[13].addBox(0F, 0F, 0F, 85, 1, 15, 0F); // Import Kette14L
		leftTrackModel[13].setRotationPoint(-49F, -8F, -36F);

		leftTrackModel[14].addBox(0F, 0F, 0F, 1, 3, 15, 0F); // Import Kette15L
		leftTrackModel[14].setRotationPoint(-49F, -8F, -36F);
		leftTrackModel[14].rotateAngleZ = -0.78539816F;

		leftTrackModel[15].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Import Kette16L
		leftTrackModel[15].setRotationPoint(-53F, -4F, -36F);
		leftTrackModel[15].rotateAngleZ = 0.78539816F;


		rightTrackModel = new ModelRendererTurbo[16];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Kette1R
		rightTrackModel[1] = new ModelRendererTurbo(this, 20, 395, textureX, textureY); // Import Kette2R
		rightTrackModel[2] = new ModelRendererTurbo(this, 40, 405, textureX, textureY); // Import Kette3R
		rightTrackModel[3] = new ModelRendererTurbo(this, 62, 385, textureX, textureY); // Import Kette4R
		rightTrackModel[4] = new ModelRendererTurbo(this, 82, 405, textureX, textureY); // Import Kette5R
		rightTrackModel[5] = new ModelRendererTurbo(this, 85, 380, textureX, textureY); // Import Kette6R
		rightTrackModel[6] = new ModelRendererTurbo(this, 135, 385, textureX, textureY); // Import Kette7R
		rightTrackModel[7] = new ModelRendererTurbo(this, 155, 380, textureX, textureY); // Import Kette8R
		rightTrackModel[8] = new ModelRendererTurbo(this, 180, 367, textureX, textureY); // Import Kette9R
		rightTrackModel[9] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Kette10R
		rightTrackModel[10] = new ModelRendererTurbo(this, 220, 375, textureX, textureY); // Import Kette11R
		rightTrackModel[11] = new ModelRendererTurbo(this, 245, 380, textureX, textureY); // Import Kette12R
		rightTrackModel[12] = new ModelRendererTurbo(this, 270, 400, textureX, textureY); // Import Kette13R
		rightTrackModel[13] = new ModelRendererTurbo(this, 290, 395, textureX, textureY); // Import Kette14R
		rightTrackModel[14] = new ModelRendererTurbo(this, 285, 375, textureX, textureY); // Import Kette15R
		rightTrackModel[15] = new ModelRendererTurbo(this, 305, 370, textureX, textureY); // Import Kette16R

		rightTrackModel[0].addBox(0F, 0F, 0F, 1, 7, 15, 0F); // Import Kette1R
		rightTrackModel[0].setRotationPoint(-53F, -4F, 21F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 1, 3, 15, 0F); // Import Kette2R
		rightTrackModel[1].setRotationPoint(-53F, 3F, 21F);
		rightTrackModel[1].rotateAngleZ = 0.78539816F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Import Kette3R
		rightTrackModel[2].setRotationPoint(-49F, 7F, 21F);
		rightTrackModel[2].rotateAngleZ = 2.356194F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Import Kette4R
		rightTrackModel[3].setRotationPoint(-49F, 7F, 21F);
		rightTrackModel[3].rotateAngleZ = 1.350885F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 78, 1, 15, 0F); // Import Kette5R
		rightTrackModel[4].setRotationPoint(-36F, 9F, 21F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Kette6R
		rightTrackModel[5].setRotationPoint(56F, 5F, 21F);
		rightTrackModel[5].rotateAngleZ = -2.80998F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 1, 3, 15, 0F); // Import Kette7R
		rightTrackModel[6].setRotationPoint(56F, 5F, 21F);
		rightTrackModel[6].rotateAngleZ = 2.356194F;

		rightTrackModel[7].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Import Kette8R
		rightTrackModel[7].setRotationPoint(60F, 1F, 21F);
		rightTrackModel[7].rotateAngleZ = -2.356194F;

		rightTrackModel[8].addBox(0F, 0F, 0F, 1, 9, 15, 0F); // Import Kette9R
		rightTrackModel[8].setRotationPoint(59F, -8F, 21F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 3, 15, 0F); // Import Kette10R
		rightTrackModel[9].setRotationPoint(60F, -8F, 21F);
		rightTrackModel[9].rotateAngleZ = -2.356194F;

		rightTrackModel[10].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Import Kette11R
		rightTrackModel[10].setRotationPoint(56F, -12F, 21F);
		rightTrackModel[10].rotateAngleZ = -0.78539816F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 9, 1, 15, 0F); // Import Kette12R
		rightTrackModel[11].setRotationPoint(47F, -12F, 21F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 1, 12, 15, 0F); // Import Kette13R
		rightTrackModel[12].setRotationPoint(47F, -12F, 21F);
		rightTrackModel[12].rotateAngleZ = -1.230457F;

		rightTrackModel[13].addBox(0F, 0F, 0F, 85, 1, 15, 0F); // Import Kette14R
		rightTrackModel[13].setRotationPoint(-49F, -8F, 21F);

		rightTrackModel[14].addBox(0F, 0F, 0F, 1, 3, 15, 0F); // Import Kette15R
		rightTrackModel[14].setRotationPoint(-49F, -8F, 21F);
		rightTrackModel[14].rotateAngleZ = -0.78539816F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Import Kette16R
		rightTrackModel[15].setRotationPoint(-53F, -4F, 21F);
		rightTrackModel[15].rotateAngleZ = 0.78539816F;
		
		
		/*MGFrontModel = new ModelRendererTurbo[3][];
	    
	    MGFrontModel[0] = new ModelRendererTurbo[0];

	    
	    MGFrontModel[1] = new ModelRendererTurbo[1];
	    MGFrontModel[1][0] = new ModelRendererTurbo(this, 425, 0, this.textureX, this.textureY);
	    
	    MGFrontModel[1][0].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);

	    
	    for (ModelRendererTurbo gunPart : MGFrontModel[1])
	    {
	      gunPart.setRotationPoint(47.0F, -18.5F, -11.5F);
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