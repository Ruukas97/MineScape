package dk.gamingtutsdk.minescape.core.handler;

import java.io.File;
import java.util.logging.Level;

import dk.gamingtutsdk.minescape.lib.BlockIDs;
import dk.gamingtutsdk.minescape.lib.BlockStrings;
import dk.gamingtutsdk.minescape.lib.ItemIDs;
import dk.gamingtutsdk.minescape.lib.ItemStrings;
import dk.gamingtutsdk.minescape.lib.Reference;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	
	public static void loadConfig(File file)
	{
		Configuration config = new Configuration(file);
		try {
			config.load();
			//ITEMS========================================================================================================================
			
			//MINING AND SMELTING----------------------------------------------------------------------------------------------------------
			
			//Ores
			ItemIDs.COPPER_ORE = config.getItem(ItemStrings.COPPER_ORE_TRANSNAME, ItemIDs.COPPER_ORE_DEFAULT).getInt();
			ItemIDs.TIN_ORE = config.getItem(ItemStrings.TIN_ORE_TRANSNAME, ItemIDs.TIN_ORE_DEFAULT).getInt();
			
			//Ingots
			ItemIDs.BRONZE_BAR = config.getItem(ItemStrings.BRONZE_BAR_TRANSNAME, ItemIDs.BRONZE_BAR_DEFAULT).getInt();
			
			//WEAPONS---------------------------------------------------------------------------------------------------------------------
			
			//Bronze Melee Weapons
			ItemIDs.BRONZE_DAGGER = config.getItem(ItemStrings.BRONZE_DAGGER_TRANSNAME, ItemIDs.BRONZE_DAGGER_DEFAULT).getInt();
			ItemIDs.BRONZE_HATCHET = config.getItem(ItemStrings.BRONZE_HATCHET_TRANSNAME, ItemIDs.BRONZE_HATCHET_DEFAULT).getInt();
			ItemIDs.BRONZE_MACE = config.getItem(ItemStrings.BRONZE_MACE_TRANSNAME, ItemIDs.BRONZE_MACE_DEFAULT).getInt();
			ItemIDs.BRONZE_SWORD = config.getItem(ItemStrings.BRONZE_SWORD_TRANSNAME, ItemIDs.BRONZE_SWORD_DEFAULT).getInt();
			ItemIDs.BRONZE_PICKAXE = config.getItem(ItemStrings.BRONZE_PICKAXE_TRANSNAME, ItemIDs.BRONZE_PICKAXE_DEFAULT).getInt();
			ItemIDs.BRONZE_SCIMITAR = config.getItem(ItemStrings.BRONZE_SCIMITAR_TRANSNAME, ItemIDs.BRONZE_SCIMITAR_DEFAULT).getInt();
			ItemIDs.BRONZE_LONGSWORD = config.getItem(ItemStrings.BRONZE_LONGSWORD_TRANSNAME, ItemIDs.BRONZE_LONGSWORD_DEFAULT).getInt();
			ItemIDs.BRONZE_WARHAMMER = config.getItem(ItemStrings.BRONZE_WARHAMMER_TRANSNAME, ItemIDs.BRONZE_WARHAMMER_DEFAULT).getInt();
			ItemIDs.BRONZE_BATTLEAXE = config.getItem(ItemStrings.BRONZE_BATTLEAXE_TRANSNAME, ItemIDs.BRONZE_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.BRONZE_CLAWS = config.getItem(ItemStrings.BRONZE_CLAWS_TRANSNAME, ItemIDs.BRONZE_CLAWS_DEFAULT).getInt();
			ItemIDs.BRONZE_TWOH = config.getItem(ItemStrings.BRONZE_TWOH_TRANSNAME, ItemIDs.BRONZE_TWOH_DEFAULT).getInt();
			
			//Iron Melee Weapons
			ItemIDs.IRON_DAGGER = config.getItem(ItemStrings.IRON_DAGGER_TRANSNAME, ItemIDs.IRON_DAGGER_DEFAULT).getInt();
			ItemIDs.IRON_HATCHET = config.getItem(ItemStrings.IRON_HATCHET_TRANSNAME, ItemIDs.IRON_HATCHET_DEFAULT).getInt();
			ItemIDs.IRON_MACE = config.getItem(ItemStrings.IRON_MACE_TRANSNAME, ItemIDs.IRON_MACE_DEFAULT).getInt();
			ItemIDs.IRON_SWORD = config.getItem(ItemStrings.IRON_SWORD_TRANSNAME, ItemIDs.IRON_SWORD_DEFAULT).getInt();
			ItemIDs.IRON_PICKAXE = config.getItem(ItemStrings.IRON_PICKAXE_TRANSNAME, ItemIDs.IRON_PICKAXE_DEFAULT).getInt();
			ItemIDs.IRON_SCIMITAR = config.getItem(ItemStrings.IRON_SCIMITAR_TRANSNAME, ItemIDs.IRON_SCIMITAR_DEFAULT).getInt();
			ItemIDs.IRON_LONGSWORD = config.getItem(ItemStrings.IRON_LONGSWORD_TRANSNAME, ItemIDs.IRON_LONGSWORD_DEFAULT).getInt();
			ItemIDs.IRON_WARHAMMER = config.getItem(ItemStrings.IRON_WARHAMMER_TRANSNAME, ItemIDs.IRON_WARHAMMER_DEFAULT).getInt();
			ItemIDs.IRON_BATTLEAXE = config.getItem(ItemStrings.IRON_BATTLEAXE_TRANSNAME, ItemIDs.IRON_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.IRON_CLAWS = config.getItem(ItemStrings.IRON_CLAWS_TRANSNAME, ItemIDs.IRON_CLAWS_DEFAULT).getInt();
			ItemIDs.IRON_TWOH = config.getItem(ItemStrings.IRON_TWOH_TRANSNAME, ItemIDs.IRON_TWOH_DEFAULT).getInt();
			
			//Steel Melee Weapons
			ItemIDs.STEEL_DAGGER = config.getItem(ItemStrings.STEEL_DAGGER_TRANSNAME, ItemIDs.STEEL_DAGGER_DEFAULT).getInt();
			ItemIDs.STEEL_HATCHET = config.getItem(ItemStrings.STEEL_HATCHET_TRANSNAME, ItemIDs.STEEL_HATCHET_DEFAULT).getInt();
			ItemIDs.STEEL_MACE = config.getItem(ItemStrings.STEEL_MACE_TRANSNAME, ItemIDs.STEEL_MACE_DEFAULT).getInt();
			ItemIDs.STEEL_SWORD = config.getItem(ItemStrings.STEEL_SWORD_TRANSNAME, ItemIDs.STEEL_SWORD_DEFAULT).getInt();
			ItemIDs.STEEL_PICKAXE = config.getItem(ItemStrings.STEEL_PICKAXE_TRANSNAME, ItemIDs.STEEL_PICKAXE_DEFAULT).getInt();
			ItemIDs.STEEL_SCIMITAR = config.getItem(ItemStrings.STEEL_SCIMITAR_TRANSNAME, ItemIDs.STEEL_SCIMITAR_DEFAULT).getInt();
			ItemIDs.STEEL_LONGSWORD = config.getItem(ItemStrings.STEEL_LONGSWORD_TRANSNAME, ItemIDs.STEEL_LONGSWORD_DEFAULT).getInt();
			ItemIDs.STEEL_WARHAMMER = config.getItem(ItemStrings.STEEL_WARHAMMER_TRANSNAME, ItemIDs.STEEL_WARHAMMER_DEFAULT).getInt();
			ItemIDs.STEEL_BATTLEAXE = config.getItem(ItemStrings.STEEL_BATTLEAXE_TRANSNAME, ItemIDs.STEEL_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.STEEL_CLAWS = config.getItem(ItemStrings.STEEL_CLAWS_TRANSNAME, ItemIDs.STEEL_CLAWS_DEFAULT).getInt();
			ItemIDs.STEEL_TWOH = config.getItem(ItemStrings.STEEL_TWOH_TRANSNAME, ItemIDs.STEEL_TWOH_DEFAULT).getInt();
			
			//Black Melee Weapons
			ItemIDs.BLACK_DAGGER = config.getItem(ItemStrings.BLACK_DAGGER_TRANSNAME, ItemIDs.BLACK_DAGGER_DEFAULT).getInt();
			ItemIDs.BLACK_HATCHET = config.getItem(ItemStrings.BLACK_HATCHET_TRANSNAME, ItemIDs.BLACK_HATCHET_DEFAULT).getInt();
			ItemIDs.BLACK_MACE = config.getItem(ItemStrings.BLACK_MACE_TRANSNAME, ItemIDs.BLACK_MACE_DEFAULT).getInt();
			ItemIDs.BLACK_SWORD = config.getItem(ItemStrings.BLACK_SWORD_TRANSNAME, ItemIDs.BLACK_SWORD_DEFAULT).getInt();
			ItemIDs.BLACK_SCIMITAR = config.getItem(ItemStrings.BLACK_SCIMITAR_TRANSNAME, ItemIDs.BLACK_SCIMITAR_DEFAULT).getInt();
			ItemIDs.BLACK_LONGSWORD = config.getItem(ItemStrings.BLACK_LONGSWORD_TRANSNAME, ItemIDs.BLACK_LONGSWORD_DEFAULT).getInt();
			ItemIDs.BLACK_WARHAMMER = config.getItem(ItemStrings.BLACK_WARHAMMER_TRANSNAME, ItemIDs.BLACK_WARHAMMER_DEFAULT).getInt();
			ItemIDs.BLACK_BATTLEAXE = config.getItem(ItemStrings.BLACK_BATTLEAXE_TRANSNAME, ItemIDs.BLACK_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.BLACK_CLAWS = config.getItem(ItemStrings.BLACK_CLAWS_TRANSNAME, ItemIDs.BLACK_CLAWS_DEFAULT).getInt();
			ItemIDs.BLACK_TWOH = config.getItem(ItemStrings.BLACK_TWOH_TRANSNAME, ItemIDs.BLACK_TWOH_DEFAULT).getInt();
			
			//White Melee Weapons
			ItemIDs.WHITE_DAGGER = config.getItem(ItemStrings.WHITE_DAGGER_TRANSNAME, ItemIDs.WHITE_DAGGER_DEFAULT).getInt();
			ItemIDs.WHITE_MACE = config.getItem(ItemStrings.WHITE_MACE_TRANSNAME, ItemIDs.WHITE_MACE_DEFAULT).getInt();
			ItemIDs.WHITE_SWORD = config.getItem(ItemStrings.WHITE_SWORD_TRANSNAME, ItemIDs.WHITE_SWORD_DEFAULT).getInt();
			ItemIDs.WHITE_SCIMITAR = config.getItem(ItemStrings.WHITE_SCIMITAR_TRANSNAME, ItemIDs.WHITE_SCIMITAR_DEFAULT).getInt();
			ItemIDs.WHITE_LONGSWORD = config.getItem(ItemStrings.WHITE_LONGSWORD_TRANSNAME, ItemIDs.WHITE_LONGSWORD_DEFAULT).getInt();
			ItemIDs.WHITE_WARHAMMER = config.getItem(ItemStrings.WHITE_WARHAMMER_TRANSNAME, ItemIDs.WHITE_WARHAMMER_DEFAULT).getInt();
			ItemIDs.WHITE_BATTLEAXE = config.getItem(ItemStrings.WHITE_BATTLEAXE_TRANSNAME, ItemIDs.WHITE_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.WHITE_CLAWS = config.getItem(ItemStrings.WHITE_CLAWS_TRANSNAME, ItemIDs.WHITE_CLAWS_DEFAULT).getInt();
			ItemIDs.WHITE_TWOH = config.getItem(ItemStrings.WHITE_TWOH_TRANSNAME, ItemIDs.WHITE_TWOH_DEFAULT).getInt();

			//Mithril Melee Weapons
			ItemIDs.MITHRIL_DAGGER = config.getItem(ItemStrings.MITHRIL_DAGGER_TRANSNAME, ItemIDs.MITHRIL_DAGGER_DEFAULT).getInt();
			ItemIDs.MITHRIL_HATCHET = config.getItem(ItemStrings.MITHRIL_HATCHET_TRANSNAME, ItemIDs.MITHRIL_HATCHET_DEFAULT).getInt();
			ItemIDs.MITHRIL_MACE = config.getItem(ItemStrings.MITHRIL_MACE_TRANSNAME, ItemIDs.MITHRIL_MACE_DEFAULT).getInt();
			ItemIDs.MITHRIL_SWORD = config.getItem(ItemStrings.MITHRIL_SWORD_TRANSNAME, ItemIDs.MITHRIL_SWORD_DEFAULT).getInt();
			ItemIDs.MITHRIL_PICKAXE = config.getItem(ItemStrings.MITHRIL_PICKAXE_TRANSNAME, ItemIDs.MITHRIL_PICKAXE_DEFAULT).getInt();
			ItemIDs.MITHRIL_SCIMITAR = config.getItem(ItemStrings.MITHRIL_SCIMITAR_TRANSNAME, ItemIDs.MITHRIL_SCIMITAR_DEFAULT).getInt();
			ItemIDs.MITHRIL_LONGSWORD = config.getItem(ItemStrings.MITHRIL_LONGSWORD_TRANSNAME, ItemIDs.MITHRIL_LONGSWORD_DEFAULT).getInt();
			ItemIDs.MITHRIL_WARHAMMER = config.getItem(ItemStrings.MITHRIL_WARHAMMER_TRANSNAME, ItemIDs.MITHRIL_WARHAMMER_DEFAULT).getInt();
			ItemIDs.MITHRIL_BATTLEAXE = config.getItem(ItemStrings.MITHRIL_BATTLEAXE_TRANSNAME, ItemIDs.MITHRIL_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.MITHRIL_CLAWS = config.getItem(ItemStrings.MITHRIL_CLAWS_TRANSNAME, ItemIDs.MITHRIL_CLAWS_DEFAULT).getInt();
			ItemIDs.MITHRIL_TWOH = config.getItem(ItemStrings.MITHRIL_TWOH_TRANSNAME, ItemIDs.MITHRIL_TWOH_DEFAULT).getInt();
			
			//Adamant Melee Weapons
			ItemIDs.ADAMANT_DAGGER = config.getItem(ItemStrings.ADAMANT_DAGGER_TRANSNAME, ItemIDs.ADAMANT_DAGGER_DEFAULT).getInt();
			ItemIDs.ADAMANT_HATCHET = config.getItem(ItemStrings.ADAMANT_HATCHET_TRANSNAME, ItemIDs.ADAMANT_HATCHET_DEFAULT).getInt();
			ItemIDs.ADAMANT_MACE = config.getItem(ItemStrings.ADAMANT_MACE_TRANSNAME, ItemIDs.ADAMANT_MACE_DEFAULT).getInt();
			ItemIDs.ADAMANT_SWORD = config.getItem(ItemStrings.ADAMANT_SWORD_TRANSNAME, ItemIDs.ADAMANT_SWORD_DEFAULT).getInt();
			ItemIDs.ADAMANT_PICKAXE = config.getItem(ItemStrings.ADAMANT_PICKAXE_TRANSNAME, ItemIDs.ADAMANT_PICKAXE_DEFAULT).getInt();
			ItemIDs.ADAMANT_SCIMITAR = config.getItem(ItemStrings.ADAMANT_SCIMITAR_TRANSNAME, ItemIDs.ADAMANT_SCIMITAR_DEFAULT).getInt();
			ItemIDs.ADAMANT_LONGSWORD = config.getItem(ItemStrings.ADAMANT_LONGSWORD_TRANSNAME, ItemIDs.ADAMANT_LONGSWORD_DEFAULT).getInt();
			ItemIDs.ADAMANT_WARHAMMER = config.getItem(ItemStrings.ADAMANT_WARHAMMER_TRANSNAME, ItemIDs.ADAMANT_WARHAMMER_DEFAULT).getInt();
			ItemIDs.ADAMANT_BATTLEAXE = config.getItem(ItemStrings.ADAMANT_BATTLEAXE_TRANSNAME, ItemIDs.ADAMANT_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.ADAMANT_CLAWS = config.getItem(ItemStrings.ADAMANT_CLAWS_TRANSNAME, ItemIDs.ADAMANT_CLAWS_DEFAULT).getInt();
			ItemIDs.ADAMANT_TWOH = config.getItem(ItemStrings.ADAMANT_TWOH_TRANSNAME, ItemIDs.ADAMANT_TWOH_DEFAULT).getInt();

			//Rune Melee Weapons
			ItemIDs.RUNE_DAGGER = config.getItem(ItemStrings.RUNE_DAGGER_TRANSNAME, ItemIDs.RUNE_DAGGER_DEFAULT).getInt();
			ItemIDs.RUNE_HATCHET = config.getItem(ItemStrings.RUNE_HATCHET_TRANSNAME, ItemIDs.RUNE_HATCHET_DEFAULT).getInt();
			ItemIDs.RUNE_MACE = config.getItem(ItemStrings.RUNE_MACE_TRANSNAME, ItemIDs.RUNE_MACE_DEFAULT).getInt();
			ItemIDs.RUNE_SWORD = config.getItem(ItemStrings.RUNE_SWORD_TRANSNAME, ItemIDs.RUNE_SWORD_DEFAULT).getInt();
			ItemIDs.RUNE_PICKAXE = config.getItem(ItemStrings.RUNE_PICKAXE_TRANSNAME, ItemIDs.RUNE_PICKAXE_DEFAULT).getInt();
			ItemIDs.RUNE_SCIMITAR = config.getItem(ItemStrings.RUNE_SCIMITAR_TRANSNAME, ItemIDs.RUNE_SCIMITAR_DEFAULT).getInt();
			ItemIDs.RUNE_LONGSWORD = config.getItem(ItemStrings.RUNE_LONGSWORD_TRANSNAME, ItemIDs.RUNE_LONGSWORD_DEFAULT).getInt();
			ItemIDs.RUNE_WARHAMMER = config.getItem(ItemStrings.RUNE_WARHAMMER_TRANSNAME, ItemIDs.RUNE_WARHAMMER_DEFAULT).getInt();
			ItemIDs.RUNE_BATTLEAXE = config.getItem(ItemStrings.RUNE_BATTLEAXE_TRANSNAME, ItemIDs.RUNE_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.RUNE_CLAWS = config.getItem(ItemStrings.RUNE_CLAWS_TRANSNAME, ItemIDs.RUNE_CLAWS_DEFAULT).getInt();
			ItemIDs.RUNE_TWOH = config.getItem(ItemStrings.RUNE_TWOH_TRANSNAME, ItemIDs.RUNE_TWOH_DEFAULT).getInt();

			//Dragon Melee Weapons
			ItemIDs.DRAGON_DAGGER = config.getItem(ItemStrings.DRAGON_DAGGER_TRANSNAME, ItemIDs.DRAGON_DAGGER_DEFAULT).getInt();
			ItemIDs.DRAGON_HATCHET = config.getItem(ItemStrings.DRAGON_HATCHET_TRANSNAME, ItemIDs.DRAGON_HATCHET_DEFAULT).getInt();
			ItemIDs.DRAGON_MACE = config.getItem(ItemStrings.DRAGON_MACE_TRANSNAME, ItemIDs.DRAGON_MACE_DEFAULT).getInt();
			ItemIDs.DRAGON_PICKAXE = config.getItem(ItemStrings.DRAGON_PICKAXE_TRANSNAME, ItemIDs.DRAGON_PICKAXE_DEFAULT).getInt();
			ItemIDs.DRAGON_SCIMITAR = config.getItem(ItemStrings.DRAGON_SCIMITAR_TRANSNAME, ItemIDs.DRAGON_SCIMITAR_DEFAULT).getInt();
			ItemIDs.DRAGON_LONGSWORD = config.getItem(ItemStrings.DRAGON_LONGSWORD_TRANSNAME, ItemIDs.DRAGON_LONGSWORD_DEFAULT).getInt();
			ItemIDs.DRAGON_BATTLEAXE = config.getItem(ItemStrings.DRAGON_BATTLEAXE_TRANSNAME, ItemIDs.DRAGON_BATTLEAXE_DEFAULT).getInt();
			ItemIDs.DRAGON_CLAWS = config.getItem(ItemStrings.DRAGON_CLAWS_TRANSNAME, ItemIDs.DRAGON_CLAWS_DEFAULT).getInt();
			ItemIDs.DRAGON_TWOH = config.getItem(ItemStrings.DRAGON_TWOH_TRANSNAME, ItemIDs.DRAGON_TWOH_DEFAULT).getInt();
			
			
			
			//BLOCKS========================================================================================================================
			
			//Ores
			BlockIDs.ORE_COPPER = config.getBlock(BlockStrings.ORE_COPPER_TRANSNAME, BlockIDs.ORE_COPPER_DEFAULT).getInt();
			BlockIDs.MINED_COPPER = config.getBlock(BlockStrings.MINED_COPPER_TRANSNAME, BlockIDs.MINED_COPPER_DEFAULT).getInt();
			BlockIDs.ORE_TIN = config.getBlock(BlockStrings.ORE_TIN_TRANSNAME, BlockIDs.ORE_TIN_DEFAULT).getInt();
			BlockIDs.MINED_TIN = config.getBlock(BlockStrings.MINED_TIN_TRANSNAME, BlockIDs.MINED_TIN_DEFAULT).getInt();
			BlockIDs.ORE_ADAMANT = config.getBlock(BlockStrings.ORE_ADAMANT_TRANSNAME, BlockIDs.ORE_ADAMANT_DEFAULT).getInt();
			
			//Decoration
			
			//Functional
			BlockIDs.FURNACE = config.getBlock(BlockStrings.FURNACE_TRANSNAME, BlockIDs.FURNACE_DEFAULT).getInt();
		
		} catch(Exception e) {
			LoggerHandler.log(Level.CONFIG, Reference.MOD_NAME + " has encountered a problem loading it's config!");
		} finally {
			config.save();
		}
	}
	
}
