/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;


/**
 *
 * @author Dresen_HP
 */
public enum Occupation {
    Farmer("Farmer", "He is skilled at growing food. He will receive a bonus when he reaches Oregon."),
   Blacksmith("Blacksmith", "He is good at fixing things. He will be able to fix most wagon breakdowns."),
   Merchant("Merchant", "He drives a hard bargain. He will start with an extra $200.");
   
   // class instance variables
    private final String name;
    private final String description;
    
    Occupation(String name, String description) {
        this.name = name;
        this.description = description;
        
    }   

    public static Occupation getFarmer() {
        return Farmer;
    }

    public static Occupation getBlacksmith() {
        return Blacksmith;
    }

    public static Occupation getMerchant() {
        return Merchant;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Occupation{" + "name=" + name + ", description=" + description + '}';
    }
    
    
}
