package strategy;

public class WeaponStars implements WeaponBehavior {
    private String star = "*";

    @Override
    public void attack() {
        int width = 80;

        for(int i = 0; i <= width; ++i) {
            printStars(i);
            Resources.sleep(speed);
        }
    }

    private void printStars(int i) {
        System.out.print("\r");
        for(int j = 0; j < i; ++j) {
            System.out.print(star);
        }
    }
}
