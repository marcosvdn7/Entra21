//Verifica se o n�mero digitado pelo usu�rio � um n�mero triangulgar.

package Lista6Loops;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		int i = 1;
		int j = 2;
		int k = 3;
		double resultado = 0;
		System.out.println("Digite um n�mero natural: ");
		num = read.nextInt();
		
		do  {
			resultado = i * j * k;
			j++;
			i++;
			k++;
			if (resultado == num) {
				break;
			}
		} while (resultado <= num);
			if (num < 6) {
			System.out.println(num+ " n�o � um n�mero triangular.");
		} else if (resultado == num) {
			System.out.println(num+ " � um n�mero triangular.");
		} else {
			System.out.println(num+ " n�o � um n�mero triangular.");
		}
		read.close();

	}

}
