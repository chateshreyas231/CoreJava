package com.shreyas.factorymethod.blacksmith;

import com.shreyas.factorymethod.weapon.Weapon;

public interface Blacksmith {
    Weapon manufactureWeapon(String weaponType);
}
