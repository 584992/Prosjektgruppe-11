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
	 */
	public void trillerTerningene() {
		int i = 0;
		while (i<5) {
			Terning terningKast = new Terning(Terning.trill()); 
			terninger[i] = terningKast;
			i++;
		}
	}
	
	/**
	 * Henter terningskastene i form av String
	 * Brukes for mottakeren hei
	 * @return
	 */
	public String getTerningKastString() {
		String terningkast  = "";
		int i = 0;
		while (i < 5) {
			terningkast += "Terning " + (i+1) +  ": " + terninger[i].getTall() + "\n";
			i++;
		}
		return terningkast;
	}


	/**
	 * Henter terningkastene i form av tabell
	 * Brukes for eventuelle metoder
	 * @return
	 */
	public Terning[] getTerningKastTabell() {
		return terninger;
	}
	
}
