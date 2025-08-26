package observer;

public class Watchman extends Subject{
    @Override
    public void issueNotice(int note) {
        System.out.println("Trumpet is honked " + note + " time(s).");
        Trumpet.play(true, note);
        notifyObservers(note);
    }

    @Override
    public void notifyObservers(int note) {
        for (Observer observer : observers)
            observer.update(true, note);
    }
}
