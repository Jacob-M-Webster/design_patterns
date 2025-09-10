package state;

public class OrderedState extends State {
    private int days;

    public OrderedState(Package pkg) {
        super(pkg);
    }

    public String getStatus() {
        return "The " + pkg.getName() + pkg.getVerb(" is", "'s are") + " ordered.";
    }

    public String getETA() {
        int delay = 0;
        String delayMessage = "";
        if (delayRandomizer(20)) {
            delayMessage = "The " + pkg.getName() + pkg.getVerb("", "'s") + " experienced a slight delay in manufacturing.\n";
            delay = random.nextInt(2) + 1;
        }
        return delayMessage + "The " + pkg.getName() + pkg.getVerb("", "'s") + " will be shipped in " + (2 + delay) + " business days";
    }
}
