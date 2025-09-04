import java.util.ArrayList;
public class Cone extends IceCream {
    public Cone(){
        ArrayList<String> lines = FileReader.getLines("cone.txt");
        for (String line: lines)
            asciiArt.add(0, line);
    }
}
