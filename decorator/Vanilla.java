/**
 * Vanilla Class which creates a vanilla scoop(s) of icecream
 * @author Jacob Webster
 */
public class Vanilla extends ScoopDecorator{
    /**
     * Creates a certain amount of vanilla icecream scoops on an ice cream cone
     * @param iceCream the IceCream that the scoops should be added to
     * @param numScoops the amount of vinalla scoops to be added
     */
    public Vanilla (IceCream iceCream, int numScoops) {
        super(iceCream, numScoops, ANSI_WHITE);
    }
}
