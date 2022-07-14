package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		int qtdRosas, qtdTulipas;
		float valorTotal;
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("Quantidade de rosas: ");
		qtdRosas = read.nextInt();
		System.out.print("Quantidade de tulipas: ");
		qtdTulipas = read.nextInt();
		valorTotal = (float)((qtdRosas*2.8)+(qtdTulipas*4.2));
		System.out.print("Maria Clara vai gastar " +valorTotal+ " reais.");
		
		read.close();
	}

}
