/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregonTrail;
import java.io.Serializable;
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
    private ArrayList<Game> games = new ArrayList<Game>();
    
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

    public <any> getGames() {
        return games;
    }

    public void setGames(<any> games) {
        this.games = games;
    }
    
    

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
