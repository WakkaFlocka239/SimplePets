package simplepets.brainsynder.nms.v1_13_R2.entities.list;

import net.minecraft.server.v1_13_R2.DataWatcher;
import net.minecraft.server.v1_13_R2.DataWatcherObject;
import net.minecraft.server.v1_13_R2.EntityTypes;
import net.minecraft.server.v1_13_R2.World;
import simple.brainsynder.nbt.StorageTagCompound;
import simplepets.brainsynder.api.Size;
import simplepets.brainsynder.api.entity.hostile.IEntityCreeperPet;
import simplepets.brainsynder.api.pet.IPet;
import simplepets.brainsynder.nms.v1_13_R2.entities.EntityPet;
import simplepets.brainsynder.nms.v1_13_R2.utils.DataWatcherWrapper;

/**
 * NMS: {@link net.minecraft.server.v1_13_R2.EntityCreeper}
 */
@Size(width = 0.6F, length = 1.9F)
public class EntityCreeperPet extends EntityPet implements IEntityCreeperPet {
    protected static final DataWatcherObject<Integer> STATE;
    protected static final DataWatcherObject<Boolean> POWERED;
    protected static final DataWatcherObject<Boolean> IGNITED;

    static {
        STATE = DataWatcher.a(EntityCreeperPet.class, DataWatcherWrapper.INT);
        POWERED = DataWatcher.a(EntityCreeperPet.class, DataWatcherWrapper.BOOLEAN);
        IGNITED = DataWatcher.a(EntityCreeperPet.class, DataWatcherWrapper.BOOLEAN);
    }

    public EntityCreeperPet(EntityTypes<?> type, World world) {
        super(type, world);
    }

    public EntityCreeperPet(EntityTypes<?> type, World world, IPet pet) {
        super(type, world, pet);
    }

    @Override
    protected void registerDatawatchers() {
        super.registerDatawatchers();
        this.datawatcher.register(STATE, -1);
        this.datawatcher.register(POWERED, false);
        this.datawatcher.register(IGNITED, false);
    }

    @Override
    public StorageTagCompound asCompound() {
        StorageTagCompound object = super.asCompound();
        object.setBoolean("powered", isPowered());
        return object;
    }

    @Override
    public void applyCompound(StorageTagCompound object) {
        if (object.hasKey("powered")) setPowered(object.getBoolean("powered"));
        super.applyCompound(object);
    }

    @Override
    public boolean isIgnited() {
        return datawatcher.get(IGNITED);
    }

    @Override
    public void setIgnited(boolean flag) {
        this.datawatcher.set(IGNITED, flag);
    }

    @Override
    public boolean isPowered() {
        return datawatcher.get(POWERED);
    }

    @Override
    public void setPowered(boolean flag) {
        this.datawatcher.set(POWERED, flag);
    }
}
