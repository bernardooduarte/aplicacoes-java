import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat *= i;
		}

		System.out.println(fat);

		scan.close();

	}

}
