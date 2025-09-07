/**
 * Strawberry Class which creates a strawberry scoop(s) of icecream
 * @author Jacob Webster
 */
public class Strawberry extends ScoopDecorator {
    /**
     * Creates a certain amount of strawberry icecream scoops on an ice cream cone
     * @param iceCream the IceCream that the scoops should be added to
     * @param numScoops the amount of strawberry scoops to be added
     */
    public Strawberry (IceCream iceCream, int numScoops) {
        super(iceCream, numScoops, ANSI_RED);
    }
}
