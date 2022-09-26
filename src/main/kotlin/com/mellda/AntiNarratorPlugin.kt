package com.mellda

import com.lambda.client.plugin.api.Plugin
import com.mellda.modules.AntiNarrator

internal object AntiNarratorPlugin : Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
        modules.add(AntiNarrator)
    }

    override fun onUnload() {
    }
}