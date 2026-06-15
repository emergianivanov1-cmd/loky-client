package com.example.mixin;

import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Keyboard.class)
public class ExampleMixin {
    @Inject(method = "onKey", at = @At("HEAD"))
    private void onKey(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        if (action != 1) return;
        if (key == 344) {
            MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(
                net.minecraft.text.Text.literal("§6Loky Client §7- works!")
            );
        }
    }
}
