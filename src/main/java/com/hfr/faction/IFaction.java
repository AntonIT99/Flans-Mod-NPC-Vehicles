package com.hfr.faction; //dummy file so flan will stfu

import java.util.List;

import com.flansmod.common.driveables.EntityDriveable;

import net.minecraft.entity.Entity;
import net.minecraft.util.EnumChatFormatting;

public class IFaction {
	
	

	public static enum PermLevel{/*BUILD, BREAK, DOORS, REDST, CONTA, INVIT, KICK , SETHO, SETWA, MONEY, CLAIM, PROMO, WARP , TPHOM, DIPLO*/
		INVITED(new boolean[]   {  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, EnumChatFormatting.DARK_GRAY, "Invited"),
		APPLICANT(new boolean[] {  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, EnumChatFormatting.DARK_GRAY, "Applicant"),
		PLEBEIAN( new boolean[] {  false, false, true , false, true , false, false, false, false, false, false, false, false, false, false}, EnumChatFormatting.GRAY, "Plebeian"),
		SOLDIER(  new boolean[] {  true , true , true , true , true , false, false, false, false, false, false, false, true , true , false}, EnumChatFormatting.AQUA, "Soldier"),
		OFFICER(  new boolean[] {  true , true , true , true , true , false, false, false, true , false, true , true , true , true , false}, EnumChatFormatting.BLUE, "Officer"),
		GENERAL(  new boolean[] {  true,  true , true , true , true , true , true , true , true , true , true , true , true , true , true }, EnumChatFormatting.LIGHT_PURPLE, "General"),
		TYRANT(   new boolean[] {  true,  true , true , true , true , true , true , true , true , true , true , true , true , true , true }, EnumChatFormatting.RED, "Tyrant");
		
		private PermLevel(boolean[] perms, EnumChatFormatting color,String displayName) {
			this.permissionTable = perms;
			this.color = color;
			this.displayName = displayName;
		}
		
		private final boolean[] permissionTable;
		private final EnumChatFormatting color;
		private final String displayName;
		

		
		public EnumChatFormatting getChatColor() {
			return color;
		}
		
		public String getDisplayName() {
			return displayName;
		}
	}

	public void addTransportVehicle(Entity e, String displayName) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getMembersOfRankAndAbove(PermLevel plebeian) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeTransportVehicle(EntityDriveable driveable) {
		// TODO Auto-generated method stub
		
	}

}
