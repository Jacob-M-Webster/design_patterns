package state;

public class DeliveredState extends State {
    public DeliveredState(Package pkg) {
        super(pkg);
    }

    public String getStatus() {
        return "placeholder";
    }

    public String getETA() {
        return "placeholder";
    }
}
