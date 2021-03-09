package regler;

import java.util.ArrayList;

/**
 * 
 * @author Emma Helland-Hansen
 *
 */
public class FireLike implements IRegel{

	/**
	 * 
	 * Sjekker om terningene har fire like, og returnerer poengscoren fra dette.
	 * 
	 * @param terningkast: ArrayList<Integer> over terningkastene i runden
	 * @param rundenr:     rundenr, men brukes ikke i denne metoden.
	 * 
	 * @return sum av tre like om finnes. Tar h�yest-verdi f�rst. Returnerer 0 om
	 *         det ikke finnes 4 av noe siffer.
	 */
	
	@Override
	public int resolve(ArrayList<Integer> terningkast, int rundenr) {
		for (int i = 6; i > 0; i--) {

			// F�r ikke lov til � bruke i-variabel i filter, s� lager en midlertidig j.
			int j = i;

			int antall = (int) terningkast.stream().filter(x -> x == j).count();

			if (antall >= 4) {
				return 4 * j;
			}
		}

		return 0;
	}

}
