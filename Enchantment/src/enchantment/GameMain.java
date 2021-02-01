/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchantment;

import java.io.FileNotFoundException;

/**
 *
 * @author User
 */
public class GameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        //THERE WILL BE FRAMES SO WE DO NOT WRITE ANYTHING HERE.
        EnchantmentMainFrame enchantment = new EnchantmentMainFrame();
        enchantment.setVisible(true);
        GameSys.readGames();
        String out=GameSys.All();
        System.out.println("" + out);
        
    }
    
}
