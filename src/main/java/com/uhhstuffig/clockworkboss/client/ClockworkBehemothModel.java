package
com.uhhstuffig.clockworkboss.client

import
com.uhhstuffig.clockeorkboss.ClockworkBehemothEntity;
import
net.minecraft.resources.ResourceLocation;
import
software.bernie.geckolib.model.GeoModel;

public class ClockworkBehemothModel
extends
GeoModel<ClockworkBehemothEntity> {

    private static final
ResourceLocation MODEL = 
            new
ResourceLocation("clockworkboss","geo/clockwork_behemoth.geo.json");

    private static final
ResourceLocation TEXTURE =
            new ResourceLocation("clockworkboss", "textures/entity/clockwork_behemoth.png");

    private static final ResourceLocation ANIMATION =
            new ResourceLocation("clockworkboss", "animations/clockwork_behemoth.animation.json");

    @Override
    public ResourceLocation getModelResource(ClockworkBehemothEntity entity) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(ClockworkBehemothEntity entity) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(ClockworkBehemothEntity entity) {
        return ANIMATION;
    }
}