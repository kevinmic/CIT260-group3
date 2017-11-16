/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;
import byui.cit260.oregonTrail.model.CharacterDialog;
import java.util.Date;
import java.util.Random;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.RegularSceneType;
import byui.cit260.oregonTrail.model.RiverScene;
import byui.cit260.oregonTrail.model.Scene;
import byui.cit260.oregonTrail.model.SceneType;


/**
 *
 * @author Clausi,James
 */


public class MapControl {
    /* Assignment 10 TODO
    * Implement createMap() pg 21
    * Implement createLocations() pg 24
    * Implement createScenes() pg 25
    *   Create a new enum class called SceneType pg 26
    *   Use it to set index position of scene object pg 27
    * Implement createCharacterDialog() pg 27
    *   Create new enum class called DialogType
    *   Use it to set index position of CharacterDialog pg 28
    * Implement assignDialogToScenes()
    * Implement assignScenesLocations() pg 35
    */
    
    public static Map createMap(int noOfRows, int noOfColumns) {
        System.out.println("\n*** createMap() called ***");
        
        //if noOfRows < 0 OR numOfColumns < 0
        if (noOfRows < 0 || noOfColumns < 0) {
            return null;
        }
        Map gameMap = new Map();
        gameMap.setRows(noOfRows);
        gameMap.setColumns(noOfColumns);
        //locations = createLocations(noOfRows, noOfColumns)
        Location[][] locations = createLocations(noOfRows, noOfColumns);
        //Assign the locations array to the map
        gameMap.setLocations(locations);
        //scenes = createScenes()
        RegularSceneType[] scenes = createScenes();
        //questions = createQuestions()
        CharacterDialog[] dialog = createDialog();
        //assignQuestionsToScenes()
        assignDialogToScenes(dialog, scenes);
        assignScenesToLoctions(scenes, locations);
        return gameMap;
    }

    private static Location[][] createLocations(int rows, int columns) {
        if (rows < 1 || columns < 1)
            return null;
        Location[][] locations = new Location[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Location location = new Location();
                location.setRow(i);
                location.setColumn(j);
                location.setVisited(false);
               locations[i][j] = location; 
            }
        }
            return locations;

    }
    private static Scene[] createScenes() {
        //scenes = Create an array Scene objects
        Scene[] scene = new Scene[SceneType.values().length];
        RegularSceneType scene1 = new RegularSceneType();
        scene1.setDescription("Stopping point along trail.");
        scene[SceneType.RegularScene.ordinal()] = scene1;
        
        RegularSceneType scene2 = new RegularSceneType();
        scene2.getRegularSceneType().setDescription("River Crossing");
        scene2.setRiverHeight(3);
        scene2.setSafetyWithGuide(0);
        scene2.
        scene[SceneType.RiverScene.ordinal()] = scene2;
        
        RegularSceneType scene3 = new RegularSceneType();
        scene3.setDescription("High Mountain Pass");
        scene[SceneType.MountainScene.ordinal()] = scene3;
        
        RegularSceneType scene4 = new RegularSceneType();
        scene4.setDescription("Rolling Grassland");
        scene[SceneType.PlainsScene.ordinal()] = scene4;
        
        RegularSceneType scene5 = new RegularSceneType();
        scene5.setDescription("Military Fort");
        scene[SceneType.FortScene.ordinal()] = scene5;
        RegularSceneType scene6 = new RegularSceneType();
        scene6.setDescription("Begin Your Journey");
        scene[SceneType.StartScene.ordinal()] = scene6;
        RegularSceneType scene7 = new RegularSceneType();
        scene7.setDescription("You made it! Congratulations!");
        scene[SceneType.EndScene.ordinal()] = scene7;

                
        return scene;
    }

    private static void assignDialogToScenes(CharacterDialog[] dialog, RegularSceneType[] scenes) {
        System.out.println("\n*** assignDialogToScenes() called ***");
        // Assign questions to the first question scene
        //questionScene1 = scenes(indexOfScene)
        //questionsInScene = Create a new Questions array
        //questionsInScene[0] = questions[indexOfQuestion]
        //questionsInScene[1] = questions[indexOfQuestion]

        // assign questionsInScene array to questionScene1
        
        // Assign questions to the second question scene
        //nextQuestionScene2 = scenes(indexOfScene)
        //questionsInScene = Create a new Questions array
        //questionsInScene[0] = questions[indexOfQuestion]
        //questionsInScene[1] = questions[indexOfQuestion]

        //assign questionsInScene array to questionScene2
        // REPEAT FOR ALL OTHER QUESTION SCENES 
    }
    private static void assignScenesToLoctions(RegularSceneType[] scenes, Location[][] locations) {
        System.out.println("\n*** assignScenesToLocations() called ***");
        // locations[0][0].setScene(scenes[SceneType.fort.ordinal()];
        // locations[0][1].setScene(scenes[SceneType.mountain.ordinal()];
    }

    private static void setToFalse() {
    
        }


    
    
    
    public int calcDistanceTraveled( int pace, int totalHealth){
       // validate inputs
	   // pace must be an integar >= 0 
        if (pace < 0 ) {
            return -1;
        }
		// lower boundary, health cannot be less than 0 
        if (totalHealth < 0) {
            return -1;
        }
		// cannot travel if dead aka totalHealth is 0
        if (totalHealth == 0) {
            return 1;
    }			
		// if pace is 0, the party is resting	
        if (pace == 0) {
            return 2;
    }
    
        // declare all variables
        int p = 15;
	int tH = 2;
	int travelDays = 10;
        
        pace = p * tH;
		
	int distanceTraveled = pace * travelDays;				
		
    return distanceTraveled;        
    }    
}   
/*
move(actor, locations)
visitHuntingLocation(huntingScene, actor)
visitFortLocation(fortScene, actor)
visitRiverScene(riverScene, actor)
visitBarterScene(barterScene, actor)
*/


