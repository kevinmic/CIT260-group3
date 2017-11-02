/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
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
        int startDate = 1;
        
        switch (menuOption) {
            case "M":
                startDate = 61;
                this.saveStartDate(startDate);
                break;
            case "J":
                startDate = 151;
                this.saveStartDate(startDate);
                break;
            case "S":
                startDate = 241;
                this.saveStartDate(startDate);
                break;
            default:
                System.out.println("\n Invalid selection: Try again.");
                break;   
        }
        return false;
    } 

    private void displayNextView() {
        System.out.println("\n *** displayNextView() called ***");
    }

    private void saveStartDate(int startDate) {
        GameControl.setStartDate(startDate);
        this.findThisDay(startDate);
        
    }
    private void findThisDay(int startDate) {
        int travelDays = OregonTrail.getCurrentGame().getTravelDays();
        int monthDate = GameControl.findMonth(startDate, travelDays); 
        int day = GameControl.findDay(startDate, travelDays);
        String calDate = GameControl.thisDay(monthDate, day);
        System.out.println("\n*************************************************"
                          + "\n| StartDate: " + calDate
                          + "\n************************************************");
        this.displayNextView();
        
    }
}
