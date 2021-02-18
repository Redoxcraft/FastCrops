package de.redoxcraft.fastcrops.listener;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import net.md_5.bungee.api.ChatColor;

public class CancelBreakFarmlandListener implements Listener {
	
	@EventHandler
	public void onPlayerBreakFarmland(BlockBreakEvent e) {
		Object o = e.getBlock().getRelative(BlockFace.UP,1).getType();
		if(e.getBlock().getType().equals(Material.FARMLAND)) {
			if(o.equals(Material.WHEAT) || o.equals(Material.POTATOES) || o.equals(Material.CARROTS) || o.equals(Material.BEETROOTS)) {
				e.setCancelled(true);
				e.getPlayer().sendMessage("Bitte Ernte das Feld ab, bevor du es abbaust." + ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + " *Du begutachtest deine schmutzigen Hände*");
			}return;
		}else if(e.getBlock().getType().equals(Material.SOUL_SAND)) {
			if(o.equals(Material.NETHER_WART)) {
				e.setCancelled(true);
				e.getPlayer().sendMessage("Bitte Ernte die Netherwarzen, bevor du den Seelensand abbaust." + ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + " *Du hörst die verlorenen Seelen kreischen*");
			}return;
		}return;
	}

}
