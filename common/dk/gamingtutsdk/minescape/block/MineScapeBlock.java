package dk.gamingtutsdk.minescape.block;

import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class MineScapeBlock extends Block
{

	public MineScapeBlock(int par1, Material par2Material) 
	{
		super(par1, par2Material);
		setCreativeTab(MineScape.tabMineScapeBlocks);
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister) 
	{
		blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
