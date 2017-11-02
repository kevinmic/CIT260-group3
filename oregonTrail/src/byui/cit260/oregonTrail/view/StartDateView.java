/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.util.Scanner;
import oregonTrail.OregonTrail;

/**
 *
 * @author Dresen_HP
 */
public class StartDateView {
    // class instance variables
    private String menu; // occupation menu
    private String promptMessage; // prompt message
    
    // constructor function called from displayNextView() in StartGameView
    public StartDateView() {
        this.promptMessage = "\nPlease enter your start date choice.";
        this.menu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Choose the day to start traveling                |" 
                    +"\n| Choice will affect weather and conditions        |"
                    +"\n----------------------------------------------------"
                    +"\nM - March 1"
                    +"\nJ - June 1"
                    +"\nS - September 1"
                    +"\n----------------------------------------------------";
    }
    
        public void displayStartDateView() { // called from displayNextView() in StartGameView
        System.out.print(menu);
        boolean done = false;
        do {
            String menuOption = this.getMenuOption(); //calls getMenuOption from this class
            if (menuOption.toUpperCase().equals("Q"))
                return; // returns to displayNextView
            done = this.doAction(menuOption); // calls doAction() in this class
        } while (!done); // repeats the loop if not done
        this.displayNextView();
    }


    private String getMenuOption() { // called from displayStartDateView() in this class
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(this.promptMessage);
            
            value = keyboard.nextLine(); 
            value = value.trim(); 
            
            if (value.length() < 1) { 
                System.out.println("\nInvalid value: value cannot be blank.");
                continue;    
            }
            break;
        }
        return value; // returns choice back to displayStartDateView() in this class
    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        System.out.println(menuOption);
        
        if (menuOption == "M") {
            System.out.println("\nStartDate is March 1");
            return true;
            
        } else if (menuOption == "J") {
            OregonTrail.getCurrentGame().setStartDate(151);
            
        } else if (menuOption == "S") {
            OregonTrail.getCurrentGame().setStartDate(241);
            
        } else {
            System.out.println("\n*** Invalid selection *** Try again");
                
        } return true;
    } 

    private void displayNextView() {
        System.out.println("\n *** displayNextView() called ***");
    }
}
