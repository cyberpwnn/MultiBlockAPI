package com.ulticraft.multiblockapi;

public class MultiBlock
{
	private MultiBlockLocation location;
	private MultiBlockStructure structure;
	
	public MultiBlock(int width, int height, int depth, int x, int y, int z, MultiBlockStructure structure)
	{
		this.location = new MultiBlockLocation(x, y, z, width, height, depth);
		this.structure = structure;
	}
	
	public MultiBlock(MultiBlockLocation location, MultiBlockStructure structure)
	{
		this.location = location;
		this.structure = structure;
	}

	public MultiBlockLocation getLocation()
	{
		return location;
	}

	public void setLocation(MultiBlockLocation location)
	{
		this.location = location;
	}

	public MultiBlockStructure getStructure()
	{
		return structure;
	}

	public void setStructure(MultiBlockStructure structure)
	{
		this.structure = structure;
	}
}
