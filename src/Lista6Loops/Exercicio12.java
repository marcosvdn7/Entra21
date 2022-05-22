package Lista6Loops;

public class Exercicio12 {

	public static void main(String[] args) {
		double graos = 1, casa = 1;
		
		do {
			graos *= 2;
			casa++;
		} while (casa < 64);
		System.out.println("O total de graos pago ao monge é de " +graos+ ".");
	}

}
