package com.tinkeracademy.minecraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = RecipesMod.MODID, version = RecipesMod.VERSION, name = RecipesMod.NAME)
public class RecipesMod
{
    public static final String MODID = "recipes_mod";
    public static final String VERSION = "1.0";
    public static final String NAME = "recipes_mod";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	GameRegistry.addShapedRecipe(new ItemStack(Items.apple), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.leaves});    	
    	// Paurush Recipe #1 1 Diamond + 8 Gold = 1 Netherstar
    	GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star, 1), 
    			new Object[]{ "GGG", "GDG", "GGG", 'D', Items.diamond, 'G', Items.gold_ingot });    	    	
    	GameRegistry.addShapedRecipe(new ItemStack(Items.arrow, 2), new Object[]{"XY", "Z ", 'X', Items.flint, 'Y', Blocks.leaves, 'Z', Items.stick});    	
    	GameRegistry.addShapedRecipe(new ItemStack(Items.gold_ingot), new Object[] { "   ", " D ", "   ", 'D', Blocks.dirt  });    	
    	
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1, 10), Blocks.wool, new ItemStack(Items.dye, 1, 5));
    	
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 64), Blocks.dirt);
    	
    	// Animesh Recipe #1  1 milk + 1 egg = 1 cookie 
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.cookie), Items.milk_bucket, Items.egg);
    	
    	// Catherine's Recipe #1 1 lime dye + 8 iron ingots = 1 music disc
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.record_cat), 
    			new ItemStack(Items.iron_ingot, 8), new ItemStack(Items.dye, 1, 10));
    	
    	
    	GameRegistry.addSmelting(Blocks.stone, new ItemStack(Blocks.stonebrick, 1), 2);
    	GameRegistry.addSmelting(Blocks.dirt, new ItemStack(Items.gold_ingot, 1), 2);
    }
}