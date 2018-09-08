// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobPuppet;

public class ScriptJobPuppet extends ScriptJobInterface
{
    private JobPuppet job;
    
    public ScriptJobPuppet(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobPuppet)npc.jobInterface;
    }
    
    public int getRotationX(final int part) {
        if (part == 0) {
            return this.floatToInt(this.job.head.rotationX);
        }
        if (part == 1) {
            return this.floatToInt(this.job.body.rotationX);
        }
        if (part == 2) {
            return this.floatToInt(this.job.larm.rotationX);
        }
        if (part == 3) {
            return this.floatToInt(this.job.rarm.rotationX);
        }
        if (part == 4) {
            return this.floatToInt(this.job.lleg.rotationX);
        }
        if (part == 5) {
            return this.floatToInt(this.job.rleg.rotationX);
        }
        return 0;
    }
    
    public int getRotationY(final int part) {
        if (part == 0) {
            return this.floatToInt(this.job.head.rotationY);
        }
        if (part == 1) {
            return this.floatToInt(this.job.body.rotationY);
        }
        if (part == 2) {
            return this.floatToInt(this.job.larm.rotationY);
        }
        if (part == 3) {
            return this.floatToInt(this.job.rarm.rotationY);
        }
        if (part == 4) {
            return this.floatToInt(this.job.lleg.rotationY);
        }
        if (part == 5) {
            return this.floatToInt(this.job.rleg.rotationY);
        }
        return 0;
    }
    
    public int getRotationZ(final int part) {
        if (part == 0) {
            return this.floatToInt(this.job.head.rotationZ);
        }
        if (part == 1) {
            return this.floatToInt(this.job.body.rotationZ);
        }
        if (part == 2) {
            return this.floatToInt(this.job.larm.rotationZ);
        }
        if (part == 3) {
            return this.floatToInt(this.job.rarm.rotationZ);
        }
        if (part == 4) {
            return this.floatToInt(this.job.lleg.rotationZ);
        }
        if (part == 5) {
            return this.floatToInt(this.job.rleg.rotationZ);
        }
        return 0;
    }
    
    public void setRotationX(final int part, final int rotation) {
        final float f = rotation / 360.0f - 0.5f;
        if (this.getRotationX(part) != f) {
            this.npc.script.clientNeedsUpdate = true;
        }
        if (part == 0) {
            this.job.head.rotationX = f;
        }
        if (part == 1) {
            this.job.body.rotationX = f;
        }
        if (part == 2) {
            this.job.larm.rotationX = f;
        }
        if (part == 3) {
            this.job.rarm.rotationX = f;
        }
        if (part == 4) {
            this.job.lleg.rotationX = f;
        }
        if (part == 5) {
            this.job.rleg.rotationX = f;
        }
    }
    
    public void setRotationY(final int part, final int rotation) {
        final float f = rotation / 360.0f - 0.5f;
        if (this.getRotationY(part) != f) {
            this.npc.script.clientNeedsUpdate = true;
        }
        if (part == 0) {
            this.job.head.rotationY = f;
        }
        if (part == 1) {
            this.job.body.rotationY = f;
        }
        if (part == 2) {
            this.job.larm.rotationY = f;
        }
        if (part == 3) {
            this.job.rarm.rotationY = f;
        }
        if (part == 4) {
            this.job.lleg.rotationY = f;
        }
        if (part == 5) {
            this.job.rleg.rotationY = f;
        }
    }
    
    public void setRotationZ(final int part, final int rotation) {
        final float f = rotation / 360.0f - 0.5f;
        if (this.getRotationZ(part) != f) {
            this.npc.script.clientNeedsUpdate = true;
        }
        if (part == 0) {
            this.job.head.rotationZ = f;
        }
        if (part == 1) {
            this.job.body.rotationZ = f;
        }
        if (part == 2) {
            this.job.larm.rotationZ = f;
        }
        if (part == 3) {
            this.job.rarm.rotationZ = f;
        }
        if (part == 4) {
            this.job.lleg.rotationZ = f;
        }
        if (part == 5) {
            this.job.rleg.rotationZ = f;
        }
    }
    
    public boolean isEnabled(final int part) {
        if (part == 0) {
            return !this.job.head.disabled;
        }
        if (part == 1) {
            return !this.job.body.disabled;
        }
        if (part == 2) {
            return !this.job.larm.disabled;
        }
        if (part == 3) {
            return !this.job.rarm.disabled;
        }
        if (part == 4) {
            return !this.job.lleg.disabled;
        }
        return part == 5 && !this.job.rleg.disabled;
    }
    
    public void setEnabled(final int part, final boolean bo) {
        if (this.isEnabled(part) != bo) {
            this.npc.script.clientNeedsUpdate = true;
        }
        if (part == 0) {
            this.job.head.disabled = !bo;
        }
        if (part == 1) {
            this.job.body.disabled = !bo;
        }
        if (part == 2) {
            this.job.larm.disabled = !bo;
        }
        if (part == 3) {
            this.job.rarm.disabled = !bo;
        }
        if (part == 4) {
            this.job.lleg.disabled = !bo;
        }
        if (part == 5) {
            this.job.rleg.disabled = !bo;
        }
    }
    
    private int floatToInt(final float f) {
        return (int)((f + 0.5) * 360.0);
    }
    
    @Override
    public int getType() {
        return 8;
    }
}
