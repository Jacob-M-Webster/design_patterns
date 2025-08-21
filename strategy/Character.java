package strategy;

public abstract class Character {
    
    protected String name;
    protected WeaponBehavior WeaponBehavior;

    public Character(String name) {

    }

    public void attack(){

    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {

    }

    public abstract String toString();
}
