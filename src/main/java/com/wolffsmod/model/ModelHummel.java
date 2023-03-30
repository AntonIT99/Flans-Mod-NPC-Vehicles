package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelHummel
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 512;


  
  public ModelHummel() {
    bodyModel = new ModelRendererTurbo[165];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 20, 440, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 30, 440, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 20, 440, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 20, 440, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 20, 440, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 20, 440, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 30, 440, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 20, 440, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 20, 440, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 20, 440, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 181, 451, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 65, 445, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 65, 445, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 65, 445, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 65, 445, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 40, 445, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 65, 445, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 65, 445, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 65, 445, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 65, 445, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 246, 498, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 246, 485, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 160, 460, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 184, 460, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 198, 460, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 206, 460, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 320, 425, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 247, 450, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 290, 435, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 290, 445, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 217, 500, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 217, 487, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 0, 372, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 22, 372, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 25, 347, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 25, 355, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 117, 367, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 137, 367, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 145, 367, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 117, 372, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 137, 372, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 145, 372, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 245, 240, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 245, 250, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 260, 292, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 363, 261, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 382, 261, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 382, 280, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 401, 261, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 401, 280, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 414, 261, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 414, 280, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 0, 145, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 105, 115, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 185, 128, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 286, 115, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 387, 145, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 0, 133, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 0, 120, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 0, 145, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 21, 145, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 60, 120, textureX, textureY);
    bodyModel[104] = new ModelRendererTurbo(this, 0, 153, textureX, textureY);
    bodyModel[105] = new ModelRendererTurbo(this, 113, 115, textureX, textureY);
    bodyModel[106] = new ModelRendererTurbo(this, 113, 144, textureX, textureY);
    bodyModel[107] = new ModelRendererTurbo(this, 185, 115, textureX, textureY);
    bodyModel[108] = new ModelRendererTurbo(this, 185, 145, textureX, textureY);
    bodyModel[109] = new ModelRendererTurbo(this, 185, 115, textureX, textureY);
    bodyModel[110] = new ModelRendererTurbo(this, 192, 115, textureX, textureY);
    bodyModel[111] = new ModelRendererTurbo(this, 185, 121, textureX, textureY);
    bodyModel[112] = new ModelRendererTurbo(this, 192, 121, textureX, textureY);
    bodyModel[113] = new ModelRendererTurbo(this, 0, 160, textureX, textureY);
    bodyModel[114] = new ModelRendererTurbo(this, 0, 173, textureX, textureY);
    bodyModel[115] = new ModelRendererTurbo(this, 287, 115, textureX, textureY);
    bodyModel[116] = new ModelRendererTurbo(this, 287, 130, textureX, textureY);
    bodyModel[117] = new ModelRendererTurbo(this, 287, 145, textureX, textureY);
    bodyModel[118] = new ModelRendererTurbo(this, 303, 145, textureX, textureY);
    bodyModel[119] = new ModelRendererTurbo(this, 115, 115, textureX, textureY);
    bodyModel[120] = new ModelRendererTurbo(this, 115, 115, textureX, textureY);
    bodyModel[121] = new ModelRendererTurbo(this, 405, 92, textureX, textureY);
    bodyModel[122] = new ModelRendererTurbo(this, 405, 92, textureX, textureY);
    bodyModel[123] = new ModelRendererTurbo(this, 405, 92, textureX, textureY);
    bodyModel[124] = new ModelRendererTurbo(this, 333, 70, textureX, textureY);
    bodyModel[125] = new ModelRendererTurbo(this, 355, 70, textureX, textureY);
    bodyModel[126] = new ModelRendererTurbo(this, 390, 110, textureX, textureY);
    bodyModel[127] = new ModelRendererTurbo(this, 415, 110, textureX, textureY);
    bodyModel[128] = new ModelRendererTurbo(this, 10, 80, textureX, textureY);
    bodyModel[129] = new ModelRendererTurbo(this, 42, 71, textureX, textureY);
    bodyModel[130] = new ModelRendererTurbo(this, 80, 85, textureX, textureY);
    bodyModel[131] = new ModelRendererTurbo(this, 154, 85, textureX, textureY);
    bodyModel[132] = new ModelRendererTurbo(this, 224, 85, textureX, textureY);
    bodyModel[133] = new ModelRendererTurbo(this, 244, 61, textureX, textureY);
    bodyModel[134] = new ModelRendererTurbo(this, 244, 61, textureX, textureY);
    bodyModel[135] = new ModelRendererTurbo(this, 268, 61, textureX, textureY);
    bodyModel[136] = new ModelRendererTurbo(this, 290, 61, textureX, textureY);
    bodyModel[137] = new ModelRendererTurbo(this, 308, 61, textureX, textureY);
    bodyModel[138] = new ModelRendererTurbo(this, 224, 55, textureX, textureY);
    bodyModel[139] = new ModelRendererTurbo(this, 154, 55, textureX, textureY);
    bodyModel[140] = new ModelRendererTurbo(this, 80, 55, textureX, textureY);
    bodyModel[141] = new ModelRendererTurbo(this, 0, 70, textureX, textureY);
    bodyModel[142] = new ModelRendererTurbo(this, 470, 0, textureX, textureY);
    bodyModel[143] = new ModelRendererTurbo(this, 95, 10, textureX, textureY);
    bodyModel[144] = new ModelRendererTurbo(this, 110, 10, textureX, textureY);
    
     bodyModel[145] = new ModelRendererTurbo(this, 506, 0, textureX, textureY);
     bodyModel[146] = new ModelRendererTurbo(this, 501, 0, textureX, textureY);
     bodyModel[147] = new ModelRendererTurbo(this, 476, 0, textureX, textureY);
     bodyModel[148] = new ModelRendererTurbo(this, 476, 3, textureX, textureY);
     bodyModel[149] = new ModelRendererTurbo(this, 481, 3, textureX, textureY);
     bodyModel[150] = new ModelRendererTurbo(this, 445, 0, textureX, textureY);
     bodyModel[151] = new ModelRendererTurbo(this, 445, 3, textureX, textureY);
     bodyModel[152] = new ModelRendererTurbo(this, 476, 6, textureX, textureY);
     bodyModel[153] = new ModelRendererTurbo(this, 476, 9, textureX, textureY);
     bodyModel[154] = new ModelRendererTurbo(this, 500, 16, textureX, textureY);
     bodyModel[155] = new ModelRendererTurbo(this, 488, 3, textureX, textureY);
     bodyModel[156] = new ModelRendererTurbo(this, 488, 3, textureX, textureY);
     bodyModel[157] = new ModelRendererTurbo(this, 495, 3, textureX, textureY);
     bodyModel[158] = new ModelRendererTurbo(this, 500, 3, textureX, textureY);
     bodyModel[159] = new ModelRendererTurbo(this, 500, 6, textureX, textureY);
     bodyModel[160] = new ModelRendererTurbo(this, 500, 9, textureX, textureY);
     bodyModel[161] = new ModelRendererTurbo(this, 476, 12, textureX, textureY);
     bodyModel[162] = new ModelRendererTurbo(this, 489, 12, textureX, textureY);
     bodyModel[163] = new ModelRendererTurbo(this, 500, 12, textureX, textureY);
     bodyModel[164] = new ModelRendererTurbo(this, 505, 12, textureX, textureY);
    
     bodyModel[145].addShapeBox(11.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F);
    
     bodyModel[146].addShapeBox(10.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.05F, -0.05F);
    
     bodyModel[147].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    
     bodyModel[148].addShapeBox(8.0F, -1.92F, -0.5F, 1, 1, 1, 0.0F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F);
    
     bodyModel[149].addShapeBox(0.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, -0.2F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    
     bodyModel[150].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F);
    
    ( bodyModel[151]).flip = true;
     bodyModel[151].addShapeBox(-1.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F);
    
     bodyModel[152].addBox(-9.0F, -1.0F, -0.5F, 8, 1, 1, 0.0F);
    
     bodyModel[153].addShapeBox(-9.0F, -2.0F, -0.5F, 8, 1, 1, 0.0F, -5.0F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -5.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    
     bodyModel[154].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.25F);
    
     bodyModel[155].addShapeBox(-5.5F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    
    ( bodyModel[156]).flip = true;
     bodyModel[156].addShapeBox(-5.5F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    
     bodyModel[157].addShapeBox(-5.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 1.0F, -0.8F, -0.2F, -1.0F, -0.5F, -0.2F, -1.0F, -0.5F, -0.2F, 1.0F, -0.8F, -0.2F);
    
     bodyModel[158].addShapeBox(-12.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, -0.25F);
    
     bodyModel[159].addShapeBox(-12.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F);
    
     bodyModel[160].addShapeBox(-12.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.3F, -0.9F, 0.0F, -0.3F, -0.9F, 0.0F, 0.0F, 0.0F, -0.25F);
    
     bodyModel[161].addBox(-3.4F, -0.2F, 0.0F, 2, 3, 4, 0.0F);
    
     bodyModel[162].addBox(-2.9F, -0.8F, 0.0F, 1, 0, 3, 0.0F);
    ( bodyModel[162]).rotateAngleX = -0.2094395F;
    
     bodyModel[163].addShapeBox(-4.2F, -1.0F, -1.2F, 1, 1, 1, 0.0F, -0.4F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
    
     bodyModel[163].addShapeBox(-4.0F, -1.5F, -1.3F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);

    
    for (int i = 145;i<164;i++)
    {
    	bodyModel[i].setRotationPoint(4.5F, -45.0F, -21.0F);
    }
    
    bodyModel[0].addBox(0.0F, 0.0F, 0.0F, 15, 2, 3, 0.0F);
    bodyModel[0].setRotationPoint(-35.0F, 4.0F, -23.5F);
    
    bodyModel[1].addFlexBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F, -1.8F, -1.8F, -0.5F, 0.0F, 4);
    bodyModel[1].setRotationPoint(-35.0F, 1.0F, -23.5F);
    
    bodyModel[2].addFlexBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, -1.0F, -1.0F, -0.7F, 0.0F, 4);
    bodyModel[2].setRotationPoint(-31.0F, -3.0F, -22.5F);
    
    bodyModel[3].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 0);
    bodyModel[3].setRotationPoint(-23.0F, -3.0F, -22.5F);
    
    bodyModel[4].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 0);
    bodyModel[4].setRotationPoint(-33.0F, -3.0F, -22.5F);
    
    bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 15, 2, 3, 0.0F);
    bodyModel[5].setRotationPoint(-13.0F, 4.0F, -23.5F);
    
    bodyModel[6].addFlexBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F, -1.8F, -1.8F, -0.5F, 0.0F, 4);
    bodyModel[6].setRotationPoint(-13.0F, 1.0F, -23.5F);
    
    bodyModel[7].addFlexBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, -1.0F, -1.0F, -0.7F, 0.0F, 4);
    bodyModel[7].setRotationPoint(-9.0F, -3.0F, -22.5F);
    
    bodyModel[8].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 0);
    bodyModel[8].setRotationPoint(-1.0F, -3.0F, -22.5F);
    
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 15, 2, 3, 0.0F);
    bodyModel[9].setRotationPoint(9.0F, 4.0F, -23.5F);
    
    bodyModel[10].addFlexBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F, -1.8F, -1.8F, -0.5F, 0.0F, 4);
    bodyModel[10].setRotationPoint(9.0F, 1.0F, -23.5F);
    
    bodyModel[11].addFlexBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, -1.0F, -1.0F, -0.7F, 0.0F, 4);
    bodyModel[11].setRotationPoint(13.0F, -3.0F, -22.5F);
    
    bodyModel[12].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 0);
    bodyModel[12].setRotationPoint(21.0F, -3.0F, -22.5F);
    
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 15, 2, 3, 0.0F);
    bodyModel[13].setRotationPoint(31.0F, 4.0F, -23.5F);
    
    bodyModel[14].addFlexBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F, -1.8F, -1.8F, -0.5F, 0.0F, 4);
    bodyModel[14].setRotationPoint(31.0F, 1.0F, -23.5F);
    
    bodyModel[15].addFlexBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, -1.0F, -1.0F, -0.7F, 0.0F, 4);
    bodyModel[15].setRotationPoint(35.0F, -3.0F, -22.5F);
    
    bodyModel[16].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 0);
    bodyModel[16].setRotationPoint(43.0F, -3.0F, -22.5F);
    
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 15, 2, 3, 0.0F);
    bodyModel[17].setRotationPoint(-35.0F, 4.0F, 20.5F);
    
    bodyModel[18].addFlexBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F, -1.8F, -1.8F, -0.5F, 0.0F, 4);
    bodyModel[18].setRotationPoint(-35.0F, 1.0F, 20.5F);
    
    bodyModel[19].addFlexBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, -1.0F, -1.0F, 0.0F, -0.7F, 4);
    bodyModel[19].setRotationPoint(-31.0F, -3.0F, 20.5F);
    
    bodyModel[20].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 1);
    bodyModel[20].setRotationPoint(-23.0F, -3.0F, 20.5F);
    
    bodyModel[21].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 1);
    bodyModel[21].setRotationPoint(-33.0F, -3.0F, 20.5F);
    
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 15, 2, 3, 0.0F);
    bodyModel[22].setRotationPoint(-13.0F, 4.0F, 20.5F);
    
    bodyModel[23].addFlexBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F, -1.8F, -1.8F, -0.5F, 0.0F, 4);
    bodyModel[23].setRotationPoint(-13.0F, 1.0F, 20.5F);
    
    bodyModel[24].addFlexBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, -1.0F, -1.0F, 0.0F, -0.7F, 4);
    bodyModel[24].setRotationPoint(-9.0F, -3.0F, 20.5F);
    
    bodyModel[25].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 1);
    bodyModel[25].setRotationPoint(-1.0F, -3.0F, 20.5F);
    
    bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 15, 2, 3, 0.0F);
    bodyModel[26].setRotationPoint(9.0F, 4.0F, 20.5F);
    
    bodyModel[27].addFlexBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F, -1.8F, -1.8F, -0.5F, 0.0F, 4);
    bodyModel[27].setRotationPoint(9.0F, 1.0F, 20.5F);
    
    bodyModel[28].addFlexBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, -1.0F, -1.0F, 0.0F, -0.7F, 4);
    bodyModel[28].setRotationPoint(13.0F, -3.0F, 20.5F);
    
    bodyModel[29].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 1);
    bodyModel[29].setRotationPoint(21.0F, -3.0F, 20.5F);
    
    bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 15, 2, 3, 0.0F);
    bodyModel[30].setRotationPoint(31.0F, 4.0F, 20.5F);
    
    bodyModel[31].addFlexBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F, -1.8F, -1.8F, -0.5F, 0.0F, 4);
    bodyModel[31].setRotationPoint(31.0F, 1.0F, 20.5F);
    
    bodyModel[32].addFlexBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, -1.0F, -1.0F, 0.0F, -0.7F, 4);
    bodyModel[32].setRotationPoint(35.0F, -3.0F, 20.5F);
    
    bodyModel[33].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 1);
    bodyModel[33].setRotationPoint(43.0F, -3.0F, 20.5F);
    
    bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 2, 2, 59, 0.0F);
    bodyModel[34].setRotationPoint(53.5F, -4.5F, -29.5F);
    
    bodyModel[35].addBox(0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F);
    bodyModel[35].setRotationPoint(-48.5F, -1.5F, -29.5F);
    
    bodyModel[36].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[36].setRotationPoint(-34.0F, 3.0F, -28.5F);
    
    bodyModel[37].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[37].setRotationPoint(-23.0F, 3.0F, -28.5F);
    
    bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[38].setRotationPoint(-12.0F, 3.0F, -28.5F);
    
    bodyModel[39].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[39].setRotationPoint(-1.0F, 3.0F, -28.5F);
    
    bodyModel[40].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[40].setRotationPoint(10.0F, 3.0F, -28.5F);
    
    bodyModel[41].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[41].setRotationPoint(21.0F, 3.0F, -28.5F);
    
    bodyModel[42].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[42].setRotationPoint(32.0F, 3.0F, -28.5F);
    
    bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[43].setRotationPoint(43.0F, 3.0F, -28.5F);
    
    bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[44].setRotationPoint(32.0F, -10.0F, -24.0F);
    
    bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[45].setRotationPoint(14.0F, -10.0F, -24.0F);
    
    bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[46].setRotationPoint(-8.0F, -10.0F, -24.0F);
    
    bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[47].setRotationPoint(-30.0F, -10.0F, -24.0F);
    
    bodyModel[48].addBox(0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F);
    bodyModel[48].setRotationPoint(-48.5F, -1.5F, 12.5F);
    
    bodyModel[49].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[49].setRotationPoint(-34.0F, 3.0F, 22.5F);
    
    bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[50].setRotationPoint(-23.0F, 3.0F, 22.5F);
    
    bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[51].setRotationPoint(-12.0F, 3.0F, 22.5F);
    
    bodyModel[52].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[52].setRotationPoint(-1.0F, 3.0F, 22.5F);
    
    bodyModel[53].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[53].setRotationPoint(10.0F, 3.0F, 22.5F);
    
    bodyModel[54].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[54].setRotationPoint(21.0F, 3.0F, 22.5F);
    
    bodyModel[55].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[55].setRotationPoint(32.0F, 3.0F, 22.5F);
    
    bodyModel[56].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[56].setRotationPoint(43.0F, 3.0F, 22.5F);
    
    bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[57].setRotationPoint(32.0F, -10.0F, 20.0F);
    
    bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[58].setRotationPoint(14.0F, -10.0F, 20.0F);
    
    bodyModel[59].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[59].setRotationPoint(-8.0F, -10.0F, 20.0F);
    
    bodyModel[60].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[60].setRotationPoint(-30.0F, -10.0F, 20.0F);
    
    bodyModel[61].addBox(0.0F, 0.0F, 0.0F, 110, 1, 10, 0.0F);
    bodyModel[61].setRotationPoint(-50.0F, -15.0F, -31.0F);
    
    bodyModel[62].addBox(0.0F, 0.0F, 0.0F, 110, 1, 10, 0.0F);
    bodyModel[62].setRotationPoint(-50.0F, -15.0F, 21.0F);
    
    bodyModel[63].addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
    bodyModel[63].setRotationPoint(45.0F, -15.5F, -25.0F);
    
    bodyModel[64].addBox(10.0F, -0.1F, -0.5F, 2, 1, 4, 0.0F);
    bodyModel[64].setRotationPoint(45.0F, -15.5F, -25.0F);
    
    bodyModel[65].addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
    bodyModel[65].setRotationPoint(46.0F, -16.0F, -25.5F);
    
    bodyModel[66].addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
    bodyModel[66].setRotationPoint(53.0F, -16.0F, -25.5F);
    
    bodyModel[67].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 2.0D, 0, 2) }), 25.0F, 6, 6, 20, 25, 0, new float[] { 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F });
    bodyModel[67].setRotationPoint(-46.0F, -8.0F, 8.0F);
    
    bodyModel[68].addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
    bodyModel[68].setRotationPoint(-53.0F, -15.0F, -2.0F);
    (bodyModel[68]).rotateAngleX = -0.3665192F;
    (bodyModel[68]).rotateAngleZ = 0.4712389F;
    
    bodyModel[69].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 1.0F, 7, 7, 24, 1, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    bodyModel[69].setRotationPoint(-45.5F, -7.5F, 5.0F);
    
    bodyModel[70].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 1.0F, 7, 7, 24, 1, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    bodyModel[70].setRotationPoint(-45.5F, -7.5F, -14.0F);
    
    bodyModel[71].addBox(0.0F, 0.0F, 0.0F, 5, 4, 6, 0.0F);
    bodyModel[71].setRotationPoint(-49.5F, -2.2F, -20.0F);
    (bodyModel[71]).rotateAngleZ = 0.1396263F;
    
    bodyModel[72].addBox(0.0F, 0.0F, 0.0F, 5, 4, 6, 0.0F);
    bodyModel[72].setRotationPoint(-49.5F, -2.2F, 14.0F);
    (bodyModel[72]).rotateAngleZ = 0.1396263F;
    
    bodyModel[73].addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
    bodyModel[73].setRotationPoint(41.5F, -17.0F, 23.0F);
    
    bodyModel[74].addBox(0.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
    bodyModel[74].setRotationPoint(43.0F, -16.0F, 27.0F);
    
    bodyModel[75].addTrapezoid(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F, -0.5F, 3);
    bodyModel[75].setRotationPoint(51.0F, -20.0F, 25.0F);
    
    bodyModel[76].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
    bodyModel[76].setRotationPoint(51.5F, -18.0F, 26.0F);
    
    bodyModel[77].addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
    bodyModel[77].setRotationPoint(56.5F, -7.0F, -18.0F);
    
    bodyModel[78].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[78].setRotationPoint(63.0F, -6.5F, -17.0F);
    
    bodyModel[79].addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
    bodyModel[79].setRotationPoint(56.5F, -7.0F, -15.0F);
    
    bodyModel[80].addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
    bodyModel[80].setRotationPoint(56.5F, -7.0F, 14.0F);
    
    bodyModel[81].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[81].setRotationPoint(63.0F, -6.5F, 15.0F);
    
    bodyModel[82].addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
    bodyModel[82].setRotationPoint(56.5F, -7.0F, 17.0F);
    
    bodyModel[83].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 13.0D, 0, 13), new Coord2D(2.0D, 4.0D, 2, 4), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(99.0D, 0.0D, 99, 0), new Coord2D(107.0D, 1.0D, 107, 1), new Coord2D(110.0D, 13.0D, 110, 13) }), 42.0F, 110, 13, 241, 42, 0, new float[] { 110.0F, 13.0F, 9.0F, 91.0F, 8.0F, 10.0F });
    bodyModel[83].setRotationPoint(63.0F, 3.0F, 21.0F);
    
    bodyModel[84].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(127.0D, 0.0D, 127, 0), new Coord2D(117.0D, 7.0D, 117, 7), new Coord2D(7.0D, 7.0D, 7, 7), new Coord2D(4.0D, 6.0D, 4, 6) }), 1.0F, 127, 7, 262, 1, 0, new float[] { 8.0F, 4.0F, 110.0F, 13.0F, 127.0F });
    bodyModel[84].setRotationPoint(67.0F, -8.0F, 21.0F);
    
    bodyModel[85].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(127.0D, 0.0D, 127, 0), new Coord2D(117.0D, 7.0D, 117, 7), new Coord2D(7.0D, 7.0D, 7, 7), new Coord2D(4.0D, 6.0D, 4, 6) }), 1.0F, 127, 7, 262, 1, 0, new float[] { 8.0F, 4.0F, 110.0F, 13.0F, 127.0F });
    bodyModel[85].setRotationPoint(67.0F, -8.0F, -20.0F);
    
    bodyModel[86].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(15.0D, 0.0D, 15, 0), new Coord2D(15.0D, 5.0D, 15, 5) }), 40.0F, 15, 5, 36, 40, 0, new float[] { 16.0F, 5.0F, 15.0F });
    bodyModel[86].setRotationPoint(63.0F, -10.0F, 20.0F);
    
    bodyModel[87].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 5.0D, 2, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 0.0D, 0, 0) }), 40.0F, 2, 5, 14, 40, 0, new float[] { 1.0F, 6.0F, 1.0F, 6.0F });
    bodyModel[87].setRotationPoint(-46.0F, -10.0F, 20.0F);
    
    bodyModel[88].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(4.0D, 6.0D, 4, 6) }), 10.0F, 4, 6, 16, 10, 0, new float[] { 8.0F, 1.0F, 6.0F, 1.0F });
    bodyModel[88].setRotationPoint(67.0F, -8.0F, 31.0F);
    
    bodyModel[89].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(4.0D, 6.0D, 4, 6) }), 10.0F, 4, 6, 16, 10, 0, new float[] { 8.0F, 1.0F, 6.0F, 1.0F });
    bodyModel[89].setRotationPoint(67.0F, -8.0F, -21.0F);
    
    bodyModel[90].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2) }), 10.0F, 3, 2, 10, 10, 0, new float[] { 4.0F, 1.0F, 4.0F, 1.0F });
    bodyModel[90].setRotationPoint(63.0F, -13.0F, 31.0F);
    
    bodyModel[91].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2) }), 10.0F, 3, 2, 10, 10, 0, new float[] { 4.0F, 1.0F, 4.0F, 1.0F });
    bodyModel[91].setRotationPoint(63.0F, -13.0F, -21.0F);
    
    bodyModel[92].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 6.0D, 0, 6) }), 10.0F, 10, 7, 26, 10, 0, new float[] { 11.0F, 1.0F, 13.0F, 1.0F });
    bodyModel[92].setRotationPoint(-50.0F, -8.0F, 31.0F);
    
    bodyModel[93].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 6.0D, 0, 6) }), 10.0F, 10, 7, 26, 10, 0, new float[] { 11.0F, 1.0F, 13.0F, 1.0F });
    bodyModel[93].setRotationPoint(-50.0F, -8.0F, -21.0F);
    
    bodyModel[94].addShapeBox(0.0F, 0.0F, 0.0F, 30, 9, 42, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, -3.0F, -5.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[94].setRotationPoint(18.0F, -24.0F, -21.0F);
    
    bodyModel[95].addShapeBox(0.0F, 0.0F, 0.0F, 8, 9, 60, 0.0F, 5.0F, 0.0F, -2.0F, -6.5F, 0.0F, -9.0F, -6.5F, 0.0F, -9.0F, 5.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[95].setRotationPoint(19.0F, -24.0F, -30.0F);
    
    bodyModel[96].addShapeBox(0.0F, 0.0F, 0.0F, 19, 9, 60, 0.0F, 0.0F, 0.0F, -2.0F, -5.0F, 0.0F, -2.0F, -5.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[96].setRotationPoint(0.0F, -24.0F, -30.0F);
    
    bodyModel[97].addShapeBox(0.0F, 0.0F, 0.0F, 9, 9, 60, 0.0F, -9.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -9.0F, 0.0F, -2.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F);
    bodyModel[97].setRotationPoint(-9.0F, -24.0F, -30.0F);
    
    bodyModel[98].addBox(0.0F, 0.0F, 0.0F, 1, 7, 42, 0.0F);
    bodyModel[98].setRotationPoint(-9.0F, -15.0F, -21.0F);
    
    bodyModel[99].addBox(0.0F, 0.0F, -2.0F, 27, 8, 2, 0.0F);
    bodyModel[99].setRotationPoint(-13.0F, -23.0F, 29.0F);
    (bodyModel[99]).rotateAngleX = 0.3109983F;
    
    bodyModel[100].addBox(0.0F, 0.0F, 0.0F, 27, 8, 2, 0.0F);
    bodyModel[100].setRotationPoint(-13.0F, -23.0F, -29.0F);
    (bodyModel[100]).rotateAngleX = -0.3109983F;
    
    bodyModel[101].addBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
    bodyModel[101].setRotationPoint(-7.0F, -41.0F, 22.0F);
    (bodyModel[101]).rotateAngleX = -1.259798F;
    
    bodyModel[102].addBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
    bodyModel[102].setRotationPoint(-1.0F, -41.0F, 22.0F);
    (bodyModel[102]).rotateAngleX = -1.259798F;
    
    bodyModel[103].addBox(0.0F, 0.0F, 0.0F, 18, 9, 7, 0.0F);
    bodyModel[103].setRotationPoint(-43.0F, -24.0F, -28.0F);
    
    bodyModel[104].addBox(0.0F, 0.0F, 0.0F, 6, 2, 3, 0.0F);
    bodyModel[104].setRotationPoint(-42.0F, -25.0F, -27.0F);
    
    bodyModel[105].addBox(0.0F, 0.0F, 0.0F, 7, 10, 14, 0.0F);
    bodyModel[105].setRotationPoint(-46.0F, -19.0F, -16.0F);
    
    bodyModel[106].addBox(0.0F, 0.0F, 0.0F, 7, 10, 14, 0.0F);
    bodyModel[106].setRotationPoint(-46.0F, -19.0F, 2.0F);
    
    bodyModel[107].addShapeBox(0.0F, 0.0F, 0.0F, 1, 12, 14, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[107].setRotationPoint(-46.7F, -33.0F, 0.0F);
    
    bodyModel[108].addShapeBox(0.0F, 0.0F, 0.0F, 1, 12, 14, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[108].setRotationPoint(-46.7F, -33.0F, -14.0F);
    
    bodyModel[109].addBox(-0.5F, 1.0F, 0.0F, 1, 3, 1, 0.0F);
    bodyModel[109].setRotationPoint(-45.0F, -33.0F, 13.5F);
    (bodyModel[109]).rotateAngleZ = -0.1658063F;
    
    bodyModel[110].addBox(-0.5F, 8.0F, 0.0F, 1, 3, 1, 0.0F);
    bodyModel[110].setRotationPoint(-45.0F, -33.0F, 13.5F);
    (bodyModel[110]).rotateAngleZ = -0.1658063F;
    
    bodyModel[111].addBox(-0.5F, 1.0F, 0.0F, 1, 3, 1, 0.0F);
    bodyModel[111].setRotationPoint(-45.0F, -33.0F, -14.5F);
    (bodyModel[111]).rotateAngleZ = -0.1658063F;
    
    bodyModel[112].addBox(-0.5F, 8.0F, 0.0F, 1, 3, 1, 0.0F);
    bodyModel[112].setRotationPoint(-45.0F, -33.0F, -14.5F);
    (bodyModel[112]).rotateAngleZ = -0.1658063F;
    
    bodyModel[113].addBox(2.0F, -0.5F, 5.0F, 6, 1, 9, 0.0F);
    bodyModel[113].setRotationPoint(43.0F, -24.0F, -21.0F);
    (bodyModel[113]).rotateAngleZ = -1.082104F;
    
    bodyModel[114].addBox(2.0F, -0.5F, 28.0F, 6, 1, 9, 0.0F);
    bodyModel[114].setRotationPoint(43.0F, -24.0F, -21.0F);
    (bodyModel[114]).rotateAngleZ = -1.082104F;
    
    bodyModel[115].addBox(0.0F, 0.0F, 0.0F, 11, 1, 11, 0.0F);
    bodyModel[115].setRotationPoint(30.0F, -24.2F, -17.0F);
    
    bodyModel[116].addBox(0.0F, 0.0F, 0.0F, 11, 1, 11, 0.0F);
    bodyModel[116].setRotationPoint(30.0F, -24.2F, 6.0F);
    
    bodyModel[117].addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
    bodyModel[117].setRotationPoint(40.0F, -24.5F, -14.0F);
    
    bodyModel[118].addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
    bodyModel[118].setRotationPoint(40.0F, -24.5F, 9.0F);
    
    bodyModel[119].addBox(-0.9F, 14.3F, 45.0F, 1, 4, 1, 0.0F);
    bodyModel[119].setRotationPoint(-45.0F, -33.0F, -25.0F);
    (bodyModel[119]).rotateAngleZ = -0.1658063F;
    
    bodyModel[120].addBox(-0.9F, 14.3F, 4.0F, 1, 4, 1, 0.0F);
    bodyModel[120].setRotationPoint(-45.0F, -33.0F, -25.0F);
    (bodyModel[120]).rotateAngleZ = -0.1658063F;
    
    bodyModel[121].addBox(-0.8F, 14.8F, 0.0F, 1, 1, 50, 0.0F);
    bodyModel[121].setRotationPoint(-45.0F, -33.0F, -25.0F);
    (bodyModel[121]).rotateAngleZ = -0.1658063F;
    
    bodyModel[122].addBox(-0.8F, 15.9F, 0.0F, 1, 1, 50, 0.0F);
    bodyModel[122].setRotationPoint(-45.0F, -33.0F, -25.0F);
    (bodyModel[122]).rotateAngleZ = -0.1658063F;
    
    bodyModel[123].addBox(-0.8F, 17.0F, 0.0F, 1, 1, 50, 0.0F);
    bodyModel[123].setRotationPoint(-45.0F, -33.0F, -25.0F);
    (bodyModel[123]).rotateAngleZ = -0.1658063F;
    
    bodyModel[124].addShapeBox(0.0F, 0.0F, 0.0F, 1, 28, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[124].setRotationPoint(-10.0F, -43.0F, 21.0F);
    
    bodyModel[125].addShapeBox(0.0F, 0.0F, 0.0F, 1, 28, 9, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[125].setRotationPoint(-10.0F, -43.0F, -30.0F);
    
    bodyModel[126].addShapeBox(0.0F, 0.0F, 0.0F, 1, 22, 9, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[126].setRotationPoint(-23.0F, -37.0F, 21.0F);
    
    bodyModel[127].addShapeBox(0.0F, 0.0F, 0.0F, 1, 22, 9, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[127].setRotationPoint(-23.0F, -37.0F, -30.0F);
    
    bodyModel[128].addShapeBox(0.0F, 0.0F, 0.0F, 1, 6, 28, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[128].setRotationPoint(-48.0F, -21.0F, -14.0F);
    
    bodyModel[129].addShapeBox(0.0F, 0.0F, 0.0F, 1, 18, 16, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -5.0F, -3.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[129].setRotationPoint(-48.0F, -33.0F, 14.0F);
    
    bodyModel[130].addShapeBox(0.0F, 0.0F, 0.0F, 35, 28, 1, 0.0F, -3.0F, -10.0F, 5.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, -9.0F, -3.0F, -10.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[130].setRotationPoint(-48.0F, -43.0F, 30.0F);
    
    bodyModel[131].addShapeBox(0.0F, 0.0F, 0.0F, 33, 28, 1, 0.0F, 0.0F, 0.0F, 9.0F, -17.0F, 0.0F, 9.0F, -17.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[131].setRotationPoint(-13.0F, -43.0F, 30.0F);
    
    bodyModel[132].addShapeBox(0.0F, 0.0F, 0.0F, 8, 28, 1, 0.0F, 17.0F, 0.0F, 9.0F, -23.0F, 0.0F, 10.0F, -22.0F, 0.0F, -11.0F, 17.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 9.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[132].setRotationPoint(20.0F, -43.0F, 30.0F);
    
    bodyModel[133].addShapeBox(0.0F, 0.0F, 0.0F, 1, 11, 42, 0.0F, 8.642857F, 0.0F, 0.0F, -8.642857F, 0.0F, 0.0F, -8.642857F, 0.0F, 0.0F, 8.642857F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[133].setRotationPoint(27.0F, -26.0F, -21.0F);
    
    bodyModel[134].addShapeBox(0.0F, 0.0F, 0.0F, 1, 17, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -13.357142F, 0.0F, 3.0F, 13.357142F, 0.0F, 3.0F, 13.357142F, 0.0F, 0.0F, -13.357142F, 0.0F, 0.0F);
    bodyModel[134].setRotationPoint(5.0F, -43.0F, 11.0F);
    
    bodyModel[135].addShapeBox(0.0F, 0.0F, 0.0F, 1, 17, 7, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.357142F, 0.0F, 0.0F, 13.357142F, 0.0F, 0.0F, 13.357142F, 0.0F, -3.0F, -13.357142F, 0.0F, -3.0F);
    bodyModel[135].setRotationPoint(4.8F, -43.0F, 4.0F);
    
    bodyModel[136].addShapeBox(0.0F, 0.0F, 0.0F, 1, 17, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -13.357142F, 0.0F, -3.0F, 13.357142F, 0.0F, -3.0F, 13.357142F, 0.0F, 0.0F, -13.357142F, 0.0F, 0.0F);
    bodyModel[136].setRotationPoint(4.8F, -43.0F, -11.0F);
    
    bodyModel[137].addShapeBox(0.0F, 0.0F, 0.0F, 1, 17, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.357142F, 0.0F, 0.0F, 13.357142F, 0.0F, 0.0F, 13.357142F, 0.0F, 3.0F, -13.357142F, 0.0F, 3.0F);
    bodyModel[137].setRotationPoint(5.0F, -43.0F, -21.0F);
    
    bodyModel[138].addShapeBox(0.0F, 0.0F, 0.0F, 8, 28, 1, 0.0F, 17.0F, 0.0F, -9.0F, -22.0F, 0.0F, -11.0F, -23.0F, 0.0F, 10.0F, 17.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, -1.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[138].setRotationPoint(20.0F, -43.0F, -31.0F);
    
    bodyModel[139].addShapeBox(0.0F, 0.0F, 0.0F, 33, 28, 1, 0.0F, 0.0F, 0.0F, -9.0F, -17.0F, 0.0F, -9.0F, -17.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[139].setRotationPoint(-13.0F, -43.0F, -31.0F);
    
    bodyModel[140].addShapeBox(0.0F, 0.0F, 0.0F, 35, 28, 1, 0.0F, -3.0F, -10.0F, -5.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 9.0F, -3.0F, -10.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[140].setRotationPoint(-48.0F, -43.0F, -31.0F);
    
    bodyModel[141].addShapeBox(0.0F, 0.0F, 0.0F, 1, 18, 16, 0.0F, -3.0F, 0.0F, -5.0F, 3.0F, 0.0F, -5.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[141].setRotationPoint(-48.0F, -33.0F, -30.0F);
    
    bodyModel[142].addTrapezoid(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, -0.25F, 4);
    bodyModel[142].setRotationPoint(4.0F, -45.0F, -21.5F);
    
    bodyModel[143].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(1.0D, 2.0D, 1, 2) }), 1.0F, 3, 2, 9, 1, 0, new float[] { 1.0F, 3.0F, 1.0F, 4.0F });
    (bodyModel[143]).rotateAngleX = 1.5707964F;
    bodyModel[143].setRotationPoint(6.0F, -43.0F, 22.0F);
    
    bodyModel[144].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(1.0D, 2.0D, 1, 2) }), 1.0F, 3, 2, 9, 1, 0, new float[] { 1.0F, 3.0F, 1.0F, 4.0F });
    (bodyModel[144]).rotateAngleX = -1.5707964F;
    bodyModel[144].setRotationPoint(6.0F, -42.0F, -22.0F);


    
    turretModel = new ModelRendererTurbo[18];
    turretModel[0] = new ModelRendererTurbo(this, 0, 50, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 20, 50, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 400, 50, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 400, 58, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 0, 40, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 40, 40, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 80, 40, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 80, 45, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 116, 40, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 116, 46, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 151, 40, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 159, 40, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 165, 40, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 177, 40, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 187, 40, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 193, 40, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 205, 40, textureX, textureY);
    turretModel[17] = new ModelRendererTurbo(this, 176, 48, textureX, textureY);
    
    turretModel[0].addFlexBox(-5.0F, -37.0F, 6.0F, 7, 8, 2, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 4);
    
    turretModel[1].addFlexBox(-5.0F, -37.0F, -8.0F, 7, 8, 2, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 4);
    
    turretModel[2].addFlexBox(-6.0F, -29.0F, 6.0F, 23, 5, 2, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, 4);
    
    turretModel[3].addFlexBox(-6.0F, -29.0F, -8.0F, 23, 5, 2, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, 4);
    
    turretModel[4].addBox(0.0F, 0.0F, 0.0F, 14, 4, 4, 0.0F);
    turretModel[4].setRotationPoint(7.0F, -23.0F, 5.0F);
    (turretModel[4]).rotateAngleZ = 1.972222F;
    
    turretModel[5].addBox(0.0F, 0.0F, 0.0F, 14, 4, 4, 0.0F);
    turretModel[5].setRotationPoint(7.0F, -23.0F, -9.0F);
    (turretModel[5]).rotateAngleZ = 1.972222F;
    
    turretModel[6].addBox(0.0F, 1.5F, 1.5F, 16, 1, 1, 0.0F);
    turretModel[6].setRotationPoint(7.0F, -23.0F, 5.0F);
    (turretModel[6]).rotateAngleZ = 1.972222F;
    
    turretModel[7].addBox(0.0F, 1.5F, 1.5F, 16, 1, 1, 0.0F);
    turretModel[7].setRotationPoint(7.0F, -23.0F, -9.0F);
    (turretModel[7]).rotateAngleZ = 1.972222F;
    
    turretModel[8].addBox(-20.0F, -28.0F, 6.5F, 15, 3, 1, 0.0F);
    
    turretModel[9].addBox(-13.0F, -34.0F, 6.5F, 11, 2, 1, 0.0F);
    
    turretModel[10].addBox(0.0F, 0.0F, 0.0F, 2, 8, 1, 0.0F);
    turretModel[10].setRotationPoint(-13.0F, -34.0F, 6.5F);
    (turretModel[10]).rotateAngleZ = -0.418879F;
    
    turretModel[11].addBox(-8.0F, -39.0F, 7.0F, 1, 11, 1, 0.0F);
    
    turretModel[12].addBox(0.0F, 0.0F, 0.0F, 3, 8, 2, 0.0F);
    turretModel[12].setRotationPoint(-6.0F, -33.0F, -9.0F);
    (turretModel[12]).rotateAngleZ = 0.2094395F;
    
    turretModel[13].addBox(-5.0F, -32.0F, -11.0F, 1, 1, 3, 0.0F);
    
    turretModel[14].addBox(-5.0F, -32.0F, -12.0F, 1, 5, 1, 0.0F);
    
    turretModel[15].addBox(-5.0F, -28.0F, -16.0F, 1, 1, 4, 0.0F);
    
    turretModel[16].addBox(-22.0F, -30.0F, 7.5F, 6, 6, 1, 0.0F);
    
    turretModel[17].addBox(-18.5F, -29.5F, 8.5F, 1, 1, 5, 0.0F);


    
    barrelModel = new ModelRendererTurbo[28];
    barrelModel[0] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 96, 20, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 198, 20, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 224, 20, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 0, 31, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 5, 30, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 21, 30, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 33, 30, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 220, 50, textureX, textureY);
    barrelModel[9] = new ModelRendererTurbo(this, 220, 42, textureX, textureY);
    barrelModel[10] = new ModelRendererTurbo(this, 220, 36, textureX, textureY);
    barrelModel[11] = new ModelRendererTurbo(this, 39, 30, textureX, textureY);
    barrelModel[12] = new ModelRendererTurbo(this, 246, 20, textureX, textureY);
    barrelModel[13] = new ModelRendererTurbo(this, 262, 20, textureX, textureY);
    barrelModel[14] = new ModelRendererTurbo(this, 280, 20, textureX, textureY);
    barrelModel[15] = new ModelRendererTurbo(this, 292, 20, textureX, textureY);
    barrelModel[16] = new ModelRendererTurbo(this, 292, 31, textureX, textureY);
    barrelModel[17] = new ModelRendererTurbo(this, 362, 20, textureX, textureY);
    barrelModel[18] = new ModelRendererTurbo(this, 370, 20, textureX, textureY);
    barrelModel[19] = new ModelRendererTurbo(this, 408, 20, textureX, textureY);
    barrelModel[20] = new ModelRendererTurbo(this, 433, 20, textureX, textureY);
    barrelModel[21] = new ModelRendererTurbo(this, 459, 20, textureX, textureY);
    barrelModel[22] = new ModelRendererTurbo(this, 473, 20, textureX, textureY);
    barrelModel[23] = new ModelRendererTurbo(this, 335, 45, textureX, textureY);
    barrelModel[24] = new ModelRendererTurbo(this, 359, 45, textureX, textureY);
    barrelModel[25] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
    barrelModel[26] = new ModelRendererTurbo(this, 190, 48, textureX, textureY);
    barrelModel[27] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
    
    barrelModel[0].addBox(39.0F, -2.0F, -2.0F, 43, 4, 4, 0.0F);
    barrelModel[0].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[1].addBox(-6.0F, -2.5F, -2.5F, 45, 5, 5, 0.0F);
    barrelModel[1].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[2].addBox(-11.0F, -3.5F, -3.5F, 5, 7, 7, 0.0F);
    barrelModel[2].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[3].addBox(-14.0F, 1.5F, -3.5F, 3, 2, 7, 0.0F);
    barrelModel[3].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[4].addBox(-14.0F, -1.5F, -3.5F, 3, 3, 2, 0.0F);
    barrelModel[4].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[5].addBox(-14.0F, -3.5F, -3.5F, 3, 2, 7, 0.0F);
    barrelModel[5].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[6].addBox(-14.0F, 1.0F, 1.5F, 3, 1, 2, 0.0F);
    barrelModel[6].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[7].addBox(-14.0F, -2.0F, 1.5F, 3, 1, 2, 0.0F);
    barrelModel[7].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[8].addBox(-27.0F, 4.0F, 1.5F, 55, 3, 1, 0.0F);
    barrelModel[8].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[9].addBox(-27.0F, 7.0F, -2.5F, 55, 1, 5, 0.0F);
    barrelModel[9].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[10].addBox(-27.0F, 4.0F, -2.5F, 55, 3, 1, 0.0F);
    barrelModel[10].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[11].addBox(-27.5F, 7.5F, -3.5F, 3, 1, 7, 0.0F);
    barrelModel[11].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[12].addBox(28.0F, 3.5F, -3.0F, 1, 5, 6, 0.0F);
    barrelModel[12].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[13].addBox(29.0F, 4.0F, -2.0F, 4, 4, 4, 0.0F);
    barrelModel[13].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[14].addTrapezoid(33.0F, 4.0F, -2.0F, 1, 4, 4, 0.0F, -1.0F, 2);
    barrelModel[14].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[15].addBox(-5.0F, -7.5F, -2.0F, 30, 4, 4, 0.0F);
    barrelModel[15].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[16].addBox(-10.5F, -5.5F, -0.5F, 37, 1, 1, 0.0F);
    barrelModel[16].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[17].addBox(-10.0F, -6.5F, -1.5F, 2, 3, 3, 0.0F);
    barrelModel[17].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[18].addBox(-3.0F, -2.0F, -5.5F, 7, 8, 11, 0.0F);
    barrelModel[18].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[19].addFlexBox(3.0F, -5.0F, -5.5F, 1, 4, 11, 0.0F, 0.0F, 0.0F, -3.0F, -3.0F, 4);
    barrelModel[19].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[20].addFlexBox(-3.0F, -5.0F, -5.5F, 1, 4, 11, 0.0F, 0.0F, 0.0F, -3.0F, -3.0F, 4);
    barrelModel[20].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[21].addBox(3.0F, -8.0F, -2.5F, 1, 5, 5, 0.0F);
    barrelModel[21].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[22].addBox(-3.0F, -8.0F, -2.5F, 1, 5, 5, 0.0F);
    barrelModel[22].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[23].addBox(-1.0F, -1.0F, -8.5F, 2, 2, 17, 0.0F);
    barrelModel[23].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[24].addFlexBox(22.0F, 1.0F, -3.0F, 3, 3, 6, 0.0F, 0.0F, 0.0F, -0.3F, -0.3F, 4);
    barrelModel[24].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    (barrelModel[25]).flip = true;
    barrelModel[25].addBox(39.0F, -1.0F, -1.0F, 43, 2, 2, 0.0F);
    barrelModel[25].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    barrelModel[26].addBox(-11.5F, -1.5F, 3.0F, 1, 3, 1, 0.0F);
    barrelModel[26].setRotationPoint(-2.0F, -35.5F, 0.0F);
    
    (barrelModel[27]).flip = true;
    barrelModel[27].addBox(39.0F, -2.0F, -2.0F, 43, 4, 4, 0.0F);
    barrelModel[27].setRotationPoint(-2.0F, -35.5F, 0.0F);


    
    leftTrackModel = new ModelRendererTurbo[16];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 503, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 0, 492, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 0, 478, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 36, 490, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 61, 486, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 81, 489, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 20, 480, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 0, 467, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 100, 480, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 120, 492, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 120, 477, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 140, 480, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 160, 488, textureX, textureY);
    leftTrackModel[13] = new ModelRendererTurbo(this, 172, 478, textureX, textureY);
    leftTrackModel[14] = new ModelRendererTurbo(this, 174, 501, textureX, textureY);
    leftTrackModel[15] = new ModelRendererTurbo(this, 192, 474, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 81, 1, 8, 0.0F);
    leftTrackModel[0].setRotationPoint(-35.0F, 9.0F, -30.0F);
    
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 13, 1, 8, 0.0F);
    leftTrackModel[1].setRotationPoint(58.0F, 5.0F, -30.0F);
    (leftTrackModel[1]).rotateAngleZ = -2.75762F;
    
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);
    leftTrackModel[2].setRotationPoint(58.0F, 5.0F, -30.0F);
    (leftTrackModel[2]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F);
    leftTrackModel[3].setRotationPoint(63.0F, 0.0F, -30.0F);
    (leftTrackModel[3]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    leftTrackModel[4].setRotationPoint(62.0F, -7.0F, -30.0F);
    
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);
    leftTrackModel[5].setRotationPoint(63.0F, -7.0F, -30.0F);
    (leftTrackModel[5]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F);
    leftTrackModel[6].setRotationPoint(58.0F, -12.0F, -30.0F);
    (leftTrackModel[6]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 88, 1, 8, 0.0F);
    leftTrackModel[7].setRotationPoint(-30.0F, -12.0F, -30.0F);
    
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 12, 8, 0.0F);
    leftTrackModel[8].setRotationPoint(-30.0F, -12.0F, -30.0F);
    (leftTrackModel[8]).rotateAngleZ = -1.3825748F;
    
    leftTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 10, 1, 8, 0.0F);
    leftTrackModel[9].setRotationPoint(-51.0F, -8.0F, -30.0F);
    (leftTrackModel[9]).rotateAngleZ = 0.1882215F;
    
    leftTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 3, 8, 0.0F);
    leftTrackModel[10].setRotationPoint(-51.0F, -8.0F, -30.0F);
    (leftTrackModel[10]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 3, 1, 8, 0.0F);
    leftTrackModel[11].setRotationPoint(-55.0F, -4.0F, -30.0F);
    (leftTrackModel[11]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    leftTrackModel[12].setRotationPoint(-55.0F, -4.0F, -30.0F);
    
    leftTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 1, 3, 8, 0.0F);
    leftTrackModel[13].setRotationPoint(-55.0F, 3.0F, -30.0F);
    (leftTrackModel[13]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 3, 1, 8, 0.0F);
    leftTrackModel[14].setRotationPoint(-51.0F, 7.0F, -30.0F);
    (leftTrackModel[14]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 17, 8, 0.0F);
    leftTrackModel[15].setRotationPoint(-51.0F, 7.0F, -30.0F);
    (leftTrackModel[15]).rotateAngleZ = 1.3854483F;


    
    rightTrackModel = new ModelRendererTurbo[16];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 503, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 0, 492, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 0, 478, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 36, 490, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 61, 486, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 81, 489, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 20, 480, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 0, 467, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 100, 480, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 120, 492, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 120, 477, textureX, textureY);
    rightTrackModel[11] = new ModelRendererTurbo(this, 140, 480, textureX, textureY);
    rightTrackModel[12] = new ModelRendererTurbo(this, 160, 488, textureX, textureY);
    rightTrackModel[13] = new ModelRendererTurbo(this, 172, 478, textureX, textureY);
    rightTrackModel[14] = new ModelRendererTurbo(this, 174, 501, textureX, textureY);
    rightTrackModel[15] = new ModelRendererTurbo(this, 192, 474, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 81, 1, 8, 0.0F);
    rightTrackModel[0].setRotationPoint(-35.0F, 9.0F, 22.0F);
    
    rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 13, 1, 8, 0.0F);
    rightTrackModel[1].setRotationPoint(58.0F, 5.0F, 22.0F);
    (rightTrackModel[1]).rotateAngleZ = -2.75762F;
    
    rightTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);
    rightTrackModel[2].setRotationPoint(58.0F, 5.0F, 22.0F);
    (rightTrackModel[2]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F);
    rightTrackModel[3].setRotationPoint(63.0F, 0.0F, 22.0F);
    (rightTrackModel[3]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    rightTrackModel[4].setRotationPoint(62.0F, -7.0F, 22.0F);
    
    rightTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);
    rightTrackModel[5].setRotationPoint(63.0F, -7.0F, 22.0F);
    (rightTrackModel[5]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F);
    rightTrackModel[6].setRotationPoint(58.0F, -12.0F, 22.0F);
    (rightTrackModel[6]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 88, 1, 8, 0.0F);
    rightTrackModel[7].setRotationPoint(-30.0F, -12.0F, 22.0F);
    
    rightTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 12, 8, 0.0F);
    rightTrackModel[8].setRotationPoint(-30.0F, -12.0F, 22.0F);
    (rightTrackModel[8]).rotateAngleZ = -1.3825748F;
    
    rightTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 10, 1, 8, 0.0F);
    rightTrackModel[9].setRotationPoint(-51.0F, -8.0F, 22.0F);
    (rightTrackModel[9]).rotateAngleZ = 0.1882215F;
    
    rightTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 3, 8, 0.0F);
    rightTrackModel[10].setRotationPoint(-51.0F, -8.0F, 22.0F);
    (rightTrackModel[10]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 3, 1, 8, 0.0F);
    rightTrackModel[11].setRotationPoint(-55.0F, -4.0F, 22.0F);
    (rightTrackModel[11]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    rightTrackModel[12].setRotationPoint(-55.0F, -4.0F, 22.0F);
    
    rightTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 1, 3, 8, 0.0F);
    rightTrackModel[13].setRotationPoint(-55.0F, 3.0F, 22.0F);
    (rightTrackModel[13]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 3, 1, 8, 0.0F);
    rightTrackModel[14].setRotationPoint(-51.0F, 7.0F, 22.0F);
    (rightTrackModel[14]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 17, 8, 0.0F);
    rightTrackModel[15].setRotationPoint(-51.0F, 7.0F, 22.0F);
    (rightTrackModel[15]).rotateAngleZ = 1.3854483F;


    
    leftTrackWheelModels = new ModelRendererTurbo[24];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 325, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 325, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[14] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[15] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[16] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[17] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    leftTrackWheelModels[18] = new ModelRendererTurbo(this, 80, 320, textureX, textureY);
    leftTrackWheelModels[19] = new ModelRendererTurbo(this, 80, 320, textureX, textureY);
    leftTrackWheelModels[20] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    leftTrackWheelModels[21] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    leftTrackWheelModels[22] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    leftTrackWheelModels[23] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(13.0D, 3.0D, 13, 3), new Coord2D(13.0D, 10.0D, 13, 10), new Coord2D(10.0D, 13.0D, 10, 13), new Coord2D(3.0D, 13.0D, 3, 13), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 13, 13, 48, 1, 0, new float[] { 5.0F, 7.0F, 5.0F, 7.0F, 5.0F, 7.0F, 5.0F, 7.0F });
    leftTrackWheelModels[0].setRotationPoint(-47.5F, -0.5F, -28.5F);
    
    leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(13.0D, 3.0D, 13, 3), new Coord2D(13.0D, 10.0D, 13, 10), new Coord2D(10.0D, 13.0D, 10, 13), new Coord2D(3.0D, 13.0D, 3, 13), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 13, 13, 48, 1, 0, new float[] { 5.0F, 7.0F, 5.0F, 7.0F, 5.0F, 7.0F, 5.0F, 7.0F });
    leftTrackWheelModels[1].setRotationPoint(-47.5F, -0.5F, -23.5F);
    
    leftTrackWheelModels[2].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(-33.0F, 4.0F, -27.0F);
    
    leftTrackWheelModels[3].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(-33.0F, 4.0F, -24.5F);
    
    leftTrackWheelModels[4].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(-22.0F, 4.0F, -27.0F);
    
    leftTrackWheelModels[5].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(-22.0F, 4.0F, -24.5F);
    
    leftTrackWheelModels[6].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[6].setRotationPoint(-11.0F, 4.0F, -27.0F);
    
    leftTrackWheelModels[7].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[7].setRotationPoint(-11.0F, 4.0F, -24.5F);
    
    leftTrackWheelModels[8].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[8].setRotationPoint(0.0F, 4.0F, -27.0F);
    
    leftTrackWheelModels[9].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[9].setRotationPoint(0.0F, 4.0F, -24.5F);
    
    leftTrackWheelModels[10].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[10].setRotationPoint(11.0F, 4.0F, -27.0F);
    
    leftTrackWheelModels[11].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[11].setRotationPoint(11.0F, 4.0F, -24.5F);
    
    leftTrackWheelModels[12].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[12].setRotationPoint(22.0F, 4.0F, -27.0F);
    
    leftTrackWheelModels[13].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[13].setRotationPoint(22.0F, 4.0F, -24.5F);
    
    leftTrackWheelModels[14].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[14].setRotationPoint(33.0F, 4.0F, -27.0F);
    
    leftTrackWheelModels[15].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[15].setRotationPoint(33.0F, 4.0F, -24.5F);
    
    leftTrackWheelModels[16].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[16].setRotationPoint(44.0F, 4.0F, -27.0F);
    
    leftTrackWheelModels[17].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[17].setRotationPoint(44.0F, 4.0F, -24.5F);
    
    leftTrackWheelModels[18].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(15.0D, 4.0D, 15, 4), new Coord2D(15.0D, 11.0D, 15, 11), new Coord2D(11.0D, 15.0D, 11, 15), new Coord2D(4.0D, 15.0D, 4, 15), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 15, 15, 52, 1, 0, new float[] { 6.0F, 7.0F, 6.0F, 7.0F, 6.0F, 7.0F, 6.0F, 7.0F });
    leftTrackWheelModels[18].setRotationPoint(54.5F, -3.5F, -28.5F);
    
    leftTrackWheelModels[19].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(15.0D, 4.0D, 15, 4), new Coord2D(15.0D, 11.0D, 15, 11), new Coord2D(11.0D, 15.0D, 11, 15), new Coord2D(4.0D, 15.0D, 4, 15), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 15, 15, 52, 1, 0, new float[] { 6.0F, 7.0F, 6.0F, 7.0F, 6.0F, 7.0F, 6.0F, 7.0F });
    leftTrackWheelModels[19].setRotationPoint(54.5F, -3.5F, -23.5F);
    
    leftTrackWheelModels[20].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[20].setRotationPoint(33.0F, -9.0F, -26.0F);
    (leftTrackWheelModels[20]).rotateAngleY = -3.1415927F;
    
    leftTrackWheelModels[21].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[21].setRotationPoint(15.0F, -9.0F, -26.0F);
    (leftTrackWheelModels[21]).rotateAngleY = -3.1415927F;
    
    leftTrackWheelModels[22].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[22].setRotationPoint(-7.0F, -9.0F, -26.0F);
    (leftTrackWheelModels[22]).rotateAngleY = -3.1415927F;
    
    leftTrackWheelModels[23].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[23].setRotationPoint(-29.0F, -9.0F, -26.0F);
    (leftTrackWheelModels[23]).rotateAngleY = -3.1415927F;


    
    rightTrackWheelModels = new ModelRendererTurbo[24];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 325, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 325, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[14] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[15] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[16] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[17] = new ModelRendererTurbo(this, 40, 325, textureX, textureY);
    rightTrackWheelModels[18] = new ModelRendererTurbo(this, 80, 320, textureX, textureY);
    rightTrackWheelModels[19] = new ModelRendererTurbo(this, 80, 320, textureX, textureY);
    rightTrackWheelModels[20] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    rightTrackWheelModels[21] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    rightTrackWheelModels[22] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    rightTrackWheelModels[23] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(13.0D, 3.0D, 13, 3), new Coord2D(13.0D, 10.0D, 13, 10), new Coord2D(10.0D, 13.0D, 10, 13), new Coord2D(3.0D, 13.0D, 3, 13), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 13, 13, 48, 1, 0, new float[] { 5.0F, 7.0F, 5.0F, 7.0F, 5.0F, 7.0F, 5.0F, 7.0F });
    rightTrackWheelModels[0].setRotationPoint(-47.5F, -0.5F, 28.5F);
    
    rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(13.0D, 3.0D, 13, 3), new Coord2D(13.0D, 10.0D, 13, 10), new Coord2D(10.0D, 13.0D, 10, 13), new Coord2D(3.0D, 13.0D, 3, 13), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 13, 13, 48, 1, 0, new float[] { 5.0F, 7.0F, 5.0F, 7.0F, 5.0F, 7.0F, 5.0F, 7.0F });
    rightTrackWheelModels[1].setRotationPoint(-47.5F, -0.5F, 23.5F);
    
    rightTrackWheelModels[2].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[2].setRotationPoint(-33.0F, 4.0F, 27.0F);
    
    rightTrackWheelModels[3].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(-33.0F, 4.0F, 24.5F);
    
    rightTrackWheelModels[4].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(-22.0F, 4.0F, 27.0F);
    
    rightTrackWheelModels[5].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(-22.0F, 4.0F, 24.5F);
    
    rightTrackWheelModels[6].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[6].setRotationPoint(-11.0F, 4.0F, 27.0F);
    
    rightTrackWheelModels[7].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[7].setRotationPoint(-11.0F, 4.0F, 24.5F);
    
    rightTrackWheelModels[8].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[8].setRotationPoint(0.0F, 4.0F, 27.0F);
    
    rightTrackWheelModels[9].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[9].setRotationPoint(0.0F, 4.0F, 24.5F);
    
    rightTrackWheelModels[10].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[10].setRotationPoint(11.0F, 4.0F, 27.0F);
    
    rightTrackWheelModels[11].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[11].setRotationPoint(11.0F, 4.0F, 24.5F);
    
    rightTrackWheelModels[12].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[12].setRotationPoint(22.0F, 4.0F, 27.0F);
    
    rightTrackWheelModels[13].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[13].setRotationPoint(22.0F, 4.0F, 24.5F);
    
    rightTrackWheelModels[14].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[14].setRotationPoint(33.0F, 4.0F, 27.0F);
    
    rightTrackWheelModels[15].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[15].setRotationPoint(33.0F, 4.0F, 24.5F);
    
    rightTrackWheelModels[16].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[16].setRotationPoint(44.0F, 4.0F, 27.0F);
    
    rightTrackWheelModels[17].addShape3D(5.0F, -5.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[17].setRotationPoint(44.0F, 4.0F, 24.5F);
    
    rightTrackWheelModels[18].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(15.0D, 4.0D, 15, 4), new Coord2D(15.0D, 11.0D, 15, 11), new Coord2D(11.0D, 15.0D, 11, 15), new Coord2D(4.0D, 15.0D, 4, 15), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 15, 15, 52, 1, 0, new float[] { 6.0F, 7.0F, 6.0F, 7.0F, 6.0F, 7.0F, 6.0F, 7.0F });
    rightTrackWheelModels[18].setRotationPoint(54.5F, -3.5F, 28.5F);
    
    rightTrackWheelModels[19].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(15.0D, 4.0D, 15, 4), new Coord2D(15.0D, 11.0D, 15, 11), new Coord2D(11.0D, 15.0D, 11, 15), new Coord2D(4.0D, 15.0D, 4, 15), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 15, 15, 52, 1, 0, new float[] { 6.0F, 7.0F, 6.0F, 7.0F, 6.0F, 7.0F, 6.0F, 7.0F });
    rightTrackWheelModels[19].setRotationPoint(54.5F, -3.5F, 23.5F);
    
    rightTrackWheelModels[20].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[20].setRotationPoint(33.0F, -9.0F, 26.0F);
    (rightTrackWheelModels[20]).rotateAngleY = -3.1415927F;
    
    rightTrackWheelModels[21].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[21].setRotationPoint(15.0F, -9.0F, 26.0F);
    (rightTrackWheelModels[21]).rotateAngleY = -3.1415927F;
    
    rightTrackWheelModels[22].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[22].setRotationPoint(-7.0F, -9.0F, 26.0F);
    (rightTrackWheelModels[22]).rotateAngleY = -3.1415927F;
    
    rightTrackWheelModels[23].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[23].setRotationPoint(-29.0F, -9.0F, 26.0F);
    (rightTrackWheelModels[23]).rotateAngleY = -3.1415927F;


    
    bodyDoorCloseModel = new ModelRendererTurbo[10];
    bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 245, 230, textureX, textureY);
    bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 260, 200, textureX, textureY);
    bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 245, 220, textureX, textureY);
    bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 245, 210, textureX, textureY);
    bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 245, 200, textureX, textureY);
    bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 280, 230, textureX, textureY);
    bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 295, 200, textureX, textureY);
    bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 280, 220, textureX, textureY);
    bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 280, 210, textureX, textureY);
    bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 280, 200, textureX, textureY);
    
    bodyDoorCloseModel[0].addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
    bodyDoorCloseModel[0].setRotationPoint(53.0F, -13.5F, -13.5F);
    
    bodyDoorCloseModel[1].addBox(-0.5F, 0.0F, -0.5F, 1, 23, 1, 0.0F);
    bodyDoorCloseModel[1].setRotationPoint(54.5F, -13.0F, -12.5F);
    (bodyDoorCloseModel[1]).rotateAngleX = 1.675516F;
    (bodyDoorCloseModel[1]).rotateAngleY = 0.1047198F;
    
    bodyDoorCloseModel[2].addBox(-1.0F, -21.5F, 9.5F, 2, 1, 3, 0.0F);
    bodyDoorCloseModel[2].setRotationPoint(54.5F, -12.0F, -12.5F);
    (bodyDoorCloseModel[2]).rotateAngleX = -0.9773844F;
    (bodyDoorCloseModel[2]).rotateAngleY = 0.1047198F;
    
    bodyDoorCloseModel[3].addBox(-1.0F, -25.5F, 9.5F, 2, 4, 1, 0.0F);
    bodyDoorCloseModel[3].setRotationPoint(54.5F, -12.0F, -12.5F);
    (bodyDoorCloseModel[3]).rotateAngleX = -0.9773844F;
    (bodyDoorCloseModel[3]).rotateAngleY = 0.1047198F;
    
    bodyDoorCloseModel[4].addBox(-1.0F, -26.5F, 9.5F, 2, 1, 3, 0.0F);
    bodyDoorCloseModel[4].setRotationPoint(54.5F, -12.0F, -12.5F);
    (bodyDoorCloseModel[4]).rotateAngleX = -0.9773844F;
    (bodyDoorCloseModel[4]).rotateAngleY = 0.1047198F;
    
    bodyDoorCloseModel[5].addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
    bodyDoorCloseModel[5].setRotationPoint(53.0F, -13.5F, 10.5F);
    
    bodyDoorCloseModel[6].addBox(-0.5F, 0.0F, -0.5F, 1, 23, 1, 0.0F);
    bodyDoorCloseModel[6].setRotationPoint(54.5F, -13.0F, 12.5F);
    (bodyDoorCloseModel[6]).rotateAngleX = -1.623156F;
    (bodyDoorCloseModel[6]).rotateAngleY = 0.1047198F;
    
    bodyDoorCloseModel[7].addBox(-1.0F, -21.5F, -12.5F, 2, 1, 3, 0.0F);
    bodyDoorCloseModel[7].setRotationPoint(54.5F, -12.0F, 12.5F);
    (bodyDoorCloseModel[7]).rotateAngleX = 1.029744F;
    (bodyDoorCloseModel[7]).rotateAngleY = 0.1047198F;
    
    bodyDoorCloseModel[8].addBox(-1.0F, -25.5F, -10.5F, 2, 4, 1, 0.0F);
    bodyDoorCloseModel[8].setRotationPoint(54.5F, -12.0F, 12.5F);
    (bodyDoorCloseModel[8]).rotateAngleX = 1.029744F;
    (bodyDoorCloseModel[8]).rotateAngleY = 0.1047198F;
    
    bodyDoorCloseModel[9].addBox(-1.0F, -26.5F, -12.5F, 2, 1, 3, 0.0F);
    bodyDoorCloseModel[9].setRotationPoint(54.5F, -12.0F, 12.5F);
    (bodyDoorCloseModel[9]).rotateAngleX = 1.029744F;
    (bodyDoorCloseModel[9]).rotateAngleY = 0.1047198F;


    
    bodyDoorOpenModel = new ModelRendererTurbo[10];
    bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 245, 230, textureX, textureY);
    bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 260, 200, textureX, textureY);
    bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 245, 220, textureX, textureY);
    bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 245, 210, textureX, textureY);
    bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 245, 200, textureX, textureY);
    bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 280, 230, textureX, textureY);
    bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 295, 200, textureX, textureY);
    bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 280, 220, textureX, textureY);
    bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 280, 210, textureX, textureY);
    bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 280, 200, textureX, textureY);
    
    bodyDoorOpenModel[0].addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
    bodyDoorOpenModel[0].setRotationPoint(53.0F, -13.5F, -13.5F);
    
    bodyDoorOpenModel[1].addBox(-0.5F, 0.0F, -0.5F, 1, 23, 1, 0.0F);
    bodyDoorOpenModel[1].setRotationPoint(54.5F, -13.0F, -12.5F);
    (bodyDoorOpenModel[1]).rotateAngleX = 2.6529F;
    
    bodyDoorOpenModel[2].addFlexBox(-1.0F, -21.5F, 9.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 5);
    bodyDoorOpenModel[2].setRotationPoint(54.5F, -12.0F, -12.5F);
    
    bodyDoorOpenModel[3].addBox(-1.0F, -25.5F, 9.5F, 2, 4, 1, 0.0F);
    bodyDoorOpenModel[3].setRotationPoint(54.5F, -12.0F, -12.5F);
    
    bodyDoorOpenModel[4].addFlexBox(-1.0F, -26.5F, 9.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 4);
    bodyDoorOpenModel[4].setRotationPoint(54.5F, -12.0F, -12.5F);
    
    bodyDoorOpenModel[5].addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
    bodyDoorOpenModel[5].setRotationPoint(53.0F, -13.5F, 10.5F);
    
    bodyDoorOpenModel[6].addBox(-0.5F, 0.0F, -0.5F, 1, 23, 1, 0.0F);
    bodyDoorOpenModel[6].setRotationPoint(54.5F, -13.0F, 12.5F);
    (bodyDoorOpenModel[6]).rotateAngleX = -2.6529F;
    
    bodyDoorOpenModel[7].addFlexBox(-1.0F, -21.5F, -12.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 5);
    bodyDoorOpenModel[7].setRotationPoint(54.5F, -12.0F, 12.5F);
    
    bodyDoorOpenModel[8].addBox(-1.0F, -25.5F, -10.5F, 2, 4, 1, 0.0F);
    bodyDoorOpenModel[8].setRotationPoint(54.5F, -12.0F, 12.5F);
    
    bodyDoorOpenModel[9].addFlexBox(-1.0F, -26.5F, -12.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4);
    bodyDoorOpenModel[9].setRotationPoint(54.5F, -12.0F, 12.5F);


    
    /*ModelRendererTurbo[][] mg42Model = new ModelRendererTurbo[3][];

    
    mg42Model[0] = new ModelRendererTurbo[0];

    
    mg42Model[1] = new ModelRendererTurbo[20];
    mg42Model[1][0] = new ModelRendererTurbo(this, 506, 0, textureX, textureY);
    mg42Model[1][1] = new ModelRendererTurbo(this, 501, 0, textureX, textureY);
    mg42Model[1][2] = new ModelRendererTurbo(this, 476, 0, textureX, textureY);
    mg42Model[1][3] = new ModelRendererTurbo(this, 476, 3, textureX, textureY);
    mg42Model[1][4] = new ModelRendererTurbo(this, 481, 3, textureX, textureY);
    mg42Model[1][5] = new ModelRendererTurbo(this, 445, 0, textureX, textureY);
    mg42Model[1][6] = new ModelRendererTurbo(this, 445, 3, textureX, textureY);
    mg42Model[1][7] = new ModelRendererTurbo(this, 476, 6, textureX, textureY);
    mg42Model[1][8] = new ModelRendererTurbo(this, 476, 9, textureX, textureY);
    mg42Model[1][9] = new ModelRendererTurbo(this, 500, 16, textureX, textureY);
    mg42Model[1][10] = new ModelRendererTurbo(this, 488, 3, textureX, textureY);
    mg42Model[1][11] = new ModelRendererTurbo(this, 488, 3, textureX, textureY);
    mg42Model[1][12] = new ModelRendererTurbo(this, 495, 3, textureX, textureY);
    mg42Model[1][13] = new ModelRendererTurbo(this, 500, 3, textureX, textureY);
    mg42Model[1][14] = new ModelRendererTurbo(this, 500, 6, textureX, textureY);
    mg42Model[1][15] = new ModelRendererTurbo(this, 500, 9, textureX, textureY);
    mg42Model[1][16] = new ModelRendererTurbo(this, 476, 12, textureX, textureY);
    mg42Model[1][17] = new ModelRendererTurbo(this, 489, 12, textureX, textureY);
    mg42Model[1][18] = new ModelRendererTurbo(this, 500, 12, textureX, textureY);
    mg42Model[1][19] = new ModelRendererTurbo(this, 505, 12, textureX, textureY);
    
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
      gunPart.setRotationPoint(4.5F, -45.0F, -21.0F);
    }

    
    mg42Model[2] = new ModelRendererTurbo[0];
    
    registerGunModel("MG42", mg42Model);*/

    
    translateAll(0, 0, 0);

    
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
		for(int i = 0; i < bodyDoorCloseModel.length; i++)
		{
			bodyDoorCloseModel[i].render(f5);
		}
	}
		
    //added - Price Test
    /*@Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
    {
      float rightTrackModel = MathHelper.cos(f * 0.5662F) * 1.4F * f1;;
    }*/
}
