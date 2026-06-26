package ru.yourname.empty;

import net.fabricmc.api.ClientModInitializer;

public class EmptyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[EmptyMod] Клиент загружен!");
    }
}
