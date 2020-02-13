package io.github.thebusybiscuit.extragear;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.mrCookieSlime.CSCoreLibPlugin.general.String.StringUtils;
import me.mrCookieSlime.Slimefun.Lists.Categories;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.Slimefun;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.bstats.bukkit.Metrics;
import me.mrCookieSlime.Slimefun.cscorelib2.collections.Pair;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.GitHubBuildsUpdater;

public class ExtraGear extends JavaPlugin {

	private int researchId = 3300;

	@Override
	public void onEnable() {
		Config cfg = new Config(this);
		
		if (cfg.getBoolean("options.auto-update")) {
			new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/ExtraGear/master").start();
		}
		
		new Metrics(this, 6469);

		registerSword(Material.IRON_SWORD, "COPPER", SlimefunItems.COPPER_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_UNDEAD, 2)
		));
		
		registerArmor(ArmorSet.LEATHER, "COPPER", SlimefunItems.COPPER_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 2)
		));

		registerSword(Material.IRON_SWORD, "TIN", SlimefunItems.TIN_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 1)
		));
		
		registerArmor(ArmorSet.IRON, "TIN", SlimefunItems.TIN_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 3)
		));

		registerSword(Material.IRON_SWORD, "SILVER", SlimefunItems.SILVER_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 2)
		));
		
		registerArmor(ArmorSet.IRON, "SILVER", SlimefunItems.SILVER_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 2)
		));

		registerSword(Material.IRON_SWORD, "ALUMINUM", SlimefunItems.ALUMINUM_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 3)
		));
		
		registerArmor(ArmorSet.IRON, "ALUMINUM", SlimefunItems.ALUMINUM_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 2),
			new Pair<>(Enchantment.DURABILITY, 2)
		));

		registerSword(Material.IRON_SWORD, "LEAD", SlimefunItems.LEAD_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 3),
			new Pair<>(Enchantment.DURABILITY, 8)
		));
		
		registerArmor(ArmorSet.IRON, "LEAD", SlimefunItems.LEAD_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3),
			new Pair<>(Enchantment.DURABILITY, 8)
		));

		registerSword(Material.IRON_SWORD, "ZINC", SlimefunItems.ZINC_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 2)
		));
		
		registerArmor(ArmorSet.IRON, "ZINC", SlimefunItems.ZINC_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3)
		));

		registerSword(Material.IRON_SWORD, "MAGNESIUM", SlimefunItems.MAGNESIUM_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 2),
			new Pair<>(Enchantment.DURABILITY, 5)
		));
		
		registerArmor(ArmorSet.IRON, "MAGNESIUM", SlimefunItems.MAGNESIUM_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 2),
			new Pair<>(Enchantment.DURABILITY, 5)
		));

		registerSword(Material.IRON_SWORD, "STEEL", SlimefunItems.STEEL_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 5),
			new Pair<>(Enchantment.DURABILITY, 6)
		));
		
		registerArmor(ArmorSet.IRON, "STEEL", SlimefunItems.STEEL_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3),
			new Pair<>(Enchantment.DURABILITY, 4)
		));

		registerSword(Material.IRON_SWORD, "BRONZE", SlimefunItems.BRONZE_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 3),
			new Pair<>(Enchantment.DURABILITY, 6)
		));
		
		registerSword(Material.IRON_SWORD, "DURALUMIN", SlimefunItems.DURALUMIN_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 3),
			new Pair<>(Enchantment.DURABILITY, 6)
		));
		
		registerSword(Material.IRON_SWORD, "BILLON", SlimefunItems.BILLON_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 4),
			new Pair<>(Enchantment.DURABILITY, 5)
		));
		
		registerSword(Material.IRON_SWORD, "BRASS", SlimefunItems.BRASS_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_UNDEAD, 4),
			new Pair<>(Enchantment.DURABILITY, 6)
		));
		
		registerSword(Material.IRON_SWORD, "ALUMINUM_BRASS", SlimefunItems.ALUMINUM_BRASS_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 4),
			new Pair<>(Enchantment.DURABILITY, 4)
		));
		
		registerSword(Material.IRON_SWORD, "ALUMINUM_BRONZE", SlimefunItems.ALUMINUM_BRONZE_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 4),
			new Pair<>(Enchantment.DURABILITY, 5)
		));
		
		registerSword(Material.IRON_SWORD, "CORINTHIAN_BRONZE", SlimefunItems.CORINTHIAN_BRONZE_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 5),
			new Pair<>(Enchantment.DURABILITY, 5)
		));
		
		registerSword(Material.IRON_SWORD, "SOLDER", SlimefunItems.SOLDER_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 4),
			new Pair<>(Enchantment.DURABILITY, 6)
		));
		
		registerSword(Material.IRON_SWORD, "DAMASCUS_STEEL", SlimefunItems.DAMASCUS_STEEL_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 6),
			new Pair<>(Enchantment.DURABILITY, 7)
		));
		
		registerSword(Material.IRON_SWORD, "HARDENED", SlimefunItems.HARDENED_METAL_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 7),
			new Pair<>(Enchantment.DURABILITY, 10)
		));
		
		registerSword(Material.IRON_SWORD, "REINFORCED", SlimefunItems.REINFORCED_ALLOY_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 8),
			new Pair<>(Enchantment.DURABILITY, 8)
		));
		
		registerSword(Material.IRON_SWORD, "FERROSILICON", SlimefunItems.FERROSILICON, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_UNDEAD, 8),
			new Pair<>(Enchantment.DURABILITY, 4)
		));
		
		registerSword(Material.GOLDEN_SWORD, "GILDED_IRON", SlimefunItems.GILDED_IRON, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 8),
			new Pair<>(Enchantment.DURABILITY, 10)
		));
		
		registerSword(Material.IRON_SWORD, "NICKEL", SlimefunItems.NICKEL_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 6),
			new Pair<>(Enchantment.DURABILITY, 5)
		));

		registerSword(Material.IRON_SWORD, "COBALT", SlimefunItems.COBALT_INGOT, Arrays.asList(
			new Pair<>(Enchantment.DAMAGE_ALL, 7),
			new Pair<>(Enchantment.DURABILITY, 7)
		));
		
		registerArmor(ArmorSet.IRON, "COBALT", SlimefunItems.COBALT_INGOT, Arrays.asList(
			new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 7),
			new Pair<>(Enchantment.DURABILITY, 7)
		));
	}

	private void registerSword(Material type, String component, ItemStack item, List<Pair<Enchantment, Integer>> enchantments) {
		SlimefunItemStack is = new SlimefunItemStack(component + "_SWORD", type, "&r" + StringUtils.format(component) + " Sword");

		for (Pair<Enchantment, Integer> enchantment : enchantments) {
			is.addEnchantment(enchantment.getFirstValue(), enchantment.getSecondValue());
		}
		
		new SlimefunItem(Categories.WEAPONS, is, RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {null, item, null, null, item, null, null, new ItemStack(Material.STICK), null})
		.register();
		
		researchId++;
		Slimefun.registerResearch(new Research(new NamespacedKey(this, component.toLowerCase() + "_sword"), researchId, StringUtils.format(component) + " Sword", 3), is);
	}

	private void registerArmor(ArmorSet armorset, String component, ItemStack item, List<Pair<Enchantment, Integer>> enchantments) {
		ItemStack[] armor = {
			new CustomItem(armorset.getHelmet(), "&r" + StringUtils.format(component) + " Helmet"),
			new CustomItem(armorset.getChestplate(), "&r" + StringUtils.format(component) + " Chestplate"),
			new CustomItem(armorset.getLeggings(), "&r" + StringUtils.format(component) + " Leggings"),
			new CustomItem(armorset.getBoots(), "&r" + StringUtils.format(component) + " Boots")
		};
		
		for (Pair<Enchantment, Integer> enchantment : enchantments) {
			for (ItemStack is : armor) {
				is.addUnsafeEnchantment(enchantment.getFirstValue(), enchantment.getSecondValue());
			}
		}
		
		SlimefunManager.registerArmorSet(item, armor, component, false, false);

		researchId++;
		Slimefun.registerResearch(new Research(new NamespacedKey(this, component.toLowerCase() + "_armor"), researchId, StringUtils.format(component) + " Armor", 5), armor);
	}

}
