package com.knifesurge.test.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceListener implements Listener{

	private com.knifesurge.test.Test plugin;
	
	public BlockPlaceListener(com.knifesurge.test.Test plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event)
	{
		
	}
}
