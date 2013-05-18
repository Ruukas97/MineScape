package dk.gamingtutsdk.minescape.lib;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class MineScapeMaterials
{
	public static EnumToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 5, 1, 1.5F, 0, 1);
	public static EnumToolMaterial IRON = EnumHelper.addToolMaterial("IRON", 6, 1, 2.5F, 1, 1);
	public static EnumToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 7, 1, 4.0F, 2, 1);
	public static EnumToolMaterial BLACK = EnumHelper.addToolMaterial("BLACK", 8, 1, 4.0F, 3, 1);
	public static EnumToolMaterial WHITE = EnumHelper.addToolMaterial("WHITE", 9, 1, 4.0F, 3, 1);
	public static EnumToolMaterial MITHRIL = EnumHelper.addToolMaterial("MITHRIL", 10, 1, 6.0F, 4, 1);
	public static EnumToolMaterial ADAMANT = EnumHelper.addToolMaterial("ADAMANT", 11, 1, 7.0F, 5, 1);
	public static EnumToolMaterial RUNE = EnumHelper.addToolMaterial("RUNE", 12, 1, 8.0F, 6, 1);
	public static EnumToolMaterial DRAGON = EnumHelper.addToolMaterial("DRAGON", 13, 1, 10.0F, 8, 1);
}

/**Vanilla materials
 *  WOOD(0, 59, 2.0F, 0, 15),
 *  STONE(1, 131, 4.0F, 1, 5),
 *  IRON(2, 250, 6.0F, 2, 14),
 *  EMERALD(3, 1561, 8.0F, 3, 10),
 *  GOLD(0, 32, 12.0F, 0, 22);
**/