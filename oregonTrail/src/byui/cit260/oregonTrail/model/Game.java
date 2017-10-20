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
 * @author Dresen_HP
 */
public class Game implements Serializable{
    // class instance variables
    private int milesTraveled;
    private int travelDays;
    private double percentComplete;
    private int highScores;
    private int noPlayers;
    private String companion1;
    private String companion2;
    private String companion3;
    // relationships with other classes
    private Player player; // 1 to 1
    private Map map; // 1 to 1
    private List<Actor> actors = new ArrayList<>(); // 0-*
    private List<InventoryItem> inventoryItems = new ArrayList<>(); // 0-*

    
   // constructor

    public Game() {
    }
    
    public String getCompanion1() {
        return companion1;
    }

    public void setCompanion1(String companion1) {
        this.companion1 = companion1;
    }

    public String getCompanion2() {
        return companion2;
    }

    public void setCompanion2(String companion2) {
        this.companion2 = companion2;
    }

    public String getCompanion3() {
        return companion3;
    }

    // methods
    public void setCompanion3(String companion3) {    
        this.companion3 = companion3;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    public int getTravelDays() {
        return travelDays;
    }

    public void setTravelDays(int travelDays) {
        this.travelDays = travelDays;
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(double percentComplete) {
        this.percentComplete = percentComplete;
    }

    public int getHighScores() {
        return highScores;
    }

    public void setHighScores(int highScores) {
        this.highScores = highScores;
    }

    public int getNoPlayers() {
        return noPlayers;
    }

    public void setNoPlayers(int noPlayers) {
        this.noPlayers = noPlayers;
    }
    
    public Player getPlayer() {
    return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(List<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.milesTraveled;
        hash = 97 * hash + this.travelDays;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.percentComplete) ^ (Double.doubleToLongBits(this.percentComplete) >>> 32));
        hash = 97 * hash + this.highScores;
        hash = 97 * hash + this.noPlayers;
        hash = 97 * hash + Objects.hashCode(this.companion1);
        hash = 97 * hash + Objects.hashCode(this.companion2);
        hash = 97 * hash + Objects.hashCode(this.companion3);
        hash = 97 * hash + Objects.hashCode(this.player);
        hash = 97 * hash + Objects.hashCode(this.map);
        hash = 97 * hash + Objects.hashCode(this.actors);
        hash = 97 * hash + Objects.hashCode(this.inventoryItems);
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
        final Game other = (Game) obj;
        if (this.milesTraveled != other.milesTraveled) {
            return false;
        }
        if (this.travelDays != other.travelDays) {
            return false;
        }
        if (Double.doubleToLongBits(this.percentComplete) != Double.doubleToLongBits(other.percentComplete)) {
            return false;
        }
        if (this.highScores != other.highScores) {
            return false;
        }
        if (this.noPlayers != other.noPlayers) {
            return false;
        }
        if (!Objects.equals(this.companion1, other.companion1)) {
            return false;
        }
        if (!Objects.equals(this.companion2, other.companion2)) {
            return false;
        }
        if (!Objects.equals(this.companion3, other.companion3)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        if (!Objects.equals(this.inventoryItems, other.inventoryItems)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "milesTraveled=" + milesTraveled + ", travelDays=" + travelDays + ", percentComplete=" + percentComplete + ", highScores=" + highScores + ", noPlayers=" + noPlayers + ", companion1=" + companion1 + ", companion2=" + companion2 + ", companion3=" + companion3 + ", player=" + player + ", map=" + map + ", actors=" + actors + ", inventoryItems=" + inventoryItems + '}';
    }

   
    

    
    
    

}