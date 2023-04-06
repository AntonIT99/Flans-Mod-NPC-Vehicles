package com.hfr.faction.relations;//imposter mod

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;


import com.hfr.faction.relations.FactionRelations;

import com.hfr.faction.Factions;
import com.hfr.faction.IFaction;

import com.hfr.main.MainRegistry;

import akka.japi.Pair;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.util.internal.ConcurrentSet;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class FactionRelations {

	public class Proposal {

	}

	public class Relation {
		
		public HashSet<Pair<IFaction, FactionRelations.Proposal>> getIncomingProposals(IFaction faction) {
			HashSet<Pair<IFaction, FactionRelations.Proposal>> out = new HashSet<>();

			return out;
		}
		


	}

	public static Object relations;

}
