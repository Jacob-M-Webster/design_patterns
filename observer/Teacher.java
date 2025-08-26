package observer;

public class Teacher implements Observer {
    public Teacher(Subject watchman, Subject greeter) {
        
    }

    @Override
    public void update(boolean warning, int note) {
        System.out.println("testing");
    }
}
