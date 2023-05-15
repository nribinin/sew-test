package andere_files;

import java.util.Objects;

public class Weapon {
    private String weapon;

    public Weapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return this.weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon1 = (Weapon) o;
        return Objects.equals(weapon, weapon1.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weapon);
    }

}
