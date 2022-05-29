package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int combustivel;
		float valor, litros;
		
		System.out.println("Informe o combustivel utilizado (1 - Gasolina, 2 - Etanol, 3 - Diesel).");
		combustivel = read.nextInt();
		System.out.println("Quantos litros serão abastecidos");
		litros = read.nextFloat();
		
		if (combustivel == 2 && litros > 30) {
			valor = (float) (litros*2.09);
			System.out.println("O valor a ser pago é de " +valor+ " reais.");
			System.out.println("Parabéns! Você ganhou uma troca de óleo grátis!");
		} else if (combustivel == 1) {
			valor = (float) (litros * 2.53);
			System.out.println("O valor a ser pago é de " +valor+ " reais.");
		} else if (combustivel == 3){
			valor = (float) (litros * 1.92);
			System.out.println("O valor a ser pago é de " +valor+ " reais.");
		} else if (combustivel == 2){
			valor = (float) (litros*2.09);
			System.out.println("O valor a ser pago é de " +valor+ " reais.");
		} else {
			System.out.println("Opção Inválida");
		}
		
		read.close();

	}

}
