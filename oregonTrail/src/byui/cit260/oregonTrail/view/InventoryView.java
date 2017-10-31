/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.util.Map;

/**
 *
 * @author Dresen_HP
 */
public class InventoryView {
    // class instance variables
    private Map inventory; // inventory list
    private String promptMessage; // enter choice prompt
    
    // constructor function called from ??? TODO: Would this be called from game menu or from startGame?
    public InventoryView() {
        this.promptMessage = "Please enter your choice";
        //this.inventory = player.getItems();
    }
}
