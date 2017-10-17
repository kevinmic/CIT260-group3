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
    
    //relationships with other classes
    private List<Game> games = new ArrayList<>(); //0-*
    private List<BarterScene> barterScene = new ArrayList<>(); //0-*
    
    //default constructor

    public InventoryItem() {
    }
    
    //getter and setter methods
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<BarterScene> getBarterScene() {
        return barterScene;
    }

    public void setBarterScene(List<BarterScene> barterScene) {
        this.barterScene = barterScene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.inventoryType);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.basePrice) ^ (Double.doubleToLongBits(this.basePrice) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.games);
        hash = 79 * hash + Objects.hashCode(this.barterScene);
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
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.basePrice) != Double.doubleToLongBits(other.basePrice)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        if (!Objects.equals(this.barterScene, other.barterScene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + ", basePrice=" + basePrice + ", games=" + games + ", barterScene=" + barterScene + '}';
    }
    
    
}
