package com.flansmod.common.driveables;
import com.flansmod.common.vector.Vector3f;

public class ShootPoint
{
	public DriveablePosition rootPos;
	public Vector3f offPos;
	public float convergentAngle=0;
	public boolean musik = false;
	
	
	public ShootPoint(DriveablePosition driverPos, Vector3f offsetPos, Float convergent, Boolean scrageMusik)
	{
		rootPos = driverPos;
		offPos = offsetPos;
		convergentAngle = convergent;
		musik = scrageMusik;
		
	}
}
