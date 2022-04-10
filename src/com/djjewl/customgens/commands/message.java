package com.djjewl.customgens.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


import com.djjewl.customgens.files.customconfig;

public class message implements CommandExecutor{
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(customconfig.get().getString("Bootmsg"));
        	}
        return true;
        }
	}
