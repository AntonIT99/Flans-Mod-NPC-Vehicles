// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.scripted.ScriptNpc;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobFollower;

public class ScriptJobFollower extends ScriptJobInterface
{
    private JobFollower job;
    
    public ScriptJobFollower(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobFollower)npc.jobInterface;
    }
    
    public String getFollowingName() {
        return this.job.name;
    }
    
    public void setFollowingName(final String name) {
        this.job.name = name;
    }
    
    public ScriptNpc getFollowingNpc() {
        if (!this.isFollowing()) {
            return null;
        }
        return this.job.following.script.dummyNpc;
    }
    
    public boolean isFollowing() {
        return this.job.isFollowing();
    }
    
    @Override
    public int getType() {
        return 4;
    }
}
