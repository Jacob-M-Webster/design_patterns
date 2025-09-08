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
    }

    public String order() {
        return "placeholder";
    }

    public String mail() {
        return "placeholder";
    }

    public String recieved() {
        return "placeholder";
    }

    public void setState(State state) {

    }

    public String getName() {
        return "placeholder";
    }

    public void getVerb(String singular, String plural){
        
    }
}
