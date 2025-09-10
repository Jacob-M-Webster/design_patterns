package state;

import java.util.Random;

public abstract class State {
    protected Package pkg;
    protected Random random;

    public State(Package pkg) {
        this.pkg = pkg;
        this.random = new Random();
    }

    protected boolean delayRandomizer(int chance) {
        return ((random.nextInt(100) + 1) <= (chance));
    }

    public abstract String getStatus();

    public abstract String getETA();
}
