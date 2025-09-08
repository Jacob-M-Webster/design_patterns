package state;

public class OrderedState extends State {
    private int days;

    public OrderedState(Package pkg) {
        super(pkg);
    }

    public String getStatus() {
        return "placeholder";
    }

    public String getETA() {
        return "placeholder";
    }
}
