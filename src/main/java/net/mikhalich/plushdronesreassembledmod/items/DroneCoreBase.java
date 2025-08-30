package net.mikhalich.plushdronesreassembledmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class DroneCoreBase extends Item {
    public DroneCoreBase() {
        super(new Item.Properties()
                .stacksTo(16)
                .rarity(Rarity.COMMON));
    }
}
