/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchantment;

/**
 *
 * @author User
 */
public class Game2D extends Desktop{
    
    private String Type2D;

    public Game2D() {
        super("","","",0.0,"",null);
        this.Type2D="";
    }

    public Game2D(String OS, String Name, String publisher, String pbDate,String Type2D, double price, SystemRequirements sys) {
        super(Name, publisher, pbDate, price, OS, sys);
        this.Type2D = Type2D;
    }

    public String getType2D() {
        return Type2D;
    }

    public void setType2D(String Type2D) {
        this.Type2D = Type2D;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nGame2D" + "\nType2D=" + Type2D;
    }
    
    
    
}
