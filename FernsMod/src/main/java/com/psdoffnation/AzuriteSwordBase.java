package com.psdoffnation;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class AzuriteSwordBase extends SwordItem{

	public AzuriteSwordBase(ToolMaterial material) {
		super(material, 1, -2.0f, new Item.Settings().group(ItemGroup.COMBAT));
		
	}
	

}
