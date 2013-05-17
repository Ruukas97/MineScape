package dk.gamingtutsdk.minescape.core.handler;

import java.util.logging.Level;
import java.util.logging.Logger;


import cpw.mods.fml.common.FMLLog;
import dk.gamingtutsdk.minescape.lib.Reference;

public class LoggerHandler 
{
	
	private static Logger log = Logger.getLogger(Reference.MOD_ID);
	
	public static void initLog()
	{
		log.getParent();
	}
	
	public static void log(Level level, String message) 
	{
		FMLLog.log(Reference.MOD_NAME, level, message);
	}
	
}
