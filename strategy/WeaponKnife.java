package strategy;
/**
 * WeaponKnife class which dispays a knife attack when a character with a knife uses it
 * @author Jacob Webster
 */
public class WeaponKnife implements WeaponBehavior{
    private String knife = "-]---";
    /**
     * attack method repeatedly calls the printKnife method and then sleeps until reaching the left end of the terminal
     */
    @Override
    public void attack() {
        int width = 80;

        for(int i = 0; i <= width; ++i) {
            printKnife(i);
            Resources.sleep(speed);
        }
    }
    /**
     * printBow method displays the ascii art of the knife being thrown
     * @param i handles how many spaces to add to make the knife look like its moving
     */
    private void printKnife(int i) {
        System.out.print("\r");
        for(int j = 0; j < i; ++j) {
            System.out.print(" ");
        }
        System.out.print(knife);
    }
}
