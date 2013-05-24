package com.minescape.block;

import java.util.Random;

import com.minescape.MineScape;
import com.minescape.item.Items;
import com.minescape.lib.Reference;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MineScapeOre extends Block
{

	public MineScapeOre(int ID, Material material) 
	{
		super(ID, material);
		setCreativeTab(MineScape.tabMineScapeBlocks);
	}

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == Blocks.oreCopper.blockID ? Items.oreCopper.itemID : (this.blockID == Blocks.oreTin.blockID ? Items.oreTin.itemID : (this.blockID == Blocks.oreIron.blockID ? Items.oreIron.itemID : (this.blockID == Blocks.oreSilver.blockID ? Items.oreSilver.itemID : (this.blockID == Blocks.oreCoal.blockID ? Items.oreCoal.itemID : (this.blockID == Blocks.oreGold.blockID ? Items.oreGold.itemID : (this.blockID == Blocks.oreMithril.blockID ? Items.oreMithril.itemID : (this.blockID == Blocks.oreAdamant.blockID ? Items.oreAdamant.itemID : (this.blockID == Blocks.oreRune.blockID ? Items.oreRune.itemID : this.blockID))))))));
    }
    
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer ep)
    {
    	if (ep.getHeldItem().getDisplayName().toLowerCase().contains("pick"))
    	{
    		ep.addChatMessage("§7You swing your pick at the rock.");
    	}
    }
    
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int par5)
    {
    	if (!world.isRemote)
    	{
        	ModLoader.getMinecraftInstance().thePlayer.addChatMessage("§7You manage to mine some " + this.getLocalizedName().toLowerCase() + ".");
        	if (this.blockID == Blocks.oreCopper.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedCopper.blockID);
            	//experience 17.5
        	}
        	else if (this.blockID == Blocks.oreTin.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedTin.blockID);
            	//experience 17.5
        	}
        	else if (this.blockID == Blocks.oreIron.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedIron.blockID);
            	//experience 35
        	}
        	else if (this.blockID == Blocks.oreSilver.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedSilver.blockID);
            	
        	}
        	else if (this.blockID == Blocks.oreCoal.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedCoal.blockID);

        	}    	
        	else if (this.blockID == Blocks.oreGold.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedGold.blockID);

        	}
        	else if (this.blockID == Blocks.oreMithril.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedMithril.blockID);

        	}
        	else if (this.blockID == Blocks.oreAdamant.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedAdamant.blockID);

        	}
        	else if (this.blockID == Blocks.oreRune.blockID)
        	{
            	world.setBlock(x, y, z, Blocks.minedRune.blockID);

        	}
    	}
    }    
	
	@Override
	public void registerIcons(IconRegister iconRegister) 
	{
		blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
