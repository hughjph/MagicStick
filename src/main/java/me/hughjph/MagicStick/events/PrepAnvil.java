package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;

public class PrepAnvil implements Listener {

    @EventHandler
    public void onPrepAnvil(PrepareAnvilEvent e){

        ItemStack result = e.getResult();

        ItemStack[] inCraftingItems = e.getInventory().getContents();
        Player player = (Player) e.getView().getPlayer();


        for(int i = 0; i<inCraftingItems.length; i++){
            if(!(inCraftingItems[i]==null)){
                if(inCraftingItems[i].getItemMeta() == MagicStickItem.magicStick.getItemMeta()){

                    result.setType(null);

                    player.sendMessage(ChatColor.RED + "You cannot use the " + ChatColor.GOLD + "MAGIC STICK " + ChatColor.RED + "in an anvil!");
                    return;
                }
            }

        }


    }


}
