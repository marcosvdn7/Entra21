package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float peso, altura, imc;
		
		System.out.println("Informe sua altura: ");
		altura = read.nextFloat();
		System.out.println("Informe seu peso: ");
		peso = read.nextFloat();
		imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso.");
		} else if (imc >= 18.5 && imc <= 25) {
			System.out.println("Peso normal.");
		} else if (imc >= 25 && imc <= 30) {
			System.out.println("Acima do peso.");
		} else if (imc > 30) {
			System.out.println("Obeso.");
		}
		
		read.close();

	}

}
