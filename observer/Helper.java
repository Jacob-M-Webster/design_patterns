package observer;

public class Helper {
    public int determineMessage(boolean warning, int note) {
        int num = 0;
        if (warning) {
            if (note == 1)
                num = 1;
            else if (num == 2)
                num = 2;
        } else {
            if (note == 1)
                num = 3;
            else if (num == 2)
                num = 4;
        }
        return num;
    }
}
