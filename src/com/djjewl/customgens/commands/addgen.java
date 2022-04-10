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
            	ArrayList<String> lore = new ArrayList<String>();
            	Material m = Material.COBBLESTONE;
            	ChatColor c = ChatColor.valueOf(customconfig.get().getString("Generator.color"));
            	ItemStack cobblestone =new ItemStack(m);
                ItemMeta itemMeta = cobblestone.getItemMeta();
                itemMeta.setDisplayName(c +customconfig.get().getString("Generator.name")+" Generator");
                lore.add(customconfig.get().getString("settings.lore"));
                itemMeta.setLore(lore);
            	cobblestone.setItemMeta(itemMeta);
            	player.getInventory().addItem(cobblestone);}
            	
            }    
        
    	return true;
    }
}
