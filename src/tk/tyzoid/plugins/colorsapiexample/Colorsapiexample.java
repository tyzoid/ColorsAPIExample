package tk.tyzoid.plugins.colorsapiexample;

import org.bukkit.plugin.PluginDescriptionFile;
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
    	if(capi == null){
    		capi = ColorsAPI.getInstance();
    	} else {
    		capi = null;
    		//Colors does not exist (or an old version is being used)
    	}
    	
        PluginManager pm = getServer().getPluginManager();
        
        pm.registerEvents(listener, this);
        
        PluginDescriptionFile pdfFile = this.getDescription();
        System.out.println("[" + pluginname + "] Starting " + pluginname + " v" + pdfFile.getVersion() + "...");
    }
}
