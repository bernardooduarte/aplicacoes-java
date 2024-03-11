public class TestaConta {

	public static void main(String[] args) {

		Banco nubank = new Banco();

		Conta c1 = new Conta("Bernardo Duarte");
		System.out.println("Número da conta gerado para " + c1.titular + ": " + c1.numero);
		nubank.adicionaConta(c1);

		Conta c2 = new Conta("Felipe Médice");
		System.out.println("Número da conta gerado para " + c2.titular + ": " + c2.numero);
		nubank.adicionaConta(c2);

		Conta c3 = new Conta("Lorran Rezende");
		System.out.println("Número da conta gerado para " + c3.titular + ": " + c3.numero);
		nubank.adicionaConta(c3);

		Conta c4 = new Conta("Leonardo César");
		System.out.println("Número da conta gerado para " + c4.titular + ": " + c4.numero);
		nubank.adicionaConta(c4);

		Conta c5 = new Conta("Rodrigo Guedes");
		System.out.println("Número da conta gerado para " + c5.titular + ": " + c5.numero);
		nubank.adicionaConta(c5);

		Conta c6 = new Conta("Lucas Lima");
		System.out.println("Número da conta gerado para " + c6.titular + ": " + c6.numero);
		nubank.adicionaConta(c6);

		System.out.println("Total de contas geradas: " + nubank.getTotalContas());

		Banco bradesco = new Banco(5);

		System.out.println("\n");

		Conta c7 = new Conta("Gabriel Fernandes");
		System.out.println("Número da conta gerado para " + c7.titular + ": " + c7.numero);
		bradesco.adicionaConta(c7);

		Conta c8 = new Conta("Célio de Assis");
		System.out.println("Número da conta gerado para " + c8.titular + ": " + c8.numero);
		bradesco.adicionaConta(c8);

		Conta c9 = new Conta("Pedro Spíndola");
		System.out.println("Número da conta gerado para " + c9.titular + ": " + c9.numero);
		bradesco.adicionaConta(c9);

		Conta c10 = new Conta("Pedro Magalhães");
		System.out.println("Número da conta gerado para " + c10.titular + ": " + c10.numero);
		bradesco.adicionaConta(c10);

		Conta c11 = new Conta("Vinícus de Souza");
		System.out.println("Número da conta gerado para " + c11.titular + ": " + c11.numero);
		bradesco.adicionaConta(c11);

		Conta c12 = new Conta("Hugo de Souza");
		System.out.println("Número da conta gerado para " + c12.titular + ": " + c12.numero);
		bradesco.adicionaConta(c12);

		System.out.println("Total de contas geradas: " + bradesco.getTotalContas());

		Banco caixa = new Banco(3);

		System.out.println("\n");

		Conta c13 = new Conta("Joseh");
		System.out.println("Número da conta gerado para " + c13.titular + ": " + c13.numero);
		caixa.adicionaConta(c13);

		Conta c14 = new Conta("Bruno Carvalho");
		System.out.println("Número da conta gerado para " + c14.titular + ": " + c14.numero);
		caixa.adicionaConta(c14);

		Conta c15 = new Conta("Lucas Bavuso");
		System.out.println("Número da conta gerado para " + c15.titular + ": " + c15.numero);
		caixa.adicionaConta(c15);

		Conta c16 = new Conta("Jair Ferreira");
		System.out.println("Número da conta gerado para " + c16.titular + ": " + c16.numero);
		caixa.adicionaConta(c16);

		System.out.println("Total de contas geradas: " + caixa.getTotalContas());

	}
}