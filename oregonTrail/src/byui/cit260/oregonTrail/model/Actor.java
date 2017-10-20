/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;
import java.awt.Point;
/**
 *
 * @author Dresen_HP
 */
public enum Actor{
   Settler("William", "Settler headed west with his family.", new Point(2,3)),
   Pioneer("Maggie", "Young pioneer woman who is waiting for her husband to return from the war before moving further west.", new Point(1,2)),
   Trapper("Jeb", "Grizzled trapper headed east to sell his furs.", new Point(3,3)),
   Soldier("Captain Dodge", "Soldier stationed at fort.", new Point(3,4)),
   Clerk("Louise", "Clerk at supply store.", new Point(1,1)),
   Shoshone("Kimama", "Young Shoshone indian brave.", new Point(4,4)),
   Cayusa("Chief Tiloukaikt","Indian chief of the Cayusa tribe.", new Point(5,4)),
   Guide("Jim", "Mountain man available to hire as a guide. He will make travel easier.", new Point(4,5)),
   Wife("Wife", "She will travel the trail with you.", new Point(1,1)),
   Son("Son", "He will travel the trail with you.", new Point(1,1)),
   Daughter("Daughter", "She will travel the trail with you.", new Point(1,1));
   
   // class instance variables
    private final String name;
    private final String description;
    private final Point coordinates;
    // relationships with other classes
    private Player players; // 1-1
    private Game games; // 1-1
    private Location[] locations = new Location[25]; // 0-*
    private final CharacterDialog[] dialog = new CharacterDialog[18]; //Dependency
    
    

    // constructor
    Actor(String name, String description, Point coordinates) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }   
    // getter and setter methods    

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public Player getPlayers() {
        return players;
    }

    public void setPlayers(Player players) {
        this.players = players;
    }

    public Game getGames() {
        return games;
    }

    public void setGames(Game games) {
        this.games = games;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }


    
    
    // toString 

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
    
}