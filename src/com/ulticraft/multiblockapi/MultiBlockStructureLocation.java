package com.ulticraft.multiblockapi;

import com.ulticraft.multiblockapi.StrictBlockFace.StrictFace;

public class MultiBlockStructureLocation
{
	private int x;
	private int y;
	private int z;
	
	public MultiBlockStructureLocation(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public int getZ()
	{
		return z;
	}
	
	public MultiBlockStructureLocation getRelative(StrictFace j)
	{
		if(j.equals(StrictFace.UP))
		{
			return new MultiBlockStructureLocation(x, y+1, z);
		}
		
		else if(j.equals(StrictFace.DOWN))
		{
			return new MultiBlockStructureLocation(x, y-1, z);
		}
		
		else if(j.equals(StrictFace.EAST))
		{
			return new MultiBlockStructureLocation(x+1, y, z);
		}
		
		else if(j.equals(StrictFace.WEST))
		{
			return new MultiBlockStructureLocation(x-1, y, z);
		}
		
		else if(j.equals(StrictFace.SOUTH))
		{
			return new MultiBlockStructureLocation(x, y, z+1);
		}
		
		else if(j.equals(StrictFace.NORTH))
		{
			return new MultiBlockStructureLocation(x-1, y, z-1);
		}
		
		return this;
	}
}
