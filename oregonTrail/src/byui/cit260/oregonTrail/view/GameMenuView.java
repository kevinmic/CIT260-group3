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
public class GameMenuView extends View{
    
    // constructor function
    public GameMenuView() {
        super("\n"
                +"\n----------------------------------------------------"
                    +"\n| Game Menu                                        |"
                    +"\n----------------------------------------------------"
                    +"\nB - Barter"
                    +"\nC - Change Pace"
                    +"\nF - Ford River"
                    +"\nG - Hire Guide"
                    +"\nV - View Inventory"
                    +"\nH - Hunt"
                    +"\nP - Purchase Goods"
                    +"\nM - Display Map"
                    +"\nQ - Quit"
                    +"\n----------------------------------------------------"
                    +"\n"
                    +"\n Please enter your choice:");
   
    }
   @Override
   public boolean doAction(String value) {
       value = value.toUpperCase();
       
       switch (value) {
           case "B":
               BarterView barterView = new BarterView();
               barterView.display();
               break;
           case "C":
               ChangePaceView changePaceView = new ChangePaceView();
               changePaceView.display();
               break;
           case "F":
               RiverMenuView riverMenuView = new RiverMenuView();
               riverMenuView.display();
               break;
           case "G":
               HireGuideView hireGuideView = new HireGuideView();
               hireGuideView.display();
               break;
           case "V":
               InventoryView inventoryView = new InventoryView();
               inventoryView.display();
               break;
           case "H":
               HuntView huntView = new HuntView();
               huntView.display();
               break;
           case "P":
               PurchaseGoodsView purchaseGoodsView = new PurchaseGoodsView();
               purchaseGoodsView.display();
               break;
           case "M":
               DisplayMapView displayMapView = new DisplayMapView();
               displayMapView.display();
               
           
       } return false;
   }
}
