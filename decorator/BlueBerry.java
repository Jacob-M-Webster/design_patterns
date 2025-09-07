/**
 * Blueberry Class which creates a blueberry scoop(s) of icecream
 * @author Jacob Webster
 */
public class BlueBerry extends ScoopDecorator{
    /**
     * Creates a certain amount of blueberry icecream scoops on an ice cream cone
     * @param iceCream the IceCream that the scoops should be added to
     * @param numScoops the amount of blueberry scoops to be added
     */
    public BlueBerry (IceCream iceCream, int numScoops) {
        super(iceCream, numScoops, ANSI_BLUE);
    }
}
