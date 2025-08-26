package observer;

public class Helper {
    public static void determineMessage(boolean warning, int note, Runnable option1,
    Runnable option2, Runnable option3, Runnable option4) {
        if (!warning) {
            if (note == 1)
                option1.run();
            else if (note == 2)
                option2.run();
        } else {
            if (note == 1)
                option3.run();
            else if (note == 2)
                option4.run();
        }
    }
}
