import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			int l = i;
			int quad = i * i;
			int cubo = i * i * i;

			System.out.printf("%d %d %d%n", l, quad, cubo);

		}

		scan.close();

	}

}
