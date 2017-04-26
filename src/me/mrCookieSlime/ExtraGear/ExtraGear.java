package me.mrCookieSlime.ExtraGear;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.mrCookieSlime.CSCoreLibPlugin.PluginUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.StringUtils;
import me.mrCookieSlime.ExtraGear.CSCoreLibSetup.CSCoreLibLoader;
import me.mrCookieSlime.Slimefun.Lists.Categories;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.Slimefun;

public class ExtraGear extends JavaPlugin {
	
	int id = 3300;
	
	@Override
	public void onEnable() {
		CSCoreLibLoader loader = new CSCoreLibLoader(this);
		if (loader.load()) {
			PluginUtils utils = new PluginUtils(this);
			utils.setupUpdater(90310, getFile());
			
			registerSword(Material.IRON_SWORD, "COPPER", SlimefunItems.COPPER_INGOT, "DAMAGE_UNDEAD-2");
			registerArmor("LEATHER", "COPPER", SlimefunItems.COPPER_INGOT, "PROTECTION_EXPLOSIONS-2");
			
			registerSword(Material.IRON_SWORD, "TIN", SlimefunItems.TIN_INGOT, "DAMAGE_ALL-1");
			registerArmor("IRON", "TIN", SlimefunItems.TIN_INGOT, "PROTECTION_EXPLOSIONS-3");
			
			registerSword(Material.IRON_SWORD, "SILVER", SlimefunItems.SILVER_INGOT, "DAMAGE_ALL-2");
			registerArmor("IRON", "SILVER", SlimefunItems.SILVER_INGOT, "PROTECTION_ENVIRONMENTAL-2");
			
			registerSword(Material.IRON_SWORD, "ALUMINUM", SlimefunItems.ALUMINUM_INGOT, "DAMAGE_ARTHROPODS-3");
			registerArmor("IRON", "ALUMINUM", SlimefunItems.ALUMINUM_INGOT, "PROTECTION_EXPLOSIONS-2", "DURABILITY-2");
			
			registerSword(Material.IRON_SWORD, "LEAD", SlimefunItems.LEAD_INGOT, "DAMAGE_ALL-3", "DURABILITY-8");
			registerArmor("IRON", "LEAD", SlimefunItems.LEAD_INGOT, "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-8");
			
			registerSword(Material.IRON_SWORD, "ZINC", SlimefunItems.ZINC_INGOT, "DAMAGE_ALL-2");
			registerArmor("IRON", "ZINC", SlimefunItems.ZINC_INGOT, "PROTECTION_ENVIRONMENTAL-3");
			
			registerSword(Material.IRON_SWORD, "MAGNESIUM", SlimefunItems.MAGNESIUM_INGOT, "DAMAGE_ALL-2", "DURABILITY-5");
			registerArmor("IRON", "MAGNESIUM", SlimefunItems.MAGNESIUM_INGOT, "PROTECTION_ENVIRONMENTAL-2", "DURABILITY-5");
			
			registerSword(Material.IRON_SWORD, "STEEL", SlimefunItems.STEEL_INGOT, "DAMAGE_ALL-5", "DURABILITY-6");
			registerArmor("IRON", "STEEL", SlimefunItems.STEEL_INGOT, "PROTECTION_ENVIRONMENTAL-4", "DURABILITY-3");
			
			registerSword(Material.IRON_SWORD, "BRONZE", SlimefunItems.BRONZE_INGOT, "DAMAGE_ALL-3", "DURABILITY-6");
			registerSword(Material.IRON_SWORD, "DURALUMIN", SlimefunItems.DURALUMIN_INGOT, "DAMAGE_ALL-3", "DURABILITY-6");
			registerSword(Material.IRON_SWORD, "BILLON", SlimefunItems.BILLON_INGOT, "DAMAGE_ALL-4", "DURABILITY-5");
			registerSword(Material.IRON_SWORD, "BRASS", SlimefunItems.BRASS_INGOT, "DAMAGE_UNDEAD-4", "DURABILITY-6");
			registerSword(Material.IRON_SWORD, "ALUMINUM_BRASS", SlimefunItems.ALUMINUM_BRASS_INGOT, "DAMAGE_ARTHROPODS-4", "DURABILITY-4");
			registerSword(Material.IRON_SWORD, "ALUMINUM_BRONZE", SlimefunItems.ALUMINUM_BRONZE_INGOT, "DAMAGE_ARTHROPODS-4", "DURABILITY-5");
			registerSword(Material.IRON_SWORD, "CORINTHIAN_BRONZE", SlimefunItems.CORINTHIAN_BRONZE_INGOT, "DAMAGE_ALL-5", "DURABILITY-5");
			registerSword(Material.IRON_SWORD, "SOLDER", SlimefunItems.SOLDER_INGOT, "DAMAGE_ALL-4", "DURABILITY-6");
			registerSword(Material.IRON_SWORD, "DAMASCUS_STEEL", SlimefunItems.DAMASCUS_STEEL_INGOT, "DAMAGE_ALL-6", "DURABILITY-7");
			registerSword(Material.IRON_SWORD, "HARDENED", SlimefunItems.HARDENED_METAL_INGOT, "DAMAGE_ALL-7", "DURABILITY-10");
			registerSword(Material.IRON_SWORD, "REINFORCED", SlimefunItems.REINFORCED_ALLOY_INGOT, "DAMAGE_ALL-8", "DURABILITY-8");
			registerSword(Material.IRON_SWORD, "FERROSILICON", SlimefunItems.FERROSILICON, "DAMAGE_UNDEAD-8", "DURABILITY-4");
			registerSword(Material.GOLD_SWORD, "GILDED_IRON", SlimefunItems.GILDED_IRON, "DAMAGE_ARTHROPODS-8", "DURABILITY-10");
			registerSword(Material.IRON_SWORD, "NICKEL", SlimefunItems.NICKEL_INGOT, "DAMAGE_ALL-6", "DURABILITY-5");
			
			registerSword(Material.IRON_SWORD, "COBALT", SlimefunItems.COBALT_INGOT, "DAMAGE_ALL-7", "DURABILITY-7");
			registerArmor("IRON", "COBALT", SlimefunItems.COBALT_INGOT, "PROTECTION_ENVIRONMENTAL-7", "DURABILITY-7");
			
			
		}
	}
	
	private void registerSword(Material type, String component, ItemStack item, String... enchantments) {
		ItemStack is = new CustomItem(type, "&r" + StringUtils.format(component) + " Sword", enchantments, 0);
		
		new SlimefunItem(Categories.WEAPONS, is, component + "_SWORD", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {null, item, null, null, item, null, null, new ItemStack(Material.STICK), null})
		.register();
		
		id++;
		Slimefun.registerResearch(new Research(id, StringUtils.format(component) + " Sword", 3), is);
	}
	
	private void registerArmor(String material, String component, ItemStack item, String... enchantments) {
		ItemStack[] armor = {
				new CustomItem(Material.getMaterial(material + "_HELMET"), "&r" + StringUtils.format(component) + " Helmet", enchantments, 0),
				new CustomItem(Material.getMaterial(material + "_CHESTPLATE"), "&r" + StringUtils.format(component) + " Chestplate", enchantments, 0),
				new CustomItem(Material.getMaterial(material + "_LEGGINGS"), "&r" + StringUtils.format(component) + " Leggings", enchantments, 0),
				new CustomItem(Material.getMaterial(material + "_BOOTS"), "&r" + StringUtils.format(component) + " Boots", enchantments, 0)
		};
		SlimefunManager.registerArmorSet(item, armor, component, false, false);
		
		id++;
		Slimefun.registerResearch(new Research(id, StringUtils.format(component) + " Armor", 5), armor);
	}
}
