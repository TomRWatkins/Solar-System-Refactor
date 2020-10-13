/**
 * This class can be used to represent an arbitrary object in space. 
 * @author Thomas Watkins 
 */
abstract public class SpaceObject {	
	protected SolarSystem solarSystem;	
	protected double diameter;
	protected double velocity;
	protected String colour;
	protected Point point;	
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
	 * To be implemented by subclasses to display and move the Space Object within the Solar System.
	 */
	abstract public void move();
}