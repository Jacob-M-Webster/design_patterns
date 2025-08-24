package strategy;
/**
 * WeaponStars class which dispays a star attack when a character with stars uses it
 * @author Jacob Webster
 */
public class WeaponStars implements WeaponBehavior {
    private String star = "*";
    /**
     * attack method repeatedly calls the printStars method and then sleeps until reaching the left end of the terminal
     */
    @Override
    public void attack() {
        int width = 80;

        for(int i = 0; i <= width; ++i) {
            printStars(i);
            Resources.sleep(speed);
        }
    }
    /**
     * printStars method displays the ascii art of the stars traveling across the screen
     * @param i handles how many stars to print 
     */
    private void printStars(int i) {
        System.out.print("\r");
        for(int j = 0; j < i; ++j) {
            System.out.print(star);
        }
    }
}
