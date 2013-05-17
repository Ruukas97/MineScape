package dk.gamingtutsdk.minescape.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;


import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.item.Items;
import dk.gamingtutsdk.minescape.lib.BlockIDs;
import dk.gamingtutsdk.minescape.lib.BlockStrings;


public class Blocks 
{
	//Ores
	public static Block oreMined;
	public static Block oreCopper;
	public static Block oreTin;
	public static Block oreAdamant;
		
	//Decoration
	
	
	//Functional
	public static Block furnace;
	
	
	@SuppressWarnings("deprecation")
	public static void init()
	{
		//Ores
		oreMined = new MineScapeOre(BlockIDs.ORE_MINED, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_MINED_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreCopper = new MineScapeOre(BlockIDs.ORE_COPPER, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_COPPER_NAME).setHardness(2.0F).setResistance(5.0F);
		oreTin = new MineScapeOre(BlockIDs.ORE_TIN, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_TIN_NAME).setHardness(1.5F).setResistance(5.0F);
		oreAdamant = new MineScapeOre(BlockIDs.ORE_ADAMANT, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_ADAMANT_NAME).setHardness(3.0F).setResistance(5.0F);

		//Decoration TODO
		
		
		//Functional
		furnace = new MineScapeFurnace(BlockIDs.FURNACE, Material.rock).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setLightValue(1F).setUnlocalizedName(BlockStrings.FURNACE_NAME);
		
		//Ores
		GameRegistry.registerBlock(oreMined);
		GameRegistry.registerBlock(oreCopper);
		GameRegistry.registerBlock(oreTin);
		GameRegistry.registerBlock(oreAdamant);
		
		//Decoration
		
		//Functional
		GameRegistry.registerBlock(furnace);
		
		//Register ores
		OreDictionary.registerOre("oreMined", oreMined);
		OreDictionary.registerOre("oreCopper", oreCopper);
		OreDictionary.registerOre("oreTin", oreTin);
		OreDictionary.registerOre("oreAdamant", oreAdamant);

		//NAMES==========================================================================================================================================
	
		//Ores
		LanguageRegistry.addName(oreMined, BlockStrings.ORE_MINED_TRANSNAME);
		LanguageRegistry.addName(oreCopper, BlockStrings.ORE_COPPER_TRANSNAME);
		LanguageRegistry.addName(oreTin, BlockStrings.ORE_TIN_TRANSNAME);
		LanguageRegistry.addName(oreAdamant, BlockStrings.ORE_ADAMANT_TRANSNAME);

		
		//Decoration
		
		//Functional
		LanguageRegistry.addName(furnace, BlockStrings.FURNACE_TRANSNAME);

		
		MinecraftForge.setBlockHarvestLevel(oreAdamant, "pickaxe", 3);
	}
}
