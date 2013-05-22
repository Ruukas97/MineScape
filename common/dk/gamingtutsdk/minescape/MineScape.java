package dk.gamingtutsdk.minescape;

import java.awt.Color;
import java.util.Map;
import java.util.logging.Level;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.ModLoader;
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
import dk.gamingtutsdk.minescape.core.proxy.CommonProxy;
import dk.gamingtutsdk.minescape.entity.EntityDwarf;
import dk.gamingtutsdk.minescape.entity.EntityMan;
import dk.gamingtutsdk.minescape.event.MineScape_EventSounds;
import dk.gamingtutsdk.minescape.item.Items;
import dk.gamingtutsdk.minescape.lib.Reference;
import dk.gamingtutsdk.minescape.world.BiomeWasteland;

import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class MineScape
{	
	@Instance(Reference.MOD_ID)
	public static MineScape instance;
	
	@SidedProxy(clientSide = "dk.gamingtutsdk.minescape.core.proxy.ClientProxy", serverSide = "dk.gamingtutsdk.minescape.core.proxy.CommonProxy")
	public static CommonProxy proxy;
	
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
		
		MinecraftForge.EVENT_BUS.register(new MineScape_EventSounds());
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{	
		NetworkRegistry.instance().registerGuiHandler(this, proxy);
		proxy.render();
		Items.init();		
		Blocks.init();					
		GameRegistry.addBiome(Wasteland);
		
		ModLoader.registerEntityID(EntityMan.class, "Man", 125);//registers the mobs name and id
		ModLoader.registerEntityID(EntityDwarf.class, "Dwarf", 126);

		ModLoader.addSpawn("Man", 5, 1, 1, EnumCreatureType.creature);//makes the mob spawn in game see bottom

		ModLoader.addLocalization("entity.Man.name", "Man");//adds the name of the mob to the spawn egg
		ModLoader.addLocalization("entity.Dwarf.name", "Dwarf");
		EntityList.entityEggs.put(Integer.valueOf(125), new EntityEggInfo(125, 894731, (new Color(21, 15, 6)).getRGB()));//creates the spawn egg of the specified colors you will have to mess around with it
		EntityList.entityEggs.put(Integer.valueOf(126), new EntityEggInfo(126, 894731, (new Color(21, 15, 6)).getRGB()));//creates the spawn egg of the specified colors you will have to mess around with it
		}

	public void addRenderer(Map var1)
	{
		var1.put(EntityMan.class, new RenderLiving(new ModelBiped(),.5f));//says that the pigman should use the living renderer and the biped model note you can change the renderer and the model
	}

	
	@PostInit
	public static void postLoad(FMLPostInitializationEvent event)
	{
		LoggerHandler.log(Level.INFO, "MineScape has successfully loaded!");
	}
	
}
