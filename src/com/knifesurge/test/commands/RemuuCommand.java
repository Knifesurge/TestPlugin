package com.knifesurge.test.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RemuuCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player)sender;
		if(sender instanceof Player)
		{
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Rem loves you <3"));
		} else
		{
			player.sendMessage("Not available in the terminal!");
		}
		return true;
	}
}
