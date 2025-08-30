package net.mikhalich.plushdronesreassembledmod;

import net.mikhalich.plushdronesreassembledmod.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PlushDronesReassembledMod.MOD_ID);

    private static <T extends Block> DeferredBlock<Block> registerBlock(String id, Function<BlockBehaviour.Properties, T> constructor) {
        return BLOCKS.register(id, () ->
                constructor.apply(Block.Properties.of()));
    }

    public static final DeferredBlock<Block> UZI_BLOCK = registerBlock("uzi_plushie", UziPlushie::new);
    public static final DeferredBlock<Block> N_BLOCK = registerBlock("n_plushie", NPlushie::new);
    public static final DeferredBlock<Block> V_BLOCK = registerBlock("v_plushie", VPlushie::new);
    public static final DeferredBlock<Block> J_BLOCK = registerBlock("j_plushie", JPlushie::new);
    public static final DeferredBlock<Block> CYN_BLOCK = registerBlock("cyn_plushie", CynPlushie::new);
    public static final DeferredBlock<Block> DOLL_BLOCK = registerBlock("doll_plushie", DollPlushie::new);
    public static final DeferredBlock<Block> LIZZY_BLOCK = registerBlock("lizzy_plushie", LizzyPlushie::new);
    public static final DeferredBlock<Block> THAD_BLOCK = registerBlock("thad_plushie", ThadPlushie::new);

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
