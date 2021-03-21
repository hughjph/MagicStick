package me.hughjph.MagicStick.events;

import me.hughjph.MagicStick.MagicStick;
import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.ChatColor;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

public class StickEvents implements Listener {

    @EventHandler
    public void onRightClickEvent(PlayerInteractEvent event){

        Player player = (Player) event.getPlayer();

        if(event.getItem() == null){
            return;
        }

        if(event.getItem().getItemMeta().equals(MagicStickItem.magicStick.getItemMeta())){
            if(event.getAction() == Action.RIGHT_CLICK_AIR){
                player.launchProjectile(Fireball.class);
            }
        }
    }

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
                    player.sendMessage(ChatColor.RED + "You cannot use the " + ChatColor.GOLD + "MAGIC STICK " + ChatColor.RED + "in crafting!");
                }
            }
        }
    }

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

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        Inventory playerInventory = player.getInventory();

        if(MagicStick.magicStickToggle){
            if(playerInventory.contains(MagicStickItem.magicStick)){
                return;
            } else{
                playerInventory.addItem(MagicStickItem.magicStick);
            }
        } else{
            if(playerInventory.contains(MagicStickItem.magicStick)){
                playerInventory.remove(MagicStickItem.magicStick);
            }
        }
    }


    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){

        if(!(event.getEntity() instanceof Player)){
            return;
        }

        Player player = (Player) event.getEntity();

        player.getInventory().remove(MagicStickItem.magicStick);
    }


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
