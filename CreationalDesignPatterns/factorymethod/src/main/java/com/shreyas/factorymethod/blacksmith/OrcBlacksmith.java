package com.shreyas.factorymethod.blacksmith;

import com.shreyas.factorymethod.weapon.Weapon;
import com.shreyas.factorymethod.weapon.Spear;
import com.shreyas.factorymethod.weapon.Axe;
import java.util.HashMap;
import java.util.Map;

public class OrcBlacksmith implements Blacksmith {
    private static final Map<String, Weapon> ORCARSENAL = new HashMap<>();

    static {
        ORCARSENAL.put("Spear", new Spear());
        ORCARSENAL.put("Axe", new Axe());
    }

    @Override
    public Weapon manufactureWeapon(String weaponType) {
        return ORCARSENAL.get(weaponType);
    }
}
