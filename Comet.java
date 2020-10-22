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
	 * re-calculated randomly and velocity will be reversed.	 
	 */
	public void move() {		
		this.getSolarSystem().drawSolarObject(this.getPoint().getDistance(), this.getPoint().getAngle(), this.getDiameter(), this.getColour());
		this.getPoint().incrementDistance(this.getVelocity());
		
		if(this.getPoint().getDistance() > 1100 || this.getPoint().getDistance() < -1100) {
			this.setVelocity(this.getVelocity() * -1);
			this.getPoint().incrementAngle(Math.random() * 150);
		}
	}	
}