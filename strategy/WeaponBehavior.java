package strategy;
/**
 * Weapon Behavior interface which determines the speed of all weapons and that they can attack
 * @author Jacob Webster
 */
public abstract interface WeaponBehavior {
    public int speed = 100;
    public abstract void attack();
}
