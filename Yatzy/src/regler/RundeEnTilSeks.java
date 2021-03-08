package regler;

import java.util.ArrayList;

/**
 * 
 * @author Emma Helland-Hansen
 *
 */
public class RundeEnTilSeks implements IRegel {

	
	/**
	 * 
	 * Metoden er ansvarlig for å regne ut poengsum for de første 6 rundene, hvor man skal regne ut summen av terningkast med en spesifikk terningsverdi.
	 * 
	 * @param terningkast: ArrayList<Integer> over terningkast
	 * @param rundenr. Er det samme som terningsverdien vi vil ha. 
	 * 
	 * @return sum av terningkastene som matcher rundenr.
	 * 
	 * Metoden finner alle terninger som matcher rundenr (og den terningverdien vi vil ha), og summerer alle disse og returnerer de til Yatzy-klassen.
	 */
	
	@Override
	public int resolve(ArrayList<Integer> terningkast, int rundenr) {

		return terningkast.stream().filter(x -> x == rundenr).mapToInt(Integer::valueOf).sum();

	}

}