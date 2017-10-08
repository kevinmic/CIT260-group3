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
public class BarterScene implements Serializable {
    // class instance variables
    private String itemsToTrade;
    
    // relationships with other classes
    private InventoryItem inventoryItem; // 1 to 1
    
    // default constructor

    public BarterScene() {
    }

    public String getItemsToTrade() {
        return itemsToTrade;
    }

    public void setItemsToTrade(String itemsToTrade) {
        this.itemsToTrade = itemsToTrade;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.itemsToTrade);
        hash = 89 * hash + Objects.hashCode(this.inventoryItem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BarterScene other = (BarterScene) obj;
        if (!Objects.equals(this.itemsToTrade, other.itemsToTrade)) {
            return false;
        }
        if (!Objects.equals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BarterScene{" + "itemsToTrade=" + itemsToTrade + ", inventoryItem=" + inventoryItem + '}';
    }
    
    
}
