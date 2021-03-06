package simplepets.brainsynder.pet.types;

import org.bukkit.Material;
import simple.brainsynder.api.ItemBuilder;
import simple.brainsynder.sound.SoundMaker;
import simplepets.brainsynder.PetCore;
import simplepets.brainsynder.api.entity.IEntityPet;
import simplepets.brainsynder.api.entity.passive.IEntityVillagerPet;
import simplepets.brainsynder.pet.PetData;
import simplepets.brainsynder.pet.PetDefault;
import simplepets.brainsynder.wrapper.EntityWrapper;

public class VillagerDefault extends PetDefault {
    public VillagerDefault(PetCore plugin) {
        super(plugin, "villager", SoundMaker.ENTITY_VILLAGER_AMBIENT, EntityWrapper.VILLAGER);
    }

    @Override
    public ItemBuilder getDefaultItem() {
        return new ItemBuilder(Material.EMERALD).withName("&f&lVillager Pet");
    }

    @Override
    public Class<? extends IEntityPet> getEntityClass() {
        return IEntityVillagerPet.class;
    }

    @Override
    public PetData getPetData() {
        return PetData.VILLAGER;
    }
}
