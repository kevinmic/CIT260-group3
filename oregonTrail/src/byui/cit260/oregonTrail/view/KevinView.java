/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author hannahwilliams
 */

public abstract class KevinView implements ViewInterface {

    protected KevinMenu menu;


    public KevinView() {
    }

    void setMenu(KevinMenu menu) {
        this.menu = menu;
    }

    @Override
    public void display() {  //called from main() in OregonTrail.java
            boolean done = false; // set flag to not done
            do {
                //prompt for and get player's name
                String value = this.getInput(); // calls getPlayersName() from this class, stores in string playersName
                if (value.toUpperCase().equals("Q")) // user wants to quit
                    return; //exit the game
                 
                //do the requested action and display the next view
                done = this.doAction(value);// Calls doAction()in this class and passes in name. Return value changes boolean to true to exit do while loop.
            } while (!done);
    }
    
    public String getInput() { // called from displayStartProgramView() in this class.
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //create variable value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + createPrompt()); // print out the message asking for name stored in class instance variable.
            
            value = keyboard.nextLine(); //get next line typed on keyboard and store in value
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //if value is blank print error message, starts loop again
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return the value entered to displayStartProgramView()
    }

    public String createPrompt() {
        String str = "\n"
                +"\n----------------------------------------------------"
                +"\n| " + menu.getDescription()
                +"\n----------------------------------------------------";

        for (KevinMenuItem kevinMenuItem : menu.getOptions()) {
            str = str + "\n" + kevinMenuItem.getKeyPress() + " - " + kevinMenuItem.getDescription();
        }
        return str;
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choicd to upper case

        boolean found = false;
        for (KevinMenuItem kevinMenuItem : menu.getOptions()) {
            if (kevinMenuItem.getKeyPress().equals(choice)) {
                kevinMenuItem.getConsumer().run();
                found = true;
            }
        }

        if (!found) {
            System.out.println("\n*** Invalid selection *** Try again");
        }

        return found;
    }
}



