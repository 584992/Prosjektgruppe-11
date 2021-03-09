package no.hvl.dat109.terningkast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author vilde
 *
 */
public class Kopp {
	
	private Terning[] terninger = new Terning[5];
	
	/**
	 * Triller terningene (5stk)
	 * @param i er antall terninger du vil kaste
	 */
	public void trillerTerningene(int i) {
		if ( i > 5 || i < 0) {
		System.out.println("Du kan kun velge terninger mellom 1 og 5. Prøv på nytt.");	
		} else {
		int j = 0;
		for (Terning terning : terninger) {
			Terning terningKast = new Terning(terning.trill()); //Triller i terning-klassen
			terninger[j] = terningKast;
			i++;
		}
		}
	}
	
	/**
	 * Henter terningskastene i form av String
	 * @return
	 */
	public String getTerningKast() {
		String terningkast  = "";
		int i = 0;
		while (terninger[i]!=null) {
			terningkast += "Terning " + (i+1) +  ": " + terninger[i];
			i++;
		}
		
		return terningkast;
	}


}
