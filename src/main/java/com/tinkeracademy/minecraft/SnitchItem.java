package com.tinkeracademy.minecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SnitchItem extends Item {

	public SnitchItem() {
		GameRegistry.registerItem(this, "Snitch");
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(EntitiesMod.MODID + "_" + "Snitch");
	}
	
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		if (worldIn.isRemote) {
			return false;
		}
		Snitch snitch = new Snitch(worldIn);
		BlockPos playerPos = playerIn.getPosition();
		snitch.setPosition(playerPos.getX() + 0.5D, playerPos.getY(), playerPos.getZ() + 0.5D);
		worldIn.spawnEntityInWorld(snitch);
		return true;
    }

}
