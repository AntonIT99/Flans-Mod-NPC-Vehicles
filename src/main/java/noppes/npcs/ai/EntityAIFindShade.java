// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import java.util.Random;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import noppes.npcs.constants.AiMutex;
import net.minecraft.world.World;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIFindShade extends EntityAIBase
{
    private EntityCreature theCreature;
    private double shelterX;
    private double shelterY;
    private double shelterZ;
    private World theWorld;
    
    public EntityAIFindShade(final EntityCreature par1EntityCreature) {
        this.theCreature = par1EntityCreature;
        this.theWorld = par1EntityCreature.worldObj;
        this.setMutexBits((int)AiMutex.PASSIVE);
    }
    
    public boolean shouldExecute() {
        if (!this.theWorld.isDaytime()) {
            return false;
        }
        if (!this.theWorld.canBlockSeeTheSky(MathHelper.floor_double(this.theCreature.posX), (int)this.theCreature.boundingBox.minY, MathHelper.floor_double(this.theCreature.posZ))) {
            return false;
        }
        final Vec3 var1 = this.findPossibleShelter();
        if (var1 == null) {
            return false;
        }
        this.shelterX = var1.xCoord;
        this.shelterY = var1.yCoord;
        this.shelterZ = var1.zCoord;
        return true;
    }
    
    public boolean continueExecuting() {
        return !this.theCreature.getNavigator().noPath();
    }
    
    public void startExecuting() {
        this.theCreature.getNavigator().tryMoveToXYZ(this.shelterX, this.shelterY, this.shelterZ, 1.0);
    }
    
    private Vec3 findPossibleShelter() {
        final Random var1 = this.theCreature.getRNG();
        for (int var2 = 0; var2 < 10; ++var2) {
            final int var3 = MathHelper.floor_double(this.theCreature.posX + var1.nextInt(20) - 10.0);
            final int var4 = MathHelper.floor_double(this.theCreature.boundingBox.minY + var1.nextInt(6) - 3.0);
            final int var5 = MathHelper.floor_double(this.theCreature.posZ + var1.nextInt(20) - 10.0);
            final float light = this.theWorld.getLightBrightness(var3, var4, var5) - 0.5f;
            if (!this.theWorld.canBlockSeeTheSky(var3, var4, var5) && light < 0.0f) {
                return Vec3.createVectorHelper((double)var3, (double)var4, (double)var5);
            }
        }
        return null;
    }
}
