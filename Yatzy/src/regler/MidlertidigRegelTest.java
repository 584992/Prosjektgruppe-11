package regler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MidlertidigRegelTest {

	ArrayList<Integer> terningsTrill;
	ArrayList<Integer> tidligereResultater;

	IRegel regel;

	private int e0;
	private int e1;
	private int e2;
	private int e3;
	private int e4;

	@BeforeAll
	void setup() {
		
		terningsTrill = new ArrayList<Integer>();
		tidligereResultater = new ArrayList<Integer>();
		e0 = 1;
		e1 = 4;
		e2 = 3;
		e3 = 1;
		e4 = 5;

		terningsTrill.add(e0);
		terningsTrill.add(e1);
		terningsTrill.add(e2);
		terningsTrill.add(e3);
		terningsTrill.add(e4);
		
		tidligereResultater.add(3);
		tidligereResultater.add(0);
		tidligereResultater.add(9);
		tidligereResultater.add(20);
		tidligereResultater.add(5);
	}

	@Test
	void riktigSum1ere() {
		regel = new RundeEnTilSeks();
		assertEquals(2, regel.resolve(terningsTrill, 1));

	}
	
	@Test
	void riktigSum6ere() {
		regel = new RundeEnTilSeks();
		assertEquals(0, regel.resolve(terningsTrill, 6));
	}

	@Test
	void ingenBonusPoeng() {
		regel = new Bonuspoeng();
		tidligereResultater.add(0);
		assertEquals(0, regel.resolve(tidligereResultater, -1));
	}
	
	@Test
	void fårBonusPoeng() {
		regel = new Bonuspoeng();
		tidligereResultater.add(6);
		assertEquals(50, regel.resolve(tidligereResultater, -1));
	}
	
	@Test
	void harToLike() {
		regel = new ToLike();
		assertEquals(2, regel.resolve(terningsTrill, 7));
	}
	
//	@Test
//	void harIkkeToLike() {
//		regel = new ToLike();
//		assertEquals(0, regel.resolve(terningkast, rundenr))
//	}
	
	
}
