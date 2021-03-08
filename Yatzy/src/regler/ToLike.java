package regler;

import java.util.ArrayList;

/**
 * 
 * @author Emma Helland-Hansen
 *
 */

public class ToLike implements IRegel {

	/**
	 * 
	 * Sjekker om terningene har to like, og returnerer poengscoren fra dette.
	 * 
	 * @param terningkast: ArrayList<Integer> over terningkastene i runden
	 * @param rundenr:     rundenr, men brukes ikke i denne metoden.
	 * 
	 * @return sum av to like om finnes. Tar høyest-verdi par først. Returnerer 0 om
	 *         ingen par.
	 */
	@Override
	public int resolve(ArrayList<Integer> terningkast, int rundenr) {

		for (int i = 6; i > 0; i--) {

			// Får ikke lov til å bruke i-variabel i filter, så lager en midlertidig j.
			int j = i;

			int antall = (int) terningkast.stream().filter(x -> x == j).count();

			if (antall >= 2) {
				return 2 * j;
			}
		}

		return 0;
	}

}
