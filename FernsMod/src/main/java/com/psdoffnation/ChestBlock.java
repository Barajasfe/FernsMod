package com.psdoffnation;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;

public class ChestBlock extends Block implements BlockEntityProvider
{

	public ChestBlock(Settings settings) {
		super(settings);
		
	}
	
	@Override
	public BlockEntity createBlockEntity(BlockView view)
	{
		return null;
	}
}
