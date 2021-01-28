package com.themonomew.Manhunt.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.themonomew.Manhunt.Main;

public class HunterCommand implements CommandExecutor {
	private Main plugin;
	
	public HunterCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("manhunt").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		this.plugin.hunted = args[0];
		sender.sendMessage(ChatColor.GREEN + plugin.hunted + " is now being hunted. Have fun!");
		
		return true;
	}
	
}
