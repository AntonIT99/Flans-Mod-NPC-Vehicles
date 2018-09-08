// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.Vec3;

public class RandomPositionGeneratorAlt
{
    private static Vec3 staticVector;
    
    public static Vec3 findRandomTarget(final EntityCreature par0EntityCreature, final int par1, final int par2) {
        return findRandomTargetBlock(par0EntityCreature, par1, par2, null);
    }
    
    public static Vec3 findRandomTargetBlockTowards(final EntityCreature par0EntityCreature, final int par1, final int par2, final Vec3 par3Vec3) {
        RandomPositionGeneratorAlt.staticVector.xCoord = par3Vec3.xCoord - par0EntityCreature.posX;
        RandomPositionGeneratorAlt.staticVector.yCoord = par3Vec3.yCoord - par0EntityCreature.posY;
        RandomPositionGeneratorAlt.staticVector.zCoord = par3Vec3.zCoord - par0EntityCreature.posZ;
        return findRandomTargetBlock(par0EntityCreature, par1, par2, RandomPositionGeneratorAlt.staticVector);
    }
    
    public static Vec3 findRandomTargetBlockAwayFrom(final EntityCreature par0EntityCreature, final int par1, final int par2, final Vec3 par3Vec3) {
        RandomPositionGeneratorAlt.staticVector.xCoord = par0EntityCreature.posX - par3Vec3.xCoord;
        RandomPositionGeneratorAlt.staticVector.yCoord = par0EntityCreature.posY - par3Vec3.yCoord;
        RandomPositionGeneratorAlt.staticVector.zCoord = par0EntityCreature.posZ - par3Vec3.zCoord;
        return findRandomTargetBlock(par0EntityCreature, par1, par2, RandomPositionGeneratorAlt.staticVector);
    }
    
    private static Vec3 findRandomTargetBlock(final EntityCreature par0EntityCreature, int par1, int par2, final Vec3 par3Vec3) {
        if (par1 <= 0) {
            par1 = 1;
        }
        if (par2 <= 0) {
            par2 = 1;
        }
        final Random random = par0EntityCreature.getRNG();
        boolean flag = false;
        int k = 0;
        int l = 0;
        int i1 = 0;
        float f = -99999.0f;
        boolean flag2;
        if (par0EntityCreature.hasHome()) {
            final double d0 = par0EntityCreature.getHomePosition().getDistanceSquared(MathHelper.floor_double(par0EntityCreature.posX), MathHelper.floor_double(par0EntityCreature.posY), MathHelper.floor_double(par0EntityCreature.posZ)) + 4.0f;
            final double d2 = par0EntityCreature.func_110174_bM() + par1;
            flag2 = (d0 < d2 * d2);
        }
        else {
            flag2 = false;
        }
        for (int l2 = 0; l2 < 10; ++l2) {
            int j1 = random.nextInt(2 * par1) - par1;
            int i2 = random.nextInt(2 * par2) - par2;
            int k2 = random.nextInt(2 * par1) - par1;
            if (par3Vec3 == null || j1 * par3Vec3.xCoord + k2 * par3Vec3.zCoord >= 0.0) {
                if (random.nextBoolean()) {
                    j1 += MathHelper.floor_double(par0EntityCreature.posX);
                    i2 += MathHelper.floor_double(par0EntityCreature.posY);
                    k2 += MathHelper.floor_double(par0EntityCreature.posZ);
                }
                else {
                    j1 += MathHelper.ceiling_double_int(par0EntityCreature.posX);
                    i2 += MathHelper.ceiling_double_int(par0EntityCreature.posY);
                    k2 += MathHelper.ceiling_double_int(par0EntityCreature.posZ);
                }
                if (!flag2 || par0EntityCreature.isWithinHomeDistance(j1, i2, k2)) {
                    final float f2 = par0EntityCreature.getBlockPathWeight(j1, i2, k2);
                    if (f2 > f) {
                        f = f2;
                        k = j1;
                        l = i2;
                        i1 = k2;
                        flag = true;
                    }
                }
            }
        }
        if (flag) {
            return Vec3.createVectorHelper((double)k, (double)l, (double)i1);
        }
        return null;
    }
    
    static {
        RandomPositionGeneratorAlt.staticVector = Vec3.createVectorHelper(0.0, 0.0, 0.0);
    }
}
