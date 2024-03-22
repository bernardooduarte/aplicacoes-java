public class TestaConta {

	public static void main(String[] args) {

		Conta c1 = new Conta(123, "Bernardo", 200);
		Conta c2 = new Conta(456, "Fábio", 250);
		Conta c3 = new Conta(789, "Carlos", 300);

		Banco nubank = new Banco();

		nubank.adicionaConta(c1);
		nubank.adicionaConta(c2);
		nubank.adicionaConta(c3);

		System.out.println("Listagem das contas geradas:");
		for (Conta c : nubank.listaContas) {
			System.out.println(c.titular + " - " + c.numero);
		}

		System.out.println("\nEncontrando conta:");

		Conta conta = nubank.getConta(456);

		if (conta != null) {
			System.out.println("Conta encontrada");
			System.out.println(conta.numero + " - " + conta.titular);
		} else {
			System.out.println("Conta não encontrada");
		}

		System.out.println("\nTotal de contas geradas: " + nubank.getTotalContas());

	}
}