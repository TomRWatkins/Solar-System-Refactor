/**
 * This class provides an implementation for creating a Star.
 * @author Thomas Watkins 
 */
public class Star extends SpaceObject {
	/**
	 * Constructor. Creates an instance of a Star.
	 * @param solarSystem the solar system used to place this star to the screen. 
	 * @param distance the distance from the Sun.
	 * @param angle the angle (in degrees) that represents how far the star is around its orbit of the Sun. 
	 * @param diameter the diameter of this star.
	 * @param velocity the velocity of this star.
	 * @param colour the colour of this star.
	 */
	public Star(SolarSystem solarSystem, double distance, double angle, double diameter, double velocity, String colour) {		
		super(solarSystem, distance, angle, diameter, velocity, colour);			
	}	
	/**
	 * Displays this star to the screen.
	 */
	public void move() {		
		this.solarSystem.drawSolarObject(this.point.getDistance(), this.point.getAngle(), this.diameter, this.colour);
	}	
}
