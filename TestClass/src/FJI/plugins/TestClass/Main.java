package FJI.plugins.TestClass;

import FJI.plugins.SCB.main.ClassManager;
import FJI.plugins.SCB.main.SCB;
import org.bukkit.Bukkit;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
    public void onEnable(){
        SCB p =(SCB) Bukkit.getServer().getPluginManager().getPlugin("SuperCubeBros");
        ClassManager cm = p.getClassManager();
        cm.addClass("example", new ExampleClass());
    }
}
