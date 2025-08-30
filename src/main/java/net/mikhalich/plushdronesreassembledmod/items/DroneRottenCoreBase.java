package net.mikhalich.plushdronesreassembledmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class DroneRottenCoreBase extends Item {
    public DroneRottenCoreBase() {
        super(new Item.Properties()
                .stacksTo(16)
                .rarity(Rarity.UNCOMMON));
    }
}
