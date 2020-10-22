/**
 * This class provides an implementation for creating a Planet.
 * @author Thomas Watkins 
 */
public class Planet extends SpaceObject {	
	/**
	 * Constructor. Creates an instance of a Planet.
	 * @param solarSystem the solar system used to place this planet to the screen. 
	 * @param distance the distance from the Sun.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the Sun. 
	 * @param diameter the diameter of this planet.
	 * @param velocity the velocity of this planet.
	 * @param colour the colour of this planet.
	 */
	public Planet(SolarSystem solarSystem, double distance, double angle, double diameter, double velocity, String colour) {		
		super(solarSystem, distance, angle, diameter, velocity, colour);			
	}	
	
	/**
	 * Moves this Planet by it's orbital velocity.	 
	 */
	public void move() {		
		this.getSolarSystem().drawSolarObject(this.getPoint().getDistance(), this.getPoint().getAngle(), this.getDiameter(), this.getColour());
		this.getPoint().incrementAngle(this.getVelocity());
	}	
}