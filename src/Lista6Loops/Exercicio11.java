//Mostra a tabuada do n�mero digitado pelo usu�rio.
package Lista6Loops;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num, resultado;
		
		System.out.println("Digite um n�mero: ");
		num = read.nextDouble();
		
		for (int i = 1; i <= 10; i++) {
			resultado = num * i;
			System.out.println(num+ " * " +i+ " = " +resultado);
		}
		
		read.close();

	}

}
