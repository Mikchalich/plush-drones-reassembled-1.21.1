package net.mikhalich.plushdronesreassembledmod.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.Rarity;

public abstract class MusicDisc extends Item {
    public MusicDisc(ResourceKey<JukeboxSong> song) {
        super(new Item.Properties()
                .stacksTo(1)
                .jukeboxPlayable(song)
                .rarity(Rarity.RARE));
    }

}
