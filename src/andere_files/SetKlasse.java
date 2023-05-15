package andere_files;

import java.util.HashSet;
import java.util.Set;

public class SetKlasse {
    public static void main(String[] args) {
        Set<Weapon> weapons = new HashSet<>();
        weapons.add(new Weapon("AK 7"));
        weapons.add(new Weapon("MG"));
        weapons.add(new Weapon("Sniper"));
        weapons.add(new Weapon("Knive"));
        weapons.add(new Weapon("AK-47"));
        weapons.add(new Weapon("Sniper"));
        weapons.add(new Weapon("MG"));

        for (Weapon weapon : weapons) {
            System.out.println(weapon.getWeapon());
        }
    }
}
