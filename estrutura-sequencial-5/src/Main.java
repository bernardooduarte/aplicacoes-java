import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		int cod1, num1, cod2, num2;
		double valUn1, valUn2, valTotal, som1, som2;

		cod1 = scan.nextInt();
		num1 = scan.nextInt();
		valUn1 = scan.nextDouble();

		cod2 = scan.nextInt();
		num2 = scan.nextInt();
		valUn2 = scan.nextDouble();

		som1 = valUn1 * num1;
		som2 = valUn2 * num2;

		valTotal = som1 + som2;

		System.out.printf("VALOR A PAGAR: R$ %.2f", valTotal);

		scan.close();

	}

}
