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
public enum Location {
    A("Missouri", 0, 102, "S", 0, 0),
    B("Kansas River Crossing", 102, 83, "R", 0, 1),
    C("Big Blue River Crossing", 185, 119, "R", 0, 3), 
    D("Fort Kearney", 304, 200, "F", 2, 4),
    E("Courthouse Rock", 504, 50, "F", 3, 4),
    F("Chimney Rock", 554, 39, "O", 4, 4), 
    G("Platte River Crossing", 589, 51, "R", 6, 4),
    H("Fort Laramie", 640, 13, "F", 7, 4),
    I("Guernsey", 653, 177, "O", 8, 6),
    J("Independence Rock", 830, 102, "O", 9, 7),
    K("Fort Bridger", 989, 68, "F", 10, 8),
    L("Green River Crossing", 1057, 144, "R", 13, 8),
    M("Soda Springs", 1201, 57, "O", 14, 9),
    N("Fort Hall", 1258, 182, "F", 14, 10), 
    O("Snake River Crossing", 1440, 5, "R", 15, 11),
    P("Shoshone Falls", 1445, 9, "O", 15, 12),
    Q("Fort Boise", 1554, 135, "F", 16, 13),
    R("Grand Ronde in the Blue Mountains", 1689, 21, "M", 18, 14),
    S("Waiilatpu Village", 1710, 98, "M", 20, 15),
    T("The Dalles", 1808, 50, "M", 20, 16),
    U("Fort Bridger", 1858, 127, "F", 21, 18),
    V("Fort Walla Walla", 1935, 15, "F", 23, 19),
    W("Willamette Valley of the Oregon Territory", 1950, 12, "O", 24, 18),
    X("Columbia River Crossing", 1962, 73, "R", 25, 17),
    Y("Fort Vancouver", 2035, 0, "E", 25, 15);
    // variables
    private  final String name;
    private  final int milesFromStart;
    private  final int milesToNext;
    private  final String type;
    private  final int column;
    private  final int row;
    // constructor function
    private Location(String name, int milesFromStart, int milesToNext, String type, int column, int row) {
        this.name = name;
        this.milesFromStart = milesFromStart;
        this.milesToNext = milesToNext;
        this.type = type;
        this.column = column;
        this.row = row;
        
    }
    // getter functions
    
    // class instance variables
    /*private int currentMiles;
    private String locationVisited;
    private int milesRemaining;
    private String type;
    private int column;
    private boolean visited;
    private double amountRemaining;
    private String type2;
    public String weather;*/
    
    // relationships with other classes

    public String getName() {
        return name;
    }

    public int getMilesFromStart() {
        return milesFromStart;
    }

    public int getMilesToNext() {
        return milesToNext;
    }

    public String getType() {
        return type;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
    
}
