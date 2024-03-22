import java.util.ArrayList;

public class Banco {

	ArrayList<Conta> listaContas;

	Banco() {
		listaContas = new ArrayList<Conta>();
	}

	void adicionaConta(Conta c) {
		listaContas.add(c);
	}

	Conta getConta(int numeroConta) {
		for (Conta c : listaContas) {
			if (c.numero == numeroConta) {
				return c;
			}
		}
		return null;
	}

	int getTotalContas() {
		return listaContas.size();
	}
}
