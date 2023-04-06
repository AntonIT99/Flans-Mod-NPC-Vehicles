//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBigBertha extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBigBertha() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[28];
		turretModel = new ModelRendererTurbo[284];
		barrelModel = new ModelRendererTurbo[113];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 245, 324, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 311, 431, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 311, 431, textureX, textureY); // Core11
		bodyModel[3] = new ModelRendererTurbo(this, 313, 445, textureX, textureY); // Core12
		bodyModel[4] = new ModelRendererTurbo(this, 313, 456, textureX, textureY); // Core13
		bodyModel[5] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core14
		bodyModel[6] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core15
		bodyModel[7] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core16
		bodyModel[8] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core17
		bodyModel[9] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core18
		bodyModel[10] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core19
		bodyModel[11] = new ModelRendererTurbo(this, 245, 324, textureX, textureY); // Core2
		bodyModel[12] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core20
		bodyModel[13] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core21
		bodyModel[14] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core22
		bodyModel[15] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core23
		bodyModel[16] = new ModelRendererTurbo(this, 275, 421, textureX, textureY); // Core25
		bodyModel[17] = new ModelRendererTurbo(this, 275, 421, textureX, textureY); // Core26
		bodyModel[18] = new ModelRendererTurbo(this, 275, 421, textureX, textureY); // Core27
		bodyModel[19] = new ModelRendererTurbo(this, 275, 421, textureX, textureY); // Core28
		bodyModel[20] = new ModelRendererTurbo(this, 275, 446, textureX, textureY); // Core29
		bodyModel[21] = new ModelRendererTurbo(this, 245, 324, textureX, textureY); // Core3
		bodyModel[22] = new ModelRendererTurbo(this, 239, 371, textureX, textureY); // Core4
		bodyModel[23] = new ModelRendererTurbo(this, 239, 371, textureX, textureY); // Core5
		bodyModel[24] = new ModelRendererTurbo(this, 239, 371, textureX, textureY); // Core6
		bodyModel[25] = new ModelRendererTurbo(this, 245, 324, textureX, textureY); // Core7
		bodyModel[26] = new ModelRendererTurbo(this, 245, 324, textureX, textureY); // Core8
		bodyModel[27] = new ModelRendererTurbo(this, 311, 431, textureX, textureY); // Core9

		bodyModel[0].addShapeBox(-88F, 6F, -16F, 12, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-90.5F, -3F, 19.5F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core10
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-92.5F, -3F, 19.5F, 2, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Core11
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-91.5F, -4F, 24.5F, 3, 2, 3, 0F); // Core12
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(-91F, -10F, 25F, 2, 7, 2, 0F); // Core13
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-90.5F, -12F, 24.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core14
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-89.5F, -12F, 24.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Core15
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-91.5F, -12F, 24.5F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core16
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-91.5F, -12F, 22.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core17
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-87.5F, -12F, 22.5F, 1, 1, 2, 0F,1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core18
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-87.5F, -12F, 24.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core19
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-88F, 6F, 16F, 12, 2, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Core2
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-87.5F, -12F, 27.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Core20
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-91.5F, -12F, 28.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core21
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-93.5F, -12F, 27.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F); // Core22
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-93.5F, -12F, 24.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core23
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-50.6F, -12F, 81.6F, 11, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core25
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		bodyModel[16].rotateAngleY = 0.78539816F;

		bodyModel[17].addShapeBox(-90.5F, -12F, 20.5F, 1, 1, 11, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Core26
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-45.8F, -12F, 76.6F, 1, 1, 11, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Core27
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
		bodyModel[18].rotateAngleY = 0.78539816F;

		bodyModel[19].addShapeBox(-95.5F, -12F, 25.5F, 11, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core28
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-93.5F, -12F, 22.5F, 1, 1, 2, 0F,-2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core29
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-88F, 6F, -41F, 12, 2, 25, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core3
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-100F, -1F, 16F, 12, 9, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Core4
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-100F, -1F, -16F, 12, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core5
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-100F, -1F, -41F, 12, 9, 25, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core6
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addBox(-11F, 7F, -31F, 30, 3, 16, 0F); // Core7
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addBox(-11F, 7F, 15F, 30, 3, 16, 0F); // Core8
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-87.5F, -3F, 19.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core9
		bodyModel[27].setRotationPoint(0F, 0F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret1
		turretModel[1] = new ModelRendererTurbo(this, 268, 473, textureX, textureY); // Turret10
		turretModel[2] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret100
		turretModel[3] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret101
		turretModel[4] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret102
		turretModel[5] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret103
		turretModel[6] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret104
		turretModel[7] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret105
		turretModel[8] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret106
		turretModel[9] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret107
		turretModel[10] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret108
		turretModel[11] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret109
		turretModel[12] = new ModelRendererTurbo(this, 268, 473, textureX, textureY); // Turret11
		turretModel[13] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret110
		turretModel[14] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret111
		turretModel[15] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret112
		turretModel[16] = new ModelRendererTurbo(this, 116, 156, textureX, textureY); // Turret113
		turretModel[17] = new ModelRendererTurbo(this, 116, 156, textureX, textureY); // Turret114
		turretModel[18] = new ModelRendererTurbo(this, 116, 156, textureX, textureY); // Turret115
		turretModel[19] = new ModelRendererTurbo(this, 116, 156, textureX, textureY); // Turret116
		turretModel[20] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret117
		turretModel[21] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret118
		turretModel[22] = new ModelRendererTurbo(this, 116, 156, textureX, textureY); // Turret119
		turretModel[23] = new ModelRendererTurbo(this, 205, 389, textureX, textureY); // Turret12
		turretModel[24] = new ModelRendererTurbo(this, 116, 156, textureX, textureY); // Turret120
		turretModel[25] = new ModelRendererTurbo(this, 139, 161, textureX, textureY); // Turret121
		turretModel[26] = new ModelRendererTurbo(this, 139, 161, textureX, textureY); // Turret122
		turretModel[27] = new ModelRendererTurbo(this, 139, 161, textureX, textureY); // Turret123
		turretModel[28] = new ModelRendererTurbo(this, 139, 161, textureX, textureY); // Turret124
		turretModel[29] = new ModelRendererTurbo(this, 139, 161, textureX, textureY); // Turret125
		turretModel[30] = new ModelRendererTurbo(this, 139, 161, textureX, textureY); // Turret126
		turretModel[31] = new ModelRendererTurbo(this, 139, 161, textureX, textureY); // Turret127
		turretModel[32] = new ModelRendererTurbo(this, 139, 161, textureX, textureY); // Turret128
		turretModel[33] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret129
		turretModel[34] = new ModelRendererTurbo(this, 205, 389, textureX, textureY); // Turret13
		turretModel[35] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret130
		turretModel[36] = new ModelRendererTurbo(this, 113, 119, textureX, textureY); // Turret131
		turretModel[37] = new ModelRendererTurbo(this, 113, 119, textureX, textureY); // Turret132
		turretModel[38] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret133
		turretModel[39] = new ModelRendererTurbo(this, 116, 133, textureX, textureY); // Turret134
		turretModel[40] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret135
		turretModel[41] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret136
		turretModel[42] = new ModelRendererTurbo(this, 116, 133, textureX, textureY); // Turret137
		turretModel[43] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret138
		turretModel[44] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret139
		turretModel[45] = new ModelRendererTurbo(this, 205, 389, textureX, textureY); // Turret14
		turretModel[46] = new ModelRendererTurbo(this, 139, 113, textureX, textureY); // Turret140
		turretModel[47] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret141
		turretModel[48] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret142
		turretModel[49] = new ModelRendererTurbo(this, 139, 136, textureX, textureY); // Turret143
		turretModel[50] = new ModelRendererTurbo(this, 113, 143, textureX, textureY); // Turret144
		turretModel[51] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret145
		turretModel[52] = new ModelRendererTurbo(this, 113, 143, textureX, textureY); // Turret146
		turretModel[53] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret147
		turretModel[54] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret148
		turretModel[55] = new ModelRendererTurbo(this, 113, 143, textureX, textureY); // Turret149
		turretModel[56] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret15
		turretModel[57] = new ModelRendererTurbo(this, 113, 119, textureX, textureY); // Turret150
		turretModel[58] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret151
		turretModel[59] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret152
		turretModel[60] = new ModelRendererTurbo(this, 113, 119, textureX, textureY); // Turret153
		turretModel[61] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret154
		turretModel[62] = new ModelRendererTurbo(this, 116, 133, textureX, textureY); // Turret155
		turretModel[63] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret156
		turretModel[64] = new ModelRendererTurbo(this, 116, 133, textureX, textureY); // Turret157
		turretModel[65] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret158
		turretModel[66] = new ModelRendererTurbo(this, 139, 113, textureX, textureY); // Turret159
		turretModel[67] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret16
		turretModel[68] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret160
		turretModel[69] = new ModelRendererTurbo(this, 139, 136, textureX, textureY); // Turret161
		turretModel[70] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret162
		turretModel[71] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret163
		turretModel[72] = new ModelRendererTurbo(this, 113, 143, textureX, textureY); // Turret164
		turretModel[73] = new ModelRendererTurbo(this, 113, 143, textureX, textureY); // Turret165
		turretModel[74] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret166
		turretModel[75] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret167
		turretModel[76] = new ModelRendererTurbo(this, 113, 143, textureX, textureY); // Turret168
		turretModel[77] = new ModelRendererTurbo(this, 11, 185, textureX, textureY); // Turret169
		turretModel[78] = new ModelRendererTurbo(this, 247, 436, textureX, textureY); // Turret17
		turretModel[79] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret170
		turretModel[80] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret171
		turretModel[81] = new ModelRendererTurbo(this, 11, 208, textureX, textureY); // Turret172
		turretModel[82] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret173
		turretModel[83] = new ModelRendererTurbo(this, 11, 208, textureX, textureY); // Turret174
		turretModel[84] = new ModelRendererTurbo(this, 359, 330, textureX, textureY); // Turret175
		turretModel[85] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret176
		turretModel[86] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret177
		turretModel[87] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret178
		turretModel[88] = new ModelRendererTurbo(this, 359, 301, textureX, textureY); // Turret179
		turretModel[89] = new ModelRendererTurbo(this, 247, 453, textureX, textureY); // Turret18
		turretModel[90] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret180
		turretModel[91] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret181
		turretModel[92] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret182
		turretModel[93] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret183
		turretModel[94] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret184
		turretModel[95] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret185
		turretModel[96] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret186
		turretModel[97] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret187
		turretModel[98] = new ModelRendererTurbo(this, 359, 330, textureX, textureY); // Turret188
		turretModel[99] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret189
		turretModel[100] = new ModelRendererTurbo(this, 247, 419, textureX, textureY); // Turret19
		turretModel[101] = new ModelRendererTurbo(this, 359, 301, textureX, textureY); // Turret190
		turretModel[102] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret191
		turretModel[103] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret192
		turretModel[104] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret193
		turretModel[105] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret194
		turretModel[106] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret195
		turretModel[107] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret196
		turretModel[108] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret197
		turretModel[109] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret198
		turretModel[110] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret199
		turretModel[111] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret2
		turretModel[112] = new ModelRendererTurbo(this, 223, 395, textureX, textureY); // Turret20
		turretModel[113] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret200
		turretModel[114] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret201
		turretModel[115] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret202
		turretModel[116] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret203
		turretModel[117] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret204
		turretModel[118] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret205
		turretModel[119] = new ModelRendererTurbo(this, 149, 221, textureX, textureY); // Turret206
		turretModel[120] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret207
		turretModel[121] = new ModelRendererTurbo(this, 149, 228, textureX, textureY); // Turret208
		turretModel[122] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret209
		turretModel[123] = new ModelRendererTurbo(this, 223, 395, textureX, textureY); // Turret21
		turretModel[124] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret210
		turretModel[125] = new ModelRendererTurbo(this, 162, 243, textureX, textureY); // Turret211
		turretModel[126] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret212
		turretModel[127] = new ModelRendererTurbo(this, 166, 231, textureX, textureY); // Turret213
		turretModel[128] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret214
		turretModel[129] = new ModelRendererTurbo(this, 137, 283, textureX, textureY); // Turret215
		turretModel[130] = new ModelRendererTurbo(this, 343, 419, textureX, textureY); // Turret216
		turretModel[131] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret217
		turretModel[132] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret218
		turretModel[133] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret219
		turretModel[134] = new ModelRendererTurbo(this, 223, 395, textureX, textureY); // Turret22
		turretModel[135] = new ModelRendererTurbo(this, 137, 276, textureX, textureY); // Turret220
		turretModel[136] = new ModelRendererTurbo(this, 443, 349, textureX, textureY); // Turret221
		turretModel[137] = new ModelRendererTurbo(this, 137, 276, textureX, textureY); // Turret222
		turretModel[138] = new ModelRendererTurbo(this, 443, 323, textureX, textureY); // Turret223
		turretModel[139] = new ModelRendererTurbo(this, 158, 270, textureX, textureY); // Turret224
		turretModel[140] = new ModelRendererTurbo(this, 361, 323, textureX, textureY); // Turret225
		turretModel[141] = new ModelRendererTurbo(this, 129, 266, textureX, textureY); // Turret226
		turretModel[142] = new ModelRendererTurbo(this, 361, 323, textureX, textureY); // Turret227
		turretModel[143] = new ModelRendererTurbo(this, 129, 266, textureX, textureY); // Turret228
		turretModel[144] = new ModelRendererTurbo(this, 361, 323, textureX, textureY); // Turret229
		turretModel[145] = new ModelRendererTurbo(this, 196, 444, textureX, textureY); // Turret23
		turretModel[146] = new ModelRendererTurbo(this, 129, 266, textureX, textureY); // Turret230
		turretModel[147] = new ModelRendererTurbo(this, 386, 359, textureX, textureY); // Turret231
		turretModel[148] = new ModelRendererTurbo(this, 137, 258, textureX, textureY); // Turret232
		turretModel[149] = new ModelRendererTurbo(this, 137, 258, textureX, textureY); // Turret233
		turretModel[150] = new ModelRendererTurbo(this, 386, 359, textureX, textureY); // Turret234
		turretModel[151] = new ModelRendererTurbo(this, 11, 251, textureX, textureY); // Turret235
		turretModel[152] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret236
		turretModel[153] = new ModelRendererTurbo(this, 11, 251, textureX, textureY); // Turret237
		turretModel[154] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret238
		turretModel[155] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret239
		turretModel[156] = new ModelRendererTurbo(this, 179, 444, textureX, textureY); // Turret24
		turretModel[157] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret240
		turretModel[158] = new ModelRendererTurbo(this, 109, 185, textureX, textureY); // Turret241
		turretModel[159] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret242
		turretModel[160] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret243
		turretModel[161] = new ModelRendererTurbo(this, 109, 185, textureX, textureY); // Turret244
		turretModel[162] = new ModelRendererTurbo(this, 0, 311, textureX, textureY); // Turret245
		turretModel[163] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret246
		turretModel[164] = new ModelRendererTurbo(this, 53, 311, textureX, textureY); // Turret247
		turretModel[165] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret248
		turretModel[166] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret249
		turretModel[167] = new ModelRendererTurbo(this, 179, 473, textureX, textureY); // Turret25
		turretModel[168] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret250
		turretModel[169] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret251
		turretModel[170] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret252
		turretModel[171] = new ModelRendererTurbo(this, 109, 185, textureX, textureY); // Turret253
		turretModel[172] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret254
		turretModel[173] = new ModelRendererTurbo(this, 109, 185, textureX, textureY); // Turret255
		turretModel[174] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret256
		turretModel[175] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret257
		turretModel[176] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret258
		turretModel[177] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret259
		turretModel[178] = new ModelRendererTurbo(this, 178, 478, textureX, textureY); // Turret26
		turretModel[179] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret260
		turretModel[180] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret261
		turretModel[181] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret262
		turretModel[182] = new ModelRendererTurbo(this, 109, 185, textureX, textureY); // Turret263
		turretModel[183] = new ModelRendererTurbo(this, 109, 185, textureX, textureY); // Turret264
		turretModel[184] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret265
		turretModel[185] = new ModelRendererTurbo(this, 226, 473, textureX, textureY); // Turret267
		turretModel[186] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret268
		turretModel[187] = new ModelRendererTurbo(this, 226, 473, textureX, textureY); // Turret269
		turretModel[188] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret27
		turretModel[189] = new ModelRendererTurbo(this, 226, 473, textureX, textureY); // Turret270
		turretModel[190] = new ModelRendererTurbo(this, 226, 484, textureX, textureY); // Turret271
		turretModel[191] = new ModelRendererTurbo(this, 226, 484, textureX, textureY); // Turret272
		turretModel[192] = new ModelRendererTurbo(this, 245, 472, textureX, textureY); // Turret273
		turretModel[193] = new ModelRendererTurbo(this, 11, 274, textureX, textureY); // Turret274
		turretModel[194] = new ModelRendererTurbo(this, 11, 274, textureX, textureY); // Turret275
		turretModel[195] = new ModelRendererTurbo(this, 221, 449, textureX, textureY); // Turret276
		turretModel[196] = new ModelRendererTurbo(this, 221, 449, textureX, textureY); // Turret277
		turretModel[197] = new ModelRendererTurbo(this, 245, 491, textureX, textureY); // Turret278
		turretModel[198] = new ModelRendererTurbo(this, 245, 502, textureX, textureY); // Turret279
		turretModel[199] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret28
		turretModel[200] = new ModelRendererTurbo(this, 245, 491, textureX, textureY); // Turret280
		turretModel[201] = new ModelRendererTurbo(this, 221, 449, textureX, textureY); // Turret281
		turretModel[202] = new ModelRendererTurbo(this, 227, 431, textureX, textureY); // Turret282
		turretModel[203] = new ModelRendererTurbo(this, 227, 431, textureX, textureY); // Turret283
		turretModel[204] = new ModelRendererTurbo(this, 227, 431, textureX, textureY); // Turret284
		turretModel[205] = new ModelRendererTurbo(this, 179, 461, textureX, textureY); // Turret29
		turretModel[206] = new ModelRendererTurbo(this, 173, 414, textureX, textureY); // Turret290
		turretModel[207] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret3
		turretModel[208] = new ModelRendererTurbo(this, 179, 461, textureX, textureY); // Turret30
		turretModel[209] = new ModelRendererTurbo(this, 179, 461, textureX, textureY); // Turret31
		turretModel[210] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret32
		turretModel[211] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret33
		turretModel[212] = new ModelRendererTurbo(this, 415, 272, textureX, textureY); // Turret34
		turretModel[213] = new ModelRendererTurbo(this, 415, 272, textureX, textureY); // Turret35
		turretModel[214] = new ModelRendererTurbo(this, 415, 272, textureX, textureY); // Turret36
		turretModel[215] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret37
		turretModel[216] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret38
		turretModel[217] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret39
		turretModel[218] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret4
		turretModel[219] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret40
		turretModel[220] = new ModelRendererTurbo(this, 167, 445, textureX, textureY); // Turret41
		turretModel[221] = new ModelRendererTurbo(this, 173, 425, textureX, textureY); // Turret42
		turretModel[222] = new ModelRendererTurbo(this, 173, 425, textureX, textureY); // Turret43
		turretModel[223] = new ModelRendererTurbo(this, 173, 425, textureX, textureY); // Turret44
		turretModel[224] = new ModelRendererTurbo(this, 173, 425, textureX, textureY); // Turret45
		turretModel[225] = new ModelRendererTurbo(this, 173, 425, textureX, textureY); // Turret46
		turretModel[226] = new ModelRendererTurbo(this, 173, 414, textureX, textureY); // Turret47
		turretModel[227] = new ModelRendererTurbo(this, 173, 425, textureX, textureY); // Turret48
		turretModel[228] = new ModelRendererTurbo(this, 173, 425, textureX, textureY); // Turret49
		turretModel[229] = new ModelRendererTurbo(this, 245, 472, textureX, textureY); // Turret5
		turretModel[230] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Turret50
		turretModel[231] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret51
		turretModel[232] = new ModelRendererTurbo(this, 173, 425, textureX, textureY); // Turret52
		turretModel[233] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret53
		turretModel[234] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret54
		turretModel[235] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret55
		turretModel[236] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret56
		turretModel[237] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret57
		turretModel[238] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret58
		turretModel[239] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret59
		turretModel[240] = new ModelRendererTurbo(this, 245, 472, textureX, textureY); // Turret6
		turretModel[241] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret60
		turretModel[242] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret61
		turretModel[243] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret62
		turretModel[244] = new ModelRendererTurbo(this, 11, 251, textureX, textureY); // Turret63
		turretModel[245] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret64
		turretModel[246] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret65
		turretModel[247] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret66
		turretModel[248] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret67
		turretModel[249] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret68
		turretModel[250] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret69
		turretModel[251] = new ModelRendererTurbo(this, 268, 473, textureX, textureY); // Turret7
		turretModel[252] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret70
		turretModel[253] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret71
		turretModel[254] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret72
		turretModel[255] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret73
		turretModel[256] = new ModelRendererTurbo(this, 11, 185, textureX, textureY); // Turret74
		turretModel[257] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret75
		turretModel[258] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret76
		turretModel[259] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret77
		turretModel[260] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret78
		turretModel[261] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret79
		turretModel[262] = new ModelRendererTurbo(this, 268, 473, textureX, textureY); // Turret8
		turretModel[263] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret80
		turretModel[264] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret81
		turretModel[265] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret82
		turretModel[266] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret83
		turretModel[267] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret84
		turretModel[268] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret85
		turretModel[269] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret86
		turretModel[270] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret87
		turretModel[271] = new ModelRendererTurbo(this, 11, 185, textureX, textureY); // Turret88
		turretModel[272] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret89
		turretModel[273] = new ModelRendererTurbo(this, 268, 473, textureX, textureY); // Turret9
		turretModel[274] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret90
		turretModel[275] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret91
		turretModel[276] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret92
		turretModel[277] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret93
		turretModel[278] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret94
		turretModel[279] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Turret95
		turretModel[280] = new ModelRendererTurbo(this, 419, 391, textureX, textureY); // Turret96
		turretModel[281] = new ModelRendererTurbo(this, 167, 445, textureX, textureY); // Turret97
		turretModel[282] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret98
		turretModel[283] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Turret99

		turretModel[0].addShapeBox(-73F, -7F, -13F, 20, 13, 26, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Turret1
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addBox(-62F, -28F, -12.5F, 1, 1, 27, 0F); // Turret10
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleZ = 0.31415927F;

		turretModel[2].addBox(-81F, -17F, 20F, 8, 1, 1, 0F); // Turret100
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addBox(-81F, -12F, 20F, 8, 1, 1, 0F); // Turret101
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addBox(-81F, -7F, 20F, 8, 1, 1, 0F); // Turret102
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addBox(-81F, -2F, 20F, 8, 1, 1, 0F); // Turret103
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addBox(-81F, 3F, 20F, 8, 1, 1, 0F); // Turret104
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addBox(-82F, -19F, -21F, 1, 24, 1, 0F); // Turret105
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addShapeBox(-15F, -3F, -26F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret106
		turretModel[8].setRotationPoint(4F, -11F, 0F);
		turretModel[8].rotateAngleZ = -3.92699082F;

		turretModel[9].addBox(-73F, -19F, -21F, 1, 24, 1, 0F); // Turret107
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addBox(-81F, -17F, -21F, 8, 1, 1, 0F); // Turret108
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addBox(-81F, -12F, -21F, 8, 1, 1, 0F); // Turret109
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addBox(-59F, -28F, 14.5F, 30, 1, 1, 0F); // Turret11
		turretModel[12].setRotationPoint(0F, 0F, 0F);
		turretModel[12].rotateAngleZ = 0.31415927F;

		turretModel[13].addBox(-81F, -7F, -21F, 8, 1, 1, 0F); // Turret110
		turretModel[13].setRotationPoint(0F, 0F, 0F);

		turretModel[14].addBox(-81F, -2F, -21F, 8, 1, 1, 0F); // Turret111
		turretModel[14].setRotationPoint(0F, 0F, 0F);

		turretModel[15].addBox(-81F, 3F, -21F, 8, 1, 1, 0F); // Turret112
		turretModel[15].setRotationPoint(0F, 0F, 0F);

		turretModel[16].addBox(3F, -35F, 16F, 1, 1, 6, 0F); // Turret113
		turretModel[16].setRotationPoint(0F, 0F, 0F);

		turretModel[17].addShapeBox(3F, -35F, 22F, 1, 1, 1, 0F,.1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Turret114
		turretModel[17].setRotationPoint(0F, 0F, 0F);

		turretModel[18].addShapeBox(3F, -37F, 22F, 1, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret115
		turretModel[18].setRotationPoint(0F, 0F, 0F);

		turretModel[19].addShapeBox(3F, -34F, 22F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Turret116
		turretModel[19].setRotationPoint(0F, 0F, 0F);

		turretModel[20].addShapeBox(-3F, -38F, 12F, 21, 5, 4, 0F,-2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 4F, 0F, 0F); // Turret117
		turretModel[20].setRotationPoint(0F, 0F, 0F);

		turretModel[21].addShapeBox(-15F, -3F, -26F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret118
		turretModel[21].setRotationPoint(4F, -11F, 0F);
		turretModel[21].rotateAngleZ = -4.3196899F;

		turretModel[22].addShapeBox(4F, -35F, 22F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Turret119
		turretModel[22].setRotationPoint(0F, 0F, 0F);

		turretModel[23].addShapeBox(-37F, -38F, 16F, 1, 40, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret12
		turretModel[23].setRotationPoint(0F, 0F, 0F);

		turretModel[24].addShapeBox(1F, -35F, 22F, 2, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Turret120
		turretModel[24].setRotationPoint(0F, 0F, 0F);

		turretModel[25].addShapeBox(2F, -38F, 24F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret121
		turretModel[25].setRotationPoint(0F, 0F, 0F);

		turretModel[26].addShapeBox(0F, -36F, 24F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret122
		turretModel[26].setRotationPoint(0F, 0F, 0F);

		turretModel[27].addShapeBox(0F, -38F, 24F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Turret123
		turretModel[27].setRotationPoint(0F, 0F, 0F);

		turretModel[28].addShapeBox(6F, -36F, 24F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret124
		turretModel[28].setRotationPoint(0F, 0F, 0F);

		turretModel[29].addShapeBox(2F, -32F, 24F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret125
		turretModel[29].setRotationPoint(0F, 0F, 0F);

		turretModel[30].addShapeBox(5F, -38F, 24F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Turret126
		turretModel[30].setRotationPoint(0F, 0F, 0F);

		turretModel[31].addShapeBox(5F, -32F, 24F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Turret127
		turretModel[31].setRotationPoint(0F, 0F, 0F);

		turretModel[32].addShapeBox(0F, -32F, 24F, 2, 1, 1, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Turret128
		turretModel[32].setRotationPoint(0F, 0F, 0F);

		turretModel[33].addShapeBox(-3F, -38F, -16F, 21, 5, 4, 0F,-2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 4F, 0F, 0F); // Turret129
		turretModel[33].setRotationPoint(0F, 0F, 0F);

		turretModel[34].addShapeBox(-38F, -38F, 16F, 1, 40, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret13
		turretModel[34].setRotationPoint(0F, 0F, 0F);

		turretModel[35].addShapeBox(-15F, -3F, -26F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret130
		turretModel[35].setRotationPoint(4F, -11F, 0F);
		turretModel[35].rotateAngleZ = -2.74889357F;

		turretModel[36].addShapeBox(22F, -19.5F, 12.5F, 5, 3, 3, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Turret131
		turretModel[36].setRotationPoint(0F, 0F, 0F);

		turretModel[37].addShapeBox(27F, -19.5F, 12.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret132
		turretModel[37].setRotationPoint(0F, 0F, 0F);

		turretModel[38].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret133
		turretModel[38].setRotationPoint(4F, -11F, 0F);
		turretModel[38].rotateAngleZ = -1.57079633F;

		turretModel[39].addShapeBox(24F, -16.5F, 13F, 3, 1, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Turret134
		turretModel[39].setRotationPoint(0F, 0F, 0F);

		turretModel[40].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret135
		turretModel[40].setRotationPoint(4F, -11F, 0F);
		turretModel[40].rotateAngleZ = -1.57079633F;

		turretModel[41].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret136
		turretModel[41].setRotationPoint(4F, -11F, 0F);

		turretModel[42].addShapeBox(24F, -15.5F, 13F, 3, 1, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F); // Turret137
		turretModel[42].setRotationPoint(0F, 0F, 0F);

		turretModel[43].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret138
		turretModel[43].setRotationPoint(4F, -11F, 0F);

		turretModel[44].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret139
		turretModel[44].setRotationPoint(4F, -11F, 0F);
		turretModel[44].rotateAngleZ = -0.52359878F;

		turretModel[45].addShapeBox(-36F, -38F, 16F, 1, 40, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret14
		turretModel[45].setRotationPoint(0F, 0F, 0F);

		turretModel[46].addBox(29F, -1.5F, 13F, 2, 14, 2, 0F); // Turret140
		turretModel[46].setRotationPoint(0F, 0F, 0F);
		turretModel[46].rotateAngleZ = 0.50614548F;

		turretModel[47].addShapeBox(-33F, -27F, 13F, 20, 3, 3, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Turret141
		turretModel[47].setRotationPoint(0F, 0F, 0F);

		turretModel[48].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret142
		turretModel[48].setRotationPoint(4F, -11F, 0F);
		turretModel[48].rotateAngleZ = -0.52359878F;

		turretModel[49].addShapeBox(29F, 12.5F, 13F, 2, 9, 2, 0F,-.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Turret143
		turretModel[49].setRotationPoint(0F, 0F, 0F);
		turretModel[49].rotateAngleZ = 0.50614548F;

		turretModel[50].addBox(27F, 21.5F, 13F, 6, 1, 2, 0F); // Turret144
		turretModel[50].setRotationPoint(0F, 0F, 0F);
		turretModel[50].rotateAngleZ = 0.50614548F;

		turretModel[51].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret145
		turretModel[51].setRotationPoint(4F, -11F, 0F);
		turretModel[51].rotateAngleZ = -1.04719755F;

		turretModel[52].addShapeBox(27F, 21.5F, 15F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Turret146
		turretModel[52].setRotationPoint(0F, 0F, 0F);
		turretModel[52].rotateAngleZ = 0.50614548F;

		turretModel[53].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret147
		turretModel[53].setRotationPoint(4F, -11F, 0F);
		turretModel[53].rotateAngleZ = -1.04719755F;

		turretModel[54].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret148
		turretModel[54].setRotationPoint(4F, -11F, 0F);
		turretModel[54].rotateAngleZ = -3.14159265F;

		turretModel[55].addShapeBox(27F, 21.5F, 11F, 6, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret149
		turretModel[55].setRotationPoint(0F, 0F, 0F);
		turretModel[55].rotateAngleZ = 0.50614548F;

		turretModel[56].addShapeBox(-53F, -15F, -16F, 20, 3, 3, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Turret15
		turretModel[56].setRotationPoint(0F, 0F, 0F);

		turretModel[57].addShapeBox(22F, -19.5F, -15.5F, 5, 3, 3, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Turret150
		turretModel[57].setRotationPoint(0F, 0F, 0F);

		turretModel[58].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret151
		turretModel[58].setRotationPoint(4F, -11F, 0F);
		turretModel[58].rotateAngleZ = -3.14159265F;

		turretModel[59].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret152
		turretModel[59].setRotationPoint(4F, -11F, 0F);
		turretModel[59].rotateAngleZ = -2.61799388F;

		turretModel[60].addShapeBox(27F, -19.5F, -15.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret153
		turretModel[60].setRotationPoint(0F, 0F, 0F);

		turretModel[61].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret154
		turretModel[61].setRotationPoint(4F, -11F, 0F);
		turretModel[61].rotateAngleZ = -2.0943951F;

		turretModel[62].addShapeBox(24F, -16.5F, -15F, 3, 1, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Turret155
		turretModel[62].setRotationPoint(0F, 0F, 0F);

		turretModel[63].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret156
		turretModel[63].setRotationPoint(4F, -11F, 0F);
		turretModel[63].rotateAngleZ = -2.61799388F;

		turretModel[64].addShapeBox(24F, -15.5F, -15F, 3, 1, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F); // Turret157
		turretModel[64].setRotationPoint(0F, 0F, 0F);

		turretModel[65].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret158
		turretModel[65].setRotationPoint(4F, -11F, 0F);
		turretModel[65].rotateAngleZ = -2.0943951F;

		turretModel[66].addBox(29F, -1.5F, -15F, 2, 14, 2, 0F); // Turret159
		turretModel[66].setRotationPoint(0F, 0F, 0F);
		turretModel[66].rotateAngleZ = 0.50614548F;

		turretModel[67].addShapeBox(-15F, -3F, 20F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret16
		turretModel[67].setRotationPoint(4F, -11F, 0F);
		turretModel[67].rotateAngleZ = -2.74889357F;

		turretModel[68].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret160
		turretModel[68].setRotationPoint(4F, -11F, 0F);
		turretModel[68].rotateAngleZ = -3.66519143F;

		turretModel[69].addShapeBox(29F, 12.5F, -15F, 2, 9, 2, 0F,-.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Turret161
		turretModel[69].setRotationPoint(0F, 0F, 0F);
		turretModel[69].rotateAngleZ = 0.50614548F;

		turretModel[70].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret162
		turretModel[70].setRotationPoint(4F, -11F, 0F);
		turretModel[70].rotateAngleZ = -3.66519143F;

		turretModel[71].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret163
		turretModel[71].setRotationPoint(4F, -11F, 0F);
		turretModel[71].rotateAngleZ = 1.04719755F;

		turretModel[72].addShapeBox(27F, 21.5F, -13F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Turret164
		turretModel[72].setRotationPoint(0F, 0F, 0F);
		turretModel[72].rotateAngleZ = 0.50614548F;

		turretModel[73].addBox(27F, 21.5F, -15F, 6, 1, 2, 0F); // Turret165
		turretModel[73].setRotationPoint(0F, 0F, 0F);
		turretModel[73].rotateAngleZ = 0.50614548F;

		turretModel[74].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret166
		turretModel[74].setRotationPoint(4F, -11F, 0F);
		turretModel[74].rotateAngleZ = 1.04719755F;

		turretModel[75].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret167
		turretModel[75].setRotationPoint(4F, -11F, 0F);
		turretModel[75].rotateAngleZ = 1.57079633F;

		turretModel[76].addShapeBox(27F, 21.5F, -17F, 6, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret168
		turretModel[76].setRotationPoint(0F, 0F, 0F);
		turretModel[76].rotateAngleZ = 0.50614548F;

		turretModel[77].addBox(30F, -19.5F, -28F, 12, 2, 56, 0F); // Turret169
		turretModel[77].setRotationPoint(0F, 0F, 0F);

		turretModel[78].addShapeBox(-37.5F, -22F, 15.5F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret17
		turretModel[78].setRotationPoint(0F, 0F, 0F);

		turretModel[79].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret170
		turretModel[79].setRotationPoint(4F, -11F, 0F);
		turretModel[79].rotateAngleZ = 2.0943951F;

		turretModel[80].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret171
		turretModel[80].setRotationPoint(4F, -11F, 0F);
		turretModel[80].rotateAngleZ = 1.57079633F;

		turretModel[81].addBox(23F, -19.5F, 16F, 7, 2, 12, 0F); // Turret172
		turretModel[81].setRotationPoint(0F, 0F, 0F);

		turretModel[82].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret173
		turretModel[82].setRotationPoint(4F, -11F, 0F);
		turretModel[82].rotateAngleZ = 2.0943951F;

		turretModel[83].addBox(23F, -19.5F, -28F, 7, 2, 12, 0F); // Turret174
		turretModel[83].setRotationPoint(0F, 0F, 0F);

		turretModel[84].addShapeBox(23F, -26.5F, 16F, 1, 7, 12, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret175
		turretModel[84].setRotationPoint(0F, 0F, 0F);

		turretModel[85].addShapeBox(-18F, -4F, 18F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret176
		turretModel[85].setRotationPoint(4F, -11F, 0F);
		turretModel[85].rotateAngleZ = 0.52359878F;

		turretModel[86].addShapeBox(-16F, -1.5F, 18.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret177
		turretModel[86].setRotationPoint(4F, -11F, 0F);
		turretModel[86].rotateAngleZ = 0.52359878F;

		turretModel[87].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret178
		turretModel[87].setRotationPoint(4F, -11F, 0F);
		turretModel[87].rotateAngleZ = -0.52359878F;

		turretModel[88].addShapeBox(22F, -34.5F, 13F, 1, 8, 15, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret179
		turretModel[88].setRotationPoint(0F, 0F, 0F);

		turretModel[89].addShapeBox(-38.5F, -22F, 15.5F, 1, 4, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Turret18
		turretModel[89].setRotationPoint(0F, 0F, 0F);

		turretModel[90].addShapeBox(18.85F, -33.5F, 13F, 1, 2, 25, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret180
		turretModel[90].setRotationPoint(0F, 0F, 0F);

		turretModel[91].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret181
		turretModel[91].setRotationPoint(4F, -11F, 0F);
		turretModel[91].rotateAngleZ = -1.04719755F;

		turretModel[92].addShapeBox(17.85F, -46.5F, 13F, 1, 13, 25, 0F,8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret182
		turretModel[92].setRotationPoint(0F, 0F, 0F);

		turretModel[93].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret183
		turretModel[93].setRotationPoint(4F, -11F, 0F);
		turretModel[93].rotateAngleZ = -1.57079633F;

		turretModel[94].addShapeBox(9.85F, -60.5F, 13F, 1, 14, 25, 0F,12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret184
		turretModel[94].setRotationPoint(0F, 0F, 0F);

		turretModel[95].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret185
		turretModel[95].setRotationPoint(4F, -11F, 0F);
		turretModel[95].rotateAngleZ = -2.0943951F;

		turretModel[96].addShapeBox(-2.15F, -70.5F, -38F, 1, 10, 76, 0F,11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret186
		turretModel[96].setRotationPoint(0F, 0F, 0F);

		turretModel[97].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret187
		turretModel[97].setRotationPoint(4F, -11F, 0F);
		turretModel[97].rotateAngleZ = -2.0943951F;

		turretModel[98].addShapeBox(23F, -26.5F, -28F, 1, 7, 12, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret188
		turretModel[98].setRotationPoint(0F, 0F, 0F);

		turretModel[99].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret189
		turretModel[99].setRotationPoint(4F, -11F, 0F);
		turretModel[99].rotateAngleZ = -1.57079633F;

		turretModel[100].addShapeBox(-35.5F, -22F, 15.5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret19
		turretModel[100].setRotationPoint(0F, 0F, 0F);

		turretModel[101].addShapeBox(22F, -34.5F, -28F, 1, 8, 15, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret190
		turretModel[101].setRotationPoint(0F, 0F, 0F);

		turretModel[102].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret191
		turretModel[102].setRotationPoint(4F, -11F, 0F);
		turretModel[102].rotateAngleZ = -1.04719755F;

		turretModel[103].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret192
		turretModel[103].setRotationPoint(4F, -11F, 0F);
		turretModel[103].rotateAngleZ = -0.52359878F;

		turretModel[104].addShapeBox(17.85F, -46.5F, -38F, 1, 13, 25, 0F,8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret193
		turretModel[104].setRotationPoint(0F, 0F, 0F);

		turretModel[105].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret194
		turretModel[105].setRotationPoint(4F, -11F, 0F);

		turretModel[106].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret195
		turretModel[106].setRotationPoint(4F, -11F, 0F);

		turretModel[107].addShapeBox(9.85F, -60.5F, -38F, 1, 14, 25, 0F,12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret196
		turretModel[107].setRotationPoint(0F, 0F, 0F);

		turretModel[108].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret197
		turretModel[108].setRotationPoint(4F, -11F, 0F);
		turretModel[108].rotateAngleZ = 0.52359878F;

		turretModel[109].addShapeBox(-53F, -15F, 13F, 20, 3, 3, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Turret198
		turretModel[109].setRotationPoint(0F, 0F, 0F);

		turretModel[110].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret199
		turretModel[110].setRotationPoint(4F, -11F, 0F);
		turretModel[110].rotateAngleZ = 0.52359878F;

		turretModel[111].addShapeBox(-53F, -15F, -13F, 20, 16, 26, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Turret2
		turretModel[111].setRotationPoint(0F, 0F, 0F);

		turretModel[112].addShapeBox(-37.5F, -39F, 15.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret20
		turretModel[112].setRotationPoint(0F, 0F, 0F);

		turretModel[113].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret200
		turretModel[113].setRotationPoint(4F, -11F, 0F);
		turretModel[113].rotateAngleZ = 1.04719755F;

		turretModel[114].addShapeBox(9.85F, -60.5F, 8F, 1, 14, 5, 0F,12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret201
		turretModel[114].setRotationPoint(0F, 0F, 0F);

		turretModel[115].addShapeBox(9.85F, -60.5F, -13F, 1, 14, 5, 0F,12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Turret202
		turretModel[115].setRotationPoint(0F, 0F, 0F);

		turretModel[116].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret203
		turretModel[116].setRotationPoint(4F, -11F, 0F);
		turretModel[116].rotateAngleZ = 1.04719755F;

		turretModel[117].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret204
		turretModel[117].setRotationPoint(4F, -11F, 0F);
		turretModel[117].rotateAngleZ = 1.57079633F;

		turretModel[118].addShapeBox(-13.15F, -75.5F, -27F, 1, 5, 54, 0F,7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret205
		turretModel[118].setRotationPoint(0F, 0F, 0F);

		turretModel[119].addShapeBox(3F, -12F, 30F, 2, 2, 1, 0F,.3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F); // Turret206
		turretModel[119].setRotationPoint(0F, 0F, 0F);

		turretModel[120].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret207
		turretModel[120].setRotationPoint(4F, -11F, 0F);
		turretModel[120].rotateAngleZ = 1.57079633F;

		turretModel[121].addShapeBox(3F, -12F, 39F, 2, 2, 1, 0F,.3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F); // Turret208
		turretModel[121].setRotationPoint(0F, 0F, 0F);

		turretModel[122].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret209
		turretModel[122].setRotationPoint(4F, -11F, 0F);
		turretModel[122].rotateAngleZ = 2.0943951F;

		turretModel[123].addShapeBox(-35.5F, -39F, 15.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret21
		turretModel[123].setRotationPoint(0F, 0F, 0F);

		turretModel[124].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret210
		turretModel[124].setRotationPoint(4F, -11F, 0F);
		turretModel[124].rotateAngleZ = 2.0943951F;

		turretModel[125].addShapeBox(-4F, -15F, 39F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Turret211
		turretModel[125].setRotationPoint(0F, 0F, 0F);

		turretModel[126].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret212
		turretModel[126].setRotationPoint(4F, -11F, 0F);
		turretModel[126].rotateAngleZ = -3.66519143F;

		turretModel[127].addShapeBox(-4F, -15F, 30F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Turret213
		turretModel[127].setRotationPoint(0F, 0F, 0F);

		turretModel[128].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret214
		turretModel[128].setRotationPoint(4F, -11F, 0F);
		turretModel[128].rotateAngleZ = -3.66519143F;

		turretModel[129].addBox(-14F, -16F, 30F, 18, 1, 10, 0F); // Turret215
		turretModel[129].setRotationPoint(0F, 0F, 0F);

		turretModel[130].addShapeBox(18.85F, -33.5F, -38F, 1, 2, 25, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret216
		turretModel[130].setRotationPoint(0F, 0F, 0F);

		turretModel[131].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret217
		turretModel[131].setRotationPoint(4F, -11F, 0F);
		turretModel[131].rotateAngleZ = -3.14159265F;

		turretModel[132].addShapeBox(-73F, -7F, 13F, 20, 3, 3, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Turret218
		turretModel[132].setRotationPoint(0F, 0F, 0F);

		turretModel[133].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret219
		turretModel[133].setRotationPoint(4F, -11F, 0F);
		turretModel[133].rotateAngleZ = -3.14159265F;

		turretModel[134].addShapeBox(-38.5F, -39F, 15.5F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret22
		turretModel[134].setRotationPoint(0F, 0F, 0F);

		turretModel[135].addBox(-14F, -17F, 30F, 21, 1, 1, 0F); // Turret220
		turretModel[135].setRotationPoint(0F, 0F, 0F);

		turretModel[136].addShapeBox(-16F, -1.5F, -27.5F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret221
		turretModel[136].setRotationPoint(4F, -11F, 0F);
		turretModel[136].rotateAngleZ = -2.61799388F;

		turretModel[137].addBox(-14F, -17F, 39F, 21, 1, 1, 0F); // Turret222
		turretModel[137].setRotationPoint(0F, 0F, 0F);

		turretModel[138].addShapeBox(-18F, -4F, -28F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret223
		turretModel[138].setRotationPoint(4F, -11F, 0F);
		turretModel[138].rotateAngleZ = -2.61799388F;

		turretModel[139].addBox(6F, -17F, 31F, 1, 1, 8, 0F); // Turret224
		turretModel[139].setRotationPoint(0F, 0F, 0F);

		turretModel[140].addShapeBox(1F, -12F, -29F, 6, 2, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret225
		turretModel[140].setRotationPoint(0F, 0F, 0F);

		turretModel[141].addShapeBox(6F, -25F, 39F, 1, 8, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret226
		turretModel[141].setRotationPoint(0F, 0F, 0F);

		turretModel[142].addShapeBox(1F, -14F, -29F, 6, 2, 58, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret227
		turretModel[142].setRotationPoint(0F, 0F, 0F);

		turretModel[143].addShapeBox(6F, -25F, 30F, 1, 8, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret228
		turretModel[143].setRotationPoint(0F, 0F, 0F);

		turretModel[144].addShapeBox(1F, -10F, -29F, 6, 2, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Turret229
		turretModel[144].setRotationPoint(0F, 0F, 0F);

		turretModel[145].addShapeBox(-37.5F, -51F, 16F, 2, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret23
		turretModel[145].setRotationPoint(0F, 0F, 0F);

		turretModel[146].addShapeBox(-3F, -25F, 39F, 1, 8, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret230
		turretModel[146].setRotationPoint(0F, 0F, 0F);

		turretModel[147].addShapeBox(3F, -12F, 29F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret231
		turretModel[147].setRotationPoint(0F, 0F, 0F);

		turretModel[148].addShapeBox(-3F, -25F, 39F, 10, 1, 1, 0F,-.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Turret232
		turretModel[148].setRotationPoint(0F, 0F, 0F);

		turretModel[149].addShapeBox(6F, -25F, 30F, 1, 1, 10, 0F,-.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Turret233
		turretModel[149].setRotationPoint(0F, 0F, 0F);

		turretModel[150].addShapeBox(3F, -12F, -41F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret234
		turretModel[150].setRotationPoint(0F, 0F, 0F);

		turretModel[151].addBox(-35F, -26F, -25F, 12, 3, 50, 0F); // Turret235
		turretModel[151].setRotationPoint(0F, 0F, 0F);

		turretModel[152].addShapeBox(-1F, -10F, 12F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Turret236
		turretModel[152].setRotationPoint(0F, 0F, 0F);

		turretModel[153].addBox(-27F, -26F, 25F, 10, 2, 6, 0F); // Turret237
		turretModel[153].setRotationPoint(0F, 0F, 0F);

		turretModel[154].addShapeBox(-13F, -27F, 12F, 37, 13, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret238
		turretModel[154].setRotationPoint(0F, 0F, 0F);

		turretModel[155].addShapeBox(-15F, -3F, 20F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret239
		turretModel[155].setRotationPoint(4F, -11F, 0F);
		turretModel[155].rotateAngleZ = -1.57079633F;

		turretModel[156].addShapeBox(-37.5F, -54F, 16F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret24
		turretModel[156].setRotationPoint(0F, 0F, 0F);

		turretModel[157].addShapeBox(-53F, -2F, 13F, 20, 3, 3, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Turret240
		turretModel[157].setRotationPoint(0F, 0F, 0F);

		turretModel[158].addBox(-34F, -24F, 11F, 2, 11, 2, 0F); // Turret241
		turretModel[158].setRotationPoint(0F, 0F, 0F);

		turretModel[159].addShapeBox(-13F, -11F, 12F, 34, 1, 4, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Turret242
		turretModel[159].setRotationPoint(0F, 0F, 0F);

		turretModel[160].addShapeBox(-13F, -14F, 12F, 37, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F); // Turret243
		turretModel[160].setRotationPoint(0F, 0F, 0F);

		turretModel[161].addBox(-34F, -24F, -13F, 2, 11, 2, 0F); // Turret244
		turretModel[161].setRotationPoint(0F, 0F, 0F);

		turretModel[162].addBox(-43F, -19F, -15F, 12, 2, 30, 0F); // Turret245
		turretModel[162].setRotationPoint(0F, 0F, 0F);

		turretModel[163].addShapeBox(1F, -8F, 12F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Turret246
		turretModel[163].setRotationPoint(0F, 0F, 0F);

		turretModel[164].addBox(-83F, -19F, -20F, 40, 3, 40, 0F); // Turret247
		turretModel[164].setRotationPoint(0F, 0F, 0F);

		turretModel[165].addShapeBox(-9F, -33F, 12F, 31, 6, 4, 0F,-2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Turret248
		turretModel[165].setRotationPoint(0F, 0F, 0F);

		turretModel[166].addBox(-85F, -1F, -13F, 12, 9, 26, 0F); // Turret249
		turretModel[166].setRotationPoint(0F, 0F, 0F);

		turretModel[167].addShapeBox(-37.5F, -54F, -2F, 2, 3, 18, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret25
		turretModel[167].setRotationPoint(0F, 0F, 0F);

		turretModel[168].addBox(-85F, -1F, 13F, 12, 2, 3, 0F); // Turret250
		turretModel[168].setRotationPoint(0F, 0F, 0F);

		turretModel[169].addBox(-85F, 5F, 13F, 12, 1, 3, 0F); // Turret251
		turretModel[169].setRotationPoint(0F, 0F, 0F);

		turretModel[170].addShapeBox(-33F, -27F, -13F, 20, 16, 3, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 12F, 0F); // Turret252
		turretModel[170].setRotationPoint(0F, 0F, 0F);

		turretModel[171].addBox(-75F, -16F, 11F, 2, 15, 2, 0F); // Turret253
		turretModel[171].setRotationPoint(0F, 0F, 0F);

		turretModel[172].addShapeBox(1F, -8F, -16F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Turret254
		turretModel[172].setRotationPoint(0F, 0F, 0F);

		turretModel[173].addBox(-75F, -16F, -13F, 2, 15, 2, 0F); // Turret255
		turretModel[173].setRotationPoint(0F, 0F, 0F);

		turretModel[174].addShapeBox(-73F, 3F, 13F, 20, 3, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Turret256
		turretModel[174].setRotationPoint(0F, 0F, 0F);

		turretModel[175].addShapeBox(-15F, -3F, 20F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret257
		turretModel[175].setRotationPoint(4F, -11F, 0F);
		turretModel[175].rotateAngleZ = -1.96349541F;

		turretModel[176].addShapeBox(-1F, -10F, -16F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Turret258
		turretModel[176].setRotationPoint(0F, 0F, 0F);

		turretModel[177].addBox(-85F, -1F, -16F, 12, 2, 3, 0F); // Turret259
		turretModel[177].setRotationPoint(0F, 0F, 0F);

		turretModel[178].addShapeBox(-37.5F, -60F, -3F, 2, 2, 1, 0F,0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret26
		turretModel[178].setRotationPoint(0F, 0F, 0F);

		turretModel[179].addShapeBox(-13F, -14F, -16F, 37, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Turret260
		turretModel[179].setRotationPoint(0F, 0F, 0F);

		turretModel[180].addBox(-85F, 5F, -16F, 12, 1, 3, 0F); // Turret261
		turretModel[180].setRotationPoint(0F, 0F, 0F);

		turretModel[181].addShapeBox(-13F, -11F, -16F, 34, 1, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Turret262
		turretModel[181].setRotationPoint(0F, 0F, 0F);

		turretModel[182].addBox(-46F, -16F, 11F, 2, 7, 2, 0F); // Turret263
		turretModel[182].setRotationPoint(0F, 0F, 0F);

		turretModel[183].addBox(-46F, -16F, -13F, 2, 7, 2, 0F); // Turret264
		turretModel[183].setRotationPoint(0F, 0F, 0F);

		turretModel[184].addShapeBox(-13F, -27F, -16F, 37, 13, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret265
		turretModel[184].setRotationPoint(0F, 0F, 0F);

		turretModel[185].addShapeBox(-69F, -8F, -12F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret267
		turretModel[185].setRotationPoint(0F, 0F, 0F);

		turretModel[186].addShapeBox(-9F, -33F, -16F, 31, 6, 4, 0F,-2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Turret268
		turretModel[186].setRotationPoint(0F, 0F, 0F);

		turretModel[187].addShapeBox(-69F, -9F, -12F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret269
		turretModel[187].setRotationPoint(0F, 0F, 0F);

		turretModel[188].addShapeBox(-33F, -27F, -16F, 20, 3, 3, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Turret27
		turretModel[188].setRotationPoint(0F, 0F, 0F);

		turretModel[189].addShapeBox(-69F, -6F, -12F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Turret270
		turretModel[189].setRotationPoint(0F, 0F, 0F);

		turretModel[190].addShapeBox(-67.5F, -8F, -11.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Turret271
		turretModel[190].setRotationPoint(0F, 0F, 0F);

		turretModel[191].addShapeBox(-67.5F, -8F, -11.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Turret272
		turretModel[191].setRotationPoint(0F, 0F, 0F);

		turretModel[192].addBox(-61F, -28.5F, 11F, 2, 7, 4, 0F); // Turret273
		turretModel[192].setRotationPoint(0F, 0F, 0F);
		turretModel[192].rotateAngleZ = 0.31415927F;

		turretModel[193].addBox(-23F, -26F, -25F, 6, 2, 15, 0F); // Turret274
		turretModel[193].setRotationPoint(0F, 0F, 0F);

		turretModel[194].addBox(-23F, -26F, 10F, 6, 2, 15, 0F); // Turret275
		turretModel[194].setRotationPoint(0F, 0F, 0F);

		turretModel[195].addShapeBox(-38.5F, -12F, 15.5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret276
		turretModel[195].setRotationPoint(0F, 0F, 0F);

		turretModel[196].addShapeBox(-38.5F, 0F, 15.5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret277
		turretModel[196].setRotationPoint(0F, 0F, 0F);

		turretModel[197].addShapeBox(-65.5F, -8F, 15.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret278
		turretModel[197].setRotationPoint(0F, 0F, 0F);

		turretModel[198].addShapeBox(-65.5F, -11F, 17.5F, 1, 4, 1, 0F,.1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F); // Turret279
		turretModel[198].setRotationPoint(0F, 0F, 0F);

		turretModel[199].addShapeBox(-15F, -3F, 20F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret28
		turretModel[199].setRotationPoint(4F, -11F, 0F);
		turretModel[199].rotateAngleZ = -3.14159265F;

		turretModel[200].addShapeBox(-65.5F, -11F, 17.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret280
		turretModel[200].setRotationPoint(0F, 0F, 0F);

		turretModel[201].addShapeBox(-38.5F, -23F, 15.5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret281
		turretModel[201].setRotationPoint(0F, 0F, 0F);

		turretModel[202].addShapeBox(-39.5F, -23F, 17F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret282
		turretModel[202].setRotationPoint(0F, 0F, 0F);

		turretModel[203].addShapeBox(-40.5F, -25F, 17F, 1, 3, 1, 0F,0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Turret283
		turretModel[203].setRotationPoint(0F, 0F, 0F);

		turretModel[204].addShapeBox(-42.5F, -25F, 17F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret284
		turretModel[204].setRotationPoint(0F, 0F, 0F);

		turretModel[205].addShapeBox(-37F, -60.5F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret29
		turretModel[205].setRotationPoint(0F, 0F, 0F);

		turretModel[206].addShapeBox(-37F, -50.5F, -3F, 1, 2, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret290
		turretModel[206].setRotationPoint(0F, 0F, 0F);

		turretModel[207].addShapeBox(-33F, -14F, 13F, 20, 3, 3, 0F,0F, -12F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 12F, 0F); // Turret3
		turretModel[207].setRotationPoint(0F, 0F, 0F);

		turretModel[208].addShapeBox(-37F, -60.5F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Turret30
		turretModel[208].setRotationPoint(0F, 0F, 0F);

		turretModel[209].addShapeBox(-37F, -60.5F, -4F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret31
		turretModel[209].setRotationPoint(0F, 0F, 0F);

		turretModel[210].addShapeBox(-33F, -14F, -16F, 20, 3, 3, 0F,0F, -12F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 12F, 0F); // Turret32
		turretModel[210].setRotationPoint(0F, 0F, 0F);

		turretModel[211].addShapeBox(-15F, -3F, 20F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret33
		turretModel[211].setRotationPoint(4F, -11F, 0F);
		turretModel[211].rotateAngleZ = -4.3196899F;

		turretModel[212].addShapeBox(5F, -39.5F, -17F, 5, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret34
		turretModel[212].setRotationPoint(0F, 0F, 0F);

		turretModel[213].addShapeBox(5F, -40.5F, -17F, 5, 1, 34, 0F,-1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret35
		turretModel[213].setRotationPoint(0F, 0F, 0F);

		turretModel[214].addShapeBox(5F, -37.5F, -17F, 5, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F); // Turret36
		turretModel[214].setRotationPoint(0F, 0F, 0F);

		turretModel[215].addShapeBox(-53F, -2F, -16F, 20, 3, 3, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Turret37
		turretModel[215].setRotationPoint(0F, 0F, 0F);

		turretModel[216].addShapeBox(-15F, -3F, 20F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret38
		turretModel[216].setRotationPoint(4F, -11F, 0F);
		turretModel[216].rotateAngleZ = -3.92699082F;

		turretModel[217].addShapeBox(-73F, 3F, -16F, 20, 3, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Turret39
		turretModel[217].setRotationPoint(0F, 0F, 0F);

		turretModel[218].addShapeBox(-15F, -3F, 20F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret4
		turretModel[218].setRotationPoint(4F, -11F, 0F);
		turretModel[218].rotateAngleZ = -2.35619449F;

		turretModel[219].addShapeBox(-15F, -3F, 20F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret40
		turretModel[219].setRotationPoint(4F, -11F, 0F);
		turretModel[219].rotateAngleZ = -3.53429174F;

		turretModel[220].addShapeBox(-37F, -57.5F, -3F, 1, 14, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret41
		turretModel[220].setRotationPoint(0F, 0F, 0F);

		turretModel[221].addShapeBox(-38F, -41.5F, -5F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret42
		turretModel[221].setRotationPoint(0F, 0F, 0F);

		turretModel[222].addShapeBox(-38F, -38.5F, -8F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret43
		turretModel[222].setRotationPoint(0F, 0F, 0F);

		turretModel[223].addShapeBox(-38F, -38.5F, 2F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret44
		turretModel[223].setRotationPoint(0F, 0F, 0F);

		turretModel[224].addShapeBox(-38F, -31.5F, -5F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret45
		turretModel[224].setRotationPoint(0F, 0F, 0F);

		turretModel[225].addShapeBox(-38F, -41.5F, -8F, 3, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret46
		turretModel[225].setRotationPoint(0F, 0F, 0F);

		turretModel[226].addShapeBox(-37.5F, -43.5F, -3.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret47
		turretModel[226].setRotationPoint(0F, 0F, 0F);

		turretModel[227].addShapeBox(-38F, -31.5F, -8F, 3, 1, 3, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret48
		turretModel[227].setRotationPoint(0F, 0F, 0F);

		turretModel[228].addShapeBox(-38F, -41.5F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Turret49
		turretModel[228].setRotationPoint(0F, 0F, 0F);

		turretModel[229].addShapeBox(-59F, -28.5F, 11F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret5
		turretModel[229].setRotationPoint(0F, 0F, 0F);
		turretModel[229].rotateAngleZ = 0.31415927F;

		turretModel[230].addShapeBox(-73F, -7F, -16F, 20, 3, 3, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Turret50
		turretModel[230].setRotationPoint(0F, 0F, 0F);

		turretModel[231].addShapeBox(-15F, -3F, -26F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret51
		turretModel[231].setRotationPoint(4F, -11F, 0F);
		turretModel[231].rotateAngleZ = -1.57079633F;

		turretModel[232].addShapeBox(-38F, -31.5F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Turret52
		turretModel[232].setRotationPoint(0F, 0F, 0F);

		turretModel[233].addBox(-18F, -30F, 31F, 1, 36, 1, 0F); // Turret53
		turretModel[233].setRotationPoint(0F, 0F, 0F);

		turretModel[234].addBox(-27F, -30F, 31F, 1, 36, 1, 0F); // Turret54
		turretModel[234].setRotationPoint(0F, 0F, 0F);

		turretModel[235].addBox(-26F, -20F, 31F, 8, 1, 1, 0F); // Turret55
		turretModel[235].setRotationPoint(0F, 0F, 0F);

		turretModel[236].addBox(-26F, -15F, 31F, 8, 1, 1, 0F); // Turret56
		turretModel[236].setRotationPoint(0F, 0F, 0F);

		turretModel[237].addBox(-26F, -10F, 31F, 8, 1, 1, 0F); // Turret57
		turretModel[237].setRotationPoint(0F, 0F, 0F);

		turretModel[238].addBox(-26F, -5F, 31F, 8, 1, 1, 0F); // Turret58
		turretModel[238].setRotationPoint(0F, 0F, 0F);

		turretModel[239].addBox(-26F, 0F, 31F, 8, 1, 1, 0F); // Turret59
		turretModel[239].setRotationPoint(0F, 0F, 0F);

		turretModel[240].addShapeBox(-62F, -28.5F, 11F, 1, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret6
		turretModel[240].setRotationPoint(0F, 0F, 0F);
		turretModel[240].rotateAngleZ = 0.31415927F;

		turretModel[241].addBox(-26F, 5F, 31F, 8, 1, 1, 0F); // Turret60
		turretModel[241].setRotationPoint(0F, 0F, 0F);

		turretModel[242].addBox(-26F, -24F, 31F, 8, 1, 1, 0F); // Turret61
		turretModel[242].setRotationPoint(0F, 0F, 0F);

		turretModel[243].addShapeBox(-15F, -3F, -26F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret62
		turretModel[243].setRotationPoint(4F, -11F, 0F);
		turretModel[243].rotateAngleZ = -1.96349541F;

		turretModel[244].addBox(-27F, -26F, -31F, 10, 2, 6, 0F); // Turret63
		turretModel[244].setRotationPoint(0F, 0F, 0F);

		turretModel[245].addBox(-27F, -30F, -32F, 1, 36, 1, 0F); // Turret64
		turretModel[245].setRotationPoint(0F, 0F, 0F);

		turretModel[246].addBox(-18F, -30F, -32F, 1, 36, 1, 0F); // Turret65
		turretModel[246].setRotationPoint(0F, 0F, 0F);

		turretModel[247].addBox(-26F, -24F, -32F, 8, 1, 1, 0F); // Turret66
		turretModel[247].setRotationPoint(0F, 0F, 0F);

		turretModel[248].addBox(-26F, -20F, -32F, 8, 1, 1, 0F); // Turret67
		turretModel[248].setRotationPoint(0F, 0F, 0F);

		turretModel[249].addBox(-26F, -15F, -32F, 8, 1, 1, 0F); // Turret68
		turretModel[249].setRotationPoint(0F, 0F, 0F);

		turretModel[250].addBox(-26F, -10F, -32F, 8, 1, 1, 0F); // Turret69
		turretModel[250].setRotationPoint(0F, 0F, 0F);

		turretModel[251].addBox(-61F, -28F, 10.5F, 2, 2, 5, 0F); // Turret7
		turretModel[251].setRotationPoint(0F, 0F, 0F);
		turretModel[251].rotateAngleZ = 0.31415927F;

		turretModel[252].addBox(-26F, -5F, -32F, 8, 1, 1, 0F); // Turret70
		turretModel[252].setRotationPoint(0F, 0F, 0F);

		turretModel[253].addBox(-26F, 0F, -32F, 8, 1, 1, 0F); // Turret71
		turretModel[253].setRotationPoint(0F, 0F, 0F);

		turretModel[254].addBox(-26F, 5F, -32F, 8, 1, 1, 0F); // Turret72
		turretModel[254].setRotationPoint(0F, 0F, 0F);

		turretModel[255].addShapeBox(-15F, -3F, -26F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret73
		turretModel[255].setRotationPoint(4F, -11F, 0F);
		turretModel[255].rotateAngleZ = -2.35619449F;

		turretModel[256].addBox(42F, -19.5F, -25F, 2, 2, 10, 0F); // Turret74
		turretModel[256].setRotationPoint(0F, 0F, 0F);

		turretModel[257].addBox(44F, -19.5F, -25F, 1, 28, 1, 0F); // Turret75
		turretModel[257].setRotationPoint(0F, 0F, 0F);

		turretModel[258].addBox(44F, -19.5F, -16F, 1, 28, 1, 0F); // Turret76
		turretModel[258].setRotationPoint(0F, 0F, 0F);

		turretModel[259].addBox(44F, -16.5F, -24F, 1, 1, 8, 0F); // Turret77
		turretModel[259].setRotationPoint(0F, 0F, 0F);

		turretModel[260].addBox(44F, -12.5F, -24F, 1, 1, 8, 0F); // Turret78
		turretModel[260].setRotationPoint(0F, 0F, 0F);

		turretModel[261].addBox(44F, -8.5F, -24F, 1, 1, 8, 0F); // Turret79
		turretModel[261].setRotationPoint(0F, 0F, 0F);

		turretModel[262].addShapeBox(-62F, -28F, 10.5F, 1, 2, 5, 0F,.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F); // Turret8
		turretModel[262].setRotationPoint(0F, 0F, 0F);
		turretModel[262].rotateAngleZ = 0.31415927F;

		turretModel[263].addBox(44F, -4.5F, -24F, 1, 1, 8, 0F); // Turret80
		turretModel[263].setRotationPoint(0F, 0F, 0F);

		turretModel[264].addBox(44F, -0.5F, -24F, 1, 1, 8, 0F); // Turret81
		turretModel[264].setRotationPoint(0F, 0F, 0F);

		turretModel[265].addBox(44F, 3.5F, -24F, 1, 1, 8, 0F); // Turret82
		turretModel[265].setRotationPoint(0F, 0F, 0F);

		turretModel[266].addBox(44F, 7.5F, -24F, 1, 1, 8, 0F); // Turret83
		turretModel[266].setRotationPoint(0F, 0F, 0F);

		turretModel[267].addShapeBox(-15F, -3F, -26F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret84
		turretModel[267].setRotationPoint(4F, -11F, 0F);
		turretModel[267].rotateAngleZ = -3.14159265F;

		turretModel[268].addBox(44F, -19.5F, 24F, 1, 28, 1, 0F); // Turret85
		turretModel[268].setRotationPoint(0F, 0F, 0F);

		turretModel[269].addBox(44F, -19.5F, 15F, 1, 28, 1, 0F); // Turret86
		turretModel[269].setRotationPoint(0F, 0F, 0F);

		turretModel[270].addBox(44F, -16.5F, 16F, 1, 1, 8, 0F); // Turret87
		turretModel[270].setRotationPoint(0F, 0F, 0F);

		turretModel[271].addBox(42F, -19.5F, 15F, 2, 2, 10, 0F); // Turret88
		turretModel[271].setRotationPoint(0F, 0F, 0F);

		turretModel[272].addBox(44F, -12.5F, 16F, 1, 1, 8, 0F); // Turret89
		turretModel[272].setRotationPoint(0F, 0F, 0F);

		turretModel[273].addShapeBox(-59F, -28F, 10.5F, 1, 2, 5, 0F,0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F); // Turret9
		turretModel[273].setRotationPoint(0F, 0F, 0F);
		turretModel[273].rotateAngleZ = 0.31415927F;

		turretModel[274].addBox(44F, -8.5F, 16F, 1, 1, 8, 0F); // Turret90
		turretModel[274].setRotationPoint(0F, 0F, 0F);

		turretModel[275].addBox(44F, -4.5F, 16F, 1, 1, 8, 0F); // Turret91
		turretModel[275].setRotationPoint(0F, 0F, 0F);

		turretModel[276].addBox(44F, -0.5F, 16F, 1, 1, 8, 0F); // Turret92
		turretModel[276].setRotationPoint(0F, 0F, 0F);

		turretModel[277].addBox(44F, 3.5F, 16F, 1, 1, 8, 0F); // Turret93
		turretModel[277].setRotationPoint(0F, 0F, 0F);

		turretModel[278].addBox(44F, 7.5F, 16F, 1, 1, 8, 0F); // Turret94
		turretModel[278].setRotationPoint(0F, 0F, 0F);

		turretModel[279].addShapeBox(-33F, -27F, 10F, 20, 16, 3, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 12F, 0F); // Turret95
		turretModel[279].setRotationPoint(0F, 0F, 0F);

		turretModel[280].addShapeBox(-15F, -3F, -26F, 30, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret96
		turretModel[280].setRotationPoint(4F, -11F, 0F);
		turretModel[280].rotateAngleZ = -3.53429174F;

		turretModel[281].addShapeBox(-37F, -37.5F, 44F, 1, 23, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret97
		turretModel[281].setRotationPoint(0F, 0F, 0F);
		turretModel[281].rotateAngleX = 0.89011792F;

		turretModel[282].addBox(-82F, -19F, 20F, 1, 24, 1, 0F); // Turret98
		turretModel[282].setRotationPoint(0F, 0F, 0F);

		turretModel[283].addBox(-73F, -19F, 20F, 1, 24, 1, 0F); // Turret99
		turretModel[283].setRotationPoint(0F, 0F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 370, 2, textureX, textureY); // Gun1
		barrelModel[1] = new ModelRendererTurbo(this, 365, 220, textureX, textureY); // Gun10
		barrelModel[2] = new ModelRendererTurbo(this, 166, 28, textureX, textureY); // Gun100
		barrelModel[3] = new ModelRendererTurbo(this, 194, 209, textureX, textureY); // Gun101
		barrelModel[4] = new ModelRendererTurbo(this, 194, 209, textureX, textureY); // Gun102
		barrelModel[5] = new ModelRendererTurbo(this, 194, 209, textureX, textureY); // Gun103
		barrelModel[6] = new ModelRendererTurbo(this, 194, 209, textureX, textureY); // Gun104
		barrelModel[7] = new ModelRendererTurbo(this, 355, 288, textureX, textureY); // Gun105
		barrelModel[8] = new ModelRendererTurbo(this, 375, 281, textureX, textureY); // Gun106
		barrelModel[9] = new ModelRendererTurbo(this, 355, 281, textureX, textureY); // Gun107
		barrelModel[10] = new ModelRendererTurbo(this, 375, 281, textureX, textureY); // Gun108
		barrelModel[11] = new ModelRendererTurbo(this, 463, 257, textureX, textureY); // Gun109
		barrelModel[12] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Gun11
		barrelModel[13] = new ModelRendererTurbo(this, 463, 257, textureX, textureY); // Gun110
		barrelModel[14] = new ModelRendererTurbo(this, 191, 287, textureX, textureY); // Gun111
		barrelModel[15] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun112
		barrelModel[16] = new ModelRendererTurbo(this, 407, 275, textureX, textureY); // Gun113
		barrelModel[17] = new ModelRendererTurbo(this, 431, 22, textureX, textureY); // Gun12
		barrelModel[18] = new ModelRendererTurbo(this, 431, 48, textureX, textureY); // Gun13
		barrelModel[19] = new ModelRendererTurbo(this, 431, 76, textureX, textureY); // Gun14
		barrelModel[20] = new ModelRendererTurbo(this, 432, 101, textureX, textureY); // Gun15
		barrelModel[21] = new ModelRendererTurbo(this, 474, 65, textureX, textureY); // Gun16
		barrelModel[22] = new ModelRendererTurbo(this, 464, 39, textureX, textureY); // Gun17
		barrelModel[23] = new ModelRendererTurbo(this, 431, 48, textureX, textureY); // Gun18
		barrelModel[24] = new ModelRendererTurbo(this, 431, 76, textureX, textureY); // Gun19
		barrelModel[25] = new ModelRendererTurbo(this, 370, 21, textureX, textureY); // Gun2
		barrelModel[26] = new ModelRendererTurbo(this, 432, 101, textureX, textureY); // Gun20
		barrelModel[27] = new ModelRendererTurbo(this, 431, 22, textureX, textureY); // Gun21
		barrelModel[28] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Gun22
		barrelModel[29] = new ModelRendererTurbo(this, 199, 209, textureX, textureY); // Gun23
		barrelModel[30] = new ModelRendererTurbo(this, 166, 6, textureX, textureY); // Gun24
		barrelModel[31] = new ModelRendererTurbo(this, 166, 170, textureX, textureY); // Gun25
		barrelModel[32] = new ModelRendererTurbo(this, 166, 75, textureX, textureY); // Gun26
		barrelModel[33] = new ModelRendererTurbo(this, 166, 95, textureX, textureY); // Gun27
		barrelModel[34] = new ModelRendererTurbo(this, 166, 195, textureX, textureY); // Gun28
		barrelModel[35] = new ModelRendererTurbo(this, 166, 125, textureX, textureY); // Gun29
		barrelModel[36] = new ModelRendererTurbo(this, 370, 46, textureX, textureY); // Gun3
		barrelModel[37] = new ModelRendererTurbo(this, 464, 39, textureX, textureY); // Gun30
		barrelModel[38] = new ModelRendererTurbo(this, 474, 65, textureX, textureY); // Gun31
		barrelModel[39] = new ModelRendererTurbo(this, 471, 204, textureX, textureY); // Gun32
		barrelModel[40] = new ModelRendererTurbo(this, 471, 179, textureX, textureY); // Gun33
		barrelModel[41] = new ModelRendererTurbo(this, 471, 131, textureX, textureY); // Gun34
		barrelModel[42] = new ModelRendererTurbo(this, 471, 156, textureX, textureY); // Gun35
		barrelModel[43] = new ModelRendererTurbo(this, 166, 154, textureX, textureY); // Gun36
		barrelModel[44] = new ModelRendererTurbo(this, 471, 107, textureX, textureY); // Gun37
		barrelModel[45] = new ModelRendererTurbo(this, 471, 179, textureX, textureY); // Gun38
		barrelModel[46] = new ModelRendererTurbo(this, 471, 204, textureX, textureY); // Gun39
		barrelModel[47] = new ModelRendererTurbo(this, 370, 72, textureX, textureY); // Gun4
		barrelModel[48] = new ModelRendererTurbo(this, 471, 156, textureX, textureY); // Gun40
		barrelModel[49] = new ModelRendererTurbo(this, 471, 131, textureX, textureY); // Gun41
		barrelModel[50] = new ModelRendererTurbo(this, 471, 107, textureX, textureY); // Gun42
		barrelModel[51] = new ModelRendererTurbo(this, 359, 245, textureX, textureY); // Gun43
		barrelModel[52] = new ModelRendererTurbo(this, 471, 107, textureX, textureY); // Gun44
		barrelModel[53] = new ModelRendererTurbo(this, 471, 131, textureX, textureY); // Gun45
		barrelModel[54] = new ModelRendererTurbo(this, 166, 135, textureX, textureY); // Gun46
		barrelModel[55] = new ModelRendererTurbo(this, 471, 156, textureX, textureY); // Gun47
		barrelModel[56] = new ModelRendererTurbo(this, 471, 179, textureX, textureY); // Gun48
		barrelModel[57] = new ModelRendererTurbo(this, 471, 204, textureX, textureY); // Gun49
		barrelModel[58] = new ModelRendererTurbo(this, 370, 98, textureX, textureY); // Gun5
		barrelModel[59] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun50
		barrelModel[60] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun51
		barrelModel[61] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun52
		barrelModel[62] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun53
		barrelModel[63] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun54
		barrelModel[64] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun55
		barrelModel[65] = new ModelRendererTurbo(this, 233, 205, textureX, textureY); // Gun56
		barrelModel[66] = new ModelRendererTurbo(this, 166, 103, textureX, textureY); // Gun57
		barrelModel[67] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun58
		barrelModel[68] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun59
		barrelModel[69] = new ModelRendererTurbo(this, 365, 121, textureX, textureY); // Gun6
		barrelModel[70] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun60
		barrelModel[71] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun61
		barrelModel[72] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun62
		barrelModel[73] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun63
		barrelModel[74] = new ModelRendererTurbo(this, 233, 205, textureX, textureY); // Gun64
		barrelModel[75] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun65
		barrelModel[76] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun66
		barrelModel[77] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun67
		barrelModel[78] = new ModelRendererTurbo(this, 166, 40, textureX, textureY); // Gun68
		barrelModel[79] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun69
		barrelModel[80] = new ModelRendererTurbo(this, 365, 141, textureX, textureY); // Gun7
		barrelModel[81] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun70
		barrelModel[82] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun71
		barrelModel[83] = new ModelRendererTurbo(this, 233, 205, textureX, textureY); // Gun72
		barrelModel[84] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun73
		barrelModel[85] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun74
		barrelModel[86] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun75
		barrelModel[87] = new ModelRendererTurbo(this, 233, 205, textureX, textureY); // Gun76
		barrelModel[88] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun77
		barrelModel[89] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun78
		barrelModel[90] = new ModelRendererTurbo(this, 244, 205, textureX, textureY); // Gun79
		barrelModel[91] = new ModelRendererTurbo(this, 365, 167, textureX, textureY); // Gun8
		barrelModel[92] = new ModelRendererTurbo(this, 463, 257, textureX, textureY); // Gun80
		barrelModel[93] = new ModelRendererTurbo(this, 463, 257, textureX, textureY); // Gun81
		barrelModel[94] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun82
		barrelModel[95] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun83
		barrelModel[96] = new ModelRendererTurbo(this, 281, 256, textureX, textureY); // Gun84
		barrelModel[97] = new ModelRendererTurbo(this, 281, 286, textureX, textureY); // Gun85
		barrelModel[98] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun86
		barrelModel[99] = new ModelRendererTurbo(this, 250, 262, textureX, textureY); // Gun87
		barrelModel[100] = new ModelRendererTurbo(this, 250, 279, textureX, textureY); // Gun88
		barrelModel[101] = new ModelRendererTurbo(this, 166, 59, textureX, textureY); // Gun89
		barrelModel[102] = new ModelRendererTurbo(this, 365, 194, textureX, textureY); // Gun9
		barrelModel[103] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun90
		barrelModel[104] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Gun91
		barrelModel[105] = new ModelRendererTurbo(this, 209, 274, textureX, textureY); // Gun92
		barrelModel[106] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun93
		barrelModel[107] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun94
		barrelModel[108] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun95
		barrelModel[109] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun96
		barrelModel[110] = new ModelRendererTurbo(this, 281, 227, textureX, textureY); // Gun97
		barrelModel[111] = new ModelRendererTurbo(this, 194, 209, textureX, textureY); // Gun98
		barrelModel[112] = new ModelRendererTurbo(this, 194, 209, textureX, textureY); // Gun99

		barrelModel[0].addShapeBox(18F, -9.5F, -6.5F, 9, 3, 13, 0F,0F, -.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -.5F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Gun1
		barrelModel[0].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[1].addShapeBox(-13F, 6.5F, -6.5F, 31, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F); // Gun10
		barrelModel[1].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[2].addShapeBox(-14F, -6.5F, -3.5F, 84, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Gun100
		barrelModel[2].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[3].addShapeBox(-26.5F, -12.5F, 2.5F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun101
		barrelModel[3].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[4].addShapeBox(-26.5F, -14.5F, -5.5F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun102
		barrelModel[4].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[5].addShapeBox(-26.5F, -13.5F, -5.5F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun103
		barrelModel[5].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[6].addShapeBox(-26.5F, -12.5F, -5.5F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun104
		barrelModel[6].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[7].addBox(-31F, -9F, -4.5F, 5, 1, 1, 0F); // Gun105
		barrelModel[7].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[8].addShapeBox(-31F, -9F, -4.5F, 1, 7, 1, 0F,0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Gun106
		barrelModel[8].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[9].addBox(-35F, -3F, -4.5F, 5, 1, 1, 0F); // Gun107
		barrelModel[9].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[10].addShapeBox(-35.2F, -3F, -4.5F, 1, 1, 1, 0F,0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Gun108
		barrelModel[10].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[11].addShapeBox(-12F, 10F, -9.5F, 1, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun109
		barrelModel[11].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[12].addShapeBox(11F, -10F, -7F, 2, 3, 14, 0F,0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun11
		barrelModel[12].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[13].addShapeBox(-12F, 17F, -9.5F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun110
		barrelModel[13].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[14].addBox(-20F, 11F, -6.5F, 8, 7, 13, 0F); // Gun111
		barrelModel[14].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[15].addShapeBox(-15F, -6F, 6.5F, 2, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun112
		barrelModel[15].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[16].addShapeBox(-24F, -5F, -20.5F, 7, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun113
		barrelModel[16].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[17].addShapeBox(11F, -7F, -9.5F, 2, 4, 19, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun12
		barrelModel[17].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[18].addShapeBox(11F, -3F, -9.5F, 2, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun13
		barrelModel[18].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[19].addShapeBox(11F, 3F, -9.5F, 2, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Gun14
		barrelModel[19].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[20].addShapeBox(11F, 7F, -7F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F); // Gun15
		barrelModel[20].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[21].addShapeBox(6F, -10F, -7F, 2, 3, 14, 0F,-5F, -.5F, -4F, 5F, -.5F, -4F, 5F, -.5F, -4F, -5F, -.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun16
		barrelModel[21].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[22].addShapeBox(-1F, -7F, -9.5F, 2, 4, 19, 0F,-7F, 0F, -2.5F, 7F, 0F, -2.5F, 7F, 0F, -2.5F, -7F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun17
		barrelModel[22].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[23].addShapeBox(-1F, -3F, -9.5F, 2, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun18
		barrelModel[23].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[24].addShapeBox(-1F, 3F, -9.5F, 2, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Gun19
		barrelModel[24].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[25].addShapeBox(18F, -6.5F, -9F, 9, 4, 18, 0F,0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Gun2
		barrelModel[25].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[26].addShapeBox(-1F, 7F, -7F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F); // Gun20
		barrelModel[26].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[27].addShapeBox(-1F, -7F, -9.5F, 2, 4, 19, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun21
		barrelModel[27].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[28].addShapeBox(-1F, -10F, -7F, 2, 3, 14, 0F,0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun22
		barrelModel[28].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[29].addShapeBox(-13F, -7F, -9.5F, 1, 15, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun23
		barrelModel[29].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[30].addShapeBox(-14F, -9.5F, -6.5F, 84, 3, 13, 0F,0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun24
		barrelModel[30].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[31].addShapeBox(-14F, -6.5F, 0F, 84, 4, 9, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun25
		barrelModel[31].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[32].addShapeBox(-14F, 2.5F, -9F, 84, 4, 9, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Gun26
		barrelModel[32].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[33].addShapeBox(-14F, 5.5F, -3.5F, 84, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Gun27
		barrelModel[33].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[34].addShapeBox(-14F, -6.5F, 2.5F, 84, 1, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Gun28
		barrelModel[34].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[35].addShapeBox(-14F, 5.5F, 2.5F, 84, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun29
		barrelModel[35].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[36].addShapeBox(18F, -2.5F, -9F, 9, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Gun3
		barrelModel[36].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[37].addShapeBox(-1F, -7F, -9.5F, 2, 4, 19, 0F,7F, 0F, -2.5F, -7F, 0F, -2.5F, -7F, 0F, -2.5F, 7F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun30
		barrelModel[37].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[38].addShapeBox(-8F, -10F, -7F, 2, 3, 14, 0F,5F, -.5F, -4F, -5F, -.5F, -4F, -5F, -.5F, -4F, 5F, -.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun31
		barrelModel[38].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[39].addShapeBox(13F, -9F, -9.5F, 1, 20, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun32
		barrelModel[39].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[40].addShapeBox(13F, -10F, -9.5F, 1, 1, 19, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun33
		barrelModel[40].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[41].addShapeBox(13F, -16F, -8F, 1, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun34
		barrelModel[41].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[42].addShapeBox(13F, -11F, -9F, 1, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun35
		barrelModel[42].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[43].addShapeBox(-14F, -2.5F, 5F, 84, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun36
		barrelModel[43].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[44].addShapeBox(13F, -17F, -8F, 1, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun37
		barrelModel[44].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[45].addShapeBox(-12F, -10F, -9.5F, 1, 1, 19, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun38
		barrelModel[45].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[46].addShapeBox(-12F, -9F, -9.5F, 1, 20, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun39
		barrelModel[46].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[47].addShapeBox(18F, 2.5F, -9F, 9, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2.5F); // Gun4
		barrelModel[47].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[48].addShapeBox(-12F, -11F, -9F, 1, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun40
		barrelModel[48].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[49].addShapeBox(-12F, -16F, -8F, 1, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun41
		barrelModel[49].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[50].addShapeBox(-12F, -17F, -8F, 1, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun42
		barrelModel[50].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[51].addShapeBox(-11F, 9F, -9.5F, 34, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun43
		barrelModel[51].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[52].addShapeBox(-0.5F, -17F, -8F, 1, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun44
		barrelModel[52].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[53].addShapeBox(-0.5F, -16F, -8F, 1, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun45
		barrelModel[53].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[54].addShapeBox(-14F, 2.5F, 0F, 84, 4, 9, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Gun46
		barrelModel[54].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[55].addShapeBox(-0.5F, -11F, -9F, 1, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun47
		barrelModel[55].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[56].addShapeBox(-0.5F, -10F, -9.5F, 1, 1, 19, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun48
		barrelModel[56].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[57].addShapeBox(-0.5F, -9F, -9.5F, 1, 20, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun49
		barrelModel[57].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[58].addShapeBox(18F, 6.5F, -6.5F, 9, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -.5F, -4F); // Gun5
		barrelModel[58].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[59].addShapeBox(-22F, -14F, 1F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun50
		barrelModel[59].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[60].addShapeBox(-22F, -16F, 1F, 42, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun51
		barrelModel[60].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[61].addShapeBox(-22F, -12F, 1F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Gun52
		barrelModel[61].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[62].addShapeBox(20F, -14F, 1F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F); // Gun53
		barrelModel[62].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[63].addShapeBox(20F, -16F, 1F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F); // Gun54
		barrelModel[63].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[64].addShapeBox(20F, -12F, 1F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F); // Gun55
		barrelModel[64].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[65].addBox(23F, -13.5F, 3.5F, 1, 1, 1, 0F); // Gun56
		barrelModel[65].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[66].addShapeBox(-14F, 6.5F, -6.5F, 84, 3, 13, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -4F); // Gun57
		barrelModel[66].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[67].addShapeBox(-22F, -12F, -7F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Gun58
		barrelModel[67].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[68].addShapeBox(-22F, -14F, -7F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun59
		barrelModel[68].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[69].addShapeBox(-13F, -9.5F, -6.5F, 31, 3, 13, 0F,0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun6
		barrelModel[69].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[70].addShapeBox(-22F, -16F, -7F, 42, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun60
		barrelModel[70].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[71].addShapeBox(20F, -16F, -7F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F); // Gun61
		barrelModel[71].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[72].addShapeBox(20F, -14F, -7F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F); // Gun62
		barrelModel[72].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[73].addShapeBox(20F, -12F, -7F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F); // Gun63
		barrelModel[73].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[74].addBox(23F, -13.5F, -4.5F, 1, 1, 1, 0F); // Gun64
		barrelModel[74].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[75].addShapeBox(-18F, 15F, -7F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Gun65
		barrelModel[75].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[76].addShapeBox(-18F, 13F, -7F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun66
		barrelModel[76].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[77].addShapeBox(-18F, 11F, -7F, 42, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun67
		barrelModel[77].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[78].addShapeBox(-14F, -6.5F, -9F, 84, 4, 9, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F); // Gun68
		barrelModel[78].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[79].addShapeBox(24F, 11F, -7F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F); // Gun69
		barrelModel[79].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[80].addShapeBox(-13F, -6.5F, -9F, 31, 4, 18, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun7
		barrelModel[80].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[81].addShapeBox(24F, 13F, -7F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F); // Gun70
		barrelModel[81].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[82].addShapeBox(24F, 15F, -7F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F); // Gun71
		barrelModel[82].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[83].addBox(27F, 13.5F, -4.5F, 1, 1, 1, 0F); // Gun72
		barrelModel[83].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[84].addShapeBox(24F, 11F, 1F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F); // Gun73
		barrelModel[84].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[85].addShapeBox(24F, 13F, 1F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F); // Gun74
		barrelModel[85].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[86].addShapeBox(24F, 15F, 1F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F); // Gun75
		barrelModel[86].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[87].addBox(27F, 13.5F, 3.5F, 1, 1, 1, 0F); // Gun76
		barrelModel[87].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[88].addShapeBox(-18F, 11F, 1F, 42, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun77
		barrelModel[88].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[89].addShapeBox(-18F, 13F, 1F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun78
		barrelModel[89].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[90].addShapeBox(-18F, 15F, 1F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Gun79
		barrelModel[90].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[91].addShapeBox(-13F, -2.5F, -9F, 31, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun8
		barrelModel[91].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[92].addShapeBox(22F, 10F, -9.5F, 1, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun80
		barrelModel[92].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[93].addShapeBox(22F, 17F, -9.5F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun81
		barrelModel[93].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[94].addShapeBox(-26F, -10F, -9.5F, 14, 3, 19, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun82
		barrelModel[94].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[95].addShapeBox(-26F, 8F, -9.5F, 14, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Gun83
		barrelModel[95].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[96].addShapeBox(-26F, -7F, -9.5F, 13, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun84
		barrelModel[96].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[97].addShapeBox(-26F, 7F, -9.5F, 13, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun85
		barrelModel[97].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[98].addShapeBox(-26F, -6F, -9.5F, 13, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun86
		barrelModel[98].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[99].addShapeBox(-26F, -6F, -6.5F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Gun87
		barrelModel[99].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[100].addShapeBox(-26F, 4F, -6.5F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun88
		barrelModel[100].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[101].addShapeBox(-14F, -2.5F, -9F, 84, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun89
		barrelModel[101].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[102].addShapeBox(-13F, 2.5F, -9F, 31, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Gun9
		barrelModel[102].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[103].addShapeBox(-26F, -6F, 6.5F, 3, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun90
		barrelModel[103].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[104].addShapeBox(-26F, -6F, 3.5F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun91
		barrelModel[104].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[105].addShapeBox(-26F, 4F, 3.5F, 12, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun92
		barrelModel[105].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[106].addShapeBox(-26F, -14F, -6.5F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun93
		barrelModel[106].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[107].addShapeBox(-26F, -14F, 1.5F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun94
		barrelModel[107].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[108].addShapeBox(-26F, -15F, 1.5F, 2, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun95
		barrelModel[108].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[109].addShapeBox(-26F, -15F, -6.5F, 2, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun96
		barrelModel[109].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[110].addShapeBox(-26F, -13F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun97
		barrelModel[110].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[111].addShapeBox(-26.5F, -13.5F, 2.5F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun98
		barrelModel[111].setRotationPoint(7.5F, -38.5F, 0F);

		barrelModel[112].addShapeBox(-26.5F, -14.5F, 2.5F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun99
		barrelModel[112].setRotationPoint(7.5F, -38.5F, 0F);
	}
}