package io.github.thebusybiscuit.extragear;

import java.util.Arrays;
import java.util.List;

import org.bstats.bukkit.Metrics;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;

public class ExtraGear extends JavaPlugin implements SlimefunAddon {

    private int researchId = 3300;
    private ItemGroup itemGroup;

    @Override
    public void onEnable() {
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
            new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/ExtraGear/master").start();
        }

        new Metrics(this, 6469);

        itemGroup = new ItemGroup(new NamespacedKey(this, "items"), new CustomItemStack(Material.DIAMOND_SWORD, "&6ExtraGear"), 1);

        registerSword(Material.IRON_SWORD, "COPPER", SlimefunItems.COPPER_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_UNDEAD, 2)));
        registerArmor(ArmorSet.LEATHER, "COPPER", SlimefunItems.COPPER_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 2)));

        registerSword(Material.IRON_SWORD, "TIN", SlimefunItems.TIN_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 1)));
        registerArmor(ArmorSet.IRON, "TIN", SlimefunItems.TIN_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 3)));

        registerSword(Material.IRON_SWORD, "SILVER", SlimefunItems.SILVER_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 2)));
        registerArmor(ArmorSet.IRON, "SILVER", SlimefunItems.SILVER_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 2)));

        registerSword(Material.IRON_SWORD, "ALUMINUM", SlimefunItems.ALUMINUM_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 3)));
        registerArmor(ArmorSet.IRON, "ALUMINUM", SlimefunItems.ALUMINUM_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 2), new Pair<>(Enchantment.DURABILITY, 2)));

        registerSword(Material.IRON_SWORD, "LEAD", SlimefunItems.LEAD_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 3), new Pair<>(Enchantment.DURABILITY, 8)));
        registerArmor(ArmorSet.IRON, "LEAD", SlimefunItems.LEAD_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3), new Pair<>(Enchantment.DURABILITY, 8)));

        registerSword(Material.IRON_SWORD, "ZINC", SlimefunItems.ZINC_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 2)));
        registerArmor(ArmorSet.IRON, "ZINC", SlimefunItems.ZINC_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3)));

        registerSword(Material.IRON_SWORD, "MAGNESIUM", SlimefunItems.MAGNESIUM_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 2), new Pair<>(Enchantment.DURABILITY, 5)));
        registerArmor(ArmorSet.IRON, "MAGNESIUM", SlimefunItems.MAGNESIUM_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 2), new Pair<>(Enchantment.DURABILITY, 5)));

        registerSword(Material.IRON_SWORD, "STEEL", SlimefunItems.STEEL_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 5), new Pair<>(Enchantment.DURABILITY, 6)));
        registerArmor(ArmorSet.IRON, "STEEL", SlimefunItems.STEEL_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3), new Pair<>(Enchantment.DURABILITY, 4)));

        registerSword(Material.IRON_SWORD, "BRONZE", SlimefunItems.BRONZE_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 3), new Pair<>(Enchantment.DURABILITY, 6)));
        registerSword(Material.IRON_SWORD, "DURALUMIN", SlimefunItems.DURALUMIN_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 3), new Pair<>(Enchantment.DURABILITY, 6)));
        registerSword(Material.IRON_SWORD, "BILLON", SlimefunItems.BILLON_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 4), new Pair<>(Enchantment.DURABILITY, 5)));
        registerSword(Material.IRON_SWORD, "BRASS", SlimefunItems.BRASS_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_UNDEAD, 4), new Pair<>(Enchantment.DURABILITY, 6)));
        registerSword(Material.IRON_SWORD, "ALUMINUM_BRASS", SlimefunItems.ALUMINUM_BRASS_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 4), new Pair<>(Enchantment.DURABILITY, 4)));
        registerSword(Material.IRON_SWORD, "ALUMINUM_BRONZE", SlimefunItems.ALUMINUM_BRONZE_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 4), new Pair<>(Enchantment.DURABILITY, 5)));
        registerSword(Material.IRON_SWORD, "CORINTHIAN_BRONZE", SlimefunItems.CORINTHIAN_BRONZE_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 5), new Pair<>(Enchantment.DURABILITY, 5)));
        registerSword(Material.IRON_SWORD, "SOLDER", SlimefunItems.SOLDER_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 4), new Pair<>(Enchantment.DURABILITY, 6)));
        registerSword(Material.IRON_SWORD, "DAMASCUS_STEEL", SlimefunItems.DAMASCUS_STEEL_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 6), new Pair<>(Enchantment.DURABILITY, 7)));
        registerSword(Material.IRON_SWORD, "HARDENED", SlimefunItems.HARDENED_METAL_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 7), new Pair<>(Enchantment.DURABILITY, 10)));
        registerSword(Material.IRON_SWORD, "REINFORCED", SlimefunItems.REINFORCED_ALLOY_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 8), new Pair<>(Enchantment.DURABILITY, 8)));
        registerSword(Material.IRON_SWORD, "FERROSILICON", SlimefunItems.FERROSILICON, Arrays.asList(new Pair<>(Enchantment.DAMAGE_UNDEAD, 8), new Pair<>(Enchantment.DURABILITY, 4)));
        registerSword(Material.GOLDEN_SWORD, "GILDED_IRON", SlimefunItems.GILDED_IRON, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 8), new Pair<>(Enchantment.DURABILITY, 10)));
        registerSword(Material.IRON_SWORD, "NICKEL", SlimefunItems.NICKEL_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 6), new Pair<>(Enchantment.DURABILITY, 5)));

        registerSword(Material.IRON_SWORD, "COBALT", SlimefunItems.COBALT_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 7), new Pair<>(Enchantment.DURABILITY, 7)));
        registerArmor(ArmorSet.IRON, "COBALT", SlimefunItems.COBALT_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 7), new Pair<>(Enchantment.DURABILITY, 7)));
    }

    private void registerSword(Material type, String component, ItemStack item, List<Pair<Enchantment, Integer>> enchantments) {
        SlimefunItemStack is = new SlimefunItemStack(component + "_SWORD", type, "&r" + ChatUtils.humanize(component) + " Sword");

        for (Pair<Enchantment, Integer> enchantment : enchantments) {
            is.addUnsafeEnchantment(enchantment.getFirstValue(), enchantment.getSecondValue());
        }

        SlimefunItem slimefunItem = new SlimefunItem(itemGroup, is, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] { null, item, null, null, item, null, null, new ItemStack(Material.STICK), null });
        slimefunItem.register(this);

        researchId++;

        Research research = new Research(new NamespacedKey(this, component.toLowerCase() + "_sword"), researchId, ChatUtils.humanize(component) + " Sword", 3);
        research.addItems(slimefunItem);
        research.register();
    }

    private void registerArmor(ArmorSet armorset, String component, ItemStack item, List<Pair<Enchantment, Integer>> enchantments) {
        String humanizedComponent = ChatUtils.humanize(component);
        SlimefunItemStack[] armor = { new SlimefunItemStack(component + "_HELMET", armorset.getHelmet(), "&f" + humanizedComponent + " Helmet"),
                new SlimefunItemStack(component + "_CHESTPLATE", armorset.getChestplate(), "&f" + humanizedComponent + " Chestplate"),
                new SlimefunItemStack(component + "_LEGGINGS", armorset.getLeggings(), "&f" + humanizedComponent + " Leggings"),
                new SlimefunItemStack(component + "_BOOTS", armorset.getBoots(), "&f" + humanizedComponent + " Boots") };

        for (Pair<Enchantment, Integer> enchantment : enchantments) {
            for (ItemStack is : armor) {
                is.addUnsafeEnchantment(enchantment.getFirstValue(), enchantment.getSecondValue());
            }
        }

        SlimefunItem helmet = new SlimefunItem(itemGroup, armor[0], RecipeType.ARMOR_FORGE, new ItemStack[] { item, item, item, item, null, item, null, null, null });
        helmet.register(this);

        SlimefunItem chestplate = new SlimefunItem(itemGroup, armor[1], RecipeType.ARMOR_FORGE, new ItemStack[] { item, null, item, item, item, item, item, item, item });
        chestplate.register(this);

        SlimefunItem leggings = new SlimefunItem(itemGroup, armor[2], RecipeType.ARMOR_FORGE, new ItemStack[] { item, item, item, item, null, item, item, null, item });
        leggings.register(this);

        SlimefunItem boots = new SlimefunItem(itemGroup, armor[3], RecipeType.ARMOR_FORGE, new ItemStack[] { null, null, null, item, null, item, item, null, item });
        boots.register(this);

        researchId++;

        Research research = new Research(new NamespacedKey(this, component.toLowerCase() + "_armor"), researchId, humanizedComponent + " Armor", 5);
        research.addItems(helmet, chestplate, leggings, boots);
        research.register();
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/TheBusyBiscuit/ExtraGear/issues";
    }

}
