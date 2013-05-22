package dk.gamingtutsdk.minescape.lib;

public class ItemIDs
{
	//ITEM IDs==========================================================================================================================
	public static int ID_DEFAULT = 5000;
	
	//MINING AND SMELTING---------------------------------------------------------------------------------------------------------------
	
	//Ores
	public static int ORES_DEFAULT = ID_DEFAULT;
	public static int COPPER_ORE_DEFAULT = ORES_DEFAULT;
	public static int TIN_ORE_DEFAULT = ORES_DEFAULT + 1;
	public static int IRON_ORE_DEFAULT = ORES_DEFAULT + 2;
	public static int SILVER_ORE_DEFAULT = ORES_DEFAULT + 4;
	public static int COAL_ORE_DEFAULT = ORES_DEFAULT + 4;
	public static int GOLD_ORE_DEFAULT = ORES_DEFAULT + 5;
	public static int MITHRIL_ORE_DEFAULT = ORES_DEFAULT + 6;
	public static int ADAMANT_ORE_DEFAULT = ORES_DEFAULT + 7;
	public static int RUNE_ORE_DEFAULT = ORES_DEFAULT + 8;

	//Bars
	public static int BARS_DEFAULT = RUNE_ORE_DEFAULT + 1;
	public static int BRONZE_BAR_DEFAULT = BARS_DEFAULT;
	public static int IRON_BAR_DEFAULT = BARS_DEFAULT + 1;
	public static int SILVER_BAR_DEFAULT = BARS_DEFAULT + 2;
	public static int STEEL_BAR_DEFAULT = BARS_DEFAULT + 3;
	public static int GOLD_BAR_DEFAULT = BARS_DEFAULT + 4;
	public static int MITHRIL_BAR_DEFAULT = BARS_DEFAULT + 5;
	public static int ADAMANT_BAR_DEFAULT = BARS_DEFAULT + 6;
	public static int RUNE_BAR_DEFAULT = BARS_DEFAULT + 7;

	
	//WEAPONS----------------------------------------------------------------------------------------------------------------------------
	
	//Bronze Melee Weapons
	public static final int BRONZE_DEFAULT = RUNE_BAR_DEFAULT + 1;
	public static final int BRONZE_DAGGER_DEFAULT = BRONZE_DEFAULT + 1;
	public static final int BRONZE_HATCHET_DEFAULT = BRONZE_DEFAULT + 2;
	public static final int BRONZE_MACE_DEFAULT = BRONZE_DEFAULT + 3;
	public static final int BRONZE_SWORD_DEFAULT = BRONZE_DEFAULT + 4;
	public static final int BRONZE_PICKAXE_DEFAULT = BRONZE_DEFAULT + 5;
	public static final int BRONZE_SCIMITAR_DEFAULT = BRONZE_DEFAULT + 6;
	public static final int BRONZE_LONGSWORD_DEFAULT = BRONZE_DEFAULT + 7;
	public static final int BRONZE_WARHAMMER_DEFAULT = BRONZE_DEFAULT + 8;
	public static final int BRONZE_BATTLEAXE_DEFAULT = BRONZE_DEFAULT + 9;
	public static final int BRONZE_CLAWS_DEFAULT = BRONZE_DEFAULT + 10;
	public static final int BRONZE_TWOH_DEFAULT = BRONZE_DEFAULT + 11;
	
	//Iron Melee Weapons
	public static final int IRON_DEFAULT = BRONZE_TWOH_DEFAULT + 1;
	public static final int IRON_DAGGER_DEFAULT = IRON_DEFAULT + 1;
	public static final int IRON_HATCHET_DEFAULT = IRON_DEFAULT + 2;
	public static final int IRON_MACE_DEFAULT = IRON_DEFAULT + 3;
	public static final int IRON_SWORD_DEFAULT = IRON_DEFAULT + 4;
	public static final int IRON_PICKAXE_DEFAULT = IRON_DEFAULT + 5;
	public static final int IRON_SCIMITAR_DEFAULT = IRON_DEFAULT + 6;
	public static final int IRON_LONGSWORD_DEFAULT = IRON_DEFAULT + 7;
	public static final int IRON_WARHAMMER_DEFAULT = IRON_DEFAULT + 8;
	public static final int IRON_BATTLEAXE_DEFAULT = IRON_DEFAULT + 9;
	public static final int IRON_CLAWS_DEFAULT = IRON_DEFAULT + 10;
	public static final int IRON_TWOH_DEFAULT = IRON_DEFAULT + 11;
	
	//Steel Melee Weapons
	public static final int STEEL_DEFAULT = IRON_TWOH_DEFAULT + 1;
	public static final int STEEL_DAGGER_DEFAULT = STEEL_DEFAULT + 1;
	public static final int STEEL_HATCHET_DEFAULT = STEEL_DEFAULT + 2;
	public static final int STEEL_MACE_DEFAULT = STEEL_DEFAULT + 3;
	public static final int STEEL_SWORD_DEFAULT = STEEL_DEFAULT + 4;
	public static final int STEEL_PICKAXE_DEFAULT = STEEL_DEFAULT + 5;
	public static final int STEEL_SCIMITAR_DEFAULT = STEEL_DEFAULT + 6;
	public static final int STEEL_LONGSWORD_DEFAULT = STEEL_DEFAULT + 7;
	public static final int STEEL_WARHAMMER_DEFAULT = STEEL_DEFAULT + 8;
	public static final int STEEL_BATTLEAXE_DEFAULT = STEEL_DEFAULT + 9;
	public static final int STEEL_CLAWS_DEFAULT = STEEL_DEFAULT + 10;
	public static final int STEEL_TWOH_DEFAULT = STEEL_DEFAULT + 11;
	
	//Black Melee Weapons
	public static final int BLACK_DEFAULT = STEEL_TWOH_DEFAULT + 1;
	public static final int BLACK_DAGGER_DEFAULT = BLACK_DEFAULT + 1;
	public static final int BLACK_HATCHET_DEFAULT = BLACK_DEFAULT + 2;
	public static final int BLACK_MACE_DEFAULT = BLACK_DEFAULT + 3;
	public static final int BLACK_SWORD_DEFAULT = BLACK_DEFAULT + 4;
	public static final int BLACK_SCIMITAR_DEFAULT = BLACK_DEFAULT + 5;
	public static final int BLACK_LONGSWORD_DEFAULT = BLACK_DEFAULT + 6;
	public static final int BLACK_WARHAMMER_DEFAULT = BLACK_DEFAULT + 7;
	public static final int BLACK_BATTLEAXE_DEFAULT = BLACK_DEFAULT + 8;
	public static final int BLACK_CLAWS_DEFAULT = BLACK_DEFAULT + 9;
	public static final int BLACK_TWOH_DEFAULT = BLACK_DEFAULT + 10;
	
	//White Melee Weapons
	public static final int WHITE_DEFAULT = BLACK_TWOH_DEFAULT + 1;
	public static final int WHITE_DAGGER_DEFAULT = WHITE_DEFAULT + 1;
	public static final int WHITE_MACE_DEFAULT = WHITE_DEFAULT + 2;
	public static final int WHITE_SWORD_DEFAULT = WHITE_DEFAULT + 3;
	public static final int WHITE_SCIMITAR_DEFAULT = WHITE_DEFAULT + 4;
	public static final int WHITE_LONGSWORD_DEFAULT = WHITE_DEFAULT + 5;
	public static final int WHITE_WARHAMMER_DEFAULT = WHITE_DEFAULT + 6;
	public static final int WHITE_BATTLEAXE_DEFAULT = WHITE_DEFAULT + 7;
	public static final int WHITE_CLAWS_DEFAULT = WHITE_DEFAULT + 8;
	public static final int WHITE_TWOH_DEFAULT = WHITE_DEFAULT + 9;
	
	//Mithril Melee Weapons
	public static final int MITHRIL_DEFAULT = WHITE_TWOH_DEFAULT + 1;
	public static final int MITHRIL_DAGGER_DEFAULT = MITHRIL_DEFAULT + 1;
	public static final int MITHRIL_HATCHET_DEFAULT = MITHRIL_DEFAULT + 2;
	public static final int MITHRIL_MACE_DEFAULT = MITHRIL_DEFAULT + 3;
	public static final int MITHRIL_SWORD_DEFAULT = MITHRIL_DEFAULT + 4;
	public static final int MITHRIL_PICKAXE_DEFAULT = MITHRIL_DEFAULT + 5;
	public static final int MITHRIL_SCIMITAR_DEFAULT = MITHRIL_DEFAULT + 6;
	public static final int MITHRIL_LONGSWORD_DEFAULT = MITHRIL_DEFAULT + 7;
	public static final int MITHRIL_WARHAMMER_DEFAULT = MITHRIL_DEFAULT + 8;
	public static final int MITHRIL_BATTLEAXE_DEFAULT = MITHRIL_DEFAULT + 9;
	public static final int MITHRIL_CLAWS_DEFAULT = MITHRIL_DEFAULT + 10;
	public static final int MITHRIL_TWOH_DEFAULT = MITHRIL_DEFAULT + 11;
	
	//Adamant Melee Weapons
	public static final int ADAMANT_DEFAULT = MITHRIL_TWOH_DEFAULT + 1;
	public static final int ADAMANT_DAGGER_DEFAULT = ADAMANT_DEFAULT + 1;
	public static final int ADAMANT_HATCHET_DEFAULT = ADAMANT_DEFAULT + 2;
	public static final int ADAMANT_MACE_DEFAULT = ADAMANT_DEFAULT + 3;
	public static final int ADAMANT_SWORD_DEFAULT = ADAMANT_DEFAULT + 4;
	public static final int ADAMANT_PICKAXE_DEFAULT = ADAMANT_DEFAULT + 5;
	public static final int ADAMANT_SCIMITAR_DEFAULT = ADAMANT_DEFAULT + 6;
	public static final int ADAMANT_LONGSWORD_DEFAULT = ADAMANT_DEFAULT + 7;
	public static final int ADAMANT_WARHAMMER_DEFAULT = ADAMANT_DEFAULT + 8;
	public static final int ADAMANT_BATTLEAXE_DEFAULT = ADAMANT_DEFAULT + 9;
	public static final int ADAMANT_CLAWS_DEFAULT = ADAMANT_DEFAULT + 10;
	public static final int ADAMANT_TWOH_DEFAULT = ADAMANT_DEFAULT + 11;
	
	//Rune Melee Weapons
	public static final int RUNE_DEFAULT = ADAMANT_TWOH_DEFAULT + 1;
	public static final int RUNE_DAGGER_DEFAULT = RUNE_DEFAULT + 1;
	public static final int RUNE_HATCHET_DEFAULT = RUNE_DEFAULT + 2;
	public static final int RUNE_MACE_DEFAULT = RUNE_DEFAULT + 3;
	public static final int RUNE_SWORD_DEFAULT = RUNE_DEFAULT + 4;
	public static final int RUNE_PICKAXE_DEFAULT = RUNE_DEFAULT + 5;
	public static final int RUNE_SCIMITAR_DEFAULT = RUNE_DEFAULT + 6;
	public static final int RUNE_LONGSWORD_DEFAULT = RUNE_DEFAULT + 7;
	public static final int RUNE_WARHAMMER_DEFAULT = RUNE_DEFAULT + 8;
	public static final int RUNE_BATTLEAXE_DEFAULT = RUNE_DEFAULT + 9;
	public static final int RUNE_CLAWS_DEFAULT = RUNE_DEFAULT + 10;
	public static final int RUNE_TWOH_DEFAULT = RUNE_DEFAULT + 11;
	
	//Dragon Melee Weapons
	public static final int DRAGON_DEFAULT = RUNE_TWOH_DEFAULT + 1;
	public static final int DRAGON_DAGGER_DEFAULT = DRAGON_DEFAULT + 1;
	public static final int DRAGON_HATCHET_DEFAULT = DRAGON_DEFAULT + 2;
	public static final int DRAGON_MACE_DEFAULT = DRAGON_DEFAULT + 3;
	public static final int DRAGON_PICKAXE_DEFAULT = DRAGON_DEFAULT + 4;
	public static final int DRAGON_SCIMITAR_DEFAULT = DRAGON_DEFAULT + 5;
	public static final int DRAGON_LONGSWORD_DEFAULT = DRAGON_DEFAULT + 6;
	public static final int DRAGON_BATTLEAXE_DEFAULT = DRAGON_DEFAULT + 7;
	public static final int DRAGON_CLAWS_DEFAULT = DRAGON_DEFAULT + 8;
	public static final int DRAGON_TWOH_DEFAULT = DRAGON_DEFAULT + 9;
	
	
	//===================================================================================================================================
	
	//MINING AND SMELTING---------------------------------------------------------------------------------------------------------------

	//Ores
	public static int COPPER_ORE;
	public static int TIN_ORE;
	public static int IRON_ORE;
	public static int SILVER_ORE;
	public static int COAL_ORE;
	public static int GOLD_ORE;
	public static int MITHRIL_ORE;
	public static int ADAMANT_ORE;
	public static int RUNE_ORE;

	//Bars
	public static int BRONZE_BAR;
	public static int IRON_BAR;
	public static int SILVER_BAR;
	public static int STEEL_BAR;
	public static int GOLD_BAR;
	public static int MITHRIL_BAR;
	public static int ADAMANT_BAR;
	public static int RUNE_BAR;

	
	//WEAPONS---------------------------------------------------------------------------------------------------------------------------
	//Bronze Melee Weapons
	public static int BRONZE_DAGGER;
	public static int BRONZE_HATCHET;
	public static int BRONZE_MACE;
	public static int BRONZE_SWORD;
	public static int BRONZE_PICKAXE;
	public static int BRONZE_SCIMITAR;
	public static int BRONZE_LONGSWORD;
	public static int BRONZE_WARHAMMER;
	public static int BRONZE_BATTLEAXE;
	public static int BRONZE_CLAWS;
	public static int BRONZE_TWOH;
	
	//Iron Melee Weapons
	public static int IRON_DAGGER;
	public static int IRON_HATCHET;
	public static int IRON_MACE;
	public static int IRON_SWORD;
	public static int IRON_PICKAXE;
	public static int IRON_SCIMITAR;
	public static int IRON_LONGSWORD;
	public static int IRON_WARHAMMER;
	public static int IRON_BATTLEAXE;
	public static int IRON_CLAWS;
	public static int IRON_TWOH;
	
	//Steel Melee Weapons
	public static int STEEL_DAGGER;
	public static int STEEL_HATCHET;
	public static int STEEL_MACE;
	public static int STEEL_SWORD;
	public static int STEEL_PICKAXE;
	public static int STEEL_SCIMITAR;
	public static int STEEL_LONGSWORD;
	public static int STEEL_WARHAMMER;
	public static int STEEL_BATTLEAXE;
	public static int STEEL_CLAWS;
	public static int STEEL_TWOH;
	
	//Black Melee Weapons
	public static int BLACK_DAGGER;
	public static int BLACK_HATCHET;
	public static int BLACK_MACE;
	public static int BLACK_SWORD;
	public static int BLACK_SCIMITAR;
	public static int BLACK_LONGSWORD;
	public static int BLACK_WARHAMMER;
	public static int BLACK_BATTLEAXE;
	public static int BLACK_CLAWS;
	public static int BLACK_TWOH;
	
	//White Melee Weapons
	public static int WHITE_DAGGER;
	public static int WHITE_MACE;
	public static int WHITE_SWORD;
	public static int WHITE_SCIMITAR;
	public static int WHITE_LONGSWORD;
	public static int WHITE_WARHAMMER;
	public static int WHITE_BATTLEAXE;
	public static int WHITE_CLAWS;
	public static int WHITE_TWOH;
	
	//Mithril Melee Weapons
	public static int MITHRIL_DAGGER;
	public static int MITHRIL_HATCHET;
	public static int MITHRIL_MACE;
	public static int MITHRIL_SWORD;
	public static int MITHRIL_PICKAXE;
	public static int MITHRIL_SCIMITAR;
	public static int MITHRIL_LONGSWORD;
	public static int MITHRIL_WARHAMMER;
	public static int MITHRIL_BATTLEAXE;
	public static int MITHRIL_CLAWS;
	public static int MITHRIL_TWOH;
	
	//Adamant Melee Weapons
	public static int ADAMANT_DAGGER;
	public static int ADAMANT_HATCHET;
	public static int ADAMANT_MACE;
	public static int ADAMANT_SWORD;
	public static int ADAMANT_PICKAXE;
	public static int ADAMANT_SCIMITAR;
	public static int ADAMANT_LONGSWORD;
	public static int ADAMANT_WARHAMMER;
	public static int ADAMANT_BATTLEAXE;
	public static int ADAMANT_CLAWS;
	public static int ADAMANT_TWOH;
	
	//Rune Melee Weapons
	public static int RUNE_DAGGER;
	public static int RUNE_HATCHET;
	public static int RUNE_MACE;
	public static int RUNE_SWORD;
	public static int RUNE_PICKAXE;
	public static int RUNE_SCIMITAR;
	public static int RUNE_LONGSWORD;
	public static int RUNE_WARHAMMER;
	public static int RUNE_BATTLEAXE;
	public static int RUNE_CLAWS;
	public static int RUNE_TWOH;
	
	//Dragon Melee Weapons
	public static int DRAGON_DAGGER;
	public static int DRAGON_HATCHET;
	public static int DRAGON_MACE;
	public static int DRAGON_PICKAXE;
	public static int DRAGON_SCIMITAR;
	public static int DRAGON_LONGSWORD;
	public static int DRAGON_BATTLEAXE;
	public static int DRAGON_CLAWS;
	public static int DRAGON_TWOH;
}
