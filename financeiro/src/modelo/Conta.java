package modelo;

import java.time.LocalDate;

public class Conta {
	private String numero;
	public double saldo;
	Cliente cliente;
	private static int num_seq = 0;
	private static LocalDate data_atual = LocalDate.of(2024, 3, 29);
	
	
	public Conta(String numero, double saldo, Cliente cliente) {
		this.numero = geraNumeroConta();
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Conta(double saldo, Cliente cliente, String numero) {
		this.numero = geraNumeroConta();
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Conta(Cliente cliente, String numero) {
		this.numero = geraNumeroConta();
		this.cliente = cliente;
	}

	public Conta(double saldo, Cliente cliente) {
		this.numero = geraNumeroConta();
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

	public String getNumero() {
		return this.numero;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	private String geraNumeroConta() {
		if(Conta.data_atual.getYear() != LocalDate.now().getYear()) {
			Conta.num_seq = 0;
			Conta.data_atual = LocalDate.now();
		}
		Conta.num_seq++;
		return data_atual.getYear() + "-" + num_seq;
	}
}
