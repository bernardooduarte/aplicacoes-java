package soma_vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = scan.nextInt();

		int[] vetorA = new int[N];
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < N; i++) {
			vetorA[i] = scan.nextInt();
		}

		int[] vetorB = new int[N];
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < N; i++) {
			vetorB[i] = scan.nextInt();
		}

		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < N; i++) {
			System.out.println(vetorA[i] + vetorB[i]);
		}

		scan.close();

	}

}
