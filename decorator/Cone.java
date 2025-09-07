import java.util.ArrayList;
import java.lang.StringBuilder;
public class Cone extends IceCream {

    private static final String ANSI_BROWN = "\u001B[38;5;130m";
    public Cone(){
        ArrayList<String> lines = FileReader.getLines("cone.txt");
        for (String line: lines) {
            StringBuilder string = new StringBuilder();
            string.append(ANSI_BROWN).append(line);
            asciiArt.add(0, line);
        }
    }
}
