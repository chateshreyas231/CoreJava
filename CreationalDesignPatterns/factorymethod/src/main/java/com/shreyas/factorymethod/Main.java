package com.shreyas.factorymethod;

import com.shreyas.factorymethod.blacksmith.Blacksmith;
import com.shreyas.factorymethod.blacksmith.ElfBlacksmith;
import com.shreyas.factorymethod.blacksmith.OrcBlacksmith;
import com.shreyas.factorymethod.weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        Blacksmith blacksmith;

        // Orc Blacksmith
        blacksmith = new OrcBlacksmith();
        Weapon orcSpear = blacksmith.manufactureWeapon("Spear");
        System.out.println("The orc blacksmith manufactured an " + orcSpear.getType());

        Weapon orcAxe = blacksmith.manufactureWeapon("Axe");
        System.out.println("The orc blacksmith manufactured an " + orcAxe.getType());

        // Elf Blacksmith
        blacksmith = new ElfBlacksmith();
        Weapon elfSpear = blacksmith.manufactureWeapon("Spear");
        System.out.println("The elf blacksmith manufactured an " + elfSpear.getType());

        Weapon elfAxe = blacksmith.manufactureWeapon("Axe");
        System.out.println("The elf blacksmith manufactured an " + elfAxe.getType());
    }
}
