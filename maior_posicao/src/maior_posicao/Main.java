package maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = scan.nextInt();

		double[] vetor = new double[N];

		double maior = 0.0;
		int posicao = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextDouble();
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}

		System.out.printf("\nMAIOR VALOR = %.1f", maior);
		System.out.println("\nPOSIÇÃO DO MAIOR VALOR = " + posicao);

		scan.close();
	}

}
