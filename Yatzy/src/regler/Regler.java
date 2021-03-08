package regler;

import java.util.HashMap;

public class Regler {
	
	private HashMap<Integer, IRegel> regler;
	
	public Regler() {
	
		regler = new HashMap<Integer, IRegel>();
		
		regler.put(1, new RundeEnTilSeks());
		regler.put(2, new RundeEnTilSeks());
		regler.put(3, new RundeEnTilSeks());
		regler.put(4, new RundeEnTilSeks());
		regler.put(5, new RundeEnTilSeks());
		regler.put(6, new RundeEnTilSeks());
		
		regler.put(7, new EttPar());
		regler.put(8, new ToPar());
		regler.put(9, new TreLike());
		regler.put(10, new FireLike());
		regler.put(11, new LitenStraight());
		regler.put(12, new StorStraight());
		regler.put(13, new Hus());
		regler.put(14, new Sjanse());
		regler.put(15, new Yatzy());
		
	}
	
	public HashMap<Integer, IRegel> getRegler(){
		return regler;
	}

}
