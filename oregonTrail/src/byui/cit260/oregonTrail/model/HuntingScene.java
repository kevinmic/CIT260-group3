/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.noFoodCaught;
        hash = 59 * hash + this.bonusWithGuide;
        hash = 59 * hash + Objects.hashCode(this.animal);
        hash = 59 * hash + Objects.hashCode(this.regularSceneType);
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
        return true;
    }

    @Override
    public String toString() {
        return "HuntingScene{" + "noFoodCaught=" + noFoodCaught + ", bonusWithGuide=" + bonusWithGuide + ", animal=" + animal + ", regularSceneType=" + regularSceneType + '}';
    }
 
    
    
}


    
    
    

