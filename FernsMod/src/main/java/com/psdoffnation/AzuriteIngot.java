package com.psdoffnation;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class AzuriteIngot extends Item
{
	public AzuriteIngot(Settings settings)
	{
		super(settings);
		
	}

	
	
	
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand)
	{
		playerEntity.playSound(SoundEvents.ENTITY_FIREWORK_ROCKET_LAUNCH, 1.0f,1.0f);
		System.out.println("Wack");
		return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
	}
	
}
