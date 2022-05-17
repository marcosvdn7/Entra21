package Lista6Loops;

public class Exercicio6 {

	public static void main(String[] args) {
		int i = 0;
		double taxaCrescChico;
		double taxaCrescJuca;
		double alturaChico = 1.5;
		double alturaJuca = 1.1;
		
		while (alturaJuca < alturaChico) {
			taxaCrescJuca = alturaJuca * 0.03;
			taxaCrescChico = alturaChico * 0.02;
			alturaJuca += taxaCrescJuca;
			alturaChico += taxaCrescChico;
			i++;
		}
		 System.out.println("Levarão " +i+ " ano(s) para que Juca alcance a altura de Chico.");

	}

}
