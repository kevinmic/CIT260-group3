/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.HuntControl;
import byui.cit260.oregonTrail.model.Animal;
import java.util.Scanner;
import oregonTrail.OregonTrail;

/**
 *
 * @author hannahwilliams
 */
public class HuntView {
    
    private String menu; 
    private String promptMessage;
    
    public HuntView() {
    
        this.promptMessage = "\nWhich animal would you like to hunt?";
        this.menu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Animal Menu                                        |"
                    +"\n----------------------------------------------------"
                    +"\nA - Bison - Bisons are herbivores. They have very poor eyesight but acute hearing and excellent smell."
                    +"\nB - Wolf - Wolves are carnivoes. They are territorial with an excellent sense of smell and tracking skills."
                    +"\nC - Bear - Bears are omnivores. They can be lazy but vicious if feeling threatened."
                    +"\nD - Rabbit - Rabbits are herbivores. They are fast with a great sense of smell."
                    +"\nQ - Quit"
                    +"\n----------------------------------------------------";
    }
    
    public void displayHuntView() {
         System.out.print(menu); // Prints out the menu.
        boolean done = false; //set flag to not done
        do {
            String menuOption = this.getMenuOption();//calls GetMenuOption from this class
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; // Returns control to displayNextView() in StartProgramView. (Exit game) TODO: Why does this exit game?
           
            
            HuntControl huntControl = new HuntControl();
            
            Animal animal = this.animalselection(menuOption);
            String difficulty = animal.getDifficulty();
            int startdate = OregonTrail.getCurrentGame().getStartDate();
            int traveldays = OregonTrail.getCurrentGame().getTravelDays();
            
            double successProbability = huntControl.calcHuntingSuccessProbability(difficulty, startdate, traveldays);
            
            System.out.println("Success Probability "+ successProbability);
            
                
            //Calls doAction() in this class and passes in menu option. 
            //done = this.dcalcHuntingSuccessProbabilityoAction(menuOption); //do the requested action and display the next view
            
            
        
        } while (!done); // repeats the loop if done = false. False value will be returned from doAction() if menuOption is invalid.
    
}

   
       private String getMenuOption() { //Called from displayMainMenuView in this class.
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

 
       
       public static Animal animalselection(String menuOption) {
        Animal animal = null;
        String difficulty;
        
        
        switch (menuOption) {
            case "A":
                animal = Animal.Bison;  
            case "B":
                animal = Animal.Wolf;
            case "C":
                animal = Animal.Bear;
            case "D":
                animal = Animal.Rabbit;
        }
        
        return animal;
        
    }
    
}
