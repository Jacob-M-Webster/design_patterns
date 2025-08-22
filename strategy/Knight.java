package strategy;

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
