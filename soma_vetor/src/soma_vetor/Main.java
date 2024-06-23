package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = scan.nextInt();

		double[] vetor = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextDouble();
		}

		System.out.print("\nVALORES = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}

		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.printf("\nSOMA = %.2f\n", soma);

		double media = soma / N;
		System.out.printf("MEDIA = %.2f\n", media);

		scan.close();
	}

}
