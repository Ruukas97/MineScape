package dk.gamingtutsdk.minescape.block;

import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.gui.AnvilGui;
import dk.gamingtutsdk.minescape.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class MineScapeAnvil extends Block
{

	public MineScapeAnvil(int par1, Material par2Material) 
	{
		super(par1, par2Material);
		setCreativeTab(MineScape.tabMineScapeBlocks);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)//when block is clicked open gui
	{
	ModLoader.openGUI(player, new AnvilGui());
	return true;
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister) 
	{
		//blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
		blockIcon = iconRegister.registerIcon("anvil_base");
	}
}
