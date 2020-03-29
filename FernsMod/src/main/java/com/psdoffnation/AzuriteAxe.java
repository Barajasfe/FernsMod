package com.psdoffnation;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class AzuriteAxe extends AxeItem
{
	public AzuriteAxe(ToolMaterial material)
	{
		super(material, 3f, -0.01f, new Item.Settings().group(ItemGroup.TOOLS));
		
	}
}
