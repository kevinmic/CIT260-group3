/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dresen_HP
 */
public class Location implements Serializable{
// instance variables
private int currentMiles;
private String locationVisited;
private int milesRemaining;
private String type;
private int column;
private String visited;
private int amountremaining;
private String type2;
public String weather;

// relationships with other classes public List<Location> location = new ArrayList<>(); //0-*

// default constructor
public Location() {
    
}

