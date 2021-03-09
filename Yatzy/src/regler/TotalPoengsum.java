package regler;

import java.util.ArrayList;

/**
 * @author Emma Helland-Hansen
 */

public class TotalPoengsum implements IRegel {
	
	/**
	 * Regner ut totalpoengsum
	 * 
	 * @param tidligerePongsum : ArrayList<Integer> som er en liste over alle poengsum samlet til nå.
	 * @param int rundenr : brukes ikke her.
	 * @return summen av poengsummene fra listen.
	 */

	@Override
	public int resolve(ArrayList<Integer> tidligerePoengsum, int rundenr) {
		return tidligerePoengsum.stream().mapToInt(Integer::valueOf).sum();
	}

}
