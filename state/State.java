package state;

import java.util.Random;

public abstract class State {
    protected Package pkg;
    protected Random random;

    public State(Package pkg) {

    }

    public abstract String getStatus();

    public abstract String getETA();
}
