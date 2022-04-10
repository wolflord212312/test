package com.djjewl.customgens.commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.djjewl.customgens.files.customconfig;

public class addgen implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (command.getName().equalsIgnoreCase("addgen")) {
            	if(args.length  > 3){
            		player.sendMessage("/addgen (BLOCK) (ITEM) (NAME)");
            	
            		
            	}
            	else {
            		Material b= Material.getMaterial(args[0]);
            		Material i= Material.getMaterial(args[1]);
            		String n = args[2];
            		player.sendMessage("added: "+n+"block"+b+"item"+i);
            		
            	}
            		
            }    
        
           
    }
        return true;
  }
}
