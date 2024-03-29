package modelo;

import java.util.ArrayList;

public class Banco {
	ArrayList<Conta> listaContas;

	Banco() {
		listaContas = new ArrayList<Conta>();
	}

	void adicionaConta(Conta c) {
		listaContas.add(c);
	}

	Conta getConta(String numeroConta) {
		for (Conta c : listaContas) {
			if (c.getNumero() == numeroConta) {
				return c;
			}
		}
		return null;
	}

	public int getTotalContas() {
		return listaContas.size();
	}
}
