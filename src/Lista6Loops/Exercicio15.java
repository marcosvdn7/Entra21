//Verifica se o c�digo de usu�rio e a senha sao iguais, caso sejam, pede para reinserir ambos.
package Lista6Loops;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String usuario;
		String senha;
		System.out.println("Entre com o c�digo do usu�rio: ");
		usuario = read.nextLine();
		System.out.println("Entre com uma senha: ");
		senha = read.nextLine();
		
		while (senha.equalsIgnoreCase(usuario)) {
			System.out.println("O c�digo do usu�rio e a senha nao podem ser iguais. Informe um novo c�digo: ");
			usuario = read.nextLine();
			System.out.println("Entre com uma senha: ");
			senha = read.nextLine();
		}
		
		System.out.println("Usu�rio: " +usuario);
		System.out.println("Senha: " +senha);
		
		
		
		
		read.close();

	}

}
