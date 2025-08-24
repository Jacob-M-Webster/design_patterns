package strategy;
/**
 * Troll class which is a child to character stores name and ascii art for the character
 * @author Jacob Webster
 */
public class Troll extends Character {
    
    public Troll (String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "/^\\";
    }
}
