import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		int cod = scan.nextInt();
		int qtd = scan.nextInt();

		double total;

		switch (cod) {
		case 1:
			total = 4.00 * qtd;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 2:
			total = 4.50 * qtd;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 3:
			total = 5.00 * qtd;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 4:
			total = 2.00 * qtd;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 5:
			total = 1.50 * qtd;
			System.out.printf("Total: R$ %.2f", total);
			break;
		default:
			System.out.println("Código inválido");
		}

		scan.close();

	}

}
