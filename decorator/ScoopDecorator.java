import java.lang.StringBuilder;

public abstract class ScoopDecorator extends IceCream{
    protected IceCream iceCream;
    protected int numFlavorScoops = 0;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE =  "\u001B[34m";
    protected static final String ANSI_WHITE = "\u001B[37m";
    protected static final String ANSI_RESET = "\u001B[0m";

    public ScoopDecorator(IceCream iceCream, int numScoops, String colorCode) {
        StringBuilder scoop = new StringBuilder();
        scoop.append(colorCode + "(");
        for (int i = 0; i < (numFlavorScoops * 2); ++i)
            scoop.append("-");
        scoop.append(")" + ANSI_RESET);
        ++numFlavorScoops;
        asciiArt.add(scoop.toString());
    }
}
