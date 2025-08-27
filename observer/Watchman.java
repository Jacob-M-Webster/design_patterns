package observer;
/**
 * Watchman class which is a child of Subject | Handles un-friendly encounters
 * @author Jacob Webster
 */
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
