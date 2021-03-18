package no.hvl.dat109.regler;

import java.util.ArrayList;

/**
 * @author Emma Helland-Hansen
 */

public class TotalPoengsum implements IRegel {
	
	String navn = "total poengsum";
	
	/**
	 * Regner ut totalpoengsum
	 * 
	 * @param tidligerePongsum : ArrayList<Integer> som er en liste over alle poengsum samlet til n�.
	 * @return summen av poengsummene fra listen.
	 */

	@Override
	public int resolve(ArrayList<Integer> tidligerePoengsum) {
		return tidligerePoengsum.stream().mapToInt(Integer::valueOf).sum();
	}

	public String getNavn() {
		return navn;
	}
	
}
