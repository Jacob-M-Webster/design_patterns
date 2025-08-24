package strategy;

public class WeaponNone implements WeaponBehavior {
    public void attack() {
        System.out.println("I cannot attack without a weapon :C");
    }
}
