package com.tinkeracademy.minecraft;

import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.World;

public class Cat extends EntityOcelot {

	public Cat(World worldIn) {
		super(worldIn);
		this.tasks.taskEntries.clear();
	}
	
	@Override
	public void updateAITasks() {
		// Do Nothing for now
	}
	
}
