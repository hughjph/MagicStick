package me.hughjph.MagicStick.items;

import javafx.scene.paint.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class MagicStickItem {

    public static ItemStack stick(){

        ItemStack item = new ItemStack(Material.STICK);

        ItemMeta itemMeta = item.getItemMeta();

        itemMeta.setDisplayName(Color.AZURE + "Magic Stick");
        itemMeta.addEnchant(Enchantment.KNOCKBACK, 8, true);
        itemMeta.addEnchant(Enchantment.FIRE_ASPECT, 4, true);
        List<String> itemLore = null;
        itemLore.add(Color.GOLD + "A stick that was found deep amongst some egyptian ruins");
        itemLore.add(Color.GOLD + "This stick is a marvel of warfare and has been throughout the ages");
        itemLore.add(Color.RED + "USE WITH CAUTION");
        itemMeta.setLore(itemLore);

        item.setItemMeta(itemMeta);

        return item;



    }

}