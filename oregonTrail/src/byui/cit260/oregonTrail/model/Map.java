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

/**
 *
 * @author Dresen_HP
 */
public class Map implements Serializable {
    //class instace variables
    private String description;
    private double milesFromStart;
    private String pathChosen;
    
    // relationships with other classes
    private List<Map> map = new ArrayList<>(); //0-*
    
    //constructor

    public Map() {
    }
    
    //methods

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMilesFromStart() {
        return milesFromStart;
    }

    public void setMilesFromStart(double milesFromStart) {
        this.milesFromStart = milesFromStart;
    }

    public String getPathChosen() {
        return pathChosen;
    }

    public void setPathChosen(String pathChosen) {
        this.pathChosen = pathChosen;
    }

    public List<Map> getMap() {
        return map;
    }

    public void setMap(List<Map> map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.milesFromStart) ^ (Double.doubleToLongBits(this.milesFromStart) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.pathChosen);
        hash = 67 * hash + Objects.hashCode(this.map);
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.milesFromStart) != Double.doubleToLongBits(other.milesFromStart)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.pathChosen, other.pathChosen)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", milesFromStart=" + milesFromStart + ", pathChosen=" + pathChosen + ", map=" + map + '}';
    }
    
    
    
}