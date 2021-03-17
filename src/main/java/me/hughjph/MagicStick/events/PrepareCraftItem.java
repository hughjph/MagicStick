package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import java.awt.*;

public class PrepareCraftItem implements Listener {

    @EventHandler
    public void onPrepareCraft(PrepareItemCraftEvent e){

        Recipe recipe = e.getRecipe();

        ItemStack[] inCraftingItems = e.getInventory().getMatrix();
        Player player = (Player) e.getView().getPlayer();
        CraftingInventory inv = e.getInventory();

        for(int i = 0; i<inCraftingItems.length; i++){
            if(!(inCraftingItems[i] == null)){
                if(inCraftingItems[i].getItemMeta().equals(MagicStickItem.magicStick.getItemMeta())){
                    inv.setResult(null);
                    player.sendMessage(ChatColor.RED + "This item cannot be used in crafting!");
                }
            }

        }

    }


}
