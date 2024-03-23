package modelo;
import java.util.Random;

public class Conta {
	public int numero;
	public double saldo;
	Cliente cliente;


	public Conta(int numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public Conta(double saldo, Cliente cliente) {
		Random aleatorio = new Random();
		this.numero = aleatorio.nextInt(10000);
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public Conta(Cliente cliente) {
		Random aleatorio = new Random();
		this.numero = aleatorio.nextInt(10000);
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
