package mc.computing.kotlin.kotlinplugin

import org.bukkit.plugin.java.JavaPlugin

class KotlinPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello Kotlin!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
