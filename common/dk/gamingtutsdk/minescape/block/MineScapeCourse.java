package dk.gamingtutsdk.minescape.block;

import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class MineScapeCourse extends Block
{

	public MineScapeCourse(int par1, Material par2Material) 
	{
		super(par1, par2Material);
		setCreativeTab(MineScape.tabMineScapeBlocks);
	}
	
    public void onEntityWalking(World world, int X, int Y, int Z, Entity entity)
    {
    	if (world.getBlockMaterial(X + 1, Y, Z) == Material.air)
    	{
        	entity.motionX =+ 1;
    	}
    	else if (world.getBlockMaterial(X, Y, Z + 1) == Material.air)
    	{
        	entity.motionZ =+ 1;
    	}
    }
    
	@Override
	public void registerIcons(IconRegister iconRegister) 
	{
		blockIcon = iconRegister.registerIcon("wood");
	}
}
