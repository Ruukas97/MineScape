package dk.gamingtutsdk.minescape.block;

import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.item.Items;
import dk.gamingtutsdk.minescape.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class MineScapeFurnace extends Block
{

	public MineScapeFurnace(int ID, Material material) 
	{
		super(ID, material);
		setCreativeTab(MineScape.tabMineScapeBlocks);
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
     {
         ItemStack itemstack = entityplayer.getHeldItem();                  
         if (itemstack != null && !world.isRemote)
         {
             if (!entityplayer.capabilities.isCreativeMode && !world.isRemote)
             {
            	 if (itemstack.itemID == Items.oreCopper.itemID || itemstack.itemID == Items.oreTin.itemID)
            	 {
            		 if (entityplayer.inventory.hasItem(Items.oreCopper.itemID) && entityplayer.inventory.hasItem(Items.oreTin.itemID))
            		 {
                		 entityplayer.inventory.consumeInventoryItem(Items.oreCopper.itemID);
                    	 entityplayer.inventory.consumeInventoryItem(Items.oreTin.itemID);
                    	 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barBronze));
                    	 entityplayer.inventoryContainer.detectAndSendChanges();
                    	 entityplayer.addChatMessage("You smelt the copper and tin together in the furnace."); 
            		 }
            	 }
             }         
         }
         return false;
     } 


	@Override
	public void registerIcons(IconRegister iconRegister) 
	{
		blockIcon = iconRegister.registerIcon("lava");
	}
}
