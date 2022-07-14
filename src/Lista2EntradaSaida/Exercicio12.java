package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		double pacote, avulsas;
		double valorAvulso, valorPacote, valorTotal;
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("Quantidade de pacotes desejada: ");
		pacote = read.nextInt();
		System.out.print("Quantidade de fotos avulsas desejada :");
		avulsas = read.nextInt();
		valorAvulso = avulsas*0.70;
		valorPacote = pacote*44;
		valorTotal = valorPacote+valorAvulso;
		System.out.println("Maria Clara gastará " +valorAvulso+ " reais em fotos avulsas e " +valorPacote+ " em pacotes de revelação");
		System.out.println("O valor total gasto será de " +valorTotal+ ".");
		
		read.close();

	}

}
