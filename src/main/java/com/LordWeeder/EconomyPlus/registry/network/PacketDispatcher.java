package com.LordWeeder.EconomyPlus.registry.network; //imposter mod so flans tfu

import com.flansmod.common.network.PacketBase;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.network.NetworkRegistry;
import com.LordWeeder.EconomyPlus.registry.Main;

public class PacketDispatcher {

	//Mark 1 Packet Sending Device by HBM
	public static final SimpleNetworkWrapper wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Main.MODID);
	
	public static final void registerPackets(){
		int i = 0;

	}
}
