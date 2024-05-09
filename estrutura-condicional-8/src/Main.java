import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		double renda = scan.nextDouble();

		double taxa;

		if (renda <= 2000.00) {
			System.out.println("Isento");
		} else if (renda <= 3000.00) {
			taxa = 1000.00 * 0.08;
			System.out.printf("%nR$ %.2f", taxa);
		} else if (renda <= 4500.00) {
			taxa = 1000.00 * 0.08 + (renda - 3000.00) * 0.18;
			System.out.printf("%nR$ %.2f", taxa);
		} else {
			taxa = 1000.00 * 0.08 + 1500 * 0.18 + ((renda - 4500.00) * 0.28);
			System.out.printf("%nR$ %.2f", taxa);
		}

		scan.close();

	}

}
