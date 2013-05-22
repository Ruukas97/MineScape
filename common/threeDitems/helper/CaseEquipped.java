package threeDitems.helper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemEnderEye;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemMinecart;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import threeDitems.models.bottle;
import threeDitems.models.enderball;

public class CaseEquipped
{
	public void render(IItemRenderer.ItemRenderType type, ItemStack item, float x, float y, float z, float rotZ, float rotY, float rotX, float X, float Y, float Z, float fpsX, float fpsY, float fpsZ, boolean scale, String name, RenderBlocks render, FrameHelper frame, ModelBase theItem, MinecartHelper helper, Block blockToRender, String[] armorFilenamePrefix, Object[] data)
	{
		GL11.glPushMatrix();

		Minecraft.getMinecraft().renderEngine.bindTexture(name);

		if(data[1] != null && data[1] instanceof EntityPlayer)
		{
			if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
			{
				GL11.glScalef(1.5f, 1.5f, 1.5f);
				GL11.glTranslatef(x, y, z);
				GL11.glRotatef(15+rotZ, 0.0f, 0.0f, 1.0f);
				GL11.glRotatef(12+rotY, 0.0f, 1.0f, 0.0f);
				GL11.glRotatef(145+rotX, 1.0f, 0.0f, 0.0f);
			}
			else
			{
				GL11.glRotatef(15f+Z, 0.0f, 0.0f, 1.0f);
				GL11.glRotatef(175F+X, 1.0f, 0.0f, 0.0f);
				GL11.glRotatef(102F+Y, 0.0f, 1.0f, 0.0f);
				GL11.glScalef(1.5f, 1.5f, 1.5f);
				GL11.glTranslatef(-0.2f+fpsX ,-0.3f+fpsY, 0.2F+fpsZ);
			}
		}
		else
		{
			GL11.glScalef(1.5f, 1.5f, 1.5f);
			GL11.glTranslatef(x, y, z);
			GL11.glRotatef(15+rotZ, 0.0f, 0.0f, 1.0f);
			GL11.glRotatef(12+rotY, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(145+rotX, 1.0f, 0.0f, 0.0f);
		}

		if(item.getItem().equals(Item.itemFrame)){
			frame.renderFrameItemAsBlock(render, item.getItem());
		}
		if(item.getItem() instanceof ItemArmor){
			ArmorHelper ah= new ArmorHelper();
			ah.setArmorModel((ModelBiped)theItem, item, ((ItemArmor)item.getItem()).armorType, armorFilenamePrefix[((ItemArmor)item.getItem()).renderIndex]);
		}
		if(scale){
			GL11.glScalef(0.5f, 0.5f, 0.5f);
		}
		if(item.getItem() instanceof ItemMinecart){
			helper.cartzz(item, theItem, render, data);
		}
		if(blockToRender != null){
			render.renderBlockAsItem(blockToRender, 0, 1.0f);
		}
		theItem.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		if(item.getItem() instanceof ItemPotion|| item.getItem().equals(Item.expBottle)){
			this.potionContent((Entity)data[1], item, theItem);
		}
		if(item.getItem() instanceof ItemEnderEye ){
			GL11.glScalef(0.5f,0.5f,0.5f);
			((enderball)theItem).renderEye((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(1.0f, 0.5f, 0f, 0.2f);
			((enderball)theItem).renderBall((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		}
		if(item.getItem() instanceof ItemPotion || item.getItem().equals(Item.glassBottle)|| item.getItem().equals(Item.expBottle)){
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
			((bottle)theItem).renderBottle((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		}
		if(item.getItem() instanceof ItemEnderPearl ){
			GL11.glScalef(0.5f,0.5f,0.5f);
			GL11.glColor4f(0f, 0f, 0f, 1.0f);
			((enderball)theItem).renderBall((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		}
		if(item.getItem() instanceof ItemEnderPearl|| item.getItem() instanceof ItemEnderEye ){
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(0.3f, 0.3f, 0.3f, 0.3f);
			GL11.glTranslatef(-0.02f, 0.05f, -0.001f);
			GL11.glScalef(1.3f,1.3f,1.3f);
			((enderball)theItem).renderBall((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		}
		GL11.glPopMatrix();

	}

	public void potionContent(Entity p, ItemStack item, ModelBase theItem)
	{
		Minecraft mc = Minecraft.getMinecraft();
		mc.renderEngine.bindTexture("/subaraki/3d/bottle.png");
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);
		if( p instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) p;
			if(player.getCurrentEquippedItem() != null)
			{
				if(item.getItem().equals(Item.potion) || item.getItem().equals(Item.glassBottle))
				{
					int color = ((ItemPotion)item.getItem()).getColorFromDamage(item.getItemDamage());
					float red = (float)(color >> 16 & 255) / 255.0F;
					float green = (float)(color >> 8 & 255) / 255.0F;
					float blue = (float)(color & 255) / 255.0F;					
					GL11.glColor4f(red, green,blue, 1.0F);
					((bottle)theItem).renderContent(p, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				}
				else if(player.getCurrentEquippedItem().getItem().equals(Item.expBottle))
				{
					GL11.glColor4f(0.7f, 1.0f, 0.0f, 1.0F);
					((bottle)theItem).renderContent(p, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				}
			}
		}
	}
}
