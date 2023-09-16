//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.mos;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelWagonSter extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelWagonSter() {
        this.textureX = 512;
        this.textureY = 256;
        (this.bodyModel = new ModelRendererTurbo[30])[0] = new ModelRendererTurbo((ModelBase)this, 0, 40, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 62, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 0, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 27, 0, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 27, 0, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 16, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 14, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 0, 14, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 14, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 0, 16, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 0, 14, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 0, 14, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 0, 14, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-14.0f, -15.0f, -11.0f, 122, 122, 22, 0.0f, 0.0f, 0.0f, 0.0f, -100.0f, 0.0f, 0.0f, -100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -100.0f, 0.0f, -100.0f, -100.0f, 0.0f, -100.0f, -100.0f, 0.0f, 0.0f, -100.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(14.0f, -16.0f, -11.0f, 6, 14, 22, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-3.0f, 9.0f, 0.0f);
        this.bodyModel[2].addBox(-17.0f, -13.0f, -3.5f, 1, 1, 7, 0.0f);
        this.bodyModel[2].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[3].addBox(-17.0f, -10.0f, -3.5f, 1, 1, 7, 0.0f);
        this.bodyModel[3].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[4].addBox(-17.0f, -7.0f, -3.5f, 1, 1, 7, 0.0f);
        this.bodyModel[4].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[5].addBox(-17.0f, -4.0f, -3.5f, 1, 1, 7, 0.0f);
        this.bodyModel[5].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[6].addBox(-16.0f, -13.0f, -3.5f, 2, 1, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[7].addBox(-16.0f, -13.0f, 2.5f, 2, 1, 1, 0.0f);
        this.bodyModel[7].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[8].addBox(-16.0f, -10.0f, 2.5f, 2, 1, 1, 0.0f);
        this.bodyModel[8].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[9].addBox(-16.0f, -10.0f, -3.5f, 2, 1, 1, 0.0f);
        this.bodyModel[9].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[10].addBox(-16.0f, -7.0f, -3.5f, 2, 1, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[11].addBox(-16.0f, -7.0f, 2.5f, 2, 1, 1, 0.0f);
        this.bodyModel[11].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[12].addBox(-16.0f, -4.0f, -3.5f, 2, 1, 1, 0.0f);
        this.bodyModel[12].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[13].addBox(-16.0f, -4.0f, 2.5f, 2, 1, 1, 0.0f);
        this.bodyModel[13].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[14].addBox(-12.0f, -18.0f, -6.0f, 1, 1, 12, 0.0f);
        this.bodyModel[14].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[15].addBox(5.0f, -18.0f, -6.0f, 1, 1, 12, 0.0f);
        this.bodyModel[15].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[16].addBox(-12.0f, -17.0f, 5.0f, 1, 2, 1, 0.0f);
        this.bodyModel[16].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[17].addBox(-12.0f, -17.0f, -6.0f, 1, 2, 1, 0.0f);
        this.bodyModel[17].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[18].addBox(5.0f, -17.0f, 5.0f, 1, 2, 1, 0.0f);
        this.bodyModel[18].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[19].addBox(5.0f, -17.0f, -6.0f, 1, 2, 1, 0.0f);
        this.bodyModel[19].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-10.0f, 4.0f, 11.0f, 12, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -2.0f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 2.0f, -1.0f, 0.0f, 2.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-10.0f, 4.0f, -16.0f, 12, 1, 5, 0.0f, 0.0f, -2.0f, 0.0f, -8.0f, -2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -8.0f, 2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(14.15f, 3.0f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(14.15f, 2.0f, -0.5f, 1, 1, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[23].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(14.15f, 1.6f, -0.5f, 1, 1, 6, 0.0f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -1.15f, 3.0f, -0.45f, 0.2f, 3.0f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -1.15f, -3.95f, -0.45f, 0.2f, -3.95f, -0.45f);
        this.bodyModel[24].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(14.15f, 1.6f, -5.5f, 1, 1, 6, 0.0f, 0.2f, 3.0f, -0.45f, -1.15f, 3.0f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, 0.2f, -3.95f, -0.45f, -1.15f, -3.95f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f);
        this.bodyModel[25].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-15.15f, 3.0f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-15.15f, 2.0f, -0.5f, 1, 1, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[27].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(-15.15f, 1.6f, -0.45f, 1, 1, 2, 0.0f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, 0.2f, 3.0f, -0.45f, -1.15f, 3.0f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, 0.2f, -3.95f, -0.45f, -1.15f, -3.95f, -0.45f);
        this.bodyModel[28].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(-15.15f, 1.6f, -1.55f, 1, 1, 2, 0.0f, -1.15f, 3.0f, -0.45f, 0.2f, 3.0f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -1.15f, -3.95f, -0.45f, 0.2f, -3.95f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f);
        this.bodyModel[29].setRotationPoint(3.0f, 0.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
