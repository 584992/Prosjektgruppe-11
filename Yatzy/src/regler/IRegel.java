package regler;

import java.util.ArrayList;

/**
 * Interface for alle reglene. 
 * 
 * @author Emma Helland-Hansen
 *
 */

public interface IRegel {

	public int resolve(ArrayList<Integer> terningkast, int rundenr);

}


