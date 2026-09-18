package com.uhhstuffig.clockworkboss;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ClockworkBoss.MODID);

    public static final RegistryObject<EntityType<ClockworkBehemothEntity>> CLOCKWORK_BEHEMOTH =
            ENTITY_TYPES.register("clockwork_behemoth",
                    () -> EntityType.Builder.of(
                            ClockworkBehemothEntity::new,
                            MobCategory.MONSTER
                    )
                    .sized(9.0F, 12.0F)
                    .build("clockwork_behemoth"));
}