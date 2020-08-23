/**
 * The driver class for a two dimensional model of our solar system. 
 * @author Thomas Watkins
 */
public class ModelSolarSystem {	
	
	static final int CONST_OBJS = 14;
	static final int J_MOONS = 70;
	static final int ASTEROIDS = 250;
	static final int STARS = 250;
	static final int TOTAL_OBJS = CONST_OBJS + J_MOONS + ASTEROIDS;
	/**
     * The main method instantiates the hard-coded solar objects in our solar system and 
     * assigns random parameters for Jupiter's Moons and Asteroids. Then periodically 
     * calls each space objects move method to display a moving graphical model of our solar system.
     * 
     * @param CONST_OBJS is the total number of spaceObjects which are hard-coded.
     * @param J_MOONS is the total number of Jupiter's Moons to be displayed.
     * @param ASTEROIDS is the total number of Asteroids in the Asteroid belt.
     * @param TOTAL_OBJS is the total number of Space Objects.
     */    
	public static void main(String[] args) {
		SolarSystem solarSystem = new SolarSystem(1200, 750);
		SpaceObject spaceObjects[] = new SpaceObject[TOTAL_OBJS+STARS];
		
		spaceObjects[0] = new Sun(solarSystem, 0, 0, 60, 0, "YELLOW"); 						  //Sun
		spaceObjects[1] = new Planet(solarSystem, 180, 100, 20, 0.9, "BLUE"); 				  //Earth
		spaceObjects[2] = new Moon(spaceObjects[1], solarSystem, 30, 0, 10, 5); 	          //Earths Moon
		spaceObjects[3] = new Planet(solarSystem, 60, 200, 15, 1.5, "WHITE"); 				  //Mercury
		spaceObjects[4] = new Planet(solarSystem, 110, 400, 15, 1, "ORANGE"); 				  //Venus
		spaceObjects[5] = new Planet(solarSystem, 250, 600, 19, -0.5, "RED");  				  //Mars
		spaceObjects[6] = new Moon(spaceObjects[5], solarSystem, 30, 1210, 10, 3.5);          //Deimos
		spaceObjects[7] = new Moon(spaceObjects[5], solarSystem, 50, 0, 10, 1.4);             //Phobos
		spaceObjects[8] = new Planet(solarSystem, 450, -12900, 50, 0.5, "PINK"); 			  //Jupiter		
		spaceObjects[9] = new Planet(solarSystem, 500, 750, 80, 0.9, "PINK"); 				  //Saturn Outer Ring
		spaceObjects[10] = new Planet(solarSystem, 500, 750, 75, 0.9, "BLACK"); 			  //Saturn Black Space
		spaceObjects[11] = new Planet(solarSystem, 500, 750, 65, 0.9, "PINK"); 			      //Saturn Inner Ring
		spaceObjects[12] = new Planet(solarSystem, 500, 750, 60, 0.9, "BLACK"); 			  //Saturn Black Space
		spaceObjects[13] = new Planet(solarSystem, 500, 750, 35, 0.9, "YELLOW"); 			  //Saturn
		
		//Instantiate Jupiters moons
		for(int i = CONST_OBJS; i < CONST_OBJS+J_MOONS; i++) 
			spaceObjects[i] = new Moon(spaceObjects[8], solarSystem, 50+Math.random()*10, Math.random(), 6-Math.random()*2, 2.5+Math.random());		
		
		//Instantiate Asteroids
		for(int i = CONST_OBJS+J_MOONS; i < TOTAL_OBJS; i++) 		
			spaceObjects[i] = new Asteroid(solarSystem, 320+Math.random()*40, Math.random()*300, 11-(Math.random()*3), 1.5-Math.random(), "DARK_GRAY");
		
		//Instantiate Stars
		for(int i = TOTAL_OBJS; i < TOTAL_OBJS + STARS; i++)
				spaceObjects[i] = new Star(solarSystem, (double) (int)(Math.random() * 700) + 100, (double) (int)(Math.random() * 359) + 1, (double) (int)(Math.random() * 9) + 1, 0, "WHITE");
		
		//Move all spaceObjects
		while(true) {
			for(SpaceObject spaceObj: spaceObjects) 
				spaceObj.move();			
			solarSystem.finishedDrawing();
		}
	}
}
