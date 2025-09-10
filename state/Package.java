package state;

public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

        orderedState = new OrderedState(this);
        inTransitState = new InTransitState(this);
        deliveredState = new DeliveredState(this);
    }

    public String order() {
        state = orderedState;
        return state.getStatus() + "\n" + state.getETA();
    }

    public String mail() {
        state = inTransitState;
        return state.getStatus() + "\n" + state.getETA();
    }

    public String received() {
        state = deliveredState;
        return state.getStatus() + "\n" + state.getETA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return this.name;
    }

    public String getVerb(String singular, String plural){
        if (quantity == 1) {
            return singular;
        } else {
            return plural;
        }
    }
}
