import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x, y, soma;

		x = scan.nextInt();
		y = scan.nextInt();

		soma = x + y;

		System.out.println("SOMA = " + soma);

		scan.close();
	}

}
