package negativos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = scan.nextInt();

		if (N <= 10) {
			int[] vetor = new int[N];
			for (int i = 0; i < N; i++) {
				System.out.print("Digite um número: ");
				vetor[i] = scan.nextInt();
			}

			System.out.println("NÚMEROS NEGATIVOS:");
			for (int i = 0; i < N; i++) {
				if (vetor[i] < 0) {
					System.out.println(vetor[i]);
				}
			}
		} else {
			System.out.println("Erro! Máximo 10 números inteiros.");
		}
		scan.close();
	}
}
