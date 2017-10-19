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
    private int quantityInStock;
    
    //relationships with other classes
    private InventoryType[] inventoryType = new InventoryType[7];
    
    
    
    //default constructor

    public InventoryItem() {
    }
    
    //getter and setter methods

    public InventoryType[] getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(InventoryType[] inventoryType) {
        this.inventoryType = inventoryType;
    }


    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.inventoryType);
        hash = 37 * hash + this.quantityInStock;
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.inventoryType != other.inventoryType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + '}';
    }

    public void setInventoryType(InventoryType type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
}