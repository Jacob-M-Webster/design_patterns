import java.util.ArrayList;
import java.lang.StringBuilder;

public abstract class IceCream {
    protected ArrayList<String> asciiArt = new ArrayList<>();
    protected int numScoops;

    public String toString(){
        StringBuilder art = new StringBuilder();
        for (String line : asciiArt)
            art.append(line).append("\n");
        return art.toString();
    }
}
