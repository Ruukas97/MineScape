package dk.gamingtutsdk.minescape;

import java.util.logging.Level;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.item.EnumArmorMaterial;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import dk.gamingtutsdk.minescape.block.Blocks;
import dk.gamingtutsdk.minescape.core.creativetab.TabMineScape;
import dk.gamingtutsdk.minescape.core.handler.ConfigurationHandler;
import dk.gamingtutsdk.minescape.core.handler.LoggerHandler;
import dk.gamingtutsdk.minescape.item.Items;
import dk.gamingtutsdk.minescape.lib.Reference;
import dk.gamingtutsdk.minescape.world.BiomeWasteland;

import net.minecraftforge.common.EnumHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class MineScape
{
	
	@Instance(Reference.MOD_ID)
	public static MineScape instance;
	
	public static CreativeTabs tabMineScapeBlocks = new TabMineScape(CreativeTabs.getNextID(), Reference.TAB_BLOCK);
	public static CreativeTabs tabMineScapeItems = new TabMineScape(CreativeTabs.getNextID(), Reference.TAB_ITEM);
	public static CreativeTabs tabMineScapeWeapons = new TabMineScape(CreativeTabs.getNextID(), Reference.TAB_WEAPON);
	public static CreativeTabs tabMineScapeArmor = new TabMineScape(CreativeTabs.getNextID(), Reference.TAB_ARMOR);


	public static EnumArmorMaterial ADAMANT = EnumHelper.addArmorMaterial("ADAMANT", 35, new int[]{2, 6, 5, 2}, 25);

	public static final BiomeGenBase Wasteland = (new BiomeWasteland(100));
	
	@PreInit
	public static void preLoad(FMLPreInitializationEvent event)
	{
		LoggerHandler.initLog();
		ConfigurationHandler.loadConfig(event.getSuggestedConfigurationFile());
	}
	
	@Init
	public static void load(FMLInitializationEvent event)
	{	
		Items.init();
		
		Blocks.init();	
				
		GameRegistry.addBiome(Wasteland);
	}
	
	@PostInit
	public static void postLoad(FMLPostInitializationEvent event)
	{
		LoggerHandler.log(Level.INFO, "MineScape has successfully loaded!");
	}
	
}
