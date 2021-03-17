package me.hughjph.MagicStick;

import me.hughjph.MagicStick.commands.Toggle;
import me.hughjph.MagicStick.events.*;
import me.hughjph.MagicStick.items.MagicStickItem;
import org.bukkit.plugin.java.JavaPlugin;

public class MagicStick extends JavaPlugin {

    public static boolean magicStickToggle = false;

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new DropEvent(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerRespawn(), this);
        getServer().getPluginManager().registerEvents(new PrepAnvil(), this);
        getServer().getPluginManager().registerEvents(new PrepareCraftItem(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerDeath(), this);

        getCommand("togglemagicstick").setExecutor(new Toggle());

        MagicStickItem.stick();

    }


}
