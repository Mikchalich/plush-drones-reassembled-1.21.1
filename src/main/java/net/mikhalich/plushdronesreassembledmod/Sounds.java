package net.mikhalich.plushdronesreassembledmod;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Sounds {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, PlushDronesReassembledMod.MOD_ID);

    private static ResourceKey<JukeboxSong> createSong(String name){
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(PlushDronesReassembledMod.MOD_ID, name));
    }

    private static Supplier<SoundEvent> createSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(PlushDronesReassembledMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static final Supplier<SoundEvent> ETERNAL_DREAM = createSoundEvent("eternal_dream");
    public static final ResourceKey<JukeboxSong> ETERNAL_DREAM_KEY = createSong("eternal_dream");
    public static final Supplier<SoundEvent> FOREVER = createSoundEvent("forever");
    public static final ResourceKey<JukeboxSong> FOREVER_KEY = createSong("forever");

    public static final Supplier<SoundEvent> I_LOVE_DOING_ANYTHING = createSoundEvent("i_love_doing_anything");

    public static void register(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}
