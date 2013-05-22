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
import dk.gamingtutsdk.minescape.lib.MineScapeMaterials;

public class Items {	
	//ITEMS==================================================================================================================================
	
	//MINING AND SMELTING------------------------------------------------------------------------------------------------------------------
	
	//Ores
	public static Item oreCopper;
	public static Item oreTin;
	public static Item oreIron;
	public static Item oreSilver;
	public static Item oreCoal;
	public static Item oreGold;
	public static Item oreMithril;
	public static Item oreAdamant;
	public static Item oreRune;

	//Bars
	public static Item barBronze;
	public static Item barIron;
	public static Item barSilver;
	public static Item barSteel;
	public static Item barGold;
	public static Item barMithril;
	public static Item barAdamant;
	public static Item barRune;

	
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
		oreIron = new MineScapeItem(ItemIDs.IRON_ORE).setUnlocalizedName(ItemStrings.IRON_ORE_NAME);
		oreSilver = new MineScapeItem(ItemIDs.SILVER_ORE).setUnlocalizedName(ItemStrings.SILVER_ORE_NAME);
		oreCoal = new MineScapeItem(ItemIDs.COAL_ORE).setUnlocalizedName(ItemStrings.COAL_ORE_NAME);
		oreGold = new MineScapeItem(ItemIDs.GOLD_ORE).setUnlocalizedName(ItemStrings.GOLD_ORE_NAME);
		oreMithril = new MineScapeItem(ItemIDs.MITHRIL_ORE).setUnlocalizedName(ItemStrings.MITHRIL_ORE_NAME);
		oreAdamant = new MineScapeItem(ItemIDs.ADAMANT_ORE).setUnlocalizedName(ItemStrings.ADAMANT_ORE_NAME);
		oreRune = new MineScapeItem(ItemIDs.RUNE_ORE).setUnlocalizedName(ItemStrings.RUNE_ORE_NAME);
		
		//Bars
		barBronze = new MineScapeItem(ItemIDs.BRONZE_BAR).setUnlocalizedName(ItemStrings.BRONZE_BAR_NAME);
		barIron = new MineScapeItem(ItemIDs.IRON_BAR).setUnlocalizedName(ItemStrings.IRON_BAR_NAME);
		barSilver = new MineScapeItem(ItemIDs.SILVER_BAR).setUnlocalizedName(ItemStrings.SILVER_BAR_NAME);
		barSteel = new MineScapeItem(ItemIDs.STEEL_BAR).setUnlocalizedName(ItemStrings.STEEL_BAR_NAME);
		barGold = new MineScapeItem(ItemIDs.GOLD_BAR).setUnlocalizedName(ItemStrings.GOLD_BAR_NAME);
		barMithril = new MineScapeItem(ItemIDs.MITHRIL_BAR).setUnlocalizedName(ItemStrings.MITHRIL_BAR_NAME);
		barAdamant = new MineScapeItem(ItemIDs.ADAMANT_BAR).setUnlocalizedName(ItemStrings.ADAMANT_BAR_NAME);
		barRune = new MineScapeItem(ItemIDs.RUNE_BAR).setUnlocalizedName(ItemStrings.RUNE_BAR_NAME);

		
		//WEAPONS------------------------------------------------------------------------------------------------------------------------------
		
		//Bronze Melee Weapons
		daggerBronze = new MineScapeDagger(ItemIDs.BRONZE_DAGGER, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_DAGGER_NAME);
		hatchetBronze = new MineScapeHatchet(ItemIDs.BRONZE_HATCHET, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_HATCHET_NAME);
		maceBronze = new MineScapeMace(ItemIDs.BRONZE_MACE, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_MACE_NAME);
		swordBronze = new MineScapeSword(ItemIDs.BRONZE_SWORD, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_SWORD_NAME);
		pickaxeBronze = new MineScapePickaxe(ItemIDs.BRONZE_PICKAXE, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_PICKAXE_NAME);
		scimitarBronze = new MineScapeScimitar(ItemIDs.BRONZE_SCIMITAR, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_SCIMITAR_NAME);
		longswordBronze = new MineScapeLongsword(ItemIDs.BRONZE_LONGSWORD, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_LONGSWORD_NAME);
		warhammerBronze = new MineScapeWarhammer(ItemIDs.BRONZE_WARHAMMER, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_WARHAMMER_NAME);
		battleaxeBronze = new MineScapeBattleaxe(ItemIDs.BRONZE_BATTLEAXE, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_BATTLEAXE_NAME);
		clawsBronze = new MineScapeClaws(ItemIDs.BRONZE_CLAWS, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_CLAWS_NAME);
		twoHBronze = new MineScapeTwoHSword(ItemIDs.BRONZE_TWOH, MineScapeMaterials.BRONZE).setUnlocalizedName(ItemStrings.BRONZE_TWOH_NAME);
		
		//Iron Melee Weapons
		daggerIron = new MineScapeDagger(ItemIDs.IRON_DAGGER, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_DAGGER_NAME);
		hatchetIron = new MineScapeHatchet(ItemIDs.IRON_HATCHET, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_HATCHET_NAME);
		maceIron = new MineScapeMace(ItemIDs.IRON_MACE, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_MACE_NAME);
		swordIron = new MineScapeSword(ItemIDs.IRON_SWORD, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_SWORD_NAME);
		pickaxeIron = new MineScapePickaxe(ItemIDs.IRON_PICKAXE, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_PICKAXE_NAME);
		scimitarIron = new MineScapeScimitar(ItemIDs.IRON_SCIMITAR, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_SCIMITAR_NAME);
		longswordIron = new MineScapeLongsword(ItemIDs.IRON_LONGSWORD, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_LONGSWORD_NAME);
		warhammerIron = new MineScapeWarhammer(ItemIDs.IRON_WARHAMMER, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_WARHAMMER_NAME);
		battleaxeIron = new MineScapeBattleaxe(ItemIDs.IRON_BATTLEAXE, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_BATTLEAXE_NAME);
		clawsIron = new MineScapeClaws(ItemIDs.IRON_CLAWS, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_CLAWS_NAME);
		twoHIron = new MineScapeTwoHSword(ItemIDs.IRON_TWOH, MineScapeMaterials.IRON).setUnlocalizedName(ItemStrings.IRON_TWOH_NAME);
		
		//Steel Melee Weapons
		daggerSteel = new MineScapeDagger(ItemIDs.STEEL_DAGGER, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_DAGGER_NAME);
		hatchetSteel = new MineScapeHatchet(ItemIDs.STEEL_HATCHET, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_HATCHET_NAME);
		maceSteel = new MineScapeMace(ItemIDs.STEEL_MACE, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_MACE_NAME);
		swordSteel = new MineScapeSword(ItemIDs.STEEL_SWORD, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_SWORD_NAME);
		pickaxeSteel = new MineScapePickaxe(ItemIDs.STEEL_PICKAXE, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_PICKAXE_NAME);
		scimitarSteel = new MineScapeScimitar(ItemIDs.STEEL_SCIMITAR, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_SCIMITAR_NAME);
		longswordSteel = new MineScapeLongsword(ItemIDs.STEEL_LONGSWORD, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_LONGSWORD_NAME);
		warhammerSteel = new MineScapeWarhammer(ItemIDs.STEEL_WARHAMMER, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_WARHAMMER_NAME);
		battleaxeSteel = new MineScapeBattleaxe(ItemIDs.STEEL_BATTLEAXE, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_BATTLEAXE_NAME);
		clawsSteel = new MineScapeClaws(ItemIDs.STEEL_CLAWS, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_CLAWS_NAME);
		twoHSteel = new MineScapeTwoHSword(ItemIDs.STEEL_TWOH, MineScapeMaterials.STEEL).setUnlocalizedName(ItemStrings.STEEL_TWOH_NAME);
		
		//Black Melee Weapons
		daggerBlack = new MineScapeDagger(ItemIDs.BLACK_DAGGER, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_DAGGER_NAME);
		hatchetBlack = new MineScapeHatchet(ItemIDs.BLACK_HATCHET, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_HATCHET_NAME);
		maceBlack = new MineScapeMace(ItemIDs.BLACK_MACE, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_MACE_NAME);
		swordBlack = new MineScapeSword(ItemIDs.BLACK_SWORD, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_SWORD_NAME);
		scimitarBlack = new MineScapeScimitar(ItemIDs.BLACK_SCIMITAR, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_SCIMITAR_NAME);
		longswordBlack = new MineScapeLongsword(ItemIDs.BLACK_LONGSWORD, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_LONGSWORD_NAME);
		warhammerBlack = new MineScapeWarhammer(ItemIDs.BLACK_WARHAMMER, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_WARHAMMER_NAME);
		battleaxeBlack = new MineScapeBattleaxe(ItemIDs.BLACK_BATTLEAXE, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_BATTLEAXE_NAME);
		clawsBlack = new MineScapeClaws(ItemIDs.BLACK_CLAWS, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_CLAWS_NAME);
		twoHBlack = new MineScapeTwoHSword(ItemIDs.BLACK_TWOH, MineScapeMaterials.BLACK).setUnlocalizedName(ItemStrings.BLACK_TWOH_NAME);
		
		//White Melee Weapons
		daggerWhite = new MineScapeDagger(ItemIDs.WHITE_DAGGER, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_DAGGER_NAME);
		maceWhite = new MineScapeMace(ItemIDs.WHITE_MACE, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_MACE_NAME);
		swordWhite = new MineScapeSword(ItemIDs.WHITE_SWORD, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_SWORD_NAME);
		scimitarWhite = new MineScapeScimitar(ItemIDs.WHITE_SCIMITAR, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_SCIMITAR_NAME);
		longswordWhite = new MineScapeLongsword(ItemIDs.WHITE_LONGSWORD, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_LONGSWORD_NAME);
		warhammerWhite = new MineScapeWarhammer(ItemIDs.WHITE_WARHAMMER, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_WARHAMMER_NAME);
		battleaxeWhite = new MineScapeBattleaxe(ItemIDs.WHITE_BATTLEAXE, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_BATTLEAXE_NAME);
		clawsWhite = new MineScapeClaws(ItemIDs.WHITE_CLAWS, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_CLAWS_NAME);
		twoHWhite = new MineScapeTwoHSword(ItemIDs.WHITE_TWOH, MineScapeMaterials.WHITE).setUnlocalizedName(ItemStrings.WHITE_TWOH_NAME);
		
		//Mithril Melee Weapons
		daggerMithril = new MineScapeDagger(ItemIDs.MITHRIL_DAGGER, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_DAGGER_NAME);
		hatchetMithril = new MineScapeHatchet(ItemIDs.MITHRIL_HATCHET, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_HATCHET_NAME);
		maceMithril = new MineScapeMace(ItemIDs.MITHRIL_MACE, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_MACE_NAME);
		swordMithril = new MineScapeSword(ItemIDs.MITHRIL_SWORD, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_SWORD_NAME);
		pickaxeMithril = new MineScapePickaxe(ItemIDs.MITHRIL_PICKAXE, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_PICKAXE_NAME);
		scimitarMithril = new MineScapeScimitar(ItemIDs.MITHRIL_SCIMITAR, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_SCIMITAR_NAME);
		longswordMithril = new MineScapeLongsword(ItemIDs.MITHRIL_LONGSWORD, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_LONGSWORD_NAME);
		warhammerMithril = new MineScapeWarhammer(ItemIDs.MITHRIL_WARHAMMER, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_WARHAMMER_NAME);
		battleaxeMithril = new MineScapeBattleaxe(ItemIDs.MITHRIL_BATTLEAXE, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_BATTLEAXE_NAME);
		clawsMithril = new MineScapeClaws(ItemIDs.MITHRIL_CLAWS, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_CLAWS_NAME);
		twoHMithril = new MineScapeTwoHSword(ItemIDs.MITHRIL_TWOH, MineScapeMaterials.MITHRIL).setUnlocalizedName(ItemStrings.MITHRIL_TWOH_NAME);
		
		//Adamant Melee Weapons
		daggerAdamant = new MineScapeDagger(ItemIDs.ADAMANT_DAGGER, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_DAGGER_NAME);
		hatchetAdamant = new MineScapeHatchet(ItemIDs.ADAMANT_HATCHET, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_HATCHET_NAME);
		maceAdamant = new MineScapeMace(ItemIDs.ADAMANT_MACE, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_MACE_NAME);
		swordAdamant = new MineScapeSword(ItemIDs.ADAMANT_SWORD, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_SWORD_NAME);
		pickaxeAdamant = new MineScapePickaxe(ItemIDs.ADAMANT_PICKAXE, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_PICKAXE_NAME);
		scimitarAdamant = new MineScapeScimitar(ItemIDs.ADAMANT_SCIMITAR, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_SCIMITAR_NAME);
		longswordAdamant = new MineScapeLongsword(ItemIDs.ADAMANT_LONGSWORD, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_LONGSWORD_NAME);
		warhammerAdamant = new MineScapeWarhammer(ItemIDs.ADAMANT_WARHAMMER, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_WARHAMMER_NAME);
		battleaxeAdamant = new MineScapeBattleaxe(ItemIDs.ADAMANT_BATTLEAXE, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_BATTLEAXE_NAME);
		clawsAdamant = new MineScapeClaws(ItemIDs.ADAMANT_CLAWS, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_CLAWS_NAME);
		twoHAdamant = new MineScapeTwoHSword(ItemIDs.ADAMANT_TWOH, MineScapeMaterials.ADAMANT).setUnlocalizedName(ItemStrings.ADAMANT_TWOH_NAME);
		
		//Rune Melee Weapons
		daggerRune = new MineScapeDagger(ItemIDs.RUNE_DAGGER, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_DAGGER_NAME);
		hatchetRune = new MineScapeHatchet(ItemIDs.RUNE_HATCHET, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_HATCHET_NAME);
		maceRune = new MineScapeMace(ItemIDs.RUNE_MACE, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_MACE_NAME);
		swordRune = new MineScapeSword(ItemIDs.RUNE_SWORD, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_SWORD_NAME);
		pickaxeRune = new MineScapePickaxe(ItemIDs.RUNE_PICKAXE, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_PICKAXE_NAME);
		scimitarRune = new MineScapeScimitar(ItemIDs.RUNE_SCIMITAR, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_SCIMITAR_NAME);
		longswordRune = new MineScapeLongsword(ItemIDs.RUNE_LONGSWORD, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_LONGSWORD_NAME);
		warhammerRune = new MineScapeWarhammer(ItemIDs.RUNE_WARHAMMER, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_WARHAMMER_NAME);
		battleaxeRune = new MineScapeBattleaxe(ItemIDs.RUNE_BATTLEAXE, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_BATTLEAXE_NAME);
		clawsRune = new MineScapeClaws(ItemIDs.RUNE_CLAWS, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_CLAWS_NAME);
		twoHRune = new MineScapeTwoHSword(ItemIDs.RUNE_TWOH, MineScapeMaterials.RUNE).setUnlocalizedName(ItemStrings.RUNE_TWOH_NAME);
		
		//Dragon Melee Weapons
		daggerDragon = new MineScapeDagger(ItemIDs.DRAGON_DAGGER, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_DAGGER_NAME);
		hatchetDragon = new MineScapeHatchet(ItemIDs.DRAGON_HATCHET, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_HATCHET_NAME);
		maceDragon = new MineScapeMace(ItemIDs.DRAGON_MACE, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_MACE_NAME);
		pickaxeDragon = new MineScapePickaxe(ItemIDs.DRAGON_PICKAXE, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_PICKAXE_NAME);
		scimitarDragon = new MineScapeScimitar(ItemIDs.DRAGON_SCIMITAR, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_SCIMITAR_NAME);
		longswordDragon = new MineScapeLongsword(ItemIDs.DRAGON_LONGSWORD, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_LONGSWORD_NAME);
		battleaxeDragon = new MineScapeBattleaxe(ItemIDs.DRAGON_BATTLEAXE, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_BATTLEAXE_NAME);
		clawsDragon = new MineScapeClaws(ItemIDs.DRAGON_CLAWS, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_CLAWS_NAME);
		twoHDragon = new MineScapeTwoHSword(ItemIDs.DRAGON_TWOH, MineScapeMaterials.DRAGON).setUnlocalizedName(ItemStrings.DRAGON_TWOH_NAME);
		
		
		//Item Names============================================================================================================================
		
		//MINING AND SMELTING---------------------------------------------------------------------------------------------------------------
		
		//Ores
		LanguageRegistry.addName(oreCopper, ItemStrings.COPPER_ORE_TRANSNAME);
		LanguageRegistry.addName(oreTin, ItemStrings.TIN_ORE_TRANSNAME);
		LanguageRegistry.addName(oreIron, ItemStrings.IRON_ORE_TRANSNAME);
		LanguageRegistry.addName(oreSilver, ItemStrings.SILVER_ORE_TRANSNAME);
		LanguageRegistry.addName(oreCoal, ItemStrings.COAL_ORE_TRANSNAME);
		LanguageRegistry.addName(oreGold, ItemStrings.GOLD_ORE_TRANSNAME);
		LanguageRegistry.addName(oreMithril, ItemStrings.MITHRIL_ORE_TRANSNAME);
		LanguageRegistry.addName(oreAdamant, ItemStrings.ADAMANT_ORE_TRANSNAME);
		LanguageRegistry.addName(oreRune, ItemStrings.RUNE_ORE_TRANSNAME);

		//Bars
		LanguageRegistry.addName(barBronze, ItemStrings.BRONZE_BAR_TRANSNAME);
		LanguageRegistry.addName(barIron, ItemStrings.IRON_BAR_TRANSNAME);
		LanguageRegistry.addName(barSilver, ItemStrings.SILVER_BAR_TRANSNAME);
		LanguageRegistry.addName(barSteel, ItemStrings.STEEL_BAR_TRANSNAME);
		LanguageRegistry.addName(barGold, ItemStrings.GOLD_BAR_TRANSNAME);
		LanguageRegistry.addName(barMithril, ItemStrings.MITHRIL_BAR_TRANSNAME);
		LanguageRegistry.addName(barAdamant, ItemStrings.ADAMANT_BAR_TRANSNAME);
		LanguageRegistry.addName(barRune, ItemStrings.RUNE_BAR_TRANSNAME);

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
