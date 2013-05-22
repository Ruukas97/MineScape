package dk.gamingtutsdk.minescape.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.block.Blocks;
import dk.gamingtutsdk.minescape.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class MineScapePickaxe extends ItemTool
{
    private int weaponDamage;
    private final EnumToolMaterial toolMaterial;
    public static final Block[] blocksEffectiveAgainst = new Block[] {Block.cobblestone, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, Block.blockIron, Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail, Block.railDetector, Block.railPowered, Block.railActivator};


    public MineScapePickaxe(int ID, EnumToolMaterial enumtoolmaterial)
    {
        super(ID, 2, enumtoolmaterial, blocksEffectiveAgainst);
        this.toolMaterial = enumtoolmaterial;
        this.maxStackSize = 1;
        this.setCreativeTab(MineScape.tabMineScapeWeapons);
        this.weaponDamage = 4 + enumtoolmaterial.getDamageVsEntity();
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        if (par2Block.blockMaterial == Material.rock)
        {
            return toolMaterial.getEfficiencyOnProperMaterial();
        }
        else return 1F;
    }
    
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block.blockMaterial == Material.rock;
    }

    public int func_82803_g()
    {
        return this.toolMaterial.getDamageVsEntity();
    }
    
    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving){return true;}

    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving){return true;}
        
    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity par1Entity)
    {
        return this.weaponDamage;
    }

    @SideOnly(Side.CLIENT)
    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Return the name for this tool's material.
     */
    public String getToolMaterialName()
    {
        return this.toolMaterial.toString();
    }    
    
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}