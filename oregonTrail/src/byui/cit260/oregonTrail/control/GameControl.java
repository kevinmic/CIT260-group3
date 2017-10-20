/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import static byui.cit260.oregonTrail.model.Occupation.Merchant;
import byui.cit260.oregonTrail.model.Database;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.InventoryItem;
import byui.cit260.oregonTrail.model.InventoryType;
import static byui.cit260.oregonTrail.model.InventoryType.Money;
import byui.cit260.oregonTrail.model.Occupation;
import byui.cit260.oregonTrail.model.Player;
import java.util.Map;

/**
 *
 * @author Dresen_HP
 */
public class GameControl {
    
    public void saveName(String name) {
        
        Player player = new Player();
        String playerName = player.getName();
        if (name != null) {
            if (playerName == null) {
                player.setName(name);
            }               
        }   
    } 
    public void startNewGame(String companion1, String companion2, String companion3, Occupation occupation) {
        Game game = new Game();  //TODO: How do I start database with new game?
        game.setCompanion1(companion1);
        game.setCompanion2(companion2);
        game.setCompanion3(companion3);
        Database.INSTANCE.getGame().getPlayer().setOccupation(occupation);
        Map<InventoryType, InventoryItem> items = Database.INSTANCE.getGame().getPlayer().getItems();
        InventoryItem item = items.get(Money);
        int startingPurse = 500;
        if (occupation == Merchant) {
            startingPurse = 700;
        }
        item.setQuantityInStock(startingPurse);
    }
    
    public void saveGame(Player player, Game game, Database INSTANCE) {
        //TODO: Learn how to save the game.
    }
    
    public void loadGame(Player player, Game game, Database INSTANCE) {
        
    }
    
    
}

