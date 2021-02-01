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
public class Desktop extends Game {

    private String OS; // operating system
    public SystemRequirements syst;

    public Desktop() {
        super("","","",0.0);
        this.OS = "";
        syst = null;
    }

    public Desktop(String Name, String publisher, String pbDate, double price, String OS, SystemRequirements syst) {
        super(Name, publisher, pbDate, price);
        this.OS = OS;
        this.syst = syst;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return  super.toString()+"\nDesktop"
                + "\nOS=" + OS;
    }
    
    @Override
    public void GetDiscount() {
        
        price=price*20/100;
        
    }
    
}
