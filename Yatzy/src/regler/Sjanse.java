package regler;

import java.util.ArrayList;

/**
 * 
 * @author Emma Helland-Hansen
 *
 */
public class Sjanse implements IRegel{

	/**
	 * Sjanse summerer alle terningsverdiene og returnerer summen.
	 * @param terningkast: ArrayList<Integer> som er en liste over terningene.
	 * @param rundenr: Brukes ikke i denne metoden.
	 * 
	 * @return sum av alle terningene.
	 * 
	 */
	
	@Override
	public int resolve(ArrayList<Integer> terningkast, int rundenr) {
		return terningkast.stream().mapToInt(Integer::valueOf).sum();
		
	}

}
