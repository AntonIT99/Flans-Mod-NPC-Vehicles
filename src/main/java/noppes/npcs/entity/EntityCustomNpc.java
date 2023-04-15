package noppes.npcs.entity;

import com.flansmod.common.driveables.ShootPoint;
import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.EntityFlanPlaneNPC;
import com.wolffsmod.entity.EntityNPCBodyHelper;
import noppes.npcs.CustomNpcs;
import noppes.npcs.ModelData;
import noppes.npcs.ModelPartData;
import noppes.npcs.VersionCompatibility;
import noppes.npcs.client.EntityUtil;
import noppes.npcs.util.NPCInterfaceUtil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Optional;

public class EntityCustomNpc extends EntityNPCFlying
{
	public ModelData modelData = new ModelData();
	public EntityNPCBodyHelper bodyHelperNPC;

	public EntityCustomNpc(World world)
	{
		super(world);
		bodyHelperNPC = new EntityNPCBodyHelper(this);
	}

	@Override
	protected float func_110146_f(float par1, float par2)
	{
		if (this.isAIEnabled())
		{
			this.bodyHelperNPC.func_75664_a();
			return par2;
		}
		else
		{
			return super.func_110146_f(par1, par2);
		}
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound)
	{
		super.readEntityFromNBT(compound);
		if (compound.hasKey("NpcModelData"))
		{
			npcVersion = compound.getInteger("ModRev");
			VersionCompatibility.CheckModelCompatibility(this, compound);
			modelData.readFromNBT(compound.getCompoundTag("NpcModelData"));
		}
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setTag("NpcModelData", modelData.writeToNBT());
	}

	@Override
	public void onUpdate()
	{
		/*System.out.println("rotationPitch " + Math.round(MathHelper.wrapAngleTo180_float(rotationPitch)));
        System.out.println("rotationYaw " + Math.round(MathHelper.wrapAngleTo180_float(rotationYaw)));
		System.out.println("rotationYawHead " + Math.round(MathHelper.wrapAngleTo180_float(rotationYawHead)));
		System.out.println("renderYawOffset " + Math.round(MathHelper.wrapAngleTo180_float(renderYawOffset)));
		System.out.println("driver " + Math.round(driver.yaw) + " " + Math.round(driver.pitch));*/
		super.onUpdate();
		if (isRemote())
		{
			ModelPartData particles = modelData.getPartData("particles");
			if (particles != null && !isKilled())
			{
				CustomNpcs.proxy.spawnParticle(this, "ModelData", modelData, particles);
			}
			EntityLivingBase entity = modelData.getEntity(this);
			if (entity != null)
			{
				try
				{
					entity.onUpdate();
				}
				catch (Exception e)
				{

				}
				EntityUtil.Copy(this, entity);
			}
		}
		if (getFlanDriveableEntity().isPresent())
		{
			EntityFlanDriveableNPC entityDriveable = getFlanDriveableEntity().get();
			driver.copyProperties(entityDriveable.driver);
			updateDriverAndPassengers();
			entityDriveable.driver.copyYawAndPitch(driver);
			for (Integer id : passengers.keySet())
			{
				if (entityDriveable.passengers.containsKey(id))
					entityDriveable.passengers.get(id).copyYawAndPitch(passengers.get(id));
				else
					entityDriveable.passengers.put(id, passengers.get(id));
			}
		}
	}

	@Override
	public float getEyeHeight()
	{
		if (getFlanDriveableEntity().isPresent() && getFlanDriveableEntity().get().shootPointsPrimary.size() > 0)
		{
			return getFlanDriveableEntity().get().shootPointsPrimary.get(0).rootPos.position.getY() / 16F + getFlanDriveableEntity().get().yDriveableOffset;
		}
		return super.getEyeHeight();
	}

	public void updateDriverAndPassengers()
	{
		float headYaw = prevRotationYawHead + (rotationYawHead - prevRotationYawHead) * 0.5F;
		float headPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.5F;

		driver.setYawAndPitch(headYaw, headPitch, renderYawOffset);
		for (Integer id : passengers.keySet())
		{
			passengers.get(id).setYawAndPitch(headYaw, headPitch, renderYawOffset);
		}

		//System.out.println(headYaw + " " + headPitch);
		//System.out.println(driver.getYaw() + " " + driver.getPitch());
	}

	@Override
	public void mountEntity(Entity par1Entity)
	{
		super.mountEntity(par1Entity);
		updateHitbox();
	}

	@Override
	public void updateHitbox()
	{
		Entity entity = modelData.getEntity(this);
		if (modelData == null || entity == null)
		{
			baseHeight = 1.9f - modelData.getBodyY() + (modelData.head.scaleY - 1) / 2;
			super.updateHitbox();
		}
		else
		{
			if (entity instanceof EntityNPCInterface)
				((EntityNPCInterface) entity).updateHitbox();
			width = (entity.width / 5f) * display.modelSize;
			height = (entity.height / 5f) * display.modelSize;

			if (width < 0.1f)
				width = 0.1f;
			if (height < 0.1f)
				height = 0.1f;
			this.setPosition(posX, posY, posZ);
		}

		//Rendering fix for large entities and Flan Vehicles
		if (((height >= WolffNPCMod.largeEntitySize || width >= WolffNPCMod.largeEntitySize) && WolffNPCMod.ignoreFrustumCheckForLargeEntities) || (isFlanDriveable() && WolffNPCMod.ignoreFrustumCheckForNpcVehicles))
		{
			ignoreFrustumCheck = true;
		}
	}

	@Override
	public boolean isFlanDriveable()
	{
		return modelData.getEntity(this) instanceof EntityFlanDriveableNPC;
	}

	@Override
	public Optional<EntityFlanDriveableNPC> getFlanDriveableEntity()
	{
		if (isFlanDriveable())
			return Optional.of((EntityFlanDriveableNPC) modelData.getEntity(this));
		else
			return Optional.empty();
	}

	@Override
	public boolean isFlanPlane()
	{
		return modelData.getEntity(this) instanceof EntityFlanPlaneNPC;
	}
}

