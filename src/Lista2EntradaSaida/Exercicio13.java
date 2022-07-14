package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		int ladoQuadrado, areaQuadrado;
		
		Scanner read = new Scanner (System.in);
		System.out.print("Insira a medida de um dos lados do quadrado: ");
		ladoQuadrado = read.nextInt();
		areaQuadrado = ladoQuadrado*ladoQuadrado;
		System.out.print("A area do quadrado é de " +areaQuadrado+ " M2.");
		
		read.close();

	}

}
