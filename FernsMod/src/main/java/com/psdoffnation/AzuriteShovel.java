package com.psdoffnation;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class AzuriteShovel extends ShovelItem
{
	public AzuriteShovel(ToolMaterial material)
	{
		super(material, 3, -0.00001f, new Item.Settings().group(ItemGroup.TOOLS));
		
	}
}
