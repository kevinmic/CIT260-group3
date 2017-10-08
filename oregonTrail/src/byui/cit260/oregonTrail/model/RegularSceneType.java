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
import java.awt.Point;
/**
 *
 * @author jones-jordan
 */
public class RegularSceneType implements Serializable {
    private String regularStringType;
    
    //relationship with other classes
    private List<Location> location = new ArrayList<>(); //0-*
    private BarterScene barterScene; // 1-1
    private RiverScene riverScene; // 1-1
    private HuntingScene huntingScene; // 1-1

    // default constructor
    public RegularSceneType() {
    }

    // methods

    public String getRegularStringType() {
        return regularStringType;
    }

    public void setRegularStringType(String regularStringType) {
        this.regularStringType = regularStringType;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public BarterScene getBarterScene() {
        return barterScene;
    }

    public void setBarterScene(BarterScene barterScene) {
        this.barterScene = barterScene;
    }

    public RiverScene getRiverScene() {
        return riverScene;
    }

    public void setRiverScene(RiverScene riverScene) {
        this.riverScene = riverScene;
    }

    public HuntingScene getHuntingScene() {
        return huntingScene;
    }

    public void setHuntingScene(HuntingScene huntingScene) {
        this.huntingScene = huntingScene;
    }

   
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.regularStringType);
        hash = 19 * hash + Objects.hashCode(this.location);
        hash = 19 * hash + Objects.hashCode(this.barterScene);
        hash = 19 * hash + Objects.hashCode(this.riverScene);
        hash = 19 * hash + Objects.hashCode(this.huntingScene);
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
        final RegularSceneType other = (RegularSceneType) obj;
        if (!Objects.equals(this.regularStringType, other.regularStringType)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.barterScene, other.barterScene)) {
            return false;
        }
        if (!Objects.equals(this.riverScene, other.riverScene)) {
            return false;
        }
        if (!Objects.equals(this.huntingScene, other.huntingScene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularSceneType{" + "regularStringType=" + regularStringType + ", location=" + location + ", barter=" + barterScene + ", riverScene=" + riverScene + ", huntingScene=" + huntingScene + '}';
    }
    
    
}

//test edit