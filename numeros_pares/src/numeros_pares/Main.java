package numeros_pares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = scan.nextInt();

		int[] numeros = new int[N];
		int qtd_pares = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = scan.nextInt();
		}

		System.out.println("\nNÚMEROS PARES:");
		for (int i = 0; i < N; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf("%d ", numeros[i]);
				qtd_pares++;

			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtd_pares);

		scan.close();

	}

}
