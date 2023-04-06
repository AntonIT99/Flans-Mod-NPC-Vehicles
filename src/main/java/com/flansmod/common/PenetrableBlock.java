package com.flansmod.common;

import net.minecraft.block.Block;

public class PenetrableBlock {
	
	private final Block block;
	private final int metadata;
	private final float hardness;
	private final boolean breaks;
	
	public PenetrableBlock(Block block, int metadata, float hardness, boolean breaks) {
		this.block = block;
		this.metadata = metadata;
		this.hardness = hardness;
		this.breaks = breaks;
	}
	
	public Block getBlock() {
		return block;
	}
	
	public int getMetadata() {
		return metadata;
	}
	
	public float getHardness() {
		return hardness;
	}
	
	public boolean breaks() {
		return breaks;
	}
	
}
