package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int valorCompra, valorPag, troco, min100, min10, min1;
		
		System.out.println("Informe o valor da compra: ");
		valorCompra = read.nextInt();
		System.out.println("Informe o valor do pagamento: ");
		valorPag = read.nextInt();
		troco = valorPag - valorCompra;
		min100 = troco/100;
		min10 = (troco % 100)/10;
		min1 = troco % 10;
		
		if (valorPag < valorCompra) {
			System.out.println("Pagamento nao efetuado!!");
		} else {
			System.out.println("O troco deve conter " +min100+ " nota(s) de cem reais, " +min10+ " nota(s) de dez reais e " +min1+ " nota(s) de um real.");
		}
		
		read.close();

	}

}
