package dk.gamingtutsdk.minescape.block;

import java.util.Random;

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
                    	 entityplayer.addChatMessage("§7You smelt the copper and tin together in the furnace."); 
                    	 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barBronze));
                    	 entityplayer.addChatMessage("§7You retrieve a bar of bronze."); 
                    	 entityplayer.inventoryContainer.detectAndSendChanges();
            		 }
            		 else if (itemstack.itemID == Items.oreCopper.itemID)
            		 {
            			 entityplayer.addChatMessage("§7You also need tin ore to make bronze."); 
            		 }
            		 else if (itemstack.itemID == Items.oreTin.itemID)
            		 {
            			 entityplayer.addChatMessage("§7You also need copper ore to make bronze."); 
            		 }
            	 }
            	 else if (itemstack.itemID == Items.oreIron.itemID)
            	 {
            		 Random random = new Random();
            		 int num = random.nextInt(2)+1;
            		 entityplayer.addChatMessage("§7You smelt the iron in the furnace.");
        			 entityplayer.inventory.consumeInventoryItem(Items.oreIron.itemID);
            		 if (num == 1)
            		 {
                    	 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barIron));
                    	 entityplayer.inventoryContainer.detectAndSendChanges();
                    	 entityplayer.addChatMessage("§7You retrieve a bar of iron."); 
            		 }
            		 else
                	 {
                		 entityplayer.addChatMessage("§7The ore is too impure and you fail to refine it.");
                    	 entityplayer.inventoryContainer.detectAndSendChanges();
                	 }
            	 }
            	 else if (itemstack.itemID == Items.oreSilver.itemID)
            	 {
        			 entityplayer.inventory.consumeInventoryItem(Items.oreSilver.itemID);
            		 entityplayer.addChatMessage("§7You place a lump of silver in the furnace.");
                	 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barSilver));
            		 entityplayer.addChatMessage("§7You retrieve a bar of silver from the furnace.");
                	 entityplayer.inventoryContainer.detectAndSendChanges();
            	 }
            	 else if (itemstack.itemID == Items.oreCoal.itemID)
            	 {
            		 if (entityplayer.inventory.hasItemStack(new ItemStack(Items.oreIron)) && entityplayer.inventory.hasItemStack(new ItemStack(Items.oreCoal, 2)))
            		 {
            			 entityplayer.inventory.consumeInventoryItem(Items.oreIron.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.addChatMessage("§7You place the iron and two heaps of coal into the furnace.");
            			 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barSteel));
            			 entityplayer.addChatMessage("§7You retrieve a bar of steel.");
            			 entityplayer.inventoryContainer.detectAndSendChanges();
            		 }
            		 else
            		 {
            			 entityplayer.addChatMessage("§7You can't smelt coal alone");
            		 }

            	 }
            	 else if (itemstack.itemID == Items.oreGold.itemID)
            	 {
        			 entityplayer.inventory.consumeInventoryItem(Items.oreGold.itemID);
            		 entityplayer.addChatMessage("§7You place a lump of gold in the furnace.");
                	 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barGold));
            		 entityplayer.addChatMessage("§7You retrieve a bar of gold from the furnace.");
                	 entityplayer.inventoryContainer.detectAndSendChanges();
            	 }
            	 else if (itemstack.itemID == Items.oreMithril.itemID)
            	 {
            		 if (entityplayer.inventory.hasItemStack(new ItemStack(Items.oreCoal, 4)))
            		 {
            			 entityplayer.inventory.consumeInventoryItem(Items.oreMithril.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.addChatMessage("§7You place the mithril and four heaps of coal into the furnace.");
            			 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barMithril));
            			 entityplayer.addChatMessage("§7You retrieve a bar of mithril.");
            			 entityplayer.inventoryContainer.detectAndSendChanges();
            		 }
            		 else
            		 {
            			 entityplayer.addChatMessage("§7You need four coal ores to smelt that!");
            		 }
            	 }
            	 else if (itemstack.itemID == Items.oreAdamant.itemID)
            	 {
            		 if (entityplayer.inventory.hasItemStack(new ItemStack(Items.oreCoal, 6)))
            		 {
            			 entityplayer.inventory.consumeInventoryItem(Items.oreAdamant.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.addChatMessage("§7You place the adamantite and six heaps of coal into the furnace.");
            			 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barAdamant));
            			 entityplayer.addChatMessage("§7You retrieve a bar of adamant.");
            			 entityplayer.inventoryContainer.detectAndSendChanges();
            		 }
            		 else
            		 {
            			 entityplayer.addChatMessage("§7You need six coal ores to smelt that!");
            		 }
            	 }
            	 else if (itemstack.itemID == Items.oreRune.itemID)
            	 {
            		 if (entityplayer.inventory.hasItemStack(new ItemStack(Items.oreCoal, 8)))
            		 {
            			 entityplayer.inventory.consumeInventoryItem(Items.oreRune.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.inventory.consumeInventoryItem(Items.oreCoal.itemID);
            			 entityplayer.addChatMessage("§7You place the runite and eight heaps of coal into the furnace.");
            			 entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.barRune));
            			 entityplayer.addChatMessage("§7You retrieve a bar of rune.");
            			 entityplayer.inventoryContainer.detectAndSendChanges();
            		 }
            		 else
            		 {
            			 entityplayer.addChatMessage("§7You need eight coal ores to smelt that!");
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
