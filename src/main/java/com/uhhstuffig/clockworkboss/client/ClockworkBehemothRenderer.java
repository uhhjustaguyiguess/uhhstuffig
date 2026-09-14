package com.uhhstuffig.clockworkboss.client;

import com.uhhstuffig.clockworkboss.ClockworkBehemothEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ClockworkBehemothRenderer extends GeoEntityRenderer<ClockworkBehemothEntity> {

    public ClockworkBehemothRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ClockworkBehemothModel());
    }
}