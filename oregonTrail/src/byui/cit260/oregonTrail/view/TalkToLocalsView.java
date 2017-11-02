/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.model.Actor;
import java.util.Scanner;


/**
 *
 * @author hannahwilliams
 */
public class TalkToLocalsView {
    
    private String menu;
    private String promptMessage;
    
    
    public TalkToLocalsView() {
    
    this.promptMessage = "\nWho would you like to speak to?";
    this.menu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Character Menu                                    |"
                    +"\n----------------------------------------------------"
                    +"\nA - Settler"
                    +"\nB - Pioneer"
                    +"\nC - Trapper"
                    +"\nD - Soldier"
                    +"\nE - Clerk"
                    +"\nF - Shoshone"
                    +"\nG - Cayusa"
                    +"\nH - Guide"
                    +"\nI - Wife"
                    +"\nJ - Son"
                    +"\nK - Daughter"
                    +"\nQ - Quit"
                    +"\n----------------------------------------------------";

    
    }
    
    public void displayTalkToLocalsView() {
         System.out.print(menu); // Prints out the menu.
        boolean done = false; //set flag to not done
        do {
            String menuOption = this.getMenuOption();//calls GetMenuOption from this class
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; // Returns control to displayNextView() in StartProgramView. (Exit game) TODO: Why does this exit game?
            
            Actor actor = null;
            
            String name = actor.getName();
            String description = actor.getDescription();
            
            
            //Calls doAction() in this class and passes in menu option. 
            done = this.doAction(menuOption); //do the requested action and display the next view
        
        } while (!done); // repeats the loop if done = false. False value will be returned from doAction() if menuOption is invalid.
    }

    private String getMenuOption() {
          Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //create variable value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage); // prints out promptMessage class instance variable.
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { // if value is blank, print error message and repeat loop.
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return the value entered to displayMainMenuView
    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        
        Actor actor;
        
        switch (menuOption) {
            case "A":
                actor = Actor.Settler;
            case "B":
                actor = Actor.Pioneer;
            case "C":
                actor = Actor.Trapper;
            case "D":
                actor = Actor.Soldier;
            case "E":
                actor = Actor.Clerk;
            case "F":
                actor = Actor.Shoshone;
            case "G":
                actor = Actor.Cayusa;
            case "H":
                actor = Actor.Guide;
            case "I":
                actor = Actor.Wife;
            case "J":
                actor = Actor.Son;
            case "K":
                actor = Actor.Daughter;
                
        }
        return false;
    
    
    }
    
}
