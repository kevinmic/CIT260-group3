/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

/**
 *
 * @author James
 */
public class StartProgramView {
    
    public String promptMessage;

    public StartProgramView(){
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
        System.out.println(
              "\n**************************************************************"
            + "\n*                                                            *"
            + "\n* This game takes place along the 1850’s era Oregon Trail.   *"
            + "\n* In this game, the player takes the place of one of several *" 
            + "\n* characters as he or she embarks along the trek west. Along *"
            + "\n* the way, the player is faced with several challenges and   *"
            + "\n* missions that he or she needs to compete in order to win   *"
            + "\n* the game.                                                  *"
            + "\n*                                                            *"
            + "\n* After starting a game, the user is prompted to select his  *"
            + "\n* or her character type (farmer, blacksmith, merchant).      *"
            + "\n* Each profession comes with it different starting amounts   *"
            + "\n* and ability to earn points. Then the traveler names each   *"
            + "\n* member of his or her party and purchases inventory to be   *"
            + "\n* used along the trail. After selecting the time of year to  *"
            + "\n* embark, the journey begins.                                *"
            + "\n*                                                            *"
            + "\n* Along the trail, the company is faced with many difficult  *"
            + "\n* decisions that could bring great rewards or exact great    *"
            + "\n* cost to the party. They will cross rivers, face sickness   *"
            + "\n* and famine, hunt for food, trade with natives or fellow    *"
            + "\n* travelers and interact with others at each checkpoint.     *"
            + "\n*                                                            *"
            + "\n* The game tests the mettle of even the most hardened        *"
            + "\n* adventure. Can you make it in the 1850’s travel west?      *"
            + "\n* Only time will tell.                                       *"
            + "\n*                                                            *"
            + "\n**************************************************************"
            );
    }

    public void displayStartProgramView() {
            System.out.println("\n*** displayStartProgram() function called ***");
            
    }
}

