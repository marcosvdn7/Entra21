package Lista6Loops;

public class Exercicio3 {

	public static void main(String[] args) {
		int numDivCinco;
		
		for (int i = 1000 ; i == 1000 || i < 2000 ; i++) {
			numDivCinco = i % 11;
			if (numDivCinco == 5) {
				System.out.println(i);
			}
		}
	}

}
