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
	public static Block oreCopper;
	public static Block minedCopper;
	public static Block oreTin;
	public static Block minedTin;
	public static Block oreIron;
	public static Block minedIron;
	public static Block oreSilver;
	public static Block minedSilver;
	public static Block oreCoal;
	public static Block minedCoal;
	public static Block oreGold;
	public static Block minedGold;
	public static Block oreMithril;
	public static Block minedMithril;
	public static Block oreAdamant;
	public static Block minedAdamant;
	public static Block oreRune;
	public static Block minedRune;

	//Decoration
	
	//Skill Blocks
	public static Block coursePlank;

	//Functional
	public static Block furnace;
	public static Block anvil;
	
	
	@SuppressWarnings("deprecation")
	public static void init()
	{
		//Ores
		oreCopper = new MineScapeOre(BlockIDs.ORE_COPPER, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_COPPER_NAME).setHardness(2.0F).setResistance(5.0F);
		minedCopper = new MineScapeMinedOre(BlockIDs.MINED_COPPER, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_COPPER_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreTin = new MineScapeOre(BlockIDs.ORE_TIN, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_TIN_NAME).setHardness(1.5F).setResistance(5.0F);
		minedTin = new MineScapeMinedOre(BlockIDs.MINED_TIN, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_TIN_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreIron = new MineScapeOre(BlockIDs.ORE_IRON, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_IRON_NAME).setHardness(3.0F).setResistance(5.0F);
		minedIron = new MineScapeMinedOre(BlockIDs.MINED_IRON, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_IRON_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreSilver = new MineScapeOre(BlockIDs.ORE_SILVER, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_SILVER_NAME).setHardness(3.0F).setResistance(5.0F);
		minedSilver = new MineScapeMinedOre(BlockIDs.MINED_SILVER, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_SILVER_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreCoal = new MineScapeOre(BlockIDs.ORE_COAL, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_COAL_NAME).setHardness(3.0F).setResistance(5.0F);
		minedCoal = new MineScapeMinedOre(BlockIDs.MINED_COAL, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_COAL_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreGold = new MineScapeOre(BlockIDs.ORE_GOLD, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_GOLD_NAME).setHardness(3.0F).setResistance(5.0F);
		minedGold = new MineScapeMinedOre(BlockIDs.MINED_GOLD, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_GOLD_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreMithril = new MineScapeOre(BlockIDs.ORE_MITHRIL, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_MITHRIL_NAME).setHardness(3.0F).setResistance(5.0F);
		minedMithril = new MineScapeMinedOre(BlockIDs.MINED_MITHRIL, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_MITHRIL_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreAdamant = new MineScapeOre(BlockIDs.ORE_ADAMANT, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_ADAMANT_NAME).setHardness(3.0F).setResistance(5.0F);
		minedAdamant = new MineScapeMinedOre(BlockIDs.MINED_ADAMANT, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_ADAMANT_NAME).setBlockUnbreakable().setResistance(5.0F);
		oreRune = new MineScapeOre(BlockIDs.ORE_RUNE, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.ORE_RUNE_NAME).setHardness(3.0F).setResistance(5.0F);
		minedRune = new MineScapeMinedOre(BlockIDs.MINED_RUNE, Material.rock).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(BlockStrings.MINED_RUNE_NAME).setBlockUnbreakable().setResistance(5.0F);

		//Decoration TODO
		
		//Skill Blocks
		coursePlank = new MineScapeCourse(BlockIDs.COURSE_PLANK, Material.wood).setHardness(3.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(BlockStrings.COURSE_PLANK_NAME);
		
		//Functional
		furnace = new MineScapeFurnace(BlockIDs.FURNACE, Material.rock).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setLightValue(1F).setUnlocalizedName(BlockStrings.FURNACE_NAME);
		anvil = new MineScapeAnvil(BlockIDs.ANVIL, Material.anvil).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName(BlockStrings.ANVIL_NAME);

		
		//REGISTER ORES=================================================================================================================================================================
		
		//Ores
		GameRegistry.registerBlock(oreCopper);
		GameRegistry.registerBlock(minedCopper);
		GameRegistry.registerBlock(oreTin);
		GameRegistry.registerBlock(minedTin);
		GameRegistry.registerBlock(oreIron);
		GameRegistry.registerBlock(minedIron);
		GameRegistry.registerBlock(oreSilver);
		GameRegistry.registerBlock(minedSilver);
		GameRegistry.registerBlock(oreCoal);
		GameRegistry.registerBlock(minedCoal);
		GameRegistry.registerBlock(oreGold);
		GameRegistry.registerBlock(minedGold);
		GameRegistry.registerBlock(oreMithril);
		GameRegistry.registerBlock(minedMithril);
		GameRegistry.registerBlock(oreAdamant);
		GameRegistry.registerBlock(minedAdamant);
		GameRegistry.registerBlock(oreRune);
		GameRegistry.registerBlock(minedRune);
		
		//Decoration
		
		//Skill BLocks
		GameRegistry.registerBlock(coursePlank);
		
		//Functional
		GameRegistry.registerBlock(furnace);
		GameRegistry.registerBlock(anvil);

		//Register ores
		OreDictionary.registerOre("oreCopper", oreCopper);
		OreDictionary.registerOre("oreTin", oreTin);
		OreDictionary.registerOre("oreIron", oreIron);
		OreDictionary.registerOre("oreSilver", oreSilver);
		OreDictionary.registerOre("oreCoal", oreCoal);
		OreDictionary.registerOre("oreGold", oreGold);
		OreDictionary.registerOre("oreMithril", oreMithril);
		OreDictionary.registerOre("oreAdamant", oreAdamant);
		OreDictionary.registerOre("oreRune", oreRune);

		//NAMES==========================================================================================================================================
	
		//Ores
		LanguageRegistry.addName(oreCopper, BlockStrings.ORE_COPPER_TRANSNAME);
		LanguageRegistry.addName(minedCopper, BlockStrings.MINED_COPPER_TRANSNAME);
		LanguageRegistry.addName(oreTin, BlockStrings.ORE_TIN_TRANSNAME);
		LanguageRegistry.addName(minedTin, BlockStrings.MINED_TIN_TRANSNAME);
		LanguageRegistry.addName(oreIron, BlockStrings.ORE_IRON_TRANSNAME);
		LanguageRegistry.addName(minedIron, BlockStrings.MINED_IRON_TRANSNAME);
		LanguageRegistry.addName(oreSilver, BlockStrings.ORE_SILVER_TRANSNAME);
		LanguageRegistry.addName(minedSilver, BlockStrings.MINED_SILVER_TRANSNAME);
		LanguageRegistry.addName(oreCoal, BlockStrings.ORE_COAL_TRANSNAME);
		LanguageRegistry.addName(minedCoal, BlockStrings.MINED_COAL_TRANSNAME);
		LanguageRegistry.addName(oreGold, BlockStrings.ORE_GOLD_TRANSNAME);
		LanguageRegistry.addName(minedGold, BlockStrings.MINED_GOLD_TRANSNAME);
		LanguageRegistry.addName(oreMithril, BlockStrings.ORE_MITHRIL_TRANSNAME);
		LanguageRegistry.addName(minedMithril, BlockStrings.MINED_MITHRIL_TRANSNAME);
		LanguageRegistry.addName(oreAdamant, BlockStrings.ORE_ADAMANT_TRANSNAME);
		LanguageRegistry.addName(minedAdamant, BlockStrings.MINED_ADAMANT_TRANSNAME);
		LanguageRegistry.addName(oreRune, BlockStrings.ORE_RUNE_TRANSNAME);
		LanguageRegistry.addName(minedRune, BlockStrings.MINED_RUNE_TRANSNAME);

		
		//Decoration
		
		//SKill Blocks
		LanguageRegistry.addName(coursePlank, BlockStrings.COURSE_PLANK_TRANSNAME);
		
		//Functional
		LanguageRegistry.addName(furnace, BlockStrings.FURNACE_TRANSNAME);
		LanguageRegistry.addName(anvil, BlockStrings.ANVIL_TRANSNAME);		
	}
}
