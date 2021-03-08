package regler;

import java.util.ArrayList;

/**
 * 
 * @author Emma Helland-Hansen
 *
 */

public class ToPar implements IRegel {

	/**
	 * Metoden sjekker om det finnes to par i listen over terningskast, og
	 * returnerer poengsum basert på dette.
	 * 
	 * @param terningkast: ArrayList<Integer> liste over terningkast som vi leter
	 *                     etter to par i.
	 * @param rundenr:     brukes ikke i denne metoden.
	 * 
	 * @return poengsum : 0 om det ikke finnes 2 par, ellers summen av verdien til
	 *         de to parene.
	 */
	@Override
	public int resolve(ArrayList<Integer> terningkast, int rundenr) {

		for (int i = 6; i > 0; i--) {
			// Får ikke lov til å bruke i-variabel i filter, så lager en midlertidig j.
			int k = i;

			int antall = (int) terningkast.stream().filter(x -> x == k).count();

			if (antall >= 2) {
				for (int j = i--; j > 0; j--) {

					int l = j;
					
					//terningkast.stream().reduce();

					int antall2 = (int) terningkast.stream().filter(x -> x == l).count();

					if (antall2 >= 2) {
						return k * 2 + l * 2;
					}
				}

				return 0;
			}
		}

		return 0;
	}

}
