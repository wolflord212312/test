package com.djjewl.customgens;


import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.djjewl.customgens.files.customconfig;
import com.djjewl.customgens.commands.message;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class generators extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new Genplace(), this);
    	//setup config
    	getConfig().options().copyDefaults();
    	saveDefaultConfig();
    	customconfig.setup();
    	customconfig.get().addDefault("Bootmsg", "enabled");
    	customconfig.get().options().copyDefaults(true);
    	customconfig.save();
    	
    	getCommand("message").setExecutor(new message());
    }

    @Override
    public void onDisable() {
    	
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (command.getName().equalsIgnoreCase("addgen")) {
            	ArrayList<String> lore = new ArrayList<String>();
            	Material m = Material.COBBLESTONE;
            	ItemStack cobblestone =new ItemStack(m);
                ItemMeta itemMeta = cobblestone.getItemMeta();
                itemMeta.setDisplayName(m.toString()+" Generator");
                lore.add("IGENZ");
                itemMeta.setLore(lore);
            	cobblestone.setItemMeta(itemMeta);
            	player.getInventory().addItem(cobblestone);}
            	
            }    
  
        
    	return true;
    }
}		


