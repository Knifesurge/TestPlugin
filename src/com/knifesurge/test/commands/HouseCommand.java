package com.knifesurge.test.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HouseCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			World world = player.getWorld();
			Location spot = player.getLocation();
			Material material = spot.subtract(0,1,0).getBlock().getType();
			int house[][][] =
			{
				{
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1}
				},
				{
					{1,1,1,1},
					{1,0,0,1},
					{3,0,0,1},
					{1,0,0,1},
					{1,1,1,1}
				},
				{
					{1,2,2,1},
					{1,0,0,1},
					{3,0,4,1},
					{1,0,0,1},
					{1,1,1,1}
				},
				{
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1}
				}
			};
			
			Material type;
			if(material.isSolid())
			{
				for(int x=0; x < 5; x++)
					for(int y=0; y < 4; y++)
						for(int z=0; z < 4; z++)
						{
							
							switch(house[y][x][z])
							{
								case 0:
									type = Material.AIR;break;
								case 1:
									type = Material.WOOD;break;
								case 2:
									type = Material.GLASS;break;
								case 3:
									type = Material.WOOD_DOOR;break;
								case 4:
									type = Material.TORCH;break;
								default:
									type = Material.GLOWSTONE;
									
							}	
							world.getBlockAt((int)spot.getX()+x, (int)spot.getY()+y,(int)spot.getZ()+z).setType(type);
						}
			} else
			{
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Can't use this while flying!"));
			}
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',  "&6Built at ("+((int)spot.getX())+"&6, "+(int)spot.getY()+"&6, "+((int)spot.getZ())+"&6)"));
		} else
		{
			
		}
		return true;
	}

}
