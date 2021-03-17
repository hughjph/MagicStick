package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.MagicStick;
import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class OnPlayerRespawn implements Listener {

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e){

        Player player = e.getPlayer();

        Inventory playerInventory = player.getInventory();

        if(MagicStick.magicStickToggle){

            if(playerInventory.contains(MagicStickItem.magicStick)){
                return;
            } else{
                playerInventory.addItem(MagicStickItem.magicStick);
            }
        }else{
            if(playerInventory.contains(MagicStickItem.magicStick)){
                playerInventory.remove(MagicStickItem.magicStick);
            }
        }




    }


}
