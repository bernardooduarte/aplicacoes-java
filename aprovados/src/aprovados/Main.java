package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int N = scan.nextInt();

		String[] nomes = new String[N];
		double[] notas1 = new double[N];
		double[] notas2 = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			scan.nextLine();
			nomes[i] = scan.nextLine();
			notas1[i] = scan.nextDouble();
			notas2[i] = scan.nextDouble();
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < N; i++) {
			double media = (notas1[i] + notas2[i]) / 2;

			if (media >= 6.0) {
				System.out.println(nomes[i]);
			}

		}
		scan.close();
	}

}
