package threeDitems.helper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import org.lwjgl.opengl.GL11;

public class FrameHelper extends Render
{
    private final RenderBlocks renderBlocksInstance = new RenderBlocks();
    private Icon icon;

    public void updateIcons(IconRegister par1IconRegister)
    {
        this.icon = par1IconRegister.registerIcon("itemframe_back");
    } 
    
    public void renderFrameItemAsBlock(RenderBlocks renderBlocksInstance, Item item)
    {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().renderEngine.bindTexture("/terrain.png");
        Block block = Block.planks;
        float f = 0.0625F;
        float f1 = 0.75F;
        float f2 = f1 / 2.0F;
        GL11.glPushMatrix();
        renderBlocksInstance.overrideBlockBounds(0.0D, (double)(0.5F - f2 + 0.0625F), (double)(0.5F - f2 + 0.0625F), (double)(f * 0.5F), (double)(0.5F + f2 - 0.0625F), (double)(0.5F + f2 - 0.0625F));
        renderBlocksInstance.setOverrideBlockTexture(icon);
        renderBlocksInstance.renderBlockAsItem(block, 0, 1.0F);
        renderBlocksInstance.clearOverrideBlockTexture();
        renderBlocksInstance.unlockBlockBounds();
        GL11.glPopMatrix();
        renderBlocksInstance.setOverrideBlockTexture(Block.planks.getBlockTextureFromSide(1));
        GL11.glPushMatrix();
        renderBlocksInstance.overrideBlockBounds(0.0D, (double)(0.5F - f2), (double)(0.5F - f2), (double)(f + 1.0E-4F), (double)(f + 0.5F - f2), (double)(0.5F + f2));
        renderBlocksInstance.renderBlockAsItem(block, 0, 1.0F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        renderBlocksInstance.overrideBlockBounds(0.0D, (double)(0.5F + f2 - f), (double)(0.5F - f2), (double)(f + 1.0E-4F), (double)(0.5F + f2), (double)(0.5F + f2));
        renderBlocksInstance.renderBlockAsItem(block, 0, 1.0F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        renderBlocksInstance.overrideBlockBounds(0.0D, (double)(0.5F - f2), (double)(0.5F - f2), (double)f, (double)(0.5F + f2), (double)(f + 0.5F - f2));
        renderBlocksInstance.renderBlockAsItem(block, 0, 1.0F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        renderBlocksInstance.overrideBlockBounds(0.0D, (double)(0.5F - f2), (double)(0.5F + f2 - f), (double)f, (double)(0.5F + f2), (double)(0.5F + f2));
        renderBlocksInstance.renderBlockAsItem(block, 0, 1.0F);
        GL11.glPopMatrix();
        renderBlocksInstance.unlockBlockBounds();
        renderBlocksInstance.clearOverrideBlockTexture();
        GL11.glPopMatrix();
    }

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2,
			float f, float f1) {		
	}
}
