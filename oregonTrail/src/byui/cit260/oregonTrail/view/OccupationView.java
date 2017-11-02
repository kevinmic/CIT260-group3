/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Occupation;
import java.util.Scanner;
import oregonTrail.OregonTrail;

/**
 *
 * @author Dresen_HP
 */
class OccupationView {
    
    // class instance variables
    private String menu; // occupation menu
    private String promptMessage; // prompt message
    private String occupationHelp;
    
    // constructor function called from displayNextView() in StartGameView
    public OccupationView() {
        this.promptMessage = "\nPlease enter your occupation choice.";
        this.menu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Select an occupation                          |"
                    +"\n----------------------------------------------------"
                    +"\nB - Blacksmith"
                    +"\nF - Farmer"
                    +"\nM - Merchant"
                    +"\nL - Learn about occupations"
                    +"\n----------------------------------------------------";
        Occupation blacksmith = Occupation.getBlacksmith();
        Occupation farmer = Occupation.getFarmer();
        Occupation merchant = Occupation.getMerchant();
        this.occupationHelp = "\n**************************************************************"
                            +"\n* Occupation Choices"
                            +"\n*-------------------------------------------------------------"
                            + "\n*                                                            "
                            + "\n* B- " + blacksmith.getName()   
                            + "\n*    "  + blacksmith.getDescription() 
                            + "\n*  "
                            + "\n* F- " + farmer.getName()
                            + "\n*    " + farmer.getDescription()
                            + "\n*"
                            + "\n* M- " + merchant.getName()
                            + "\n*    " + merchant.getDescription()
                            + "\n*"                                                                                         
                            + "\n*"                                                            
                            + "\n**************************************************************"
                            + "\n"
                            ;
    
}

    public void displayOccupationView() { // called from displayNextView() in StartGameView
        System.out.print(menu);
        boolean done = false;
        do {
            String menuOption = this.getMenuOption(); //calls getMenuOption from this class
            if (menuOption.toUpperCase().equals("Q"))
                return; // returns to displayNextView
            done = this.doAction(menuOption); // calls doAction() in this class
        } while (!done); // repeats the loop if not done
        
    }
    public void displayOccupationHelp() {
        System.out.print(occupationHelp);
    }

    private String getMenuOption() { // called from displayOccupationView() in this class
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading/trailing blanks
            
            if (value.length() < 1) { 
                System.out.println("\nInvalid value: value cannot be blank.");
                continue;    
            }
            break;
        }
        return value; // returns choice back to displayOccupationView() in this class
    }

    private boolean doAction(String menuOption) { // called from displayOccupationview() in this class
        menuOption = menuOption.toUpperCase();
        Occupation occupation;
        switch (menuOption) { 
            case "B":
                occupation = Occupation.Blacksmith;
                this.saveOccupation(occupation);
                break;
            case "F":
                occupation = Occupation.Farmer;
                this.saveOccupation(occupation);
                break;
            case "M":
                occupation = Occupation.Merchant;
                this.saveOccupation(occupation);
                break;
            case "L":
                this.displayOccupationView();
                this.getMenuOption();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false; // returns to displayOccoupationView() to repeat loop
    }         

    private void saveOccupation(Occupation occupation) {
        GameControl.setOccupation(occupation);
        System.out.println("\n*************************************************"
                          + "\n| Occupation chosen: " + OregonTrail.getPlayer().getOccupation().getName()
                          + "\n************************************************");
        this.displayNextView();
        
    }

    private void displayNextView() {
        System.out.println("\n*** displayNextVeiw() called ***");
        /*StartDateView startDateView = new StartDateView();
        startDateView.displayStartDateView();*/
        
    }
}
