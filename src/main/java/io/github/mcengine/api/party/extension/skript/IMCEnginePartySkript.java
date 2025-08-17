package io.github.mcengine.api.party.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Party-based Skript module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate scripted party content into the system.
 */
public interface IMCEnginePartySkript {
    /**
     * Called when the Party Skript module is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Skript module is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Party Skript instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
