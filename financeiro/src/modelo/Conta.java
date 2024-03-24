package modelo;

public class Conta {
	private static double numero = 2024.1;
	public double saldo;
	Cliente cliente;

	// formatar o numero

	public static double getNumero() {
		numero += 0.1;
		return numero;
	}

	public Conta(double numero, double saldo, Cliente cliente) {
		Conta.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Conta(double saldo, Cliente cliente, double numero) {
		Conta.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Conta(Cliente cliente, double numero) {
		Conta.numero = numero;
		this.cliente = cliente;
	}

	public Conta(double saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
	}

	boolean deposita(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			return true;
		}
		return false;
	}

	boolean saca(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	boolean transfere(Conta destino, double valor) {
		if (this.saca(valor)) {
			if (destino.deposita(valor)) {
				return true;
			} else {
				this.deposita(valor);
				return false;
			}
		}
		return false;
	}
}
