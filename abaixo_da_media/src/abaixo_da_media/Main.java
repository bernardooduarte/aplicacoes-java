package abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = scan.nextInt();

		double[] vetor = new double[N];
		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextDouble();
			soma += vetor[i];
		}

		double media = soma / N;
		System.out.printf("\nMÉDIA DO VETOR = %.3f", media);

		System.out.println("\nELEMENTOS ABAIXO DA MÉDIA:");
		for (int i = 0; i < N; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}

		scan.close();
	}

}
