package com.firesoftitan.play.titanbox.itemframes.listeners;


import com.firesoftitan.play.titanbox.itemframes.TitanItemFrames;
import org.bukkit.Location;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.PluginManager;


import java.util.HashMap;

import java.util.List;
import java.util.UUID;

public class MainListener implements Listener {

    private static HashMap<UUID, Location> changeNames = new HashMap<UUID, Location>();
    public MainListener(){

    }
    public void registerEvents(){
        PluginManager pm = TitanItemFrames.instants.getServer().getPluginManager();
        pm.registerEvents(this, TitanItemFrames.instants);
    }
    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event)
    {

    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDamageEvent(EntityDamageEvent e) {

    }
}
