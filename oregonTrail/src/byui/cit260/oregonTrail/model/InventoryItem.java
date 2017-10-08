/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.awt.Point;
/**
 *
 * @author jones-jordan
 */
public class InventoryItem implements Serializable {
    //class instance variables
    private String inventoryType;
    private double quantityInStock;
    private double requiredAmount;
    private double basePrice;
    
    // relationships with other classes
    private List<Game> games = new ArrayList<>(); //0-*
    
    
    
}
