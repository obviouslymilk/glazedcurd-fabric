package net.obvmilk.glazedcurd.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.obvmilk.glazedcurd.item.GlazedCurdItem;

@Environment(EnvType.CLIENT)
public class GlazedcurdClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
    }
}
