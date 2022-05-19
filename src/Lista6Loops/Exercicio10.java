//Imprime o quinto número maior que 1000 cujo resto de divisao por 11 seja 5.
package Lista6Loops;

public class Exercicio10 {

	public static void main(String[] args) {
		int i = 0;
		double num = 1000;
		double resultado;
		
		do {
			resultado = num % 11; 
			num++;
			if(resultado == 5) {
				i++;
			}
		} while (i < 5);
		System.out.println(num+ " é o quinto número maior que 1000 cujo resto da divisao por 11 é igual a 5.");

	}

}
