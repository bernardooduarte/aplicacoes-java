import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		double x = 0.0, y = 0.0, z = 0.0, media = 0.0;

		for (int i = 1; i <= n; i++) {
			
			x = scan.nextDouble();
			y = scan.nextDouble();
			z = scan.nextDouble();

			media = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}


		scan.close();

	}

}
