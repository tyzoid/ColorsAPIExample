package tk.tyzoid.plugins.colorsapiexample;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import tk.tyzoid.plugins.colors.api.ColorsAPI;

public class Colorsapiexample extends JavaPlugin {
	public String pluginname = "ColorsApiExample";
	private EventListener listener = new EventListener(this);
	public ColorsAPI capi;
	
    public void onDisable() {
        System.out.println("[" + pluginname +"] " + pluginname + " is closing...");
    }

    public void onEnable() {
    	if(getServer().getPluginManager().getPlugin("Colors") != null && capi == null){
    		capi = ColorsAPI.getInstance();
    		System.out.println("[" + pluginname + "] Hooked into Colors.");
    	} else {
    		capi = null;
    		System.out.println("[" + pluginname + "] Colors not found.");
    	}
    	
        PluginManager pm = getServer().getPluginManager();
        
        pm.registerEvents(listener, this);
    }
}
