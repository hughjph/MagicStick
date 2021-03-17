package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnPlayerDeath implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){

        if(!(event.getEntity() instanceof Player)){
            return;
        }

        Player player = (Player) event.getEntity();

        player.getInventory().remove(MagicStickItem.magicStick);


    }


}
