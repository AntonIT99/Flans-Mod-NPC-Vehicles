package com.flansmod.common.guns;

public interface IScope 
{
	public float getFOVFactor();
	
	public float getZoomFactor();
	
	public boolean hasZoomOverlay();
	
	public String getZoomOverlay();

	public float getMinZoom();
	
	public float getMaxZoom();
	
	public float getZoomAugment();
	
	public boolean hasVariableZoom();
}
