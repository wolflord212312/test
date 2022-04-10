package com.djjewl.customgens;


import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.djjewl.customgens.files.customconfig;
import com.djjewl.customgens.commands.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class generators extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new Genplace(), this);
    	getConfig().options().copyDefaults();
    	saveDefaultConfig();
    	customconfig.setup();
    	customconfig.get().addDefault("Version", getDescription().getVersion());
    	customconfig.get().addDefault("settings.upgradable", true);
    	customconfig.get().addDefault("settings.lore", "Igenz");
    	customconfig.get().addDefault("Generator.name", "Coal");
    	customconfig.get().addDefault("Generator.item",Material.COAL);
    	customconfig.get().addDefault("Generator.time", 10);
    	customconfig.get().options().copyDefaults(true);
    	customconfig.save();
    	getCommand("addgen").setExecutor(new addgen());
    }

    @Override
    public void onDisable() {
    	
    }

}		


