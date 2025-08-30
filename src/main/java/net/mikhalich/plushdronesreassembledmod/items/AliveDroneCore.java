package net.mikhalich.plushdronesreassembledmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class AliveDroneCore extends Item {
    public AliveDroneCore() {
        super(new Item.Properties()
                .stacksTo(16)
                .rarity(Rarity.EPIC));
    }
}
