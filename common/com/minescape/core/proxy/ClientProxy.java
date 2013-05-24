/*     */ package com.minescape.core.proxy;
/*     */ 
/*     */ import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import threeDitems.Render3d;
import threeDitems.RenderItem;
import threeDitems.models.stick;
import threeDitems.models.bottle;
import threeDitems.models.rod;

public class ClientProxy extends CommonProxy
{
	public static ClientProxy instance = new ClientProxy();

	public void render() {
		instance = this;
		Render3d.hastoRenderOnTick = true;

		MinecraftForgeClient.registerItemRenderer(Item.stick.itemID, new Render3d(new stick(),"/subaraki/3d/stick.png", 0.5f,0.2f,0.0f,40f,90f,10f,0f,0f,0f,0f,0f,0f,false));
		MinecraftForgeClient.registerItemRenderer(Item.fishingRod.itemID, new Render3d(new rod(),"/subaraki/3d/rod.png", 0.5f,0.2f, -0.05f, -50f,-110f,0f,0.1f,-0.2f,0.4f,0f,0f,-30f,false));
		MinecraftForgeClient.registerItemRenderer(Item.carrotOnAStick.itemID,new Render3d(new rod(),"/subaraki/3d/carrots.png" ,	0.5f,0.2f, -0.05f, -50f,-110f,0f,0.1f,-0.2f,0.4f,0f,0f,-30f,false));

		MinecraftForgeClient.registerItemRenderer(Item.potion.itemID, new Render3d(new bottle(),"/subaraki/3d/bottle.png", 0.2f,0.2f,0.1f,0f,0f,0f,-0.1f,0.05f,0f,0f,0f,10f,false));
		MinecraftForgeClient.registerItemRenderer(Item.expBottle.itemID, new Render3d(new bottle(),"/subaraki/3d/bottle.png", 0.2f,0.2f,0.1f,0f,0f,0f,-0.1f,0.05f,0f,0f,0f,10f,false));

		RenderItem.inst.addEmptyBottle(Item.glassBottle,"/subaraki/3d/bottle.png",false);

		RenderItem.inst.addBread(Item.bread,"/subaraki/3d/bread.png",false);

		RenderItem.inst.addApple(Item.appleRed,"/subaraki/3d/apple.png",false);
		RenderItem.inst.addApple(Item.appleGold,"/subaraki/3d/appleGold.png",false);

		RenderItem.inst.addBowl(Item.bowlEmpty,"/subaraki/3d/bowl.png",false);
		RenderItem.inst.addBowl(Item.bowlSoup,"/subaraki/3d/bowlfull.png",false);

		RenderItem.inst.addBall(Item.fireballCharge,"/subaraki/3d/fireball.png",false);
		RenderItem.inst.addBall(Item.slimeBall,"/subaraki/3d/slime.png",false);
		RenderItem.inst.addBall(Item.snowball,"/subaraki/3d/snowball.png",false);
		RenderItem.inst.addEnder(Item.enderPearl,"/subaraki/3d/pearl.png",false);
		RenderItem.inst.addEnder(Item.eyeOfEnder,"/subaraki/3d/pearl.png",false);

		RenderItem.inst.addBucket(Item.bucketEmpty,"/subaraki/3d/bucket.png",false);
		RenderItem.inst.addBucket(Item.bucketLava,"/subaraki/3d/bucketLava.png",false);
		RenderItem.inst.addBucket(Item.bucketWater,"/subaraki/3d/bucketWater.png",false);
		RenderItem.inst.addBucket(Item.bucketMilk,"/subaraki/3d/bucketMilk.png",false);

		RenderItem.inst.addBook(Item.book,"/subaraki/3d/book.png",false);
		RenderItem.inst.addBook(Item.writableBook,"/subaraki/3d/writtenBook.png",false);
		RenderItem.inst.addBook(Item.writtenBook,"/subaraki/3d/writtenBook.png",false);
		RenderItem.inst.addBook(Item.enchantedBook,"/subaraki/3d/enchanted.png",false);

		RenderItem.inst.addDisc(Item.record13,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordCat,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordBlocks,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordChirp,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordFar,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordMall,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordMellohi,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.record11,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordStrad,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordStal,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordWard,"/subaraki/3d/disc.png",false);
		RenderItem.inst.addDisc(Item.recordWait,"/subaraki/3d/disc.png",false);

		RenderItem.inst.addMineral(Item.emerald,"/subaraki/3d/emerald.png",false);
		RenderItem.inst.addMineral(Item.diamond,"/subaraki/3d/diamond.png",false);
		RenderItem.inst.addMineral(Item.netherQuartz,"/subaraki/3d/quartz.png",false);
		RenderItem.inst.addMineral(Item.dyePowder,"/subaraki/3d/lapis.png",false);

		RenderItem.inst.addIngot(Item.ingotIron,"/subaraki/3d/ingot.png",false);
		RenderItem.inst.addIngot(Item.ingotGold,"/subaraki/3d/ingotGold.png",false);
		RenderItem.inst.addIngot(Item.brick,"/subaraki/3d/brick.png",false);
		RenderItem.inst.addIngot(Item.netherrackBrick,"/subaraki/3d/brickNether.png",false);

		RenderItem.inst.addSword(Item.swordDiamond,"/subaraki/3d/swordDiamond.png",false);
		RenderItem.inst.addSword(Item.swordGold,"/subaraki/3d/swordGold.png",false);
		RenderItem.inst.addSword(Item.swordIron,"/subaraki/3d/swordSteel.png",false);
		RenderItem.inst.addSword(Item.swordStone,"/subaraki/3d/swordStone.png",false);
		RenderItem.inst.addSword(Item.swordWood,"/subaraki/3d/swordWood.png",false);

		RenderItem.inst.addPick(Item.pickaxeDiamond,"/subaraki/3d/pickDiamond.png",false);
		RenderItem.inst.addPick(Item.pickaxeGold,"/subaraki/3d/pickGold.png",false);
		RenderItem.inst.addPick(Item.pickaxeIron,"/subaraki/3d/pickSteel.png",false);
		RenderItem.inst.addPick(Item.pickaxeStone,"/subaraki/3d/pickStone.png",false);
		RenderItem.inst.addPick(Item.pickaxeWood,"/subaraki/3d/pickWood.png",false);

		RenderItem.inst.addSpade(Item.shovelDiamond,"/subaraki/3d/spadeDiamond.png",false);
		RenderItem.inst.addSpade(Item.shovelGold,"/subaraki/3d/spadeGold.png",false);
		RenderItem.inst.addSpade(Item.shovelIron,"/subaraki/3d/spadeSteel.png",false);
		RenderItem.inst.addSpade(Item.shovelStone,"/subaraki/3d/spadeStone.png",false);
		RenderItem.inst.addSpade(Item.shovelWood,"/subaraki/3d/spadeWood.png",false);

		RenderItem.inst.addHatchet(Item.axeDiamond,"/subaraki/3d/axeDiamond.png",false);
		RenderItem.inst.addHatchet(Item.axeGold,"/subaraki/3d/axeGold.png",false);
		RenderItem.inst.addHatchet(Item.axeIron,"/subaraki/3d/axeSteel.png",false);
		RenderItem.inst.addHatchet(Item.axeStone,"/subaraki/3d/axeStone.png",false);
		RenderItem.inst.addHatchet(Item.axeWood,"/subaraki/3d/axeWood.png",false);

		RenderItem.inst.addHoe(Item.hoeDiamond,"/subaraki/3d/hoeDiamond.png",false);
		RenderItem.inst.addHoe(Item.hoeGold,"/subaraki/3d/hoeGold.png",false);
		RenderItem.inst.addHoe(Item.hoeIron,"/subaraki/3d/hoeSteel.png",false);
		RenderItem.inst.addHoe(Item.hoeStone,"/subaraki/3d/hoeStone.png",false);
		RenderItem.inst.addHoe(Item.hoeWood,"/subaraki/3d/hoeWood.png",false);

		RenderItem.inst.addArmorHelm(Item.helmetDiamond,false);
		RenderItem.inst.addArmorHelm(Item.helmetGold,false);
		RenderItem.inst.addArmorHelm(Item.helmetLeather,false);
		RenderItem.inst.addArmorHelm(Item.helmetChain,false);
		RenderItem.inst.addArmorHelm(Item.helmetIron,false);

		RenderItem.inst.addArmorPlateBody(Item.plateDiamond,false);
		RenderItem.inst.addArmorPlateBody(Item.plateGold,false);
		RenderItem.inst.addArmorPlateBody(Item.plateIron,false);
		RenderItem.inst.addArmorPlateBody(Item.plateChain,false);
		RenderItem.inst.addArmorPlateBody(Item.plateLeather,false);

		RenderItem.inst.addArmorLegs(Item.legsDiamond,false);
		RenderItem.inst.addArmorLegs(Item.legsGold,false);
		RenderItem.inst.addArmorLegs(Item.legsIron,false);
		RenderItem.inst.addArmorLegs(Item.legsChain,false);
		RenderItem.inst.addArmorLegs(Item.legsLeather,false);

		RenderItem.inst.addArmorBoots(Item.bootsDiamond,false);
		RenderItem.inst.addArmorBoots(Item.bootsGold,false);
		RenderItem.inst.addArmorBoots(Item.bootsChain,false);
		RenderItem.inst.addArmorBoots(Item.bootsIron,false);
		RenderItem.inst.addArmorBoots(Item.bootsLeather,false);

		RenderItem.inst.addCart(Item.minecartEmpty,true);
		RenderItem.inst.addCart(Item.minecartCrate,true);
		RenderItem.inst.addCart(Item.minecartPowered,true);
		RenderItem.inst.addCart(Item.minecartTnt,true);
		RenderItem.inst.addCart(Item.minecartHopper,true);

		RenderItem.inst.addChicken(Item.chickenRaw,"/subaraki/3d/chick.png",false);
		RenderItem.inst.addChicken(Item.chickenCooked,"/subaraki/3d/chickCooked.png",false);

		RenderItem.inst.addFish(Item.fishRaw,"/subaraki/3d/fish.png",true);
		RenderItem.inst.addFish(Item.fishCooked,"/subaraki/3d/fishCooked.png",true);

		RenderItem.inst.addBed(Item.bed,"/subaraki/3d/bed.png",true);

		RenderItem.inst.addBone(Item.bone,"/subaraki/3d/bone.png",false);

		RenderItem.inst.addBlock(Item.cake,Block.cake,"/terrain.png",true);
		RenderItem.inst.addBlock(Item.reed,Block.reed,"/terrain.png",true);

		//broke for some odd reason.
		//				RenderItem.inst.addBlock(Item.cauldron,Block.cauldron,"/terrain.png",true);
		//				RenderItem.inst.addBlock(Item.redstoneRepeater,Block.redstoneRepeaterIdle,"/terrain.png",true);
		//				RenderItem.inst.addBlock(Item.comparator,Block.redstoneComparatorIdle,"/terrain.png",true);
		//				RenderItem.inst.addBlock(Item.brewingStand,Block.brewingStand,"/terrain.png",true);
		//				RenderItem.inst.addBlock(Item.flowerPot,Block.flowerPot,"/terrain.png",true);
		//				RenderItem.inst.addBlock(Item.sign,Block.signPost,"/terrain.png",true);

		RenderItem.inst.addEgg(Item.egg,"/subaraki/3d/egg.png",true);

		RenderItem.inst.addBoat(Item.boat,"/item/boat.png", true);

		RenderItem.inst.addFrame(Item.itemFrame, false);

		RenderItem.inst.addMeat(Item.beefRaw, "/subaraki/3d/beef.png", false);
		RenderItem.inst.addMeat(Item.beefCooked, "/subaraki/3d/beefCooked.png", false);
		RenderItem.inst.addMeat(Item.porkRaw, "/subaraki/3d/pork.png", false);
		RenderItem.inst.addMeat(Item.porkCooked, "/subaraki/3d/porkCooked.png", false);

		RenderItem.inst.addChicken(Item.chickenRaw, "/subaraki/3d/chick.png", false);
		RenderItem.inst.addChicken(Item.chickenCooked, "/subaraki/3d/chickCooked.png", false);

		RenderItem.inst.addCarrot(Item.carrot, "/subaraki/3d/carrotOrange.png", false);
		RenderItem.inst.addCarrot(Item.goldenCarrot, "/subaraki/3d/carrotGold.png", false);

		RenderItem.inst.addSaddle(Item.saddle, "/subaraki/3d/saddle.png", false);

		RenderItem.inst.addSpiderEye(Item.spiderEye, "/subaraki/3d/spidereye.png", true);
		
		RenderItem.inst.addCookie(Item.cookie, "/subaraki/3d/cookie.png", true);
	}

}

