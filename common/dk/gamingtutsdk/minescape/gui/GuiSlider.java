package dk.gamingtutsdk.minescape.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

import org.lwjgl.opengl.GL11;

public class GuiSlider extends GuiButton {
	private float sliderValue = 0;
	private float maxValue;
	private boolean dragging = false;
	private String label;

	public GuiSlider(int id, int x, int y, int xSize, int ySize, String label,
			float maxValue) {
		super(id, x, y, xSize, ySize, label);
		this.label = label;
		this.maxValue = maxValue;
	}

	protected int getHoverState(boolean par1) {
		return 0;
	}

	protected void mouseDragged(Minecraft par1Minecraft, int par2, int par3) {
		if (this.drawButton) {
			if (this.dragging) {
				this.sliderValue = (float) (par2 - (this.xPosition + 4))
						/ (float) (this.width - 8);

				if (this.sliderValue < 0.0F) {
					this.sliderValue = 0.0F;
				}

				if (this.sliderValue > 1.0F) {
					this.sliderValue = 1.0F;
				}

			}

			this.displayString = label + " " + (int) (sliderValue * maxValue);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.drawTexturedModalRect(this.xPosition
					+ (int) (this.sliderValue * (float) (this.width - 8)),
					this.yPosition, 0, 66, 4, 20);
			this.drawTexturedModalRect(this.xPosition
					+ (int) (this.sliderValue * (float) (this.width - 8)) + 4,
					this.yPosition, 196, 66, 4, 20);
		}
	}

	public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3) {
		if (super.mousePressed(par1Minecraft, par2, par3)) {
			this.sliderValue = (float) (par2 - (this.xPosition + 4))
					/ (float) (this.width - 8);

			if (this.sliderValue < 0.0F) {
				this.sliderValue = 0.0F;
			}

			if (this.sliderValue > 1.0F) {
				this.sliderValue = 1.0F;
			}

			this.dragging = true;
			return true;
		} else {
			return false;
		}
	}

	public void mouseReleased(int par1, int par2) {
		this.dragging = false;
	}

	public void setSliderValue(int value) {
		sliderValue = value;
	}

	public int getSliderValue() {
		return (int) (sliderValue * maxValue);
	}
}