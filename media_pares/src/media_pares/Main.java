package media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = scan.nextInt();

		int[] vetor = new int[N];
		int soma = 0;
		int qtd_pares = 0;
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextInt();

			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				qtd_pares++;
			}
		}

		if (qtd_pares == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			double media = (double) soma / qtd_pares;
			System.out.printf("MÉDIA DOS PARES = %.1f", media);
		}

		scan.close();
	}

}
