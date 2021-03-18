package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.MagicStick;
import me.hughjph.MagicStick.items.MagicStickItem;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class OnRightClick implements Listener {

    @EventHandler
    public void onRightClickEvent(PlayerInteractEvent event){

        Player player = (Player) event.getPlayer();

        if(event.getItem().getItemMeta().equals(MagicStickItem.magicStick.getItemMeta())){
            if(event.getAction() == Action.RIGHT_CLICK_AIR){
                player.launchProjectile(Fireball.class);
            }


        }


    }


}
