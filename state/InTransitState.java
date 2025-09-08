package state;

public class InTransitState extends State{
    private int days;

    public InTransitState(Package pkg) {
        super(pkg);
    }

    public String getStatus() {
        return "placeholder";
    }

    public String getETA() {
        return "placeholder";
    }
}
