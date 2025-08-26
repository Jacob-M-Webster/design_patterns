package observer;

public class Knight implements Observer {
    Subject watchman;

    public Knight(Subject watchman, Subject greeter) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    @Override
    public void update(boolean warning, int note) {
        System.out.println("testing");
    }
}
