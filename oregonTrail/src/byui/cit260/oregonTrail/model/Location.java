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
 * @author James
 */
public class Location implements Serializable {
    // class instance variables
    private int currentMiles;
    private String locationVisited;
    private int milesRemaining;
    private String type;
    private int column;
    private boolean visited;
    private int amountremaining;
    private String type2;
    public String weather;
    
    // relationships with other classes
    private Actor actor;
    private Map map;
    

    public Location() {
    }
    
    public int getCurrentMiles() {
        return currentMiles;
    }

    public void setCurrentMiles(int currentMiles) {
        this.currentMiles = currentMiles;
    }

    public String getLocationVisited() {
        return locationVisited;
    }

    public void setLocationVisited(String locationVisited) {
        this.locationVisited = locationVisited;
    }

    public int getMilesRemaining() {
        return milesRemaining;
    }

    public void setMilesRemaining(int milesRemaining) {
        this.milesRemaining = milesRemaining;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAmountremaining() {
        return amountremaining;
    }

    public void setAmountremaining(int amountremaining) {
        this.amountremaining = amountremaining;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.currentMiles;
        hash = 59 * hash + Objects.hashCode(this.locationVisited);
        hash = 59 * hash + this.milesRemaining;
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + this.column;
        hash = 59 * hash + Objects.hashCode(this.visited);
        hash = 59 * hash + this.amountremaining;
        hash = 59 * hash + Objects.hashCode(this.type2);
        hash = 59 * hash + Objects.hashCode(this.weather);
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
        final Location other = (Location) obj;
        if (this.currentMiles != other.currentMiles) {
            return false;
        }
        if (this.milesRemaining != other.milesRemaining) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.amountremaining != other.amountremaining) {
            return false;
        }
        if (!Objects.equals(this.locationVisited, other.locationVisited)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.type2, other.type2)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "currentMiles=" + currentMiles + ", locationVisited=" + locationVisited + ", milesRemaining=" + milesRemaining + ", type=" + type + ", column=" + column + ", visited=" + visited + ", amountremaining=" + amountremaining + ", type2=" + type2 + ", weather=" + weather + '}';
    }
    
    
    
}
