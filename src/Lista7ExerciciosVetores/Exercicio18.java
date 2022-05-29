package ListaExercicios7Arrays;
public class Exercicio18 {

	public static void main(String[] args) {
		int[] vetorX = new int[10];
		int num = 101;
		int count = 0;
		
		for (int i = 0, j = 1; i < vetorX.length;) {
			while (j <= num) {
					if (num % j == 0) {
					count++;
					}
					j++;
				}
				if (count == 2) {
				vetorX[i] = num;
				System.out.println(vetorX[i]+ " ");
				i++;
				}
				j = 1;
				num++;
				count = 0;
		}

	}

}
