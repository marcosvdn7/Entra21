package Lista6Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] array = new int[10];
		
		try {
			for (int i = 0; i < 15; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Tratando erro " +exception);
			for (int i = 0; i < array.length; i++) {
				array[i] = i;
				System.out.println(i);
			}
		}
				
	}

}
