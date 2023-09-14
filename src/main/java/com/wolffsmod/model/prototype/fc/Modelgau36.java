//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.prototype.fc;

import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;
import com.wolffsmod.model.*;

public class Modelgau36 extends ModelGun
{
    int textureX;
    int textureY;
    
    public Modelgau36() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[29])[0] = new ModelRendererTurbo((ModelBase)this, 0, 45, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 110, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 170, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 210, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 210, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 210, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 270, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 270, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 270, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 300, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 320, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 370, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 420, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 470, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo((ModelBase)this, 200, 0, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo((ModelBase)this, 200, 0, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo((ModelBase)this, 200, 0, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo((ModelBase)this, 200, 50, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo((ModelBase)this, 200, 70, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.gunModel[28] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(-22.0f, -16.0f, -12.0f, 41, 32, 24, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 15, 32, 24, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, -3.0f, 0.0f, -12.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -3.0f, 0.0f, -2.0f, -3.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].setRotationPoint(19.0f, -16.0f, -12.0f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 5, 18, 18, 0.0f);
        this.gunModel[2].setRotationPoint(34.0f, -4.0f, -9.0f);
        this.gunModel[3].addShapeBox(5.0f, 0.0f, 0.0f, 10, 6, 18, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(34.0f, -4.0f, -9.0f);
        this.gunModel[4].addBox(5.0f, 0.0f, 0.0f, 10, 6, 18, 0.0f);
        this.gunModel[4].setRotationPoint(34.0f, 2.0f, -9.0f);
        this.gunModel[5].addShapeBox(5.0f, 0.0f, 0.0f, 10, 6, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f);
        this.gunModel[5].setRotationPoint(34.0f, 8.0f, -9.0f);
        this.gunModel[6].addBox(15.0f, -7.5f, -1.5f, 103, 3, 3, 0.0f);
        this.gunModel[6].setRotationPoint(34.0f, 5.0f, 0.0f);
        this.gunModel[7].addBox(15.0f, -7.5f, -1.5f, 103, 3, 3, 0.0f);
        this.gunModel[7].setRotationPoint(34.0f, 5.0f, 0.0f);
        this.gunModel[7].rotateAngleX = 0.7853982f;
        this.gunModel[8].addBox(15.0f, -7.5f, -1.5f, 103, 3, 3, 0.0f);
        this.gunModel[8].setRotationPoint(34.0f, 5.0f, 0.0f);
        this.gunModel[8].rotateAngleX = 1.570796f;
        this.gunModel[9].addBox(15.0f, -7.5f, -1.5f, 103, 3, 3, 0.0f);
        this.gunModel[9].setRotationPoint(34.0f, 5.0f, 0.0f);
        this.gunModel[9].rotateAngleX = 2.356194f;
        this.gunModel[10].addBox(15.0f, -7.5f, -1.5f, 103, 3, 3, 0.0f);
        this.gunModel[10].setRotationPoint(34.0f, 5.0f, 0.0f);
        this.gunModel[10].rotateAngleX = 3.141593f;
        this.gunModel[11].addBox(15.0f, -7.5f, -1.5f, 103, 3, 3, 0.0f);
        this.gunModel[11].setRotationPoint(34.0f, 5.0f, 0.0f);
        this.gunModel[11].rotateAngleX = -2.356194f;
        this.gunModel[12].addBox(15.0f, -7.5f, -1.5f, 103, 3, 3, 0.0f);
        this.gunModel[12].setRotationPoint(34.0f, 5.0f, 0.0f);
        this.gunModel[12].rotateAngleX = -1.570796f;
        this.gunModel[13].addBox(15.0f, -6.5f, -1.5f, 103, 3, 3, 0.0f);
        this.gunModel[13].setRotationPoint(34.0f, 5.0f, 0.0f);
        this.gunModel[13].rotateAngleX = -0.7853982f;
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 23, 6, 18, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[14].setRotationPoint(127.0f, -4.0f, -9.0f);
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 23, 6, 18, 0.0f);
        this.gunModel[15].setRotationPoint(127.0f, 2.0f, -9.0f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 23, 6, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f);
        this.gunModel[16].setRotationPoint(127.0f, 8.0f, -9.0f);
        this.gunModel[17].addBox(0.0f, 16.0f, 0.0f, 32, 4, 10, 0.0f);
        this.gunModel[17].setRotationPoint(-16.0f, 0.0f, -5.0f);
        this.gunModel[18].addShapeBox(0.0f, 20.0f, 0.0f, 45, 10, 30, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[18].setRotationPoint(-24.0f, 0.0f, -15.0f);
        this.gunModel[19].addBox(0.0f, 30.0f, 0.0f, 45, 10, 30, 0.0f);
        this.gunModel[19].setRotationPoint(-24.0f, 0.0f, -15.0f);
        this.gunModel[20].addShapeBox(0.0f, 40.0f, 0.0f, 45, 10, 30, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, -10.0f);
        this.gunModel[20].setRotationPoint(-24.0f, 0.0f, -15.0f);
        this.gunModel[21].addBox(0.0f, 0.0f, 0.0f, 6, 14, 14, 0.0f);
        this.gunModel[21].setRotationPoint(-29.0f, -2.0f, -7.0f);
        this.gunModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 6, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[22].setRotationPoint(-35.0f, -1.0f, -6.0f);
        this.gunModel[23].addBox(0.0f, 0.0f, 0.0f, 6, 4, 12, 0.0f);
        this.gunModel[23].setRotationPoint(-35.0f, 3.0f, -6.0f);
        this.gunModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 6, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.gunModel[24].setRotationPoint(-35.0f, 7.0f, -6.0f);
        this.gunModel[25].addBox(0.0f, 0.0f, 0.0f, 45, 10, 6, 0.0f);
        this.gunModel[25].setRotationPoint(19.0f, -14.0f, -3.0f);
        this.gunModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 15, 10, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[26].setRotationPoint(64.0f, -14.0f, -3.0f);
        this.gunModel[27].addBox(-3.0f, -16.0f, 0.0f, 3, 16, 3, 0.0f);
        this.gunModel[27].setRotationPoint(59.0f, -14.0f, -1.5f);
        this.gunModel[27].rotateAngleZ = 0.7853982f;
        this.gunModel[28].addBox(-3.0f, -16.0f, 0.0f, 3, 16, 3, 0.0f);
        this.gunModel[28].setRotationPoint(50.0f, -14.0f, -1.5f);
        this.gunModel[28].rotateAngleZ = 0.7853982f;
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.NONE;
        this.flipAll();
    }
}
