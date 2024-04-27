package teste;

import java.util.Locale;
import java.util.Scanner;

import modelo.CurrencyConverter;

public class TestaCurrencyConverter {

	public static void main(String[] args) {

		System.out.println("Curency Converter");

		Locale.setDefault(Locale.US);
		Scanner num = new Scanner(System.in);

		System.out.print("Qual é o preço do dólar? ");
		double precoDolar = num.nextDouble();

		System.out.print("Quantos dólares serão comprados? ");
		double qtdDolar = num.nextDouble();

		double resultado = CurrencyConverter.calcularValor(precoDolar, qtdDolar);

		System.out.printf("Quantidade para ser paga em reais = %.2f%n", resultado);

		num.close();
	}

}
