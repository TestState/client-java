package me.hsgamer.teststate.client.processor;

import me.hsgamer.teststate.uap.v1.Capability;

/**
 * Common interface for all specialized processors.
 */
public interface BaseProcessor {
    /**
     * Gets the capability of this processor.
     *
     * @return The capability.
     */
    Capability getCapability();
}

