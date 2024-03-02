public class Conta {
	int numero;
	String titular;
	double saldo;

	Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
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
		if (destino.deposita(valor) && saca(valor)) {
			return true;
		}
		return false;

	}
}
