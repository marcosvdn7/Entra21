//Imprime os n�meros entre 1000 e 2000 cujo resto de divisao por 11 � igual a 5.
package Lista6Loops;

public class Exercicio3 {

	public static void main(String[] args) {
		
		for (int i = 1000 ; i >= 1000 && i <= 2000 ; ++i) {
			if (i % 11 == 5) {
				i++;
				System.out.println(i);
			}
		}
	}

}
