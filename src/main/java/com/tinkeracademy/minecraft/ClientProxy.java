package com.tinkeracademy.minecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRendering() {
		RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
		RenderingRegistry.registerEntityRenderingHandler(Snitch.class, new SnitchRenderer(renderManager));
		RenderingRegistry.registerEntityRenderingHandler(Cat.class, 
				new CatRenderer(renderManager,new CatModel(),1.0f));
	}
}
