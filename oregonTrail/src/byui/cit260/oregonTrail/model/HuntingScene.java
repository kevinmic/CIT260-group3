/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/**
 *
 * @author hannahwilliams
 */
public class HuntingScene implements Serializable {
  // class instance variables
    private int noFoodCaught; 
    private int bonusWithGuide; 
    
    // relationships with other classes
    
    private List<Animal> animal = new ArrayList<>();
    private RegularSceneType regularSceneType; //-1
    private java.util.Map<InventoryType, InventoryItem> items = new HashMap();
    // default constructor

    public HuntingScene () {
    }
    
     // methods

    public int getNoFoodCaught() {
        return noFoodCaught;
    }

    public void setNoFoodCaught(int noFoodCaught) {
        this.noFoodCaught = noFoodCaught;
    }

    public int getBonusWithGuide() {
        return bonusWithGuide;
    }

    public void setBonusWithGuide(int bonusWithGuide) {
        this.bonusWithGuide = bonusWithGuide;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }

    public RegularSceneType getRegularSceneType() {
        return regularSceneType;
    }

    public void setRegularSceneType(RegularSceneType regularSceneType) {
        this.regularSceneType = regularSceneType;
    }

    public Map<InventoryType, InventoryItem> getItems() {
        return items;
    }

    public void setItems(Map<InventoryType, InventoryItem> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.noFoodCaught;
        hash = 53 * hash + this.bonusWithGuide;
        hash = 53 * hash + Objects.hashCode(this.animal);
        hash = 53 * hash + Objects.hashCode(this.regularSceneType);
        hash = 53 * hash + Objects.hashCode(this.items);
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
        final HuntingScene other = (HuntingScene) obj;
        if (this.noFoodCaught != other.noFoodCaught) {
            return false;
        }
        if (this.bonusWithGuide != other.bonusWithGuide) {
            return false;
        }
        if (!Objects.equals(this.animal, other.animal)) {
            return false;
        }
        if (!Objects.equals(this.regularSceneType, other.regularSceneType)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HuntingScene{" + "noFoodCaught=" + noFoodCaught + ", bonusWithGuide=" + bonusWithGuide + ", animal=" + animal + ", regularSceneType=" + regularSceneType + ", items=" + items + '}';
    }
    
    
  
}
