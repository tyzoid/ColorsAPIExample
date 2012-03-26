package tk.tyzoid.plugins.colorsapiexample;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {
	Colorsapiexample plugin;
	
	public EventListener(Colorsapiexample instance){
		plugin = instance;
	}
	
	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
    	Player player = event.getPlayer();
    	
    	if(plugin.capi == null)
    		return;
    	
    	String prefix = plugin.capi.getPrefix(player);
    	String suffix = plugin.capi.getSuffix(player);
    	
    	player.sendMessage("[" + plugin.pluginname + "] Your user prefix is: " + prefix);
    	player.sendMessage("[" + plugin.pluginname + "] Your user suffix is: " + suffix);
    }
}
