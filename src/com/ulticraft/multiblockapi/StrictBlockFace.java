package com.ulticraft.multiblockapi;

import org.bukkit.block.BlockFace;

public class StrictBlockFace
{
	public enum StrictFace
	{
		NORTH, WEST, SOUTH, EAST, UP, DOWN
	}
	
	public static BlockFace toBlockFace(StrictFace f)
	{
		if(f.equals(StrictFace.NORTH))
		{
			return BlockFace.NORTH;
		}
		
		else if(f.equals(StrictFace.SOUTH))
		{
			return BlockFace.SOUTH;
		}
		
		else if(f.equals(StrictFace.EAST))
		{
			return BlockFace.EAST;
		}
		
		else if(f.equals(StrictFace.WEST))
		{
			return BlockFace.WEST;
		}
		
		else if(f.equals(StrictFace.UP))
		{
			return BlockFace.UP;
		}
		
		else if(f.equals(StrictFace.DOWN))
		{
			return BlockFace.DOWN;
		}
		
		else
		{
			return BlockFace.UP;
		}
	}
}
