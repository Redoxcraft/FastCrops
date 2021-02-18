package de.redoxcraft.fastcrops.listener;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.BlockData;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class BreakCropsListener implements Listener {

	@EventHandler
	public void onPlayerBreakCrop(BlockBreakEvent e) {
		Player p = e.getPlayer();
		Block b = e.getBlock();
		Location bloc = e.getBlock().getLocation();
		
		if(b.getType().equals(Material.WHEAT)) {
			BlockData bdata = b.getBlockData();
			Ageable bage = (Ageable) bdata;
			if(bage.getAge() == bage.getMaximumAge()) {
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT));
				if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
					int randomSeeds = (int) (Math.random()*(16));
					if(randomSeeds == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 1));
						return;
					}else if(randomSeeds >= 1 && randomSeeds <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 2));
						return;
					}else if(randomSeeds >= 3 && randomSeeds <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 3));
						return;
					}else if(randomSeeds >= 6 && randomSeeds <= 9) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 4));
						return;
					}else if(randomSeeds >= 10 && randomSeeds <= 12) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 5));
						return;
					}else if(randomSeeds >= 13 && randomSeeds <= 14) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 6));
						return;
					}else if(randomSeeds == 15) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 7));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
					int randomSeeds = (int) (Math.random()*(12));
					if(randomSeeds == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 1));
						return;
					}else if(randomSeeds >= 1 && randomSeeds <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 2));
						return;
					}else if(randomSeeds >= 3 && randomSeeds <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 3));
						return;
					}else if(randomSeeds >= 6 && randomSeeds <= 8) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 4));
						return;
					}else if(randomSeeds >= 9 && randomSeeds <= 10) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 5));
						return;
					}else if(randomSeeds == 11) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 6));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
					int randomSeeds = (int) (Math.random()*(9));
					if(randomSeeds == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 1));
						return;
					}else if(randomSeeds >= 1 && randomSeeds <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 2));
						return;
					}else if(randomSeeds >= 3 && randomSeeds <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 3));
						return;
					}else if(randomSeeds >= 6 && randomSeeds <= 7) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 4));
						return;
					}else if(randomSeeds == 8) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 5));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 0) {
					int randomSeeds = (int) (Math.random()*(6));
					if(randomSeeds == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 1));
						return;
					}else if(randomSeeds >= 1 && randomSeeds <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 2));
						return;
					}else if(randomSeeds >= 3 && randomSeeds <= 4) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 3));
						return;
					}else if(randomSeeds == 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.WHEAT_SEEDS, 4));
						return;
					}
				}else {
					p.sendMessage("FastCropsBreak-Error: Enchantment.LOOT_BONUS_BLOCKS != 0-3. Bitte melde den Fehler einem" + ChatColor.RED + " Admin.");
					return;
				}
			}else {
				return;
			}
		}else if(b.getType().equals(Material.POTATOES)) {
			BlockData bdata = b.getBlockData();
			Ageable bage = (Ageable) bdata;
			if(bage.getAge() == bage.getMaximumAge()) {
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				int randomPoisonousPotato = (int) (Math.random()*(50));
				if(randomPoisonousPotato == 13) {
					p.getWorld().dropItem(bloc, new ItemStack(Material.POISONOUS_POTATO, 1));
				}
				if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
					int randomPotato = (int) (Math.random()*(16));
					if(randomPotato == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 2));
						return;
					}else if(randomPotato >= 1 && randomPotato <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 3));
						return;
					}else if(randomPotato >= 3 && randomPotato <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 4));
						return;
					}else if(randomPotato >= 6 && randomPotato <= 9) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 5));
						return;
					}else if(randomPotato >= 10 && randomPotato <= 12) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 6));
						return;
					}else if(randomPotato >= 13 && randomPotato <= 14) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 7));
						return;
					}else if(randomPotato == 15) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 8));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
					int randomPotato = (int) (Math.random()*(12));
					if(randomPotato == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 2));
						return;
					}else if(randomPotato >= 1 && randomPotato <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 3));
						return;
					}else if(randomPotato >= 3 && randomPotato <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 4));
						return;
					}else if(randomPotato >= 6 && randomPotato <= 8) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 5));
						return;
					}else if(randomPotato >= 9 && randomPotato <= 10) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 6));
						return;
					}else if(randomPotato == 11) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 7));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
					int randomPotato = (int) (Math.random()*(9));
					if(randomPotato == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 2));
						return;
					}else if(randomPotato >= 1 && randomPotato <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 3));
						return;
					}else if(randomPotato >= 3 && randomPotato <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 4));
						return;
					}else if(randomPotato >= 6 && randomPotato <= 7) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 5));
						return;
					}else if(randomPotato == 8) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 6));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 0) {
					int randomPotato = (int) (Math.random()*(6));
					if(randomPotato == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 2));
						return;
					}else if(randomPotato >= 1 && randomPotato <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 3));
						return;
					}else if(randomPotato >= 3 && randomPotato <= 4) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 4));
						return;
					}else if(randomPotato == 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.POTATO, 5));
						return;
					}
				}else {
					p.sendMessage("FastCropsBreak-Error: Enchantment.LOOT_BONUS_BLOCKS != 0-3. Bitte melde den Fehler einem" + ChatColor.RED + " Admin.");
					return;
				}
			}else {
				return;
			}
		}else if(b.getType().equals(Material.CARROTS)) {
			BlockData bdata = b.getBlockData();
			Ageable bage = (Ageable) bdata;
			if(bage.getAge() == bage.getMaximumAge()) {
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
					int randomCarrot = (int) (Math.random()*(16));
					if(randomCarrot == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 2));
						return;
					}else if(randomCarrot >= 1 && randomCarrot <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 3));
						return;
					}else if(randomCarrot >= 3 && randomCarrot <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 4));
						return;
					}else if(randomCarrot >= 6 && randomCarrot <= 9) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 5));
						return;
					}else if(randomCarrot >= 10 && randomCarrot <= 12) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 6));
						return;
					}else if(randomCarrot >= 13 && randomCarrot <= 14) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 7));
						return;
					}else if(randomCarrot == 15) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 8));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
					int randomCarrot = (int) (Math.random()*(12));
					if(randomCarrot == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 2));
						return;
					}else if(randomCarrot >= 1 && randomCarrot <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 3));
						return;
					}else if(randomCarrot >= 3 && randomCarrot <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 4));
						return;
					}else if(randomCarrot >= 6 && randomCarrot <= 8) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 5));
						return;
					}else if(randomCarrot >= 9 && randomCarrot <= 10) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 6));
						return;
					}else if(randomCarrot == 11) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 7));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
					int randomCarrot = (int) (Math.random()*(9));
					if(randomCarrot == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 2));
						return;
					}else if(randomCarrot >= 1 && randomCarrot <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 3));
						return;
					}else if(randomCarrot >= 3 && randomCarrot <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 4));
						return;
					}else if(randomCarrot >= 6 && randomCarrot <= 7) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 5));
						return;
					}else if(randomCarrot == 8) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 6));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 0) {
					int randomCarrot = (int) (Math.random()*(6));
					if(randomCarrot == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 2));
						return;
					}else if(randomCarrot >= 1 && randomCarrot <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 3));
						return;
					}else if(randomCarrot >= 3 && randomCarrot <= 4) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 4));
						return;
					}else if(randomCarrot == 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.CARROT, 5));
						return;
					}
				}else {
					p.sendMessage("FastCropsBreak-Error: Enchantment.LOOT_BONUS_BLOCKS != 0-3. Bitte melde den Fehler einem" + ChatColor.RED + " Admin.");
					return;
				}
			}else {
				return;
			}
		}else if(b.getType().equals(Material.BEETROOTS)) {
			BlockData bdata = b.getBlockData();
			Ageable bage = (Ageable) bdata;
			if(bage.getAge() == bage.getMaximumAge()) {
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT));
				if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
					int randomBeetrootSeeds = (int) (Math.random()*(16));
					if(randomBeetrootSeeds == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 1));
						return;
					}else if(randomBeetrootSeeds >= 1 && randomBeetrootSeeds <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 2));
						return;
					}else if(randomBeetrootSeeds >= 3 && randomBeetrootSeeds <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 3));
						return;
					}else if(randomBeetrootSeeds >= 6 && randomBeetrootSeeds <= 9) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 4));
						return;
					}else if(randomBeetrootSeeds >= 10 && randomBeetrootSeeds <= 12) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 5));
						return;
					}else if(randomBeetrootSeeds >= 13 && randomBeetrootSeeds <= 14) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 6));
						return;
					}else if(randomBeetrootSeeds == 15) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 7));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
					int randomBeetrootSeeds = (int) (Math.random()*(12));
					if(randomBeetrootSeeds == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 1));
						return;
					}else if(randomBeetrootSeeds >= 1 && randomBeetrootSeeds <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 2));
						return;
					}else if(randomBeetrootSeeds >= 3 && randomBeetrootSeeds <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 3));
						return;
					}else if(randomBeetrootSeeds >= 6 && randomBeetrootSeeds <= 8) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 4));
						return;
					}else if(randomBeetrootSeeds >= 9 && randomBeetrootSeeds <= 10) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 5));
						return;
					}else if(randomBeetrootSeeds == 11) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 6));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
					int randomBeetrootSeeds = (int) (Math.random()*(9));
					if(randomBeetrootSeeds == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 1));
						return;
					}else if(randomBeetrootSeeds >= 1 && randomBeetrootSeeds <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 2));
						return;
					}else if(randomBeetrootSeeds >= 3 && randomBeetrootSeeds <= 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 3));
						return;
					}else if(randomBeetrootSeeds >= 6 && randomBeetrootSeeds <= 7) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 4));
						return;
					}else if(randomBeetrootSeeds == 8) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 5));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 0) {
					int randomBeetrootSeeds = (int) (Math.random()*(6));
					if(randomBeetrootSeeds == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 1));
						return;
					}else if(randomBeetrootSeeds >= 1 && randomBeetrootSeeds <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 2));
						return;
					}else if(randomBeetrootSeeds >= 3 && randomBeetrootSeeds <= 4) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 3));
						return;
					}else if(randomBeetrootSeeds == 5) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.BEETROOT_SEEDS, 4));
						return;
					}
				}else {
					p.sendMessage("FastCropsBreak-Error: Enchantment.LOOT_BONUS_BLOCKS != 0-3. Bitte melde den Fehler einem" + ChatColor.RED + " Admin.");
					return;
				}
			}else {
				return;
			}
		}else if(b.getType().equals(Material.NETHER_WART)) {
			BlockData bdata = b.getBlockData();
			Ageable bage = (Ageable) bdata;
			if(bage.getAge() == bage.getMaximumAge()) {
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
					int randomWart = (int) (Math.random()*(4));
					if(randomWart == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 5));
						return;
					}else if(randomWart >= 1 && randomWart <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 6));
						return;
					}else if(randomWart == 3) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 7));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
					int randomWart = (int) (Math.random()*(4));
					if(randomWart == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 4));
						return;
					}else if(randomWart >= 1 && randomWart <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 5));
						return;
					}else if(randomWart == 3) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 6));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
					int randomWart = (int) (Math.random()*(4));
					if(randomWart == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 3));
						return;
					}else if(randomWart >= 1 && randomWart <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 4));
						return;
					}else if(randomWart == 3) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 5));
						return;
					}
				}else if(p.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 0) {
					int randomWart = (int) (Math.random()*(4));
					if(randomWart == 0) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 2));
						return;
					}else if(randomWart >= 1 && randomWart <= 2) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 3));
						return;
					}else if(randomWart == 3) {
						p.getWorld().dropItem(bloc, new ItemStack(Material.NETHER_WART, 4));
						return;
					}
				}else {
					p.sendMessage("FastCropsBreak-Error: Enchantment.LOOT_BONUS_BLOCKS != 0-3. Bitte melde den Fehler einem" + ChatColor.RED + " Admin.");
					return;
				}
			}else {
				return;
			}
		}return;
	}
}
