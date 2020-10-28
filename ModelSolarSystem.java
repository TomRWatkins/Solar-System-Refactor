import java.util.ArrayList;

/**
 * The driver class for a two dimensional model of our solar system. 
 * Attempting to achieve the *star* mark.
 * @author Thomas Watkins
 */
public class ModelSolarSystem {	
	static final int J_MOONS = 70;
	static final int ASTEROIDS = 250;
	static final int STARS = 300;
	
	/**
     * The main method instantiates the hard-coded solar objects in our solar system and 
     * assigns random parameters for Jupiter's Moons, Asteroids, Comets and Stars. Then periodically 
     * calls each Space Objects move method to display a moving graphical model of our solar system.
     */    
	public static void main(String[] args) {
		SolarSystem solarSystem = new SolarSystem(1200, 750);
		ArrayList<SpaceObject> spaceObjects = new ArrayList<SpaceObject>();
		
		spaceObjects.add(new Sun(solarSystem, 0, 0, 65, 0, "YELLOW")); 						  //Sun
		Planet earth = new Planet(solarSystem, 180, 100, 20, 0.9, "BLUE");		              //Earth
		spaceObjects.add(earth); 				  
		spaceObjects.add(new Moon(earth, solarSystem, 30, 0, 10, 5)); 	      				  //Earths Moon
		spaceObjects.add(new Planet(solarSystem, 60, 200, 15, 1.5, "WHITE")); 				  //Mercury
		spaceObjects.add(new Planet(solarSystem, 110, 400, 15, 1, "ORANGE")); 				  //Venus
		Planet mars = new Planet(solarSystem, 250, 600, 19, 0.5, "RED"); 					  //Mars
		spaceObjects.add(mars);  				 
		spaceObjects.add(new Moon(mars, solarSystem, 30, 1210, 10, 3.5));         			  //Deimos
		spaceObjects.add(new Moon(mars, solarSystem, 50, 0, 10, 2.8));            			  //Phobos
		Planet jupiter = new Planet(solarSystem, 450, 180, 50, 0.4, "PINK");				  //Jupiter	
		spaceObjects.add(jupiter); 			      	
		spaceObjects.add(new Planet(solarSystem, 500, 750, 80, 0.3, "PINK")); 				  //Saturn Outer Ring
		spaceObjects.add(new Planet(solarSystem, 500, 750, 75, 0.3, "BLACK")); 			      //Saturn Black Space
		spaceObjects.add(new Planet(solarSystem, 500, 750, 65, 0.3, "PINK")); 			      //Saturn Inner Ring
		spaceObjects.add(new Planet(solarSystem, 500, 750, 60, 0.3, "BLACK")); 			      //Saturn Black Space
		spaceObjects.add(new Planet(solarSystem, 500, 750, 35, 0.3, "YELLOW")); 			  //Saturn
		spaceObjects.add(new Planet(solarSystem, 220, 750, 25, 0.9, "CYAN")); 			      //Uranus
		spaceObjects.add(new Planet(solarSystem, 180, 150, 31, 1.06, "DARK_GRAY")); 	      //Neptune
		spaceObjects.add(new Comet(solarSystem, 0, 400, 11, 13.06, "WHITE")); 	              //Comet one
		spaceObjects.add(new Comet(solarSystem, 70, 100, 8, -9.06, "WHITE")); 	              //Comet two
		
		
		//Instantiate Jupiters moons
		for(int i = 0; i < J_MOONS; i++) 
			spaceObjects.add(new Moon(jupiter, solarSystem, 50+Math.random()*10, Math.random(), 6-Math.random()*2, 0.5+Math.random()));		
		
		//Instantiate Asteroids
		for(int i = 0; i < ASTEROIDS; i++) 		
			spaceObjects.add(new Asteroid(solarSystem, 320+Math.random()*40, Math.random()*300, 11-(Math.random()*3), 1.5-Math.random(), "DARK_GRAY"));
		
		//Instantiate Stars
		for(int i = 0; i < STARS; i++)
			spaceObjects.add(new Star(solarSystem, (double) (int)(Math.random() * 700) + 100, (double) (int)(Math.random() * 359) + 1, (double) (int)(Math.random() * 9) + 1, 0, "WHITE"));
		
		//Move all spaceObjects
		while(true) {
			for(SpaceObject spaceObj: spaceObjects) 
				spaceObj.move();	
			
			solarSystem.finishedDrawing();
		}
	}
}
