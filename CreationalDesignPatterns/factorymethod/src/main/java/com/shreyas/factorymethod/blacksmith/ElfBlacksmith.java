package com.shreyas.factorymethod.blacksmith;

import com.shreyas.factorymethod.weapon.Weapon;
import com.shreyas.factorymethod.weapon.Spear;
import com.shreyas.factorymethod.weapon.Axe;
import java.util.HashMap;
import java.util.Map;

public class ElfBlacksmith implements Blacksmith {
    private static final Map<String, Weapon> ELFARSENAL = new HashMap<>();

    static {
        ELFARSENAL.put("Spear", new Spear());
        ELFARSENAL.put("Axe", new Axe());
    }

    @Override
    public Weapon manufactureWeapon(String weaponType) {
        return ELFARSENAL.get(weaponType);
    }
}
