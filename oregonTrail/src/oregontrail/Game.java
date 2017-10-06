/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
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
    private Player player;


    
   // constructor

    public Game() {
    }

    // methods
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.milesTraveled;
        hash = 59 * hash + this.travelDays;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.percentComplete) ^ (Double.doubleToLongBits(this.percentComplete) >>> 32));
        hash = 59 * hash + this.highScores;
        hash = 59 * hash + this.noPlayers;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "milesTraveled=" + milesTraveled + ", travelDays=" + travelDays + ", percentComplete=" + percentComplete + ", highScores=" + highScores + ", noPlayers=" + noPlayers + '}';
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
        return true;
    }
    
    
    
}