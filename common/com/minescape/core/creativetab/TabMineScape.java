package com.minescape.core.creativetab;

import com.minescape.MineScape;
import com.minescape.block.Blocks;
import com.minescape.item.Items;
import com.minescape.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


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
