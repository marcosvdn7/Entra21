package ListaExtraLoops;

import java.util.Scanner;

public class Exercicio6 {

	/*Pede a entrada de um número entre 0 e 100. Caso o número seja diferente do número solicitado, 
	continua pedindo o número ate ele atender a condição. Imprime na tela todos os números ímpares
	que estão entre o número digitado e 100.*/
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = -1;
		while (x <= 0 || x >= 100) {
		System.out.print("Digite um nœmero maior que zero e menor que 100: ");
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
