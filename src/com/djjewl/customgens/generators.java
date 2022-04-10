package com.djjewl.customgens;

import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import com.djjewl.customgens.files.customconfig;
import com.djjewl.customgens.commands.*;

public class generators extends JavaPlugin  {

    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new Genplace(), this);
    	getConfig().options().copyDefaults();
    	saveDefaultConfig();
    	customconfig.setup();
    	customconfig.get().addDefault("Version", getDescription().getVersion());
    	customconfig.get().addDefault("settings.upgradable", true);
    	customconfig.get().addDefault("settings.lore", "Igenz");
    	customconfig.get().addDefault("Generator.name", "&4Coal");
    	customconfig.get().addDefault("Generator.color", "RED");
    	customconfig.get().addDefault("Generator.item", Material.COAL);
    	customconfig.get().addDefault("Generator.time", 10);
    	customconfig.get().options().copyDefaults(true);
    	customconfig.save();
    	getCommand("addgen").setExecutor(new addgen());
    }

    @Override
    public void onDisable() {
    	
    }

}		


