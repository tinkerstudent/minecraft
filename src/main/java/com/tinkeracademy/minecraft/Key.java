package com.tinkeracademy.minecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Key extends Item {

	public Key() {
		GameRegistry.registerItem(this, "key");
		setUnlocalizedName(ItemsMod.MODID + "_" + "key");
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public void init() {
		registerKey((Key) this, 0, "key");
	}
	
	public void registerKey(Key key, int metadata, String fileName) {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(key, metadata, 
				new ModelResourceLocation(ItemsMod.MODID + ':' + fileName, "inventory"));
	}
	
	// Jan 2016 Material
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		return null;
	}
	
}
