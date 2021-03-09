package no.hvl.dat109.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import no.hvl.dat109.terningkast.Kopp;
import no.hvl.dat109.terningkast.Terning;
import regler.Bonuspoeng;
import regler.IRegel;
import regler.Regler;
import regler.TotalPoengsum;

public class Yatzy {

	// Bare slett om det er i veien, var bare for egen testing :--)

	public static void main(String[] args) {

		final int SLEEPTIME = 100;

		ArrayList<String> spillere = new ArrayList<String>();
		spillere.add("Emma");
		spillere.add("Regine");
		spillere.add("Vilde");
		spillere.add("Magnus");

		HashMap<String, ArrayList<Integer>> terningSummer = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> terningTrill = new ArrayList<Integer>();
		Random rand = new Random();
		HashMap<Integer, IRegel> regler = new Regler().getRegler();

		HashMap<String, Integer> totalsum = new HashMap<String, Integer>();
		int sum = 0;

		for (String spiller : spillere) {
			
			terningSummer.put(spiller, new ArrayList<Integer>());
			totalsum.put(spiller, 0);
		}
		
		

		for (int i = 1; i < 16; i++) {

			System.out.print("\n\nRunde " + i + ", ");
			System.out.println(regler.get(i).getClass().getSimpleName() + "\n");

			for (String spiller : spillere) {

				System.out.println("\n" + spiller + " sin tur!\n");

				for (int l = 0; l < 3; l++) {
					terningTrill.clear();
					for (int j = 0; j < 5; j++) {
						terningTrill.add(rand.nextInt(6) + 1);
					}
					System.out.println("Triller " + (l+1) +" gang: " + terningTrill.toString() + ".");
					sum = regler.get(i).resolve(terningTrill, i);
					if(sum!=0) {
						break;
					}
					
				}

				try {
					Thread.sleep(SLEEPTIME);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				terningSummer.get(spiller).add(sum);
				totalsum.put(spiller, totalsum.get(spiller) + sum);

				System.out.println("\nSum blir..: " + sum + "!");

				try {
					Thread.sleep(SLEEPTIME);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (i == 6) {

					System.out.println("Får " + spiller + " bonus?");
					System.out.println(spiller + " har fra før av " + totalsum.get(spiller) + " poeng, og får "
							+ new Bonuspoeng().resolve(terningSummer.get(spiller), -1) + " bonuspoeng!");

				}
			}
		}

		System.out.println("\n");
		for (String spiller : spillere) {

			System.out.println(
					"\n" + spiller + " får tilsammen " + new TotalPoengsum().resolve(terningSummer.get(spiller), 15) + " poeng.");
			System.out.println("Godt jobbet, " + spiller + "!");
		}

	}

}
