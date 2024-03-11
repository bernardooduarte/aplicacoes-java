
public class Banco {

	Conta[] listaContas;
	int total;
	int n;

	Banco(int n) {
		this.listaContas = new Conta[n];
	}

	Banco() {
		this.listaContas = new Conta[10];
	}


	boolean adicionaConta(Conta c) {

		for (int i = 0; i < listaContas.length; i++) {
			if (listaContas[i] == null) {
				listaContas[i] = c;
				return true;
			}
		}
		return false;
	}

	Conta getConta(int n) {
		for (Conta i : listaContas) {
			if (i.numero == n && i != null) {
				return i;
			}
		}
		return null;
	}

	int getTotalContas() {
		int totalContas = 0;
		for (Conta contas : this.listaContas) {
			if (contas != null) {
				totalContas++;
			}
		}
		return totalContas;
	};
}
