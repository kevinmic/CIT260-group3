/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

/**
 *
 * @author Dresen_HP
 */
public class InventoryControl {
    
    //calculate the price of one item for barter or purchase
    public double calcBarterPrice(int basePriceGet, int basePriceGive, double percentComplete, int barterCoefficient) {
        // validate inputs
        if (basePriceGet < 1) {
            return -1;
        }
        if (basePriceGive < 1) {
            return -1;
        }
       if (percentComplete <0 || percentComplete > 1) {
           return -1;
        }
       if (barterCoefficient != 1 && barterCoefficient != 2){
           return -1;
       }
       
       // calculate price for one item
       double ratio = basePriceGet / basePriceGive;
       double scarcity = barterCoefficient + percentComplete;
       double costForOne = ratio * scarcity;
       costForOne = Math.ceil(costForOne);
       if (costForOne < 1) {
           costForOne = 1;
       }
       
       // return price for one item
       return costForOne;
       
    }
    
}
