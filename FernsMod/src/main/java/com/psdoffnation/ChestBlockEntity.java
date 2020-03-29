package com.psdoffnation;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.collection.DefaultedList;

public class ChestBlockEntity extends BlockEntity implements ChestImplementedInventory
{
	DefaultedList<ItemStack> items = DefaultedList.ofSize(54, ItemStack.EMPTY);
	
	public ChestBlockEntity()
	{
		super(FernsMod.CHEST_BLOCK_ENTITY);
		
	}

	@Override
	public DefaultedList<ItemStack> getItems() {
		
		return items;
	}
	@Override
	public boolean canPlayerUseInv(PlayerEntity player)
	{
		return pos.isWithinDistance(player.getBlockPos(), 4.5);
	}
	
	@Override
	public void fromTag(CompoundTag tag)
	{
		super.fromTag(tag);
		Inventories.fromTag(tag, items);
	}
	
	@Override
	public CompoundTag toTag(CompoundTag tag)
	{
		Inventories.toTag(tag, items);
		
		return super.toTag(tag);
	}
	
}
