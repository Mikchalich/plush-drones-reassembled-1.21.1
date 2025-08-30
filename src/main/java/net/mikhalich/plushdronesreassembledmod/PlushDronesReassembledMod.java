package net.mikhalich.plushdronesreassembledmod;

import net.mikhalich.plushdronesreassembledmod.items.MusicDisc;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(PlushDronesReassembledMod.MOD_ID)
public class PlushDronesReassembledMod {
    public static final String MOD_ID = "plushdronesreassembledmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PlushDronesReassembledMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        Items.register(modEventBus);
        Blocks.register(modEventBus);
        Sounds.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }
}
