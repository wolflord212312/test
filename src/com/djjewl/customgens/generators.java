package com.djjewl.customgens;


import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.djjewl.customgens.files.customconfig;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
public class generators extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new Genplace(), this);
    	//setup config
    	getConfig().options().copyDefaults();
    	saveDefaultConfig();
    	customconfig.setup();
    	customconfig.get().addDefault("Generators",true );
    	customconfig.get().options().copyDefaults(true);
    	customconfig.save();
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


