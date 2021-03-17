package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.MagicStick;
import me.hughjph.MagicStick.items.MagicStickItem;
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


        if(!(item == MagicStickItem.stick())){

            return;

        }

        e.setCancelled(true);

    }


}
