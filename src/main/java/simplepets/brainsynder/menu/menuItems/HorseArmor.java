package simplepets.brainsynder.menu.menuItems;

import org.bukkit.Material;
import simple.brainsynder.api.ItemMaker;
import simplepets.brainsynder.api.entity.IEntityPet;
import simplepets.brainsynder.api.entity.passive.IEntityHorsePet;
import simplepets.brainsynder.menu.menuItems.base.MenuItemAbstract;
import simplepets.brainsynder.pet.PetDefault;
import simplepets.brainsynder.utils.ItemBuilder;
import simplepets.brainsynder.wrapper.HorseArmorType;

public class HorseArmor extends MenuItemAbstract {
    public HorseArmor(PetDefault type, IEntityPet entityPet) {
        super(type, entityPet);
    }
    public HorseArmor(PetDefault type) {
        super(type);
    }

    @Override
    public ItemBuilder getItem() {
        ItemBuilder item = null;
        if (entityPet instanceof IEntityHorsePet) {
            IEntityHorsePet var = (IEntityHorsePet) entityPet;
            int typeID = 0;
            if (var.getArmor() != null) {
                typeID = var.getArmor().getId();
            }
            switch (typeID) {
                case 0:
                    item = new ItemBuilder(Material.BARRIER);
                    item.withName("&6No HorseArmor");
                    break;
                case 1:
                    item = new ItemBuilder(Material.IRON_BARDING);
                    item.withName("&6Iron HorseArmor");
                    break;
                case 2:
                    item = new ItemBuilder(Material.GOLD_BARDING);
                    item.withName("&6Gold HorseArmor");
                    break;
                case 3:
                    item = new ItemBuilder(Material.DIAMOND_BARDING);
                    item.withName("&6Diamond HorseArmor");
                    break;
            }
        }
        return item;
    }

    @Override
    public ItemBuilder getDefaultItem() {
        ItemBuilder item = null;
        if (entityPet instanceof IEntityHorsePet) {
            IEntityHorsePet var = (IEntityHorsePet) entityPet;
            int typeID = 0;
            if (var.getArmor() != null) {
                typeID = var.getArmor().getId();
            }
            switch (typeID) {
                case 0:
                    item = new ItemBuilder(Material.BARRIER);
                    item.withName("&6No HorseArmor");
                    break;
                case 1:
                    item = new ItemBuilder(Material.IRON_BARDING);
                    item.withName("&6Iron HorseArmor");
                    break;
                case 2:
                    item = new ItemBuilder(Material.GOLD_BARDING);
                    item.withName("&6Gold HorseArmor");
                    break;
                case 3:
                    item = new ItemBuilder(Material.DIAMOND_BARDING);
                    item.withName("&6Diamond HorseArmor");
                    break;
            }
        }
        return item;
    }

    @Override
    public void onLeftClick() {
        if (entityPet instanceof IEntityHorsePet) {
            IEntityHorsePet var = (IEntityHorsePet) entityPet;
            int typeID = 0;
            if (var.getArmor() != null) {
                typeID = var.getArmor().getId();
            }
            if (typeID == 3) {
                typeID = 0;
            } else {
                typeID++;
            }
            var.setArmor(HorseArmorType.fromId(typeID));
        }
    }

    @Override
    public void onRightClick() {
        if (entityPet instanceof IEntityHorsePet) {
            IEntityHorsePet var = (IEntityHorsePet) entityPet;
            int typeID = 0;
            if (var.getArmor() != null) {
                typeID = var.getArmor().getId();
            }
            if (typeID == 0) {
                typeID = 3;
            } else {
                typeID--;
            }
            var.setArmor(HorseArmorType.fromId(typeID));
        }
    }
}
