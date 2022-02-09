/**
 * 
 */
package compare;

import java.util.Comparator;

/**
 * @author Administrator
 *
 */
public class VolumeCompare implements Comparator<Shape>{
	
	public int compare(Shape shape1, Shape shape2) {
		//compare Volume
		if(shape1.calcVolume() > shape2.calcVolume()) {
			return 3;
		}else if(shape1.calcVolume() < shape2.calcVolume()) {
			return -3;
		}else {
			return 0;
		}
	}


}
