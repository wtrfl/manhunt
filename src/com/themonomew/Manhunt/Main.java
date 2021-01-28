package com.themonomew.Manhunt;

import org.bukkit.plugin.java.JavaPlugin;

import com.themonomew.Manhunt.commands.HunterCommand;
import com.themonomew.Manhunt.listeners.CompassListener;
import com.themonomew.Manhunt.listeners.RespawnListener;

public class Main extends JavaPlugin {
	
	public String hunted = "";
	
	@Override
	public void onEnable() {
		new HunterCommand(this);
		new CompassListener(this);
		new RespawnListener(this);
	}
	
}
