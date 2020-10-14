/**
 * A class that represents a point in space.
 * @author Thomas Watkins
 */
public class Point {
	private double distance;
	private double angle;
	/**
	 * Creates a point in space
	 * @param distance the distance from the Sun.
	 * @param angle the angle around it's orbit.
	 */
	public Point(double distance, double angle) {
		this.distance = distance;
		this.angle = angle;
	}
	
	/**
	 * Returns the distance of this point. 
	 * @return distance
	 */
	public double getDistance() {
		return this.distance;
	}
	
	/**
	 * Returns the angle of this point.
	 * @return angle
	 */
	public double getAngle() {
		return this.angle;
	}	
	
	/**
	 * Increments the angle position held by this point by the velocity of the space object.
	 * @param velocity the velocity of the space object of which is being incremented.
	 */
	public void incrementAngle(double velocity) {
		this.angle+=velocity;
	}
	
	/**
	 * Increments the distance position held by this point by the velocity of the space object.
	 * @param velocity the velocity of the space object of which is being incremented.
	 */
	public void incrementDistance(double velocity) {
		this.distance+=velocity;
	}
}