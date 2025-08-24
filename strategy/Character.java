package strategy;
/**
 * Character class which creates a charcater that has a weapon and the ability to attack
 * @author Jacob Webster
 */
public abstract class Character {
    
    protected String name;
    protected WeaponBehavior WeaponBehavior;

    public Character(String name) {
        this.name = name;
    }
    /**
     * Calls the attack method of the characters specified weapon
     */
    public void attack(){
        WeaponBehavior.attack();
    }
    /**
     * Sets the characters weapon based on the users selection
     * @param weaponBehavior used to set the users weapon choice to the characters weapon
     */
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.WeaponBehavior = weaponBehavior;
    }

    public abstract String toString();
}
