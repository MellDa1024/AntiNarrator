package com.mellda.mixins;

import com.mellda.modules.AntiNarrator;
import net.minecraft.client.gui.ScreenChatOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ScreenChatOptions.class)
public class MixinScreenChatOptions {
    @Inject(method = "updateNarratorButton", at = @At("HEAD"), cancellable = true)
    private void removeNarrator(CallbackInfo ci) {
        if (AntiNarrator.INSTANCE.isActive()) {
            ci.cancel();
        }
    }
}
