package Lista6Loops;

public class Exercicio17 {

	public static void main(String[] args) {
		int i = 0;
		double taxaCrescimentoA;
		double taxaCrescimentoB;
		double populacaoA = 80000;
		double populacaoB = 200000;
		
		while (populacaoA < populacaoB) {
			taxaCrescimentoA = populacaoA * 0.03;
			taxaCrescimentoB = populacaoB * 0.015;
			populacaoA += taxaCrescimentoA;
			populacaoB += taxaCrescimentoB;
			i++;
		}
		 System.out.println("Popula��o pa�s A: " +populacaoA);
		 System.out.println("Popula��o pa�s B: " +populacaoB);
		 System.out.println("Levar�o " +i+ " ano(s) para que a popula��o do pa�s A alcance a do pa�s B.");

	}

}
