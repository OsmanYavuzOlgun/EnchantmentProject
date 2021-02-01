/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchantment;

import java.util.Objects;

/**
 *
 * @author User
 */
public abstract class Game {
    
    protected String Name;
    protected String publisher;
    protected String pbDate;
    protected double price;
    public static int numOfGames = 0;
    
    public Game()
    {
        this.Name="";
        this.publisher="";
        this.pbDate="";
        this.price=0;
        numOfGames++;
    }

    public Game(String Name, String publisher, String pbDate, double price) {
        this.Name = Name;
        this.publisher = publisher;
        this.pbDate = pbDate;
        this.price = price;
        numOfGames++;
    }

    
    
    
    public String getName() {
        return Name;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPbDate() {
        return pbDate;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPbDate(String pbDate) {
        this.pbDate = pbDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
   @Override
    public String toString() {
        return "Game\n----------"
                + "\nName=" + Name 
                + " \nPublisher=" + publisher 
                + " \nPublish Date=" + pbDate 
                + " \nPrice=" + price + "$" ;
    }
        @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.Name != other.Name ) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.Name);
        return hash;
    }
    
    
    public abstract void GetDiscount();
    
      public boolean findGameName(String Gname) {
        return this.Name.equalsIgnoreCase(Gname);
    }
    
    
    
    
}
