package strategy;
/**
 * WeaponBow class which dispays a bow attack when a character with a bow uses it
 * @author Jacob Webster
 */
public class WeaponBow implements WeaponBehavior {
    private String arrow = "-->";
    /**
     * attack method repeatedly calls the printBow method and then sleeps until reaching the left end of the terminal
     */
    @Override
    public void attack() {
        int width = 80;

        for(int i = 0; i <= width; ++i) {
            printBow(i);
            Resources.sleep(speed);
        }
    }
    /**
     * printBow method displays the ascii art of the bow being fired
     * @param i handles how many spaces to add to make the arrow look like its moving
     */
    private void printBow(int i) {
        System.out.print("\r");
        System.out.print(")");
        for(int j = 0; j < i; ++j) {
            System.out.print(" ");
        }
        System.out.print(arrow);
    }
}
