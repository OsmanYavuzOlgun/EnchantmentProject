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
public class Game3D extends Desktop {
    
     private String Type3D;

    public Game3D() {
        super("","","",0.0,"",null);
        this.Type3D = "";
    }

    public Game3D(String OS, String Name, String publisher, String pbDate,String Type3D ,double price, SystemRequirements sys) {
        super(Name, publisher, pbDate, price, OS, sys);
        this.Type3D = Type3D;
    }

    public String getType3D() {
        return Type3D;
    }

    public void setType3D(String Type3D) {
        this.Type3D = Type3D;
    }

    @Override
    public String toString() {
        return "Game3D" + super.toString()+
                "\nType3D=\n" + Type3D;
    }
    
    
     
     
}
