package com.knifesurge.test.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;

public class PigSpawnCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			Player player = (Player)sender;
			World world = player.getWorld();
			Location spot = player.getLocation();
			Pig pig = (Pig) world.spawnEntity(spot, EntityType.PIG);
			pig.setCustomName("Fred");
			pig.setGlowing(true);
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Spawned Pig at ("+(int)spot.getX()+"&6, "+(int)spot.getY()+"&6, "+(int)spot.getZ()+"&6)"));
		} else {}
		return true;
	}

}
