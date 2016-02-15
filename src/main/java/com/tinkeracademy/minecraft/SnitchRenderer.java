package com.tinkeracademy.minecraft;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SnitchRenderer extends RenderLiving
{
    private static final ResourceLocation batTextures = new ResourceLocation(EntitiesMod.MODID, "textures/entity/snitch.png");;
    private static final String __OBFID = "CL_00000979";

    public SnitchRenderer(RenderManager p_i46192_1_)
    {
        super(p_i46192_1_, new SnitchModel(), 0.25F);
    }

    protected ResourceLocation getEntityTexture(Snitch p_180566_1_)
    {
        return batTextures;
    }

    protected void preRenderCallback(Snitch p_180567_1_, float p_180567_2_)
    {
        GlStateManager.scale(0.35F, 0.35F, 0.35F);
    }

    protected void rotateCorpse(Snitch p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_)
    {
        GlStateManager.translate(0.0F, -0.1F, 0.0F);

        super.rotateCorpse(p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
        this.preRenderCallback((Snitch)p_77041_1_, p_77041_2_);
    }

    protected void rotateCorpse(EntityLivingBase p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_)
    {
        this.rotateCorpse((Snitch)p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((Snitch)entity);
    }
}