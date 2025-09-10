package state;

public class InTransitState extends State{
    private int days;

    public InTransitState(Package pkg) {
        super(pkg);
    }

    public String getStatus() {
        return "The " + pkg.getName() + pkg.getVerb(" is", "'s are") + " out for delivery.";
    }

    public String getETA() {
        int delay = 0;
        String delayMessage = "";
        if (delayRandomizer(30)) {
            delayMessage = "The " + pkg.getName() + pkg.getVerb("", "'s") + " experienced a delay in shipping.\n";
            delay = random.nextInt(6) + 1;
        }
        return delayMessage + "The " + pkg.getName() + pkg.getVerb("", "'s") + " should arrive within " + (5 + delay) + " business days";
    }
}
