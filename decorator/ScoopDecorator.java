import java.lang.StringBuilder;
import java.util.ArrayList;

public abstract class ScoopDecorator extends IceCream{
    protected IceCream iceCream;
    protected static int numFlavorScoops = 5;

    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_BLUE =  "\u001B[34m";
    protected static final String ANSI_WHITE = "\u001B[37m";
    protected static final String ANSI_RESET = "\u001B[0m";

    public ScoopDecorator(IceCream iceCream, int numScoops, String colorCode) {

        this.iceCream = iceCream;
        this.numScoops = numScoops;
        this.asciiArt = new ArrayList<>();

        for (int i = 0; i < numScoops; ++i) {
            StringBuilder scoop = new StringBuilder();
            for (int spaces = 0; spaces < 5 - numFlavorScoops; ++spaces)
                scoop.append(" ");
            scoop.append(colorCode + "(");
            for (int ii = 0; ii < (numFlavorScoops * 2); ++ii)
                scoop.append("-");
            scoop.append(")" + ANSI_RESET);
            asciiArt.add(0, scoop.toString());
            --numFlavorScoops;
        }

        this.asciiArt.addAll(iceCream.asciiArt);
    }
}
