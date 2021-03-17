package me.hughjph.MagicStick.logic;

import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Collection;

public class AddRemoveStick {


    public static void RemoveMagicStick(){

        final Collection<? extends Player> players = Bukkit.getOnlinePlayers();


        for(Player player : players){

            player.getInventory().remove(MagicStickItem.magicStick);

        }
    }

    public static void AddMagicStick(){

        final Collection<? extends Player> players = Bukkit.getOnlinePlayers();


        for(Player player : players){

            if(!(player.getInventory().contains(MagicStickItem.magicStick))){
                player.getInventory().addItem(MagicStickItem.magicStick);
            }
        }
    }

}
