package ListaExtraLoops;

import java.util.Scanner;

public class Exercicio6 {

	/*Pede a entrada de um n�mero entre 0 e 100. Caso o n�mero seja diferente do n�mero solicitado, 
	continua pedindo o n�mero ate ele atender a condi��o. Imprime na tela todos os n�meros �mpares
	que est�o entre o n�mero digitado e 100.*/
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = -1;
		while (x <= 0 || x >= 100) {
		System.out.print("Digite um n�mero maior que zero e menor que 100: ");
		x = in.nextInt();
		}
		if (x%2 == 0){
		x = x + 1;
		}
		while (x < 100) {
		System.out.print(x + ", ");
		x = x + 2;
		}
		
		in.close();
	}

}
