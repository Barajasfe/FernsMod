package com.psdoffnation;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class AzuriteSword extends Item
{
	public AzuriteSword(Settings settings)
	{
		super(settings);
		
	}
	
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand)
	{
		playerEntity.playSound(SoundEvents.BLOCK_ANVIL_LAND, 1.0f,1.0f);
		System.out.println("Wack");
		return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
	}
	
}
