import java.util.ArrayList;
import java.lang.StringBuilder;

/**
 * IceCream class which creats and icecream which cone and scoops can be added to
 * @author Jacob Webster
 */
public abstract class IceCream {
    protected ArrayList<String> asciiArt = new ArrayList<>();
    protected int numScoops;
    /**
     * toString method which prints out the visul repreenstation of the icecream
     * @return string of the icecream 
     */
    public String toString(){
        StringBuilder art = new StringBuilder();
        for (String line : asciiArt)
            art.append(line).append("\n");
        return art.toString();
    }
}
