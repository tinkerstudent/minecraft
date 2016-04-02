package com.tinkeracademy.minecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CatItem extends Item {

	public CatItem() {
		GameRegistry.registerItem(this, "cat");
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(EntitiesMod.MODID + "_" + "cat");
	}
	
	public void init() {
		registerCat((CatItem) this, 0, "cat");
	}
	
	public void registerCat(CatItem cat, int metadata, String fileName) {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(cat, metadata, 
				new ModelResourceLocation(EntitiesMod.MODID + ':' + fileName, "inventory"));
	}
	
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		if (worldIn.isRemote) {
			return false;
		}
		Cat cat = new Cat(worldIn);
		BlockPos playerPos = playerIn.getPosition();
		cat.setPosition(playerPos.getX() + 0.5D, playerPos.getY() + 10.0D, playerPos.getZ() + 0.5D);
		worldIn.spawnEntityInWorld(cat);
		return true;
    }

}
