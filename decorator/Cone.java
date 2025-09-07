import java.util.ArrayList;
public class Cone extends IceCream {

    private static final String ANSI_BROWN = "\u001B[38;5;130m";
    protected static final String ANSI_RESET = "\u001B[0m";
    public Cone(){
        ArrayList<String> lines = FileReader.getLines("cone.txt");
        for (String line: lines) {
            String coloredLine = ANSI_BROWN + line + ANSI_RESET;
            asciiArt.add(coloredLine);
        }
    }
}
