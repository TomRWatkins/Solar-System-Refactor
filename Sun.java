/**
 * This class provides an implementation for creating a Sun. 
 * @author Thomas Watkins 
 */
public class Sun extends SpaceObject {	
	/**
	 * Constructor. Creates an instance of a Sun.
	 * @param solarSystem the solar system used to place this space object to the screen. 
	 * @param distance the distance from the Sun.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the Sun. 
	 * @param diameter the diameter of this space Sun.
	 * @param velocity the velocity of this sun.
	 * @param colour the colour of this sun.
	 */
	public Sun(SolarSystem solarSystem, double distance, double angle, double diameter, double velocity, String colour) {		
		super(solarSystem, distance, angle, diameter, velocity, colour);		
	}	
	
	/**
	 * Displays the Sun to the screen. 
	 */
	public void move() {		
		this.getSolarSystem().drawSolarObject(0, 0, this.getDiameter(), this.getColour());
	}
}