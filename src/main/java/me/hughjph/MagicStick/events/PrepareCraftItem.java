package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
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


        for(int i = 0; i<inCraftingItems.length; i++){
            if(inCraftingItems[i] == MagicStickItem.stick()){

                recipe.getResult().setType(null);

                player.sendMessage(ChatColor.RED + "You cannot use the " + ChatColor.GOLD + "MAGIC STICK " + ChatColor.RED + "in crafting!");
                return;
            }
        }


    }


}
