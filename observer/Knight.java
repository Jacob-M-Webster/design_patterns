package observer;
/**
 * Knight class | implements oberserver | provides dialogue based on the Subjects
 * @author Jacob Webster
 */
public class Knight implements Observer {

    public Knight(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    @Override
    public void update(boolean warning, int note) {
        Helper.determineMessage(warning, note,
        () -> System.out.println("Knight: Meets the messenger and directs them towards the castle."),
        () -> System.out.println("Knight: Gathers a charriot for a formal entry."),
        () -> System.out.println("Knight: Helps get everyone home safe."),
        () -> System.out.println("Knight: Prepares for battle.")
        );
    }
}
