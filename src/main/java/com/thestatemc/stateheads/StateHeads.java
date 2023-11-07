package com.thestatemc.stateheads;

import org.bukkit.plugin.java.JavaPlugin;

public class StateHeads extends JavaPlugin {
        @Override
        public void onEnable() {
                getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);
        }
}
