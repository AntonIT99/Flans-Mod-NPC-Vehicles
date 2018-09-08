// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.entity.Entity;
import noppes.npcs.controllers.ScriptController;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;

public class ScriptEventKilled extends ScriptEvent
{
    private ScriptLivingBase source;
    private DamageSource damagesource;
    
    public ScriptEventKilled(final EntityLivingBase target, final DamageSource damagesource) {
        this.damagesource = damagesource;
        this.source = (ScriptLivingBase)ScriptController.Instance.getScriptForEntity((Entity)target);
    }
    
    public ScriptLivingBase getSource() {
        return this.source;
    }
    
    public String getType() {
        return this.damagesource.damageType;
    }
}
