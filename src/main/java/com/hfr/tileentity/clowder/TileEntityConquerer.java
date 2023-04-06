package com.hfr.tileentity.clowder;

import static net.minecraftforge.common.util.ForgeDirection.UP;

import java.util.List;

//import org.dynmap.forge.DynmapPlugin;

import com.hfr.clowder.Clowder;
import com.hfr.clowder.ClowderFlag;
import com.hfr.clowder.ClowderTerritory;
import com.hfr.clowder.ClowderTerritory.CoordPair;
import com.hfr.clowder.ClowderTerritory.Ownership;
import com.hfr.clowder.ClowderTerritory.TerritoryMeta;
import com.hfr.clowder.ClowderTerritory.Zone;
import com.hfr.clowder.events.RegionOwnershipChangedEvent;
import com.hfr.command.CommandClowder;
import com.hfr.main.MainRegistry;
import com.hfr.tileentity.machine.TileEntityMachineBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.MinecraftForge;

public class TileEntityConquerer extends TileEntityMachineBase implements ITerritoryProvider {
	//hungary bookmark: there is a new weeder thing i didnt put here because reference to non existant part of economy mod
	public Clowder owner;
	public float height = 0.0F;
	public static final float speed = 1.0F / (20F * 40F);
	public String name = "";
	
//	public float poopoopeepee = 0;
	
	@SideOnly(Side.CLIENT)
	public ClowderFlag flag;
	@SideOnly(Side.CLIENT)
	public int color;

	public TileEntityConquerer() {
		super(0);
	}

	@Override
	public String getName() {
		return "undefined";
	}

	@Override
	public void updateEntity() {
		
		if(!worldObj.isRemote) {
			
			if(!Clowder.clowders.contains(owner) && owner != null) {
				MainRegistry.logger.info("Deleting clowder from conquerer " + xCoord + " " + yCoord + " " + zCoord + " due to clowder not being in the clowder list! (disband?)");
				owner = null;
				return;
			}
			
			if(owner == null) {
				worldObj.func_147480_a(xCoord, yCoord, zCoord, false);
				return;
			}
			
			int range = 32;
			List<EntityPlayer> entities = worldObj.getEntitiesWithinAABB(EntityPlayer.class,
					AxisAlignedBB.getBoundingBox(
							xCoord + 0.5 - range,
							yCoord - 2,
							zCoord + 0.5 - range,
							xCoord + 0.5 + range,
							yCoord + 4,
							zCoord + 0.5 + range));
			
			int maxEntities = entities.size();
			
			
			boolean canRaise = false;
			
			
			for(EntityPlayer player : entities) {
				
				Clowder clow = Clowder.getClowderFromPlayer(player);
				
				
				
				if(clow != null) {
					//checks if members of the conqueror fac are nearby - allah note
					if(clow == owner) {
						
						//poopoopeepee++;
						canRaise = true;
					}
				}
			}
			
		//	if(poopoopeepee>1)
		//	System.out.println("poopoopeepee");
			
		//	if(poopoopeepee > maxEntities)
		//		poopoopeepee=0;
			
			double prev = height;
			//this is code for flag raising and falling if non capping, speed is raise speed - allah bookmark
			if((!canRaise && height < 1)) {
				height -= speed;
			} else if(height < 1) {
				height += speed;
			}
			
			if(height < 0)
				height = 0;
			
			if(height > 1)
				height = 1;
			
			if(height >= 1 && prev < 1) {
				//this is code of conquer being enabled when flag reaches max height allah bookmark
				this.worldObj.playSoundEffect(this.xCoord, this.yCoord, this.zCoord, "hfr:block.flagCapture", 100.0F, 1.0F);
				conquer();
			}
			
			this.updateGauge(owner.flag.ordinal(), 0, 250);
			this.updateGauge(owner.color, 1, 250);
			this.updateGauge((int) (height * 100F), 2, 100);
		}
	}
	
	public void processGauge(int val, int id) {
		
		switch(id) {
		case 0: flag = ClowderFlag.values()[val]; break;
		case 1: color = val; break;
		case 2: height = val * 0.01F; break;
		}
	}
	
	public boolean canSeeSky() {
		
		if(!worldObj.canBlockSeeTheSky(xCoord, yCoord, zCoord))
			return false;
		/*if(yCoord < 45)
			return false;
		if(yCoord > 100)
			return false;*/
		
		return true;
	}
	
	private void conquer() {
		
		CoordPair loc = ClowderTerritory.getCoordPair(xCoord, zCoord);
		TerritoryMeta meta = ClowderTerritory.getMetaFromCoords(loc);
		
		//if war is declared and you are capturing enemy territory OR you are the victim and conquering the attackers. new caveat: attacker can take land from victim vassals, and victim vassals can take it back        final option: world peace disabled, total war enabled and you are not attacking an alliance member
		boolean warDeclared = ( (this.owner.getWartime() > 0 && (this.owner.enemy == meta.owner.owner) ) || ( (meta.owner.owner.enemy == this.owner) && meta.owner.owner.getWartime() > 0)  || (this.owner.getWartime() > 0 && (this.owner.enemy == meta.owner.owner.suzerain) ) || ((meta.owner.owner.enemy == this.owner.suzerain) && meta.owner.owner.getWartime() > 0)   ||    (!this.owner.paxBritannica && this.owner.totalenKrieg && meta.owner.owner.totalenKrieg && this.owner.allies.get(meta.owner.owner)==null)    );
		
		/* && meta.owner.owner.isRaidable()*/
		if(meta != null && meta.owner.zone == Zone.FACTION && meta.owner.owner != this.owner && warDeclared ) {		

			CoordPair loc2 = ClowderTerritory.getCoordPair(meta.flagX, meta.flagZ); //loc2 = chunk of mother flag!
			
			TileEntity te = worldObj.getTileEntity(meta.flagX, meta.flagY, meta.flagZ);
			if(te instanceof TileEntityFlagBig)
				name = ((TileEntityFlagBig)te).provinceName;
			
			//new notification for victim, bob forgot to include this. i stole it from traditional flag cap system
			meta.owner.owner.notifyCapture(worldObj,meta.flagX, meta.flagZ, "chunks");
			
			//attacker gets +1 war minute for a successful chunk capture allah bookmark  actually add limitations! set it to 15 or something max extension. also doesnt work if they are offline - also no bonus point shit during revolts
			//if(this.owner != null && this.owner.bonusPoints < MainRegistry.bonusPointLimit && this.owner.enemy != null && this.owner.enemy.isRaidable() && this.owner.enemy != this.owner.suzerain){
			if(this.owner != null && this.owner.bonusPoints < MainRegistry.bonusPointLimit && this.owner.enemy != null  && this.owner.enemy != this.owner.suzerain && this.owner.retreatBan <= 0){  //actually fuck raidable - actually yes raidable - actually replace with retreatban
			this.owner.addWarTime(1, this.worldObj);
			this.owner.bonusPoints += 1;
			//System.out.println("bonus point added" + this.owner.bonusPoints);
			}
			
			if(loc.equals(loc2)) {  //this entire block is for mother flag chunk / classic territory flag chunk
				if(te instanceof TileEntityFlagBig) {	//case for conquering a big flag/node/province/region/county ALLAH
					
					Ownership oldOwner = meta.owner;
					((TileEntityFlagBig)te).owner = this.owner;
					
					//shit for skirmish attacker cant touch your protected claims
					//shit for skirmish defender cannot cap
					if(this.owner.totalenKrieg || (this.owner.getWartime() > 0 && this.owner.enemy == oldOwner.owner)) //prevents defender from fully conquering a node/province/county in a skirmish
					{
					
						if(this.owner.getWartime() > 0 && ((TileEntityFlagBig)te).holyLand) //protected land exception
						{
							this.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.ERROR + "You cannot take core territories during a skirmish!")); 
							worldObj.func_147480_a(xCoord, yCoord, zCoord, false); //flag also kills itself
						}
						else
						{
							
							
					((TileEntityFlagBig)te).generateClaim();
					te.markDirty();
					
					if(this.owner.getWartime() > 0 && this.owner.enemy == oldOwner.owner) //capturing one province is the victory condition for attackers in border skirmishes
					{
						this.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.TITLE + "Our border skirmish against " + oldOwner.owner.name + " was a success! The province is ours!"));
						this.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.INFO + "We also looted some free money!"));
						oldOwner.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.CRITICAL + this.owner.name + "'s war of aggression has unfortunately succeeded..."));
						oldOwner.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.CRITICAL + "In addition to taking the province, they have looted some of our money..."));
						//insert money transfer of 13.52% WEEDER BOOKMARK
						float blmoney = oldOwner.owner.getMoney()*0.1352f; //13.52% of fac's money
						oldOwner.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.ERROR + blmoney + " shekels have been lost!"));
						this.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.ERROR + blmoney + " shekels have been looted from the enemy!"));
						this.owner.addMoney(blmoney, this.worldObj);
						oldOwner.owner.addMoney(-blmoney, this.worldObj);
						this.owner.pussy(this.worldObj); //end the skirmish war
						this.owner.skirmishReset(this.worldObj); //reset delay
					}
					
					if(this.owner.totalenKrieg && ((TileEntityFlagBig)te).holyLand) //case of losing a protected province during a true war
					{
						meta.owner.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.TITLE + "We have lost the core territory of " + ((TileEntityFlagBig)te).name + "!")); //share the bad news
						meta.owner.owner.addholyLand(-1, this.worldObj); //reduces holy land counter for victim
						((TileEntityFlagBig)te).holyLand = false;  //no longer a core territory
						((TileEntityFlagBig)te).markDirty();
					}
					else
						meta.owner.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.TITLE + "We have lost the province of " + ((TileEntityFlagBig)te).name + "!"));
					
					
					MinecraftForge.EVENT_BUS.post(new RegionOwnershipChangedEvent(oldOwner,meta.owner,((TileEntityFlagBig)te).provinceName));
					worldObj.func_147480_a(xCoord, yCoord, zCoord, false); //your conquest flag kills itself
					}
					}
					else
					{	//tells defender that they cant do that sweetie
						this.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.ERROR + "You cannot annex enemy provinces while defending against a border skirmish")); 
						worldObj.func_147480_a(xCoord, yCoord, zCoord, false); //flag also kills itself
					}
					
					
				}
				//case for conquering a non-province classic flag
				else if(te instanceof TileEntityFlag) {	
					((TileEntityFlag)te).setOwner(owner);	//taking over the flag
					worldObj.func_147480_a(xCoord, yCoord, zCoord, false); //your conquest flag kills itself
					
				}
				//case for conquering enemy conquest flag
				else if(te instanceof TileEntityConquerer) { 
					worldObj.func_147480_a(meta.flagX, meta.flagY, meta.flagZ, false); //destroys enemy flags in the chunk
					ClowderTerritory.setOwnerForCoord(worldObj, loc, owner, xCoord, yCoord, zCoord, name);  //become owner of the chunk, but not province
				}
			} else {  //capturing a normal chunk
				
				boolean defensive = false;
				TileEntity flaggy = worldObj.getTileEntity(meta.flagX, meta.flagY, meta.flagZ);
				if (flaggy != null && flaggy instanceof TileEntityFlagBig && ((TileEntityFlagBig)flaggy).getOwner() == this.owner)
				{
					defensive = true;  //checks if the chunk is part of your own province. otherwise no capping! (so you can only take back chunks from enemy claim into your province)
				}
				if(this.owner.totalenKrieg || defensive || ( this.owner.getWartime() > 0 && meta.owner.owner == this.owner.enemy) )
				ClowderTerritory.setOwnerForCoord(worldObj, loc, owner, xCoord, yCoord, zCoord, name);  
				else
				{
					if (!defensive && meta.owner.owner != this.owner.enemy)
					this.owner.notifyAll(this.worldObj, new ChatComponentText(CommandClowder.ERROR + "When defending from an enemy skirmish, you can only take back your rightful land!")); 
					worldObj.func_147480_a(xCoord, yCoord, zCoord, false); //flag also kills itself
				}
				
				
			}
			
		} else {
			worldObj.func_147480_a(xCoord, yCoord, zCoord, false);
		}
	}
	
	public boolean checkBorder(int x, int z) {

		CoordPair loc = ClowderTerritory.getCoordPair(x, z);
		Ownership owner = ClowderTerritory.getOwnerFromCoords(loc);
		if(owner.zone != Zone.FACTION || owner.owner == this.owner)
			return false;
		
		CoordPair loc1 = ClowderTerritory.getCoordPair(x + 16, z);
		Ownership owner1 = ClowderTerritory.getOwnerFromCoords(loc1);
		if(owner1.zone == Zone.WILDERNESS || owner1.owner != owner.owner)
			return true;
		
		CoordPair loc2 = ClowderTerritory.getCoordPair(x - 16, z);
		Ownership owner2 = ClowderTerritory.getOwnerFromCoords(loc2);
		if(owner2.zone == Zone.WILDERNESS || owner2.owner != owner.owner)
			return true;
		
		CoordPair loc3 = ClowderTerritory.getCoordPair(x, z + 16);
		Ownership owner3 = ClowderTerritory.getOwnerFromCoords(loc3);
		if(owner3.zone == Zone.WILDERNESS || owner3.owner != owner.owner)
			return true;
		
		CoordPair loc4 = ClowderTerritory.getCoordPair(x, z - 16);
		Ownership owner4 = ClowderTerritory.getOwnerFromCoords(loc4);
		if(owner4.zone == Zone.WILDERNESS || owner4.owner != owner.owner)
			return true;
		
		return false;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);

		String own = nbt.getString("owner");
		this.owner = Clowder.getClowderFromName(own);
		boolean isNull = nbt.getBoolean("isNull");
		
		if(owner == null) {

			String id = nbt.getString("clow_uuid");
			this.owner = Clowder.getClowderFromUUID(id);
			
			if(!isNull) {
				
				if(owner == null) {
					MainRegistry.logger.info("Owner (" + id + ") of flag " + xCoord + " " + yCoord + " " + zCoord + " was saved NN but finalized as null!");
				}
			}
			
			if(owner == null && !id.isEmpty())
				MainRegistry.logger.info("Owner (" + id + ") of flag " + xCoord + " " + yCoord + " " + zCoord + " was set in NBT but not found in te clowder list!");
		}
		
		this.height = nbt.getFloat("height");
		this.name = nbt.getString("name");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);

		if(owner != null) {
			nbt.setBoolean("isNull", false);
			nbt.setString("clow_uuid", owner.uuid);
		} else {
			nbt.setBoolean("isNull", true);
		}
		
		nbt.setFloat("height", height);
		nbt.setString("name", name);
	}

	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return TileEntity.INFINITE_EXTENT_AABB;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return 65536.0D;
	}

	@Override
	public int getRadius() {
		return 0;
	}

	@Override
	public Clowder getOwner() {
		return this.owner;
	}

	@Override
	public String getClaimName() {
		return name;
	}

	@Override
	public void setClaimName(String name) {
		this.name = name;
	}
}
