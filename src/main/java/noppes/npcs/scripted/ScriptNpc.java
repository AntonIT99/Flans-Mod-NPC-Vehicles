// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import noppes.npcs.util.ValueUtil;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.NoppesUtilServer;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.item.ItemStack;
import noppes.npcs.scripted.roles.ScriptJobSpawner;
import noppes.npcs.scripted.roles.ScriptJobItemGiver;
import noppes.npcs.scripted.roles.ScriptJobPuppet;
import noppes.npcs.scripted.roles.ScriptJobHealer;
import noppes.npcs.scripted.roles.ScriptJobGuard;
import noppes.npcs.scripted.roles.ScriptJobFollower;
import noppes.npcs.scripted.roles.ScriptJobConversation;
import noppes.npcs.scripted.roles.ScriptJobBard;
import noppes.npcs.constants.EnumJobType;
import noppes.npcs.scripted.roles.ScriptJobInterface;
import noppes.npcs.scripted.roles.ScriptRoleTransporter;
import noppes.npcs.scripted.roles.ScriptRoleTrader;
import noppes.npcs.scripted.roles.ScriptRoleMailman;
import noppes.npcs.scripted.roles.ScriptRoleFollower;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.scripted.roles.ScriptRoleBank;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.scripted.roles.ScriptRoleInterface;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.controllers.Line;
import net.minecraft.entity.EntityLiving;
import noppes.npcs.entity.EntityCustomNpc;

public class ScriptNpc extends ScriptLiving
{
    protected EntityCustomNpc npc;
    
    public ScriptNpc(final EntityCustomNpc npc) {
        super((EntityLiving)npc);
        this.npc = npc;
    }
    
    public int getSize() {
        return this.npc.display.modelSize;
    }
    
    public void setSize(int size) {
        if (size > 30) {
            size = 30;
        }
        else if (size < 1) {
            size = 1;
        }
        this.npc.display.modelSize = size;
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public String getName() {
        return this.npc.display.name;
    }
    
    @Override
    public void setRotation(final float rotation) {
        this.npc.ai.orientation = (int)rotation;
        super.setRotation(rotation);
    }
    
    public void setName(final String name) {
        this.npc.display.name = name;
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public String getTitle() {
        return this.npc.display.title;
    }
    
    public void setTitle(final String title) {
        this.npc.display.title = title;
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public String getTexture() {
        return this.npc.display.texture;
    }
    
    public void setTexture(final String texture) {
        this.npc.display.texture = texture;
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public int getHomeX() {
        return this.npc.getStartPos()[0];
    }
    
    public void setHomeX(final int x) {
        this.npc.ai.startPos[0] = x;
    }
    
    public int getHomeY() {
        return this.npc.getStartPos()[1];
    }
    
    public void setHomeY(final int y) {
        this.npc.ai.startPos[1] = y;
    }
    
    public int getHomeZ() {
        return this.npc.getStartPos()[2];
    }
    
    public void setHomeZ(final int z) {
        this.npc.ai.startPos[2] = z;
    }
    
    public void setHome(final int x, final int y, final int z) {
        this.npc.ai.startPos = new int[] { x, y, z };
    }
    
    public void setMaxHealth(final int health) {
        this.npc.stats.setMaxHealth(health);
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public void setReturnToHome(final boolean bo) {
        this.npc.ai.returnToStart = bo;
    }
    
    public boolean getReturnToHome() {
        return this.npc.ai.returnToStart;
    }
    
    public ScriptFaction getFaction() {
        return new ScriptFaction(this.npc.getFaction());
    }
    
    public void setFaction(final int id) {
        this.npc.setFaction(id);
    }
    
    @Override
    public int getType() {
        return 2;
    }
    
    @Override
    public boolean typeOf(final int type) {
        return type == 2 || super.typeOf(type);
    }
    
    public void shootItem(final ScriptLivingBase target, final ScriptItemStack item, int accuracy) {
        if (item == null) {
            return;
        }
        if (accuracy < 0) {
            accuracy = 0;
        }
        else if (accuracy > 100) {
            accuracy = 100;
        }
        this.npc.shoot(target.entity, accuracy, item.item, false);
    }
    
    public void say(final String message) {
        this.npc.saySurrounding(new Line(message));
    }
    
    public void say(final ScriptPlayer player, final String message) {
        if (player == null || message == null || message.isEmpty()) {
            return;
        }
        this.npc.say((EntityPlayer)player.player, new Line(message));
    }
    
    public void kill() {
        this.npc.setDead();
    }
    
    public void reset() {
        this.npc.reset();
    }
    
    public ScriptRoleInterface getRole() {
        if (this.npc.advanced.role == EnumRoleType.Bank) {
            return new ScriptRoleBank(this.npc);
        }
        if (this.npc.advanced.role == EnumRoleType.Follower) {
            return new ScriptRoleFollower(this.npc);
        }
        if (this.npc.advanced.role == EnumRoleType.Postman) {
            return new ScriptRoleMailman(this.npc);
        }
        if (this.npc.advanced.role == EnumRoleType.Trader) {
            return new ScriptRoleTrader(this.npc);
        }
        if (this.npc.advanced.role == EnumRoleType.Transporter) {
            return new ScriptRoleTransporter(this.npc);
        }
        return new ScriptRoleInterface(this.npc);
    }
    
    public ScriptJobInterface getJob() {
        if (this.npc.advanced.job == EnumJobType.Bard) {
            return new ScriptJobBard(this.npc);
        }
        if (this.npc.advanced.job == EnumJobType.Conversation) {
            return new ScriptJobConversation(this.npc);
        }
        if (this.npc.advanced.job == EnumJobType.Follower) {
            return new ScriptJobFollower(this.npc);
        }
        if (this.npc.advanced.job == EnumJobType.Guard) {
            return new ScriptJobGuard(this.npc);
        }
        if (this.npc.advanced.job == EnumJobType.Healer) {
            return new ScriptJobHealer(this.npc);
        }
        if (this.npc.advanced.job == EnumJobType.Puppet) {
            return new ScriptJobPuppet(this.npc);
        }
        if (this.npc.advanced.job == EnumJobType.ItemGiver) {
            return new ScriptJobItemGiver(this.npc);
        }
        if (this.npc.advanced.job == EnumJobType.Spawner) {
            return new ScriptJobSpawner(this.npc);
        }
        return new ScriptJobInterface(this.npc);
    }
    
    public ScriptItemStack getRightItem() {
        final ItemStack item = this.npc.inventory.getWeapon();
        if (item == null || item.getItem() == null) {
            return null;
        }
        return new ScriptItemStack(item);
    }
    
    public void setRightItem(final ScriptItemStack item) {
        if (item == null) {
            this.npc.inventory.setWeapon(null);
        }
        else {
            this.npc.inventory.setWeapon(item.item);
        }
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public ScriptItemStack getLefttItem() {
        final ItemStack item = this.npc.getOffHand();
        if (item == null || item.getItem() == null) {
            return null;
        }
        return new ScriptItemStack(item);
    }
    
    public void setLeftItem(final ScriptItemStack item) {
        if (item == null) {
            this.npc.inventory.setOffHand(null);
        }
        else {
            this.npc.inventory.setOffHand(item.item);
        }
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public ScriptItemStack getProjectileItem() {
        final ItemStack item = this.npc.inventory.getProjectile();
        if (item == null || item.getItem() == null) {
            return null;
        }
        return new ScriptItemStack(item);
    }
    
    public void setProjectileItem(final ScriptItemStack item) {
        if (item == null) {
            this.npc.inventory.setProjectile(null);
        }
        else {
            this.npc.inventory.setProjectile(item.item);
        }
        this.npc.script.aiNeedsUpdate = true;
    }
    
    @Override
    public ScriptItemStack getArmor(final int slot) {
        final ItemStack item = this.npc.inventory.armor.get(slot);
        if (item == null) {
            return null;
        }
        return new ScriptItemStack(item);
    }
    
    @Override
    public void setArmor(final int slot, final ScriptItemStack item) {
        if (item == null) {
            this.npc.inventory.armor.put(slot, null);
        }
        else {
            this.npc.inventory.armor.put(slot, item.item);
        }
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public void setAnimation(final int type) {
        if (type == 0) {
            this.npc.ai.animationType = EnumAnimation.NONE;
        }
        else if (type == 1) {
            this.npc.ai.animationType = EnumAnimation.SITTING;
        }
        else if (type == 5) {
            this.npc.ai.animationType = EnumAnimation.DANCING;
        }
        else if (type == 4) {
            this.npc.ai.animationType = EnumAnimation.SNEAKING;
        }
        else if (type == 2) {
            this.npc.ai.animationType = EnumAnimation.LYING;
        }
        else if (type == 3) {
            this.npc.ai.animationType = EnumAnimation.HUG;
        }
    }
    
    public void setVisibleType(final int type) {
        this.npc.display.visible = type;
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public int getVisibleType() {
        return this.npc.display.visible;
    }
    
    public void setShowName(final int type) {
        this.npc.display.showName = type;
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public int getShowName() {
        return this.npc.display.showName;
    }
    
    public int getShowBossBar() {
        return this.npc.display.showBossBar;
    }
    
    public void setShowBossBar(final int type) {
        this.npc.display.showBossBar = (byte)type;
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public int getMeleeStrength() {
        return this.npc.stats.getAttackStrength();
    }
    
    public void setMeleeStrength(final int strength) {
        this.npc.stats.setAttackStrength(strength);
    }
    
    public int getMeleeSpeed() {
        return this.npc.stats.attackSpeed;
    }
    
    public void setMeleeSpeed(final int speed) {
        this.npc.stats.attackSpeed = speed;
    }
    
    public int getRangedStrength() {
        return this.npc.stats.pDamage;
    }
    
    public void setRangedStrength(final int strength) {
        this.npc.stats.pDamage = strength;
    }
    
    public int getRangedSpeed() {
        return this.npc.stats.pSpeed;
    }
    
    public void setRangedSpeed(final int speed) {
        this.npc.stats.pSpeed = speed;
    }
    
    public int getRangedBurst() {
        return this.npc.stats.burstCount;
    }
    
    public void setRangedBurst(final int count) {
        this.npc.stats.burstCount = count;
    }
    
    public void giveItem(final ScriptPlayer player, final ScriptItemStack item) {
        this.npc.givePlayerItem((EntityPlayer)player.player, item.item);
    }
    
    public void executeCommand(final String command) {
        NoppesUtilServer.runCommand((EntityLivingBase)this.npc, this.npc.getCommandSenderName(), command, null);
    }
    
    public void setHeadScale(final float x, final float y, final float z) {
        this.npc.modelData.head.scaleX = ValueUtil.correctFloat(x, 0.5f, 1.5f);
        this.npc.modelData.head.scaleY = ValueUtil.correctFloat(y, 0.5f, 1.5f);
        this.npc.modelData.head.scaleZ = ValueUtil.correctFloat(z, 0.5f, 1.5f);
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public void setBodyScale(final float x, final float y, final float z) {
        this.npc.modelData.body.scaleX = ValueUtil.correctFloat(x, 0.5f, 1.5f);
        this.npc.modelData.body.scaleY = ValueUtil.correctFloat(y, 0.5f, 1.5f);
        this.npc.modelData.body.scaleZ = ValueUtil.correctFloat(z, 0.5f, 1.5f);
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public void setArmsScale(final float x, final float y, final float z) {
        this.npc.modelData.arms.scaleX = ValueUtil.correctFloat(x, 0.5f, 1.5f);
        this.npc.modelData.arms.scaleY = ValueUtil.correctFloat(y, 0.5f, 1.5f);
        this.npc.modelData.arms.scaleZ = ValueUtil.correctFloat(z, 0.5f, 1.5f);
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public void setLegsScale(final float x, final float y, final float z) {
        this.npc.modelData.legs.scaleX = ValueUtil.correctFloat(x, 0.5f, 1.5f);
        this.npc.modelData.legs.scaleY = ValueUtil.correctFloat(y, 0.5f, 1.5f);
        this.npc.modelData.legs.scaleZ = ValueUtil.correctFloat(z, 0.5f, 1.5f);
        this.npc.script.clientNeedsUpdate = true;
    }
    
    public void seExplosionResistance(final float resistance) {
        this.npc.stats.resistances.explosion = ValueUtil.correctFloat(resistance, 0.0f, 2.0f);
    }
    
    public float getExplosionResistance() {
        return this.npc.stats.resistances.explosion;
    }
    
    public void setMeleeResistance(final float resistance) {
        this.npc.stats.resistances.playermelee = ValueUtil.correctFloat(resistance, 0.0f, 2.0f);
    }
    
    public float getMeleeResistance() {
        return this.npc.stats.resistances.playermelee;
    }
    
    public void setArrowResistance(final float resistance) {
        this.npc.stats.resistances.arrow = ValueUtil.correctFloat(resistance, 0.0f, 2.0f);
    }
    
    public float getArrowResistance() {
        return this.npc.stats.resistances.arrow;
    }
    
    public void setKnockbackResistance(final float resistance) {
        this.npc.stats.resistances.knockback = ValueUtil.correctFloat(resistance, 0.0f, 2.0f);
    }
    
    public float getKnockbackResistance() {
        return this.npc.stats.resistances.knockback;
    }
    
    public void setRetaliateType(final int type) {
        this.npc.ai.onAttack = type;
        this.npc.setResponse();
    }
    
    public int getCombatRegen() {
        return this.npc.stats.combatRegen;
    }
    
    public void setCombatRegen(final int regen) {
        this.npc.stats.combatRegen = regen;
    }
    
    public int getHealthRegen() {
        return this.npc.stats.healthRegen;
    }
    
    public void setHealthRegen(final int regen) {
        this.npc.stats.healthRegen = regen;
    }
    
    @Override
    public long getAge() {
        return this.npc.totalTicksAlive;
    }
}
