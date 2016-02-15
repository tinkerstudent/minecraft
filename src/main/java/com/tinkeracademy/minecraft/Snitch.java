package com.tinkeracademy.minecraft;

import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Snitch extends EntityAmbientCreature {
	
	private BlockPos lastPosition;

	public Snitch(World worldIn) {
		super(worldIn);
		this.setSize(0.5F, 0.9F);
	}
	
	protected float getGravityVelocity() {
		return 0.07f;
	}
	
	public void onUpdate()
    {
        super.onUpdate();
//        this.motionY = this.motionY *  0.6000000238418579D;
    }
	
	protected void entityInit()
    {
        super.entityInit();
//        this.dataWatcher.addObject(16, new Byte((byte)0));
    }
	
	protected boolean canTriggerWalking()
    {
        return false;
    }
	
	protected void updateAITasks()
    {
        super.updateAITasks();
//        BlockPos blockpos = new BlockPos(this);
//        BlockPos blockpos1 = blockpos.up();
//
//        {
//            if (this.lastPosition != null && (!this.worldObj.isAirBlock(this.lastPosition) || this.lastPosition.getY() < 1))
//            {
//                this.lastPosition = null;
//            }
//
//            if (this.lastPosition == null || this.rand.nextInt(30) == 0 || this.lastPosition.distanceSq((double)((int)this.posX), (double)((int)this.posY), (double)((int)this.posZ)) < 4.0D)
//            {
//                this.lastPosition = new BlockPos((int)this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7));
//            }
//
//            double d0 = (double)this.lastPosition.getX() + 0.5D - this.posX;
//            double d1 = (double)this.lastPosition.getY() + 0.1D - this.posY;
//            double d2 = (double)this.lastPosition.getZ() + 0.5D - this.posZ;
//            this.motionX += (Math.signum(d0) * 0.5D - this.motionX) * 0.10000000149011612D;
//            this.motionY += (Math.signum(d1) * 0.699999988079071D - this.motionY) * 0.10000000149011612D;
//            this.motionZ += (Math.signum(d2) * 0.5D - this.motionZ) * 0.10000000149011612D;
//            float f = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
//            float f1 = MathHelper.wrapAngleTo180_float(f - this.rotationYaw);
//            this.moveForward = 0.5F;
//            this.rotationYaw += f1;
//        }
    }
	
	public void readEntityFromNBT(NBTTagCompound tagCompund)
    {
        super.readEntityFromNBT(tagCompund);
    }
	
	public void writeEntityToNBT(NBTTagCompound tagCompound)
    {
        super.writeEntityToNBT(tagCompound);
    }
	
	
}
