//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelMonitorMk5 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelMonitorMk5() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[27])[0] = new ModelRendererTurbo((ModelBase)this, 1, 400, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 250, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 11, 80, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 16, 0, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 0, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 18, 0, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 120, 200, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 20, 0, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 23, 0, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 24, 0, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 0, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 28, 0, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 29, 0, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 30, 0, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 31, 0, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 32, 0, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 33, 0, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 34, 0, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 35, 0, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 36, 0, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 37, 0, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 38, 0, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 4, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 250, 0, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 11, 80, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 23, 0, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 20, 0, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 155, 6, 70, 0.0f);
        this.bodyModel[0].setRotationPoint(-80.0f, -10.0f, -35.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 6, 35, 0.0f, 90.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, 0.0f, -10.0f, 90.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, 0.0f, -10.0f);
        this.bodyModel[1].setRotationPoint(-85.0f, -10.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 5, 6, 35, 0.0f, 0.0f, 0.0f, 0.0f, 70.0f, 0.0f, 0.0f, 50.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 70.0f, 0.0f, 0.0f, 50.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(75.0f, -10.0f, 0.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 10, 2, 10, 0.0f);
        this.bodyModel[3].setRotationPoint(90.0f, -18.0f, -5.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 10, 6, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, 0.0f, 7.0f, 7.0f, 0.0f, 7.0f, 7.0f, 0.0f, 7.0f, 7.0f, 0.0f, 7.0f);
        this.bodyModel[4].setRotationPoint(90.0f, -16.0f, -5.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 49, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(-165.0f, -56.0f, -0.5f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 14, 10, 0, 0.0f);
        this.bodyModel[6].setRotationPoint(-179.0f, -55.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, 80.0f, 0.0f, 0.0f, 80.0f, 0.0f, 20.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 0.0f, 80.0f, 0.0f, 0.0f, 80.0f, 0.0f, 12.0f, 0.0f, 0.0f, 17.0f);
        this.bodyModel[7].setRotationPoint(14.0f, -4.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, -95.0f, 0.0f, 0.0f, -95.0f, 0.0f, -21.0f, 0.0f, 0.0f, -29.0f, 0.0f, 0.0f, 0.0f, -95.0f, 0.0f, 0.0f, -95.0f, 0.0f, -13.0f, 0.0f, 0.0f, -18.0f);
        this.bodyModel[8].setRotationPoint(14.0f, -4.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 8.0f, 0.0f, 14.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 0.0f, 20.0f, -12.0f, 0.0f, 20.0f, -12.0f, -1.0f, 0.0f, 0.0f, 12.0f);
        this.bodyModel[9].setRotationPoint(95.0f, -4.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 8.0f, 0.0f, -15.0f, 0.0f, 0.0f, -21.0f, 0.0f, 0.0f, 0.0f, 20.0f, -12.0f, 0.0f, 20.0f, -12.0f, -1.0f, 0.0f, 0.0f, -13.0f);
        this.bodyModel[10].setRotationPoint(95.0f, -4.0f, 0.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 6, 12, 6, 0.0f);
        this.bodyModel[11].setRotationPoint(-44.0f, -22.0f, 11.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 6, 12, 6, 0.0f);
        this.bodyModel[12].setRotationPoint(-44.0f, -22.0f, -17.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -10.0f, 0.0f, 12.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 0.0f, -10.0f, -4.0f, 0.0f, -10.0f, -4.0f, 6.0f, 0.0f, 0.0f, 12.0f);
        this.bodyModel[13].setRotationPoint(-80.0f, -4.0f, 0.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -10.0f, 0.0f, -13.0f, 0.0f, 0.0f, -21.0f, 0.0f, 0.0f, 0.0f, -10.0f, -4.0f, 0.0f, -10.0f, -4.0f, -7.0f, 0.0f, 0.0f, -13.0f);
        this.bodyModel[14].setRotationPoint(-80.0f, -4.0f, 0.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 70, 1, 1, 0.0f);
        this.bodyModel[15].setRotationPoint(-150.0f, 6.5f, -0.5f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f);
        this.bodyModel[16].setRotationPoint(-150.0f, -5.0f, -0.5f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 12, 8, 2, 0.0f);
        this.bodyModel[17].setRotationPoint(-155.0f, -3.0f, -1.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.bodyModel[18].setRotationPoint(-100.0f, 0.5f, -1.0f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f);
        this.bodyModel[19].setRotationPoint(-140.0f, -5.0f, -0.5f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 40, 1, 1, 0.0f);
        this.bodyModel[20].setRotationPoint(-135.0f, 1.0f, -0.5f);
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f);
        this.bodyModel[21].setRotationPoint(-138.0f, 0.5f, -1.0f);
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 2, 8, 1, 0.0f);
        this.bodyModel[22].setRotationPoint(-137.0f, -2.5f, -0.5f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 5, 6, 35, 0.0f, 60.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f, 0.0f, 60.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(-85.0f, -10.0f, -35.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 5, 6, 35, 0.0f, 0.0f, 0.0f, 0.0f, 50.0f, 0.0f, -15.0f, 70.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 50.0f, 0.0f, -15.0f, 70.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(75.0f, -10.0f, -35.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, -29.0f, -95.0f, 0.0f, -21.0f, -95.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -18.0f, -95.0f, 0.0f, -13.0f, -95.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(14.0f, -4.0f, -1.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 28.0f, 80.0f, 0.0f, 20.0f, 80.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 17.0f, 80.0f, 0.0f, 12.0f, 80.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(14.0f, -4.0f, -1.0f);
        (this.turretModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 12, 0, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 14, 0, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 12, 0, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 14, 0, this.textureX, this.textureY);
        this.turretModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, 0.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, 12.0f, 0.0f, 12.0f, 0.0f, 0.0f, 17.0f, 0.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, 12.0f, 0.0f, 12.0f, 0.0f, 0.0f, 17.0f);
        this.turretModel[0].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.turretModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, 0.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -13.0f, 0.0f, -13.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -13.0f, 0.0f, -13.0f, 0.0f, 0.0f, -19.0f);
        this.turretModel[1].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.turretModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, 0.0f, 0.0f, 17.0f, 12.0f, 0.0f, 12.0f, 18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 17.0f, 12.0f, 0.0f, 12.0f, 18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[2].setRotationPoint(0.0f, -28.0f, -1.0f);
        this.turretModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, 0.0f, 0.0f, -19.0f, -13.0f, 0.0f, -13.0f, -19.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -19.0f, -13.0f, 0.0f, -13.0f, -19.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[3].setRotationPoint(0.0f, -28.0f, -1.0f);
        (this.barrelModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 200, 80, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 200, 80, this.textureX, this.textureY);
        this.barrelModel[0].addBox(0.0f, -1.5f, -5.5f, 24, 3, 3, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -18.0f, 0.0f);
        this.barrelModel[1].addBox(0.0f, -1.5f, 2.5f, 24, 3, 3, 0.0f);
        this.barrelModel[1].setRotationPoint(0.0f, -18.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
