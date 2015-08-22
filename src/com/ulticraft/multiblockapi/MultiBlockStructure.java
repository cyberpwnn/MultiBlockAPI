package com.ulticraft.multiblockapi;

import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class MultiBlockStructure
{
	private int width;
	private int height;
	private int depth;
	
	private HashMap<MultiBlockStructureLocation, Material> structure;
	
	public MultiBlockStructure(int width, int height, int depth)
	{
		structure = new HashMap<MultiBlockStructureLocation, Material>();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public int getDepth()
	{
		return depth;
	}
	
	public HashMap<MultiBlockStructureLocation, Material> getStructure()
	{
		return structure;
	}
	
	public void setStructure(HashMap<MultiBlockStructureLocation, Material> structure)
	{
		this.structure = structure;
	}
	
	public void setMaterial(int x, int y, int z, Material m)
	{
		setMaterial(new MultiBlockStructureLocation(x, y, z), m);
	}
	
	public void setMaterial(MultiBlockStructureLocation l, Material m)
	{
		if(isValidCoordinate(l))
		{
			structure.put(l, m);
		}
	}
	
	public Material getMaterial(int x, int y, int z)
	{
		return getMaterial(new MultiBlockStructureLocation(x, y, z));
	}
	
	public Material getMaterial(MultiBlockStructureLocation l)
	{
		return structure.get(l);
	}
	
	public boolean isValidCoordinate(int x, int y, int z)
	{
		if(x > 0 && x <= width && y > 0 && y <= height && z > 0 && z <= depth)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isValidCoordinate(MultiBlockStructureLocation l)
	{
		return isValidCoordinate(l.getX(), l.getY(), l.getZ());
	}
	
	public void verboseBlockStructure(MultiBlockAPI api)
	{
		for(MultiBlockStructureLocation i : structure.keySet())
		{
			api.verbose("[" + i.getX() + ", " + i.getY() + ", " + i.getZ() + "]: " + structure.get(i).toString());
		}
	}
	
	public ArrayList<MultiBlockStructureLocation> getAllLocations(Material m)
	{
		ArrayList<MultiBlockStructureLocation> l = new ArrayList<MultiBlockStructureLocation>();
		
		for(MultiBlockStructureLocation i : structure.keySet())
		{
			if(getMaterial(i).equals(m))
			{
				l.add(i);
			}
		}
		
		return l;
	}
	
	public boolean contains(Material m)
	{
		return !getAllLocations(m).isEmpty();
	}
	
	public MultiBlock match(Block block)
	{
		return null;
	}
}
