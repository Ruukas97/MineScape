package dk.gamingtutsdk.minescape.item;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dk.gamingtutsdk.minescape.lib.ItemIDs;
import dk.gamingtutsdk.minescape.lib.ItemStrings;

public class Items {	
	//ITEMS==================================================================================================================================
	
	//MINING AND SMELTING------------------------------------------------------------------------------------------------------------------
	
	//Ores
	public static Item oreCopper;
	public static Item oreTin;
	
	//Bars
	public static Item barBronze;
	
	//WEAPONS---------------------------------------------------------------------------------------------------------------------------------
	
	//Bronze Melee Weapons
	public static Item daggerBronze;
	public static Item hatchetBronze;
	public static Item maceBronze;
	public static Item swordBronze;
	public static Item pickaxeBronze;
	public static Item scimitarBronze;
	public static Item longswordBronze;
	public static Item warhammerBronze;
	public static Item battleaxeBronze;
	public static Item clawsBronze;
	public static Item twoHBronze;
	
	//Iron Melee Weapons
	public static Item daggerIron;
	public static Item hatchetIron;
	public static Item maceIron;
	public static Item swordIron;
	public static Item pickaxeIron;
	public static Item scimitarIron;
	public static Item longswordIron;
	public static Item warhammerIron;
	public static Item battleaxeIron;
	public static Item clawsIron;
	public static Item twoHIron;
	
	//Steel Melee Weapons
	public static Item daggerSteel;
	public static Item hatchetSteel;
	public static Item maceSteel;
	public static Item swordSteel;
	public static Item pickaxeSteel;
	public static Item scimitarSteel;
	public static Item longswordSteel;
	public static Item warhammerSteel;
	public static Item battleaxeSteel;
	public static Item clawsSteel;
	public static Item twoHSteel;
	
	//Black Melee Weapons
	public static Item daggerBlack;
	public static Item hatchetBlack;
	public static Item maceBlack;
	public static Item swordBlack;
	public static Item scimitarBlack;
	public static Item longswordBlack;
	public static Item warhammerBlack;
	public static Item battleaxeBlack;
	public static Item clawsBlack;
	public static Item twoHBlack;
	
	//White Melee Weapons
	public static Item daggerWhite;
	public static Item maceWhite;
	public static Item swordWhite;
	public static Item scimitarWhite;
	public static Item longswordWhite;
	public static Item warhammerWhite;
	public static Item battleaxeWhite;
	public static Item clawsWhite;
	public static Item twoHWhite;
	
	//Mithril Melee Weapons
	public static Item daggerMithril;
	public static Item hatchetMithril;
	public static Item maceMithril;
	public static Item swordMithril;
	public static Item pickaxeMithril;
	public static Item scimitarMithril;
	public static Item longswordMithril;
	public static Item warhammerMithril;
	public static Item battleaxeMithril;
	public static Item clawsMithril;
	public static Item twoHMithril;
	
	//Adamant Melee Weapons
	public static Item daggerAdamant;
	public static Item hatchetAdamant;
	public static Item maceAdamant;
	public static Item swordAdamant;
	public static Item pickaxeAdamant;
	public static Item scimitarAdamant;
	public static Item longswordAdamant;
	public static Item warhammerAdamant;
	public static Item battleaxeAdamant;
	public static Item clawsAdamant;
	public static Item twoHAdamant;
	
	//Rune Melee Weapons
	public static Item daggerRune;
	public static Item hatchetRune;
	public static Item maceRune;
	public static Item swordRune;
	public static Item pickaxeRune;
	public static Item scimitarRune;
	public static Item longswordRune;
	public static Item warhammerRune;
	public static Item battleaxeRune;
	public static Item clawsRune;
	public static Item twoHRune;
	
	//Dragon Melee Weapons
	public static Item daggerDragon;
	public static Item hatchetDragon;
	public static Item maceDragon;
	public static Item pickaxeDragon;
	public static Item scimitarDragon;
	public static Item longswordDragon;
	public static Item battleaxeDragon;
	public static Item clawsDragon;
	public static Item twoHDragon;
	
	public static void init()
	{
		//ITEM CREATING========================================================================================================================
		
		//MINING AND SMELTING------------------------------------------------------------------------------------------------------------------
		
		//Ores
		oreCopper = new MineScapeItem(ItemIDs.COPPER_ORE).setUnlocalizedName(ItemStrings.COPPER_ORE_NAME);
		oreTin = new MineScapeItem(ItemIDs.TIN_ORE).setUnlocalizedName(ItemStrings.TIN_ORE_NAME);
		
		//Bars
		barBronze = new MineScapeItem(ItemIDs.BRONZE_BAR).setUnlocalizedName(ItemStrings.BRONZE_BAR_NAME);
		
		//WEAPONS------------------------------------------------------------------------------------------------------------------------------
		
		//Bronze Melee Weapons
		daggerBronze = new MineScapeDagger(ItemIDs.BRONZE_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_DAGGER_NAME);
		hatchetBronze = new MineScapeHatchet(ItemIDs.BRONZE_HATCHET, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_HATCHET_NAME);
		maceBronze = new MineScapeMace(ItemIDs.BRONZE_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_MACE_NAME);
		swordBronze = new MineScapeSword(ItemIDs.BRONZE_SWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_SWORD_NAME);
		pickaxeBronze = new MineScapePickaxe(ItemIDs.BRONZE_PICKAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_PICKAXE_NAME);
		scimitarBronze = new MineScapeScimitar(ItemIDs.BRONZE_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_SCIMITAR_NAME);
		longswordBronze = new MineScapeLongsword(ItemIDs.BRONZE_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_LONGSWORD_NAME);
		warhammerBronze = new MineScapeWarhammer(ItemIDs.BRONZE_WARHAMMER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_WARHAMMER_NAME);
		battleaxeBronze = new MineScapeBattleaxe(ItemIDs.BRONZE_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_BATTLEAXE_NAME);
		clawsBronze = new MineScapeClaws(ItemIDs.BRONZE_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_CLAWS_NAME);
		twoHBronze = new MineScapeTwoHSword(ItemIDs.BRONZE_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BRONZE_TWOH_NAME);
		
		//Iron Melee Weapons
		daggerIron = new MineScapeDagger(ItemIDs.IRON_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_DAGGER_NAME);
		hatchetIron = new MineScapeHatchet(ItemIDs.IRON_HATCHET, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_HATCHET_NAME);
		maceIron = new MineScapeMace(ItemIDs.IRON_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_MACE_NAME);
		swordIron = new MineScapeSword(ItemIDs.IRON_SWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_SWORD_NAME);
		pickaxeIron = new MineScapePickaxe(ItemIDs.IRON_PICKAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_PICKAXE_NAME);
		scimitarIron = new MineScapeScimitar(ItemIDs.IRON_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_SCIMITAR_NAME);
		longswordIron = new MineScapeLongsword(ItemIDs.IRON_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_LONGSWORD_NAME);
		warhammerIron = new MineScapeWarhammer(ItemIDs.IRON_WARHAMMER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_WARHAMMER_NAME);
		battleaxeIron = new MineScapeBattleaxe(ItemIDs.IRON_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_BATTLEAXE_NAME);
		clawsIron = new MineScapeClaws(ItemIDs.IRON_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_CLAWS_NAME);
		twoHIron = new MineScapeTwoHSword(ItemIDs.IRON_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.IRON_TWOH_NAME);
		
		//Steel Melee Weapons
		daggerSteel = new MineScapeDagger(ItemIDs.STEEL_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_DAGGER_NAME);
		hatchetSteel = new MineScapeHatchet(ItemIDs.STEEL_HATCHET, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_HATCHET_NAME);
		maceSteel = new MineScapeMace(ItemIDs.STEEL_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_MACE_NAME);
		swordSteel = new MineScapeSword(ItemIDs.STEEL_SWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_SWORD_NAME);
		pickaxeSteel = new MineScapePickaxe(ItemIDs.STEEL_PICKAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_PICKAXE_NAME);
		scimitarSteel = new MineScapeScimitar(ItemIDs.STEEL_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_SCIMITAR_NAME);
		longswordSteel = new MineScapeLongsword(ItemIDs.STEEL_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_LONGSWORD_NAME);
		warhammerSteel = new MineScapeWarhammer(ItemIDs.STEEL_WARHAMMER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_WARHAMMER_NAME);
		battleaxeSteel = new MineScapeBattleaxe(ItemIDs.STEEL_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_BATTLEAXE_NAME);
		clawsSteel = new MineScapeClaws(ItemIDs.STEEL_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_CLAWS_NAME);
		twoHSteel = new MineScapeTwoHSword(ItemIDs.STEEL_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.STEEL_TWOH_NAME);
		
		//Black Melee Weapons
		daggerBlack = new MineScapeDagger(ItemIDs.BLACK_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_DAGGER_NAME);
		hatchetBlack = new MineScapeHatchet(ItemIDs.BLACK_HATCHET, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_HATCHET_NAME);
		maceBlack = new MineScapeMace(ItemIDs.BLACK_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_MACE_NAME);
		swordBlack = new MineScapeSword(ItemIDs.BLACK_SWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_SWORD_NAME);
		scimitarBlack = new MineScapeScimitar(ItemIDs.BLACK_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_SCIMITAR_NAME);
		longswordBlack = new MineScapeLongsword(ItemIDs.BLACK_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_LONGSWORD_NAME);
		warhammerBlack = new MineScapeWarhammer(ItemIDs.BLACK_WARHAMMER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_WARHAMMER_NAME);
		battleaxeBlack = new MineScapeBattleaxe(ItemIDs.BLACK_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_BATTLEAXE_NAME);
		clawsBlack = new MineScapeClaws(ItemIDs.BLACK_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_CLAWS_NAME);
		twoHBlack = new MineScapeTwoHSword(ItemIDs.BLACK_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.BLACK_TWOH_NAME);
		
		//White Melee Weapons
		daggerWhite = new MineScapeDagger(ItemIDs.WHITE_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_DAGGER_NAME);
		maceWhite = new MineScapeMace(ItemIDs.WHITE_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_MACE_NAME);
		swordWhite = new MineScapeSword(ItemIDs.WHITE_SWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_SWORD_NAME);
		scimitarWhite = new MineScapeScimitar(ItemIDs.WHITE_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_SCIMITAR_NAME);
		longswordWhite = new MineScapeLongsword(ItemIDs.WHITE_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_LONGSWORD_NAME);
		warhammerWhite = new MineScapeWarhammer(ItemIDs.WHITE_WARHAMMER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_WARHAMMER_NAME);
		battleaxeWhite = new MineScapeBattleaxe(ItemIDs.WHITE_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_BATTLEAXE_NAME);
		clawsWhite = new MineScapeClaws(ItemIDs.WHITE_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_CLAWS_NAME);
		twoHWhite = new MineScapeTwoHSword(ItemIDs.WHITE_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.WHITE_TWOH_NAME);
		
		//Mithril Melee Weapons
		daggerMithril = new MineScapeDagger(ItemIDs.MITHRIL_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_DAGGER_NAME);
		hatchetMithril = new MineScapeHatchet(ItemIDs.MITHRIL_HATCHET, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_HATCHET_NAME);
		maceMithril = new MineScapeMace(ItemIDs.MITHRIL_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_MACE_NAME);
		swordMithril = new MineScapeSword(ItemIDs.MITHRIL_SWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_SWORD_NAME);
		pickaxeMithril = new MineScapePickaxe(ItemIDs.MITHRIL_PICKAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_PICKAXE_NAME);
		scimitarMithril = new MineScapeScimitar(ItemIDs.MITHRIL_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_SCIMITAR_NAME);
		longswordMithril = new MineScapeLongsword(ItemIDs.MITHRIL_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_LONGSWORD_NAME);
		warhammerMithril = new MineScapeWarhammer(ItemIDs.MITHRIL_WARHAMMER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_WARHAMMER_NAME);
		battleaxeMithril = new MineScapeBattleaxe(ItemIDs.MITHRIL_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_BATTLEAXE_NAME);
		clawsMithril = new MineScapeClaws(ItemIDs.MITHRIL_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_CLAWS_NAME);
		twoHMithril = new MineScapeTwoHSword(ItemIDs.MITHRIL_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.MITHRIL_TWOH_NAME);
		
		//Adamant Melee Weapons
		daggerAdamant = new MineScapeDagger(ItemIDs.ADAMANT_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_DAGGER_NAME);
		hatchetAdamant = new MineScapeHatchet(ItemIDs.ADAMANT_HATCHET, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_HATCHET_NAME);
		maceAdamant = new MineScapeMace(ItemIDs.ADAMANT_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_MACE_NAME);
		swordAdamant = new MineScapeSword(ItemIDs.ADAMANT_SWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_SWORD_NAME);
		pickaxeAdamant = new MineScapePickaxe(ItemIDs.ADAMANT_PICKAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_PICKAXE_NAME);
		scimitarAdamant = new MineScapeScimitar(ItemIDs.ADAMANT_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_SCIMITAR_NAME);
		longswordAdamant = new MineScapeLongsword(ItemIDs.ADAMANT_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_LONGSWORD_NAME);
		warhammerAdamant = new MineScapeWarhammer(ItemIDs.ADAMANT_WARHAMMER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_WARHAMMER_NAME);
		battleaxeAdamant = new MineScapeBattleaxe(ItemIDs.ADAMANT_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_BATTLEAXE_NAME);
		clawsAdamant = new MineScapeClaws(ItemIDs.ADAMANT_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_CLAWS_NAME);
		twoHAdamant = new MineScapeTwoHSword(ItemIDs.ADAMANT_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.ADAMANT_TWOH_NAME);
		
		//Rune Melee Weapons
		daggerRune = new MineScapeDagger(ItemIDs.RUNE_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_DAGGER_NAME);
		hatchetRune = new MineScapeHatchet(ItemIDs.RUNE_HATCHET, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_HATCHET_NAME);
		maceRune = new MineScapeMace(ItemIDs.RUNE_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_MACE_NAME);
		swordRune = new MineScapeSword(ItemIDs.RUNE_SWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_SWORD_NAME);
		pickaxeRune = new MineScapePickaxe(ItemIDs.RUNE_PICKAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_PICKAXE_NAME);
		scimitarRune = new MineScapeScimitar(ItemIDs.RUNE_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_SCIMITAR_NAME);
		longswordRune = new MineScapeLongsword(ItemIDs.RUNE_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_LONGSWORD_NAME);
		warhammerRune = new MineScapeWarhammer(ItemIDs.RUNE_WARHAMMER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_WARHAMMER_NAME);
		battleaxeRune = new MineScapeBattleaxe(ItemIDs.RUNE_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_BATTLEAXE_NAME);
		clawsRune = new MineScapeClaws(ItemIDs.RUNE_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_CLAWS_NAME);
		twoHRune = new MineScapeTwoHSword(ItemIDs.RUNE_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.RUNE_TWOH_NAME);
		
		//Dragon Melee Weapons
		daggerDragon = new MineScapeDagger(ItemIDs.DRAGON_DAGGER, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_DAGGER_NAME);
		hatchetDragon = new MineScapeHatchet(ItemIDs.DRAGON_HATCHET, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_HATCHET_NAME);
		maceDragon = new MineScapeMace(ItemIDs.DRAGON_MACE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_MACE_NAME);
		pickaxeDragon = new MineScapePickaxe(ItemIDs.DRAGON_PICKAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_PICKAXE_NAME);
		scimitarDragon = new MineScapeScimitar(ItemIDs.DRAGON_SCIMITAR, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_SCIMITAR_NAME);
		longswordDragon = new MineScapeLongsword(ItemIDs.DRAGON_LONGSWORD, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_LONGSWORD_NAME);
		battleaxeDragon = new MineScapeBattleaxe(ItemIDs.DRAGON_BATTLEAXE, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_BATTLEAXE_NAME);
		clawsDragon = new MineScapeClaws(ItemIDs.DRAGON_CLAWS, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_CLAWS_NAME);
		twoHDragon = new MineScapeTwoHSword(ItemIDs.DRAGON_TWOH, EnumToolMaterial.IRON).setUnlocalizedName(ItemStrings.DRAGON_TWOH_NAME);
		
		//Item Names============================================================================================================================
		
		//MINING AND SMELTING---------------------------------------------------------------------------------------------------------------
		
		//Ores
		LanguageRegistry.addName(oreCopper, ItemStrings.COPPER_ORE_TRANSNAME);
		LanguageRegistry.addName(oreTin, ItemStrings.TIN_ORE_TRANSNAME);

		//Bars
		LanguageRegistry.addName(barBronze, ItemStrings.BRONZE_BAR_TRANSNAME);
	
		//WEAPONS----------------------------------------------------------------------------------------------------------------------------
		
		//Bronze Melee Weapons
		LanguageRegistry.addName(daggerBronze, ItemStrings.BRONZE_DAGGER_TRANSNAME);
		LanguageRegistry.addName(hatchetBronze, ItemStrings.BRONZE_HATCHET_TRANSNAME);
		LanguageRegistry.addName(maceBronze, ItemStrings.BRONZE_MACE_TRANSNAME);
		LanguageRegistry.addName(swordBronze, ItemStrings.BRONZE_SWORD_TRANSNAME);
		LanguageRegistry.addName(pickaxeBronze, ItemStrings.BRONZE_PICKAXE_TRANSNAME);
		LanguageRegistry.addName(scimitarBronze, ItemStrings.BRONZE_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordBronze, ItemStrings.BRONZE_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(warhammerBronze, ItemStrings.BRONZE_WARHAMMER_TRANSNAME);
		LanguageRegistry.addName(battleaxeBronze, ItemStrings.BRONZE_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsBronze, ItemStrings.BRONZE_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHBronze, ItemStrings.BRONZE_TWOH_TRANSNAME);
		
		//Iron Melee Weapons
		LanguageRegistry.addName(daggerIron, ItemStrings.IRON_DAGGER_TRANSNAME);
		LanguageRegistry.addName(hatchetIron, ItemStrings.IRON_HATCHET_TRANSNAME);
		LanguageRegistry.addName(maceIron, ItemStrings.IRON_MACE_TRANSNAME);
		LanguageRegistry.addName(swordIron, ItemStrings.IRON_SWORD_TRANSNAME);
		LanguageRegistry.addName(pickaxeIron, ItemStrings.IRON_PICKAXE_TRANSNAME);
		LanguageRegistry.addName(scimitarIron, ItemStrings.IRON_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordIron, ItemStrings.IRON_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(warhammerIron, ItemStrings.IRON_WARHAMMER_TRANSNAME);
		LanguageRegistry.addName(battleaxeIron, ItemStrings.IRON_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsIron, ItemStrings.IRON_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHIron, ItemStrings.IRON_TWOH_TRANSNAME);
		
		//Steel Melee Weapons
		LanguageRegistry.addName(daggerSteel, ItemStrings.STEEL_DAGGER_TRANSNAME);
		LanguageRegistry.addName(hatchetSteel, ItemStrings.STEEL_HATCHET_TRANSNAME);
		LanguageRegistry.addName(maceSteel, ItemStrings.STEEL_MACE_TRANSNAME);
		LanguageRegistry.addName(swordSteel, ItemStrings.STEEL_SWORD_TRANSNAME);
		LanguageRegistry.addName(pickaxeSteel, ItemStrings.STEEL_PICKAXE_TRANSNAME);
		LanguageRegistry.addName(scimitarSteel, ItemStrings.STEEL_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordSteel, ItemStrings.STEEL_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(warhammerSteel, ItemStrings.STEEL_WARHAMMER_TRANSNAME);
		LanguageRegistry.addName(battleaxeSteel, ItemStrings.STEEL_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsSteel, ItemStrings.STEEL_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHSteel, ItemStrings.STEEL_TWOH_TRANSNAME);
		
		//Black Melee Weapons
		LanguageRegistry.addName(daggerBlack, ItemStrings.BLACK_DAGGER_TRANSNAME);
		LanguageRegistry.addName(hatchetBlack, ItemStrings.BLACK_HATCHET_TRANSNAME);
		LanguageRegistry.addName(maceBlack, ItemStrings.BLACK_MACE_TRANSNAME);
		LanguageRegistry.addName(swordBlack, ItemStrings.BLACK_SWORD_TRANSNAME);
		LanguageRegistry.addName(scimitarBlack, ItemStrings.BLACK_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordBlack, ItemStrings.BLACK_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(warhammerBlack, ItemStrings.BLACK_WARHAMMER_TRANSNAME);
		LanguageRegistry.addName(battleaxeBlack, ItemStrings.BLACK_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsBlack, ItemStrings.BLACK_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHBlack, ItemStrings.BLACK_TWOH_TRANSNAME);
		
		//White Melee Weapons
		LanguageRegistry.addName(daggerWhite, ItemStrings.WHITE_DAGGER_TRANSNAME);
		LanguageRegistry.addName(maceWhite, ItemStrings.WHITE_MACE_TRANSNAME);
		LanguageRegistry.addName(swordWhite, ItemStrings.WHITE_SWORD_TRANSNAME);
		LanguageRegistry.addName(scimitarWhite, ItemStrings.WHITE_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordWhite, ItemStrings.WHITE_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(warhammerWhite, ItemStrings.WHITE_WARHAMMER_TRANSNAME);
		LanguageRegistry.addName(battleaxeWhite, ItemStrings.WHITE_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsWhite, ItemStrings.WHITE_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHWhite, ItemStrings.WHITE_TWOH_TRANSNAME);
		
		//Mithril Melee Weapons
		LanguageRegistry.addName(daggerMithril, ItemStrings.MITHRIL_DAGGER_TRANSNAME);
		LanguageRegistry.addName(hatchetMithril, ItemStrings.MITHRIL_HATCHET_TRANSNAME);
		LanguageRegistry.addName(maceMithril, ItemStrings.MITHRIL_MACE_TRANSNAME);
		LanguageRegistry.addName(swordMithril, ItemStrings.MITHRIL_SWORD_TRANSNAME);
		LanguageRegistry.addName(pickaxeMithril, ItemStrings.MITHRIL_PICKAXE_TRANSNAME);
		LanguageRegistry.addName(scimitarMithril, ItemStrings.MITHRIL_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordMithril, ItemStrings.MITHRIL_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(warhammerMithril, ItemStrings.MITHRIL_WARHAMMER_TRANSNAME);
		LanguageRegistry.addName(battleaxeMithril, ItemStrings.MITHRIL_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsMithril, ItemStrings.MITHRIL_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHMithril, ItemStrings.MITHRIL_TWOH_TRANSNAME);
		
		//Adamant Melee Weapons
		LanguageRegistry.addName(daggerAdamant, ItemStrings.ADAMANT_DAGGER_TRANSNAME);
		LanguageRegistry.addName(hatchetAdamant, ItemStrings.ADAMANT_HATCHET_TRANSNAME);
		LanguageRegistry.addName(maceAdamant, ItemStrings.ADAMANT_MACE_TRANSNAME);
		LanguageRegistry.addName(swordAdamant, ItemStrings.ADAMANT_SWORD_TRANSNAME);
		LanguageRegistry.addName(pickaxeAdamant, ItemStrings.ADAMANT_PICKAXE_TRANSNAME);
		LanguageRegistry.addName(scimitarAdamant, ItemStrings.ADAMANT_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordAdamant, ItemStrings.ADAMANT_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(warhammerAdamant, ItemStrings.ADAMANT_WARHAMMER_TRANSNAME);
		LanguageRegistry.addName(battleaxeAdamant, ItemStrings.ADAMANT_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsAdamant, ItemStrings.ADAMANT_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHAdamant, ItemStrings.ADAMANT_TWOH_TRANSNAME);
		
		//Rune Melee Weapons
		LanguageRegistry.addName(daggerRune, ItemStrings.RUNE_DAGGER_TRANSNAME);
		LanguageRegistry.addName(hatchetRune, ItemStrings.RUNE_HATCHET_TRANSNAME);
		LanguageRegistry.addName(maceRune, ItemStrings.RUNE_MACE_TRANSNAME);
		LanguageRegistry.addName(swordRune, ItemStrings.RUNE_SWORD_TRANSNAME);
		LanguageRegistry.addName(pickaxeRune, ItemStrings.RUNE_PICKAXE_TRANSNAME);
		LanguageRegistry.addName(scimitarRune, ItemStrings.RUNE_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordRune, ItemStrings.RUNE_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(warhammerRune, ItemStrings.RUNE_WARHAMMER_TRANSNAME);
		LanguageRegistry.addName(battleaxeRune, ItemStrings.RUNE_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsRune, ItemStrings.RUNE_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHRune, ItemStrings.RUNE_TWOH_TRANSNAME);
		
		//Dragon Melee Weapons
		LanguageRegistry.addName(daggerDragon, ItemStrings.DRAGON_DAGGER_TRANSNAME);
		LanguageRegistry.addName(hatchetDragon, ItemStrings.DRAGON_HATCHET_TRANSNAME);
		LanguageRegistry.addName(maceDragon, ItemStrings.DRAGON_MACE_TRANSNAME);
		LanguageRegistry.addName(pickaxeDragon, ItemStrings.DRAGON_PICKAXE_TRANSNAME);
		LanguageRegistry.addName(scimitarDragon, ItemStrings.DRAGON_SCIMITAR_TRANSNAME);
		LanguageRegistry.addName(longswordDragon, ItemStrings.DRAGON_LONGSWORD_TRANSNAME);
		LanguageRegistry.addName(battleaxeDragon, ItemStrings.DRAGON_BATTLEAXE_TRANSNAME);
		LanguageRegistry.addName(clawsDragon, ItemStrings.DRAGON_CLAWS_TRANSNAME);
		LanguageRegistry.addName(twoHDragon, ItemStrings.DRAGON_TWOH_TRANSNAME);
	}
	
}
