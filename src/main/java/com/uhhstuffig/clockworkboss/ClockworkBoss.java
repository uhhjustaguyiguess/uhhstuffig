package com.uhhstuffig.clockworkboss;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ClockworkBoss.MODID)
public class ClockworkBoss {

    public static final String MODID = "clockworkboss";

    public ClockworkBoss() {
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEntities.ENTITY_TYPES.register(modEventBus);
        modEventBus.addListener(this::registerAttributes);
    }

    private void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(
                ModEntities.CLOCKWORK_BEHEMOTH.get(),
                ClockworkBehemothEntity.createAttributes().build()
        );
    }
}