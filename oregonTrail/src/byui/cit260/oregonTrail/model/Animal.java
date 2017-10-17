/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;


public enum Animal {
/**
 *
 * @author hannahwilliams
 */

    Bison("Bisons are herbivores. They have very poor eyesight but acute hearing and excellent smell.", "1,400 lbs", "Medium"),
    Wolf("Wolves are carnivoes. They are territorial with an excellent sense of smell and tracking skills.", "100 lbs", "Hard"),
    Bear("Bears are omnivores. They can be lazy but vicious if feeling threatened.", "600 lbs", "Hard"),
    Rabbit("Rabbits are herbivores. They are fast with a great sense of smell.", "2 lbs", "Easy");
    
     // class instance variables
    
    private String description;
    private String baseWeight;
    private String difficulty; 

    private Animal(String description, String baseWeight, String difficulty) {
        this.description = description;
        this.baseWeight = baseWeight;
        this.difficulty = difficulty;
    }

    public String getBaseWeight() {
        return baseWeight;
    }

    public void setBaseWeight(String baseWeight) {
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

    @Override
    public String toString() {
        return "Animal{" + "description=" + description + ", baseWeight=" + baseWeight + ", difficulty=" + difficulty + '}';
    }

    
    
}
    
