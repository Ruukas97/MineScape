package threeDitems;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.model.ModelMinecart;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import threeDitems.models.Nihil;
import threeDitems.models.apple;
import threeDitems.models.axe;
import threeDitems.models.ball;
import threeDitems.models.bed;
import threeDitems.models.bone;
import threeDitems.models.book;
import threeDitems.models.bottle;
import threeDitems.models.bowl;
import threeDitems.models.bread;
import threeDitems.models.bucket;
import threeDitems.models.carrot;
import threeDitems.models.chicken;
import threeDitems.models.cookie;
import threeDitems.models.disc;
import threeDitems.models.egg;
import threeDitems.models.emerald;
import threeDitems.models.enderball;
import threeDitems.models.fish;
import threeDitems.models.hoe;
import threeDitems.models.ingot;
import threeDitems.models.meat;
import threeDitems.models.pick;
import threeDitems.models.saddle;
import threeDitems.models.spade;
import threeDitems.models.spidereye;
import threeDitems.models.sword;

public class RenderItem
{
	public static RenderItem inst = new RenderItem();

	public void addIngot(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new ingot(), texture,
				0.25F, 0.2F, 0.0F, 40.0F, 80.0F, 90.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addBread(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new bread(), texture, 
				0.2F, 0.2F, 0F, 0.0F, 90.0F, -30.0F, -0.1F, 0F, -0.2F, 0.0F, 90.0F, 0.0F, scale));
	}

	public void addBook(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new book(), texture, 
				0.28F, -0.1F, 0.2F, -150.0F, 0.0F, -90.0F, 0.5F, 0.0F, 0.2F, -90.0F, 0.0F, 0.0F, scale));
	}

	public void addBucket(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new bucket(), texture, 
				0.2F, 0.2F, 0.1F, 0.0F, 0.0F, 0.0F, -0.1F, 0.2F, 0.0F, 0.0F, 0.0F, 10.0F, scale));
	}

	public void addBall(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new ball(), texture, 
				0.2F, 0.2F, 0.1F, 0.0F, 0.0F, 0.0F, -0.1F, 0.2F, 0.0F, 0.0F, 0.0F, 10.0F, scale));
	}

	@Deprecated
	public void addEnder(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new enderball(), texture,
				0.2F, 0.2F, 0.1F, 0.0F, 0.0F, 0.0F, -0.1F, 0.2F, 0.0F, 0.0F, 0.0F, 10.0F, scale));
	}

	public void addDisc(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new disc(), texture, 
				0.25F, 0.2F, 0.0F, 40.0F, 80.0F, 90.0F, 0.1F, 0.0F, 0.1F, -60.0F, 0.0F, 50.0F, scale));
	}

	public void addMineral(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new emerald(), texture,
				0.25F, 0.2F, 0.0F, 40.0F, 80.0F, 90.0F, 0.1F, 0.0F, 0.1F, -60.0F, 0.0F, 50.0F, scale));
	}

	public void addChicken(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new chicken(), texture,
				0.25F, 0.1F, -0.1F, 40.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.2F, 0.0F, 0.0F, 50.0F, scale));
	}

	public void addSword(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new sword(), texture,
				0.55F, 0.1F, 0.05F, 50.0F, 70.0F, -50.0F, 0.1F, 0.5F, -0.2F, 0.0F, 0.0F, 70.0F, scale));
	}

	public void addHatchet(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new axe(), texture, 
				0.5F, 0.1F, -0.05F, 140.0F, -105.0F, 0.0F, 0.1F, 0.5F, -0.2F, 0.0F, 0.0F, 70.0F, scale));
	}

	public void addHoe(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new hoe(), texture, 
				0.5F, 0.1F, -0.05F, 140.0F, -105.0F, 0.0F, 0.1F, 0.5F, -0.2F, 0.0F, 0.0F, 60.0F, scale));
	}

	public void addSpade(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new spade(), texture, 
				0.5F, 0.1F, -0.05F, 140.0F, -105.0F, 0.0F, 0.1F, 0.1F, -0.2F, 180.0F, 0.0F, 70.0F, scale));
	}

	public void addPick(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new pick(), texture, 
				0.55F, 0.06F, -0.03F, 80.0F, -100.0F, 70.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 70.0F, scale));
	}

	public void addFish(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new fish(), texture, 
				0.15F, 0.45F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 170.0F, 50.0F, scale));
	}

	public void addBowl(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new bowl(), texture, 
				0.2F, 0.2F, 0.1F, 0.0F, 0.0F, 0.0F, -0.1F, 0.2F, 0.0F, 0.0F, 0.0F, 10.0F, scale));
	}

	public void addEmptyBottle(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new bottle(), texture, 
				0.2F, 0.2F, 0.1F, 0.0F, 0.0F, 0.0F, -0.1F, 0.05F, 0.0F, 0.0F, 0.0F, 10.0F, scale));
	}

	public void addApple(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new apple(), texture, 
				0.2F, 0.1F, -0.1F, 30.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addArmorHelm(Item item, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new ModelBiped(), "", 
				0.1F, 0.7F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addArmorPlateBody(Item item, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new ModelBiped(), "", 
				-0.1F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addArmorLegs(Item item, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new ModelBiped(), "", 
				-0.1F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addArmorBoots(Item item, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new ModelBiped(), "", 
				-0.2F, 1.3F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addBlock(Item item, Block block, String texture, boolean scale)
	{
		Render3d rd = new Render3d(new Nihil(), texture, 
				0.25F, 0.2F, 0.0F, 180.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.2F, -180.0F, 0.0F, 0.0F, scale, block);

		MinecraftForgeClient.registerItemRenderer(item.itemID, rd);
	}

	public void addFrame(Item item, boolean scale) {
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new Nihil(), "", 
				-0.2F, 0.3F, 0.0F, -30.0F, 10.0F, 90.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addCart(Item item, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new ModelMinecart(), "",
				0.25F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addBoat(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new ModelBoat(), texture,
				0.25F, 0.35F, 0.1F, 30.0F, -90.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -90.0F, 0.0F, scale));
	}

	public void addBed(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new bed(), texture, 
				0.25F, 0.2F, 0.0F, 10.0F, -90.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -90.0F, 0.0F, scale));
	}

	public void addBone(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new bone(), texture, 
				0.4F, 0.3F, 0.0F, 40.0F, 80.0F, 145.0F, 0.1F, 0.0F, 0.1F, -60.0F, 0.0F, 50.0F, scale));
	}

	public void addEgg(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new egg(), texture, 
				0.2F, 0.1F, -0.1F, 30.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addSaddle(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new saddle(), texture, 
				0.25F, 0.2F, 0.0F, 30.0F, -90.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addCarrot(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new carrot(), texture,
				0.25F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, scale));
	}

	public void addMeat(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new meat(), texture, 
				0.25F, 0.2F, 0.0F, 40.0F, 80.0F, 90.0F, -0.2F, 0.2F, 0.3F, -60.0F, 0.0F, 50.0F, scale));
	}
	
	public void addCookie(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new cookie(), texture,
				0.2F, 0.3F, 0.1F, 40.0F, 80.0F, 90.0F, 0.0F, 0.0F, 0F, -60.0F, 0.0F, 50.0F, scale));
	}
	
	public void addSpiderEye(Item item, String texture, boolean scale)
	{
		MinecraftForgeClient.registerItemRenderer(item.itemID, new Render3d(new spidereye(), texture,
				0.25F, 0.2F, 0.0F, 40.0F, 80.0F, 90.0F, 0.1F, 0F, -0.5F, 0.0F, 0.0F, -90.0F, scale));
	}
	
}
