package com.thestatemc.stateheads;

import com.github.puregero.multilib.MultiLib;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        if (!MultiLib.isLocalPlayer(player)) return;

        ItemStack headStack = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta headMeta = (SkullMeta) headStack.getItemMeta();
        headMeta.setOwningPlayer(player);
        headStack.setItemMeta(headMeta);

        event.getDrops().add(headStack);
    }
}
