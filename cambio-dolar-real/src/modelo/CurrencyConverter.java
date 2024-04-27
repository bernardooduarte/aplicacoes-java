package modelo;

public class CurrencyConverter {

	private static double iof = 0.06;

	public static double calcularValor(double dolarAtual, double qtdDolar) {
		return qtdDolar * dolarAtual * (1.0 + iof);
	}

}
