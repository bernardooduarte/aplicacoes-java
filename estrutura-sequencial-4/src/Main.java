import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		int nFun, nHrs;
		double valHr, salario;

		nFun = scan.nextInt();
		nHrs = scan.nextInt();
		valHr = scan.nextDouble();

		salario = nHrs * valHr;

		System.out.println("NUMBER = " + nFun);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		scan.close();

	}

}
