package me.hughjph.MagicStick.items;

import javafx.scene.paint.Color;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MagicStickItem {

    public static ItemStack magicStick;

    public static void stick(){

        ItemStack item = new ItemStack(Material.STICK);

        ItemMeta itemMeta = item.getItemMeta();

        itemMeta.setDisplayName(ChatColor.AQUA + "Magic Stick");
        itemMeta.addEnchant(Enchantment.KNOCKBACK, 8, true);
        itemMeta.addEnchant(Enchantment.FIRE_ASPECT, 4, true);

        List<String> itemLore = new ArrayList<String>();
        itemLore.add(ChatColor.GOLD + "A stick that was found deep amongst some egyptian ruins");
        itemLore.add(ChatColor.GOLD + "This stick is a marvel of warfare and has been throughout the ages");
        itemLore.add(ChatColor.RED + "USE WITH CAUTION");
        itemMeta.setLore(itemLore);

        item.setItemMeta(itemMeta);

        magicStick = item;



    }

}
