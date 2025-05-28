package org.maurijst.GradleTest.emptyGradle;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class EmptyGradle extends JavaPlugin {

		Logger log = Logger.getLogger("EmptyGradle");

		@Override
		public void onEnable() {
			// Plugin startup logic
			log.info("plugin enabled");
		}

		@Override
		public void onDisable() {
			// Plugin shutdown logic
			log.info("plugin disabled");
		}
	}

