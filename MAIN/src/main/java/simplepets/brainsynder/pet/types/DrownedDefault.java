package simplepets.brainsynder.pet.types;

import simple.brainsynder.api.ItemBuilder;
import simple.brainsynder.sound.SoundMaker;
import simple.brainsynder.utils.ServerVersion;
import simplepets.brainsynder.PetCore;
import simplepets.brainsynder.api.entity.IEntityPet;
import simplepets.brainsynder.api.entity.hostile.IEntityDrownedPet;
import simplepets.brainsynder.pet.PetData;
import simplepets.brainsynder.pet.PetDefault;
import simplepets.brainsynder.wrapper.EntityWrapper;

public class DrownedDefault extends PetDefault {
    public DrownedDefault(PetCore plugin) {
        super(plugin, "drowned", SoundMaker.ENTITY_DROWNED_AMBIENT_WATER, EntityWrapper.DROWNED);
    }

    @Override
    public ItemBuilder getDefaultItem() {
        return ItemBuilder.getSkull(simple.brainsynder.utils.SkullType.PLAYER)
                .setTexture("http://textures.minecraft.net/texture/c3f7ccf61dbc3f9fe9a6333cde0c0e14399eb2eea71d34cf223b3ace22051")
                .withName("&f&lDrowned Pet");
    }

    @Override
    public ServerVersion getAllowedVersion() {
        return ServerVersion.v1_13_R1;
    }

    @Override
    public Class<? extends IEntityPet> getEntityClass() {
        return IEntityDrownedPet.class;
    }

    @Override
    public PetData getPetData() {
        return PetData.ZOMBIE;
    }
}
