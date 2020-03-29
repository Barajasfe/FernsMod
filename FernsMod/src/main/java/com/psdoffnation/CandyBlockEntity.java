package com.psdoffnation;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.text.Text;
import net.minecraft.world.BlockView;

public class CandyBlockEntity extends BlockEntity
{
	public CandyBlockEntity()
	{
		super(FernsMod.CANDY_BLOCK_ENTITY);
	}
	
	
	public BlockEntity createBlockEntity(BlockView blockView) 
	{
		System.out.println("CandyBlockEntity");
		return new CandyBlockEntity();
	}
	
	// Store the current value of the number
	private int number = 7;

	// Serialize the BlockEntity
	public CompoundTag toTag(CompoundTag tag) 
	{
		super.toTag(tag);
	 
	    // Save the current value of the number to the tag
	    tag.putInt("number", number);
	 
	    return tag;
	}
	   
	// Deserialize the BlockEntity
	public void fromTag(CompoundTag tag) 
	{
		super.fromTag(tag);
	    number = tag.getInt("number");
	}


	public void setCustomName(Text name) {
		
	}
	
	
}
