package Lista6Loops;

public class teste {

	public static void main(String[] args) {
		double numDivCinco;
		double i = 1000;
		
		do {  
			numDivCinco = i % 11;
			if (numDivCinco == 5) {
				System.out.println(i);
			}
			i++;
		} while (i <= 2000);

	}

}
