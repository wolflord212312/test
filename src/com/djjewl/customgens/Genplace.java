package com.djjewl.customgens;

import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.djjewl.customgens.files.customconfig;

public class Genplace implements Listener{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
    Player p = event.getPlayer();
    p.sendMessage("welcome!!");
    }
    @SuppressWarnings("deprecation")
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event)
	{
	Player player = event.getPlayer();
	ItemStack item = event.getItemInHand();
	Block block = event.getBlockPlaced();
	ItemStack b = player.getItemInHand();
    ItemMeta itemMeta = b.getItemMeta();
    String blockname = itemMeta.getDisplayName();
    List<String> lore = itemMeta.getLore();
    if(lore != null){
	if(blockname.contains("Generator") && lore.contains(customconfig.get().getString("settings.lore"))) {
		player.sendMessage("Confirmed placement of : "+blockname);
	}}
    else {
    	return;
    	}
	}
}
