package strategy;
/**
 * WeaponNone class which dispays a message saying the character cant attack
 * @author Jacob Webster
 */
public class WeaponNone implements WeaponBehavior {
    public void attack() {
        System.out.println("I cannot attack without a weapon!");
    }
}
