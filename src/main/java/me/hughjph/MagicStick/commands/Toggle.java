package me.hughjph.MagicStick.commands;

import me.hughjph.MagicStick.MagicStick;
import me.hughjph.MagicStick.logic.AddRemoveStick;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Toggle implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        MagicStick.magicStickToggle = !(MagicStick.magicStickToggle);


        if(MagicStick.magicStickToggle){
            AddRemoveStick.AddMagicStick();
        } else{
            AddRemoveStick.RemoveMagicStick();
        }

        return false;
    }
}
