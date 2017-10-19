/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

/**
 *
 * @author Dresen_HP
 */
public class Database {
    public static Database INSTANCE = new Database();
    //class instance variables
    private Game game;

    private Database() {
    }

    public Game getGame() {
        return game;
    }
    
    
}
