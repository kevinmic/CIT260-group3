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
public class GuideMenuView extends View {
    private String menu;
    private String promptMessage;

    public GuideMenuView() {
            super("\n"
                    +"\n----------------------------------------------------"
                    +"\n| Hire a Guide Menu                                 |"
                    +"\n----------------------------------------------------"
                    +"\nY - Hire a Guide"
                    +"\nN - Go without a Guide"
                    +"\nQ - Return to previous menu"
                    +"\n----------------------------------------------------");
    }

    @Override
    public boolean doAction(String menuOption) {
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

        