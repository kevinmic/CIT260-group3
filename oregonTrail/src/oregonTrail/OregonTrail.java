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
import byui.cit260.oregonTrail.model.RegularSceneType;
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
        // test Player class
        Player playerOne = new Player();
        
        playerOne.setName("Tammy");
        playerOne.setCurrentScore(0);
        playerOne.setPace(0);
        playerOne.setSavedGameFile("Game.save");
        
        System.out.println(playerOne.toString());
        //test Game class
        Game gameOne = new Game();
        
        gameOne.setMilesTraveled(0);
        gameOne.setHighScores(0);
        gameOne.setNoPlayers(2);
        gameOne.setPercentComplete(0);
        gameOne.setPlayer(playerOne);
        gameOne.setTravelDays(0);
        
        System.out.println(gameOne.toString());
        
        // test Actor class
        System.out.print("Actor" + '{' + "name=" + Actor.Cayusa.getName());
        System.out.print(", description=" + Actor.Cayusa.getDescription());
        System.out.println(", coordinates=" + Actor.Cayusa.getCoordinates() + '}');
        
        // test CharacterDialog class
        System.out.print("CharacterDialog" + '{' + "dialog=" + CharacterDialog.FallMountain.getDialog());
        System.out.println(", type=" + CharacterDialog.FallMountain.getType() + '}');
        
        // test Animal class
        
        System.out.print("Animal" + '{' + "baseWeight=" + Animal.Bear.getBaseWeight());
        System.out.print(", description=" + Animal.Bear.getDescription());
        System.out.println(", difficulty=" + Animal.Bear.getDifficulty() + '}');
       
        
        // test RiverScene class
        
        RiverScene riverSceneOne = new RiverScene();
        
        riverSceneOne.setRiverHeight(45);
        riverSceneOne.setSafetyWithGuide(.50);
        riverSceneOne.setTravelChoice("Cross");
        
        System.out.println(riverSceneOne.toString());
        
        //test HuntingScene class
        
        HuntingScene huntingSceneOne = new HuntingScene();
        
        huntingSceneOne.setNoFoodCaught(0);
        huntingSceneOne.setBonusWithGuide(5);
       
        System.out.println(huntingSceneOne.toString());
        
        //test BarterScene
        
        BarterScene barterSceneOne = new BarterScene();
        
        barterSceneOne.setInventoryItem(10);
        barterSceneOne.setItemsToTrade(11);
        
        System.out.println(barterSceneOne.toString());
        
        //test InventoryItem
        
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setInventoryType("Food");
        inventoryItemOne.setQuantityInStock(5);
        inventoryItemOne.setRequiredAmount(5);
        inventoryItemOne.setBasePrice(75);
        
        System.out.println(inventoryItemOne.toString());
        
        //test RegularSceneType
        
        RegularSceneType regularSceneOne = new RegularSceneType ();
        
        regularSceneOne.setDescription("Hunting");
        
        System.out.println(regularSceneOne.toString());
        
        
    }
    
}

//test edit from Jordan