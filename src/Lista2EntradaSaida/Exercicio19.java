package Lista2EntradaSaida;
import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		float hora, minutos, segundos;
		Scanner read = new Scanner (System.in);
		System.out.print("Informe uma hora: ");
		hora = read.nextFloat();
		minutos = hora*60;
		segundos = minutos*60;
		System.out.print("Essa hora corresponde a " +minutos+ " minutos e " +segundos+ " segundos.");
		
		read.close();

	}

}
