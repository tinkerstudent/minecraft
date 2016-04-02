package com.tinkeracademy.minecraft;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ItemsMod.MODID, version = ItemsMod.VERSION)
public class ItemsMod {
	public static final String MODID = "itemsmod";
	public static final String VERSION = "1.0";

	private static Item key;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		key = new Key();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		if (event.getSide() == Side.CLIENT) {
    		((Key) key).init();
    	}
	}
}
