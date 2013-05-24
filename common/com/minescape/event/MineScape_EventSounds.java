package com.minescape.event;

import com.minescape.MineScape;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class MineScape_EventSounds
{
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try 
        {
            event.manager.soundPoolSounds.addSound("mobs/grim.ogg", MineScape.class.getResource("/mods/minescape/sounds/mobs/grim.ogg"));            
        
        } 
        catch (Exception e)
        {
            System.err.println("Failed to register one or more sounds.");
        }
    }
}