package com.psdoffnation;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;


public class AzuritePickaxeBase extends PickaxeItem{

	public AzuritePickaxeBase(ToolMaterial material) {
		super(material, 3, -1.0f, new Item.Settings().group(ItemGroup.TOOLS) );
		
		System.out.println("PickAxeBase");
		
	}
	
	


}
