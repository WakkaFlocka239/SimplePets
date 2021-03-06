package simplepets.brainsynder.nms.v1_15_R1.entities.list;

import net.minecraft.server.v1_15_R1.EntityCreature;
import net.minecraft.server.v1_15_R1.EntityTypes;
import net.minecraft.server.v1_15_R1.World;
import simplepets.brainsynder.api.Size;
import simplepets.brainsynder.api.entity.hostile.IEntityWitherSkeletonPet;
import simplepets.brainsynder.api.pet.IPet;
import simplepets.brainsynder.nms.v1_15_R1.entities.branch.EntitySkeletonAbstractPet;

/**
 * NMS: {@link net.minecraft.server.v1_15_R1.EntitySkeletonWither}
 */
@Size(width = 0.7F, length = 2.4F)
public class EntityWitherSkeletonPet extends EntitySkeletonAbstractPet implements IEntityWitherSkeletonPet {
    public EntityWitherSkeletonPet(EntityTypes<? extends EntityCreature> type, World world) {
        super(type, world);
    }
    public EntityWitherSkeletonPet(EntityTypes<? extends EntityCreature> type, World world, IPet pet) {
        super(type, world, pet);
    }
}
