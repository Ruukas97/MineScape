package dk.gamingtutsdk.minescape.core.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.block.Blocks;
import dk.gamingtutsdk.minescape.item.Items;
import dk.gamingtutsdk.minescape.lib.Reference;

public class TabMineScape extends CreativeTabs 
{

	private String tabName;
	
	public TabMineScape(int par1, String par2Str) {
		super(par1, par2Str);
		tabName = par2Str;
	}
	
	@Override
	public String getTranslatedTabLabel() 
	{
		if (tabName.equals(Reference.TAB_BLOCK)) 
		{
			return Reference.MOD_NAME + " Blocks";
		} 
		else if (tabName.equals(Reference.TAB_ITEM)) 
		{
			return Reference.MOD_NAME + " Items";
		} 		
		else if (tabName.equals(Reference.TAB_WEAPON)) 
		{
			return Reference.MOD_NAME + " Weapons";
		} 		
		else if (tabName.equals(Reference.TAB_ARMOR)) 
		{
			return Reference.MOD_NAME + " Armor";
		} 		
		else {return Reference.MOD_NAME;}
	}
	
	@Override
	public int getTabIconItemIndex()
	{
		if (tabName.equals(Reference.TAB_BLOCK)) 
		{
			return Block.anvil.blockID;
		}
		else if (tabName.equals(Reference.TAB_ITEM)) 
		{
			return Items.oreTin.itemID;
		}
		else if (tabName.equals(Reference.TAB_WEAPON)) 
		{
			return Items.scimitarDragon.itemID;
		}
		else if (tabName.equals(Reference.TAB_ARMOR)) 
		{
			return Item.helmetChain.itemID;
		}
		else{return Item.diamond.itemID;}
	}
}
