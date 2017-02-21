package com.knifesurge.test.commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SwastikaCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			World world = player.getWorld();
			Location spot = player.getLocation();
			
			int offset = 3;
			
			int swas[][] = {
					{1,0,0,1,1,1,1},
					{1,0,0,1,0,0,0},
					{1,0,0,1,0,0,0},
					{1,1,1,1,1,1,1},
					{0,0,0,1,0,0,1},
					{0,0,0,1,0,0,1},
					{1,1,1,1,0,0,1}
			};
			
			for(int x=0; x<7; x++)
				for(int y=0; y<7; y++)
				{
					if(swas[x][y] == 1)
						world.getBlockAt((int)spot.getX()+x+offset, (int)spot.getY()+y,(int)spot.getZ()).setType(Material.GLOWSTONE);
				}
			
		} else
		{
			
		}
		return true;
	}

}
