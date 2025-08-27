package observer;
/**
 * Greeter class which is a child of Subject | Handles friendly encounters
 * @author Jacob Webster
 */
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
