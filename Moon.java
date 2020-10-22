/**
 * This class provides an implementation for creating a Moon.
 * @author Thomas Watkins
 */
public class Moon extends SpaceObject{	
	private Planet planetAbout;
	/**
	 * Constructor. Creates an instance of a Moon.
	 * @param planetAbout the planet which this Moon will orbit.
	 * @param solarSystem the solar system used to place this space object to the screen. 
	 * @param distance the distance from the planet it orbits.
	 * @param angle the angle (in degrees) that represents how far the moon is around its orbit of the planet. 
	 * @param diameter the diameter of this Moon.
	 * @param velocity the velocity of this Moon.
	 * @param colour the colour of this Moon.
	 */
	public Moon(SpaceObject planetAbout, SolarSystem solarSystem, double distance, double angle, double diameter, double velocity) {
		super(solarSystem, distance, angle, diameter, velocity, "GRAY");
		this.planetAbout = (Planet) planetAbout;		
	}	
	
	/**
	 * Moves this Moon by it's orbital velocity, around the planet it orbits.
	 */
	public void move() {				
		this.getSolarSystem().drawSolarObjectAbout(this.planetAbout.getPoint().getDistance(), this.planetAbout.getPoint().getAngle(),
				this.getDiameter(), this.getColour(), this.getPoint().getDistance(), this.getPoint().getAngle());
		this.getPoint().incrementAngle(this.getVelocity());
	}	
}