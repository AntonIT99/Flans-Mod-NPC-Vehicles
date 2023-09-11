//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelCrane extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelCrane() {
        this.textureX = 1024;
        this.textureY = 1024;
        (this.bodyModel = new ModelRendererTurbo[29])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 337, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 489, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 609, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 729, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 793, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 857, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 921, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 553, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 545, 65, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 673, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 601, 73, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 969, 89, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 313, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 49, 97, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 73, 97, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 169, 33, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 553, 1, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 16, 229, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 16, 229, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 6, 25, 6, 0.0f);
        this.bodyModel[0].setRotationPoint(39.0f, -15.0f, 26.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 6, 25, 6, 0.0f);
        this.bodyModel[1].setRotationPoint(39.0f, -15.0f, -30.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 6, 25, 6, 0.0f);
        this.bodyModel[2].setRotationPoint(-49.0f, -15.0f, 26.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 6, 25, 6, 0.0f);
        this.bodyModel[3].setRotationPoint(-49.0f, -15.0f, -30.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 94, 6, 6, 0.0f);
        this.bodyModel[4].setRotationPoint(-49.0f, -21.0f, 26.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 94, 6, 6, 0.0f);
        this.bodyModel[5].setRotationPoint(-49.0f, -21.0f, -30.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 6, 6, 50, 0.0f);
        this.bodyModel[6].setRotationPoint(-49.0f, -21.0f, -24.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 6, 6, 50, 0.0f);
        this.bodyModel[7].setRotationPoint(39.0f, -21.0f, -24.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 12, 80, 16, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, -6.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(33.0f, -101.0f, 16.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 12, 80, 16, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, -6.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, -6.0f, 0.0f, -10.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-49.0f, -101.0f, 16.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 285, 6, 6, 0.0f);
        this.bodyModel[10].setRotationPoint(-102.0f, -101.0f, -14.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 285, 6, 6, 0.0f);
        this.bodyModel[11].setRotationPoint(-102.0f, -101.0f, 10.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 12, 80, 16, 0.0f, 0.0f, 0.0f, -10.0f, -6.0f, 0.0f, -10.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, -6.0f, 0.0f, -10.0f);
        this.bodyModel[12].setRotationPoint(33.0f, -101.0f, -30.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 12, 80, 16, 0.0f, -6.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[13].setRotationPoint(-49.0f, -101.0f, -30.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 6, 6, 42, 0.0f);
        this.bodyModel[14].setRotationPoint(33.0f, -107.0f, -20.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 6, 6, 42, 0.0f);
        this.bodyModel[15].setRotationPoint(-43.0f, -107.0f, -20.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 6, 25, 18, 0.0f);
        this.bodyModel[16].setRotationPoint(-102.0f, -101.0f, -8.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 36, 20, 42, 0.0f);
        this.bodyModel[17].setRotationPoint(-85.0f, -121.0f, -20.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 6, 60, 16, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f);
        this.bodyModel[18].setRotationPoint(33.0f, -167.0f, -20.0f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 6, 60, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(33.0f, -167.0f, 6.0f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 6, 6, 22, 0.0f);
        this.bodyModel[20].setRotationPoint(33.0f, -173.0f, -10.0f);
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 2, 6, 18, 0.0f);
        this.bodyModel[21].setRotationPoint(181.0f, -101.0f, -8.0f);
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 4, 102, 4, 0.0f);
        this.bodyModel[22].setRotationPoint(33.0f, -173.0f, -10.0f);
        this.bodyModel[22].rotateAngleX = -0.09948377f;
        this.bodyModel[22].rotateAngleZ = -0.83775806f;
        this.bodyModel[23].addBox(0.0f, 0.0f, -4.0f, 4, 102, 4, 0.0f);
        this.bodyModel[23].setRotationPoint(33.0f, -173.0f, 12.0f);
        this.bodyModel[23].rotateAngleX = 0.09948377f;
        this.bodyModel[23].rotateAngleZ = -0.83775806f;
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 160, 4, 4, 0.0f);
        this.bodyModel[24].setRotationPoint(39.0f, -173.0f, -10.0f);
        this.bodyModel[24].rotateAngleY = -0.01745329f;
        this.bodyModel[24].rotateAngleZ = -0.4712389f;
        this.bodyModel[25].addBox(0.0f, 0.0f, -4.0f, 160, 4, 4, 0.0f);
        this.bodyModel[25].setRotationPoint(39.0f, -173.0f, 12.0f);
        this.bodyModel[25].rotateAngleY = 0.01745329f;
        this.bodyModel[25].rotateAngleZ = -0.4712389f;
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 2, 27, 2, 0.0f);
        this.bodyModel[26].setRotationPoint(181.0f, -95.0f, 0.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 384, 116, 0, 0.0f, 0.0f, 0.0f, 0.1f, -350.0f, 0.0f, 0.1f, -350.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -104.0f, 0.1f, -350.0f, -104.0f, 0.1f, -350.0f, -104.0f, 0.0f, 0.0f, -104.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(-84.0f, -117.0f, 22.1f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 384, 116, 0, 0.0f, 0.0f, 0.0f, 0.0f, -350.0f, 0.0f, 0.0f, -350.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -104.0f, 0.0f, -350.0f, -104.0f, 0.0f, -350.0f, -104.0f, 0.1f, 0.0f, -104.0f, 0.1f);
        this.bodyModel[28].setRotationPoint(-84.0f, -117.0f, -20.1f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
