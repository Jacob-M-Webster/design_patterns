package observer;

public class Greeter extends Subject {
    @Override
    public void issueNotice(int note) {
        System.out.println("Trumpet fanfair is sounded " + note + " time(s).");
        Trumpet.play(false, note);
        notifyObservers(note);
    }

    @Override
    public void notifyObservers(int note) {
        for (Observer observer : observers)
            observer.update(false, note);
    }
}
