package net.mikhalich.plushdronesreassembledmod;

import net.mikhalich.plushdronesreassembledmod.items.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PlushDronesReassembledMod.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlushDronesReassembledMod.MOD_ID);

    public static Supplier<CreativeModeTab> MURDER_DRONES_PLUSHIE_TAB = TABS.register(
            "murder_drones_plushie_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> Items.UZI_PLUSHIE.get().getDefaultInstance())
                    .title(Component.translatable("category.plushdronesreassembledmod.main"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.UZI_PLUSHIE.get());
                        output.accept(Items.N_PLUSHIE.get());
                        output.accept(Items.V_PLUSHIE.get());
                        output.accept(Items.J_PLUSHIE.get());
                        output.accept(Items.CYN_PLUSHIE.get());
                        output.accept(Items.DOLL_PLUSHIE.get());
                        output.accept(Items.LIZZY_PLUSHIE.get());
                        output.accept(Items.THAD_PLUSHIE.get());
                        output.accept(Items.ETERNAL_DREAM_MUSIC_DISC.get());
                        output.accept(Items.FOREVER_MUSIC_DISC.get());
                        output.accept(Items.DRONE_CORE_BASE.get());
                        output.accept(Items.DRONE_ROTTEN_CORE_BASE.get());
                        output.accept(Items.UZI_CORE.get());
                        output.accept(Items.N_CORE.get());
                        output.accept(Items.V_CORE.get());
                        output.accept(Items.J_CORE.get());
                        output.accept(Items.CYN_CORE.get());
                        output.accept(Items.DOLL_CORE.get());
                        output.accept(Items.LIZZY_CORE.get());
                        output.accept(Items.THAD_CORE.get());
                    }).build());

    public static DeferredItem<Item> registerItem(String id, DeferredBlock<Block> block, Item.Properties props) {
        return ITEMS.register(id, () -> new BlockItem(block.get(), props));
    }

    private static Item.Properties getPlushieProps() {
        return new Item.Properties()
                .stacksTo(16)
                .rarity(Rarity.COMMON);
    }

    //Plushies
    public static final DeferredItem<Item> UZI_PLUSHIE = registerItem("uzi_plushie", Blocks.UZI_BLOCK, getPlushieProps());
    public static final DeferredItem<Item> N_PLUSHIE = registerItem("n_plushie", Blocks.N_BLOCK, getPlushieProps());
    public static final DeferredItem<Item> V_PLUSHIE = registerItem("v_plushie", Blocks.V_BLOCK, getPlushieProps());
    public static final DeferredItem<Item> J_PLUSHIE = registerItem("j_plushie", Blocks.J_BLOCK, getPlushieProps());
    public static final DeferredItem<Item> CYN_PLUSHIE = registerItem("cyn_plushie", Blocks.CYN_BLOCK, getPlushieProps());
    public static final DeferredItem<Item> DOLL_PLUSHIE = registerItem("doll_plushie", Blocks.DOLL_BLOCK, getPlushieProps());
    public static final DeferredItem<Item> LIZZY_PLUSHIE = registerItem("lizzy_plushie", Blocks.LIZZY_BLOCK, getPlushieProps());
    public static final DeferredItem<Item> THAD_PLUSHIE = registerItem("thad_plushie", Blocks.THAD_BLOCK, getPlushieProps());

    //Music Discs
    public static final DeferredItem<Item> ETERNAL_DREAM_MUSIC_DISC = ITEMS.register("eternal_dream_music_disc", EternalDreamMusicDisc::new);
    public static final DeferredItem<Item> FOREVER_MUSIC_DISC = ITEMS.register("forever_music_disc", ForeverMusicDisc::new);

    //Cores
    public static final DeferredItem<Item> DRONE_CORE_BASE = ITEMS.register("drone_core_base", DroneCoreBase::new);
    public static final DeferredItem<Item> DRONE_ROTTEN_CORE_BASE = ITEMS.register("drone_rotten_core_base", DroneRottenCoreBase::new);
    public static final DeferredItem<Item> UZI_CORE = ITEMS.register("uzi_core", AliveDroneCore::new);
    public static final DeferredItem<Item> N_CORE = ITEMS.register("n_core", AliveDroneCore::new);
    public static final DeferredItem<Item> V_CORE = ITEMS.register("v_core", AliveDroneCore::new);
    public static final DeferredItem<Item> J_CORE = ITEMS.register("j_core", AliveDroneCore::new);
    public static final DeferredItem<Item> CYN_CORE = ITEMS.register("cyn_core", AliveDroneCore::new);
    public static final DeferredItem<Item> DOLL_CORE = ITEMS.register("doll_core", AliveDroneCore::new);
    public static final DeferredItem<Item> LIZZY_CORE = ITEMS.register("lizzy_core", AliveDroneCore::new);
    public static final DeferredItem<Item> THAD_CORE = ITEMS.register("thad_core", AliveDroneCore::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        TABS.register(eventBus);
    }
}
