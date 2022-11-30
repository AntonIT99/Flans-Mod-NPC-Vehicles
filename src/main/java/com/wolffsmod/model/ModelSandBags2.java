package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelSandBags2 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSandBags2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[60];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 110
		bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 111
		bodyModel[3] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 112
		bodyModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 113
		bodyModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 114
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 109
		bodyModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 110
		bodyModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 111
		bodyModel[9] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 112
		bodyModel[10] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 113
		bodyModel[11] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 114
		bodyModel[12] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 109
		bodyModel[13] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 110
		bodyModel[14] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 111
		bodyModel[15] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 112
		bodyModel[16] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 113
		bodyModel[17] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 114
		bodyModel[18] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 109
		bodyModel[19] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 110
		bodyModel[20] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 111
		bodyModel[21] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 112
		bodyModel[22] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 113
		bodyModel[23] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 114
		bodyModel[24] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 109
		bodyModel[25] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 110
		bodyModel[26] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 111
		bodyModel[27] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 112
		bodyModel[28] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 113
		bodyModel[29] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 114
		bodyModel[30] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 109
		bodyModel[31] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 110
		bodyModel[32] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 111
		bodyModel[33] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 112
		bodyModel[34] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 113
		bodyModel[35] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 114
		bodyModel[36] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 109
		bodyModel[37] = new ModelRendererTurbo(this, 409, 289, textureX, textureY); // Box 110
		bodyModel[38] = new ModelRendererTurbo(this, 121, 305, textureX, textureY); // Box 111
		bodyModel[39] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Box 112
		bodyModel[40] = new ModelRendererTurbo(this, 241, 305, textureX, textureY); // Box 113
		bodyModel[41] = new ModelRendererTurbo(this, 409, 313, textureX, textureY); // Box 114
		bodyModel[42] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 109
		bodyModel[43] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 110
		bodyModel[44] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 111
		bodyModel[45] = new ModelRendererTurbo(this, 121, 369, textureX, textureY); // Box 112
		bodyModel[46] = new ModelRendererTurbo(this, 241, 369, textureX, textureY); // Box 113
		bodyModel[47] = new ModelRendererTurbo(this, 329, 369, textureX, textureY); // Box 114
		bodyModel[48] = new ModelRendererTurbo(this, 417, 369, textureX, textureY); // Box 109
		bodyModel[49] = new ModelRendererTurbo(this, 241, 393, textureX, textureY); // Box 110
		bodyModel[50] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Box 111
		bodyModel[51] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 112
		bodyModel[52] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 113
		bodyModel[53] = new ModelRendererTurbo(this, 401, 417, textureX, textureY); // Box 114
		bodyModel[54] = new ModelRendererTurbo(this, 121, 433, textureX, textureY); // Box 109
		bodyModel[55] = new ModelRendererTurbo(this, 201, 449, textureX, textureY); // Box 110
		bodyModel[56] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 111
		bodyModel[57] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 112
		bodyModel[58] = new ModelRendererTurbo(this, 289, 457, textureX, textureY); // Box 113
		bodyModel[59] = new ModelRendererTurbo(this, 377, 457, textureX, textureY); // Box 114

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[0].setRotationPoint(8F, -16F, -30F);

		bodyModel[1].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[1].setRotationPoint(8F, -10F, -30F);

		bodyModel[2].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[2].setRotationPoint(8F, -10F, -24F);

		bodyModel[3].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[3].setRotationPoint(8F, -16F, -24F);

		bodyModel[4].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[4].setRotationPoint(8F, -16F, 12F);

		bodyModel[5].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[5].setRotationPoint(8F, -10F, 12F);

		bodyModel[6].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[6].setRotationPoint(-32F, -16F, -30F);

		bodyModel[7].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[7].setRotationPoint(-32F, -10F, -30F);

		bodyModel[8].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[8].setRotationPoint(-32F, -10F, -24F);

		bodyModel[9].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[9].setRotationPoint(-32F, -16F, -24F);

		bodyModel[10].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[10].setRotationPoint(-32F, -16F, 12F);

		bodyModel[11].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[11].setRotationPoint(-32F, -10F, 12F);

		bodyModel[12].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[12].setRotationPoint(-12F, -24F, -30F);

		bodyModel[13].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[13].setRotationPoint(-12F, -18F, -30F);

		bodyModel[14].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[14].setRotationPoint(-12F, -18F, -24F);

		bodyModel[15].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[15].setRotationPoint(-12F, -24F, -24F);

		bodyModel[16].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[16].setRotationPoint(-12F, -24F, 12F);

		bodyModel[17].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[17].setRotationPoint(-12F, -18F, 12F);

		bodyModel[18].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[18].setRotationPoint(8F, -32F, -30F);

		bodyModel[19].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[19].setRotationPoint(8F, -26F, -30F);

		bodyModel[20].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[20].setRotationPoint(8F, -26F, -24F);

		bodyModel[21].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[21].setRotationPoint(8F, -32F, -24F);

		bodyModel[22].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[22].setRotationPoint(8F, -32F, 12F);

		bodyModel[23].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[23].setRotationPoint(8F, -26F, 12F);

		bodyModel[24].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[24].setRotationPoint(-12F, -8F, -30F);

		bodyModel[25].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[25].setRotationPoint(-12F, -2F, -30F);

		bodyModel[26].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[26].setRotationPoint(-12F, -2F, -24F);

		bodyModel[27].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[27].setRotationPoint(-12F, -8F, -24F);

		bodyModel[28].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[28].setRotationPoint(-12F, -8F, 12F);

		bodyModel[29].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[29].setRotationPoint(-12F, -2F, 12F);

		bodyModel[30].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[30].setRotationPoint(-32F, -32F, -30F);

		bodyModel[31].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[31].setRotationPoint(-32F, -26F, -30F);

		bodyModel[32].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[32].setRotationPoint(-32F, -26F, -24F);

		bodyModel[33].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[33].setRotationPoint(-32F, -32F, -24F);

		bodyModel[34].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[34].setRotationPoint(-32F, -32F, 12F);

		bodyModel[35].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[35].setRotationPoint(-32F, -26F, 12F);

		bodyModel[36].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[36].setRotationPoint(8F, -48F, -30F);

		bodyModel[37].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[37].setRotationPoint(8F, -42F, -30F);

		bodyModel[38].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[38].setRotationPoint(8F, -42F, -24F);

		bodyModel[39].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[39].setRotationPoint(8F, -48F, -24F);

		bodyModel[40].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[40].setRotationPoint(8F, -48F, 12F);

		bodyModel[41].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[41].setRotationPoint(8F, -42F, 12F);

		bodyModel[42].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[42].setRotationPoint(-32F, -48F, -30F);

		bodyModel[43].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[43].setRotationPoint(-32F, -42F, -30F);

		bodyModel[44].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[44].setRotationPoint(-32F, -42F, -24F);

		bodyModel[45].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[45].setRotationPoint(-32F, -48F, -24F);

		bodyModel[46].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[46].setRotationPoint(-32F, -48F, 12F);

		bodyModel[47].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[47].setRotationPoint(-32F, -42F, 12F);

		bodyModel[48].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[48].setRotationPoint(-12F, -40F, -30F);

		bodyModel[49].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[49].setRotationPoint(-12F, -34F, -30F);

		bodyModel[50].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[50].setRotationPoint(-12F, -34F, -24F);

		bodyModel[51].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[51].setRotationPoint(-12F, -40F, -24F);

		bodyModel[52].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[52].setRotationPoint(-12F, -40F, 12F);

		bodyModel[53].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[53].setRotationPoint(-12F, -34F, 12F);

		bodyModel[54].addShapeBox(-4F, 0F, -2F, 32, 8, 8, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[54].setRotationPoint(-12F, -56F, -30F);

		bodyModel[55].addShapeBox(-4F, 2F, -2F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		bodyModel[55].setRotationPoint(-12F, -50F, -30F);

		bodyModel[56].addShapeBox(-4F, 2F, 0F, 32, 8, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 111
		bodyModel[56].setRotationPoint(-12F, -50F, -24F);

		bodyModel[57].addShapeBox(-4F, 0F, 0F, 32, 8, 48, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[57].setRotationPoint(-12F, -56F, -24F);

		bodyModel[58].addShapeBox(-4F, 0F, 12F, 32, 8, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		bodyModel[58].setRotationPoint(-12F, -56F, 12F);

		bodyModel[59].addShapeBox(-4F, 2F, 12F, 32, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F); // Box 114
		bodyModel[59].setRotationPoint(-12F, -50F, 12F);



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
		for(int i = 0; i < steeringWheelModel.length; i++)
		{
			steeringWheelModel[i].render(f5);
		}
	}
}
