package com.tinkeracademy.minecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = EntitiesMod.MODID, version = EntitiesMod.VERSION)
public class EntitiesMod {
	public static final String MODID = "entitiesmod";
	public static final String VERSION = "1.0";

	@SidedProxy(clientSide = "com.tinkeracademy.minecraft.ClientProxy", serverSide = "com.tinkeracademy.minecraft.CommonProxy")
	public static CommonProxy proxy;
	public static Item snitchItem;
	public static Item catItem;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		snitchItem = new SnitchItem();
		catItem = new CatItem();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRendering();
		EntityList.addMapping(Snitch.class, "Snitch", 102);
		EntityList.addMapping(Cat.class, "Cat", 103);
		((CatItem) catItem).init();
	}
}
