import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			int a = scan.nextInt();
			int b = scan.nextInt();

			if (b == 0) {
				System.out.println("Divisão impossível");
			} else {
				double divisao = (double) a / b;
				System.out.printf("%.1f%n", divisao);
			}

		}

		scan.close();

	}

}
