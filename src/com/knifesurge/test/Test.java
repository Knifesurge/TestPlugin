package com.knifesurge.test;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import com.knifesurge.test.commands.BlockCommand;
import com.knifesurge.test.commands.CubeCommand;
import com.knifesurge.test.commands.LocationCommand;
import com.knifesurge.test.commands.RemuuCommand;
import com.knifesurge.test.commands.SwastikaCommand;

public class Test extends JavaPlugin{

	public void onEnable()
	{
		System.out.println("(!) Custom plugin works!!");
		this.getCommand("remuu").setExecutor((CommandExecutor)new RemuuCommand());
		this.getCommand("location").setExecutor((CommandExecutor)new LocationCommand());
		this.getCommand("change").setExecutor((CommandExecutor)new BlockCommand());
		this.getCommand("build").setExecutor((CommandExecutor)new CubeCommand());
		this.getCommand("swas").setExecutor((CommandExecutor)new SwastikaCommand());
	}
	
	public void onDisable()
	{
		System.out.println("(!) Disabling Rem Plugin");
	}
}
