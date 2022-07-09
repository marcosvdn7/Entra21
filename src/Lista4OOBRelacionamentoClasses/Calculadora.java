package Lista4OOBRelacionamentoClasses;

public class Calculadora {

	
	public static double somar (double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtrair (double num1, double num2) {
		return num1 - num2;
	}
	
	public static double dividir (double num1, double num2) {
		return num1 / num2;
	}
	
	public static double multiplicar (double num1, double num2) {
		return num1 * num2;
	}
	
	public static double elevarPotencia (double num1, double num2) {
		int total = 1;
		
		for(int i = 0; i < num2; i++) {
			total *= num1;
		}
		return total;
	}
	
	public static int calcularFatorial (int num) {
		int total = 1;
		while (num > 1) {
			total *= num;
			num--;
		}
		return total;
	}
	
	public static int fatorialRecursivo (int num) {
		if (num == 0) {
			return 1;
		}
		return num * fatorialRecursivo(num - 1);
	}
}
