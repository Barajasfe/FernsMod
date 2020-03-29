package com.psdoffnation;


import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialAzurite implements ToolMaterial{

	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return 2015;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		// TODO Auto-generated method stub
		return 15.0f;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return 4.0f;
	}

	@Override
	public int getMiningLevel() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.ofItems(FernsMod.AZURITE_INGOT);
	}

	
}
