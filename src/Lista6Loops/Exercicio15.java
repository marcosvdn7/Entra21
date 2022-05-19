//Verifica se o código de usuário e a senha sao iguais, caso sejam, pede para reinserir ambos.
package Lista6Loops;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String usuario;
		String senha;
		System.out.println("Entre com o código do usuário: ");
		usuario = read.nextLine();
		System.out.println("Entre com uma senha: ");
		senha = read.nextLine();
		
		while (senha.equalsIgnoreCase(usuario)) {
			System.out.println("O código do usuário e a senha nao podem ser iguais. Informe um novo código: ");
			usuario = read.nextLine();
			System.out.println("Entre com uma senha: ");
			senha = read.nextLine();
		}
		
		System.out.println("Usuário: " +usuario);
		System.out.println("Senha: " +senha);
		
		
		
		
		read.close();

	}

}
