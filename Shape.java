/**
 * 
 */
package compare;

/**
 * @author Sheng Ming Yan
 *
 */
public abstract class Shape implements Comparable<Shape>{
	
	double height;
	double radius;
	
	/**
	 * @param height
	 * @param radius
	 */
	public Shape(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	
	public double calcBaseArea() {
		return 0;
	}
	
	public double calcVolume(){
		return 0;
	}
	
	@Override
	public int compareTo(Shape shape)
	{
		if( this.getHeight() > shape.getHeight() )
		{
			return 1;
		}
		else if( this.getHeight() > shape.getHeight() )
		{
			return -1;
		}
		else // this.getHeight() == shape.getHeight()
		{
			return 0;
		}
	}
	
}