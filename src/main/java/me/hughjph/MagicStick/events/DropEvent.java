package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.MagicStick;
import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

public class DropEvent implements Listener {

    @EventHandler
    public void onDropEvent(PlayerDropItemEvent e){

        ItemStack item = e.getItemDrop().getItemStack();
        Player player = e.getPlayer();
        Item dropped = e.getItemDrop();



        if(dropped.getItemStack().getItemMeta().equals(MagicStickItem.magicStick.getItemMeta())){
            item.setAmount(0);
            player.getInventory().addItem(MagicStickItem.magicStick);
        }

    }




}
