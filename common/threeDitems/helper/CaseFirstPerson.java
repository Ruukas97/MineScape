///*     */ package threeDitems.helper;
///*     */ 
///*     */ import apa;
///*     */ import avy;
///*     */ import ayy;
///*     */ import azg;
///*     */ import bbz;
///*     */ import bcd;
///*     */ import bge;
///*     */ import bgf;
///*     */ import bgy;
///*     */ import mp;
///*     */ import net.minecraft.client.Minecraft;
///*     */ import net.minecraftforge.client.IItemRenderer.ItemRenderType;
///*     */ import org.lwjgl.opengl.GL11;
///*     */ import sq;
///*     */ import threeDitems.models.bottle;
///*     */ import threeDitems.models.enderball;
///*     */ import uo;
///*     */ import vx;
///*     */ import vy;
///*     */ import wk;
///*     */ import wm;
///*     */ import wq;
///*     */ import ww;
///*     */ 
///*     */ public class CaseFirstPerson
///*     */ {
///*     */   public void render(IItemRenderer.ItemRenderType type, wm item, float x, float y, float z, float rotZ, float rotY, float rotX, float X, float Y, float Z, float fpsX, float fpsY, float fpsZ, boolean scale, String name, bgf render, FrameHelper frame, bcd theItem, MinecartHelper helper, apa blockToRender, String[] armorFilenamePrefix, Object[] data)
///*     */   {
///*  34 */     GL11.glPushMatrix();
///*     */ 
///*  36 */     Minecraft.x().p.b(name);
///*     */ 
///*  38 */     if ((data[1] != null) && ((data[1] instanceof sq)))
///*     */     {
///*  40 */       if (((sq)data[1] != Minecraft.x().h) || (Minecraft.x().z.aa != 0) || ((((Minecraft.x().s instanceof azg)) || ((Minecraft.x().s instanceof ayy))) && (bgy.a.j == 180.0F)))
///*     */       {
///*  42 */         GL11.glScalef(1.5F, 1.5F, 1.5F);
///*  43 */         GL11.glTranslatef(x, y, z);
///*  44 */         GL11.glRotatef(15.0F + rotZ, 0.0F, 0.0F, 1.0F);
///*  45 */         GL11.glRotatef(12.0F + rotY, 0.0F, 1.0F, 0.0F);
///*  46 */         GL11.glRotatef(145.0F + rotX, 1.0F, 0.0F, 0.0F);
///*     */       }
///*     */       else
///*     */       {
///*  50 */         GL11.glRotatef(15.0F + Z, 0.0F, 0.0F, 1.0F);
///*  51 */         GL11.glRotatef(175.0F + X, 1.0F, 0.0F, 0.0F);
///*  52 */         GL11.glRotatef(102.0F + Y, 0.0F, 1.0F, 0.0F);
///*  53 */         GL11.glScalef(1.5F, 1.5F, 1.5F);
///*  54 */         GL11.glTranslatef(-0.2F + fpsX, -0.3F + fpsY, 0.2F + fpsZ);
///*     */       }
///*     */     }
///*     */     else
///*     */     {
///*  59 */       GL11.glScalef(1.5F, 1.5F, 1.5F);
///*  60 */       GL11.glTranslatef(x, y, z);
///*  61 */       GL11.glRotatef(15.0F + rotZ, 0.0F, 0.0F, 1.0F);
///*  62 */       GL11.glRotatef(12.0F + rotY, 0.0F, 1.0F, 0.0F);
///*  63 */       GL11.glRotatef(145.0F + rotX, 1.0F, 0.0F, 0.0F);
///*     */     }
///*     */ 
///*  67 */     if (item.b().equals(wk.bJ)) {
///*  68 */       frame.renderFrameItemAsBlock(render, item.b());
///*     */     }
///*  70 */     if ((item.b() instanceof uo)) {
///*  71 */       ArmorHelper ah = new ArmorHelper();
///*  72 */       ah.setArmorModel((bbz)theItem, item, ((uo)item.b()).b, armorFilenamePrefix[((uo)item.b()).d]);
///*     */     }
///*  74 */     if (scale) {
///*  75 */       GL11.glScalef(0.5F, 0.5F, 0.5F);
///*     */     }
///*  77 */     if ((item.b() instanceof wq)) {
///*  78 */       helper.cartzz(item, theItem, render, data);
///*     */     }
///*  80 */     if (blockToRender != null) {
///*  81 */       render.a(blockToRender, 0, 1.0F);
///*     */     }
///*  83 */     theItem.a((mp)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
///*     */ 
///*  85 */     if (((item.b() instanceof ww)) || (item.b().equals(wk.bE))) {
///*  86 */       potionContent((mp)data[1], item, theItem);
///*     */     }
///*  88 */     if ((item.b() instanceof vx)) {
///*  89 */       GL11.glScalef(0.5F, 0.5F, 0.5F);
///*  90 */       ((enderball)theItem).renderEye((mp)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
///*  91 */       GL11.glEnable(3042);
///*  92 */       GL11.glDisable(2896);
///*  93 */       GL11.glBlendFunc(1, 771);
///*  94 */       GL11.glColor4f(1.0F, 0.5F, 0.0F, 0.2F);
///*  95 */       ((enderball)theItem).renderBall((mp)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
///*     */     }
///*     */ 
///*  98 */     if (((item.b() instanceof ww)) || (item.b().equals(wk.bu)) || (item.b().equals(wk.bE))) {
///*  99 */       GL11.glEnable(3042);
///* 100 */       GL11.glDisable(2896);
///* 101 */       GL11.glBlendFunc(1, 771);
///* 102 */       GL11.glColor4f(0.2F, 0.2F, 0.2F, 0.2F);
///* 103 */       ((bottle)theItem).renderBottle((mp)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
///*     */     }
///* 105 */     if ((item.b() instanceof vy)) {
///* 106 */       GL11.glScalef(0.5F, 0.5F, 0.5F);
///* 107 */       GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.0F);
///* 108 */       ((enderball)theItem).renderBall((mp)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
///*     */     }
///* 110 */     if (((item.b() instanceof vy)) || ((item.b() instanceof vx))) {
///* 111 */       GL11.glEnable(3042);
///* 112 */       GL11.glDisable(2896);
///* 113 */       GL11.glBlendFunc(1, 771);
///* 114 */       GL11.glColor4f(0.3F, 0.3F, 0.3F, 0.3F);
///* 115 */       GL11.glTranslatef(-0.02F, 0.05F, -0.001F);
///* 116 */       GL11.glScalef(1.3F, 1.3F, 1.3F);
///* 117 */       ((enderball)theItem).renderBall((mp)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
///*     */     }
///* 119 */     GL11.glPopMatrix();
///*     */   }
///*     */ 
///*     */   public void potionContent(mp p, wm item, bcd theItem)
///*     */   {
///* 125 */     Minecraft mc = Minecraft.x();
///* 126 */     mc.p.b("/subaraki/3d/bottle.png");
///* 127 */     GL11.glEnable(3042);
///* 128 */     GL11.glDisable(2896);
///* 129 */     GL11.glBlendFunc(1, 771);
///* 130 */     if ((p instanceof sq))
///*     */     {
///* 132 */       sq player = (sq)p;
///* 133 */       if (player.cd() != null)
///*     */       {
///* 135 */         if ((item.b().equals(wk.bt)) || (item.b().equals(wk.bu)))
///*     */         {
///* 137 */           int color = ((ww)item.b()).g(item.k());
///* 138 */           float red = (color >> 16 & 0xFF) / 255.0F;
///* 139 */           float green = (color >> 8 & 0xFF) / 255.0F;
///* 140 */           float blue = (color & 0xFF) / 255.0F;
///* 141 */           GL11.glColor4f(red, green, blue, 1.0F);
///* 142 */           ((bottle)theItem).renderContent(p, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
///*     */         }
///* 144 */         else if (player.cd().b().equals(wk.bE))
///*     */         {
///* 146 */           GL11.glColor4f(0.7F, 1.0F, 0.0F, 1.0F);
///* 147 */           ((bottle)theItem).renderContent(p, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
///*     */         }
///*     */       }
///*     */     }
///*     */   }
///*     */ }
//
///* Location:           C:\Users\Axel\Downloads\1.5.2 3DItems.zip
// * Qualified Name:     threeDitems.helper.CaseFirstPerson
// * JD-Core Version:    0.6.2
// */