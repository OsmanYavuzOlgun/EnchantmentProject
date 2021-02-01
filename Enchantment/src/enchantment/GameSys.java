/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchantment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GameSys {
    
    
     public static ArrayList <Game> arr = new ArrayList <Game> ();
     public static LinkedHashSet<Game> user=new LinkedHashSet<>();
     public static final String GAMES = "games.txt";
     
     public static boolean CheckGame(String game)
     {
         for(int i=0;i<arr.size();i++)
         {
             Game g=arr.get(i);
             if(g.findGameName(game))
             {
                 return true;
             }
         }
         return false;
     }
     
    /*  public static boolean addNewGame(String MGtype,String type,String OS, String Name, String publisher, String pbDate, double price, SystemRequirements sys)
     {
         Desktop d;
         Mobile m;
         
           if (CheckGame(Name)) {
            return false;
        } else {
            if (type.equalsIgnoreCase("Desktop")) {
                d = new Desktop(Name, publisher,pbDate, price,OS, sys);
                arr.add(d);
            } else {
             
                m = new Mobile(OS,Name,publisher, pbDate, price);
                arr.add(m);
            }
        }
        return true; 
         
     }*/
     
     public static void addToUser(int index){
        {
            user.add(arr.get(index));
        }
         
     }
     
    public static String displayUserGames() {
        String res = "";
        for (Game s : user) {
            res += s + "\n";
        }
       
        return res;
    }
    
      public static String[] getGameNameUser()
        {
            int i=0;
            String[] res=new String[arr.size()];
                    for(Game g: user)
                    {
                       res[i] = "" + g.getName();
                       i++;
                    }            
            return res;
        }
          
      
     
      
      public static void readGames() throws FileNotFoundException {
        File file = new File(GAMES);
        Scanner input = null;
        Mobile s = null;
        Game2D d2 = null;
        Game3D d3 = null;
        SystemRequirements syst;
        
        String[] line;
        if (!file.exists()) {
            System.out.println("File does not exist");
        } else {
            input = new Scanner(file);
            while (input.hasNext()) {
                line = input.nextLine().split("%");
                if(line[0].equalsIgnoreCase("Mobile"))
                {
                    s = new Mobile(line[1],line[2],line[3],line[4],Double.parseDouble(line[5]));
                    arr.add(s);
                }
                else if(line[0].equalsIgnoreCase("3D"))
                {
                    syst =new SystemRequirements(Double.parseDouble(line[7]),Integer.parseInt(line[8]),Integer.parseInt(line[9]));
                    d3 = new Game3D(line[1], line[2], line[3], line[4], line[5],Double.parseDouble(line[6]), syst);
                    arr.add(d3);
                }
                else if(line[0].equalsIgnoreCase("2D"))
                {
                    syst =new SystemRequirements(Double.parseDouble(line[7]),Integer.parseInt(line[8]),Integer.parseInt(line[9]));
                    d2 = new Game2D(line[1], line[2], line[3], line[4], line[5],Double.parseDouble(line[6]), syst);
                    arr.add(d2);
                }        
               }
            }
     
        input.close();
    }

      
      
       public static void UserRemoveGame(String RemoveName)
     {
         
        while(user.isEmpty())
        {if (user.equals(RemoveName)) {
                    UserRemoveGame(RemoveName);
        }
        }
     }
       
        public static String DisplayChosen(int index)
     {
         String out="";
         {
            out = "" + arr.get(index);
        }
        return out;
         
     }
         public static String UserDisplayChosen(String name)
     {
         String out="";
         {
            for(Game g: user)  
            {if(g.getName().equalsIgnoreCase(name))
                out = "" + g;
            }
           }
        
        return out;
         
     }
          public static String All()
     {
        Game temp;
        String out = "";
        for(Game g : arr){
           
            temp = g;
            out += temp.toString() + "\n\n";
           
        }
        return out;
         
     }
        
        public static Game SearchGame(String SearchName)
        {
            
            for (int i = 0; i < arr.size(); i++) {
            String Name  = arr.get(i).getName();
            if (SearchName.equalsIgnoreCase(Name)) {
                return arr.get(i);
            }
        }
        return null;
        }
        
        public static String[] getGameMobileName()
        {
            int i=0;
            String[] res=new String[arr.size()];
                    for(Game g: arr)
                    {
                        if(g instanceof Mobile)
                        {res[i] = " " + g.getName();
                          i++;
                        }
                    }            
            return res;
        }
           public static String[] getGameNameDesktop()
        {
            int i=0;
            String[] res=new String[arr.size()];
                    for(Game g: arr)
                    {
                        if(g instanceof Game2D || g instanceof Game3D)
                        {res[i] = " " + g.getName();
                          i++;
                        }
                    }            
            return res;
        }
        
        
        
        public static void preferIOS()
        {
            for(Game v: arr)
                if(v instanceof Mobile)
                   if(((Mobile) v).getMOS().equalsIgnoreCase("IOS"))
                   {
                       System.out.println("\n " + v.toString());
                       
                   }     
                           
                           
                
            
        }

    static String getGameNameUser(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
