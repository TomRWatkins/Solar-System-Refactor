/**
 * This class can be used to represent an arbitrary object in space. 
 * @author Thomas Watkins 
 */
abstract public class SpaceObject {	
	private SolarSystem solarSystem;	
	private double diameter;
	private double velocity;
	private String colour;
	private Point point;	
	/**
	 * Constructor. Creates a new space object.
	 * @param solarSystem the solar system used to place this space object to the screen. 
	 * @param distance the distance from the sun.
	 * @param angle the angle (in degrees) that represents how far the space object is around its orbit of the sun. 
	 * @param diameter the diameter of this space object.
	 * @param velocity the velocity of this space object.
	 * @param colour the colour of this space object.	  
	 */
	public SpaceObject(SolarSystem solarSystem, double distance, double angle, double diameter, double velocity, String colour) {		
		this.solarSystem = solarSystem;		
		this.diameter = diameter;
		this.velocity = velocity;
		this.colour = colour;	
		this.point = new Point(distance, angle);		
	}	
	
	/**
	 * Returns this Space Objects Solar System.
	 * @return solarSystem
	 */
	public SolarSystem getSolarSystem() {
		return this.solarSystem;
	}
	
	/**
	 * Returns this Space Objects Diameter.
	 * @return diameter
	 */
	public double getDiameter() {
		return this.diameter;
	}
	
	/**
	 * Returns this Space Objects Velocity.
	 * @return velocity
	 */
	public double getVelocity() {
		return this.velocity;
	}
	
	/**
	 * Returns this Space Objects Colour.
	 * @return colour
	 */
	public String getColour() {
		return this.colour;
	}
	
	/**
	 * Returns this Space Objects Point.
	 * @return point
	 */
	public Point getPoint() {
		return this.point;
	}
	
	/**
	 * Modifies this Space Objects Velocity.
	 * @param velocity
	 */
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
	/**
	 * To be implemented by subclasses to display and move the Space Object within the Solar System.
	 */
	abstract public void move();
}