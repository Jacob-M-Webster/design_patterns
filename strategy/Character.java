package strategy;

public abstract class Character {
    
    protected String name;
    protected WeaponBehavior WeaponBehavior;

    public Character(String name) {
        this.name = name;
    }

    public void attack(){
        WeaponBehavior.attack();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.WeaponBehavior = weaponBehavior;
    }

    public abstract String toString();
}
