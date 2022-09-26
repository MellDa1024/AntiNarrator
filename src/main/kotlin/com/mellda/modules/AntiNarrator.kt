package com.mellda.modules

import com.mellda.AntiNarratorPlugin
import com.lambda.client.module.Category
import com.lambda.client.plugin.api.PluginModule
/**
 * This is a module. First set properties then settings then add listener.
 * **/
internal object AntiNarrator : PluginModule(
    name = "AntiNarrator",
    category = Category.MISC,
    description = "Fuck you Narrator",
    pluginMain = AntiNarratorPlugin
) {
    //MixinGameSettings
    //MixinScreenChatOptions
}