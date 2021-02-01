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
public class Mobile extends Game implements MobileInterface {

    
    private String MOS;
    private String MGtype;

    public Mobile() {
        super("","","",0.0);
        this.MOS = "";
    }

    public Mobile(String MOS,String Name, String publisher, String pbDate, double price) {
        super(Name, publisher, pbDate, price);
        this.MOS = MOS;
    }

    public String getMOS() {
        return MOS;
    }

    public void setMOS(String MOS) {
        this.MOS = MOS;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMobile" +
                "\n MOS=" + MOS +
                "\n MGtype=";
    }
    
    @Override
    public void Suggest(String preference)
    {
      
       if(MOS.equals("Android")){ 
        if(preference.equalsIgnoreCase("High"))
        {
            MGtype="MOBA";
        }
        
        else if(MOS.equalsIgnoreCase("Medium"))
        { 
            MGtype="Hyper-Casual";
        }
        else
        {
            MGtype="Trivia";
        }
        
    }else if(MOS.equals("IOS"))
    {
       GameSys.preferIOS();
    }
        
}
    
    @Override
    public void GetDiscount() {
        
        price=price*10/100;
    }
    
}
