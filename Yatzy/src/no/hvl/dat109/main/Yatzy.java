package no.hvl.dat109.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import no.hvl.dat109.spiller.Spiller;
import regler.IRegel;
import regler.Regler;

/**
 * Hovedklasse som starter spillet
 *
 * Antar at spillet er tvunget yatzy i første omgang hvertfall
 *
 * @author Anne og Thea
 *
 */
public class Yatzy {
	/**
	 * Objektvariabler
	 */
	private static final int MAKS_ANTALL_RUNDER = 15; // Ut fra et vanlig yatzy brett
	private static int rundenr = 1;
	private static int antallSpillere;
	private static Regler reg = new Regler();
	private static HashMap<Integer, IRegel> regler = reg.getRegler();
	private static List<Spiller> spillere = new ArrayList<Spiller>();


	public static void main(String[] args) {
		startSpill();
		System.out.println("SPILLET ER SLUTT");
//		String spiller = "Emma";
//
//		ArrayList<Integer> terningSummer = new ArrayList<Integer>();
//		ArrayList<Integer> terningTrill = new ArrayList<Integer>();
//		Random rand = new Random();
//		HashMap<Integer, IRegel> regler = new Regler().getRegler();
//
//		int totalsum = 0;
//
//		for (int i = 1; i < 16; i++) {
//
//			System.out.println("Runde " + i + "!");
//			System.out.println(regler.get(i).getClass().getSimpleName());
//
//			for (int j = 0; j < 5; j++) {
//				terningTrill.add(rand.nextInt(6) + 1);
//			}
//
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			System.out.println("Triller: " + terningTrill.toString() + ".");
//			int sum = regler.get(i).resolve(terningTrill, i);
//			terningSummer.add(i);
//			totalsum += sum;
//
//			System.out.println("Sum blir..: " + sum + "!");
//
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//			if (i == 6) {
//
//				System.out.println("F�r" + spiller + " bonus?");
//				System.out.println(spiller + " har fra f�r av " + totalsum + " poeng, og f�r "
//						+ new Bonuspoeng().resolve(terningSummer, -1) + " bonuspoeng!");
//
//			}
//
//			terningTrill.clear();
//
//		}
//
//		System.out.println(spiller + " f�r tilsammen " + new TotalPoengsum().resolve(terningSummer, 15));
//		System.out.println("Godt jobbet, " + spiller + "!");

	}

	private static void startSpill() {
		Scanner sc = new Scanner(System.in);

		// Be om antall spillere:
		System.out.println("Hvor mange skal spille? (Fra 1 til 6 personer)");
		antallSpillere = sc.nextInt();
		while (antallSpillere < 1 || antallSpillere > 6) {
			System.out.println("Ugyldig antall spillere! Må være fra 1 til 6");
			antallSpillere = sc.nextInt();
		}

		// Få informasjon om alle spillerene
		for (int i = 0; i < antallSpillere; i++) {
			System.out.println("Spiller navn: ");
			String navn = sc.next();
			spillere.add(new Spiller());//sc.next())); // Antar at dette er en konstruktør
			// Spør om eventuelt mer informasjon som er nødvendig for å opprette spiller objekt
		}

		sc.close();

		// Starter rundene
		while (rundenr <= MAKS_ANTALL_RUNDER) {
			System.out.println("RUNDE NUMMER: " + rundenr);
			for (Spiller s : spillere) {
				// Triller:
				// for (int i = 0; i < 3; i++)
				// 		Kopp k = s.trill(); 	--> Regner med dette blir en metode i Spiller klassen

				// Første runde bare:
				IRegel regel = regler.get(rundenr);
				//int resultat = regel.resolve(terningkast, rundenr);

				// HashMap: lagre resultat i Spiller


				rundenr++;
			}
		}

		// sysout: spiller + totalsum
		// sysout: hvem som vant
	}

}
