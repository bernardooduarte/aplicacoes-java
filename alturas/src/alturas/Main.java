package alturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int N = scan.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");

			System.out.print("Nome: ");
			nomes[i] = scan.next();

			System.out.print("Idade: ");
			idades[i] = scan.nextInt();

			System.out.print("Altura: ");
			alturas[i] = scan.nextDouble();
		}

		double soma_alturas = 0;
		int pessoas_menos16 = 0;
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				pessoas_menos16++;
			}
			soma_alturas += alturas[i];
		}

		double media_altura = soma_alturas / N;
		System.out.printf("\nAltura média: %.2f", media_altura);

		double pc_pessoas_menos16 = ((double) pessoas_menos16 / N) * 100.0;

		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", pc_pessoas_menos16);

		System.out.print("\n");
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		scan.close();
	}

}
