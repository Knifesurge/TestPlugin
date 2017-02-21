package com.knifesurge.test.commands;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BlockCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player instanceof Player)
		{
			Block block = player.getLocation().subtract(0, 1, 0).getBlock();
			Material type = block.getType();
			if(type.isSolid())
				block.setType(Material.GLOWSTONE);
		} else
		{
			
		}
		return true;
	}

}
