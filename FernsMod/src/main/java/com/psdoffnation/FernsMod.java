package com.psdoffnation;




import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;



public class FernsMod implements ModInitializer {
	
	public static final Item AXEHEAD_ITEM = new Item(new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item PICK_HEAD = new Item(new Item.Settings().group(ItemGroup.TOOLS));
	public static final AzuriteIngot AZURITE_INGOT = new AzuriteIngot(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final AzuriteBlock AZURITE_ORE  = new AzuriteBlock();
	public static final RockCandy ROCKCANDY = new RockCandy(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(6f).snack().build()));
	public static final RockCandyBlock CANDY_BLOCK = new RockCandyBlock();
	public static BlockEntityType<CandyBlockEntity> CANDY_BLOCK_ENTITY;
	//private static DecapitationEnchantment lfol;
	public static BlockEntityType<ChestBlockEntity> CHEST_BLOCK_ENTITY;
	public static final Block CHEST_BLOCK = new ChestBlock(FabricBlockSettings.of(Material.METAL).build());

	@Override
	public void onInitialize() {
		
		CHEST_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fernsmod:demo", BlockEntityType.Builder.create(ChestBlockEntity::new, CHEST_BLOCK).build(null));
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "axe_head"), AXEHEAD_ITEM);
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "pick_head"), PICK_HEAD);
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "sword"), new AzuriteSwordBase(new ToolMaterialAzurite()));
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "azurite_ingot"), AZURITE_INGOT);
		Registry.register(Registry.BLOCK, new Identifier("fernsmod", "azurite_ore"), AZURITE_ORE);
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "azurite_ore"), new BlockItem(AZURITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))); 
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "rockcandy"), ROCKCANDY);
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "azurite_pickaxe"), new AzuritePickaxeBase(new ToolMaterialAzurite()));
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "azuriteaxe"), new AzuriteAxe(new ToolMaterialAzurite()));
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "azurite_shovel"), new AzuriteShovel(new ToolMaterialAzurite()));
		Registry.register(Registry.BLOCK, new Identifier("fernsmod", "rockcandy_block"), CANDY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("fernsmod", "rockcandy_block"), new BlockItem(CANDY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))); 
		

		//Enchantments Registry
		Registry.register(Registry.ENCHANTMENT, new Identifier("fernsmod", "decapitation"), new DecapitationEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND} ));

		
		
		//Biome Registry
		Registry.BIOME.forEach(this::handleBiome);
		
		//BlockEntity
		CANDY_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fernsmod:candyblock", BlockEntityType.Builder.create(CandyBlockEntity::new, CANDY_BLOCK).build(null));

		
		//HandleRegistry
		RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiome(biome));

		/*SheepShearCallback.EVENT.register((player,sheep) -> 
		{
			sheep.setSheared(true);
			sheep.animateDamage();
			ItemStack stack = new ItemStack(Items.DIAMOND);
			ItemEntity itemEntity = new ItemEntity(player.world, sheep.getX(), sheep.getY(), sheep.getZ(), stack);
			ItemStack xp = new ItemStack(Items.EXPERIENCE_BOTTLE);
			ItemEntity xpEntity = new ItemEntity(player.world, sheep.getX(), sheep.getY(), sheep.getZ(), xp);
			
			player.world.spawnEntity(itemEntity);
			player.world.spawnEntity(xpEntity);
			
			System.out.println("SHEERED");
			
			return ActionResult.FAIL;
		});*/
		
	}
		
		private void handleBiome(Biome biome) {
			if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) 
			{
				biome.addFeature(
		        	    GenerationStep.Feature.UNDERGROUND_ORES,
		        	    Feature.ORE.configure(
					new OreFeatureConfig(
					    OreFeatureConfig.Target.NATURAL_STONE,
					    AZURITE_ORE.getDefaultState(),
					    5 //Ore vein size
				   )).createDecoratedFeature(
					Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
					    9, //Number of veins per chunk
					    0, //Bottom Offset
					    0, //Min y level
					    48 //Max y level
				))));
			
				
				
			}
		
		
	}
}
