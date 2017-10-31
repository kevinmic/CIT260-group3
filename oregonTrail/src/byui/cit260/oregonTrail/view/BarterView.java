/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

/**
 *
 * @author Dresen_HP
 */
public class BarterView {
    // class instance variables
    private String menu; // barter menu
    private String promptMessage; // enter choice prompt
    
    // constructor funtion called from GameMenuView
    public BarterView() {
        // stores prompt message in class instance variable
        this.promptMessage = "\nPlease enter your choice: ";
        // stores barter menu in class instance variable.
        this.menu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Barter Menu                                        |"
                    +"\n----------------------------------------------------"
                    +"\nL - Learn more about the Oregon Trail"
                    +"\nO - Objectives of the game"
                    +"\nS - Learn about each occupation"
                    +"\nQ - Quit to main menu"
                    +"\n----------------------------------------------------";
    }
    
}
