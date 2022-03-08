package com.firesoftitan.play.titanbox.itemframes;

import com.firesoftitan.play.titanbox.itemframes.listeners.MainListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public final class TitanItemFrames extends JavaPlugin {

    public static TitanItemFrames instants;
    public static MainListener mainListener;
    private BukkitRunnable bukkitRunnable;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instants= this;
        mainListener = new MainListener();
        mainListener.registerEvents();
        bukkitRunnable = new BukkitRunnable() {
            @Override
            public void run() {
                for (World world : Bukkit.getWorlds()) {
                    List<Entity> allE = world.getEntities();
                    for (Entity entity : allE) {
                        if (entity instanceof ItemFrame itemFrame) {
                            ItemStack item = itemFrame.getItem();
                            if (item != null && item.getType() != Material.AIR) {
                                itemFrame.setVisible(false);
                            }
                            else
                            {
                                itemFrame.setVisible(true);
                            }
                        }
                    }
                }
            }
        };
        bukkitRunnable.runTaskTimer(this,10, 10);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        bukkitRunnable.cancel();

    }
}
