//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Type4HoRo
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType4HoRo extends ModelBase
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelType4HoRo()
	{
		type4horoModel = new ModelRendererTurbo[67];
		type4horoModel[0] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Import CR.MainBody
		type4horoModel[1] = new ModelRendererTurbo(this, 50, 350, textureX, textureY); // Import CR.Beak
		type4horoModel[2] = new ModelRendererTurbo(this, 50, 410, textureX, textureY); // Import CR.BeakSupport
		type4horoModel[3] = new ModelRendererTurbo(this, 50, 460, textureX, textureY); // Import CR.FrontArmorPlateBottom
		type4horoModel[4] = new ModelRendererTurbo(this, 50, 510, textureX, textureY); // Import CR.FrontArmorPlateRight
		type4horoModel[5] = new ModelRendererTurbo(this, 100, 510, textureX, textureY); // Import CR.FrontArmorPlateLeft
		type4horoModel[6] = new ModelRendererTurbo(this, 50, 570, textureX, textureY); // Import CR.FrontArmorPlateRight
		type4horoModel[7] = new ModelRendererTurbo(this, 50, 610, textureX, textureY); // Import CR.Roof
		type4horoModel[8] = new ModelRendererTurbo(this, 50, 660, textureX, textureY); // Import CR.EngineBlock
		type4horoModel[9] = new ModelRendererTurbo(this, 50, 720, textureX, textureY); // Import CR.BackCorner
		type4horoModel[10] = new ModelRendererTurbo(this, 50, 770, textureX, textureY); // Import CR.TrackWeldRight
		type4horoModel[11] = new ModelRendererTurbo(this, 50, 770, textureX, textureY); // Import CR.TrackWeldLeft
		type4horoModel[12] = new ModelRendererTurbo(this, 50, 800, textureX, textureY); // Import CR.AmmoSquare?
		type4horoModel[13] = new ModelRendererTurbo(this, 150, 800, textureX, textureY); // Import CR.AmmoSquarePegRight
		type4horoModel[14] = new ModelRendererTurbo(this, 150, 800, textureX, textureY); // Import CR.AmmoSquarePegLeft
		type4horoModel[15] = new ModelRendererTurbo(this, 50, 850, textureX, textureY); // Import CR.RightTrackTopRight
		type4horoModel[16] = new ModelRendererTurbo(this, 50, 850, textureX, textureY); // Import CR.RightTrackTopLeft
		type4horoModel[17] = new ModelRendererTurbo(this, 50, 870, textureX, textureY); // Import CR.ArmorRightSide
		type4horoModel[18] = new ModelRendererTurbo(this, 100, 870, textureX, textureY); // Import CR.ArmorRightSideBack
		type4horoModel[19] = new ModelRendererTurbo(this, 50, 870, textureX, textureY); // Import CR.ArmorLeftSide
		type4horoModel[20] = new ModelRendererTurbo(this, 100, 870, textureX, textureY); // Import CR.ArmorLeftSideBack
		type4horoModel[21] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import CR.ArmorRightPanel
		type4horoModel[22] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import CR.ArmorLeftPanel
		type4horoModel[23] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import CR.GunPegRight
		type4horoModel[24] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import CR.GunPegLeft
		type4horoModel[25] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import CR.GunAxel
		type4horoModel[26] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import CR.RightWheelfront
		type4horoModel[27] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import CR.RightWheelback
		type4horoModel[28] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelrightfront
		type4horoModel[29] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelrightcenter
		type4horoModel[30] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelrightback
		type4horoModel[31] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import CR.RightTubethingy
		type4horoModel[32] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import CR.LeftWheelfront
		type4horoModel[33] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import CR.LeftWheelback
		type4horoModel[34] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelleftfront
		type4horoModel[35] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelleftcenter
		type4horoModel[36] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.miniwheelleftback
		type4horoModel[37] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import CR.LeftTubethingy
		type4horoModel[38] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Import CR.SideThingRight
		type4horoModel[39] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Import CR.SideThingLeft
		type4horoModel[40] = new ModelRendererTurbo(this, 250, 400, textureX, textureY); // Import BL.MainCannon
		type4horoModel[41] = new ModelRendererTurbo(this, 250, 430, textureX, textureY); // Import BL.BottomThing
		type4horoModel[42] = new ModelRendererTurbo(this, 250, 450, textureX, textureY); // Import BL.WormBrainthing
		type4horoModel[43] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel1
		type4horoModel[44] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel2
		type4horoModel[45] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel3
		type4horoModel[46] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel4
		type4horoModel[47] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel5
		type4horoModel[48] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import LT.Wheel6
		type4horoModel[49] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Import LT.Top
		type4horoModel[50] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Import LT.Front
		type4horoModel[51] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import LT.Bottom
		type4horoModel[52] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Import LT.Back
		type4horoModel[53] = new ModelRendererTurbo(this, 600, 530, textureX, textureY); // Import LT.Frontcorner
		type4horoModel[54] = new ModelRendererTurbo(this, 600, 570, textureX, textureY); // Import LT.Backcorner
		type4horoModel[55] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel1
		type4horoModel[56] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel2
		type4horoModel[57] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel3
		type4horoModel[58] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel4
		type4horoModel[59] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel5
		type4horoModel[60] = new ModelRendererTurbo(this, 500, 500, textureX, textureY); // Import RT.Wheel6
		type4horoModel[61] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Import RT.Top
		type4horoModel[62] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Import RT.Front
		type4horoModel[63] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import RT.Bottom
		type4horoModel[64] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Import RT.Back
		type4horoModel[65] = new ModelRendererTurbo(this, 600, 530, textureX, textureY); // Import RT.Frontcorner
		type4horoModel[66] = new ModelRendererTurbo(this, 600, 570, textureX, textureY); // Import RT.Backcorner

		type4horoModel[0].addBox(0F, 0F, 0F, 77, 12, 30, 0F); // Import CR.MainBody
		type4horoModel[0].setRotationPoint(-40F, -8F, -15F);

		type4horoModel[1].addBox(0F, 0F, 0F, 8, 14, 30, 0F); // Import CR.Beak
		type4horoModel[1].setRotationPoint(40F, -12F, -15F);
		type4horoModel[1].rotateAngleZ = 0.6632251F;

		type4horoModel[2].addBox(0F, 0F, 0F, 16, 10, 30, 0F); // Import CR.BeakSupport
		type4horoModel[2].setRotationPoint(24F, -12.5F, -15F);
		type4horoModel[2].rotateAngleZ = 0.03490658F;

		type4horoModel[3].addBox(0F, 0F, 0F, 1, 10, 30, 0F); // Import CR.FrontArmorPlateBottom
		type4horoModel[3].setRotationPoint(26F, -7F, -15F);
		type4horoModel[3].rotateAngleZ = 2.879793F;

		type4horoModel[4].addBox(0F, 0F, 0F, 0, 24, 7, 0F); // Import CR.FrontArmorPlateRight
		type4horoModel[4].setRotationPoint(26F, -7F, 8F);
		type4horoModel[4].rotateAngleZ = 2.879793F;

		type4horoModel[5].addBox(0F, 0F, 0F, 0, 24, 16, 0F); // Import CR.FrontArmorPlateLeft
		type4horoModel[5].setRotationPoint(26F, -7F, -15F);
		type4horoModel[5].rotateAngleZ = 2.879793F;

		type4horoModel[6].addBox(0F, 0F, 0F, 1, 3, 30, 0F); // Import CR.FrontArmorPlateRight
		type4horoModel[6].setRotationPoint(18.5F, -30F, -15F);
		type4horoModel[6].rotateAngleZ = -0.2617994F;

		type4horoModel[7].addBox(0F, 0F, 0F, 13, 1, 30, 0F); // Import CR.Roof
		type4horoModel[7].setRotationPoint(6F, -30.5F, -15F);

		type4horoModel[8].addBox(0F, 0F, 0F, 22, 8, 30, 0F); // Import CR.EngineBlock
		type4horoModel[8].setRotationPoint(-32F, -16F, -15F);

		type4horoModel[9].addBox(0F, 0F, 0F, 6, 11, 30, 0F); // Import CR.BackCorner
		type4horoModel[9].setRotationPoint(-32F, -16F, -15F);
		type4horoModel[9].rotateAngleZ = 0.7853982F;

		type4horoModel[10].addBox(0F, 0F, 0F, 62, 6, 0, 0F); // Import CR.TrackWeldRight
		type4horoModel[10].setRotationPoint(-40F, -14F, 15F);

		type4horoModel[11].addBox(0F, 0F, 0F, 62, 6, 0, 0F); // Import CR.TrackWeldLeft
		type4horoModel[11].setRotationPoint(-40F, -14F, -15F);

		type4horoModel[12].addBox(0F, 0F, 0F, 16, 4, 28, 0F); // Import CR.AmmoSquare?
		type4horoModel[12].setRotationPoint(-27F, -21F, -14F);
		type4horoModel[12].rotateAngleZ = -0.1047198F;

		type4horoModel[13].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import CR.AmmoSquarePegRight
		type4horoModel[13].setRotationPoint(-18F, -20F, 8F);

		type4horoModel[14].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import CR.AmmoSquarePegLeft
		type4horoModel[14].setRotationPoint(-18F, -20F, -9F);

		type4horoModel[15].addBox(0F, 0F, 0F, 66, 1, 7, 0F); // Import CR.RightTrackTopRight
		type4horoModel[15].setRotationPoint(-44F, -14F, 15F);

		type4horoModel[16].addBox(0F, 0F, 0F, 66, 1, 7, 0F); // Import CR.RightTrackTopLeft
		type4horoModel[16].setRotationPoint(-44F, -14F, -22F);

		type4horoModel[17].addBox(0F, 0F, 0F, 10, 24, 1, 0F); // Import CR.ArmorRightSide
		type4horoModel[17].setRotationPoint(26F, -7F, 14F);
		type4horoModel[17].rotateAngleZ = 2.879793F;

		type4horoModel[18].addBox(0F, 0F, 0F, 10, 24, 1, 0F); // Import CR.ArmorRightSideBack
		type4horoModel[18].setRotationPoint(9F, -30F, 14F);

		type4horoModel[19].addBox(0F, 0F, 0F, 10, 24, 1, 0F); // Import CR.ArmorLeftSide
		type4horoModel[19].setRotationPoint(26F, -7F, -15F);
		type4horoModel[19].rotateAngleZ = 2.879793F;

		type4horoModel[20].addBox(0F, 0F, 0F, 10, 24, 1, 0F); // Import CR.ArmorLeftSideBack
		type4horoModel[20].setRotationPoint(9F, -30F, -15F);

		type4horoModel[21].addBox(0F, 0F, 0F, 10, 17, 3, 0F); // Import CR.ArmorRightPanel
		type4horoModel[21].setRotationPoint(6F, -30.5F, 15F);

		type4horoModel[22].addBox(0F, 0F, 0F, 10, 17, 3, 0F); // Import CR.ArmorLeftPanel
		type4horoModel[22].setRotationPoint(6F, -30.5F, -18F);

		type4horoModel[23].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Import CR.GunPegRight
		type4horoModel[23].setRotationPoint(10F, -22F, 7.5F);

		type4horoModel[24].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Import CR.GunPegLeft
		type4horoModel[24].setRotationPoint(10F, -22F, 0.5F);

		type4horoModel[25].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Import CR.GunAxel
		type4horoModel[25].setRotationPoint(10F, -22F, 1F);

		type4horoModel[26].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // Import CR.RightWheelfront
		type4horoModel[26].setRotationPoint(36F, -11F, 15F);

		type4horoModel[27].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // Import CR.RightWheelback
		type4horoModel[27].setRotationPoint(-42F, -11F, 15F);

		type4horoModel[28].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelrightfront
		type4horoModel[28].setRotationPoint(24F, -11F, 15F);

		type4horoModel[29].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelrightcenter
		type4horoModel[29].setRotationPoint(-1F, -11F, 15F);

		type4horoModel[30].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelrightback
		type4horoModel[30].setRotationPoint(-26F, -11F, 15F);

		type4horoModel[31].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // Import CR.RightTubethingy
		type4horoModel[31].setRotationPoint(-14F, -4F, 15F);

		type4horoModel[32].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // Import CR.LeftWheelfront
		type4horoModel[32].setRotationPoint(36F, -11F, -21F);

		type4horoModel[33].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // Import CR.LeftWheelback
		type4horoModel[33].setRotationPoint(-42F, -11F, -21F);

		type4horoModel[34].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelleftfront
		type4horoModel[34].setRotationPoint(24F, -11F, -19F);

		type4horoModel[35].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelleftcenter
		type4horoModel[35].setRotationPoint(-1F, -11F, -19F);

		type4horoModel[36].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import CR.miniwheelleftback
		type4horoModel[36].setRotationPoint(-26F, -11F, -19F);

		type4horoModel[37].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // Import CR.LeftTubethingy
		type4horoModel[37].setRotationPoint(-14F, -4F, -18F);

		type4horoModel[38].addBox(0F, 0F, 0F, 27, 4, 5, 0F); // Import CR.SideThingRight
		type4horoModel[38].setRotationPoint(-11F, -18F, 15F);

		type4horoModel[39].addBox(0F, 0F, 0F, 27, 4, 5, 0F); // Import CR.SideThingLeft
		type4horoModel[39].setRotationPoint(-11F, -18F, -20F);

		type4horoModel[40].addBox(-9F, -4.5F, -3F, 36, 5, 5, 0F); // Import BL.MainCannon
		type4horoModel[40].setRotationPoint(10.5F, -19.5F, 5F);

		type4horoModel[41].addBox(-7F, 1F, -2.5F, 30, 1, 4, 0F); // Import BL.BottomThing
		type4horoModel[41].setRotationPoint(10.5F, -19.5F, 5F);

		type4horoModel[42].addBox(19F, -5F, -3.5F, 4, 6, 6, 0F); // Import BL.WormBrainthing
		type4horoModel[42].setRotationPoint(10.5F, -19.5F, 5F);

		type4horoModel[43].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel1
		type4horoModel[43].setRotationPoint(28F, 2F, -21F);

		type4horoModel[44].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel2
		type4horoModel[44].setRotationPoint(17F, 2F, -21F);

		type4horoModel[45].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel3
		type4horoModel[45].setRotationPoint(3F, 2F, -21F);

		type4horoModel[46].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel4
		type4horoModel[46].setRotationPoint(-8F, 2F, -21F);

		type4horoModel[47].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel5
		type4horoModel[47].setRotationPoint(-22F, 2F, -21F);

		type4horoModel[48].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import LT.Wheel6
		type4horoModel[48].setRotationPoint(-33F, 2F, -21F);

		type4horoModel[49].addBox(0F, 0F, 0F, 88, 1, 6, 0F); // Import LT.Top
		type4horoModel[49].setRotationPoint(-42.5F, -12F, -21F);

		type4horoModel[50].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Import LT.Front
		type4horoModel[50].setRotationPoint(45F, -11.5F, -21F);

		type4horoModel[51].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // Import LT.Bottom
		type4horoModel[51].setRotationPoint(-33.5F, 9F, -21F);

		type4horoModel[52].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Import LT.Back
		type4horoModel[52].setRotationPoint(-43F, -11.5F, -21F);

		type4horoModel[53].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import LT.Frontcorner
		type4horoModel[53].setRotationPoint(45F, -2.5F, -21F);
		type4horoModel[53].rotateAngleZ = 0.6632251F;

		type4horoModel[54].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import LT.Backcorner
		type4horoModel[54].setRotationPoint(-43F, -2F, -21F);
		type4horoModel[54].rotateAngleZ = -0.6632251F;

		type4horoModel[55].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel1
		type4horoModel[55].setRotationPoint(28F, 2F, 15F);

		type4horoModel[56].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel2
		type4horoModel[56].setRotationPoint(17F, 2F, 15F);

		type4horoModel[57].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel3
		type4horoModel[57].setRotationPoint(3F, 2F, 15F);

		type4horoModel[58].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel4
		type4horoModel[58].setRotationPoint(-8F, 2F, 15F);

		type4horoModel[59].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel5
		type4horoModel[59].setRotationPoint(-22F, 2F, 15F);

		type4horoModel[60].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Import RT.Wheel6
		type4horoModel[60].setRotationPoint(-33F, 2F, 15F);

		type4horoModel[61].addBox(0F, 0F, 0F, 88, 1, 6, 0F); // Import RT.Top
		type4horoModel[61].setRotationPoint(-42.5F, -12F, 15F);

		type4horoModel[62].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Import RT.Front
		type4horoModel[62].setRotationPoint(45F, -11.5F, 15F);

		type4horoModel[63].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // Import RT.Bottom
		type4horoModel[63].setRotationPoint(-33.5F, 9F, 15F);

		type4horoModel[64].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Import RT.Back
		type4horoModel[64].setRotationPoint(-43F, -11.5F, 15F);

		type4horoModel[65].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import RT.Frontcorner
		type4horoModel[65].setRotationPoint(45F, -2.5F, 15F);
		type4horoModel[65].rotateAngleZ = 0.6632251F;

		type4horoModel[66].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import RT.Backcorner
		type4horoModel[66].setRotationPoint(-43F, -2F, 15F);
		type4horoModel[66].rotateAngleZ = -0.6632251F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 67; i++)
		{
			type4horoModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo type4horoModel[];
}