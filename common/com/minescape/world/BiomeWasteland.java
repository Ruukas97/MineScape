package com.minescape.world;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeWasteland extends BiomeGenBase
{

	public BiomeWasteland(int id) 
	{
		super(id);
		topBlock = (byte) Block.grass.blockID;
		fillerBlock = (byte) Block.dirt.blockID;
		setColor(16421912);
		setBiomeName("Wasteland");
		setDisableRain();
		setTemperatureRainfall(2.0F, 0.0F);
		setMinMaxHeight(0.1F, 0.1F);
		theBiomeDecorator.treesPerChunk = -999;
		theBiomeDecorator.grassPerChunk = -999;
		theBiomeDecorator.flowersPerChunk = -999;
	}
	
	@Override
    public float getSpawningChance()
    {
        return 0F;
    }

}
