/**
 * This class provides an implementation for creating a Comet.
 * @author Thomas Watkins 
 */
public class Comet extends SpaceObject {	
	/**
	 * Constructor. Creates an instance of a Comet.
	 * @param solarSystem the solar system used to place this Comet to the screen. 
	 * @param distance the distance from the Sun.
	 * @param angle the angle (in degrees) that represents how far the Comet is around its orbit of the Sun. 
	 * @param diameter the diameter of this Comet.
	 * @param velocity the velocity of this Comet.
	 * @param colour the colour of this Comet.
	 */
	public Comet(SolarSystem solarSystem, double distance, double angle, double diameter, double velocity, String colour) {		
		super(solarSystem, distance, angle, diameter, velocity, colour);			
	}	
	/**
	 * Moves this Comet by it's orbital velocity. When the comet has moved far enough off the screen its axis will be 
	 * re-valued and velocity will be reversed.	 
	 */
	public void move() {		
		this.solarSystem.drawSolarObject(this.point.getDistance(), this.point.getAngle(), this.diameter, this.colour);
		this.point.incrementDistance(this.velocity);
		
		if(this.point.getDistance() > 1100 || this.point.getDistance() < -1100) {
			this.velocity *= -1;
			this.point.incrementAngle(Math.random() * 150);
		}
	}	
	/**
	 * Returns this Comets Point holding information about its position in the solar system.
	 * @return Point
	 */
	public Point getPoint() {
		return this.point;
	}
}