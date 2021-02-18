package de.redoxcraft.fastcrops.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.redoxcraft.fastcrops.listener.BreakCropsListener;
import de.redoxcraft.fastcrops.listener.CancelBreakFarmlandListener;
import de.redoxcraft.fastcrops.listener.FastCropsListener;

public class Main extends JavaPlugin {

	public void onEnable() {
		System.out.println(this.getDescription().getName() + " " + this.getDescription().getVersion() + " geladen.");
		
		PluginManager PluginManager = Bukkit.getPluginManager();
		PluginManager.registerEvents(new FastCropsListener(), this);
		PluginManager.registerEvents(new BreakCropsListener(), this);
		PluginManager.registerEvents(new CancelBreakFarmlandListener(), this);
	}
	
}
