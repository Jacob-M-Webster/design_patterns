package observer;

public class ShopOwner implements Observer {
    public ShopOwner(Subject watchman, Subject greeter) {
        
    }

    @Override
    public void update(boolean warning, int note) {
        System.out.println("testing");
    }
}
