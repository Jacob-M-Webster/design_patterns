package strategy;

public class WeaponKnife implements WeaponBehavior{
    private String knife = "-]---";

    @Override
    public void attack() {
        int width = 80;

        for(int i = 0; i <= width; ++i) {
            printKnife(i);
            Resources.sleep(speed);
        }
    }

    private void printKnife(int i) {
        System.out.print("\r");
        for(int j = 0; j < i; ++j) {
            System.out.print(" ");
        }
        System.out.print(knife);
    }
}
