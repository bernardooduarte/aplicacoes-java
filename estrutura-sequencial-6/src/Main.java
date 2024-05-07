import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		double a, b, c, triRet, pi, circulo, trapz, quad, retang;
		pi = 3.14159;

		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		triRet = a * c / 2.0;
		circulo = pi * c * c;
		trapz = ((a + b) * c) / 2.0;
		quad = b * b;
		retang = a * b;

		System.out.printf("TRIANGULO: %.3f%n", triRet);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapz);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", retang);

		scan.close();

	}

}
