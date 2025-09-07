import java.util.ArrayList;
/**
 * Cone class which creates a cone using the provided file reader and txt files
 * @author Jacob Webster
 */
public class Cone extends IceCream {

    private static final String ANSI_BROWN = "\u001B[38;5;130m";
    protected static final String ANSI_RESET = "\u001B[0m";
    /**
     * Reads in the cone.txt file colors it brown and then adds it to the icecreams asci art
     */
    public Cone(){
        ArrayList<String> lines = FileReader.getLines("cone.txt");
        for (String line: lines) {
            String coloredLine = ANSI_BROWN + line + ANSI_RESET;
            asciiArt.add(coloredLine);
        }
    }
}
