package dk.gamingtutsdk.minescape.block;

import java.util.Random;

import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.item.Items;
import dk.gamingtutsdk.minescape.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
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
        return this.blockID == Blocks.oreCopper.blockID ? Items.oreCopper.itemID : (this.blockID == Blocks.oreTin.blockID ? Items.oreTin.itemID : this.blockID);
    }
        
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (this.blockID == Blocks.oreMined.blockID)
        {
        	world.setBlock(x, y, z, Blocks.oreCopper.blockID);
        }
    }
    
	
	@Override
	public void registerIcons(IconRegister iconRegister) 
	{
		blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
