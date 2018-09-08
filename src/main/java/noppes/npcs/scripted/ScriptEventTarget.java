// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.entity.Entity;
import noppes.npcs.controllers.ScriptController;
import net.minecraft.entity.EntityLivingBase;

public class ScriptEventTarget extends ScriptEvent
{
    private ScriptLivingBase target;
    
    public ScriptEventTarget(final EntityLivingBase target) {
        if (target != null) {
            this.target = (ScriptLivingBase)ScriptController.Instance.getScriptForEntity((Entity)target);
        }
    }
    
    public ScriptLivingBase getTarget() {
        return this.target;
    }
    
    public void setTarget(final ScriptLivingBase target) {
        this.target = target;
    }
}
