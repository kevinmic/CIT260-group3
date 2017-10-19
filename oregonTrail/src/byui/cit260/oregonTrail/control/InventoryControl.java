/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.InventoryType;
import byui.cit260.oregonTrail.model.Database;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.InventoryItem;
import java.util.Map;

/**
 *
 * @author Dresen_HP
 */
public class InventoryControl {
    /* Gets the player's inventory from the database. I THINK! 
    * Map<> is object that maps keys to values.  It is the datatype here because the player's
    * inventory is stored in a map, so that is what will be returned by the method.
    * In the return statement, it accesses the getGame method inside the Database class.
    * This gives access to the Game method, which has a getPlayer method. Inside the Player
    * class, it uses the getItems method which returns the items object that contains
    * a hashmap of the player's inventory items. This makes the player's inventory (which is
    * stored in Database class) available to the controller to manipulate.
    */
    private Map<InventoryType, InventoryItem> getItemDatabase() {
        return Database.INSTANCE.getGame().getPlayer().getItems();
    }
    
    /* Gets one item from the player's inventory. 
    * Private because ?????. return type will be an InventoryItem. 
    * parameter is the name of the inventory item to be gotten. (needs to be one of InventoryType class list). 
    * variable items is initialized. The datatype is Map with InventoryType InventoryItem key value pair. 
    * item variable is filled with the quantity in stock of the item requested. 
    * Information is validated to make sure not null. If null, a new InventoryItem instance created and quantity set to 0.
    * The variable item is returned.*/
    
    private InventoryItem getItem(InventoryType type) {
        Map<InventoryType, InventoryItem> items = getItemDatabase();
        InventoryItem item = items.get(type);
        if (item == null) {
           item = new InventoryItem();
           item.setQuantityInStock(0);
           item.setInventoryType(type);
           items.put(type, item);
                  
        } 
        return item;
    }
    
    
    /* Adds 1+ quantity of items to player's inventory.
    * Public because needs to be accessed from hunt control. Will not return anything.
    * Parameters are the type of item, and the quantity of items to be added.
    * New item variable is created and filled with the item from the player's inventory according to type.
    * The getQuantityInStock method is called for the item and the new quantity is added to it.
    * The total is stored in the item with the setQuantityInStock method.*/
    
    public void addToInventory(InventoryType type, int quantity) {
       InventoryItem item = getItem(type);
       item.setQuantityInStock(item.getQuantityInStock() + quantity);  //How does this know where to set the Quantity?
    }
    /* Removes 1+ quantity from player's inventory.
    * Public so can be accessed from hunt and game control. Void because it won't return anything. Parameters are 
    * the type from InventoryType class and the quantity of items to be removed.
    * A new item variable is created with datatype of InventoryType class and filled with item from player's inventory.*/
    public void subtractFromInventory(InventoryType type, int quantity) {
       InventoryItem item = getItem(type); 
       item.setQuantityInStock(item.getQuantityInStock() + quantity);
    }
    public String barter(InventoryType owned, InventoryType desired, int desiredQuantity) {
        // get desired item and owned item information for player's inventory.
        InventoryItem itemDesired = getItem(desired);
        InventoryItem itemOwned = getItem(owned);
        System.out.println(itemOwned);
        // get cost from inventoryType for both itemDesired and itemOwned

        int costDesired = desired.getCost(); 
        int costOwned = owned.getCost();
        
        // get percentComplete of player's game.
        double percentComplete = Database.INSTANCE.getGame().getPercentComplete();
        // determine barterCoefficient Buy=1, Barter=2
        int barterCoefficient = 1;
        InventoryType purchase = InventoryType.Money;
        if (owned != purchase) {
            barterCoefficient = 2;
        }
        // call calcBarterPrice function to figure cost of purchase.
        int costForOne = calcBarterPrice(costDesired, costOwned, percentComplete, barterCoefficient);
        // test to see if player has enough of item to trade.       
        if (itemOwned.getQuantityInStock() < desiredQuantity) {
             
            return "You do not have enough " + owned + " to complete the transaction.";
        }
        // add desired item to inventory and remove desired item from inventory.
        addToInventory(desired, desiredQuantity);
        subtractFromInventory(owned, desiredQuantity);
        return "Transaction successful.";
    }
    
    //calculate the price of one item for barter or purchase
    public int calcBarterPrice(int basePriceGet, int basePriceGive, double percentComplete, int barterCoefficient) {
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
       int ratio = basePriceGet / basePriceGive;
       double scarcity = barterCoefficient + percentComplete;
       double price = ratio * scarcity;
       int costForOne = (int) Math.ceil(price);
       if (costForOne < 1) {
           costForOne = 1;
       }
       
       // return price for one item
       return costForOne;
       
    }
    
}
