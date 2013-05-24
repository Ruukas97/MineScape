package com.minescape.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import org.lwjgl.opengl.GL11;

public class AnvilGui extends GuiScreen {
	public final int guiWidth = 248;// the width of the gui
	public final int guiHeight = 166;// the height of the gui

	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture("/gui/demo_bg.png");
		int posX = (width - guiWidth) / 2;
		int posY = (height - guiHeight) / 2;
		drawTexturedModalRect(posX, posY, 0, 0, guiWidth, guiHeight);
		super.drawScreen(x, y, f);
	}

	public void initGui()// add button
	{
		this.buttonList.clear();// clear button list
		int frameX = (width - guiWidth) / 2;// get frame x position
		int frameY = (height - guiHeight) / 2;// get frame y position
		int buttonWidth = 100;// set button width
		int buttonHeight = 20;// set button height
		int buttonX = ((guiWidth / 2 - buttonWidth / 2) + frameX);// set button
																	// x
																	// position
		int buttonY = ((guiHeight / 2 - buttonHeight / 2) + frameY);// set
																	// button y
																	// position
		this.buttonList.add(new GuiButton(0, buttonX, buttonY, buttonWidth,
				buttonHeight, "Click Me!"));/*
											 * create and add the button. The 0
											 * is the id of the button. The
											 * string is the buttons name.
											 */
	}

	public void actionPerformed(GuiButton button)// called when a button is
													// pressed
	{
		if (button.id == 0)// if our button is pressed
			button.displayString = "I've been clicked!";
	}
}