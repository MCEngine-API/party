package io.github.mcengine.api.party.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Interface for Skript modules that can be dynamically loaded
 * as part of the Party system in MCEngine.
 */
public interface IMCEnginePartySkript {

    /**
     * Called when the Skript is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);
}
