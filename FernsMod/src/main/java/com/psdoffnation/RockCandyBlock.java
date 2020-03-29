package com.psdoffnation;


import net.minecraft.block.Block;

import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;


public class RockCandyBlock extends Block
{


	public RockCandyBlock() 
	{
		super(Block.Settings.copy(Blocks.NETHERITE_BLOCK));
		System.out.println("Super!!!" + "\n");
		
		
	}
	
	
	public BlockEntity createBlockEntity(BlockView blockView) 
	{
		System.out.println("RockCandyBlock");
	   return new CandyBlockEntity();
	}
	
}
