package mais_velho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int N = scan.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];

		int maior_idade = idades[0];
		int posicaomaior = 0;

		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa:", i + 1);

			System.out.print("\nNome: ");
			nomes[i] = scan.next();

			System.out.print("Idade: ");
			idades[i] = scan.nextInt();

			if (idades[i] > maior_idade) {
				maior_idade = idades[i];
				posicaomaior = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + nomes[posicaomaior]);

		scan.close();
	}

}
