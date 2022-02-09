/**
 * 
 */
package compare;

import java.util.Comparator;

/**
 * @author Administrator
 *
 */
public class BaseAreaCompare implements Comparator <Shape>{
	
	public int compare(Shape shape1, Shape shape2) {
		
		//compare Base Area
		if(shape1.calcBaseArea() > shape2.calcBaseArea()) {
			return 2;
		}else if(shape1.calcBaseArea() < shape2.calcBaseArea()) {
			return -2;
		}else {
			return 0;
		}
		
	}

}
