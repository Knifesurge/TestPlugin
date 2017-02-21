package com.knifesurge.test.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LocationCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player instanceof Player)
		{
			Location spot = player.getEyeLocation();
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6X: " + spot.getX() + ", Y: " + spot.getY() + ", Z: " + spot.getZ()));
		} else
		{
			player.sendMessage("Unavailable in console");
		}
		return true;
	}

}
