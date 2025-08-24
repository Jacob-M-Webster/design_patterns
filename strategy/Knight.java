package strategy;
/**
 * Knight class which is a child to character stores name and ascii art for the character
 * @author Jacob Webster
 */
public class Knight extends Character {
    
    public Knight (String name) {
        super(name);
    }

    @Override
    public String toString(){
        return " __\r\n" + //
                        "\r\n" + //
                        "(--)";
    }
}
