package com.ulticraft.multiblockapi;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class MultiBlockAPI extends JavaPlugin
{
	private Logger logger;
	private boolean enableVerbose;
	private MultiBlockRegistry mbr;
	
	@Override
	public void onEnable()
	{
		logger = getLogger();
		enableVerbose = true;
		
		mbr = new MultiBlockRegistry(this);
		MultiBlockStructure s = new MultiBlockStructure(2, 1, 2);
		s.setMaterial(1, 1, 1, Material.REDSTONE_BLOCK);
		s.setMaterial(1, 1, 2, Material.IRON_BLOCK);
		s.setMaterial(2, 1, 1, Material.GOLD_BLOCK);
		s.setMaterial(2, 1, 2, Material.REDSTONE_BLOCK);
		
		mbr.registerMultiBlockStructure(s);
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	public void info(String msg)
	{
		logger.info(msg);
	}
	
	public void warn(String msg)
	{
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "WARN: " + msg);
	}
	
	public void fatal(String msg)
	{
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "FATAL: " + msg);
	}
	
	public void verbose(String msg)
	{
		if(enableVerbose)
		{
			getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "VERBOSE: " + msg);
		}
	}
}
