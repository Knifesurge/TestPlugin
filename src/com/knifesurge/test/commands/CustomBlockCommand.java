package com.knifesurge.test.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CustomBlockCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			World world = player.getWorld();
			Location spot = player.getLocation();
		} else {}
		return false;
	}

}
