package observer;
/**
 * Teacher class | implements oberserver | provides dialogue based on the Subjects
 * @author Jacob Webster
 */
public class Teacher implements Observer {
    public Teacher(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    @Override
    public void update(boolean warning, int note) {
        Helper.determineMessage(warning, note,
        () -> System.out.println("Teacher: Engages children in an activity so they do not get distracted."),
        () -> System.out.println("Teacher: Gathers children and makes way for a formal greeting on the street."),
        () -> System.out.println("Teacher: Helps every child get home safe."),
        () -> System.out.println("Teacher: Brings all students to the underground shleter.")
        );
    }
}
