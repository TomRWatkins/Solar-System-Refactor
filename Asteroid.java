/**
 * This class provides an implementation for creating a Asteroid.
 * @author Thomas Watkins
 */
public class Asteroid extends SpaceObject{
	/**
	 * Constructor. Creates an instance of a Asteroid.
	 * @param solarSystem the solar system used to place this space object to the screen. 
	 * @param distance the distance from the Sun.
	 * @param angle the angle (in degrees) that represents how far the Asteroid is around its orbit of the Sun. 
	 * @param diameter the diameter of this Asteroid.
	 * @param velocity the velocity of this Asteroid.
	 * @param colour the colour of this Asteroid.
	 */
	public Asteroid(SolarSystem solarSystem, double distance, double angle, double diameter, double velocity, String colour) {
		super(solarSystem, distance, angle, diameter, velocity, colour);			
	}	
	
	/**
	 * Moves this Asteroid by it's orbital velocity.	
	 */
	public void move() {	
		this.getSolarSystem().drawSolarObject(this.getPoint().getDistance(), this.getPoint().getAngle(), this.getDiameter(), this.getColour());
		this.getPoint().incrementAngle(this.getVelocity());
	}
}