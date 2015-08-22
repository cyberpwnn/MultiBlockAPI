package com.ulticraft.multiblockapi;

import java.util.ArrayList;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class MultiBlockRegistry implements Listener
{
	private ArrayList<MultiBlockStructure> multiBlocks;
	
	public MultiBlockRegistry(MultiBlockAPI api)
	{
		multiBlocks = new ArrayList<MultiBlockStructure>();
		api.getServer().getPluginManager().registerEvents(this, api);
	}
	
	public void registerMultiBlockStructure(MultiBlockStructure structure)
	{
		multiBlocks.add(structure);
	}
	
	public ArrayList<MultiBlockStructure> getMultiBlockStructures()
	{
		return multiBlocks;
	}
	
	@EventHandler
	public void onStructurePlace(BlockPlaceEvent e)
	{
		for(MultiBlockStructure i : multiBlocks)
		{
			i.match(e.getBlock());
		}
	}
}
