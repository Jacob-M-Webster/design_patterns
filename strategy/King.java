package strategy;
/**
 * King class which is a child to character stores name and ascii art for the character
 * @author Jacob Webster
 */
public class King extends Character {
    
    public King (String name) {
        super(name);
    }

    @Override
    public String toString(){
        return "__/^^^\\__";
    }
}
