package com.tinkeracademy.minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderOcelot;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CatRenderer extends RenderOcelot
{
	private static final ResourceLocation catTextures = new ResourceLocation(EntitiesMod.MODID, "textures/entity/cat.png");;
    
    public CatRenderer(RenderManager renderManager, ModelBase modelBase, float shadowSize) {
		super(renderManager, modelBase, shadowSize);
	}
    
    protected ResourceLocation getEntityTexture(EntityOcelot entity)
    {
        return catTextures;
    }

}