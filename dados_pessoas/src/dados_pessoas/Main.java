package dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int N = scan.nextInt();

		double[] alturas = new double[N];
		char[] generos = new char[N];

		double soma_mulheres = 0.0;
		int numero_homens = 0, numero_mulheres = 0;

		for (int i = 0; i < N; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = scan.nextDouble();

			System.out.printf("Gênero da %da pessoa: ", i + 1);
			generos[i] = scan.next().charAt(0);

			if (generos[i] == 'F' || generos[i] == 'f') {
				soma_mulheres += alturas[i];
				numero_mulheres++;
			}
			if (generos[i] == 'M' || generos[i] == 'm') {
				numero_homens++;
			}
		}

		double menor_altura = alturas[0], maior_altura = alturas[0];

		for (int i = 1; i < N; i++) {
			if (alturas[i] > maior_altura) {
				maior_altura = alturas[i];
			}
			if (alturas[i] < menor_altura) {
				menor_altura = alturas[i];
			}
		}

		double media_mulheres = soma_mulheres / numero_mulheres;

		System.out.printf("Menor altura = %.2f\n", menor_altura);
		System.out.printf("Maior altura = %.2f\n", maior_altura);
		System.out.printf("Média das alturas das mulheres = %.2f\n", media_mulheres);
		System.out.println("Número de homens = " + numero_homens);

		scan.close();
	}

}
