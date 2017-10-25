/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregonTrail;

import byui.cit260.oregonTrail.model.Actor;
import byui.cit260.oregonTrail.model.CharacterDialog;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Animal;
import byui.cit260.oregonTrail.model.HuntingScene;
import byui.cit260.oregonTrail.model.RiverScene;
import byui.cit260.oregonTrail.model.BarterScene;
import byui.cit260.oregonTrail.model.InventoryItem;
import byui.cit260.oregonTrail.model.InventoryType;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.RegularSceneType;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.view.StartProgramView;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dresen_HP
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
    }
    
}