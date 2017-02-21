package com.knifesurge.test.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CubeCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player)
		{
			Player player = (Player)sender;
			World world = player.getWorld();
			int offset = 2;
			Location spot = player.getLocation();
			
			for(int x=0;x<3;x++)
				for(int y=0;y<3;y++)
					for(int z=0;z<3;z++)
						world.getBlockAt((int)spot.getX()+x, (int)spot.getY()+y, (int)spot.getZ()+z+offset).setType(Material.GLOWSTONE);
						//world.getBlockAt(x,y,z).setType(Material.GLOWSTONE);
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',  "&6Built at ("+((int)spot.getX())+"&6, "+(int)spot.getY()+"&6, "+((int)spot.getZ()+offset)+"&6)"));
		} else
		{
			
		}
		
		return true;
	}

}
