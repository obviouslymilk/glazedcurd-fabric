package net.obvmilk.glazedcurd;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.obvmilk.glazedcurd.item.GlazedCurdItem;

public class Glazedcurd implements ModInitializer {
    public static final String MOD_ID = "glazedcurd";

    public static final GlazedCurdItem GLAZED_CURD_ITEM =
            new GlazedCurdItem(new FabricItemSettings()
                    .group(ItemGroup.FOOD)
                    .maxCount(16)
                    .food(new FoodComponent.Builder()
                            .hunger(2)
                            .saturationModifier(5f)
                            .snack()
                            .alwaysEdible()
                            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 60, 1), 1)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20*3, 2), 1)
                            .build()));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glazed_curd"), GLAZED_CURD_ITEM);
    }
}
