/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
<<<<<<< HEAD
=======
import java.util.List;
import java.util.ArrayList;
>>>>>>> b9cf1f0b8929aeba0aeb371b363d6825b19fc87d
import java.util.Objects;
/**
 *
 * @author Dresen_HP
 */
public class Player implements Serializable{
    // class instance variables
    private String name;
    private String savedGameFile;
    private int pace;
    private int currentScore;
<<<<<<< HEAD
    private ArrayList<Game> games = new ArrayList<Game>();
=======
    // relationships with other classes 
    private List<Game> games = new ArrayList<>(); //0-*
    private Actor actor; // 1-1
>>>>>>> b9cf1f0b8929aeba0aeb371b363d6825b19fc87d
    
    // default constructor

    public Player() {
    }
    
    // methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSavedGameFile() {
        return savedGameFile;
    }

    public void setSavedGameFile(String savedGameFile) {
        this.savedGameFile = savedGameFile;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

<<<<<<< HEAD
    public <any> getGames() {
        return games;
    }

    public void setGames(<any> games) {
        this.games = games;
    }
=======
    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
>>>>>>> b9cf1f0b8929aeba0aeb371b363d6825b19fc87d
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.savedGameFile);
        hash = 67 * hash + this.pace;
        hash = 67 * hash + this.currentScore;
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", savedGameFile=" + savedGameFile + ", pace=" + pace + ", currentScore=" + currentScore + '}';
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
        final Player other = (Player) obj;
        if (this.pace != other.pace) {
            return false;
        }
        if (this.currentScore != other.currentScore) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.savedGameFile, other.savedGameFile)) {
            return false;
        }
        return true;
    }
    
    
    
}