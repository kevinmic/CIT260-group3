/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hannahwilliams
 */
public class Animal implements Serializable{
    // class instance variables
    
    private String description; 
    private int baseWeight; 
    private String difficulty; 
    
    // relationships with other classes
    
    private HuntingScene huntingScene; //0-* to 0-*
    
    // default constructor

    public Animal () {
    }
    
     // methods

    public int getBaseWeight() {
        return baseWeight;
    }

    public void setBaseWeight(int baseWeight) {
        this.baseWeight = baseWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public HuntingScene getHuntingScene() {
        return huntingScene;
    }

    public void setHuntingScene(HuntingScene huntingScene) {
        this.huntingScene = huntingScene;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + this.baseWeight;
        hash = 13 * hash + Objects.hashCode(this.difficulty);
        hash = 13 * hash + Objects.hashCode(this.huntingScene);
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
        final Animal other = (Animal) obj;
        if (this.baseWeight != other.baseWeight) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        if (!Objects.equals(this.huntingScene, other.huntingScene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "description=" + description + ", baseWeight=" + baseWeight + ", difficulty=" + difficulty + ", huntingScene=" + huntingScene + '}';
    }
    
    
    
    
    
}