package regler;

import java.util.ArrayList;

public class TotalPoengsum implements IRegel {

	@Override
	public int resolve(ArrayList<Integer> tidligerePoengsum, int rundenr) {
		return tidligerePoengsum.stream().mapToInt(Integer::valueOf).sum();
	}

}
