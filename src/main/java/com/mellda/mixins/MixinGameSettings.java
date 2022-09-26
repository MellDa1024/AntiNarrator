package com.mellda.mixins;

import com.mellda.modules.AntiNarrator;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameSettings.class)
public class MixinGameSettings {
    @Inject(method = "setOptionValue", at = @At("HEAD"), cancellable = true)
    private void removeNarrator(GameSettings.Options settingsOption, int value, CallbackInfo ci) {
        if (settingsOption == GameSettings.Options.NARRATOR) {
            if (AntiNarrator.INSTANCE.isActive()) {
                ci.cancel();
            }
        }
    }
}
