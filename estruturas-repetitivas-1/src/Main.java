import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		if (x >= 1 && x <= 1000) {
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}

		scan.close();

	}

}
