package strategy;

public class WeaponBow implements WeaponBehavior {
    private String arrow = "-->";

    @Override
    public void attack() {
        int width = 80;

        for(int i = 0; i <= width; ++i) {
            printBow(i);
            Resources.sleep(speed);
        }
    }

    private void printBow(int i) {
        System.out.print("\r");
        System.out.print(")");
        for(int j = 0; j < i; ++j) {
            System.out.print(" ");
        }
        System.out.print(arrow);
    }
}
