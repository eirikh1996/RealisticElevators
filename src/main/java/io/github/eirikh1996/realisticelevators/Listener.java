package io.github.eirikh1996.realisticelevators;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

public class Listener implements org.bukkit.event.Listener {
    @EventHandler
    public void onSignRightClick(PlayerInteractEvent event){
        Block b = event.getClickedBlock();
        if (!b.getType().equals(Material.SIGN)){
            return;
        }
        
    }
}
