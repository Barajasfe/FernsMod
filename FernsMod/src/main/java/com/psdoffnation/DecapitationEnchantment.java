package com.psdoffnation;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;





public class DecapitationEnchantment extends Enchantment
{

	public DecapitationEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
		super(weight, type, slotTypes);
				
		/*UseBlockCallback.EVENT.register(((player, world,hand, hitResult) -> {
		
		if(player.experienceLevel < 2 && !player.getGameProfile().getProperties().containsValue(GameMode.SPECTATOR)) {//!player.getGameProfile().getProperties().containsValue(GameMode.SPECTATOR)) {
            System.out.println("Success");
			//player.world.spawnEntity(new ExperienceOrbEntity(world, player.getX(), player.getY(), player.getZ(), 50000));
			return ActionResult.SUCCESS;
        } else {
            player.world.spawnEntity(new ExperienceOrbEntity(world, player.getX(), player.getY(), player.getZ(), 50000));
            System.out.println("pass");
            return ActionResult.PASS;
        }
		
        }));*/
	}
	
	@Override
	public int getMinimumPower(int int_1)
	{
	    return 10;
	}
	
	@Override
	public int getMaximumLevel()
	{
	    return 5;
	}
	
	
	public void onTargetDamaged(LivingEntity user, Entity target, int level)
	{
 
	   super.onTargetDamaged(user, target, level);
	    
	    	//System.out.println("Invalid Mob");
	}
	

}
