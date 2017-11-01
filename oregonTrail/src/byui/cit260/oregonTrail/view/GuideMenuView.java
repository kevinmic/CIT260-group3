/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author jordan
 */
public class GuideMenuView {
    private String menu;
    private String promptMessage;

    public void hireGuide() {
        this.promptMessage = "\nPlease enter your choice: ";
        this.menu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Hire a Guide Menu                                       |"
                    +"\n----------------------------------------------------"
                    +"\nY - Hire a Guide"
                    +"\nN - Go without a Guide"
                    +"\nQ - Return to previous menu"
                    +"\n----------------------------------------------------";
    }
    
    public void displayHireGuideMenu() {
        System.out.print(menu);
        boolean done = false; //set the flag to not done
        do {
            //prompt for and get the menu selection
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to leave this menu
                return; //exit the menu
            
                //do the request action and display the next view
                done = this.doAction(menuOption);
        }
        while (!done);
    
}

    private String getMenuOption() {
    Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keybard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        return value; //return the value entered
    }

    private boolean doAction(String menuOption) {
         menuOption = menuOption.toUpperCase(); //convert choice to upper case
         
         if (menuOption == "Y") {
            this.setRiverGuideYes();
         }
            else if (menuOption == "N") {
             this.setRiverGuideNo();   
         }
            else if (menuOption == "Q") {
              return false;
            }
            else {
                System.out.println("\n*** Invalid selection *** Try again");
            }
                 
        return false;
    }

    private void setRiverGuideYes() {
        System.out.println("*** setRiverGuideYes() function called ***");
    }

    private void setRiverGuideNo() {
        System.out.println("*** setRiverGuideNo() function called ***");
    }
}

        