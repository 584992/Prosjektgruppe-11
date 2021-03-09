package no.hvl.dat109.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import regler.Bonuspoeng;
import regler.IRegel;
import regler.Regler;
import regler.TotalPoengsum;

public class Yatzy {

	// Bare litt rask testing

	public static void main(String[] args) {

		String spiller = "Emma";

		ArrayList<Integer> terningSummer = new ArrayList<Integer>();
		ArrayList<Integer> terningTrill = new ArrayList<Integer>();
		Random rand = new Random();
		HashMap<Integer, IRegel> regler = new Regler().getRegler();

		int totalsum = 0;

		for (int i = 1; i < 16; i++) {

			System.out.println("Runde " + i + "!");
			System.out.println(regler.get(i).getClass().getSimpleName());

			for (int j = 0; j < 5; j++) {
				terningTrill.add(rand.nextInt(6) + 1);
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Triller: " + terningTrill.toString() + ".");
			int sum = regler.get(i).resolve(terningTrill, i);
			terningSummer.add(i);
			totalsum += sum;

			System.out.println("Sum blir..: " + i + "!");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (i == 6) {

				System.out.println("Får" + spiller + " bonus?");
				System.out.println(spiller + " har fra før av " + totalsum + " poeng, og får "
						+ new Bonuspoeng().resolve(terningSummer, -1) + " bonuspoeng!");

			}

		}

		System.out.println(spiller + " får tilsammen " + new TotalPoengsum().resolve(terningSummer, 15));
		System.out.println("Godt jobbet, " + spiller + "!");

	}

}
