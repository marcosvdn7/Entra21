package ListaOOB4RelacionamentoClasses;

public class Contador {

	private static int count;
	
	public Contador() {
		count++;
	}
	
	public static void zerarContador() {
		count = 0;
	}
	
	public static void incrementarContador() {
		count++;
	}
	
	public static void imprimirValorContador() {
		System.out.println(count);
	}
}
