package fr.jehende.spawn;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Command implements TabExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender,
                             org.bukkit.command.@NotNull Command command,
                             @NotNull String s,
                             @NotNull String[] strings) {
        if(! (sender instanceof Player)){
            sender.sendMessage("&4Tu ne peux pas éxécuter cette commande.");
            return false;
        }
        Player p = (Player) sender;
        World w = p.getWorld();
        Location spawn = w.getSpawnLocation();

        p.teleport(spawn);
        p.sendMessage("&aVous êtes arrivé au spawn.");
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender,
                                                org.bukkit.command.@NotNull Command command,
                                                @NotNull String s,
                                                @NotNull String[] strings) {

        return null;
    }
}
