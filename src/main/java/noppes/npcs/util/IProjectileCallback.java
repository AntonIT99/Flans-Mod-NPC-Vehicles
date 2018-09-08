// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.util;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityProjectile;

public interface IProjectileCallback
{
    boolean onImpact(final EntityProjectile p0, final EntityLivingBase p1, final ItemStack p2);
}
