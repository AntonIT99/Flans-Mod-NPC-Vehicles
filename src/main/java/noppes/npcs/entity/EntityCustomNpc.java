package noppes.npcs.entity;

import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.EntityFlanPlaneNPC;
import com.wolffsmod.entity.helper.EntityNPCBodyHelper;
import noppes.npcs.CustomNpcs;
import noppes.npcs.ModelData;
import noppes.npcs.ModelPartData;
import noppes.npcs.VersionCompatibility;
import noppes.npcs.client.EntityUtil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
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
		super.onUpdate();
		if (getFlanDriveableEntity().isPresent())
		{
			getFlanDriveableEntity().get().updateNpc(this);
		}
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
	}

	@Override
	public float getEyeHeight()
	{
		if (getFlanDriveableEntity().isPresent() && getFlanDriveableEntity().get().shootPointsPrimary.size() > 0)
		{
			return getFlanDriveableEntity().get().shootPointsPrimary.get(0).rootPos.position.getY() + getFlanDriveableEntity().get().yDriveableOffset;
		}
		return super.getEyeHeight();
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

