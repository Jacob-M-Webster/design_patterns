package observer;

public class ShopOwner implements Observer {
    public ShopOwner(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    @Override
    public void update(boolean warning, int note) {
        Helper.determineMessage(warning, note,
        () -> System.out.println("Shop Owner: Adds the finest displays to the shop windows to draw the messengers attention."),
        () -> System.out.println("Shop Owner: Makes way for a formal greeting on the street."),
        () -> System.out.println("Shop Owner: Closes down their shop and heads home."),
        () -> System.out.println("Shop Owner: Drops everything and finds the nearest hideout.")
        );
    }
}
