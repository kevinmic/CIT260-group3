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
        //return null
        //endif
        //if items is null OR its length is < 1
        //RETURN null
            //endif
        //Map map = new Map object
        Map gameMap = new Map();
        //save the noOfRows in the map
        //save the noOfColumns in the map
        //locations = createLocations(noOfRows, noOfColumns)
        //Assign the locations array to the map
        //scenes = createScenes()
        //questions = createQuestions()
        //assignQuestionsToScenes()
        //assignItemsToScenes() 
        return gameMap;
    }
    private static Location[][] createLoctions(int rows, int columns) {
        System.out.println("\n*** createLocations() called ***");
        //IF rows < 1 OR columns < 1 THEN
        //RETURN null
        //ENDIF
        //locations = new two-dimensional Location array
        Location[][] location = null;
        //FOR every row in the locations array
        //FOR every column in the locations array
        //location = create a new Location object
        //set the row, and column attributes in the location
        //set visited attribute to false
        //Assign location to the row, and column in array
        //ENDFOR
        //RETURN locations 
        
        return location;
    }
    private static RegularSceneType[] createScenes() {
        System.out.println("\n*** createScenes() called ***");
        //scenes = Create an array Scene objects
        RegularSceneType[] scene = null;
        //scene1 = Create a new Scene object
        //Assign values to each attribute in the Scene object
        //Assign scene1 to its position in the scenes array

        //scene2 = Create a new ConstructionScene object
        //Assign values to each attribute in the Scene object
        //Assign scene2 to its position in the scenes array
        //scene2 = Create a new ResourceScene object
        //Assign values to each attribute in the Scene object
        //Assign scene2 to its position in the scenes array 
        
        return scene;
    }
    private static CharacterDialog[] createDialog() {
        System.out.println("\n*** createScenes() called ***");
        CharacterDialog[] dialog = null;
        //questions = Create an array Question objects
        //question1 = Create a new Question object
        //Assign values to each attribute in the Question object
        //Assign question1 to its position in the questions array
        //question2 = Create a new Question object
        //Assign values to each attribute in the Question object
        //Assign question2 to its position in the questions array
        //RETURN questions 
        return dialog;
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


